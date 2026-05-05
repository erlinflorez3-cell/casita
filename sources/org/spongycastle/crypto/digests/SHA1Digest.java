package org.spongycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
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
        int i5 = ~i2;
        return ((i5 + i4) - (i5 | i4)) | (i3 & i2);
    }

    private int g(int i2, int i3, int i4) {
        int i5 = i2 & ((-1) - (((-1) - i3) & ((-1) - i4)));
        int i6 = (-1) - (((-1) - i3) | ((-1) - i4));
        return (i5 + i6) - (i5 & i6);
    }

    private int h(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
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

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.digests.EncodableDigest
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

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i2 = 16; i2 < 80; i2++) {
            int[] iArr = this.X;
            int i3 = ((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16];
            iArr[i2] = (i3 >>> 31) | (i3 << 1);
        }
        int iH = this.H1;
        int iH2 = this.H2;
        int i4 = this.H3;
        int i5 = this.H4;
        int i6 = this.H5;
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = iH << 5;
            int i10 = iH >>> 27;
            int iF = i6 + ((i9 + i10) - (i9 & i10)) + f(iH2, i4, i5) + this.X[i7] + Y1;
            int i11 = iH2 << 30;
            int i12 = iH2 >>> 2;
            int i13 = (i12 + i11) - (i12 & i11);
            int iF2 = i5 + ((-1) - (((-1) - (iF << 5)) & ((-1) - (iF >>> 27)))) + f(iH, i13, i4) + this.X[i7 + 1] + Y1;
            int i14 = iH << 30;
            int i15 = iH >>> 2;
            int i16 = (i15 + i14) - (i15 & i14);
            int i17 = iF2 << 5;
            int i18 = iF2 >>> 27;
            int iF3 = i4 + ((i17 + i18) - (i17 & i18)) + f(iF, i16, i13) + this.X[i7 + 2] + Y1;
            i6 = (-1) - (((-1) - (iF >>> 2)) & ((-1) - (iF << 30)));
            int i19 = i7 + 4;
            iH2 = i13 + ((iF3 << 5) | (iF3 >>> 27)) + f(iF2, i6, i16) + this.X[i7 + 3] + Y1;
            i5 = (iF2 >>> 2) | (iF2 << 30);
            i7 += 5;
            iH = i16 + ((-1) - (((-1) - (iH2 << 5)) & ((-1) - (iH2 >>> 27)))) + f(iF3, i5, i6) + this.X[i19] + Y1;
            i4 = (iF3 >>> 2) | (iF3 << 30);
        }
        for (int i20 = 0; i20 < 4; i20++) {
            int iH3 = i6 + ((-1) - (((-1) - (iH << 5)) & ((-1) - (iH >>> 27)))) + h(iH2, i4, i5) + this.X[i7] + Y2;
            int i21 = (-1) - (((-1) - (iH2 >>> 2)) & ((-1) - (iH2 << 30)));
            int iH4 = i5 + ((-1) - (((-1) - (iH3 << 5)) & ((-1) - (iH3 >>> 27)))) + h(iH, i21, i4) + this.X[i7 + 1] + Y2;
            int i22 = iH << 30;
            int i23 = iH >>> 2;
            int i24 = (i23 + i22) - (i23 & i22);
            int i25 = iH4 << 5;
            int i26 = iH4 >>> 27;
            int iH5 = i4 + ((i25 + i26) - (i25 & i26)) + h(iH3, i24, i21) + this.X[i7 + 2] + Y2;
            i6 = (iH3 >>> 2) | (iH3 << 30);
            int i27 = iH5 << 5;
            int i28 = iH5 >>> 27;
            int i29 = i7 + 4;
            iH2 = i21 + ((i27 + i28) - (i27 & i28)) + h(iH4, i6, i24) + this.X[i7 + 3] + Y2;
            i5 = (iH4 >>> 2) | (iH4 << 30);
            i7 += 5;
            iH = i24 + ((-1) - (((-1) - (iH2 << 5)) & ((-1) - (iH2 >>> 27)))) + h(iH5, i5, i6) + this.X[i29] + Y2;
            i4 = (iH5 >>> 2) | (iH5 << 30);
        }
        for (int i30 = 0; i30 < 4; i30++) {
            int iG = i6 + ((iH << 5) | (iH >>> 27)) + g(iH2, i4, i5) + this.X[i7] + Y3;
            int i31 = iH2 << 30;
            int i32 = iH2 >>> 2;
            int i33 = (i32 + i31) - (i32 & i31);
            int iG2 = i5 + ((iG << 5) | (iG >>> 27)) + g(iH, i33, i4) + this.X[i7 + 1] + Y3;
            int i34 = (-1) - (((-1) - (iH >>> 2)) & ((-1) - (iH << 30)));
            int iG3 = i4 + ((iG2 << 5) | (iG2 >>> 27)) + g(iG, i34, i33) + this.X[i7 + 2] + Y3;
            i6 = (-1) - (((-1) - (iG >>> 2)) & ((-1) - (iG << 30)));
            int i35 = i7 + 4;
            iH2 = i33 + ((iG3 << 5) | (iG3 >>> 27)) + g(iG2, i6, i34) + this.X[i7 + 3] + Y3;
            i5 = (-1) - (((-1) - (iG2 >>> 2)) & ((-1) - (iG2 << 30)));
            i7 += 5;
            iH = i34 + ((-1) - (((-1) - (iH2 << 5)) & ((-1) - (iH2 >>> 27)))) + g(iG3, i5, i6) + this.X[i35] + Y3;
            int i36 = iG3 << 30;
            int i37 = iG3 >>> 2;
            i4 = (i37 + i36) - (i37 & i36);
        }
        for (int i38 = 0; i38 <= 3; i38++) {
            int i39 = iH << 5;
            int i40 = iH >>> 27;
            int iH6 = i6 + ((i39 + i40) - (i39 & i40)) + h(iH2, i4, i5) + this.X[i7] + Y4;
            int i41 = (-1) - (((-1) - (iH2 >>> 2)) & ((-1) - (iH2 << 30)));
            int i42 = iH6 << 5;
            int i43 = iH6 >>> 27;
            int iH7 = i5 + ((i42 + i43) - (i42 & i43)) + h(iH, i41, i4) + this.X[i7 + 1] + Y4;
            int i44 = (-1) - (((-1) - (iH >>> 2)) & ((-1) - (iH << 30)));
            int i45 = iH7 << 5;
            int i46 = iH7 >>> 27;
            int iH8 = i4 + ((i45 + i46) - (i45 & i46)) + h(iH6, i44, i41) + this.X[i7 + 2] + Y4;
            i6 = (iH6 >>> 2) | (iH6 << 30);
            int i47 = i7 + 4;
            iH2 = i41 + ((-1) - (((-1) - (iH8 << 5)) & ((-1) - (iH8 >>> 27)))) + h(iH7, i6, i44) + this.X[i7 + 3] + Y4;
            int i48 = iH7 << 30;
            int i49 = iH7 >>> 2;
            i5 = (i49 + i48) - (i49 & i48);
            i7 += 5;
            iH = i44 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH8, i5, i6) + this.X[i47] + Y4;
            i4 = (iH8 >>> 2) | (iH8 << 30);
        }
        this.H1 += iH;
        this.H2 += iH2;
        this.H3 += i4;
        this.H4 += i5;
        this.H5 += i6;
        this.xOff = 0;
        for (int i50 = 0; i50 < 16; i50++) {
            this.X[i50] = 0;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processLength(long j2) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) j2;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i2) {
        int i3 = bArr[i2] << Ascii.CAN;
        byte b2 = bArr[i2 + 1];
        int i4 = ((b2 + 255) - (b2 | 255)) << 16;
        int i5 = (i3 + i4) - (i3 & i4);
        byte b3 = bArr[i2 + 2];
        int i6 = ((b3 + 255) - (b3 | 255)) << 8;
        int i7 = (i5 + i6) - (i5 & i6);
        int i8 = bArr[i2 + 3] & 255;
        int i9 = (i8 + i7) - (i8 & i7);
        int[] iArr = this.X;
        int i10 = this.xOff;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.xOff = i11;
        if (i11 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
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

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }
}
