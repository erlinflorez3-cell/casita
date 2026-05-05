package org.spongycastle.openpgp.operator.jcajce;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECPoint;
import org.spongycastle.bcpg.BCPGKey;
import org.spongycastle.bcpg.DSAPublicBCPGKey;
import org.spongycastle.bcpg.DSASecretBCPGKey;
import org.spongycastle.bcpg.ECDHPublicBCPGKey;
import org.spongycastle.bcpg.ECDSAPublicBCPGKey;
import org.spongycastle.bcpg.ECSecretBCPGKey;
import org.spongycastle.bcpg.ElGamalPublicBCPGKey;
import org.spongycastle.bcpg.ElGamalSecretBCPGKey;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.RSAPublicBCPGKey;
import org.spongycastle.bcpg.RSASecretBCPGKey;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.openpgp.PGPAlgorithmParameters;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPKdfParameters;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPKeyConverter {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private KeyFingerPrintCalculator fingerPrintCalculator = new JcaKeyFingerprintCalculator();

    private ECParameterSpec getECParameterSpec(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, InvalidParameterSpecException, NoSuchProviderException {
        return getECParameterSpec(aSN1ObjectIdentifier, PGPUtil.getX9Parameters(aSN1ObjectIdentifier));
    }

    private ECParameterSpec getECParameterSpec(ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParameters x9ECParameters) throws NoSuchAlgorithmException, InvalidParameterSpecException, NoSuchProviderException {
        AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("EC");
        algorithmParametersCreateAlgorithmParameters.init(new ECGenParameterSpec(ECNamedCurveTable.getName(aSN1ObjectIdentifier)));
        return (ECParameterSpec) algorithmParametersCreateAlgorithmParameters.getParameterSpec(ECParameterSpec.class);
    }

    public PGPPrivateKey getPGPPrivateKey(PGPPublicKey pGPPublicKey, PrivateKey privateKey) throws PGPException {
        BCPGKey rSASecretBCPGKey;
        int algorithm = pGPPublicKey.getAlgorithm();
        if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) privateKey;
            rSASecretBCPGKey = new RSASecretBCPGKey(rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ());
        } else {
            switch (algorithm) {
                case 16:
                case 20:
                    rSASecretBCPGKey = new ElGamalSecretBCPGKey(((DHPrivateKey) privateKey).getX());
                    break;
                case 17:
                    rSASecretBCPGKey = new DSASecretBCPGKey(((DSAPrivateKey) privateKey).getX());
                    break;
                case 18:
                case 19:
                    rSASecretBCPGKey = new ECSecretBCPGKey(((ECPrivateKey) privateKey).getS());
                    break;
                default:
                    throw new PGPException("unknown key class");
            }
        }
        return new PGPPrivateKey(pGPPublicKey.getKeyID(), pGPPublicKey.getPublicKeyPacket(), rSASecretBCPGKey);
    }

    public PGPPublicKey getPGPPublicKey(int i2, PublicKey publicKey, Date date) throws PGPException {
        return getPGPPublicKey(i2, null, publicKey, date);
    }

    public PGPPublicKey getPGPPublicKey(int i2, PGPAlgorithmParameters pGPAlgorithmParameters, PublicKey publicKey, Date date) throws PGPException {
        BCPGKey eCDSAPublicBCPGKey;
        if (publicKey instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            eCDSAPublicBCPGKey = new RSAPublicBCPGKey(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        } else if (publicKey instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) publicKey;
            DSAParams params = dSAPublicKey.getParams();
            eCDSAPublicBCPGKey = new DSAPublicBCPGKey(params.getP(), params.getQ(), params.getG(), dSAPublicKey.getY());
        } else if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params2 = dHPublicKey.getParams();
            eCDSAPublicBCPGKey = new ElGamalPublicBCPGKey(params2.getP(), params2.getG(), dHPublicKey.getY());
        } else {
            if (!(publicKey instanceof ECPublicKey)) {
                throw new PGPException("unknown key class");
            }
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(publicKey.getEncoded());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            X9ECParameters byOID = NISTNamedCurves.getByOID(aSN1ObjectIdentifier);
            X9ECPoint x9ECPoint = new X9ECPoint(byOID.getCurve(), new DEROctetString(subjectPublicKeyInfo.getPublicKeyData().getBytes()));
            if (i2 == 18) {
                PGPKdfParameters pGPKdfParameters = (PGPKdfParameters) pGPAlgorithmParameters;
                if (pGPKdfParameters == null) {
                    pGPKdfParameters = new PGPKdfParameters(8, 7);
                }
                eCDSAPublicBCPGKey = new ECDHPublicBCPGKey(aSN1ObjectIdentifier, x9ECPoint.getPoint(), pGPKdfParameters.getHashAlgorithm(), pGPKdfParameters.getSymmetricWrapAlgorithm());
            } else {
                if (i2 != 19) {
                    throw new PGPException("unknown EC algorithm");
                }
                eCDSAPublicBCPGKey = new ECDSAPublicBCPGKey(aSN1ObjectIdentifier, x9ECPoint.getPoint());
            }
        }
        return new PGPPublicKey(new PublicKeyPacket(i2, date, eCDSAPublicBCPGKey), this.fingerPrintCalculator);
    }

    public PrivateKey getPrivateKey(PGPPrivateKey pGPPrivateKey) throws PGPException {
        if (pGPPrivateKey instanceof JcaPGPPrivateKey) {
            return ((JcaPGPPrivateKey) pGPPrivateKey).getPrivateKey();
        }
        PublicKeyPacket publicKeyPacket = pGPPrivateKey.getPublicKeyPacket();
        BCPGKey privateKeyDataPacket = pGPPrivateKey.getPrivateKeyDataPacket();
        try {
            int algorithm = publicKeyPacket.getAlgorithm();
            if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
                RSASecretBCPGKey rSASecretBCPGKey = (RSASecretBCPGKey) privateKeyDataPacket;
                return this.helper.createKeyFactory("RSA").generatePrivate(new RSAPrivateCrtKeySpec(rSASecretBCPGKey.getModulus(), ((RSAPublicBCPGKey) publicKeyPacket.getKey()).getPublicExponent(), rSASecretBCPGKey.getPrivateExponent(), rSASecretBCPGKey.getPrimeP(), rSASecretBCPGKey.getPrimeQ(), rSASecretBCPGKey.getPrimeExponentP(), rSASecretBCPGKey.getPrimeExponentQ(), rSASecretBCPGKey.getCrtCoefficient()));
            }
            switch (algorithm) {
                case 16:
                case 20:
                    ElGamalPublicBCPGKey elGamalPublicBCPGKey = (ElGamalPublicBCPGKey) publicKeyPacket.getKey();
                    return this.helper.createKeyFactory("ElGamal").generatePrivate(new DHPrivateKeySpec(((ElGamalSecretBCPGKey) privateKeyDataPacket).getX(), elGamalPublicBCPGKey.getP(), elGamalPublicBCPGKey.getG()));
                case 17:
                    DSAPublicBCPGKey dSAPublicBCPGKey = (DSAPublicBCPGKey) publicKeyPacket.getKey();
                    return this.helper.createKeyFactory("DSA").generatePrivate(new DSAPrivateKeySpec(((DSASecretBCPGKey) privateKeyDataPacket).getX(), dSAPublicBCPGKey.getP(), dSAPublicBCPGKey.getQ(), dSAPublicBCPGKey.getG()));
                case 18:
                    return this.helper.createKeyFactory("ECDH").generatePrivate(new ECPrivateKeySpec(((ECSecretBCPGKey) privateKeyDataPacket).getX(), getECParameterSpec(((ECDHPublicBCPGKey) publicKeyPacket.getKey()).getCurveOID())));
                case 19:
                    return this.helper.createKeyFactory("ECDSA").generatePrivate(new ECPrivateKeySpec(((ECSecretBCPGKey) privateKeyDataPacket).getX(), getECParameterSpec(((ECDSAPublicBCPGKey) publicKeyPacket.getKey()).getCurveOID())));
                default:
                    throw new PGPException("unknown public key algorithm encountered");
            }
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception constructing key", e3);
        }
    }

    public PublicKey getPublicKey(PGPPublicKey pGPPublicKey) throws PGPException {
        PublicKeyPacket publicKeyPacket = pGPPublicKey.getPublicKeyPacket();
        try {
            int algorithm = publicKeyPacket.getAlgorithm();
            if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
                RSAPublicBCPGKey rSAPublicBCPGKey = (RSAPublicBCPGKey) publicKeyPacket.getKey();
                return this.helper.createKeyFactory("RSA").generatePublic(new RSAPublicKeySpec(rSAPublicBCPGKey.getModulus(), rSAPublicBCPGKey.getPublicExponent()));
            }
            switch (algorithm) {
                case 16:
                case 20:
                    ElGamalPublicBCPGKey elGamalPublicBCPGKey = (ElGamalPublicBCPGKey) publicKeyPacket.getKey();
                    return this.helper.createKeyFactory("ElGamal").generatePublic(new DHPublicKeySpec(elGamalPublicBCPGKey.getY(), elGamalPublicBCPGKey.getP(), elGamalPublicBCPGKey.getG()));
                case 17:
                    DSAPublicBCPGKey dSAPublicBCPGKey = (DSAPublicBCPGKey) publicKeyPacket.getKey();
                    return this.helper.createKeyFactory("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicBCPGKey.getY(), dSAPublicBCPGKey.getP(), dSAPublicBCPGKey.getQ(), dSAPublicBCPGKey.getG()));
                case 18:
                    ECDHPublicBCPGKey eCDHPublicBCPGKey = (ECDHPublicBCPGKey) publicKeyPacket.getKey();
                    X9ECParameters x9Parameters = PGPUtil.getX9Parameters(eCDHPublicBCPGKey.getCurveOID());
                    ECPoint eCPointDecodePoint = PGPUtil.decodePoint(eCDHPublicBCPGKey.getEncodedPoint(), x9Parameters.getCurve());
                    return this.helper.createKeyFactory("ECDH").generatePublic(new ECPublicKeySpec(new java.security.spec.ECPoint(eCPointDecodePoint.getAffineXCoord().toBigInteger(), eCPointDecodePoint.getAffineYCoord().toBigInteger()), getECParameterSpec(eCDHPublicBCPGKey.getCurveOID(), x9Parameters)));
                case 19:
                    ECDSAPublicBCPGKey eCDSAPublicBCPGKey = (ECDSAPublicBCPGKey) publicKeyPacket.getKey();
                    X9ECParameters x9Parameters2 = PGPUtil.getX9Parameters(eCDSAPublicBCPGKey.getCurveOID());
                    ECPoint eCPointDecodePoint2 = PGPUtil.decodePoint(eCDSAPublicBCPGKey.getEncodedPoint(), x9Parameters2.getCurve());
                    return this.helper.createKeyFactory("ECDSA").generatePublic(new ECPublicKeySpec(new java.security.spec.ECPoint(eCPointDecodePoint2.getAffineXCoord().toBigInteger(), eCPointDecodePoint2.getAffineYCoord().toBigInteger()), getECParameterSpec(eCDSAPublicBCPGKey.getCurveOID(), x9Parameters2)));
                default:
                    throw new PGPException("unknown public key algorithm encountered");
            }
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("exception constructing public key", e3);
        }
    }

    public JcaPGPKeyConverter setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaPGPKeyConverter setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
