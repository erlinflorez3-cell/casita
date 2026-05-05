package org.spongycastle.jcajce.provider.asymmetric.x509;

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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.SignedData;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemWriter;
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

    PKIXCertPath(InputStream inputStream, String str) throws Throwable {
        String strQd = Xg.qd("\t\u0003\t\f\b\t\t\r\u0010\u0002\u0002>\u0005\u000f\u0005\u0012\b\u000e\u0014\u000eaH", (short) (C1633zX.Xd() ^ (-23085)), (short) (C1633zX.Xd() ^ (-13397)));
        short sXd = (short) (C1607wl.Xd() ^ 19575);
        short sXd2 = (short) (C1607wl.Xd() ^ 23160);
        int[] iArr = new int["Fi;\u0004V".length()];
        QB qb = new QB("Fi;\u0004V");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        super(str2);
        BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
        this.helper = bCJcaJceHelper;
        try {
            if (str.equalsIgnoreCase(ZO.xd("]*_]\u001f\t\u0011", (short) (ZN.Xd() ^ 9638), (short) (ZN.Xd() ^ 27690)))) {
                ASN1Primitive object = new ASN1InputStream(inputStream).readObject();
                if (!(object instanceof ASN1Sequence)) {
                    short sXd3 = (short) (C1499aX.Xd() ^ (-22155));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-6603));
                    int[] iArr2 = new int["?EHNNzOQPDAN\u0002GSJY\u0007VX^\u000bO\\\\cQZ`\u0013U\u00157JF*\u001aNANSDNDG#{mosm)|pmqw}w1b~}ew\f\u00019\u007f\n\u007f\r\u0003\u0005\u0005A\u0007\u0005\u0019\u0007F\u001c\u0018I\u0017\u001b\u000e\u0012Nr\u0016$'\u0004\u0016*\u001f".length()];
                    QB qb2 = new QB("?EHNNzOQPDAN\u0002GSJY\u0007VX^\u000bO\\\\cQZ`\u0013U\u00157JF*\u001aNANSDNDG#{mosm)|pmqw}w1b~}ew\f\u00019\u007f\n\u007f\r\u0003\u0005\u0005A\u0007\u0005\u0019\u0007F\u001c\u0018I\u0017\u001b\u000e\u0012Nr\u0016$'\u0004\u0016*\u001f");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                        i3++;
                    }
                    String str3 = new String(iArr2, 0, i3);
                    Class<?> cls = Class.forName(C1561oA.od("bXlV\"fWTeaWae\u0019MNZ[\u0014(IUVJFHA>P@\u001fQ;<FI=B@", (short) (C1633zX.Xd() ^ (-30975))));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(C1561oA.Kd("91G3\u0001@6D>\u0006,NMEKE", (short) (C1580rY.Xd() ^ (-6805))));
                    Object[] objArr = {str3};
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
                java.security.cert.CertificateFactory certificateFactoryCreateCertificateFactory = bCJcaJceHelper.createCertificateFactory(str2);
                while (objects.hasMoreElements()) {
                    ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                    short sXd5 = (short) (Od.Xd() ^ (-12387));
                    short sXd6 = (short) (Od.Xd() ^ (-15706));
                    int[] iArr3 = new int["BQn".length()];
                    QB qb3 = new QB("BQn");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    byte[] encoded = aSN1Primitive.getEncoded(new String(iArr3, 0, i4));
                    List list = this.certificates;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encoded);
                    Class<?> cls2 = Class.forName(Ig.wd(")O\u0015\u001d(I\r`<ZM|\u0017Sv\\\u001d?\u001eiU\u001cyh_$}'2\u0013EF.\u001fQ\bp", (short) (C1499aX.Xd() ^ (-4936))));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(EO.Od("#JO\u00141Jf>)\u001c\u001a\u0003M<G)Ym3", (short) (C1580rY.Xd() ^ (-25887))));
                    Object[] objArr2 = {byteArrayInputStream};
                    Method method = cls2.getMethod(C1561oA.Qd("mjrhtbtdAbnoc_aZWiY", (short) (FB.Xd() ^ 11462)), clsArr2);
                    try {
                        method.setAccessible(true);
                        list.add(0, (Certificate) method.invoke(certificateFactoryCreateCertificateFactory, objArr2));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            } else {
                if (!str.equalsIgnoreCase(Wg.Zd("`8Kec", (short) (OY.Xd() ^ 27471), (short) (OY.Xd() ^ 24627))) && !str.equalsIgnoreCase(C1561oA.Xd("\u001f\u0015\u001e", (short) (FB.Xd() ^ 9998)))) {
                    String str4 = strQd + str;
                    Class<?> cls3 = Class.forName(Wg.vd("\u000b\u0001\u0019\u0003J\u000f\u0004\u0001\u001e\u001a\u0014\u001e\u001eQ\n\u000b\u0003\u0004@Tq}\u0003v~\u0001}z\tx[\u000e$%36&+-", (short) (C1580rY.Xd() ^ (-28149))));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(Qg.kd("[QeO\u001bXLXP\u0016:ZWMQI", (short) (C1607wl.Xd() ^ 15602), (short) (C1607wl.Xd() ^ 12648)));
                    Object[] objArr3 = {str4};
                    Constructor<?> constructor2 = cls3.getConstructor(clsArr3);
                    try {
                        constructor2.setAccessible(true);
                        throw ((CertificateException) constructor2.newInstance(objArr3));
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryCreateCertificateFactory2 = bCJcaJceHelper.createCertificateFactory(str2);
                while (true) {
                    Class<?> cls4 = Class.forName(hg.Vd("I?S=\tM>;LH>HL\u007f45ABz\u000f0<=1-/(%7'\u0007!\"2,.4", (short) (Od.Xd() ^ (-25632)), (short) (Od.Xd() ^ (-31623))));
                    Class<?>[] clsArr4 = new Class[1];
                    clsArr4[0] = Class.forName(C1561oA.ud("zp\u0005n:ty7QuvzxVvse`k", (short) (C1607wl.Xd() ^ 23174)));
                    Object[] objArr4 = {bufferedInputStream};
                    Method method2 = cls4.getMethod(C1561oA.yd("\u001e\u001d'\u001f-\u001d1#q\u0015#&\u001c\u001a\u001e\u0019\b\u001c\u000e", (short) (OY.Xd() ^ 26288)), clsArr4);
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
            Object[] objArr5 = {ZO.xd("|\u0007Lg\u0006\u001d\u0010oV\u001c,C\"m}S\rKo2C7$@-\rVjX\u0015sI$ZZaW\u001f\u0010]|N]", (short) (C1580rY.Xd() ^ (-8924)), (short) (C1580rY.Xd() ^ (-23736))) + e6.toString()};
            Constructor<?> constructor3 = Class.forName(C1626yg.Ud("EA\u001eP4\u0014QNqAQ\u0011s&!Uu7!d\u0004dv\\)\u000e7/\u0002i&+7G\u001e0\u0003w?", (short) (C1607wl.Xd() ^ 5532), (short) (C1607wl.Xd() ^ 11414))).getConstructor(Class.forName(Ig.wd("N|@G\r\u001ej8a\u001dDCqncG", (short) (C1580rY.Xd() ^ (-28808)))));
            try {
                constructor3.setAccessible(true);
                throw ((CertificateException) constructor3.newInstance(objArr5));
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (NoSuchProviderException e8) {
            Object[] objArr6 = {C1561oA.Yd("\u007f.5/%<\u0007&9;4.i;><D846DrBDJv>HOI@|UGIMG\u0003XW_PVP\n_[\rUTd\u0011S\u00137Zhka_c^]qcEadvrv~@\u0011", (short) (C1607wl.Xd() ^ 15569)) + e8.toString()};
            Constructor<?> constructor4 = Class.forName(Xg.qd("\\TjV$j]\\omeqw-cftw2Hky|rpton\u0003tU\nux\u0005\n\u007f\u0007\u0007", (short) (C1633zX.Xd() ^ (-20716)), (short) (C1633zX.Xd() ^ (-2765)))).getConstructor(Class.forName(Jg.Wd("l\u0004N\u001b|-\u0007%D<v8,t \n", (short) (FB.Xd() ^ 17178), (short) (FB.Xd() ^ 23800))));
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
        Method method = Class.forName(EO.Od("8d\u001e\")4\fS93Bu*R6_\u0012 \u0003Ww\u001cMU\u001bnT\u001aZR2\u0017{I", (short) (C1633zX.Xd() ^ (-26408)))).getMethod(C1561oA.Qd("74B\u0016?>?.:\u001fzts\u00134*.\"'-\u001d'", (short) (C1580rY.Xd() ^ (-7199))), new Class[0]);
        try {
            method.setAccessible(true);
            X500Principal x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
            for (int i2 = 1; i2 != list.size(); i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1593ug.zd("/'=)v=0/B@8DJ\u007f69GJ\u00050\u000e\n\u0014\u001fBPSIGKFEYK", (short) (Od.Xd() ^ (-23766)), (short) (Od.Xd() ^ (-4598)))).getMethod(C1561oA.od("!\u001e,\n+\u0017\u001e\u0018\u0015%\bc]\\{\u001d\u0013\u0017\u000b\u0010\u0016\u0006\u0010", (short) (OY.Xd() ^ 30284)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    if (!x500Principal.equals((X500Principal) method2.invoke(x509Certificate2, objArr2))) {
                        ArrayList arrayList = new ArrayList(list.size());
                        ArrayList arrayList2 = new ArrayList(list);
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            X509Certificate x509Certificate3 = (X509Certificate) list.get(i3);
                            Class<?> cls = Class.forName(C1561oA.Xd("#\u001b1\u001dj1$#64,8>s*-;>x$\u0002}\b\u00136DG=;?:9M?", (short) (C1607wl.Xd() ^ 20586)));
                            Class<?>[] clsArr = new Class[0];
                            Object[] objArr3 = new Object[0];
                            short sXd = (short) (ZN.Xd() ^ 28385);
                            int[] iArr = new int["54@ ?-2.);\u001cyqr\u00103GM?FJ<D".length()];
                            QB qb = new QB("54@ ?-2.);\u001cyqr\u00103GM?FJ<D");
                            int i4 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i4] = xuXd.fK((sXd ^ i4) + xuXd.CK(iKK));
                                i4++;
                            }
                            Method method3 = cls.getMethod(new String(iArr, 0, i4), clsArr);
                            try {
                                method3.setAccessible(true);
                                X500Principal x500Principal2 = (X500Principal) method3.invoke(x509Certificate3, objArr3);
                                int i5 = 0;
                                while (true) {
                                    if (i5 == list.size()) {
                                        arrayList.add(x509Certificate3);
                                        list.remove(i3);
                                        break;
                                    }
                                    X509Certificate x509Certificate4 = (X509Certificate) list.get(i5);
                                    Class<?> cls2 = Class.forName(Qg.kd("\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eyz\u0007\b@iE?GPq}~rnpifxh", (short) (C1580rY.Xd() ^ (-24013)), (short) (C1580rY.Xd() ^ (-10769))));
                                    Class<?>[] clsArr2 = new Class[0];
                                    Object[] objArr4 = new Object[0];
                                    short sXd2 = (short) (C1499aX.Xd() ^ (-7326));
                                    short sXd3 = (short) (C1499aX.Xd() ^ (-2716));
                                    int[] iArr2 = new int["{x\u0007Z\u0004\u0003\u0004r~c?98Wxnrfkqak".length()];
                                    QB qb2 = new QB("{x\u0007Z\u0004\u0003\u0004r~c?98Wxnrfkqak");
                                    int i6 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i6] = xuXd2.fK(sXd2 + i6 + xuXd2.CK(iKK2) + sXd3);
                                        i6++;
                                    }
                                    Method method4 = cls2.getMethod(new String(iArr2, 0, i6), clsArr2);
                                    try {
                                        method4.setAccessible(true);
                                        if (((X500Principal) method4.invoke(x509Certificate4, objArr4)).equals(x500Principal2)) {
                                            break;
                                        }
                                        i5++;
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
                        for (int i7 = 0; i7 != arrayList.size(); i7++) {
                            X509Certificate x509Certificate5 = (X509Certificate) arrayList.get(i7);
                            Object[] objArr5 = new Object[0];
                            Method method5 = Class.forName(C1561oA.ud("A7K5\u0001E63D@6@Dw,-9:r\u001cwqy\u0003$01%!#\u001c\u0019+\u001b", (short) (C1580rY.Xd() ^ (-22543)))).getMethod(C1561oA.yd("! 0\u0006)*-\u001e$\u000bhd]~\"\u001a8.5='3", (short) (FB.Xd() ^ 27039)), new Class[0]);
                            try {
                                method5.setAccessible(true);
                                X500Principal x500Principal3 = (X500Principal) method5.invoke(x509Certificate5, objArr5);
                                int i8 = 0;
                                while (true) {
                                    if (i8 < list.size()) {
                                        X509Certificate x509Certificate6 = (X509Certificate) list.get(i8);
                                        Object[] objArr6 = new Object[0];
                                        Method method6 = Class.forName(C1561oA.Yd("ldzf4zml\u007f}u\u0002\b=sv\u0005\bBmKGQ\\\u007f\u000e\u0011\u0007\u0005\t\u0004\u0003\u0017\t", (short) (C1499aX.Xd() ^ (-718)))).getMethod(Xg.qd("ihxX{irnm\u007fdB>?`\u0004{\u0002w~\u0007x\u0005", (short) (OY.Xd() ^ 7764), (short) (OY.Xd() ^ 32018)), new Class[0]);
                                        try {
                                            method6.setAccessible(true);
                                            if (x500Principal3.equals((X500Principal) method6.invoke(x509Certificate6, objArr6))) {
                                                arrayList.add(x509Certificate6);
                                                list.remove(i8);
                                                break;
                                            }
                                            i8++;
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
                    Method method7 = Class.forName(C1561oA.Kd("\u0019\u0011'\u0013`'\u001a\u0019,*\".4i #14n\u001aws}\t,:=3150/C5", (short) (C1580rY.Xd() ^ (-25771)))).getMethod(Wg.Zd("k6\u00169(xI\u0006i\u001cE\u000fWD5|X\u001alBwQ", (short) (C1607wl.Xd() ^ 27809), (short) (C1607wl.Xd() ^ 7531)), new Class[0]);
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
