plugins {
    alias(libs.plugins.kotlinPluginSerialization)
    id("buildsrc.convention.kotlin-multiplatform")
}

kotlin {
    js {
        browser{}
        binaries.library()
        generateTypeScriptDefinitions()
    }
    val commonMain by sourceSets.getting {
        dependencies {
            implementation(libs.kotlinxSerialization)
        }
    }
}