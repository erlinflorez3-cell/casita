package org.spongycastle.openpgp.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.Digest;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPDigestCalculatorProvider implements PGPDigestCalculatorProvider {

    private class DigestOutputStream extends OutputStream {
        private Digest dig;

        DigestOutputStream(Digest digest) {
            this.dig = digest;
        }

        byte[] getDigest() {
            byte[] bArr = new byte[this.dig.getDigestSize()];
            this.dig.doFinal(bArr, 0);
            return bArr;
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.dig.update((byte) i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.dig.update(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.dig.update(bArr, i2, i3);
        }
    }

    @Override // org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider
    public PGPDigestCalculator get(final int i2) throws PGPException {
        final Digest digestCreateDigest = BcImplProvider.createDigest(i2);
        final DigestOutputStream digestOutputStream = new DigestOutputStream(digestCreateDigest);
        return new PGPDigestCalculator() { // from class: org.spongycastle.openpgp.operator.bc.BcPGPDigestCalculatorProvider.1
            @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
            public int getAlgorithm() {
                return i2;
            }

            @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
            public byte[] getDigest() {
                return digestOutputStream.getDigest();
            }

            @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
            public OutputStream getOutputStream() {
                return digestOutputStream;
            }

            @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
            public void reset() {
                digestCreateDigest.reset();
            }
        };
    }
}
