package com.incode.welcome_sdk.data.local;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ f[] f8580a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8582c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8583d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8585f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8586i = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f8581b = new f("SUCCESS", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f8584e = new f("ERROR", 1);

    private f(String str, int i2) {
    }

    static {
        f[] fVarArrA = a();
        f8580a = fVarArrA;
        EnumEntriesKt.enumEntries(fVarArrA);
        int i2 = f8586i + 117;
        f8585f = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ f[] a() {
        int i2 = 2 % 2;
        int i3 = f8583d;
        int i4 = i3 + 49;
        f8582c = i4 % 128;
        int i5 = i4 % 2;
        f[] fVarArr = {f8581b, f8584e};
        int i6 = i3 + 33;
        f8582c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
        return fVarArr;
    }

    public static f valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f8583d + 59;
        f8582c = i3 % 128;
        int i4 = i3 % 2;
        f fVar = (f) Enum.valueOf(f.class, str);
        int i5 = f8582c + 61;
        f8583d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return fVar;
    }

    public static f[] values() {
        int i2 = 2 % 2;
        int i3 = f8582c + 43;
        f8583d = i3 % 128;
        int i4 = i3 % 2;
        f[] fVarArr = f8580a;
        if (i4 != 0) {
            return (f[]) fVarArr.clone();
        }
        f[] fVarArr2 = (f[]) fVarArr.clone();
        int i5 = 48 / 0;
        return fVarArr2;
    }
}
