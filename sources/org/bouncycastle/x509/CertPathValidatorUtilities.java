package org.bouncycastle.x509;

import com.dynatrace.android.agent.Global;
import com.google.firebase.ktx.BuildConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
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

/* JADX INFO: loaded from: classes2.dex */
class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    protected static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    protected static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    protected static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    protected static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    protected static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    protected static final String KEY_USAGE = Extension.keyUsage.getId();
    protected static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    protected static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    protected static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    protected static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    protected static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    protected static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    protected static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    protected static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {BuildConfig.VERSION_NAME, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    CertPathValidatorUtilities() {
    }

    protected static void addAdditionalStoreFromLocation(String str, ExtendedPKIXParameters extendedPKIXParameters) {
        String str2;
        String strSubstring;
        if (extendedPKIXParameters.isAdditionalLocationsEnabled()) {
            try {
                if (str.startsWith("ldap://")) {
                    String strSubstring2 = str.substring(7);
                    if (strSubstring2.indexOf(RemoteSettings.FORWARD_SLASH_STRING) != -1) {
                        strSubstring = strSubstring2.substring(strSubstring2.indexOf(RemoteSettings.FORWARD_SLASH_STRING));
                        str2 = "ldap://" + strSubstring2.substring(0, strSubstring2.indexOf(RemoteSettings.FORWARD_SLASH_STRING));
                    } else {
                        str2 = "ldap://" + strSubstring2;
                        strSubstring = null;
                    }
                    X509LDAPCertStoreParameters x509LDAPCertStoreParametersBuild = new X509LDAPCertStoreParameters.Builder(str2, strSubstring).build();
                    extendedPKIXParameters.addAdditionalStore(X509Store.getInstance("CERTIFICATE/LDAP", x509LDAPCertStoreParametersBuild, BouncyCastleProvider.PROVIDER_NAME));
                    extendedPKIXParameters.addAdditionalStore(X509Store.getInstance("CRL/LDAP", x509LDAPCertStoreParametersBuild, BouncyCastleProvider.PROVIDER_NAME));
                    extendedPKIXParameters.addAdditionalStore(X509Store.getInstance("ATTRIBUTECERTIFICATE/LDAP", x509LDAPCertStoreParametersBuild, BouncyCastleProvider.PROVIDER_NAME));
                    extendedPKIXParameters.addAdditionalStore(X509Store.getInstance("CERTIFICATEPAIR/LDAP", x509LDAPCertStoreParametersBuild, BouncyCastleProvider.PROVIDER_NAME));
                }
            } catch (Exception unused) {
                throw new RuntimeException("Exception adding X.509 stores.");
            }
        }
    }

    protected static void addAdditionalStoresFromAltNames(X509Certificate x509Certificate, ExtendedPKIXParameters extendedPKIXParameters) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("PH^J\u0018^QPcaYek!WZhk&Q/+5@cqtjhlgfzl", (short) (FB.Xd() ^ 10432), (short) (FB.Xd() ^ 29849))).getMethod(C1561oA.od("hesGpop_k9cjZfaSeYeS;MXO\\", (short) (C1499aX.Xd() ^ (-2935))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Collection) method.invoke(x509Certificate, objArr)) != null) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd("h`vb0vih{yq}\u00049or\u0001\u0004>iGCMX{\n\r\u0003\u0001\u0005\u007f~\u0013\u0005", (short) (C1633zX.Xd() ^ (-17308)))).getMethod(Wg.Zd("\u0017\t\tVqb5 \u001e]yZ<:)\rxV\\<\u001e\u001c\u0001ip", (short) (OY.Xd() ^ 26980), (short) (OY.Xd() ^ 30715)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    for (List list : (Collection) method2.invoke(x509Certificate, objArr2)) {
                        if (list.get(0).equals(Integers.valueOf(6))) {
                            addAdditionalStoreFromLocation((String) list.get(1), extendedPKIXParameters);
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected static void addAdditionalStoresFromCRLDistributionPoint(CRLDistPoint cRLDistPoint, ExtendedPKIXParameters extendedPKIXParameters) throws AnnotatedException {
        if (cRLDistPoint != null) {
            try {
                for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                    DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                    if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                        GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                        for (int i2 = 0; i2 < names.length; i2++) {
                            if (names[i2].getTagNo() == 6) {
                                addAdditionalStoreFromLocation(DERIA5String.getInstance(names[i2].getName()).getString(), extendedPKIXParameters);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw new AnnotatedException("Distribution points could not be read.", e2);
            }
        }
    }

    protected static Collection findCertificates(PKIXCertStoreSelector pKIXCertStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCertStoreSelector));
                } catch (StoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e2);
                }
            } else {
                try {
                    hashSet.addAll(PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (CertStore) obj));
                } catch (CertStoreException e3) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e3);
                }
            }
        }
        return hashSet;
    }

    protected static Collection findCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof X509Store) {
                try {
                    hashSet.addAll(((X509Store) obj).getMatches(x509AttributeCertStoreSelector));
                } catch (StoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e2);
                }
            }
        }
        return hashSet;
    }

    protected static Collection findCertificates(X509CertStoreSelector x509CertStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        CertificateFactory certificateFactory = new CertificateFactory();
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    for (Object objEngineGenerateCertificate : ((Store) obj).getMatches(x509CertStoreSelector)) {
                        if (objEngineGenerateCertificate instanceof Encodable) {
                            objEngineGenerateCertificate = certificateFactory.engineGenerateCertificate(new ByteArrayInputStream(((Encodable) objEngineGenerateCertificate).getEncoded()));
                        } else if (!(objEngineGenerateCertificate instanceof Certificate)) {
                            throw new AnnotatedException("Unknown object found in certificate store.");
                        }
                        hashSet.add(objEngineGenerateCertificate);
                    }
                } catch (IOException e2) {
                    throw new AnnotatedException("Problem while extracting certificates from X.509 store.", e2);
                } catch (CertificateException e3) {
                    throw new AnnotatedException("Problem while extracting certificates from X.509 store.", e3);
                } catch (StoreException e4) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e4);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCertificates(x509CertStoreSelector));
                } catch (CertStoreException e5) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e5);
                }
            }
        }
        return hashSet;
    }

    static Collection findIssuerCerts(X509Certificate x509Certificate, List list, List list2) throws Throwable {
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("rj\u0001l:\u0001sr\u0006\u0004{\b\u000eCy|\u000b\u000eHsQMWb\u0006\u0014\u0017\r\u000b\u000f\n\t\u001d\u000f", (short) (C1580rY.Xd() ^ (-10901)))).getMethod(Wg.vd("\u001f\u001c*}/./\u001e\"\u0007b\\c\u0003$\u001a6*/5-7", (short) (C1499aX.Xd() ^ (-32008))), new Class[0]);
            try {
                method.setAccessible(true);
                x509CertSelector.setSubject(((X500Principal) method.invoke(x509Certificate, objArr)).getEncoded());
                PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
                HashSet hashSet = new HashSet();
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(findCertificates(pKIXCertStoreSelectorBuild, list));
                    arrayList.addAll(findCertificates(pKIXCertStoreSelectorBuild, list2));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hashSet.add((X509Certificate) it.next());
                    }
                    return hashSet;
                } catch (AnnotatedException e2) {
                    throw new AnnotatedException(Qg.kd("&ONO>Jv9:FG;792/A1j-*6559c%'`3$\u001f/\u001f#\u001f\u001de", (short) (C1499aX.Xd() ^ (-26899)), (short) (C1499aX.Xd() ^ (-18570))), e2);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IOException e4) {
            short sXd = (short) (C1633zX.Xd() ^ (-5035));
            short sXd2 = (short) (C1633zX.Xd() ^ (-6822));
            int[] iArr = new int["4UAHB?Oy<J@J:F<3p6>@l/0<=1-/(%7'`3$*\"\u001f/)+W+%T\u001a\u001c \u0015O\u0018! !\u0010\u001cH\u000b\f\u0018\u0019\r\t\u000b\u0004\u0001\u0013\u0003<~\n\u000f\u0005{6\u0004\u0004\b2su/\u0002r\u00019".length()];
            QB qb = new QB("4UAHB?Oy<J@J:F<3p6>@l/0<=1-/(%7'`3$*\"\u001f/)+W+%T\u001a\u001c \u0015O\u0018! !\u0010\u001cH\u000b\f\u0018\u0019\r\t\u000b\u0004\u0001\u0013\u0003<~\n\u000f\u0005{6\u0004\u0004\b2su/\u0002r\u00019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            throw new AnnotatedException(new String(iArr, 0, i2), e4);
        }
    }

    protected static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate r9, java.util.Set r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            java.security.cert.X509CertSelector r5 = new java.security.cert.X509CertSelector
            r5.<init>()
            javax.security.auth.x500.X500Principal r4 = getEncodedIssuerPrincipal(r9)
            byte[] r0 = r4.getEncoded()     // Catch: java.io.IOException -> L77
            r5.setSubject(r0)     // Catch: java.io.IOException -> L77
            java.util.Iterator r8 = r10.iterator()
            r7 = 0
            r2 = r7
            r3 = r2
            r6 = r3
        L18:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6a
            if (r2 != 0) goto L6a
            java.lang.Object r2 = r8.next()
            java.security.cert.TrustAnchor r2 = (java.security.cert.TrustAnchor) r2
            java.security.cert.X509Certificate r0 = r2.getTrustedCert()
            if (r0 == 0) goto L48
            java.security.cert.X509Certificate r0 = r2.getTrustedCert()
            boolean r0 = r5.match(r0)
            if (r0 == 0) goto L68
            java.security.cert.X509Certificate r0 = r2.getTrustedCert()
            java.security.PublicKey r6 = r0.getPublicKey()
        L3e:
            if (r6 == 0) goto L18
            verifyX509Certificate(r9, r6, r11)     // Catch: java.lang.Exception -> L44
            goto L18
        L44:
            r3 = move-exception
            r2 = r7
            r6 = r2
            goto L18
        L48:
            java.lang.String r0 = r2.getCAName()
            if (r0 == 0) goto L68
            java.security.PublicKey r0 = r2.getCAPublicKey()
            if (r0 == 0) goto L68
            javax.security.auth.x500.X500Principal r1 = new javax.security.auth.x500.X500Principal     // Catch: java.lang.IllegalArgumentException -> L68
            java.lang.String r0 = r2.getCAName()     // Catch: java.lang.IllegalArgumentException -> L68
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L68
            boolean r0 = r4.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L68
            if (r0 == 0) goto L68
            java.security.PublicKey r6 = r2.getCAPublicKey()     // Catch: java.lang.IllegalArgumentException -> L68
            goto L3e
        L68:
            r2 = r7
            goto L3e
        L6a:
            if (r2 != 0) goto L6e
            if (r3 != 0) goto L6f
        L6e:
            return r2
        L6f:
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "TrustAnchor found but certificate validation failed."
            r1.<init>(r0, r3)
            throw r1
        L77:
            r2 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Cannot set subject search criteria for trust anchor."
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    protected static AlgorithmIdentifier getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return SubjectPublicKeyInfo.getInstance(new ASN1InputStream(publicKey.getEncoded()).readObject()).getAlgorithmId();
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e2);
        }
    }

    protected static void getCRLIssuersFromDistributionPoint(DistributionPoint distributionPoint, Collection collection, X509CRLSelector x509CRLSelector, ExtendedPKIXParameters extendedPKIXParameters) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        if (distributionPoint.getCRLIssuer() != null) {
            GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
            for (int i2 = 0; i2 < names.length; i2++) {
                if (names[i2].getTagNo() == 4) {
                    try {
                        arrayList.add(new X500Principal(names[i2].getName().toASN1Primitive().getEncoded()));
                    } catch (IOException e2) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e2);
                    }
                }
            }
        } else {
            if (distributionPoint.getDistributionPoint() == null) {
                throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add((X500Principal) it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((X500Principal) it2.next()).getEncoded());
            } catch (IOException e3) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e3);
            }
        }
    }

    protected static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        X509CRLEntry revokedCertificate;
        ASN1Enumerated aSN1Enumerated;
        try {
            if (isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (certificateIssuer == null) {
                    certificateIssuer = getIssuerPrincipal(x509crl);
                }
                if (!getEncodedIssuerPrincipal(obj).equals(certificateIssuer)) {
                    return;
                }
            } else if (!getEncodedIssuerPrincipal(obj).equals(getIssuerPrincipal(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            if (revokedCertificate.hasExtensions()) {
                try {
                    aSN1Enumerated = ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, X509Extension.reasonCode.getId()));
                } catch (Exception e2) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e2);
                }
            } else {
                aSN1Enumerated = null;
            }
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || aSN1Enumerated == null || aSN1Enumerated.getValue().intValue() == 0 || aSN1Enumerated.getValue().intValue() == 1 || aSN1Enumerated.getValue().intValue() == 2 || aSN1Enumerated.getValue().intValue() == 8) {
                certStatus.setCertStatus(aSN1Enumerated != null ? aSN1Enumerated.getValue().intValue() : 0);
                certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
            }
        } catch (CRLException e3) {
            throw new AnnotatedException("Failed check for indirect CRL.", e3);
        }
    }

    protected static Set getCompleteCRLs(DistributionPoint distributionPoint, Object obj, Date date, ExtendedPKIXParameters extendedPKIXParameters) throws Throwable {
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(obj instanceof X509AttributeCertificate ? ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0] : getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(distributionPoint, hashSet, x509CRLStoreSelector, extendedPKIXParameters);
            if (obj instanceof X509Certificate) {
                x509CRLStoreSelector.setCertificateChecking((X509Certificate) obj);
            } else if (obj instanceof X509AttributeCertificate) {
                x509CRLStoreSelector.setAttrCertificateChecking((X509AttributeCertificate) obj);
            }
            x509CRLStoreSelector.setCompleteCRLEnabled(true);
            Set setFindCRLs = CRL_UTIL.findCRLs(x509CRLStoreSelector, extendedPKIXParameters, date);
            if (!setFindCRLs.isEmpty()) {
                return setFindCRLs;
            }
            boolean z2 = obj instanceof X509AttributeCertificate;
            String strUd = C1561oA.ud(Global.QUESTION, (short) (OY.Xd() ^ 1440));
            String strYd = C1561oA.yd("Vv*L^W\u0002-v~\b\u007fx3|\u0005j\u0017clopco !", (short) (C1633zX.Xd() ^ (-28486)));
            if (z2) {
                throw new AnnotatedException(strYd + ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0] + strUd);
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder(strYd);
            Class<?> cls = Class.forName(C1561oA.Yd("iawc1wji|zr~\u0005:ps\u0002\u0005?jHDNY|\u000b\u000e\u0004\u0002\u0006\u0001\u007f\u0014\u0006", (short) (ZN.Xd() ^ 11764)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 13117);
            short sXd2 = (short) (C1607wl.Xd() ^ 3702);
            int[] iArr = new int[")(8\u000e9:=.<#\u0001|}\u001fB:@6=E7C".length()];
            QB qb = new QB(")(8\u000e9:=.<#\u0001|}\u001fB:@6=E7C");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                throw new AnnotatedException(sb.append((X500Principal) method.invoke(x509Certificate, objArr)).append(strUd).toString());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (AnnotatedException e3) {
            throw new AnnotatedException(Jg.Wd("k$JA\u0015p?!Bm\u0015\u000f>J\u0014:\u001a\u001c(ES=>\u0016?>\u001a\u000eA\u0012\u00187E\f85\u000fa6\u0018BC!\u0014-!\u001c1\u0017\u0016c4\u0014./\u0015n", (short) (C1580rY.Xd() ^ (-26673)), (short) (C1580rY.Xd() ^ (-20437))), e3);
        }
    }

    protected static Set getDeltaCRLs(Date date, ExtendedPKIXParameters extendedPKIXParameters, X509CRL x509crl) throws Throwable {
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(getIssuerPrincipal(x509crl).getEncoded());
            try {
                ASN1Primitive extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger positiveValue = extensionValue != null ? ASN1Integer.getInstance(extensionValue).getPositiveValue() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLStoreSelector.setMinCRLNumber(positiveValue != null ? positiveValue.add(BigInteger.valueOf(1L)) : null);
                    x509CRLStoreSelector.setIssuingDistributionPoint(extensionValue2);
                    x509CRLStoreSelector.setIssuingDistributionPointEnabled(true);
                    x509CRLStoreSelector.setMaxBaseCRLNumber(positiveValue);
                    Set<X509CRL> setFindCRLs = CRL_UTIL.findCRLs(x509CRLStoreSelector, extendedPKIXParameters, date);
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : setFindCRLs) {
                        if (isDeltaCRL(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e2) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e2);
                }
            } catch (Exception e3) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e3);
            }
        } catch (IOException e4) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e4);
        }
    }

    protected static X500Principal getEncodedIssuerPrincipal(Object obj) throws Throwable {
        if (!(obj instanceof X509Certificate)) {
            return (X500Principal) ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0];
        }
        X509Certificate x509Certificate = (X509Certificate) obj;
        Class<?> cls = Class.forName(ZO.xd("\u0016 S35T\u00199GxZ?\u001ccp>>w7\u0014\r(\u0012D7<v\u0002\u001d}\ty^\f", (short) (C1633zX.Xd() ^ (-31045)), (short) (C1633zX.Xd() ^ (-28537))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 2662);
        short sXd2 = (short) (OY.Xd() ^ 26509);
        int[] iArr = new int["A%.Sf]x\u0017=d?nT>8K\u0014\u0006Gu=Z".length()];
        QB qb = new QB("A%.Sf]x\u0017=d?nT>8K\u0014\u0006Gu=Z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return (X500Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected static ASN1Primitive getExtensionValue(java.security.cert.X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    protected static X500Principal getIssuerPrincipal(X509CRL x509crl) {
        return x509crl.getIssuerX500Principal();
    }

    protected static PublicKey getNextWorkingKey(List list, int i2) throws Throwable {
        DSAPublicKey dSAPublicKey;
        Certificate certificate = (Certificate) list.get(i2);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("k\u001cajmuQ\u000ep\u007fz\"{ k\ny\fk'\nA'\u0016\u0004\u0001[{~@", (short) (C1499aX.Xd() ^ (-24324)))).getMethod(EO.Od("K\u0003\u007f7Tv!MnFbT", (short) (C1633zX.Xd() ^ (-1907))), new Class[0]);
        try {
            method.setAccessible(true);
            PublicKey publicKey = (PublicKey) method.invoke(certificate, objArr);
            if (!(publicKey instanceof DSAPublicKey)) {
                return publicKey;
            }
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
            if (dSAPublicKey2.getParams() != null) {
                return dSAPublicKey2;
            }
            do {
                i2++;
                int size = list.size();
                String strQd = C1561oA.Qd("\u0001\u000f{Y)\u0019)\u0017\"\u0019'\u0017##N\u0011\u000e\u001a\u0019\u0019\u001dG\t\u000bD\r\u0011\n\u0006\u0012\b\u0012\u0002\u007f:\u007f\u000b\u0007\u00045\u0005\u0006w\by~\u0004\u0001,no{|plngdvf.", (short) (Od.Xd() ^ (-20570)));
                if (i2 >= size) {
                    throw new CertPathValidatorException(strQd);
                }
                PublicKey publicKey2 = ((X509Certificate) list.get(i2)).getPublicKey();
                if (!(publicKey2 instanceof DSAPublicKey)) {
                    throw new CertPathValidatorException(strQd);
                }
                dSAPublicKey = (DSAPublicKey) publicKey2;
            } while (dSAPublicKey.getParams() == null);
            DSAParams params = dSAPublicKey.getParams();
            try {
                return KeyFactory.getInstance(C1593ug.zd("\n\u001a\t", (short) (OY.Xd() ^ 26283), (short) (OY.Xd() ^ 7964)), C1561oA.od("hh", (short) (ZN.Xd() ^ 284))).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static ASN1Primitive getObject(String str, byte[] bArr) throws AnnotatedException {
        try {
            return new ASN1InputStream(((ASN1OctetString) new ASN1InputStream(bArr).readObject()).getOctets()).readObject();
        } catch (Exception e2) {
            throw new AnnotatedException("exception processing extension " + str, e2);
        }
    }

    protected static final Set getQualifierSet(ASN1Sequence aSN1Sequence) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (aSN1Sequence == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ASN1OutputStream aSN1OutputStream = new ASN1OutputStream(byteArrayOutputStream);
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            try {
                aSN1OutputStream.writeObject((ASN1Encodable) objects.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e2) {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e2);
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) throws Throwable {
        if (!(obj instanceof X509Certificate)) {
            return ((X509AttributeCertificate) obj).getSerialNumber();
        }
        X509Certificate x509Certificate = (X509Certificate) obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd(":2H4\u0002H;:MKCOU\u000bADRU\u0010;\u0019\u0015\u001f*M[^TRVQPdV", (short) (C1499aX.Xd() ^ (-21652)))).getMethod(Wg.Zd("\u001aq\u001a\u0012=c4Eid%v\u0005!G", (short) (Od.Xd() ^ (-25605)), (short) (Od.Xd() ^ (-18091))), new Class[0]);
        try {
            method.setAccessible(true);
            return (BigInteger) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected static X500Principal getSubjectPrincipal(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("LDZF\u0014ZML_]Uag\u001dSVdg\"M+'1<_mpfdhcbvh", (short) (Od.Xd() ^ (-29467)))).getMethod(Wg.vd("khvTuahb_oR.('Fg]aUZ`PZ", (short) (Od.Xd() ^ (-17931))), new Class[0]);
        try {
            method.setAccessible(true);
            return (X500Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected static Date getValidCertDateFromValidityModel(ExtendedPKIXParameters extendedPKIXParameters, CertPath certPath, int i2) throws Throwable {
        String strKd = Qg.kd("Iewg!oe\u001e`amn\u0019_\\d\u0015YkfV^bW\\Z\u000bMX]SJ\u0005RRV\u0001BD}OA<>\u0007", (short) (FB.Xd() ^ 25903), (short) (FB.Xd() ^ 2001));
        if (extendedPKIXParameters.getValidityModel() == 1 && i2 > 0) {
            int i3 = i2 - 1;
            if (i3 == 0) {
                try {
                    byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i3)).getExtensionValue(ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
                    ASN1GeneralizedTime aSN1GeneralizedTime = extensionValue != null ? ASN1GeneralizedTime.getInstance(ASN1Primitive.fromByteArray(extensionValue)) : null;
                    if (aSN1GeneralizedTime != null) {
                        try {
                            return aSN1GeneralizedTime.getDate();
                        } catch (ParseException e2) {
                            short sXd = (short) (ZN.Xd() ^ 6721);
                            short sXd2 = (short) (ZN.Xd() ^ 17997);
                            int[] iArr = new int["\u00195G7p6A=:k/+=-f5+c&'34^%\"*Z\u001f1,\u001c$(\u001d\" P\u0013\u001e#\u0019\u0010J\u0018\u0018\u001cF\b\nC\u0013\u0003\u0013\u0013\u0004\u0002J".length()];
                            QB qb = new QB("\u00195G7p6A=:k/+=-f5+c&'34^%\"*Z\u001f1,\u001c$(\u001d\" P\u0013\u001e#\u0019\u0010J\u0018\u0018\u001cF\b\nC\u0013\u0003\u0013\u0013\u0004\u0002J");
                            int i4 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
                                i4++;
                            }
                            throw new AnnotatedException(new String(iArr, 0, i4), e2);
                        }
                    }
                } catch (IOException unused) {
                    throw new AnnotatedException(strKd);
                } catch (IllegalArgumentException unused2) {
                    throw new AnnotatedException(strKd);
                }
            }
            X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i3);
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("\u0002w\fuA\u0006vs\u0005\u0001v\u0001\u00058lmyz3\\82:Cdpqeac\\Yk[", (short) (C1633zX.Xd() ^ (-24661)))).getMethod(C1561oA.yd("\u000e\r\u001dw\u0012\u0018f\u000b\u0005\u000f\u0013\u0007", (short) (C1607wl.Xd() ^ 16150)), new Class[0]);
            try {
                method.setAccessible(true);
                return (Date) method.invoke(x509Certificate, objArr);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return getValidDate(extendedPKIXParameters);
    }

    protected static Date getValidDate(PKIXParameters pKIXParameters) {
        Date date = pKIXParameters.getDate();
        return date == null ? new Date() : date;
    }

    protected static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(Extension.deltaCRLIndicator.getId());
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
            throw new CRLException("Exception reading IssuingDistributionPoint: " + e2);
        }
    }

    protected static boolean isSelfIssued(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd(" \u0018.\u001ag.! 31)5;p'*8;u!~z\u0005\u00103AD:8<76J<", (short) (OY.Xd() ^ 3038))).getMethod(Xg.qd("\n\t\u0019x\u001c\n\u0013\u000f\u000e p{", (short) (C1633zX.Xd() ^ (-25761)), (short) (C1633zX.Xd() ^ (-23607))), new Class[0]);
        try {
            method.setAccessible(true);
            Principal principal = (Principal) method.invoke(x509Certificate, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("==zvc6\\w\"H?~\taLR\u0011\u001b}T6]v\"\\\u00135?`h\u001b\u001a]z", (short) (C1633zX.Xd() ^ (-25330)), (short) (C1633zX.Xd() ^ (-22680)))).getMethod(ZO.xd("\nL/[!\u0005h.\\:;", (short) (C1633zX.Xd() ^ (-27814)), (short) (C1633zX.Xd() ^ (-26179))), new Class[0]);
            try {
                method2.setAccessible(true);
                return principal.equals((Principal) method2.invoke(x509Certificate, objArr2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected static void prepareNextCertB1(int i2, List[] listArr, String str, Map map, X509Certificate x509Certificate) throws AnnotatedException, CertPathValidatorException {
        Set qualifierSet;
        for (PKIXPolicyNode pKIXPolicyNode : listArr[i2]) {
            if (pKIXPolicyNode.getValidPolicy().equals(str)) {
                pKIXPolicyNode.setExpectedPolicies((Set) map.get(str));
                return;
            }
        }
        for (PKIXPolicyNode pKIXPolicyNode2 : listArr[i2]) {
            if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                try {
                    Enumeration objects = DERSequence.getInstance(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).getObjects();
                    while (true) {
                        if (!objects.hasMoreElements()) {
                            qualifierSet = null;
                            break;
                        }
                        try {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            if ("2.5.29.32.0".equals(policyInformation.getPolicyIdentifier().getId())) {
                                try {
                                    qualifierSet = getQualifierSet(policyInformation.getPolicyQualifiers());
                                    break;
                                } catch (CertPathValidatorException e2) {
                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", e2);
                                }
                            }
                        } catch (Exception e3) {
                            throw new AnnotatedException("Policy information cannot be decoded.", e3);
                        }
                    }
                    boolean zContains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES) : false;
                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                    if ("2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                        PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i2, (Set) map.get(str), pKIXPolicyNode3, qualifierSet, str, zContains);
                        pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                        listArr[i2].add(pKIXPolicyNode4);
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    throw new AnnotatedException("Certificate policies cannot be decoded.", e4);
                }
            }
        }
    }

    protected static PKIXPolicyNode prepareNextCertB2(int i2, List[] listArr, String str, PKIXPolicyNode pKIXPolicyNode) {
        int i3;
        Iterator it = listArr[i2].iterator();
        while (it.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) it.next();
            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                ((PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                it.remove();
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    List list = listArr[i4];
                    while (i3 < list.size()) {
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list.get(i3);
                        i3 = (pKIXPolicyNode3.hasChildren() || (pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3)) != null) ? i3 + 1 : 0;
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    protected static boolean processCertD1i(int i2, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        List list = listArr[i2 - 1];
        for (int i3 = 0; i3 < list.size(); i3++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i3);
            if (pKIXPolicyNode.getExpectedPolicies().contains(aSN1ObjectIdentifier.getId())) {
                HashSet hashSet = new HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i2, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i2].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    protected static void processCertD1ii(int i2, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        List list = listArr[i2 - 1];
        for (int i3 = 0; i3 < list.size(); i3++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i3);
            if ("2.5.29.32.0".equals(pKIXPolicyNode.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i2, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i2].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    protected static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (int i2 = 0; i2 < listArr.length; i2++) {
            listArr[i2] = new ArrayList();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    protected static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }
}
