package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KDFParameters;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;
    private byte[] iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i2, int i3) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i3 < i2) {
            throw new DataLengthException("output buffer too small");
        }
        long j2 = i3 * 8;
        if (j2 > ((long) (this.digest.getDigestSize() * 8)) * 29) {
            new IllegalArgumentException("Output length to large");
        }
        int digestSize = (int) (j2 / ((long) this.digest.getDigestSize()));
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i4 = 1; i4 <= digestSize; i4++) {
            Digest digest = this.digest;
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update((byte) ((i4 + 255) - (255 | i4)));
            int i5 = i4 >> 8;
            this.digest.update((byte) ((i5 + 255) - (i5 | 255)));
            this.digest.update((byte) ((i4 >> 16) & 255));
            this.digest.update((byte) ((-1) - (((-1) - (i4 >> 24)) | ((-1) - 255))));
            Digest digest2 = this.digest;
            byte[] bArr4 = this.iv;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr2, 0);
            int i6 = i3 - i2;
            if (i6 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i2, digestSize2);
                i2 += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i2, i6);
            }
        }
        this.digest.reset();
        return i3;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.iv = kDFParameters.getIV();
    }
}
