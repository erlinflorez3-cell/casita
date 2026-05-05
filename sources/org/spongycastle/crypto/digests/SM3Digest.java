package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
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
            T[i2] = (-1) - (((-1) - (2055708042 >>> (32 - i4))) & ((-1) - (2055708042 << i4)));
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
        int i5 = (-1) - (((-1) - i2) | ((-1) - (i3 | i4)));
        int i6 = (-1) - (((-1) - i3) | ((-1) - i4));
        return (i5 + i6) - (i5 & i6);
    }

    private int GG0(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    private int GG1(int i2, int i3, int i4) {
        int i5 = ~i2;
        return ((i5 + i4) - (i5 | i4)) | ((i3 + i2) - (i3 | i2));
    }

    private int P0(int i2) {
        int i3 = i2 << 9;
        int i4 = i2 >>> 23;
        int i5 = (i3 + i4) - (i3 & i4);
        return (i2 ^ i5) ^ ((-1) - (((-1) - (i2 << 17)) & ((-1) - (i2 >>> 15))));
    }

    private int P1(int i2) {
        int i3 = i2 << 15;
        int i4 = i2 >>> 17;
        int i5 = (i3 + i4) - (i3 & i4);
        return (i2 ^ i5) ^ ((i2 << 23) | (i2 >>> 9));
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

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
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

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
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
            int i6 = i5 << 15;
            int i7 = i5 >>> 17;
            int i8 = (i7 + i6) - (i7 & i6);
            int i9 = iArr[i4 - 13];
            int i10 = i9 << 7;
            int i11 = i9 >>> 25;
            iArr[i4] = (P1(i8 ^ (iArr[i4 - 16] ^ iArr[i4 - 9])) ^ ((i11 + i10) - (i11 & i10))) ^ this.W[i4 - 6];
        }
        for (int i12 = 0; i12 < 64; i12++) {
            int[] iArr2 = this.W1;
            int[] iArr3 = this.W;
            iArr2[i12] = iArr3[i12 + 4] ^ iArr3[i12];
        }
        int[] iArr4 = this.V;
        int i13 = iArr4[0];
        int i14 = iArr4[1];
        int i15 = iArr4[2];
        int i16 = iArr4[3];
        int iP0 = iArr4[4];
        int i17 = iArr4[5];
        int i18 = iArr4[6];
        int i19 = iArr4[7];
        int i20 = 0;
        while (i20 < 16) {
            int i21 = (i13 << 12) | (i13 >>> 20);
            int i22 = i21 + iP0 + T[i20];
            int i23 = (-1) - (((-1) - (i22 << 7)) & ((-1) - (i22 >>> 25)));
            int iFF0 = FF0(i13, i14, i15) + i16 + (i23 ^ i21) + this.W1[i20];
            int iGG0 = GG0(iP0, i17, i18) + i19 + i23 + this.W[i20];
            int i24 = (i14 << 9) | (i14 >>> 23);
            int i25 = i17 << 19;
            int i26 = i17 >>> 13;
            int i27 = (i25 + i26) - (i25 & i26);
            i20++;
            i17 = iP0;
            iP0 = P0(iGG0);
            i19 = i18;
            i18 = i27;
            i14 = i13;
            i13 = iFF0;
            i16 = i15;
            i15 = i24;
        }
        while (i2 < 64) {
            int i28 = i13 << 12;
            int i29 = i13 >>> 20;
            int i30 = (i28 + i29) - (i28 & i29);
            int i31 = i30 + iP0 + T[i2];
            int i32 = (i31 << 7) | (i31 >>> 25);
            int iFF1 = FF1(i13, i14, i15) + i16 + (i32 ^ i30) + this.W1[i2];
            int iGG1 = GG1(iP0, i17, i18) + i19 + i32 + this.W[i2];
            int i33 = (-1) - (((-1) - (i14 >>> 23)) & ((-1) - (i14 << 9)));
            int i34 = i17 << 19;
            int i35 = i17 >>> 13;
            int i36 = (i34 + i35) - (i34 & i35);
            i2++;
            i17 = iP0;
            iP0 = P0(iGG1);
            i19 = i18;
            i18 = i36;
            i14 = i13;
            i13 = iFF1;
            i16 = i15;
            i15 = i33;
        }
        int[] iArr5 = this.V;
        iArr5[0] = iArr5[0] ^ i13;
        iArr5[1] = iArr5[1] ^ i14;
        iArr5[2] = iArr5[2] ^ i15;
        iArr5[3] = iArr5[3] ^ i16;
        iArr5[4] = iArr5[4] ^ iP0;
        iArr5[5] = iArr5[5] ^ i17;
        iArr5[6] = i18 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i19;
        this.xOff = 0;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
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

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i2) {
        int i3 = (((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << 24) | ((bArr[i2 + 1] & 255) << 16);
        byte b2 = bArr[i2 + 2];
        int i4 = (-1) - (((-1) - i3) & ((-1) - (((b2 + 255) - (b2 | 255)) << 8)));
        int i5 = (-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255));
        int i6 = (i5 + i4) - (i5 & i4);
        int[] iArr = this.inwords;
        int i7 = this.xOff;
        iArr[i7] = i6;
        int i8 = i7 + 1;
        this.xOff = i8;
        if (i8 >= 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
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

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
