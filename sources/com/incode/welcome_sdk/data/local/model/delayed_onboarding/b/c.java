package com.incode.welcome_sdk.data.local.model.delayed_onboarding.b;

import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8712g = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f8713l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f8719f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f8722j;

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = ~(i9 | i11);
        int i13 = i10 | i12;
        int i14 = (~(i3 | i9 | i5)) | (~(i8 | i4)) | (~(i11 | i8));
        int i15 = i5 + i4 + i6 + ((-1336646162) * i2) + (1706069763 * i7);
        int i16 = i15 * i15;
        int i17 = ((i5 * (-1709230891)) - 203685888) + ((-1709230891) * i4) + ((-1137600936) * i13) + (568800468 * i12) + ((-568800468) * i14) + (2016935936 * i6) + ((-602931200) * i2) + ((-1331167232) * i7) + ((-1604583424) * i16);
        int i18 = ((i5 * 112646815) - 831444653) + (i4 * 112646815) + (i13 * 520) + (i12 * (-260)) + (i14 * 260) + (i6 * 112647075) + (i2 * (-2078048118)) + (i7 * (-2015059991)) + (i16 * (-829161472));
        return i17 + ((i18 * i18) * (-1266417664)) != 1 ? b(objArr) : e(objArr);
    }

    public c(long j2, String str, String str2, String str3, boolean z2, String str4, f fVar, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(fVar, "");
        this.f8715b = j2;
        this.f8718e = str;
        this.f8714a = str2;
        this.f8716c = str3;
        this.f8717d = z2;
        this.f8721i = str4;
        this.f8719f = fVar;
        this.f8722j = z3;
        this.f8720h = z4;
    }

    public final long a() {
        int i2 = 2 % 2;
        int i3 = f8713l + 15;
        int i4 = i3 % 128;
        f8712g = i4;
        int i5 = i3 % 2;
        long j2 = this.f8715b;
        int i6 = i4 + 83;
        f8713l = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f8712g + 103;
        int i4 = i3 % 128;
        f8713l = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f8718e;
        int i5 = i4 + 43;
        f8712g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f8713l + 57;
        int i4 = i3 % 128;
        f8712g = i4;
        int i5 = i3 % 2;
        String str = this.f8714a;
        int i6 = i4 + 37;
        f8713l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8713l + 125;
        int i4 = i3 % 128;
        f8712g = i4;
        int i5 = i3 % 2;
        Object obj = null;
        String str = cVar.f8716c;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 67;
        f8713l = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f8713l;
        int i4 = i3 + 67;
        f8712g = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f8717d;
        int i6 = i3 + 23;
        f8712g = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8713l;
        int i4 = i3 + 81;
        f8712g = i4 % 128;
        int i5 = i4 % 2;
        String str = cVar.f8721i;
        int i6 = i3 + 9;
        f8712g = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final f f() {
        int i2 = 2 % 2;
        int i3 = f8712g + 97;
        int i4 = i3 % 128;
        f8713l = i4;
        int i5 = i3 % 2;
        f fVar = this.f8719f;
        int i6 = i4 + 53;
        f8712g = i6 % 128;
        int i7 = i6 % 2;
        return fVar;
    }

    public final boolean j() {
        int i2 = 2 % 2;
        int i3 = f8713l + 51;
        int i4 = i3 % 128;
        f8712g = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8722j;
        int i6 = i4 + 75;
        f8713l = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean g() {
        int i2 = 2 % 2;
        int i3 = f8713l + 81;
        f8712g = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8720h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f8712g + 71;
            int i4 = i3 % 128;
            f8713l = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 91;
            f8712g = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8715b != cVar.f8715b) {
            int i7 = f8712g + 69;
            f8713l = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f8718e, cVar.f8718e) || !Intrinsics.areEqual(this.f8714a, cVar.f8714a) || !Intrinsics.areEqual(this.f8716c, cVar.f8716c) || this.f8717d != cVar.f8717d || !Intrinsics.areEqual(this.f8721i, cVar.f8721i) || this.f8719f != cVar.f8719f || this.f8722j != cVar.f8722j) {
            return false;
        }
        if (this.f8720h == cVar.f8720h) {
            return true;
        }
        int i9 = f8713l + 117;
        f8712g = i9 % 128;
        return i9 % 2 != 0;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int iHashCode3 = Long.hashCode(this.f8715b) * 31;
        String str = this.f8718e;
        int iHashCode4 = 0;
        if (str == null) {
            int i3 = f8712g + 113;
            f8713l = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i5 = (iHashCode3 + iHashCode) * 31;
        String str2 = this.f8714a;
        int iHashCode5 = (i5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8716c;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i6 = f8713l + 113;
            f8712g = i6 % 128;
            int i7 = i6 % 2;
        }
        int iHashCode6 = (((iHashCode5 + iHashCode2) * 31) + Boolean.hashCode(this.f8717d)) * 31;
        String str4 = this.f8721i;
        if (str4 != null) {
            iHashCode4 = str4.hashCode();
            int i8 = f8712g + 35;
            f8713l = i8 % 128;
            int i9 = i8 % 2;
        }
        return ((((((iHashCode6 + iHashCode4) * 31) + this.f8719f.hashCode()) * 31) + Boolean.hashCode(this.f8722j)) * 31) + Boolean.hashCode(this.f8720h);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8712g + 21;
        f8713l = i3 % 128;
        if (i3 % 2 != 0) {
            return "IdScanEntity(id=" + this.f8715b + ", frontIdImagePath=" + this.f8718e + ", backIdImagePath=" + this.f8714a + ", idType=" + this.f8716c + ", isSecondId=" + this.f8717d + ", scanStep=" + this.f8721i + ", captureType=" + this.f8719f + ", isCompleted=" + this.f8722j + ", isSynced=" + this.f8720h + ")";
        }
        String str = "IdScanEntity(id=" + this.f8715b + ", frontIdImagePath=" + this.f8718e + ", backIdImagePath=" + this.f8714a + ", idType=" + this.f8716c + ", isSecondId=" + this.f8717d + ", scanStep=" + this.f8721i + ", captureType=" + this.f8719f + ", isCompleted=" + this.f8722j + ", isSynced=" + this.f8720h + ")";
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ c b(c cVar, long j2, String str, String str2, String str3, boolean z2, String str4, f fVar, boolean z3, boolean z4, int i2) {
        boolean z5 = z4;
        f fVar2 = fVar;
        String str5 = str4;
        long j3 = j2;
        String str6 = str3;
        String str7 = str2;
        boolean z6 = z2;
        boolean z7 = z3;
        String str8 = str;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f8713l + 5;
            f8712g = i4 % 128;
            int i5 = i4 % 2;
            j3 = cVar.f8715b;
        }
        if ((i2 & 2) != 0) {
            str8 = cVar.f8718e;
        }
        if ((i2 & 4) != 0) {
            int i6 = f8712g + 103;
            f8713l = i6 % 128;
            int i7 = i6 % 2;
            str7 = cVar.f8714a;
        }
        if ((i2 & 8) != 0) {
            str6 = cVar.f8716c;
        }
        if ((i2 & 16) != 0) {
            z6 = cVar.f8717d;
        }
        if ((i2 & 32) != 0) {
            str5 = cVar.f8721i;
        }
        if ((i2 & 64) != 0) {
            int i8 = f8712g + 1;
            f8713l = i8 % 128;
            if (i8 % 2 == 0) {
                f fVar3 = cVar.f8719f;
                throw null;
            }
            fVar2 = cVar.f8719f;
        }
        if ((i2 & 128) != 0) {
            z7 = cVar.f8722j;
        }
        if ((i2 & 256) != 0) {
            z5 = cVar.f8720h;
        }
        c cVarC = c(j3, str8, str7, str6, z6, str5, fVar2, z7, z5);
        int i9 = f8713l + 103;
        f8712g = i9 % 128;
        int i10 = i9 % 2;
        return cVarC;
    }

    private static c c(long j2, String str, String str2, String str3, boolean z2, String str4, f fVar, boolean z3, boolean z4) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fVar, "");
        c cVar = new c(j2, str, str2, str3, z2, str4, fVar, z3, z4);
        int i3 = f8712g + 37;
        f8713l = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    public final String i() {
        int iE = bf.a.e();
        int iE2 = bf.a.e();
        return (String) d(bf.a.e(), iE, new Object[]{this}, 419065736, -419065735, iE2, bf.a.e());
    }

    public final String b() {
        int iE = bf.a.e();
        int iE2 = bf.a.e();
        return (String) d(bf.a.e(), iE, new Object[]{this}, -1961997734, 1961997734, iE2, bf.a.e());
    }
}
