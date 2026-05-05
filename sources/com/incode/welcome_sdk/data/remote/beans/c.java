package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.R;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static int A = 0;
    private static int D = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f9612c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f9631v = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ c[] f9633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f9634y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9636b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9613d = new c("Unknown", 0, R.string.onboard_sdk_id_capture_accepted_documents_unknown, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static c f9617h = new c("Passport", 1, R.string.onboard_sdk_id_capture_accepted_documents_passport, R.drawable.onboard_sdk_ic_accepted_documents_passport);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static c f9616g = new c("Visa", 2, R.string.onboard_sdk_id_capture_accepted_documents_visa, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static c f9619j = new c("DriversLicense", 3, R.string.onboard_sdk_id_capture_accepted_documents_drivers_license, R.drawable.onboard_sdk_ic_accepted_documents_drivers_licence);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static c f9615f = new c("IdentificationCard", 4, R.string.onboard_sdk_id_capture_accepted_documents_identification_card, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static c f9618i = new c("Permit", 5, R.string.onboard_sdk_id_capture_accepted_documents_permit, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static c f9621l = new c("Currency", 6, R.string.onboard_sdk_id_capture_accepted_documents_currency, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static c f9624o = new c("ResidenceDocument", 7, R.string.onboard_sdk_id_capture_accepted_documents_residence_document, R.drawable.onboard_sdk_ic_accepted_documents_residence_document);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f9620k = new c("TravelDocument", 8, R.string.onboard_sdk_id_capture_accepted_documents_travel_document, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static c f9622m = new c("BirthCertificate", 9, R.string.onboard_sdk_id_capture_accepted_documents_birth_certificate, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c f9623n = new c("VehicleRegistration", 10, R.string.onboard_sdk_id_capture_accepted_documents_vehicle_registration, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f9614e = new c("Other", 11, R.string.onboard_sdk_id_capture_accepted_documents_other, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static c f9627r = new c("WeaponLicense", 12, R.string.onboard_sdk_id_capture_accepted_documents_weapon_license, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static c f9629t = new c("TribalIdentification", 13, R.string.onboard_sdk_id_capture_accepted_documents_tribal_identification, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static c f9625p = new c("VoterIdentification", 14, R.string.onboard_sdk_id_capture_accepted_documents_voter_identification, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static c f9626q = new c("Military", 15, R.string.onboard_sdk_id_capture_accepted_documents_military, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static c f9628s = new c("TaxIdentification", 16, R.string.onboard_sdk_id_capture_accepted_documents_tax_identification, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static c f9632w = new c("FederalID", 17, R.string.onboard_sdk_id_capture_accepted_documents_federal_id, R.drawable.onboard_sdk_ic_accepted_documents_id);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static c f9630u = new c("MedicalCard", 18, R.string.onboard_sdk_id_capture_accepted_documents_medical_card, R.drawable.onboard_sdk_ic_accepted_documents_id);

    private c(String str, int i2, int i3, int i4) {
        this.f9636b = i3;
        this.f9635a = i4;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f9634y + 29;
        int i4 = i3 % 128;
        f9631v = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.f9635a;
        int i6 = i4 + 1;
        f9634y = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f9631v;
        int i4 = i3 + 79;
        f9634y = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f9636b;
        int i7 = i3 + 19;
        f9634y = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 34 / 0;
        }
        return i6;
    }

    static {
        c[] cVarArrE = e();
        f9633x = cVarArrE;
        EnumEntriesKt.enumEntries(cVarArrE);
        f9612c = new d((byte) 0);
        int i2 = D + 45;
        A = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9637a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9638e = 0;

        private d() {
        }

        @JvmStatic
        public static c d(String str) {
            c cVar;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i3];
                if (!(!Intrinsics.areEqual(cVar.name(), str))) {
                    int i4 = f9638e + 1;
                    f9637a = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                i3++;
            }
            if (cVar == null) {
                int i6 = f9637a + 51;
                f9638e = i6 % 128;
                if (i6 % 2 != 0) {
                    c cVar2 = c.f9613d;
                    throw null;
                }
                cVar = c.f9613d;
                int i7 = f9637a + 9;
                f9638e = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = f9637a + 123;
            f9638e = i9 % 128;
            if (i9 % 2 == 0) {
                return cVar;
            }
            throw null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    private static final /* synthetic */ c[] e() {
        int i2 = 2 % 2;
        int i3 = f9631v + 5;
        int i4 = i3 % 128;
        f9634y = i4;
        int i5 = i3 % 2;
        c[] cVarArr = {f9613d, f9617h, f9616g, f9619j, f9615f, f9618i, f9621l, f9624o, f9620k, f9622m, f9623n, f9614e, f9627r, f9629t, f9625p, f9626q, f9628s, f9632w, f9630u};
        int i6 = i4 + 17;
        f9631v = i6 % 128;
        int i7 = i6 % 2;
        return cVarArr;
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f9634y + 83;
        f9631v = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        if (i4 == 0) {
            int i5 = 16 / 0;
        }
        return cVar;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f9631v + 19;
        f9634y = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        c[] cVarArr = (c[]) f9633x.clone();
        int i4 = f9634y + 47;
        f9631v = i4 % 128;
        int i5 = i4 % 2;
        return cVarArr;
    }
}
