plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "translator"

include("engines")
include("engines:google")

findProject(":engines:google")?.name = "google"
include("engines:deepl")
findProject(":engines:deepl")?.name = "deepl"
