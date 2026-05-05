package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class hw implements cf.I {
    private final Map<X500Principal, Set<X509Certificate>> V = new LinkedHashMap();

    public hw(X509Certificate... x509CertificateArr) throws Throwable {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("f\\pZ&j[Xie[ei\u001dQR^_\u0018A\u001d\u0017\u001f(IUVJFHA>P@", (short) (Od.Xd() ^ (-2322)))).getMethod(C1561oA.Kd("\u001a\u0019)\t,\u001a#\u001f\u001e0\u0015rno\u00114,2(/7)5", (short) (C1580rY.Xd() ^ (-7708))), new Class[0]);
            try {
                method.setAccessible(true);
                X500Principal x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
                Set<X509Certificate> linkedHashSet = this.V.get(x500Principal);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>(1);
                    this.V.put(x500Principal, linkedHashSet);
                }
                linkedHashSet.add(x509Certificate);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final X509Certificate Z(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd(")t0 \u0017ow\u000b/O\u001d|\u001du0Vv\rkZaqQx#SmwMru\u0012|\u007f", (short) (Od.Xd() ^ (-18125)), (short) (Od.Xd() ^ (-9706)))).getMethod(C1561oA.Xd("\n\t\u0019n\u001a\u001b\u001e\u000f\u001d\u0004a]^\u007f#\u001b!\u0017\u001e&\u0018$", (short) (C1607wl.Xd() ^ 17451)), new Class[0]);
        try {
            method.setAccessible(true);
            Set<X509Certificate> set = this.V.get((X500Principal) method.invoke(x509Certificate, objArr));
            if (set == null) {
                return null;
            }
            for (X509Certificate x509Certificate2 : set) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("\u0005z\u0013|L\u0011\u0006\u0003\u0018\u0014\u000e\u0018 S\f\r\u001d\u001eZn\u0014 %\u0019\u0019\u001b\u0018\u0015+\u001b", (short) (OY.Xd() ^ 27638))).getMethod(Qg.kd("daoJnZc_X?Xk", (short) (ZN.Xd() ^ 21652), (short) (ZN.Xd() ^ 2105)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    PublicKey publicKey = (PublicKey) method2.invoke(x509Certificate2, objArr2);
                    short sXd = (short) (OY.Xd() ^ 23974);
                    short sXd2 = (short) (OY.Xd() ^ 5828);
                    int[] iArr = new int["\b}\u0012{G\f|y\u000b\u0007|\u0007\u000b>rs\u007f\u00019Mnz{okmfcue".length()];
                    QB qb = new QB("\b}\u0012{G\f|y\u000b\u0007|\u0007\u000b>rs\u007f\u00019Mnz{okmfcue");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                        i2++;
                    }
                    try {
                        Class<?> cls = Class.forName(new String(iArr, 0, i2));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(C1561oA.ud("\u001d\u0013'\u0011\\!\u0012\u000f \u001c\u0012\u001c St\u0019\u0005\u000e\n\u0003i\u0003\u0016", (short) (C1580rY.Xd() ^ (-24492))));
                        Object[] objArr3 = {publicKey};
                        Method method3 = cls.getMethod(C1561oA.yd("4\".$ 2", (short) (C1607wl.Xd() ^ 1237)), clsArr);
                        try {
                            continue;
                            method3.setAccessible(true);
                            method3.invoke(x509Certificate, objArr3);
                            return x509Certificate2;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Exception unused) {
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return null;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hw) && ((hw) obj).V.equals(this.V);
    }

    public final int hashCode() {
        return this.V.hashCode();
    }
}
