import de.mannodermaus.gradle.plugins.junit5.junitPlatform

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("de.mannodermaus.android-junit5")
}

android {
    compileSdk = 31
    buildToolsVersion = "31.0.0"

    defaultConfig {
        applicationId = "dev.kagamirai.styrax"
        minSdk = 23
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        create("release") {
            keyAlias = System.getenv("BITRISEIO_ANDROID_KEYSTORE_ALIAS")
            keyPassword = System.getenv("BITRISEIO_ANDROID_KEYSTORE_PRIVATE_KEY_PASSWORD")
            storeFile = File(System.getenv("BITRISEIO_ANDROID_KEYSTORE_URL"))
            storePassword = System.getenv("BITRISEIO_ANDROID_KEYSTORE_PASSWORD")
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    flavorDimensions.add("tier")

    productFlavors {
        create("free") {
            dimension = "tier"
            applicationId = "dev.kagamirai.styrax.free"
        }
        create("paid") {
            dimension = "tier"
            applicationId = "dev.kagamirai.styrax.paid"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = listOf("-Xskip-prerelease-check")
    }

    packagingOptions {
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }


    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }

    testOptions {
        junitPlatform {
            filters {
                includeEngines("spek2")
            }
        }
    }
}

dependencies {
    implementation(Libs.kotlin)
    implementation(Libs.core)
    implementation(Libs.appCompat)
    implementation(Libs.material)

    implementation(Libs.activityCompose)
    implementation(Libs.composeTooling)
    implementation(Libs.composeFoundation)
    implementation(Libs.composeMaterial)

    testImplementation(Libs.kotlinJdk8)
    testImplementation(Libs.kotlinReflect)
    testImplementation(Libs.kotlinTest)
    testImplementation(Libs.spekDsl)
    testImplementation(Libs.spekRunner)

    androidTestImplementation(Libs.composeTest)
}