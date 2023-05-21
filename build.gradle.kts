plugins {
    java
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.graalvm.buildtools.native") version "0.9.20"
}

group = "com.kjipo"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_20

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.drools:drools-core:8.38.0.Final")
    implementation("org.drools:drools-decisiontables:8.38.0.Final")
    implementation("org.drools:drools-compiler:8.38.0.Final")
    implementation("org.drools:drools-mvel:8.38.0.Final")

    implementation("org.kie:kie-ci:7.73.0.Final")
    implementation("org.kie:kie-spring:7.73.0.Final")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
