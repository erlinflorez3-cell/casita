package com.incode.welcome_sdk.ui.ekyc;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYCForm {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14158a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14159c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14160d = 71 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14161e = 1;
    private final String city;
    private final String country;
    private final String dateOfBirth;
    private final String email;
    private final String firstName;
    private final String houseNumber;
    private final String nationality;
    private final String phoneNumber;
    private final String postalCode;
    private final String state;
    private final String street;
    private final String surName;
    private final String taxId;

    public EKYCForm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.firstName = str;
        this.surName = str2;
        this.street = str3;
        this.houseNumber = str4;
        this.postalCode = str5;
        this.state = str6;
        this.city = str7;
        this.country = str8;
        this.phoneNumber = str9;
        this.email = str10;
        this.taxId = str11;
        this.dateOfBirth = str12;
        this.nationality = str13;
    }

    public final String getFirstName() {
        int i2 = 2 % 2;
        int i3 = f14158a + 109;
        f14161e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.firstName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSurName() {
        int i2 = 2 % 2;
        int i3 = f14161e + 33;
        int i4 = i3 % 128;
        f14158a = i4;
        int i5 = i3 % 2;
        String str = this.surName;
        int i6 = i4 + 107;
        f14161e = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStreet() {
        int i2 = 2 % 2;
        int i3 = f14158a + 21;
        f14161e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.street;
        }
        throw null;
    }

    public final String getHouseNumber() {
        int i2 = 2 % 2;
        int i3 = f14161e + 47;
        f14158a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.houseNumber;
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        return str;
    }

    public final String getPostalCode() {
        int i2 = 2 % 2;
        int i3 = f14161e + 107;
        int i4 = i3 % 128;
        f14158a = i4;
        int i5 = i3 % 2;
        String str = this.postalCode;
        int i6 = i4 + 3;
        f14161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getState() {
        int i2 = 2 % 2;
        int i3 = f14158a;
        int i4 = i3 + 3;
        f14161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.state;
        int i6 = i3 + 17;
        f14161e = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCity() {
        int i2 = 2 % 2;
        int i3 = f14161e;
        int i4 = i3 + 73;
        f14158a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.city;
        int i6 = i3 + 57;
        f14158a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getCountry() {
        int i2 = 2 % 2;
        int i3 = f14158a + 121;
        int i4 = i3 % 128;
        f14161e = i4;
        int i5 = i3 % 2;
        String str = this.country;
        int i6 = i4 + 67;
        f14158a = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPhoneNumber() {
        int i2 = 2 % 2;
        int i3 = f14158a;
        int i4 = i3 + 47;
        f14161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.phoneNumber;
        int i6 = i3 + 39;
        f14161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getEmail() {
        int i2 = 2 % 2;
        int i3 = f14161e + 57;
        int i4 = i3 % 128;
        f14158a = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i5 = i4 + 107;
        f14161e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTaxId() {
        int i2 = 2 % 2;
        int i3 = f14161e;
        int i4 = i3 + 103;
        f14158a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.taxId;
        int i6 = i3 + 11;
        f14158a = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDateOfBirth() {
        int i2 = 2 % 2;
        int i3 = f14161e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14158a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dateOfBirth;
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return str;
    }

    public final String getNationality() {
        int i2 = 2 % 2;
        int i3 = f14158a;
        int i4 = i3 + 97;
        f14161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.nationality;
        int i6 = i3 + 121;
        f14161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        if (71 % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f14161e + 61;
            int i4 = i3 % 128;
            f14158a = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 109;
            f14161e = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof EKYCForm)) {
            int i7 = f14158a + 9;
            f14161e = i7 % 128;
            return i7 % 2 == 0;
        }
        EKYCForm eKYCForm = (EKYCForm) obj;
        if (!Intrinsics.areEqual(this.firstName, eKYCForm.firstName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.surName, eKYCForm.surName)) {
            int i8 = f14161e + 111;
            f14158a = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.street, eKYCForm.street) || !Intrinsics.areEqual(this.houseNumber, eKYCForm.houseNumber) || !Intrinsics.areEqual(this.postalCode, eKYCForm.postalCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.state, eKYCForm.state)) {
            int i10 = f14158a + 87;
            f14161e = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.city, eKYCForm.city) || !Intrinsics.areEqual(this.country, eKYCForm.country) || !Intrinsics.areEqual(this.phoneNumber, eKYCForm.phoneNumber) || !Intrinsics.areEqual(this.email, eKYCForm.email) || !Intrinsics.areEqual(this.taxId, eKYCForm.taxId) || !Intrinsics.areEqual(this.dateOfBirth, eKYCForm.dateOfBirth)) {
            return false;
        }
        if (Intrinsics.areEqual(this.nationality, eKYCForm.nationality)) {
            return true;
        }
        int i12 = f14158a + 89;
        f14161e = i12 % 128;
        return i12 % 2 == 0;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f14158a + 123;
        f14161e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((((((((((((((this.firstName.hashCode() * 31) + this.surName.hashCode()) * 31) + this.street.hashCode()) * 31) + this.houseNumber.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.state.hashCode()) * 31) + this.city.hashCode()) * 31) + this.country.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + this.taxId.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.nationality.hashCode();
        int i5 = f14161e + 41;
        f14158a = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14161e + 19;
        f14158a = i3 % 128;
        int i4 = i3 % 2;
        String str = "EKYCForm(firstName=" + this.firstName + ", surName=" + this.surName + ", street=" + this.street + ", houseNumber=" + this.houseNumber + ", postalCode=" + this.postalCode + ", state=" + this.state + ", city=" + this.city + ", country=" + this.country + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", taxId=" + this.taxId + ", dateOfBirth=" + this.dateOfBirth + ", nationality=" + this.nationality + ")";
        int i5 = f14158a + 111;
        f14161e = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ EKYCForm copy$default(EKYCForm eKYCForm, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, Object obj) {
        String str14 = str2;
        String str15 = str;
        String str16 = str5;
        String str17 = str4;
        String str18 = str3;
        String str19 = str8;
        String str20 = str7;
        String str21 = str6;
        String str22 = str11;
        String str23 = str10;
        String str24 = str9;
        String str25 = str13;
        String str26 = str12;
        int i3 = 2 % 2;
        int i4 = f14158a;
        int i5 = i4 + 99;
        f14161e = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 97;
            f14161e = i7 % 128;
            int i8 = i7 % 2;
            str15 = eKYCForm.firstName;
        }
        if ((i2 & 2) != 0) {
            str14 = eKYCForm.surName;
            int i9 = f14161e + 107;
            f14158a = i9 % 128;
            int i10 = i9 % 2;
        }
        if ((i2 & 4) != 0) {
            str18 = eKYCForm.street;
        }
        if ((i2 & 8) != 0) {
            str17 = eKYCForm.houseNumber;
        }
        if ((i2 & 16) != 0) {
            int i11 = f14158a + 37;
            f14161e = i11 % 128;
            int i12 = i11 % 2;
            str16 = eKYCForm.postalCode;
        }
        if ((i2 & 32) != 0) {
            int i13 = f14158a + 49;
            f14161e = i13 % 128;
            int i14 = i13 % 2;
            str21 = eKYCForm.state;
        }
        if ((i2 & 64) != 0) {
            str20 = eKYCForm.city;
        }
        if ((i2 & 128) != 0) {
            str19 = eKYCForm.country;
        }
        if ((i2 & 256) != 0) {
            str24 = eKYCForm.phoneNumber;
        }
        if ((i2 & 512) != 0) {
            str23 = eKYCForm.email;
        }
        if ((i2 & 1024) != 0) {
            int i15 = f14158a + 113;
            f14161e = i15 % 128;
            int i16 = i15 % 2;
            str22 = eKYCForm.taxId;
        }
        if ((i2 & 2048) != 0) {
            str26 = eKYCForm.dateOfBirth;
        }
        if ((i2 & 4096) != 0) {
            str25 = eKYCForm.nationality;
        }
        return eKYCForm.copy(str15, str14, str18, str17, str16, str21, str20, str19, str24, str23, str22, str26, str25);
    }

    public final EKYCForm copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
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
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        EKYCForm eKYCForm = new EKYCForm(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
        int i3 = f14158a + 87;
        f14161e = i3 % 128;
        int i4 = i3 % 2;
        return eKYCForm;
    }

    public final String component13() {
        int i2 = 2 % 2;
        int i3 = f14161e;
        int i4 = i3 + 125;
        f14158a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.nationality;
        int i5 = i3 + 41;
        f14158a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String component12() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14161e + 55;
        int i4 = i3 % 128;
        f14158a = i4;
        if (i3 % 2 != 0) {
            str = this.dateOfBirth;
            int i5 = 32 / 0;
        } else {
            str = this.dateOfBirth;
        }
        int i6 = i4 + 85;
        f14161e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return str;
    }

    public final String component11() {
        int i2 = 2 % 2;
        int i3 = f14161e + 51;
        int i4 = i3 % 128;
        f14158a = i4;
        int i5 = i3 % 2;
        String str = this.taxId;
        int i6 = i4 + 75;
        f14161e = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i2 = 2 % 2;
        int i3 = f14158a + 47;
        f14161e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        if (i4 == 0) {
            int i5 = 92 / 0;
        }
        return str;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f14158a;
        int i4 = i3 + 23;
        f14161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.phoneNumber;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component8() {
        int i2 = 2 % 2;
        int i3 = f14158a;
        int i4 = i3 + 91;
        f14161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.country;
        int i6 = i3 + 37;
        f14161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component7() {
        int i2 = 2 % 2;
        int i3 = f14158a;
        int i4 = i3 + 49;
        f14161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.city;
        int i6 = i3 + 29;
        f14161e = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i2 = 2 % 2;
        int i3 = f14158a + 89;
        f14161e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.state;
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        return str;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f14158a + 51;
        int i4 = i3 % 128;
        f14161e = i4;
        int i5 = i3 % 2;
        String str = this.postalCode;
        int i6 = i4 + 79;
        f14158a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f14161e;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14158a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.houseNumber;
        int i6 = i3 + 105;
        f14158a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f14161e;
        int i4 = i3 + 123;
        f14158a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.street;
        int i6 = i3 + 65;
        f14158a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f14161e + 73;
        int i4 = i3 % 128;
        f14158a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.surName;
        int i5 = i4 + 17;
        f14161e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f14161e;
        int i4 = i3 + 23;
        f14158a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.firstName;
        int i6 = i3 + 73;
        f14158a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
