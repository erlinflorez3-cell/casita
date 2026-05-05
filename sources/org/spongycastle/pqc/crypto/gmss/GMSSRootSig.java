package org.spongycastle.pqc.crypto.gmss;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.encoders.Hex;

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
    private int f28107k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f28108r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28109w;

    public GMSSRootSig(Digest digest, int i2, int i3) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.f28109w = i2;
        this.height = i3;
        this.f28107k = (1 << i2) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i2));
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.f28108r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f28109w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i2 = this.f28109w;
        this.f28107k = (1 << i2) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i2));
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        long j2 = ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((((long) (bArr2[1] & 255)) << 8) | ((long) ((-1) - (((-1) - bArr2[0]) | ((-1) - 255)))))) & ((-1) - (((long) ((-1) - (((-1) - bArr2[2]) | ((-1) - 255)))) << 16))))) & ((-1) - (((long) ((-1) - (((-1) - bArr2[3]) | ((-1) - 255)))) << 24))))) & ((-1) - (((long) ((-1) - (((-1) - bArr2[4]) | ((-1) - 255)))) << 32)))) | (((long) (bArr2[5] & 255)) << 40);
        byte b2 = bArr2[6];
        long j3 = ((long) ((b2 + 255) - (b2 | 255))) << 48;
        long j4 = (j2 + j3) - (j2 & j3);
        byte b3 = bArr2[7];
        long j5 = ((long) ((b3 + 255) - (b3 | 255))) << 56;
        this.test8 = (j4 + j5) - (j4 & j5);
        long j6 = bArr2[8] & 255;
        long j7 = ((long) ((-1) - (((-1) - bArr2[9]) | ((-1) - 255)))) << 8;
        long j8 = ((j6 + j7) - (j6 & j7)) | (((long) (bArr2[10] & 255)) << 16);
        byte b4 = bArr2[11];
        long j9 = ((long) ((b4 + 255) - (b4 | 255))) << 24;
        long j10 = ((j8 + j9) - (j8 & j9)) | (((long) (bArr2[12] & 255)) << 32);
        long j11 = ((long) ((-1) - (((-1) - bArr2[13]) | ((-1) - 255)))) << 40;
        this.big8 = ((j10 + j11) - (j10 & j11)) | (((long) (bArr2[14] & 255)) << 48) | (((long) (bArr2[15] & 255)) << 56);
    }

    private void oneStep() {
        int i2 = this.f28109w;
        if (8 % i2 == 0) {
            int i3 = this.test;
            if (i3 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i4 = this.ii;
                if (i4 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b2 = bArr[i4];
                    int i5 = this.f28107k;
                    this.test = (i5 + b2) - (i5 | b2);
                    bArr[i4] = (byte) (b2 >>> this.f28109w);
                } else {
                    int i6 = this.checksum;
                    this.test = this.f28107k & i6;
                    this.checksum = i6 >>> this.f28109w;
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
                int i7 = this.counter;
                int i8 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i7 * i8, i8);
                int i9 = this.counter + 1;
                this.counter = i9;
                if (i9 % (8 / this.f28109w) == 0) {
                    this.ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 >= 8) {
            if (i2 < 57) {
                long j2 = this.test8;
                if (j2 == 0) {
                    this.big8 = 0L;
                    this.ii = 0;
                    int i10 = this.f28108r;
                    int i11 = i10 % 8;
                    int i12 = i10 >>> 3;
                    int i13 = this.mdsize;
                    if (i12 < i13) {
                        if (i10 <= (i13 << 3) - i2) {
                            int i14 = i10 + i2;
                            this.f28108r = i14;
                            i13 = (i14 + 7) >>> 3;
                        } else {
                            this.f28108r = i10 + i2;
                        }
                        while (i12 < i13) {
                            long j3 = this.big8;
                            int i15 = (-1) - (((-1) - this.hash[i12]) | ((-1) - 255));
                            int i16 = this.ii;
                            this.big8 = j3 ^ ((long) (i15 << (i16 << 3)));
                            this.ii = i16 + 1;
                            i12++;
                        }
                        long j4 = this.big8 >>> i11;
                        this.big8 = j4;
                        this.test8 = j4 & ((long) this.f28107k);
                    } else {
                        int i17 = this.checksum;
                        this.test8 = (-1) - (((-1) - this.f28107k) | ((-1) - i17));
                        this.checksum = i17 >>> i2;
                    }
                    this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                } else if (j2 > 0) {
                    Digest digest2 = this.messDigestOTS;
                    byte[] bArr6 = this.privateKeyOTS;
                    digest2.update(bArr6, 0, bArr6.length);
                    byte[] bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.privateKeyOTS = bArr7;
                    this.messDigestOTS.doFinal(bArr7, 0);
                    this.test8--;
                }
                if (this.test8 == 0) {
                    byte[] bArr8 = this.privateKeyOTS;
                    byte[] bArr9 = this.sign;
                    int i18 = this.counter;
                    int i19 = this.mdsize;
                    System.arraycopy(bArr8, 0, bArr9, i18 * i19, i19);
                    this.counter++;
                    return;
                }
                return;
            }
            return;
        }
        int i20 = this.test;
        if (i20 == 0) {
            int i21 = this.counter;
            if (i21 % 8 == 0) {
                int i22 = this.ii;
                int i23 = this.mdsize;
                if (i22 < i23) {
                    this.big8 = 0L;
                    if (i21 < ((i23 / i2) << 3)) {
                        for (int i24 = 0; i24 < this.f28109w; i24++) {
                            long j5 = this.big8;
                            byte[] bArr10 = this.hash;
                            int i25 = this.ii;
                            byte b3 = bArr10[i25];
                            this.big8 = j5 ^ ((long) (((b3 + 255) - (b3 | 255)) << (i24 << 3)));
                            this.ii = i25 + 1;
                        }
                    } else {
                        for (int i26 = 0; i26 < this.mdsize % this.f28109w; i26++) {
                            long j6 = this.big8;
                            byte[] bArr11 = this.hash;
                            int i27 = this.ii;
                            byte b4 = bArr11[i27];
                            this.big8 = j6 ^ ((long) (((b4 + 255) - (b4 | 255)) << (i26 << 3)));
                            this.ii = i27 + 1;
                        }
                    }
                }
            }
            if (this.counter == this.messagesize) {
                this.big8 = this.checksum;
            }
            long j7 = this.big8;
            long j8 = this.f28107k;
            this.test = (int) ((j7 + j8) - (j7 | j8));
            this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
        } else if (i20 > 0) {
            Digest digest3 = this.messDigestOTS;
            byte[] bArr12 = this.privateKeyOTS;
            digest3.update(bArr12, 0, bArr12.length);
            byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
            this.privateKeyOTS = bArr13;
            this.messDigestOTS.doFinal(bArr13, 0);
            this.test--;
        }
        if (this.test == 0) {
            byte[] bArr14 = this.privateKeyOTS;
            byte[] bArr15 = this.sign;
            int i28 = this.counter;
            int i29 = this.mdsize;
            System.arraycopy(bArr14, 0, bArr15, i28 * i29, i29);
            this.big8 >>>= this.f28109w;
            this.counter++;
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
        return new int[]{this.counter, this.test, this.ii, this.f28108r, this.steps, this.keysize, this.height, this.f28109w, this.checksum};
    }

    public byte[] getStatLong() {
        long j2 = this.test8;
        long j3 = j2 >> 8;
        long j4 = j2 >> 24;
        byte b2 = (byte) ((j4 + 255) - (j4 | 255));
        long j5 = j2 >> 32;
        long j6 = this.big8;
        long j7 = j6 >> 16;
        byte b3 = (byte) ((j7 + 255) - (j7 | 255));
        long j8 = j6 >> 24;
        long j9 = j6 >> 48;
        return new byte[]{(byte) ((-1) - (((-1) - j2) | ((-1) - 255))), (byte) ((j3 + 255) - (j3 | 255)), (byte) ((j2 >> 16) & 255), b2, (byte) ((j5 + 255) - (j5 | 255)), (byte) ((j2 >> 40) & 255), (byte) ((-1) - (((-1) - (j2 >> 48)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (j2 >> 56)) | ((-1) - 255))), (byte) (j6 & 255), (byte) ((j6 >> 8) & 255), b3, (byte) ((j8 + 255) - (j8 | 255)), (byte) ((j6 >> 32) & 255), (byte) ((j6 >> 40) & 255), (byte) ((j9 + 255) - (j9 | 255)), (byte) (255 & (j6 >> 56))};
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
        int log = getLog((this.messagesize << this.f28109w) + 1);
        int i5 = this.f28109w;
        int i6 = 8;
        if (8 % i5 == 0) {
            int i7 = 8 / i5;
            i2 = 0;
            for (int i8 = 0; i8 < this.mdsize; i8++) {
                for (int i9 = 0; i9 < i7; i9++) {
                    byte b2 = bArr4[i8];
                    i2 += this.f28107k & b2;
                    bArr4[i8] = (byte) (b2 >>> this.f28109w);
                }
            }
            int i10 = (this.messagesize << this.f28109w) - i2;
            this.checksum = i10;
            int i11 = 0;
            while (i11 < log) {
                i2 += this.f28107k & i10;
                int i12 = this.f28109w;
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
                for (int i16 = 0; i16 < this.f28109w; i16++) {
                    byte b3 = bArr4[i15];
                    j2 ^= (long) (((b3 + 255) - (b3 | 255)) << (i16 << 3));
                    i15++;
                }
                int i17 = 0;
                while (i17 < i6) {
                    long j3 = this.f28107k;
                    i2 += (int) ((j3 + j2) - (j3 | j2));
                    j2 >>>= this.f28109w;
                    i17++;
                    i6 = 8;
                }
                i14++;
                i6 = 8;
            }
            int i18 = this.mdsize % this.f28109w;
            long j4 = 0;
            for (int i19 = 0; i19 < i18; i19++) {
                j4 ^= (long) (((-1) - (((-1) - bArr4[i15]) | ((-1) - 255))) << (i19 << 3));
                i15++;
            }
            int i20 = i18 << 3;
            int i21 = 0;
            while (i21 < i20) {
                i2 += (int) ((-1) - (((-1) - ((long) this.f28107k)) | ((-1) - j4)));
                int i22 = this.f28109w;
                j4 >>>= i22;
                i21 += i22;
            }
            int i23 = (this.messagesize << this.f28109w) - i2;
            this.checksum = i23;
            int i24 = 0;
            while (i24 < log) {
                i2 += (-1) - (((-1) - this.f28107k) | ((-1) - i23));
                int i25 = this.f28109w;
                i23 >>>= i25;
                i24 += i25;
            }
        } else if (i5 < 57) {
            int i26 = 0;
            i2 = 0;
            while (true) {
                i3 = this.mdsize;
                int i27 = this.f28109w;
                if (i26 > (i3 << 3) - i27) {
                    break;
                }
                int i28 = i26 % 8;
                i26 += i27;
                int i29 = (i26 + 7) >>> 3;
                int i30 = 0;
                long j5 = 0;
                for (int i31 = i26 >>> 3; i31 < i29; i31++) {
                    j5 ^= (long) (((-1) - (((-1) - bArr4[i31]) | ((-1) - 255))) << (i30 << 3));
                    i30++;
                }
                long j6 = j5 >>> i28;
                long j7 = this.f28107k;
                i2 = (int) (((long) i2) + ((j6 + j7) - (j6 | j7)));
            }
            int i32 = i26 >>> 3;
            if (i32 < i3) {
                int i33 = i26 % 8;
                int i34 = 0;
                long j8 = 0;
                while (i32 < this.mdsize) {
                    byte b4 = bArr4[i32];
                    j8 ^= (long) (((b4 + 255) - (b4 | 255)) << (i34 << 3));
                    i34++;
                    i32++;
                }
                long j9 = j8 >>> i33;
                long j10 = this.f28107k;
                i2 = (int) (((long) i2) + ((j9 + j10) - (j9 | j10)));
            }
            int i35 = (this.messagesize << this.f28109w) - i2;
            this.checksum = i35;
            int i36 = 0;
            while (i36 < log) {
                i2 += this.f28107k & i35;
                int i37 = this.f28109w;
                i35 >>>= i37;
                i36 += i37;
            }
        } else {
            i2 = 0;
        }
        int iCeil = this.messagesize + ((int) Math.ceil(((double) log) / ((double) this.f28109w)));
        this.keysize = iCeil;
        this.steps = (int) Math.ceil(((double) (iCeil + i2)) / ((double) (1 << this.height)));
        int i38 = this.keysize;
        int i39 = this.mdsize;
        this.sign = new byte[i38 * i39];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.f28108r = 0;
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
