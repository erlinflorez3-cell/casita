package org.bouncycastle.x509;

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
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.asn1.x509.ObjectDigestInfo;
import org.bouncycastle.jce.PrincipalUtil;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
            short sXd = (short) (C1633zX.Xd() ^ (-10952));
            int[] iArr = new int["4*>(s8)&73)37j\u001f ,-e\u000fjdlu\u0017#$\u0018\u0014\u0016\u000f\f\u001e\u000e".length()];
            QB qb = new QB("4*>(s8)&73)37j\u001f ,-e\u000fjdlu\u0017#$\u0018\u0014\u0016\u000f\f\u001e\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("KJZ:M[SLX;c\\RVd", (short) (ZN.Xd() ^ 29594), (short) (ZN.Xd() ^ 27203)), new Class[0]);
            try {
                method.setAccessible(true);
                this.holder = new Holder(new IssuerSerial(generalNamesGenerateGeneralNames, new ASN1Integer((BigInteger) method.invoke(x509Certificate, objArr))));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            Object[] objArr2 = {e3.getMessage()};
            Constructor<?> constructor = Class.forName(C1561oA.od("e[oY%iZWhdZdh\u001cPQ]^\u0017+LXYMIKDASC-=MMBF>\u001bM78BE9><", (short) (OY.Xd() ^ 21092))).getConstructor(Class.forName(C1561oA.Kd("KCYE\u0013RHVP\u0018>`_W]W", (short) (C1580rY.Xd() ^ (-1555)))));
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

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
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

    @Override // org.bouncycastle.util.Selector
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
            Method method = Class.forName(Wg.Zd("\u001eS\b.\u001aZ'd\u0016\n *J}N\f8xY#?U\u001dB LM\u0019Usl\u0006T$", (short) (OY.Xd() ^ 31753), (short) (OY.Xd() ^ 9426))).getMethod(C1561oA.Xd("\u0017\u0016&\u0006\u0019'\u001f\u0018$\u0007/(\u001e\"0", (short) (C1633zX.Xd() ^ (-6789))), new Class[0]);
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
            MessageDigest messageDigest = MessageDigest.getInstance(getDigestAlgorithm(), Wg.vd("\u0011\u0011", (short) (C1499aX.Xd() ^ (-26302))));
            int digestedObjectType = getDigestedObjectType();
            if (digestedObjectType == 0) {
                Class<?> cls = Class.forName(C1561oA.ud("G=Q;\u0007K<9JF<FJ}23?@x\r.:;/+-&#5%", (short) (ZN.Xd() ^ 30821)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (ZN.Xd() ^ 26664);
                int[] iArr = new int["nm}Z\u0001nywbKf{".length()];
                QB qb = new QB("nm}Z\u0001nywbKf{");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    messageDigest.update(((PublicKey) method2.invoke(certificate, objArr2)).getEncoded());
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else if (digestedObjectType == 1) {
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Qg.kd(";1E/z?0->:0:>q&'34l\u0001\"./#\u001f!\u001a\u0017)\u0019", (short) (OY.Xd() ^ 25522), (short) (OY.Xd() ^ 2154))).getMethod(hg.Vd("JGU%MAL@@>", (short) (Od.Xd() ^ (-9432)), (short) (Od.Xd() ^ (-17157))), new Class[0]);
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
