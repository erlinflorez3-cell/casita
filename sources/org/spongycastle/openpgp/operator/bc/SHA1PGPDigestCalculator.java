package org.spongycastle.openpgp.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;

/* JADX INFO: loaded from: classes2.dex */
class SHA1PGPDigestCalculator implements PGPDigestCalculator {
    private Digest digest = new SHA1Digest();

    private class DigestOutputStream extends OutputStream {
        private Digest dig;

        DigestOutputStream(Digest digest) {
            this.dig = digest;
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

    SHA1PGPDigestCalculator() {
    }

    @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
    public int getAlgorithm() {
        return 2;
    }

    @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
    public byte[] getDigest() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
    public OutputStream getOutputStream() {
        return new DigestOutputStream(this.digest);
    }

    @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
    public void reset() {
        this.digest.reset();
    }
}
