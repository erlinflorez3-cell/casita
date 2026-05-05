package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class GenericBridgeResponse {
    public Integer errCode;
    public String message;
    public Map<String, String[]> response;

    @SerializedName(alternate = {}, value = "\u001a\u000b\u0017\u001a\f\u0005\u0006m\u007f\u000b\u0002")
    @InterfaceC1492Gx
    public String serviceName;
    public Integer statusCode;

    public class Exception extends RuntimeException {
    }

    public Integer getErrCode() {
        return this.errCode;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, String[]> getResponse() {
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
        } catch (Exception unused) {
        }
    }

    public void setMessage(String str) {
        try {
            this.message = str;
        } catch (Exception unused) {
        }
    }

    public void setResponse(Map<String, String[]> map) {
        try {
            this.response = map;
        } catch (Exception unused) {
        }
    }

    public void setServiceName(String str) {
        try {
            this.serviceName = str;
        } catch (Exception unused) {
        }
    }

    public void setStatusCode(Integer num) {
        try {
            this.statusCode = num;
        } catch (Exception unused) {
        }
    }
}
