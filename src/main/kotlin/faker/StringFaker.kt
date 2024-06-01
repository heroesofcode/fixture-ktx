package io.heroesofcode.faker

import io.github.serpro69.kfaker.Faker
import io.heroesofcode.faker.constants.RANGE_END
import io.heroesofcode.faker.constants.RANGE_INIT
import kotlin.random.Random

/**
 * StringFaker is a utility for generating fake string values for various properties.
 * It implements the FixtureFaker interface for seamless integration with the Fixture Library.
 */
object StringFaker : FixtureFaker<String> {

    // Faker instance for generating fake data
    private val faker = Faker()

    // Map containing fake functions for specific properties
    private val fakeFunctions = mapOf(
        "name" to { faker.name.name() },
        "address" to { faker.address.fullAddress() },
        "currency" to { faker.currency.symbol() },
        "movie" to { faker.movie.title() },
        "bank" to { faker.bank.name() },
        "barcode" to { faker.barcode.ean8() },
        "device" to { faker.device.serial() },
        "driving" to { faker.drivingLicense.license() },
        "esport" to { faker.eSport.teams() },
        "file" to { faker.file.extension() },
        "food" to { faker.food.fruits() },
        "game" to { faker.game.title() },
        "gender" to { faker.gender.types() },
        "idNumber" to { faker.idNumber.invalid() },
        "job" to { faker.job.title() },
        "markdown" to { faker.markdown.headers() },
        "phone" to { faker.phoneNumber.cellPhone() },
        "quote" to { faker.quote.yoda() },
        "university" to { faker.university.name() }
    )

    /**
     * Generates a fake string value based on the provided property name.
     * @param propertyName The name of the property for which to generate a fake value.
     * @return A fake string value.
     */
    override fun fake(propertyName: String): String {
        // Find the corresponding fake function based on the property name
        val lowercasePropertyName = propertyName.lowercase()
        val function = fakeFunctions.entries.find { (key, _) ->
            lowercasePropertyName.contains(key)
        }?.value

        // Invoke the fake function if found, otherwise generate a default random string value
        return function?.invoke() ?: "String${Random.nextInt(RANGE_INIT, RANGE_END)}"
    }
}
