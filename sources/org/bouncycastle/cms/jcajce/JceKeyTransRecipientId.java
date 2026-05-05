package org.bouncycastle.cms.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cms.KeyTransRecipientId;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public class JceKeyTransRecipientId extends KeyTransRecipientId {
    /* JADX WARN: Illegal instructions before constructor call */
    public JceKeyTransRecipientId(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u001e\u0014(\u0012]\"\u0013\u0010!\u001d\u0013\u001d!T\t\n\u0016\u0017OxTNV_\u0001\r\u000e\u0002}\u007fxu\bw", (short) (ZN.Xd() ^ 8416))).getMethod(C1561oA.yd("feqGnon_y`:63Tsk]SV^LX", (short) (C1607wl.Xd() ^ 16396)), new Class[0]);
        try {
            method.setAccessible(true);
            X500Name x500NameConvertPrincipal = convertPrincipal((X500Principal) method.invoke(x509Certificate, objArr));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Yd("_WmY'm`_rphtz0fiwz5`>:DOr\u0001\u0004yw{vu\n{", (short) (Od.Xd() ^ (-14465)))).getMethod(Xg.qd("XWgGZh`YeHpi_cq", (short) (Od.Xd() ^ (-5999)), (short) (Od.Xd() ^ (-28653))), new Class[0]);
            try {
                method2.setAccessible(true);
                super(x500NameConvertPrincipal, (BigInteger) method2.invoke(x509Certificate, objArr2), CMSUtils.getSubjectKeyId(x509Certificate));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public JceKeyTransRecipientId(X500Principal x500Principal, BigInteger bigInteger) {
        super(convertPrincipal(x500Principal), bigInteger);
    }

    public JceKeyTransRecipientId(X500Principal x500Principal, BigInteger bigInteger, byte[] bArr) {
        super(convertPrincipal(x500Principal), bigInteger, bArr);
    }

    private static X500Name convertPrincipal(X500Principal x500Principal) {
        if (x500Principal == null) {
            return null;
        }
        return X500Name.getInstance(x500Principal.getEncoded());
    }
}
