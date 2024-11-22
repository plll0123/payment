plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

val kotlinVersion : String by project
val springBootVersion: String by project
val springDependencyManagementVersion: String by project
val gradlePlugin : String by project
val javaVersion : String by project

java.sourceCompatibility = JavaVersion.valueOf("VERSION_$javaVersion")

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

//    implementation("com.epages:restdocs-api-spec-gradle-plugin:$gradlePlugin")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:$springDependencyManagementVersion")
}