package org.bouncycastle.x509;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.V2Form;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Selector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeCertificateIssuer implements CertSelector, Selector {
    final ASN1Encodable form;

    public AttributeCertificateIssuer(X500Principal x500Principal) throws IOException {
        this(new X509Principal(x500Principal.getEncoded()));
    }

    public AttributeCertificateIssuer(AttCertIssuer attCertIssuer) {
        this.form = attCertIssuer.getIssuer();
    }

    public AttributeCertificateIssuer(X509Principal x509Principal) {
        this.form = new V2Form(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))));
    }

    private Object[] getNames() {
        ASN1Encodable aSN1Encodable = this.form;
        GeneralName[] names = (aSN1Encodable instanceof V2Form ? ((V2Form) aSN1Encodable).getIssuerName() : (GeneralNames) aSN1Encodable).getNames();
        ArrayList arrayList = new ArrayList(names.length);
        for (int i2 = 0; i2 != names.length; i2++) {
            if (names[i2].getTagNo() == 4) {
                try {
                    arrayList.add(new X500Principal(names[i2].getName().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private boolean matchesDN(X500Principal x500Principal, GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i2 = 0; i2 != names.length; i2++) {
            GeneralName generalName = names[i2];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new X500Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return new AttributeCertificateIssuer(AttCertIssuer.getInstance(this.form));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeCertificateIssuer) {
            return this.form.equals(((AttributeCertificateIssuer) obj).form);
        }
        return false;
    }

    public Principal[] getPrincipals() {
        Object[] names = getNames();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 != names.length; i2++) {
            Object obj = names[i2];
            if (obj instanceof Principal) {
                arrayList.add(obj);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    public int hashCode() {
        return this.form.hashCode();
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) throws Throwable {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        ASN1Encodable aSN1Encodable = this.form;
        if (aSN1Encodable instanceof V2Form) {
            V2Form v2Form = (V2Form) aSN1Encodable;
            if (v2Form.getBaseCertificateID() != null) {
                BigInteger value = v2Form.getBaseCertificateID().getSerial().getValue();
                short sXd = (short) (C1607wl.Xd() ^ 10697);
                int[] iArr = new int["\u0003z\u0011|J\u0011\u0004\u0003\u0016\u0014\f\u0018\u001eS\n\r\u001b\u001eX\u0004a]gr\u0016$'\u001d\u001b\u001f\u001a\u0019-\u001f".length()];
                QB qb = new QB("\u0003z\u0011|J\u0011\u0004\u0003\u0016\u0014\f\u0018\u001eS\n\r\u001b\u001eX\u0004a]gr\u0016$'\u001d\u001b\u001f\u001a\u0019-\u001f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("\r\f\u001c{\u000f\u001d\u0015\u000e\u001a|%\u001e\u0014\u0018&", (short) (OY.Xd() ^ 9469), (short) (OY.Xd() ^ 3159)), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (!value.equals((BigInteger) method.invoke(x509Certificate, objArr))) {
                        return false;
                    }
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Jg.Wd("-?\tc[\u0011\u0017@BsZ\u0001f\u000f\u007fa#4YD\u0005+T\u0003T]\u007f\u0018\u0001$\"?>O", (short) (OY.Xd() ^ 1472), (short) (OY.Xd() ^ 2437))).getMethod(ZO.xd("JJoVv\u0015\u007f1GXO>'-\u0015(z\u000fho0B", (short) (C1580rY.Xd() ^ (-4022)), (short) (C1580rY.Xd() ^ (-15998))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        return matchesDN((X500Principal) method2.invoke(x509Certificate, objArr2), v2Form.getBaseCertificateID().getIssuer());
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            GeneralNames issuerName = v2Form.getIssuerName();
            Class<?> cls = Class.forName(C1626yg.Ud("C\u001dUU?(\u0004_\u000fU\u001d\u0019|\f\u0015(\f\u00132[\u0003v.\u0007ud2#cA\u007fMD{", (short) (ZN.Xd() ^ 6516), (short) (ZN.Xd() ^ 30799)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr3 = new Object[0];
            short sXd2 = (short) (C1633zX.Xd() ^ (-28331));
            int[] iArr2 = new int["\u001bAN\u0012{\u0013Cf!\u0013\u00013^\\-*KR\u0010Y\u001dVG".length()];
            QB qb2 = new QB("\u001bAN\u0012{\u0013Cf!\u0013\u00013^\\-*KR\u0010Y\u001dVG");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                i3++;
            }
            Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method3.setAccessible(true);
                if (matchesDN((X500Principal) method3.invoke(x509Certificate, objArr3), issuerName)) {
                    return true;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } else {
            GeneralNames generalNames = (GeneralNames) aSN1Encodable;
            short sXd3 = (short) (C1499aX.Xd() ^ (-8025));
            int[] iArr3 = new int["o9\u0010^jUo\u001dbO\u001cQ&L\u0002){stZzM\u0001\u000f4q\u0015Cn\u0003%Jm\u0004".length()];
            QB qb3 = new QB("o9\u0010^jUo\u001dbO\u001cQ&L\u0002){stZzM\u0001\u000f4q\u0015Cn\u0003%Jm\u0004");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i4)) + xuXd3.CK(iKK3));
                i4++;
            }
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Qd("ZWeCdPWQN^A\u001d\u0017\u00165VLPDIO?I", (short) (C1633zX.Xd() ^ (-21700))), new Class[0]);
            try {
                method4.setAccessible(true);
                if (matchesDN((X500Principal) method4.invoke(x509Certificate, objArr4), generalNames)) {
                    return true;
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return false;
    }
}
