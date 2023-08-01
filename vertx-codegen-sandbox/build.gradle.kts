plugins {
    java
}

dependencies {
    annotationProcessor("io.vertx:vertx-codegen:${property("vertx.version")}:processor")
    annotationProcessor("io.vertx:vertx-service-proxy:${property("vertx.version")}")
    implementation("io.vertx:vertx-core:${property("vertx.version")}")
    implementation("io.vertx:vertx-codegen:${property("vertx.version")}")
}