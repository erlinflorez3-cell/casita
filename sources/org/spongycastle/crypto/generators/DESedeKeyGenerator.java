package org.spongycastle.crypto.generators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESedeParameters;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class DESedeKeyGenerator extends DESKeyGenerator {
    private static final int MAX_IT = 20;

    @Override // org.spongycastle.crypto.generators.DESKeyGenerator, org.spongycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() throws Throwable {
        int i2 = this.strength;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (true) {
            SecureRandom secureRandom = this.random;
            short sXd = (short) (OY.Xd() ^ 26599);
            int[] iArr = new int["7/E1~E87JH@LR\b.A@SQE3CQHTS".length()];
            QB qb = new QB("7/E1~E87JH@LR\b.A@SQE3CQHTS");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i4));
                i4++;
            }
            Object[] objArr = {bArr};
            Method method = Class.forName(new String(iArr, 0, i4)).getMethod(Xg.qd("!\u0019-*x1-\u001f.", (short) (Od.Xd() ^ (-16011)), (short) (Od.Xd() ^ (-5816))), byte[].class);
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
        short sXd2 = (short) (C1607wl.Xd() ^ 10428);
        short sXd3 = (short) (C1607wl.Xd() ^ 15175);
        int[] iArr2 = new int["3\u0012\u0014\u001a3A|t\u00036\rPhvrt\u001b\rX\u0004\"G^\f\u001e \u000eNU\u0001".length()];
        QB qb2 = new QB("3\u0012\u0014\u001a3A|t\u00036\rPhvrt\u001b\rX\u0004\"G^\f\u001e \u000eNU\u0001");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - ((i5 * sXd3) ^ sXd2));
            i5++;
        }
        throw new IllegalStateException(new String(iArr2, 0, i5));
    }

    @Override // org.spongycastle.crypto.generators.DESKeyGenerator, org.spongycastle.crypto.CipherKeyGenerator
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
