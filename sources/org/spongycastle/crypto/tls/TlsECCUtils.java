package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.ec.CustomNamedCurves;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Integers;

/* JADX INFO: loaded from: classes2.dex */
public class TlsECCUtils {
    public static final Integer EXT_elliptic_curves = Integers.valueOf(10);
    public static final Integer EXT_ec_point_formats = Integers.valueOf(11);
    private static final String[] CURVE_NAMES = {"sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1"};

    public static void addSupportedEllipticCurvesExtension(Hashtable hashtable, int[] iArr) throws IOException {
        hashtable.put(EXT_elliptic_curves, createSupportedEllipticCurvesExtension(iArr));
    }

    public static void addSupportedPointFormatsExtension(Hashtable hashtable, short[] sArr) throws IOException {
        hashtable.put(EXT_ec_point_formats, createSupportedPointFormatsExtension(sArr));
    }

    public static boolean areOnSameCurve(ECDomainParameters eCDomainParameters, ECDomainParameters eCDomainParameters2) {
        return eCDomainParameters.getCurve().equals(eCDomainParameters2.getCurve()) && eCDomainParameters.getG().equals(eCDomainParameters2.getG()) && eCDomainParameters.getN().equals(eCDomainParameters2.getN()) && eCDomainParameters.getH().equals(eCDomainParameters2.getH());
    }

    public static byte[] calculateECDHBasicAgreement(ECPublicKeyParameters eCPublicKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters) {
        ECDHBasicAgreement eCDHBasicAgreement = new ECDHBasicAgreement();
        eCDHBasicAgreement.init(eCPrivateKeyParameters);
        return BigIntegers.asUnsignedByteArray(eCDHBasicAgreement.getFieldSize(), eCDHBasicAgreement.calculateAgreement(eCPublicKeyParameters));
    }

