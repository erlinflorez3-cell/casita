package org.bouncycastle.jce.provider;

import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.AdkSettings;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class X509LDAPCertStoreSpi extends CertStoreSpi {
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private X509LDAPCertStoreParameters params;

    public X509LDAPCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (!(certStoreParameters instanceof X509LDAPCertStoreParameters)) {
            throw new InvalidAlgorithmParameterException(X509LDAPCertStoreSpi.class.getName() + ": parameter must be a " + X509LDAPCertStoreParameters.class.getName() + " object\n" + certStoreParameters.toString());
        }
        this.params = (X509LDAPCertStoreParameters) certStoreParameters;
    }

    private Set certSubjectSerialSearch(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws Throwable {
        String string;
        String name;
        Set setSearch;
        HashSet hashSet = new HashSet();
        try {
            byte[] subjectAsBytes = x509CertSelector.getSubjectAsBytes();
            short sXd = (short) (FB.Xd() ^ 22087);
            int[] iArr = new int["B".length()];
            QB qb = new QB("B");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str3 = new String(iArr, 0, i2);
            if (subjectAsBytes != null || x509CertSelector.getSubjectAsString() != null || x509CertSelector.getCertificate() != null) {
                X509Certificate certificate = x509CertSelector.getCertificate();
                String strYd = C1561oA.yd("4'#\u0010\u0015\u0014\u0015", (short) (OY.Xd() ^ 30871));
                if (certificate != null) {
                    X509Certificate certificate2 = x509CertSelector.getCertificate();
                    short sXd2 = (short) (Od.Xd() ^ (-5430));
                    int[] iArr2 = new int["E=S?\rSFEXVNZ`\u0016LO]`\u001bF$ *5Xfi_]a\\[oa".length()];
                    QB qb2 = new QB("E=S?\rSFEXVNZ`\u0016LO]`\u001bF$ *5Xfi_]a\\[oa");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Xg.qd("`_oOr`iedv[956Wzrxnu}o{", (short) (FB.Xd() ^ 8268), (short) (FB.Xd() ^ 15566)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        name = ((X500Principal) method.invoke(certificate2, objArr)).getName(strYd);
                        X509Certificate certificate3 = x509CertSelector.getCertificate();
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(Jg.Wd("\u0012B+o\u007f~D\u001cy@zQ&(\u001dl\u0002ajRnE\"eS*\u0010N~K)r\u000e:", (short) (Od.Xd() ^ (-11826)), (short) (Od.Xd() ^ (-11753)))).getMethod(ZO.xd("\\KN\u00135%fq\u000f/Xq^*g", (short) (FB.Xd() ^ 25455), (short) (FB.Xd() ^ 22887)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            string = ((BigInteger) method2.invoke(certificate3, objArr2)).toString();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else {
                    string = null;
                    name = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName(strYd) : x509CertSelector.getSubjectAsString();
                }
                hashSet.addAll(search(str, str3 + parseDN(name, str2) + str3, strArr));
                if (string != null && this.params.getSearchForSerialNumberIn() != null) {
                    setSearch = search(this.params.getSearchForSerialNumberIn(), str3 + string + str3, strArr);
                }
                return hashSet;
            }
            setSearch = search(str, str3, strArr);
            hashSet.addAll(setSearch);
            return hashSet;
        } catch (IOException e4) {
            throw new CertStoreException(C1626yg.Ud("\u0003\u001fdE\u00182dQX5fJUv/n=W&\b>\u0016v3\u0017xM3@[N", (short) (ZN.Xd() ^ 11255), (short) (ZN.Xd() ^ 13403)) + e4);
        }
    }

    private DirContext connectLDAP() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", LDAP_PROVIDER);
        properties.setProperty("java.naming.batchsize", AdkSettings.PLATFORM_TYPE_MOBILE);
        properties.setProperty("java.naming.provider.url", this.params.getLdapURL());
        properties.setProperty("java.naming.factory.url.pkgs", URL_CONTEXT_PREFIX);
        properties.setProperty("java.naming.referral", REFERRALS_IGNORE);
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    private Set getCACertificates(X509CertSelector x509CertSelector) throws Throwable {
        String[] strArr = {this.params.getCACertificateAttribute()};
        Set setCertSubjectSerialSearch = certSubjectSerialSearch(x509CertSelector, strArr, this.params.getLdapCACertificateAttributeName(), this.params.getCACertificateSubjectAttributeName());
        if (setCertSubjectSerialSearch.isEmpty()) {
            setCertSubjectSerialSearch.addAll(search(null, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return setCertSubjectSerialSearch;
    }

    private Set getCrossCertificates(X509CertSelector x509CertSelector) throws Throwable {
        String[] strArr = {this.params.getCrossCertificateAttribute()};
        Set setCertSubjectSerialSearch = certSubjectSerialSearch(x509CertSelector, strArr, this.params.getLdapCrossCertificateAttributeName(), this.params.getCrossCertificateSubjectAttributeName());
        if (setCertSubjectSerialSearch.isEmpty()) {
            setCertSubjectSerialSearch.addAll(search(null, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return setCertSubjectSerialSearch;
    }

    private Set getEndCertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        return certSubjectSerialSearch(x509CertSelector, new String[]{this.params.getUserCertificateAttribute()}, this.params.getLdapUserCertificateAttributeName(), this.params.getUserCertificateSubjectAttributeName());
    }

    private String parseDN(String str, String str2) {
        String strSubstring = str.substring(str.toLowerCase().indexOf(str2.toLowerCase()) + str2.length());
        int iIndexOf = strSubstring.indexOf(44);
        if (iIndexOf == -1) {
            iIndexOf = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf - 1) == '\\') {
            iIndexOf = strSubstring.indexOf(44, iIndexOf + 1);
            if (iIndexOf == -1) {
                iIndexOf = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith("\"")) {
            strSubstring3 = strSubstring3.substring(1);
        }
        return strSubstring3.endsWith("\"") ? strSubstring3.substring(0, strSubstring3.length() - 1) : strSubstring3;
    }

    private Set search(String str, String str2, String[] strArr) throws CertStoreException {
        String str3 = str + "=" + str2;
        DirContext dirContextConnectLDAP = null;
        if (str == null) {
            str3 = null;
        }
        HashSet hashSet = new HashSet();
        try {
            try {
                dirContextConnectLDAP = connectLDAP();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                for (String str4 : strArr) {
                    String[] strArr2 = {str4};
                    searchControls.setReturningAttributes(strArr2);
                    String str5 = "(&(" + str3 + ")(" + strArr2[0] + "=*))";
                    if (str3 == null) {
                        str5 = "(" + strArr2[0] + "=*)";
                    }
                    NamingEnumeration namingEnumerationSearch = dirContextConnectLDAP.search(this.params.getBaseDN(), str5, searchControls);
                    while (namingEnumerationSearch.hasMoreElements()) {
                        NamingEnumeration all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                        while (all.hasMore()) {
                            hashSet.add(all.next());
                        }
                    }
                }
                if (dirContextConnectLDAP != null) {
                    try {
                        dirContextConnectLDAP.close();
                    } catch (Exception unused) {
                    }
                }
                return hashSet;
            } catch (Exception e2) {
                throw new CertStoreException("Error getting results from LDAP directory " + e2);
            }
        } catch (Throwable th) {
            if (dirContextConnectLDAP != null) {
                try {
                    dirContextConnectLDAP.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws Throwable {
        String certificateRevocationListIssuerAttributeName;
        String name;
        String[] strArr = {this.params.getCertificateRevocationListAttribute()};
        if (!(cRLSelector instanceof X509CRLSelector)) {
            throw new CertStoreException(C1561oA.yd(")\u001c$\u001e\u001d/+/](3`028d\u0007F\u007f]Ycn~y\u0002\u0015\u001d\u0017\u0016($\b", (short) (C1499aX.Xd() ^ (-9508))));
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
        HashSet hashSet = new HashSet();
        String ldapCertificateRevocationListAttributeName = this.params.getLdapCertificateRevocationListAttributeName();
        HashSet hashSet2 = new HashSet();
        Collection<Object> issuerNames = x509CRLSelector.getIssuerNames();
        String strWd = Ig.wd("y", (short) (Od.Xd() ^ (-855)));
        if (issuerNames != null) {
            for (Object obj : x509CRLSelector.getIssuerNames()) {
                if (obj instanceof String) {
                    certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    name = (String) obj;
                } else {
                    certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    name = new X500Principal((byte[]) obj).getName(EO.Od("z'\bSR\b\u001c", (short) (ZN.Xd() ^ 20343)));
                }
                hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, strWd + parseDN(name, certificateRevocationListIssuerAttributeName) + strWd, strArr));
            }
        } else {
            hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, strWd, strArr));
        }
        hashSet2.addAll(search(null, strWd, strArr));
        Iterator it = hashSet2.iterator();
        String strQd = C1561oA.Qd("<\u0011\u0017\u0011\u0019", (short) (Od.Xd() ^ (-27637)));
        String strZd = C1593ug.zd("GI", (short) (FB.Xd() ^ 23138), (short) (FB.Xd() ^ 28991));
        short sXd = (short) (C1499aX.Xd() ^ (-14937));
        int[] iArr = new int["\\RfP\u001c`QN_[Q[_\u0013GHTU\u000e\"COPD@B;8J:\u001a45E?AG".length()];
        QB qb = new QB("\\RfP\u001c`QN_[Q[_\u0013GHTU\u000e\"COPD@B;8J:\u001a45E?AG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Kd("&\u001e4 m-#1+r\u0019;:282", (short) (C1580rY.Xd() ^ (-9073))));
            short sXd2 = (short) (FB.Xd() ^ 1891);
            short sXd3 = (short) (FB.Xd() ^ 19104);
            int[] iArr2 = new int["H\u00029F\u00123+5\u00119!\u0002b<>Y".length()];
            QB qb2 = new QB("H\u00029F\u00123+5\u00119!\u0002b<>Y");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[1] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {strQd, strZd};
            short sXd4 = (short) (C1607wl.Xd() ^ 3642);
            int[] iArr3 = new int["\u0004\u0003\u0013h\u000f\u0015\u0017\u0005\u0013\t\f".length()];
            QB qb3 = new QB("\u0004\u0003\u0013h\u000f\u0015\u0017\u0005\u0013\t\f");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                i4++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                while (it.hasNext()) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) it.next());
                    Class<?> cls2 = Class.forName(Wg.vd("&\u001e4 e,\u001f\u001e)'\u001f+)^\u0015\u0018\u001e![q\r\u001b\u001e\u0014\n\u000e\t\b\u0014\u0006g\u0004~\u0011\r\u0011\u0011", (short) (ZN.Xd() ^ 24307)));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(Qg.kd("KAU?\u000bEJ\b\"FGKI'GD61<", (short) (FB.Xd() ^ 11398), (short) (FB.Xd() ^ 24881)));
                    Object[] objArr2 = {byteArrayInputStream};
                    Method method = cls2.getMethod(hg.Vd("pmukwewgDRK", (short) (C1607wl.Xd() ^ 17317), (short) (C1607wl.Xd() ^ 5777)), clsArr2);
                    try {
                        method.setAccessible(true);
                        CRL crl = (CRL) method.invoke(certificateFactory, objArr2);
                        if (x509CRLSelector.match(crl)) {
                            hashSet.add(crl);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return hashSet;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            throw new CertStoreException(C1561oA.ud("6D=\u0010RO[ZZ^\tJL\u0006HSQUURTAQA?y?JFCt \u0017\u0013!oA3@A7>h", (short) (C1499aX.Xd() ^ (-16724))) + e4);
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws Throwable {
        Object[] objArr;
        Method method;
        if (!(certSelector instanceof X509CertSelector)) {
            throw new CertStoreException(C1561oA.Kd("wjrlk}y},v\u0002/~\u0001\u00073u5nLHR]\u0001\u000f\u0012q\u0005\r\u0007\u0006\u0018\u0014\u0018", (short) (Od.Xd() ^ (-2068))));
        }
        X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
        HashSet hashSet = new HashSet();
        Set<byte[]> endCertificates = getEndCertificates(x509CertSelector);
        endCertificates.addAll(getCACertificates(x509CertSelector));
        endCertificates.addAll(getCrossCertificates(x509CertSelector));
        short sXd = (short) (C1633zX.Xd() ^ (-31587));
        int[] iArr = new int["\u0018nvr|".length()];
        QB qb = new QB("\u0018nvr|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strQd = Xg.qd("\r\u000f", (short) (C1607wl.Xd() ^ 22551), (short) (C1607wl.Xd() ^ 12813));
        try {
            Class<?> cls = Class.forName(Jg.Wd("\b\u001c\u0011\u0017C$u\u000f\u0001XmXx\f]?(H]\u0011\u0013;\u001c-\nh\u0001Z\f\\WR0a7Y<", (short) (C1499aX.Xd() ^ (-30798)), (short) (C1499aX.Xd() ^ (-32610))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(ZO.xd("K+k\u001b\u001bz#\u0013\u0019%{$)\u0011\u000eK", (short) (C1633zX.Xd() ^ (-3132)), (short) (C1633zX.Xd() ^ (-23340))));
            clsArr[1] = Class.forName(C1626yg.Ud("/\rEv7/Z#&\nBHPL\u0015\u001b", (short) (C1580rY.Xd() ^ (-29830)), (short) (C1580rY.Xd() ^ (-14212))));
            Object[] objArr2 = {str, strQd};
            Method declaredMethod = cls.getDeclaredMethod(Ig.wd("P\u007f\u000b:>m\u001d(qU_", (short) (OY.Xd() ^ 11766)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr2);
                for (byte[] bArr : endCertificates) {
                    if (bArr != null && bArr.length != 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bArr);
                        try {
                            CertificatePair certificatePair = CertificatePair.getInstance(new ASN1InputStream(bArr).readObject());
                            arrayList.clear();
                            if (certificatePair.getForward() != null) {
                                arrayList.add(certificatePair.getForward().getEncoded());
                            }
                            if (certificatePair.getReverse() != null) {
                                arrayList.add(certificatePair.getReverse().getEncoded());
                            }
                        } catch (IOException | IllegalArgumentException unused) {
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) it.next());
                            try {
                                Class<?> cls2 = Class.forName(EO.Od("N\u0015.?\u000f)lM\"1 O#[n\u0019zdXsX\u0014*%Ti\b:mre'K\u0005p9\u001c", (short) (OY.Xd() ^ 26183)));
                                Class<?>[] clsArr2 = new Class[1];
                                clsArr2[0] = Class.forName(C1561oA.Qd(" \u0016*\u0014_\u001a\u001f\\v\u001b\u001c \u001e{\u001c\u0019\u000b\u0006\u0011", (short) (C1499aX.Xd() ^ (-13582))));
                                objArr = new Object[]{byteArrayInputStream};
                                method = cls2.getMethod(C1593ug.zd("87A9G7K=\u001c?MPFDHCBVH", (short) (C1607wl.Xd() ^ 31647), (short) (C1607wl.Xd() ^ 4716)), clsArr2);
                            } catch (Exception unused2) {
                                continue;
                            }
                            try {
                                method.setAccessible(true);
                                Certificate certificate = (Certificate) method.invoke(certificateFactory, objArr);
                                if (x509CertSelector.match(certificate)) {
                                    hashSet.add(certificate);
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                    }
                }
                return hashSet;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            throw new CertStoreException(C1561oA.od(":;GH<8:30B2k.+766:d&(a$/-11.0\u001d-\u001d\u001bU\u001b&\"\u001fP{rn|K\u001d\u000f\u001c\u001d\u0013\u001a^C", (short) (C1580rY.Xd() ^ (-2698))) + e4);
        }
    }
}
