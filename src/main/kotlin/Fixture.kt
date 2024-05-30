package com.heroesofcode

import com.heroesofcode.faker.StringFaker
import kotlin.random.Random
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.full.primaryConstructor

const val RANGE_INIT = 0
const val RANGE_END = 100

const val RANGE_INT_INIT = 1
const val RANGE_INIT_END = 5

object Fixture {

    inline fun <reified T : Any> fixtureOf(): T {
        return createInstance(T::class)
    }

    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Any> fixtureListOf(size: Int = 3): List<T> {
        val type = T::class.createType()
        return generateList(type, size) as List<T>
    }

    fun <T : Any> createInstance(klass: KClass<T>): T {
        val constructor = klass.primaryConstructor
            ?: throw IllegalArgumentException("Class must have a primary constructor")

        val parameters = constructor.parameters.associateWith { parameter ->
            generateValue(parameter.type, parameter.name ?: "")
        }

        return constructor.callBy(parameters)
    }

    private fun generateValue(type: KType, parameterName: String): Any {
        val classifier = type.classifier as? KClass<*>
            ?: throw IllegalArgumentException("Unsupported type: $type")

        return when {
            classifier == String::class -> StringFaker.fake(parameterName)
            classifier == Int::class -> Random.nextInt(RANGE_INIT, RANGE_END)
            classifier == Boolean::class -> Random.nextBoolean()
            classifier == Double::class -> Random.nextDouble(RANGE_INIT.toDouble(), RANGE_END.toDouble())
            classifier == Float::class -> Random.nextFloat()
            classifier.javaObjectType.isEnum -> {
                val enumClass = classifier
                val enumValues = enumClass.java.enumConstants
                    ?: throw IllegalArgumentException("Class is not an enum: $classifier")
                enumValues.random()
            }
            classifier == Long::class -> Random.nextLong(RANGE_INIT.toLong(), RANGE_END.toLong())
            classifier == List::class -> {
                val argumentType = type.arguments.first().type
                    ?: throw IllegalArgumentException("Unsupported list type: $type")
                generateList(argumentType, Random.nextInt(RANGE_INT_INIT, RANGE_INIT_END))
            }
            else -> createInstance(classifier)
        }
    }

    fun generateList(elementType: KType, size: Int): List<Any> {
        return List(size) { generateValue(elementType, "") }
    }
}
