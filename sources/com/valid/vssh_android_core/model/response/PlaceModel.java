package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class PlaceModel {

    @SerializedName(alternate = {}, value = "\u0010\n")
    @InterfaceC1492Gx
    public Integer id;

    @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
    @InterfaceC1492Gx
    public String name;

    public class IOException extends RuntimeException {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Integer num) {
        try {
            this.id = num;
        } catch (IOException unused) {
        }
    }

    public void setName(String str) {
        try {
            this.name = str;
        } catch (IOException unused) {
        }
    }
}
