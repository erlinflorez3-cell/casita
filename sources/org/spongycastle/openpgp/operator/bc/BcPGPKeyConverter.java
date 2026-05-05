package org.spongycastle.openpgp.operator.bc;

import java.io.IOException;
import java.util.Date;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECPoint;
import org.spongycastle.bcpg.BCPGKey;
import org.spongycastle.bcpg.DSAPublicBCPGKey;
import org.spongycastle.bcpg.DSASecretBCPGKey;
import org.spongycastle.bcpg.ECDHPublicBCPGKey;
import org.spongycastle.bcpg.ECDSAPublicBCPGKey;
import org.spongycastle.bcpg.ECPublicBCPGKey;
import org.spongycastle.bcpg.ECSecretBCPGKey;
import org.spongycastle.bcpg.ElGamalPublicBCPGKey;
import org.spongycastle.bcpg.ElGamalSecretBCPGKey;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.RSAPublicBCPGKey;
import org.spongycastle.bcpg.RSASecretBCPGKey;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ECNamedDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.crypto.util.SubjectPublicKeyInfoFactory;
import org.spongycastle.openpgp.PGPAlgorithmParameters;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPKdfParameters;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPKeyConverter {
    public PGPPrivateKey getPGPPrivateKey(PGPPublicKey pGPPublicKey, AsymmetricKeyParameter asymmetricKeyParameter) throws PGPException {
        BCPGKey rSASecretBCPGKey;
        int algorithm = pGPPublicKey.getAlgorithm();
        if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
            RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) asymmetricKeyParameter;
            rSASecretBCPGKey = new RSASecretBCPGKey(rSAPrivateCrtKeyParameters.getExponent(), rSAPrivateCrtKeyParameters.getP(), rSAPrivateCrtKeyParameters.getQ());
        } else {
            switch (algorithm) {
                case 16:
                case 20:
                    rSASecretBCPGKey = new ElGamalSecretBCPGKey(((ElGamalPrivateKeyParameters) asymmetricKeyParameter).getX());
                    break;
                case 17:
                    rSASecretBCPGKey = new DSASecretBCPGKey(((DSAPrivateKeyParameters) asymmetricKeyParameter).getX());
                    break;
                case 18:
                case 19:
                    rSASecretBCPGKey = new ECSecretBCPGKey(((ECPrivateKeyParameters) asymmetricKeyParameter).getD());
                    break;
                default:
                    throw new PGPException("unknown key class");
            }
        }
        return new PGPPrivateKey(pGPPublicKey.getKeyID(), pGPPublicKey.getPublicKeyPacket(), rSASecretBCPGKey);
    }

    public PGPPublicKey getPGPPublicKey(int i2, PGPAlgorithmParameters pGPAlgorithmParameters, AsymmetricKeyParameter asymmetricKeyParameter, Date date) throws PGPException {
        BCPGKey eCDSAPublicBCPGKey;
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            eCDSAPublicBCPGKey = new RSAPublicBCPGKey(rSAKeyParameters.getModulus(), rSAKeyParameters.getExponent());
        } else if (asymmetricKeyParameter instanceof DSAPublicKeyParameters) {
            DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPublicKeyParameters.getParameters();
            eCDSAPublicBCPGKey = new DSAPublicBCPGKey(parameters.getP(), parameters.getQ(), parameters.getG(), dSAPublicKeyParameters.getY());
        } else if (asymmetricKeyParameter instanceof ElGamalPublicKeyParameters) {
            ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) asymmetricKeyParameter;
            ElGamalParameters parameters2 = elGamalPublicKeyParameters.getParameters();
            eCDSAPublicBCPGKey = new ElGamalPublicBCPGKey(parameters2.getP(), parameters2.getG(), elGamalPublicKeyParameters.getY());
        } else {
            if (!(asymmetricKeyParameter instanceof ECPublicKeyParameters)) {
                throw new PGPException("unknown key class");
            }
            try {
                SubjectPublicKeyInfo subjectPublicKeyInfoCreateSubjectPublicKeyInfo = SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(subjectPublicKeyInfoCreateSubjectPublicKeyInfo.getAlgorithm().getParameters());
                X9ECPoint x9ECPoint = new X9ECPoint(NISTNamedCurves.getByOID(aSN1ObjectIdentifier).getCurve(), new DEROctetString(subjectPublicKeyInfoCreateSubjectPublicKeyInfo.getPublicKeyData().getBytes()));
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
            } catch (IOException e2) {
                throw new PGPException("Unable to encode key: " + e2.getMessage(), e2);
            }
        }
        return new PGPPublicKey(new PublicKeyPacket(i2, date, eCDSAPublicBCPGKey), new BcKeyFingerprintCalculator());
    }

    public AsymmetricKeyParameter getPrivateKey(PGPPrivateKey pGPPrivateKey) throws PGPException {
        PublicKeyPacket publicKeyPacket = pGPPrivateKey.getPublicKeyPacket();
        BCPGKey privateKeyDataPacket = pGPPrivateKey.getPrivateKeyDataPacket();
        try {
            int algorithm = publicKeyPacket.getAlgorithm();
            if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
                RSASecretBCPGKey rSASecretBCPGKey = (RSASecretBCPGKey) privateKeyDataPacket;
                return new RSAPrivateCrtKeyParameters(rSASecretBCPGKey.getModulus(), ((RSAPublicBCPGKey) publicKeyPacket.getKey()).getPublicExponent(), rSASecretBCPGKey.getPrivateExponent(), rSASecretBCPGKey.getPrimeP(), rSASecretBCPGKey.getPrimeQ(), rSASecretBCPGKey.getPrimeExponentP(), rSASecretBCPGKey.getPrimeExponentQ(), rSASecretBCPGKey.getCrtCoefficient());
            }
            switch (algorithm) {
                case 16:
                case 20:
                    ElGamalPublicBCPGKey elGamalPublicBCPGKey = (ElGamalPublicBCPGKey) publicKeyPacket.getKey();
                    return new ElGamalPrivateKeyParameters(((ElGamalSecretBCPGKey) privateKeyDataPacket).getX(), new ElGamalParameters(elGamalPublicBCPGKey.getP(), elGamalPublicBCPGKey.getG()));
                case 17:
                    DSAPublicBCPGKey dSAPublicBCPGKey = (DSAPublicBCPGKey) publicKeyPacket.getKey();
                    return new DSAPrivateKeyParameters(((DSASecretBCPGKey) privateKeyDataPacket).getX(), new DSAParameters(dSAPublicBCPGKey.getP(), dSAPublicBCPGKey.getQ(), dSAPublicBCPGKey.getG()));
                case 18:
                case 19:
                    ECPublicBCPGKey eCPublicBCPGKey = (ECPublicBCPGKey) publicKeyPacket.getKey();
                    X9ECParameters x9Parameters = BcUtil.getX9Parameters(eCPublicBCPGKey.getCurveOID());
                    return new ECPrivateKeyParameters(((ECSecretBCPGKey) privateKeyDataPacket).getX(), new ECNamedDomainParameters(eCPublicBCPGKey.getCurveOID(), x9Parameters.getCurve(), x9Parameters.getG(), x9Parameters.getN(), x9Parameters.getH()));
                default:
                    throw new PGPException("unknown public key algorithm encountered");
            }
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception constructing key", e3);
        }
    }

    public AsymmetricKeyParameter getPublicKey(PGPPublicKey pGPPublicKey) throws PGPException {
        PublicKeyPacket publicKeyPacket = pGPPublicKey.getPublicKeyPacket();
        try {
            int algorithm = publicKeyPacket.getAlgorithm();
            if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
                RSAPublicBCPGKey rSAPublicBCPGKey = (RSAPublicBCPGKey) publicKeyPacket.getKey();
                return new RSAKeyParameters(false, rSAPublicBCPGKey.getModulus(), rSAPublicBCPGKey.getPublicExponent());
            }
            switch (algorithm) {
                case 16:
                case 20:
                    ElGamalPublicBCPGKey elGamalPublicBCPGKey = (ElGamalPublicBCPGKey) publicKeyPacket.getKey();
                    return new ElGamalPublicKeyParameters(elGamalPublicBCPGKey.getY(), new ElGamalParameters(elGamalPublicBCPGKey.getP(), elGamalPublicBCPGKey.getG()));
                case 17:
                    DSAPublicBCPGKey dSAPublicBCPGKey = (DSAPublicBCPGKey) publicKeyPacket.getKey();
                    return new DSAPublicKeyParameters(dSAPublicBCPGKey.getY(), new DSAParameters(dSAPublicBCPGKey.getP(), dSAPublicBCPGKey.getQ(), dSAPublicBCPGKey.getG()));
                case 18:
                case 19:
                    ECPublicBCPGKey eCPublicBCPGKey = (ECPublicBCPGKey) publicKeyPacket.getKey();
                    X9ECParameters x9Parameters = BcUtil.getX9Parameters(eCPublicBCPGKey.getCurveOID());
                    return new ECPublicKeyParameters(BcUtil.decodePoint(eCPublicBCPGKey.getEncodedPoint(), x9Parameters.getCurve()), new ECNamedDomainParameters(eCPublicBCPGKey.getCurveOID(), x9Parameters.getCurve(), x9Parameters.getG(), x9Parameters.getN(), x9Parameters.getH()));
                default:
                    throw new PGPException("unknown public key algorithm encountered");
            }
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("exception constructing public key", e3);
        }
    }
}
