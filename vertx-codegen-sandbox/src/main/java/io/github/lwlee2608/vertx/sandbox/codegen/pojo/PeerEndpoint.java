package io.github.lwlee2608.vertx.sandbox.codegen.pojo;

import io.vertx.codegen.annotations.DataObject;
//import io.vertx.codegen.protobuf.annotations.ProtobufGen;
//import lombok.Data;

//@Data
@DataObject
//@ProtobufGen
public class PeerEndpoint {
    private Integer schemaVersion;
    private Integer extVersion;
    //private TransportType transportType;
    private String host;
    private Integer port;

    public Integer getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public Integer getExtVersion() {
        return extVersion;
    }

    public void setExtVersion(Integer extVersion) {
        this.extVersion = extVersion;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
