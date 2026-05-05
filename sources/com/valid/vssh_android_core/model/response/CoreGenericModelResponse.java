package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class CoreGenericModelResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\u0014\u000b\u0018\u0017\u0004\t\u0006")
    @InterfaceC1492Gx
    public String message;

    @SerializedName(alternate = {}, value = "\u001a\u000b\u0017\u001a\f\u0005\u0006m\u007f\u000b\u0002")
    @InterfaceC1492Gx
    public String serviceName;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0018\u0018\u0015c\u000f\u0003\u0003")
    @InterfaceC1492Gx
    public Integer statusCode;

    public class ParseException extends RuntimeException {
    }

    public String getMessage() {
        return this.message;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setMessage(String str) {
        try {
            this.message = str;
        } catch (ParseException unused) {
        }
    }

    public void setServiceName(String str) {
        try {
            this.serviceName = str;
        } catch (ParseException unused) {
        }
    }

    public void setStatusCode(Integer num) {
        try {
            this.statusCode = num;
        } catch (ParseException unused) {
        }
    }
}
