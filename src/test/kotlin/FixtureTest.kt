import com.heroesofcode.Fixture.fixtureListOf
import com.heroesofcode.Fixture.fixtureOf
import data.EnumDataTest
import data.Group
import data.Person
import data.SealedData
import data.User
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FixtureTest {

    @Test
    fun `test fixtureOf generates User instance`() {
        val user: User = fixtureOf()
        assertNotNull(user)
    }

    @Test
    fun `test fixtureOf generates Group with list of Users inside`() {
        val group: Group = fixtureOf()

        assertNotNull(group)
        assertTrue(group.users.isNotEmpty())
    }

    @Test
    fun `test fixtureOf generates list of Users instance`() {
        val users: List<User> = fixtureListOf()

        assertNotNull(users)
        assertTrue(users.size == 3)
    }

    @Test
    fun `test fixtureOf generates Person instance`() {
        val person: Person = fixtureOf()
        assertNotNull(person)
    }

    @Test
    fun `test fixtureListOf generates list of Person instances`() {
        val people: List<Person> = fixtureListOf()
        assertNotNull(people)
    }

    @Test
    fun `test fixtureOf with enum data on data class`() {
        val enumData = fixtureOf<EnumDataTest>()
        assertNotNull(enumData)
    }

    @Test
    fun `test fixtureOf with sealed data on data class`() {
        val sealedData = fixtureOf<SealedData>()
        assertNotNull(sealedData)
    }
}
