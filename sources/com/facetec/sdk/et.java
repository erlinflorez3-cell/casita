package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class et {
    public static void Z(char[] cArr, char[] cArr2, int i2) {
        int i3 = cArr[i2 % 4] * 32718;
        char c2 = cArr2[(i2 + 2) % 4];
        char c3 = (char) ((i3 + c2) % 65535);
        int i4 = (i2 + 3) % 4;
        cArr2[i4] = (char) (((cArr[i4] * 32718) + c2) / 65535);
        cArr[i4] = c3;
    }
}
