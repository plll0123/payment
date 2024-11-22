plugins {
    id("spring")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    runtimeOnly(project(":core-persistence"))

    implementation("org.springframework.boot:spring-boot-starter")}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
