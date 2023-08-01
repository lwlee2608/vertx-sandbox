plugins {
    java
}

dependencies {
    annotationProcessor("io.vertx:vertx-codegen:${property("vertx.version")}:processor")
    implementation("io.vertx:vertx-core:${property("vertx.version")}")
    implementation("io.vertx:vertx-codegen-protobuf:${property("vertx.version")}")
}