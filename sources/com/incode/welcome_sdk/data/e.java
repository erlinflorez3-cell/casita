package com.incode.welcome_sdk.data;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f7632b = new e("USE_CLIENT_GLARE", "USE_CLIENT_GLARE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7633c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7634d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f7635e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f7636i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f7637j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7638a;

    private e(String str, String str2) {
        this.f7638a = str2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f7634d + 1;
        f7633c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7638a;
        }
        throw null;
    }

    static {
        e[] eVarArrA = a();
        f7635e = eVarArrA;
        EnumEntriesKt.enumEntries(eVarArrA);
        int i2 = f7636i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7637j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ e[] a() {
        e[] eVarArr;
        int i2 = 2 % 2;
        int i3 = f7634d;
        int i4 = i3 + 73;
        f7633c = i4 % 128;
        if (i4 % 2 != 0) {
            eVarArr = new e[0];
            eVarArr[0] = f7632b;
        } else {
            eVarArr = new e[]{f7632b};
        }
        int i5 = i3 + 79;
        f7633c = i5 % 128;
        int i6 = i5 % 2;
        return eVarArr;
    }

    public static e valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f7634d + 5;
        f7633c = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) Enum.valueOf(e.class, str);
        if (i4 != 0) {
            int i5 = 78 / 0;
        }
        return eVar;
    }

    public static e[] values() {
        int i2 = 2 % 2;
        int i3 = f7633c + 21;
        f7634d = i3 % 128;
        int i4 = i3 % 2;
        e[] eVarArr = (e[]) f7635e.clone();
        int i5 = f7634d + 29;
        f7633c = i5 % 128;
        if (i5 % 2 == 0) {
            return eVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
