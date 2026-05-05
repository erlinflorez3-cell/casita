package org.bouncycastle.cert.selector.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class JcaX509CertificateHolderSelector extends X509CertificateHolderSelector {
    public JcaX509CertificateHolderSelector(X509Certificate x509Certificate) throws Throwable {
        Class<?> cls = Class.forName(C1593ug.zd("IAWC\u0011WJI\\ZR^d\u001aPSad\u001fJ($.9\\jmcae`_se", (short) (FB.Xd() ^ 6996), (short) (FB.Xd() ^ 13930)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-28214));
        int[] iArr = new int["vs\u0002U~}~my^:43Rsimafl\\f".length()];
        QB qb = new QB("vs\u0002U~}~my^:43Rsimafl\\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            X500Name x500NameConvertPrincipal = convertPrincipal((X500Principal) method.invoke(x509Certificate, objArr));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Kd("5-C/|C65HF>JP\u0006<?MP\u000b6\u0014\u0010\u001a%HVYOMQLK_Q", (short) (C1607wl.Xd() ^ 5325))).getMethod(Wg.Zd("=>\u0001\u0011\u001fc\u0018\u0007>Q,\u001dV\u0011\u0015", (short) (C1633zX.Xd() ^ (-22130)), (short) (C1633zX.Xd() ^ (-8038))), new Class[0]);
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
