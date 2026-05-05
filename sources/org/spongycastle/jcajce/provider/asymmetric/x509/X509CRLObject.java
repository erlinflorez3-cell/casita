package org.spongycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.CRLNumber;
import org.spongycastle.asn1.x509.CertificateList;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.TBSCertList;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
class X509CRLObject extends X509CRL {
    private JcaJceHelper bcHelper;

    /* JADX INFO: renamed from: c */
    private CertificateList f28004c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    protected X509CRLObject(JcaJceHelper jcaJceHelper, CertificateList certificateList) throws CRLException {
        this.bcHelper = jcaJceHelper;
        this.f28004c = certificateList;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(certificateList.getSignatureAlgorithm());
            if (certificateList.getSignatureAlgorithm().getParameters() != null) {
                this.sigAlgParams = certificateList.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded("DER");
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e2) {
            throw new CRLException("CRL contents invalid: " + e2);
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        if (!this.f28004c.getSignatureAlgorithm().equals(this.f28004c.getTBSCertList().getSignature())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("CRL does not verify with supplied public key.");
        }
    }

    private Set getExtensionOIDs(boolean z2) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.f28004c.getTBSCertList().getExtensions()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (z2 == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    static boolean isIndirectCRL(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
            if (extensionValue != null) {
                if (IssuingDistributionPoint.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e2);
        }
    }

    private Set loadCRLEntries() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.f28004c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name));
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (this.isHashCodeSet && x509CRLObject.isHashCodeSet && x509CRLObject.hashCodeValue != this.hashCodeValue) {
            return false;
        }
        return this.f28004c.equals(x509CRLObject.f28004c);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f28004c.getEncoded("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f28004c.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e2) {
            throw new IllegalStateException("error parsing " + e2.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.f28004c.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f28004c.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.f28004c.getNextUpdate() != null) {
            return this.f28004c.getNextUpdate().getDate();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.f28004c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (bigInteger.equals(cRLEntry.getUserCertificate().getValue())) {
                return new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set setLoadCRLEntries = loadCRLEntries();
        if (setLoadCRLEntries.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(setLoadCRLEntries);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f28004c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        byte[] bArr = this.sigAlgParams;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f28004c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.f28004c.getTBSCertList().getEncoded("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f28004c.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f28004c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(Extension.issuingDistributionPoint.getId());
        criticalExtensionOIDs.remove(Extension.deltaCRLIndicator.getId());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) throws Throwable {
        X500Name issuer;
        Extension extension;
        Class<?> cls = Class.forName(Jg.Wd("\u0011l4ONKm\u001a`\u0015>u-\u0019\u00033p\nu;\u0010T\u0007*[\u0016Bl2Z", (short) (C1580rY.Xd() ^ (-20468)), (short) (C1580rY.Xd() ^ (-29666))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-6770));
        short sXd2 = (short) (Od.Xd() ^ (-22099));
        int[] iArr = new int["(I\u0003q,}\u0003".length()];
        QB qb = new QB("(I\u0003q,}\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            if (!((String) method.invoke(certificate, objArr)).equals(C1626yg.Ud("+q\u000f\u001cD", (short) (FB.Xd() ^ 30098), (short) (FB.Xd() ^ 11638)))) {
                throw new IllegalArgumentException(C1561oA.Xd("\rckgqY}\u000e\t]43&&b;.:/g799k%{\u0004\u007f\nq\u00169GJ", (short) (FB.Xd() ^ 7678)));
            }
            Enumeration revokedCertificateEnumeration = this.f28004c.getRevokedCertificateEnumeration();
            X500Name issuer2 = this.f28004c.getIssuer();
            if (revokedCertificateEnumeration.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                short sXd3 = (short) (Od.Xd() ^ (-29005));
                int[] iArr2 = new int["\u0007F9\bKLV\fK8\u0019yP\u0013H$\rp\u00020J\rkyyn\f3Xg\u007f\u0016Wh".length()];
                QB qb2 = new QB("\u0007F9\bKLV\fK8\u0019yP\u0013H$\rp\u00020J\rkyyn\f3Xg\u007f\u0016Wh");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(EO.Od("rARY\u001cM(\u0011NTL,pgb", (short) (ZN.Xd() ^ 24587)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    BigInteger bigInteger = (BigInteger) method2.invoke(x509Certificate, objArr2);
                    while (revokedCertificateEnumeration.hasMoreElements()) {
                        TBSCertList.CRLEntry cRLEntry = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                        if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                            issuer2 = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                        }
                        if (cRLEntry.getUserCertificate().getValue().equals(bigInteger)) {
                            if (certificate instanceof X509Certificate) {
                                short sXd4 = (short) (C1633zX.Xd() ^ (-21777));
                                int[] iArr3 = new int["UK_I\u0015YJGXTJTX\f@AMN\u00070\f\u0006\u000e\u00178DE9570-?/".length()];
                                QB qb3 = new QB("UK_I\u0015YJGXTJTX\f@AMN\u00070\f\u0006\u000e\u00178DE9570-?/");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Object[] objArr3 = new Object[0];
                                Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1593ug.zd("SRb8cdgXfM+'(Ildj`goam", (short) (Od.Xd() ^ (-1496)), (short) (Od.Xd() ^ (-6275))), new Class[0]);
                                try {
                                    method3.setAccessible(true);
                                    issuer = X500Name.getInstance(((X500Principal) method3.invoke(x509Certificate, objArr3)).getEncoded());
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } else {
                                try {
                                    Object[] objArr4 = new Object[0];
                                    Method method4 = Class.forName(C1561oA.od("\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eyz\u0007\b@Tu\u0002\u0003vrtmj|l", (short) (C1607wl.Xd() ^ 25042))).getMethod(C1561oA.Kd("\b\u0007\u0017h\u0013\t\u0016\f\u000e\u000e", (short) (C1633zX.Xd() ^ (-16754))), new Class[0]);
                                    try {
                                        method4.setAccessible(true);
                                        issuer = org.spongycastle.asn1.x509.Certificate.getInstance((byte[]) method4.invoke(certificate, objArr4)).getIssuer();
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                } catch (CertificateEncodingException e4) {
                                    throw new IllegalArgumentException(Wg.Zd("d\u0018ZOm\b)\u000f\u000e )'j_\u0001\u0002Y{3\u00057O%X`fX4", (short) (C1499aX.Xd() ^ (-24898)), (short) (C1499aX.Xd() ^ (-5536))) + e4.getMessage());
                                }
                            }
                            return issuer2.equals(issuer);
                        }
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            return false;
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    @Override // java.security.cert.CRL
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("              Version: ");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(getVersion()).append(strLineSeparator);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(strLineSeparator);
        stringBuffer.append("          This update: ").append(getThisUpdate()).append(strLineSeparator);
        stringBuffer.append("          Next update: ").append(getNextUpdate()).append(strLineSeparator);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(strLineSeparator);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ").append(new String(Hex.encode(signature, 0, 20))).append(strLineSeparator);
        for (int i2 = 20; i2 < signature.length; i2 += 20) {
            if (i2 < signature.length - 20) {
                stringBuffer.append("                       ").append(new String(Hex.encode(signature, i2, 20))).append(strLineSeparator);
            } else {
                stringBuffer.append("                       ").append(new String(Hex.encode(signature, i2, signature.length - i2))).append(strLineSeparator);
            }
        }
        Extensions extensions = this.f28004c.getTBSCertList().getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            if (enumerationOids.hasMoreElements()) {
                stringBuffer.append("           Extensions: ").append(strLineSeparator);
            }
            while (enumerationOids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append("                       critical(").append(extension.isCritical()).append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals(Extension.cRLNumber)) {
                            stringBuffer.append(new CRLNumber(ASN1Integer.getInstance(aSN1InputStream.readObject()).getPositiveValue())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(Extension.deltaCRLIndicator)) {
                            stringBuffer.append("Base CRL: " + new CRLNumber(ASN1Integer.getInstance(aSN1InputStream.readObject()).getPositiveValue())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(Extension.issuingDistributionPoint)) {
                            stringBuffer.append(IssuingDistributionPoint.getInstance(aSN1InputStream.readObject())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(Extension.cRLDistributionPoints)) {
                            stringBuffer.append(CRLDistPoint.getInstance(aSN1InputStream.readObject())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(Extension.freshestCRL)) {
                            stringBuffer.append(CRLDistPoint.getInstance(aSN1InputStream.readObject())).append(strLineSeparator);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.getId());
                            stringBuffer.append(" value = ").append(ASN1Dump.dumpAsString(aSN1InputStream.readObject())).append(strLineSeparator);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(" value = *****").append(strLineSeparator);
                    }
                } else {
                    stringBuffer.append(strLineSeparator);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(strLineSeparator);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        Signature signature;
        try {
            signature = this.bcHelper.createSignature(getSigAlgName());
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
