package org.spongycastle.crypto.generators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESParameters;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;

/* JADX INFO: loaded from: classes2.dex */
public class DESKeyGenerator extends CipherKeyGenerator {
    @Override // org.spongycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() throws Throwable {
        byte[] bArr = new byte[8];
        do {
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr};
            Method method = Class.forName(C1561oA.ud("\u0017\r!\u000bV\u001b\f\t\u001a\u0016\f\u0016\u001aMq\u0003\u007f\u0011\r~jx\u0005y\u0004\u0001", (short) (C1607wl.Xd() ^ 19529))).getMethod(C1561oA.yd("\u0018\u000e \u001bo& \u0010\u0015", (short) (C1580rY.Xd() ^ (-6934))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                DESParameters.setOddParity(bArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } while (DESParameters.isWeakKey(bArr, 0));
        return bArr;
    }

    @Override // org.spongycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        if (this.strength == 0 || this.strength == 7) {
            this.strength = 8;
        } else if (this.strength != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
