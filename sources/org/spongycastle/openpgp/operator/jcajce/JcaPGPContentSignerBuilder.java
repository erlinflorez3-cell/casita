package org.spongycastle.openpgp.operator.jcajce;

import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPRuntimeOperationException;
import org.spongycastle.openpgp.operator.PGPContentSigner;
import org.spongycastle.openpgp.operator.PGPContentSignerBuilder;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.util.io.TeeOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPContentSignerBuilder implements PGPContentSignerBuilder {
    private int hashAlgorithm;
    private int keyAlgorithm;
    private SecureRandom random;
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private JcaPGPDigestCalculatorProviderBuilder digestCalculatorProviderBuilder = new JcaPGPDigestCalculatorProviderBuilder();
    private JcaPGPKeyConverter keyConverter = new JcaPGPKeyConverter();

    public JcaPGPContentSignerBuilder(int i2, int i3) {
        this.keyAlgorithm = i2;
        this.hashAlgorithm = i3;
    }

    public PGPContentSigner build(final int i2, final long j2, PrivateKey privateKey) throws PGPException {
        final PGPDigestCalculator pGPDigestCalculator = this.digestCalculatorProviderBuilder.build().get(this.hashAlgorithm);
        final Signature signatureCreateSignature = this.helper.createSignature(this.keyAlgorithm, this.hashAlgorithm);
        try {
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                signatureCreateSignature.initSign(privateKey, secureRandom);
            } else {
                signatureCreateSignature.initSign(privateKey);
            }
            return new PGPContentSigner() { // from class: org.spongycastle.openpgp.operator.jcajce.JcaPGPContentSignerBuilder.1
                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public byte[] getDigest() {
                    return pGPDigestCalculator.getDigest();
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public int getHashAlgorithm() {
                    return JcaPGPContentSignerBuilder.this.hashAlgorithm;
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public int getKeyAlgorithm() {
                    return JcaPGPContentSignerBuilder.this.keyAlgorithm;
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public long getKeyID() {
                    return j2;
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public OutputStream getOutputStream() {
                    return new TeeOutputStream(new SignatureOutputStream(signatureCreateSignature), pGPDigestCalculator.getOutputStream());
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public byte[] getSignature() {
                    try {
                        return signatureCreateSignature.sign();
                    } catch (SignatureException e2) {
                        throw new PGPRuntimeOperationException("Unable to create signature: " + e2.getMessage(), e2);
                    }
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentSigner
                public int getType() {
                    return i2;
                }
            };
        } catch (InvalidKeyException e2) {
            throw new PGPException("invalid key.", e2);
        }
    }

    @Override // org.spongycastle.openpgp.operator.PGPContentSignerBuilder
    public PGPContentSigner build(int i2, PGPPrivateKey pGPPrivateKey) throws PGPException {
        return pGPPrivateKey instanceof JcaPGPPrivateKey ? build(i2, pGPPrivateKey.getKeyID(), ((JcaPGPPrivateKey) pGPPrivateKey).getPrivateKey()) : build(i2, pGPPrivateKey.getKeyID(), this.keyConverter.getPrivateKey(pGPPrivateKey));
    }

    public JcaPGPContentSignerBuilder setDigestProvider(String str) {
        this.digestCalculatorProviderBuilder.setProvider(str);
        return this;
    }

    public JcaPGPContentSignerBuilder setDigestProvider(Provider provider) {
        this.digestCalculatorProviderBuilder.setProvider(provider);
        return this;
    }

    public JcaPGPContentSignerBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        this.keyConverter.setProvider(str);
        this.digestCalculatorProviderBuilder.setProvider(str);
        return this;
    }

    public JcaPGPContentSignerBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        this.keyConverter.setProvider(provider);
        this.digestCalculatorProviderBuilder.setProvider(provider);
        return this;
    }

    public JcaPGPContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
