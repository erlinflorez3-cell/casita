package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class DocumentType {

    @SerializedName(alternate = {}, value = "\u0010\n")
    @InterfaceC1492Gx
    public String id;

    @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
    @InterfaceC1492Gx
    public String name;

    public class NullPointerException extends RuntimeException {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        try {
            this.id = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setName(String str) {
        try {
            this.name = str;
        } catch (NullPointerException unused) {
        }
    }
}
