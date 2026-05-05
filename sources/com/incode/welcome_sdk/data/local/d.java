package com.incode.welcome_sdk.data.local;

import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.ui.geolocation.GeolocationActivity_MembersInjector;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: p */
    private static int f7952p = 0;

    /* JADX INFO: renamed from: r */
    private static int f7953r = 1;

    /* JADX INFO: renamed from: a */
    private final String f7954a;

    /* JADX INFO: renamed from: b */
    private final long f7955b;

    /* JADX INFO: renamed from: c */
    private final Map<String, Float> f7956c;

    /* JADX INFO: renamed from: d */
    private final int f7957d;

    /* JADX INFO: renamed from: e */
    private final int f7958e;

    /* JADX INFO: renamed from: f */
    private final float f7959f;

    /* JADX INFO: renamed from: g */
    private final float f7960g;

    /* JADX INFO: renamed from: h */
    private final float f7961h;

    /* JADX INFO: renamed from: i */
    private final float f7962i;

    /* JADX INFO: renamed from: j */
    private final float f7963j;

    /* JADX INFO: renamed from: k */
    private final SelfieScan.FaceAuthMode f7964k;

    /* JADX INFO: renamed from: l */
    private final float f7965l;

    /* JADX INFO: renamed from: m */
    private final h f7966m;

    /* JADX INFO: renamed from: n */
    private final String f7967n;

    /* JADX INFO: renamed from: o */
    private final String f7968o;

    /* JADX INFO: renamed from: q */
    private final f f7969q;

    /* JADX INFO: renamed from: t */
    private final String f7970t;

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~((~i4) | i9)) | i10;
        int i12 = i3 | i2;
        int i13 = (~(i4 | i9)) | i10;
        int i14 = i3 + i2 + i7 + (1258674323 * i5) + ((-126594725) * i6);
        int i15 = i14 * i14;
        int i16 = ((-1449289074) * i3) + 1954676736 + ((-212912869) * i2) + (i11 * (-1236376205)) + (i12 * (-1236376205)) + ((-1236376205) * i13) + (1609302016 * i7) + (881065984 * i5) + ((-991690752) * i6) + ((-541982720) * i15);
        int i17 = ((i3 * (-1656160718)) - 817430035) + (i2 * (-1656161339)) + (i11 * 621) + (i12 * 621) + (i13 * 621) + (i7 * (-1656160097)) + (i5 * (-2121497779)) + (i6 * 1378977669) + (i15 * (-275906560));
        int i18 = i16 + (i17 * i17 * (-372375552));
        if (i18 == 1) {
            return d(objArr);
        }
        if (i18 == 2) {
            return b(objArr);
        }
        if (i18 != 3) {
            d dVar = (d) objArr[0];
            int i19 = 2 % 2;
            int i20 = f7952p + 87;
            int i21 = i20 % 128;
            f7953r = i21;
            int i22 = i20 % 2;
            int i23 = dVar.f7957d;
            int i24 = i21 + 37;
            f7952p = i24 % 128;
            int i25 = i24 % 2;
            return Integer.valueOf(i23);
        }
        d dVar2 = (d) objArr[0];
        int i26 = 2 % 2;
        int i27 = f7953r;
        int i28 = i27 + 33;
        f7952p = i28 % 128;
        int i29 = i28 % 2;
        float f2 = dVar2.f7960g;
        int i30 = i27 + 41;
        f7952p = i30 % 128;
        int i31 = i30 % 2;
        return Float.valueOf(f2);
    }

    public d(long j2, String str, Map<String, Float> map, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, SelfieScan.FaceAuthMode faceAuthMode, h hVar, f fVar, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(faceAuthMode, "");
        Intrinsics.checkNotNullParameter(hVar, "");
        this.f7955b = j2;
        this.f7954a = str;
        this.f7956c = map;
        this.f7957d = i2;
        this.f7958e = i3;
        this.f7962i = f2;
        this.f7959f = f3;
        this.f7963j = f4;
        this.f7961h = f5;
        this.f7960g = f6;
        this.f7965l = f7;
        this.f7967n = str2;
        this.f7968o = str3;
        this.f7964k = faceAuthMode;
        this.f7966m = hVar;
        this.f7969q = fVar;
        this.f7970t = str4;
    }

    public final long b() {
        int i2 = 2 % 2;
        int i3 = f7952p + 93;
        int i4 = i3 % 128;
        f7953r = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j2 = this.f7955b;
        int i5 = i4 + 23;
        f7952p = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f7952p + 69;
        int i4 = i3 % 128;
        f7953r = i4;
        int i5 = i3 % 2;
        String str = this.f7954a;
        int i6 = i4 + 105;
        f7952p = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7952p + 107;
        int i4 = i3 % 128;
        f7953r = i4;
        int i5 = i3 % 2;
        Object obj = null;
        Map<String, Float> map = dVar.f7956c;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 75;
        f7952p = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f7953r + 17;
        f7952p = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7958e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float f() {
        int i2 = 2 % 2;
        int i3 = f7953r + 21;
        f7952p = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7962i;
        }
        throw null;
    }

    public final float h() {
        int i2 = 2 % 2;
        int i3 = f7953r + 121;
        f7952p = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7959f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float g() {
        int i2 = 2 % 2;
        int i3 = f7952p + 43;
        f7953r = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.f7963j;
        if (i4 == 0) {
            int i5 = 47 / 0;
        }
        return f2;
    }

    public final float i() {
        int i2 = 2 % 2;
        int i3 = f7953r + 107;
        int i4 = i3 % 128;
        f7952p = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f2 = this.f7961h;
        int i5 = i4 + 67;
        f7953r = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return f2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7952p;
        int i4 = i3 + 73;
        f7953r = i4 % 128;
        int i5 = i4 % 2;
        float f2 = dVar.f7965l;
        int i6 = i3 + 17;
        f7953r = i6 % 128;
        if (i6 % 2 != 0) {
            return Float.valueOf(f2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String k() {
        int i2 = 2 % 2;
        int i3 = f7953r + 97;
        int i4 = i3 % 128;
        f7952p = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f7967n;
        int i5 = i4 + 59;
        f7953r = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String m() {
        int i2 = 2 % 2;
        int i3 = f7952p + 31;
        int i4 = i3 % 128;
        f7953r = i4;
        int i5 = i3 % 2;
        String str = this.f7968o;
        int i6 = i4 + 109;
        f7952p = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
        return str;
    }

    public final SelfieScan.FaceAuthMode n() {
        int i2 = 2 % 2;
        int i3 = f7952p + 59;
        f7953r = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f7964k;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ d(long j2, String str, Map map, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, SelfieScan.FaceAuthMode faceAuthMode) {
        this(0L, str, map, i2, i3, f2, f3, f4, f5, f6, f7, str2, str3, faceAuthMode, h.f8588b, null, null);
    }

    public final h o() {
        int i2 = 2 % 2;
        int i3 = f7953r + 19;
        int i4 = i3 % 128;
        f7952p = i4;
        int i5 = i3 % 2;
        h hVar = this.f7966m;
        int i6 = i4 + 99;
        f7953r = i6 % 128;
        int i7 = i6 % 2;
        return hVar;
    }

    public final f t() {
        int i2 = 2 % 2;
        int i3 = f7953r;
        int i4 = i3 + 125;
        f7952p = i4 % 128;
        int i5 = i4 % 2;
        f fVar = this.f7969q;
        int i6 = i3 + 73;
        f7952p = i6 % 128;
        int i7 = i6 % 2;
        return fVar;
    }

    public final String r() {
        int i2 = 2 % 2;
        int i3 = f7952p;
        int i4 = i3 + 25;
        f7953r = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f7970t;
        int i6 = i3 + 91;
        f7953r = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, Map<String, Float> map, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, SelfieScan.FaceAuthMode faceAuthMode) {
        this(0L, str, map, i2, i3, f2, f3, f4, f5, f6, f7, str2, str3, faceAuthMode);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(faceAuthMode, "");
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7953r + 59;
            f7952p = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7955b != dVar.f7955b) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f7954a, dVar.f7954a)) {
            int i5 = f7953r + 93;
            f7952p = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f7956c, dVar.f7956c)) {
            int i6 = f7953r + 111;
            f7952p = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.f7957d != dVar.f7957d) {
            int i8 = f7953r + 3;
            f7952p = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.f7958e != dVar.f7958e) {
            int i10 = f7952p + 59;
            f7953r = i10 % 128;
            return i10 % 2 == 0;
        }
        if (Float.compare(this.f7962i, dVar.f7962i) != 0 || Float.compare(this.f7959f, dVar.f7959f) != 0) {
            return false;
        }
        if (Float.compare(this.f7963j, dVar.f7963j) != 0) {
            int i11 = f7953r;
            int i12 = i11 + 111;
            f7952p = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 63;
            f7952p = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Float.compare(this.f7961h, dVar.f7961h) != 0 || Float.compare(this.f7960g, dVar.f7960g) != 0 || Float.compare(this.f7965l, dVar.f7965l) != 0 || !Intrinsics.areEqual(this.f7967n, dVar.f7967n) || !Intrinsics.areEqual(this.f7968o, dVar.f7968o) || this.f7964k != dVar.f7964k) {
            return false;
        }
        if (this.f7966m == dVar.f7966m) {
            return this.f7969q == dVar.f7969q && Intrinsics.areEqual(this.f7970t, dVar.f7970t);
        }
        int i16 = f7953r + 19;
        f7952p = i16 % 128;
        return i16 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0024 A[PHI: r1
  0x0024: PHI (r1v34 int) = (r1v2 int), (r1v37 int) binds: [B:47:0x00d3, B:30:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7 A[PHI: r1
  0x00d7: PHI (r1v3 int) = (r1v2 int), (r1v37 int) binds: [B:47:0x00d3, B:30:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.d.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7952p + 29;
        f7953r = i3 % 128;
        int i4 = i3 % 2;
        String str = "FaceLoginAttemptEntity(id=" + this.f7955b + ", base64Frame=" + this.f7954a + ", faceCoordinates=" + this.f7956c + ", bitmapWidth=" + this.f7957d + ", bitmapHeight=" + this.f7958e + ", faceInfoConfidence=" + this.f7962i + ", faceRecognitionThreshold=" + this.f7959f + ", livenessConfidence=" + this.f7963j + ", livenessThreshold=" + this.f7961h + ", brightness=" + this.f7960g + ", blurriness=" + this.f7965l + ", authenticationType=" + this.f7967n + ", customerId=" + this.f7968o + ", faceAuthMode=" + this.f7964k + ", syncStatus=" + this.f7966m + ", syncResult=" + this.f7969q + ", error=" + this.f7970t + ")";
        int i5 = f7953r + 111;
        f7952p = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ d e(d dVar, h hVar, f fVar, String str) {
        int i2 = 2 % 2;
        int i3 = f7952p + 71;
        f7953r = i3 % 128;
        int i4 = i3 % 2;
        d dVarD = d(dVar.f7955b, dVar.f7954a, dVar.f7956c, dVar.f7957d, dVar.f7958e, dVar.f7962i, dVar.f7959f, dVar.f7963j, dVar.f7961h, dVar.f7960g, dVar.f7965l, dVar.f7967n, dVar.f7968o, dVar.f7964k, hVar, fVar, str);
        int i5 = f7952p + 31;
        f7953r = i5 % 128;
        int i6 = i5 % 2;
        return dVarD;
    }

    private static d d(long j2, String str, Map<String, Float> map, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, String str2, String str3, SelfieScan.FaceAuthMode faceAuthMode, h hVar, f fVar, String str4) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(faceAuthMode, "");
        Intrinsics.checkNotNullParameter(hVar, "");
        d dVar = new d(j2, str, map, i2, i3, f2, f3, f4, f5, f6, f7, str2, str3, faceAuthMode, hVar, fVar, str4);
        int i5 = f7953r + 111;
        f7952p = i5 % 128;
        if (i5 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    public final float l() {
        return ((Float) d(new Object[]{this}, 938647139, -938647137, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue();
    }

    public final float j() {
        return ((Float) d(new Object[]{this}, -608352159, 608352162, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue();
    }

    public final int a() {
        return ((Integer) d(new Object[]{this}, -1333266828, 1333266828, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).intValue();
    }

    public final Map<String, Float> e() {
        return (Map) d(new Object[]{this}, -581205358, 581205359, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a());
    }
}
