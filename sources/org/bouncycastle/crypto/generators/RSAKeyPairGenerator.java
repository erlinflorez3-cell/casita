package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.WNafUtil;

/* JADX INFO: loaded from: classes6.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int iterations;
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i2, int i3) {
        if (i2 >= 1536) {
            if (i3 <= 100) {
                return 3;
            }
            if (i3 <= 128) {
                return 4;
            }
            return 4 + ((i3 - 127) / 2);
        }
        if (i2 >= 1024) {
            if (i3 <= 100) {
                return 4;
            }
            if (i3 <= 112) {
                return 5;
            }
            return ((i3 - 111) / 2) + 5;
        }
        if (i2 < 512) {
            if (i3 <= 80) {
                return 40;
            }
            return 40 + ((i3 - 79) / 2);
        }
        if (i3 <= 80) {
            return 5;
        }
        if (i3 <= 100) {
            return 7;
        }
        return 7 + ((i3 - 99) / 2);
    }

    protected BigInteger chooseRandomPrime(int i2, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i3 = 0; i3 != i2 * 5; i3++) {
            BigInteger bigInteger3 = new BigInteger(i2, 1, this.param.getRandom());
            BigInteger bigIntegerMod = bigInteger3.mod(bigInteger);
            BigInteger bigInteger4 = ONE;
            if (!bigIntegerMod.equals(bigInteger4) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && isProbablePrime(bigInteger3) && bigInteger.gcd(bigInteger3.subtract(bigInteger4)).equals(bigInteger4)) {
                return bigInteger3;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerChooseRandomPrime;
        BigInteger bigIntegerChooseRandomPrime2;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger;
        RSAKeyPairGenerator rSAKeyPairGenerator = this;
        int strength = rSAKeyPairGenerator.param.getStrength();
        int i2 = (strength + 1) / 2;
        int i3 = strength - i2;
        int i4 = strength / 2;
        int i5 = i4 - 100;
        int i6 = strength / 3;
        if (i5 < i6) {
            i5 = i6;
        }
        int i7 = strength >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i4);
        BigInteger bigInteger2 = ONE;
        BigInteger bigIntegerShiftLeft = bigInteger2.shiftLeft(strength - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger2.shiftLeft(i5);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z2 = false;
        while (!z2) {
            BigInteger publicExponent = rSAKeyPairGenerator.param.getPublicExponent();
            do {
                bigIntegerChooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i2, publicExponent, bigIntegerShiftLeft);
                while (true) {
                    bigIntegerChooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i3, publicExponent, bigIntegerShiftLeft);
                    BigInteger bigIntegerAbs = bigIntegerChooseRandomPrime2.subtract(bigIntegerChooseRandomPrime).abs();
                    if (bigIntegerAbs.bitLength() >= i5 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                        bigIntegerMultiply = bigIntegerChooseRandomPrime.multiply(bigIntegerChooseRandomPrime2);
                        if (bigIntegerMultiply.bitLength() == strength) {
                            break;
                        }
                        bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime.max(bigIntegerChooseRandomPrime2);
                    } else {
                        rSAKeyPairGenerator = this;
                    }
                }
            } while (WNafUtil.getNafWeight(bigIntegerMultiply) < i7);
            if (bigIntegerChooseRandomPrime.compareTo(bigIntegerChooseRandomPrime2) < 0) {
                bigInteger = bigIntegerChooseRandomPrime;
                bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime2;
            } else {
                bigInteger = bigIntegerChooseRandomPrime2;
            }
            BigInteger bigInteger3 = ONE;
            BigInteger bigIntegerSubtract = bigIntegerChooseRandomPrime.subtract(bigInteger3);
            BigInteger bigIntegerSubtract2 = bigInteger.subtract(bigInteger3);
            BigInteger bigIntegerModInverse = publicExponent.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) <= 0) {
                rSAKeyPairGenerator = this;
            } else {
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, bigIntegerMultiply, publicExponent), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(bigIntegerMultiply, publicExponent, bigIntegerModInverse, bigIntegerChooseRandomPrime, bigInteger, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigInteger.modInverse(bigIntegerChooseRandomPrime)));
                z2 = true;
                rSAKeyPairGenerator = this;
            }
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        RSAKeyGenerationParameters rSAKeyGenerationParameters = (RSAKeyGenerationParameters) keyGenerationParameters;
        this.param = rSAKeyGenerationParameters;
        this.iterations = getNumberOfIterations(rSAKeyGenerationParameters.getStrength(), this.param.getCertainty());
    }

    protected boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), this.iterations);
    }
}
