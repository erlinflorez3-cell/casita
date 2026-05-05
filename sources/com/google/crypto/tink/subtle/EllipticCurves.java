package com.google.crypto.tink.subtle;

import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.subtle.EngineWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class EllipticCurves {

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.EllipticCurves$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType;

        static {
            int[] iArr = new int[CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = iArr;
            try {
                iArr[CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PointFormatType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = iArr2;
            try {
                iArr2[PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    public enum PointFormatType {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    private EllipticCurves() {
    }

    static void checkPublicKey(ECPublicKey key) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(key.getW(), key.getParams().getCurve());
    }

    public static byte[] computeSharedSecret(ECPrivateKey myPrivateKey, ECPublicKey peerPublicKey) throws GeneralSecurityException {
        validatePublicKeySpec(peerPublicKey, myPrivateKey);
        return computeSharedSecret(myPrivateKey, peerPublicKey.getW());
    }

    public static byte[] computeSharedSecret(ECPrivateKey myPrivateKey, ECPoint publicPoint) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(publicPoint, myPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(publicPoint, myPrivateKey.getParams()));
        KeyAgreement engineFactory = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(myPrivateKey);
        try {
            engineFactory.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = engineFactory.generateSecret();
            validateSharedSecret(bArrGenerateSecret, myPrivateKey);
            return bArrGenerateSecret;
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static ECPoint ecPointDecode(EllipticCurve curve, PointFormatType format, byte[] encoded) throws GeneralSecurityException {
        return pointDecode(curve, format, encoded);
    }

    public static byte[] ecdsaDer2Ieee(byte[] der, int ieeeLength) throws GeneralSecurityException {
        if (!isValidDerEncoding(der)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr = new byte[ieeeLength];
        int i2 = (der[1] & 255) >= 128 ? 3 : 2;
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        int i5 = der[i3];
        int i6 = der[i4] == 0 ? 1 : 0;
        System.arraycopy(der, i4 + i6, bArr, ((ieeeLength / 2) - i5) + i6, i5 - i6);
        int i7 = i4 + i5 + 1;
        int i8 = i7 + 1;
        int i9 = der[i7];
        int i10 = der[i8] != 0 ? 0 : 1;
        System.arraycopy(der, i8 + i10, bArr, (ieeeLength - i9) + i10, i9 - i10);
        return bArr;
    }

    public static byte[] ecdsaIeee2Der(byte[] ieee) throws GeneralSecurityException {
        byte[] bArr;
        int i2;
        if (ieee.length % 2 != 0 || ieee.length == 0 || ieee.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] minimalSignedNumber = toMinimalSignedNumber(Arrays.copyOf(ieee, ieee.length / 2));
        byte[] minimalSignedNumber2 = toMinimalSignedNumber(Arrays.copyOfRange(ieee, ieee.length / 2, ieee.length));
        int length = minimalSignedNumber.length + 4 + minimalSignedNumber2.length;
        if (length >= 128) {
            bArr = new byte[length + 3];
            bArr[0] = 48;
            bArr[1] = -127;
            bArr[2] = (byte) length;
            i2 = 3;
        } else {
            bArr = new byte[length + 2];
            bArr[0] = 48;
            bArr[1] = (byte) length;
            i2 = 2;
        }
        int i3 = i2 + 1;
        bArr[i2] = 2;
        int i4 = i2 + 2;
        bArr[i3] = (byte) minimalSignedNumber.length;
        System.arraycopy(minimalSignedNumber, 0, bArr, i4, minimalSignedNumber.length);
        int length2 = i4 + minimalSignedNumber.length;
        bArr[length2] = 2;
        bArr[length2 + 1] = (byte) minimalSignedNumber2.length;
        System.arraycopy(minimalSignedNumber2, 0, bArr, length2 + 2, minimalSignedNumber2.length);
        return bArr;
    }

    public static int encodingSizeInBytes(EllipticCurve curve, PointFormatType format) throws GeneralSecurityException {
        int iFieldSizeInBytes = fieldSizeInBytes(curve);
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[format.ordinal()];
        if (i2 == 1) {
            return (iFieldSizeInBytes * 2) + 1;
        }
        if (i2 == 2) {
            return iFieldSizeInBytes * 2;
        }
        if (i2 == 3) {
            return iFieldSizeInBytes + 1;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static int fieldSizeInBits(EllipticCurve curve) throws GeneralSecurityException {
        return getModulus(curve).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve curve) throws GeneralSecurityException {
        return (fieldSizeInBits(curve) + 7) / 8;
    }

    public static KeyPair generateKeyPair(CurveType curve) throws GeneralSecurityException {
        return generateKeyPair(getCurveSpec(curve));
    }

    public static KeyPair generateKeyPair(ECParameterSpec spec) throws Throwable {
        EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> engineFactory = EngineFactory.KEY_PAIR_GENERATOR;
        short sXd = (short) (FB.Xd() ^ 5210);
        short sXd2 = (short) (FB.Xd() ^ 16666);
        int[] iArr = new int["'/".length()];
        QB qb = new QB("'/");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        KeyPairGenerator engineFactory2 = engineFactory.getInstance(new String(iArr, 0, i2));
        short sXd3 = (short) (OY.Xd() ^ 3616);
        short sXd4 = (short) (OY.Xd() ^ 31916);
        int[] iArr2 = new int["@.\u000b=h]\u0019\u00160\u000b4\n,B\u0004\u0016Y\u001d\u001cbFDx\u0002\u0016@#@$>".length()];
        QB qb2 = new QB("@.\u000b=h]\u0019\u00160\u000b4\n,B\u0004\u0016Y\u001d\u001cbFDx\u0002\u0016@#@$>");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        Object[] objArr = {spec};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Ig.wd("\u0004`+\u0015\u0010*_z<*", (short) (C1580rY.Xd() ^ (-26687))), Class.forName(C1626yg.Ud("C22\u001c|X%Vf3\u000f9r\u0002'pdhy,qB1Ib\"SF);\u00118\u0003N\u0018\u001b'|\u007f?2", (short) (C1580rY.Xd() ^ (-27470)), (short) (C1580rY.Xd() ^ (-18345)))));
        try {
            method.setAccessible(true);
            method.invoke(engineFactory2, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("Zv{H~\"*I+uhW(lSQ#\nT\u0017_icrY,zK6\t", (short) (C1607wl.Xd() ^ 6106))).getMethod(C1561oA.Qd("\b\u0005\r\u0003\u000f|\u000f~c|\u0010eu|\u0005", (short) (Od.Xd() ^ (-10990))), new Class[0]);
            try {
                method2.setAccessible(true);
                return (KeyPair) method2.invoke(engineFactory2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static ECParameterSpec getCurveSpec(CurveType curve) throws NoSuchAlgorithmException {
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[curve.ordinal()];
        if (i2 == 1) {
            return getNistP256Params();
        }
        if (i2 == 2) {
            return getNistP384Params();
        }
        if (i2 == 3) {
            return getNistP521Params();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + curve);
    }

    public static ECPrivateKey getEcPrivateKey(CurveType curve, final byte[] keyValue) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new ECPrivateKeySpec(BigIntegerEncoding.fromUnsignedBigEndianBytes(keyValue), getCurveSpec(curve)));
    }

    public static ECPrivateKey getEcPrivateKey(final byte[] pkcs8PrivateKey) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(pkcs8PrivateKey));
    }

    public static ECPublicKey getEcPublicKey(CurveType curve, PointFormatType pointFormat, final byte[] publicKey) throws GeneralSecurityException {
        return getEcPublicKey(getCurveSpec(curve), pointFormat, publicKey);
    }

    public static ECPublicKey getEcPublicKey(CurveType curve, final byte[] x2, final byte[] y2) throws GeneralSecurityException {
        ECParameterSpec curveSpec = getCurveSpec(curve);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, x2), new BigInteger(1, y2));
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, curveSpec));
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec spec, PointFormatType pointFormat, final byte[] publicKey) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(pointDecode(spec.getCurve(), pointFormat, publicKey), spec));
    }

    public static ECPublicKey getEcPublicKey(final byte[] x509PublicKey) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new X509EncodedKeySpec(x509PublicKey));
    }

    public static BigInteger getModulus(EllipticCurve curve) throws GeneralSecurityException {
        return EllipticCurvesUtil.getModulus(curve);
    }

    public static ECParameterSpec getNistP256Params() {
        return EllipticCurvesUtil.NIST_P256_PARAMS;
    }

    public static ECParameterSpec getNistP384Params() {
        return EllipticCurvesUtil.NIST_P384_PARAMS;
    }

    public static ECParameterSpec getNistP521Params() {
        return EllipticCurvesUtil.NIST_P521_PARAMS;
    }

    public static BigInteger getY(BigInteger x2, boolean lsb, EllipticCurve curve) throws GeneralSecurityException {
        BigInteger modulus = getModulus(curve);
        BigInteger bigIntegerModSqrt = modSqrt(x2.multiply(x2).add(curve.getA()).multiply(x2).add(curve.getB()).mod(modulus), modulus);
        return lsb != bigIntegerModSqrt.testBit(0) ? modulus.subtract(bigIntegerModSqrt).mod(modulus) : bigIntegerModSqrt;
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec spec) {
        return EllipticCurvesUtil.isNistEcParameterSpec(spec);
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec one, ECParameterSpec two) {
        return EllipticCurvesUtil.isSameEcParameterSpec(one, two);
    }

    public static boolean isValidDerEncoding(final byte[] sig) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (sig.length < 8 || sig[0] != 48) {
            return false;
        }
        int i6 = sig[1] & 255;
        if (i6 == 129) {
            byte b2 = sig[2];
            i6 = (b2 + 255) - (b2 | 255);
            if (i6 < 128) {
                return false;
            }
            i2 = 2;
        } else {
            if (i6 == 128 || i6 > 129) {
                return false;
            }
            i2 = 1;
        }
        if (i6 != (sig.length - 1) - i2 || sig[i2 + 1] != 2 || (i5 = (i4 = i2 + 3 + (i3 = (-1) - (((-1) - sig[i2 + 2]) | ((-1) - 255)))) + 1) >= sig.length || i3 == 0) {
            return false;
        }
        int i7 = i2 + 3;
        byte b3 = sig[i7];
        if ((b3 + 255) - (255 | b3) >= 128) {
            return false;
        }
        if ((i3 > 1 && b3 == 0 && (sig[i2 + 4] & 255) < 128) || sig[i7 + i3] != 2) {
            return false;
        }
        int i8 = sig[i5] & 255;
        if (i4 + 2 + i8 != sig.length || i8 == 0) {
            return false;
        }
        byte b4 = sig[i2 + 5 + i3];
        if ((255 & b4) >= 128) {
            return false;
        }
        if (i8 > 1 && b4 == 0) {
            byte b5 = sig[i2 + 6 + i3];
            if ((b5 + 255) - (b5 | 255) < 128) {
                return false;
            }
        }
        return true;
    }

    protected static BigInteger modSqrt(BigInteger x2, BigInteger p2) throws GeneralSecurityException {
        BigInteger bigIntegerMod;
        if (p2.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = x2.mod(p2);
        if (bigIntegerMod2.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        int i2 = 0;
        if (p2.testBit(0) && p2.testBit(1)) {
            bigIntegerMod = bigIntegerMod2.modPow(p2.add(BigInteger.ONE).shiftRight(2), p2);
        } else if (!p2.testBit(0) || p2.testBit(1)) {
            bigIntegerMod = null;
        } else {
            BigInteger bigIntegerAdd = BigInteger.ONE;
            BigInteger bigIntegerShiftRight = p2.subtract(BigInteger.ONE).shiftRight(1);
            while (true) {
                BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(p2);
                if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                    return bigIntegerAdd;
                }
                BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, p2);
                if (bigIntegerModPow.add(BigInteger.ONE).equals(p2)) {
                    BigInteger bigIntegerShiftRight2 = p2.add(BigInteger.ONE).shiftRight(1);
                    BigInteger bigIntegerMod4 = BigInteger.ONE;
                    bigIntegerMod = bigIntegerAdd;
                    for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                        BigInteger bigIntegerMultiply = bigIntegerMod.multiply(bigIntegerMod4);
                        bigIntegerMod = bigIntegerMod.multiply(bigIntegerMod).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(p2).multiply(bigIntegerMod3)).mod(p2);
                        bigIntegerMod4 = bigIntegerMultiply.add(bigIntegerMultiply).mod(p2);
                        if (bigIntegerShiftRight2.testBit(iBitLength)) {
                            BigInteger bigIntegerMod5 = bigIntegerMod.multiply(bigIntegerAdd).add(bigIntegerMod4.multiply(bigIntegerMod3)).mod(p2);
                            bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod4).add(bigIntegerMod).mod(p2);
                            bigIntegerMod = bigIntegerMod5;
                        }
                    }
                } else {
                    if (!bigIntegerModPow.equals(BigInteger.ONE)) {
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    }
                    bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
                    i2++;
                    if (i2 == 128 && !p2.isProbablePrime(80)) {
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    }
                }
            }
        }
        if (bigIntegerMod == null || bigIntegerMod.multiply(bigIntegerMod).mod(p2).compareTo(bigIntegerMod2) == 0) {
            return bigIntegerMod;
        }
        throw new GeneralSecurityException("Could not find a modular square root");
    }

    public static ECPoint pointDecode(CurveType curveType, PointFormatType format, byte[] encoded) throws GeneralSecurityException {
        return pointDecode(getCurveSpec(curveType).getCurve(), format, encoded);
    }

    public static ECPoint pointDecode(EllipticCurve curve, PointFormatType format, byte[] encoded) throws GeneralSecurityException {
        int iFieldSizeInBytes = fieldSizeInBytes(curve);
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[format.ordinal()];
        boolean z2 = false;
        if (i2 == 1) {
            if (encoded.length != (iFieldSizeInBytes * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (encoded[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i3 = iFieldSizeInBytes + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(encoded, 1, i3)), new BigInteger(1, Arrays.copyOfRange(encoded, i3, encoded.length)));
            EllipticCurvesUtil.checkPointOnCurve(eCPoint, curve);
            return eCPoint;
        }
        if (i2 == 2) {
            if (encoded.length != iFieldSizeInBytes * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(encoded, 0, iFieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(encoded, iFieldSizeInBytes, encoded.length)));
            EllipticCurvesUtil.checkPointOnCurve(eCPoint2, curve);
            return eCPoint2;
        }
        if (i2 != 3) {
            throw new GeneralSecurityException("invalid format:" + format);
        }
        BigInteger modulus = getModulus(curve);
        if (encoded.length != iFieldSizeInBytes + 1) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b2 = encoded[0];
        if (b2 != 2) {
            if (b2 != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z2 = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(encoded, 1, encoded.length));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, getY(bigInteger, z2, curve));
    }

    public static byte[] pointEncode(CurveType curveType, PointFormatType format, ECPoint point) throws GeneralSecurityException {
        return pointEncode(getCurveSpec(curveType).getCurve(), format, point);
    }

    public static byte[] pointEncode(EllipticCurve curve, PointFormatType format, ECPoint point) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(point, curve);
        int iFieldSizeInBytes = fieldSizeInBytes(curve);
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[format.ordinal()];
        if (i2 == 1) {
            int i3 = (iFieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i3];
            byte[] bigEndianBytes = BigIntegerEncoding.toBigEndianBytes(point.getAffineX());
            byte[] bigEndianBytes2 = BigIntegerEncoding.toBigEndianBytes(point.getAffineY());
            System.arraycopy(bigEndianBytes2, 0, bArr, i3 - bigEndianBytes2.length, bigEndianBytes2.length);
            System.arraycopy(bigEndianBytes, 0, bArr, (iFieldSizeInBytes + 1) - bigEndianBytes.length, bigEndianBytes.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new GeneralSecurityException("invalid format:" + format);
            }
            int i4 = iFieldSizeInBytes + 1;
            byte[] bArr2 = new byte[i4];
            byte[] bigEndianBytes3 = BigIntegerEncoding.toBigEndianBytes(point.getAffineX());
            System.arraycopy(bigEndianBytes3, 0, bArr2, i4 - bigEndianBytes3.length, bigEndianBytes3.length);
            bArr2[0] = (byte) (point.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        int i5 = iFieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i5];
        byte[] bigEndianBytes4 = BigIntegerEncoding.toBigEndianBytes(point.getAffineX());
        if (bigEndianBytes4.length > iFieldSizeInBytes) {
            bigEndianBytes4 = Arrays.copyOfRange(bigEndianBytes4, bigEndianBytes4.length - iFieldSizeInBytes, bigEndianBytes4.length);
        }
        byte[] bigEndianBytes5 = BigIntegerEncoding.toBigEndianBytes(point.getAffineY());
        if (bigEndianBytes5.length > iFieldSizeInBytes) {
            bigEndianBytes5 = Arrays.copyOfRange(bigEndianBytes5, bigEndianBytes5.length - iFieldSizeInBytes, bigEndianBytes5.length);
        }
        System.arraycopy(bigEndianBytes5, 0, bArr3, i5 - bigEndianBytes5.length, bigEndianBytes5.length);
        System.arraycopy(bigEndianBytes4, 0, bArr3, iFieldSizeInBytes - bigEndianBytes4.length, bigEndianBytes4.length);
        return bArr3;
    }

    private static byte[] toMinimalSignedNumber(byte[] bs) {
        int length = 0;
        while (length < bs.length && bs[length] == 0) {
            length++;
        }
        if (length == bs.length) {
            length = bs.length - 1;
        }
        int i2 = (-1) - (((-1) - bs[length]) | ((-1) - 128)) == 128 ? 1 : 0;
        byte[] bArr = new byte[(bs.length - length) + i2];
        System.arraycopy(bs, length, bArr, i2, bs.length - length);
        return bArr;
    }

    public static void validatePublicKey(ECPublicKey publicKey, ECPrivateKey privateKey) throws GeneralSecurityException {
        validatePublicKeySpec(publicKey, privateKey);
        EllipticCurvesUtil.checkPointOnCurve(publicKey.getW(), privateKey.getParams().getCurve());
    }

    static void validatePublicKeySpec(ECPublicKey publicKey, ECPrivateKey privateKey) throws GeneralSecurityException {
        try {
            if (isSameEcParameterSpec(publicKey.getParams(), privateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    private static void validateSharedSecret(byte[] secret, ECPrivateKey privateKey) throws GeneralSecurityException {
        EllipticCurve curve = privateKey.getParams().getCurve();
        BigInteger bigInteger = new BigInteger(1, secret);
        if (bigInteger.signum() == -1 || bigInteger.compareTo(getModulus(curve)) >= 0) {
            throw new GeneralSecurityException("shared secret is out of range");
        }
        getY(bigInteger, true, curve);
    }
}
