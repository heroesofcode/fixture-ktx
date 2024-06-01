plugins {
    kotlin("jvm") version "2.0.0"

    id("io.gitlab.arturbosch.detekt") version "1.23.2"
    id("org.jetbrains.kotlinx.kover") version "0.7.6"

    `maven-publish`
}

group = "io.heroesofcode"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.0.0")
    implementation("io.github.serpro69:kotlin-faker:1.6.0")
    testImplementation(kotlin("test"))

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}