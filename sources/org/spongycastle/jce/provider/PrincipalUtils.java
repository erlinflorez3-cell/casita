package org.spongycastle.jce.provider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.x509.X509AttributeCertificate;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Wg;

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
        Method method = Class.forName(C1561oA.Kd("\u0005|\u0013~L\u0013\u0006\u0005\u0018\u0016\u000e\u001a U\f\u000f\u001d Z\u0006c_it\u0018&)\u001f\u001d!\u001c\u001b/!", (short) (C1607wl.Xd() ^ 188))).getMethod(Wg.Zd("P3H\u0002qV]3u`\"bGms0+\u0005P<2#", (short) (C1580rY.Xd() ^ (-3018)), (short) (C1580rY.Xd() ^ (-29432))), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static X500Name getSubjectPrincipal(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("?7M9\u0007M@?RPHTZ\u0010FIWZ\u0015@\u001e\u001a$/R`cYW[VUi[", (short) (C1607wl.Xd() ^ 29790))).getMethod(Wg.vd("mjxV\u007fkrlq\u0002d@BA`\u0002_cW\\jZd", (short) (OY.Xd() ^ 15972)), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
