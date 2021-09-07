plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("kapt") version "1.5.30"
    application
}

repositories {
    mavenCentral()
    google() // required for Dagger
}

application {
    mainClass.set("griffio.MainApplication")
}

dependencies {

    val daggerVersion = "2.38.1"
    val jpaVersion = "2.2.1"
    val querydslVersion = "5.0.0"

    implementation("org.eclipse.persistence:javax.persistence:${jpaVersion}")
    implementation("com.querydsl:querydsl-collections:${querydslVersion}")
    implementation("com.querydsl:querydsl-jpa:${querydslVersion}")
    implementation("com.google.dagger:dagger:${daggerVersion}")

    kapt("com.querydsl:querydsl-apt:${querydslVersion}:jpa")
    kapt("com.google.dagger:dagger-compiler:${daggerVersion}")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.21")

}

kapt {
    mapDiagnosticLocations = true // include the Kotlin files into error reports
}
