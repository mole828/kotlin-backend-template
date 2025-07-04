plugins {
    id("buildsrc.convention.kotlin-jvm")
    id("io.ktor.plugin") version libs.versions.ktor
    application
}

dependencies {
    implementation(project(":service"))

    val ktorVersion = libs.versions.ktor
    implementation("io.ktor:ktor-server-core:${ktorVersion}")
    implementation("io.ktor:ktor-server-netty:${ktorVersion}")
    implementation("ch.qos.logback:logback-classic:1.5.18")
    implementation(libs.kotlinxSerialization)
}

application {
    // Define the Fully Qualified Name for the application main class
    // (Note that Kotlin compiles `App.kt` to a class with FQN `com.example.app.AppKt`.)
    mainClass = "backend.MainKt"
}