package com.heroesofcode.faker

import com.heroesofcode.faker.constants.CHAPTER_END
import com.heroesofcode.faker.constants.CHAPTER_START
import com.heroesofcode.faker.constants.DAY_END
import com.heroesofcode.faker.constants.DAY_START
import com.heroesofcode.faker.constants.EPISODE_END
import com.heroesofcode.faker.constants.EPISODE_START
import com.heroesofcode.faker.constants.MONTH_END
import com.heroesofcode.faker.constants.MONTH_START
import com.heroesofcode.faker.constants.RANGE_END
import com.heroesofcode.faker.constants.RANGE_INIT
import com.heroesofcode.faker.constants.ROUND_END
import com.heroesofcode.faker.constants.ROUND_START
import com.heroesofcode.faker.constants.YEAR_END
import com.heroesofcode.faker.constants.YEAR_START
import kotlin.random.Random

/**
 * IntFaker is a utility for generating fake integer values for various properties.
 * It implements the FixtureFaker interface for seamless integration with the Fixture Library.
 */
object IntFaker : FixtureFaker<Int> {

    // Map containing fake functions for specific properties
    private val fakeFunctions = mapOf(
        "age" to { Random.nextInt(RANGE_INIT, RANGE_END) },
        "year" to { Random.nextInt(YEAR_START, YEAR_END) },
        "month" to { Random.nextInt(MONTH_START, MONTH_END) },
        "day" to { Random.nextInt(DAY_START, DAY_END) },
        "chapter" to { Random.nextInt(CHAPTER_START, CHAPTER_END) },
        "episode" to { Random.nextInt(EPISODE_START, EPISODE_END) },
        "round" to { Random.nextInt(ROUND_START, ROUND_END) }
    )

    /**
     * Generates a fake integer value based on the provided property name.
     * @param propertyName The name of the property for which to generate a fake value.
     * @return A fake integer value.
     */
    override fun fake(propertyName: String): Int {
        // Find the corresponding fake function based on the property name
        val lowercasePropertyName = propertyName.lowercase()
        val function = fakeFunctions.entries.find { (key, _) ->
            lowercasePropertyName.contains(key)
        }?.value

        // Find the corresponding fake function based on the property name
        return function?.invoke() ?: Random.nextInt(RANGE_INIT, RANGE_END)
    }
}
