package org.bouncycastle.crypto.prng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes6.dex */
public class BasicEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr;

    public BasicEntropySourceProvider(SecureRandom secureRandom, boolean z2) {
        this._sr = secureRandom;
        this._predictionResistant = z2;
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i2) {
        return new EntropySource() { // from class: org.bouncycastle.crypto.prng.BasicEntropySourceProvider.1
            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i2;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() throws Throwable {
                if ((BasicEntropySourceProvider.this._sr instanceof SP800SecureRandom) || (BasicEntropySourceProvider.this._sr instanceof X931SecureRandom)) {
                    byte[] bArr = new byte[(i2 + 7) / 8];
                    SecureRandom secureRandom = BasicEntropySourceProvider.this._sr;
                    Object[] objArr = {bArr};
                    Method method = Class.forName(Wg.Zd("Vaj)iC+|\u0003\u0014|]V\u001f8\u001e\u00128)oNqt>=O", (short) (FB.Xd() ^ 20647), (short) (FB.Xd() ^ 10667))).getMethod(C1561oA.Xd(".&:7\u0006>:,;", (short) (C1633zX.Xd() ^ (-193))), byte[].class);
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
                Class<?> cls = Class.forName(C1561oA.od("\\RfP\u001c`QN_[Q[_\u00137HEVRD0>J?IF", (short) (Od.Xd() ^ (-2540))));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(i3)};
                Method method2 = cls.getMethod(C1561oA.Kd("<;E=K;OA0CDD", (short) (C1607wl.Xd() ^ 2733)), clsArr);
                try {
                    method2.setAccessible(true);
                    return (byte[]) method2.invoke(secureRandom2, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return BasicEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}
