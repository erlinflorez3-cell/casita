package org.bouncycastle.crypto.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public class FixedSecureRandom extends SecureRandom {
    private byte[] _data;
    private int _index;
    private int _intPad;

    public FixedSecureRandom(boolean z2, byte[] bArr) {
        this(z2, new byte[][]{bArr});
    }

    public FixedSecureRandom(boolean z2, byte[][] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != bArr.length; i2++) {
            try {
                byteArrayOutputStream.write(bArr[i2]);
            } catch (IOException unused) {
                throw new IllegalArgumentException("can't save value array.");
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        if (z2) {
            this._intPad = byteArray.length % 4;
        }
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i2 = this._index;
        this._index = i2 + 1;
        byte b2 = bArr[i2];
        return (b2 + 255) - (b2 | 255);
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i2) {
        byte[] bArr = new byte[i2];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        int iNextValue = (nextValue() << 24) | (nextValue() << 16);
        int i2 = this._intPad;
        if (i2 == 2) {
            this._intPad = i2 - 1;
        } else {
            int iNextValue2 = nextValue() << 8;
            iNextValue = (iNextValue + iNextValue2) - (iNextValue & iNextValue2);
        }
        int i3 = this._intPad;
        if (i3 != 1) {
            return (-1) - (((-1) - iNextValue) & ((-1) - nextValue()));
        }
        this._intPad = i3 - 1;
        return iNextValue;
    }

    @Override // java.util.Random
    public long nextLong() {
        long jNextValue = ((long) nextValue()) << 56;
        long jNextValue2 = ((long) nextValue()) << 48;
        long jNextValue3 = (-1) - (((-1) - ((jNextValue + jNextValue2) - (jNextValue & jNextValue2))) & ((-1) - (((long) nextValue()) << 40)));
        long jNextValue4 = ((long) nextValue()) << 32;
        long jNextValue5 = ((jNextValue3 + jNextValue4) - (jNextValue3 & jNextValue4)) | (((long) nextValue()) << 24);
        long jNextValue6 = ((long) nextValue()) << 16;
        long j2 = (jNextValue5 + jNextValue6) - (jNextValue5 & jNextValue6);
        long jNextValue7 = ((long) nextValue()) << 8;
        long j3 = (j2 + jNextValue7) - (j2 & jNextValue7);
        long jNextValue8 = nextValue();
        return (j3 + jNextValue8) - (j3 & jNextValue8);
    }
}
