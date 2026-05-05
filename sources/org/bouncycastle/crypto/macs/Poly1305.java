package org.bouncycastle.crypto.macs;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes6.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f27556h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f27557h1;
    private int h2;
    private int h3;
    private int h4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f27558k0;
    private int k1;
    private int k2;
    private int k3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f27559r0;
    private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    private static final long mul32x32_64(int i2, int i3) {
        long j2 = i2;
        return ((j2 + 4294967295L) - (j2 | 4294967295L)) * ((long) i3);
    }

    private void processBlock() {
        int i2 = this.currentBlockOffset;
        if (i2 < 16) {
            this.currentBlock[i2] = 1;
            for (int i3 = i2 + 1; i3 < 16; i3++) {
                this.currentBlock[i3] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & 4294967295L;
        long jLittleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8);
        long j2 = (jLittleEndianToInt3 + 4294967295L) - (jLittleEndianToInt3 | 4294967295L);
        long jLittleEndianToInt4 = Pack.littleEndianToInt(this.currentBlock, 12);
        long j3 = (4294967295L + jLittleEndianToInt4) - (4294967295L | jLittleEndianToInt4);
        int i4 = (int) (((long) this.f27556h0) + ((jLittleEndianToInt + 67108863) - (jLittleEndianToInt | 67108863)));
        this.f27556h0 = i4;
        this.f27557h1 = (int) (((long) this.f27557h1) + ((-1) - (((-1) - (((-1) - (((-1) - (jLittleEndianToInt2 << 32)) & ((-1) - (jLittleEndianToInt & 4294967295L)))) >>> 26)) | ((-1) - 67108863))));
        this.h2 = (int) (((long) this.h2) + ((-1) - (((-1) - ((jLittleEndianToInt2 | (j2 << 32)) >>> 20)) | ((-1) - 67108863))));
        this.h3 = (int) (((long) this.h3) + ((((-1) - (((-1) - (j3 << 32)) & ((-1) - j2))) >>> 14) & 67108863));
        int i5 = (int) (((long) this.h4) + (j3 >>> 8));
        this.h4 = i5;
        if (this.currentBlockOffset == 16) {
            this.h4 = i5 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i4, this.f27559r0) + mul32x32_64(this.f27557h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.h4, this.s1);
        long jMul32x32_642 = mul32x32_64(this.f27556h0, this.r1) + mul32x32_64(this.f27557h1, this.f27559r0) + mul32x32_64(this.h2, this.s4) + mul32x32_64(this.h3, this.s3) + mul32x32_64(this.h4, this.s2);
        long jMul32x32_643 = mul32x32_64(this.f27556h0, this.r2) + mul32x32_64(this.f27557h1, this.r1) + mul32x32_64(this.h2, this.f27559r0) + mul32x32_64(this.h3, this.s4) + mul32x32_64(this.h4, this.s3);
        long jMul32x32_644 = mul32x32_64(this.f27556h0, this.r3) + mul32x32_64(this.f27557h1, this.r2) + mul32x32_64(this.h2, this.r1) + mul32x32_64(this.h3, this.f27559r0) + mul32x32_64(this.h4, this.s4);
        long jMul32x32_645 = mul32x32_64(this.f27556h0, this.r4) + mul32x32_64(this.f27557h1, this.r3) + mul32x32_64(this.h2, this.r2) + mul32x32_64(this.h3, this.r1) + mul32x32_64(this.h4, this.f27559r0);
        long j4 = jMul32x32_642 + (jMul32x32_64 >>> 26);
        long j5 = jMul32x32_643 + (j4 >>> 26);
        this.h2 = ((int) j5) & 67108863;
        long j6 = jMul32x32_644 + (j5 >>> 26);
        int i6 = (int) j6;
        this.h3 = (i6 + 67108863) - (i6 | 67108863);
        long j7 = jMul32x32_645 + (j6 >>> 26);
        this.h4 = ((int) j7) & 67108863;
        int i7 = ((-1) - (((-1) - ((int) jMul32x32_64)) | ((-1) - 67108863))) + (((int) (j7 >>> 26)) * 5);
        this.f27557h1 = ((-1) - (((-1) - ((int) j4)) | ((-1) - 67108863))) + (i7 >>> 26);
        this.f27556h0 = (-1) - (((-1) - i7) | ((-1) - 67108863));
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i2 = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f27559r0 = (67108863 + iLittleEndianToInt) - (67108863 | iLittleEndianToInt);
        int i3 = iLittleEndianToInt >>> 26;
        int i4 = iLittleEndianToInt2 << 6;
        int i5 = (-1) - (((-1) - ((i3 + i4) - (i3 & i4))) | ((-1) - 67108611));
        this.r1 = i5;
        int i6 = (-1) - (((-1) - ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12))) | ((-1) - 67092735));
        this.r2 = i6;
        int i7 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.r3 = i7;
        int i8 = iLittleEndianToInt4 >>> 8;
        int i9 = (i8 + 1048575) - (i8 | 1048575);
        this.r4 = i9;
        this.s1 = i5 * 5;
        this.s2 = i6 * 5;
        this.s3 = i7 * 5;
        this.s4 = i9 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i2 = 0;
            bArr = bArr3;
        }
        this.f27558k0 = Pack.littleEndianToInt(bArr, i2);
        this.k1 = Pack.littleEndianToInt(bArr, i2 + 4);
        this.k2 = Pack.littleEndianToInt(bArr, i2 + 8);
        this.k3 = Pack.littleEndianToInt(bArr, i2 + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        if (i2 + 16 > bArr.length) {
            throw new DataLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i3 = this.f27557h1;
        int i4 = this.f27556h0;
        int i5 = i3 + (i4 >>> 26);
        int i6 = (-1) - (((-1) - i4) | ((-1) - 67108863));
        int i7 = this.h2 + (i5 >>> 26);
        int i8 = (i5 + 67108863) - (i5 | 67108863);
        int i9 = this.h3 + (i7 >>> 26);
        int i10 = (-1) - (((-1) - i7) | ((-1) - 67108863));
        int i11 = this.h4 + (i9 >>> 26);
        int i12 = (-1) - (((-1) - i9) | ((-1) - 67108863));
        int i13 = i6 + ((i11 >>> 26) * 5);
        int i14 = (i11 + 67108863) - (i11 | 67108863);
        int i15 = i8 + (i13 >>> 26);
        int i16 = i13 & 67108863;
        int i17 = i16 + 5;
        int i18 = (i17 >>> 26) + i15;
        int i19 = (-1) - (((-1) - i18) | ((-1) - 67108863));
        int i20 = (i18 >>> 26) + i10;
        int i21 = (i20 + 67108863) - (i20 | 67108863);
        int i22 = (i20 >>> 26) + i12;
        int i23 = ((i22 >>> 26) + i14) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        int i24 = (i23 >>> 31) - 1;
        int i25 = ~i24;
        int i26 = (-1) - (((-1) - ((-1) - (((-1) - i16) | ((-1) - i25)))) & ((-1) - ((-1) - (((-1) - ((i17 + 67108863) - (i17 | 67108863))) | ((-1) - i24)))));
        this.f27556h0 = i26;
        int i27 = ((-1) - (((-1) - i15) | ((-1) - i25))) | ((-1) - (((-1) - i19) | ((-1) - i24)));
        this.f27557h1 = i27;
        int i28 = (-1) - (((-1) - (i10 & i25)) & ((-1) - (i21 & i24)));
        this.h2 = i28;
        int i29 = i12 & i25;
        int i30 = ((-1) - (((-1) - 67108863) | ((-1) - i22))) & i24;
        int i31 = (i30 + i29) - (i30 & i29);
        this.h3 = i31;
        int i32 = (i14 + i25) - (i14 | i25);
        int i33 = i23 & i24;
        int i34 = (i32 + i33) - (i32 & i33);
        this.h4 = i34;
        long j2 = this.f27558k0;
        long j3 = (((long) (i26 | (i27 << 26))) & 4294967295L) + ((j2 + 4294967295L) - (j2 | 4294967295L));
        long j4 = (-1) - (((-1) - (i27 >>> 6)) & ((-1) - (i28 << 20)));
        long j5 = ((j4 + 4294967295L) - (j4 | 4294967295L)) + ((-1) - (((-1) - ((long) this.k1)) | ((-1) - 4294967295L)));
        int i35 = i28 >>> 12;
        int i36 = i31 << 14;
        long j6 = (i35 + i36) - (i35 & i36);
        long j7 = ((j6 + 4294967295L) - (j6 | 4294967295L)) + ((-1) - (((-1) - ((long) this.k2)) | ((-1) - 4294967295L)));
        long j8 = this.k3;
        Pack.intToLittleEndian((int) j3, bArr, i2);
        long j9 = j5 + (j3 >>> 32);
        Pack.intToLittleEndian((int) j9, bArr, i2 + 4);
        long j10 = j7 + (j9 >>> 32);
        Pack.intToLittleEndian((int) j10, bArr, i2 + 8);
        Pack.intToLittleEndian((int) (((-1) - (((-1) - ((long) ((i31 >>> 18) | (i34 << 8)))) | ((-1) - 4294967295L))) + ((4294967295L + j8) - (4294967295L | j8)) + (j10 >>> 32)), bArr, i2 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher == null ? "Poly1305" : "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        if (this.cipher == null) {
            iv = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.h4 = 0;
        this.h3 = 0;
        this.h2 = 0;
        this.f27557h1 = 0;
        this.f27556h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b2;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i2, int i3) throws IllegalStateException, DataLengthException {
        int i4 = 0;
        while (i3 > i4) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i3 - i4, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i4 + i2, this.currentBlock, this.currentBlockOffset, iMin);
            i4 += iMin;
            this.currentBlockOffset += iMin;
        }
    }
}
