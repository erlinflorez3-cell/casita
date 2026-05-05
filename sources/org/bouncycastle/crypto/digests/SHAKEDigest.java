package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes9.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest() {
        this(128);
    }

    public SHAKEDigest(int i2) {
        super(checkBitLength(i2));
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    private static int checkBitLength(int i2) {
        if (i2 == 128 || i2 == 256) {
            return i2;
        }
        throw new IllegalArgumentException("'bitLength' " + i2 + " not supported for SHAKE");
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i2) {
        return doFinal(bArr, i2, getDigestSize());
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i2, byte b2, int i3) {
        return doFinal(bArr, i2, getDigestSize(), b2, i3);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i2, int i3) {
        int iDoOutput = doOutput(bArr, i2, i3);
        reset();
        return iDoOutput;
    }

    protected int doFinal(byte[] bArr, int i2, int i3, byte b2, int i4) {
        if (i4 < 0 || i4 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i5 = (-1) - (((-1) - (b2 & ((1 << i4) - 1))) & ((-1) - (15 << i4)));
        int i6 = i4 + 4;
        if (i6 >= 8) {
            this.oneByte[0] = (byte) i5;
            absorb(this.oneByte, 0, 8L);
            i6 = i4 - 4;
            i5 >>>= 8;
        }
        if (i6 > 0) {
            this.oneByte[0] = (byte) i5;
            absorb(this.oneByte, 0, i6);
        }
        squeeze(bArr, i2, ((long) i3) * 8);
        reset();
        return i3;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i2, int i3) {
        if (!this.squeezing) {
            absorb(new byte[]{Ascii.SI}, 0, 4L);
        }
        squeeze(bArr, i2, ((long) i3) * 8);
        return i3;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }
}
