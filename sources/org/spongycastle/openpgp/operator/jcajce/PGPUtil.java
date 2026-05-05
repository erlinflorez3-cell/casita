package org.spongycastle.openpgp.operator.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
class PGPUtil {
    PGPUtil() {
    }

    static ECPoint decodePoint(BigInteger bigInteger, ECCurve eCCurve) throws IOException {
        return eCCurve.decodePoint(BigIntegers.asUnsignedByteArray(bigInteger));
    }

    static String getDigestName(int i2) throws PGPException {
        switch (i2) {
            case 1:
                return MessageDigestAlgorithms.MD5;
            case 2:
                return "SHA1";
            case 3:
                return "RIPEMD160";
            case 4:
            case 7:
            default:
                throw new PGPException("unknown hash algorithm tag in getDigestName: " + i2);
            case 5:
                return MessageDigestAlgorithms.MD2;
            case 6:
                return "TIGER";
            case 8:
                return McElieceCCA2ParameterSpec.DEFAULT_MD;
            case 9:
                return "SHA384";
            case 10:
                return "SHA512";
            case 11:
                return "SHA224";
        }
    }

    static String getSignatureName(int i2, int i3) throws PGPException {
        String str;
        if (i2 == 1 || i2 == 3) {
            str = "RSA";
        } else if (i2 == 20 || i2 == 16) {
            str = "ElGamal";
        } else {
            if (i2 != 17) {
                throw new PGPException("unknown algorithm tag in signature:" + i2);
            }
            str = "DSA";
        }
        return getDigestName(i3) + "with" + str;
    }

    static String getSymmetricCipherName(int i2) {
        switch (i2) {
            case 0:
                return null;
            case 1:
                return "IDEA";
            case 2:
                return "DESEDE";
            case 3:
                return "CAST5";
            case 4:
                return "Blowfish";
            case 5:
                return "SAFER";
            case 6:
                return "DES";
            case 7:
            case 8:
            case 9:
                return "AES";
            case 10:
                return "Twofish";
            case 11:
            case 12:
            case 13:
                return "Camellia";
            default:
                throw new IllegalArgumentException("unknown symmetric algorithm: " + i2);
        }
    }

    static X9ECParameters getX9Parameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
    }

    public static SecretKey makeSymmetricKey(int i2, byte[] bArr) throws PGPException {
        String symmetricCipherName = getSymmetricCipherName(i2);
        if (symmetricCipherName != null) {
            return new SecretKeySpec(bArr, symmetricCipherName);
        }
        throw new PGPException("unknown symmetric algorithm: " + i2);
    }
}
