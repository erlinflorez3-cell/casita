package org.spongycastle.x509;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.Holder;
import org.spongycastle.asn1.x509.IssuerSerial;
import org.spongycastle.asn1.x509.ObjectDigestInfo;
import org.spongycastle.jce.PrincipalUtil;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Selector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeCertificateHolder implements CertSelector, Selector {
    final Holder holder;

    public AttributeCertificateHolder(int i2, String str, String str2, byte[] bArr) {
        this.holder = new Holder(new ObjectDigestInfo(i2, new ASN1ObjectIdentifier(str2), new AlgorithmIdentifier(new ASN1ObjectIdentifier(str)), Arrays.clone(bArr)));
    }

    public AttributeCertificateHolder(X509Certificate x509Certificate) throws Throwable {
        try {
            GeneralNames generalNamesGenerateGeneralNames = generateGeneralNames(PrincipalUtil.getIssuerX509Principal(x509Certificate));
            Class<?> cls = Class.forName(C1561oA.od("\u0002w\fuA\u0006vs\u0005\u0001v\u0001\u00058lmyz3\\82:Cdpqeac\\Yk[", (short) (C1499aX.Xd() ^ (-19789))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-22470));
            int[] iArr = new int["98H(;IA:F)QJ@DR".length()];
            QB qb = new QB("98H(;IA:F)QJ@DR");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                this.holder = new Holder(new IssuerSerial(generalNamesGenerateGeneralNames, new ASN1Integer((BigInteger) method.invoke(x509Certificate, objArr))));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            Object[] objArr2 = {e3.getMessage()};
            Constructor<?> constructor = Class.forName(Wg.Zd("m-\t<O[\u0016Z3x6\nUPN\u0017l77\u0015}Q\u001cW\u001bf'mG~2\nc-i7v\u001b\u0017H\u0011d/l9~", (short) (C1607wl.Xd() ^ 11867), (short) (C1607wl.Xd() ^ 15314))).getConstructor(Class.forName(C1561oA.Xd("\u007fw\u000eyG\u0007|\u000b\u0005Lr\u0015\u0014\f\u0012\f", (short) (FB.Xd() ^ 5779))));
            try {
                constructor.setAccessible(true);
                throw ((CertificateParsingException) constructor.newInstance(objArr2));
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    public AttributeCertificateHolder(X500Principal x500Principal) {
        this(X509Util.convertPrincipal(x500Principal));
    }

    public AttributeCertificateHolder(X500Principal x500Principal, BigInteger bigInteger) {
        this(X509Util.convertPrincipal(x500Principal), bigInteger);
    }

    AttributeCertificateHolder(ASN1Sequence aSN1Sequence) {
        this.holder = Holder.getInstance(aSN1Sequence);
    }

    public AttributeCertificateHolder(X509Principal x509Principal) {
        this.holder = new Holder(generateGeneralNames(x509Principal));
    }

    public AttributeCertificateHolder(X509Principal x509Principal, BigInteger bigInteger) {
        this.holder = new Holder(new IssuerSerial(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))), new ASN1Integer(bigInteger)));
    }

    private GeneralNames generateGeneralNames(X509Principal x509Principal) {
        return GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal)));
    }

    private Object[] getNames(GeneralName[] generalNameArr) {
        ArrayList arrayList = new ArrayList(generalNameArr.length);
        for (int i2 = 0; i2 != generalNameArr.length; i2++) {
            if (generalNameArr[i2].getTagNo() == 4) {
                try {
                    arrayList.add(new X500Principal(generalNameArr[i2].getName().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private Principal[] getPrincipals(GeneralNames generalNames) {
        Object[] names = getNames(generalNames.getNames());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 != names.length; i2++) {
            Object obj = names[i2];
            if (obj instanceof Principal) {
                arrayList.add(obj);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    private boolean matchesDN(X509Principal x509Principal, GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i2 = 0; i2 != names.length; i2++) {
            GeneralName generalName = names[i2];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new X509Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x509Principal)) {
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
        return new AttributeCertificateHolder((ASN1Sequence) this.holder.toASN1Primitive());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeCertificateHolder) {
            return this.holder.equals(((AttributeCertificateHolder) obj).holder);
        }
        return false;
    }

    public String getDigestAlgorithm() {
        if (this.holder.getObjectDigestInfo() != null) {
            return this.holder.getObjectDigestInfo().getDigestAlgorithm().getAlgorithm().getId();
        }
        return null;
    }

    public int getDigestedObjectType() {
        if (this.holder.getObjectDigestInfo() != null) {
            return this.holder.getObjectDigestInfo().getDigestedObjectType().getValue().intValue();
        }
        return -1;
    }

    public Principal[] getEntityNames() {
        if (this.holder.getEntityName() != null) {
            return getPrincipals(this.holder.getEntityName());
        }
        return null;
    }

    public Principal[] getIssuer() {
        if (this.holder.getBaseCertificateID() != null) {
            return getPrincipals(this.holder.getBaseCertificateID().getIssuer());
        }
        return null;
    }

    public byte[] getObjectDigest() {
        if (this.holder.getObjectDigestInfo() != null) {
            return this.holder.getObjectDigestInfo().getObjectDigest().getBytes();
        }
        return null;
    }

    public String getOtherObjectTypeID() {
        if (this.holder.getObjectDigestInfo() == null) {
            return null;
        }
        this.holder.getObjectDigestInfo().getOtherObjectTypeID().getId();
        return null;
    }

    public BigInteger getSerialNumber() {
        if (this.holder.getBaseCertificateID() != null) {
            return this.holder.getBaseCertificateID().getSerial().getValue();
        }
        return null;
    }

    public int hashCode() {
        return this.holder.hashCode();
    }

    @Override // org.spongycastle.util.Selector
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (this.holder.getBaseCertificateID() != null) {
            BigInteger value = this.holder.getBaseCertificateID().getSerial().getValue();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("aWoY)mb_d`Zdl XYyz7`@:FOdpuiikhe\f{", (short) (C1633zX.Xd() ^ (-27971)))).getMethod(Qg.kd("\u0002~\rj{\b}t~_\u0006|pr~", (short) (ZN.Xd() ^ 14959), (short) (ZN.Xd() ^ 23301)), new Class[0]);
            try {
                method.setAccessible(true);
                return value.equals((BigInteger) method.invoke(x509Certificate, objArr)) && matchesDN(PrincipalUtil.getIssuerX509Principal(x509Certificate), this.holder.getBaseCertificateID().getIssuer());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (this.holder.getEntityName() != null && matchesDN(PrincipalUtil.getSubjectX509Principal(x509Certificate), this.holder.getEntityName())) {
            return true;
        }
        if (this.holder.getObjectDigestInfo() != null) {
            MessageDigest messageDigest = MessageDigest.getInstance(getDigestAlgorithm(), hg.Vd("^M", (short) (Od.Xd() ^ (-14327)), (short) (Od.Xd() ^ (-936))));
            int digestedObjectType = getDigestedObjectType();
            if (digestedObjectType == 0) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Yd("\u007fw\u000eyG\u000e\u0001\u007f\u0013\u0011\t\u0015\u001bP\u0007\n\u0018\u001bUk\u000f\u001d \u0016\u0014\u0018\u0013\u0012&\u0018", (short) (C1633zX.Xd() ^ (-2074)))).getMethod(Xg.qd(":9I&L:EC>'BW", (short) (Od.Xd() ^ (-20353)), (short) (Od.Xd() ^ (-16349))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    messageDigest.update(((PublicKey) method2.invoke(certificate, objArr2)).getEncoded());
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else if (digestedObjectType == 1) {
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.ud("6,@*u:+(95+59l!\"./g{\u001d)*\u001e\u001a\u001c\u0015\u0012$\u0014", (short) (OY.Xd() ^ 30160))).getMethod(C1561oA.yd("0/;\r3)2(&&", (short) (C1633zX.Xd() ^ (-4203))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    messageDigest.update((byte[]) method3.invoke(certificate, objArr3));
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            Arrays.areEqual(messageDigest.digest(), getObjectDigest());
        }
        return false;
        return false;
    }
}
