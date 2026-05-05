package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes7.dex */
final class Ed25519Constants {
    static final Ed25519.CachedXYT[] B2;
    static final Ed25519.CachedXYT[][] B_TABLE;
    static final long[] D;
    static final long[] D2;
    private static final BigInteger D2_BI;
    private static final BigInteger D_BI;
    private static final BigInteger P_BI;
    static final long[] SQRTM1;
    private static final BigInteger SQRTM1_BI;

    private static class Point {

        /* JADX INFO: renamed from: x */
        private BigInteger f3532x;

        /* JADX INFO: renamed from: y */
        private BigInteger f3533y;

        private Point() {
        }

        /* synthetic */ Point(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        P_BI = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        D_BI = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        D2_BI = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        SQRTM1_BI = bigIntegerModPow;
        Point point = new Point();
        point.f3533y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        point.f3532x = recoverX(point.f3533y);
        D = Field25519.expand(toLittleEndian(bigIntegerMod));
        D2 = Field25519.expand(toLittleEndian(bigIntegerMod2));
        SQRTM1 = Field25519.expand(toLittleEndian(bigIntegerModPow));
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance((Class<?>) Ed25519.CachedXYT.class, 32, 8);
        Point pointEdwards = point;
        for (int i2 = 0; i2 < 32; i2++) {
            Point pointEdwards2 = pointEdwards;
            for (int i3 = 0; i3 < 8; i3++) {
                B_TABLE[i2][i3] = getCachedXYT(pointEdwards2);
                pointEdwards2 = edwards(pointEdwards2, pointEdwards);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                pointEdwards = edwards(pointEdwards, pointEdwards);
            }
        }
        Point pointEdwards3 = edwards(point, point);
        B2 = new Ed25519.CachedXYT[8];
        for (int i5 = 0; i5 < 8; i5++) {
            B2[i5] = getCachedXYT(point);
            point = edwards(point, pointEdwards3);
        }
    }

    private Ed25519Constants() {
    }

    private static Point edwards(Point a2, Point b2) {
        Point point = new Point();
        BigInteger bigIntegerMultiply = D_BI.multiply(a2.f3532x.multiply(b2.f3532x).multiply(a2.f3533y).multiply(b2.f3533y));
        BigInteger bigInteger = P_BI;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        point.f3532x = a2.f3532x.multiply(b2.f3533y).add(b2.f3532x.multiply(a2.f3533y)).multiply(BigInteger.ONE.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        point.f3533y = a2.f3533y.multiply(b2.f3533y).add(a2.f3532x.multiply(b2.f3532x)).multiply(BigInteger.ONE.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return point;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point p2) {
        BigInteger bigIntegerAdd = p2.f3533y.add(p2.f3532x);
        BigInteger bigInteger = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(bigIntegerAdd.mod(bigInteger))), Field25519.expand(toLittleEndian(p2.f3533y.subtract(p2.f3532x).mod(bigInteger))), Field25519.expand(toLittleEndian(D2_BI.multiply(p2.f3532x).multiply(p2.f3533y).mod(bigInteger))));
    }

    private static BigInteger recoverX(BigInteger y2) {
        BigInteger bigIntegerSubtract = y2.pow(2).subtract(BigInteger.ONE);
        BigInteger bigIntegerAdd = D_BI.multiply(y2.pow(2)).add(BigInteger.ONE);
        BigInteger bigInteger = P_BI;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(SQRTM1_BI).mod(bigInteger);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    private static byte[] toLittleEndian(BigInteger n2) {
        byte[] bArr = new byte[32];
        byte[] byteArray = n2.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
