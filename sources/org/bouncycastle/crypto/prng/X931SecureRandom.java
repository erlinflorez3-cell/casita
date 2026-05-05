package org.bouncycastle.crypto.prng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public class X931SecureRandom extends SecureRandom {
    private final X931RNG drbg;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    X931SecureRandom(SecureRandom secureRandom, X931RNG x931rng, boolean z2) {
        this.randomSource = secureRandom;
        this.drbg = x931rng;
        this.predictionResistant = z2;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i2) {
        return EntropyUtil.generateSeed(this.drbg.getEntropySource(), i2);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.drbg.generate(bArr, this.predictionResistant) < 0) {
                this.drbg.reseed();
                this.drbg.generate(bArr, this.predictionResistant);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j2) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                Class<?> cls = Class.forName(C1561oA.Yd("^VlX&l_^qogsy/UhgzxlZjxo{z", (short) (FB.Xd() ^ 10718)));
                Class<?>[] clsArr = {Long.TYPE};
                Object[] objArr = {Long.valueOf(j2)};
                Method method = cls.getMethod(Xg.qd("QDT4GHH", (short) (C1607wl.Xd() ^ 17928), (short) (C1607wl.Xd() ^ 4805)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                Object[] objArr = {bArr};
                Method method = Class.forName(Jg.Wd("<Myx\\=ev 9G|\u0019h&K\u0001-AHL~BKm\b", (short) (C1580rY.Xd() ^ (-13844)), (short) (C1580rY.Xd() ^ (-24622)))).getMethod(ZO.xd("]&6\u001cIz|", (short) (C1607wl.Xd() ^ 27049), (short) (C1607wl.Xd() ^ 11642)), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }
}
