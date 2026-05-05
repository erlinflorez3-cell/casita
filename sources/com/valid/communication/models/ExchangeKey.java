package com.valid.communication.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class ExchangeKey {

    @SerializedName(alternate = {}, value = "\n\u000e\u0006\r\u0011\u0015")
    @InterfaceC1492Gx
    private List<ChainModel> chains;

    @SerializedName(alternate = {}, value = "\u0012\u000b\u001e")
    @InterfaceC1492Gx
    private String key;

    @SerializedName(alternate = {}, value = "\u0016\u001a\u0015r\u0011b\u0011\u0010k~\u0015o\u0004\u0007}")
    @InterfaceC1492Gx
    private String otpOnAppMaxTime;

    @SerializedName(alternate = {}, value = "\u001a\u000b\u0018\u0017\f\u0011\u000fh\u0003")
    @InterfaceC1492Gx
    private String sessionId;

    @SerializedName(alternate = {"KBHB"}, value = "\u001a\u000f\f\u0012")
    @InterfaceC1492Gx
    private String sign;

    @SerializedName(alternate = {}, value = "\u001c\u0014\u000e\u0015\u0018\u0007i\u0004q\u0007\u0004\n\u007f}")
    @InterfaceC1492Gx
    private String uniqueIdSigned;

    public class ParseException extends RuntimeException {
    }

    public List<ChainModel> getChains() {
        return this.chains;
    }

    public String getKey() {
        return this.key;
    }

    public String getOtpOnAppMaxTime() {
        return this.otpOnAppMaxTime;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSign() {
        return this.sign;
    }

    public String getUniqueIdSigned() {
        return this.uniqueIdSigned;
    }

    public void setChains(List<ChainModel> list) {
        try {
            this.chains = list;
        } catch (ParseException unused) {
        }
    }

    public void setKey(String str) {
        try {
            this.key = str;
        } catch (ParseException unused) {
        }
    }

    public void setOtpOnAppMaxTime(String str) {
        try {
            this.otpOnAppMaxTime = str;
        } catch (ParseException unused) {
        }
    }

    public void setSessionId(String str) {
        try {
            this.sessionId = str;
        } catch (ParseException unused) {
        }
    }

    public void setSign(String str) {
        try {
            this.sign = str;
        } catch (ParseException unused) {
        }
    }

    public void setUniqueIdSigned(String str) {
        try {
            this.uniqueIdSigned = str;
        } catch (ParseException unused) {
        }
    }

    public String toString() {
        try {
            return new Gson().toJson(this);
        } catch (ParseException unused) {
            return null;
        }
    }
}
