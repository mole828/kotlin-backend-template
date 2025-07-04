plugins {
    alias(libs.plugins.kotlinPluginSerialization)
    id("buildsrc.convention.kotlin-multiplatform")
}

kotlin {
    val commonMain by sourceSets.getting {
        dependencies {
            implementation(libs.kotlinxSerialization)
        }
    }
}