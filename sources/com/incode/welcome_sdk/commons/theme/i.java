package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.local.db.c.a.z;
import cz.msebera.android.httpclient.impl.client.cache.CacheValidityPolicy;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f5714g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f5716i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f5718k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f5719l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f5720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f5721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f5722o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f5723p = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f5712e = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f5709b = ColorKt.Color(1509949439);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f5711d = ColorKt.Color(2164260863L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f5708a = ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f5710c = ColorKt.Color(4278221567L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f5713f = ColorKt.Color(4293259519L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f5717j = ColorKt.Color(4292467161L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f5715h = ColorKt.Color(4282795076L);

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~(i8 | i6);
        int i10 = ~(i6 | i3);
        int i11 = i8 | (~i6);
        int i12 = i10 | (~(i11 | i5));
        int i13 = (~i5) | i11;
        int i14 = i6 + i3 + i7 + (1134938392 * i4) + ((-1730424158) * i2);
        int i15 = i14 * i14;
        int i16 = (1345404558 * i6) + 1061748736 + ((-382549644) * i3) + (1727954202 * i9) + ((-1283506547) * i12) + (1283506547 * i13) + ((-1666056192) * i7) + (1924136960 * i4) + (748945408 * i2) + (912850944 * i15);
        int i17 = (i6 * 1914917686) + 639827133 + (i3 * 1914918628) + (i9 * (-942)) + (i12 * (-471)) + (i13 * 471) + (i7 * 1914918157) + (i4 * (-1451741640)) + (i2 * (-1338016710)) + (i15 * (-1605042176));
        return i16 + ((i17 * i17) * (-230752256)) != 1 ? e(objArr) : b(objArr);
    }

    private i() {
    }

    static {
        ColorKt.Color(4291414473L);
        ColorKt.Color(4290559164L);
        f5716i = ColorKt.Color(220276539);
        f5714g = ColorKt.Color(4293519851L);
        f5721n = ColorKt.Color(2566914048L);
        f5720m = ColorKt.Color(CacheValidityPolicy.MAX_AGE);
        int i2 = f5723p + 19;
        f5718k = i2 % 128;
        int i3 = i2 % 2;
    }

    public static long e() {
        int i2 = 2 % 2;
        int i3 = f5722o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5719l = i3 % 128;
        if (i3 % 2 == 0) {
            return f5709b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long a() {
        int i2 = 2 % 2;
        int i3 = f5722o + 107;
        int i4 = i3 % 128;
        f5719l = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j2 = f5711d;
        int i5 = i4 + 9;
        f5722o = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    public static long b() {
        int i2 = 2 % 2;
        int i3 = f5722o + 75;
        int i4 = i3 % 128;
        f5719l = i4;
        int i5 = i3 % 2;
        long j2 = f5708a;
        if (i5 != 0) {
            int i6 = 99 / 0;
        }
        int i7 = i4 + 81;
        f5722o = i7 % 128;
        if (i7 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long c() {
        int i2 = 2 % 2;
        int i3 = f5719l + 125;
        f5722o = i3 % 128;
        if (i3 % 2 != 0) {
            return f5710c;
        }
        int i4 = 67 / 0;
        return f5710c;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f5722o;
        int i4 = i3 + 11;
        f5719l = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = f5713f;
        int i5 = i3 + 29;
        f5719l = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j2);
        }
        int i6 = 59 / 0;
        return Long.valueOf(j2);
    }

    public static long f() {
        int i2 = 2 % 2;
        int i3 = f5719l;
        int i4 = i3 + 103;
        f5722o = i4 % 128;
        int i5 = i4 % 2;
        long j2 = f5717j;
        int i6 = i3 + 41;
        f5722o = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public static long h() {
        int i2 = 2 % 2;
        int i3 = f5722o + 105;
        f5719l = i3 % 128;
        if (i3 % 2 == 0) {
            return f5715h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long g() {
        int i2 = 2 % 2;
        int i3 = f5722o + 29;
        f5719l = i3 % 128;
        if (i3 % 2 == 0) {
            return f5716i;
        }
        int i4 = 85 / 0;
        return f5716i;
    }

    public static long i() {
        int i2 = 2 % 2;
        int i3 = f5722o;
        int i4 = i3 + 29;
        f5719l = i4 % 128;
        int i5 = i4 % 2;
        long j2 = f5714g;
        int i6 = i3 + 79;
        f5719l = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public static long j() {
        int i2 = 2 % 2;
        int i3 = f5722o + 7;
        f5719l = i3 % 128;
        if (i3 % 2 == 0) {
            return f5721n;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        long j2;
        int i2 = 2 % 2;
        int i3 = f5722o + 63;
        f5719l = i3 % 128;
        if (i3 % 2 != 0) {
            j2 = f5720m;
            int i4 = 57 / 0;
        } else {
            j2 = f5720m;
        }
        return Long.valueOf(j2);
    }

    public static long l() {
        int iD = z.AnonymousClass5.d();
        int iD2 = z.AnonymousClass5.d();
        return ((Long) b(new Object[0], z.AnonymousClass5.d(), 168739569, z.AnonymousClass5.d(), iD, -168739568, iD2)).longValue();
    }

    public static long d() {
        int iD = z.AnonymousClass5.d();
        int iD2 = z.AnonymousClass5.d();
        return ((Long) b(new Object[0], z.AnonymousClass5.d(), 1533725691, z.AnonymousClass5.d(), iD, -1533725691, iD2)).longValue();
    }
}
