import com.heroesofcode.Fixture.fixtureOf
import com.heroesofcode.faker.constants.*
import com.heroesofcode.faker.constants.PRICE_END
import com.heroesofcode.faker.constants.PRICE_START
import com.heroesofcode.faker.constants.RATE_END
import com.heroesofcode.faker.constants.RATE_START
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
