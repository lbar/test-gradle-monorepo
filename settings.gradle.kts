rootProject.name = "test-gradle-monorepo"

// libs
includeBuild("libs/util")
includeBuild("libs/shared")

// apps
includeBuild("apps/server")
