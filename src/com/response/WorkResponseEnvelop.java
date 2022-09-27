package com.response;

import java.time.Instant;

public class WorkResponseEnvelop<T> {
    private String workResponseUUID;
    private String responseTo;
    private Instant timestamp;
    private Enum responseType;
    private WorkResponseContext context;
    private T Message;

    public String responseTo(String workRequestUUID){
        return null;
    }

    public String getWorkResponseUUID() {
        return workResponseUUID;
    }

    public void setWorkResponseUUID(String workResponseUUID) {
        this.workResponseUUID = workResponseUUID;
    }

    public String getResponseTo() {
        return responseTo;
    }

    public void setResponseTo(String responseTo) {
        this.responseTo = responseTo;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Enum getResponseType() {
        return responseType;
    }

    public void setResponseType(Enum responseType) {
        this.responseType = responseType;
    }

    public WorkResponseContext getContext() {
        return context;
    }

    public void setContext(WorkResponseContext context) {
        this.context = context;
    }

    public T getMessage() {
        return Message;
    }

    public void setMessage(T message) {
        Message = message;
    }
}
