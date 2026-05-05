package org.bouncycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.cert.CertificateFactory;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
class ProviderCertHelper extends CertHelper {
    private final Provider provider;

    ProviderCertHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws Throwable {
        Provider provider = this.provider;
        short sXd = (short) (FB.Xd() ^ 15392);
        short sXd2 = (short) (FB.Xd() ^ 16086);
        int[] iArr = new int["u\fCS\u0001p-<.C\fr_\u0004F?@\f\u0018K(|Q`\u0002E+\\\r\n\u0005-\b{\u001fxY".length()];
        QB qb = new QB("u\fCS\u0001p-<.C\fr_\u0004F?@\f\u0018K(|Q`\u0002E+\\\r\n\u0005-\b{\u001fxY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {str, provider};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Qd("\u0005\u0002\u0010c\b\f\fw\u0004wx", (short) (C1499aX.Xd() ^ (-10304))), Class.forName(Ig.wd("uF+pcDg\u0013<\u0002+,^EP&", (short) (C1580rY.Xd() ^ (-8511)))), Class.forName(EO.Od("\u001e]B\u001068@\u0001A\u001d\u0010~.r\u000f\u0016/\u0016cH\b[", (short) (C1633zX.Xd() ^ (-6685)))));
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
