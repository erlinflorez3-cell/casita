package org.bouncycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes2.dex */
public final class BigEndianConversions {
    private BigEndianConversions() {
    }

    public static void I2OSP(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >>> 24);
        bArr[i3 + 1] = (byte) (i2 >>> 16);
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    public static void I2OSP(int i2, byte[] bArr, int i3, int i4) {
        int i5 = i4 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            bArr[i3 + i6] = (byte) (i2 >>> ((i5 - i6) * 8));
        }
    }

    public static void I2OSP(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) (j2 >>> 56);
        bArr[i2 + 1] = (byte) (j2 >>> 48);
        bArr[i2 + 2] = (byte) (j2 >>> 40);
        bArr[i2 + 3] = (byte) (j2 >>> 32);
        bArr[i2 + 4] = (byte) (j2 >>> 24);
        bArr[i2 + 5] = (byte) (j2 >>> 16);
        bArr[i2 + 6] = (byte) (j2 >>> 8);
        bArr[i2 + 7] = (byte) j2;
    }

    public static byte[] I2OSP(int i2) {
        return new byte[]{(byte) (i2 >>> 24), (byte) (i2 >>> 16), (byte) (i2 >>> 8), (byte) i2};
    }

    public static byte[] I2OSP(int i2, int i3) throws ArithmeticException {
        if (i2 < 0) {
            return null;
        }
        int iCeilLog256 = IntegerFunctions.ceilLog256(i2);
        if (iCeilLog256 > i3) {
            throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
        }
        byte[] bArr = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = i4; i5 >= i3 - iCeilLog256; i5--) {
            bArr[i5] = (byte) (i2 >>> ((i4 - i5) * 8));
        }
        return bArr;
    }

    public static byte[] I2OSP(long j2) {
        return new byte[]{(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
    }

    public static int OS2IP(byte[] bArr) {
        if (bArr.length > 4) {
            throw new ArithmeticException("invalid input length");
        }
        if (bArr.length == 0) {
            return 0;
        }
        int length = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            length = (-1) - (((-1) - length) & ((-1) - (((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << (((bArr.length - 1) - i2) * 8))));
        }
        return length;
    }

    public static int OS2IP(byte[] bArr, int i2) {
        int i3 = (bArr[i2] & 255) << 24;
        int i4 = (bArr[i2 + 1] & 255) << 16;
        int i5 = (-1) - (((-1) - ((i4 + i3) - (i4 & i3))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 8)));
        byte b2 = bArr[i2 + 3];
        return (-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - i5));
    }

    public static int OS2IP(byte[] bArr, int i2, int i3) {
        if (bArr.length == 0 || bArr.length < (i2 + i3) - 1) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = bArr[i2 + i5];
            i4 |= ((i6 + 255) - (i6 | 255)) << (((i3 - i5) - 1) * 8);
        }
        return i4;
    }

    public static long OS2LIP(byte[] bArr, int i2) {
        long j2 = ((-1) - (((-1) - ((long) bArr[i2])) | ((-1) - 255))) << 56;
        long j3 = ((-1) - (((-1) - ((long) bArr[i2 + 1])) | ((-1) - 255))) << 48;
        long j4 = bArr[i2 + 2];
        long j5 = (-1) - (((-1) - ((j2 + j3) - (j2 & j3))) & ((-1) - (((j4 + 255) - (j4 | 255)) << 40)));
        long j6 = bArr[i2 + 3];
        long j7 = bArr[i2 + 4];
        byte b2 = bArr[i2 + 5];
        long j8 = ((-1) - (((-1) - (j5 | (((j6 + 255) - (j6 | 255)) << 32))) & ((-1) - (((255 + j7) - (255 | j7)) << 24)))) | ((long) (((b2 + 255) - (b2 | 255)) << 16));
        byte b3 = bArr[i2 + 6];
        long j9 = (-1) - (((-1) - j8) & ((-1) - ((long) (((b3 + 255) - (b3 | 255)) << 8))));
        byte b4 = bArr[i2 + 7];
        return (-1) - (((-1) - ((long) ((b4 + 255) - (b4 | 255)))) & ((-1) - j9));
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            I2OSP(iArr[i2], bArr, i2 << 2);
        }
        return bArr;
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
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 <= length - 2) {
            iArr[i2] = OS2IP(bArr, i3);
            i2++;
            i3 += 4;
        }
        int i4 = length - 1;
        if (length2 != 0) {
            iArr[i4] = OS2IP(bArr, i3, length2);
        } else {
            iArr[i4] = OS2IP(bArr, i3);
        }
        return iArr;
    }
}
