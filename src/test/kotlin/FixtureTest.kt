import com.heroesofcode.Fixture
import data.Group
import data.User
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FixtureTest {

    @Test
    fun `test fixtureOf generates User instance`() {
        val user: User = Fixture.fixtureOf()
        assertNotNull(user)
    }

    @Test
    fun `test fixtureOf generates Group with list of Users inside`() {
        val group: Group = Fixture.fixtureOf()

        assertNotNull(group)
        assertTrue(group.users.isNotEmpty())
    }

    @Test
    fun `test fixtureOf generates list of Users instance`() {
        val users: List<User> = Fixture.fixtureListOf()

        assertNotNull(users)
        assertTrue(users.size == 3)
    }
}