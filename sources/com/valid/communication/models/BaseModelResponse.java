package com.valid.communication.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class BaseModelResponse<T> {
    private Integer errCode;
    private String message;
    private T response;

    @SerializedName(alternate = {}, value = "\u001a\u000b\u0017\u001a\f\u0005\u0006m\u007f\u000b\u0002")
    @InterfaceC1492Gx
    private String serviceName;
    private Integer statusCode;

    public class IOException extends RuntimeException {
    }

    public Integer getErrCode() {
        return this.errCode;
    }

    public String getMessage() {
        return this.message;
    }

    public T getResponse() {
        return this.response;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setErrCode(Integer num) {
        try {
            this.errCode = num;
        } catch (IOException unused) {
        }
    }

    public void setMessage(String str) {
        try {
            this.message = str;
        } catch (IOException unused) {
        }
    }

    public void setResponse(T t2) {
        try {
            this.response = t2;
        } catch (IOException unused) {
        }
    }

    public void setServiceName(String str) {
        try {
            this.serviceName = str;
        } catch (IOException unused) {
        }
    }

    public void setStatusCode(Integer num) {
        try {
            this.statusCode = num;
        } catch (IOException unused) {
        }
    }

    public String toString() {
        try {
            return new Gson().toJson(this);
        } catch (IOException unused) {
            return null;
        }
    }
}
