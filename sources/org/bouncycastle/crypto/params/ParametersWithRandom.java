package org.bouncycastle.crypto.params;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import yg.C1580rY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class ParametersWithRandom implements CipherParameters {
    private CipherParameters parameters;
    private SecureRandom random;

    public ParametersWithRandom(CipherParameters cipherParameters) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-14461));
        short sXd2 = (short) (C1580rY.Xd() ^ (-5945));
        int[] iArr = new int["RJ`L\u001a`SRec[gm#I\\[nl`N^lcon".length()];
        QB qb = new QB("RJ`L\u001a`SRec[gm#I\\[nl`N^lcon");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this(cipherParameters, (SecureRandom) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public ParametersWithRandom(CipherParameters cipherParameters, SecureRandom secureRandom) {
        this.random = secureRandom;
        this.parameters = cipherParameters;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public SecureRandom getRandom() {
        return this.random;
    }
}
