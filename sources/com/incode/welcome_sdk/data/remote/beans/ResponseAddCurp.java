package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseAddCurp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9119a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9120b = 0;
    private String curp;
    private Map<String, Object> data;
    private String error;
    private boolean valid;

    public ResponseAddCurp(boolean z2, String str, String str2, Map<String, Object> map) {
        this.valid = z2;
        this.error = str;
        this.curp = str2;
        this.data = map;
    }

    public boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f9119a;
        int i4 = i3 + 111;
        f9120b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.valid;
        int i6 = i3 + 83;
        f9120b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
        return z2;
    }

    public String getError() {
        int i2 = 2 % 2;
        int i3 = f9119a + 15;
        f9120b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.error;
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return str;
    }

    public String getCurp() {
        int i2 = 2 % 2;
        int i3 = f9120b + 41;
        int i4 = i3 % 128;
        f9119a = i4;
        int i5 = i3 % 2;
        String str = this.curp;
        int i6 = i4 + 83;
        f9120b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public Map<String, Object> getData() {
        int i2 = 2 % 2;
        int i3 = f9120b + 57;
        int i4 = i3 % 128;
        f9119a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.data;
        int i5 = i4 + 109;
        f9120b = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    public static ResponseAddCurp parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        ResponseAddCurp responseAddCurp = new ResponseAddCurp(jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS), jSONObject.optString("error"), jSONObject.optString("curp"), com.incode.welcome_sdk.commons.utils.u.c(jSONObject));
        int i3 = f9120b + 111;
        f9119a = i3 % 128;
        int i4 = i3 % 2;
        return responseAddCurp;
    }
}
