package com.heroesofcode.faker

import com.heroesofcode.faker.constants.ACCELERATION_END
import com.heroesofcode.faker.constants.ACCELERATION_START
import com.heroesofcode.faker.constants.ALTITUDE_END
import com.heroesofcode.faker.constants.ALTITUDE_START
import com.heroesofcode.faker.constants.AVERAGE_END
import com.heroesofcode.faker.constants.AVERAGE_START
import com.heroesofcode.faker.constants.CAPACITY_END
import com.heroesofcode.faker.constants.CAPACITY_START
import com.heroesofcode.faker.constants.CONCENTRATION_END
import com.heroesofcode.faker.constants.CONCENTRATION_START
import com.heroesofcode.faker.constants.DEFAULT_END_DOUBLE
import com.heroesofcode.faker.constants.DEFAULT_START_DOUBLE
import com.heroesofcode.faker.constants.DENSITY_END
import com.heroesofcode.faker.constants.DENSITY_START
import com.heroesofcode.faker.constants.DEPTH_END
import com.heroesofcode.faker.constants.DEPTH_START
import com.heroesofcode.faker.constants.DISCOUNT_END
import com.heroesofcode.faker.constants.DISCOUNT_START
import com.heroesofcode.faker.constants.DISTANCE_END
import com.heroesofcode.faker.constants.DISTANCE_START
import com.heroesofcode.faker.constants.DURATION_END
import com.heroesofcode.faker.constants.DURATION_START
import com.heroesofcode.faker.constants.FACTOR_END
import com.heroesofcode.faker.constants.FACTOR_START
import com.heroesofcode.faker.constants.FREQUENCY_END
import com.heroesofcode.faker.constants.FREQUENCY_START
import com.heroesofcode.faker.constants.GAIN_END
import com.heroesofcode.faker.constants.GAIN_START
import com.heroesofcode.faker.constants.GRADE_END
import com.heroesofcode.faker.constants.GRADE_START
import com.heroesofcode.faker.constants.GROWTH_RATE_END
import com.heroesofcode.faker.constants.GROWTH_RATE_START
import com.heroesofcode.faker.constants.HEIGHT_END
import com.heroesofcode.faker.constants.HEIGHT_START
import com.heroesofcode.faker.constants.INDEX_END
import com.heroesofcode.faker.constants.INDEX_START
import com.heroesofcode.faker.constants.INTENSITY_END
import com.heroesofcode.faker.constants.INTENSITY_START
import com.heroesofcode.faker.constants.INTEREST_RATE_END
import com.heroesofcode.faker.constants.INTEREST_RATE_START
import com.heroesofcode.faker.constants.LATITUDE_END
import com.heroesofcode.faker.constants.LATITUDE_START
import com.heroesofcode.faker.constants.LENGTH_END
import com.heroesofcode.faker.constants.LENGTH_START
import com.heroesofcode.faker.constants.LEVEL_END
import com.heroesofcode.faker.constants.LEVEL_START
import com.heroesofcode.faker.constants.LONGITUDE_END
import com.heroesofcode.faker.constants.LONGITUDE_START
import com.heroesofcode.faker.constants.LOSS_END
import com.heroesofcode.faker.constants.LOSS_START
import com.heroesofcode.faker.constants.MAGNITUDE_END
import com.heroesofcode.faker.constants.MAGNITUDE_START
import com.heroesofcode.faker.constants.MEAN_END
import com.heroesofcode.faker.constants.MEAN_START
import com.heroesofcode.faker.constants.MEASUREMENT_END
import com.heroesofcode.faker.constants.MEASUREMENT_START
import com.heroesofcode.faker.constants.MEDIAN_END
import com.heroesofcode.faker.constants.MEDIAN_START
import com.heroesofcode.faker.constants.PERCENTAGE_END
import com.heroesofcode.faker.constants.PERCENTAGE_START
import com.heroesofcode.faker.constants.PRICE_END
import com.heroesofcode.faker.constants.PRICE_START
import com.heroesofcode.faker.constants.PROFIT_END
import com.heroesofcode.faker.constants.PROFIT_START
import com.heroesofcode.faker.constants.PROPORTION_END
import com.heroesofcode.faker.constants.PROPORTION_START
import com.heroesofcode.faker.constants.QUOTA_END
import com.heroesofcode.faker.constants.QUOTA_START
import com.heroesofcode.faker.constants.RATE_END
import com.heroesofcode.faker.constants.RATE_START
import com.heroesofcode.faker.constants.RATIO_END
import com.heroesofcode.faker.constants.RATIO_START
import com.heroesofcode.faker.constants.READING_END
import com.heroesofcode.faker.constants.READING_START
import com.heroesofcode.faker.constants.RETURN_END
import com.heroesofcode.faker.constants.RETURN_START
import com.heroesofcode.faker.constants.SCORE_END
import com.heroesofcode.faker.constants.SCORE_START
import com.heroesofcode.faker.constants.SPEED_END
import com.heroesofcode.faker.constants.SPEED_START
import com.heroesofcode.faker.constants.SPREAD_END
import com.heroesofcode.faker.constants.SPREAD_START
import com.heroesofcode.faker.constants.STANDARD_DEVIATION_END
import com.heroesofcode.faker.constants.STANDARD_DEVIATION_START
import com.heroesofcode.faker.constants.TEMPERATURE_END
import com.heroesofcode.faker.constants.TEMPERATURE_START
import com.heroesofcode.faker.constants.VALUE_END
import com.heroesofcode.faker.constants.VALUE_START
import com.heroesofcode.faker.constants.VARIANCE_END
import com.heroesofcode.faker.constants.VARIANCE_START
import com.heroesofcode.faker.constants.VELOCITY_END
import com.heroesofcode.faker.constants.VELOCITY_START
import com.heroesofcode.faker.constants.VOLUME_END
import com.heroesofcode.faker.constants.VOLUME_START
import com.heroesofcode.faker.constants.WEIGHT_END
import com.heroesofcode.faker.constants.WEIGHT_START
import com.heroesofcode.faker.constants.WIDTH_END
import com.heroesofcode.faker.constants.WIDTH_START
import com.heroesofcode.faker.constants.YIELD_END
import com.heroesofcode.faker.constants.YIELD_START
import kotlin.random.Random

