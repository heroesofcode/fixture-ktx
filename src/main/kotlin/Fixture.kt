package com.heroesofcode

import kotlin.random.Random
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

object Fixture {
    inline fun <reified T : Any> fixtureOf(): T {
        return createInstance(T::class)
    }

    fun <T : Any> createInstance(kClass: KClass<T>): T {
        val constructor = kClass.primaryConstructor
            ?: throw IllegalArgumentException("Class must have a primary constructor")

        val parameters = constructor.parameters.associateWith { parameter ->
            generateValue(parameter.type.classifier as KClass<*>)
        }

        return constructor.callBy(parameters)
    }

    private fun generateValue(klass: KClass<*>): Any {
        return when (klass) {
            String::class -> "String${Random.nextInt(1, 100)}"
            Int::class -> Random.nextInt(1, 100)
            Boolean::class -> Random.nextBoolean()
            Double::class -> Random.nextDouble(1.0, 100.0)
            Float::class -> Random.nextFloat()
            Long::class -> Random.nextLong(1, 100)
            else -> throw IllegalArgumentException("Unsupported type: ${klass.simpleName}")
        }
    }
}