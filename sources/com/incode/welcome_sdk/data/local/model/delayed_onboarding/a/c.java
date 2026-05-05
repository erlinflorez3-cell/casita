package com.incode.welcome_sdk.data.local.model.delayed_onboarding.a;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.bf;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8643h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8644i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Boolean> f8648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8649e;

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = (~((~i6) | i9)) | i10;
        int i12 = i5 | i7;
        int i13 = (~(i6 | i9)) | i10;
        int i14 = i5 + i7 + i4 + (1258674323 * i2) + ((-126594725) * i3);
        int i15 = i14 * i14;
        int i16 = ((-1449289074) * i5) + 1954676736 + ((-212912869) * i7) + (i11 * (-1236376205)) + (i12 * (-1236376205)) + ((-1236376205) * i13) + (1609302016 * i4) + (881065984 * i2) + ((-991690752) * i3) + ((-541982720) * i15);
        int i17 = ((i5 * (-1656160718)) - 817430035) + (i7 * (-1656161339)) + (i11 * 621) + (i12 * 621) + (i13 * 621) + (i4 * (-1656160097)) + (i2 * (-2121497779)) + (i3 * 1378977669) + (i15 * (-275906560));
        if (i16 + (i17 * i17 * (-372375552)) != 1) {
            return e(objArr);
        }
        c cVar = (c) objArr[0];
        int i18 = 2 % 2;
        int i19 = f8643h + 49;
        int i20 = i19 % 128;
        f8644i = i20;
        int i21 = i19 % 2;
        long j2 = cVar.f8649e;
        int i22 = i20 + 5;
        f8643h = i22 % 128;
        int i23 = i22 % 2;
        return Long.valueOf(j2);
    }

    public c(long j2, String str, Map<String, Boolean> map, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.f8649e = j2;
        this.f8647c = str;
        this.f8648d = map;
        this.f8645a = z2;
        this.f8646b = z3;
    }

    public /* synthetic */ c(String str, Map map, int i2) {
        this(0L, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, false, false);
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f8644i + 63;
        int i4 = i3 % 128;
        f8643h = i4;
        int i5 = i3 % 2;
        String str = this.f8647c;
        int i6 = i4 + 63;
        f8644i = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, Boolean> a() {
        int i2 = 2 % 2;
        int i3 = f8644i;
        int i4 = i3 + 89;
        f8643h = i4 % 128;
        int i5 = i4 % 2;
        Map<String, Boolean> map = this.f8648d;
        int i6 = i3 + 27;
        f8643h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return map;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f8643h + 21;
        f8644i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8645a;
        }
        throw null;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8644i + 33;
        f8643h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8646b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8644i + 83;
        f8643h = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((Long.hashCode(cVar.f8649e) * 31) + cVar.f8647c.hashCode()) * 31) + cVar.f8648d.hashCode()) * 31) + Boolean.hashCode(cVar.f8645a)) * 31) + Boolean.hashCode(cVar.f8646b);
        int i5 = f8644i + 29;
        f8643h = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(iHashCode);
        }
        int i6 = 32 / 0;
        return Integer.valueOf(iHashCode);
    }

    public c() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f8644i + 59;
        int i4 = i3 % 128;
        f8643h = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            int i6 = i4 + 75;
            f8644i = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        c cVar = (c) obj;
        Object obj2 = null;
        if (this.f8649e != cVar.f8649e) {
            int i8 = i4 + 51;
            int i9 = i8 % 128;
            f8644i = i9;
            boolean z2 = i8 % 2 != 0;
            int i10 = i9 + 121;
            f8643h = i10 % 128;
            if (i10 % 2 != 0) {
                return z2;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.f8647c, cVar.f8647c)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8648d, cVar.f8648d)) {
            int i11 = f8643h + 65;
            f8644i = i11 % 128;
            return i11 % 2 != 0;
        }
        if (this.f8645a != cVar.f8645a || this.f8646b != cVar.f8646b) {
            return false;
        }
        int i12 = f8644i + 21;
        f8643h = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iE = bf.a.e();
        int iE2 = bf.a.e();
        return ((Integer) c(bf.a.e(), bf.a.e(), iE2, 373714107, new Object[]{this}, iE, -373714107)).intValue();
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f8643h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8644i = i3 % 128;
        int i4 = i3 % 2;
        long j2 = this.f8649e;
        if (i4 != 0) {
            str = "CombinedConsentEntity(id=" + j2 + ", languageConsentId=" + this.f8647c + ", consents=" + this.f8648d + ", isCompleted=" + this.f8645a + ", isSynced=" + this.f8646b + ")";
            int i5 = 84 / 0;
        } else {
            str = "CombinedConsentEntity(id=" + j2 + ", languageConsentId=" + this.f8647c + ", consents=" + this.f8648d + ", isCompleted=" + this.f8645a + ", isSynced=" + this.f8646b + ")";
        }
        int i6 = f8644i + 91;
        f8643h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static /* synthetic */ c e(c cVar, long j2, String str, Map map, boolean z2, boolean z3, int i2) {
        boolean z4 = z3;
        Map map2 = map;
        boolean z5 = z2;
        String str2 = str;
        long j3 = j2;
        int i3 = 2 % 2;
        int i4 = f8643h + 57;
        int i5 = i4 % 128;
        f8644i = i5;
        if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            j3 = cVar.f8649e;
        }
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i6 = i5 + 49;
            int i7 = i6 % 128;
            f8643h = i7;
            if (i6 % 2 == 0) {
                String str3 = cVar.f8647c;
                obj.hashCode();
                throw null;
            }
            str2 = cVar.f8647c;
            int i8 = i7 + 73;
            f8644i = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 2;
            }
        }
        if ((i2 & 4) != 0) {
            int i10 = f8643h + 23;
            f8644i = i10 % 128;
            if (i10 % 2 != 0) {
                Map<String, Boolean> map3 = cVar.f8648d;
                obj.hashCode();
                throw null;
            }
            map2 = cVar.f8648d;
        }
        if ((i2 & 8) != 0) {
            z5 = cVar.f8645a;
        }
        if ((i2 & 16) != 0) {
            z4 = cVar.f8646b;
        }
        return e(j3, str2, map2, z5, z4);
    }

    private static c e(long j2, String str, Map<String, Boolean> map, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        c cVar = new c(j2, str, map, z2, z3);
        int i3 = f8644i + 35;
        f8643h = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    public final long b() {
        int iE = bf.a.e();
        int iE2 = bf.a.e();
        return ((Long) c(bf.a.e(), bf.a.e(), iE2, 340780288, new Object[]{this}, iE, -340780287)).longValue();
    }
}
