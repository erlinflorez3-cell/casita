package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.cert.X509v2CRLBuilder;
import yg.C1561oA;
import yg.C1633zX;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class JcaX509v2CRLBuilder extends X509v2CRLBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    public JcaX509v2CRLBuilder(X509Certificate x509Certificate, Date date) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("QI_K\u0011WJIdbZfd\u001aPSIL\u00072\b\u0004\u000e\u0019DRUKAE@?;-", (short) (C1633zX.Xd() ^ (-7233)))).getMethod(C1561oA.Yd(";:J*M;D@?Q6\u0014\u0010\u00112UMSIPXJV", (short) (ZN.Xd() ^ 6668)), new Class[0]);
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
