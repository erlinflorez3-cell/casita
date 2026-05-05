package org.spongycastle.x509;

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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AttCertIssuer;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.V2Form;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.util.Selector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
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

    @Override // java.security.cert.CertSelector, org.spongycastle.util.Selector
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

    @Override // org.spongycastle.util.Selector
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
                short sXd = (short) (C1499aX.Xd() ^ (-26293));
                short sXd2 = (short) (C1499aX.Xd() ^ (-24427));
                int[] iArr = new int["\u001540\u00025*\u0003gp\\ykWzW@D5U(kMEv\u0010\u0004tPs]F+5M".length()];
                QB qb = new QB("\u001540\u00025*\u0003gp\\ykWzW@D5U(kMEv\u0010\u0004tPs]F+5M");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("q\u001c\u0016{*\u001b\u0013\u0013\u001e\\75qKu", (short) (C1580rY.Xd() ^ (-7157)), (short) (C1580rY.Xd() ^ (-9445))), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (!value.equals((BigInteger) method.invoke(x509Certificate, objArr))) {
                        return false;
                    }
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1626yg.Ud("PP K J|W@IG\u0015\u0001p>|O\u0005=gm\u0001;!K0\\g6c\u000bOJ1", (short) (Od.Xd() ^ (-3820)), (short) (Od.Xd() ^ (-30890)))).getMethod(Ig.wd("2\u000be\u0019h\u000b7U\u0003oL'Wk\u0010O+ l\n;!", (short) (C1633zX.Xd() ^ (-12310))), new Class[0]);
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
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(EO.Od(">\u000ef,\"\f$L\u0011|K~Rz\u000e8\n\b\fPoEv~#Fl\u0012CZz\u001fDQ", (short) (C1580rY.Xd() ^ (-8502)))).getMethod(C1561oA.Qd("qn|Z{gnheuX4.-Lmcg[`fV`", (short) (Od.Xd() ^ (-16215))), new Class[0]);
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
            short sXd3 = (short) (C1633zX.Xd() ^ (-14019));
            short sXd4 = (short) (C1633zX.Xd() ^ (-14445));
            int[] iArr2 = new int["\u001a\u0012(\u0014a(\u001b\u001a-+#/5j!$25o\u001bxt~\n-;>42610D6".length()];
            QB qb2 = new QB("\u001a\u0012(\u0014a(\u001b\u001a-+#/5j!$25o\u001bxt~\n-;>42610D6");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                i3++;
            }
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od("|y\be\u0007rysp\u0001c?98Wxnrfkqak", (short) (OY.Xd() ^ 19160)), new Class[0]);
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
