package org.bouncycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class JcaX500NameUtil {
    public static X500Name getIssuer(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("WMaK\u0017[LIZVLVZ\u000eBCOP\t2\u000e\b\u0010\u0019:FG;792/A1", (short) (OY.Xd() ^ 28863))).getMethod(C1561oA.Kd("ts\u0004Y\u0005\u0006\ty\bnLHIj\u000e\u0006\f\u0002\t\u0011\u0003\u000f", (short) (C1499aX.Xd() ^ (-28067))), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static X500Name getIssuer(X500NameStyle x500NameStyle, X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("=\u001c8+\u001flfl&ji|*e#La,l?#&3e\u000fcm\n\u0010\u001a<A\\\u0016", (short) (FB.Xd() ^ 2287), (short) (FB.Xd() ^ 27375))).getMethod(C1561oA.Xd("\u0004\u0003\u0013h\u0014\u0015\u0018\t\u0017}[WXy\u001d\u0015\u001b\u0011\u0018 \u0012\u001e", (short) (OY.Xd() ^ 4751)), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(x500NameStyle, ((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static X500Name getSubject(X509Certificate x509Certificate) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-24489));
        int[] iArr = new int["=5K7|C65PNFRP\u0006<?UX\u0013>\u0014\u0010\u001a%P^aWMQLKgY".length()];
        QB qb = new QB("=5K7|C65PNFRP\u0006<?UX\u0013>\u0014\u0010\u001a%P^aWMQLKgY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("QN\\:[GNHEU8\u0014\u000e\r,MCG;@F6@", (short) (C1499aX.Xd() ^ (-1819)), (short) (C1499aX.Xd() ^ (-13597))), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static X500Name getSubject(X500NameStyle x500NameStyle, X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("QG[E\u0011UFCTPFPT\b<=IJ\u0003,\b\u0002\n\u00134@A513,);+", (short) (C1633zX.Xd() ^ (-20443)), (short) (C1633zX.Xd() ^ (-1983)))).getMethod(C1561oA.ud("0-;\u0019:&-'$4\u0017rlk\u000b,\"&\u001a\u001f%\u0015\u001f", (short) (ZN.Xd() ^ 19488)), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(x500NameStyle, ((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
