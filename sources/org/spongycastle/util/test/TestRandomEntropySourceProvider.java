package org.spongycastle.util.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.crypto.prng.EntropySourceProvider;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.OY;

/* JADX INFO: loaded from: classes2.dex */
public class TestRandomEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr;

    public TestRandomEntropySourceProvider(boolean z2) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1593ug.zd("\u0003z\u0011|J\u0011\u0004\u0003\u0016\u0014\f\u0018\u001eSy\r\f\u001f\u001d\u0011~\u000f\u001d\u0014 \u001f", (short) (C1633zX.Xd() ^ (-30953)), (short) (C1633zX.Xd() ^ (-4514)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this._sr = (SecureRandom) constructor.newInstance(objArr);
            this._predictionResistant = z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i2) {
        return new EntropySource() { // from class: org.spongycastle.util.test.TestRandomEntropySourceProvider.1
            @Override // org.spongycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i2;
            }

            @Override // org.spongycastle.crypto.prng.EntropySource
            public byte[] getEntropy() throws Throwable {
                byte[] bArr = new byte[(i2 + 7) / 8];
                SecureRandom secureRandom = TestRandomEntropySourceProvider.this._sr;
                Object[] objArr = {bArr};
                Method method = Class.forName(EO.Od("\u0019_\u0005\r<?\u0003z<ZMx)m\rB][3LwQ6*\u0004c", (short) (C1607wl.Xd() ^ 29762))).getMethod(C1561oA.Qd("\f\u0002\u0014\u000f[\u0012\f{\t", (short) (OY.Xd() ^ 19118)), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr);
                    return bArr;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            @Override // org.spongycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return TestRandomEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}
