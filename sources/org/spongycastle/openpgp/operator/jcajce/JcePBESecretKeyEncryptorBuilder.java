package org.spongycastle.openpgp.operator.jcajce;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PBESecretKeyEncryptor;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class JcePBESecretKeyEncryptorBuilder {
    private int encAlgorithm;
    private OperatorHelper helper;
    private SecureRandom random;
    private int s2kCount;
    private PGPDigestCalculator s2kDigestCalculator;

    public JcePBESecretKeyEncryptorBuilder(int i2) {
        this(i2, new SHA1PGPDigestCalculator());
    }

    public JcePBESecretKeyEncryptorBuilder(int i2, int i3) {
        this(i2, new SHA1PGPDigestCalculator(), i3);
    }

    public JcePBESecretKeyEncryptorBuilder(int i2, PGPDigestCalculator pGPDigestCalculator) {
        this(i2, pGPDigestCalculator, 96);
    }

    public JcePBESecretKeyEncryptorBuilder(int i2, PGPDigestCalculator pGPDigestCalculator, int i3) {
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.s2kCount = 96;
        this.encAlgorithm = i2;
        this.s2kDigestCalculator = pGPDigestCalculator;
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("s2KCount value outside of range 0 to 255.");
        }
        this.s2kCount = i3;
    }

    public PBESecretKeyEncryptor build(char[] cArr) throws Throwable {
        if (this.random == null) {
            short sXd = (short) (OY.Xd() ^ 12917);
            int[] iArr = new int["WOaM\u001feTSjh\\hr(J]`smaScmdts".length()];
            QB qb = new QB("WOaM\u001feTSjh\\hr(J]`smaScmdts");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
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
        return new PBESecretKeyEncryptor(this.encAlgorithm, this.s2kDigestCalculator, this.s2kCount, this.random, cArr) { // from class: org.spongycastle.openpgp.operator.jcajce.JcePBESecretKeyEncryptorBuilder.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Cipher f28089c;
            private byte[] iv;

            @Override // org.spongycastle.openpgp.operator.PBESecretKeyEncryptor
            public byte[] encryptKeyData(byte[] bArr, byte[] bArr2, int i3, int i4) throws PGPException {
                try {
                    Cipher cipherCreateCipher = JcePBESecretKeyEncryptorBuilder.this.helper.createCipher(PGPUtil.getSymmetricCipherName(this.encAlgorithm) + "/CFB/NoPadding");
                    this.f28089c = cipherCreateCipher;
                    cipherCreateCipher.init(1, PGPUtil.makeSymmetricKey(this.encAlgorithm, bArr), this.random);
                    this.iv = this.f28089c.getIV();
                    return this.f28089c.doFinal(bArr2, i3, i4);
                } catch (InvalidKeyException e3) {
                    throw new PGPException("invalid key: " + e3.getMessage(), e3);
                } catch (BadPaddingException e4) {
                    throw new PGPException("bad padding: " + e4.getMessage(), e4);
                } catch (IllegalBlockSizeException e5) {
                    throw new PGPException("illegal block size: " + e5.getMessage(), e5);
                }
            }

            @Override // org.spongycastle.openpgp.operator.PBESecretKeyEncryptor
            public byte[] encryptKeyData(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws PGPException {
                try {
                    Cipher cipherCreateCipher = JcePBESecretKeyEncryptorBuilder.this.helper.createCipher(PGPUtil.getSymmetricCipherName(this.encAlgorithm) + "/CFB/NoPadding");
                    this.f28089c = cipherCreateCipher;
                    cipherCreateCipher.init(1, PGPUtil.makeSymmetricKey(this.encAlgorithm, bArr), new IvParameterSpec(bArr2));
                    this.iv = bArr2;
                    return this.f28089c.doFinal(bArr3, i3, i4);
                } catch (InvalidAlgorithmParameterException e3) {
                    throw new PGPException("invalid iv: " + e3.getMessage(), e3);
                } catch (InvalidKeyException e4) {
                    throw new PGPException("invalid key: " + e4.getMessage(), e4);
                } catch (BadPaddingException e5) {
                    throw new PGPException("bad padding: " + e5.getMessage(), e5);
                } catch (IllegalBlockSizeException e6) {
                    throw new PGPException("illegal block size: " + e6.getMessage(), e6);
                }
            }

            @Override // org.spongycastle.openpgp.operator.PBESecretKeyEncryptor
            public byte[] getCipherIV() {
                return this.iv;
            }
        };
    }

    public JcePBESecretKeyEncryptorBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcePBESecretKeyEncryptorBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcePBESecretKeyEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
