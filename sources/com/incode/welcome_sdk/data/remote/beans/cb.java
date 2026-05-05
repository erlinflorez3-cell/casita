package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9639a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cb[] f9642d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9644g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9645i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9646j = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cb f9641c = new cb("FRONT_ID", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cb f9640b = new cb("BACK_ID", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cb f9643e = new cb("SELFIE", 2);

    private cb(String str, int i2) {
    }

    static {
        cb[] cbVarArrE = e();
        f9642d = cbVarArrE;
        EnumEntriesKt.enumEntries(cbVarArrE);
        int i2 = f9644g + 5;
        f9645i = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ cb[] e() {
        int i2 = 2 % 2;
        int i3 = f9639a + 125;
        int i4 = i3 % 128;
        f9646j = i4;
        int i5 = i3 % 2;
        cb[] cbVarArr = {f9641c, f9640b, f9643e};
        int i6 = i4 + 27;
        f9639a = i6 % 128;
        int i7 = i6 % 2;
        return cbVarArr;
    }

    public static cb valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9646j + 39;
        f9639a = i3 % 128;
        int i4 = i3 % 2;
        cb cbVar = (cb) Enum.valueOf(cb.class, str);
        int i5 = f9639a + 7;
        f9646j = i5 % 128;
        int i6 = i5 % 2;
        return cbVar;
    }

    public static cb[] values() {
        int i2 = 2 % 2;
        int i3 = f9646j + 39;
        f9639a = i3 % 128;
        int i4 = i3 % 2;
        cb[] cbVarArr = (cb[]) f9642d.clone();
        int i5 = f9639a + 97;
        f9646j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return cbVarArr;
    }
}
