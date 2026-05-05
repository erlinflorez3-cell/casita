package org.spongycastle.crypto.signers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.DSAKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import yg.C1561oA;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class DSASigner implements DSA {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q2 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q2, bArr);
        BigInteger x2 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q2, x2, bArr);
        } else {
            this.kCalculator.init(q2, this.random);
        }
        BigInteger bigIntegerNextK = this.kCalculator.nextK();
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK, parameters.getP()).mod(q2);
        return new BigInteger[]{bigIntegerMod, bigIntegerNextK.modInverse(q2).multiply(bigIntegerCalculateE.add(x2.multiply(bigIntegerMod))).mod(q2)};
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
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
            org.spongycastle.crypto.params.DSAPrivateKeyParameters r0 = (org.spongycastle.crypto.params.DSAPrivateKeyParameters) r0
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
            org.spongycastle.crypto.params.DSAPublicKeyParameters r4 = (org.spongycastle.crypto.params.DSAPublicKeyParameters) r4
            r2.key = r4
            goto L31
        L2d:
            org.spongycastle.crypto.params.DSAPrivateKeyParameters r4 = (org.spongycastle.crypto.params.DSAPrivateKeyParameters) r4
            r2.key = r4
        L31:
            r1 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.signers.DSASigner.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    protected SecureRandom initSecureRandom(boolean z2, SecureRandom secureRandom) throws Throwable {
        if (!z2) {
            return null;
        }
        if (secureRandom != null) {
            return secureRandom;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.od("G=Q;\u0007K<9JF<FJ}\"30A=/\u001b)5*41", (short) (ZN.Xd() ^ 13255))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q2 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q2, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q2.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q2.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(q2);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModInverse).mod(q2);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModInverse).mod(q2);
        BigInteger p2 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p2).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p2)).mod(p2).mod(q2).equals(bigInteger);
    }
}
