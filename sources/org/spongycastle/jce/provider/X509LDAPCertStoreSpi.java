package org.spongycastle.jce.provider;

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
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.x509.CertificatePair;
import org.spongycastle.jce.X509LDAPCertStoreParameters;
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
        HashSet hashSet = new HashSet();
        try {
            byte[] subjectAsBytes = x509CertSelector.getSubjectAsBytes();
            String strKd = Qg.kd("@", (short) (FB.Xd() ^ 27031), (short) (FB.Xd() ^ 29984));
            if (subjectAsBytes == null && x509CertSelector.getSubjectAsString() == null && x509CertSelector.getCertificate() == null) {
                hashSet.addAll(search(str, strKd, strArr));
            } else {
                X509Certificate certificate = x509CertSelector.getCertificate();
                String strVd = hg.Vd("\u0010\u0003~kpop", (short) (ZN.Xd() ^ 25575), (short) (ZN.Xd() ^ 25927));
                if (certificate != null) {
                    X509Certificate certificate2 = x509CertSelector.getCertificate();
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1561oA.ud("NDXB\u000eRC@QMCMQ\u00059:FG\u007f)\u0005~\u0007\u00101=>2.0)&8(", (short) (OY.Xd() ^ 1385))).getMethod(C1561oA.yd("\u001c\u001b+\u000b&\u0014\u001d\u0019 2\u0017thi\u000b..4*11#/", (short) (C1499aX.Xd() ^ (-4184))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        name = ((X500Principal) method.invoke(certificate2, objArr)).getName(strVd);
                        X509Certificate certificate3 = x509CertSelector.getCertificate();
                        short sXd = (short) (ZN.Xd() ^ 17780);
                        int[] iArr = new int["aYo[)obatrjv|2hky|7b@<FQt\u0003\u0006{y}xw\f}".length()];
                        QB qb = new QB("aYo[)obatrjv|2hky|7b@<FQt\u0003\u0006{y}xw\f}");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                            i2++;
                        }
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("feuUhvngsV~wmq\u007f", (short) (Od.Xd() ^ (-17729)), (short) (Od.Xd() ^ (-20858))), new Class[0]);
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
                    name = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName(strVd) : x509CertSelector.getSubjectAsString();
                }
                hashSet.addAll(search(str, strKd + parseDN(name, str2) + strKd, strArr));
                if (string != null && this.params.getSearchForSerialNumberIn() != null) {
                    hashSet.addAll(search(this.params.getSearchForSerialNumberIn(), strKd + string + strKd, strArr));
                }
            }
            return hashSet;
        } catch (IOException e4) {
            throw new CertStoreException(Jg.Wd("Ov[\u0007ka\u007f_\b+U\u0001w>iq\u001bba\u0004\u0016[vWyiSwt\u000e\u001d", (short) (C1633zX.Xd() ^ (-27520)), (short) (C1633zX.Xd() ^ (-19920))) + e4);
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
        String dn;
        String[] strArr = {this.params.getCertificateRevocationListAttribute()};
        if (!(cRLSelector instanceof X509CRLSelector)) {
            throw new CertStoreException(hg.Vd(")\u001a \u0018\u0015%\u001f!M\u0016\u001fJ\u0018\u0018\u001cF\u0007D{WQYbpio\u0001\u0007~{\f\u0006\b", (short) (Od.Xd() ^ (-31099)), (short) (Od.Xd() ^ (-23885))));
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
        HashSet hashSet = new HashSet();
        String ldapCertificateRevocationListAttributeName = this.params.getLdapCertificateRevocationListAttributeName();
        HashSet hashSet2 = new HashSet();
        Collection<Object> issuerNames = x509CRLSelector.getIssuerNames();
        String strXd = ZO.xd("D", (short) (C1580rY.Xd() ^ (-26881)), (short) (C1580rY.Xd() ^ (-27314)));
        if (issuerNames != null) {
            for (Object obj : x509CRLSelector.getIssuerNames()) {
                if (obj instanceof String) {
                    dn = parseDN((String) obj, this.params.getCertificateRevocationListIssuerAttributeName());
                } else {
                    String certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    X500Principal x500Principal = new X500Principal((byte[]) obj);
                    short sXd = (short) (C1580rY.Xd() ^ (-22127));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-5912));
                    int[] iArr = new int["f{\u0019\u0019\u0018s\u0006".length()];
                    QB qb = new QB("f{\u0019\u0019\u0018s\u0006");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                        i2++;
                    }
                    dn = parseDN(x500Principal.getName(new String(iArr, 0, i2)), certificateRevocationListIssuerAttributeName);
                }
                hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, strXd + dn + strXd, strArr));
            }
        } else {
            hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, strXd, strArr));
        }
        hashSet2.addAll(search(null, strXd, strArr));
        Iterator it = hashSet2.iterator();
        String strWd = Ig.wd("}\b?TS", (short) (C1633zX.Xd() ^ (-27944)));
        String strOd = EO.Od("b\u0001", (short) (ZN.Xd() ^ 26097));
        short sXd3 = (short) (C1499aX.Xd() ^ (-30719));
        int[] iArr2 = new int["=3G1|A2/@<2<@s()56n\u0003$01%!#\u001c\u0019+\u001bz\u0015\u0016& \"(".length()];
        QB qb2 = new QB("=3G1|A2/@<2<@s()56n\u0003$01%!#\u001c\u0019+\u001bz\u0015\u0016& \"(");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1593ug.zd("\u007fw\u000eyG\u0007|\u000b\u0005Lr\u0015\u0014\f\u0012\f", (short) (Od.Xd() ^ (-14644)), (short) (Od.Xd() ^ (-20263))));
            clsArr[1] = Class.forName(C1561oA.od("}s\bq=znzr8\\|yosk", (short) (C1633zX.Xd() ^ (-24332))));
            Object[] objArr = {strWd, strOd};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd("'&6\f28:(6,/", (short) (OY.Xd() ^ 21581)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                while (it.hasNext()) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) it.next());
                    Class<?> cls2 = Class.forName(Wg.Zd("xnz|H%\f!2&4>X\u0004PQUl%Qj\u000f\u0010y\u000e\u0010!\u0016>.\u000681aQkq", (short) (OY.Xd() ^ 12565), (short) (OY.Xd() ^ 920)));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(C1561oA.Xd("RJ`L\u001aV]\u001d9_bhhHji]Zg", (short) (FB.Xd() ^ 12117)));
                    Object[] objArr2 = {byteArrayInputStream};
                    Method method = cls2.getMethod(Wg.vd("QNVL`N`P5C<", (short) (C1607wl.Xd() ^ 14102)), clsArr2);
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
            throw new CertStoreException(Qg.kd("lzsF\t\u0006\u0012\u0011\u0011\u0015?\u0001\u0003<~\n\b\f\f\t\u000bw\bwu0u\u0001|y+VMIW&wivwmt\u001f", (short) (C1580rY.Xd() ^ (-11786)), (short) (C1580rY.Xd() ^ (-30449))) + e4);
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws Throwable {
        if (!(certSelector instanceof X509CertSelector)) {
            throw new CertStoreException(C1593ug.zd("\u000f\u0002\n\u0004\u0003\u0015\u0011\u0015C\u000e\u0019F\u0016\u0018\u001eJ\rL\u0006c_it\u0018&)\t\u001c$\u001e\u001d/+/", (short) (ZN.Xd() ^ 1134), (short) (ZN.Xd() ^ 7987)));
        }
        X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
        HashSet hashSet = new HashSet();
        Set<byte[]> endCertificates = getEndCertificates(x509CertSelector);
        endCertificates.addAll(getCACertificates(x509CertSelector));
        endCertificates.addAll(getCrossCertificates(x509CertSelector));
        String strUd = C1561oA.ud("\u0019msmu", (short) (C1633zX.Xd() ^ (-860)));
        short sXd = (short) (C1499aX.Xd() ^ (-21294));
        int[] iArr = new int["zk".length()];
        QB qb = new QB("zk");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(C1561oA.Yd("\u001f\u0017-\u0019f- \u001f20(4:o&)7:t\u000b.<?53721E7\u001958JFJR", (short) (OY.Xd() ^ 9700)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Xg.qd("\u001d\u0015+\u0017d$\u001a(\"i\u001021)/)", (short) (OY.Xd() ^ 32189), (short) (OY.Xd() ^ 32328)));
            clsArr[1] = Class.forName(Jg.Wd("Id\u001c#\u0014\u0007\u000e'T?V\u0006\u00161x\u0010", (short) (C1580rY.Xd() ^ (-8300)), (short) (C1580rY.Xd() ^ (-17886))));
            Object[] objArr = {strUd, str};
            short sXd2 = (short) (OY.Xd() ^ 22712);
            short sXd3 = (short) (OY.Xd() ^ 27083);
            int[] iArr2 = new int["Yv\rp3+<fF\u0014u".length()];
            QB qb2 = new QB("Yv\rp3+<fF\u0014u");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
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
                                Class<?> cls2 = Class.forName(C1626yg.Ud("1\fp:i[1\r551n\f\u0016 ;+3\b\u0013<'J\u0018In{tZ\fC!9[Og\r", (short) (FB.Xd() ^ 11495), (short) (FB.Xd() ^ 31126)));
                                Class<?>[] clsArr2 = new Class[1];
                                clsArr2[0] = Class.forName(Ig.wd("M~BH\r\fy\bd\u001d!D\u0015i\u001bb\r\u0017J", (short) (C1607wl.Xd() ^ 6923)));
                                Object[] objArr2 = {byteArrayInputStream};
                                short sXd4 = (short) (C1580rY.Xd() ^ (-28442));
                                int[] iArr3 = new int["i \r]4X\u0002,-=B,PQrT\b'1".length()];
                                QB qb3 = new QB("i \r]4X\u0002,-=B,PQrT\b'1");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                                try {
                                    method.setAccessible(true);
                                    Certificate certificate = (Certificate) method.invoke(certificateFactory, objArr2);
                                    if (x509CertSelector.match(certificate)) {
                                        hashSet.add(certificate);
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (Exception unused2) {
                                continue;
                            }
                        }
                    }
                }
                return hashSet;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            short sXd5 = (short) (ZN.Xd() ^ 30034);
            int[] iArr4 = new int["45AB624-*<,e(%1004^ \"[\u001e)'++(*\u0017'\u0017\u0015O\u0015 \u001c\u0019JulhvE\u0017\t\u0016\u0017\r\u0014X=".length()];
            QB qb4 = new QB("45AB624-*<,e(%1004^ \"[\u001e)'++(*\u0017'\u0017\u0015O\u0015 \u001c\u0019JulhvE\u0017\t\u0016\u0017\r\u0014X=");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(sXd5 + sXd5 + sXd5 + i5 + xuXd4.CK(iKK4));
                i5++;
            }
            throw new CertStoreException(new String(iArr4, 0, i5) + e4);
        }
    }
}
