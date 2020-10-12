plugins {
    java
    id("org.springframework.boot") version "2.3.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

group = "org.example.test-gradle-monorepo"
version = "0.1-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation("org.example.test-gradle-monorepo:shared:0.1-SNAPSHOT")
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation("junit:junit:4.13")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
