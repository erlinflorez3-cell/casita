package org.spongycastle.crypto.generators;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;

/* JADX INFO: loaded from: classes2.dex */
public class RSABlindingFactorGenerator {
    private RSAKeyParameters key;
    private SecureRandom random;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);

    public BigInteger generateBlindingFactor() {
        RSAKeyParameters rSAKeyParameters = this.key;
        if (rSAKeyParameters == null) {
            throw new IllegalStateException("generator not initialised");
        }
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = modulus.bitLength() - 1;
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.random);
            BigInteger bigIntegerGcd = bigInteger.gcd(modulus);
            if (!bigInteger.equals(ZERO) && !bigInteger.equals(ONE) && bigIntegerGcd.equals(ONE)) {
                return bigInteger;
            }
        }
    }

    public void init(CipherParameters cipherParameters) throws Throwable {
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (RSAKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            this.key = (RSAKeyParameters) cipherParameters;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.od("ZPdN\u001a^OL]YOY]\u00115FCTPB.<H=GD", (short) (FB.Xd() ^ 16539))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (this.key instanceof RSAPrivateCrtKeyParameters) {
            throw new IllegalArgumentException(C1561oA.Kd("GFPHVFZVZ\t\\P]bWaUd\u0012EG6\u0016gm[fd_\u001didy", (short) (C1499aX.Xd() ^ (-3467))));
        }
    }
}
