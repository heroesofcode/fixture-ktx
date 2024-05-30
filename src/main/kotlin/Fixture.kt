package com.heroesofcode

import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.primaryConstructor
import kotlin.random.Random
import kotlin.reflect.full.createType

object Fixture {

    inline fun <reified T : Any> fixtureOf(): T {
        return createInstance(T::class, 0)
    }

    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Any> fixtureListOf(size: Int = 3): List<T> {
        val type = T::class.createType()
        return generateList(type, size, 0) as List<T>
    }

    fun <T : Any> createInstance(klass: KClass<T>, depth: Int): T {
        val constructor = klass.primaryConstructor
            ?: throw IllegalArgumentException("Class must have a primary constructor")

        val parameters = constructor.parameters.associateWith { parameter ->
            generateValue(parameter.type, depth + 1)
        }

        return constructor.callBy(parameters)
    }

    private fun generateValue(type: KType, depth: Int): Any {
        val classifier = type.classifier as? KClass<*>
            ?: throw IllegalArgumentException("Unsupported type: $type")

        return when {
            classifier == String::class -> "String${Random.nextInt(1, 100)}"
            classifier == Int::class -> Random.nextInt(1, 100)
            classifier == Boolean::class -> Random.nextBoolean()
            classifier == Double::class -> Random.nextDouble(1.0, 100.0)
            classifier == Float::class -> Random.nextFloat()
            classifier == Long::class -> Random.nextLong(1, 100)
            classifier == List::class -> {
                val argumentType = type.arguments.first().type
                    ?: throw IllegalArgumentException("Unsupported list type: $type")
                generateList(argumentType, Random.nextInt(1, 5), depth + 1)
            }
            else -> createInstance(classifier, depth)
        }
    }

    fun generateList(elementType: KType, size: Int, depth: Int): List<Any> {
        return List(size) { generateValue(elementType, depth) }
    }
}
