package org.bouncycastle.crypto.generators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DESParameters;
import yg.C1499aX;
import yg.C1561oA;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public class DESKeyGenerator extends CipherKeyGenerator {
    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() throws Throwable {
        byte[] bArr = new byte[8];
        do {
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr};
            Method method = Class.forName(C1561oA.Xd("f^t`.tgfywo{\u00027]po\u0003\u0001tbr\u0001w\u0004\u0003", (short) (ZN.Xd() ^ 11302))).getMethod(Wg.vd("XN`[(^XHU", (short) (C1499aX.Xd() ^ (-11668))), byte[].class);
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

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        if (this.strength == 0 || this.strength == 7) {
            this.strength = 8;
        } else if (this.strength != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
