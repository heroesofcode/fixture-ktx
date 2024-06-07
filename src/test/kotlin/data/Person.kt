package data

import java.lang.Exception

data class Address(
    val street: String,
    val city: String,
    val country: String
)

data class Company(
    val name: String,
    val address: Address,
    val foundedYear: Int
)

data class Job(
    val title: String,
    val salary: Double,
    val company: Company
)

data class Person(
    val name: String,
    val age: Int,
    val email: String,
    val address: Address,
    val jobs: List<Job>,
    val parentJobs: Set<Job>,
    val parentAddresses: Array<Address>,
    val isEmployed: Boolean,
    val exception: Exception,
    val throwable: Throwable
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false
        if (email != other.email) return false
        if (address != other.address) return false
        if (jobs != other.jobs) return false
        if (!parentAddresses.contentEquals(other.parentAddresses)) return false
        if (isEmployed != other.isEmployed) return false
        if (exception != other.exception) return false
        if (throwable != other.throwable) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + email.hashCode()
        result = 31 * result + address.hashCode()
        result = 31 * result + jobs.hashCode()
        result = 31 * result + parentAddresses.contentHashCode()
        result = 31 * result + isEmployed.hashCode()
        result = 31 * result + exception.hashCode()
        result = 31 * result + throwable.hashCode()
        return result
    }
}
