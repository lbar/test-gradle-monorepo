plugins {
    `java-library`
    id("com.github.eirnym.js2p") version "1.0"
}

group = "org.example.test-gradle-monorepo"
version = "0.1-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    api("${group}:util:${version}")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.3")

    // Use JUnit test framework
    testImplementation("junit:junit:4.13")
}

jsonSchema2Pojo {
    targetPackage = "shared.entity"
    includeJsr303Annotations = true
}
