package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class hz extends hx {
    private final cf.I B;

    public hz(cf.I i2) {
        this.B = i2;
    }

    private static boolean B(X509Certificate x509Certificate, X509Certificate x509Certificate2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\u0010\b\u001e\nW\u001e\u0011\u0010#!\u0019%+`\u0017\u001a(+e\u0011njt\u007f#14*(,'&:,", (short) (FB.Xd() ^ 10337))).getMethod(Xg.qd("87G\u001dHIL=K\u001e)", (short) (C1633zX.Xd() ^ (-157)), (short) (C1633zX.Xd() ^ (-27576))), new Class[0]);
        try {
            method.setAccessible(true);
            Principal principal = (Principal) method.invoke(x509Certificate, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("([1Z`b\u0013N\u0019R\u000bR\u000e\u007fu6{;5\u001c2k5|U\u001f`\u0014I\nB|Jx", (short) (ZN.Xd() ^ 24973), (short) (ZN.Xd() ^ 22273))).getMethod(ZO.xd("\nxx8%\u0007\u000fYaQ#N", (short) (C1633zX.Xd() ^ (-6808)), (short) (C1633zX.Xd() ^ (-9116))), new Class[0]);
            try {
                method2.setAccessible(true);
                if (!principal.equals((Principal) method2.invoke(x509Certificate2, objArr2))) {
                    return false;
                }
                try {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1626yg.Ud("\u007fQ;w'\u001f9c\u0014;=Pi\b`@1\u0017N}8\u001ee^9JZ@\u001ee", (short) (C1499aX.Xd() ^ (-18018)), (short) (C1499aX.Xd() ^ (-24052)))).getMethod(Ig.wd("9d&\u0019^v%I|@XR", (short) (C1607wl.Xd() ^ 27142)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        PublicKey publicKey = (PublicKey) method3.invoke(x509Certificate2, objArr3);
                        Class<?> cls = Class.forName(EO.Od("9_)1 C\u000fN<:1X-m9Z\r\u001f\u0012M+e\u0004v\u001fd\u0002%hl", (short) (C1607wl.Xd() ^ 12363)));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(C1561oA.Qd("=3G1|A2/@<2<@s\u00159%.*#\n#6", (short) (ZN.Xd() ^ 1512)));
                        Object[] objArr4 = {publicKey};
                        Method method4 = cls.getMethod(C1593ug.zd("\u007fo}us\b", (short) (FB.Xd() ^ 30046), (short) (FB.Xd() ^ 17826)), clsArr);
                        try {
                            method4.setAccessible(true);
                            method4.invoke(x509Certificate, objArr4);
                            return true;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (GeneralSecurityException unused) {
                    return false;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    @Override // com.facetec.sdk.hx
    public final List<Certificate> B(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z2 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateZ = this.B.Z(x509Certificate);
            if (x509CertificateZ == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (B(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateZ)) {
                arrayList.add(x509CertificateZ);
            }
            if (B(x509CertificateZ, x509CertificateZ)) {
                return arrayList;
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(arrayList)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hz) && ((hz) obj).B.equals(this.B);
    }

    public final int hashCode() {
        return this.B.hashCode();
    }
}
