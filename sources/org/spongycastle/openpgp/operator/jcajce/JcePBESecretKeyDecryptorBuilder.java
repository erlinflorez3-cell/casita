package org.spongycastle.openpgp.operator.jcajce;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PBESecretKeyDecryptor;
import org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider;

/* JADX INFO: loaded from: classes2.dex */
public class JcePBESecretKeyDecryptorBuilder {
    private PGPDigestCalculatorProvider calculatorProvider;
    private JcaPGPDigestCalculatorProviderBuilder calculatorProviderBuilder;
    private OperatorHelper helper;

    public JcePBESecretKeyDecryptorBuilder() {
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.calculatorProviderBuilder = new JcaPGPDigestCalculatorProviderBuilder();
    }

    public JcePBESecretKeyDecryptorBuilder(PGPDigestCalculatorProvider pGPDigestCalculatorProvider) {
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.calculatorProvider = pGPDigestCalculatorProvider;
    }

    public PBESecretKeyDecryptor build(char[] cArr) throws PGPException {
        if (this.calculatorProvider == null) {
            this.calculatorProvider = this.calculatorProviderBuilder.build();
        }
        return new PBESecretKeyDecryptor(cArr, this.calculatorProvider) { // from class: org.spongycastle.openpgp.operator.jcajce.JcePBESecretKeyDecryptorBuilder.1
            @Override // org.spongycastle.openpgp.operator.PBESecretKeyDecryptor
            public byte[] recoverKeyData(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws PGPException {
                try {
                    Cipher cipherCreateCipher = JcePBESecretKeyDecryptorBuilder.this.helper.createCipher(PGPUtil.getSymmetricCipherName(i2) + "/CFB/NoPadding");
                    cipherCreateCipher.init(2, PGPUtil.makeSymmetricKey(i2, bArr), new IvParameterSpec(bArr2));
                    return cipherCreateCipher.doFinal(bArr3, i3, i4);
                } catch (InvalidAlgorithmParameterException e2) {
                    throw new PGPException("invalid parameter: " + e2.getMessage(), e2);
                } catch (InvalidKeyException e3) {
                    throw new PGPException("invalid key: " + e3.getMessage(), e3);
                } catch (BadPaddingException e4) {
                    throw new PGPException("bad padding: " + e4.getMessage(), e4);
                } catch (IllegalBlockSizeException e5) {
                    throw new PGPException("illegal block size: " + e5.getMessage(), e5);
                }
            }
        };
    }

    public JcePBESecretKeyDecryptorBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        JcaPGPDigestCalculatorProviderBuilder jcaPGPDigestCalculatorProviderBuilder = this.calculatorProviderBuilder;
        if (jcaPGPDigestCalculatorProviderBuilder != null) {
            jcaPGPDigestCalculatorProviderBuilder.setProvider(str);
        }
        return this;
    }

    public JcePBESecretKeyDecryptorBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        JcaPGPDigestCalculatorProviderBuilder jcaPGPDigestCalculatorProviderBuilder = this.calculatorProviderBuilder;
        if (jcaPGPDigestCalculatorProviderBuilder != null) {
            jcaPGPDigestCalculatorProviderBuilder.setProvider(provider);
        }
        return this;
    }
}
