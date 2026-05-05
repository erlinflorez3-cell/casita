package org.bouncycastle.crypto.paddings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import yg.C1561oA;
import yg.OY;

/* JADX INFO: loaded from: classes6.dex */
public class ISO10126d2Padding implements BlockCipherPadding {
    SecureRandom random;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i2) {
        byte length = (byte) (bArr.length - i2);
        while (i2 < bArr.length - 1) {
            bArr[i2] = (byte) this.random.nextInt();
            i2++;
        }
        bArr[i2] = length;
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO10126-2";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws Throwable {
        if (secureRandom == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.Qd("OEYC\u000fSDARNDNR\u0006*;8IE7#1=2<9", (short) (OY.Xd() ^ 1414))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                secureRandom = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i2 = bArr[bArr.length - 1] & 255;
        if (i2 <= bArr.length) {
            return i2;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
