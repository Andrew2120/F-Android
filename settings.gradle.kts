pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Fiber-Android1"
include(":fiber-deel")
include(":fiber-retail")
include(":fiber-mylo")
include(":fiber-components")
include(":fiber-tokens")
