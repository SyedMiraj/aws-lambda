package com.response;

import java.util.List;
import java.util.Map;

public class ItemPickResponse {
    private Map<String, PackageInfo> packages;
    private Map<String, List<ItemUpdate>> lineItemResponses;
    private Enum status;

    public Map<String, PackageInfo> getPackages() {
        return packages;
    }

    public void setPackages(Map<String, PackageInfo> packages) {
        this.packages = packages;
    }

    public Map<String, List<ItemUpdate>> getLineItemResponses() {
        return lineItemResponses;
    }

    public void setLineItemResponses(Map<String, List<ItemUpdate>> lineItemResponses) {
        this.lineItemResponses = lineItemResponses;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }
}
