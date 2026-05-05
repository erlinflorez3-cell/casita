package org.bouncycastle.crypto.signers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import yg.C1561oA;
import yg.OY;

/* JADX INFO: loaded from: classes6.dex */
public class DSTU4145Signer implements DSA {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private ECKeyParameters key;
    private SecureRandom random;

    private static BigInteger fieldElement2Integer(BigInteger bigInteger, ECFieldElement eCFieldElement) {
        return truncate(eCFieldElement.toBigInteger(), bigInteger.bitLength() - 1);
    }

    private static BigInteger generateRandomInteger(BigInteger bigInteger, SecureRandom secureRandom) {
        return new BigInteger(bigInteger.bitLength() - 1, secureRandom);
    }

    private static ECFieldElement hash2FieldElement(ECCurve eCCurve, byte[] bArr) {
        return eCCurve.fromBigInteger(truncate(new BigInteger(1, Arrays.reverse(bArr)), eCCurve.getFieldSize()));
    }

    private static BigInteger truncate(BigInteger bigInteger, int i2) {
        return bigInteger.bitLength() > i2 ? bigInteger.mod(ONE.shiftLeft(i2)) : bigInteger;
    }

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        ECCurve curve = parameters.getCurve();
        ECFieldElement eCFieldElementHash2FieldElement = hash2FieldElement(curve, bArr);
        if (eCFieldElementHash2FieldElement.isZero()) {
            eCFieldElementHash2FieldElement = curve.fromBigInteger(ONE);
        }
        BigInteger n2 = parameters.getN();
        BigInteger d2 = ((ECPrivateKeyParameters) this.key).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerGenerateRandomInteger = generateRandomInteger(n2, this.random);
            ECFieldElement affineXCoord = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerGenerateRandomInteger).normalize().getAffineXCoord();
            if (!affineXCoord.isZero()) {
                BigInteger bigIntegerFieldElement2Integer = fieldElement2Integer(n2, eCFieldElementHash2FieldElement.multiply(affineXCoord));
                if (bigIntegerFieldElement2Integer.signum() != 0) {
                    BigInteger bigIntegerMod = bigIntegerFieldElement2Integer.multiply(d2).add(bigIntegerGenerateRandomInteger).mod(n2);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigIntegerFieldElement2Integer, bigIntegerMod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        ECKeyParameters eCKeyParameters;
        if (z2) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                cipherParameters = parametersWithRandom.getParameters();
            } else {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(C1561oA.Qd("0&:$o4%\"3/%/3f\u000b\u001c\u0019*&\u0018\u0004\u0012\u001e\u0013\u001d\u001a", (short) (OY.Xd() ^ 2700))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    this.random = (SecureRandom) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        } else {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        }
        this.key = eCKeyParameters;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n2 = parameters.getN();
        if (bigInteger.compareTo(n2) >= 0 || bigInteger2.compareTo(n2) >= 0) {
            return false;
        }
        ECCurve curve = parameters.getCurve();
        ECFieldElement eCFieldElementHash2FieldElement = hash2FieldElement(curve, bArr);
        if (eCFieldElementHash2FieldElement.isZero()) {
            eCFieldElementHash2FieldElement = curve.fromBigInteger(ONE);
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigInteger2, ((ECPublicKeyParameters) this.key).getQ(), bigInteger).normalize();
        return !eCPointNormalize.isInfinity() && fieldElement2Integer(n2, eCFieldElementHash2FieldElement.multiply(eCPointNormalize.getAffineXCoord())).compareTo(bigInteger) == 0;
    }
}
