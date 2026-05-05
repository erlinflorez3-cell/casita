package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10058c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ t[] f10060e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10061g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10062h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f10063i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10064b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f10057a = new t("SMS", 0, "SMS");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f10059d = new t("EMAIL", 1, "EMAIL");

    private t(String str, int i2, String str2) {
        this.f10064b = str2;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f10062h + 59;
        f10058c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f10064b;
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        return str;
    }

    static {
        t[] tVarArrA = a();
        f10060e = tVarArrA;
        EnumEntriesKt.enumEntries(tVarArrA);
        int i2 = f10061g + 105;
        f10063i = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ t[] a() {
        int i2 = 2 % 2;
        int i3 = f10062h + 37;
        int i4 = i3 % 128;
        f10058c = i4;
        int i5 = i3 % 2;
        t[] tVarArr = {f10057a, f10059d};
        int i6 = i4 + 87;
        f10062h = i6 % 128;
        int i7 = i6 % 2;
        return tVarArr;
    }

    public static t valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f10062h + 1;
        f10058c = i3 % 128;
        int i4 = i3 % 2;
        t tVar = (t) Enum.valueOf(t.class, str);
        if (i4 == 0) {
            return tVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static t[] values() {
        int i2 = 2 % 2;
        int i3 = f10058c + 115;
        f10062h = i3 % 128;
        int i4 = i3 % 2;
        t[] tVarArr = (t[]) f10060e.clone();
        int i5 = f10062h + 71;
        f10058c = i5 % 128;
        int i6 = i5 % 2;
        return tVarArr;
    }
}
