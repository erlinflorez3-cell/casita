package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Consent {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9065a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9066b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9067d = 11 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9068e = 1;
    private final String checkboxId;
    private final String consentText;
    private final boolean optional;

    public Consent(String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.checkboxId = str;
        this.consentText = str2;
        this.optional = z2;
    }

    public /* synthetic */ Consent(String str, String str2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z2);
    }

    public final String getCheckboxId() {
        int i2 = 2 % 2;
        int i3 = f9066b + 39;
        int i4 = i3 % 128;
        f9068e = i4;
        int i5 = i3 % 2;
        String str = this.checkboxId;
        int i6 = i4 + 51;
        f9066b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 96 / 0;
        }
        return str;
    }

    public final String getConsentText() {
        int i2 = 2 % 2;
        int i3 = f9068e;
        int i4 = i3 + 29;
        f9066b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.consentText;
        int i5 = i3 + 125;
        f9066b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final boolean getOptional() {
        int i2 = 2 % 2;
        int i3 = f9068e + 27;
        f9066b = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.optional;
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        return z2;
    }

    static {
        if (11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Consent() {
        this(null, null, false, 7, null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9066b + 59;
            f9068e = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof Consent)) {
            int i5 = f9068e;
            int i6 = i5 + 103;
            f9066b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 13;
            f9066b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        Consent consent = (Consent) obj;
        if (!Intrinsics.areEqual(this.checkboxId, consent.checkboxId)) {
            int i10 = f9068e + 113;
            f9066b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.consentText, consent.consentText)) {
            return this.optional == consent.optional;
        }
        int i12 = f9066b + 121;
        f9068e = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9068e + 81;
        f9066b = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (((this.checkboxId.hashCode() % 61) - this.consentText.hashCode()) >>> 53) >>> Boolean.hashCode(this.optional) : (((this.checkboxId.hashCode() * 31) + this.consentText.hashCode()) * 31) + Boolean.hashCode(this.optional);
        int i4 = f9066b + 17;
        f9068e = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9068e + 97;
        f9066b = i3 % 128;
        int i4 = i3 % 2;
        String str = "Consent(checkboxId=" + this.checkboxId + ", consentText=" + this.consentText + ", optional=" + this.optional + ")";
        int i5 = f9068e + 21;
        f9066b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public static /* synthetic */ Consent copy$default(Consent consent, String str, String str2, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f9066b;
        int i5 = i4 + 95;
        f9068e = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 109;
            f9068e = i7 % 128;
            int i8 = i7 % 2;
            str = consent.checkboxId;
        }
        if ((i2 & 2) != 0) {
            int i9 = i4 + 75;
            f9068e = i9 % 128;
            if (i9 % 2 == 0) {
                String str3 = consent.consentText;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = consent.consentText;
        }
        if ((i2 & 4) != 0) {
            z2 = consent.optional;
        }
        return consent.copy(str, str2, z2);
    }

    public final Consent copy(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Consent consent = new Consent(str, str2, z2);
        int i3 = f9068e + 73;
        f9066b = i3 % 128;
        if (i3 % 2 == 0) {
            return consent;
        }
        throw null;
    }

    public final boolean component3() {
        int i2 = 2 % 2;
        int i3 = f9068e + 63;
        int i4 = i3 % 128;
        f9066b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.optional;
        int i6 = i4 + 21;
        f9068e = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f9068e + 13;
        f9066b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.consentText;
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f9068e + 45;
        int i4 = i3 % 128;
        f9066b = i4;
        int i5 = i3 % 2;
        String str = this.checkboxId;
        int i6 = i4 + 79;
        f9068e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
