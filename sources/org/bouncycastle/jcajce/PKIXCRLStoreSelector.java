package org.bouncycastle.jcajce;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCRLStoreSelector<T extends CRL> implements Selector<T> {
    private final CRLSelector baseSelector;
    private final boolean completeCRLEnabled;
    private final boolean deltaCRLIndicator;
    private final byte[] issuingDistributionPoint;
    private final boolean issuingDistributionPointEnabled;
    private final BigInteger maxBaseCRLNumber;

    public static class Builder {
        private final CRLSelector baseSelector;
        private boolean deltaCRLIndicator = false;
        private boolean completeCRLEnabled = false;
        private BigInteger maxBaseCRLNumber = null;
        private byte[] issuingDistributionPoint = null;
        private boolean issuingDistributionPointEnabled = false;

        public Builder(CRLSelector cRLSelector) {
            this.baseSelector = (CRLSelector) cRLSelector.clone();
        }

        public PKIXCRLStoreSelector<? extends CRL> build() {
            return new PKIXCRLStoreSelector<>(this);
        }

        public Builder setCompleteCRLEnabled(boolean z2) {
            this.completeCRLEnabled = z2;
            return this;
        }

        public Builder setDeltaCRLIndicatorEnabled(boolean z2) {
            this.deltaCRLIndicator = z2;
            return this;
        }

        public void setIssuingDistributionPoint(byte[] bArr) {
            this.issuingDistributionPoint = Arrays.clone(bArr);
        }

        public void setIssuingDistributionPointEnabled(boolean z2) {
            this.issuingDistributionPointEnabled = z2;
        }

        public void setMaxBaseCRLNumber(BigInteger bigInteger) {
            this.maxBaseCRLNumber = bigInteger;
        }
    }

    private static class SelectorClone extends X509CRLSelector {
        private final PKIXCRLStoreSelector selector;

        SelectorClone(PKIXCRLStoreSelector pKIXCRLStoreSelector) {
            this.selector = pKIXCRLStoreSelector;
            if (pKIXCRLStoreSelector.baseSelector instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) pKIXCRLStoreSelector.baseSelector;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            PKIXCRLStoreSelector pKIXCRLStoreSelector = this.selector;
            return pKIXCRLStoreSelector == null ? crl != null : pKIXCRLStoreSelector.match(crl);
        }
    }

    private PKIXCRLStoreSelector(Builder builder) {
        this.baseSelector = builder.baseSelector;
        this.deltaCRLIndicator = builder.deltaCRLIndicator;
        this.completeCRLEnabled = builder.completeCRLEnabled;
        this.maxBaseCRLNumber = builder.maxBaseCRLNumber;
        this.issuingDistributionPoint = builder.issuingDistributionPoint;
        this.issuingDistributionPointEnabled = builder.issuingDistributionPointEnabled;
    }

    public static Collection<? extends CRL> getCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, CertStore certStore) throws CertStoreException {
        return certStore.getCRLs(new SelectorClone(pKIXCRLStoreSelector));
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }

    public X509Certificate getCertificateChecking() {
        CRLSelector cRLSelector = this.baseSelector;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    public byte[] getIssuingDistributionPoint() {
        return Arrays.clone(this.issuingDistributionPoint);
    }

    public BigInteger getMaxBaseCRLNumber() {
        return this.maxBaseCRLNumber;
    }

    public boolean isCompleteCRLEnabled() {
        return this.completeCRLEnabled;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.deltaCRLIndicator;
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.issuingDistributionPointEnabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (org.bouncycastle.util.Arrays.areEqual(r1, r0) == false) goto L33;
     */
    @Override // org.bouncycastle.util.Selector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean match(java.security.cert.CRL r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.security.cert.X509CRL
            if (r0 != 0) goto Lb
        L4:
            java.security.cert.CRLSelector r0 = r4.baseSelector
            boolean r0 = r0.match(r5)
            return r0
        Lb:
            r2 = r5
            java.security.cert.X509CRL r2 = (java.security.cert.X509CRL) r2
            r3 = 0
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Exception -> L6a
            byte[] r0 = r2.getExtensionValue(r0)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L28
            org.bouncycastle.asn1.ASN1OctetString r0 = org.bouncycastle.asn1.ASN1OctetString.getInstance(r0)     // Catch: java.lang.Exception -> L6a
            byte[] r0 = r0.getOctets()     // Catch: java.lang.Exception -> L6a
            org.bouncycastle.asn1.ASN1Integer r1 = org.bouncycastle.asn1.ASN1Integer.getInstance(r0)     // Catch: java.lang.Exception -> L6a
            goto L29
        L28:
            r1 = 0
        L29:
            boolean r0 = r4.isDeltaCRLIndicatorEnabled()
            if (r0 == 0) goto L32
            if (r1 != 0) goto L32
            return r3
        L32:
            boolean r0 = r4.isCompleteCRLEnabled()
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L3b
            return r3
        L3b:
            if (r1 == 0) goto L4f
            java.math.BigInteger r0 = r4.maxBaseCRLNumber
            if (r0 == 0) goto L4f
            java.math.BigInteger r1 = r1.getPositiveValue()
            java.math.BigInteger r0 = r4.maxBaseCRLNumber
            int r1 = r1.compareTo(r0)
            r0 = 1
            if (r1 != r0) goto L4f
            return r3
        L4f:
            boolean r0 = r4.issuingDistributionPointEnabled
            if (r0 == 0) goto L4
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint
            java.lang.String r0 = r0.getId()
            byte[] r1 = r2.getExtensionValue(r0)
            byte[] r0 = r4.issuingDistributionPoint
            if (r0 != 0) goto L64
            if (r1 == 0) goto L4
            return r3
        L64:
            boolean r0 = org.bouncycastle.util.Arrays.areEqual(r1, r0)
            if (r0 != 0) goto L4
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.PKIXCRLStoreSelector.match(java.security.cert.CRL):boolean");
    }
}
