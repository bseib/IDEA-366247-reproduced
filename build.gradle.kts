plugins {
    kotlin("jvm") version "2.0.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    val jdbiVersion = "3.36.0"
    implementation("org.jdbi:jdbi3-core:${jdbiVersion}")
    implementation("org.jdbi:jdbi3-sqlobject:${jdbiVersion}")
    implementation("org.jdbi:jdbi3-kotlin:${jdbiVersion}")
    implementation("org.jdbi:jdbi3-kotlin-sqlobject:${jdbiVersion}")
    implementation("org.jdbi:jdbi3-postgres:${jdbiVersion}")
}

application {
    mainClass.set("example.MainKt")
}
