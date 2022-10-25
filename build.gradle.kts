val kotlinVersion: String by rootProject.extra
val ktorVersion: String by rootProject.extra

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
//    kotlin("multiplatform")
//  id("org.jetbrains.dokka") version "1.4.10.2"
//  `maven-publish`
}

//repositories {
//  mavenCentral()
//  jcenter()
//}

kotlin {
    sourceSets {
        main {
            kotlin.srcDir("src/commonMain/kotlin")
        }

        test {
            kotlin.srcDir("src/commonTest/kotlin")
        }

        all {
//            languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
            languageSettings.optIn("kotlinx.serialization.ExperimentalSerializationApi")
//            languageSettings.enableLanguageFeature("InlineClasses")
        }
    }

//    jvm {
//        compilations.all {
//            kotlinOptions.jvmTarget = "1.8"
//        }
//
//        testRuns.all {
//            executionTask {
//                useJUnitPlatform()
//            }
//        }
//    }

//    js(BOTH) {
//        nodejs {
//            testTask {
//                with(compilation) {
//                    kotlinOptions {
//                        moduleKind = "commonjs"
//                    }
//                }
//            }
//        }
//    }
//
//    mingwX64()
//    linuxX64()
//    macosX64()

//    sourceSets {

//        val commonMain by getting {
//            dependencies {
////                implementation(kotlin("reflect"))
//                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
////        implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
//            }
//        }
//
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test-common"))
//                implementation(kotlin("test-annotations-common"))
//            }
//        }
//
//        val jvmMain by getting
//        val jvmTest by getting {
//            dependencies {
////        implementation(kotlin("test-junit5"))
////        runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.0.0")
//                implementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
//            }
//        }

//        val jsMain by getting
//        val jsTest by getting {
//            dependencies {
//                implementation(kotlin("test-js"))
//            }
//        }
//
//        val nativeMain by creating {
//            dependsOn(commonMain)
//        }
//
//        val nativeTest by creating {
//            dependsOn(commonTest)
//        }
//
//        val mingwX64Main by getting {
//            dependsOn(nativeMain)
//        }
//
//        val mingwX64Test by getting {
//            dependsOn(nativeTest)
//        }
//
//        val linuxX64Main by getting {
//            dependsOn(nativeMain)
//        }
//
//        val linuxX64Test by getting {
//            dependsOn(nativeTest)
//        }
//
//        val macosX64Main by getting {
//            dependsOn(nativeMain)
//        }
//
//        val macosX64Test by getting {
//            dependsOn(nativeTest)
//        }

//    all {
//      languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
//      languageSettings.useExperimentalAnnotation("kotlinx.serialization.ExperimentalSerializationApi")
//      languageSettings.enableLanguageFeature("InlineClasses")
//    }
//    }
}

dependencies {
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}

//publishing {
//  val key = System.getenv("BINTRAY_API_KEY")
//  val user = "ricky12awesome"
//
//  repositories {
//    mavenLocal()
//
//    if (key != null) {
//      maven {
//        name = "bintray"
//        url = uri("https://api.bintray.com/maven/$user/github/json-schema-serialization/;publish=0;override=1")
//
//        credentials {
//          username = user
//          password = key
//        }
//      }
//    }
//  }
//}

