package org.bouncycastle.cert.jcajce;

import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class JcaX509v3CertificateBuilder extends X509v3CertificateBuilder {
    public JcaX509v3CertificateBuilder(X509Certificate x509Certificate, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal, PublicKey publicKey) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-12685));
        short sXd2 = (short) (C1580rY.Xd() ^ (-23439));
        int[] iArr = new int["=3G1|A2/@<2<@s()56n\u0018smu~ ,-!\u001d\u001f\u0018\u0015'\u0017".length()];
        QB qb = new QB("=3G1|A2/@<2<@s()56n\u0018smu~ ,-!\u001d\u001f\u0018\u0015'\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("$!/\r.\u001a!\u001b\u0018(\u000bf`_~ \u0016\u001a\u000e\u0013\u0019\t\u0013", (short) (ZN.Xd() ^ 3459), (short) (ZN.Xd() ^ 15278)), new Class[0]);
        try {
            method.setAccessible(true);
            this((X500Principal) method.invoke(x509Certificate, objArr), bigInteger, date, date2, x500Principal, publicKey);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public JcaX509v3CertificateBuilder(X509Certificate x509Certificate, BigInteger bigInteger, Date date, Date date2, X500Name x500Name, PublicKey publicKey) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("\"\u0018,\u0016a&\u0017\u0014%!\u0017!%X\r\u000e\u001a\u001bS|XRZc\u0005\u0011\u0012\u0006\u0002\u0004|y\f{", (short) (ZN.Xd() ^ OlympusFocusInfoMakernoteDirectory.TagSensorTemperature)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-3923));
        int[] iArr = new int["zw\ng\rx\u0004}~\u000fuQONq\u0013\r\u0011\t\u000e\u0018\b\u0016".length()];
        QB qb = new QB("zw\ng\rx\u0004}~\u000fuQONq\u0013\r\u0011\t\u000e\u0018\b\u0016");
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
            this(X500Name.getInstance(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded()), bigInteger, date, date2, x500Name, publicKey);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public JcaX509v3CertificateBuilder(X500Principal x500Principal, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal2, PublicKey publicKey) {
        super(X500Name.getInstance(x500Principal.getEncoded()), bigInteger, date, date2, X500Name.getInstance(x500Principal2.getEncoded()), SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v3CertificateBuilder(X500Name x500Name, BigInteger bigInteger, Date date, Date date2, X500Name x500Name2, PublicKey publicKey) {
        super(x500Name, bigInteger, date, date2, x500Name2, SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v3CertificateBuilder(X500Name x500Name, BigInteger bigInteger, Time time, Time time2, X500Name x500Name2, PublicKey publicKey) {
        super(x500Name, bigInteger, time, time2, x500Name2, SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v3CertificateBuilder copyAndAddExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, X509Certificate x509Certificate) throws CertificateEncodingException {
        copyAndAddExtension(aSN1ObjectIdentifier, z2, new JcaX509CertificateHolder(x509Certificate));
        return this;
    }
}
