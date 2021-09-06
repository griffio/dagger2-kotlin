plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("kapt") version "1.5.30"
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("griffio.MainApplication")
}

dependencies {

    val daggerVersion = "2.23.2"
    val jpaVersion = "2.1.0"
    val querydslVersion = "4.2.1"

    implementation("org.eclipse.persistence:javax.persistence:${jpaVersion}")
    implementation("com.querydsl:querydsl-collections:${querydslVersion}")
    implementation("com.querydsl:querydsl-jpa:${querydslVersion}")
    implementation("com.google.dagger:dagger:${daggerVersion}")

    kapt("com.querydsl:querydsl-apt:${querydslVersion}:jpa")
    kapt("com.google.dagger:dagger-compiler:${daggerVersion}")

    testImplementation(kotlin("test"))

}

kapt {
    mapDiagnosticLocations = true // include the Kotlin files into error reports
}
