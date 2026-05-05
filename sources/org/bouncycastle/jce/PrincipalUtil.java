package org.bouncycastle.jce;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.X509Name;
import yg.C1499aX;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class PrincipalUtil {
    public static X509Principal getIssuerX509Principal(X509CRL x509crl) throws CRLException {
        try {
            return new X509Principal(X509Name.getInstance(TBSCertList.getInstance(ASN1Primitive.fromByteArray(x509crl.getTBSCertList())).getIssuer()));
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    public static X509Principal getIssuerX509Principal(X509Certificate x509Certificate) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("\u007f'\b@8K\bU!m/\t9;<\fT%(!'qE\u001dzU#f\u000e`$q>}", (short) (C1633zX.Xd() ^ (-17267)), (short) (C1633zX.Xd() ^ (-462)))).getMethod(ZO.xd("X7\u0013Eh\"\u0013&(B\u007fh(X(\u00170", (short) (C1607wl.Xd() ^ 15560), (short) (C1607wl.Xd() ^ 8732)), new Class[0]);
            try {
                method.setAccessible(true);
                return new X509Principal(X509Name.getInstance(TBSCertificateStructure.getInstance(ASN1Primitive.fromByteArray((byte[]) method.invoke(x509Certificate, objArr))).getIssuer()));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new CertificateEncodingException(e3.toString());
        }
    }

    public static X509Principal getSubjectX509Principal(X509Certificate x509Certificate) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("T\b\u0006wo\u001fpv}\u001fukbL\u00173\u0003\u001ez\f;t3 *4U]5V\"i\u0004q", (short) (C1499aX.Xd() ^ (-17879)), (short) (C1499aX.Xd() ^ (-25473)))).getMethod(Ig.wd("\u001doJ\u0011L\u007f\u001ar \u0019\u000ej\u001e\f<\u0018_", (short) (FB.Xd() ^ 25874)), new Class[0]);
            try {
                method.setAccessible(true);
                return new X509Principal(X509Name.getInstance(TBSCertificateStructure.getInstance(ASN1Primitive.fromByteArray((byte[]) method.invoke(x509Certificate, objArr))).getSubject()));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new CertificateEncodingException(e3.toString());
        }
    }
}
