package org.spongycastle.cert.selector.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.cert.selector.X509CertificateHolderSelector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JcaX509CertificateHolderSelector extends X509CertificateHolderSelector {
    /* JADX WARN: Illegal instructions before constructor call */
    public JcaX509CertificateHolderSelector(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("tj\u0003l4xmjwsmww+cdlm*S+%1:Wch\\TVSP^N", (short) (C1580rY.Xd() ^ (-27933)))).getMethod(Qg.kd("30>\u0012;:;*6\u001bvpo\u000f0&*\u001e#)\u0019#", (short) (OY.Xd() ^ 8659), (short) (OY.Xd() ^ 25876)), new Class[0]);
        try {
            method.setAccessible(true);
            X500Name x500NameConvertPrincipal = convertPrincipal((X500Principal) method.invoke(x509Certificate, objArr));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(hg.Vd("VL`J\u0016ZKHYUKUY\rABNO\b1\r\u0007\u000f\u00189EF:681.@0", (short) (ZN.Xd() ^ 11127), (short) (ZN.Xd() ^ 10078))).getMethod(C1561oA.ud("B?M+<H>5? F=13?", (short) (C1499aX.Xd() ^ (-7360))), new Class[0]);
            try {
                method2.setAccessible(true);
                super(x500NameConvertPrincipal, (BigInteger) method2.invoke(x509Certificate, objArr2), getSubjectKeyId(x509Certificate));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public JcaX509CertificateHolderSelector(X500Principal x500Principal, BigInteger bigInteger) {
        super(convertPrincipal(x500Principal), bigInteger);
    }

    public JcaX509CertificateHolderSelector(X500Principal x500Principal, BigInteger bigInteger, byte[] bArr) {
        super(convertPrincipal(x500Principal), bigInteger, bArr);
    }

    private static X500Name convertPrincipal(X500Principal x500Principal) {
        if (x500Principal == null) {
            return null;
        }
        return X500Name.getInstance(x500Principal.getEncoded());
    }

    private static byte[] getSubjectKeyId(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
        if (extensionValue != null) {
            return ASN1OctetString.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getOctets();
        }
        return null;
    }
}
