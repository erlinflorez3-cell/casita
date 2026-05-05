package com.google.zxing.common;

/* JADX INFO: loaded from: classes7.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int i2) {
        if (i2 <= 0 || i2 > 32 || i2 > available()) {
            throw new IllegalArgumentException(String.valueOf(i2));
        }
        int i3 = this.bitOffset;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = 8 - i3;
            int iMin = Math.min(i2, i5);
            int i6 = i5 - iMin;
            int i7 = (255 >> (8 - iMin)) << i6;
            byte[] bArr = this.bytes;
            int i8 = this.byteOffset;
            byte b2 = bArr[i8];
            int i9 = ((i7 + b2) - (i7 | b2)) >> i6;
            i2 -= iMin;
            int i10 = this.bitOffset + iMin;
            this.bitOffset = i10;
            if (i10 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i8 + 1;
            }
            i4 = i9;
        }
        if (i2 <= 0) {
            return i4;
        }
        while (i2 >= 8) {
            byte[] bArr2 = this.bytes;
            int i11 = this.byteOffset;
            i4 = ((-1) - (((-1) - bArr2[i11]) | ((-1) - 255))) | (i4 << 8);
            this.byteOffset = i11 + 1;
            i2 -= 8;
        }
        if (i2 <= 0) {
            return i4;
        }
        int i12 = 8 - i2;
        int i13 = (i4 << i2) | ((((255 >> i12) << i12) & this.bytes[this.byteOffset]) >> i12);
        this.bitOffset += i2;
        return i13;
    }
}
