package org.bouncycastle.cert.selector;

import com.google.common.base.Ascii;
import java.io.IOException;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes6.dex */
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
            byte b2 = -128;
            while (true) {
                update(b2);
                if (this.xBufOff == 0) {
                    processLength(j2);
                    processBlock();
                    return;
                }
                b2 = 0;
            }
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
            int i6 = (-1) - (((-1) - (~i2)) | ((-1) - i4));
            return (i6 + i5) - (i6 & i5);
        }

        private int g(int i2, int i3, int i4) {
            return (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - ((-1) - (((-1) - i3) & ((-1) - i4))))))) & ((-1) - (i3 & i4)));
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

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
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
                int i11 = iH << 5;
                int i12 = iH >>> 27;
                int iF = i8 + ((i11 + i12) - (i11 & i12)) + f(iH2, i6, i7) + this.X[i9] + Y1;
                int i13 = (iH2 >>> 2) | (iH2 << 30);
                int iF2 = i7 + ((iF << 5) | (iF >>> 27)) + f(iH, i13, i6) + this.X[i9 + 1] + Y1;
                int i14 = (-1) - (((-1) - (iH >>> 2)) & ((-1) - (iH << 30)));
                int i15 = iF2 << 5;
                int i16 = iF2 >>> 27;
                int iF3 = i6 + ((i15 + i16) - (i15 & i16)) + f(iF, i14, i13) + this.X[i9 + 2] + Y1;
                int i17 = iF << 30;
                int i18 = iF >>> 2;
                i8 = (i18 + i17) - (i18 & i17);
                int i19 = iF3 << 5;
                int i20 = iF3 >>> 27;
                int i21 = i9 + 4;
                iH2 = i13 + ((i19 + i20) - (i19 & i20)) + f(iF2, i8, i14) + this.X[i9 + 3] + Y1;
                int i22 = iF2 << 30;
                int i23 = iF2 >>> 2;
                i7 = (i23 + i22) - (i23 & i22);
                i9 += 5;
                iH = i14 + ((iH2 << 5) | (iH2 >>> 27)) + f(iF3, i7, i8) + this.X[i21] + Y1;
                i6 = (-1) - (((-1) - (iF3 >>> 2)) & ((-1) - (iF3 << 30)));
            }
            for (int i24 = 0; i24 < 4; i24++) {
                int i25 = iH << 5;
                int i26 = iH >>> 27;
                int iH3 = i8 + ((i25 + i26) - (i25 & i26)) + h(iH2, i6, i7) + this.X[i9] + Y2;
                int i27 = iH2 << 30;
                int i28 = iH2 >>> 2;
                int i29 = (i28 + i27) - (i28 & i27);
                int iH4 = i7 + ((-1) - (((-1) - (iH3 << 5)) & ((-1) - (iH3 >>> 27)))) + h(iH, i29, i6) + this.X[i9 + 1] + Y2;
                int i30 = iH << 30;
                int i31 = iH >>> 2;
                int i32 = (i31 + i30) - (i31 & i30);
                int iH5 = i6 + ((-1) - (((-1) - (iH4 << 5)) & ((-1) - (iH4 >>> 27)))) + h(iH3, i32, i29) + this.X[i9 + 2] + Y2;
                i8 = (-1) - (((-1) - (iH3 >>> 2)) & ((-1) - (iH3 << 30)));
                int i33 = i9 + 4;
                iH2 = i29 + ((iH5 << 5) | (iH5 >>> 27)) + h(iH4, i8, i32) + this.X[i9 + 3] + Y2;
                i7 = (iH4 >>> 2) | (iH4 << 30);
                i9 += 5;
                iH = i32 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH5, i7, i8) + this.X[i33] + Y2;
                int i34 = iH5 << 30;
                int i35 = iH5 >>> 2;
                i6 = (i35 + i34) - (i35 & i34);
            }
            for (int i36 = 0; i36 < 4; i36++) {
                int iG = i8 + ((-1) - (((-1) - (iH << 5)) & ((-1) - (iH >>> 27)))) + g(iH2, i6, i7) + this.X[i9] + Y3;
                int i37 = (iH2 >>> 2) | (iH2 << 30);
                int iG2 = i7 + ((-1) - (((-1) - (iG << 5)) & ((-1) - (iG >>> 27)))) + g(iH, i37, i6) + this.X[i9 + 1] + Y3;
                int i38 = iH << 30;
                int i39 = iH >>> 2;
                int i40 = (i39 + i38) - (i39 & i38);
                int iG3 = i6 + ((iG2 << 5) | (iG2 >>> 27)) + g(iG, i40, i37) + this.X[i9 + 2] + Y3;
                i8 = (-1) - (((-1) - (iG >>> 2)) & ((-1) - (iG << 30)));
                int i41 = i9 + 4;
                iH2 = i37 + ((-1) - (((-1) - (iG3 << 5)) & ((-1) - (iG3 >>> 27)))) + g(iG2, i8, i40) + this.X[i9 + 3] + Y3;
                int i42 = iG2 << 30;
                int i43 = iG2 >>> 2;
                i7 = (i43 + i42) - (i43 & i42);
                i9 += 5;
                iH = i40 + ((iH2 << 5) | (iH2 >>> 27)) + g(iG3, i7, i8) + this.X[i41] + Y3;
                i6 = (-1) - (((-1) - (iG3 >>> 2)) & ((-1) - (iG3 << 30)));
            }
            for (int i44 = 0; i44 <= 3; i44++) {
                int i45 = iH << 5;
                int i46 = iH >>> 27;
                int iH6 = i8 + ((i45 + i46) - (i45 & i46)) + h(iH2, i6, i7) + this.X[i9] + Y4;
                int i47 = (-1) - (((-1) - (iH2 >>> 2)) & ((-1) - (iH2 << 30)));
                int iH7 = i7 + ((iH6 << 5) | (iH6 >>> 27)) + h(iH, i47, i6) + this.X[i9 + 1] + Y4;
                int i48 = iH << 30;
                int i49 = iH >>> 2;
                int i50 = (i49 + i48) - (i49 & i48);
                int iH8 = i6 + ((-1) - (((-1) - (iH7 << 5)) & ((-1) - (iH7 >>> 27)))) + h(iH6, i50, i47) + this.X[i9 + 2] + Y4;
                int i51 = iH6 << 30;
                int i52 = iH6 >>> 2;
                i8 = (i52 + i51) - (i52 & i51);
                int i53 = iH8 << 5;
                int i54 = iH8 >>> 27;
                int i55 = i9 + 4;
                iH2 = i47 + ((i53 + i54) - (i53 & i54)) + h(iH7, i8, i50) + this.X[i9 + 3] + Y4;
                i7 = (-1) - (((-1) - (iH7 >>> 2)) & ((-1) - (iH7 << 30)));
                i9 += 5;
                iH = i50 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH8, i7, i8) + this.X[i55] + Y4;
                int i56 = iH8 << 30;
                int i57 = iH8 >>> 2;
                i6 = (i57 + i56) - (i57 & i56);
            }
            this.H1 += iH;
            this.H2 += iH2;
            this.H3 += i6;
            this.H4 += i7;
            this.H5 += i8;
            this.xOff = 0;
            for (int i58 = 0; i58 < 16; i58++) {
                this.X[i58] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processLength(long j2) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j2 >>> 32);
            iArr[15] = (int) j2;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processWord(byte[] bArr, int i2) {
            int i3 = bArr[i2] << Ascii.CAN;
            int i4 = (bArr[i2 + 1] & 255) << 16;
            int i5 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) | ((-1) - (((-1) - ((i3 + i4) - (i3 & i4))) & ((-1) - ((bArr[i2 + 2] & 255) << 8))));
            int[] iArr = this.X;
            int i6 = this.xOff;
            iArr[i6] = i5;
            int i7 = i6 + 1;
            this.xOff = i7;
            if (i7 == 16) {
                processBlock();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
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
