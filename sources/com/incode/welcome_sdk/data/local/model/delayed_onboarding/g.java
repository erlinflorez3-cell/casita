package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8863d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8864e = 1;

    public static Map<String, Float> b(String str) throws JSONException {
        float f2;
        int i2 = 2 % 2;
        int i3 = f8863d + 19;
        int i4 = i3 % 128;
        f8864e = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (str == null) {
            int i6 = i4 + 113;
            f8863d = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i8 = f8863d + 31;
            f8864e = i8 % 128;
            if (i8 % 2 == 0) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next);
                next.length();
                obj.hashCode();
                throw null;
            }
            String next2 = itKeys.next();
            Intrinsics.checkNotNull(next2);
            if (next2.length() > 0) {
                int i9 = f8864e + 89;
                f8863d = i9 % 128;
                int i10 = i9 % 2;
                String string = jSONObject.getString(next2);
                Intrinsics.checkNotNullExpressionValue(string, "");
                f2 = Float.parseFloat(string);
            } else {
                f2 = 0.0f;
            }
            linkedHashMap.put(next2, Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    public static String b(Map<String, Float> map) throws JSONException {
        int i2 = 2 % 2;
        if (map == null) {
            int i3 = f8863d + 75;
            f8864e = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            int i4 = f8863d + 69;
            f8864e = i4 % 128;
            int i5 = i4 % 2;
            String key = entry.getKey();
            Float value = entry.getValue();
            if (value != null) {
                int i6 = f8863d + 53;
                f8864e = i6 % 128;
                if (i6 % 2 == 0) {
                    jSONObject.put(key, value);
                    int i7 = 40 / 0;
                } else {
                    jSONObject.put(key, value);
                }
            } else {
                jSONObject.put(key, "");
            }
        }
        return jSONObject.toString();
    }
}
