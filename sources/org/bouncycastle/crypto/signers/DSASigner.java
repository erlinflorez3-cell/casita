package org.bouncycastle.crypto.signers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.Od;

/* JADX INFO: loaded from: classes6.dex */
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

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) throws Throwable {
        if (secureRandom == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Ig.wd("d\fOYu~\\2\u0006\u0012\u000b8\u000f9N*_s\u0018S\u00028+!\"k", (short) (C1607wl.Xd() ^ 16395))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                secureRandom = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return new BigInteger(7, secureRandom).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
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
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK.add(getRandomizer(q2, this.random)), parameters.getP()).mod(q2);
        return new BigInteger[]{bigIntegerMod, bigIntegerNextK.modInverse(q2).multiply(bigIntegerCalculateE.add(x2.multiply(bigIntegerMod))).mod(q2)};
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    @Override // org.bouncycastle.crypto.DSA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(boolean r3, org.bouncycastle.crypto.CipherParameters r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L28
            boolean r0 = r4 instanceof org.bouncycastle.crypto.params.ParametersWithRandom
            if (r0 == 0) goto L2b
            org.bouncycastle.crypto.params.ParametersWithRandom r4 = (org.bouncycastle.crypto.params.ParametersWithRandom) r4
            org.bouncycastle.crypto.CipherParameters r0 = r4.getParameters()
            org.bouncycastle.crypto.params.DSAPrivateKeyParameters r0 = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) r0
            r2.key = r0
            java.security.SecureRandom r1 = r4.getRandom()
        L14:
            if (r3 == 0) goto L26
            org.bouncycastle.crypto.signers.DSAKCalculator r0 = r2.kCalculator
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
            org.bouncycastle.crypto.params.DSAPublicKeyParameters r4 = (org.bouncycastle.crypto.params.DSAPublicKeyParameters) r4
            goto L2d
        L2b:
            org.bouncycastle.crypto.params.DSAPrivateKeyParameters r4 = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) r4
        L2d:
            r2.key = r4
            r1 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.DSASigner.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    protected SecureRandom initSecureRandom(boolean z2, SecureRandom secureRandom) throws Throwable {
        if (!z2) {
            return null;
        }
        if (secureRandom != null) {
            return secureRandom;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(EO.Od("x\u001fVeblF\u0015yv\u00049l\u0013h!C[\u0001 O\u0007>8e$", (short) (Od.Xd() ^ (-10714)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.DSA
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
