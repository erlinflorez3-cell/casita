package org.bouncycastle.math.raw;

/* JADX INFO: loaded from: classes2.dex */
public class Interleave {
    private static final long M32 = 1431655765;
    private static final long M64 = 6148914691236517205L;

    public static int expand16to32(int i2) {
        int i3 = i2 & 65535;
        int i4 = i3 << 8;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = (i5 + 16711935) - (i5 | 16711935);
        int i7 = ((-1) - (((-1) - i6) & ((-1) - (i6 << 4)))) & 252645135;
        int i8 = (-1) - (((-1) - (i7 | (i7 << 2))) | ((-1) - 858993459));
        int i9 = i8 << 1;
        return (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) | ((-1) - 1431655765));
    }

    public static long expand32to64(int i2) {
        int i3 = ((i2 >>> 8) ^ i2) & 65280;
        int i4 = i2 ^ (i3 ^ (i3 << 8));
        int i5 = ((i4 >>> 4) ^ i4) & 15728880;
        int i6 = i4 ^ (i5 ^ (i5 << 4));
        int i7 = (i6 >>> 2) ^ i6;
        int i8 = (i7 + 202116108) - (i7 | 202116108);
        int i9 = i6 ^ (i8 ^ (i8 << 2));
        int i10 = (i9 >>> 1) ^ i9;
        int i11 = (i10 + 572662306) - (i10 | 572662306);
        int i12 = i9 ^ (i11 ^ (i11 << 1));
        long j2 = i12 >>> 1;
        long j3 = i12;
        return (((j2 + M32) - (j2 | M32)) << 32) | ((M32 + j3) - (M32 | j3));
    }

    public static void expand64To128(long j2, long[] jArr, int i2) {
        long j3 = ((j2 >>> 16) ^ j2) & 4294901760L;
        long j4 = j2 ^ (j3 ^ (j3 << 16));
        long j5 = ((j4 >>> 8) ^ j4) & 280375465148160L;
        long j6 = j4 ^ (j5 ^ (j5 << 8));
        long j7 = (-1) - (((-1) - ((j6 >>> 4) ^ j6)) | ((-1) - 67555025218437360L));
        long j8 = j6 ^ (j7 ^ (j7 << 4));
        long j9 = (-1) - (((-1) - ((j8 >>> 2) ^ j8)) | ((-1) - 868082074056920076L));
        long j10 = j8 ^ (j9 ^ (j9 << 2));
        long j11 = (j10 >>> 1) ^ j10;
        long j12 = (j11 + 2459565876494606882L) - (j11 | 2459565876494606882L);
        long j13 = j10 ^ (j12 ^ (j12 << 1));
        jArr[i2] = (j13 + M64) - (j13 | M64);
        jArr[i2 + 1] = (-1) - (((-1) - (j13 >>> 1)) | ((-1) - M64));
    }

    public static int expand8to16(int i2) {
        int i3 = (-1) - (((-1) - i2) | ((-1) - 255));
        int i4 = ((-1) - (((-1) - i3) & ((-1) - (i3 << 4)))) & 3855;
        int i5 = (i4 | (i4 << 2)) & 13107;
        int i6 = i5 << 1;
        int i7 = (i5 + i6) - (i5 & i6);
        return (i7 + 21845) - (i7 | 21845);
    }

    public static long unshuffle(long j2) {
        long j3 = (-1) - (((-1) - ((j2 >>> 1) ^ j2)) | ((-1) - 2459565876494606882L));
        long j4 = j2 ^ (j3 ^ (j3 << 1));
        long j5 = (-1) - (((-1) - ((j4 >>> 2) ^ j4)) | ((-1) - 868082074056920076L));
        long j6 = j4 ^ (j5 ^ (j5 << 2));
        long j7 = (j6 >>> 4) ^ j6;
        long j8 = (j7 + 67555025218437360L) - (j7 | 67555025218437360L);
        long j9 = j6 ^ (j8 ^ (j8 << 4));
        long j10 = ((j9 >>> 8) ^ j9) & 280375465148160L;
        long j11 = j9 ^ (j10 ^ (j10 << 8));
        long j12 = ((j11 >>> 16) ^ j11) & 4294901760L;
        return j11 ^ (j12 ^ (j12 << 16));
    }
}
