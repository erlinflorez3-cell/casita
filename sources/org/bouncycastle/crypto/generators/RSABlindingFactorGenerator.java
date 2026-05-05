package org.bouncycastle.crypto.generators;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import yg.C1499aX;
import yg.C1561oA;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
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
        SecureRandom random;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (RSAKeyParameters) parametersWithRandom.getParameters();
            random = parametersWithRandom.getRandom();
        } else {
            this.key = (RSAKeyParameters) cipherParameters;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Ig.wd("(wZ\u001e2\u001a0f\u001d\u0017\u0010|2\\\n~W_%O\u0001dSE%\u0007", (short) (C1499aX.Xd() ^ (-27314)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.random = random;
        if (this.key instanceof RSAPrivateCrtKeyParameters) {
            short sXd = (short) (Od.Xd() ^ (-5318));
            int[] iArr = new int["\b`k~\u0014WB\u0016[\u0019a~Y_3b*&\u000bI\r#\u001ch %Q~\u001fmQq&".length()];
            QB qb = new QB("\b`k~\u0014WB\u0016[\u0019a~Y_3b*&\u000bI\r#\u001ch %Q~\u001fmQq&");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i2));
        }
    }
}
