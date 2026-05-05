package com.valid.vssh_android_core.basecore;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BaseModel {
    public Map<String, Object> additionalData;
    public String api;
    public Map<String, String> headers;
    public Map<String, Object> principalData;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }

    public String getApi() {
        return this.api;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, Object> getPrincipalData() {
        return this.principalData;
    }

    public void setAdditionalData(Map<String, Object> map) {
        try {
            this.additionalData = map;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setApi(String str) {
        try {
            this.api = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setHeaders(Map<String, String> map) {
        try {
            this.headers = map;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setPrincipalData(Map<String, Object> map) {
        try {
            this.principalData = map;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
