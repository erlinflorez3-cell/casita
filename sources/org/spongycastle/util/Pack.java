package org.spongycastle.util;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Pack {
    public static int bigEndianToInt(byte[] bArr, int i2) {
        int i3 = bArr[i2] << Ascii.CAN;
        int i4 = ((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 16;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 8;
        int i7 = (i5 + i6) - (i5 & i6);
        byte b2 = bArr[i2 + 3];
        int i8 = (b2 + 255) - (b2 | 255);
        return (i8 + i7) - (i8 & i7);
    }

    public static void bigEndianToInt(byte[] bArr, int i2, int[] iArr) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = bigEndianToInt(bArr, i2);
            i2 += 4;
        }
    }

    public static long bigEndianToLong(byte[] bArr, int i2) {
        return ((-1) - (((-1) - ((long) bigEndianToInt(bArr, i2 + 4))) | ((-1) - 4294967295L))) | ((((long) bigEndianToInt(bArr, i2)) & 4294967295L) << 32);
    }

    public static void bigEndianToLong(byte[] bArr, int i2, long[] jArr) {
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = bigEndianToLong(bArr, i2);
            i2 += 8;
        }
    }

    public static void intToBigEndian(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >>> 24);
        bArr[i3 + 1] = (byte) (i2 >>> 16);
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i2) {
        for (int i3 : iArr) {
            intToBigEndian(i3, bArr, i2);
            i2 += 4;
        }
    }

    public static byte[] intToBigEndian(int i2) {
        byte[] bArr = new byte[4];
        intToBigEndian(i2, bArr, 0);
        return bArr;
    }

    public static byte[] intToBigEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static void intToLittleEndian(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public static void intToLittleEndian(int[] iArr, byte[] bArr, int i2) {
        for (int i3 : iArr) {
            intToLittleEndian(i3, bArr, i2);
            i2 += 4;
        }
    }

    public static byte[] intToLittleEndian(int i2) {
        byte[] bArr = new byte[4];
        intToLittleEndian(i2, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToLittleEndian(iArr, bArr, 0);
        return bArr;
    }

    public static int littleEndianToInt(byte[] bArr, int i2) {
        int i3 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
        byte b2 = bArr[i2 + 2];
        int i4 = i3 | (((b2 + 255) - (b2 | 255)) << 16);
        int i5 = bArr[i2 + 3] << Ascii.CAN;
        return (i5 + i4) - (i5 & i4);
    }

    public static void littleEndianToInt(byte[] bArr, int i2, int[] iArr) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = littleEndianToInt(bArr, i2);
            i2 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i2, int[] iArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i3 + i5] = littleEndianToInt(bArr, i2);
            i2 += 4;
        }
    }

    public static long littleEndianToLong(byte[] bArr, int i2) {
        long jLittleEndianToInt = littleEndianToInt(bArr, i2);
        return (((-1) - (((-1) - ((long) littleEndianToInt(bArr, i2 + 4))) | ((-1) - 4294967295L))) << 32) | ((jLittleEndianToInt + 4294967295L) - (jLittleEndianToInt | 4294967295L));
    }

    public static void littleEndianToLong(byte[] bArr, int i2, long[] jArr) {
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = littleEndianToLong(bArr, i2);
            i2 += 8;
        }
    }

    public static void longToBigEndian(long j2, byte[] bArr, int i2) {
        intToBigEndian((int) (j2 >>> 32), bArr, i2);
        intToBigEndian((int) ((j2 + 4294967295L) - (j2 | 4294967295L)), bArr, i2 + 4);
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i2) {
        for (long j2 : jArr) {
            longToBigEndian(j2, bArr, i2);
            i2 += 8;
        }
    }

    public static byte[] longToBigEndian(long j2) {
        byte[] bArr = new byte[8];
        longToBigEndian(j2, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static void longToLittleEndian(long j2, byte[] bArr, int i2) {
        intToLittleEndian((int) (4294967295L & j2), bArr, i2);
        intToLittleEndian((int) (j2 >>> 32), bArr, i2 + 4);
    }

    public static void longToLittleEndian(long[] jArr, byte[] bArr, int i2) {
        for (long j2 : jArr) {
            longToLittleEndian(j2, bArr, i2);
            i2 += 8;
        }
    }

    public static byte[] longToLittleEndian(long j2) {
        byte[] bArr = new byte[8];
        longToLittleEndian(j2, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToLittleEndian(jArr, bArr, 0);
        return bArr;
    }
}
