package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class ClientHelloModelResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\b\u0012\u0011\u0013\u001am\u0010\u0007\b\fk\no\by\u000b\n~{\u0002wuTt\u0005vop")
    @InterfaceC1492Gx
    public Boolean allowLoginOnUnassignedDevice;

    @SerializedName(alternate = {}, value = "\u000b\u000b\u001b\r\u0006\u0007a\u0013\u0012\u0007\u0004\n\u007f}")
    @InterfaceC1492Gx
    public Boolean deviceAssigned;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016g\u001a\n\u0013\u0013\u0011")
    @InterfaceC1492Gx
    public Boolean userExists;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016j\u0003\u0014a\b\r\n\u0001\u000f\f\u0012")
    @InterfaceC1492Gx
    public Boolean userHasBiometry;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016u\u0016\u0002\u0014\u0004")
    @InterfaceC1492Gx
    public int userState;

    public class ParseException extends RuntimeException {
    }

    public Boolean getAllowLoginOnUnassignedDevice() {
        return this.allowLoginOnUnassignedDevice;
    }

    public Boolean getDeviceAssigned() {
        return this.deviceAssigned;
    }

    public Boolean getUserExists() {
        return this.userExists;
    }

    public Boolean getUserHasBiometry() {
        return this.userHasBiometry;
    }

    public int getUserState() {
        return this.userState;
    }

    public void setAllowLoginOnUnassignedDevice(Boolean bool) {
        try {
            this.allowLoginOnUnassignedDevice = bool;
        } catch (ParseException unused) {
        }
    }

    public void setDeviceAssigned(Boolean bool) {
        try {
            this.deviceAssigned = bool;
        } catch (ParseException unused) {
        }
    }

    public void setUserExists(Boolean bool) {
        try {
            this.userExists = bool;
        } catch (ParseException unused) {
        }
    }

    public void setUserHasBiometry(Boolean bool) {
        try {
            this.userHasBiometry = bool;
        } catch (ParseException unused) {
        }
    }

    public void setUserState(int i2) {
        try {
            this.userState = i2;
        } catch (ParseException unused) {
        }
    }
}
