package o.dh;

import android.os.Process;
import android.os.SystemClock;
import java.util.Random;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23009a = 1828854916;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23010b = -647725655;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23011c = 2093099945;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23012d = 2084578836;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23013e = 841242453;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23014f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23017i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23018j = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f23016h = {MessagePack.Code.FIXARRAY_PREFIX, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23015g = 13 % 128;

    static {
        if (13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~((-1) - (((-1) - i8) & ((-1) - i3)));
        int i10 = ~i3;
        int i11 = i9 | (~((-1) - (((-1) - i10) & ((-1) - i2))));
        int i12 = ~((i10 + i6) - (i10 & i6));
        int i13 = i11 | i12;
        int i14 = ~i2;
        int i15 = ~((i14 + i6) - (i14 & i6));
        int i16 = (i12 + i15) - (i12 & i15);
        int i17 = (-1) - (((-1) - (~((-1) - (((-1) - i3) & ((-1) - (i8 | i14)))))) & ((-1) - (~(((-1) - (((-1) - i14) & ((-1) - i10))) | i6))));
        int i18 = i2 + i6 + i5 + ((-1369571145) * i7) + ((-720088171) * i4);
        int i19 = i18 * i18;
        int i20 = (((-954023988) * i2) - 252706816) + ((-260227018) * i6) + ((-346898485) * i13) + (i16 * 346898485) + (346898485 * i17) + ((-607125504) * i5) + (565182464 * i7) + (1611661312 * i4) + ((-409206784) * i19);
        int i21 = ((i2 * (-1931095572)) - 2087550970) + (i6 * (-1931094842)) + (i13 * (-365)) + (i16 * 365) + (i17 * 365) + (i5 * (-1931095207)) + (i7 * (-789048161)) + (i4 * 356376013) + (i19 * 423362560);
        int i22 = i20 + (i21 * i21 * (-1901854720));
        return i22 != 1 ? i22 != 2 ? a(objArr) : e(objArr) : b(objArr);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23014f;
        int i4 = (i3 ^ 43) + (((i3 + 43) - (i3 | 43)) << 1);
        f23018j = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = super.hashCode();
        int i6 = f23018j;
        int i7 = (((-1) - (((-1) - i6) & ((-1) - 49))) << 1) - (i6 ^ 49);
        f23014f = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(iHashCode);
        }
        int i8 = 99 / 0;
        return Integer.valueOf(iHashCode);
    }

    public static byte[] a() {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f23009a * (-2093433746);
        f23009a = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        return (byte[]) a(195285494, iElapsedRealtime, new Random().nextInt(1524627709), new Object[0], i2, -195285492, iUptimeMillis);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23018j + 29;
        f23014f = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f23014f + 39;
        f23018j = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f23018j + 93;
        f23014f = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = (byte[]) f23016h.clone();
        int i5 = f23014f + 89;
        f23018j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return bArr;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23014f;
        int i4 = ((43 | i3) << 1) - (i3 ^ 43);
        f23018j = i4 % 128;
        int i5 = i4 % 2;
        boolean zEquals = super.equals(obj);
        int i6 = f23018j;
        int i7 = ((101 | i6) << 1) - (i6 ^ 101);
        f23014f = i7 % 128;
        if (i7 % 2 == 0) {
            return zEquals;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    protected final void finalize() throws Throwable {
        int i2 = 1047988366 * f23013e;
        f23013e = i2;
        int i3 = f23010b * (-996358800);
        f23010b = i3;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        a(-470370680, i2, (int) SystemClock.elapsedRealtime(), new Object[]{this}, i3, 470370681, elapsedCpuTime);
    }

    public final int hashCode() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f23012d * 855981262;
        f23012d = i3;
        int i4 = (int) Runtime.getRuntime().totalMemory();
        int i5 = 535034225 * f23011c;
        f23011c = i5;
        return ((Integer) a(-14719328, i2, i5, new Object[]{this}, i3, 14719328, i4)).intValue();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23014f;
        int i4 = (i3 ^ 5) + ((i3 & 5) << 1);
        f23018j = i4 % 128;
        int i5 = i4 % 2;
        String string = super.toString();
        int i6 = f23018j;
        int i7 = (i6 ^ 75) + (((-1) - (((-1) - i6) | ((-1) - 75))) << 1);
        f23014f = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }
}
