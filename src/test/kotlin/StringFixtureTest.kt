import data.faker.StringFakerData
import io.heroesofcode.Fixture.fixtureOf
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class StringFixtureTest {

    @Test
    fun withStringFakerData_verifyFixtureFakeCorrectly() {
        val stringFakerData: StringFakerData = fixtureOf()

        assertNotNull(stringFakerData.name)
        assertNotNull(stringFakerData.fullAddress)
        assertNotNull(stringFakerData.currency)
        assertNotNull(stringFakerData.movie)
        assertNotNull(stringFakerData.bank)
        assertNotNull(stringFakerData.barcode)
        assertNotNull(stringFakerData.device)
        assertNotNull(stringFakerData.driving)
        assertNotNull(stringFakerData.eSport)
        assertNotNull(stringFakerData.file)
        assertNotNull(stringFakerData.food)
        assertNotNull(stringFakerData.game)
        assertNotNull(stringFakerData.gender)
        assertNotNull(stringFakerData.idNumber)
        assertNotNull(stringFakerData.job)
        assertNotNull(stringFakerData.markdown)
        assertNotNull(stringFakerData.phone)
        assertNotNull(stringFakerData.quote)
        assertNotNull(stringFakerData.university)
    }
}
