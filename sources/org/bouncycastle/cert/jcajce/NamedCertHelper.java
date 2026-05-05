package org.bouncycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateFactory;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
class NamedCertHelper extends CertHelper {
    private final String providerName;

    NamedCertHelper(String str) {
        this.providerName = str;
    }

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws Throwable {
        String str2 = this.providerName;
        Class<?> cls = Class.forName(C1561oA.Yd("TLbN\u001cbUTge]io%[^lo*@cqtjhlgfzlNjm\u007f{\u007f\b", (short) (ZN.Xd() ^ 2633)));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(Xg.qd("B:P<\nI?MG\u000f5WVNTN", (short) (C1580rY.Xd() ^ (-341)), (short) (C1580rY.Xd() ^ (-13379))));
        short sXd = (short) (ZN.Xd() ^ 12225);
        short sXd2 = (short) (ZN.Xd() ^ 19994);
        int[] iArr = new int[">\u0002A|sc\"`\u0004\u001bj]\t)\u0001\"".length()];
        QB qb = new QB(">\u0002A|sc\"`\u0004\u001bj]\t)\u0001\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str, str2};
        Method declaredMethod = cls.getDeclaredMethod(ZO.xd("c<gd\u000f[6x\u001d;\u000b", (short) (ZN.Xd() ^ 9008), (short) (ZN.Xd() ^ 27796)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
