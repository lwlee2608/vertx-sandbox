plugins {
    java
}

dependencies {
    annotationProcessor("io.vertx:vertx-codegen:${property("vertx.version")}:processor")
    annotationProcessor("io.vertx:vertx-service-proxy:${property("vertx.version")}")
    implementation("io.vertx:vertx-core:${property("vertx.version")}")
    implementation("io.vertx:vertx-codegen:${property("vertx.version")}")
//    implementation("io.vertx:vertx-codegen-protobuf:${property("vertx.version")}")

    implementation("org.slf4j:slf4j-api:1.7.25")
    compileOnly("org.projectlombok:lombok:${property("lombok.version")}")

    testImplementation(platform("org.junit:junit-bom:${property("junit-jupiter.version")}"))
    testImplementation("org.apache.logging.log4j:log4j-core:2.17.2")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.17.2")
}