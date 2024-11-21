plugins {
    id("spring")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    runtimeOnly(project(":core-persistence"))
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.2.1")
    implementation("org.springframework:spring-context:6.1.15")
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}

tasks.register<Test>("domain-test") {
    println("domain-test running")
    println("domain-test running")
    println("domain-test running")
    println("domain-test running")
}