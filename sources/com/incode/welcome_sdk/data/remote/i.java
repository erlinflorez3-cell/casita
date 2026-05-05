package com.incode.welcome_sdk.data.remote;

import com.dynatrace.android.agent.AdkSettings;
import com.incode.welcome_sdk.data.TemplateModel;
import com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin;
import com.incode.welcome_sdk.data.remote.beans.ResponseInitFaceAuth;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10189a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10190b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10191c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10192e = 0;

    private i() {
    }

    @JvmStatic
    public static final ResponseFaceLogin a(ResponseBody responseBody) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(responseBody, "");
        JSONObject jSONObject = new JSONObject(responseBody.string());
        Boolean boolValueOf = null;
        if (jSONObject.has("hasFaceMask")) {
            int i3 = f10191c + 111;
            f10190b = i3 % 128;
            if (i3 % 2 != 0) {
                Boolean.valueOf(jSONObject.getBoolean("hasFaceMask"));
                throw null;
            }
            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("hasFaceMask"));
        }
        String strOptString = jSONObject.optString("customerId");
        String strOptString2 = jSONObject.optString("token");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "");
        String strOptString3 = jSONObject.optString("interviewId");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "");
        String strOptString4 = jSONObject.optString("interviewToken");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "");
        String strOptString5 = jSONObject.optString("transactionId");
        Intrinsics.checkNotNullExpressionValue(strOptString5, "");
        return new ResponseFaceLogin(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, jSONObject.optBoolean("faceMatch"), jSONObject.optBoolean("spoofAttempt"), jSONObject.optBoolean("secondFactor"), boolValueOf);
    }

    @JvmStatic
    public static final ResponseInitFaceAuth b(ResponseBody responseBody) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(responseBody, "");
        JSONObject jSONObject = new JSONObject(responseBody.string());
        String strOptString = jSONObject.optString("token");
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        boolean zOptBoolean = jSONObject.optBoolean("enrolled", false);
        String strOptString2 = jSONObject.optString("name");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "");
        TemplateModel templateModel = new TemplateModel(AdkSettings.PLATFORM_TYPE_MOBILE, jSONObject.optString("template"));
        String strOptString3 = jSONObject.optString("uuid");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "");
        ResponseInitFaceAuth responseInitFaceAuth = new ResponseInitFaceAuth(strOptString, zOptBoolean, strOptString2, templateModel, strOptString3);
        int i3 = f10191c + 33;
        f10190b = i3 % 128;
        int i4 = i3 % 2;
        return responseInitFaceAuth;
    }

    @JvmStatic
    public static final Map<String, Object> d(ResponseBody responseBody) throws JSONException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(responseBody, "");
        JSONObject jSONObject = new JSONObject(responseBody.string()).getJSONObject("customFields");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        int i3 = f10190b + 43;
        f10191c = i3 % 128;
        int i4 = i3 % 2;
        while (!(!itKeys.hasNext())) {
            int i5 = f10190b + 15;
            f10191c = i5 % 128;
            int i6 = i5 % 2;
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            String string = jSONObject.getString(next);
            Intrinsics.checkNotNullExpressionValue(string, "");
            map.put(next, string);
        }
        return map;
    }

    static {
        new i();
        int i2 = f10192e + 57;
        f10189a = i2 % 128;
        int i3 = i2 % 2;
    }
}
