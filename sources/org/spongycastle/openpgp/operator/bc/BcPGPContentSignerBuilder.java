package org.spongycastle.openpgp.operator.bc;

import java.io.OutputStream;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.operator.PGPContentSigner;
import org.spongycastle.openpgp.operator.PGPContentSignerBuilder;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.util.io.TeeOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPContentSignerBuilder implements PGPContentSignerBuilder {
    private int hashAlgorithm;
    private int keyAlgorithm;
    private SecureRandom random;
    private BcPGPDigestCalculatorProvider digestCalculatorProvider = new BcPGPDigestCalculatorProvider();
    private BcPGPKeyConverter keyConverter = new BcPGPKeyConverter();

    public BcPGPContentSignerBuilder(int i2, int i3) {
        this.keyAlgorithm = i2;
        this.hashAlgorithm = i3;
    }

    @Override // org.spongycastle.openpgp.operator.PGPContentSignerBuilder
    public PGPContentSigner build(final int i2, final PGPPrivateKey pGPPrivateKey) throws PGPException {
        final PGPDigestCalculator pGPDigestCalculator = this.digestCalculatorProvider.get(this.hashAlgorithm);
        final Signer signerCreateSigner = BcImplProvider.createSigner(this.keyAlgorithm, this.hashAlgorithm);
        if (this.random != null) {
            signerCreateSigner.init(true, new ParametersWithRandom(this.keyConverter.getPrivateKey(pGPPrivateKey), this.random));
        } else {
            signerCreateSigner.init(true, this.keyConverter.getPrivateKey(pGPPrivateKey));
        }
        return new PGPContentSigner() { // from class: org.spongycastle.openpgp.operator.bc.BcPGPContentSignerBuilder.1
            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public byte[] getDigest() {
                return pGPDigestCalculator.getDigest();
            }

            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public int getHashAlgorithm() {
                return BcPGPContentSignerBuilder.this.hashAlgorithm;
            }

            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public int getKeyAlgorithm() {
                return BcPGPContentSignerBuilder.this.keyAlgorithm;
            }

            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public long getKeyID() {
                return pGPPrivateKey.getKeyID();
            }

            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public OutputStream getOutputStream() {
                return new TeeOutputStream(new SignerOutputStream(signerCreateSigner), pGPDigestCalculator.getOutputStream());
            }

            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public byte[] getSignature() {
                try {
                    return signerCreateSigner.generateSignature();
                } catch (CryptoException unused) {
                    throw new IllegalStateException("unable to create signature");
                }
            }

            @Override // org.spongycastle.openpgp.operator.PGPContentSigner
            public int getType() {
                return i2;
            }
        };
    }

    public BcPGPContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
