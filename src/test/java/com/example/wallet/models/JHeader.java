package com.example.wallet.models;

public class JHeader {
    private String ip;
    private String version;
    private String channel;
    private String requestType;
    private String imeiNo;
    private String serialNo;
    private String deviceType;
    private String osType;
    private String macAddress;
    private String userId;

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getRequestType() { return requestType; }
    public void setRequestType(String requestType) { this.requestType = requestType; }

    public String getImeiNo() { return imeiNo; }
    public void setImeiNo(String imeiNo) { this.imeiNo = imeiNo; }

    public String getSerialNo() { return serialNo; }
    public void setSerialNo(String serialNo) { this.serialNo = serialNo; }

    public String getDeviceType() { return deviceType; }
    public void setDeviceType(String deviceType) { this.deviceType = deviceType; }

    public String getOsType() { return osType; }
    public void setOsType(String osType) { this.osType = osType; }

    public String getMacAddress() { return macAddress; }
    public void setMacAddress(String macAddress) { this.macAddress = macAddress; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
