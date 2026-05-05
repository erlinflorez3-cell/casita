package org.spongycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(256);
    }

    public SHA3Digest(int i2) {
        super(checkBitLength(i2));
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    private static int checkBitLength(int i2) {
        if (i2 == 224 || i2 == 256 || i2 == 384 || i2 == 512) {
            return i2;
        }
        throw new IllegalArgumentException("'bitLength' " + i2 + " not supported for SHA-3");
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i2) {
        absorb(new byte[]{2}, 0, 2L);
        return super.doFinal(bArr, i2);
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i2, byte b2, int i3) {
        if (i3 < 0 || i3 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i4 = (-1) - (((-1) - b2) | ((-1) - ((1 << i3) - 1)));
        int i5 = 2 << i3;
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = i3 + 2;
        if (i7 >= 8) {
            this.oneByte[0] = (byte) i6;
            absorb(this.oneByte, 0, 8L);
            i7 = i3 - 6;
            i6 >>>= 8;
        }
        return super.doFinal(bArr, i2, (byte) i6, i7);
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }
}
