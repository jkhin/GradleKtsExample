plugins {
    id (BuildPlugins.ANDROID_APPLICATION)
    id (BuildPlugins.KOTLIN_ANDROID_JETBRAINS)
}

android {
    compileSdk = BuildAndroidConfig.COMPILE_SDK
    namespace = BuildAndroidConfig.NAMESPACE

    defaultConfig {
        applicationId = BuildAndroidConfig.ID
        minSdk = BuildAndroidConfig.MIN_SDK
        targetSdk = BuildAndroidConfig.TARGET_SDK
        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME

        testInstrumentationRunner = BuildAndroidConfig.ANDROID_JUNIT_RUNNER
    }

    buildTypes {
        getByName(BuildTypes.Android.RELEASE) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        create(BuildTypes.Android.DEV) {
            isDebuggable = true
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    //CORE --------------------------------------------------------------------------------------
    implementation(BuildDependencies.AndroidSupport.coreKtx)
    implementation(BuildDependencies.AndroidSupport.appCompat)

    //ANDROIDX ----------------------------------------------------------------------------------
    implementation(BuildDependencies.AndroidX.constraintLayout)
    implementation(BuildDependencies.AndroidX.material3)

    //NAVIGATION --------------------------------------------------------------------------------
    implementation(BuildDependencies.AndroidX.Navigation.fragmentKtx)
    implementation(BuildDependencies.AndroidX.Navigation.fragmentUIKtx)

    //KOIN --------------------------------------------------------------------------------------
    implementation(BuildDependencies.DI.Koin.koinCore)
    implementation(BuildDependencies.DI.Koin.Android.koin)

    //TEST --------------------------------------------------------------------------------------
    testImplementation(BuildDependencies.Tests.junit)
    androidTestImplementation(BuildDependencies.Tests.Android.testJunit)
    androidTestImplementation(BuildDependencies.Tests.Android.espressoCore)
}