plugins {
    `java-library`
}

group = "org.example.test-gradle-monorepo"
version = "0.1-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {

    // Use JUnit test framework
    testImplementation("junit:junit:4.13")
}
