package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9556c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bs[] f9558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9559f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9560g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9561j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static bs f9557d = new bs("INCODE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static bs f9555b = new bs("NOM151", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bs f9554a = new bs("SECOBAN", 2);

    private bs(String str, int i2) {
    }

    static {
        bs[] bsVarArrD = d();
        f9558e = bsVarArrD;
        EnumEntriesKt.enumEntries(bsVarArrD);
        int i2 = f9561j + 65;
        f9560g = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ bs[] d() {
        bs[] bsVarArr;
        int i2 = 2 % 2;
        int i3 = f9559f;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9556c = i4 % 128;
        if (i4 % 2 != 0) {
            bsVarArr = new bs[5];
            bsVarArr[1] = f9557d;
            bsVarArr[1] = f9555b;
            bsVarArr[3] = f9554a;
        } else {
            bsVarArr = new bs[]{f9557d, f9555b, f9554a};
        }
        int i5 = i3 + 5;
        f9556c = i5 % 128;
        int i6 = i5 % 2;
        return bsVarArr;
    }

    public static bs valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9556c + 19;
        f9559f = i3 % 128;
        int i4 = i3 % 2;
        bs bsVar = (bs) Enum.valueOf(bs.class, str);
        int i5 = f9556c + 99;
        f9559f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return bsVar;
    }

    public static bs[] values() {
        bs[] bsVarArr;
        int i2 = 2 % 2;
        int i3 = f9556c + 95;
        f9559f = i3 % 128;
        if (i3 % 2 == 0) {
            bsVarArr = (bs[]) f9558e.clone();
            int i4 = 27 / 0;
        } else {
            bsVarArr = (bs[]) f9558e.clone();
        }
        int i5 = f9559f + 67;
        f9556c = i5 % 128;
        if (i5 % 2 == 0) {
            return bsVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
