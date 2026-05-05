package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f9190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9191d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9193h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9194i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9195j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f9188a = new a("SECURE", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f9192e = new a("MEDIUM", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f9189b = new a("CONVERSION", 2);

    private a(String str, int i2) {
    }

    static {
        a[] aVarArrE = e();
        f9190c = aVarArrE;
        EnumEntriesKt.enumEntries(aVarArrE);
        int i2 = f9193h + 15;
        f9194i = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ a[] e() {
        int i2 = 2 % 2;
        int i3 = f9195j + 113;
        f9191d = i3 % 128;
        if (i3 % 2 == 0) {
            return new a[]{f9188a, f9192e, f9189b};
        }
        a[] aVarArr = new a[3];
        aVarArr[1] = f9188a;
        aVarArr[0] = f9192e;
        aVarArr[3] = f9189b;
        return aVarArr;
    }

    public static a valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9191d + 35;
        f9195j = i3 % 128;
        int i4 = i3 % 2;
        a aVar = (a) Enum.valueOf(a.class, str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f9195j + 125;
        f9191d = i5 % 128;
        int i6 = i5 % 2;
        return aVar;
    }

    public static a[] values() {
        int i2 = 2 % 2;
        int i3 = f9195j + 85;
        f9191d = i3 % 128;
        int i4 = i3 % 2;
        a[] aVarArr = (a[]) f9190c.clone();
        int i5 = f9195j + 73;
        f9191d = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarArr;
        }
        throw null;
    }
}
