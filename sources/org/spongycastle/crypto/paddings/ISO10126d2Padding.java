package org.spongycastle.crypto.paddings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;
import yg.C1633zX;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
public class ISO10126d2Padding implements BlockCipherPadding {
    SecureRandom random;

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i2) {
        byte length = (byte) (bArr.length - i2);
        while (i2 < bArr.length - 1) {
            bArr[i2] = (byte) this.random.nextInt();
            i2++;
        }
        bArr[i2] = length;
        return length;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO10126-2";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws Throwable {
        if (secureRandom != null) {
            this.random = secureRandom;
            return;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Wg.Zd("guGq\u000bO>9:4*2</\u0012\u0003M\u001dXhDPZg?<", (short) (C1633zX.Xd() ^ (-21027)), (short) (C1633zX.Xd() ^ (-16871)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b2 = bArr[bArr.length - 1];
        int i2 = (b2 + 255) - (b2 | 255);
        if (i2 <= bArr.length) {
            return i2;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
