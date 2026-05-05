package com.valid.communication.models;

import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class ChainModel {

    @SerializedName(alternate = {";A;DB"}, value = "\n\u000e\u0006\r\u0011d\u0010\u000e\u0013\u0003\u000b\u0010")
    @InterfaceC1492Gx
    private String chainContent;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public String getChainContent() {
        return this.chainContent;
    }

    public void setChainContent(String str) {
        try {
            this.chainContent = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
