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
    val isEmployed: Boolean,
    val exception: Exception
)
