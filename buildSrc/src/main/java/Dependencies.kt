object Libs {
    // Android
    const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"
    const val core = "androidx.core:core-ktx:$coreVersion"
    const val material = "com.google.android.material:material:$materialVersion"

    // Compose
    const val activityCompose = "androidx.activity:activity-compose:$activityVersion"
    const val composeTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val composeFoundation = "androidx.compose.foundation:foundation:$composeVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeVersion"
    const val composeTest = "androidx.compose.ui:ui-test-junit4:$composeVersion"

    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"

    // Testing
    const val spekDsl = "org.spekframework.spek2:spek-dsl-jvm:$spekVersion"
    const val spekRunner = "org.spekframework.spek2:spek-runner-junit5:$spekVersion"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit5:$kotlinVersion"
    const val kotlinJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"

    const val androidGradlePlugin = "com.android.tools.build:gradle:$buildToolsVersion"
    const val androidJUnit5GradlePlugin = "de.mannodermaus.gradle.plugins:android-junit5:$androidJUnit5Version"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val gradleVersionsGradlePlugin = "com.github.ben-manes.versions"
}

const val composeVersion = "1.2.0-alpha02"
const val gradleVersionsVersion = "0.41.0"
const val kotlinVersion = "1.6.10"

private const val androidJUnit5Version = "1.8.2.0"
private const val appcompatVersion = "1.4.1"
private const val activityVersion = "1.5.0-alpha01"
private const val buildToolsVersion = "7.2.0-beta01"
private const val coreVersion = "1.7.0"
private const val materialVersion = "1.5.0"
private const val spekVersion = "2.0.17"
