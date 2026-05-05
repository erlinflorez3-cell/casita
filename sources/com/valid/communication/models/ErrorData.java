package com.valid.communication.models;

import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class ErrorData {

    @SerializedName(alternate = {"=KL\u001eC9;"}, value = "\n\u0015\t\t")
    @InterfaceC1492Gx
    private Integer code;

    @SerializedName(alternate = {"LRJ@"}, value = "\f\u0018\u0017\u0013\u0015u\u001a\u0010\u0004")
    @InterfaceC1492Gx
    private Integer errorType;

    @SerializedName(alternate = {"<>M>F>FKIPP", "<>M>F>F:IPP"}, value = "\u0014\u000b\u0018\u0017\u0004\t\u0006")
    @InterfaceC1492Gx
    private String message;

    @SerializedName(alternate = {}, value = "\u001a\u000b\u0017\u001a\f\u0005\u0006m\u007f\u000b\u0002")
    @InterfaceC1492Gx
    private String serviceName;
    private String title;

    public class NullPointerException extends RuntimeException {
    }

    public Integer getCode() {
        return this.code;
    }

    public Integer getErrorType() {
        return this.errorType;
    }

    public String getMessage() {
        return this.message;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCode(Integer num) {
        try {
            this.code = num;
        } catch (NullPointerException unused) {
        }
    }

    public void setErrorType(int i2) {
        try {
            this.errorType = Integer.valueOf(i2);
        } catch (NullPointerException unused) {
        }
    }

    public void setErrorType(Integer num) {
        try {
            this.errorType = num;
        } catch (NullPointerException unused) {
        }
    }

    public void setMessage(String str) {
        try {
            this.message = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setServiceName(String str) {
        try {
            this.serviceName = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setTitle(String str) {
        try {
            this.title = str;
        } catch (NullPointerException unused) {
        }
    }
}
