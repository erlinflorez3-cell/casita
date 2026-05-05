package org.bouncycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateFactory;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;

/* JADX INFO: loaded from: classes6.dex */
class DefaultCertHelper extends CertHelper {
    DefaultCertHelper() {
    }

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(C1626yg.Ud("A\u001c\u0019\u0003-\u000e~\u0017=Qd-][\u0002*\t4;ou!\r_Rv6m\u0006mN[Zh?_3", (short) (C1633zX.Xd() ^ (-16830)), (short) (C1633zX.Xd() ^ (-18069)))).getDeclaredMethod(EO.Od("\u0007>/d\u0012K`\u00065\u001f\u0017", (short) (C1499aX.Xd() ^ (-1269))), Class.forName(Ig.wd("y\"glW@[\u000f@e\u0007\u0010B1dB", (short) (C1580rY.Xd() ^ (-11523)))));
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
