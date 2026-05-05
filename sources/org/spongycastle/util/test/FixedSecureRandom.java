package org.spongycastle.util.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
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
        int iNextValue = (-1) - (((-1) - (nextValue() << 24)) & ((-1) - (nextValue() << 16)));
        int i2 = this._intPad;
        if (i2 == 2) {
            this._intPad = i2 - 1;
        } else {
            int iNextValue2 = nextValue() << 8;
            iNextValue = (iNextValue + iNextValue2) - (iNextValue & iNextValue2);
        }
        int i3 = this._intPad;
        if (i3 == 1) {
            this._intPad = i3 - 1;
            return iNextValue;
        }
        int iNextValue3 = nextValue();
        return (iNextValue + iNextValue3) - (iNextValue & iNextValue3);
    }

    @Override // java.util.Random
    public long nextLong() {
        long jNextValue = ((-1) - (((-1) - ((((-1) - (((-1) - (((long) nextValue()) << 56)) & ((-1) - (((long) nextValue()) << 48)))) | (((long) nextValue()) << 40)) | (((long) nextValue()) << 32))) & ((-1) - (((long) nextValue()) << 24)))) | (((long) nextValue()) << 16);
        long jNextValue2 = ((long) nextValue()) << 8;
        return (-1) - (((-1) - ((jNextValue + jNextValue2) - (jNextValue & jNextValue2))) & ((-1) - ((long) nextValue())));
    }
}
