package edu.neu.khoury.cs5004.problem3;

import java.util.Objects;

public class DEMapData {
  private String ipAddress;
  private String protocolTypeFlag;
  private Boolean scanTypeFlag;
  private Integer port;
  private String outputFlag;

  public DEMapData(String ipAddress, String protocolTypeFlag, Integer port, String outputFlag) {
    this.ipAddress = ipAddress;
    this.protocolTypeFlag = protocolTypeFlag;
    this.port = port;
    this.outputFlag = outputFlag;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public String getProtocolTypeFlag() {
    return protocolTypeFlag;
  }

  public Boolean getScanTypeFlag() {
    return scanTypeFlag;
  }

  public Integer getPort() {
    return port;
  }

  public String getOutputFlag() {
    return outputFlag;
  }

  @Override
  public String toString() {
    return "DEMapData{" +
        "ipAddress='" + ipAddress + '\'' +
        ", protocolTypeFlag='" + protocolTypeFlag + '\'' +
        ", scanTypeFlag=" + scanTypeFlag +
        ", port=" + port +
        ", outputFlag='" + outputFlag + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DEMapData)) return false;
    DEMapData deMapData = (DEMapData) o;
    return getIpAddress().equals(deMapData.getIpAddress()) &&
        getProtocolTypeFlag().equals(deMapData.getProtocolTypeFlag()) &&
        Objects.equals(getScanTypeFlag(), deMapData.getScanTypeFlag()) &&
        getPort().equals(deMapData.getPort()) &&
        getOutputFlag().equals(deMapData.getOutputFlag());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIpAddress(), getProtocolTypeFlag(), getScanTypeFlag(), getPort(), getOutputFlag());
  }
}
