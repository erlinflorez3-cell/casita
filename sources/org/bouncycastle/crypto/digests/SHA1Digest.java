package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest() {
        this.X = new int[80];
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            this.X[i2] = Pack.bigEndianToInt(bArr, (i2 * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i2, int i3, int i4) {
        int i5 = (-1) - (((-1) - i3) | ((-1) - i2));
        int i6 = (-1) - (((-1) - (~i2)) | ((-1) - i4));
        return (i6 + i5) - (i6 & i5);
    }

    private int g(int i2, int i3, int i4) {
        int i5 = (-1) - (((-1) - i2) | ((-1) - ((-1) - (((-1) - i3) & ((-1) - i4)))));
        int i6 = (-1) - (((-1) - i3) | ((-1) - i4));
        return (i5 + i6) - (i5 & i6);
    }

    private int h(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i2) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i2);
        Pack.intToBigEndian(this.H2, bArr, i2 + 4);
        Pack.intToBigEndian(this.H3, bArr, i2 + 8);
        Pack.intToBigEndian(this.H4, bArr, i2 + 12);
        Pack.intToBigEndian(this.H5, bArr, i2 + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.X[i2], bArr, (i2 * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i2 = 16; i2 < 80; i2++) {
            int[] iArr = this.X;
            int i3 = ((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16];
            int i4 = i3 << 1;
            int i5 = i3 >>> 31;
            iArr[i2] = (i5 + i4) - (i5 & i4);
        }
        int iH = this.H1;
        int iH2 = this.H2;
        int i6 = this.H3;
        int i7 = this.H4;
        int i8 = this.H5;
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int iF = i8 + ((-1) - (((-1) - (iH << 5)) & ((-1) - (iH >>> 27)))) + f(iH2, i6, i7) + this.X[i9] + Y1;
            int i11 = (-1) - (((-1) - (iH2 >>> 2)) & ((-1) - (iH2 << 30)));
            int i12 = iF << 5;
            int i13 = iF >>> 27;
            int iF2 = i7 + ((i12 + i13) - (i12 & i13)) + f(iH, i11, i6) + this.X[i9 + 1] + Y1;
            int i14 = iH << 30;
            int i15 = iH >>> 2;
            int i16 = (i15 + i14) - (i15 & i14);
            int iF3 = i6 + ((-1) - (((-1) - (iF2 << 5)) & ((-1) - (iF2 >>> 27)))) + f(iF, i16, i11) + this.X[i9 + 2] + Y1;
            i8 = (iF >>> 2) | (iF << 30);
            int i17 = i9 + 4;
            iH2 = i11 + ((iF3 << 5) | (iF3 >>> 27)) + f(iF2, i8, i16) + this.X[i9 + 3] + Y1;
            i7 = (-1) - (((-1) - (iF2 >>> 2)) & ((-1) - (iF2 << 30)));
            int i18 = iH2 << 5;
            int i19 = iH2 >>> 27;
            i9 += 5;
            iH = i16 + ((i18 + i19) - (i18 & i19)) + f(iF3, i7, i8) + this.X[i17] + Y1;
            int i20 = iF3 << 30;
            int i21 = iF3 >>> 2;
            i6 = (i21 + i20) - (i21 & i20);
        }
        for (int i22 = 0; i22 < 4; i22++) {
            int i23 = iH << 5;
            int i24 = iH >>> 27;
            int iH3 = i8 + ((i23 + i24) - (i23 & i24)) + h(iH2, i6, i7) + this.X[i9] + Y2;
            int i25 = iH2 << 30;
            int i26 = iH2 >>> 2;
            int i27 = (i26 + i25) - (i26 & i25);
            int iH4 = i7 + ((iH3 << 5) | (iH3 >>> 27)) + h(iH, i27, i6) + this.X[i9 + 1] + Y2;
            int i28 = iH << 30;
            int i29 = iH >>> 2;
            int i30 = (i29 + i28) - (i29 & i28);
            int i31 = iH4 << 5;
            int i32 = iH4 >>> 27;
            int iH5 = i6 + ((i31 + i32) - (i31 & i32)) + h(iH3, i30, i27) + this.X[i9 + 2] + Y2;
            i8 = (iH3 >>> 2) | (iH3 << 30);
            int i33 = i9 + 4;
            iH2 = i27 + ((iH5 << 5) | (iH5 >>> 27)) + h(iH4, i8, i30) + this.X[i9 + 3] + Y2;
            int i34 = iH4 << 30;
            int i35 = iH4 >>> 2;
            i7 = (i35 + i34) - (i35 & i34);
            i9 += 5;
            iH = i30 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH5, i7, i8) + this.X[i33] + Y2;
            int i36 = iH5 << 30;
            int i37 = iH5 >>> 2;
            i6 = (i37 + i36) - (i37 & i36);
        }
        for (int i38 = 0; i38 < 4; i38++) {
            int i39 = iH << 5;
            int i40 = iH >>> 27;
            int iG = i8 + ((i39 + i40) - (i39 & i40)) + g(iH2, i6, i7) + this.X[i9] + Y3;
            int i41 = (iH2 >>> 2) | (iH2 << 30);
            int iG2 = i7 + ((iG << 5) | (iG >>> 27)) + g(iH, i41, i6) + this.X[i9 + 1] + Y3;
            int i42 = (iH >>> 2) | (iH << 30);
            int iG3 = i6 + ((iG2 << 5) | (iG2 >>> 27)) + g(iG, i42, i41) + this.X[i9 + 2] + Y3;
            i8 = (iG >>> 2) | (iG << 30);
            int i43 = iG3 << 5;
            int i44 = iG3 >>> 27;
            int i45 = i9 + 4;
            iH2 = i41 + ((i43 + i44) - (i43 & i44)) + g(iG2, i8, i42) + this.X[i9 + 3] + Y3;
            i7 = (-1) - (((-1) - (iG2 >>> 2)) & ((-1) - (iG2 << 30)));
            i9 += 5;
            iH = i42 + ((-1) - (((-1) - (iH2 << 5)) & ((-1) - (iH2 >>> 27)))) + g(iG3, i7, i8) + this.X[i45] + Y3;
            i6 = (-1) - (((-1) - (iG3 >>> 2)) & ((-1) - (iG3 << 30)));
        }
        for (int i46 = 0; i46 <= 3; i46++) {
            int iH6 = i8 + ((iH << 5) | (iH >>> 27)) + h(iH2, i6, i7) + this.X[i9] + Y4;
            int i47 = (-1) - (((-1) - (iH2 >>> 2)) & ((-1) - (iH2 << 30)));
            int iH7 = i7 + ((iH6 << 5) | (iH6 >>> 27)) + h(iH, i47, i6) + this.X[i9 + 1] + Y4;
            int i48 = (iH >>> 2) | (iH << 30);
            int iH8 = i6 + ((-1) - (((-1) - (iH7 << 5)) & ((-1) - (iH7 >>> 27)))) + h(iH6, i48, i47) + this.X[i9 + 2] + Y4;
            i8 = (-1) - (((-1) - (iH6 >>> 2)) & ((-1) - (iH6 << 30)));
            int i49 = iH8 << 5;
            int i50 = iH8 >>> 27;
            int i51 = i9 + 4;
            iH2 = i47 + ((i49 + i50) - (i49 & i50)) + h(iH7, i8, i48) + this.X[i9 + 3] + Y4;
            i7 = (iH7 >>> 2) | (iH7 << 30);
            int i52 = iH2 << 5;
            int i53 = iH2 >>> 27;
            i9 += 5;
            iH = i48 + ((i52 + i53) - (i52 & i53)) + h(iH8, i7, i8) + this.X[i51] + Y4;
            i6 = (iH8 >>> 2) | (iH8 << 30);
        }
        this.H1 += iH;
        this.H2 += iH2;
        this.H3 += i6;
        this.H4 += i7;
        this.H5 += i8;
        this.xOff = 0;
        for (int i54 = 0; i54 < 16; i54++) {
            this.X[i54] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j2) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) j2;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i2) {
        int i3 = bArr[i2] << Ascii.CAN;
        int i4 = (bArr[i2 + 1] & 255) << 16;
        int i5 = (-1) - (((-1) - ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255)))) & ((-1) - (((i3 + i4) - (i3 & i4)) | (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 8))));
        int[] iArr = this.X;
        int i6 = this.xOff;
        iArr[i6] = i5;
        int i7 = i6 + 1;
        this.xOff = i7;
        if (i7 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.X;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }
}
