package org.bouncycastle.crypto.generators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DESedeParameters;
import yg.C1580rY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public class DESedeKeyGenerator extends DESKeyGenerator {
    private static final int MAX_IT = 20;

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() throws Throwable {
        int i2 = this.strength;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (true) {
            SecureRandom secureRandom = this.random;
            Class<?> cls = Class.forName(Qg.kd("@6J4\u007fD52C?5?Cv\u001b,):6(\u0014\".#-*", (short) (Od.Xd() ^ (-6660)), (short) (Od.Xd() ^ (-10870))));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr = {bArr};
            short sXd = (short) (ZN.Xd() ^ 20792);
            short sXd2 = (short) (ZN.Xd() ^ 23452);
            int[] iArr = new int["\r\u0003\u0015\u0010\\\u0013\r|\n".length()];
            QB qb = new QB("\r\u0003\u0015\u0010\\\u0013\r|\n");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                DESedeParameters.setOddParity(bArr);
                i3++;
                if (i3 >= 20 || (!DESedeParameters.isWeakKey(bArr, 0, i2) && DESedeParameters.isRealEDEKey(bArr, 0))) {
                    break;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!DESedeParameters.isWeakKey(bArr, 0, i2) && DESedeParameters.isRealEDEKey(bArr, 0)) {
            return bArr;
        }
        short sXd3 = (short) (C1580rY.Xd() ^ (-25880));
        int[] iArr2 = new int["h\u0001rr{s-\u0001z*pmukwewg!DDQ*A??\u0019c\\o".length()];
        QB qb2 = new QB("h\u0001rr{s-\u0001z*pmukwewg!DDQ*A??\u0019c\\o");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(sXd3 + i5 + xuXd2.CK(iKK2));
            i5++;
        }
        throw new IllegalStateException(new String(iArr2, 0, i5));
    }

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (keyGenerationParameters.getStrength() + 7) / 8;
        if (this.strength == 0 || this.strength == 21) {
            this.strength = 24;
        } else if (this.strength == 14) {
            this.strength = 16;
        } else if (this.strength != 24 && this.strength != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }
}
