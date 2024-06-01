import io.heroesofcode.Fixture.fixtureOf
import io.heroesofcode.faker.constants.ACCELERATION_END
import io.heroesofcode.faker.constants.ACCELERATION_START
import io.heroesofcode.faker.constants.ALTITUDE_END
import io.heroesofcode.faker.constants.ALTITUDE_START
import io.heroesofcode.faker.constants.AVERAGE_END
import io.heroesofcode.faker.constants.AVERAGE_START
import io.heroesofcode.faker.constants.CAPACITY_END
import io.heroesofcode.faker.constants.CAPACITY_START
import io.heroesofcode.faker.constants.CONCENTRATION_END
import io.heroesofcode.faker.constants.CONCENTRATION_START
import io.heroesofcode.faker.constants.DENSITY_END
import io.heroesofcode.faker.constants.DENSITY_START
import io.heroesofcode.faker.constants.DEPTH_END
import io.heroesofcode.faker.constants.DEPTH_START
import io.heroesofcode.faker.constants.DISCOUNT_END
import io.heroesofcode.faker.constants.DISCOUNT_START
import io.heroesofcode.faker.constants.DISTANCE_END
import io.heroesofcode.faker.constants.DISTANCE_START
import io.heroesofcode.faker.constants.DURATION_END
import io.heroesofcode.faker.constants.DURATION_START
import io.heroesofcode.faker.constants.FACTOR_END
import io.heroesofcode.faker.constants.FACTOR_START
import io.heroesofcode.faker.constants.FREQUENCY_END
import io.heroesofcode.faker.constants.FREQUENCY_START
import io.heroesofcode.faker.constants.GAIN_END
import io.heroesofcode.faker.constants.GAIN_START
import io.heroesofcode.faker.constants.GRADE_END
import io.heroesofcode.faker.constants.GRADE_START
import io.heroesofcode.faker.constants.GROWTH_RATE_END
import io.heroesofcode.faker.constants.GROWTH_RATE_START
import io.heroesofcode.faker.constants.HEIGHT_END
import io.heroesofcode.faker.constants.HEIGHT_START
import io.heroesofcode.faker.constants.INDEX_END
import io.heroesofcode.faker.constants.INDEX_START
import io.heroesofcode.faker.constants.INTENSITY_END
import io.heroesofcode.faker.constants.INTENSITY_START
import io.heroesofcode.faker.constants.INTEREST_RATE_END
import io.heroesofcode.faker.constants.INTEREST_RATE_START
import io.heroesofcode.faker.constants.LATITUDE_END
import io.heroesofcode.faker.constants.LATITUDE_START
import io.heroesofcode.faker.constants.LENGTH_END
import io.heroesofcode.faker.constants.LENGTH_START
import io.heroesofcode.faker.constants.LEVEL_END
import io.heroesofcode.faker.constants.LEVEL_START
import io.heroesofcode.faker.constants.LONGITUDE_END
import io.heroesofcode.faker.constants.LONGITUDE_START
import io.heroesofcode.faker.constants.LOSS_END
import io.heroesofcode.faker.constants.LOSS_START
import io.heroesofcode.faker.constants.MAGNITUDE_END
import io.heroesofcode.faker.constants.MAGNITUDE_START
import io.heroesofcode.faker.constants.MEAN_END
import io.heroesofcode.faker.constants.MEAN_START
import io.heroesofcode.faker.constants.MEASUREMENT_END
import io.heroesofcode.faker.constants.MEASUREMENT_START
import io.heroesofcode.faker.constants.MEDIAN_END
import io.heroesofcode.faker.constants.MEDIAN_START
import io.heroesofcode.faker.constants.PERCENTAGE_END
import io.heroesofcode.faker.constants.PERCENTAGE_START
import io.heroesofcode.faker.constants.PRICE_END
import io.heroesofcode.faker.constants.PRICE_START
import io.heroesofcode.faker.constants.PROFIT_END
import io.heroesofcode.faker.constants.PROFIT_START
import io.heroesofcode.faker.constants.PROPORTION_END
import io.heroesofcode.faker.constants.PROPORTION_START
import io.heroesofcode.faker.constants.QUOTA_END
import io.heroesofcode.faker.constants.QUOTA_START
import io.heroesofcode.faker.constants.RATE_END
import io.heroesofcode.faker.constants.RATE_START
import io.heroesofcode.faker.constants.RATIO_END
import io.heroesofcode.faker.constants.RATIO_START
import io.heroesofcode.faker.constants.READING_END
import io.heroesofcode.faker.constants.READING_START
import io.heroesofcode.faker.constants.RETURN_END
import io.heroesofcode.faker.constants.RETURN_START
import io.heroesofcode.faker.constants.SCORE_END
import io.heroesofcode.faker.constants.SCORE_START
import io.heroesofcode.faker.constants.SPEED_END
import io.heroesofcode.faker.constants.SPEED_START
import io.heroesofcode.faker.constants.SPREAD_END
import io.heroesofcode.faker.constants.SPREAD_START
import io.heroesofcode.faker.constants.STANDARD_DEVIATION_END
import io.heroesofcode.faker.constants.STANDARD_DEVIATION_START
import io.heroesofcode.faker.constants.TEMPERATURE_END
import io.heroesofcode.faker.constants.TEMPERATURE_START
import io.heroesofcode.faker.constants.VALUE_END
import io.heroesofcode.faker.constants.VALUE_START
import io.heroesofcode.faker.constants.VARIANCE_END
import io.heroesofcode.faker.constants.VARIANCE_START
import io.heroesofcode.faker.constants.VELOCITY_END
import io.heroesofcode.faker.constants.VELOCITY_START
import io.heroesofcode.faker.constants.VOLUME_END
import io.heroesofcode.faker.constants.VOLUME_START
import io.heroesofcode.faker.constants.WEIGHT_END
import io.heroesofcode.faker.constants.WEIGHT_START
import io.heroesofcode.faker.constants.WIDTH_END
import io.heroesofcode.faker.constants.WIDTH_START
import io.heroesofcode.faker.constants.YIELD_END
import io.heroesofcode.faker.constants.YIELD_START
import data.faker.DoubleFakerData
import kotlin.test.Test
import kotlin.test.assertTrue

