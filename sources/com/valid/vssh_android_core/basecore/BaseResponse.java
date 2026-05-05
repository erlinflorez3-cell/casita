package com.valid.vssh_android_core.basecore;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class BaseResponse {

    @SerializedName(alternate = {}, value = "\b\n\t\r\u0017\u000b\u0010\u000e\u007f\n`|\u000fz")
    @InterfaceC1492Gx
    public Map additionalData;

    @SerializedName(alternate = {}, value = "\u000f\u000b\u0006\b\b\u0014\u0014")
    @InterfaceC1492Gx
    public String headers;

    public class Exception extends RuntimeException {
    }

    public Map getAdditionalData() {
        return this.additionalData;
    }

    public String getHeaders() {
        return this.headers;
    }

    public void setAdditionalData(Map map) {
        try {
            this.additionalData = map;
        } catch (Exception unused) {
        }
    }

    public void setHeaders(String str) {
        try {
            this.headers = str;
        } catch (Exception unused) {
        }
    }
}
