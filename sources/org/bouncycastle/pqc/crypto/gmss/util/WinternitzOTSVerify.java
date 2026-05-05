package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class WinternitzOTSVerify {
    private Digest messDigestOTS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27743w;

    public WinternitzOTSVerify(Digest digest, int i2) {
        this.f27743w = i2;
        this.messDigestOTS = digest;
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int i2 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize2 = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i3 = digestSize << 3;
        int i4 = this.f27743w;
        int i5 = ((i4 - 1) + i3) / i4;
        int log = getLog((i5 << i4) + 1);
        int i6 = this.f27743w;
        int i7 = ((((log + i6) - 1) / i6) + i5) * digestSize;
        if (i7 != bArr2.length) {
            return null;
        }
        byte[] bArr5 = new byte[i7];
        int i8 = 8;
        if (8 % i6 == 0) {
            int i9 = 8 / i6;
            int i10 = (1 << i6) - 1;
            byte[] bArr6 = new byte[digestSize];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < digestSize2) {
                while (i2 < i9) {
                    int i14 = bArr4[i11] & i10;
                    i12 += i14;
                    int i15 = i13 * digestSize;
                    System.arraycopy(bArr2, i15, bArr6, 0, digestSize);
                    while (i14 < i10) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i14++;
                    }
                    System.arraycopy(bArr6, 0, bArr5, i15, digestSize);
                    bArr4[i11] = (byte) (bArr4[i11] >>> this.f27743w);
                    i13++;
                    i2++;
                }
                i11++;
                i2 = 0;
            }
            int i16 = (i5 << this.f27743w) - i12;
            int i17 = 0;
            while (i17 < log) {
                int i18 = i13 * digestSize;
                System.arraycopy(bArr2, i18, bArr6, 0, digestSize);
                for (int i19 = (i16 + i10) - (i16 | i10); i19 < i10; i19++) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                System.arraycopy(bArr6, 0, bArr5, i18, digestSize);
                int i20 = this.f27743w;
                i16 >>>= i20;
                i13++;
                i17 += i20;
            }
        } else if (i6 < 8) {
            int i21 = digestSize / i6;
            int i22 = (1 << i6) - 1;
            byte[] bArr7 = new byte[digestSize];
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i23 < i21) {
                long j2 = 0;
                for (int i27 = 0; i27 < this.f27743w; i27++) {
                    j2 ^= (long) ((bArr4[i24] & 255) << (i27 << 3));
                    i24++;
                }
                int i28 = 0;
                while (i28 < i8) {
                    int i29 = (int) (j2 & ((long) i22));
                    i25 += i29;
                    int i30 = i26 * digestSize;
                    System.arraycopy(bArr2, i30, bArr7, 0, digestSize);
                    while (i29 < i22) {
                        this.messDigestOTS.update(bArr7, 0, bArr7.length);
                        bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr7, 0);
                        i29++;
                    }
                    System.arraycopy(bArr7, 0, bArr5, i30, digestSize);
                    j2 >>>= this.f27743w;
                    i26++;
                    i28++;
                    i8 = 8;
                }
                i23++;
                i8 = 8;
            }
            int i31 = digestSize % this.f27743w;
            long j3 = 0;
            for (int i32 = 0; i32 < i31; i32++) {
                j3 ^= (long) ((bArr4[i24] & 255) << (i32 << 3));
                i24++;
            }
            int i33 = i31 << 3;
            int i34 = 0;
            while (i34 < i33) {
                int i35 = (int) ((-1) - (((-1) - j3) | ((-1) - ((long) i22))));
                i25 += i35;
                int i36 = i26 * digestSize;
                System.arraycopy(bArr2, i36, bArr7, 0, digestSize);
                while (i35 < i22) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    i35++;
                }
                System.arraycopy(bArr7, 0, bArr5, i36, digestSize);
                int i37 = this.f27743w;
                j3 >>>= i37;
                i26++;
                i34 += i37;
            }
            int i38 = (i5 << this.f27743w) - i25;
            int i39 = 0;
            while (i39 < log) {
                int i40 = i26 * digestSize;
                System.arraycopy(bArr2, i40, bArr7, 0, digestSize);
                for (int i41 = (i38 + i22) - (i38 | i22); i41 < i22; i41++) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr5, i40, digestSize);
                int i42 = this.f27743w;
                i38 >>>= i42;
                i26++;
                i39 += i42;
            }
        } else if (i6 < 57) {
            int i43 = i3 - i6;
            int i44 = (1 << i6) - 1;
            byte[] bArr8 = new byte[digestSize];
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            while (i46 <= i43) {
                int i48 = i46 % 8;
                i46 += this.f27743w;
                int i49 = (i46 + 7) >>> 3;
                int i50 = 0;
                long j4 = 0;
                for (int i51 = i46 >>> 3; i51 < i49; i51++) {
                    byte b2 = bArr4[i51];
                    j4 ^= (long) (((b2 + 255) - (b2 | 255)) << (i50 << 3));
                    i50++;
                }
                long j5 = i44;
                long j6 = (j4 >>> i48) & j5;
                i47 = (int) (((long) i47) + j6);
                int i52 = i45 * digestSize;
                System.arraycopy(bArr2, i52, bArr8, 0, digestSize);
                while (j6 < j5) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                    j6++;
                }
                System.arraycopy(bArr8, 0, bArr5, i52, digestSize);
                i45++;
            }
            int i53 = i46 >>> 3;
            if (i53 < digestSize) {
                int i54 = i46 % 8;
                int i55 = 0;
                long j7 = 0;
                while (i53 < digestSize) {
                    j7 ^= (long) ((bArr4[i53] & 255) << (i55 << 3));
                    i55++;
                    i53++;
                }
                long j8 = i44;
                long j9 = (-1) - (((-1) - (j7 >>> i54)) | ((-1) - j8));
                i47 = (int) (((long) i47) + j9);
                int i56 = i45 * digestSize;
                System.arraycopy(bArr2, i56, bArr8, 0, digestSize);
                while (j9 < j8) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                    j9++;
                }
                System.arraycopy(bArr8, 0, bArr5, i56, digestSize);
                i45++;
            }
            int i57 = (i5 << this.f27743w) - i47;
            int i58 = 0;
            while (i58 < log) {
                int i59 = i45 * digestSize;
                System.arraycopy(bArr2, i59, bArr8, 0, digestSize);
                for (long j10 = (i57 + i44) - (i57 | i44); j10 < i44; j10++) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                }
                System.arraycopy(bArr8, 0, bArr5, i59, digestSize);
                int i60 = this.f27743w;
                i57 >>>= i60;
                i45++;
                i58 += i60;
            }
        }
        byte[] bArr9 = new byte[digestSize];
        this.messDigestOTS.update(bArr5, 0, i7);
        byte[] bArr10 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr10, 0);
        return bArr10;
    }

    public int getLog(int i2) {
        int i3 = 1;
        int i4 = 2;
        while (i4 < i2) {
            i4 <<= 1;
            i3++;
        }
        return i3;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i2 = this.f27743w;
        int i3 = ((digestSize << 3) + (i2 - 1)) / i2;
        int log = getLog((i3 << i2) + 1);
        return digestSize * (i3 + (((log + r1) - 1) / this.f27743w));
    }
}
