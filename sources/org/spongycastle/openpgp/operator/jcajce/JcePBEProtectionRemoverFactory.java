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
import org.spongycastle.openpgp.operator.PBEProtectionRemoverFactory;
import org.spongycastle.openpgp.operator.PBESecretKeyDecryptor;
import org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider;

/* JADX INFO: loaded from: classes2.dex */
public class JcePBEProtectionRemoverFactory implements PBEProtectionRemoverFactory {
    private PGPDigestCalculatorProvider calculatorProvider;
    private JcaPGPDigestCalculatorProviderBuilder calculatorProviderBuilder;
    private OperatorHelper helper;
    private final char[] passPhrase;

    public JcePBEProtectionRemoverFactory(char[] cArr) {
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.passPhrase = cArr;
        this.calculatorProviderBuilder = new JcaPGPDigestCalculatorProviderBuilder();
    }

    public JcePBEProtectionRemoverFactory(char[] cArr, PGPDigestCalculatorProvider pGPDigestCalculatorProvider) {
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.passPhrase = cArr;
        this.calculatorProvider = pGPDigestCalculatorProvider;
    }

    @Override // org.spongycastle.openpgp.operator.PBEProtectionRemoverFactory
    public PBESecretKeyDecryptor createDecryptor(String str) throws PGPException {
        if (this.calculatorProvider == null) {
            this.calculatorProvider = this.calculatorProviderBuilder.build();
        }
        return new PBESecretKeyDecryptor(this.passPhrase, this.calculatorProvider) { // from class: org.spongycastle.openpgp.operator.jcajce.JcePBEProtectionRemoverFactory.1
            @Override // org.spongycastle.openpgp.operator.PBESecretKeyDecryptor
            public byte[] recoverKeyData(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws PGPException {
                try {
                    Cipher cipherCreateCipher = JcePBEProtectionRemoverFactory.this.helper.createCipher(PGPUtil.getSymmetricCipherName(i2) + "/CBC/NoPadding");
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

    public JcePBEProtectionRemoverFactory setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        JcaPGPDigestCalculatorProviderBuilder jcaPGPDigestCalculatorProviderBuilder = this.calculatorProviderBuilder;
        if (jcaPGPDigestCalculatorProviderBuilder != null) {
            jcaPGPDigestCalculatorProviderBuilder.setProvider(str);
        }
        return this;
    }

    public JcePBEProtectionRemoverFactory setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        JcaPGPDigestCalculatorProviderBuilder jcaPGPDigestCalculatorProviderBuilder = this.calculatorProviderBuilder;
        if (jcaPGPDigestCalculatorProviderBuilder != null) {
            jcaPGPDigestCalculatorProviderBuilder.setProvider(provider);
        }
        return this;
    }
}
