package org.bouncycastle.openssl.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.jcajce.JceGenericKey;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JceOpenSSLPKCS8EncryptorBuilder {
    private ASN1ObjectIdentifier algOID;
    private Cipher cipher;
    private JcaJceHelper helper = new DefaultJcaJceHelper();
    int iterationCount = 2048;
    private SecretKey key;
    private AlgorithmParameterGenerator paramGen;
    private AlgorithmParameters params;
    private char[] password;
    private SecureRandom random;
    byte[] salt;
    public static final String AES_128_CBC = NISTObjectIdentifiers.id_aes128_CBC.getId();
    public static final String AES_192_CBC = NISTObjectIdentifiers.id_aes192_CBC.getId();
    public static final String AES_256_CBC = NISTObjectIdentifiers.id_aes256_CBC.getId();
    public static final String DES3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC.getId();
    public static final String PBE_SHA1_RC4_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId();
    public static final String PBE_SHA1_RC4_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4.getId();
    public static final String PBE_SHA1_3DES = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC.getId();
    public static final String PBE_SHA1_2DES = PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC.getId();
    public static final String PBE_SHA1_RC2_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC.getId();
    public static final String PBE_SHA1_RC2_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC.getId();

    public JceOpenSSLPKCS8EncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algOID = aSN1ObjectIdentifier;
    }

    public OutputEncryptor build() throws Throwable {
        final AlgorithmIdentifier algorithmIdentifier;
        this.salt = new byte[20];
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.vd("/%='v;0-B>8BJ}&78II;+9I>LI", (short) (ZN.Xd() ^ 206))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {this.salt};
        Method method = Class.forName(Qg.kd("\u0016\f \nU\u001a\u000b\b\u0019\u0015\u000b\u0015\u0019Lp\u0002~\u0010\f}iw\u0004x\u0003\u007f", (short) (C1499aX.Xd() ^ (-534)), (short) (C1499aX.Xd() ^ (-10089)))).getMethod(hg.Vd("RHZU\"XRBO", (short) (OY.Xd() ^ 26312), (short) (OY.Xd() ^ 19185)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            try {
                this.cipher = this.helper.createCipher(this.algOID.getId());
                if (PEMUtilities.isPKCS5Scheme2(this.algOID)) {
                    this.paramGen = this.helper.createAlgorithmParameterGenerator(this.algOID.getId());
                }
                if (PEMUtilities.isPKCS5Scheme2(this.algOID)) {
                    this.params = this.paramGen.generateParameters();
                    try {
                        KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc(this.algOID, ASN1Primitive.fromByteArray(this.params.getEncoded()));
                        KeyDerivationFunc keyDerivationFunc2 = new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(this.salt, this.iterationCount));
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        aSN1EncodableVector.add(keyDerivationFunc2);
                        aSN1EncodableVector.add(keyDerivationFunc);
                        algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, PBES2Parameters.getInstance(new DERSequence(aSN1EncodableVector)));
                        try {
                            SecretKey secretKeyGenerateSecretKeyForPKCS5Scheme2 = PEMUtilities.generateSecretKeyForPKCS5Scheme2(this.helper, this.algOID.getId(), this.password, this.salt, this.iterationCount);
                            this.key = secretKeyGenerateSecretKeyForPKCS5Scheme2;
                            this.cipher.init(1, secretKeyGenerateSecretKeyForPKCS5Scheme2, this.params);
                        } catch (GeneralSecurityException e3) {
                            throw new OperatorCreationException(e3.getMessage(), e3);
                        }
                    } catch (IOException e4) {
                        throw new OperatorCreationException(e4.getMessage(), e4);
                    }
                } else {
                    if (!PEMUtilities.isPKCS12(this.algOID)) {
                        throw new OperatorCreationException(C1561oA.ud("@8466=3c$.(/1'1$(sX", (short) (C1499aX.Xd() ^ (-2248))) + this.algOID, null);
                    }
                    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                    aSN1EncodableVector2.add(new DEROctetString(this.salt));
                    aSN1EncodableVector2.add(new ASN1Integer(this.iterationCount));
                    algorithmIdentifier = new AlgorithmIdentifier(this.algOID, PKCS12PBEParams.getInstance(new DERSequence(aSN1EncodableVector2)));
                    try {
                        this.cipher.init(1, new PKCS12KeyWithParameters(this.password, this.salt, this.iterationCount));
                    } catch (GeneralSecurityException e5) {
                        throw new OperatorCreationException(e5.getMessage(), e5);
                    }
                }
                return new OutputEncryptor() { // from class: org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder.1
                    @Override // org.bouncycastle.operator.OutputEncryptor
                    public AlgorithmIdentifier getAlgorithmIdentifier() {
                        return algorithmIdentifier;
                    }

                    @Override // org.bouncycastle.operator.OutputEncryptor
                    public GenericKey getKey() {
                        return new JceGenericKey(algorithmIdentifier, JceOpenSSLPKCS8EncryptorBuilder.this.key);
                    }

                    @Override // org.bouncycastle.operator.OutputEncryptor
                    public OutputStream getOutputStream(OutputStream outputStream) {
                        return new CipherOutputStream(outputStream, JceOpenSSLPKCS8EncryptorBuilder.this.cipher);
                    }
                };
            } catch (GeneralSecurityException e6) {
                throw new OperatorCreationException(this.algOID + C1561oA.yd("4\u0002\u0002\u00060p\u0005nuwkktl@%", (short) (ZN.Xd() ^ 9391)) + e6.getMessage(), e6);
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    public JceOpenSSLPKCS8EncryptorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setPasssword(char[] cArr) {
        this.password = cArr;
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
