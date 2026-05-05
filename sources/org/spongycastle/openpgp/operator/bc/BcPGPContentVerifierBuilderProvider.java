package org.spongycastle.openpgp.operator.bc;

import java.io.OutputStream;
import org.spongycastle.crypto.Signer;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPublicKey;
import org.spongycastle.openpgp.operator.PGPContentVerifier;
import org.spongycastle.openpgp.operator.PGPContentVerifierBuilder;
import org.spongycastle.openpgp.operator.PGPContentVerifierBuilderProvider;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPContentVerifierBuilderProvider implements PGPContentVerifierBuilderProvider {
    private BcPGPKeyConverter keyConverter = new BcPGPKeyConverter();

    private class BcPGPContentVerifierBuilder implements PGPContentVerifierBuilder {
        private int hashAlgorithm;
        private int keyAlgorithm;

        public BcPGPContentVerifierBuilder(int i2, int i3) {
            this.keyAlgorithm = i2;
            this.hashAlgorithm = i3;
        }

        @Override // org.spongycastle.openpgp.operator.PGPContentVerifierBuilder
        public PGPContentVerifier build(final PGPPublicKey pGPPublicKey) throws PGPException {
            final Signer signerCreateSigner = BcImplProvider.createSigner(this.keyAlgorithm, this.hashAlgorithm);
            signerCreateSigner.init(false, BcPGPContentVerifierBuilderProvider.this.keyConverter.getPublicKey(pGPPublicKey));
            return new PGPContentVerifier() { // from class: org.spongycastle.openpgp.operator.bc.BcPGPContentVerifierBuilderProvider.BcPGPContentVerifierBuilder.1
                @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                public int getHashAlgorithm() {
                    return BcPGPContentVerifierBuilder.this.hashAlgorithm;
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                public int getKeyAlgorithm() {
                    return BcPGPContentVerifierBuilder.this.keyAlgorithm;
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                public long getKeyID() {
                    return pGPPublicKey.getKeyID();
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                public OutputStream getOutputStream() {
                    return new SignerOutputStream(signerCreateSigner);
                }

                @Override // org.spongycastle.openpgp.operator.PGPContentVerifier
                public boolean verify(byte[] bArr) {
                    return signerCreateSigner.verifySignature(bArr);
                }
            };
        }
    }

    @Override // org.spongycastle.openpgp.operator.PGPContentVerifierBuilderProvider
    public PGPContentVerifierBuilder get(int i2, int i3) throws PGPException {
        return new BcPGPContentVerifierBuilder(i2, i3);
    }
}
