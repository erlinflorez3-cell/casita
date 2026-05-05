package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class en {
    private static void B(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static void V(int i2, int i3, boolean z2, int i4, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z2) {
            B(iArr);
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i2 ^ iArr[i5];
            int i7 = i6 >>> 8;
            int i8 = i3 ^ ((iArr2[2][(i7 + 255) - (i7 | 255)] ^ (iArr2[0][i6 >>> 24] + iArr2[1][(-1) - (((-1) - (i6 >>> 16)) | ((-1) - 255))])) + iArr2[3][i6 & 255]);
            i5++;
            i3 = i6;
            i2 = i8;
        }
        int i9 = i2 ^ iArr[iArr.length - 2];
        int i10 = i3 ^ iArr[iArr.length - 1];
        if (!z2) {
            B(iArr);
        }
        iArr3[0] = i10;
        iArr3[1] = i9;
    }
}
