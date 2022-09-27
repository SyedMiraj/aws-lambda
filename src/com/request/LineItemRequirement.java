package com.request;

import com.common.Quantity;

import java.util.List;

public class LineItemRequirement {
    private String lineItemReqId;
    private String asin;
    private Quantity quantity;
    private PackingRecommendation packingRecommendation;
    private List<Substitution> substitutions;

    public String getLineItemReqId() {
        return lineItemReqId;
    }

    public void setLineItemReqId(String lineItemReqId) {
        this.lineItemReqId = lineItemReqId;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public PackingRecommendation getPackingRecommendation() {
        return packingRecommendation;
    }

    public void setPackingRecommendation(PackingRecommendation packingRecommendation) {
        this.packingRecommendation = packingRecommendation;
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(List<Substitution> substitutions) {
        this.substitutions = substitutions;
    }
}