class DoubleFakerTest {
    val doubleFakerData = fixtureOf<DoubleFakerData>()

    @Test
    fun withDoubleFakeData_verifyFixtureFakeCorrectly() {
        assertTrue(doubleFakerData.price in PRICE_START..PRICE_END)
        assertTrue(doubleFakerData.rate in RATE_START..RATE_END)
        assertTrue(doubleFakerData.percentage in PERCENTAGE_START..PERCENTAGE_END)
        assertTrue(doubleFakerData.ratio in RATIO_START..RATIO_END)
        assertTrue(doubleFakerData.average in AVERAGE_START..AVERAGE_END)
        assertTrue(doubleFakerData.mean in MEAN_START..MEAN_END)
        assertTrue(doubleFakerData.median in MEDIAN_START..MEDIAN_END)
        assertTrue(doubleFakerData.variance in VARIANCE_START..VARIANCE_END)
        assertTrue(doubleFakerData.standardDeviation in STANDARD_DEVIATION_START..STANDARD_DEVIATION_END)
        assertTrue(doubleFakerData.temperature in TEMPERATURE_START..TEMPERATURE_END)
        assertTrue(doubleFakerData.latitude in LATITUDE_START..LATITUDE_END)
        assertTrue(doubleFakerData.longitude in LONGITUDE_START..LONGITUDE_END)
        assertTrue(doubleFakerData.altitude in ALTITUDE_START..ALTITUDE_END)
        assertTrue(doubleFakerData.weight in WEIGHT_START..WEIGHT_END)
        assertTrue(doubleFakerData.height in HEIGHT_START..HEIGHT_END)
        assertTrue(doubleFakerData.width in WIDTH_START..WIDTH_END)
        assertTrue(doubleFakerData.length in LENGTH_START..LENGTH_END)
        assertTrue(doubleFakerData.depth in DEPTH_START..DEPTH_END)
        assertTrue(doubleFakerData.volume in VOLUME_START..VOLUME_END)
        assertTrue(doubleFakerData.density in DENSITY_START..DENSITY_END)
        assertTrue(doubleFakerData.velocity in VELOCITY_START..VELOCITY_END)
        assertTrue(doubleFakerData.acceleration in ACCELERATION_START..ACCELERATION_END)
        assertTrue(doubleFakerData.distance in DISTANCE_START..DISTANCE_END)
        assertTrue(doubleFakerData.duration in DURATION_START..DURATION_END)
        assertTrue(doubleFakerData.score in SCORE_START..SCORE_END)
        assertTrue(doubleFakerData.grade in GRADE_START..GRADE_END)
        assertTrue(doubleFakerData.factor in FACTOR_START..FACTOR_END)
        assertTrue(doubleFakerData.index in INDEX_START..INDEX_END)
        assertTrue(doubleFakerData.proportion in PROPORTION_START..PROPORTION_END)
        assertTrue(doubleFakerData.quota in QUOTA_START..QUOTA_END)
        assertTrue(doubleFakerData.measurement in MEASUREMENT_START..MEASUREMENT_END)
        assertTrue(doubleFakerData.reading in READING_START..READING_END)
        assertTrue(doubleFakerData.level in LEVEL_START..LEVEL_END)
        assertTrue(doubleFakerData.intensity in INTENSITY_START..INTENSITY_END)
        assertTrue(doubleFakerData.concentration in CONCENTRATION_START..CONCENTRATION_END)
        assertTrue(doubleFakerData.capacity in CAPACITY_START..CAPACITY_END)
        assertTrue(doubleFakerData.frequency in FREQUENCY_START..FREQUENCY_END)
        assertTrue(doubleFakerData.speed in SPEED_START..SPEED_END)
        assertTrue(doubleFakerData.magnitude in MAGNITUDE_START..MAGNITUDE_END)
        assertTrue(doubleFakerData.value in VALUE_START..VALUE_END)
        assertTrue(doubleFakerData.interestRate in INTEREST_RATE_START..INTEREST_RATE_END)
        assertTrue(doubleFakerData.growthRate in GROWTH_RATE_START..GROWTH_RATE_END)
        assertTrue(doubleFakerData.discount in DISCOUNT_START..DISCOUNT_END)
        assertTrue(doubleFakerData.profit in PROFIT_START..PROFIT_END)
        assertTrue(doubleFakerData.loss in LOSS_START..LOSS_END)
        assertTrue(doubleFakerData.yield in YIELD_START..YIELD_END)
        assertTrue(doubleFakerData.returnVal in RETURN_START..RETURN_END)
        assertTrue(doubleFakerData.gain in GAIN_START..GAIN_END)
        assertTrue(doubleFakerData.spread in SPREAD_START..SPREAD_END)
    }
}
