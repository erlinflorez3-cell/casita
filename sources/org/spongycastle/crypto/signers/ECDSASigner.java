package org.spongycastle.crypto.signers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECMultiplier;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.ec.FixedPointCombMultiplier;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class ECDSASigner implements ECConstants, DSA {
    private final DSAKCalculator kCalculator;
    private ECKeyParameters key;
    private SecureRandom random;

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }

    protected BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n2 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n2, bArr);
        BigInteger d2 = ((ECPrivateKeyParameters) this.key).getD();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(n2, d2, bArr);
        } else {
            this.kCalculator.init(n2, this.random);
        }
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger().mod(n2);
            if (!bigIntegerMod.equals(ZERO)) {
                BigInteger bigIntegerMod2 = bigIntegerNextK.modInverse(n2).multiply(bigIntegerCalculateE.add(d2.multiply(bigIntegerMod))).mod(n2);
                if (!bigIntegerMod2.equals(ZERO)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    protected ECFieldElement getDenominator(int i2, ECPoint eCPoint) {
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i2 != 6 && i2 != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0026  */
    @Override // org.spongycastle.crypto.DSA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(boolean r3, org.spongycastle.crypto.CipherParameters r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L28
            boolean r0 = r4 instanceof org.spongycastle.crypto.params.ParametersWithRandom
            if (r0 == 0) goto L2d
            org.spongycastle.crypto.params.ParametersWithRandom r4 = (org.spongycastle.crypto.params.ParametersWithRandom) r4
            org.spongycastle.crypto.CipherParameters r0 = r4.getParameters()
            org.spongycastle.crypto.params.ECPrivateKeyParameters r0 = (org.spongycastle.crypto.params.ECPrivateKeyParameters) r0
            r2.key = r0
            java.security.SecureRandom r1 = r4.getRandom()
        L14:
            if (r3 == 0) goto L26
            org.spongycastle.crypto.signers.DSAKCalculator r0 = r2.kCalculator
            boolean r0 = r0.isDeterministic()
            if (r0 != 0) goto L26
            r0 = 1
        L1f:
            java.security.SecureRandom r0 = r2.initSecureRandom(r0, r1)
            r2.random = r0
            return
        L26:
            r0 = 0
            goto L1f
        L28:
            org.spongycastle.crypto.params.ECPublicKeyParameters r4 = (org.spongycastle.crypto.params.ECPublicKeyParameters) r4
            r2.key = r4
            goto L31
        L2d:
            org.spongycastle.crypto.params.ECPrivateKeyParameters r4 = (org.spongycastle.crypto.params.ECPrivateKeyParameters) r4
            r2.key = r4
        L31:
            r1 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.signers.ECDSASigner.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    protected SecureRandom initSecureRandom(boolean z2, SecureRandom secureRandom) throws Throwable {
        if (!z2) {
            return null;
        }
        if (secureRandom != null) {
            return secureRandom;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Wg.Zd("bdbt6\u0007!\u0014MWEtbq<5k\u0007j\u0017j\u0003H%U+", (short) (ZN.Xd() ^ 21085), (short) (ZN.Xd() ^ 24508))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n2 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n2, bArr);
        if (bigInteger.compareTo(ONE) < 0 || bigInteger.compareTo(n2) >= 0 || bigInteger2.compareTo(ONE) < 0 || bigInteger2.compareTo(n2) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(n2);
        ECPoint eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigIntegerCalculateE.multiply(bigIntegerModInverse).mod(n2), ((ECPublicKeyParameters) this.key).getQ(), bigInteger.multiply(bigIntegerModInverse).mod(n2));
        if (eCPointSumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = eCPointSumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), eCPointSumOfTwoMultiplies)) == null || denominator.isZero()) {
            return eCPointSumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n2).equals(bigInteger);
        }
        ECFieldElement xCoord = eCPointSumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n2);
        }
        return false;
    }
}
