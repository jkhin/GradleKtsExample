object BuildDependencies {

    object AndroidX {

        val constraintLayout: String by lazy {
            "androidx.constraintlayout:constraintlayout:${DependencyVersion.CONSTRAINT_LAYOUT.version}"
        }

        val material3: String by lazy {
            "com.google.android.material:material:${DependencyVersion.GOOGLE_MATERIAL.version}"
        }

        object Navigation {
            val fragmentKtx: String by lazy {
                "androidx.navigation:navigation-fragment-ktx:${DependencyVersion.NAVIGATION_FRAGMENT.version}"
            }
            val fragmentUIKtx: String by lazy {
                "androidx.navigation:navigation-ui-ktx:${DependencyVersion.NAVIGATION_UI_KTX.version}"
            }
        }

    }

    object AndroidSupport {
        val coreKtx: String by lazy {
            "androidx.core:core-ktx:${DependencyVersion.ANDROID_CORE_KTX.version}"
        }

        val appCompat: String by lazy {
            "androidx.appcompat:appcompat:${DependencyVersion.ANDROID_APPCOMPAT.version}"
        }

    }

    object DI {
        object Koin {
            val koinCore: String by lazy {
                "io.insert-koin:koin-core:${DependencyVersion.KOIN.version}"
            }

            object Android {
                val koin: String by lazy { "io.insert-koin:koin-test:${DependencyVersion.KOIN.version}" }
            }
        }
    }

    object Tests {
        val junit: String by lazy {
            "junit:junit:${DependencyVersion.JUNIT.version}"
        }

        object Android {
            val testJunit: String by lazy {
                "androidx.test.ext:junit:${DependencyVersion.ANDROID_TEST_JUNIT.version}"
            }

            val espressoCore: String by lazy {
                "androidx.test.espresso:espresso-core:${DependencyVersion.ANDROID_TEST_ESPRESSO_CORE.version}"
            }
        }
    }

}