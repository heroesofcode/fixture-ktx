@file:Suppress("UNCHECKED_CAST")

package io.heroesofcode

import io.heroesofcode.faker.DoubleFaker
import io.heroesofcode.faker.IntFaker
import io.heroesofcode.faker.StringFaker
import io.heroesofcode.faker.constants.RANGE_END
import io.heroesofcode.faker.constants.RANGE_INIT
import io.heroesofcode.faker.constants.RANGE_INIT_END
import io.heroesofcode.faker.constants.RANGE_INT_INIT
import kotlin.random.Random
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.createType
import kotlin.reflect.full.primaryConstructor

/**
 * The Fixture object provides utilities for generating instances of classes with random data,
 * making it easier to create test fixtures. It supports a variety of types, including strings,
 * numbers, booleans, enums, sealed classes, and exceptions.
 */
object Fixture {

    /**
     * Creates an instance of the specified class [T] with random data.
     *
     * @return an instance of the specified class [T].
     */
    inline fun <reified T : Any> fixtureOf(): T {
        return createInstance(T::class)
    }

    /**
     * Creates a list of instances of the specified class [T] with random data.
     *
     * @param size the number of instances to generate. Defaults to 3.
     * @return a list of instances of the specified class [T].
     */
    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Any> fixtureListOf(size: Int = 3): List<T> {
        val type = T::class.createType()
        return generateList(type, size) as List<T>
    }

    /**
     * Creates an instance of the specified class [klass] with random data.
     *
     * @param klass the KClass of the class to instantiate.
     * @return an instance of the specified class [klass].
     * @throws IllegalArgumentException if the class does not have a primary constructor or a no-arg constructor.
     */
    fun <T : Any> createInstance(klass: KClass<T>): T {
        val constructor = klass.primaryConstructor

        if (constructor != null) {
            val parameters = constructor.parameters.associateWith { parameter ->
                generateValue(parameter.type, parameter.name ?: "")
            }
            return constructor.callBy(parameters)
        } else {
            return createInstanceFallback(klass)
        }
    }

    /**
     * Creates an instance of the specified class [klass] using a fallback method.
     * This method attempts to create an instance using a no-arg constructor.
     *
     * @param klass the KClass of the class to instantiate.
     * @return an instance of the specified class [klass].
     * @throws IllegalArgumentException if the class does not have a no-arg constructor.
     */
    private fun <T : Any> createInstanceFallback(klass: KClass<T>): T {
        return try {
            klass.createInstance()
        } catch (e: Exception) {
            throw IllegalArgumentException(
                "Class must have a primary constructor or a no-arg constructor: ${klass.simpleName}"
            )
        }
    }

    /**
     * Generates a random value for the specified type [type] and property name [propertyName].
     *
     * @param type the KType of the property.
     * @param propertyName the name of the property.
     * @return a random value for the specified type.
     * @throws IllegalArgumentException if the type is not supported.
     */
    private fun generateValue(type: KType, propertyName: String): Any {
        val classifier = type.classifier as? KClass<*>
            ?: throw IllegalArgumentException("Unsupported type: $type")

        return when {
            classifier == String::class -> StringFaker.fake(propertyName)
            classifier == Int::class -> IntFaker.fake(propertyName)
            classifier == Boolean::class -> Random.nextBoolean()
            classifier == Double::class -> DoubleFaker.fake(propertyName)
            classifier == Float::class -> DoubleFaker.fake(propertyName).toFloat()
            classifier.javaObjectType.isEnum -> {
                val enumClass = classifier
                val enumValues = enumClass.java.enumConstants
                    ?: throw IllegalArgumentException("Class is not an enum: $classifier")
                enumValues.random()
            }
            classifier.isSealed -> {
                val subclasses = classifier.sealedSubclasses
                val subclass = subclasses.random()
                if (subclass.objectInstance != null) {
                    subclass.objectInstance!!
                } else {
                    createInstance(subclass)
                }
            }
            Throwable::class.java.isAssignableFrom(classifier.java) -> {
                createExceptionInstance(classifier as KClass<out Throwable>)
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

    /**
     * Creates an instance of an exception class with a default message.
     *
     * @param klass the KClass of the exception class to instantiate.
     * @return an instance of the specified exception class.
     */
    private fun createExceptionInstance(klass: KClass<out Throwable>): Throwable {
        return try {
            klass.primaryConstructor?.call("Generated Exception") ?: klass.createInstance()
        } catch (e: Exception) {
            RuntimeException("Fallback Exception for ${klass.simpleName}")
        }
    }

    /**
     * Generates a list of random values for the specified element type [elementType].
     *
     * @param elementType the KType of the list elements.
     * @param size the number of elements to generate.
     * @return a list of random values.
     */
    fun generateList(elementType: KType, size: Int): List<Any> {
        return List(size) { generateValue(elementType, "") }
    }
}
