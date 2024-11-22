import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

tasks.withType(KotlinCompile::class).all {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjvm-default=all")
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")
}
