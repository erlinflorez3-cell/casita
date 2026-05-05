package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import android.os.Process;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8875a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8876c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f8877d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f8878e = 0;

    public static Map<String, Boolean> d(String str) {
        int i2 = 2 % 2;
        int i3 = f8876c + 13;
        f8875a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            boolean z2 = false;
            if (next.length() > 0) {
                int i4 = f8875a + 47;
                f8876c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 88 / 0;
                    z2 = Boolean.parseBoolean(jSONObject.getString(next));
                } else {
                    z2 = Boolean.parseBoolean(jSONObject.getString(next));
                }
            }
            linkedHashMap.put(next, Boolean.valueOf(z2));
        }
        return linkedHashMap;
    }

    public static String a(Map<String, Boolean> map) throws JSONException {
        int i2 = 2 % 2;
        if (map == null) {
            int i3 = f8875a + 11;
            f8876c = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        int i5 = f8876c + 15;
        f8875a = i5 % 128;
        while (true) {
            int i6 = i5 % 2;
            if (!it.hasNext()) {
                return jSONObject.toString();
            }
            int i7 = f8876c + 101;
            f8875a = i7 % 128;
            int i8 = i7 % 2;
            Map.Entry<String, Boolean> next = it.next();
            jSONObject.put(next.getKey(), next.getValue().booleanValue());
            i5 = f8875a + 33;
            f8876c = i5 % 128;
        }
    }

    public static int d() {
        int i2 = f8878e;
        int i3 = i2 % 6119447;
        f8878e = i2 + 1;
        if (i3 != 0) {
            return f8877d;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        f8877d = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
