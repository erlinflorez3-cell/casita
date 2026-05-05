package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateFactory;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
class NamedCertHelper extends CertHelper {
    private final String providerName;

    NamedCertHelper(String str) {
        this.providerName = str;
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws Throwable {
        String str2 = this.providerName;
        Class<?> cls = Class.forName(Ig.wd("\u001abS\u001c78Do/.\roF\u0007\u000egPN]H(\u000bdS.r\n.\u0004\u0003{/a\rU#>", (short) (FB.Xd() ^ 19285)));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(EO.Od("8\u0001g.\u001b\u0017,X\r3VY\u0007\b%;", (short) (OY.Xd() ^ 28577)));
        short sXd = (short) (Od.Xd() ^ (-29844));
        int[] iArr = new int["\u0003x\rvB\u007fs\u007fw=a\u0002~txp".length()];
        QB qb = new QB("\u0003x\rvB\u007fs\u007fw=a\u0002~txp");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str, str2};
        Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("\u0005\u0004\u0014i\u0010\u0016\u0018\u0006\u0014\n\r", (short) (C1633zX.Xd() ^ (-28038)), (short) (C1633zX.Xd() ^ (-16826))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
