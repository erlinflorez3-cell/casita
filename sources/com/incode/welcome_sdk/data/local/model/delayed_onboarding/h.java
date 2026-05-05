package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8865a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8866e = 1;

    public static String e(Map<String, String> map) throws JSONException {
        int i2 = 2 % 2;
        if (map == null) {
            int i3 = f8866e + 37;
            int i4 = i3 % 128;
            f8865a = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 17;
            f8866e = i6 % 128;
            if (i6 % 2 != 0) {
                return "";
            }
            throw null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int i7 = f8866e + 23;
            f8865a = i7 % 128;
            int i8 = i7 % 2;
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                jSONObject.put(key, value);
            } else {
                jSONObject.put(key, "");
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
