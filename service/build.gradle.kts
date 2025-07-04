plugins {
    id("buildsrc.convention.kotlin-multiplatform")
}

kotlin {
    jvm()
    js()
    val commonMain by sourceSets.getting {}

    val jvmTest by sourceSets.getting {} // 为测试选择一种运行时
}