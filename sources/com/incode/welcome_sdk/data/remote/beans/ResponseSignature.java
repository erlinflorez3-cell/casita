package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseSignature {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9170b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9171e = 0;
    private String mSignature;

    private ResponseSignature(String str) {
        this.mSignature = str;
    }

    public String getSignature() {
        int i2 = 2 % 2;
        int i3 = f9171e + 13;
        int i4 = i3 % 128;
        f9170b = i4;
        int i5 = i3 % 2;
        String str = this.mSignature;
        int i6 = i4 + 7;
        f9171e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static ResponseSignature parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        ResponseSignature responseSignature = new ResponseSignature(new JSONObject(responseBody.string()).optString("signature"));
        int i3 = f9171e + 67;
        f9170b = i3 % 128;
        int i4 = i3 % 2;
        return responseSignature;
    }
}
