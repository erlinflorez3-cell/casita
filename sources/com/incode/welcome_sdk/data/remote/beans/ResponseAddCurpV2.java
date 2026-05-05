package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseAddCurpV2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9121c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9122d = 1;
    private String curp;
    private Map<String, Object> data;
    private String error;
    private boolean valid;

    public ResponseAddCurpV2(boolean z2, String str, String str2, Map<String, Object> map) {
        this.valid = z2;
        this.error = str;
        this.curp = str2;
        this.data = map;
    }

    public boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f9122d + 59;
        f9121c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.valid;
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        return z2;
    }

    public String getError() {
        int i2 = 2 % 2;
        int i3 = f9121c;
        int i4 = i3 + 35;
        f9122d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.error;
        int i6 = i3 + 57;
        f9122d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getCurp() {
        int i2 = 2 % 2;
        int i3 = f9122d + 45;
        f9121c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.curp;
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        return str;
    }

    public Map<String, Object> getData() {
        int i2 = 2 % 2;
        int i3 = f9122d + 17;
        int i4 = i3 % 128;
        f9121c = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.data;
        int i5 = i4 + 123;
        f9122d = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static ResponseAddCurpV2 parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        ResponseAddCurpV2 responseAddCurpV2 = new ResponseAddCurpV2(jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS), jSONObject.optString("error"), jSONObject.optString("curp"), com.incode.welcome_sdk.commons.utils.u.c(jSONObject));
        int i3 = f9122d + 33;
        f9121c = i3 % 128;
        if (i3 % 2 == 0) {
            return responseAddCurpV2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
