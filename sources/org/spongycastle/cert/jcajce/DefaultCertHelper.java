package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateFactory;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
class DefaultCertHelper extends CertHelper {
    DefaultCertHelper() {
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(C1561oA.od("\u001c\u0012&\u0010[ \u0011\u000e\u001f\u001b\u0011\u001b\u001fR\u0007\b\u0014\u0015Ma\u0003\u000f\u0010\u0004\u007f\u0002zw\nyYst\u0005~\u0001\u0007", (short) (ZN.Xd() ^ 17371))).getDeclaredMethod(Wg.Zd("Q\u001fU\nR\u0007oy.r\u0018", (short) (C1499aX.Xd() ^ (-7565)), (short) (C1499aX.Xd() ^ (-16391))), Class.forName(C1561oA.Kd("\r\u0005\u001b\u0007T\u0014\n\u0018\u0012Y\u007f\"!\u0019\u001f\u0019", (short) (C1607wl.Xd() ^ 32366))));
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
