package o.er;

import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f24985a = 2017848963;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f24986b = 1059969840;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f24987c = -1187010817;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f24988d = 1654875446;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f24989e = 1888248803;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f24990f = 1400077560;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f24991i = -488561417;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f24992l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f24993o = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24995h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24996j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24997n;

    public f(String str, String str2, String str3, boolean z2) {
        this.f24996j = str;
        this.f24994g = str2;
        this.f24995h = str3;
        this.f24997n = z2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        f fVar = (f) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24992l;
        int i4 = (((i3 + 101) - (101 & i3)) << 1) - (i3 ^ 101);
        f24993o = i4 % 128;
        int i5 = i4 % 2;
        String str = fVar.f24996j;
        if (i5 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = (i5 + i7) - (i5 & i7);
        int i9 = ~i2;
        int i10 = ~i7;
        int i11 = ~((i9 + i10) - (i9 & i10));
        int i12 = (~(i7 | i9)) | (~(i10 | i5));
        int i13 = i5 + i2 + i3 + (1389894630 * i4) + ((-1243605516) * i6);
        int i14 = i13 * i13;
        int i15 = ((-345998475) * i5) + 1335230464 + (862422157 * i2) + ((-1543273332) * i8) + (i11 * 1543273332) + (1543273332 * i12) + ((-1889271808) * i3) + (1607991296 * i4) + ((-548405248) * i6) + ((-1553596416) * i14);
        int i16 = ((i5 * (-88671125)) - 261777699) + (i2 * (-88671149)) + (i8 * (-12)) + (i11 * 12) + (i12 * 12) + (i3 * (-88671137)) + (i4 * (-349388198)) + (i6 * (-147040884)) + (i14 * 182059008);
        int i17 = i15 + (i16 * i16 * (-132513792));
        if (i17 == 1) {
            f fVar = (f) objArr[0];
            int i18 = 2 % 2;
            int i19 = f24993o;
            int i20 = (((i19 + 35) - (35 & i19)) << 1) - (i19 ^ 35);
            f24992l = i20 % 128;
            int i21 = i20 % 2;
            int iHash = Objects.hash(fVar.f24996j, fVar.f24994g, fVar.f24995h);
            int i22 = f24992l + 55;
            f24993o = i22 % 128;
            int i23 = i22 % 2;
            return Integer.valueOf(iHash);
        }
        if (i17 == 2) {
            return a(objArr);
        }
        f fVar2 = (f) objArr[0];
        int i24 = 2 % 2;
        int i25 = f24993o;
        int i26 = (i25 ^ 71) + (((-1) - (((-1) - i25) | ((-1) - 71))) << 1);
        f24992l = i26 % 128;
        int i27 = i26 % 2;
        fVar2.f24997n = false;
        int i28 = ((i25 + 51) - (51 | i25)) + (i25 | 51);
        f24992l = i28 % 128;
        int i29 = i28 % 2;
        return fVar2;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f24993o;
        int i4 = i3 + 35;
        f24992l = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f24997n;
        int i6 = (i3 ^ 55) + (((i3 + 55) - (i3 | 55)) << 1);
        f24992l = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f24992l;
        int i4 = (i3 ^ 7) + ((i3 & 7) << 1);
        int i5 = i4 % 128;
        f24993o = i5;
        int i6 = i4 % 2;
        String str = this.f24994g;
        int i7 = (i5 ^ 17) + (((-1) - (((-1) - i5) | ((-1) - 17))) << 1);
        f24992l = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f24992l;
        int i4 = (i3 ^ 81) + ((i3 & 81) << 1);
        int i5 = i4 % 128;
        f24993o = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f24995h;
        int i6 = i5 + 47;
        f24992l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int iActiveCount = Thread.activeCount();
        int i2 = (-319723722) * f24986b;
        f24986b = i2;
        int i3 = 1454362011 * f24990f;
        f24990f = i3;
        int i4 = f24991i * (-733680792);
        f24991i = i4;
        return (String) c(1370509635, i2, i3, new Object[]{this}, -1370509633, i4, iActiveCount);
    }

    public final f e() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = 2098304980 * f24988d;
        f24988d = i2;
        int iActiveCount = Thread.activeCount();
        int i3 = f24985a * (-869981758);
        f24985a = i3;
        return (f) c(1560265932, i2, iActiveCount, new Object[]{this}, -1560265932, i3, iFreeMemory);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f24992l;
        int i4 = i3 + 37;
        f24993o = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            boolean z2 = obj instanceof f;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof f)) {
            int i5 = (i3 ^ 97) + (((-1) - (((-1) - i3) | ((-1) - 97))) << 1);
            f24993o = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return false;
        }
        f fVar = (f) obj;
        String str = this.f24996j;
        int iActiveCount = Thread.activeCount();
        int i7 = f24986b * (-319723722);
        f24986b = i7;
        int i8 = f24990f * 1454362011;
        f24990f = i8;
        int i9 = f24991i * (-733680792);
        f24991i = i9;
        if (Objects.equals(str, (String) c(1370509635, i7, i8, new Object[]{fVar}, -1370509633, i9, iActiveCount))) {
            int i10 = f24993o + 19;
            f24992l = i10 % 128;
            int i11 = i10 % 2;
            if (Objects.equals(this.f24994g, fVar.b())) {
                int i12 = f24992l;
                int i13 = (i12 ^ 61) + (((-1) - (((-1) - i12) | ((-1) - 61))) << 1);
                f24993o = i13 % 128;
                int i14 = i13 % 2;
                if (Objects.equals(this.f24995h, fVar.f24995h) && this.f24997n == fVar.f24997n) {
                    int i15 = f24993o + 105;
                    int i16 = i15 % 128;
                    f24992l = i16;
                    int i17 = i15 % 2;
                    int i18 = ((-1) - (((-1) - i16) | ((-1) - 115))) + ((-1) - (((-1) - i16) & ((-1) - 115)));
                    f24993o = i18 % 128;
                    if (i18 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = f24989e * (-989075790);
        f24989e = i2;
        int priority = Thread.currentThread().getPriority();
        int iNextInt = new Random().nextInt();
        int i3 = f24987c * (-1844563153);
        f24987c = i3;
        return ((Integer) c(687278824, priority, iNextInt, new Object[]{this}, -687278823, i3, i2)).intValue();
    }
}
