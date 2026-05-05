package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public ChaChaEngine(int i2) {
        super(i2);
    }

    public static void chachaCore(int i2, int[] iArr, int[] iArr2) {
        int i3 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i2 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c2 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int iRotl = iArr[4];
        int iRotl2 = iArr[5];
        int iRotl3 = iArr[6];
        int i8 = 7;
        int iRotl4 = iArr[7];
        int i9 = 8;
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = 12;
        int iRotl5 = iArr[12];
        int iRotl6 = iArr[13];
        int iRotl7 = iArr[14];
        int iRotl8 = iArr[15];
        while (i2 > 0) {
            int i15 = i4 + iRotl;
            int iRotl9 = rotl(iRotl5 ^ i15, i3);
            int i16 = i10 + iRotl9;
            int iRotl10 = rotl(iRotl ^ i16, i14);
            int i17 = i15 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i17, i9);
            int i18 = i16 + iRotl11;
            int iRotl12 = rotl(iRotl10 ^ i18, i8);
            int i19 = i5 + iRotl2;
            int iRotl13 = rotl(iRotl6 ^ i19, i3);
            int i20 = i11 + iRotl13;
            int iRotl14 = rotl(iRotl2 ^ i20, i14);
            int i21 = i19 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i21, i9);
            int i22 = i20 + iRotl15;
            int iRotl16 = rotl(iRotl14 ^ i22, i8);
            int i23 = i6 + iRotl3;
            int iRotl17 = rotl(iRotl7 ^ i23, i3);
            int i24 = i12 + iRotl17;
            int iRotl18 = rotl(iRotl3 ^ i24, i14);
            int i25 = i23 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i25, i9);
            int i26 = i24 + iRotl19;
            int iRotl20 = rotl(iRotl18 ^ i26, i8);
            int i27 = i7 + iRotl4;
            int iRotl21 = rotl(iRotl8 ^ i27, 16);
            int i28 = i13 + iRotl21;
            int iRotl22 = rotl(iRotl4 ^ i28, i14);
            int i29 = i27 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i29, 8);
            int i30 = i28 + iRotl23;
            int iRotl24 = rotl(iRotl22 ^ i30, 7);
            int i31 = i17 + iRotl16;
            int iRotl25 = rotl(iRotl23 ^ i31, 16);
            int i32 = i26 + iRotl25;
            int iRotl26 = rotl(iRotl16 ^ i32, 12);
            i4 = i31 + iRotl26;
            iRotl8 = rotl(iRotl25 ^ i4, 8);
            i12 = i32 + iRotl8;
            iRotl2 = rotl(iRotl26 ^ i12, 7);
            int i33 = i21 + iRotl20;
            int iRotl27 = rotl(iRotl11 ^ i33, 16);
            int i34 = i30 + iRotl27;
            int iRotl28 = rotl(iRotl20 ^ i34, 12);
            i5 = i33 + iRotl28;
            iRotl5 = rotl(iRotl27 ^ i5, 8);
            i13 = i34 + iRotl5;
            iRotl3 = rotl(iRotl28 ^ i13, 7);
            int i35 = i25 + iRotl24;
            int iRotl29 = rotl(iRotl15 ^ i35, 16);
            int i36 = i18 + iRotl29;
            int iRotl30 = rotl(iRotl24 ^ i36, 12);
            i6 = i35 + iRotl30;
            iRotl6 = rotl(iRotl29 ^ i6, 8);
            i10 = i36 + iRotl6;
            iRotl4 = rotl(iRotl30 ^ i10, 7);
            int i37 = i29 + iRotl12;
            i3 = 16;
            int iRotl31 = rotl(iRotl19 ^ i37, 16);
            int i38 = i22 + iRotl31;
            int iRotl32 = rotl(iRotl12 ^ i38, 12);
            i7 = i37 + iRotl32;
            iRotl7 = rotl(iRotl31 ^ i7, 8);
            i11 = i38 + iRotl7;
            iRotl = rotl(iRotl32 ^ i11, 7);
            i2 -= 2;
            c2 = 0;
            i14 = 12;
            i9 = 8;
            i8 = 7;
        }
        iArr2[c2] = i4 + iArr[c2];
        iArr2[1] = i5 + iArr[1];
        iArr2[2] = i6 + iArr[2];
        iArr2[3] = i7 + iArr[3];
        iArr2[4] = iRotl + iArr[4];
        iArr2[5] = iRotl2 + iArr[5];
        iArr2[6] = iRotl3 + iArr[6];
        iArr2[7] = iRotl4 + iArr[7];
        iArr2[8] = i10 + iArr[8];
        iArr2[9] = i11 + iArr[9];
        iArr2[10] = i12 + iArr[10];
        iArr2[11] = i13 + iArr[11];
        iArr2[12] = iRotl5 + iArr[12];
        iArr2[13] = iRotl6 + iArr[13];
        iArr2[14] = iRotl7 + iArr[14];
        iArr2[15] = iRotl8 + iArr[15];
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i2 = iArr[12] + 1;
        iArr[12] = i2;
        if (i2 == 0) {
            int[] iArr2 = this.engineState;
            iArr2[13] = iArr2[13] + 1;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter(long j2) {
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) j2;
        if (i2 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i2;
        }
        int i4 = this.engineState[12];
        int[] iArr2 = this.engineState;
        iArr2[12] = iArr2[12] + i3;
        if (i4 == 0 || this.engineState[12] >= i4) {
            return;
        }
        int[] iArr3 = this.engineState;
        iArr3[13] = iArr3[13] + 1;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f27904x);
        Pack.intToLittleEndian(this.f27904x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected long getCounter() {
        long j2 = ((long) this.engineState[13]) << 32;
        long j3 = ((long) this.engineState[12]) & 4294967295L;
        return (j2 + j3) - (j2 & j3);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void resetCounter() {
        int[] iArr = this.engineState;
        this.engineState[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter() {
        if (this.engineState[12] == 0 && this.engineState[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int[] iArr = this.engineState;
        int i2 = iArr[12] - 1;
        iArr[12] = i2;
        if (i2 == -1) {
            this.engineState[13] = r1[13] - 1;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter(long j2) {
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) j2;
        if (i2 != 0) {
            long j3 = this.engineState[13];
            if ((j3 + 4294967295L) - (j3 | 4294967295L) < (((long) i2) & 4294967295L)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] - i2;
        }
        long j4 = this.engineState[12];
        if ((j4 + 4294967295L) - (j4 | 4294967295L) >= (-1) - (((-1) - 4294967295L) | ((-1) - ((long) i3)))) {
            int[] iArr2 = this.engineState;
            iArr2[12] = iArr2[12] - i3;
        } else {
            if (this.engineState[13] == 0) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            this.engineState[13] = r1[13] - 1;
            int[] iArr3 = this.engineState;
            iArr3[12] = iArr3[12] - i3;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void setKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr != null) {
            int i2 = 16;
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            this.engineState[4] = Pack.littleEndianToInt(bArr, 0);
            this.engineState[5] = Pack.littleEndianToInt(bArr, 4);
            this.engineState[6] = Pack.littleEndianToInt(bArr, 8);
            this.engineState[7] = Pack.littleEndianToInt(bArr, 12);
            if (bArr.length == 32) {
                bArr3 = sigma;
            } else {
                bArr3 = tau;
                i2 = 0;
            }
            this.engineState[8] = Pack.littleEndianToInt(bArr, i2);
            this.engineState[9] = Pack.littleEndianToInt(bArr, i2 + 4);
            this.engineState[10] = Pack.littleEndianToInt(bArr, i2 + 8);
            this.engineState[11] = Pack.littleEndianToInt(bArr, i2 + 12);
            this.engineState[0] = Pack.littleEndianToInt(bArr3, 0);
            this.engineState[1] = Pack.littleEndianToInt(bArr3, 4);
            this.engineState[2] = Pack.littleEndianToInt(bArr3, 8);
            this.engineState[3] = Pack.littleEndianToInt(bArr3, 12);
        }
        this.engineState[14] = Pack.littleEndianToInt(bArr2, 0);
        this.engineState[15] = Pack.littleEndianToInt(bArr2, 4);
    }
}
