plugins {
    base // adds clean task to root project
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.10")
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.4")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.7.1.1")
    }
}

subprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // JetPref library
        google()
    }
}
