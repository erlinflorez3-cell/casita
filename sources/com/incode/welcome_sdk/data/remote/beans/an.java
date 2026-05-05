package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class an {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9304c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9305d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9307b;

    private an(String str, String str2) {
        this.f9307b = str;
        this.f9306a = str2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9305d + 3;
        int i4 = i3 % 128;
        f9304c = i4;
        int i5 = i3 % 2;
        String str = this.f9306a;
        int i6 = i4 + 65;
        f9305d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseFinishOnboarding{redirectionUrl='").append(this.f9307b).append("', customerId='").append(this.f9306a).append("'}").toString();
        int i3 = f9305d + 41;
        f9304c = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static an d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        an anVar = new an(jSONObject.optString("redirectionUrl"), jSONObject.optString("customerId"));
        int i3 = f9305d + 1;
        f9304c = i3 % 128;
        int i4 = i3 % 2;
        return anVar;
    }
}
