plugins {
    kotlin("multiplatform") version "1.3.61"
}

group = "com.gramboid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js { browser() }
    iosX64()

    val os = org.gradle.internal.os.OperatingSystem.current()
    val hostTarget = when {
        os.isLinux -> linuxX64("linux")
        os.isMacOsX -> macosX64("macos")
        os.isWindows -> mingwX64("mingw")
        else -> throw IllegalStateException("Your OS [$os] is not supported!")
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

afterEvaluate {
    tasks.withType<AbstractTestTask>().forEach {
        it.testLogging {
            events("passed", "skipped", "failed")
        }
    }
}