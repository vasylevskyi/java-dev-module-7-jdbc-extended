plugins {
    id("java")
}

group = "ua.goit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:2.2.224")

    // https://mvnrepository.com/artifact/com.opencsv/opencsv
    implementation("com.opencsv:opencsv:5.9")

    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.30")
}

tasks.test {
    useJUnitPlatform()
}