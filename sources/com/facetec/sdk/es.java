package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class es {
    public static void B(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static int[] Code(char[] cArr, int[] iArr, boolean z2) {
        int i2 = (cArr[0] << 16) + cArr[1];
        int i3 = (cArr[2] << 16) + cArr[3];
        if (!z2) {
            B(iArr);
        }
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i2 ^ iArr[i4];
            int iV = i3 ^ V(i5);
            i4++;
            i3 = i5;
            i2 = iV;
        }
        int i6 = i2 ^ iArr[16];
        int i7 = iArr[17] ^ i3;
        int[] iArr2 = {i7, i6};
        cArr[0] = (char) (i7 >>> 16);
        cArr[1] = (char) i7;
        cArr[2] = (char) (i6 >>> 16);
        cArr[3] = (char) i6;
        if (!z2) {
            B(iArr);
        }
        return iArr2;
    }

    public static int V(int i2) {
        eo eoVar = eo.I;
        return ((eoVar.B[0][i2 >>> 24] + eoVar.B[1][(i2 >>> 16) & 255]) ^ eoVar.B[2][(i2 >>> 8) & 255]) + eoVar.B[3][(i2 + 255) - (i2 | 255)];
    }
}
