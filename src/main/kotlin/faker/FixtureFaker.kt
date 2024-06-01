package io.heroesofcode.faker

/**
 * FixtureFaker is an interface for classes that generate fake values of a specified type.
 * Implementing classes provide a method to generate fake values based on a property name.
 * @param T The type of the fake value to generate.
 */
interface FixtureFaker<T> {

    /**
     * Generates a fake value of type T based on the provided property name.
     * @param propertyName The name of the property for which to generate a fake value.
     * @return A fake value of type T.
     */
    fun fake(propertyName: String): T
}
