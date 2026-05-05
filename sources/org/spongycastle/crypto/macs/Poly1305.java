package org.spongycastle.crypto.macs;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.generators.Poly1305KeyGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f27918h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f27919h1;
    private int h2;
    private int h3;
    private int h4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f27920k0;
    private int k1;
    private int k2;
    private int k3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f27921r0;
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
        return ((long) i2) * ((long) i3);
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
        int i4 = (int) (((long) this.f27918h0) + (jLittleEndianToInt & 67108863));
        this.f27918h0 = i4;
        this.f27919h1 = (int) (((long) this.f27919h1) + ((-1) - (((-1) - (((-1) - (((-1) - (jLittleEndianToInt2 << 32)) & ((-1) - ((jLittleEndianToInt + 4294967295L) - (jLittleEndianToInt | 4294967295L))))) >>> 26)) | ((-1) - 67108863))));
        this.h2 = (int) (((long) this.h2) + ((-1) - (((-1) - (((-1) - (((-1) - jLittleEndianToInt2) & ((-1) - (j2 << 32)))) >>> 20)) | ((-1) - 67108863))));
        this.h3 = (int) (((long) this.h3) + ((-1) - (((-1) - (((j3 << 32) | j2) >>> 14)) | ((-1) - 67108863))));
        int i5 = (int) (((long) this.h4) + (j3 >>> 8));
        this.h4 = i5;
        if (this.currentBlockOffset == 16) {
            this.h4 = i5 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i4, this.f27921r0) + mul32x32_64(this.f27919h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.h4, this.s1);
        long jMul32x32_642 = mul32x32_64(this.f27918h0, this.r1) + mul32x32_64(this.f27919h1, this.f27921r0) + mul32x32_64(this.h2, this.s4) + mul32x32_64(this.h3, this.s3) + mul32x32_64(this.h4, this.s2);
        long jMul32x32_643 = mul32x32_64(this.f27918h0, this.r2) + mul32x32_64(this.f27919h1, this.r1) + mul32x32_64(this.h2, this.f27921r0) + mul32x32_64(this.h3, this.s4) + mul32x32_64(this.h4, this.s3);
        long jMul32x32_644 = mul32x32_64(this.f27918h0, this.r3) + mul32x32_64(this.f27919h1, this.r2) + mul32x32_64(this.h2, this.r1) + mul32x32_64(this.h3, this.f27921r0) + mul32x32_64(this.h4, this.s4);
        long jMul32x32_645 = mul32x32_64(this.f27918h0, this.r4) + mul32x32_64(this.f27919h1, this.r3) + mul32x32_64(this.h2, this.r2) + mul32x32_64(this.h3, this.r1) + mul32x32_64(this.h4, this.f27921r0);
        long j4 = jMul32x32_642 + (jMul32x32_64 >>> 26);
        int i6 = (int) j4;
        this.f27919h1 = (i6 + 67108863) - (i6 | 67108863);
        long j5 = jMul32x32_643 + (j4 >>> 26);
        int i7 = (int) j5;
        this.h2 = (i7 + 67108863) - (i7 | 67108863);
        long j6 = jMul32x32_644 + (j5 >>> 26);
        int i8 = (int) j6;
        this.h3 = (i8 + 67108863) - (i8 | 67108863);
        long j7 = jMul32x32_645 + (j6 >>> 26);
        this.h4 = (-1) - (((-1) - ((int) j7)) | ((-1) - 67108863));
        this.f27918h0 = (int) (((long) (((int) jMul32x32_64) & 67108863)) + ((j7 >>> 26) * 5));
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        Poly1305KeyGenerator.checkKey(bArr);
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 16);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 20);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 24);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 28);
        this.f27921r0 = (67108863 + iLittleEndianToInt) - (67108863 | iLittleEndianToInt);
        int i2 = (-1) - (((-1) - ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6))) | ((-1) - 67108611));
        this.r1 = i2;
        int i3 = (-1) - (((-1) - ((-1) - (((-1) - (iLittleEndianToInt2 >>> 20)) & ((-1) - (iLittleEndianToInt3 << 12))))) | ((-1) - 67092735));
        this.r2 = i3;
        int i4 = iLittleEndianToInt3 >>> 14;
        int i5 = iLittleEndianToInt4 << 18;
        int i6 = ((i4 + i5) - (i4 & i5)) & 66076671;
        this.r3 = i6;
        int i7 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.r4 = i7;
        this.s1 = i2 * 5;
        this.s2 = i3 * 5;
        this.s3 = i6 * 5;
        this.s4 = i7 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 0, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            bArr = bArr3;
        }
        this.f27920k0 = Pack.littleEndianToInt(bArr, 0);
        this.k1 = Pack.littleEndianToInt(bArr, 4);
        this.k2 = Pack.littleEndianToInt(bArr, 8);
        this.k3 = Pack.littleEndianToInt(bArr, 12);
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        if (i2 + 16 > bArr.length) {
            throw new DataLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i3 = this.f27918h0;
        int i4 = (i3 + 67108863) - (i3 | 67108863);
        int i5 = this.f27919h1 + (i3 >>> 26);
        int i6 = i5 >>> 26;
        int i7 = i5 & 67108863;
        int i8 = this.h2 + i6;
        int i9 = (i8 + 67108863) - (i8 | 67108863);
        int i10 = this.h3 + (i8 >>> 26);
        int i11 = (-1) - (((-1) - i10) | ((-1) - 67108863));
        int i12 = this.h4 + (i10 >>> 26);
        int i13 = i12 >>> 26;
        int i14 = i12 & 67108863;
        int i15 = i4 + (i13 * 5);
        int i16 = i15 + 5;
        int i17 = (i16 + 67108863) - (i16 | 67108863);
        int i18 = (i16 >>> 26) + i7;
        int i19 = (-1) - (((-1) - i18) | ((-1) - 67108863));
        int i20 = (i18 >>> 26) + i9;
        int i21 = (i20 >>> 26) + i11;
        int i22 = (-1) - (((-1) - 67108863) | ((-1) - i21));
        int i23 = ((i21 >>> 26) + i14) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        int i24 = (i23 >>> 31) - 1;
        int i25 = ~i24;
        int i26 = ((-1) - (((-1) - i15) | ((-1) - i25))) | ((i17 + i24) - (i17 | i24));
        this.f27918h0 = i26;
        int i27 = (-1) - (((-1) - i7) | ((-1) - i25));
        int i28 = i19 & i24;
        int i29 = (i27 + i28) - (i27 & i28);
        this.f27919h1 = i29;
        int i30 = (-1) - (((-1) - (i9 & i25)) & ((-1) - (((-1) - (((-1) - i20) | ((-1) - 67108863))) & i24)));
        this.h2 = i30;
        int i31 = ((i22 + i24) - (i22 | i24)) | ((-1) - (((-1) - i11) | ((-1) - i25)));
        this.h3 = i31;
        int i32 = ((-1) - (((-1) - i14) | ((-1) - i25))) | ((i23 + i24) - (i23 | i24));
        this.h4 = i32;
        int i33 = i29 << 26;
        long j2 = (((long) ((i26 + i33) - (i26 & i33))) & 4294967295L) + ((-1) - (((-1) - ((long) this.f27920k0)) | ((-1) - 4294967295L)));
        long j3 = (i29 >>> 6) | (i30 << 20);
        long j4 = ((j3 + 4294967295L) - (j3 | 4294967295L)) + (((long) this.k1) & 4294967295L);
        int i34 = i30 >>> 12;
        int i35 = i31 << 14;
        long j5 = this.k2;
        long j6 = ((-1) - (((-1) - ((long) ((-1) - (((-1) - (i31 >>> 18)) & ((-1) - (i32 << 8)))))) | ((-1) - 4294967295L))) + ((-1) - (((-1) - 4294967295L) | ((-1) - ((long) this.k3))));
        Pack.intToLittleEndian((int) j2, bArr, i2);
        long j7 = j4 + (j2 >>> 32);
        Pack.intToLittleEndian((int) j7, bArr, i2 + 4);
        long j8 = (((long) ((i34 + i35) - (i34 & i35))) & 4294967295L) + ((j5 + 4294967295L) - (j5 | 4294967295L)) + (j7 >>> 32);
        Pack.intToLittleEndian((int) j8, bArr, i2 + 8);
        Pack.intToLittleEndian((int) (j6 + (j8 >>> 32)), bArr, i2 + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher == null ? "Poly1305" : "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.Mac
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

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.h4 = 0;
        this.h3 = 0;
        this.h2 = 0;
        this.f27919h1 = 0;
        this.f27918h0 = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b2;
        update(bArr, 0, 1);
    }

    @Override // org.spongycastle.crypto.Mac
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
