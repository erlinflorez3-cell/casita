package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes2.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i2) {
        boolean z2 = false;
        for (int i3 = i2; i3 != i2 + 8; i3++) {
            if (bArr[i3] != bArr[i3 + 8]) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean isReal3Key(byte[] bArr, int i2) {
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i3 == i2 + 8) {
                break;
            }
            byte b2 = bArr[i3];
            byte b3 = bArr[i3 + 8];
            int i8 = b2 != b3 ? 1 : 0;
            i4 = (i4 + i8) - (i4 & i8);
            byte b4 = bArr[i3 + 16];
            i5 = (-1) - (((-1) - i5) & ((-1) - (b2 != b4 ? 1 : 0)));
            if (b3 == b4) {
                i7 = 0;
            }
            i6 = (-1) - (((-1) - i6) & ((-1) - i7));
            i3++;
        }
        return (i4 == 0 || i5 == 0 || i6 == 0) ? false : true;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i2) {
        return bArr.length == 16 ? isReal2Key(bArr, i2) : isReal3Key(bArr, i2);
    }

    public static boolean isWeakKey(byte[] bArr, int i2) {
        return isWeakKey(bArr, i2, bArr.length - i2);
    }

    public static boolean isWeakKey(byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            if (DESParameters.isWeakKey(bArr, i2)) {
                return true;
            }
            i2 += 8;
        }
        return false;
    }
}
