package org.spongycastle.openpgp.operator.jcajce;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PBEKeyEncryptionMethodGenerator;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcePBEKeyEncryptionMethodGenerator extends PBEKeyEncryptionMethodGenerator {
    private OperatorHelper helper;

    public JcePBEKeyEncryptionMethodGenerator(char[] cArr) {
        this(cArr, new SHA1PGPDigestCalculator());
    }

    public JcePBEKeyEncryptionMethodGenerator(char[] cArr, int i2) {
        super(cArr, new SHA1PGPDigestCalculator(), i2);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
    }

    public JcePBEKeyEncryptionMethodGenerator(char[] cArr, PGPDigestCalculator pGPDigestCalculator) {
        super(cArr, pGPDigestCalculator);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
    }

    public JcePBEKeyEncryptionMethodGenerator(char[] cArr, PGPDigestCalculator pGPDigestCalculator, int i2) {
        super(cArr, pGPDigestCalculator, i2);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
    }

    @Override // org.spongycastle.openpgp.operator.PBEKeyEncryptionMethodGenerator
    protected byte[] encryptSessionInfo(int i2, byte[] bArr, byte[] bArr2) throws PGPException {
        try {
            Cipher cipherCreateCipher = this.helper.createCipher(PGPUtil.getSymmetricCipherName(i2) + "/CFB/NoPadding");
            cipherCreateCipher.init(1, new SecretKeySpec(bArr, PGPUtil.getSymmetricCipherName(i2)), new IvParameterSpec(new byte[cipherCreateCipher.getBlockSize()]));
            return cipherCreateCipher.doFinal(bArr2, 0, bArr2.length);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new PGPException("IV invalid: " + e2.getMessage(), e2);
        } catch (InvalidKeyException e3) {
            throw new PGPException("key invalid: " + e3.getMessage(), e3);
        } catch (BadPaddingException e4) {
            throw new PGPException("bad padding: " + e4.getMessage(), e4);
        } catch (IllegalBlockSizeException e5) {
            throw new PGPException("illegal block size: " + e5.getMessage(), e5);
        }
    }

    public JcePBEKeyEncryptionMethodGenerator setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcePBEKeyEncryptionMethodGenerator setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    @Override // org.spongycastle.openpgp.operator.PBEKeyEncryptionMethodGenerator
    public PBEKeyEncryptionMethodGenerator setSecureRandom(SecureRandom secureRandom) {
        super.setSecureRandom(secureRandom);
        return this;
    }
}
