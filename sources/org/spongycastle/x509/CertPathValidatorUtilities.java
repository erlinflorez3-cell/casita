package org.spongycastle.x509;

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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Enumerated;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1OutputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.DistributionPointName;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.PolicyInformation;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509Extension;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.spongycastle.jce.X509LDAPCertStoreParameters;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.PKIXPolicyNode;
import org.spongycastle.util.Encodable;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Store;
import org.spongycastle.util.StoreException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
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
import yg.hg;

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
        Class<?> cls = Class.forName(C1561oA.Kd("ph~j8~qp\u0004\u0002y\u0006\fAwz\t\fFqOKU`\u0004\u0012\u0015\u000b\t\r\b\u0007\u001b\r", (short) (Od.Xd() ^ (-24904))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 27402);
        short sXd2 = (short) (FB.Xd() ^ 15831);
        int[] iArr = new int["&Y=7&k\"W)\u001c\u001dY\u007fQ\u0003*\u0012,\u000e2O(x\u0016x".length()];
        QB qb = new QB("&Y=7&k\"W)\u001c\u001dY\u007fQ\u0003*\u0012,\u000e2O(x\u0016x");
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
            if (((Collection) method.invoke(x509Certificate, objArr)) != null) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Xd("xp\u0007r@\u0007yx\f\n\u0002\u000e\u0014I\u007f\u0003\u0011\u0014NyWS]h\f\u001a\u001d\u0013\u0011\u0015\u0010\u000f#\u0015", (short) (OY.Xd() ^ 4277))).getMethod(Wg.vd("\u0005\u0002\u0010c\u0015\u0014\u0015\u0004\bU\u007f\u0007~\u000b\u0006w\"\u0016\"\u0010\u007f\u0012\u001d\u0014\u0019", (short) (C1499aX.Xd() ^ (-28712))), new Class[0]);
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
                    for (Object obj2 : ((Store) obj).getMatches(x509CertStoreSelector)) {
                        if (obj2 instanceof Encodable) {
                            hashSet.add(certificateFactory.engineGenerateCertificate(new ByteArrayInputStream(((Encodable) obj2).getEncoded())));
                        } else {
                            if (!(obj2 instanceof Certificate)) {
                                throw new AnnotatedException("Unknown object found in certificate store.");
                            }
                            hashSet.add(obj2);
                        }
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
            Method method = Class.forName(Qg.kd("}s\bq=\u0002ro\u0001|r|\u00014hiuv/X4.6?`lma]_XUgW", (short) (C1633zX.Xd() ^ (-13237)), (short) (C1633zX.Xd() ^ (-30101)))).getMethod(hg.Vd("\u0016\u0013!t\u001e\u001d\u001e\r\u0019}YSRq\u0013\t\r\u0001\u0006\f{\u0006", (short) (C1499aX.Xd() ^ (-23780)), (short) (C1499aX.Xd() ^ (-21784))), new Class[0]);
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
                    throw new AnnotatedException(C1561oA.ud("Fono^j\u0017YZfg[WYROaQ\u000bMJVUUY\u0004EG\u0001SD?O?C?=\u0006", (short) (C1499aX.Xd() ^ (-19774))), e2);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IOException e4) {
            throw new AnnotatedException(C1561oA.yd("\u000b.\u0018!\u0019\u0018&R\u0013#\u0017#\u0011\u001f\u0013\fg/59c('54*$(\u001f\u001e. 7\fz\u0003xw\u0006\u0002\u00020\u0002}+rrx\fH\u000f\u001a\u0017\u001a\u0007\u0015?\u0004\u0003\u0011\u0010\u0006\u007f\u0004[Zj\\\u0014Xah\\U\u000e][a\nMm)ylx3", (short) (ZN.Xd() ^ 31454)), e4);
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
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "TrustAnchor found but certificate validation failed."
            r1.<init>(r0, r3)
            throw r1
        L77:
            r2 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r1 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r0 = "Cannot set subject search criteria for trust anchor."
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.x509.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
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
                if (aSN1Enumerated != null) {
                    certStatus.setCertStatus(aSN1Enumerated.getValue().intValue());
                } else {
                    certStatus.setCertStatus(0);
                }
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
            if (obj instanceof X509AttributeCertificate) {
                hashSet.add(((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0]);
            } else {
                hashSet.add(getEncodedIssuerPrincipal(obj));
            }
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
            String strYd = C1561oA.Yd("\u0001", (short) (Od.Xd() ^ (-28821)));
            String strQd = Xg.qd("m\u0010Aeup\u0019F\u000e\u0018\u001f\u0019\u0010L\u0014\u001e\"P\u001b&'*\u001b)WZ", (short) (C1607wl.Xd() ^ 10804), (short) (C1607wl.Xd() ^ 18368));
            if (z2) {
                throw new AnnotatedException(strQd + ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0] + strYd);
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder(strQd);
            short sXd = (short) (C1633zX.Xd() ^ (-28674));
            short sXd2 = (short) (C1633zX.Xd() ^ (-12343));
            int[] iArr = new int["H\u001a#hx\u001a~X\u000eeP6~\u000f7\u0015E\"OTtKG-rZP `?,\u0006=\t".length()];
            QB qb = new QB("H\u001a#hx\u001a~X\u000eeP6~\u000f7\u0015E\"OTtKG-rZP `?,\u0006=\t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("\u001eW.\u001c\\\nQ j\u0019Gj(.KV@\t]O~q", (short) (C1499aX.Xd() ^ (-2247)), (short) (C1499aX.Xd() ^ (-12622))), new Class[0]);
            try {
                method.setAccessible(true);
                throw new AnnotatedException(sb.append((X500Principal) method.invoke(x509Certificate, objArr)).append(strYd).toString());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (AnnotatedException e3) {
            throw new AnnotatedException(C1626yg.Ud("%+?J\f]\u007f\u0007\n~eY\u0003M~|N\u0014Z%%~KrKm[8\\U!w\u001euCR\u0002n\\G>-%ZP\u0014q`!s\u001ef?U}/s", (short) (OY.Xd() ^ 25043), (short) (OY.Xd() ^ 27001)), e3);
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
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("l\u0013&if\u0007\u0015#\u0002[{!W\u001a?Z#;,Nh\u0017:@ )H\t$Tj\u0002EK", (short) (C1633zX.Xd() ^ (-16771)))).getMethod(EO.Od("-zK\u0006rH\\m>uJ)x\u001d\u001d{V3r\u007f4l", (short) (C1499aX.Xd() ^ (-10605))), new Class[0]);
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
        Class<?> cls = Class.forName(C1561oA.Qd("\u0002w\fuA\u0006vs\u0005\u0001v\u0001\u00058lmyz3Ghtuieg`]o_", (short) (FB.Xd() ^ 9483)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 18343);
        short sXd2 = (short) (ZN.Xd() ^ 7257);
        int[] iArr = new int["\"!1\u000e4\"-+&\u000f*?".length()];
        QB qb = new QB("\"!1\u000e4\"-+&\u000f*?");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
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
                String strOd = C1561oA.od("dr_=\r|\rz\u0006|\u000bz\u0007\u00072tq}||\u0001+ln(ptmiukuec\u001ecnjg\u0019hi[k]bgd\u0010RS_`TPRKHZJ\u0012", (short) (C1607wl.Xd() ^ 26201));
                if (i2 >= size) {
                    throw new CertPathValidatorException(strOd);
                }
                PublicKey publicKey2 = ((X509Certificate) list.get(i2)).getPublicKey();
                if (!(publicKey2 instanceof DSAPublicKey)) {
                    throw new CertPathValidatorException(strOd);
                }
                dSAPublicKey = (DSAPublicKey) publicKey2;
            } while (dSAPublicKey.getParams() == null);
            DSAParams params = dSAPublicKey.getParams();
            try {
                return KeyFactory.getInstance(C1561oA.Kd("8H7", (short) (C1607wl.Xd() ^ 13686)), Wg.Zd("bn", (short) (FB.Xd() ^ 26834), (short) (FB.Xd() ^ 24851))).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
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
        Method method = Class.forName(C1561oA.Xd("6.D0}D76IG?KQ\u0007=@NQ\f7\u0015\u0011\u001b&IWZPNRML`R", (short) (C1580rY.Xd() ^ (-21283)))).getMethod(Wg.vd("TScCN\\TMQ4\\UCGU", (short) (C1499aX.Xd() ^ (-10337))), new Class[0]);
        try {
            method.setAccessible(true);
            return (BigInteger) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected static X500Principal getSubjectPrincipal(X509Certificate x509Certificate) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-25100));
        short sXd2 = (short) (Od.Xd() ^ (-3947));
        int[] iArr = new int["A7K5\u0001E63D@6@Dw,-9:r\u001cwqy\u0003$01%!#\u001c\u0019+\u001b".length()];
        QB qb = new QB("A7K5\u0001E63D@6@Dw,-9:r\u001cwqy\u0003$01%!#\u001c\u0019+\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("`]kIjV]WTdG#\u001d\u001c;\\RVJOUEO", (short) (OY.Xd() ^ 23248), (short) (OY.Xd() ^ 16765)), new Class[0]);
        try {
            method.setAccessible(true);
            return (X500Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected static Date getValidCertDateFromValidityModel(ExtendedPKIXParameters extendedPKIXParameters, CertPath certPath, int i2) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 21328);
        int[] iArr = new int["8TfV\u0010^T\rOP\\]\bNKS\u0004HZUEMQFKIy<GLB9sAAEo13l>0+-u".length()];
        QB qb = new QB("8TfV\u0010^T\rOP\\]\bNKS\u0004HZUEMQFKIy<GLB9sAAEo13l>0+-u");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        if (extendedPKIXParameters.getValidityModel() == 1 && i2 > 0) {
            int i4 = i2 - 1;
            if (i4 != 0) {
                X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i4);
                Object[] objArr = new Object[0];
                Method method = Class.forName(Jg.Wd("^q^Q2wQ_yVAtQ}[UFH\u001a$x\u0014!\u0003MR,):=\u001f-H\u0019", (short) (C1580rY.Xd() ^ (-25371)), (short) (C1580rY.Xd() ^ (-32590)))).getMethod(ZO.xd("\n%\f9W+FxAz'M", (short) (C1607wl.Xd() ^ 16544), (short) (C1607wl.Xd() ^ 16332)), new Class[0]);
                try {
                    method.setAccessible(true);
                    return (Date) method.invoke(x509Certificate, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i4)).getExtensionValue(ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
                ASN1GeneralizedTime aSN1GeneralizedTime = extensionValue != null ? ASN1GeneralizedTime.getInstance(ASN1Primitive.fromByteArray(extensionValue)) : null;
                if (aSN1GeneralizedTime != null) {
                    try {
                        return aSN1GeneralizedTime.getDate();
                    } catch (ParseException e3) {
                        throw new AnnotatedException(C1561oA.yd("#?UE\u0003HWSDu=9O?|KU\u000eTUef\u0015[LT\tMc^RZ2'0.b%49#\u001aX&*.\\\u001e4mA1EE:8t", (short) (C1633zX.Xd() ^ (-32414))), e3);
                    }
                }
                X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i4);
                short sXd2 = (short) (ZN.Xd() ^ 19389);
                int[] iArr2 = new int["\u0017\u000f%\u0011^%\u0018\u0017*( ,2g\u001e!/2l\u0018uq{\u0007*8;1/3.-A3".length()];
                QB qb2 = new QB("\u0017\u000f%\u0011^%\u0018\u0017*( ,2g\u001e!/2l\u0018uq{\u0007*8;1/3.-A3");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i5));
                    i5++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i5)).getMethod(Xg.qd("CBR-OU$HJTXL", (short) (C1499aX.Xd() ^ (-1332)), (short) (C1499aX.Xd() ^ (-3106))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    return (Date) method2.invoke(x509Certificate2, objArr2);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (IOException unused) {
                throw new AnnotatedException(str);
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException(str);
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
        short sXd = (short) (C1633zX.Xd() ^ (-14373));
        short sXd2 = (short) (C1633zX.Xd() ^ (-9462));
        int[] iArr = new int["W65\u0002~aj\t%a\u0011\u001a))\ni\u0003Bv\ffGA\f\u001ctWI*xM(DT".length()];
        QB qb = new QB("W65\u0002~aj\t%a\u0011\u001a))\ni\u0003Bv\ffGA\f\u001ctWI*xM(DT");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("\u001cqR\t{$Hr\u001e\u000fdL", (short) (C1633zX.Xd() ^ (-468))), new Class[0]);
        try {
            method.setAccessible(true);
            Principal principal = (Principal) method.invoke(x509Certificate, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("\u001a>\u0004\f;N\"i;yl\u0018H|Lq,J--I}/7XG*oH<\u0018xm;", (short) (ZN.Xd() ^ 30564))).getMethod(C1561oA.Qd("VSa5^]^MY*3", (short) (ZN.Xd() ^ 8194)), new Class[0]);
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

    protected static void prepareNextCertB1(int i2, List[] listArr, String str, Map map, X509Certificate x509Certificate) throws CertPathValidatorException, AnnotatedException {
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
