package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowUtil {
    public static byte[] convertArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            bArr[i2] = (byte) sArr[i2];
        }
        return bArr;
    }

    public static short[] convertArray(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sArr[i2] = (short) ((-1) - (((-1) - bArr[i2]) | ((-1) - 255)));
        }
        return sArr;
    }

    public static byte[][] convertArray(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, sArr.length, sArr[0].length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr[0].length; i3++) {
                bArr[i2][i3] = (byte) sArr[i2][i3];
            }
        }
        return bArr;
    }

    public static short[][] convertArray(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, bArr.length, bArr[0].length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                short[] sArr2 = sArr[i2];
                byte b2 = bArr[i2][i3];
                sArr2[i3] = (short) ((b2 + 255) - (b2 | 255));
            }
        }
        return sArr;
    }

    public static byte[][][] convertArray(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        byte[][][] bArr = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, length, sArr2.length, sArr2[0].length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr[0].length; i3++) {
                for (int i4 = 0; i4 < sArr[0][0].length; i4++) {
                    bArr[i2][i3][i4] = (byte) sArr[i2][i3][i4];
                }
            }
        }
        return bArr;
    }

    public static short[][][] convertArray(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, bArr2.length, bArr2[0].length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                for (int i4 = 0; i4 < bArr[0][0].length; i4++) {
                    short[] sArr2 = sArr[i2][i3];
                    byte b2 = bArr[i2][i3][i4];
                    sArr2[i4] = (short) ((b2 + 255) - (b2 | 255));
                }
            }
        }
        return sArr;
    }

    public static int[] convertArraytoInt(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            iArr[i2] = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        }
        return iArr;
    }

    public static byte[] convertIntArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            bArr[i2] = (byte) iArr[i2];
        }
        return bArr;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static boolean equals(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        ?? r2 = 1;
        for (int length = sArr.length - 1; length >= 0; length--) {
            int i2 = sArr[length] == sArr2[length] ? 1 : 0;
            r2 = (r2 + i2) - (r2 | i2);
        }
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static boolean equals(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        ?? r2 = 1;
        for (int length = sArr.length - 1; length >= 0; length--) {
            boolean zEquals = equals(sArr[length], sArr2[length]);
            r2 = (r2 + (zEquals ? 1 : 0)) - (r2 | (zEquals ? 1 : 0));
        }
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static boolean equals(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        ?? r2 = 1;
        int length = sArr.length - 1;
        while (length >= 0) {
            boolean zEquals = equals(sArr[length], sArr2[length]);
            length--;
            r2 = (-1) - (((-1) - r2) | ((-1) - (zEquals ? 1 : 0)));
        }
        return r2;
    }
}
