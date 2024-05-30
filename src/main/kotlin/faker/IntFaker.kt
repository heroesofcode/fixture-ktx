package com.heroesofcode.faker

import com.heroesofcode.RANGE_END
import com.heroesofcode.RANGE_INIT
import io.github.serpro69.kfaker.Faker
import kotlin.random.Random

object IntFaker: FixtureFaker<Int> {
    private val faker = Faker()

    private val fakeFunctions = mapOf(
        "age" to { Random.nextInt(RANGE_INIT, RANGE_END) },
        "year" to { Random.nextInt(1950, 2024) },
        "month" to { Random.nextInt(1, 12) },
        "day" to { Random.nextInt(1, 31) },
        "chapter" to { Random.nextInt(1, 12) },
        "episode" to { Random.nextInt(1, 10) },
        "round" to { Random.nextInt(1, 12) }
    )

    override fun fake(propertyName: String): Int {
        val lowercasePropertyName = propertyName.lowercase()
        val function = fakeFunctions.entries.find { (key, _) ->
            lowercasePropertyName.contains(key)
        }?.value
        return function?.invoke() ?: Random.nextInt(RANGE_INIT, RANGE_END)
    }
}