package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class ParametersModelResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\n\u000e\u0006\u0012\u0011\u0007\r")
    @InterfaceC1492Gx
    public String channel;

    @SerializedName(alternate = {}, value = "\n\u0015\u0012\u0014\u0012\u0010\u0006\u000e\u0013f\u0001")
    @InterfaceC1492Gx
    public String componentId;

    @SerializedName(alternate = {}, value = "\u000f\u0007\u0018\fe\u0011\u0005\u0005")
    @InterfaceC1492Gx
    public String hashCode;

    @SerializedName(alternate = {}, value = "\u0010\n")
    @InterfaceC1492Gx
    public int id;

    @SerializedName(alternate = {}, value = "\u0017\u0007\u0017\u0005\u0010\u0007\u0015\u0005\u0011\u0011")
    @InterfaceC1492Gx
    public String parameters;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public String getChannel() {
        return this.channel;
    }

    public String getComponentId() {
        return this.componentId;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public int getId() {
        return this.id;
    }

    public String getParameters() {
        return this.parameters;
    }
}
