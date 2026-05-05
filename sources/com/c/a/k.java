package com.c.a;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2772b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2773d;

    public static char[] e(long j2, char[] cArr, int i2) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (i3 < cArr.length) {
            if (((-1) - (((-1) - (j2 >>> i3)) | ((-1) - 1)) != i2 || i4 >= 4) && i5 < length) {
                cArr2[i5] = cArr[i3];
                i5++;
                i3++;
            } else {
                cArr2[i4] = cArr[i3];
                i4++;
                i3++;
            }
        }
        return cArr2;
    }
}
