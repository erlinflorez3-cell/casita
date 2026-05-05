package org.spongycastle.pqc.math.ntru.euclid;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class BigIntEuclidean {
    public BigInteger gcd;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BigInteger f28202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BigInteger f28203y;

    private BigIntEuclidean() {
    }

    public static BigIntEuclidean calculate(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger bigInteger5 = BigInteger.ONE;
        BigInteger bigInteger6 = BigInteger.ZERO;
        while (!bigInteger2.equals(BigInteger.ZERO)) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger.divideAndRemainder(bigInteger2);
            BigInteger bigInteger7 = bigIntegerArrDivideAndRemainder[0];
            BigInteger bigInteger8 = bigIntegerArrDivideAndRemainder[1];
            BigInteger bigIntegerSubtract = bigInteger4.subtract(bigInteger7.multiply(bigInteger3));
            BigInteger bigIntegerSubtract2 = bigInteger6.subtract(bigInteger7.multiply(bigInteger5));
            bigInteger = bigInteger2;
            bigInteger2 = bigInteger8;
            bigInteger4 = bigInteger3;
            bigInteger3 = bigIntegerSubtract;
            bigInteger6 = bigInteger5;
            bigInteger5 = bigIntegerSubtract2;
        }
        BigIntEuclidean bigIntEuclidean = new BigIntEuclidean();
        bigIntEuclidean.f28202x = bigInteger4;
        bigIntEuclidean.f28203y = bigInteger6;
        bigIntEuclidean.gcd = bigInteger;
        return bigIntEuclidean;
    }
}
