package org.spongycastle.crypto.prng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.prng.drbg.SP80090DRBG;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class SP800SecureRandom extends SecureRandom {
    private SP80090DRBG drbg;
    private final DRBGProvider drbgProvider;
    private final EntropySource entropySource;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    SP800SecureRandom(SecureRandom secureRandom, EntropySource entropySource, DRBGProvider dRBGProvider, boolean z2) {
        this.randomSource = secureRandom;
        this.entropySource = entropySource;
        this.drbgProvider = dRBGProvider;
        this.predictionResistant = z2;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i2) {
        return EntropyUtil.generateSeed(this.entropySource, i2);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.drbg == null) {
                this.drbg = this.drbgProvider.get(this.entropySource);
            }
            if (this.drbg.generate(bArr, null, this.predictionResistant) < 0) {
                this.drbg.reseed(null);
                this.drbg.generate(bArr, null, this.predictionResistant);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j2) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                Class<?> cls = Class.forName(C1561oA.yd("ZRdP\u001a`ONmk_km#EXCVPD.>H?WV", (short) (ZN.Xd() ^ 17670)));
                Class<?>[] clsArr = {Long.TYPE};
                Object[] objArr = {Long.valueOf(j2)};
                Method method = cls.getMethod(C1561oA.Yd("1$4\u0014'((", (short) (FB.Xd() ^ 31985)), clsArr);
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
                Method method = Class.forName(Xg.qd("\u001e\u0016,\u0018e,\u001f\u001e1/'39n\u0015(':8,\u001a*8/;:", (short) (C1607wl.Xd() ^ 4592), (short) (C1607wl.Xd() ^ 24197))).getMethod(Jg.Wd("U\u0007YZ/qs", (short) (Od.Xd() ^ (-16275)), (short) (Od.Xd() ^ (-7631))), byte[].class);
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
