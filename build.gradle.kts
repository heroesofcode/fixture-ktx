plugins {
    kotlin("jvm") version "1.9.23"

    id("io.gitlab.arturbosch.detekt") version "1.23.2"
    id("org.jetbrains.kotlinx.kover") version "0.7.6"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
    testImplementation(kotlin("test"))

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}