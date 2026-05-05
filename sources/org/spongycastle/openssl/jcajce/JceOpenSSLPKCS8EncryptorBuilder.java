package org.spongycastle.openssl.jcajce;

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
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.KeyDerivationFunc;
import org.spongycastle.asn1.pkcs.PBES2Parameters;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.PKCS12KeyWithParameters;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.OutputEncryptor;
import org.spongycastle.operator.jcajce.JceGenericKey;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

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
            Constructor<?> constructor = Class.forName(C1593ug.zd("G?UA\u000fUHGZXP\\b\u0018>QPcaUCSaXdc", (short) (C1607wl.Xd() ^ 21166), (short) (C1607wl.Xd() ^ 11048))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {this.salt};
        Method method = Class.forName(C1561oA.od("\u000b\u0001\u0015~J\u000f\u007f|\u000e\n\u007f\n\u000eAevs\u0005\u0001r^lxmwt", (short) (FB.Xd() ^ 5450))).getMethod(C1561oA.Kd("( 41\u007f84&5", (short) (C1607wl.Xd() ^ 15652)), byte[].class);
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
                        short sXd = (short) (C1633zX.Xd() ^ (-5099));
                        short sXd2 = (short) (C1633zX.Xd() ^ (-16852));
                        int[] iArr = new int["&\u0010bvi\u0003\u000f\u000eDaq\u0007\u007fG$ic>x".length()];
                        QB qb = new QB("&\u0010bvi\u0003\u000f\u000eDaq\u0007\u007fG$ic>x");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                            i2++;
                        }
                        throw new OperatorCreationException(new String(iArr, 0, i2) + this.algOID, null);
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
                return new OutputEncryptor() { // from class: org.spongycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder.1
                    @Override // org.spongycastle.operator.OutputEncryptor
                    public AlgorithmIdentifier getAlgorithmIdentifier() {
                        return algorithmIdentifier;
                    }

                    @Override // org.spongycastle.operator.OutputEncryptor
                    public GenericKey getKey() {
                        return new JceGenericKey(algorithmIdentifier, JceOpenSSLPKCS8EncryptorBuilder.this.key);
                    }

                    @Override // org.spongycastle.operator.OutputEncryptor
                    public OutputStream getOutputStream(OutputStream outputStream) {
                        return new CipherOutputStream(outputStream, JceOpenSSLPKCS8EncryptorBuilder.this.cipher);
                    }
                };
            } catch (GeneralSecurityException e6) {
                StringBuilder sbAppend = new StringBuilder().append(this.algOID);
                short sXd3 = (short) (OY.Xd() ^ 856);
                int[] iArr2 = new int["g79?k.D09=35@:\u0010v".length()];
                QB qb2 = new QB("g79?k.D09=35@:\u0010v");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                    i3++;
                }
                throw new OperatorCreationException(sbAppend.append(new String(iArr2, 0, i3)).append(e6.getMessage()).toString(), e6);
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
