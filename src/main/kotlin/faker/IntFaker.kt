package com.heroesofcode.faker

import com.heroesofcode.RANGE_END
import com.heroesofcode.RANGE_INIT
import kotlin.random.Random

private const val YEAR_START = 1950
private const val YEAR_END = 2024
private const val MONTH_START = 1
private const val MONTH_END = 12
private const val DAY_START = 1
private const val DAY_END = 31
private const val CHAPTER_START = 1
private const val CHAPTER_END = 12
private const val EPISODE_START = 1
private const val EPISODE_END = 10
private const val ROUND_START = 1
private const val ROUND_END = 12

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