/**
 * DoubleFaker provides methods to generate fake double values for various scenarios.
 * It implements the FixtureFaker interface for seamless integration with the Fixture Library.
 */
object DoubleFaker : FixtureFaker<Double> {

    // Map containing fake functions for specific properties
    private val fakeFunctions = mapOf(
        "price" to { Random.nextDouble(PRICE_START, PRICE_END) },
        "rate" to { Random.nextDouble(RATE_START, RATE_END) },
        "percentage" to { Random.nextDouble(PERCENTAGE_START, PERCENTAGE_END) },
        "ratio" to { Random.nextDouble(RATIO_START, RATIO_END) },
        "average" to { Random.nextDouble(AVERAGE_START, AVERAGE_END) },
        "mean" to { Random.nextDouble(MEAN_START, MEAN_END) },
        "median" to { Random.nextDouble(MEDIAN_START, MEDIAN_END) },
        "variance" to { Random.nextDouble(VARIANCE_START, VARIANCE_END) },
        "standarddeviation" to { Random.nextDouble(STANDARD_DEVIATION_START, STANDARD_DEVIATION_END) },
        "temperature" to { Random.nextDouble(TEMPERATURE_START, TEMPERATURE_END) },
        "latitude" to { Random.nextDouble(LATITUDE_START, LATITUDE_END) },
        "longitude" to { Random.nextDouble(LONGITUDE_START, LONGITUDE_END) },
        "altitude" to { Random.nextDouble(ALTITUDE_START, ALTITUDE_END) },
        "weight" to { Random.nextDouble(WEIGHT_START, WEIGHT_END) },
        "height" to { Random.nextDouble(HEIGHT_START, HEIGHT_END) },
        "width" to { Random.nextDouble(WIDTH_START, WIDTH_END) },
        "length" to { Random.nextDouble(LENGTH_START, LENGTH_END) },
        "depth" to { Random.nextDouble(DEPTH_START, DEPTH_END) },
        "volume" to { Random.nextDouble(VOLUME_START, VOLUME_END) },
        "density" to { Random.nextDouble(DENSITY_START, DENSITY_END) },
        "velocity" to { Random.nextDouble(VELOCITY_START, VELOCITY_END) },
        "acceleration" to { Random.nextDouble(ACCELERATION_START, ACCELERATION_END) },
        "distance" to { Random.nextDouble(DISTANCE_START, DISTANCE_END) },
        "duration" to { Random.nextDouble(DURATION_START, DURATION_END) },
        "score" to { Random.nextDouble(SCORE_START, SCORE_END) },
        "grade" to { Random.nextDouble(GRADE_START, GRADE_END) },
        "factor" to { Random.nextDouble(FACTOR_START, FACTOR_END) },
        "index" to { Random.nextDouble(INDEX_START, INDEX_END) },
        "proportion" to { Random.nextDouble(PROPORTION_START, PROPORTION_END) },
        "quota" to { Random.nextDouble(QUOTA_START, QUOTA_END) },
        "measurement" to { Random.nextDouble(MEASUREMENT_START, MEASUREMENT_END) },
        "reading" to { Random.nextDouble(READING_START, READING_END) },
        "level" to { Random.nextDouble(LEVEL_START, LEVEL_END) },
        "intensity" to { Random.nextDouble(INTENSITY_START, INTENSITY_END) },
        "concentration" to { Random.nextDouble(CONCENTRATION_START, CONCENTRATION_END) },
        "capacity" to { Random.nextDouble(CAPACITY_START, CAPACITY_END) },
        "frequency" to { Random.nextDouble(FREQUENCY_START, FREQUENCY_END) },
        "speed" to { Random.nextDouble(SPEED_START, SPEED_END) },
        "magnitude" to { Random.nextDouble(MAGNITUDE_START, MAGNITUDE_END) },
        "value" to { Random.nextDouble(VALUE_START, VALUE_END) },
        "interestRate" to { Random.nextDouble(INTEREST_RATE_START, INTEREST_RATE_END) },
        "growthRate" to { Random.nextDouble(GROWTH_RATE_START, GROWTH_RATE_END) },
        "discount" to { Random.nextDouble(DISCOUNT_START, DISCOUNT_END) },
        "profit" to { Random.nextDouble(PROFIT_START, PROFIT_END) },
        "loss" to { Random.nextDouble(LOSS_START, LOSS_END) },
        "yield" to { Random.nextDouble(YIELD_START, YIELD_END) },
        "return" to { Random.nextDouble(RETURN_START, RETURN_END) },
        "gain" to { Random.nextDouble(GAIN_START, GAIN_END) },
        "spread" to { Random.nextDouble(SPREAD_START, SPREAD_END) }
    )

    /**
     * Generates a fake double value based on the provided property name.
     * @param propertyName The name of the property for which to generate a fake value.
     * @return A fake double value.
     */
    override fun fake(propertyName: String): Double {
        val key = fakeFunctions.keys.find { propertyName.lowercase().contains(it) }
        return fakeFunctions[key]?.invoke() ?: Random.nextDouble(
            DEFAULT_START_DOUBLE, DEFAULT_END_DOUBLE
        )
    }
}
