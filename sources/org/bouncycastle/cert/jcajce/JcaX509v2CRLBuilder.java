package org.bouncycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.X509v2CRLBuilder;
import yg.C1561oA;
import yg.C1607wl;
import yg.Wg;

/* JADX INFO: loaded from: classes6.dex */
public class JcaX509v2CRLBuilder extends X509v2CRLBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    public JcaX509v2CRLBuilder(X509Certificate x509Certificate, Date date) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("*\"8$q8+*=;3?Ez14BE\u007f+\t\u0005\u000f\u001a=KNDBFA@TF", (short) (C1607wl.Xd() ^ 16961))).getMethod(Wg.vd("\u0012\u000f!~$\u0010\u001b\u0015\u0016&\rhfe\t*$( %/\u001f-", (short) (C1607wl.Xd() ^ 6244)), new Class[0]);
        try {
            method.setAccessible(true);
            this((X500Principal) method.invoke(x509Certificate, objArr), date);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public JcaX509v2CRLBuilder(X500Principal x500Principal, Date date) {
        super(X500Name.getInstance(x500Principal.getEncoded()), date);
    }
}
