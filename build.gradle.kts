plugins {
    kotlin("jvm") version "1.9.23"

    id("io.gitlab.arturbosch.detekt") version "1.23.2"
    id("org.jetbrains.kotlinx.kover") version "0.7.6"

    `maven-publish`
}

group = "com.heroesofcode"
version = "0.1.0"

repositories {
    mavenCentral()

    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/heroesofcode/fixture-ktx")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
            password = project.findProperty("gpr.token") as String? ?: System.getenv("GITHUB_TOKEN")
        }
    }
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

publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
            groupId = "com.heroesofcode"
            artifactId = "fixture-ktx"
            version = "0.1.0"
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/heroesofcode/fixture-ktx")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GIT_ACTOR")
                password = project.findProperty("gpr.token") as String? ?: System.getenv("GIT_TOKEN")
            }
        }
    }
}