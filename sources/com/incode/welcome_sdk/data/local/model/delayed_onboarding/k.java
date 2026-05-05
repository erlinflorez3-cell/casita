package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8927g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ k[] f8928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8929j = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f8930m = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f8931o = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8932h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f8922b = new k("ID_SCAN", 0, "id_scan");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f8925e = new k("PROCESS_ID", 1, "process_id");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f8921a = new k("DOCUMENT_SCAN", 2, "document_scan");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f8924d = new k("SELFIE_SCAN", 3, "selfie_scan");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f8923c = new k("FACE_MATCH", 4, "face_match");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f8926f = new k("COMBINED_CONSENT", 5, "combined_consent");

    private k(String str, int i2, String str2) {
        this.f8932h = str2;
    }

    public final String b() {
        String str;
        int i2 = 2 % 2;
        int i3 = f8929j;
        int i4 = i3 + 11;
        f8927g = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f8932h;
            int i5 = 97 / 0;
        } else {
            str = this.f8932h;
        }
        int i6 = i3 + 109;
        f8927g = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        k[] kVarArrA = a();
        f8928i = kVarArrA;
        EnumEntriesKt.enumEntries(kVarArrA);
        int i2 = f8931o + 75;
        f8930m = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ k[] a() {
        int i2 = 2 % 2;
        int i3 = f8927g + 17;
        f8929j = i3 % 128;
        if (i3 % 2 != 0) {
            return new k[]{f8922b, f8925e, f8921a, f8924d, f8923c, f8926f};
        }
        k[] kVarArr = new k[68];
        kVarArr[1] = f8922b;
        kVarArr[0] = f8925e;
        kVarArr[4] = f8921a;
        kVarArr[4] = f8924d;
        kVarArr[5] = f8923c;
        kVarArr[3] = f8926f;
        return kVarArr;
    }

    public static k valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f8927g + 37;
        f8929j = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        k kVar = (k) Enum.valueOf(k.class, str);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f8929j + 103;
        f8927g = i5 % 128;
        if (i5 % 2 == 0) {
            return kVar;
        }
        obj.hashCode();
        throw null;
    }

    public static k[] values() {
        int i2 = 2 % 2;
        int i3 = f8927g + 11;
        f8929j = i3 % 128;
        int i4 = i3 % 2;
        k[] kVarArr = f8928i;
        if (i4 != 0) {
            return (k[]) kVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
