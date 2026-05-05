package com.incode.welcome_sdk.data.local.model.delayed_onboarding.c;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: e */
    private static int f8741e = 0;

    /* JADX INFO: renamed from: j */
    private static int f8742j = 1;

    /* JADX INFO: renamed from: a */
    private boolean f8743a;

    /* JADX INFO: renamed from: b */
    private FaceMatch.MatchType f8744b;

    /* JADX INFO: renamed from: c */
    private final long f8745c;

    /* JADX INFO: renamed from: d */
    private final boolean f8746d;

    public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~((~i3) | i8);
        int i10 = ~i2;
        int i11 = ~(i10 | i5);
        int i12 = ~(i8 | i2);
        int i13 = i9 | i11 | i12;
        int i14 = ~(i10 | i8 | i3);
        int i15 = (~(i3 | i8)) | i11 | i12;
        int i16 = i2 + i5 + i4 + (2052055731 * i6) + (1687666023 * i7);
        int i17 = i16 * i16;
        int i18 = (i2 * (-1966771951)) + 1000013824 + ((-1966771951) * i5) + ((-617538080) * i13) + ((-926307120) * i14) + (308769040 * i15) + (2019426304 * i4) + (632946688 * i6) + ((-741212160) * i7) + (2121465856 * i17);
        int i19 = (i2 * 1533266457) + 1248777597 + (i5 * 1533266457) + (i13 * (-800)) + (i14 * (-1200)) + (i15 * 400) + (i4 * 1533266057) + (i6 * 706030027) + (i7 * 1023530015) + (i17 * (-2088042496));
        if (i18 + (i19 * i19 * 1434255360) != 1) {
            return e(objArr);
        }
        a aVar = (a) objArr[0];
        int i20 = 2 % 2;
        int i21 = f8741e;
        int i22 = i21 + 1;
        f8742j = i22 % 128;
        int i23 = i22 % 2;
        aVar.f8743a = true;
        int i24 = i21 + 97;
        f8742j = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    public a(long j2, FaceMatch.MatchType matchType, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(matchType, "");
        this.f8745c = j2;
        this.f8744b = matchType;
        this.f8743a = z2;
        this.f8746d = z3;
    }

    public final long a() {
        int i2 = 2 % 2;
        int i3 = f8741e;
        int i4 = i3 + 125;
        f8742j = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.f8745c;
        int i6 = i3 + 99;
        f8742j = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    public /* synthetic */ a() {
        this(0L, FaceMatch.MatchType.ID_SELFIE, false, false);
    }

    public final FaceMatch.MatchType c() {
        int i2 = 2 % 2;
        int i3 = f8742j + 83;
        f8741e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8744b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8741e;
        int i4 = i3 + 123;
        f8742j = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f8743a;
        int i5 = i3 + 57;
        f8742j = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f8742j + 87;
        int i4 = i3 % 128;
        f8741e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8746d;
        int i6 = i4 + 81;
        f8742j = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f8742j;
        int i4 = i3 + 47;
        int i5 = i4 % 128;
        f8741e = i5;
        int i6 = i4 % 2;
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            int i7 = i5 + 69;
            f8742j = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i5 + 77;
            f8742j = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        a aVar2 = (a) obj;
        if (aVar.f8745c != aVar2.f8745c) {
            int i10 = i3 + 109;
            f8741e = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (aVar.f8744b != aVar2.f8744b) {
            int i12 = i3 + 43;
            f8741e = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (aVar.f8743a == aVar2.f8743a) {
            return aVar.f8746d == aVar2.f8746d;
        }
        int i14 = i3 + 61;
        f8741e = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) d(-1785409893, new Object[]{this, obj}, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d(), 1785409893, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d())).booleanValue();
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8741e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8742j = i3 % 128;
        int iHashCode = i3 % 2 == 0 ? (((((Long.hashCode(this.f8745c) >> 48) * this.f8744b.hashCode()) - 52) - Boolean.hashCode(this.f8743a)) - 21) << Boolean.hashCode(this.f8746d) : (((((Long.hashCode(this.f8745c) * 31) + this.f8744b.hashCode()) * 31) + Boolean.hashCode(this.f8743a)) * 31) + Boolean.hashCode(this.f8746d);
        int i4 = f8742j + 95;
        f8741e = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8741e + 123;
        f8742j = i3 % 128;
        int i4 = i3 % 2;
        String str = "FaceMatchEntity(id=" + this.f8745c + ", matchType=" + this.f8744b + ", isCompleted=" + this.f8743a + ", isSynced=" + this.f8746d + ")";
        int i5 = f8741e + 105;
        f8742j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public static /* synthetic */ a e(a aVar) {
        int i2 = 2 % 2;
        int i3 = f8742j + 3;
        f8741e = i3 % 128;
        int i4 = i3 % 2;
        a aVarC = c(aVar.f8745c, aVar.f8744b, aVar.f8743a, true);
        int i5 = f8742j + 11;
        f8741e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return aVarC;
    }

    private static a c(long j2, FaceMatch.MatchType matchType, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(matchType, "");
        a aVar = new a(j2, matchType, z2, true);
        int i3 = f8742j + 73;
        f8741e = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    public final void e() {
        d(1907417138, new Object[]{this}, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d(), -1907417137, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d());
    }
}
