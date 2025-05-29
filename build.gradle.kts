plugins {
    kotlin("jvm") version "2.0.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jdbi:jdbi3-core:3.43.1")
}

application {
    mainClass.set("example.MainKt")
}
