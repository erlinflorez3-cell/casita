package com.incode.welcome_sdk.data;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j[] f7673a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7675d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f7677f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f7678g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f7679j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f7674c = new j("SHALLOW", 0, "shallow");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static j f7676e = new j("DEEP", 1, "deep");

    private j(String str, int i2, String str2) {
        this.f7680b = str2;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f7679j + 5;
        int i4 = i3 % 128;
        f7675d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f7680b;
        int i5 = i4 + 33;
        f7679j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        j[] jVarArrE = e();
        f7673a = jVarArrE;
        EnumEntriesKt.enumEntries(jVarArrE);
        int i2 = f7678g + 95;
        f7677f = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ j[] e() {
        int i2 = 2 % 2;
        int i3 = f7675d;
        int i4 = i3 + 29;
        f7679j = i4 % 128;
        int i5 = i4 % 2;
        j[] jVarArr = {f7674c, f7676e};
        int i6 = i3 + 1;
        f7679j = i6 % 128;
        int i7 = i6 % 2;
        return jVarArr;
    }

    public static j valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f7675d + 5;
        f7679j = i3 % 128;
        int i4 = i3 % 2;
        j jVar = (j) Enum.valueOf(j.class, str);
        int i5 = f7675d + 7;
        f7679j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return jVar;
    }

    public static j[] values() {
        int i2 = 2 % 2;
        int i3 = f7679j + 125;
        f7675d = i3 % 128;
        int i4 = i3 % 2;
        j[] jVarArr = (j[]) f7673a.clone();
        int i5 = f7679j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7675d = i5 % 128;
        if (i5 % 2 == 0) {
            return jVarArr;
        }
        throw null;
    }
}
