package com.facetec.sdk;

import androidx.webkit.ProxyConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import yg.C1561oA;
import yg.FB;
import yg.Od;

/* JADX INFO: loaded from: classes3.dex */
public final class ia implements HostnameVerifier {
    public static final ia B = new ia();

    private ia() {
    }

    private static boolean B(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = new StringBuilder().append(str).append('.').toString();
            }
            if (!str2.endsWith(".")) {
                str2 = new StringBuilder().append(str2).append('.').toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    private static List<String> I(X509Certificate x509Certificate, int i2) throws Throwable {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\u001c\u0012&\u0010[ \u0011\u000e\u001f\u001b\u0011\u001b\u001fR\u0007\b\u0014\u0015MvRLT]~\u000b\f\u007f{}vs\u0006u", (short) (FB.Xd() ^ 25150))).getMethod(C1561oA.Kd(";:J*M;D@?Q\u001fKTFTQEYO]M7KXQ`", (short) (Od.Xd() ^ (-32152))), new Class[0]);
            try {
                method.setAccessible(true);
                Collection<List> collection = (Collection) method.invoke(x509Certificate, objArr);
                if (collection == null) {
                    return Collections.emptyList();
                }
                for (List list : collection) {
                    if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean I(String str, X509Certificate x509Certificate) {
        return gg.I(str) ? Z(str, x509Certificate) : V(str, x509Certificate);
    }

    private static boolean V(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = I(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (B(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> Z(X509Certificate x509Certificate) throws Throwable {
        List<String> listI = I(x509Certificate, 7);
        List<String> listI2 = I(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listI.size() + listI2.size());
        arrayList.addAll(listI);
        arrayList.addAll(listI2);
        return arrayList;
    }

    private static boolean Z(String str, X509Certificate x509Certificate) throws Throwable {
        List<String> listI = I(x509Certificate, 7);
        int size = listI.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(listI.get(i2))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return I(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
