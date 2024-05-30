package com.heroesofcode.faker

import com.heroesofcode.RANGE_END
import com.heroesofcode.RANGE_INIT
import io.github.serpro69.kfaker.Faker
import kotlin.random.Random

object StringFaker {
    private val faker = Faker()

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

    fun fake(propertyName: String): String {
        val lowercasePropertyName = propertyName.lowercase()
        val function = fakeFunctions.entries.find { (key, _) ->
            lowercasePropertyName.contains(key)
        }?.value
        return function?.invoke() ?: "String${Random.nextInt(RANGE_INIT, RANGE_END)}"
    }
}
