package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9718a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ m[] f9719b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9722e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9723f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9724h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static m f9721d = new m("FIRST_ID", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f9720c = new m("SECOND_ID", 1);

    private m(String str, int i2) {
    }

    static {
        m[] mVarArrC = c();
        f9719b = mVarArrC;
        EnumEntriesKt.enumEntries(mVarArrC);
        int i2 = f9723f + 87;
        f9724h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ m[] c() {
        m[] mVarArr;
        int i2 = 2 % 2;
        int i3 = f9718a;
        int i4 = i3 + 69;
        f9722e = i4 % 128;
        if (i4 % 2 == 0) {
            mVarArr = new m[4];
            mVarArr[0] = f9721d;
            mVarArr[0] = f9720c;
        } else {
            mVarArr = new m[]{f9721d, f9720c};
        }
        int i5 = i3 + 85;
        f9722e = i5 % 128;
        int i6 = i5 % 2;
        return mVarArr;
    }

    public static m valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9718a + 19;
        f9722e = i3 % 128;
        int i4 = i3 % 2;
        m mVar = (m) Enum.valueOf(m.class, str);
        int i5 = f9722e + 69;
        f9718a = i5 % 128;
        int i6 = i5 % 2;
        return mVar;
    }

    public static m[] values() {
        int i2 = 2 % 2;
        int i3 = f9722e + 79;
        f9718a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        m[] mVarArr = (m[]) f9719b.clone();
        int i4 = f9718a + 41;
        f9722e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return mVarArr;
    }
}
