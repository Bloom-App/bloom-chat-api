import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id ('org.jetbrains.kotlin.jvm') version '1.3.70'
}

group ('fr.albanguillet')
version ('1.0-SNAPSHOT')

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}