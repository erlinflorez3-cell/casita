package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.cert.CertificateFactory;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
class ProviderCertHelper extends CertHelper {
    private final Provider provider;

    ProviderCertHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws Throwable {
        Provider provider = this.provider;
        Class<?> cls = Class.forName(C1561oA.od("\u0015\u000b\u001f\tT\u0019\n\u0007\u0018\u0014\n\u0014\u0018K\u007f\u0001\r\u000eFZ{\b\t|xzsp\u0003rRlm}wy\u007f", (short) (FB.Xd() ^ 12312)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1633zX.Xd() ^ (-20547));
        int[] iArr = new int["*\"8$q1'5/v\u001d?>6<6".length()];
        QB qb = new QB("*\"8$q1'5/v\u001d?>6<6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Class.forName(Wg.Zd("\u001ad,\f\u000bFh\u001d 3\u001c[\u0013<\u0011)VsW\t{=", (short) (C1499aX.Xd() ^ (-18531)), (short) (C1499aX.Xd() ^ (-15982))));
        Object[] objArr = {str, provider};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd("\t\b\u0018m\u0014\u001a\u001c\n\u0018\u000e\u0011", (short) (Od.Xd() ^ (-29772))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
