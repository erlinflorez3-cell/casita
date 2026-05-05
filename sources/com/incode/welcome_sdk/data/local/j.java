package com.incode.welcome_sdk.data.local;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8601a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ j[] f8604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8605f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8606g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8607h = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f8603d = new j("MALE", 0, "M");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f8602b = new j("FEMALE", 1, "F");

    private j(String str, int i2, String str2) {
        this.f8608c = str2;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f8607h + 87;
        int i4 = i3 % 128;
        f8601a = i4;
        int i5 = i3 % 2;
        String str = this.f8608c;
        int i6 = i4 + 89;
        f8607h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        j[] jVarArrA = a();
        f8604e = jVarArrA;
        EnumEntriesKt.enumEntries(jVarArrA);
        int i2 = f8606g + 51;
        f8605f = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ j[] a() {
        int i2 = 2 % 2;
        int i3 = f8607h;
        int i4 = i3 + 101;
        f8601a = i4 % 128;
        int i5 = i4 % 2;
        j[] jVarArr = {f8603d, f8602b};
        int i6 = i3 + 13;
        f8601a = i6 % 128;
        if (i6 % 2 == 0) {
            return jVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static j valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f8601a + 87;
        f8607h = i3 % 128;
        int i4 = i3 % 2;
        j jVar = (j) Enum.valueOf(j.class, str);
        int i5 = f8601a + 85;
        f8607h = i5 % 128;
        int i6 = i5 % 2;
        return jVar;
    }

    public static j[] values() {
        int i2 = 2 % 2;
        int i3 = f8607h + 47;
        f8601a = i3 % 128;
        int i4 = i3 % 2;
        j[] jVarArr = (j[]) f8604e.clone();
        int i5 = f8601a + 95;
        f8607h = i5 % 128;
        int i6 = i5 % 2;
        return jVarArr;
    }
}
