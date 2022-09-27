package com.response;

public class StorageLocation {
    private String containerId;
    private String subContainerId;
    private Enum temperatureZone;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getSubContainerId() {
        return subContainerId;
    }

    public void setSubContainerId(String subContainerId) {
        this.subContainerId = subContainerId;
    }

    public Enum getTemperatureZone() {
        return temperatureZone;
    }

    public void setTemperatureZone(Enum temperatureZone) {
        this.temperatureZone = temperatureZone;
    }
}
