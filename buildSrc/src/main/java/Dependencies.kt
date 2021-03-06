@file:Suppress("unused")

import java.util.Calendar

object Versions {

    const val apkNamePrefix = "CryptoCurrency"
    private const val majorVersion = 1
    val buildNumber = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
    val apkVersion = "$majorVersion.$buildNumber"

    // Android
    const val minSdkVersion = 21
    const val targetSdkVersion = 27
    const val compileSdkVersion = 27

    const val gradlePlugin = "3.1.0-beta4"
    const val kotlinLanguage = "1.2.21"

    // Libraries
    const val supportLibrary = "27.0.2"
    const val ktx = "0.2"
    const val constraintLayout = "1.1.0-beta5"

    const val retrofit = "2.3.0"
    const val okHttp = "3.8.0"
    const val gson = "2.8.2"

    const val rxJava = "2.1.10"
    const val rxAndroid = "2.0.2"
    const val rxKotlin = "2.2.0"

    // DI
    const val dagger = "2.14.1"
    const val javaxAnnotation = "1.0"
    const val javaxInject = "1"

    const val archComponentsRoom = "1.0.0"
    const val archComponents = "1.1.0"

    const val glide = "4.6.1"
    const val adapterDelegates = "3.0.1"

    const val stateView = "1.3.2"

    // Development
    const val rxLint = "1.6"
    const val okHttpLogging = "2.0.3"
    const val debugDb = "1.0.1"
    const val lintVer = "26.0.1"
}

object Libs {

    //Architecture Components
    const val archComponentsExtensions = "android.arch.lifecycle:extensions:${Versions.archComponents}"
    const val archComponentsViewModel = "android.arch.lifecycle:viewmodel:${Versions.archComponents}"
    const val archComponentsCompiler = "android.arch.lifecycle:compiler:${Versions.archComponents}"

    // Google
    const val supportLib = "com.android.support:support-v4:${Versions.supportLibrary}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.supportLibrary}"
    const val cardView = "com.android.support:cardview-v7:${Versions.supportLibrary}"
    const val supportDesign = "com.android.support:design:${Versions.supportLibrary}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"

    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlinLanguage}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    // OkHttp
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogging = "com.github.ihsanbal:LoggingInterceptor:${Versions.okHttpLogging}"

    // RxJava
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:2.0.0"

    // DI
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val javaxAnnotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotation}"
    const val javaxInject = "javax.inject:javax.inject:${Versions.javaxInject}"

    // Room
    const val roomRuntime = "android.arch.persistence.room:runtime:${Versions.archComponentsRoom}"
    const val roomRxJava = "android.arch.persistence.room:rxjava2:${Versions.archComponentsRoom}"
    const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.archComponentsRoom}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glideIntegration = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"

    const val adapterDelegates = "com.hannesdorfmann:adapterdelegates3:${Versions.adapterDelegates}"

    const val stateView = "com.github.Kennyc1012:MultiStateView:${Versions.stateView}"

    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    // Development
    const val rxLint = "nl.littlerobots.rxlint:rxlint:${Versions.rxLint}"
    const val debugDb = "com.amitshekhar.android:debug-db:${Versions.debugDb}"

    // Lint
    const val lint = "com.android.tools.lint:lint:${Versions.lintVer}"
    const val lintApi = "com.android.tools.lint:lint-api:${Versions.lintVer}"
    const val lintChecks = "com.android.tools.lint:lint-checks:${Versions.lintVer}"
    const val lintTests = "com.android.tools.lint:lint-tests:${Versions.lintVer}"
    const val lintTestUtils = "com.android.tools:testutils:${Versions.lintVer}"
}