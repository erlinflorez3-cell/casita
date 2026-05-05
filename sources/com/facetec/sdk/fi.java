package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class fi {
    public static final fi Z = new I().Code();
    private final Set<Code> I;

    @Nullable
    private final hx V;

    static final class Code {
        final ib B;
        final String I;
        private String V;
        private String Z;

        final boolean I(String str) {
            if (!this.Z.startsWith("*.")) {
                return str.equals(this.V);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.V.length()) {
                return false;
            }
            String str2 = this.V;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Code)) {
                return false;
            }
            Code code = (Code) obj;
            return this.Z.equals(code.Z) && this.I.equals(code.I) && this.B.equals(code.B);
        }

        public final int hashCode() {
            return ((((this.Z.hashCode() + 527) * 31) + this.I.hashCode()) * 31) + this.B.hashCode();
        }

        public final String toString() {
            return new StringBuilder().append(this.I).append(this.B.Code()).toString();
        }
    }

    public static final class I {
        private final List<Code> Z = new ArrayList();

        public final fi Code() {
            return new fi(new LinkedHashSet(this.Z), null);
        }
    }

    fi(Set<Code> set, @Nullable hx hxVar) {
        this.I = set;
        this.V = hxVar;
    }

    public static String Code(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return new StringBuilder("sha256/").append(V((X509Certificate) certificate).Code()).toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static ib V(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("kcye3ylk~|t\u0001\u0007<ru\u0004\u0007AWz\t\f\u0002\u007f\u0004~}\u0012\u0004", (short) (C1607wl.Xd() ^ 12931), (short) (C1607wl.Xd() ^ 7334))).getMethod(Jg.Wd("\u001d\u0011nAE\t\u0002U.\ruh", (short) (FB.Xd() ^ 30002), (short) (FB.Xd() ^ 29231)), new Class[0]);
        try {
            method.setAccessible(true);
            return ib.V(((PublicKey) method.invoke(x509Certificate, objArr)).getEncoded()).V();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void I(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String str2;
        List<Certificate> listB = list;
        List listEmptyList = Collections.emptyList();
        for (Code code : this.I) {
            if (code.I(str)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(code);
            }
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        hx hxVar = this.V;
        if (hxVar != null) {
            listB = hxVar.B(listB, str);
        }
        int size = listB.size();
        for (int i2 = 0; i2 < size; i2++) {
            X509Certificate x509Certificate = (X509Certificate) listB.get(i2);
            int size2 = listEmptyList.size();
            ib ibVarV = null;
            ib ibVarB = null;
            for (int i3 = 0; i3 < size2; i3++) {
                Code code2 = (Code) listEmptyList.get(i3);
                if (code2.I.equals(ZO.xd("85+dwJ\u001a", (short) (C1580rY.Xd() ^ (-24114)), (short) (C1580rY.Xd() ^ (-1845))))) {
                    if (ibVarV == null) {
                        ibVarV = V(x509Certificate);
                    }
                    if (code2.B.equals(ibVarV)) {
                        return;
                    }
                } else {
                    if (!code2.I.equals(C1626yg.Ud("p(\u001e\\!", (short) (C1499aX.Xd() ^ (-25387)), (short) (C1499aX.Xd() ^ (-23783))))) {
                        throw new AssertionError(new StringBuilder(C1561oA.Qd("H@DE?><>?/-g/'8,\u0004.(/1'1$(sX", (short) (OY.Xd() ^ 8660))).append(code2.I).toString());
                    }
                    if (ibVarB == null) {
                        short sXd = (short) (Od.Xd() ^ (-568));
                        int[] iArr = new int["\\\u0003FYvf|#mK<1f\u0019v[\u000f\u001b\ryT*\u001a\u0007PO,pM1".length()];
                        QB qb = new QB("\\\u0003FYvf|#mK<1f\u0019v[\u000f\u001b\ryT*\u001a\u0007PO,pM1");
                        int i4 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd + i4)));
                            i4++;
                        }
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(EO.Od("\u0017?@\u0004\u007fJptJu\u000e\u007f", (short) (ZN.Xd() ^ 19505)), new Class[0]);
                        try {
                            method.setAccessible(true);
                            ibVarB = ib.V(((PublicKey) method.invoke(x509Certificate, objArr)).getEncoded()).B();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    if (code2.B.equals(ibVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(C1593ug.zd("m\u0011\u001f\"\u0018\u0016\u001a\u0015\u0014(\u001aU'!'($*$]%!*.86*fPgh\u001a01?m25CF<:>98L>y>D>GM\u001a", (short) (ZN.Xd() ^ 26969), (short) (ZN.Xd() ^ 8291)));
        int size3 = listB.size();
        int i5 = 0;
        while (true) {
            short sXd2 = (short) (OY.Xd() ^ 10436);
            int[] iArr2 = new int["0EDCB".length()];
            QB qb2 = new QB("0EDCB");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(sXd2 + sXd2 + i6 + xuXd2.CK(iKK2));
                i6++;
            }
            str2 = new String(iArr2, 0, i6);
            if (i5 >= size3) {
                break;
            }
            X509Certificate x509Certificate2 = (X509Certificate) listB.get(i5);
            StringBuilder sbAppend = sb.append(str2).append(Code(x509Certificate2)).append(C1561oA.Kd("*\u0011", (short) (C1633zX.Xd() ^ (-25668))));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Wg.Zd("+\u001f2\u0018b`Q\t\u001aQHNQ\u007f4.:v.Uo%-1P\u0018WGB\u0002zrDo", (short) (C1499aX.Xd() ^ (-30606)), (short) (C1499aX.Xd() ^ (-21751)))).getMethod(C1561oA.Xd("on~^\u0002oxts\u0006Va", (short) (C1633zX.Xd() ^ (-5028))), new Class[0]);
            try {
                method2.setAccessible(true);
                sbAppend.append(((Principal) method2.invoke(x509Certificate2, objArr2)).getName());
                i5++;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        sb.append(Wg.vd("?VS\u0005\u001b!\u001e\u0016\"^\u001f\",/!\u001f/*%9'6_'=Ak", (short) (ZN.Xd() ^ 13897))).append(str).append(Qg.kd("D", (short) (Od.Xd() ^ (-4505)), (short) (Od.Xd() ^ (-19529))));
        int size4 = listEmptyList.size();
        for (int i7 = 0; i7 < size4; i7++) {
            sb.append(str2).append((Code) listEmptyList.get(i7));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    final fi V(@Nullable hx hxVar) {
        return gg.V(this.V, hxVar) ? this : new fi(this.I, hxVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return gg.V(this.V, fiVar.V) && this.I.equals(fiVar.I);
    }

    public final int hashCode() {
        hx hxVar = this.V;
        return ((hxVar != null ? hxVar.hashCode() : 0) * 31) + this.I.hashCode();
    }
}
