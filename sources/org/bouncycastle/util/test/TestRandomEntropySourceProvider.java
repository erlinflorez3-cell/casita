package org.bouncycastle.util.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
public class TestRandomEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr;

    public TestRandomEntropySourceProvider(boolean z2) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(EO.Od("Qz>L\t\u0014u;%1*S$Nw#Nr'\u0016:|0*\\j", (short) (OY.Xd() ^ 29882))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this._sr = (SecureRandom) constructor.newInstance(objArr);
            this._predictionResistant = z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i2) {
        return new EntropySource() { // from class: org.bouncycastle.util.test.TestRandomEntropySourceProvider.1
            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i2;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() throws Throwable {
                byte[] bArr = new byte[(i2 + 7) / 8];
                SecureRandom secureRandom = TestRandomEntropySourceProvider.this._sr;
                Object[] objArr = {bArr};
                Method method = Class.forName(C1626yg.Ud(";`[D/=]U,Sil\\&~\u001aq\u000bCV&M\u001a@A?", (short) (Od.Xd() ^ (-6874)), (short) (Od.Xd() ^ (-26274)))).getMethod(Ig.wd("Br6K/:\u0013Q\u0001", (short) (OY.Xd() ^ 13744)), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr);
                    return bArr;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return TestRandomEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}
