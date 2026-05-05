package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseMedicalDoc implements IResponseDocumentScan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9155c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9156e = 1;
    private String copayEr;
    private String copayOv;
    private String member;
    private String memberId;
    private String provider;
    private String rawData;
    private String rxBin;
    private String rxPcn;

    public ResponseMedicalDoc() {
    }

    public ResponseMedicalDoc(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.rawData = str;
        this.member = str2;
        this.memberId = str3;
        this.provider = str4;
        this.copayEr = str5;
        this.copayOv = str6;
        this.rxBin = str7;
        this.rxPcn = str8;
    }

    public String getRawData() {
        int i2 = 2 % 2;
        int i3 = f9155c + 9;
        int i4 = i3 % 128;
        f9156e = i4;
        int i5 = i3 % 2;
        String str = this.rawData;
        int i6 = i4 + 113;
        f9155c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getMember() {
        int i2 = 2 % 2;
        int i3 = f9155c + 81;
        int i4 = i3 % 128;
        f9156e = i4;
        int i5 = i3 % 2;
        String str = this.member;
        int i6 = i4 + 51;
        f9155c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getMemberId() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9155c;
        int i4 = i3 + 71;
        f9156e = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.memberId;
            int i5 = 83 / 0;
        } else {
            str = this.memberId;
        }
        int i6 = i3 + 1;
        f9156e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getProvider() {
        int i2 = 2 % 2;
        int i3 = f9155c;
        int i4 = i3 + 15;
        f9156e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.provider;
        int i5 = i3 + 57;
        f9156e = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getCopayEr() {
        int i2 = 2 % 2;
        int i3 = f9155c;
        int i4 = i3 + 117;
        f9156e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.copayEr;
        int i6 = i3 + 93;
        f9156e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getCopayOv() {
        int i2 = 2 % 2;
        int i3 = f9155c + 25;
        int i4 = i3 % 128;
        f9156e = i4;
        int i5 = i3 % 2;
        String str = this.copayOv;
        int i6 = i4 + 85;
        f9155c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getRxBin() {
        int i2 = 2 % 2;
        int i3 = f9155c + 57;
        f9156e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.rxBin;
        }
        throw null;
    }

    public String getRxPcn() {
        int i2 = 2 % 2;
        int i3 = f9155c + 89;
        int i4 = i3 % 128;
        f9156e = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.rxPcn;
        int i5 = i4 + 7;
        f9155c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseMedicalDoc{rawData='").append(this.rawData).append("', member='").append(this.member).append("', memberId='").append(this.memberId).append("', provider='").append(this.provider).append("', copayEr='").append(this.copayEr).append("', copayOv='").append(this.copayOv).append("', rxBin='").append(this.rxBin).append("', rxPcn='").append(this.rxPcn).append("'}").toString();
        int i3 = f9155c + 1;
        f9156e = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResponseMedicalDoc parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        String strString = responseBody.string();
        JSONObject jSONObject = new JSONObject(strString);
        ResponseMedicalDoc responseMedicalDoc = new ResponseMedicalDoc(strString, jSONObject.optString("member"), jSONObject.optString("memberId"), jSONObject.optString("provider"), jSONObject.optString("copayEr"), jSONObject.optString("copayOv"), jSONObject.optString("rxBin"), jSONObject.optString("rxPcn"));
        int i3 = f9155c + 77;
        f9156e = i3 % 128;
        int i4 = i3 % 2;
        return responseMedicalDoc;
    }
}
