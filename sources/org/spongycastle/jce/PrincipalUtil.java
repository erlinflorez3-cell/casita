package org.spongycastle.jce;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.x509.TBSCertList;
import org.spongycastle.asn1.x509.TBSCertificateStructure;
import org.spongycastle.asn1.x509.X509Name;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Xg;
import yg.ZN;

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
            Method method = Class.forName(C1561oA.ud("UK_I\u0015YJGXTJTX\f@AMN\u00070\f\u0006\u000e\u00178DE9570-?/", (short) (OY.Xd() ^ 22937))).getMethod(C1561oA.yd("QP`A(:+Ndg][WRQe_", (short) (ZN.Xd() ^ 27828)), new Class[0]);
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
            Method method = Class.forName(C1561oA.Yd("|t\u000bvD\u000b}|\u0010\u000e\u0006\u0012\u0018M\u0004\u0007\u0015\u0018R}[Wal\u0010\u001e!\u0017\u0015\u0019\u0014\u0013'\u0019", (short) (FB.Xd() ^ 2831))).getMethod(Xg.qd("\u0004\u0003\u0013sbte\t\u0017\u001a\u0010\u000e\u0012\r\f \u0012", (short) (FB.Xd() ^ 17489), (short) (FB.Xd() ^ 20525)), new Class[0]);
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
