# fixture-ktx

The fixture-ktx is a tool that helps generate class instances with random data to facilitate unit testing. It supports a variety of property types, including strings, numbers, booleans, enums, sealed classes, and exceptions.

## Installation

Add the Fixture Library dependency to your build configuration file. For example, if you're using Gradle, add the following to your `build.gradle` file:

```groovy
dependencies {
    implementation 'io.heroesofcode:fixture-ktx:$version'
}
```

## Usage

### Generate a Single Instance

To generate an instance of a class with random data, use the <b>fixtureOf</b> method.

```kotlin
import com.heroesofcode.Fixture.fixtureOf

val user = fixtureOf<User>()
```

### Generating a List of Instances

To generate a list of class instances with random data, use the <b>fixtureListOf</b> method.

```kotlin
import com.heroesofcode.Fixture.fixtureListOf

val users = fixtureListOf<User>()
```

### Example Class 

Let's consider the following <b>User</b> class as an example:

```kotlin
data class User(
    val name: String,
    val age: Int,
    val email: String,
    val isActive: Boolean,
    val accountBalance: Double
)
```

### Example Usage

```kotlin
fun main() {
    val user: User = fixtureOf()
    println(user)

    val users: List<User> = fixtureListOf(size = 5)
    users.forEach { println(it) }
}
```

## Supported Property Types

The fixture-ktx currently supports the following property types:

* **String:** Generates a random string.
* **Int:** Generates a random integer.
* **Boolean:** Generates a random boolean value.
* **Double:** Generates a random double value.
* **Float:** Generates a random float value.
* **Enum:** Randomly selects a value from an enumeration.
* **Sealed Classes:** Randomly selects a subclass of a sealed class.
* **Exceptions:** Generates instances of exceptions with a default message.

## Generate Data

The library leverages the [Kotlin-Faker](https://github.com/serpro69/kotlin-faker) library to generate realistic fake data, providing a closer match to real-world scenarios.

## Contributions

Contributions are welcome! Feel free to open an issue or submit a pull request on the project's repository.

