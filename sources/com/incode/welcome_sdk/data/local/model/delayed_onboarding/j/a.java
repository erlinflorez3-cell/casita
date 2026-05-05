package com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;

import com.incode.welcome_sdk.data.remote.beans.f;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: f */
    private static int f8886f = 1;

    /* JADX INFO: renamed from: h */
    private static int f8887h = 0;

    /* JADX INFO: renamed from: a */
    private final String f8888a;

    /* JADX INFO: renamed from: b */
    private final long f8889b;

    /* JADX INFO: renamed from: c */
    private final boolean f8890c;

    /* JADX INFO: renamed from: d */
    private final Map<String, Float> f8891d;

    /* JADX INFO: renamed from: e */
    private final f f8892e;

    /* JADX INFO: renamed from: j */
    private final boolean f8893j;

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = (~((~i4) | i8)) | i10;
        int i12 = (~(i4 | i8)) | i10;
        int i13 = ~(i9 | i5);
        int i14 = i5 + i7 + i6 + (104229478 * i3) + ((-1414784667) * i2);
        int i15 = i14 * i14;
        int i16 = ((i5 * (-393484327)) - 513802240) + ((-393484327) * i7) + (i11 * 23337000) + (i12 * 23337000) + (23337000 * i13) + ((-370147328) * i6) + ((-1784676352) * i3) + ((-1146093568) * i2) + ((-1043988480) * i15);
        int i17 = ((i5 * 256725217) - 1927268364) + (i7 * 256725217) + (i11 * 872) + (i12 * 872) + (i13 * 872) + (i6 * 256726089) + (i3 * (-1692676330)) + (i2 * (-87465523)) + (i15 * 964034560);
        if (i16 + (i17 * i17 * (-1055260672)) != 1) {
            a aVar = (a) objArr[0];
            int i18 = 2 % 2;
            int i19 = f8886f + 113;
            int i20 = i19 % 128;
            f8887h = i20;
            int i21 = i19 % 2;
            boolean z2 = aVar.f8893j;
            int i22 = i20 + 15;
            f8886f = i22 % 128;
            int i23 = i22 % 2;
            return Boolean.valueOf(z2);
        }
        a aVar2 = (a) objArr[0];
        int i24 = 2 % 2;
        int i25 = f8886f;
        int i26 = i25 + 85;
        f8887h = i26 % 128;
        int i27 = i26 % 2;
        String str = aVar2.f8888a;
        int i28 = i25 + 73;
        f8887h = i28 % 128;
        int i29 = i28 % 2;
        return str;
    }

    public a(long j2, String str, Map<String, Float> map, f fVar, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(fVar, "");
        this.f8889b = j2;
        this.f8888a = str;
        this.f8891d = map;
        this.f8892e = fVar;
        this.f8890c = z2;
        this.f8893j = z3;
    }

    public final long d() {
        int i2 = 2 % 2;
        int i3 = f8887h;
        int i4 = i3 + 93;
        f8886f = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j2 = this.f8889b;
        int i5 = i3 + 11;
        f8886f = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    public final Map<String, Float> c() {
        int i2 = 2 % 2;
        int i3 = f8887h + 49;
        f8886f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8891d;
        }
        throw null;
    }

    public final f b() {
        int i2 = 2 % 2;
        int i3 = f8887h;
        int i4 = i3 + 39;
        f8886f = i4 % 128;
        int i5 = i4 % 2;
        f fVar = this.f8892e;
        int i6 = i3 + 101;
        f8886f = i6 % 128;
        int i7 = i6 % 2;
        return fVar;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f8887h;
        int i4 = i3 + 9;
        f8886f = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f8890c;
        int i6 = i3 + 97;
        f8886f = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            int i3 = f8887h + 93;
            f8886f = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        a aVar = (a) obj;
        if (this.f8889b != aVar.f8889b || !Intrinsics.areEqual(this.f8888a, aVar.f8888a)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8891d, aVar.f8891d)) {
            int i5 = f8887h + 83;
            f8886f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return false;
        }
        if (this.f8892e != aVar.f8892e) {
            int i7 = f8886f + 43;
            f8887h = i7 % 128;
            return i7 % 2 != 0;
        }
        if (this.f8890c != aVar.f8890c || this.f8893j != aVar.f8893j) {
            return false;
        }
        int i8 = f8887h + 47;
        f8886f = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8886f + 33;
        f8887h = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.f8889b) * 31;
        String str = this.f8888a;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Float> map = this.f8891d;
        if (map != null) {
            iHashCode2 = map.hashCode();
            int i5 = f8887h + 33;
            f8886f = i5 % 128;
            int i6 = i5 % 2;
        }
        return ((((((iHashCode3 + iHashCode2) * 31) + this.f8892e.hashCode()) * 31) + Boolean.hashCode(this.f8890c)) * 31) + Boolean.hashCode(this.f8893j);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8886f + 69;
        f8887h = i3 % 128;
        int i4 = i3 % 2;
        String str = "SelfieScanEntity(id=" + this.f8889b + ", imagePath=" + this.f8888a + ", faceCoordinates=" + this.f8891d + ", captureType=" + this.f8892e + ", isCompleted=" + this.f8890c + ", isSynced=" + this.f8893j + ")";
        int i5 = f8886f + 55;
        f8887h = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ a e(a aVar, long j2, String str, Map map, f fVar, boolean z2, boolean z3, int i2) {
        boolean z4 = z3;
        String str2 = str;
        boolean z5 = z2;
        long j3 = j2;
        Map map2 = map;
        f fVar2 = fVar;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            j3 = aVar.f8889b;
        }
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i4 = f8887h + 63;
            f8886f = i4 % 128;
            if (i4 % 2 == 0) {
                String str3 = aVar.f8888a;
                throw null;
            }
            str2 = aVar.f8888a;
        }
        if ((i2 & 4) != 0) {
            map2 = aVar.f8891d;
        }
        if ((i2 & 8) != 0) {
            fVar2 = aVar.f8892e;
        }
        if ((i2 & 16) != 0) {
            int i5 = f8886f + 39;
            f8887h = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z6 = aVar.f8890c;
                obj.hashCode();
                throw null;
            }
            z5 = aVar.f8890c;
        }
        if ((i2 & 32) != 0) {
            int i6 = f8886f + 113;
            f8887h = i6 % 128;
            int i7 = i6 % 2;
            z4 = aVar.f8893j;
            if (i7 != 0) {
                throw null;
            }
        }
        return d(j3, str2, map2, fVar2, z5, z4);
    }

    private static a d(long j2, String str, Map<String, Float> map, f fVar, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fVar, "");
        a aVar = new a(j2, str, map, fVar, z2, z3);
        int i3 = f8887h + 91;
        f8886f = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    public final boolean i() {
        int iC = ValidatingTaxIdPresenter.a.c();
        int iC2 = ValidatingTaxIdPresenter.a.c();
        return ((Boolean) d(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC, -988071999, iC2, 988071999)).booleanValue();
    }

    public final String e() {
        int iC = ValidatingTaxIdPresenter.a.c();
        int iC2 = ValidatingTaxIdPresenter.a.c();
        return (String) d(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC, -1555909154, iC2, 1555909155);
    }
}
