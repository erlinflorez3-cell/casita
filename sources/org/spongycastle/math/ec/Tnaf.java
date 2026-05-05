package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigIntegerNegate = ECConstants.ONE.negate();
        MINUS_ONE = bigIntegerNegate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigIntegerNegate2 = ECConstants.THREE.negate();
        MINUS_THREE = bigIntegerNegate2;
        alpha0 = new ZTauElement[]{null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(bigIntegerNegate2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(ECConstants.ONE, bigIntegerNegate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(bigIntegerNegate2, ECConstants.ONE), null, new ZTauElement(bigIntegerNegate, ECConstants.ONE), null, new ZTauElement(ECConstants.ONE, ECConstants.ONE), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    Tnaf() {
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i2, int i3) {
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i2 - r3) - 2) + b2));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i2)));
        int i4 = (((i2 + 5) / 2) + i3) - i3;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i4);
        if (bigIntegerAdd.testBit(i4 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(bigIntegerShiftRight, i3);
    }

    public static BigInteger[] getLucas(byte b2, int i2, boolean z2) {
        BigInteger bigInteger;
        BigInteger bigIntegerValueOf;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z2) {
            bigInteger = ECConstants.TWO;
            bigIntegerValueOf = BigInteger.valueOf(b2);
        } else {
            bigInteger = ECConstants.ZERO;
            bigIntegerValueOf = ECConstants.ONE;
        }
        int i3 = 1;
        while (i3 < i2) {
            BigInteger bigIntegerSubtract = (b2 == 1 ? bigIntegerValueOf : bigIntegerValueOf.negate()).subtract(bigInteger.shiftLeft(1));
            i3++;
            bigInteger = bigIntegerValueOf;
            bigIntegerValueOf = bigIntegerSubtract;
        }
        return new BigInteger[]{bigInteger, bigIntegerValueOf};
    }

    public static byte getMu(int i2) {
        return (byte) (i2 == 0 ? -1 : 1);
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b2) {
        byte[][] bArr = b2 == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i2 = 3; i2 < length; i2 += 2) {
            abstractF2mArr[i2 >>> 1] = multiplyFromTnaf(abstractF2m, bArr[i2]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    protected static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getSi(int i2, int i3, BigInteger bigInteger) {
        byte mu = getMu(i3);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu, (i2 + 3) - i3, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        return new BigInteger[]{ECConstants.ONE.add(lucas[1]).shiftRight(shiftsForCofactor), ECConstants.ONE.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (!abstractF2m.isKoblitz()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int fieldSize = abstractF2m.getFieldSize();
        int iIntValue = abstractF2m.getA().toBigInteger().intValue();
        byte mu = getMu(iIntValue);
        int shiftsForCofactor = getShiftsForCofactor(abstractF2m.getCofactor());
        BigInteger[] lucas = getLucas(mu, (fieldSize + 3) - iIntValue, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        return new BigInteger[]{ECConstants.ONE.add(lucas[1]).shiftRight(shiftsForCofactor), ECConstants.ONE.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger getTw(byte b2, int i2) {
        if (i2 == 4) {
            return b2 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b2, i2, false);
        BigInteger bit = ECConstants.ZERO.setBit(i2);
        return ECConstants.TWO.multiply(lucas[0]).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.negate();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b2 = bArr[length];
            if (b2 != 0) {
                abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m2.tauPow(i2).add(b2 > 0 ? abstractF2m : abstractF2m3);
                i2 = 0;
            }
        }
        return i2 > 0 ? abstractF2m2.tauPow(i2) : abstractF2m2;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        int iIntValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(bigInteger, fieldSize, (byte) iIntValue, abstractF2m2.getSi(), getMu(iIntValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b2, ZTauElement zTauElement) {
        BigInteger bigIntegerMultiply = zTauElement.f28050u.multiply(zTauElement.f28050u);
        BigInteger bigIntegerMultiply2 = zTauElement.f28050u.multiply(zTauElement.f28051v);
        BigInteger bigIntegerShiftLeft = zTauElement.f28051v.multiply(zTauElement.f28051v).shiftLeft(1);
        if (b2 == 1) {
            return bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        if (b2 == -1) {
            return bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static SimpleBigDecimal norm(byte b2, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal simpleBigDecimalMultiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal simpleBigDecimalMultiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal simpleBigDecimalShiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b2 == 1) {
            return simpleBigDecimalMultiply.add(simpleBigDecimalMultiply2).add(simpleBigDecimalShiftLeft);
        }
        if (b2 == -1) {
            return simpleBigDecimalMultiply.subtract(simpleBigDecimalMultiply2).add(simpleBigDecimalShiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static ZTauElement partModReduction(BigInteger bigInteger, int i2, byte b2, BigInteger[] bigIntegerArr, byte b3, byte b4) {
        BigInteger bigIntegerAdd = b3 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = getLucas(b3, i2, true)[1];
        ZTauElement zTauElementRound = round(approximateDivisionByN(bigInteger, bigIntegerArr[0], bigInteger2, b2, i2, b4), approximateDivisionByN(bigInteger, bigIntegerArr[1], bigInteger2, b2, i2, b4), b3);
        return new ZTauElement(bigInteger.subtract(bigIntegerAdd.multiply(zTauElementRound.f28050u)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(zTauElementRound.f28051v)), bigIntegerArr[1].multiply(zTauElementRound.f28050u).subtract(bigIntegerArr[0].multiply(zTauElementRound.f28051v)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r7.compareTo(org.spongycastle.math.ec.ECConstants.ONE) >= 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.spongycastle.math.ec.ZTauElement round(org.spongycastle.math.ec.SimpleBigDecimal r9, org.spongycastle.math.ec.SimpleBigDecimal r10, byte r11) {
        /*
            int r1 = r9.getScale()
            int r0 = r10.getScale()
            if (r0 != r1) goto La8
            r5 = -1
            r1 = 1
            if (r11 == r1) goto L10
            if (r11 != r5) goto La0
        L10:
            java.math.BigInteger r2 = r9.round()
            java.math.BigInteger r3 = r10.round()
            org.spongycastle.math.ec.SimpleBigDecimal r9 = r9.subtract(r2)
            org.spongycastle.math.ec.SimpleBigDecimal r6 = r10.subtract(r3)
            org.spongycastle.math.ec.SimpleBigDecimal r0 = r9.add(r9)
            if (r11 != r1) goto L9b
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r0.add(r6)
        L2a:
            org.spongycastle.math.ec.SimpleBigDecimal r0 = r6.add(r6)
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r0.add(r6)
            org.spongycastle.math.ec.SimpleBigDecimal r0 = r4.add(r6)
            if (r11 != r1) goto L92
            org.spongycastle.math.ec.SimpleBigDecimal r7 = r9.subtract(r4)
            org.spongycastle.math.ec.SimpleBigDecimal r6 = r9.add(r0)
        L40:
            java.math.BigInteger r0 = org.spongycastle.math.ec.ECConstants.ONE
            int r0 = r8.compareTo(r0)
            r4 = 0
            if (r0 < 0) goto L87
            java.math.BigInteger r0 = org.spongycastle.math.ec.Tnaf.MINUS_ONE
            int r0 = r7.compareTo(r0)
            if (r0 >= 0) goto L53
        L51:
            r1 = r4
            r4 = r11
        L53:
            java.math.BigInteger r0 = org.spongycastle.math.ec.Tnaf.MINUS_ONE
            int r0 = r8.compareTo(r0)
            if (r0 >= 0) goto L7e
            java.math.BigInteger r0 = org.spongycastle.math.ec.ECConstants.ONE
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L66
        L63:
            int r0 = -r11
            byte r4 = (byte) r0
        L65:
            r5 = r1
        L66:
            long r0 = (long) r5
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r2 = r2.add(r0)
            long r0 = (long) r4
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r1 = r3.add(r0)
            org.spongycastle.math.ec.ZTauElement r0 = new org.spongycastle.math.ec.ZTauElement
            r0.<init>(r2, r1)
            return r0
        L7e:
            java.math.BigInteger r0 = org.spongycastle.math.ec.Tnaf.MINUS_TWO
            int r0 = r6.compareTo(r0)
            if (r0 >= 0) goto L65
            goto L63
        L87:
            java.math.BigInteger r0 = org.spongycastle.math.ec.ECConstants.TWO
            int r0 = r6.compareTo(r0)
            if (r0 < 0) goto L90
            goto L51
        L90:
            r1 = r4
            goto L53
        L92:
            org.spongycastle.math.ec.SimpleBigDecimal r7 = r9.add(r4)
            org.spongycastle.math.ec.SimpleBigDecimal r6 = r9.subtract(r0)
            goto L40
        L9b:
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r0.subtract(r6)
            goto L2a
        La0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mu must be 1 or -1"
            r1.<init>(r0)
            throw r1
        La8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "lambda0 and lambda1 do not have same scale"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.math.ec.Tnaf.round(org.spongycastle.math.ec.SimpleBigDecimal, org.spongycastle.math.ec.SimpleBigDecimal, byte):org.spongycastle.math.ec.ZTauElement");
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b2, ZTauElement zTauElement) {
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b2, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 : 34];
        BigInteger bigIntegerClearBit = zTauElement.f28050u;
        BigInteger bigIntegerNegate = zTauElement.f28051v;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (bigIntegerClearBit.equals(ECConstants.ZERO) && bigIntegerNegate.equals(ECConstants.ZERO)) {
                int i4 = i2 + 1;
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                return bArr2;
            }
            if (bigIntegerClearBit.testBit(0)) {
                byte bIntValue = (byte) ECConstants.TWO.subtract(bigIntegerClearBit.subtract(bigIntegerNegate.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                bArr[i3] = bIntValue;
                bigIntegerClearBit = bIntValue == 1 ? bigIntegerClearBit.clearBit(0) : bigIntegerClearBit.add(ECConstants.ONE);
                i2 = i3;
            } else {
                bArr[i3] = 0;
            }
            BigInteger bigIntegerShiftRight = bigIntegerClearBit.shiftRight(1);
            BigInteger bigIntegerAdd = b2 == 1 ? bigIntegerNegate.add(bigIntegerShiftRight) : bigIntegerNegate.subtract(bigIntegerShiftRight);
            bigIntegerNegate = bigIntegerClearBit.shiftRight(1).negate();
            i3++;
            bigIntegerClearBit = bigIntegerAdd;
        }
    }

    public static byte[] tauAdicWNaf(byte b2, ZTauElement zTauElement, byte b3, BigInteger bigInteger, BigInteger bigInteger2, ZTauElement[] zTauElementArr) {
        boolean z2;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b2, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + b3 : b3 + 34];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd = zTauElement.f28050u;
        BigInteger bigIntegerNegate = zTauElement.f28051v;
        int i2 = 0;
        while (true) {
            if (bigIntegerAdd.equals(ECConstants.ZERO) && bigIntegerNegate.equals(ECConstants.ZERO)) {
                return bArr;
            }
            if (bigIntegerAdd.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd.add(bigIntegerNegate.multiply(bigInteger2)).mod(bigInteger);
                byte bIntValue = (byte) (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0 ? bigIntegerMod.subtract(bigInteger).intValue() : bigIntegerMod.intValue());
                bArr[i2] = bIntValue;
                if (bIntValue < 0) {
                    bIntValue = (byte) (-bIntValue);
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    bigIntegerAdd = bigIntegerAdd.subtract(zTauElementArr[bIntValue].f28050u);
                    bigIntegerNegate = bigIntegerNegate.subtract(zTauElementArr[bIntValue].f28051v);
                } else {
                    bigIntegerAdd = bigIntegerAdd.add(zTauElementArr[bIntValue].f28050u);
                    bigIntegerNegate = bigIntegerNegate.add(zTauElementArr[bIntValue].f28051v);
                }
            } else {
                bArr[i2] = 0;
            }
            BigInteger bigIntegerAdd2 = b2 == 1 ? bigIntegerNegate.add(bigIntegerAdd.shiftRight(1)) : bigIntegerNegate.subtract(bigIntegerAdd.shiftRight(1));
            bigIntegerNegate = bigIntegerAdd.shiftRight(1).negate();
            i2++;
            bigIntegerAdd = bigIntegerAdd2;
        }
    }
}
