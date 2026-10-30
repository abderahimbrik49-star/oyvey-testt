pluginManagement {
    repositories {
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("net.fabricmc.fabric-loom") version providers.gradleProperty("loom_version")
        id("com.github.gmazzo.buildconfig") version providers.gradleProperty("buildconfig_version")
    }
}

rootProject.name = "oyvey-ported"
