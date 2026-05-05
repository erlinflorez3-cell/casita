package cz.msebera.android.httpclient.conn.ssl;

import androidx.webkit.ProxyConfig;
import com.braze.Constants;
import cz.msebera.android.httpclient.conn.util.InetAddressUtils;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.util.Args;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.security.auth.x500.X500Principal;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class AbstractVerifier implements X509HostnameVerifier {
    static final String[] BAD_COUNTRY_2LDS;
    public HttpClientAndroidLog log = new HttpClientAndroidLog(getClass());

    static {
        String[] strArr = {Constants.BRAZE_PUSH_ACCENT_KEY, com.facebook.hermes.intl.Constants.COLLATION_EXTENSION_KEY_SHORT, "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        BAD_COUNTRY_2LDS = strArr;
        Arrays.sort(strArr);
    }

    public static boolean acceptableCountryWildcard(String str) {
        return validCountryWildcard(str.split("\\."));
    }

    public static int countDots(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '.') {
                i2++;
            }
        }
        return i2;
    }

    public static String[] getCNs(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("f\\pZ&j[Xie[ei\u001dQR^_\u0018A\u001d\u0017\u001f(IUVJFHA>P@", (short) (FB.Xd() ^ 16598), (short) (FB.Xd() ^ 26753))).getMethod(hg.Vd("liwUvbic`pS/)(Gh^bV[aQ[", (short) (ZN.Xd() ^ 3467), (short) (ZN.Xd() ^ 24230)), new Class[0]);
        try {
            method.setAccessible(true);
            DistinguishedNameParser distinguishedNameParser = new DistinguishedNameParser((X500Principal) method.invoke(x509Certificate, objArr));
            short sXd = (short) (FB.Xd() ^ 6240);
            int[] iArr = new int[" *".length()];
            QB qb = new QB(" *");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String strFindMostSpecific = distinguishedNameParser.findMostSpecific(new String(iArr, 0, i2));
            if (strFindMostSpecific != null) {
                return new String[]{strFindMostSpecific};
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String[] getDNSSubjectAlts(X509Certificate x509Certificate) throws Throwable {
        List<SubjectName> subjectAltNames = DefaultHostnameVerifier.getSubjectAltNames(x509Certificate);
        if (subjectAltNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SubjectName subjectName : subjectAltNames) {
            if (subjectName.getType() == 2) {
                arrayList.add(subjectName.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    private static boolean matchIdentity(String str, String str2, boolean z2) {
        boolean zEndsWith;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        String[] strArrSplit = lowerCase2.split("\\.");
        if (strArrSplit.length < 3 || !strArrSplit[0].endsWith(ProxyConfig.MATCH_ALL_SCHEMES) || (z2 && !validCountryWildcard(strArrSplit))) {
            return lowerCase.equals(lowerCase2);
        }
        String str3 = strArrSplit[0];
        if (str3.length() > 1) {
            String strSubstring = str3.substring(0, str3.length() - 1);
            zEndsWith = lowerCase.startsWith(strSubstring) && lowerCase.substring(strSubstring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
        }
        if (zEndsWith) {
            return !z2 || countDots(lowerCase) == countDots(lowerCase2);
        }
        return false;
    }

    private static boolean validCountryWildcard(String[] strArr) {
        return (strArr.length == 3 && strArr[2].length() == 2 && Arrays.binarySearch(BAD_COUNTRY_2LDS, strArr[1]) >= 0) ? false : true;
    }

    @Override // cz.msebera.android.httpclient.conn.ssl.X509HostnameVerifier
    public final void verify(String str, X509Certificate x509Certificate) throws Throwable {
        List<SubjectName> subjectAltNames = DefaultHostnameVerifier.getSubjectAltNames(x509Certificate);
        ArrayList arrayList = new ArrayList();
        if (InetAddressUtils.isIPv4Address(str) || InetAddressUtils.isIPv6Address(str)) {
            for (SubjectName subjectName : subjectAltNames) {
                if (subjectName.getType() == 7) {
                    arrayList.add(subjectName.getValue());
                }
            }
        } else {
            for (SubjectName subjectName2 : subjectAltNames) {
                if (subjectName2.getType() == 2) {
                    arrayList.add(subjectName2.getValue());
                }
            }
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("\u001f\u0015)\u0013f+\u001c\u0019\"\u001e\u0014\u001e*]\u0012\u001378p\u001a}w\u007f\t\"./#')\"\u001f\tx", (short) (C1633zX.Xd() ^ (-24736)))).getMethod(C1561oA.Yd("('7\u0017:(1-,>#\u0001|}\u001fB:@6=E7C", (short) (Od.Xd() ^ (-6185))), new Class[0]);
        try {
            method.setAccessible(true);
            String strFindMostSpecific = new DistinguishedNameParser((X500Principal) method.invoke(x509Certificate, objArr)).findMostSpecific(Xg.qd("y\u0006", (short) (C1633zX.Xd() ^ (-4518)), (short) (C1633zX.Xd() ^ (-16809))));
            verify(str, strFindMostSpecific != null ? new String[]{strFindMostSpecific} : null, arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // cz.msebera.android.httpclient.conn.ssl.X509HostnameVerifier
    public final void verify(String str, SSLSocket sSLSocket) throws Throwable {
        Args.notNull(str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z2) throws SSLException {
        List<String> listAsList = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            listAsList = Arrays.asList(strArr2);
        }
        String strNormaliseAddress = InetAddressUtils.isIPv6Address(str) ? DefaultHostnameVerifier.normaliseAddress(str.toLowerCase(Locale.ROOT)) : str;
        if (listAsList == null) {
            if (str2 == null) {
                throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
            }
            if (!matchIdentity(strNormaliseAddress, InetAddressUtils.isIPv6Address(str2) ? DefaultHostnameVerifier.normaliseAddress(str2) : str2, z2)) {
                throw new SSLException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
            }
            return;
        }
        for (String strNormaliseAddress2 : listAsList) {
            if (InetAddressUtils.isIPv6Address(strNormaliseAddress2)) {
                strNormaliseAddress2 = DefaultHostnameVerifier.normaliseAddress(strNormaliseAddress2);
            }
            if (matchIdentity(strNormaliseAddress, strNormaliseAddress2, z2)) {
                return;
            }
        }
        throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + listAsList);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws Throwable {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e2) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(e2.getMessage(), e2);
            }
            return false;
        }
    }
}
