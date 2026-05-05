package cz.msebera.android.httpclient.conn.ssl;

import cz.msebera.android.httpclient.conn.util.DomainType;
import cz.msebera.android.httpclient.conn.util.InetAddressUtils;
import cz.msebera.android.httpclient.conn.util.PublicSuffixMatcher;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultHostnameVerifier implements HostnameVerifier {
    public HttpClientAndroidLog log;
    private final PublicSuffixMatcher publicSuffixMatcher;

    /* JADX INFO: renamed from: cz.msebera.android.httpclient.conn.ssl.DefaultHostnameVerifier$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cz$msebera$android$httpclient$conn$ssl$DefaultHostnameVerifier$HostNameType;

        static {
            int[] iArr = new int[HostNameType.values().length];
            $SwitchMap$cz$msebera$android$httpclient$conn$ssl$DefaultHostnameVerifier$HostNameType = iArr;
            try {
                iArr[HostNameType.IPv4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cz$msebera$android$httpclient$conn$ssl$DefaultHostnameVerifier$HostNameType[HostNameType.IPv6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);

        final int subjectType;

        HostNameType(int i2) {
            this.subjectType = i2;
        }
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    public DefaultHostnameVerifier(PublicSuffixMatcher publicSuffixMatcher) {
        this.log = new HttpClientAndroidLog(getClass());
        this.publicSuffixMatcher = publicSuffixMatcher;
    }

    static HostNameType determineHostFormat(String str) {
        if (InetAddressUtils.isIPv4Address(str)) {
            return HostNameType.IPv4;
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }
        return InetAddressUtils.isIPv6Address(str) ? HostNameType.IPv6 : HostNameType.DNS;
    }

    static List<SubjectName> getSubjectAltNames(X509Certificate x509Certificate) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-4866));
        short sXd2 = (short) (C1499aX.Xd() ^ (-28276));
        int[] iArr = new int["fP\u0018ed\u001dQ\u0002\u0007&\u0010M\u0015<(\rLA=\u001ai\u0007\u0003?$$X0cY\u0016F<_".length()];
        QB qb = new QB("fP\u0018ed\u001dQ\u0002\u0007&\u0010M\u0015<(\rLA=\u001ai\u0007\u0003?$$X0cY\u0016F<_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("7\f?W6V&\u000fSaT[?\t\u001d7\u001dM\u0013\u001bhoH&\n\u001d", (short) (C1607wl.Xd() ^ 17271), (short) (C1607wl.Xd() ^ 18947)), new Class[0]);
            try {
                method.setAccessible(true);
                Collection<List> collection = (Collection) method.invoke(x509Certificate, objArr);
                if (collection == null) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (List list : collection) {
                    Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                    if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                        Object obj = list.get(1);
                        if (obj instanceof String) {
                            arrayList.add(new SubjectName((String) obj, num.intValue()));
                        } else {
                            boolean z2 = obj instanceof byte[];
                        }
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

    static void matchCN(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) throws SSLException {
        if (!matchIdentityStrict(str.toLowerCase(Locale.ROOT), str2.toLowerCase(Locale.ROOT), publicSuffixMatcher)) {
            throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
        }
    }

    static void matchDNSName(String str, List<SubjectName> list, PublicSuffixMatcher publicSuffixMatcher) throws SSLException {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (int i2 = 0; i2 < list.size(); i2++) {
            SubjectName subjectName = list.get(i2);
            if (subjectName.getType() == 2 && matchIdentityStrict(lowerCase, subjectName.getValue().toLowerCase(Locale.ROOT), publicSuffixMatcher)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static boolean matchDomainRoot(String str, String str2) {
        if (str2 != null && str.endsWith(str2)) {
            return str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.';
        }
        return false;
    }

    static void matchIPAddress(String str, List<SubjectName> list) throws SSLException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            SubjectName subjectName = list.get(i2);
            if (subjectName.getType() == 7 && str.equals(subjectName.getValue())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchIPv6Address(String str, List<SubjectName> list) throws SSLException {
        String strNormaliseAddress = normaliseAddress(str);
        for (int i2 = 0; i2 < list.size(); i2++) {
            SubjectName subjectName = list.get(i2);
            if (subjectName.getType() == 7 && strNormaliseAddress.equals(normaliseAddress(subjectName.getValue()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static boolean matchIdentity(String str, String str2) {
        return matchIdentity(str, str2, null, false);
    }

    static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, false);
    }

    private static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, boolean z2) {
        if (publicSuffixMatcher != null && str.contains(".") && !matchDomainRoot(str, publicSuffixMatcher.getDomainRoot(str2, DomainType.ICANN))) {
            return false;
        }
        int iIndexOf = str2.indexOf(42);
        if (iIndexOf == -1) {
            return str.equalsIgnoreCase(str2);
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        if (!strSubstring.isEmpty() && !str.startsWith(strSubstring)) {
            return false;
        }
        if (strSubstring2.isEmpty() || str.endsWith(strSubstring2)) {
            return (z2 && str.substring(strSubstring.length(), str.length() - strSubstring2.length()).contains(".")) ? false : true;
        }
        return false;
    }

    static boolean matchIdentityStrict(String str, String str2) {
        return matchIdentity(str, str2, null, true);
    }

    static boolean matchIdentityStrict(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, true);
    }

    static String normaliseAddress(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }

    public void verify(String str, X509Certificate x509Certificate) throws Throwable {
        HostNameType hostNameTypeDetermineHostFormat = determineHostFormat(str);
        List<SubjectName> subjectAltNames = getSubjectAltNames(x509Certificate);
        if (subjectAltNames != null && !subjectAltNames.isEmpty()) {
            int i2 = AnonymousClass1.$SwitchMap$cz$msebera$android$httpclient$conn$ssl$DefaultHostnameVerifier$HostNameType[hostNameTypeDetermineHostFormat.ordinal()];
            if (i2 == 1) {
                matchIPAddress(str, subjectAltNames);
                return;
            } else if (i2 != 2) {
                matchDNSName(str, subjectAltNames, this.publicSuffixMatcher);
                return;
            } else {
                matchIPv6Address(str, subjectAltNames);
                return;
            }
        }
        short sXd = (short) (Od.Xd() ^ (-17880));
        short sXd2 = (short) (Od.Xd() ^ (-1150));
        int[] iArr = new int["5>%\u0007q8\u0007;=eZ1.'_\u0007RDZ.\n%\u00122ga828\u0004iO\u001d$".length()];
        QB qb = new QB("5>%\u0007q8\u0007;=eZ1.'_\u0007RDZ.\n%\u00122ga828\u0004iO\u001d$");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1607wl.Xd() ^ 15475);
        int[] iArr2 = new int["p@\u001d\\/Nr\u0016dF,j6<LY\u0017\u000e[\u0019`*\u000b".length()];
        QB qb2 = new QB("p@\u001d\\/Nr\u0016dF,j6<LY\u0017\u000e[\u0019`*\u000b");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            DistinguishedNameParser distinguishedNameParser = new DistinguishedNameParser((X500Principal) method.invoke(x509Certificate, objArr));
            short sXd4 = (short) (ZN.Xd() ^ 30428);
            int[] iArr3 = new int["h9".length()];
            QB qb3 = new QB("h9");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i5)) + xuXd3.CK(iKK3));
                i5++;
            }
            String strFindMostSpecific = distinguishedNameParser.findMostSpecific(new String(iArr3, 0, i5));
            if (strFindMostSpecific == null) {
                throw new SSLException(C1561oA.Qd("Xy\u0006\u0007zvxqn\u0001p*|}ipjgw\"goq\u001e9", (short) (C1499aX.Xd() ^ (-10569))) + str + C1593ug.zd("?\"gsjyu/}*n{{\u0003py\u007f2t4x\u0006\u0005\u0006\t\t;\u000b~\f\u0005@\u0003\u0011\bD\n\u0016\r\u001cI\u0019\u001b!M\u0017\u0011'\u0017R\u0015!*\u001c*'\u001b/%3#^.\"/(7", (short) (Od.Xd() ^ (-30183)), (short) (Od.Xd() ^ (-30843))));
            }
            matchCN(str, strFindMostSpecific, this.publicSuffixMatcher);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) throws Throwable {
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
