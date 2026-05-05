package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] W1;
    private int[] inwords;
    private int xOff;

    static {
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= 16) {
                break;
            }
            T[i3] = (2043430169 >>> (32 - i3)) | (2043430169 << i3);
            i3++;
        }
        for (i2 = 16; i2 < 64; i2++) {
            int i4 = i2 % 32;
            int i5 = 2055708042 << i4;
            int i6 = 2055708042 >>> (32 - i4);
            T[i2] = (i6 + i5) - (i6 & i5);
        }
    }

    public SM3Digest() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        this.W1 = new int[64];
        reset();
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        this.W1 = new int[64];
        copyIn(sM3Digest);
    }

    private int FF0(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    private int FF1(int i2, int i3, int i4) {
        int i5 = (-1) - (((-1) - i3) & ((-1) - i4));
        return ((i2 + i5) - (i2 | i5)) | ((i3 + i4) - (i3 | i4));
    }

    private int GG0(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    private int GG1(int i2, int i3, int i4) {
        return (-1) - (((-1) - ((~i2) & i4)) & ((-1) - (i3 & i2)));
    }

    private int P0(int i2) {
        int i3 = i2 << 17;
        int i4 = i2 >>> 15;
        return (i2 ^ ((i2 << 9) | (i2 >>> 23))) ^ ((i3 + i4) - (i3 & i4));
    }

    private int P1(int i2) {
        return (i2 ^ ((-1) - (((-1) - (i2 << 15)) & ((-1) - (i2 >>> 17))))) ^ ((-1) - (((-1) - (i2 << 23)) & ((-1) - (i2 >>> 9))));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i2) {
        finish();
        Pack.intToBigEndian(this.V[0], bArr, i2);
        Pack.intToBigEndian(this.V[1], bArr, i2 + 4);
        Pack.intToBigEndian(this.V[2], bArr, i2 + 8);
        Pack.intToBigEndian(this.V[3], bArr, i2 + 12);
        Pack.intToBigEndian(this.V[4], bArr, i2 + 16);
        Pack.intToBigEndian(this.V[5], bArr, i2 + 20);
        Pack.intToBigEndian(this.V[6], bArr, i2 + 24);
        Pack.intToBigEndian(this.V[7], bArr, i2 + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = 16;
            if (i3 >= 16) {
                break;
            }
            this.W[i3] = this.inwords[i3];
            i3++;
        }
        for (int i4 = 16; i4 < 68; i4++) {
            int[] iArr = this.W;
            int i5 = iArr[i4 - 3];
            int i6 = (i5 >>> 17) | (i5 << 15);
            int i7 = iArr[i4 - 13];
            int i8 = i7 << 7;
            int i9 = i7 >>> 25;
            iArr[i4] = (P1(i6 ^ (iArr[i4 - 16] ^ iArr[i4 - 9])) ^ ((i9 + i8) - (i9 & i8))) ^ this.W[i4 - 6];
        }
        for (int i10 = 0; i10 < 64; i10++) {
            int[] iArr2 = this.W1;
            int[] iArr3 = this.W;
            iArr2[i10] = iArr3[i10 + 4] ^ iArr3[i10];
        }
        int[] iArr4 = this.V;
        int i11 = iArr4[0];
        int i12 = iArr4[1];
        int i13 = iArr4[2];
        int i14 = iArr4[3];
        int iP0 = iArr4[4];
        int i15 = iArr4[5];
        int i16 = iArr4[6];
        int i17 = iArr4[7];
        int i18 = 0;
        while (i18 < 16) {
            int i19 = (-1) - (((-1) - (i11 << 12)) & ((-1) - (i11 >>> 20)));
            int i20 = i19 + iP0 + T[i18];
            int i21 = i20 << 7;
            int i22 = i20 >>> 25;
            int i23 = (i21 + i22) - (i21 & i22);
            int iFF0 = FF0(i11, i12, i13) + i14 + (i23 ^ i19) + this.W1[i18];
            int iGG0 = GG0(iP0, i15, i16) + i17 + i23 + this.W[i18];
            int i24 = (-1) - (((-1) - (i12 << 9)) & ((-1) - (i12 >>> 23)));
            int i25 = (-1) - (((-1) - (i15 << 19)) & ((-1) - (i15 >>> 13)));
            i18++;
            i15 = iP0;
            iP0 = P0(iGG0);
            i17 = i16;
            i16 = i25;
            i12 = i11;
            i11 = iFF0;
            i14 = i13;
            i13 = i24;
        }
        while (i2 < 64) {
            int i26 = (i11 << 12) | (i11 >>> 20);
            int i27 = i26 + iP0 + T[i2];
            int i28 = (i27 << 7) | (i27 >>> 25);
            int iFF1 = FF1(i11, i12, i13) + i14 + (i28 ^ i26) + this.W1[i2];
            int iGG1 = GG1(iP0, i15, i16) + i17 + i28 + this.W[i2];
            int i29 = (-1) - (((-1) - (i12 >>> 23)) & ((-1) - (i12 << 9)));
            int i30 = (i15 << 19) | (i15 >>> 13);
            i2++;
            i15 = iP0;
            iP0 = P0(iGG1);
            i17 = i16;
            i16 = i30;
            i12 = i11;
            i11 = iFF1;
            i14 = i13;
            i13 = i29;
        }
        int[] iArr5 = this.V;
        iArr5[0] = iArr5[0] ^ i11;
        iArr5[1] = iArr5[1] ^ i12;
        iArr5[2] = iArr5[2] ^ i13;
        iArr5[3] = iArr5[3] ^ i14;
        iArr5[4] = iArr5[4] ^ iP0;
        iArr5[5] = iArr5[5] ^ i15;
        iArr5[6] = i16 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i17;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j2) {
        int i2 = this.xOff;
        if (i2 > 14) {
            this.inwords[i2] = 0;
            this.xOff = i2 + 1;
            processBlock();
        }
        while (true) {
            int i3 = this.xOff;
            if (i3 >= 14) {
                int[] iArr = this.inwords;
                int i4 = i3 + 1;
                this.xOff = i4;
                iArr[i3] = (int) (j2 >>> 32);
                this.xOff = i3 + 2;
                iArr[i4] = (int) j2;
                return;
            }
            this.inwords[i3] = 0;
            this.xOff = i3 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i2) {
        int i3 = (bArr[i2] & 255) << 24;
        int i4 = (bArr[i2 + 1] & 255) << 16;
        int i5 = (i3 + i4) - (i3 & i4);
        byte b2 = bArr[i2 + 2];
        int i6 = (bArr[i2 + 3] & 255) | i5 | (((b2 + 255) - (b2 | 255)) << 8);
        int[] iArr = this.inwords;
        int i7 = this.xOff;
        iArr[i7] = i6;
        int i8 = i7 + 1;
        this.xOff = i8;
        if (i8 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
