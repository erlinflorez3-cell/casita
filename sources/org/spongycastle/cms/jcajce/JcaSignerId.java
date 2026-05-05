package org.spongycastle.cms.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.cms.SignerId;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class JcaSignerId extends SignerId {
    public JcaSignerId(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("{s\nuC\n|{\u000f\r\u0005\u0011\u0017L\u0003\u0006\u0014\u0017Q|ZV`k\u000f\u001d \u0016\u0014\u0018\u0013\u0012&\u0018", (short) (C1499aX.Xd() ^ (-13318)), (short) (C1499aX.Xd() ^ (-3822)))).getMethod(C1561oA.od("FCQ%NMN=I.\n\u0004\u0003\"C9=16<,6", (short) (C1499aX.Xd() ^ (-2301))), new Class[0]);
        try {
            method.setAccessible(true);
            X500Name x500NameConvertPrincipal = convertPrincipal((X500Principal) method.invoke(x509Certificate, objArr));
            short sXd = (short) (C1633zX.Xd() ^ (-11363));
            int[] iArr = new int[":2H4\u0002H;:MKCOU\u000bADRU\u0010;\u0019\u0015\u001f*M[^TRVQPdV".length()];
            QB qb = new QB(":2H4\u0002H;:MKCOU\u000bADRU\u0010;\u0019\u0015\u001f*M[^TRVQPdV");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("&8\u0014\u0007H\"-\u0015LB9=f\u00192", (short) (C1607wl.Xd() ^ 6901), (short) (C1607wl.Xd() ^ 17038)), new Class[0]);
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
