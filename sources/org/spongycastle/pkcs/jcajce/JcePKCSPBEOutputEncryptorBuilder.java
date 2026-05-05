package org.spongycastle.pkcs.jcajce;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.bc.BCObjectIdentifiers;
import org.spongycastle.asn1.pkcs.EncryptionScheme;
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
import org.spongycastle.operator.DefaultSecretKeySizeProvider;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.OutputEncryptor;
import org.spongycastle.operator.SecretKeySizeProvider;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JcePKCSPBEOutputEncryptorBuilder {
    private ASN1ObjectIdentifier algorithm;
    private ASN1ObjectIdentifier keyEncAlgorithm;
    private SecureRandom random;
    private JcaJceHelper helper = new DefaultJcaJceHelper();
    private SecretKeySizeProvider keySizeProvider = DefaultSecretKeySizeProvider.INSTANCE;
    private int iterationCount = 1024;

    public JcePKCSPBEOutputEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (isPKCS12(aSN1ObjectIdentifier)) {
            this.algorithm = aSN1ObjectIdentifier;
            this.keyEncAlgorithm = aSN1ObjectIdentifier;
        } else {
            this.algorithm = PKCSObjectIdentifiers.id_PBES2;
            this.keyEncAlgorithm = aSN1ObjectIdentifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i2 = 0; i2 != cArr.length; i2++) {
            int i3 = i2 * 2;
            char c2 = cArr[i2];
            bArr[i3] = (byte) (c2 >>> '\b');
            bArr[i3 + 1] = (byte) c2;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            bArr[i2] = (byte) cArr[i2];
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.on(PKCSObjectIdentifiers.pkcs_12PbeIds) || aSN1ObjectIdentifier.on(BCObjectIdentifiers.bc_pbe_sha1_pkcs12) || aSN1ObjectIdentifier.on(BCObjectIdentifiers.bc_pbe_sha256_pkcs12);
    }

    public OutputEncryptor build(final char[] cArr) throws Throwable {
        final Cipher cipherCreateCipher;
        final AlgorithmIdentifier algorithmIdentifier;
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(hg.Vd("I?S=\tM>;LH>HL\u007f$52C?1\u001d+7,63", (short) (FB.Xd() ^ 9297), (short) (FB.Xd() ^ 13279))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        byte[] bArr = new byte[20];
        SecureRandom secureRandom = this.random;
        Class<?> cls = Class.forName(C1561oA.ud(".$8\"m2# 1-#-1d\t\u001a\u0017($\u0016\u0002\u0010\u001c\u0011\u001b\u0018", (short) (C1499aX.Xd() ^ (-29085))));
        Class<?>[] clsArr = {byte[].class};
        Object[] objArr2 = {bArr};
        short sXd = (short) (FB.Xd() ^ 17485);
        int[] iArr = new int["D<LI\u0014LD6A".length()];
        QB qb = new QB("D<LI\u0014LD6A");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            try {
                if (this.algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                    cipherCreateCipher = this.helper.createCipher(this.algorithm.getId());
                    cipherCreateCipher.init(1, new PKCS12KeyWithParameters(cArr, bArr, this.iterationCount));
                    algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, new PKCS12PBEParams(bArr, this.iterationCount));
                } else {
                    if (!this.algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                        throw new OperatorCreationException(C1561oA.Yd("c]bVUb[c_j]]\u001a\\hdmqiujp", (short) (OY.Xd() ^ 1842)));
                    }
                    SecretKey secretKeyGenerateSecret = this.helper.createSecretKeyFactory(PKCSObjectIdentifiers.id_PBKDF2.getId()).generateSecret(new PBEKeySpec(cArr, bArr, this.iterationCount, this.keySizeProvider.getKeySize(new AlgorithmIdentifier(this.keyEncAlgorithm))));
                    cipherCreateCipher = this.helper.createCipher(this.keyEncAlgorithm.getId());
                    cipherCreateCipher.init(1, secretKeyGenerateSecret, this.random);
                    algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr, this.iterationCount)), new EncryptionScheme(this.keyEncAlgorithm, ASN1Primitive.fromByteArray(cipherCreateCipher.getParameters().getEncoded()))));
                }
                return new OutputEncryptor() { // from class: org.spongycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder.1
                    @Override // org.spongycastle.operator.OutputEncryptor
                    public AlgorithmIdentifier getAlgorithmIdentifier() {
                        return algorithmIdentifier;
                    }

                    @Override // org.spongycastle.operator.OutputEncryptor
                    public GenericKey getKey() {
                        return JcePKCSPBEOutputEncryptorBuilder.this.isPKCS12(algorithmIdentifier.getAlgorithm()) ? new GenericKey(algorithmIdentifier, JcePKCSPBEOutputEncryptorBuilder.PKCS5PasswordToBytes(cArr)) : new GenericKey(algorithmIdentifier, JcePKCSPBEOutputEncryptorBuilder.PKCS12PasswordToBytes(cArr));
                    }

                    @Override // org.spongycastle.operator.OutputEncryptor
                    public OutputStream getOutputStream(OutputStream outputStream) {
                        return new CipherOutputStream(outputStream, cipherCreateCipher);
                    }
                };
            } catch (Exception e3) {
                short sXd2 = (short) (C1499aX.Xd() ^ (-9084));
                short sXd3 = (short) (C1499aX.Xd() ^ (-28620));
                int[] iArr2 = new int["}wkmxr.\u0004\u007f1u\u0006yv\u000b|8h\u0010\u0010\r\u0013\u0013d\u000f\u0005\u0015\u001d\u0015\u001a\u0016\u001abI".length()];
                QB qb2 = new QB("}wkmxr.\u0004\u007f1u\u0006yv\u000b|8h\u0010\u0010\r\u0013\u0013d\u000f\u0005\u0015\u001d\u0015\u001a\u0016\u001abI");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                    i3++;
                }
                throw new OperatorCreationException(new String(iArr2, 0, i3) + e3.getMessage(), e3);
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public JcePKCSPBEOutputEncryptorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setKeySizeProvider(SecretKeySizeProvider secretKeySizeProvider) {
        this.keySizeProvider = secretKeySizeProvider;
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
