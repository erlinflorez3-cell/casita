package o.bl;

import android.os.Process;
import android.os.SystemClock;
import o.bg.c;
import o.ef.a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21373a = -1315407808;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f21374b = -49722358;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21375c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f21376d = -1373969364;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f21377e = 88776851;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21378h = 1;

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws CloneNotSupportedException {
        int i8 = ~((i2 + i4) - (i2 & i4));
        int i9 = (~i5) | (~i4);
        int i10 = (-1) - (((-1) - (~i9)) & ((-1) - i2));
        int i11 = ((-1) - (((-1) - (~(i4 | i5))) & ((-1) - (~((-1) - (((-1) - (~i2)) & ((-1) - i5))))))) | (~(i9 | i2));
        int i12 = i5 + i2 + i7 + ((-101282902) * i3) + ((-829309908) * i6);
        int i13 = i12 * i12;
        int i14 = ((i5 * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i8) + (1828579084 * i10) + (1233194106 * i11) + ((-1190395904) * i7) + (1710751744 * i3) + ((-1643118592) * i6) + ((-1134166016) * i13);
        int i15 = (i5 * 1745018779) + 1790267665 + (i2 * 1745018779) + (i8 * (-58)) + (i10 * (-116)) + (i11 * 58) + (i7 * 1745018721) + (i3 * (-1587019414)) + (i6 * (-1871011668)) + (i13 * 1017511936);
        if (i14 + (i15 * i15 * (-1139146752)) == 1) {
            int i16 = 2 % 2;
            throw new CloneNotSupportedException();
        }
        e eVar = (e) objArr[0];
        int i17 = 2 % 2;
        int i18 = f21375c + 107;
        f21378h = i18 % 128;
        int i19 = i18 % 2;
        String string = super.toString();
        int i20 = f21378h;
        int i21 = (i20 ^ 55) + ((i20 & 55) << 1);
        f21375c = i21 % 128;
        int i22 = i21 % 2;
        return string;
    }

    public abstract c a(c cVar);

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = f21373a * 1770956062;
        f21373a = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        return e(-1844617361, Process.myTid(), new Object[]{this}, i2, 1844617362, (int) Process.getElapsedCpuTime(), iUptimeMillis);
    }

    public abstract a e() throws o.ef.b;

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f21375c + 51;
        f21378h = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f21375c;
        int i6 = (i5 ^ 85) + ((i5 & 85) << 1);
        f21378h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21375c;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 123))) + (i3 | 123);
        f21378h = i4 % 128;
        int i5 = i4 % 2;
        super.finalize();
        int i6 = f21375c + 27;
        f21378h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 99 / 0;
        }
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f21378h + 13;
        f21375c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int priority = Thread.currentThread().getPriority();
        int i2 = f21376d * 628084205;
        f21376d = i2;
        int i3 = 1712248444 * f21374b;
        f21374b = i3;
        int i4 = f21377e * (-1880563367);
        f21377e = i4;
        return (String) e(1604357940, i3, new Object[]{this}, priority, -1604357940, i4, i2);
    }
}
