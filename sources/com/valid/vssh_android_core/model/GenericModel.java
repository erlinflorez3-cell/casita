package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class GenericModel extends BaseModel {
    public Boolean addSessionIdToRequest;
    public String endPoint;
    public Integer method;
    public Map<String, Object> requestBody;
    public Boolean responseEncrypted;
    public Boolean secureRequest;
    public Boolean sslPinning;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public GenericModel() {
        Boolean bool = Boolean.TRUE;
        this.sslPinning = bool;
        this.responseEncrypted = bool;
        this.secureRequest = Boolean.FALSE;
        this.addSessionIdToRequest = Boolean.TRUE;
    }

    public Boolean getAddSessionIdToRequest() {
        return this.addSessionIdToRequest;
    }

    public String getEndPoint() {
        return this.endPoint;
    }

    public Integer getMethod() {
        return this.method;
    }

    public Map<String, Object> getRequestBody() {
        return this.requestBody;
    }

    public Boolean getResponseEncrypted() {
        return this.responseEncrypted;
    }

    public Boolean getSecureRequest() {
        return this.secureRequest;
    }

    public Boolean getSslPinning() {
        return this.sslPinning;
    }

    public void setAddSessionIdToRequest(Boolean bool) {
        try {
            this.addSessionIdToRequest = bool;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setEndPoint(String str) {
        try {
            this.endPoint = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setMethod(Integer num) {
        try {
            this.method = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setRequestBody(Map<String, Object> map) {
        try {
            this.requestBody = map;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setResponseEncrypted(Boolean bool) {
        try {
            this.responseEncrypted = bool;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setSecureRequest(Boolean bool) {
        try {
            this.secureRequest = bool;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setSslPinning(Boolean bool) {
        try {
            this.sslPinning = bool;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
