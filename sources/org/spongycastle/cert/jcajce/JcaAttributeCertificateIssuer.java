package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.cert.AttributeCertificateIssuer;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
public class JcaAttributeCertificateIssuer extends AttributeCertificateIssuer {
    /* JADX WARN: Illegal instructions before constructor call */
    public JcaAttributeCertificateIssuer(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("F>T@\u000eTGFYWO[a\u0017MP^a\u001cG%!+6Ygj`^b]\\pb", (short) (Od.Xd() ^ (-30219)))).getMethod(Wg.vd("\u0018\u0017#x()(\u0019+\u0012kgl\u000e-%/%(0&2", (short) (C1580rY.Xd() ^ (-11460))), new Class[0]);
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
