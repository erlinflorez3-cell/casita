package com.incode.welcome_sdk.ui.geolocation;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import cz.msebera.android.httpclient.util.VersionInfo;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OnDeviceGeolocationResult {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f14323o = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f14324t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchingState f14325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeWelcome.AddressFields f14328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f14337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14338n;

    public OnDeviceGeolocationResult(FetchingState fetchingState, IncodeWelcome.AddressFields addressFields, double d2, double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(fetchingState, "");
        this.f14325a = fetchingState;
        this.f14328d = addressFields;
        this.f14326b = d2;
        this.f14327c = d3;
        this.f14329e = str;
        this.f14331g = str2;
        this.f14333i = str3;
        this.f14332h = str4;
        this.f14334j = str5;
        this.f14330f = str6;
        this.f14337m = str7;
        this.f14338n = str8;
        this.f14335k = str9;
        this.f14336l = str10;
    }

    public /* synthetic */ OnDeviceGeolocationResult(FetchingState fetchingState, IncodeWelcome.AddressFields addressFields, double d2, double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fetchingState, (i2 & 2) != 0 ? null : addressFields, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) == 0 ? d3 : 0.0d, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : str9, (i2 & 8192) == 0 ? str10 : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FetchingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ FetchingState[] f14339a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f14344f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f14345g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f14346h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f14347i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f14348j = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FetchingState f14343e = new FetchingState("FETCHED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FetchingState f14340b = new FetchingState(VersionInfo.UNAVAILABLE, 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FetchingState f14342d = new FetchingState("IN_PROGRESS", 2);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FetchingState f14341c = new FetchingState("NO_NETWORK", 3);

        private FetchingState(String str, int i2) {
        }

        static {
            FetchingState[] fetchingStateArrB = b();
            f14339a = fetchingStateArrB;
            f14347i = EnumEntriesKt.enumEntries(fetchingStateArrB);
            int i2 = f14344f + 37;
            f14345g = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final /* synthetic */ FetchingState[] b() {
            int i2 = 2 % 2;
            int i3 = f14346h + 71;
            int i4 = i3 % 128;
            f14348j = i4;
            int i5 = i3 % 2;
            FetchingState[] fetchingStateArr = {f14343e, f14340b, f14342d, f14341c};
            int i6 = i4 + 91;
            f14346h = i6 % 128;
            int i7 = i6 % 2;
            return fetchingStateArr;
        }

        public static EnumEntries<FetchingState> getEntries() {
            EnumEntries<FetchingState> enumEntries;
            int i2 = 2 % 2;
            int i3 = f14346h;
            int i4 = i3 + 33;
            f14348j = i4 % 128;
            if (i4 % 2 == 0) {
                enumEntries = f14347i;
                int i5 = 51 / 0;
            } else {
                enumEntries = f14347i;
            }
            int i6 = i3 + 79;
            f14348j = i6 % 128;
            if (i6 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static FetchingState valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f14346h + 101;
            f14348j = i3 % 128;
            int i4 = i3 % 2;
            FetchingState fetchingState = (FetchingState) Enum.valueOf(FetchingState.class, str);
            if (i4 == 0) {
                int i5 = 52 / 0;
            }
            return fetchingState;
        }

        public static FetchingState[] values() {
            int i2 = 2 % 2;
            int i3 = f14348j + 115;
            f14346h = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            FetchingState[] fetchingStateArr = (FetchingState[]) f14339a.clone();
            int i4 = f14346h + 3;
            f14348j = i4 % 128;
            if (i4 % 2 != 0) {
                return fetchingStateArr;
            }
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDeviceGeolocationResult)) {
            int i3 = f14324t + 103;
            f14323o = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        OnDeviceGeolocationResult onDeviceGeolocationResult = (OnDeviceGeolocationResult) obj;
        if (this.f14325a != onDeviceGeolocationResult.f14325a) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f14328d, onDeviceGeolocationResult.f14328d)) {
            int i5 = f14323o + 99;
            f14324t = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Double.compare(this.f14326b, onDeviceGeolocationResult.f14326b) != 0) {
            int i6 = f14324t + 117;
            f14323o = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Double.compare(this.f14327c, onDeviceGeolocationResult.f14327c) != 0 || !Intrinsics.areEqual(this.f14329e, onDeviceGeolocationResult.f14329e) || !Intrinsics.areEqual(this.f14331g, onDeviceGeolocationResult.f14331g) || !Intrinsics.areEqual(this.f14333i, onDeviceGeolocationResult.f14333i)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f14332h, onDeviceGeolocationResult.f14332h)) {
            int i8 = f14324t + 19;
            f14323o = i8 % 128;
            return i8 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.f14334j, onDeviceGeolocationResult.f14334j)) {
            return Intrinsics.areEqual(this.f14330f, onDeviceGeolocationResult.f14330f) && Intrinsics.areEqual(this.f14337m, onDeviceGeolocationResult.f14337m) && Intrinsics.areEqual(this.f14338n, onDeviceGeolocationResult.f14338n) && Intrinsics.areEqual(this.f14335k, onDeviceGeolocationResult.f14335k) && Intrinsics.areEqual(this.f14336l, onDeviceGeolocationResult.f14336l);
        }
        int i9 = f14323o + 61;
        f14324t = i9 % 128;
        return i9 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i2 = 2 % 2;
        int iHashCode8 = this.f14325a.hashCode() * 31;
        IncodeWelcome.AddressFields addressFields = this.f14328d;
        if (addressFields == null) {
            int i3 = f14323o + 123;
            f14324t = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = addressFields.hashCode();
        }
        int iHashCode9 = (((((iHashCode8 + iHashCode) * 31) + Double.hashCode(this.f14326b)) * 31) + Double.hashCode(this.f14327c)) * 31;
        String str = this.f14329e;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14331g;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14333i;
        if (str3 == null) {
            int i5 = f14323o + 21;
            f14324t = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int i7 = (iHashCode11 + iHashCode2) * 31;
        String str4 = this.f14332h;
        if (str4 == null) {
            int i8 = f14324t + 41;
            f14323o = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        int i10 = (i7 + iHashCode3) * 31;
        String str5 = this.f14334j;
        if (str5 == null) {
            int i11 = f14323o + 79;
            f14324t = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        int i13 = (i10 + iHashCode4) * 31;
        String str6 = this.f14330f;
        int iHashCode12 = (i13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14337m;
        if (str7 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = str7.hashCode();
            int i14 = f14323o + 83;
            f14324t = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 % 3;
            }
        }
        int i16 = (iHashCode12 + iHashCode5) * 31;
        String str8 = this.f14338n;
        if (str8 == null) {
            int i17 = f14323o + 97;
            f14324t = i17 % 128;
            int i18 = i17 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str8.hashCode();
        }
        int i19 = (i16 + iHashCode6) * 31;
        String str9 = this.f14335k;
        if (str9 == null) {
            int i20 = f14323o + 11;
            f14324t = i20 % 128;
            int i21 = i20 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str9.hashCode();
        }
        int i22 = (i19 + iHashCode7) * 31;
        String str10 = this.f14336l;
        return i22 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14323o + 39;
        f14324t = i3 % 128;
        int i4 = i3 % 2;
        String str = "OnDeviceGeolocationResult(fetchingState=" + this.f14325a + ", addressFields=" + this.f14328d + ", latitude=" + this.f14326b + ", longitude=" + this.f14327c + ", thoroughfare=" + this.f14329e + ", subThoroughfare=" + this.f14331g + ", locality=" + this.f14333i + ", subLocality=" + this.f14332h + ", adminArea=" + this.f14334j + ", subAdminArea=" + this.f14330f + ", postalCode=" + this.f14337m + ", countryCode=" + this.f14338n + ", countryName=" + this.f14335k + ", locationName=" + this.f14336l + ")";
        int i5 = f14324t + 115;
        f14323o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public static /* synthetic */ OnDeviceGeolocationResult copy$default(OnDeviceGeolocationResult onDeviceGeolocationResult, FetchingState fetchingState, IncodeWelcome.AddressFields addressFields, double d2, double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, Object obj) {
        double d4 = d3;
        IncodeWelcome.AddressFields addressFields2 = addressFields;
        double d5 = d2;
        FetchingState fetchingState2 = fetchingState;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        String str16 = str10;
        String str17 = str6;
        String str18 = str9;
        String str19 = str8;
        String str20 = str7;
        int i3 = 2 % 2;
        int i4 = f14323o + 29;
        int i5 = i4 % 128;
        f14324t = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 99;
            f14323o = i7 % 128;
            int i8 = i7 % 2;
            fetchingState2 = onDeviceGeolocationResult.f14325a;
        }
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i9 = f14323o + 85;
            f14324t = i9 % 128;
            if (i9 % 2 == 0) {
                IncodeWelcome.AddressFields addressFields3 = onDeviceGeolocationResult.f14328d;
                obj2.hashCode();
                throw null;
            }
            addressFields2 = onDeviceGeolocationResult.f14328d;
        }
        if ((i2 & 4) != 0) {
            d5 = onDeviceGeolocationResult.f14326b;
        }
        if ((i2 & 8) != 0) {
            int i10 = f14323o + 15;
            f14324t = i10 % 128;
            if (i10 % 2 == 0) {
                double d6 = onDeviceGeolocationResult.f14327c;
                obj2.hashCode();
                throw null;
            }
            d4 = onDeviceGeolocationResult.f14327c;
        }
        if ((i2 & 16) != 0) {
            str15 = onDeviceGeolocationResult.f14329e;
        }
        if ((i2 & 32) != 0) {
            str14 = onDeviceGeolocationResult.f14331g;
        }
        if ((i2 & 64) != 0) {
            str13 = onDeviceGeolocationResult.f14333i;
        }
        if ((i2 & 128) != 0) {
            str12 = onDeviceGeolocationResult.f14332h;
        }
        if ((i2 & 256) != 0) {
            str11 = onDeviceGeolocationResult.f14334j;
        }
        if ((i2 & 512) != 0) {
            str17 = onDeviceGeolocationResult.f14330f;
        }
        if ((i2 & 1024) != 0) {
            int i11 = f14324t + 95;
            f14323o = i11 % 128;
            int i12 = i11 % 2;
            str20 = onDeviceGeolocationResult.f14337m;
        }
        if ((i2 & 2048) != 0) {
            str19 = onDeviceGeolocationResult.f14338n;
        }
        if ((i2 & 4096) != 0) {
            str18 = onDeviceGeolocationResult.f14335k;
        }
        if ((i2 & 8192) != 0) {
            str16 = onDeviceGeolocationResult.f14336l;
        }
        String str21 = str15;
        String str22 = str13;
        return onDeviceGeolocationResult.copy(fetchingState2, addressFields2, d5, d4, str21, str14, str22, str12, str11, str17, str20, str19, str18, str16);
    }

    public final OnDeviceGeolocationResult copy(FetchingState fetchingState, IncodeWelcome.AddressFields addressFields, double d2, double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fetchingState, "");
        OnDeviceGeolocationResult onDeviceGeolocationResult = new OnDeviceGeolocationResult(fetchingState, addressFields, d2, d3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        int i3 = f14324t + 89;
        f14323o = i3 % 128;
        if (i3 % 2 == 0) {
            return onDeviceGeolocationResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i2 = 2 % 2;
        int i3 = f14323o + 73;
        f14324t = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f14336l;
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        return str;
    }

    public final String component13() {
        int i2 = 2 % 2;
        int i3 = f14324t + 121;
        f14323o = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f14335k;
        if (i4 != 0) {
            int i5 = 10 / 0;
        }
        return str;
    }

    public final String component12() {
        int i2 = 2 % 2;
        int i3 = f14323o + 77;
        int i4 = i3 % 128;
        f14324t = i4;
        int i5 = i3 % 2;
        String str = this.f14338n;
        int i6 = i4 + 73;
        f14323o = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
        return str;
    }

    public final String component11() {
        String str;
        int i2 = 2 % 2;
        int i3 = f14323o + 35;
        int i4 = i3 % 128;
        f14324t = i4;
        if (i3 % 2 == 0) {
            str = this.f14337m;
            int i5 = 81 / 0;
        } else {
            str = this.f14337m;
        }
        int i6 = i4 + 23;
        f14323o = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return str;
    }

    public final String component10() {
        int i2 = 2 % 2;
        int i3 = f14323o;
        int i4 = i3 + 11;
        f14324t = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.f14330f;
        int i5 = i3 + 33;
        f14324t = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f14324t + 71;
        int i4 = i3 % 128;
        f14323o = i4;
        int i5 = i3 % 2;
        String str = this.f14334j;
        int i6 = i4 + 71;
        f14324t = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i2 = 2 % 2;
        int i3 = f14324t;
        int i4 = i3 + 115;
        f14323o = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.f14332h;
        int i5 = i3 + 95;
        f14323o = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i2 = 2 % 2;
        int i3 = f14324t + 87;
        f14323o = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14333i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i2 = 2 % 2;
        int i3 = f14324t + 17;
        int i4 = i3 % 128;
        f14323o = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f14331g;
        int i5 = i4 + 47;
        f14324t = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f14323o + 95;
        f14324t = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14329e;
        }
        throw null;
    }

    public final double component4() {
        int i2 = 2 % 2;
        int i3 = f14324t + 91;
        f14323o = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14327c;
        }
        int i4 = 52 / 0;
        return this.f14327c;
    }

    public final double component3() {
        double d2;
        int i2 = 2 % 2;
        int i3 = f14324t;
        int i4 = i3 + 21;
        f14323o = i4 % 128;
        if (i4 % 2 != 0) {
            d2 = this.f14326b;
            int i5 = 71 / 0;
        } else {
            d2 = this.f14326b;
        }
        int i6 = i3 + 101;
        f14323o = i6 % 128;
        if (i6 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IncodeWelcome.AddressFields component2() {
        int i2 = 2 % 2;
        int i3 = f14324t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f14323o = i4;
        int i5 = i3 % 2;
        IncodeWelcome.AddressFields addressFields = this.f14328d;
        int i6 = i4 + 63;
        f14324t = i6 % 128;
        if (i6 % 2 != 0) {
            return addressFields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FetchingState component1() {
        int i2 = 2 % 2;
        int i3 = f14324t + 9;
        int i4 = i3 % 128;
        f14323o = i4;
        int i5 = i3 % 2;
        FetchingState fetchingState = this.f14325a;
        int i6 = i4 + 83;
        f14324t = i6 % 128;
        int i7 = i6 % 2;
        return fetchingState;
    }
}
