package com.incode.welcome_sdk.data.local;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h[] f8589c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8592f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8593h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8594i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8595j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f8588b = new h("PENDING", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f8590d = new h("TEMPORARY_ERROR", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f8591e = new h("PERMANENT_ERROR", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f8587a = new h("SUCCESS", 3);

    private h(String str, int i2) {
    }

    static {
        h[] hVarArrB = b();
        f8589c = hVarArrB;
        EnumEntriesKt.enumEntries(hVarArrB);
        int i2 = f8594i + 109;
        f8595j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ h[] b() {
        int i2 = 2 % 2;
        int i3 = f8593h + 33;
        int i4 = i3 % 128;
        f8592f = i4;
        int i5 = i3 % 2;
        h[] hVarArr = {f8588b, f8590d, f8591e, f8587a};
        int i6 = i4 + 1;
        f8593h = i6 % 128;
        if (i6 % 2 != 0) {
            return hVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static h valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f8593h + 13;
        f8592f = i3 % 128;
        int i4 = i3 % 2;
        h hVar = (h) Enum.valueOf(h.class, str);
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        int i6 = f8593h + 43;
        f8592f = i6 % 128;
        int i7 = i6 % 2;
        return hVar;
    }

    public static h[] values() {
        int i2 = 2 % 2;
        int i3 = f8593h + 27;
        f8592f = i3 % 128;
        int i4 = i3 % 2;
        h[] hVarArr = f8589c;
        if (i4 == 0) {
            return (h[]) hVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
