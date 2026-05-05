package org.spongycastle.crypto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.FB;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
public class CipherKeyGenerator {
    protected SecureRandom random;
    protected int strength;

    public byte[] generateKey() throws Throwable {
        byte[] bArr = new byte[this.strength];
        SecureRandom secureRandom = this.random;
        Object[] objArr = {bArr};
        Method method = Class.forName(Wg.vd("$\u001c2\u001ek2%$'%\u001d)/d\u000b\u001e\r \u001e\u0012\u007f\u0010\u001e\u0015\u0011\u0010", (short) (FB.Xd() ^ 20596))).getMethod(Qg.kd("\u001e\u0014&!m$\u001e\u000e\u001b", (short) (FB.Xd() ^ 7076), (short) (FB.Xd() ^ 12737)), byte[].class);
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
