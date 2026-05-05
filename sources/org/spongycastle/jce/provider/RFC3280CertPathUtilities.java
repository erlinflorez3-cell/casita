package org.spongycastle.jce.provider;

import com.google.firebase.ktx.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.style.BCStyle;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.DistributionPointName;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.GeneralSubtree;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.NameConstraints;
import org.spongycastle.asn1.x509.PolicyInformation;
import org.spongycastle.jcajce.PKIXCRLStoreSelector;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {BuildConfig.VERSION_NAME, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    RFC3280CertPathUtilities() {
    }

    private static void checkCRL(DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) throws Throwable {
        Set<String> criticalExtensionOIDs;
        Date date2 = new Date(System.currentTimeMillis());
        if (date.getTime() > date2.getTime()) {
            throw new AnnotatedException(Xg.qd("R^jhdbvlss&{qvo+u\u0001.x~1x\t\t\u000b\t|F", (short) (C1580rY.Xd() ^ (-6747)), (short) (C1580rY.Xd() ^ (-27888))));
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(distributionPoint, x509Certificate, date2, pKIXExtendedParameters).iterator();
        boolean z2 = false;
        AnnotatedException e2 = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask reasonsMaskProcessCRLD = processCRLD(x509crl, distributionPoint);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        X509CRL x509crlProcessCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? processCRLH(CertPathValidatorUtilities.getDeltaCRLs(pKIXExtendedParameters.getDate() != null ? pKIXExtendedParameters.getDate() : date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()), processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1) {
                            short sXd = (short) (ZN.Xd() ^ 30219);
                            short sXd2 = (short) (ZN.Xd() ^ 29725);
                            int[] iArr = new int["`VjT dURc_U_c\u0017KLXY\u0012;\u0017\u0011\u0019\"COPD@B;8J:".length()];
                            QB qb = new QB("`VjT dURc_U_c\u0017KLXY\u0012;\u0017\u0011\u0019\"COPD@B;8J:");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                                i2++;
                            }
                            Class<?> cls = Class.forName(new String(iArr, 0, i2));
                            Object[] objArr = new Object[0];
                            Method method = cls.getMethod(hg.Vd("@=K$DH\u00148E5A", (short) (C1580rY.Xd() ^ (-12657)), (short) (C1580rY.Xd() ^ (-3366))), new Class[0]);
                            try {
                                method.setAccessible(true);
                                if (((Date) method.invoke(x509Certificate, objArr)).getTime() < x509crl.getThisUpdate().getTime()) {
                                    throw new AnnotatedException(C1561oA.ud("\u001b;j@*40*d\u0007\u0015\u000e`&.0\\\u001f0,+\u001d%*T(\u001c\u001f\u0016O\u0015\u001d\"\u001a\u000fW", (short) (Od.Xd() ^ (-19792))));
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                        processCRLB1(distributionPoint, x509Certificate, x509crl);
                        processCRLB2(distributionPoint, x509Certificate, x509crl);
                        processCRLC(x509crlProcessCRLH, x509crl, pKIXExtendedParameters);
                        processCRLI(date, x509crlProcessCRLH, x509Certificate, certStatus, pKIXExtendedParameters);
                        processCRLJ(date, x509crl, x509Certificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(Extension.issuingDistributionPoint.getId());
                            hashSet.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet.isEmpty()) {
                                short sXd3 = (short) (OY.Xd() ^ 3635);
                                int[] iArr2 = new int[",:3\u0006P[Y^BIMQ\u0005YQUNHGEOP@>p3A7I=63u(l~\u0002qy}jomq3".length()];
                                QB qb2 = new QB(",:3\u0006P[Y^BIMQ\u0005YQUNHGEOP@>p3A7I=63u(l~\u0002qy}jomq3");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                                    i3++;
                                }
                                throw new AnnotatedException(new String(iArr2, 0, i3));
                            }
                        }
                        if (x509crlProcessCRLH != null && (criticalExtensionOIDs = x509crlProcessCRLH.getCriticalExtensionOIDs()) != null) {
                            HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                            hashSet2.remove(Extension.issuingDistributionPoint.getId());
                            hashSet2.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet2.isEmpty()) {
                                throw new AnnotatedException(C1561oA.Yd("~!)2 _\u0004\u0014\u000fc(55<*39?lC=CFBCCGJ<<x=MEQGBAM\u0002H\\YKU[RYY\u001a", (short) (OY.Xd() ^ 12955)));
                            }
                        }
                        z2 = true;
                    } catch (AnnotatedException e4) {
                        e2 = e4;
                    }
                }
            } catch (AnnotatedException e5) {
                e2 = e5;
            }
        }
        if (!z2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cc A[PHI: r2
  0x00cc: PHI (r2v10 'e' org.spongycastle.jce.provider.AnnotatedException) = 
  (r2v9 'e' org.spongycastle.jce.provider.AnnotatedException)
  (r2v14 'e' org.spongycastle.jce.provider.AnnotatedException)
  (r2v9 'e' org.spongycastle.jce.provider.AnnotatedException)
 binds: [B:120:0x0086, B:128:0x00cb, B:122:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static void checkCRLs(org.spongycastle.jcajce.PKIXExtendedParameters r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.security.cert.X509Certificate r22, java.security.PublicKey r23, java.util.List r24, org.spongycastle.jcajce.util.JcaJceHelper r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.spongycastle.jcajce.PKIXExtendedParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00aa, code lost:
    
        r1 = r22[r16].iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00b4, code lost:
    
        if (r1.hasNext() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00b6, code lost:
    
        r2 = (org.spongycastle.jce.provider.PKIXPolicyNode) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00c6, code lost:
    
        if ("2.5.29.32.0".equals(r2.getValidPolicy()) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00d0, code lost:
    
        r12 = ((org.spongycastle.asn1.ASN1Sequence) org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r7, org.spongycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00d8, code lost:
    
        if (r12.hasMoreElements() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00da, code lost:
    
        r1 = org.spongycastle.asn1.x509.PolicyInformation.getInstance(r12.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00ee, code lost:
    
        if ("2.5.29.32.0".equals(r1.getPolicyIdentifier().getId()) == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00f0, code lost:
    
        r19 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r1.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00f9, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00ff, code lost:
    
        if (r7.getCriticalExtensionOIDs() == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0101, code lost:
    
        r10 = r7.getCriticalExtensionOIDs().contains(org.spongycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x010b, code lost:
    
        r2 = (org.spongycastle.jce.provider.PKIXPolicyNode) r2.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0119, code lost:
    
        if ("2.5.29.32.0".equals(r2.getValidPolicy()) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x011b, code lost:
    
        r14 = new org.spongycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r16, (java.util.Set) r4.get(r3), r2, r19, r3, r10);
        r2.addChild(r14);
        r22[r16].add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x018e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0196, code lost:
    
        throw new org.spongycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", r2, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0197, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x019f, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r2, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a0, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a8, code lost:
    
        throw new org.spongycastle.jce.exception.ExtCertPathValidatorException("Certificate policies extension could not be decoded.", r2, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00a8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static org.spongycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r20, int r21, java.util.List[] r22, org.spongycastle.jce.provider.PKIXPolicyNode r23, int r24) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.spongycastle.jce.provider.PKIXPolicyNode, int):org.spongycastle.jce.provider.PKIXPolicyNode");
    }

    protected static void prepareNextCertA(CertPath certPath, int i2) throws CertPathValidatorException {
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), POLICY_MAPPINGS));
            if (dERSequence != null) {
                for (int i3 = 0; i3 < dERSequence.size(); i3++) {
                    try {
                        ASN1Sequence dERSequence2 = DERSequence.getInstance(dERSequence.getObjectAt(i3));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(dERSequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(dERSequence2.getObjectAt(1));
                        if ("2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i2);
                        }
                        if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certPath, i2);
                        }
                    } catch (Exception e2) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e2, certPath, i2);
                    }
                }
            }
        } catch (AnnotatedException e3) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e3, certPath, i2);
        }
    }

    protected static void prepareNextCertG(CertPath certPath, int i2, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws CertPathValidatorException {
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = dERSequence != null ? NameConstraints.getInstance(dERSequence) : null;
            if (nameConstraints != null) {
                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (Exception e2) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e2, certPath, i2);
                    }
                }
                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i3 = 0; i3 != excludedSubtrees.length; i3++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i3]);
                        } catch (Exception e3) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e3, certPath, i2);
                        }
                    }
                }
            }
        } catch (Exception e4) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e4, certPath, i2);
        }
    }

    protected static int prepareNextCertH1(CertPath certPath, int i2, int i3) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i2)) || i3 == 0) ? i3 : i3 - 1;
    }

    protected static int prepareNextCertH2(CertPath certPath, int i2, int i3) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i2)) || i3 == 0) ? i3 : i3 - 1;
    }

    protected static int prepareNextCertH3(CertPath certPath, int i2, int i3) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i2)) || i3 == 0) ? i3 : i3 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002e, code lost:
    
        r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, false).getValue().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003b, code lost:
    
        if (r0 >= r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r1 = r0.get(r4)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.lang.String r0 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L48
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r1, r0)     // Catch: java.lang.Exception -> L48
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.DERSequence.getInstance(r0)     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L47
            java.util.Enumeration r2 = r0.getObjects()
        L1a:
            boolean r0 = r2.hasMoreElements()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r2.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3e
            org.spongycastle.asn1.ASN1TaggedObject r1 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r0)     // Catch: java.lang.IllegalArgumentException -> L3e
            int r0 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r0 != 0) goto L1a
            r0 = 0
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3e
            java.math.BigInteger r0 = r0.getValue()     // Catch: java.lang.IllegalArgumentException -> L3e
            int r0 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r0 >= r5) goto L47
            return r0
        L3e:
            r2 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r1 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r0 = "Policy constraints extension contents cannot be decoded."
            r1.<init>(r0, r2, r3, r4)
            throw r1
        L47:
            return r5
        L48:
            r2 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r1 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r0 = "Policy constraints extension cannot be decoded."
            r1.<init>(r0, r2, r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002f, code lost:
    
        r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r2, false).getValue().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
    
        if (r0 >= r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r1 = r0.get(r5)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.lang.String r0 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L49
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r1, r0)     // Catch: java.lang.Exception -> L49
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.DERSequence.getInstance(r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L48
            java.util.Enumeration r3 = r0.getObjects()
        L1a:
            boolean r0 = r3.hasMoreElements()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r3.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3f
            org.spongycastle.asn1.ASN1TaggedObject r2 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r0)     // Catch: java.lang.IllegalArgumentException -> L3f
            int r1 = r2.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3f
            r0 = 1
            if (r1 != r0) goto L1a
            r0 = 0
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L3f
            java.math.BigInteger r0 = r0.getValue()     // Catch: java.lang.IllegalArgumentException -> L3f
            int r0 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L3f
            if (r0 >= r6) goto L48
            return r0
        L3f:
            r2 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r1 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r0 = "Policy constraints extension contents cannot be decoded."
            r1.<init>(r0, r2, r4, r5)
            throw r1
        L48:
            return r6
        L49:
            r2 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r1 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r0 = "Policy constraints extension cannot be decoded."
            r1.<init>(r0, r2, r4, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    protected static int prepareNextCertJ(CertPath certPath, int i2, int i3) throws CertPathValidatorException {
        int iIntValue;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (iIntValue = aSN1Integer.getValue().intValue()) >= i3) ? i3 : iIntValue;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e2, certPath, i2);
        }
    }

    protected static void prepareNextCertK(CertPath certPath, int i2) throws CertPathValidatorException {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), BASIC_CONSTRAINTS));
            if (basicConstraints == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
            }
            if (!basicConstraints.isCA()) {
                throw new CertPathValidatorException("Not a CA certificate");
            }
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e2, certPath, i2);
        }
    }

    protected static int prepareNextCertL(CertPath certPath, int i2, int i3) throws CertPathValidatorException {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i2))) {
            return i3;
        }
        if (i3 > 0) {
            return i3 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i2);
    }

    protected static int prepareNextCertM(CertPath certPath, int i2, int i3) throws CertPathValidatorException {
        BigInteger pathLenConstraint;
        int iIntValue;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), BASIC_CONSTRAINTS));
            return (basicConstraints == null || (pathLenConstraint = basicConstraints.getPathLenConstraint()) == null || (iIntValue = pathLenConstraint.intValue()) >= i3) ? i3 : iIntValue;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e2, certPath, i2);
        }
    }

    protected static void prepareNextCertN(CertPath certPath, int i2) throws Throwable {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i2);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u00031%GuRCZL\u0001X\u001b\u007fEy\u0013\u0002;S7s\u0006\u001013\u0002b\u000fm\b\u0001\u0018\u000b3", (short) (C1580rY.Xd() ^ (-1646)), (short) (C1580rY.Xd() ^ (-31797)))).getMethod(ZO.xd("'Y^\u0019X$Z_\u001953", (short) (C1580rY.Xd() ^ (-19104)), (short) (C1580rY.Xd() ^ (-8969))), new Class[0]);
        try {
            method.setAccessible(true);
            boolean[] zArr = (boolean[]) method.invoke(x509Certificate, objArr);
            if (zArr != null && !zArr[5]) {
                throw new ExtCertPathValidatorException(C1626yg.Ud("\u001a~1\u0001\u0018n\tV5k2\u001epuqF\\\u0003cg.UwX*U\tL\u00138@<&]&\u00035\u000eR\u001a;3TR?G\u0015&\n\r9-\f63\fHE,=<)jN>S\u00159<\u0004U\u001a^-e\t\u00130@<Go", (short) (C1607wl.Xd() ^ 19198), (short) (C1607wl.Xd() ^ 18098)), null, certPath, i2);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected static void prepareNextCertO(CertPath certPath, int i2, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e2) {
                throw new CertPathValidatorException(e2.getMessage(), e2.getCause(), certPath, i2);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i2);
        }
    }

    protected static Set processCRLA1i(Date date, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, X509CRL x509crl) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
            try {
                String str = FRESHEST_CRL;
                CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, str));
                if (cRLDistPoint == null) {
                    try {
                        cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    } catch (AnnotatedException e2) {
                        throw new AnnotatedException("Freshest CRL extension could not be decoded from CRL.", e2);
                    }
                }
                if (cRLDistPoint != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(pKIXExtendedParameters.getCRLStores());
                    try {
                        arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()));
                        try {
                            hashSet.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), arrayList));
                        } catch (AnnotatedException e3) {
                            throw new AnnotatedException("Exception obtaining delta CRLs.", e3);
                        }
                    } catch (AnnotatedException e4) {
                        throw new AnnotatedException("No new delta CRL locations could be added from Freshest CRL extension.", e4);
                    }
                }
            } catch (AnnotatedException e5) {
                throw new AnnotatedException("Freshest CRL extension could not be decoded from certificate.", e5);
            }
        }
        return hashSet;
    }

    protected static Set[] processCRLA1ii(Date date, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, X509CRL x509crl) throws Throwable {
        HashSet hashSet = new HashSet();
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.setCertificateChecking(x509Certificate);
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCRLStoreSelector<? extends CRL> pKIXCRLStoreSelectorBuild = new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build();
            if (pKIXExtendedParameters.getDate() != null) {
                date = pKIXExtendedParameters.getDate();
            }
            Set setFindCRLs = CRL_UTIL.findCRLs(pKIXCRLStoreSelectorBuild, date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                try {
                    hashSet.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()));
                } catch (AnnotatedException e2) {
                    throw new AnnotatedException("Exception obtaining delta CRLs.", e2);
                }
            }
            return new Set[]{setFindCRLs, hashSet};
        } catch (IOException e3) {
            throw new AnnotatedException("Cannot extract issuer from CRL." + e3, e3);
        }
    }

    protected static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z2 = true;
        boolean z3 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                boolean z4 = false;
                for (int i2 = 0; i2 < names.length; i2++) {
                    if (names[i2].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i2].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z4 = true;
                            }
                        } catch (IOException e2) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e2);
                        }
                    }
                }
                if (z4 && !z3) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (!z4) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                z2 = z4;
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z2 = false;
            }
            if (!z2) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e3) {
            throw new AnnotatedException("Exception encoding CRL issuer: " + e3.getMessage(), e3);
        }
    }

    protected static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        int i2;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                    ArrayList arrayList = new ArrayList();
                    if (distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            arrayList.add(generalName);
                        }
                    }
                    if (distributionPoint2.getType() == 1) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                            while (objects.hasMoreElements()) {
                                aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                            }
                            aSN1EncodableVector.add(distributionPoint2.getName());
                            arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                        } catch (Exception e2) {
                            throw new AnnotatedException("Could not read CRL issuer.", e2);
                        }
                    }
                    if (distributionPoint.getDistributionPoint() == null) {
                        if (distributionPoint.getCRLIssuer() == null) {
                            throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                        }
                        GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                        while (i2 < names.length) {
                            i2 = arrayList.contains(names[i2]) ? 0 : i2 + 1;
                        }
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] names2 = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            names2 = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            names2 = new GeneralName[1];
                            try {
                                names2[0] = new GeneralName(X500Name.getInstance(PrincipalUtils.getEncodedIssuerPrincipal(obj).getEncoded()));
                            } catch (Exception e3) {
                                throw new AnnotatedException("Could not read certificate issuer.", e3);
                            }
                        }
                        for (int i3 = 0; i3 < names2.length; i3++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names2[i3].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            names2[i3] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names2 != null) {
                        while (i2 < names2.length) {
                            i2 = arrayList.contains(names2[i2]) ? 0 : i2 + 1;
                        }
                    }
                    throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        }
                        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e4) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e4);
                }
            }
        } catch (Exception e5) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0032, code lost:
    
        if (r2.equals(r0) != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static void processCRLC(java.security.cert.X509CRL r4, java.security.cert.X509CRL r5, org.spongycastle.jcajce.PKIXExtendedParameters r6) throws org.spongycastle.jce.provider.AnnotatedException {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r3 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT     // Catch: java.lang.Exception -> L8d
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r5, r3)     // Catch: java.lang.Exception -> L8d
            org.spongycastle.asn1.x509.IssuingDistributionPoint r2 = org.spongycastle.asn1.x509.IssuingDistributionPoint.getInstance(r0)     // Catch: java.lang.Exception -> L8d
            boolean r0 = r6.isUseDeltasEnabled()
            if (r0 == 0) goto L74
            org.spongycastle.asn1.x500.X500Name r1 = org.spongycastle.jce.provider.PrincipalUtils.getIssuerPrincipal(r4)
            org.spongycastle.asn1.x500.X500Name r0 = org.spongycastle.jce.provider.PrincipalUtils.getIssuerPrincipal(r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L62
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, r3)     // Catch: java.lang.Exception -> L59
            org.spongycastle.asn1.x509.IssuingDistributionPoint r0 = org.spongycastle.asn1.x509.IssuingDistributionPoint.getInstance(r0)     // Catch: java.lang.Exception -> L59
            if (r2 != 0) goto L2e
            if (r0 != 0) goto L51
            goto L34
        L2e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
        L34:
            java.lang.String r0 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.AUTHORITY_KEY_IDENTIFIER     // Catch: org.spongycastle.jce.provider.AnnotatedException -> L48
            org.spongycastle.asn1.ASN1Primitive r1 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r5, r0)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> L48
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, r0)     // Catch: org.spongycastle.jce.provider.AnnotatedException -> L3f
            goto L6a
        L3f:
            r2 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Authority key identifier extension could not be extracted from delta CRL."
            r1.<init>(r0, r2)
            throw r1
        L48:
            r2 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Authority key identifier extension could not be extracted from complete CRL."
            r1.<init>(r0, r2)
            throw r1
        L51:
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Issuing distribution point extension from delta CRL and complete CRL does not match."
            r1.<init>(r0)
            throw r1
        L59:
            r2 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Issuing distribution point extension from delta CRL could not be decoded."
            r1.<init>(r0, r2)
            throw r1
        L62:
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Complete CRL issuer does not match delta CRL issuer."
            r1.<init>(r0)
            throw r1
        L6a:
            if (r1 == 0) goto L85
            if (r0 == 0) goto L7d
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
        L74:
            return
        L75:
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Delta CRL authority key identifier does not match complete CRL authority key identifier."
            r1.<init>(r0)
            throw r1
        L7d:
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Delta CRL authority key identifier is null."
            r1.<init>(r0)
            throw r1
        L85:
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "CRL authority key identifier is null."
            r1.<init>(r0)
            throw r1
        L8d:
            r2 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.processCRLC(java.security.cert.X509CRL, java.security.cert.X509CRL, org.spongycastle.jcajce.PKIXExtendedParameters):void");
    }

    protected static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e2) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e2);
        }
    }

    protected static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) throws Throwable {
        int i2;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            try {
                Collection collectionFindCertificates = CertPathValidatorUtilities.findCertificates(pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertificateStores());
                collectionFindCertificates.addAll(CertPathValidatorUtilities.findCertificates(pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertStores()));
                collectionFindCertificates.add(x509Certificate);
                Iterator it = collectionFindCertificates.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            PKIXCertPathBuilderSpi pKIXCertPathBuilderSpi = new PKIXCertPathBuilderSpi();
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e2) {
                            short sXd = (short) (Od.Xd() ^ (-19110));
                            int[] iArr = new int[" \u001a+F<#\fYT89da\t\u0006'P Og2b\b3-Ny.[m?;X$y-\u0013m\nz\fgv".length()];
                            QB qb = new QB(" \u001a+F<#\fYT89da\t\u0006'P Og2b\b3-Ny.[m?;X$y-\u0013m\nz\fgv");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                                i3++;
                            }
                            throw new AnnotatedException(new String(iArr, 0, i3), e2);
                        } catch (CertPathValidatorException e3) {
                            throw new AnnotatedException(Ig.wd("\u000edA)l:\ti)#Ex=G|-c\u007f\u0018\u0019\u000b\u000f'4fc~0d\u00114I(\u001aH8\u0004+$m)e4\u0015\u0004\u0013Z3\u0006\u000e9^ADWkk@lsb,L", (short) (C1580rY.Xd() ^ (-28782))), e3);
                        } catch (Exception e4) {
                            throw new AnnotatedException(e4.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i2 = 0; i2 < arrayList.size(); i2++) {
                    X509Certificate x509Certificate3 = (X509Certificate) arrayList.get(i2);
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1561oA.Qd("^ThR\u001ebSPa]S]a\u0015IJVW\u00109\u0015\u000f\u0017 AMNB>@96H8", (short) (C1633zX.Xd() ^ (-30570)))).getMethod(C1593ug.zd("\u001a\u0019)\u0001\u001c1\u000e-\u001c#\"", (short) (ZN.Xd() ^ 3159), (short) (ZN.Xd() ^ 8985)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        boolean[] zArr = (boolean[]) method.invoke(x509Certificate3, objArr);
                        if (zArr == null || (zArr.length >= 7 && zArr[6])) {
                            hashSet.add(arrayList2.get(i2));
                        } else {
                            annotatedException = new AnnotatedException(C1561oA.od("#LKL;Gs67CD846/,>.g2+>c85\"'$]\"4/\u001f'+ %#S\u0017!\u0016#N\u001c\u001c J\u001a\u000e\u001a\u0014\u000f\u0019Cesl?\u0012\u0007\u0004\n\u0004\b\u007fE", (short) (ZN.Xd() ^ 746)));
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException(C1561oA.Kd("\f+9:<Bn6:@7s6uM9EC?{FQRUFT\u0003GJX[QOSNMaS\u001d", (short) (Od.Xd() ^ (-26019))));
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e6) {
                short sXd2 = (short) (C1633zX.Xd() ^ (-21960));
                short sXd3 = (short) (C1633zX.Xd() ^ (-28018));
                int[] iArr2 = new int["qK3dT\t&o\u0011\u000eW<XcKp\u0004$FtE.\u000b6dN*\u0015xM5ej\u0006oXZ\u0016o;,DW{b4".length()];
                QB qb2 = new QB("qK3dT\t&o\u0011\u000eW<XcKp\u0004$FtE.\u000b6dN*\u0015xM5ej\u0006oXZ\u0016o;,DW{b4");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i4++;
                }
                throw new AnnotatedException(new String(iArr2, 0, i4), e6);
            }
        } catch (IOException e7) {
            throw new AnnotatedException(C1561oA.Xd("1TBKGFX\u0005IYQ]O]UN\u000eU_c\u0012VYgj`^b]\\pb\u001eremgfxtx'|x*qu{r/y\u0005\u0006\ty\b6z}\f\u000f\u0005\u0003\u0007\u0002\u0001\u0015\u0007B\n\u0014\u0018FjzuJ\u000f\u001c#\u001b\u0014P \"(T\u0018\u001cW,\u001f/i", (short) (OY.Xd() ^ 16133)), e7);
        }
    }

    protected static PublicKey processCRLG(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e2 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e2);
    }

    protected static X509CRL processCRLH(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e2 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e2);
    }

    protected static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    protected static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    protected static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, int i2, PublicKey publicKey, boolean z2, X500Name x500Name, X509Certificate x509Certificate, JcaJceHelper jcaJceHelper) throws Throwable {
        String strVd = Wg.vd("\u0018CLB5oAAAkE/51/+YI\u0007IFRWKCEB?M=\u0015y", (short) (ZN.Xd() ^ 8834));
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(i2);
        if (!z2) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e2) {
                throw new ExtCertPathValidatorException(Qg.kd("Z\u0006\u000b\u0001w2\u007f\u007f\u0004.\u0004mwsmi{k%ghtuieg`]o_\u0019k`]cUggcU\u001d", (short) (C1633zX.Xd() ^ (-26250)), (short) (C1633zX.Xd() ^ (-21581))), e2, certPath, i2);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(pKIXExtendedParameters, certPath, i2);
            Class<?> cls = Class.forName(hg.Vd("\n\u007f\u0014}I\u000e~{\r\t~\t\r@tu\u0002\u0003;d@:BKlxymikdasc", (short) (C1580rY.Xd() ^ (-31092)), (short) (C1580rY.Xd() ^ (-25644))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.ud("^ThR\u001edbVX\u0019.J\\L", (short) (ZN.Xd() ^ 3928)));
            Object[] objArr = {validCertDateFromValidityModel};
            Method method = cls.getMethod(C1561oA.yd("[__\\gQ_iicku}", (short) (C1499aX.Xd() ^ (-3507))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(x509Certificate2, objArr);
                if (pKIXExtendedParameters.isRevocationEnabled()) {
                    try {
                        checkCRLs(pKIXExtendedParameters, x509Certificate2, CertPathValidatorUtilities.getValidCertDateFromValidityModel(pKIXExtendedParameters, certPath, i2), x509Certificate, publicKey, certificates, jcaJceHelper);
                    } catch (AnnotatedException e3) {
                        throw new ExtCertPathValidatorException(e3.getMessage(), e3.getCause() != null ? e3.getCause() : e3, certPath, i2);
                    }
                }
                if (PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate2).equals(x500Name)) {
                    return;
                }
                StringBuilder sbAppend = new StringBuilder(C1561oA.Yd("y%&)\u001a(\u0005\u0019&\u001fb", (short) (C1607wl.Xd() ^ 15079))).append(PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate2)).append(Xg.qd("\u0013\u000bP\\Sb\u0010_ag\u0014bWk[a\u001aNq_hdcuPdqj.", (short) (OY.Xd() ^ 32720), (short) (OY.Xd() ^ 1484))).append(x500Name);
                short sXd = (short) (FB.Xd() ^ 5045);
                short sXd2 = (short) (FB.Xd() ^ 31286);
                int[] iArr = new int["*w*w\u0004>\u0007oI\u001b\u0003R]\f`T)tT2~cI!<".length()];
                QB qb = new QB("*w*w\u0004>\u0007oI\u001b\u0003R]\f`T)tT2~cI!<");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                    i3++;
                }
                throw new ExtCertPathValidatorException(sbAppend.append(new String(iArr, 0, i3)).toString(), null, certPath, i2);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (CertificateExpiredException e5) {
            throw new ExtCertPathValidatorException(strVd + e5.getMessage(), e5, certPath, i2);
        } catch (CertificateNotYetValidException e6) {
            throw new ExtCertPathValidatorException(strVd + e6.getMessage(), e6, certPath, i2);
        } catch (AnnotatedException e7) {
            throw new ExtCertPathValidatorException(ZO.xd("5`)o\u0002D\u0004\r$-]1\u00021\u0013-3e*lb\u0016G#\u00054@\u0007_BPWjt =='C", (short) (C1607wl.Xd() ^ 17290), (short) (C1607wl.Xd() ^ 26851)), e7, certPath, i2);
        }
    }

    protected static void processCertBC(CertPath certPath, int i2, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i2);
        int size = certificates.size();
        int i3 = size - i2;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i3 >= size) {
            try {
                ASN1Sequence dERSequence = DERSequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate).getEncoded());
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(dERSequence);
                    pKIXNameConstraintValidator.checkExcludedDN(dERSequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(dERSequence).getRDNs(BCStyle.EmailAddress);
                        for (int i4 = 0; i4 != rDNs.length; i4++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i4].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e2) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e2, certPath, i2);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i5 = 0; i5 < names.length; i5++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i5]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i5]);
                                    } catch (PKIXNameConstraintValidatorException e3) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e3, certPath, i2);
                                    }
                                }
                            } catch (Exception e4) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e4, certPath, i2);
                            }
                        }
                    } catch (Exception e5) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e5, certPath, i2);
                    }
                } catch (PKIXNameConstraintValidatorException e6) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e6, certPath, i2);
                }
            } catch (Exception e7) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e7, certPath, i2);
            }
        }
    }

    protected static PKIXPolicyNode processCertD(CertPath certPath, int i2, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i3) throws CertPathValidatorException {
        String id;
        int i4;
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i2);
        int size = certificates.size();
        int i5 = size - i2;
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (dERSequence == null || pKIXPolicyNodeRemovePolicyNode == null) {
                return null;
            }
            Enumeration objects = dERSequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i5, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i5, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e2) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e2, certPath, i2);
                    }
                }
            }
            if (set.isEmpty() || set.contains("2.5.29.32.0")) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i3 > 0 || (i5 < size && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = dERSequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i5 - 1];
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i6);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    id = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    id = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (id.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(id);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i5, hashSet3, pKIXPolicyNode2, qualifierSet2, id, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i5].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            for (int i7 = i5 - 1; i7 >= 0; i7--) {
                List list2 = listArr[i7];
                while (i4 < list2.size()) {
                    PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list2.get(i4);
                    i4 = (pKIXPolicyNode4.hasChildren() || (pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, listArr, pKIXPolicyNode4)) != null) ? i4 + 1 : 0;
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean zContains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i5];
                for (int i8 = 0; i8 < list3.size(); i8++) {
                    ((PKIXPolicyNode) list3.get(i8)).setCritical(zContains);
                }
            }
            return pKIXPolicyNodeRemovePolicyNode;
        } catch (AnnotatedException e3) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e3, certPath, i2);
        }
    }

    protected static PKIXPolicyNode processCertE(CertPath certPath, int i2, PKIXPolicyNode pKIXPolicyNode) throws CertPathValidatorException {
        try {
            if (DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath, i2);
        }
    }

    protected static void processCertF(CertPath certPath, int i2, PKIXPolicyNode pKIXPolicyNode, int i3) throws CertPathValidatorException {
        if (i3 <= 0 && pKIXPolicyNode == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i2);
        }
    }

    protected static int wrapupCertA(int i2, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static int wrapupCertB(CertPath certPath, int i2, int i3) throws CertPathValidatorException {
        try {
            ASN1Sequence dERSequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i2), POLICY_CONSTRAINTS));
            if (dERSequence != null) {
                Enumeration objects = dERSequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).getValue().intValue() == 0) {
                                return 0;
                            }
                        } catch (Exception e2) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e2, certPath, i2);
                        }
                    }
                }
            }
            return i3;
        } catch (AnnotatedException e3) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e3, certPath, i2);
        }
    }

    protected static void wrapupCertF(CertPath certPath, int i2, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e2) {
                throw new ExtCertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i2);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i2);
        }
    }

    protected static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i2, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i2);
            }
            return null;
        }
        if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
            HashSet<PKIXPolicyNode> hashSet = new HashSet();
            for (List list : listArr) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i3);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                            if (!"2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                                hashSet.add(pKIXPolicyNode3);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode4 : hashSet) {
                if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                }
            }
            if (pKIXPolicyNode != null) {
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    List list2 = listArr[i4];
                    for (int i5 = 0; i5 < list2.size(); i5++) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i5);
                        if (!pKIXPolicyNode5.hasChildren()) {
                            pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode5);
                        }
                    }
                }
            }
        } else if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
            if (set2.isEmpty()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i2);
            }
            HashSet hashSet2 = new HashSet();
            for (List list3 : listArr) {
                for (int i6 = 0; i6 < list3.size(); i6++) {
                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list3.get(i6);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode6.getValidPolicy())) {
                        Iterator children2 = pKIXPolicyNode6.getChildren();
                        while (children2.hasNext()) {
                            hashSet2.add(children2.next());
                        }
                    }
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
            }
            if (pKIXPolicyNode != null) {
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    List list4 = listArr[i7];
                    for (int i8 = 0; i8 < list4.size(); i8++) {
                        PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list4.get(i8);
                        if (!pKIXPolicyNode7.hasChildren()) {
                            pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                        }
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
