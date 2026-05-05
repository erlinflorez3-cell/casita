package org.spongycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes2.dex */
public final class LittleEndianConversions {
    private LittleEndianConversions() {
    }

    public static void I2OSP(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public static void I2OSP(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            bArr[i3 + i5] = (byte) (i2 >>> (i5 * 8));
        }
    }

    public static void I2OSP(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) j2;
        bArr[i2 + 1] = (byte) (j2 >>> 8);
        bArr[i2 + 2] = (byte) (j2 >>> 16);
        bArr[i2 + 3] = (byte) (j2 >>> 24);
        bArr[i2 + 4] = (byte) (j2 >>> 32);
        bArr[i2 + 5] = (byte) (j2 >>> 40);
        bArr[i2 + 6] = (byte) (j2 >>> 48);
        bArr[i2 + 7] = (byte) (j2 >>> 56);
    }

    public static byte[] I2OSP(int i2) {
        return new byte[]{(byte) i2, (byte) (i2 >>> 8), (byte) (i2 >>> 16), (byte) (i2 >>> 24)};
    }

    public static byte[] I2OSP(long j2) {
        return new byte[]{(byte) j2, (byte) (j2 >>> 8), (byte) (j2 >>> 16), (byte) (j2 >>> 24), (byte) (j2 >>> 32), (byte) (j2 >>> 40), (byte) (j2 >>> 48), (byte) (j2 >>> 56)};
    }

    public static int OS2IP(byte[] bArr) {
        int i2 = ((-1) - (((-1) - ((-1) - (((-1) - bArr[0]) | ((-1) - 255)))) & ((-1) - (((-1) - (((-1) - bArr[1]) | ((-1) - 255))) << 8)))) | ((bArr[2] & 255) << 16);
        byte b2 = bArr[3];
        return (-1) - (((-1) - (((b2 + 255) - (b2 | 255)) << 24)) & ((-1) - i2));
    }

    public static int OS2IP(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        return ((bArr[i2 + 3] & 255) << 24) | ((-1) - (((-1) - ((((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8) | ((b2 + 255) - (b2 | 255)))) & ((-1) - ((bArr[i2 + 2] & 255) << 16))));
    }

    public static int OS2IP(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            int i6 = ((-1) - (((-1) - bArr[i2 + i5]) | ((-1) - 255))) << (i5 * 8);
            i4 = (i4 + i6) - (i4 & i6);
        }
        return i4;
    }

    public static long OS2LIP(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        long j2 = ((long) ((b2 + 255) - (b2 | 255))) | ((long) (((b3 + 255) - (b3 | 255)) << 8));
        long j3 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16;
        long j4 = bArr[i2 + 3];
        long j5 = ((j2 + j3) - (j2 & j3)) | (((j4 + 255) - (j4 | 255)) << 24);
        long j6 = bArr[i2 + 4];
        long j7 = ((j6 + 255) - (j6 | 255)) << 32;
        long j8 = (-1) - (((-1) - ((j5 + j7) - (j5 & j7))) & ((-1) - ((((long) bArr[i2 + 5]) & 255) << 40)));
        long j9 = bArr[i2 + 6];
        long j10 = ((j9 + 255) - (j9 | 255)) << 48;
        long j11 = (j8 + j10) - (j8 & j10);
        long j12 = bArr[i2 + 7];
        return (((j12 + 255) - (j12 | 255)) << 56) | j11;
    }

    public static byte[] toByteArray(int[] iArr, int i2) {
        int length = iArr.length;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 <= length - 2) {
            I2OSP(iArr[i3], bArr, i4);
            i3++;
            i4 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i4, i2 - i4);
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length;
        int i2 = (length2 + 3) - (length2 | 3);
        int[] iArr = new int[length];
        int i3 = 0;
        int i4 = 0;
        while (i3 <= length - 2) {
            iArr[i3] = OS2IP(bArr, i4);
            i3++;
            i4 += 4;
        }
        if (i2 != 0) {
            iArr[length - 1] = OS2IP(bArr, i4, i2);
        } else {
            iArr[length - 1] = OS2IP(bArr, i4);
        }
        return iArr;
    }
}
