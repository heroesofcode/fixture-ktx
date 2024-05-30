package com.heroesofcode.faker

interface FixtureFaker<T> {
    fun fake(propertyName: String): T
}
