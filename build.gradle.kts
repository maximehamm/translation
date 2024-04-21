plugins {
    kotlin("jvm") version "1.9.23"
}

group = "io.nimbly.translator"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":engines"))
    implementation(project(":engines:google"))
    implementation(project(":engines:deepl"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}