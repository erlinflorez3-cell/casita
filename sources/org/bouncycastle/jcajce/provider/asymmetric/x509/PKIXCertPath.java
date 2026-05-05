package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
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
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final JcaJceHelper helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    PKIXCertPath(InputStream inputStream, String str) throws Throwable {
        String strOd = C1561oA.od("?7;<65356&$^#+\u001f*\u001e\"&\u001eoT", (short) (C1580rY.Xd() ^ (-367)));
        String strKd = C1561oA.Kd("M$,(2", (short) (Od.Xd() ^ (-30422)));
        super(strKd);
        BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
        this.helper = bCJcaJceHelper;
        try {
            if (str.equalsIgnoreCase(Wg.Zd("M=N\u0010&\u0014Z", (short) (OY.Xd() ^ 1678), (short) (OY.Xd() ^ 15922)))) {
                ASN1Primitive object = new ASN1InputStream(inputStream).readObject();
                if (!(object instanceof ASN1Sequence)) {
                    String strUd = C1561oA.ud("\u001c !%#M  \u001d\u000f\n\u0015F\n\u0014\t\u0016A\u000f\u000f\u0013=\u007f\u000b\t\u000ey\u0001\u00055u3Sd^@.`Q\\_NVJK%{kkme\u001fpb]_cg_\u0017F`]CSeX\u000fS[OZNNL\u0007JFXD\u0002UO~JL=?y\u001c=IJ%5G:", (short) (C1633zX.Xd() ^ (-4184)));
                    Class<?> cls = Class.forName(C1561oA.yd("\f\u0002\u0016\u007fS\u0018\t\u0006\u000f\u000b\u0001\u000b\u0017J~\u007f$%]q\u001b'(\u001c\u0010\u0012\u000b\b\"\u0012p#%&03/42", (short) (C1633zX.Xd() ^ (-11968))));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(C1561oA.Yd("\u001a\u0012(\u0014a!\u0017%\u001ff\r/.&,&", (short) (C1499aX.Xd() ^ (-13958))));
                    Object[] objArr = {strUd};
                    Constructor<?> constructor = cls.getConstructor(clsArr);
                    try {
                        constructor.setAccessible(true);
                        throw ((CertificateException) constructor.newInstance(objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Enumeration objects = ((ASN1Sequence) object).getObjects();
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryCreateCertificateFactory = bCJcaJceHelper.createCertificateFactory(strKd);
                while (objects.hasMoreElements()) {
                    byte[] encoded = ((ASN1Encodable) objects.nextElement()).toASN1Primitive().getEncoded(C1561oA.Xd("/1?", (short) (C1633zX.Xd() ^ (-5309))));
                    List list = this.certificates;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encoded);
                    Class<?> cls2 = Class.forName(Wg.vd("uk\u0004m5ynk\t\u0005~\t\t<tumn+?\\hmaikhescGaN^\\^`", (short) (OY.Xd() ^ 7586)));
                    Class<?>[] clsArr2 = new Class[1];
                    short sXd = (short) (Od.Xd() ^ (-5698));
                    short sXd2 = (short) (Od.Xd() ^ (-1529));
                    int[] iArr = new int["2(<&q,1n\t-.20\u000e.+\u001d\u0018#".length()];
                    QB qb = new QB("2(<&q,1n\t-.20\u000e.+\u001d\u0018#");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                        i2++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr2 = {byteArrayInputStream};
                    short sXd3 = (short) (ZN.Xd() ^ 1902);
                    short sXd4 = (short) (ZN.Xd() ^ 12406);
                    int[] iArr2 = new int["2/7-9'9)\u0006'34($&\u001f\u001c.\u001e".length()];
                    QB qb2 = new QB("2/7-9'9)\u0006'34($&\u001f\u001c.\u001e");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                        i3++;
                    }
                    Method method = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                    try {
                        method.setAccessible(true);
                        list.add(0, (Certificate) method.invoke(certificateFactoryCreateCertificateFactory, objArr2));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            } else {
                if (!str.equalsIgnoreCase(Xg.qd(";70A&", (short) (C1633zX.Xd() ^ (-22319)), (short) (C1633zX.Xd() ^ (-27587))))) {
                    short sXd5 = (short) (C1580rY.Xd() ^ (-25871));
                    short sXd6 = (short) (C1580rY.Xd() ^ (-14513));
                    int[] iArr3 = new int["D@j".length()];
                    QB qb3 = new QB("D@j");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd6) ^ sXd5));
                        i4++;
                    }
                    if (!str.equalsIgnoreCase(new String(iArr3, 0, i4))) {
                        String str2 = strOd + str;
                        short sXd7 = (short) (C1607wl.Xd() ^ 21853);
                        short sXd8 = (short) (C1607wl.Xd() ^ 13348);
                        int[] iArr4 = new int["\u007f\n\bi'u-y\u0010\u000e2HM#\nA\fuih\u0012*4XX9$AF\u0014i\u0014ngWE[o\u001c".length()];
                        QB qb4 = new QB("\u007f\n\bi'u-y\u0010\u000e2HM#\nA\fuih\u0012*4XX9$AF\u0014i\u0014ngWE[o\u001c");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd8) + sXd7)));
                            i5++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr4, 0, i5));
                        Class<?>[] clsArr3 = new Class[1];
                        clsArr3[0] = Class.forName(C1626yg.Ud("y\u000f@<\u000f\u0016K\u0004KfQE\u0006\u00103$", (short) (ZN.Xd() ^ 8069), (short) (ZN.Xd() ^ 17643)));
                        Object[] objArr3 = {str2};
                        Constructor<?> constructor2 = cls3.getConstructor(clsArr3);
                        try {
                            constructor2.setAccessible(true);
                            throw ((CertificateException) constructor2.newInstance(objArr3));
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryCreateCertificateFactory2 = bCJcaJceHelper.createCertificateFactory(strKd);
                while (true) {
                    Class<?> cls4 = Class.forName(Ig.wd("L\u001fDI\u0005tT1\u007f\u001f\u001aEv#n\r@JJ\nh@fY^\u007f\u0016^\u0002\u001f.e\u0002C#bJ", (short) (C1633zX.Xd() ^ (-21708))));
                    Class<?>[] clsArr4 = new Class[1];
                    short sXd9 = (short) (Od.Xd() ^ (-6071));
                    int[] iArr5 = new int[">}#/\u0016~j\u001b\u0015\u0019\u0017\u007fI(#\u0006E1\b".length()];
                    QB qb5 = new QB(">}#/\u0016~j\u001b\u0015\u0019\u0017\u007fI(#\u0006E1\b");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd9 + sXd9) + i6)) + xuXd5.CK(iKK5));
                        i6++;
                    }
                    clsArr4[0] = Class.forName(new String(iArr5, 0, i6));
                    Object[] objArr4 = {bufferedInputStream};
                    Method method2 = cls4.getMethod(C1561oA.Qd("ifndp^p`=^jk_[]VSeU", (short) (C1633zX.Xd() ^ (-31896))), clsArr4);
                    try {
                        method2.setAccessible(true);
                        Certificate certificate = (Certificate) method2.invoke(certificateFactoryCreateCertificateFactory2, objArr4);
                        if (certificate == null) {
                            break;
                        } else {
                            this.certificates.add(certificate);
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e6) {
            String str3 = Wg.Zd("YLW8(\u00175f`SgD\u001e\u0001 JUjWu{kw_)\u0017,c]Oi\u0010K[\u0013MT\u001dA\u0004|; ", (short) (C1499aX.Xd() ^ (-21144)), (short) (C1499aX.Xd() ^ (-11034))) + e6.toString();
            short sXd10 = (short) (ZN.Xd() ^ 9592);
            int[] iArr6 = new int["*\"8$q8+*=;3?Ez14BE\u007f\u00169GJ@>B=<PB#WCFRWMTT".length()];
            QB qb6 = new QB("*\"8$q8+*=;3?Ez14BE\u007f\u00169GJ@>B=<PB#WCFRWMTT");
            int i7 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd10 + i7));
                i7++;
            }
            Object[] objArr5 = {str3};
            Constructor<?> constructor3 = Class.forName(new String(iArr6, 0, i7)).getConstructor(Class.forName(Wg.vd("tl~j4sesi1Suphjd", (short) (C1633zX.Xd() ^ (-30310)))));
            try {
                constructor3.setAccessible(true);
                throw ((CertificateException) constructor3.newInstance(objArr5));
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (NoSuchProviderException e8) {
            String str4 = C1593ug.zd("O}\u0005~t\fVu\t\u000b\u0004}9\u000b\u000e\f\u0014\b\u0004\u0006\u0014B\u0012\u0014\u001aF\u000e\u0018\u001f\u0019\u0010L%\u0017\u0019\u001d\u0017R('/ & Y/+\\%$4`#b\u0007*8;1/3.-A3\u001514FBFN\u0010`", (short) (C1633zX.Xd() ^ (-8168)), (short) (C1633zX.Xd() ^ (-29995))) + e8.toString();
            short sXd11 = (short) (C1607wl.Xd() ^ 20221);
            int[] iArr7 = new int["%\u001b/\u0019d)\u001a\u0017($\u001a$([\u0010\u0011\u001d\u001eVj\f\u0018\u0019\r\t\u000b\u0004\u0001\u0013\u0003a\u0014}~\t\f\u007f\u0005\u0003".length()];
            QB qb7 = new QB("%\u001b/\u0019d)\u001a\u0017($\u001a$([\u0010\u0011\u001d\u001eVj\f\u0018\u0019\r\t\u000b\u0004\u0001\u0013\u0003a\u0014}~\t\f\u007f\u0005\u0003");
            int i8 = 0;
            while (qb7.YK()) {
                int iKK7 = qb7.KK();
                Xu xuXd7 = Xu.Xd(iKK7);
                iArr7[i8] = xuXd7.fK(sXd11 + sXd11 + i8 + xuXd7.CK(iKK7));
                i8++;
            }
            Object[] objArr6 = {str4};
            Constructor<?> constructor4 = Class.forName(new String(iArr7, 0, i8)).getConstructor(Class.forName(C1561oA.Kd("\u0010\b\u001e\nW\u0017\r\u001b\u0015\\\u0003%$\u001c\"\u001c", (short) (C1607wl.Xd() ^ 7535))));
            try {
                constructor4.setAccessible(true);
                throw ((CertificateException) constructor4.newInstance(objArr6));
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        }
    }

    PKIXCertPath(List list) {
        super("X.509");
        this.helper = new BCJcaJceHelper();
        this.certificates = sortCerts(new ArrayList(list));
    }

    private List sortCerts(List list) throws Throwable {
        if (list.size() < 2) {
            return list;
        }
        X509Certificate x509Certificate = (X509Certificate) list.get(0);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("`VjT dURc_U_c\u0017KLXY\u0012;\u0017\u0011\u0019\"COPD@B;8J:", (short) (C1580rY.Xd() ^ (-23339)), (short) (C1580rY.Xd() ^ (-1338)))).getMethod(hg.Vd("RO]1ZYZIU:\u0016\u0010\u000f.OEI=BH8B", (short) (C1499aX.Xd() ^ (-29033)), (short) (C1499aX.Xd() ^ (-14883))), new Class[0]);
        try {
            method.setAccessible(true);
            X500Principal x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
            for (int i2 = 1; i2 != list.size(); i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.ud("XNbL\u0018\\MJ[WMW[\u000fCDPQ\n3\u000f\t\u0011\u001a;GH<8:30B2", (short) (C1633zX.Xd() ^ (-9254)))).getMethod(C1561oA.yd("\u0010\u000f\u001f~\"\u0010\u0019\u0015\u0014&\u000bhde\u0007*\"(\u001e%-\u001f+", (short) (C1607wl.Xd() ^ 24730)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    if (!x500Principal.equals((X500Principal) method2.invoke(x509Certificate2, objArr2))) {
                        ArrayList arrayList = new ArrayList(list.size());
                        ArrayList arrayList2 = new ArrayList(list);
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            X509Certificate x509Certificate3 = (X509Certificate) list.get(i3);
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(Jg.Wd("IkPe_T\u0011>=e,c\u0014ww'#PW08b@\u0016\u0007A\u000f\u0012Z\u000bS\u001d|\u001d", (short) (ZN.Xd() ^ 30522), (short) (ZN.Xd() ^ 27880))).getMethod(ZO.xd("\\hN~`FG\u0014\u0015\u0012u\u000e\u0016e)KP.S586x", (short) (C1607wl.Xd() ^ 10407), (short) (C1607wl.Xd() ^ 27408)), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                X500Principal x500Principal2 = (X500Principal) method3.invoke(x509Certificate3, objArr3);
                                int i4 = 0;
                                while (true) {
                                    if (i4 == list.size()) {
                                        arrayList.add(x509Certificate3);
                                        list.remove(i3);
                                        break;
                                    }
                                    X509Certificate x509Certificate4 = (X509Certificate) list.get(i4);
                                    Class<?> cls = Class.forName(C1626yg.Ud("X\u0012\b\"\u0006`\nU\u0013C\u0015{\u0007\u0007SV\u0006e7KXCIvv\u001d\u001fEyZ\u0004=\u0016+", (short) (C1633zX.Xd() ^ (-26971)), (short) (C1633zX.Xd() ^ (-2738))));
                                    Class<?>[] clsArr = new Class[0];
                                    Object[] objArr4 = new Object[0];
                                    short sXd = (short) (OY.Xd() ^ 30578);
                                    int[] iArr = new int["\u0003.k`\u001bmc\u0004E\u0018vS\u0004*d>mp/N\u0004C".length()];
                                    QB qb = new QB("\u0003.k`\u001bmc\u0004E\u0018vS\u0004*d>mp/N\u0004C");
                                    int i5 = 0;
                                    while (qb.YK()) {
                                        int iKK = qb.KK();
                                        Xu xuXd = Xu.Xd(iKK);
                                        iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd + i5)));
                                        i5++;
                                    }
                                    Method method4 = cls.getMethod(new String(iArr, 0, i5), clsArr);
                                    try {
                                        method4.setAccessible(true);
                                        if (((X500Principal) method4.invoke(x509Certificate4, objArr4)).equals(x500Principal2)) {
                                            break;
                                        }
                                        i4++;
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                        if (arrayList.size() > 1) {
                            return arrayList2;
                        }
                        for (int i6 = 0; i6 != arrayList.size(); i6++) {
                            X509Certificate x509Certificate5 = (X509Certificate) arrayList.get(i6);
                            Object[] objArr5 = new Object[0];
                            Method method5 = Class.forName(EO.Od("r\u001acge\tX\u0018\u0006\u0010\u00072\u0007Gb\u00046TG,Dx\"*w\u00138V\u0010&nK8\u0006", (short) (Od.Xd() ^ (-24252)))).getMethod(C1561oA.Qd("\u0001}\f_\t\b\tw\u0004hD>=\\}swkpvfp", (short) (ZN.Xd() ^ 14304)), new Class[0]);
                            try {
                                method5.setAccessible(true);
                                X500Principal x500Principal3 = (X500Principal) method5.invoke(x509Certificate5, objArr5);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < list.size()) {
                                        X509Certificate x509Certificate6 = (X509Certificate) list.get(i7);
                                        Object[] objArr6 = new Object[0];
                                        Method method6 = Class.forName(C1593ug.zd("\b\u007f\u0016\u0002O\u0016\t\b\u001b\u0019\u0011\u001d#X\u000f\u0012 #]\tfblw\u001b),\" $\u001f\u001e2$", (short) (ZN.Xd() ^ 29325), (short) (ZN.Xd() ^ 10796))).getMethod(C1561oA.od("c`nLmY`ZWgJ& \u001f>_UYMRXHR", (short) (C1499aX.Xd() ^ (-17711))), new Class[0]);
                                        try {
                                            method6.setAccessible(true);
                                            if (x500Principal3.equals((X500Principal) method6.invoke(x509Certificate6, objArr6))) {
                                                arrayList.add(x509Certificate6);
                                                list.remove(i7);
                                                break;
                                            }
                                            i7++;
                                        } catch (InvocationTargetException e4) {
                                            throw e4.getCause();
                                        }
                                    }
                                }
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        }
                        return list.size() > 0 ? arrayList2 : arrayList;
                    }
                    X509Certificate x509Certificate7 = (X509Certificate) list.get(i2);
                    Object[] objArr7 = new Object[0];
                    Method method7 = Class.forName(C1561oA.Yd("NF\\H\u0016\\ONa_Wci\u001fUXfi$O-)3>aorhfjedxj", (short) (ZN.Xd() ^ 32750))).getMethod(Xg.qd("\u0002\u0001\u0011f\u0012\u0013\u0016\u0007\u0015{YUVw\u001b\u0013\u0019\u000f\u0016\u001e\u0010\u001c", (short) (C1633zX.Xd() ^ (-24205)), (short) (C1633zX.Xd() ^ (-4254))), new Class[0]);
                    try {
                        method7.setAccessible(true);
                        x500Principal = (X500Principal) method7.invoke(x509Certificate7, objArr7);
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            }
            return list;
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    private ASN1Primitive toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new ASN1InputStream(x509Certificate.getEncoded()).readObject();
        } catch (Exception e2) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e2.toString());
        }
    }

    private byte[] toDEREncoded(ASN1Encodable aSN1Encodable) throws CertificateEncodingException {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException("Exception thrown: " + e2);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.add(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new DERSequence(aSN1EncodableVector));
        }
        int i2 = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            ContentInfo contentInfo = new ContentInfo(PKCSObjectIdentifiers.data, null);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            while (i2 != this.certificates.size()) {
                aSN1EncodableVector2.add(toASN1Object((X509Certificate) this.certificates.get(i2)));
                i2++;
            }
            return toDEREncoded(new ContentInfo(PKCSObjectIdentifiers.signedData, new SignedData(new ASN1Integer(1L), new DERSet(), contentInfo, new DERSet(aSN1EncodableVector2), null, new DERSet())));
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PemWriter pemWriter = new PemWriter(new OutputStreamWriter(byteArrayOutputStream));
        while (i2 != this.certificates.size()) {
            try {
                pemWriter.writeObject(new PemObject("CERTIFICATE", ((X509Certificate) this.certificates.get(i2)).getEncoded()));
                i2++;
            } catch (Exception unused) {
                throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
        }
        pemWriter.close();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }
}
