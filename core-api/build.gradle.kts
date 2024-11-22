plugins {
    id("spring")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":core-domain"))
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}
