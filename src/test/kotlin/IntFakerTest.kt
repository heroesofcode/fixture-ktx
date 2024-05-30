import com.heroesofcode.Fixture.fixtureOf
import data.faker.IntFakerData
import kotlin.test.Test
import kotlin.test.assertTrue

class IntFakerTest {
    val intFakerData = fixtureOf<IntFakerData>()

    @Test
    fun withIntFakeData_verifyFixtureFakeCorrectly() {
        assertTrue(intFakerData.age in 1..100)
        assertTrue(intFakerData.year in 1950..2024)
        assertTrue(intFakerData.month in 1..12)
        assertTrue(intFakerData.day in 1..31)
        assertTrue(intFakerData.chapter in 1..12)
        assertTrue(intFakerData.episode in 1..10)
        assertTrue(intFakerData.round in 1..12)
    }
}
