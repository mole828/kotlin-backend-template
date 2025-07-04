plugins {
    id("buildsrc.convention.kotlin-multiplatform")
}

kotlin {
    val commonMain by sourceSets.getting {
        dependencies {
            api(project(":model"))
        }
    }
    val jvmTest by sourceSets.getting {} // 为测试选择一种运行时
}