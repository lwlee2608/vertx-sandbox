plugins {
    java
}

dependencies {
    annotationProcessor("io.vertx:vertx-codegen-processor:${property("vertx.version")}:processor")
    annotationProcessor("io.vertx:vertx-codegen-protobuf:${property("vertx.version")}")
    implementation("io.vertx:vertx-core:${property("vertx.version")}")
    implementation("io.vertx:vertx-codegen-protobuf:${property("vertx.version")}")
    compileOnly("org.projectlombok:lombok:${property("lombok.version")}")
}