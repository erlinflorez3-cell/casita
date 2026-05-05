package org.spongycastle.cert.selector;

import com.google.common.base.Ascii;
import java.io.IOException;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
class MSOutlookKeyIdCalculator {

    private static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        protected GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        protected GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        protected void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j2 = this.byteCount << 3;
            update((byte) -128);
            while (this.xBufOff != 0) {
                update((byte) 0);
            }
            processLength(j2);
            processBlock();
        }

        protected abstract void processBlock();

        protected abstract void processLength(long j2);

        protected abstract void processWord(byte[] bArr, int i2);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i2 >= bArr.length) {
                    return;
                }
                bArr[i2] = 0;
                i2++;
            }
        }

        public void update(byte b2) {
            byte[] bArr = this.xBuf;
            int i2 = this.xBufOff;
            int i3 = i2 + 1;
            this.xBufOff = i3;
            bArr[i2] = b2;
            if (i3 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        public void update(byte[] bArr, int i2, int i3) {
            while (this.xBufOff != 0 && i3 > 0) {
                update(bArr[i2]);
                i2++;
                i3--;
            }
            while (i3 > this.xBuf.length) {
                processWord(bArr, i2);
                byte[] bArr2 = this.xBuf;
                i2 += bArr2.length;
                i3 -= bArr2.length;
                this.byteCount += (long) bArr2.length;
            }
            while (i3 > 0) {
                update(bArr[i2]);
                i2++;
                i3--;
            }
        }
    }

    private static class SHA1Digest extends GeneralDigest {
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
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i2, int i3, int i4) {
            int i5 = i3 & i2;
            int i6 = ~i2;
            int i7 = (i6 + i4) - (i6 | i4);
            return (i7 + i5) - (i7 & i5);
        }

        private int g(int i2, int i3, int i4) {
            int i5 = i3 | i4;
            return ((i2 + i5) - (i2 | i5)) | (i3 & i4);
        }

        private int h(int i2, int i3, int i4) {
            return (i2 ^ i3) ^ i4;
        }

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

        public String getAlgorithmName() {
            return "SHA-1";
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processBlock() {
            for (int i2 = 16; i2 < 80; i2++) {
                int[] iArr = this.X;
                int i3 = ((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16];
                iArr[i2] = (-1) - (((-1) - (i3 >>> 31)) & ((-1) - (i3 << 1)));
            }
            int iH = this.H1;
            int iH2 = this.H2;
            int i4 = this.H3;
            int i5 = this.H4;
            int i6 = this.H5;
            int i7 = 0;
            for (int i8 = 0; i8 < 4; i8++) {
                int iF = i6 + ((iH << 5) | (iH >>> 27)) + f(iH2, i4, i5) + this.X[i7] + Y1;
                int i9 = (-1) - (((-1) - (iH2 >>> 2)) & ((-1) - (iH2 << 30)));
                int iF2 = i5 + ((-1) - (((-1) - (iF << 5)) & ((-1) - (iF >>> 27)))) + f(iH, i9, i4) + this.X[i7 + 1] + Y1;
                int i10 = (-1) - (((-1) - (iH >>> 2)) & ((-1) - (iH << 30)));
                int iF3 = i4 + ((-1) - (((-1) - (iF2 << 5)) & ((-1) - (iF2 >>> 27)))) + f(iF, i10, i9) + this.X[i7 + 2] + Y1;
                i6 = (-1) - (((-1) - (iF >>> 2)) & ((-1) - (iF << 30)));
                int i11 = iF3 << 5;
                int i12 = iF3 >>> 27;
                int i13 = i7 + 4;
                iH2 = i9 + ((i11 + i12) - (i11 & i12)) + f(iF2, i6, i10) + this.X[i7 + 3] + Y1;
                i5 = (-1) - (((-1) - (iF2 >>> 2)) & ((-1) - (iF2 << 30)));
                i7 += 5;
                iH = i10 + ((-1) - (((-1) - (iH2 << 5)) & ((-1) - (iH2 >>> 27)))) + f(iF3, i5, i6) + this.X[i13] + Y1;
                int i14 = iF3 << 30;
                int i15 = iF3 >>> 2;
                i4 = (i15 + i14) - (i15 & i14);
            }
            for (int i16 = 0; i16 < 4; i16++) {
                int iH3 = i6 + ((-1) - (((-1) - (iH << 5)) & ((-1) - (iH >>> 27)))) + h(iH2, i4, i5) + this.X[i7] + Y2;
                int i17 = (iH2 >>> 2) | (iH2 << 30);
                int iH4 = i5 + ((iH3 << 5) | (iH3 >>> 27)) + h(iH, i17, i4) + this.X[i7 + 1] + Y2;
                int i18 = iH << 30;
                int i19 = iH >>> 2;
                int i20 = (i19 + i18) - (i19 & i18);
                int iH5 = i4 + ((-1) - (((-1) - (iH4 << 5)) & ((-1) - (iH4 >>> 27)))) + h(iH3, i20, i17) + this.X[i7 + 2] + Y2;
                i6 = (iH3 >>> 2) | (iH3 << 30);
                int i21 = iH5 << 5;
                int i22 = iH5 >>> 27;
                int i23 = i7 + 4;
                iH2 = i17 + ((i21 + i22) - (i21 & i22)) + h(iH4, i6, i20) + this.X[i7 + 3] + Y2;
                i5 = (iH4 >>> 2) | (iH4 << 30);
                i7 += 5;
                iH = i20 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH5, i5, i6) + this.X[i23] + Y2;
                i4 = (-1) - (((-1) - (iH5 >>> 2)) & ((-1) - (iH5 << 30)));
            }
            for (int i24 = 0; i24 < 4; i24++) {
                int i25 = iH << 5;
                int i26 = iH >>> 27;
                int iG = i6 + ((i25 + i26) - (i25 & i26)) + g(iH2, i4, i5) + this.X[i7] + Y3;
                int i27 = (iH2 >>> 2) | (iH2 << 30);
                int iG2 = i5 + ((-1) - (((-1) - (iG << 5)) & ((-1) - (iG >>> 27)))) + g(iH, i27, i4) + this.X[i7 + 1] + Y3;
                int i28 = (-1) - (((-1) - (iH >>> 2)) & ((-1) - (iH << 30)));
                int i29 = iG2 << 5;
                int i30 = iG2 >>> 27;
                int iG3 = i4 + ((i29 + i30) - (i29 & i30)) + g(iG, i28, i27) + this.X[i7 + 2] + Y3;
                int i31 = iG << 30;
                int i32 = iG >>> 2;
                i6 = (i32 + i31) - (i32 & i31);
                int i33 = i7 + 4;
                iH2 = i27 + ((iG3 << 5) | (iG3 >>> 27)) + g(iG2, i6, i28) + this.X[i7 + 3] + Y3;
                i5 = (iG2 >>> 2) | (iG2 << 30);
                i7 += 5;
                iH = i28 + ((iH2 << 5) | (iH2 >>> 27)) + g(iG3, i5, i6) + this.X[i33] + Y3;
                int i34 = iG3 << 30;
                int i35 = iG3 >>> 2;
                i4 = (i35 + i34) - (i35 & i34);
            }
            for (int i36 = 0; i36 <= 3; i36++) {
                int i37 = iH << 5;
                int i38 = iH >>> 27;
                int iH6 = i6 + ((i37 + i38) - (i37 & i38)) + h(iH2, i4, i5) + this.X[i7] + Y4;
                int i39 = (iH2 >>> 2) | (iH2 << 30);
                int iH7 = i5 + ((iH6 << 5) | (iH6 >>> 27)) + h(iH, i39, i4) + this.X[i7 + 1] + Y4;
                int i40 = iH << 30;
                int i41 = iH >>> 2;
                int i42 = (i41 + i40) - (i41 & i40);
                int iH8 = i4 + ((-1) - (((-1) - (iH7 << 5)) & ((-1) - (iH7 >>> 27)))) + h(iH6, i42, i39) + this.X[i7 + 2] + Y4;
                i6 = (-1) - (((-1) - (iH6 >>> 2)) & ((-1) - (iH6 << 30)));
                int i43 = iH8 << 5;
                int i44 = iH8 >>> 27;
                int i45 = i7 + 4;
                iH2 = i39 + ((i43 + i44) - (i43 & i44)) + h(iH7, i6, i42) + this.X[i7 + 3] + Y4;
                i5 = (-1) - (((-1) - (iH7 >>> 2)) & ((-1) - (iH7 << 30)));
                i7 += 5;
                iH = i42 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH8, i5, i6) + this.X[i45] + Y4;
                int i46 = iH8 << 30;
                int i47 = iH8 >>> 2;
                i4 = (i47 + i46) - (i47 & i46);
            }
            this.H1 += iH;
            this.H2 += iH2;
            this.H3 += i4;
            this.H4 += i5;
            this.H5 += i6;
            this.xOff = 0;
            for (int i48 = 0; i48 < 16; i48++) {
                this.X[i48] = 0;
            }
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processLength(long j2) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j2 >>> 32);
            iArr[15] = (int) j2;
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processWord(byte[] bArr, int i2) {
            int i3 = ((-1) - (((-1) - (bArr[i2] << Ascii.CAN)) & ((-1) - ((bArr[i2 + 1] & 255) << 16)))) | ((bArr[i2 + 2] & 255) << 8);
            int i4 = bArr[i2 + 3] & 255;
            int i5 = (i4 + i3) - (i4 & i3);
            int[] iArr = this.X;
            int i6 = this.xOff;
            iArr[i6] = i5;
            int i7 = i6 + 1;
            this.xOff = i7;
            if (i7 == 16) {
                processBlock();
            }
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
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
    }

    MSOutlookKeyIdCalculator() {
    }

    static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded("DER");
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
