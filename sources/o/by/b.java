package o.by;

import android.os.Process;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21797a = -987436358;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f21798b = 1390479804;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f21799c = 1511998389;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21800i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21801j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f21804f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21805h = true;

    public b(byte[] bArr, byte[] bArr2) {
        this.f21802d = bArr;
        this.f21804f = bArr2;
        this.f21803e = bArr.length;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f21801j;
        int i4 = ((101 | i3) << 1) - (i3 ^ 101);
        f21800i = i4 % 128;
        int i5 = i4 % 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bVar.f21803e << 1);
        byteBufferAllocate.put(bVar.f21802d).put(bVar.f21804f);
        byte[] bArrArray = byteBufferAllocate.array();
        int i6 = f21801j;
        int i7 = (i6 & 31) + (i6 | 31);
        f21800i = i7 % 128;
        if (i7 % 2 != 0) {
            return bArrArray;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3.length == r5.length) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r2 = ((-1) - (((-1) - r6) | ((-1) - 111))) + ((r6 + 111) - (r6 & 111));
        o.by.b.f21801j = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r4 >= r3.length) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r1 = o.by.b.f21800i + 111;
        o.by.b.f21801j = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if ((r1 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r3[r4] = (byte) (r3[r4] ^ r5[r4]);
        r4 = r4 + 95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r7 = r3[r4];
        r6 = r5[r4];
        r3[r4] = (byte) ((-1) - (((-1) - ((r7 + r6) - (r7 & r6))) | ((-1) - (~((r7 + r6) - (r7 | r6))))));
        r1 = ((-1) - (((-1) - r4) | ((-1) - 49))) + (r4 | 49);
        r4 = (r1 ^ (-48)) + ((r1 & (-48)) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        r2 = o.by.b.f21800i;
        r1 = ((r2 | 93) << 1) - (r2 ^ 93);
        o.by.b.f21801j = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r5 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r10) {
        /*
            r4 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r3 = r10[r4]
            byte[] r3 = (byte[]) r3
            r9 = 1
            r5 = r10[r9]
            byte[] r5 = (byte[]) r5
            r8 = 2
            int r0 = r8 % r8
            if (r3 == 0) goto L23
            int r0 = o.by.b.f21801j
            int r0 = r0 + 93
            int r6 = r0 % 128
            o.by.b.f21800i = r6
            int r0 = r0 % r8
            if (r0 != 0) goto L2d
            r0 = 47
            int r0 = r0 / r4
            if (r5 != 0) goto L30
        L23:
            int r0 = o.by.b.f21801j
            int r1 = r0 + 59
            int r0 = r1 % 128
            o.by.b.f21800i = r0
            int r1 = r1 % r8
            return r7
        L2d:
            if (r5 != 0) goto L30
            goto L23
        L30:
            int r1 = r3.length
            int r0 = r5.length
            if (r1 == r0) goto L4a
            r0 = 111(0x6f, float:1.56E-43)
            int r1 = (-1) - r6
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r2 = (-1) - r1
            r1 = 111(0x6f, float:1.56E-43)
            int r0 = r6 + r1
            r6 = r6 & r1
            int r0 = r0 - r6
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.by.b.f21801j = r0
            int r2 = r2 % r8
            return r7
        L4a:
            int r0 = r3.length
            if (r4 >= r0) goto L90
            int r0 = o.by.b.f21800i
            int r1 = r0 + 111
            int r0 = r1 % 128
            o.by.b.f21801j = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L63
            r1 = r3[r4]
            r0 = r5[r4]
            r1 = r1 ^ r0
            byte r0 = (byte) r1
            r3[r4] = r0
            int r4 = r4 + 95
            goto L4a
        L63:
            r7 = r3[r4]
            r6 = r5[r4]
            int r1 = r7 + r6
            r0 = r7 | r6
            int r1 = r1 - r0
            int r2 = ~r1
            int r0 = r7 + r6
            r7 = r7 & r6
            int r0 = r0 - r7
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            byte r0 = (byte) r0
            r3[r4] = r0
            r0 = 49
            int r1 = (-1) - r4
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r1 = (-1) - r1
            r0 = 49
            r4 = r4 | r0
            int r1 = r1 + r4
            r4 = r1 ^ (-48)
            r0 = -48
            r1 = r1 & r0
            int r1 = r1 << r9
            int r4 = r4 + r1
            goto L4a
        L90:
            int r2 = o.by.b.f21800i
            r0 = 93
            r1 = r2 | r0
            int r1 = r1 << r9
            r0 = r2 ^ 93
            int r1 = r1 - r0
            int r0 = r1 % 128
            o.by.b.f21801j = r0
            int r1 = r1 % r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.b.b(java.lang.Object[]):java.lang.Object");
    }

    public static void b(byte[][] bArr) {
        c((int) SystemClock.uptimeMillis(), 1369869413, new Object[]{bArr}, new Random().nextInt(), (int) Process.getElapsedCpuTime(), Process.myTid(), -1369869411);
    }

    public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10 = ~i7;
        int i11 = ~i2;
        int i12 = ~(i10 | i11);
        int i13 = ~i3;
        int i14 = ~((i13 + i11) - (i13 & i11));
        int i15 = (-1) - (((-1) - i7) & ((-1) - i3));
        int i16 = (-1) - (((-1) - (i12 | i14)) & ((-1) - (~((i15 + i2) - (i15 & i2)))));
        int i17 = i10 | i13;
        int i18 = i12 | (~i17) | i14;
        int i19 = ~((i17 + i11) - (i17 & i11));
        int i20 = ~((-1) - (((-1) - i7) & ((-1) - i2)));
        int i21 = (~((-1) - (((-1) - i2) & ((-1) - i3)))) | ((i19 + i20) - (i19 & i20));
        int i22 = i7 + i3 + i4 + ((-298151579) * i5) + ((-427515960) * i6);
        int i23 = i22 * i22;
        int i24 = (i7 * (-431502880)) + 875560960 + ((-431502880) * i3) + ((-1881159201) * i16) + ((-532648894) * i18) + (1881159201 * i21) + (1449656320 * i4) + ((-16252928) * i5) + (423624704 * i6) + (1109590016 * i23);
        int i25 = ((i7 * (-2003555040)) - 1632655964) + (i3 * (-2003555040)) + (i16 * (-423)) + (i18 * 846) + (i21 * 423) + (i4 * (-2003554617)) + (i5 * 1812671363) + (i6 * (-1519508360)) + (i23 * (-1288372224));
        int i26 = i24 + (i25 * i25 * (-1796407296));
        if (i26 == 1) {
            return a(objArr);
        }
        if (i26 != 2) {
            return b(objArr);
        }
        int i27 = 0;
        byte[][] bArr = (byte[][]) objArr[0];
        int i28 = 2 % 2;
        int i29 = f21800i;
        int i30 = (i29 ^ 13) + ((13 & i29) << 1);
        f21801j = i30 % 128;
        int i31 = i30 % 2;
        if (bArr == null) {
            int i32 = (i29 ^ 43) + ((i29 & 43) << 1);
            f21801j = i32 % 128;
            int i33 = i32 % 2;
        } else {
            int length = bArr.length;
            while (i27 < length) {
                int i34 = f21800i + 37;
                f21801j = i34 % 128;
                if (i34 % 2 != 0) {
                    d(bArr[i27]);
                    int i35 = (i27 ^ 129) + (((-1) - (((-1) - i27) | ((-1) - 129))) << 1);
                    i8 = i35 & (-90);
                    i9 = (i35 - 90) - (i35 & (-90));
                } else {
                    d(bArr[i27]);
                    int i36 = (((-1) - (((-1) - i27) & ((-1) - (-37)))) << 1) - (i27 ^ (-37));
                    i8 = i36 & 38;
                    i9 = i36 | 38;
                }
                i27 = i8 + i9;
            }
        }
        return null;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        int i2 = f21797a * (-1202057045);
        f21797a = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f21799c * (-1108881280);
        f21799c = i3;
        return ((Boolean) c(i2, 1062517265, objArr, iFreeMemory, iMaxMemory, i3, -1062517265)).booleanValue();
    }

    public static void d(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f21800i;
        int i4 = (i3 ^ 63) + (((i3 + 63) - (i3 | 63)) << 1);
        f21801j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
            if (bArr == null) {
                return;
            }
        } else if (bArr == null) {
            return;
        }
        Arrays.fill(bArr, (byte) 0);
        int i6 = f21800i;
        int i7 = ((-1) - (((-1) - i6) | ((-1) - 91))) + ((-1) - (((-1) - i6) & ((-1) - 91)));
        f21801j = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static boolean e(byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        int i3 = f21800i + 1;
        f21801j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {bArr, bArr2};
            int i4 = f21797a * (-1202057045);
            f21797a = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = f21799c * (-1108881280);
            f21799c = i5;
            return ((Boolean) c(i4, 1062517265, objArr, iFreeMemory, iMaxMemory, i5, -1062517265)).booleanValue();
        }
        Object[] objArr2 = {bArr, bArr2};
        int i6 = f21797a * (-1202057045);
        f21797a = i6;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i7 = f21799c * (-1108881280);
        f21799c = i7;
        ((Boolean) c(i6, 1062517265, objArr2, iFreeMemory2, iMaxMemory2, i7, -1062517265)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final byte[] c() {
        int iNextInt = new Random().nextInt();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = 486364844 * f21798b;
        f21798b = i2;
        return (byte[]) c(iNextInt, 148913438, new Object[]{this}, elapsedCpuTime, i2, (int) Thread.currentThread().getId(), -148913437);
    }

    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f21801j + 45;
        f21800i = i3 % 128;
        if (i3 % 2 == 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f21803e);
            byteBufferAllocate.put(this.f21802d);
            byteBufferAllocate.array();
            throw null;
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(this.f21803e);
        byteBufferAllocate2.put(this.f21802d);
        byte[] bArrArray = byteBufferAllocate2.array();
        if (this.f21805h) {
            int i4 = f21800i;
            int i5 = (i4 ^ 81) + (((-1) - (((-1) - i4) | ((-1) - 81))) << 1);
            f21801j = i5 % 128;
            int i6 = i5 % 2;
            if (!e(bArrArray, this.f21804f)) {
                int i7 = f21801j;
                int i8 = ((i7 + 25) - (25 | i7)) + ((-1) - (((-1) - i7) & ((-1) - 25)));
                f21800i = i8 % 128;
                return i8 % 2 == 0 ? new byte[0] : new byte[0];
            }
        }
        int i9 = f21800i;
        int i10 = (i9 ^ 19) + (((-1) - (((-1) - i9) | ((-1) - 19))) << 1);
        f21801j = i10 % 128;
        int i11 = i10 % 2;
        return bArrArray;
    }
}
