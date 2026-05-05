package org.bouncycastle.crypto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class CipherKeyGenerator {
    protected SecureRandom random;
    protected int strength;

    public byte[] generateKey() throws Throwable {
        byte[] bArr = new byte[this.strength];
        SecureRandom secureRandom = this.random;
        short sXd = (short) (FB.Xd() ^ 24332);
        short sXd2 = (short) (FB.Xd() ^ 19145);
        int[] iArr = new int["QI_K\u0019_RQdbZfl\"H[Zmk_M]kbnm".length()];
        QB qb = new QB("QI_K\u0019_RQdbZfl\"H[Zmk_M]kbnm");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = {bArr};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("\u0012\b\u001a\u0015a\u0018\u0012\u0002\u000f", (short) (C1499aX.Xd() ^ (-10628))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            return bArr;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (keyGenerationParameters.getStrength() + 7) / 8;
    }
}
