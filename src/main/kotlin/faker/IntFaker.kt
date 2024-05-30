package com.heroesofcode.faker

import com.heroesofcode.faker.constants.*
import com.heroesofcode.faker.constants.RANGE_END
import com.heroesofcode.faker.constants.RANGE_INIT
import com.heroesofcode.faker.constants.YEAR_END
import com.heroesofcode.faker.constants.YEAR_START
import kotlin.random.Random

object IntFaker : FixtureFaker<Int> {

    private val fakeFunctions = mapOf(
        "age" to { Random.nextInt(RANGE_INIT, RANGE_END) },
        "year" to { Random.nextInt(YEAR_START, YEAR_END) },
        "month" to { Random.nextInt(MONTH_START, MONTH_END) },
        "day" to { Random.nextInt(DAY_START, DAY_END) },
        "chapter" to { Random.nextInt(CHAPTER_START, CHAPTER_END) },
        "episode" to { Random.nextInt(EPISODE_START, EPISODE_END) },
        "round" to { Random.nextInt(ROUND_START, ROUND_END) }
    )

    override fun fake(propertyName: String): Int {
        val lowercasePropertyName = propertyName.lowercase()
        val function = fakeFunctions.entries.find { (key, _) ->
            lowercasePropertyName.contains(key)
        }?.value
        return function?.invoke() ?: Random.nextInt(RANGE_INIT, RANGE_END)
    }
}
