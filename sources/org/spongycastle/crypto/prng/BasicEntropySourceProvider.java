package org.spongycastle.crypto.prng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class BasicEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr;

    public BasicEntropySourceProvider(SecureRandom secureRandom, boolean z2) {
        this._sr = secureRandom;
        this._predictionResistant = z2;
    }

    @Override // org.spongycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i2) {
        return new EntropySource() { // from class: org.spongycastle.crypto.prng.BasicEntropySourceProvider.1
            @Override // org.spongycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i2;
            }

            @Override // org.spongycastle.crypto.prng.EntropySource
            public byte[] getEntropy() throws Throwable {
                if ((BasicEntropySourceProvider.this._sr instanceof SP800SecureRandom) || (BasicEntropySourceProvider.this._sr instanceof X931SecureRandom)) {
                    byte[] bArr = new byte[(i2 + 7) / 8];
                    SecureRandom secureRandom = BasicEntropySourceProvider.this._sr;
                    Object[] objArr = {bArr};
                    Method method = Class.forName(hg.Vd("\u0001v\u000bt@\u0005ur\u0004\u007fu\u007f\u00047[lizvhTbncmj", (short) (OY.Xd() ^ 21615), (short) (OY.Xd() ^ 25145))).getMethod(C1561oA.ud("A7ID\u0011GA1>", (short) (FB.Xd() ^ 30664)), byte[].class);
                    try {
                        method.setAccessible(true);
                        method.invoke(secureRandom, objArr);
                        return bArr;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                SecureRandom secureRandom2 = BasicEntropySourceProvider.this._sr;
                int i3 = (i2 + 7) / 8;
                Class<?> cls = Class.forName(Wg.vd("\u000b\u0001\u0019\u0003R\u0017\f\t\u001e\u001a\u0014\u001e&Y\u0002\u0013\u0014%%\u0017\u0007\u0015%\u001a(%", (short) (C1580rY.Xd() ^ (-29697))));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(i3)};
                Method method2 = cls.getMethod(Qg.kd("=:B8D2D4!21/", (short) (C1633zX.Xd() ^ (-3225)), (short) (C1633zX.Xd() ^ (-17076))), clsArr);
                try {
                    method2.setAccessible(true);
                    return (byte[]) method2.invoke(secureRandom2, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @Override // org.spongycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return BasicEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}
