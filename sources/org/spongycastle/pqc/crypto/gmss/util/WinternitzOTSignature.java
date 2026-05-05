package org.spongycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28111w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i2) {
        this.f28111w = i2;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d2 = i2;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
        this.messagesize = iCeil;
        int log = getLog((iCeil << i2) + 1);
        this.checksumsize = log;
        int iCeil2 = this.messagesize + ((int) Math.ceil(((double) log) / d2));
        this.keysize = iCeil2;
        this.privateKeyOTS = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iCeil2, this.mdsize);
        int i3 = this.mdsize;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        for (int i4 = 0; i4 < this.keysize; i4++) {
            this.privateKeyOTS[i4] = this.gmssRandom.nextSeed(bArr2);
        }
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

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i2 = this.keysize;
        int i3 = this.mdsize;
        int i4 = i2 * i3;
        byte[] bArr = new byte[i4];
        byte[] bArr2 = new byte[i3];
        int i5 = 1 << this.f28111w;
        for (int i6 = 0; i6 < this.keysize; i6++) {
            Digest digest = this.messDigestOTS;
            byte[] bArr3 = this.privateKeyOTS[i6];
            digest.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
            this.messDigestOTS.doFinal(bArr4, 0);
            for (int i7 = 2; i7 < i5; i7++) {
                this.messDigestOTS.update(bArr4, 0, bArr4.length);
                bArr4 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr4, 0);
            }
            int i8 = this.mdsize;
            System.arraycopy(bArr4, 0, bArr, i8 * i6, i8);
        }
        this.messDigestOTS.update(bArr, 0, i4);
        byte[] bArr5 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr5, 0);
        return bArr5;
    }

    public byte[] getSignature(byte[] bArr) {
        int i2;
        int i3 = this.keysize;
        int i4 = this.mdsize;
        byte[] bArr2 = new byte[i3 * i4];
        byte[] bArr3 = new byte[i4];
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i5 = this.f28111w;
        int i6 = 8;
        if (8 % i5 == 0) {
            int i7 = 8 / i5;
            int i8 = (1 << i5) - 1;
            byte[] bArr5 = new byte[this.mdsize];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < digestSize; i11++) {
                for (int i12 = 0; i12 < i7; i12++) {
                    int i13 = bArr4[i11] & i8;
                    i9 += i13;
                    System.arraycopy(this.privateKeyOTS[i10], 0, bArr5, 0, this.mdsize);
                    while (i13 > 0) {
                        this.messDigestOTS.update(bArr5, 0, bArr5.length);
                        bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr5, 0);
                        i13--;
                    }
                    int i14 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr2, i10 * i14, i14);
                    bArr4[i11] = (byte) (bArr4[i11] >>> this.f28111w);
                    i10++;
                }
            }
            int i15 = (this.messagesize << this.f28111w) - i9;
            int i16 = 0;
            while (i16 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i10], 0, bArr5, 0, this.mdsize);
                for (int i17 = (i15 + i8) - (i15 | i8); i17 > 0; i17--) {
                    this.messDigestOTS.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i18 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr2, i10 * i18, i18);
                int i19 = this.f28111w;
                i15 >>>= i19;
                i10++;
                i16 += i19;
            }
        } else if (i5 < 8) {
            int i20 = this.mdsize;
            int i21 = i20 / i5;
            int i22 = (1 << i5) - 1;
            byte[] bArr6 = new byte[i20];
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i23 < i21) {
                long j2 = 0;
                for (int i27 = 0; i27 < this.f28111w; i27++) {
                    byte b2 = bArr4[i24];
                    j2 ^= (long) (((b2 + 255) - (b2 | 255)) << (i27 << 3));
                    i24++;
                }
                int i28 = 0;
                while (i28 < i6) {
                    long j3 = i22;
                    int i29 = (int) ((j2 + j3) - (j2 | j3));
                    i26 += i29;
                    System.arraycopy(this.privateKeyOTS[i25], 0, bArr6, 0, this.mdsize);
                    while (i29 > 0) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i29--;
                    }
                    int i30 = this.mdsize;
                    System.arraycopy(bArr6, 0, bArr2, i25 * i30, i30);
                    j2 >>>= this.f28111w;
                    i25++;
                    i28++;
                    i6 = 8;
                }
                i23++;
                i6 = 8;
            }
            int i31 = this.mdsize % this.f28111w;
            long j4 = 0;
            for (int i32 = 0; i32 < i31; i32++) {
                byte b3 = bArr4[i24];
                j4 ^= (long) (((b3 + 255) - (b3 | 255)) << (i32 << 3));
                i24++;
            }
            int i33 = i31 << 3;
            int i34 = 0;
            while (i34 < i33) {
                long j5 = i22;
                int i35 = (int) ((j5 + j4) - (j5 | j4));
                i26 += i35;
                System.arraycopy(this.privateKeyOTS[i25], 0, bArr6, 0, this.mdsize);
                while (i35 > 0) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                    i35--;
                }
                int i36 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i25 * i36, i36);
                int i37 = this.f28111w;
                j4 >>>= i37;
                i25++;
                i34 += i37;
            }
            int i38 = (this.messagesize << this.f28111w) - i26;
            int i39 = 0;
            while (i39 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i25], 0, bArr6, 0, this.mdsize);
                for (int i40 = i38 & i22; i40 > 0; i40--) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                int i41 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i25 * i41, i41);
                int i42 = this.f28111w;
                i38 >>>= i42;
                i25++;
                i39 += i42;
            }
        } else if (i5 < 57) {
            int i43 = this.mdsize;
            int i44 = (i43 << 3) - i5;
            int i45 = (1 << i5) - 1;
            byte[] bArr7 = new byte[i43];
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            while (i47 <= i44) {
                int i49 = i47 % 8;
                i47 += this.f28111w;
                int i50 = (i47 + 7) >>> 3;
                int i51 = 0;
                long j6 = 0;
                for (int i52 = i47 >>> 3; i52 < i50; i52++) {
                    byte b4 = bArr4[i52];
                    j6 ^= (long) (((b4 + 255) - (b4 | 255)) << (i51 << 3));
                    i51++;
                }
                long j7 = (j6 >>> i49) & ((long) i45);
                i46 = (int) (((long) i46) + j7);
                System.arraycopy(this.privateKeyOTS[i48], 0, bArr7, 0, this.mdsize);
                while (j7 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j7--;
                }
                int i53 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i48 * i53, i53);
                i48++;
            }
            int i54 = i47 >>> 3;
            if (i54 < this.mdsize) {
                int i55 = i47 % 8;
                int i56 = 0;
                long j8 = 0;
                while (true) {
                    i2 = this.mdsize;
                    if (i54 >= i2) {
                        break;
                    }
                    byte b5 = bArr4[i54];
                    j8 ^= (long) (((b5 + 255) - (b5 | 255)) << (i56 << 3));
                    i56++;
                    i54++;
                }
                long j9 = (-1) - (((-1) - (j8 >>> i55)) | ((-1) - ((long) i45)));
                i46 = (int) (((long) i46) + j9);
                System.arraycopy(this.privateKeyOTS[i48], 0, bArr7, 0, i2);
                while (j9 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j9--;
                }
                int i57 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i48 * i57, i57);
                i48++;
            }
            int i58 = (this.messagesize << this.f28111w) - i46;
            int i59 = 0;
            while (i59 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i48], 0, bArr7, 0, this.mdsize);
                for (long j10 = (i58 + i45) - (i58 | i45); j10 > 0; j10--) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                int i60 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i48 * i60, i60);
                int i61 = this.f28111w;
                i58 >>>= i61;
                i48++;
                i59 += i61;
            }
        }
        return bArr2;
    }
}
