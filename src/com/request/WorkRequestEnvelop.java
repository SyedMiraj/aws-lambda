package com.request;

import java.time.Instant;

public class WorkRequestEnvelop<T> {
    private String workRequestUUID;
    private Instant earlierStartDate;
    private Instant lastEndDate;
    private Instant timestamp;
    private Enum requestType;
    private WorkRequestContext context;
    private T message;

    public String getWorkRequestUUID() {
        return workRequestUUID;
    }

    public void setWorkRequestUUID(String workRequestUUID) {
        this.workRequestUUID = workRequestUUID;
    }

    public Instant getEarlierStartDate() {
        return earlierStartDate;
    }

    public void setEarlierStartDate(Instant earlierStartDate) {
        this.earlierStartDate = earlierStartDate;
    }

    public Instant getLastEndDate() {
        return lastEndDate;
    }

    public void setLastEndDate(Instant lastEndDate) {
        this.lastEndDate = lastEndDate;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Enum getRequestType() {
        return requestType;
    }

    public void setRequestType(Enum requestType) {
        this.requestType = requestType;
    }

    public WorkRequestContext getContext() {
        return context;
    }

    public void setContext(WorkRequestContext context) {
        this.context = context;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
