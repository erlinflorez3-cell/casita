package com.incode.welcome_sdk.data.remote.beans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AUTO = new f("AUTO", 0);
    public static final f MANUAL = new f("MANUAL", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9660a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9661b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9662c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9663e = 1;

    private f(String str, int i2) {
    }

    static {
        f[] fVarArrB = b();
        $VALUES = fVarArrB;
        $ENTRIES = EnumEntriesKt.enumEntries(fVarArrB);
        int i2 = f9660a + 77;
        f9662c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ f[] b() {
        int i2 = 2 % 2;
        int i3 = f9661b;
        int i4 = i3 + 39;
        f9663e = i4 % 128;
        int i5 = i4 % 2;
        f[] fVarArr = {AUTO, MANUAL};
        int i6 = i3 + 115;
        f9663e = i6 % 128;
        int i7 = i6 % 2;
        return fVarArr;
    }

    public static f valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9661b + 17;
        f9663e = i3 % 128;
        int i4 = i3 % 2;
        f fVar = (f) Enum.valueOf(f.class, str);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f9661b + 111;
        f9663e = i5 % 128;
        int i6 = i5 % 2;
        return fVar;
    }

    public static f[] values() {
        int i2 = 2 % 2;
        int i3 = f9661b + 31;
        f9663e = i3 % 128;
        int i4 = i3 % 2;
        f[] fVarArr = (f[]) $VALUES.clone();
        int i5 = f9663e + 87;
        f9661b = i5 % 128;
        int i6 = i5 % 2;
        return fVarArr;
    }
}
