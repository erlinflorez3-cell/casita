package org.bouncycastle.crypto.prng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
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
                short sXd = (short) (C1607wl.Xd() ^ 1354);
                int[] iArr = new int["-#7!l1\"\u001f0,\",0c\b\u00196GC5!/;0:7".length()];
                QB qb = new QB("-#7!l1\"\u001f0,\",0c\b\u00196GC5!/;0:7");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = {Long.TYPE};
                Object[] objArr = {Long.valueOf(j2)};
                Method method = cls.getMethod(Qg.kd(" \u0011\u001f|\u000e\r\u000b", (short) (C1633zX.Xd() ^ (-29893)), (short) (C1633zX.Xd() ^ (-10258))), clsArr);
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
                Method method = Class.forName(hg.Vd("\u000e\u0004\u0018\u0002M\u0012\u0003\u007f\u0011\r\u0003\r\u0011Dhyv\b\u0004uao{pzw", (short) (Od.Xd() ^ (-23636)), (short) (Od.Xd() ^ (-25206)))).getMethod(C1561oA.ud("|m{Yjig", (short) (OY.Xd() ^ 20907)), byte[].class);
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
