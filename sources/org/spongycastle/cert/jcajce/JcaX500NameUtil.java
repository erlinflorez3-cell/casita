package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.X500NameStyle;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Xg;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JcaX500NameUtil {
    public static X500Name getIssuer(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("G=Q;\u0007K<9JF<FJ}23?@x\"}w\u007f\t*67+')\"\u001f1!", (short) (Od.Xd() ^ (-24806)), (short) (Od.Xd() ^ (-16711)))).getMethod(hg.Vd("'$2\u0006/./\u001e*\u000fjdc\u0003$\u001a\u001e\u0012\u0017\u001d\r\u0017", (short) (FB.Xd() ^ 14344), (short) (FB.Xd() ^ 13740)), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static X500Name getIssuer(X500NameStyle x500NameStyle, X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("5+?)t9*'84*48k !-.f\u0010kemv\u0018$%\u0019\u0015\u0017\u0010\r\u001f\u000f", (short) (C1633zX.Xd() ^ (-2541)))).getMethod(C1561oA.yd("$!3\u0007438'7\u001c{ux\u0018=3;/8>2<", (short) (C1633zX.Xd() ^ (-31158))), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(x500NameStyle, ((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static X500Name getSubject(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\n\u0002\u0018\u0004Q\u0018\u000b\n\u001d\u001b\u0013\u001f%Z\u0011\u0014\"%_\u000bhdny\u001d+.$\"&! 4&", (short) (ZN.Xd() ^ 28237))).getMethod(Xg.qd("\u0001\u007f\u0010o\u0013\u0001\n\u0006\u0005\u0017{YUVw\u001b\u0013\u0019\u000f\u0016\u001e\u0010\u001c", (short) (C1633zX.Xd() ^ (-7511)), (short) (C1633zX.Xd() ^ (-29865))), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static X500Name getSubject(X500NameStyle x500NameStyle, X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("O(|m\n\rF\u0012\u0004f-W>B]?yCZt\u0017q*y\u0018j<n3\u0004}A\u0004T", (short) (OY.Xd() ^ 29318), (short) (OY.Xd() ^ 32174))).getMethod(ZO.xd("%]9F7W<_2Dtn-(\r0\u0016K'PNsT", (short) (C1580rY.Xd() ^ (-26186)), (short) (C1580rY.Xd() ^ (-23967))), new Class[0]);
        try {
            method.setAccessible(true);
            return X500Name.getInstance(x500NameStyle, ((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
