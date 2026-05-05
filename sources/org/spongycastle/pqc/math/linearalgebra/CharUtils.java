package org.spongycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes2.dex */
public final class CharUtils {
    private CharUtils() {
    }

    public static char[] clone(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static boolean equals(char[] cArr, char[] cArr2) {
        if (cArr.length != cArr2.length) {
            return false;
        }
        ?? r2 = 1;
        for (int length = cArr.length - 1; length >= 0; length--) {
            int i2 = cArr[length] == cArr2[length] ? 1 : 0;
            r2 = (r2 + i2) - (r2 | i2);
        }
        return r2;
    }

    public static byte[] toByteArray(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int length = cArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) cArr[length];
        }
        return bArr;
    }

    public static byte[] toByteArrayForPBE(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            bArr[i2] = (byte) cArr[i2];
        }
        int i3 = length * 2;
        byte[] bArr2 = new byte[i3 + 2];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr2[i5] = 0;
            bArr2[i5 + 1] = bArr[i4];
        }
        bArr2[i3] = 0;
        bArr2[i3 + 1] = 0;
        return bArr2;
    }
}
