package org.bouncycastle.x509.util;

import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.AdkSettings;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class LDAPStoreHelper {
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private static int cacheSize = 32;
    private static long lifeTime = 60000;
    private Map cacheMap = new HashMap(cacheSize);
    private X509LDAPCertStoreParameters params;

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
        this.params = x509LDAPCertStoreParameters;
    }

    private synchronized void addToCache(String str, List list) {
        Date date = new Date(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        arrayList.add(date);
        arrayList.add(list);
        if (!this.cacheMap.containsKey(str) && this.cacheMap.size() >= cacheSize) {
            long time = date.getTime();
            Object key = null;
            for (Map.Entry entry : this.cacheMap.entrySet()) {
                long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                if (time2 < time) {
                    key = entry.getKey();
                    time = time2;
                }
            }
            this.cacheMap.remove(key);
        }
        Map map = this.cacheMap;
        map.put(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List attrCertSubjectSerialSearch(org.bouncycastle.x509.X509AttributeCertStoreSelector r8, java.lang.String[] r9, java.lang.String[] r10, java.lang.String[] r11) throws org.bouncycastle.util.StoreException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.attrCertSubjectSerialSearch(org.bouncycastle.x509.X509AttributeCertStoreSelector, java.lang.String[], java.lang.String[], java.lang.String[]):java.util.List");
    }

    private List cRLIssuerSearch(X509CRLStoreSelector x509CRLStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (x509CRLStoreSelector.getIssuers() != null) {
            hashSet.addAll(x509CRLStoreSelector.getIssuers());
        }
        if (x509CRLStoreSelector.getCertificateChecking() != null) {
            hashSet.add(getCertificateIssuer(x509CRLStoreSelector.getCertificateChecking()));
        }
        if (x509CRLStoreSelector.getAttrCertificateChecking() != null) {
            for (Principal principal : x509CRLStoreSelector.getAttrCertificateChecking().getIssuer().getPrincipals()) {
                if (principal instanceof X500Principal) {
                    hashSet.add(principal);
                }
            }
        }
        Iterator it = hashSet.iterator();
        String name = null;
        while (it.hasNext()) {
            name = ((X500Principal) it.next()).getName("RFC1779");
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, ProxyConfig.MATCH_ALL_SCHEMES + parseDN(name, str) + ProxyConfig.MATCH_ALL_SCHEMES, strArr));
            }
        }
        if (name == null) {
            arrayList.addAll(search(strArr2, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return arrayList;
    }

    private List certSubjectSerialSearch(X509CertStoreSelector x509CertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws Throwable {
        ArrayList arrayList = new ArrayList();
        String subjectAsString = getSubjectAsString(x509CertStoreSelector);
        String string = x509CertStoreSelector.getSerialNumber() != null ? x509CertStoreSelector.getSerialNumber().toString() : null;
        if (x509CertStoreSelector.getCertificate() != null) {
            X509Certificate certificate = x509CertStoreSelector.getCertificate();
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("Z\"\u0007O}\u0001\u0005<}\\O:j/^Dn\\o\u007f\u001c`\u0002\n;j\fR[\u000e\u001a;`l", (short) (OY.Xd() ^ 14176))).getMethod(C1561oA.Qd("\u0005\u0002\u0010m\u000fz\u0002{x\tkGA@_\u0001vznsyis", (short) (C1499aX.Xd() ^ (-750))), new Class[0]);
            try {
                method.setAccessible(true);
                subjectAsString = ((X500Principal) method.invoke(certificate, objArr)).getName(C1593ug.zd("5*(\u0017\u001e\u001f\"", (short) (C1580rY.Xd() ^ (-3662)), (short) (C1580rY.Xd() ^ (-5078))));
                X509Certificate certificate2 = x509CertStoreSelector.getCertificate();
                Class<?> cls = Class.forName(C1561oA.od("<2F0{@1.?;1;?r'(45m\u0017rlt}\u001f+, \u001c\u001e\u0017\u0014&\u0016", (short) (C1607wl.Xd() ^ 26224)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (OY.Xd() ^ 20676);
                int[] iArr = new int["#\"2\u0012%3+$0\u0013;4*.<".length()];
                QB qb = new QB("#\"2\u0012%3+$0\u0013;4*.<");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    string = ((BigInteger) method2.invoke(certificate2, objArr2)).toString();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        String strZd = Wg.Zd("X", (short) (C1499aX.Xd() ^ (-917)), (short) (C1499aX.Xd() ^ (-6110)));
        if (subjectAsString != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, strZd + parseDN(subjectAsString, str) + strZd, strArr));
            }
        }
        if (string != null && this.params.getSearchForSerialNumberIn() != null) {
            arrayList.addAll(search(splitString(this.params.getSearchForSerialNumberIn()), string, strArr));
        }
        if (string == null && subjectAsString == null) {
            arrayList.addAll(search(strArr2, strZd, strArr));
        }
        return arrayList;
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

    private Set createAttributeCertificates(List list, X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) x509AttrCertParser.engineRead();
                if (x509AttributeCertStoreSelector.match(x509AttributeCertificate)) {
                    hashSet.add(x509AttributeCertificate);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCRLs(List list, X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (x509CRLStoreSelector.match((Object) x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCerts(List list, X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (x509CertStoreSelector.match((Object) x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private Set createCrossCertificatePairs(List list, X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        X509CertificatePair x509CertificatePair;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < list.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) list.get(i2)));
                    x509CertificatePair = (X509CertificatePair) x509CertPairParser.engineRead();
                } catch (IOException | CertificateParsingException unused) {
                }
            } catch (StreamParsingException unused2) {
                int i3 = i2 + 1;
                x509CertificatePair = new X509CertificatePair(new CertificatePair(Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i2)).readObject()), Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i3)).readObject())));
                i2 = i3;
            }
            if (x509CertPairStoreSelector.match(x509CertificatePair)) {
                hashSet.add(x509CertificatePair);
            }
            i2++;
        }
        return hashSet;
    }

    private List crossCertificatePairSubjectSearch(X509CertPairStoreSelector x509CertPairStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws Throwable {
        ArrayList arrayList = new ArrayList();
        String subjectAsString = x509CertPairStoreSelector.getForwardSelector() != null ? getSubjectAsString(x509CertPairStoreSelector.getForwardSelector()) : null;
        if (x509CertPairStoreSelector.getCertPair() != null && x509CertPairStoreSelector.getCertPair().getForward() != null) {
            X509Certificate forward = x509CertPairStoreSelector.getCertPair().getForward();
            short sXd = (short) (C1607wl.Xd() ^ 6808);
            int[] iArr = new int["?7M9\u0007M@?RPHTZ\u0010FIWZ\u0015@\u001e\u001a$/R`cYW[VUi[".length()];
            QB qb = new QB("?7M9\u0007M@?RPHTZ\u0010FIWZ\u0015@\u001e\u001a$/R`cYW[VUi[");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd(",)7\u0015>*1+ 0\u0013npo\u000f0>B6;I9C", (short) (C1580rY.Xd() ^ (-26315))), new Class[0]);
            try {
                method.setAccessible(true);
                subjectAsString = ((X500Principal) method.invoke(forward, objArr)).getName(Qg.kd("\u0019\f\btyxy", (short) (C1633zX.Xd() ^ (-9509)), (short) (C1633zX.Xd() ^ (-29710))));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd2 = (short) (Od.Xd() ^ (-23946));
        short sXd3 = (short) (Od.Xd() ^ (-27670));
        int[] iArr2 = new int["K".length()];
        QB qb2 = new QB("K");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        if (subjectAsString != null) {
            for (String str2 : strArr3) {
                arrayList.addAll(search(strArr2, str + parseDN(subjectAsString, str2) + str, strArr));
            }
        }
        if (subjectAsString == null) {
            arrayList.addAll(search(strArr2, str, strArr));
        }
        return arrayList;
    }

    private X500Principal getCertificateIssuer(X509Certificate x509Certificate) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("YOcM\u0019]NK\\XNX\\\u0010DEQR\u000b4\u0010\n\u0012\u001b<HI=9;41C3", (short) (C1633zX.Xd() ^ (-27201))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-4256));
        int[] iArr = new int["dcsIlmpagN,(!Be]{qx\u0001jv".length()];
        QB qb = new QB("dcsIlmpagN,(!Be]{qx\u0001jv");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return (X500Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private List getFromCache(String str) {
        List list = (List) this.cacheMap.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (list == null || ((Date) list.get(0)).getTime() < jCurrentTimeMillis - lifeTime) {
            return null;
        }
        return (List) list.get(1);
    }

    private String getSubjectAsString(X509CertStoreSelector x509CertStoreSelector) {
        try {
            byte[] subjectAsBytes = x509CertStoreSelector.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new X500Principal(subjectAsBytes).getName("RFC1779");
            }
            return null;
        } catch (IOException e2) {
            throw new StoreException("exception processing name: " + e2.getMessage(), e2);
        }
    }

    private String parseDN(String str, String str2) {
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase() + "=");
        if (iIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(iIndexOf + str2.length());
        int iIndexOf2 = strSubstring.indexOf(44);
        if (iIndexOf2 == -1) {
            iIndexOf2 = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf2 - 1) == '\\') {
            iIndexOf2 = strSubstring.indexOf(44, iIndexOf2 + 1);
            if (iIndexOf2 == -1) {
                iIndexOf2 = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith("\"")) {
            strSubstring3 = strSubstring3.substring(1);
        }
        return strSubstring3.endsWith("\"") ? strSubstring3.substring(0, strSubstring3.length() - 1) : strSubstring3;
    }

    private List search(String[] strArr, String str, String[] strArr2) throws StoreException {
        String str2;
        DirContext dirContextConnectLDAP = null;
        if (strArr == null) {
            str2 = null;
        } else {
            if (str.equals("**")) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            String str3 = "";
            for (String str4 : strArr) {
                str3 = str3 + "(" + str4 + "=" + str + ")";
            }
            str2 = "(|" + str3 + ")";
        }
        String str5 = "";
        for (String str6 : strArr2) {
            str5 = str5 + "(" + str6 + "=*)";
        }
        String str7 = "(|" + str5 + ")";
        String str8 = "(&" + str2 + "" + str7 + ")";
        if (str2 != null) {
            str7 = str8;
        }
        List fromCache = getFromCache(str7);
        if (fromCache != null) {
            return fromCache;
        }
        ArrayList arrayList = new ArrayList();
        try {
            dirContextConnectLDAP = connectLDAP();
            SearchControls searchControls = new SearchControls();
            searchControls.setSearchScope(2);
            searchControls.setCountLimit(0L);
            searchControls.setReturningAttributes(strArr2);
            NamingEnumeration namingEnumerationSearch = dirContextConnectLDAP.search(this.params.getBaseDN(), str7, searchControls);
            while (namingEnumerationSearch.hasMoreElements()) {
                NamingEnumeration all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                while (all.hasMore()) {
                    arrayList.add(all.next());
                }
            }
            addToCache(str7, arrayList);
        } catch (NamingException unused) {
            if (dirContextConnectLDAP != null) {
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
        if (dirContextConnectLDAP != null) {
            try {
                dirContextConnectLDAP.close();
            } catch (Exception unused3) {
            }
        }
        return arrayList;
    }

    private String[] splitString(String str) {
        return str.split("\\s+");
    }

    public Collection getAACertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getAACertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAACertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAACertificateSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getAttributeAuthorityRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeAuthorityRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeAuthorityRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getAttributeCertificateAttributeAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeCertificateAttributeAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeCertificateAttributeSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getAttributeCertificateRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeCertificateRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeCertificateRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getAttributeDescriptorCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeDescriptorCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeDescriptorCertificateSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getAuthorityRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAuthorityRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAuthorityRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getCACertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getCACertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCACertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCACertificateSubjectAttributeName());
        Set setCreateCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector);
        if (setCreateCerts.size() == 0) {
            setCreateCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector));
        }
        return setCreateCerts;
    }

    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getCertificateRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCertificateRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCertificateRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getCrossCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCrossCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCrossCertificateSubjectAttributeName());
        Set setCreateCrossCertificatePairs = createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertPairStoreSelector);
        if (setCreateCrossCertificatePairs.size() == 0) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509CertPairStoreSelector2 = new X509CertPairStoreSelector();
            x509CertPairStoreSelector2.setForwardSelector(x509CertStoreSelector);
            x509CertPairStoreSelector2.setReverseSelector(x509CertStoreSelector);
            setCreateCrossCertificatePairs.addAll(createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector2, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertPairStoreSelector));
        }
        return setCreateCrossCertificatePairs;
    }

    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getDeltaRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapDeltaRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getDeltaRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        return setCreateCRLs;
    }

    public Collection getUserCertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        String[] strArrSplitString = splitString(this.params.getUserCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapUserCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getUserCertificateSubjectAttributeName());
        Set setCreateCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector);
        if (setCreateCerts.size() == 0) {
            setCreateCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector));
        }
        return setCreateCerts;
    }
}
