package o.dr;

import android.os.Process;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23301a = -984844138;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23302b = 31982039;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23303c = 1483789858;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23304d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23305e = 1503639173;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23306g = 1;

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23304d;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 107))) << 1) - (i3 ^ 107);
        f23306g = i4 % 128;
        if (i4 % 2 == 0) {
            super.finalize();
            int i5 = 98 / 0;
        } else {
            super.finalize();
        }
        int i6 = f23306g + 5;
        f23304d = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = ~((-1) - (((-1) - (~i4)) & ((-1) - i9)));
        int i12 = (i11 + i10) - (i11 & i10);
        int i13 = (i5 + i7) - (i5 & i7);
        int i14 = ~((i4 + i9) - (i4 & i9));
        int i15 = (i14 + i10) - (i14 & i10);
        int i16 = i5 + i7 + i2 + (1258674323 * i3) + ((-126594725) * i6);
        int i17 = i16 * i16;
        int i18 = ((-1449289074) * i5) + 1954676736 + ((-212912869) * i7) + (i12 * (-1236376205)) + (i13 * (-1236376205)) + ((-1236376205) * i15) + (1609302016 * i2) + (881065984 * i3) + ((-991690752) * i6) + ((-541982720) * i17);
        int i19 = ((i5 * (-1656160718)) - 817430035) + (i7 * (-1656161339)) + (i12 * 621) + (i13 * 621) + (i15 * 621) + (i2 * (-1656160097)) + (i3 * (-2121497779)) + (i6 * 1378977669) + (i17 * (-275906560));
        return i18 + ((i19 * i19) * (-372375552)) != 1 ? b(objArr) : e(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23306g + 67;
        f23304d = i3 % 128;
        if (i3 % 2 == 0) {
            return Integer.valueOf(super.hashCode());
        }
        super.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23306g;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 89))) << 1) - (i3 ^ 89);
        f23304d = i4 % 128;
        if (i4 % 2 != 0) {
            super.equals(obj);
            throw null;
        }
        boolean zEquals = super.equals(obj);
        int i5 = f23304d + 107;
        f23306g = i5 % 128;
        int i6 = i5 % 2;
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int iNextInt = new Random().nextInt(2049501951);
        int iMyUid = Process.myUid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = (-1832214797) * f23302b;
        f23302b = i2;
        c(iMyUid, iFreeMemory, iNextInt, -908392629, i2, 908392629, new Object[]{this});
    }

    public final int hashCode() {
        int i2 = f23303c * 1166884710;
        f23303c = i2;
        int i3 = f23301a * (-432847119);
        f23301a = i3;
        int i4 = f23305e * 129881807;
        f23305e = i4;
        return ((Integer) c(i3, i4, i2, 1076051294, Process.myPid(), -1076051293, new Object[]{this})).intValue();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23306g;
        int i4 = (((i3 + 101) - (101 & i3)) << 1) - (i3 ^ 101);
        f23304d = i4 % 128;
        int i5 = i4 % 2;
        String string = super.toString();
        if (i5 != 0) {
            int i6 = 62 / 0;
        }
        return string;
    }
}
