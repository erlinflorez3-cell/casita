package org.bouncycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.AttributeCertificateIssuer;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class JcaAttributeCertificateIssuer extends AttributeCertificateIssuer {
    public JcaAttributeCertificateIssuer(X509Certificate x509Certificate) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Qd("\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eyz\u0007\b@iE?GPq}~rnpifxh", (short) (C1607wl.Xd() ^ 14067)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 2582);
        short sXd2 = (short) (OY.Xd() ^ 6000);
        int[] iArr = new int["CBR(STWHV=\u001b\u0017\u00189\\TZPW_Q]".length()];
        QB qb = new QB("CBR(STWHV=\u001b\u0017\u00189\\TZPW_Q]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this((X500Principal) method.invoke(x509Certificate, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public JcaAttributeCertificateIssuer(X500Principal x500Principal) {
        super(X500Name.getInstance(x500Principal.getEncoded()));
    }
}
