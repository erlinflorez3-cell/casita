package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;
    static final long[] K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long[] W;
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    protected LongDigest() {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.xBufOff = 0;
        reset();
    }

    protected LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        copyIn(longDigest);
    }

    private long Ch(long j2, long j3, long j4) {
        return ((-1) - (((-1) - (~j2)) | ((-1) - j4))) ^ ((-1) - (((-1) - j3) | ((-1) - j2)));
    }

    private long Maj(long j2, long j3, long j4) {
        return (((j2 + j4) - (j2 | j4)) ^ ((j2 + j3) - (j2 | j3))) ^ ((-1) - (((-1) - j3) | ((-1) - j4)));
    }

    private long Sigma0(long j2) {
        long j3 = j2 << 56;
        long j4 = j2 >>> 8;
        return (j2 >>> 7) ^ (((j2 << 63) | (j2 >>> 1)) ^ ((j3 + j4) - (j3 & j4)));
    }

    private long Sigma1(long j2) {
        long j3 = j2 << 45;
        long j4 = j2 >>> 19;
        return (j2 >>> 6) ^ (((j3 + j4) - (j3 & j4)) ^ ((-1) - (((-1) - (j2 << 3)) & ((-1) - (j2 >>> 61)))));
    }

    private long Sum0(long j2) {
        long j3 = j2 << 30;
        long j4 = j2 >>> 34;
        long j5 = ((j2 << 36) | (j2 >>> 28)) ^ ((j3 + j4) - (j3 & j4));
        long j6 = j2 << 25;
        long j7 = j2 >>> 39;
        return ((j7 + j6) - (j7 & j6)) ^ j5;
    }

    private long Sum1(long j2) {
        long j3 = j2 << 50;
        long j4 = j2 >>> 14;
        long j5 = (j3 + j4) - (j3 & j4);
        long j6 = j2 << 46;
        long j7 = j2 >>> 18;
        return ((j2 >>> 41) | (j2 << 23)) ^ (j5 ^ ((j6 + j7) - (j6 & j7)));
    }

    private void adjustByteCounts() {
        long j2 = this.byteCount1;
        if (j2 > 2305843009213693951L) {
            this.byteCount2 += j2 >>> 61;
            this.byteCount1 = j2 & 2305843009213693951L;
        }
    }

    protected void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = longDigest.W;
        System.arraycopy(jArr, 0, this.W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public void finish() {
        adjustByteCounts();
        long j2 = this.byteCount1 << 3;
        long j3 = this.byteCount2;
        byte b2 = -128;
        while (true) {
            update(b2);
            if (this.xBufOff == 0) {
                processLength(j2, j3);
                processBlock();
                return;
            }
            b2 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    protected int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.H3, bArr, 44);
        Pack.longToBigEndian(this.H4, bArr, 52);
        Pack.longToBigEndian(this.H5, bArr, 60);
        Pack.longToBigEndian(this.H6, bArr, 68);
        Pack.longToBigEndian(this.H7, bArr, 76);
        Pack.longToBigEndian(this.H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i2 = 0; i2 < this.wOff; i2++) {
            Pack.longToBigEndian(this.W[i2], bArr, (i2 * 8) + 96);
        }
    }

    protected void processBlock() {
        LongDigest longDigest = this;
        adjustByteCounts();
        for (int i2 = 16; i2 <= 79; i2++) {
            long[] jArr = longDigest.W;
            long jSigma1 = longDigest.Sigma1(jArr[i2 - 2]);
            long[] jArr2 = longDigest.W;
            jArr[i2] = jSigma1 + jArr2[i2 - 7] + longDigest.Sigma0(jArr2[i2 - 15]) + longDigest.W[i2 - 16];
        }
        long jSum0 = longDigest.H1;
        long j2 = longDigest.H2;
        long j3 = longDigest.H3;
        long j4 = longDigest.H4;
        long j5 = longDigest.H5;
        long j6 = longDigest.H6;
        long j7 = longDigest.H7;
        long j8 = longDigest.H8;
        int i3 = 0;
        int i4 = 0;
        while (i4 < 10) {
            long j9 = j5;
            long jSum1 = longDigest.Sum1(j5) + Ch(j5, j6, j7);
            long[] jArr3 = K;
            int i5 = i3 + 1;
            long j10 = j8 + jSum1 + jArr3[i3] + longDigest.W[i3];
            long j11 = j4 + j10;
            LongDigest longDigest2 = longDigest;
            long jSum02 = j10 + longDigest2.Sum0(jSum0) + Maj(jSum0, j2, j3);
            long jSum12 = longDigest2.Sum1(j11) + Ch(j11, j9, j6) + jArr3[i5];
            int i6 = i3 + 2;
            long j12 = j7 + jSum12 + longDigest2.W[i5];
            long j13 = j3 + j12;
            long jSum03 = j12 + longDigest2.Sum0(jSum02) + Maj(jSum02, jSum0, j2);
            int i7 = i3 + 3;
            long jSum13 = j6 + longDigest2.Sum1(j13) + Ch(j13, j11, j9) + jArr3[i6] + longDigest2.W[i6];
            long j14 = j2 + jSum13;
            long jSum04 = jSum13 + longDigest2.Sum0(jSum03) + Maj(jSum03, jSum02, jSum0);
            long jSum14 = longDigest2.Sum1(j14) + Ch(j14, j13, j11) + jArr3[i7];
            int i8 = i3 + 4;
            long j15 = j9 + jSum14 + longDigest2.W[i7];
            long j16 = jSum0 + j15;
            long jSum05 = j15 + longDigest2.Sum0(jSum04) + Maj(jSum04, jSum03, jSum02);
            int i9 = i3 + 5;
            long jSum15 = j11 + longDigest2.Sum1(j16) + Ch(j16, j14, j13) + jArr3[i8] + longDigest2.W[i8];
            long j17 = jSum02 + jSum15;
            long jSum06 = jSum15 + longDigest2.Sum0(jSum05) + Maj(jSum05, jSum04, jSum03);
            j8 = j17;
            int i10 = i3 + 6;
            long jSum16 = j13 + longDigest2.Sum1(j17) + Ch(j17, j16, j14) + jArr3[i9] + longDigest2.W[i9];
            j7 = jSum03 + jSum16;
            long jSum07 = jSum16 + longDigest2.Sum0(jSum06) + Maj(jSum06, jSum05, jSum04);
            int i11 = i3 + 7;
            long jSum17 = j14 + longDigest2.Sum1(j7) + Ch(j7, j8, j16) + jArr3[i10] + longDigest2.W[i10];
            long j18 = jSum04 + jSum17;
            j4 = jSum06;
            long jSum08 = jSum17 + longDigest2.Sum0(jSum07) + Maj(jSum07, jSum06, jSum05);
            longDigest = longDigest2;
            j6 = j18;
            j2 = jSum08;
            i3 += 8;
            long jSum18 = j16 + longDigest.Sum1(j18) + Ch(j18, j7, j8) + jArr3[i11] + longDigest.W[i11];
            i4++;
            j5 = jSum05 + jSum18;
            j3 = jSum07;
            jSum0 = jSum18 + longDigest.Sum0(j2) + Maj(j2, jSum07, j4);
        }
        longDigest.H1 += jSum0;
        longDigest.H2 += j2;
        longDigest.H3 += j3;
        longDigest.H4 += j4;
        longDigest.H5 += j5;
        longDigest.H6 += j6;
        longDigest.H7 += j7;
        longDigest.H8 += j8;
        longDigest.wOff = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            longDigest.W[i12] = 0;
        }
    }

    protected void processLength(long j2, long j3) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.W;
        jArr[14] = j3;
        jArr[15] = j2;
    }

    protected void processWord(byte[] bArr, int i2) {
        this.W[this.wOff] = Pack.bigEndianToLong(bArr, i2);
        int i3 = this.wOff + 1;
        this.wOff = i3;
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i2 = 0;
        this.xBufOff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = 0;
            i3++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.W;
            if (i2 == jArr.length) {
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    protected void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, iBigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.H3 = Pack.bigEndianToLong(bArr, 44);
        this.H4 = Pack.bigEndianToLong(bArr, 52);
        this.H5 = Pack.bigEndianToLong(bArr, 60);
        this.H6 = Pack.bigEndianToLong(bArr, 68);
        this.H7 = Pack.bigEndianToLong(bArr, 76);
        this.H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i2 = 0; i2 < this.wOff; i2++) {
            this.W[i2] = Pack.bigEndianToLong(bArr, (i2 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
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
        this.byteCount1++;
    }

    @Override // org.bouncycastle.crypto.Digest
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
            this.byteCount1 += (long) bArr2.length;
        }
        while (i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
