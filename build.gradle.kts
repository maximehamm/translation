import java.net.URI

plugins {
    kotlin("jvm") version "1.9.23"
    id("maven-publish")
}

group = "io.open-nimbly.translator"
version = "1.0.0"
description = "Translation from source to target language using Google Translate, DeepL, etc."

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

publishing {
    repositories {
        maven {
            name = "OSSRH"
            url = URI("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
    }
}