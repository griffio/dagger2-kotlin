plugins {
    kotlin("jvm") version "1.7.10"
    kotlin("kapt") version "1.7.10"
    application
}

repositories {
    mavenCentral()
    google() // required for Dagger
}

application {
    mainClass.set("griffio.MainApplication")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
    kotlinOptions.jvmTarget = "14"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(14))
}

dependencies {

    val daggerVersion = "2.43.2"
    val jpaVersion = "2.2.1"
    val querydslVersion = "5.0.0"

    implementation("org.eclipse.persistence:javax.persistence:${jpaVersion}")
    implementation("com.querydsl:querydsl-collections:${querydslVersion}")
    implementation("com.querydsl:querydsl-jpa:${querydslVersion}")
    implementation("com.google.dagger:dagger:${daggerVersion}")

    kapt("com.querydsl:querydsl-apt:${querydslVersion}:jpa")
    kapt("com.querydsl:querydsl-kotlin-codegen:${querydslVersion}")
    kapt("com.google.dagger:dagger-compiler:${daggerVersion}")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.10")

}

kapt {
    mapDiagnosticLocations = true // include the Kotlin files into error reports
}
