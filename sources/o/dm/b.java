package o.dm;

import android.os.Process;
import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Arrays;
import java.util.Random;
import o.dl.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23194a = 1295605988;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23195b = 1790020512;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23196e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23197j = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f23198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f23199d;

    public b(String str, byte[] bArr) {
        this.f23199d = d.e(str);
        this.f23198c = bArr;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23196e + 79;
        int i4 = i3 % 128;
        f23197j = i4;
        int i5 = i3 % 2;
        byte[] bArr = bVar.f23198c;
        int i6 = i4 + 113;
        f23196e = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private byte[] a() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        return (byte[]) c(1180130689, -1180130689, new Random().nextInt(), new Object[]{this}, elapsedCpuTime, (int) Thread.currentThread().getId(), i2);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        b bVar = (b) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f23197j;
        int i4 = ((i3 + 65) - (65 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 65)));
        f23196e = i4 % 128;
        int i5 = i4 % 2;
        boolean zEquals = super.equals(obj);
        int i6 = f23196e + 51;
        f23197j = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(zEquals);
        }
        throw null;
    }

    private byte[] b() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        return (byte[]) c(973009685, -973009683, (int) Runtime.getRuntime().maxMemory(), new Object[]{this}, i2, (int) SystemClock.uptimeMillis(), iElapsedRealtime);
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) throws Throwable {
        byte[] bArrE;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = (~((-1) - (((-1) - (~i5)) & ((-1) - i8)))) | i10;
        int i12 = ~((i5 + i8) - (i5 & i8));
        int i13 = (i12 + i10) - (i12 & i10);
        int i14 = ~((i9 + i3) - (i9 & i3));
        int i15 = i3 + i2 + i7 + (104229478 * i4) + ((-1414784667) * i6);
        int i16 = i15 * i15;
        int i17 = ((i3 * (-393484327)) - 513802240) + ((-393484327) * i2) + (i11 * 23337000) + (i13 * 23337000) + (23337000 * i14) + ((-370147328) * i7) + ((-1784676352) * i4) + ((-1146093568) * i6) + ((-1043988480) * i16);
        int i18 = ((i3 * 256725217) - 1927268364) + (i2 * 256725217) + (i11 * 872) + (i13 * 872) + (i14 * 872) + (i7 * 256726089) + (i4 * (-1692676330)) + (i6 * (-87465523)) + (i16 * 964034560);
        int i19 = i17 + (i18 * i18 * (-1055260672));
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? a(objArr) : b(objArr) : c(objArr);
        }
        b bVar = (b) objArr[0];
        int i20 = 2 % 2;
        int i21 = f23197j;
        int i22 = (((-1) - (((-1) - i21) & ((-1) - 19))) << 1) - (i21 ^ 19);
        f23196e = i22 % 128;
        int i23 = i22 % 2;
        Object[] objArr2 = {bVar};
        Runtime runtime = Runtime.getRuntime();
        if (i23 != 0) {
            byte[] bArr = (byte[]) c(973009685, -973009683, (int) Runtime.getRuntime().maxMemory(), objArr2, (int) runtime.totalMemory(), (int) SystemClock.uptimeMillis(), (int) SystemClock.elapsedRealtime());
            byte[][] bArr2 = new byte[1][];
            bArr2[1] = bVar.c();
            bArrE = o.ei.d.e(bArr, bArr2);
        } else {
            bArrE = o.ei.d.e((byte[]) c(973009685, -973009683, (int) Runtime.getRuntime().maxMemory(), objArr2, (int) runtime.totalMemory(), (int) SystemClock.uptimeMillis(), (int) SystemClock.elapsedRealtime()), bVar.c());
        }
        int i24 = f23196e;
        int i25 = ((83 | i24) << 1) - (i24 ^ 83);
        f23197j = i25 % 128;
        int i26 = i25 % 2;
        return bArrE;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23197j;
        int i4 = (i3 & 19) + ((i3 + 19) - (19 & i3));
        f23196e = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = bVar.f23199d;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 47;
        f23196e = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    public final byte[] c() {
        int i2 = 2 % 2;
        int i3 = f23197j + 17;
        f23196e = i3 % 128;
        int i4 = i3 % 2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = (int) Runtime.getRuntime().totalMemory();
        byte[] bArr = (byte[]) c(1180130689, -1180130689, new Random().nextInt(), new Object[]{this}, elapsedCpuTime, (int) Thread.currentThread().getId(), i5);
        if (bArr == null) {
            int i6 = f23197j;
            int i7 = (((-1) - (((-1) - i6) & ((-1) - 27))) << 1) - (i6 ^ 27);
            f23196e = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i8 = f23196e;
        int i9 = (i8 ^ 107) + ((i8 & 107) << 1);
        f23197j = i9 % 128;
        int i10 = i9 % 2;
        return bArrCopyOf;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final byte[] e() {
        int iNextInt = new Random().nextInt(2131832686);
        int id = (int) Thread.currentThread().getId();
        return (byte[]) c(-1072592980, 1072592981, Process.myUid(), new Object[]{this}, iNextInt, (int) SystemClock.uptimeMillis(), id);
    }

    public final boolean equals(Object obj) {
        int i2 = f23195b * 908171666;
        f23195b = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = f23194a * (-1404064042);
        f23194a = i4;
        return ((Boolean) c(2029729829, -2029729826, i4, new Object[]{this, obj}, i2, Process.myTid(), i3)).booleanValue();
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23196e;
        int i4 = (((i3 + 21) - (21 & i3)) << 1) - (i3 ^ 21);
        f23197j = i4 % 128;
        if (i4 % 2 == 0) {
            super.finalize();
            int i5 = 10 / 0;
        } else {
            super.finalize();
        }
        int i6 = f23196e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23197j = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f23197j;
        int i4 = (i3 & 51) + ((i3 + 51) - (i3 & 51));
        f23196e = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = super.hashCode();
        if (i5 != 0) {
            int i6 = 26 / 0;
        }
        int i7 = f23196e + 87;
        f23197j = i7 % 128;
        if (i7 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23196e;
        int i4 = ((i3 + 105) - (105 | i3)) + ((i3 + 105) - (i3 & 105));
        f23197j = i4 % 128;
        int i5 = i4 % 2;
        String string = super.toString();
        int i6 = f23196e;
        int i7 = ((-1) - (((-1) - i6) | ((-1) - 77))) + ((i6 + 77) - (i6 & 77));
        f23197j = i7 % 128;
        if (i7 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
