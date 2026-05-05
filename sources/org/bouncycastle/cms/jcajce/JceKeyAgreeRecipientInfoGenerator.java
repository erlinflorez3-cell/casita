package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;
import org.bouncycastle.asn1.cms.RecipientEncryptedKey;
import org.bouncycastle.asn1.cms.RecipientKeyIdentifier;
import org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class JceKeyAgreeRecipientInfoGenerator extends KeyAgreeRecipientInfoGenerator {
    private static KeyMaterialGenerator ecc_cms_Generator = new RFC5753KeyMaterialGenerator();
    private KeyPair ephemeralKP;
    private EnvelopedDataHelper helper;
    private SecretKeySizeProvider keySizeProvider;
    private SecureRandom random;
    private List recipientIDs;
    private List recipientKeys;
    private PrivateKey senderPrivateKey;
    private PublicKey senderPublicKey;
    private byte[] userKeyingMaterial;

    public JceKeyAgreeRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey, PublicKey publicKey, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        super(aSN1ObjectIdentifier, SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), aSN1ObjectIdentifier2);
        this.keySizeProvider = new DefaultSecretKeySizeProvider();
        this.recipientIDs = new ArrayList();
        this.recipientKeys = new ArrayList();
        this.helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.senderPublicKey = publicKey;
        this.senderPrivateKey = privateKey;
    }

    private void init(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1593ug.zd("4,B.{B54GE=IO\u0005+>=PNB0@NEQP", (short) (C1580rY.Xd() ^ (-3831)), (short) (C1580rY.Xd() ^ (-31943)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (CMSUtils.isMQV(aSN1ObjectIdentifier) && this.ephemeralKP == null) {
            try {
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(this.senderPublicKey.getEncoded());
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(aSN1ObjectIdentifier);
                algorithmParametersCreateAlgorithmParameters.init(subjectPublicKeyInfo.getAlgorithm().getParameters().toASN1Primitive().getEncoded());
                KeyPairGenerator keyPairGeneratorCreateKeyPairGenerator = this.helper.createKeyPairGenerator(aSN1ObjectIdentifier);
                AlgorithmParameterSpec parameterSpec = algorithmParametersCreateAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class);
                SecureRandom secureRandom = this.random;
                Class<?> cls = Class.forName(C1561oA.od("\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eaz\u000ecsz\u0003Vs{q}k}wy", (short) (C1499aX.Xd() ^ (-28846))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Kd("JBXD\u0012XKJ][S_e\u001ba_UT 4`\\eiambhL^p`mfvhvXvlk", (short) (C1499aX.Xd() ^ (-2568))));
                clsArr[1] = Class.forName(Wg.Zd("X28\u0002>[\u001cy|P6\u0002u\u0002\u0018\bU@,\u007f_E#xrH", (short) (FB.Xd() ^ 19967), (short) (FB.Xd() ^ 15040)));
                Object[] objArr2 = {parameterSpec, secureRandom};
                Method method = cls.getMethod(C1561oA.Xd("\u0019\u001f\u001b'\u001d\u0016\" 2\u001e", (short) (C1607wl.Xd() ^ 14720)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(keyPairGeneratorCreateKeyPairGenerator, objArr2);
                    Object[] objArr3 = new Object[0];
                    Method method2 = Class.forName(Wg.vd("bXlV\"fWTuqgqu)E^a7GNV*GOUaOa[]", (short) (FB.Xd() ^ 27))).getMethod(Qg.kd("\u001f\u001c$\u001a&\u0014&\u0016z\u0014'|\r\u0014\u001c", (short) (C1580rY.Xd() ^ (-22217)), (short) (C1580rY.Xd() ^ (-2503))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        this.ephemeralKP = (KeyPair) method2.invoke(keyPairGeneratorCreateKeyPairGenerator, objArr3);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (Exception e5) {
                throw new CMSException(hg.Vd("\\Yeddh\u0013VVdT`ZUYO\t58<\u0005ISJFMDP>HzE>QvF6=EqA1A/:1?/;;f,730a15!*&\u001fZ%\u001e1pU", (short) (C1499aX.Xd() ^ (-20785)), (short) (C1499aX.Xd() ^ (-569))) + e5, e5);
            }
        }
    }

    public JceKeyAgreeRecipientInfoGenerator addRecipient(X509Certificate x509Certificate) throws CertificateEncodingException {
        this.recipientIDs.add(new KeyAgreeRecipientIdentifier(CMSUtils.getIssuerAndSerialNumber(x509Certificate)));
        this.recipientKeys.add(x509Certificate.getPublicKey());
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator addRecipient(byte[] bArr, PublicKey publicKey) throws CertificateEncodingException {
        this.recipientIDs.add(new KeyAgreeRecipientIdentifier(new RecipientKeyIdentifier(bArr)));
        this.recipientKeys.add(publicKey);
        return this;
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator
    public ASN1Sequence generateRecipientEncryptedKeys(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, GenericKey genericKey) throws Throwable {
        AlgorithmParameterSpec userKeyingMaterialSpec;
        if (this.recipientIDs.isEmpty()) {
            throw new CMSException("No recipients associated with generator - use addRecipient()");
        }
        init(algorithmIdentifier.getAlgorithm());
        PrivateKey privateKey = this.senderPrivateKey;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i2 = 0; i2 != this.recipientIDs.size(); i2++) {
            PublicKey publicKey = (PublicKey) this.recipientKeys.get(i2);
            KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier = (KeyAgreeRecipientIdentifier) this.recipientIDs.get(i2);
            try {
                if (CMSUtils.isMQV(algorithm)) {
                    userKeyingMaterialSpec = new MQVParameterSpec(this.ephemeralKP, publicKey, this.userKeyingMaterial);
                } else if (CMSUtils.isEC(algorithm)) {
                    userKeyingMaterialSpec = new UserKeyingMaterialSpec(ecc_cms_Generator.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithmIdentifier2.getAlgorithm()), this.userKeyingMaterial));
                } else {
                    if (!CMSUtils.isRFC2631(algorithm)) {
                        throw new CMSException("Unknown key agreement algorithm: " + algorithm);
                    }
                    if (this.userKeyingMaterial != null) {
                        userKeyingMaterialSpec = new UserKeyingMaterialSpec(this.userKeyingMaterial);
                    } else {
                        if (algorithm.equals(PKCSObjectIdentifiers.id_alg_SSDH)) {
                            throw new CMSException("User keying material must be set for static keys.");
                        }
                        userKeyingMaterialSpec = null;
                    }
                }
                KeyAgreement keyAgreementCreateKeyAgreement = this.helper.createKeyAgreement(algorithm);
                keyAgreementCreateKeyAgreement.init(privateKey, userKeyingMaterialSpec, this.random);
                keyAgreementCreateKeyAgreement.doPhase(publicKey, true);
                SecretKey secretKeyGenerateSecret = keyAgreementCreateKeyAgreement.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
                Cipher cipherCreateCipher = this.helper.createCipher(algorithmIdentifier2.getAlgorithm());
                cipherCreateCipher.init(3, secretKeyGenerateSecret, this.random);
                aSN1EncodableVector.add(new RecipientEncryptedKey(keyAgreeRecipientIdentifier, new DEROctetString(cipherCreateCipher.wrap(this.helper.getJceKey(genericKey)))));
            } catch (GeneralSecurityException e2) {
                throw new CMSException("Cannot perform agreement step: " + e2.getMessage(), e2);
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator
    protected byte[] getUserKeyingMaterial(AlgorithmIdentifier algorithmIdentifier) throws Throwable {
        init(algorithmIdentifier.getAlgorithm());
        KeyPair keyPair = this.ephemeralKP;
        if (keyPair == null) {
            return this.userKeyingMaterial;
        }
        OriginatorPublicKey originatorPublicKeyCreateOriginatorPublicKey = createOriginatorPublicKey(SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded()));
        try {
            return this.userKeyingMaterial != null ? new MQVuserKeyingMaterial(originatorPublicKeyCreateOriginatorPublicKey, new DEROctetString(this.userKeyingMaterial)).getEncoded() : new MQVuserKeyingMaterial(originatorPublicKeyCreateOriginatorPublicKey, null).getEncoded();
        } catch (IOException e2) {
            throw new CMSException("unable to encode user keying material: " + e2.getMessage(), e2);
        }
    }

    public JceKeyAgreeRecipientInfoGenerator setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setUserKeyingMaterial(byte[] bArr) {
        this.userKeyingMaterial = Arrays.clone(bArr);
        return this;
    }
}
