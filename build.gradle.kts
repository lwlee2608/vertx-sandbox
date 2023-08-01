plugins {
    java
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    dependencies {
        implementation(platform("io.vertx:vertx-stack-depchain:${property("vertx.version")}"))
        implementation("org.slf4j:slf4j-api:1.7.25")
        testImplementation("org.apache.logging.log4j:log4j-core:2.17.2")
        testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.17.2")
        compileOnly("org.projectlombok:lombok:${property("lombok.version")}")
        testImplementation(platform("org.junit:junit-bom:${property("junit-jupiter.version")}"))
    }
}