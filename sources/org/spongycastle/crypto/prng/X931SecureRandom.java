package org.spongycastle.crypto.prng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1499aX;
import yg.C1561oA;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
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
                short sXd = (short) (Od.Xd() ^ (-18956));
                short sXd2 = (short) (Od.Xd() ^ (-28416));
                int[] iArr = new int["!\u000bKu1\"\u001e\u0017N.b\u0012\"KBk(]\u0013O\u0011t\tm.\u001d".length()];
                QB qb = new QB("!\u000bKu1\"\u001e\u0017N.b\u0012\"KBk(]\u0013O\u0011t\tm.\u001d");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = {Long.TYPE};
                Object[] objArr = {Long.valueOf(j2)};
                short sXd3 = (short) (FB.Xd() ^ 20906);
                int[] iArr2 = new int["\u000b.kn\u0011c:".length()];
                QB qb2 = new QB("\u000b.kn\u0011c:");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
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
                Method method = Class.forName(EO.Od("y\"\u0019heo\n\u0018|:G<o\u0016kd\u0007\u001fD#R\n\u0001zhf", (short) (C1499aX.Xd() ^ (-19825)))).getMethod(C1561oA.Qd("o`nL]\\Z", (short) (OY.Xd() ^ 5745)), byte[].class);
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
