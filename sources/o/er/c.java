package o.er;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f24822a = 2072819276;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f24823b = -676996853;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f24824c = 557620432;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f24825d = -830113358;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f24826e = -1671501009;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f24827f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f24828i = -869164866;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24829j = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24830g;

    public c(boolean z2) {
        this.f24830g = z2;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24829j;
        int i4 = (i3 ^ 123) + (((-1) - (((-1) - i3) | ((-1) - 123))) << 1);
        f24827f = i4 % 128;
        if (i4 % 2 != 0) {
            super.finalize();
            throw null;
        }
        super.finalize();
        int i5 = f24829j;
        int i6 = (((i5 + 113) - (113 & i5)) << 1) - (i5 ^ 113);
        f24827f = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f24827f + 57;
        f24829j = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        if (i4 == 0) {
            int i5 = 23 / 0;
        }
        int i6 = f24829j;
        int i7 = (i6 & 43) + (i6 | 43);
        f24827f = i7 % 128;
        if (i7 % 2 == 0) {
            return Boolean.valueOf(zEquals);
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24829j + 97;
        f24827f = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        if (i4 != 0) {
            int i5 = 41 / 0;
        }
        return string;
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~((-1) - (((-1) - ((-1) - (((-1) - (~i6)) & ((-1) - i4)))) & ((-1) - i2)));
        int i9 = ~((~i4) | i6);
        int i10 = ~i2;
        int i11 = ~(i10 | i6);
        int i12 = (i9 + i11) - (i9 & i11);
        int i13 = ~(i10 | i4);
        int i14 = i6 + i4 + i7 + ((-1568348280) * i5) + (1617068012 * i3);
        int i15 = i14 * i14;
        int i16 = (((-430874860) * i6) - 739508224) + (1544986862 * i4) + (i8 * 987930861) + ((-987930861) * i12) + (987930861 * i13) + (557056000 * i7) + ((-1885339648) * i5) + (1743781888 * i3) + (858456064 * i15);
        int i17 = (i6 * (-973781596)) + 539565670 + (i4 * (-973779706)) + (i8 * 945) + (i12 * (-945)) + (i13 * 945) + (i7 * (-973780651)) + (i5 * 424585256) + (i3 * 537576796) + (i15 * 1078394880);
        int i18 = i16 + (i17 * i17 * 192741376);
        return i18 != 1 ? i18 != 2 ? c(objArr) : a(objArr) : b(objArr);
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f24829j;
        int i4 = (((i3 + 85) - (85 & i3)) << 1) - (i3 ^ 85);
        int i5 = i4 % 128;
        f24827f = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f24830g;
        int i6 = (i5 ^ 115) + ((i5 & 115) << 1);
        f24829j = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f24822a * 1114782917;
        f24822a = i2;
        int i3 = f24823b * (-2062377397);
        f24823b = i3;
        int i4 = 330196764 * f24826e;
        f24826e = i4;
        return ((Boolean) e(iMaxMemory, i4, new Object[]{this, obj}, -2140968162, i3, 2140968163, i2)).booleanValue();
    }

    protected final void finalize() throws Throwable {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i2 = f24828i * 2112303579;
        f24828i = i2;
        e(iUptimeMillis, i2, new Object[]{this}, -1320221994, iUptimeMillis2, 1320221996, iFreeMemory);
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f24829j + 61;
        f24827f = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f24827f;
        int i6 = ((i5 + 55) - (55 | i5)) + (i5 | 55);
        f24829j = i6 % 128;
        if (i6 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f24825d * (-1151104518);
        f24825d = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = f24824c * 423417655;
        f24824c = i3;
        return (String) e(iElapsedRealtime, i3, new Object[]{this}, 1551357679, id, -1551357679, i2);
    }
}
