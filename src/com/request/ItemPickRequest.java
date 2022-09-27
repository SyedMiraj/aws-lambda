package com.request;

import java.util.List;

public class ItemPickRequest {
    private List<LineItemRequirement> lineItemRequirements;
    private Enum status;

    public List<LineItemRequirement> getLineItemRequirements() {
        return lineItemRequirements;
    }

    public void setLineItemRequirements(List<LineItemRequirement> lineItemRequirements) {
        this.lineItemRequirements = lineItemRequirements;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }
}
