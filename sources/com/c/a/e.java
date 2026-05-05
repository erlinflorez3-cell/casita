package com.c.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2735a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2737d;

    public static void b(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static int c(int i2) {
        b bVar = b.f2731b;
        int i3 = i2 >>> 8;
        return ((bVar.f2734e[0][(i2 >>> 24) & 255] + bVar.f2734e[1][(-1) - (((-1) - (i2 >>> 16)) | ((-1) - 255))]) ^ bVar.f2734e[2][(i3 + 255) - (i3 | 255)]) + bVar.f2734e[3][(i2 + 255) - (i2 | 255)];
    }
}
