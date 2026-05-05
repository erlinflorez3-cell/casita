package org.bouncycastle.jce.provider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.x509.X509AttributeCertificate;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
class PrincipalUtils {
    PrincipalUtils() {
    }

    static X500Name getCA(TrustAnchor trustAnchor) {
        return X500Name.getInstance(trustAnchor.getCA().getEncoded());
    }

    static X500Name getEncodedIssuerPrincipal(Object obj) {
        return obj instanceof X509Certificate ? getIssuerPrincipal((X509Certificate) obj) : X500Name.getInstance(((X500Principal) ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0]).getEncoded());
    }

    static X500Name getIssuerPrincipal(X509CRL x509crl) {
        return X500Name.getInstance(x509crl.getIssuerX500Principal().getEncoded());
    }

    static X500Name getIssuerPrincipal(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("OG]I\u0017]POb`Xdj VYgj%P.*4?bpsigkfeyk", (short) (C1499aX.Xd() ^ (-261)))).getMethod(Wg.vd("b_qEjin]eJ*$\u001f>cYymv|hr", (short) (FB.Xd() ^ 1921)), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static X500Name getSubjectPrincipal(X509Certificate x509Certificate) throws Throwable {
        Class<?> cls = Class.forName(Qg.kd("+!5\u001fj/ \u001d.* *.a\u0016\u0017#$\\\u0006a[cl\u000e\u001a\u001b\u000f\u000b\r\u0006\u0003\u0015\u0005", (short) (OY.Xd() ^ 8791), (short) (OY.Xd() ^ 1491)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-30423));
        short sXd2 = (short) (C1633zX.Xd() ^ (-21438));
        int[] iArr = new int["fcqOp\\c]ZjM)#\"AbX\\PU[KU".length()];
        QB qb = new QB("fcqOp\\c]ZjM)#\"AbX\\PU[KU");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
