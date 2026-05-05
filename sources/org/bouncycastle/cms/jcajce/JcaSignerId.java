package org.bouncycastle.cms.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cms.SignerId;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class JcaSignerId extends SignerId {
    public JcaSignerId(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("g]q['k\\Yjf\\fj\u001eRS_`\u0019B\u001e\u0018 )JVWKGIB?QA", (short) (FB.Xd() ^ 2302), (short) (FB.Xd() ^ 28624))).getMethod(C1561oA.ud("=:H\u001cEDE4@%\u0001zy\u0019:04(-3#-", (short) (Od.Xd() ^ (-6639))), new Class[0]);
        try {
            method.setAccessible(true);
            X500Name x500NameConvertPrincipal = convertPrincipal((X500Principal) method.invoke(x509Certificate, objArr));
            short sXd = (short) (FB.Xd() ^ 5228);
            int[] iArr = new int["B8L6\u0002F74EA7AEx-.:;s\u001dxrz\u0004%12&\"$\u001d\u001al\\".length()];
            QB qb = new QB("B8L6\u0002F74EA7AEx-.:;s\u001dxrz\u0004%12&\"$\u001d\u001al\\");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("&%5\u0015(6.'3\u0016>7-1?", (short) (OY.Xd() ^ 8580)), new Class[0]);
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

    public JcaSignerId(X500Principal x500Principal, BigInteger bigInteger) {
        super(convertPrincipal(x500Principal), bigInteger);
    }

    public JcaSignerId(X500Principal x500Principal, BigInteger bigInteger, byte[] bArr) {
        super(convertPrincipal(x500Principal), bigInteger, bArr);
    }

    private static X500Name convertPrincipal(X500Principal x500Principal) {
        if (x500Principal == null) {
            return null;
        }
        return X500Name.getInstance(x500Principal.getEncoded());
    }
}
