package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class CoreErrorModelResponse {

    @SerializedName(alternate = {}, value = "\f\u0018\u0017\u0013\u0015n\u0006\u0013\u0012~\u0004\u0001")
    @InterfaceC1492Gx
    public String errorMessage;

    @SerializedName(alternate = {}, value = "\u000f\u001a\u0019\u0014g\u0014\u0013\u000f\u0011`\f\u007f\u007f")
    @InterfaceC1492Gx
    public Integer httpErrorCode;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u0019\t\u0015\u0010\u0002\fc\u0010\u000f\u000b\r\\\b{{")
    @InterfaceC1492Gx
    public Integer internalErrorCode;

    public class NullPointerException extends RuntimeException {
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Integer getHttpErrorCode() {
        return this.httpErrorCode;
    }

    public Integer getInternalErrorCode() {
        return this.internalErrorCode;
    }

    public void setErrorMessage(String str) {
        try {
            this.errorMessage = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setHttpErrorCode(Integer num) {
        try {
            this.httpErrorCode = num;
        } catch (NullPointerException unused) {
        }
    }

    public void setInternalErrorCode(Integer num) {
        try {
            this.internalErrorCode = num;
        } catch (NullPointerException unused) {
        }
    }
}
