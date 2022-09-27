package com.response;

public class WorkResponseContext {
    private String siteId;
    private String workCellId;
    private String locationId;
    private String employeeId;
    private Integer sequenceId;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getWorkCellId() {
        return workCellId;
    }

    public void setWorkCellId(String workCellId) {
        this.workCellId = workCellId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }
}
