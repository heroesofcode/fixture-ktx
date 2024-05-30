package com.heroesofcode.faker

import com.heroesofcode.faker.constants.*
import com.heroesofcode.faker.constants.PRICE_END
import com.heroesofcode.faker.constants.PRICE_START
import com.heroesofcode.faker.constants.RATE_END
import com.heroesofcode.faker.constants.RATE_START
import kotlin.random.Random

object DoubleFaker : FixtureFaker<Double> {

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

    override fun fake(propertyName: String): Double {
        val key = fakeFunctions.keys.find { propertyName.lowercase().contains(it) }
        return fakeFunctions[key]?.invoke() ?: Random.nextDouble(
            DEFAULT_START_DOUBLE, DEFAULT_END_DOUBLE)
    }
}
