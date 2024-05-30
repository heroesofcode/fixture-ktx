import com.heroesofcode.Fixture
import data.User
import kotlin.test.Test
import kotlin.test.assertNotNull

class FixtureTest {

    @Test
    fun `test fixtureOf generates User instance`() {
        val user: User = Fixture.fixtureOf()
        assertNotNull(user)
        println(user)
    }
}