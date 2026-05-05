package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class Indicator {
    private static int C = 1;
    private static int D = 0;
    private RtlMode A;
    private AnimationType B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f6174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f6179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f6180s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Orientation f6184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f6185x;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6181t = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f6186y = -1;

    public static /* synthetic */ Object d(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~(i2 | i3);
        int i9 = ~i2;
        int i10 = ~i3;
        int i11 = i9 | i10;
        int i12 = i8 | (~(i11 | i5));
        int i13 = i10 | i2;
        int i14 = (~i11) | i5;
        int i15 = i5 + i2 + i7 + ((-1587644119) * i4) + (1302866265 * i6);
        int i16 = i15 * i15;
        int i17 = (i5 * (-1579585154)) + 1163788288 + ((-1579585154) * i2) + ((-914001539) * i12) + (i13 * 914001539) + (914001539 * i14) + ((-665583616) * i7) + (1500774400 * i4) + ((-1456209920) * i6) + ((-2144468992) * i16);
        int i18 = ((i5 * (-855313886)) - 1253577507) + (i2 * (-855313886)) + (i12 * (-13)) + (i13 * 13) + (i14 * 13) + (i7 * (-855313873)) + (i4 * (-1467678585)) + (i6 * 593082711) + (i16 * 74579968);
        int i19 = i17 + (i18 * i18 * (-1668153344));
        if (i19 == 1) {
            return b(objArr);
        }
        if (i19 == 2) {
            return c(objArr);
        }
        if (i19 == 3) {
            return e(objArr);
        }
        if (i19 != 4) {
            return d(objArr);
        }
        Indicator indicator = (Indicator) objArr[0];
        int i20 = 2 % 2;
        int i21 = C + 51;
        int i22 = i21 % 128;
        D = i22;
        int i23 = i21 % 2;
        int i24 = indicator.f6168g;
        int i25 = i22 + 53;
        C = i25 % 128;
        int i26 = i25 % 2;
        return Integer.valueOf(i24);
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = C + 61;
        D = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f6164c;
        if (i4 != 0) {
            int i6 = 75 / 0;
        }
        return i5;
    }

    public void setHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 97;
        D = i5 % 128;
        if (i5 % 2 != 0) {
            this.f6164c = i2;
            int i6 = 14 / 0;
        } else {
            this.f6164c = i2;
        }
        int i7 = i4 + 57;
        D = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = C + 5;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f6162a;
        }
        throw null;
    }

    public void setWidth(int i2) {
        int i3 = 2 % 2;
        int i4 = C + 79;
        int i5 = i4 % 128;
        D = i5;
        int i6 = i4 % 2;
        this.f6162a = i2;
        int i7 = i5 + 67;
        C = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Indicator indicator = (Indicator) objArr[0];
        int i2 = 2 % 2;
        int i3 = C + 77;
        D = i3 % 128;
        int i4 = i3 % 2;
        int i5 = indicator.f6165d;
        if (i4 == 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public void setRadius(int i2) {
        int i3 = 2 % 2;
        int i4 = C + 91;
        D = i4 % 128;
        if (i4 % 2 == 0) {
            this.f6165d = i2;
            return;
        }
        this.f6165d = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = D + 83;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        int i6 = this.f6163b;
        int i7 = i4 + 83;
        D = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setPadding(int i2) {
        int i3 = 2 % 2;
        int i4 = D;
        int i5 = i4 + 63;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            this.f6163b = i2;
            int i6 = 73 / 0;
        } else {
            this.f6163b = i2;
        }
        int i7 = i4 + 63;
        C = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = D + 5;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        int i6 = this.f6166e;
        int i7 = i4 + 99;
        D = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPaddingLeft(int i2) {
        int i3 = 2 % 2;
        int i4 = C + 47;
        int i5 = i4 % 128;
        D = i5;
        int i6 = i4 % 2;
        this.f6166e = i2;
        int i7 = i5 + 35;
        C = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Indicator indicator = (Indicator) objArr[0];
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 113;
        D = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        int i6 = indicator.f6170i;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i3 + 47;
        D = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i6);
        }
        obj.hashCode();
        throw null;
    }

    public void setPaddingTop(int i2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 87;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            this.f6170i = i2;
            int i6 = i4 + 19;
            D = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f6170i = i2;
        throw null;
    }

    public final int h() {
        int i2 = 2 % 2;
        int i3 = D + 89;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        int i6 = this.f6169h;
        int i7 = i4 + 123;
        D = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPaddingRight(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 109;
        int i5 = i4 % 128;
        C = i5;
        int i6 = i4 % 2;
        this.f6169h = i2;
        int i7 = i5 + 121;
        D = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPaddingBottom(int i2) {
        int i3 = 2 % 2;
        int i4 = C + 73;
        D = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6168g = i2;
            int i5 = 89 / 0;
        } else {
            this.f6168g = i2;
        }
    }

    public final int j() {
        int i2 = 2 % 2;
        int i3 = C + 113;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        int i6 = this.f6171j;
        int i7 = i4 + 47;
        C = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public void setStroke(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 11;
        C = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6171j = i2;
        } else {
            this.f6171j = i2;
            throw null;
        }
    }

    public final float g() {
        int i2 = 2 % 2;
        int i3 = D + 95;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f6167f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setScaleFactor(float f2) {
        int i2 = 2 % 2;
        int i3 = C + 93;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            this.f6167f = f2;
        } else {
            this.f6167f = f2;
            throw null;
        }
    }

    public final int n() {
        int i2 = 2 % 2;
        int i3 = D + 75;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        int i6 = this.f6173l;
        int i7 = i4 + 115;
        D = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setUnselectedColor(int i2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 69;
        D = i5 % 128;
        int i6 = i5 % 2;
        this.f6173l = i2;
        int i7 = i4 + 63;
        D = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Indicator indicator = (Indicator) objArr[0];
        int i2 = 2 % 2;
        int i3 = C + 123;
        D = i3 % 128;
        int i4 = i3 % 2;
        int i5 = indicator.f6175n;
        if (i4 == 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSelectedColor(int i2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 79;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            this.f6175n = i2;
            int i6 = i4 + 9;
            D = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        this.f6175n = i2;
        throw null;
    }

    public final boolean l() {
        int i2 = 2 % 2;
        int i3 = C + 87;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f6174m;
        int i6 = i4 + 9;
        C = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public void setInteractiveAnimation(boolean z2) {
        int i2 = 2 % 2;
        int i3 = D + 3;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            this.f6174m = z2;
            return;
        }
        this.f6174m = z2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean m() {
        int i2 = 2 % 2;
        int i3 = C + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f6176o;
        int i6 = i4 + 43;
        C = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 50 / 0;
        }
        return z2;
    }

    public void setAutoVisibility(boolean z2) {
        int i2 = 2 % 2;
        int i3 = D;
        int i4 = i3 + 37;
        C = i4 % 128;
        int i5 = i4 % 2;
        this.f6176o = z2;
        int i6 = i3 + 81;
        C = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean o() {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 95;
        D = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f6172k;
        int i5 = i3 + 101;
        D = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return z2;
    }

    public void setDynamicCount(boolean z2) {
        int i2 = 2 % 2;
        int i3 = C + 89;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            this.f6172k = z2;
            return;
        }
        this.f6172k = z2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean s() {
        int i2 = 2 % 2;
        int i3 = D;
        int i4 = i3 + 117;
        C = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f6178q;
        int i5 = i3 + 67;
        C = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public void setFadeOnIdle(boolean z2) {
        int i2 = 2 % 2;
        int i3 = C + 45;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        this.f6178q = z2;
        int i6 = i4 + 113;
        C = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setIdle(boolean z2) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 51;
        D = i4 % 128;
        int i5 = i4 % 2;
        this.f6177p = z2;
        int i6 = i3 + 77;
        D = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
    }

    public final long p() {
        int i2 = 2 % 2;
        int i3 = D + 7;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        long j2 = this.f6179r;
        int i6 = i4 + 59;
        D = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    public void setIdleDuration(long j2) {
        int i2 = 2 % 2;
        int i3 = D + 37;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        this.f6179r = j2;
        int i6 = i4 + 41;
        D = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 53 / 0;
        }
    }

    public final long t() {
        long j2;
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 43;
        D = i4 % 128;
        if (i4 % 2 != 0) {
            j2 = this.f6180s;
            int i5 = 9 / 0;
        } else {
            j2 = this.f6180s;
        }
        int i6 = i3 + 103;
        D = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
        return j2;
    }

    public void setAnimationDuration(long j2) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 79;
        D = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6180s = j2;
            int i5 = 2 / 0;
        } else {
            this.f6180s = j2;
        }
        int i6 = i3 + 105;
        D = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
    }

    public final int r() {
        int i2 = 2 % 2;
        int i3 = C + 83;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        int i6 = this.f6181t;
        int i7 = i4 + 91;
        C = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 48 / 0;
        }
        return i6;
    }

    public void setCount(int i2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 15;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            this.f6181t = i2;
            int i6 = i4 + 67;
            D = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f6181t = i2;
        throw null;
    }

    public final int q() {
        int i2 = 2 % 2;
        int i3 = C + 121;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f6185x;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSelectedPosition(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 13;
        int i5 = i4 % 128;
        C = i5;
        int i6 = i4 % 2;
        this.f6185x = i2;
        int i7 = i5 + 97;
        D = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 86 / 0;
        }
    }

    public final int x() {
        int i2 = 2 % 2;
        int i3 = D + 3;
        C = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f6183v;
        if (i4 == 0) {
            int i6 = 31 / 0;
        }
        return i5;
    }

    public void setSelectingPosition(int i2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 109;
        D = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            this.f6183v = i2;
            int i6 = i4 + 15;
            D = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f6183v = i2;
        obj.hashCode();
        throw null;
    }

    public final int u() {
        int i2 = 2 % 2;
        int i3 = D + 69;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f6182u;
        }
        throw null;
    }

    public void setLastSelectedPosition(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 9;
        int i5 = i4 % 128;
        C = i5;
        if (i4 % 2 == 0) {
            this.f6182u = i2;
            int i6 = 87 / 0;
        } else {
            this.f6182u = i2;
        }
        int i7 = i5 + 47;
        D = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Indicator indicator = (Indicator) objArr[0];
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 83;
        D = i4 % 128;
        int i5 = i4 % 2;
        int i6 = indicator.f6186y;
        int i7 = i3 + 89;
        D = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i6);
        }
        int i8 = 74 / 0;
        return Integer.valueOf(i6);
    }

    public void setViewPagerId(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 61;
        int i5 = i4 % 128;
        C = i5;
        if (i4 % 2 == 0) {
            this.f6186y = i2;
            int i6 = 48 / 0;
        } else {
            this.f6186y = i2;
        }
        int i7 = i5 + 61;
        D = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Orientation w() {
        int i2 = 2 % 2;
        if (this.f6184w == null) {
            int i3 = C + 99;
            D = i3 % 128;
            if (i3 % 2 != 0) {
                this.f6184w = Orientation.HORIZONTAL;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.f6184w = Orientation.HORIZONTAL;
            int i4 = D + 115;
            C = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.f6184w;
    }

    public void setOrientation(Orientation orientation) {
        int i2 = 2 % 2;
        int i3 = D;
        int i4 = i3 + 49;
        C = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6184w = orientation;
            int i5 = i3 + 19;
            C = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 37 / 0;
                return;
            }
            return;
        }
        this.f6184w = orientation;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType v() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.C
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.D = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L25
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType r1 = r3.B
            r0 = 7
            int r0 = r0 / 0
            if (r1 != 0) goto L22
        L15:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType.NONE
            r3.B = r0
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.C
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.D = r0
            int r1 = r1 % r2
        L22:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType r0 = r3.B
            return r0
        L25:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType r0 = r3.B
            if (r0 != 0) goto L22
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.v():com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType");
    }

    public void setAnimationType(AnimationType animationType) {
        int i2 = 2 % 2;
        int i3 = D + 17;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        this.B = animationType;
        int i6 = i4 + 9;
        D = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RtlMode A() {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 67;
        D = i4 % 128;
        if (i4 % 2 == 0) {
            if (this.A == null) {
                int i5 = i3 + 37;
                D = i5 % 128;
                int i6 = i5 % 2;
                this.A = RtlMode.Off;
                int i7 = D + 41;
                C = i7 % 128;
                int i8 = i7 % 2;
            }
            return this.A;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRtlMode(RtlMode rtlMode) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 117;
        D = i4 % 128;
        if (i4 % 2 == 0) {
            this.A = rtlMode;
            int i5 = i3 + 89;
            D = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.A = rtlMode;
        throw null;
    }

    public final int y() {
        int iC = w.c();
        int iC2 = w.c();
        return ((Integer) d(1501396327, iC, w.c(), new Object[]{this}, -1501396326, w.c(), iC2)).intValue();
    }

    public final int k() {
        int iC = w.c();
        int iC2 = w.c();
        return ((Integer) d(1903576326, iC, w.c(), new Object[]{this}, -1903576323, w.c(), iC2)).intValue();
    }

    public final int i() {
        int iC = w.c();
        int iC2 = w.c();
        return ((Integer) d(268478617, iC, w.c(), new Object[]{this}, -268478613, w.c(), iC2)).intValue();
    }

    public final int f() {
        int iC = w.c();
        int iC2 = w.c();
        return ((Integer) d(-1188935359, iC, w.c(), new Object[]{this}, 1188935361, w.c(), iC2)).intValue();
    }

    public final int e() {
        int iC = w.c();
        int iC2 = w.c();
        return ((Integer) d(1089547635, iC, w.c(), new Object[]{this}, -1089547635, w.c(), iC2)).intValue();
    }
}