    private static void checkNamedCurve(int[] iArr, int i2) throws IOException {
        if (iArr != null && !Arrays.contains(iArr, i2)) {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public static boolean containsECCCipherSuites(int[] iArr) {
        for (int i2 : iArr) {
            if (isECCCipherSuite(i2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] createSupportedEllipticCurvesExtension(int[] iArr) throws IOException {
        if (iArr == null || iArr.length < 1) {
            throw new TlsFatalAlert((short) 80);
        }
        return TlsUtils.encodeUint16ArrayWithUint16Length(iArr);
    }

    public static byte[] createSupportedPointFormatsExtension(short[] sArr) throws IOException {
        if (sArr == null || !Arrays.contains(sArr, (short) 0)) {
            sArr = Arrays.append(sArr, (short) 0);
        }
        return TlsUtils.encodeUint8ArrayWithUint8Length(sArr);
    }

    public static BigInteger deserializeECFieldElement(int i2, byte[] bArr) throws IOException {
        if (bArr.length == (i2 + 7) / 8) {
            return new BigInteger(1, bArr);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static ECPoint deserializeECPoint(short[] sArr, ECCurve eCCurve, byte[] bArr) throws IOException {
        if (bArr != null) {
            short s2 = 1;
            if (bArr.length >= 1) {
                byte b2 = bArr[0];
                if (b2 == 2 || b2 == 3) {
                    if (ECAlgorithms.isF2mCurve(eCCurve)) {
                        s2 = 2;
                    } else if (!ECAlgorithms.isFpCurve(eCCurve)) {
                        throw new TlsFatalAlert((short) 47);
                    }
                } else {
                    if (b2 != 4) {
                        throw new TlsFatalAlert((short) 47);
                    }
                    s2 = 0;
                }
                if (s2 == 0 || (sArr != null && Arrays.contains(sArr, s2))) {
                    return eCCurve.decodePoint(bArr);
                }
                throw new TlsFatalAlert((short) 47);
            }
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static ECPublicKeyParameters deserializeECPublicKey(short[] sArr, ECDomainParameters eCDomainParameters, byte[] bArr) throws IOException {
        try {
            return new ECPublicKeyParameters(deserializeECPoint(sArr, eCDomainParameters.getCurve(), bArr), eCDomainParameters);
        } catch (RuntimeException e2) {
            throw new TlsFatalAlert((short) 47, e2);
        }
    }

    public static AsymmetricCipherKeyPair generateECKeyPair(SecureRandom secureRandom, ECDomainParameters eCDomainParameters) throws Throwable {
        ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
        eCKeyPairGenerator.init(new ECKeyGenerationParameters(eCDomainParameters, secureRandom));
        return eCKeyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom secureRandom, short[] sArr, ECDomainParameters eCDomainParameters, OutputStream outputStream) throws Throwable {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateECKeyPair = generateECKeyPair(secureRandom, eCDomainParameters);
        writeECPoint(sArr, ((ECPublicKeyParameters) asymmetricCipherKeyPairGenerateECKeyPair.getPublic()).getQ(), outputStream);
        return (ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateECKeyPair.getPrivate();
    }

    static ECPrivateKeyParameters generateEphemeralServerKeyExchange(SecureRandom secureRandom, int[] iArr, short[] sArr, OutputStream outputStream) throws IOException {
        int i2;
        if (iArr != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                i2 = iArr[i3];
                if (NamedCurve.isValid(i2) && isSupportedNamedCurve(i2)) {
                    break;
                }
                i3++;
            }
        } else {
            i2 = 23;
        }
        ECDomainParameters parametersForNamedCurve = i2 >= 0 ? getParametersForNamedCurve(i2) : Arrays.contains(iArr, 65281) ? getParametersForNamedCurve(23) : Arrays.contains(iArr, 65282) ? getParametersForNamedCurve(10) : null;
        if (parametersForNamedCurve == null) {
            throw new TlsFatalAlert((short) 80);
        }
        if (i2 < 0) {
            writeExplicitECParameters(sArr, parametersForNamedCurve, outputStream);
        } else {
            writeNamedECParameters(i2, outputStream);
        }
        return generateEphemeralClientKeyExchange(secureRandom, sArr, parametersForNamedCurve, outputStream);
    }

    public static String getNameOfNamedCurve(int i2) {
        if (isSupportedNamedCurve(i2)) {
            return CURVE_NAMES[i2 - 1];
        }
        return null;
    }

    public static ECDomainParameters getParametersForNamedCurve(int i2) {
        String nameOfNamedCurve = getNameOfNamedCurve(i2);
        if (nameOfNamedCurve == null) {
            return null;
        }
        X9ECParameters byName = CustomNamedCurves.getByName(nameOfNamedCurve);
        if (byName == null && (byName = ECNamedCurveTable.getByName(nameOfNamedCurve)) == null) {
            return null;
        }
        return new ECDomainParameters(byName.getCurve(), byName.getG(), byName.getN(), byName.getH(), byName.getSeed());
    }

    public static int[] getSupportedEllipticCurvesExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_elliptic_curves);
        if (extensionData == null) {
            return null;
        }
        return readSupportedEllipticCurvesExtension(extensionData);
    }

    public static short[] getSupportedPointFormatsExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_ec_point_formats);
        if (extensionData == null) {
            return null;
        }
        return readSupportedPointFormatsExtension(extensionData);
    }

    public static boolean hasAnySupportedNamedCurves() {
        return CURVE_NAMES.length > 0;
    }

    public static boolean isCompressionPreferred(short[] sArr, short s2) {
        short s3;
        if (sArr == null) {
            return false;
        }
        for (int i2 = 0; i2 < sArr.length && (s3 = sArr[i2]) != 0; i2++) {
            if (s3 == s2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isECCCipherSuite(int i2) {
        switch (i2) {
            case 49153:
            case 49154:
            case 49155:
            case 49156:
            case 49157:
            case 49158:
            case 49159:
            case 49160:
            case 49161:
            case 49162:
            case 49163:
            case 49164:
            case 49165:
            case 49166:
            case 49167:
            case 49168:
            case 49169:
            case 49170:
            case 49171:
            case 49172:
            case 49173:
            case 49174:
            case 49175:
            case 49176:
            case 49177:
                return true;
            default:
                switch (i2) {
                    case 49187:
                    case 49188:
                    case 49189:
                    case 49190:
                    case 49191:
                    case 49192:
                    case 49193:
                    case 49194:
                    case 49195:
                    case 49196:
                    case 49197:
                    case 49198:
                    case 49199:
                    case 49200:
                    case 49201:
                    case 49202:
                    case 49203:
                    case 49204:
                    case 49205:
                    case 49206:
                    case 49207:
                    case 49208:
                    case 49209:
                    case 49210:
                    case 49211:
                        return true;
                    default:
                        switch (i2) {
                            case 49266:
                            case 49267:
                            case 49268:
                            case 49269:
                            case 49270:
                            case 49271:
                            case 49272:
                            case 49273:
                                return true;
                            default:
                                switch (i2) {
                                    case 49286:
                                    case 49287:
                                    case 49288:
                                    case 49289:
                                    case 49290:
                                    case 49291:
                                    case 49292:
                                    case 49293:
                                        return true;
                                    default:
                                        switch (i2) {
                                            case 49306:
                                            case 49307:
                                                return true;
                                            default:
                                                switch (i2) {
                                                    case 49324:
                                                    case 49325:
                                                    case 49326:
                                                    case 49327:
                                                        return true;
                                                    default:
                                                        switch (i2) {
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                                                                return true;
                                                            default:
                                                                switch (i2) {
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58386 */:
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_SALSA20_SHA1 /* 58387 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_ESTREAM_SALSA20_SHA1 /* 58388 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_SALSA20_SHA1 /* 58389 */:
                                                                        return true;
                                                                    default:
                                                                        switch (i2) {
                                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58392 */:
                                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_SALSA20_SHA1 /* 58393 */:
                                                                                return true;
                                                                            default:
                                                                                return false;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static boolean isSupportedNamedCurve(int i2) {
        return i2 > 0 && i2 <= CURVE_NAMES.length;
    }

    public static int readECExponent(int i2, InputStream inputStream) throws IOException {
        int iIntValue;
        BigInteger eCParameter = readECParameter(inputStream);
        if (eCParameter.bitLength() >= 32 || (iIntValue = eCParameter.intValue()) <= 0 || iIntValue >= i2) {
            throw new TlsFatalAlert((short) 47);
        }
        return iIntValue;
    }

    public static BigInteger readECFieldElement(int i2, InputStream inputStream) throws IOException {
        return deserializeECFieldElement(i2, TlsUtils.readOpaque8(inputStream));
    }

    public static BigInteger readECParameter(InputStream inputStream) throws IOException {
        return new BigInteger(1, TlsUtils.readOpaque8(inputStream));
    }

    public static ECDomainParameters readECParameters(int[] iArr, short[] sArr, InputStream inputStream) throws IOException {
        int eCExponent;
        int eCExponent2;
        BigInteger bigInteger;
        ECCurve.F2m f2m;
        try {
            short uint8 = TlsUtils.readUint8(inputStream);
            if (uint8 == 1) {
                checkNamedCurve(iArr, 65281);
                BigInteger eCParameter = readECParameter(inputStream);
                BigInteger eCFieldElement = readECFieldElement(eCParameter.bitLength(), inputStream);
                BigInteger eCFieldElement2 = readECFieldElement(eCParameter.bitLength(), inputStream);
                byte[] opaque8 = TlsUtils.readOpaque8(inputStream);
                BigInteger eCParameter2 = readECParameter(inputStream);
                BigInteger eCParameter3 = readECParameter(inputStream);
                ECCurve.Fp fp = new ECCurve.Fp(eCParameter, eCFieldElement, eCFieldElement2, eCParameter2, eCParameter3);
                return new ECDomainParameters(fp, deserializeECPoint(sArr, fp, opaque8), eCParameter2, eCParameter3);
            }
            if (uint8 != 2) {
                if (uint8 != 3) {
                    throw new TlsFatalAlert((short) 47);
                }
                int uint16 = TlsUtils.readUint16(inputStream);
                if (!NamedCurve.refersToASpecificNamedCurve(uint16)) {
                    throw new TlsFatalAlert((short) 47);
                }
                checkNamedCurve(iArr, uint16);
                return getParametersForNamedCurve(uint16);
            }
            checkNamedCurve(iArr, 65282);
            int uint162 = TlsUtils.readUint16(inputStream);
            short uint82 = TlsUtils.readUint8(inputStream);
            if (!ECBasisType.isValid(uint82)) {
                throw new TlsFatalAlert((short) 47);
            }
            int eCExponent3 = readECExponent(uint162, inputStream);
            if (uint82 == 2) {
                eCExponent = readECExponent(uint162, inputStream);
                eCExponent2 = readECExponent(uint162, inputStream);
            } else {
                eCExponent = -1;
                eCExponent2 = -1;
            }
            BigInteger eCFieldElement3 = readECFieldElement(uint162, inputStream);
            BigInteger eCFieldElement4 = readECFieldElement(uint162, inputStream);
            byte[] opaque82 = TlsUtils.readOpaque8(inputStream);
            BigInteger eCParameter4 = readECParameter(inputStream);
            BigInteger eCParameter5 = readECParameter(inputStream);
            if (uint82 == 2) {
                bigInteger = eCParameter4;
                f2m = new ECCurve.F2m(uint162, eCExponent3, eCExponent, eCExponent2, eCFieldElement3, eCFieldElement4, eCParameter4, eCParameter5);
            } else {
                bigInteger = eCParameter4;
                f2m = new ECCurve.F2m(uint162, eCExponent3, eCFieldElement3, eCFieldElement4, bigInteger, eCParameter5);
            }
            return new ECDomainParameters(f2m, deserializeECPoint(sArr, f2m, opaque82), bigInteger, eCParameter5);
        } catch (RuntimeException e2) {
            throw new TlsFatalAlert((short) 47, e2);
        }
    }

    public static int[] readSupportedEllipticCurvesExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int uint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (uint16 < 2 || (1 & uint16) != 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int[] uint16Array = TlsUtils.readUint16Array(uint16 / 2, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return uint16Array;
    }

    public static short[] readSupportedPointFormatsExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        short uint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (uint8 < 1) {
            throw new TlsFatalAlert((short) 50);
        }
        short[] uint8Array = TlsUtils.readUint8Array(uint8, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (Arrays.contains(uint8Array, (short) 0)) {
            return uint8Array;
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static byte[] serializeECFieldElement(int i2, BigInteger bigInteger) throws IOException {
        return BigIntegers.asUnsignedByteArray((i2 + 7) / 8, bigInteger);
    }

    public static byte[] serializeECPoint(short[] sArr, ECPoint eCPoint) throws IOException {
        ECCurve curve = eCPoint.getCurve();
        return eCPoint.getEncoded(ECAlgorithms.isFpCurve(curve) ? isCompressionPreferred(sArr, (short) 1) : ECAlgorithms.isF2mCurve(curve) ? isCompressionPreferred(sArr, (short) 2) : false);
    }

    public static byte[] serializeECPublicKey(short[] sArr, ECPublicKeyParameters eCPublicKeyParameters) throws IOException {
        return serializeECPoint(sArr, eCPublicKeyParameters.getQ());
    }

    public static ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters eCPublicKeyParameters) throws IOException {
        return eCPublicKeyParameters;
    }

    public static void writeECExponent(int i2, OutputStream outputStream) throws IOException {
        writeECParameter(BigInteger.valueOf(i2), outputStream);
    }

    public static void writeECFieldElement(int i2, BigInteger bigInteger, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(serializeECFieldElement(i2, bigInteger), outputStream);
    }

    public static void writeECFieldElement(ECFieldElement eCFieldElement, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(eCFieldElement.getEncoded(), outputStream);
    }

    public static void writeECParameter(BigInteger bigInteger, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(BigIntegers.asUnsignedByteArray(bigInteger), outputStream);
    }

    public static void writeECPoint(short[] sArr, ECPoint eCPoint, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(serializeECPoint(sArr, eCPoint), outputStream);
    }

    public static void writeExplicitECParameters(short[] sArr, ECDomainParameters eCDomainParameters, OutputStream outputStream) throws IOException {
        ECCurve curve = eCDomainParameters.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            TlsUtils.writeUint8((short) 1, outputStream);
            writeECParameter(curve.getField().getCharacteristic(), outputStream);
        } else {
            if (!ECAlgorithms.isF2mCurve(curve)) {
                throw new IllegalArgumentException("'ecParameters' not a known curve type");
            }
            int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
            TlsUtils.writeUint8((short) 2, outputStream);
            int i2 = exponentsPresent[exponentsPresent.length - 1];
            TlsUtils.checkUint16(i2);
            TlsUtils.writeUint16(i2, outputStream);
            if (exponentsPresent.length == 3) {
                TlsUtils.writeUint8((short) 1, outputStream);
                writeECExponent(exponentsPresent[1], outputStream);
            } else {
                if (exponentsPresent.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                TlsUtils.writeUint8((short) 2, outputStream);
                writeECExponent(exponentsPresent[1], outputStream);
                writeECExponent(exponentsPresent[2], outputStream);
                writeECExponent(exponentsPresent[3], outputStream);
            }
        }
        writeECFieldElement(curve.getA(), outputStream);
        writeECFieldElement(curve.getB(), outputStream);
        TlsUtils.writeOpaque8(serializeECPoint(sArr, eCDomainParameters.getG()), outputStream);
        writeECParameter(eCDomainParameters.getN(), outputStream);
        writeECParameter(eCDomainParameters.getH(), outputStream);
    }

    public static void writeNamedECParameters(int i2, OutputStream outputStream) throws IOException {
        if (!NamedCurve.refersToASpecificNamedCurve(i2)) {
            throw new TlsFatalAlert((short) 80);
        }
        TlsUtils.writeUint8((short) 3, outputStream);
        TlsUtils.checkUint16(i2);
        TlsUtils.writeUint16(i2, outputStream);
    }
}
