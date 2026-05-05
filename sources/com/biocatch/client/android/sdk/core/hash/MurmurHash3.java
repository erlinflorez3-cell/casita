package com.biocatch.client.android.sdk.core.hash;

/* JADX INFO: loaded from: classes3.dex */
public final class MurmurHash3 {
    private static final long C1 = -8663945395140668459L;
    private static final int C1_32 = -862048943;
    private static final long C2 = 5545529020109919103L;
    private static final int C2_32 = 461845907;
    public static final int DEFAULT_SEED = 104729;
    static final int LONG_BYTES = 8;
    private static final int M = 5;
    private static final int M_32 = 5;
    private static final int N1 = 1390208809;
    private static final int N2 = 944331445;
    private static final int N_32 = -430675100;
    private static final int R1 = 31;
    private static final int R1_32 = 15;
    private static final int R2 = 27;
    private static final int R2_32 = 13;
    private static final int R3 = 33;

    private MurmurHash3() {
    }

    private static long fmix64(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    private static long getLittleEndianLong(byte[] bArr, int i2) {
        long j2 = ((long) bArr[i2]) & 255;
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = (j2 + j3) - (j2 & j3);
        long j5 = ((-1) - (((-1) - ((long) bArr[i2 + 2])) | ((-1) - 255))) << 16;
        long j6 = (-1) - (((-1) - ((j4 + j5) - (j4 & j5))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24)));
        long j7 = ((-1) - (((-1) - ((long) bArr[i2 + 4])) | ((-1) - 255))) << 32;
        long j8 = (-1) - (((-1) - ((j6 + j7) - (j6 & j7))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 40)));
        long j9 = bArr[i2 + 6];
        long j10 = j8 | (((j9 + 255) - (j9 | 255)) << 48);
        long j11 = bArr[i2 + 7];
        return (((j11 + 255) - (j11 | 255)) << 56) | j10;
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    public static long[] hash128x64(byte[] bArr, int i2, int i3, int i4) {
        long j2 = i4;
        return hash128x64Internal(bArr, i2, i3, (j2 + 4294967295L) - (j2 | 4294967295L));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static long[] hash128x64Internal(byte[] bArr, int i2, int i3, long j2) {
        long jRotateLeft = j2;
        int i4 = i3 >> 4;
        long jRotateLeft2 = jRotateLeft;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 + (i5 << 4);
            long littleEndianLong = getLittleEndianLong(bArr, i6);
            long littleEndianLong2 = getLittleEndianLong(bArr, i6 + 8);
            jRotateLeft2 = ((Long.rotateLeft((Long.rotateLeft(littleEndianLong * C1, 31) * C2) ^ jRotateLeft2, 27) + jRotateLeft) * 5) + 1390208809;
            jRotateLeft = ((Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(C2 * littleEndianLong2, 33) * C1), 31) + jRotateLeft2) * 5) + 944331445;
        }
        int i7 = i2 + (i4 << 4);
        long j3 = 0;
        switch ((i2 + i3) - i7) {
            case 1:
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 2:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 3:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 4:
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 5:
                long j4 = bArr[i7 + 4];
                j3 ^= ((j4 + 255) - (j4 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 6:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j42 = bArr[i7 + 4];
                j3 ^= ((j42 + 255) - (j42 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 7:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j422 = bArr[i7 + 4];
                j3 ^= ((j422 + 255) - (j422 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 8:
                long j5 = bArr[i7 + 7];
                j3 = ((j5 + 255) - (j5 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j4222 = bArr[i7 + 4];
                j3 ^= ((j4222 + 255) - (j4222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 9:
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j52 = bArr[i7 + 7];
                j3 = ((j52 + 255) - (j52 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j42222 = bArr[i7 + 4];
                j3 ^= ((j42222 + 255) - (j42222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 10:
                long j6 = bArr[i7 + 9];
                j3 ^= ((j6 + 255) - (j6 | 255)) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j522 = bArr[i7 + 7];
                j3 = ((j522 + 255) - (j522 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j422222 = bArr[i7 + 4];
                j3 ^= ((j422222 + 255) - (j422222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 11:
                j3 ^= (((long) bArr[i7 + 10]) & 255) << 16;
                long j62 = bArr[i7 + 9];
                j3 ^= ((j62 + 255) - (j62 | 255)) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j5222 = bArr[i7 + 7];
                j3 = ((j5222 + 255) - (j5222 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j4222222 = bArr[i7 + 4];
                j3 ^= ((j4222222 + 255) - (j4222222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 12:
                long j7 = bArr[i7 + 11];
                j3 ^= ((j7 + 255) - (j7 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 10]) & 255) << 16;
                long j622 = bArr[i7 + 9];
                j3 ^= ((j622 + 255) - (j622 | 255)) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j52222 = bArr[i7 + 7];
                j3 = ((j52222 + 255) - (j52222 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j42222222 = bArr[i7 + 4];
                j3 ^= ((j42222222 + 255) - (j42222222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 13:
                long j8 = bArr[i7 + 12];
                j3 ^= ((j8 + 255) - (j8 | 255)) << 32;
                long j72 = bArr[i7 + 11];
                j3 ^= ((j72 + 255) - (j72 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 10]) & 255) << 16;
                long j6222 = bArr[i7 + 9];
                j3 ^= ((j6222 + 255) - (j6222 | 255)) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j522222 = bArr[i7 + 7];
                j3 = ((j522222 + 255) - (j522222 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j422222222 = bArr[i7 + 4];
                j3 ^= ((j422222222 + 255) - (j422222222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 14:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 13])) | ((-1) - 255))) << 40;
                long j82 = bArr[i7 + 12];
                j3 ^= ((j82 + 255) - (j82 | 255)) << 32;
                long j722 = bArr[i7 + 11];
                j3 ^= ((j722 + 255) - (j722 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 10]) & 255) << 16;
                long j62222 = bArr[i7 + 9];
                j3 ^= ((j62222 + 255) - (j62222 | 255)) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j5222222 = bArr[i7 + 7];
                j3 = ((j5222222 + 255) - (j5222222 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j4222222222 = bArr[i7 + 4];
                j3 ^= ((j4222222222 + 255) - (j4222222222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
            case 15:
                long j9 = bArr[i7 + 14];
                j3 = ((j9 + 255) - (j9 | 255)) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 13])) | ((-1) - 255))) << 40;
                long j822 = bArr[i7 + 12];
                j3 ^= ((j822 + 255) - (j822 | 255)) << 32;
                long j7222 = bArr[i7 + 11];
                j3 ^= ((j7222 + 255) - (j7222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 10]) & 255) << 16;
                long j622222 = bArr[i7 + 9];
                j3 ^= ((j622222 + 255) - (j622222 | 255)) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                long j52222222 = bArr[i7 + 7];
                j3 = ((j52222222 + 255) - (j52222222 | 255)) << 56;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 6])) | ((-1) - 255))) << 48;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 5])) | ((-1) - 255))) << 40;
                long j42222222222 = bArr[i7 + 4];
                j3 ^= ((j42222222222 + 255) - (j42222222222 | 255)) << 32;
                j3 ^= (((long) bArr[i7 + 3]) & 255) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 1])) | ((-1) - 255))) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7] & 255))) * C1, 31) * C2;
                break;
        }
        long j10 = i3;
        long j11 = jRotateLeft2 ^ j10;
        long j12 = j10 ^ jRotateLeft;
        long j13 = j11 + j12;
        long jFmix64 = fmix64(j13);
        long jFmix642 = fmix64(j12 + j13);
        long j14 = jFmix64 + jFmix642;
        return new long[]{j14, jFmix642 + j14};
    }
}
