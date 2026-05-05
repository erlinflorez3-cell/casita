package com.incode.welcome_sdk.data.remote.beans;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9497a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9498d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9500c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9501e;

    private bk(String str, String str2, String str3) {
        this.f9500c = str;
        this.f9499b = str2;
        this.f9501e = str3;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9498d + 125;
        int i4 = i3 % 128;
        f9497a = i4;
        int i5 = i3 % 2;
        String str = this.f9499b;
        int i6 = i4 + 107;
        f9498d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9497a + 87;
        f9498d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9501e;
        }
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9497a;
        int i4 = i3 + 57;
        f9498d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9500c;
        int i6 = i3 + 31;
        f9498d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bk e(JSONObject jSONObject) {
        int i2 = 2 % 2;
        bk bkVar = new bk(jSONObject.optString("id"), jSONObject.optString("question"), jSONObject.optString("answer"));
        int i3 = f9497a + 1;
        f9498d = i3 % 128;
        int i4 = i3 % 2;
        return bkVar;
    }
}
