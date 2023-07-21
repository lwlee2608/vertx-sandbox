package io.github.lwlee2608.vertx.sandbox.codegen.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.ProtobufGen;
import lombok.Data;

@Data
@DataObject
//@DataObject(generateConverter = true)
@ProtobufGen
public class PeerEndpoint {
    private Integer schemaVersion;
    private Integer extVersion;
    //private TransportType transportType;
    private String host;
    private Integer port;
}
