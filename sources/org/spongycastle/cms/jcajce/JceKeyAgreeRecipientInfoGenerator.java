package org.spongycastle.cms.jcajce;

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
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.cms.KeyAgreeRecipientIdentifier;
import org.spongycastle.asn1.cms.OriginatorPublicKey;
import org.spongycastle.asn1.cms.RecipientEncryptedKey;
import org.spongycastle.asn1.cms.RecipientKeyIdentifier;
import org.spongycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.KeyAgreeRecipientInfoGenerator;
import org.spongycastle.jcajce.spec.MQVParameterSpec;
import org.spongycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.spongycastle.operator.DefaultSecretKeySizeProvider;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.SecretKeySizeProvider;
import org.spongycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
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
            short sXd = (short) (FB.Xd() ^ 21830);
            short sXd2 = (short) (FB.Xd() ^ 13938);
            int[] iArr = new int["Ujf57f|)\bv\u0001H\u000fe*M7QrH\u0003\u0019M\u0016Rn".length()];
            QB qb = new QB("Ujf57f|)\bv\u0001H\u000fe*M7QrH\u0003\u0019M\u0016Rn");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
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
                short sXd3 = (short) (Od.Xd() ^ (-16587));
                short sXd4 = (short) (Od.Xd() ^ (-18693));
                int[] iArr2 = new int["{.;\u0013,7\u0010>w.5\nKfx!\u0016\u0004p\u0013\u0017,IZ\u0015ek^$\u001b".length()];
                QB qb2 = new QB("{.;\u0013,7\u0010>w.5\nKfx!\u0016\u0004p\u0013\u0017,IZ\u0015ek^$\u001b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Ig.wd("2u\u001b,&.\u0002N5H;j<p4U\u0011\u0003$-\u001dvfoGD\u0015P'\u0005wK)\u000eR\bm(\\E=", (short) (Od.Xd() ^ (-30114))));
                clsArr[1] = Class.forName(EO.Od("a\u0007PXv\nE5r!\u0018?s$O\u00014V|6^\u001bthN\u001e", (short) (OY.Xd() ^ 8061)));
                Object[] objArr2 = {parameterSpec, secureRandom};
                Method method = cls.getMethod(C1561oA.Qd("dhbl`Wa]mW", (short) (C1499aX.Xd() ^ (-27654))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(keyPairGeneratorCreateKeyPairGenerator, objArr2);
                    Object[] objArr3 = new Object[0];
                    Method method2 = Class.forName(C1593ug.zd("ME[G\u0015[NM`^Vbh\u001e<WlDV_i?^h`n^rnr", (short) (OY.Xd() ^ 20375), (short) (OY.Xd() ^ 8298))).getMethod(C1561oA.od("urzp|j|lQj}Scjr", (short) (OY.Xd() ^ 9718)), new Class[0]);
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
                throw new CMSException(C1561oA.Kd("nm{|~\u00051vx\tz\t\u0005\u0002\b\u007f;int?\u0006\u0012\u000b\t\u0012\u000b\u0019\t\u0015I\u0016\u0011&M\u001f\u0011\u001a$R$\u0016(\u0018%\u001e. .0]%20/b4:(31,i61F\bn", (short) (C1607wl.Xd() ^ 2632)) + e5, e5);
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

    @Override // org.spongycastle.cms.KeyAgreeRecipientInfoGenerator
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

    @Override // org.spongycastle.cms.KeyAgreeRecipientInfoGenerator
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
