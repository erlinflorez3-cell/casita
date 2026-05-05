package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class PayResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\b\u001b\u0019\f\u0012\u0014\n\u001a\u007f\u0012\u0006\u000b\tg\u000e\u0005xz\u0007")
    @InterfaceC1492Gx
    public String authorizationNumber;

    @SerializedName(alternate = {}, value = "\u001b\u0018\u0006\u0012\u0016\u0003\u0004\u0014\b\r\u000b_{\u000e}")
    @InterfaceC1492Gx
    public String transactionDate;

    public class Exception extends RuntimeException {
    }

    public String getAuthorizationNumber() {
        return this.authorizationNumber;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public void setAuthorizationNumber(String str) {
        try {
            this.authorizationNumber = str;
        } catch (Exception unused) {
        }
    }

    public void setTransactionDate(String str) {
        try {
            this.transactionDate = str;
        } catch (Exception unused) {
        }
    }
}
