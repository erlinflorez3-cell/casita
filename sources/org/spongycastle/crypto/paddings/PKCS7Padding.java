package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS7Padding implements BlockCipherPadding {
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i2) {
        byte length = (byte) (bArr.length - i2);
        while (i2 < bArr.length) {
            bArr[i2] = length;
            i2++;
        }
        return length;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "PKCS7";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i2 = bArr[bArr.length - 1] & 255;
        byte b2 = (byte) i2;
        int i3 = i2 > bArr.length ? 1 : 0;
        int i4 = i2 == 0 ? 1 : 0;
        int i5 = (i3 + i4) - (i3 & i4);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            int i7 = bArr.length - i6 <= i2 ? 1 : 0;
            int i8 = bArr[i6] != b2 ? 1 : 0;
            int i9 = (i7 + i8) - (i7 | i8);
            i5 = (i5 + i9) - (i5 & i9);
        }
        if (i5 == 0) {
            return i2;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
