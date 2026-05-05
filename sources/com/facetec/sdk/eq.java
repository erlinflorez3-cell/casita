package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class eq {
    public static char[] I(long j2, char[] cArr, int i2) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i3 = 0;
        int i4 = 4;
        for (int i5 = 0; i5 < cArr.length; i5++) {
            if (((-1) - (((-1) - (j2 >>> i5)) | ((-1) - 1)) != i2 || i3 >= 4) && i4 < length) {
                cArr2[i4] = cArr[i5];
                i4++;
            } else {
                cArr2[i3] = cArr[i5];
                i3++;
            }
        }
        return cArr2;
    }
}
