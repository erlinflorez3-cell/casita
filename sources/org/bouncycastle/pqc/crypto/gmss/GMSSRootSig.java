package org.bouncycastle.pqc.crypto.gmss;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;
    private int ii;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27740k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27741r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27742w;

    public GMSSRootSig(Digest digest, int i2, int i3) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.f27742w = i2;
        this.height = i3;
        this.f27740k = (1 << i2) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i2));
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.f27741r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f27742w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i2 = this.f27742w;
        this.f27740k = (1 << i2) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i2));
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        byte b2 = bArr2[0];
        long j2 = (b2 + 255) - (b2 | 255);
        long j3 = ((long) (bArr2[1] & 255)) << 8;
        long j4 = (j3 + j2) - (j3 & j2);
        byte b3 = bArr2[2];
        long j5 = (-1) - (((-1) - ((-1) - (((-1) - j4) & ((-1) - (((long) ((b3 + 255) - (b3 | 255))) << 16))))) & ((-1) - (((long) (bArr2[3] & 255)) << 24)));
        long j6 = ((long) ((-1) - (((-1) - bArr2[4]) | ((-1) - 255)))) << 32;
        long j7 = (j5 + j6) - (j5 & j6);
        byte b4 = bArr2[5];
        long j8 = ((long) ((b4 + 255) - (b4 | 255))) << 40;
        long j9 = (j7 + j8) - (j7 & j8);
        long j10 = ((long) (bArr2[6] & 255)) << 48;
        this.test8 = ((j9 + j10) - (j9 & j10)) | (((long) (bArr2[7] & 255)) << 56);
        byte b5 = bArr2[8];
        long j11 = (b5 + 255) - (b5 | 255);
        byte b6 = bArr2[9];
        long j12 = ((long) ((b6 + 255) - (b6 | 255))) << 8;
        long j13 = ((j11 + j12) - (j11 & j12)) | (((long) ((-1) - (((-1) - bArr2[10]) | ((-1) - 255)))) << 16);
        byte b7 = bArr2[11];
        long j14 = (-1) - (((-1) - j13) & ((-1) - (((long) ((b7 + 255) - (b7 | 255))) << 24)));
        byte b8 = bArr2[12];
        long j15 = ((long) ((b8 + 255) - (b8 | 255))) << 32;
        this.big8 = ((-1) - (((-1) - ((j14 + j15) - (j14 & j15))) & ((-1) - (((long) (bArr2[13] & 255)) << 40)))) | (((long) ((-1) - (((-1) - bArr2[14]) | ((-1) - 255)))) << 48) | (((long) ((-1) - (((-1) - bArr2[15]) | ((-1) - 255)))) << 56);
    }

    private void oneStep() {
        long j2;
        int i2 = this.f27742w;
        if (8 % i2 == 0) {
            int i3 = this.test;
            if (i3 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i4 = this.ii;
                if (i4 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b2 = bArr[i4];
                    this.test = (-1) - (((-1) - this.f27740k) | ((-1) - b2));
                    bArr[i4] = (byte) (b2 >>> this.f27742w);
                } else {
                    int i5 = this.checksum;
                    this.test = this.f27740k & i5;
                    this.checksum = i5 >>> this.f27742w;
                }
            } else if (i3 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i6 = this.counter;
                int i7 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i6 * i7, i7);
                int i8 = this.counter + 1;
                this.counter = i8;
                if (i8 % (8 / this.f27742w) == 0) {
                    this.ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 < 8) {
            int i9 = this.test;
            if (i9 == 0) {
                int i10 = this.counter;
                if (i10 % 8 == 0) {
                    int i11 = this.ii;
                    int i12 = this.mdsize;
                    if (i11 < i12) {
                        this.big8 = 0L;
                        if (i10 < ((i12 / i2) << 3)) {
                            for (int i13 = 0; i13 < this.f27742w; i13++) {
                                long j3 = this.big8;
                                byte[] bArr6 = this.hash;
                                int i14 = this.ii;
                                this.big8 = j3 ^ ((long) ((bArr6[i14] & 255) << (i13 << 3)));
                                this.ii = i14 + 1;
                            }
                        } else {
                            for (int i15 = 0; i15 < this.mdsize % this.f27742w; i15++) {
                                long j4 = this.big8;
                                byte[] bArr7 = this.hash;
                                int i16 = this.ii;
                                byte b3 = bArr7[i16];
                                this.big8 = j4 ^ ((long) (((b3 + 255) - (b3 | 255)) << (i15 << 3)));
                                this.ii = i16 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & ((long) this.f27740k));
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i9 > 0) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr8 = this.privateKeyOTS;
                digest2.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr9;
                this.messDigestOTS.doFinal(bArr9, 0);
                this.test--;
            }
            if (this.test != 0) {
                return;
            }
            byte[] bArr10 = this.privateKeyOTS;
            byte[] bArr11 = this.sign;
            int i17 = this.counter;
            int i18 = this.mdsize;
            System.arraycopy(bArr10, 0, bArr11, i17 * i18, i18);
            this.big8 >>>= this.f27742w;
        } else {
            if (i2 >= 57) {
                return;
            }
            long j5 = this.test8;
            if (j5 == 0) {
                this.big8 = 0L;
                this.ii = 0;
                int i19 = this.f27741r;
                int i20 = i19 % 8;
                int i21 = i19 >>> 3;
                int i22 = this.mdsize;
                if (i21 < i22) {
                    if (i19 <= (i22 << 3) - i2) {
                        int i23 = i19 + i2;
                        this.f27741r = i23;
                        i22 = (i23 + 7) >>> 3;
                    } else {
                        this.f27741r = i19 + i2;
                    }
                    while (true) {
                        j2 = this.big8;
                        if (i21 >= i22) {
                            break;
                        }
                        byte b4 = this.hash[i21];
                        int i24 = (b4 + 255) - (b4 | 255);
                        int i25 = this.ii;
                        this.big8 = j2 ^ ((long) (i24 << (i25 << 3)));
                        this.ii = i25 + 1;
                        i21++;
                    }
                    long j6 = j2 >>> i20;
                    this.big8 = j6;
                    long j7 = this.f27740k;
                    this.test8 = (j6 + j7) - (j6 | j7);
                } else {
                    int i26 = this.checksum;
                    this.test8 = (-1) - (((-1) - this.f27740k) | ((-1) - i26));
                    this.checksum = i26 >>> i2;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (j5 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test8--;
            }
            if (this.test8 != 0) {
                return;
            }
            byte[] bArr14 = this.privateKeyOTS;
            byte[] bArr15 = this.sign;
            int i27 = this.counter;
            int i28 = this.mdsize;
            System.arraycopy(bArr14, 0, bArr15, i27 * i28, i28);
        }
        this.counter++;
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

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.ii, this.f27741r, this.steps, this.keysize, this.height, this.f27742w, this.checksum};
    }

    public byte[] getStatLong() {
        long j2 = this.test8;
        long j3 = j2 >> 8;
        byte b2 = (byte) ((j2 >> 16) & 255);
        byte b3 = (byte) ((j2 >> 24) & 255);
        byte b4 = (byte) ((j2 >> 32) & 255);
        byte b5 = (byte) ((j2 >> 40) & 255);
        byte b6 = (byte) ((j2 >> 48) & 255);
        long j4 = j2 >> 56;
        long j5 = this.big8;
        byte b7 = (byte) ((j5 + 255) - (j5 | 255));
        byte b8 = (byte) ((j5 >> 8) & 255);
        byte b9 = (byte) ((-1) - (((-1) - (j5 >> 16)) | ((-1) - 255)));
        byte b10 = (byte) ((j5 >> 24) & 255);
        byte b11 = (byte) ((j5 >> 32) & 255);
        long j6 = j5 >> 40;
        byte b12 = (byte) ((j6 + 255) - (j6 | 255));
        byte b13 = (byte) ((j5 >> 48) & 255);
        long j7 = j5 >> 56;
        return new byte[]{(byte) ((-1) - (((-1) - j2) | ((-1) - 255))), (byte) ((j3 + 255) - (j3 | 255)), b2, b3, b4, b5, b6, (byte) ((j4 + 255) - (j4 | 255)), b7, b8, b9, b10, b11, b12, b13, (byte) ((255 + j7) - (255 | j7))};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i2;
        int i3;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i4 = this.mdsize;
        byte[] bArr4 = new byte[i4];
        System.arraycopy(this.hash, 0, bArr4, 0, i4);
        int log = getLog((this.messagesize << this.f27742w) + 1);
        int i5 = this.f27742w;
        int i6 = 8;
        if (8 % i5 == 0) {
            int i7 = 8 / i5;
            i2 = 0;
            for (int i8 = 0; i8 < this.mdsize; i8++) {
                for (int i9 = 0; i9 < i7; i9++) {
                    byte b2 = bArr4[i8];
                    i2 += this.f27740k & b2;
                    bArr4[i8] = (byte) (b2 >>> this.f27742w);
                }
            }
            int i10 = (this.messagesize << this.f27742w) - i2;
            this.checksum = i10;
            int i11 = 0;
            while (i11 < log) {
                i2 += this.f27740k & i10;
                int i12 = this.f27742w;
                i10 >>>= i12;
                i11 += i12;
            }
        } else if (i5 < 8) {
            int i13 = this.mdsize / i5;
            int i14 = 0;
            int i15 = 0;
            i2 = 0;
            while (i14 < i13) {
                long j2 = 0;
                for (int i16 = 0; i16 < this.f27742w; i16++) {
                    byte b3 = bArr4[i15];
                    j2 ^= (long) (((b3 + 255) - (b3 | 255)) << (i16 << 3));
                    i15++;
                }
                int i17 = 0;
                while (i17 < i6) {
                    long j3 = this.f27740k;
                    i2 += (int) ((j3 + j2) - (j3 | j2));
                    j2 >>>= this.f27742w;
                    i17++;
                    i6 = 8;
                }
                i14++;
                i6 = 8;
            }
            int i18 = this.mdsize % this.f27742w;
            long j4 = 0;
            for (int i19 = 0; i19 < i18; i19++) {
                byte b4 = bArr4[i15];
                j4 ^= (long) (((b4 + 255) - (b4 | 255)) << (i19 << 3));
                i15++;
            }
            int i20 = i18 << 3;
            int i21 = 0;
            while (i21 < i20) {
                long j5 = this.f27740k;
                i2 += (int) ((j5 + j4) - (j5 | j4));
                int i22 = this.f27742w;
                j4 >>>= i22;
                i21 += i22;
            }
            int i23 = (this.messagesize << this.f27742w) - i2;
            this.checksum = i23;
            int i24 = 0;
            while (i24 < log) {
                i2 += this.f27740k & i23;
                int i25 = this.f27742w;
                i23 >>>= i25;
                i24 += i25;
            }
        } else if (i5 < 57) {
            int i26 = 0;
            i2 = 0;
            while (true) {
                i3 = this.mdsize;
                int i27 = this.f27742w;
                if (i26 > (i3 << 3) - i27) {
                    break;
                }
                int i28 = i26 % 8;
                i26 += i27;
                int i29 = (i26 + 7) >>> 3;
                int i30 = 0;
                long j6 = 0;
                for (int i31 = i26 >>> 3; i31 < i29; i31++) {
                    j6 ^= (long) ((bArr4[i31] & 255) << (i30 << 3));
                    i30++;
                }
                long j7 = j6 >>> i28;
                long j8 = this.f27740k;
                i2 = (int) (((long) i2) + ((j7 + j8) - (j7 | j8)));
            }
            int i32 = i26 >>> 3;
            if (i32 < i3) {
                int i33 = i26 % 8;
                int i34 = 0;
                long j9 = 0;
                while (i32 < this.mdsize) {
                    byte b5 = bArr4[i32];
                    j9 ^= (long) (((b5 + 255) - (b5 | 255)) << (i34 << 3));
                    i34++;
                    i32++;
                }
                long j10 = j9 >>> i33;
                long j11 = this.f27740k;
                i2 = (int) (((long) i2) + ((j10 + j11) - (j10 | j11)));
            }
            int i35 = (this.messagesize << this.f27742w) - i2;
            this.checksum = i35;
            int i36 = 0;
            while (i36 < log) {
                i2 += this.f27740k & i35;
                int i37 = this.f27742w;
                i35 >>>= i37;
                i36 += i37;
            }
        } else {
            i2 = 0;
        }
        int iCeil = this.messagesize + ((int) Math.ceil(((double) log) / ((double) this.f27742w)));
        this.keysize = iCeil;
        this.steps = (int) Math.ceil(((double) (iCeil + i2)) / ((double) (1 << this.height)));
        int i38 = this.keysize;
        int i39 = this.mdsize;
        this.sign = new byte[i38 * i39];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.f27741r = 0;
        this.privateKeyOTS = new byte[i39];
        byte[] bArr5 = new byte[i39];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i39);
    }

    public String toString() {
        String str = "" + this.big8 + "  ";
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i2 = 0; i2 < 9; i2++) {
            str = str + statInt[i2] + Global.BLANK;
        }
        for (int i3 = 0; i3 < 5; i3++) {
            str = str + new String(Hex.encode(statByte[i3])) + Global.BLANK;
        }
        return str;
    }

    public boolean updateSign() {
        for (int i2 = 0; i2 < this.steps; i2++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }
}
