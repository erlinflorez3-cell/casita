package org.spongycastle.cert.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.Time;
import org.spongycastle.cert.X509v3CertificateBuilder;
import yg.C1607wl;
import yg.C1626yg;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class JcaX509v3CertificateBuilder extends X509v3CertificateBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    public JcaX509v3CertificateBuilder(X509Certificate x509Certificate, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal, PublicKey publicKey) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("{s\nuC\n|{\u000f\r\u0005\u0011\u0017L\u0003\u0006\u0014\u0017Q|ZV`k\u000f\u001d \u0016\u0014\u0018\u0013\u0012&\u0018", (short) (Od.Xd() ^ (-7873)), (short) (Od.Xd() ^ (-28709)))).getMethod(Jg.Wd("Bg\u0010\u0016Y]\u000fi\u00019>2V/n:Hn\u000bj\u0011+M", (short) (C1607wl.Xd() ^ 15908), (short) (C1607wl.Xd() ^ 28998)), new Class[0]);
        try {
            method.setAccessible(true);
            this((X500Principal) method.invoke(x509Certificate, objArr), bigInteger, date, date2, x500Principal, publicKey);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JcaX509v3CertificateBuilder(X509Certificate x509Certificate, BigInteger bigInteger, Date date, Date date2, X500Name x500Name, PublicKey publicKey) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u0015\u0012Y{\u0015Y\u0005f]x\u001cV4E%w\\gl\u0017di(BV\u0002ZSO(Ir\u0001T", (short) (C1607wl.Xd() ^ 16472), (short) (C1607wl.Xd() ^ 24042))).getMethod(C1626yg.Ud("+%s\u000e;*\u000f-WF6Ub\u000eA!^d$Y=H4", (short) (ZN.Xd() ^ 31332), (short) (ZN.Xd() ^ 19355)), new Class[0]);
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
