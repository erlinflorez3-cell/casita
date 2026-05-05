package org.spongycastle.openpgp.operator.jcajce;

import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPublicKey;
import org.spongycastle.openpgp.PGPRuntimeOperationException;
import org.spongycastle.openpgp.operator.PGPContentVerifier;
import org.spongycastle.openpgp.operator.PGPContentVerifierBuilder;
import org.spongycastle.openpgp.operator.PGPContentVerifierBuilderProvider;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPContentVerifierBuilderProvider implements PGPContentVerifierBuilderProvider {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private JcaPGPKeyConverter keyConverter = new JcaPGPKeyConverter();

    private class JcaPGPContentVerifierBuilder implements PGPContentVerifierBuilder {
        private int hashAlgorithm;
        private int keyAlgorithm;

        public JcaPGPContentVerifierBuilder(int i2, int i3) {
            this.keyAlgorithm = i2;
            this.hashAlgorithm = i3;
        }

        @Override // org.spongycastle.openpgp.operator.PGPContentVerifierBuilder
        public PGPContentVerifier build(final PGPPublicKey pGPPublicKey) throws PGPException {
            final Signature signatureCreateSignature = JcaPGPContentVerifierBuilderProvider.this.helper.createSignature(this.keyAlgorithm, this.hashAlgorithm);
            try {
                signatureCreateSignature.initVerify(JcaPGPContentVerifierBuilderProvider.this.keyConverter.getPublicKey(pGPPublicKey));
                return new PGPContentVerifier() { // from class: org.spongycastle.openpgp.operator.jcajce.JcaPGPContentVerifierBuilderProvider.JcaPGPContentVerifierBuilder.1
                    @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                    public int getHashAlgorithm() {
                        return JcaPGPContentVerifierBuilder.this.hashAlgorithm;
                    }

                    @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                    public int getKeyAlgorithm() {
                        return JcaPGPContentVerifierBuilder.this.keyAlgorithm;
                    }

                    @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                    public long getKeyID() {
                        return pGPPublicKey.getKeyID();
                    }

                    @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                    public OutputStream getOutputStream() {
                        return new SignatureOutputStream(signatureCreateSignature);
                    }

                    @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                    public boolean verify(byte[] bArr) {
                        try {
                            return signatureCreateSignature.verify(bArr);
                        } catch (SignatureException e2) {
                            throw new PGPRuntimeOperationException("unable to verify signature: " + e2.getMessage(), e2);
                        }
                    }
                };
            } catch (InvalidKeyException e2) {
                throw new PGPException("invalid key.", e2);
            }
        }
    }

    @Override // org.spongycastle.openpgp.operator.PGPContentVerifierBuilderProvider
    public PGPContentVerifierBuilder get(int i2, int i3) throws PGPException {
        return new JcaPGPContentVerifierBuilder(i2, i3);
    }

    public JcaPGPContentVerifierBuilderProvider setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        this.keyConverter.setProvider(str);
        return this;
    }

    public JcaPGPContentVerifierBuilderProvider setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        this.keyConverter.setProvider(provider);
        return this;
    }
}
