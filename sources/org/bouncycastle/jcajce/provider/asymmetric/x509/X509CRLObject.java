package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.drew.metadata.iptc.IptcDirectory;
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
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
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
class X509CRLObject extends X509CRL {
    private JcaJceHelper bcHelper;

    /* JADX INFO: renamed from: c */
    private CertificateList f27639c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    protected X509CRLObject(JcaJceHelper jcaJceHelper, CertificateList certificateList) throws CRLException {
        this.bcHelper = jcaJceHelper;
        this.f27639c = certificateList;
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
        if (!this.f27639c.getSignatureAlgorithm().equals(this.f27639c.getTBSCertList().getSignature())) {
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
        if (getVersion() != 2 || (extensions = this.f27639c.getTBSCertList().getExtensions()) == null) {
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
        Enumeration revokedCertificateEnumeration = this.f27639c.getRevokedCertificateEnumeration();
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
        return this.f27639c.equals(x509CRLObject.f27639c);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f27639c.getEncoded("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f27639c.getTBSCertList().getExtensions();
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
        return new X509Principal(X500Name.getInstance(this.f27639c.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f27639c.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.f27639c.getNextUpdate() != null) {
            return this.f27639c.getNextUpdate().getDate();
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
        Enumeration revokedCertificateEnumeration = this.f27639c.getRevokedCertificateEnumeration();
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
        return this.f27639c.getSignatureAlgorithm().getAlgorithm().getId();
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
        return this.f27639c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.f27639c.getTBSCertList().getEncoded("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f27639c.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f27639c.getVersionNumber();
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
        Class<?> cls = Class.forName(C1561oA.Kd("+#9%r9,+><4@F{25CF\u0001\u0017:HKA?C>=QC", (short) (OY.Xd() ^ 12612)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 388);
        short sXd2 = (short) (FB.Xd() ^ 2289);
        int[] iArr = new int["Q]|*O\u0019\"".length()];
        QB qb = new QB("Q]|*O\u0019\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            if (!((String) method.invoke(certificate, objArr)).equals(C1561oA.Xd("lCKGQ", (short) (OY.Xd() ^ 917)))) {
                throw new IllegalArgumentException(Jg.Wd("|?0\u0018P%10[\u001cY\u0005gVz\u007faYv\u001e]Lr\u0011;@0\u0019\u0013%2A\u0002m", (short) (C1499aX.Xd() ^ (-13843)), (short) (C1499aX.Xd() ^ (-29592))));
            }
            Enumeration revokedCertificateEnumeration = this.f27639c.getRevokedCertificateEnumeration();
            X500Name issuer2 = this.f27639c.getIssuer();
            if (revokedCertificateEnumeration.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("d\\nZ,ra`wuiu\u007f5gj|\u007f6aC?EPw\u0006\u0005z|\u0001wvN@", (short) (Od.Xd() ^ (-6200)))).getMethod(Qg.kd("(%3\u0011\".$\u001b%\u0006,#\u0017\u0019%", (short) (C1580rY.Xd() ^ (-14327)), (short) (C1580rY.Xd() ^ (-345))), new Class[0]);
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
                                Class<?> cls2 = Class.forName(hg.Vd("zp\u0005n:~ol}yoy}1efrs,U1+3<]ij^Z\\URdT", (short) (OY.Xd() ^ 28858), (short) (OY.Xd() ^ 7955)));
                                Class<?>[] clsArr2 = new Class[0];
                                Object[] objArr3 = new Object[0];
                                short sXd3 = (short) (C1607wl.Xd() ^ 31564);
                                int[] iArr2 = new int["~{\n]\u0007\u0006\u0007u\u0002fB<;Z{quintdn".length()];
                                QB qb2 = new QB("~{\n]\u0007\u0006\u0007u\u0002fB<;Z{quintdn");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Method method3 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                                try {
                                    method3.setAccessible(true);
                                    issuer = X500Name.getInstance(((X500Principal) method3.invoke(x509Certificate, objArr3)).getEncoded());
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } else {
                                short sXd4 = (short) (ZN.Xd() ^ IptcDirectory.TAG_ACTION_ADVISED);
                                int[] iArr3 = new int["?7I5\u0007M<;B@4@J\u007f257:p\u0007.<;1#'\u001e\u001d5'".length()];
                                QB qb3 = new QB("?7I5\u0007M<;B@4@J\u007f257:p\u0007.<;1#'\u001e\u001d5'");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                                    i4++;
                                }
                                try {
                                    Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                                    Object[] objArr4 = new Object[0];
                                    Method method4 = cls3.getMethod(C1561oA.Yd("\u000e\r\u001dn\u0019\u000f\u001c\u0012\u0014\u0014", (short) (OY.Xd() ^ 28716)), new Class[0]);
                                    try {
                                        method4.setAccessible(true);
                                        issuer = org.bouncycastle.asn1.x509.Certificate.getInstance((byte[]) method4.invoke(certificate, objArr4)).getIssuer();
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                } catch (CertificateEncodingException e4) {
                                    throw new IllegalArgumentException(Xg.qd("t\u0014\"#%+W),*\u001f\"12_$'58.,0+*>0\u0006l", (short) (OY.Xd() ^ 17289), (short) (OY.Xd() ^ 20605)) + e4.getMessage());
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
        StringBuffer stringBufferAppend;
        Object cRLDistPoint;
        StringBuffer stringBufferAppend2;
        String str;
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
                stringBufferAppend2 = stringBuffer.append("                       ");
                str = new String(Hex.encode(signature, i2, 20));
            } else {
                stringBufferAppend2 = stringBuffer.append("                       ");
                str = new String(Hex.encode(signature, i2, signature.length - i2));
            }
            stringBufferAppend2.append(str).append(strLineSeparator);
        }
        Extensions extensions = this.f27639c.getTBSCertList().getExtensions();
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
                            cRLDistPoint = new CRLNumber(ASN1Integer.getInstance(aSN1InputStream.readObject()).getPositiveValue());
                        } else {
                            if (aSN1ObjectIdentifier.equals(Extension.deltaCRLIndicator)) {
                                stringBufferAppend = stringBuffer.append("Base CRL: " + new CRLNumber(ASN1Integer.getInstance(aSN1InputStream.readObject()).getPositiveValue()));
                            } else if (aSN1ObjectIdentifier.equals(Extension.issuingDistributionPoint)) {
                                cRLDistPoint = IssuingDistributionPoint.getInstance(aSN1InputStream.readObject());
                            } else if (aSN1ObjectIdentifier.equals(Extension.cRLDistributionPoints) || aSN1ObjectIdentifier.equals(Extension.freshestCRL)) {
                                cRLDistPoint = CRLDistPoint.getInstance(aSN1InputStream.readObject());
                            } else {
                                stringBuffer.append(aSN1ObjectIdentifier.getId());
                                stringBufferAppend = stringBuffer.append(" value = ").append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                            }
                            stringBufferAppend.append(strLineSeparator);
                        }
                        stringBufferAppend = stringBuffer.append(cRLDistPoint);
                        stringBufferAppend.append(strLineSeparator);
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
