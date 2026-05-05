package com.incode.welcome_sdk.ui.ekyb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYBForm {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14105a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14106b = 9 % 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14107d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14108e = 0;
    private final String addressLine2;
    private final String businessName;
    private final String city;
    private final String country;
    private final String houseNumber;
    private final String state;
    private final String street;
    private final String taxId;
    private final String zipCode;

    public EKYBForm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.businessName = str;
        this.houseNumber = str2;
        this.street = str3;
        this.addressLine2 = str4;
        this.country = str5;
        this.city = str6;
        this.state = str7;
        this.zipCode = str8;
        this.taxId = str9;
    }

    public final String getBusinessName() {
        int i2 = 2 % 2;
        int i3 = f14107d + 73;
        int i4 = i3 % 128;
        f14105a = i4;
        int i5 = i3 % 2;
        String str = this.businessName;
        int i6 = i4 + 121;
        f14107d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getHouseNumber() {
        int i2 = 2 % 2;
        int i3 = f14105a + 123;
        int i4 = i3 % 128;
        f14107d = i4;
        int i5 = i3 % 2;
        String str = this.houseNumber;
        int i6 = i4 + 19;
        f14105a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getStreet() {
        int i2 = 2 % 2;
        int i3 = f14105a;
        int i4 = i3 + 11;
        f14107d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.street;
        int i6 = i3 + 91;
        f14107d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getAddressLine2() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14107d;
        int i4 = i3 + 85;
        f14105a = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.addressLine2;
            int i5 = 23 / 0;
        } else {
            str = this.addressLine2;
        }
        int i6 = i3 + 17;
        f14105a = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCountry() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14105a;
        int i4 = i3 + 121;
        f14107d = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.country;
            int i5 = 99 / 0;
        } else {
            str = this.country;
        }
        int i6 = i3 + 69;
        f14107d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCity() {
        int i2 = 2 % 2;
        int i3 = f14105a + 71;
        f14107d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.city;
        }
        throw null;
    }

    public final String getState() {
        int i2 = 2 % 2;
        int i3 = f14105a + 117;
        f14107d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.state;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getZipCode() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14105a + 87;
        int i4 = i3 % 128;
        f14107d = i4;
        if (i3 % 2 != 0) {
            str = this.zipCode;
            int i5 = 10 / 0;
        } else {
            str = this.zipCode;
        }
        int i6 = i4 + 91;
        f14105a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getTaxId() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14105a + 39;
        int i4 = i3 % 128;
        f14107d = i4;
        if (i3 % 2 != 0) {
            str = this.taxId;
            int i5 = 69 / 0;
        } else {
            str = this.taxId;
        }
        int i6 = i4 + 23;
        f14105a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        if (9 % 2 == 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EKYBForm)) {
            return false;
        }
        EKYBForm eKYBForm = (EKYBForm) obj;
        if ((!Intrinsics.areEqual(this.businessName, eKYBForm.businessName)) || !Intrinsics.areEqual(this.houseNumber, eKYBForm.houseNumber) || !Intrinsics.areEqual(this.street, eKYBForm.street) || !Intrinsics.areEqual(this.addressLine2, eKYBForm.addressLine2) || !Intrinsics.areEqual(this.country, eKYBForm.country) || !Intrinsics.areEqual(this.city, eKYBForm.city)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.state, eKYBForm.state)) {
            int i3 = f14105a + 109;
            f14107d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.zipCode, eKYBForm.zipCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.taxId, eKYBForm.taxId)) {
            return true;
        }
        int i5 = f14107d + 75;
        f14105a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f14105a + 7;
        f14107d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((((((this.businessName.hashCode() * 31) + this.houseNumber.hashCode()) * 31) + this.street.hashCode()) * 31) + this.addressLine2.hashCode()) * 31) + this.country.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.taxId.hashCode();
        int i5 = f14107d + 111;
        f14105a = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14107d + 53;
        f14105a = i3 % 128;
        if (i3 % 2 != 0) {
            return "EKYBForm(businessName=" + this.businessName + ", houseNumber=" + this.houseNumber + ", street=" + this.street + ", addressLine2=" + this.addressLine2 + ", country=" + this.country + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", taxId=" + this.taxId + ")";
        }
        String str = "EKYBForm(businessName=" + this.businessName + ", houseNumber=" + this.houseNumber + ", street=" + this.street + ", addressLine2=" + this.addressLine2 + ", country=" + this.country + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", taxId=" + this.taxId + ")";
        throw null;
    }

    public static /* synthetic */ EKYBForm copy$default(EKYBForm eKYBForm, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f14107d + 103;
        int i5 = i4 % 128;
        f14105a = i5;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            int i6 = i5 + 35;
            f14107d = i6 % 128;
            int i7 = i6 % 2;
            str = eKYBForm.businessName;
        }
        if ((i2 & 2) != 0) {
            str2 = eKYBForm.houseNumber;
        }
        if ((i2 & 4) != 0) {
            str3 = eKYBForm.street;
        }
        if ((i2 & 8) != 0) {
            int i8 = f14107d + 89;
            f14105a = i8 % 128;
            int i9 = i8 % 2;
            str4 = eKYBForm.addressLine2;
        }
        if ((i2 & 16) != 0) {
            str5 = eKYBForm.country;
        }
        if ((i2 & 32) != 0) {
            int i10 = f14107d + 99;
            f14105a = i10 % 128;
            if (i10 % 2 == 0) {
                String str10 = eKYBForm.city;
                throw null;
            }
            str6 = eKYBForm.city;
        }
        if ((i2 & 64) != 0) {
            str7 = eKYBForm.state;
        }
        if ((i2 & 128) != 0) {
            str8 = eKYBForm.zipCode;
        }
        if ((i2 & 256) != 0) {
            str9 = eKYBForm.taxId;
        }
        return eKYBForm.copy(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final EKYBForm copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        EKYBForm eKYBForm = new EKYBForm(str, str2, str3, str4, str5, str6, str7, str8, str9);
        int i3 = f14107d + 47;
        f14105a = i3 % 128;
        int i4 = i3 % 2;
        return eKYBForm;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f14105a + 61;
        int i4 = i3 % 128;
        f14107d = i4;
        int i5 = i3 % 2;
        String str = this.taxId;
        int i6 = i4 + 79;
        f14105a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component8() {
        int i2 = 2 % 2;
        int i3 = f14105a + 33;
        f14107d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.zipCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14107d;
        int i4 = i3 + 105;
        f14105a = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.state;
            int i5 = 89 / 0;
        } else {
            str = this.state;
        }
        int i6 = i3 + 109;
        f14105a = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i2 = 2 % 2;
        int i3 = f14105a + 121;
        f14107d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.city;
        }
        throw null;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f14107d + 81;
        int i4 = i3 % 128;
        f14105a = i4;
        int i5 = i3 % 2;
        String str = this.country;
        int i6 = i4 + 3;
        f14107d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return str;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f14105a;
        int i4 = i3 + 9;
        f14107d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.addressLine2;
        int i6 = i3 + 101;
        f14107d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f14107d + 93;
        f14105a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.street;
        }
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f14107d;
        int i4 = i3 + 71;
        f14105a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.houseNumber;
        int i6 = i3 + 39;
        f14105a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f14105a + 87;
        f14107d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.businessName;
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
        return str;
    }
}
