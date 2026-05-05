package com.incode.welcome_sdk.commons.utils;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class al {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f6417k = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f6419m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f6420n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f6421o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final al f6409c = new al();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Regex f6410d = new Regex("^([A-Za-zÁáÉéÍíÓóÚúÑñÇçÃãÕõÜü]+(([- ']|\\.\\s?)[A-Za-zÁáÉéÍíÓóÚúÑñÇçÃãÕõÜü]+)*)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Regex f6411e = new Regex("^([A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\\d])(\\d)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Regex f6407a = new Regex("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Regex f6408b = new Regex("^\\+[1-9]\\d{7,14}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Regex f6413g = new Regex("^\\d{5}$|^\\d{9}$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Regex f6415i = new Regex("^[A-Z]{2}$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Regex f6412f = new Regex("^\\d{5}$|^\\d{8}$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Regex f6416j = new Regex("^\\d{9}$|\\d{3}-\\d{2}-\\d{4}$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Regex f6414h = new Regex("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11}");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Regex f6418l = new Regex("\\d");

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = i6 | i2;
        int i9 = ~i2;
        int i10 = ~i3;
        int i11 = ~(i9 | i10);
        int i12 = ~i6;
        int i13 = i11 | (~(i12 | i3));
        int i14 = ~(i10 | i6);
        int i15 = i13 | i14;
        int i16 = (~(i3 | i12 | i2)) | i14;
        int i17 = i6 + i2 + i4 + (1881146393 * i7) + ((-1035018111) * i5);
        int i18 = i17 * i17;
        int i19 = ((i6 * (-1924067824)) - 304087040) + ((-1924067824) * i2) + (i8 * (-674303503)) + ((-674303503) * i15) + (674303503 * i16) + (1696595968 * i4) + (1612709888 * i7) + ((-182452224) * i5) + ((-1611137024) * i18);
        int i20 = (i6 * (-928100048)) + 945860906 + (i2 * (-928100048)) + (i8 * (-189)) + (i15 * (-189)) + (i16 * 189) + (i4 * (-928100237)) + (i7 * (-1331189957)) + (i5 * 1329932787) + (i18 * 1550319616);
        if (i19 + (i20 * i20 * 1690828800) != 1) {
            return d(objArr);
        }
        CharSequence charSequence = (CharSequence) objArr[0];
        int i21 = 2 % 2;
        int i22 = f6419m + 31;
        f6420n = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean zMatches = f6412f.matches(charSequence);
        int i24 = f6419m + 25;
        f6420n = i24 % 128;
        int i25 = i24 % 2;
        return Boolean.valueOf(zMatches);
    }

    private al() {
    }

    static {
        int i2 = f6421o + 51;
        f6417k = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Regex b() {
        int i2 = 2 % 2;
        int i3 = f6419m + 107;
        int i4 = i3 % 128;
        f6420n = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Regex regex = f6408b;
        int i5 = i4 + 87;
        f6419m = i5 % 128;
        if (i5 % 2 == 0) {
            return regex;
        }
        throw null;
    }

    public static boolean e(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6419m + 19;
        f6420n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean zMatches = f6410d.matches(charSequence);
        int i5 = f6419m + 1;
        f6420n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return zMatches;
    }

    public static boolean c(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6419m + 123;
        f6420n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return f6411e.matches(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        f6411e.matches(charSequence);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean d(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6420n + 89;
        f6419m = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return f6407a.matches(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        int i4 = 42 / 0;
        return f6407a.matches(charSequence);
    }

    public static boolean a(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6420n + 67;
        f6419m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean zMatches = f6408b.matches(charSequence);
        int i5 = f6420n + 67;
        f6419m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return zMatches;
    }

    public static boolean b(CharSequence charSequence) {
        boolean zMatches;
        int i2 = 2 % 2;
        int i3 = f6419m + 67;
        f6420n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            zMatches = f6413g.matches(charSequence);
            int i4 = 26 / 0;
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            zMatches = f6413g.matches(charSequence);
        }
        int i5 = f6419m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f6420n = i5 % 128;
        if (i5 % 2 != 0) {
            return zMatches;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        CharSequence charSequence = (CharSequence) objArr[0];
        int i2 = 2 % 2;
        int i3 = f6419m + 101;
        f6420n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            f6415i.matches(charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean zMatches = f6415i.matches(charSequence);
        int i4 = f6419m + 37;
        f6420n = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zMatches);
    }

    public static boolean i(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6420n + 61;
        f6419m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            f6416j.matches(charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean zMatches = f6416j.matches(charSequence);
        int i4 = f6420n + 21;
        f6419m = i4 % 128;
        int i5 = i4 % 2;
        return zMatches;
    }

    public static boolean f(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6419m + 69;
        f6420n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            f6414h.matches(charSequence);
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean zMatches = f6414h.matches(charSequence);
        int i4 = f6420n + 97;
        f6419m = i4 % 128;
        int i5 = i4 % 2;
        return zMatches;
    }

    public static boolean h(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6419m + 53;
        f6420n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return f6418l.containsMatchIn(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        int i4 = 13 / 0;
        return f6418l.containsMatchIn(charSequence);
    }

    public static boolean g(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        return ((Boolean) d(-2126822359, b.a.e.d(), b.a.e.d(), b.a.e.d(), 2126822360, objArr, b.a.e.d())).booleanValue();
    }

    public static boolean j(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        return ((Boolean) d(1637345827, b.a.e.d(), b.a.e.d(), b.a.e.d(), -1637345827, objArr, b.a.e.d())).booleanValue();
    }
}
