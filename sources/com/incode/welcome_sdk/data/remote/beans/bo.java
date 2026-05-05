package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bo[] f9530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9531f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9532h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9533i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9534j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bo f9526a = new bo("ULTRA_LOW", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static bo f9527b = new bo("LOW", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static bo f9529d = new bo("MEDIUM", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static bo f9528c = new bo("HIGH", 3);

    private bo(String str, int i2) {
    }

    static {
        bo[] boVarArrD = d();
        f9530e = boVarArrD;
        EnumEntriesKt.enumEntries(boVarArrD);
        int i2 = f9531f + 73;
        f9532h = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ bo[] d() {
        bo[] boVarArr;
        int i2 = 2 % 2;
        int i3 = f9533i + 11;
        int i4 = i3 % 128;
        f9534j = i4;
        if (i3 % 2 == 0) {
            boVarArr = new bo[3];
            boVarArr[0] = f9526a;
            boVarArr[1] = f9527b;
            boVarArr[2] = f9529d;
            boVarArr[4] = f9528c;
        } else {
            boVarArr = new bo[]{f9526a, f9527b, f9529d, f9528c};
        }
        int i5 = i4 + 31;
        f9533i = i5 % 128;
        if (i5 % 2 == 0) {
            return boVarArr;
        }
        throw null;
    }

    public static bo valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9534j + 81;
        f9533i = i3 % 128;
        int i4 = i3 % 2;
        bo boVar = (bo) Enum.valueOf(bo.class, str);
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        return boVar;
    }

    public static bo[] values() {
        int i2 = 2 % 2;
        int i3 = f9534j + 33;
        f9533i = i3 % 128;
        int i4 = i3 % 2;
        bo[] boVarArr = (bo[]) f9530e.clone();
        int i5 = f9533i + 27;
        f9534j = i5 % 128;
        int i6 = i5 % 2;
        return boVarArr;
    }
}
