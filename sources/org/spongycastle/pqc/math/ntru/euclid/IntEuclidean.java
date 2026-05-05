package org.spongycastle.pqc.math.ntru.euclid;

/* JADX INFO: loaded from: classes2.dex */
public class IntEuclidean {
    public int gcd;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f28204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f28205y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i2, int i3) {
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        int i7 = 0;
        while (i3 != 0) {
            int i8 = i2 / i3;
            int i9 = i2 % i3;
            int i10 = i6 - (i8 * i7);
            i2 = i3;
            i3 = i9;
            int i11 = i5;
            i5 = i4 - (i8 * i5);
            i4 = i11;
            i6 = i7;
            i7 = i10;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.f28204x = i6;
        intEuclidean.f28205y = i4;
        intEuclidean.gcd = i2;
        return intEuclidean;
    }
}
