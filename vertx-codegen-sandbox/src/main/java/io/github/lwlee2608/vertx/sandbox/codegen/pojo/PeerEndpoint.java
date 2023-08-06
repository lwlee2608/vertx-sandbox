package io.github.lwlee2608.vertx.sandbox.codegen.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.protobuf.annotations.ProtobufGen;
import lombok.Data;

@Data
@DataObject
@ProtobufGen
public class PeerEndpoint {
    private Integer schemaVersion;
    private Integer extVersion;
    //private TransportType transportType;
    private String host;
    private Integer port;
}
