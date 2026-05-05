package com.incode.welcome_sdk.data.local.model.delayed_onboarding.b;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.incode.welcome_sdk.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f8723k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f8724o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f8734j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f8735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f8736m;

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~((~i4) | i5);
        int i9 = (~((~i5) | (~i6))) | i8;
        int i10 = i5 | i6;
        int i11 = i5 + i6 + i3 + ((-39394691) * i7) + ((-2104995841) * i2);
        int i12 = i11 * i11;
        int i13 = (i5 * (-1880913482)) + 198443008 + ((-1880913482) * i6) + ((-1126725195) * i8) + (i9 * 1126725195) + (1126725195 * i10) + ((-754188288) * i3) + ((-1529085952) * i7) + ((-319553536) * i2) + ((-289079296) * i12);
        int i14 = ((i5 * 1773844906) - 1404835566) + (i6 * 1773844906) + (i8 * (-613)) + (i9 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i10 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i3 * 1773845519) + (i7 * 1055723859) + (i2 * 1996616689) + (i12 * (-1450508288));
        int i15 = i13 + (i14 * i14 * (-778371072));
        if (i15 == 1) {
            return d(objArr);
        }
        if (i15 == 2) {
            return b(objArr);
        }
        e eVar = (e) objArr[0];
        int i16 = 2 % 2;
        int i17 = f8723k;
        int i18 = i17 + 89;
        f8724o = i18 % 128;
        int i19 = i18 % 2;
        long j2 = eVar.f8727c;
        int i20 = i17 + 87;
        f8724o = i20 % 128;
        int i21 = i20 % 2;
        return Long.valueOf(j2);
    }

    public e(long j2, String str, boolean z2, boolean z3, String str2, String str3, int i2, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.f8726b = 0L;
        this.f8727c = j2;
        this.f8728d = str;
        this.f8725a = z2;
        this.f8729e = z3;
        this.f8733i = str2;
        this.f8730f = str3;
        this.f8732h = i2;
        this.f8734j = str4;
        this.f8731g = str5;
        this.f8735l = str6;
        this.f8736m = str7;
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f8723k + 21;
        int i4 = i3 % 128;
        f8724o = i4;
        int i5 = i3 % 2;
        long j2 = this.f8726b;
        int i6 = i4 + 53;
        f8723k = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f8724o;
        int i4 = i3 + 15;
        f8723k = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f8728d;
        int i6 = i3 + 39;
        f8723k = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f8724o + 15;
        int i4 = i3 % 128;
        f8723k = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f8725a;
        int i5 = i4 + 37;
        f8724o = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8724o + 87;
        int i4 = i3 % 128;
        f8723k = i4;
        int i5 = i3 % 2;
        Object obj = null;
        boolean z2 = eVar.f8729e;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 55;
        f8724o = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        obj.hashCode();
        throw null;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = f8724o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f8723k = i4;
        int i5 = i3 % 2;
        String str = this.f8733i;
        int i6 = i4 + 99;
        f8724o = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = f8724o + 11;
        f8723k = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f8730f;
        if (i4 != 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    public final int g() {
        int i2 = 2 % 2;
        int i3 = f8723k;
        int i4 = i3 + 123;
        f8724o = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.f8732h;
        int i6 = i3 + 107;
        f8724o = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String i() {
        int i2 = 2 % 2;
        int i3 = f8723k;
        int i4 = i3 + 107;
        f8724o = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f8734j;
        int i6 = i3 + 1;
        f8724o = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = f8723k;
        int i4 = i3 + 15;
        f8724o = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f8731g;
        int i5 = i3 + 43;
        f8724o = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = f8723k + 51;
        int i4 = i3 % 128;
        f8724o = i4;
        int i5 = i3 % 2;
        String str = this.f8735l;
        int i6 = i4 + 103;
        f8723k = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8724o + 63;
        int i4 = i3 % 128;
        f8723k = i4;
        int i5 = i3 % 2;
        String str = eVar.f8736m;
        int i6 = i4 + 61;
        f8724o = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f8723k + 57;
        f8724o = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f8726b != eVar.f8726b || this.f8727c != eVar.f8727c) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8728d, eVar.f8728d)) {
            int i5 = f8723k + 61;
            f8724o = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.f8725a != eVar.f8725a || this.f8729e != eVar.f8729e) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8733i, eVar.f8733i)) {
            int i7 = f8724o + 105;
            f8723k = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f8730f, eVar.f8730f) || this.f8732h != eVar.f8732h) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8734j, eVar.f8734j)) {
            int i9 = f8724o + 101;
            f8723k = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f8731g, eVar.f8731g)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8735l, eVar.f8735l)) {
            int i11 = f8724o + 113;
            f8723k = i11 % 128;
            return i11 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f8736m, eVar.f8736m)) {
            return false;
        }
        int i12 = f8723k + 5;
        f8724o = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f8723k + 37;
        f8724o = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((Long.hashCode(this.f8726b) * 31) + Long.hashCode(this.f8727c)) * 31;
        String str = this.f8728d;
        if (str == null) {
            int i5 = f8724o + 21;
            f8723k = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode3 = (((((((((((((((iHashCode2 + iHashCode) * 31) + Boolean.hashCode(this.f8725a)) * 31) + Boolean.hashCode(this.f8729e)) * 31) + this.f8733i.hashCode()) * 31) + this.f8730f.hashCode()) * 31) + Integer.hashCode(this.f8732h)) * 31) + this.f8734j.hashCode()) * 31) + this.f8731g.hashCode()) * 31;
        String str2 = this.f8735l;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f8736m.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8723k + 7;
        f8724o = i3 % 128;
        int i4 = i3 % 2;
        String str = "IdScanResultEntity(_id=" + this.f8726b + ", idScan=" + this.f8727c + ", scanStep=" + this.f8728d + ", classification=" + this.f8725a + ", readability=" + this.f8729e + ", typeOfId=" + this.f8733i + ", issueName=" + this.f8730f + ", issueYear=" + this.f8732h + ", countryCode=" + this.f8734j + ", resultCode=" + this.f8731g + ", error=" + this.f8735l + ", failReason=" + this.f8736m + ")";
        int i5 = f8724o + 125;
        f8723k = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String k() {
        int iB = i.b.b();
        int iB2 = i.b.b();
        int iB3 = i.b.b();
        return (String) d(i.b.b(), iB2, iB, 1960378389, -1960378387, iB3, new Object[]{this});
    }

    public final boolean d() {
        int iB = i.b.b();
        int iB2 = i.b.b();
        int iB3 = i.b.b();
        return ((Boolean) d(i.b.b(), iB2, iB, 114314993, -114314992, iB3, new Object[]{this})).booleanValue();
    }

    public final long a() {
        int iB = i.b.b();
        int iB2 = i.b.b();
        int iB3 = i.b.b();
        return ((Long) d(i.b.b(), iB2, iB, -554425373, 554425373, iB3, new Object[]{this})).longValue();
    }
}
