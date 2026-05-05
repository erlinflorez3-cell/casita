package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class Extras {
    private Extras() {
    }

    public static String CharsConcat(String str, int i2, int i3, String str2, int i4, int i5) {
        return str.substring(i2, i3 + i2) + str2.substring(i4, i5 + i4);
    }

    public static byte[] CharsConcat(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        byte[] bArr3 = new byte[i3 + i5];
        System.arraycopy(bArr, i2, bArr3, 0, i3);
        System.arraycopy(bArr2, i4, bArr3, i3, i5);
        return bArr3;
    }

    public static char[] CharsConcat(char[] cArr, int i2, int i3, char[] cArr2, int i4, int i5) {
        char[] cArr3 = new char[i3 + i5];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        System.arraycopy(cArr2, i4, cArr3, i3, i5);
        return cArr3;
    }

    public static int[] DoubleToIntegers(double d2) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2);
        return new int[]{(int) ((-1) - (((-1) - jDoubleToRawLongBits) | ((-1) - 4294967295L))), (int) ((-1) - (((-1) - (jDoubleToRawLongBits >> 32)) | ((-1) - 4294967295L)))};
    }

    public static double IntegersToDouble(int i2, int i3) {
        long j2 = i3;
        return Double.longBitsToDouble((((j2 + 4294967295L) - (j2 | 4294967295L)) << 32) | (((long) i2) & 4294967295L));
    }

    public static double IntegersToDouble(int[] iArr) {
        return IntegersToDouble(iArr[0], iArr[1]);
    }
}
