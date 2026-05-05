package org.spongycastle.jce.provider;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.TargetInformation;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.PKIXAttrCertChecker;
import org.spongycastle.x509.X509AttributeCertificate;
import org.spongycastle.x509.X509CertStoreSelector;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = X509Extensions.TargetInformation.getId();
    private static final String NO_REV_AVAIL = X509Extensions.NoRevAvail.getId();
    private static final String CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
    private static final String AUTHORITY_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();

    RFC3281CertPathUtilities() {
    }

    protected static void additionalChecks(X509AttributeCertificate x509AttributeCertificate, Set set, Set set2) throws CertPathValidatorException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (x509AttributeCertificate.getAttributes(str) != null) {
                throw new CertPathValidatorException("Attribute certificate contains prohibited attribute: " + str + ".");
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (x509AttributeCertificate.getAttributes(str2) == null) {
                throw new CertPathValidatorException("Attribute certificate does not contain necessary attribute: " + str2 + ".");
            }
        }
    }

    private static void checkCRL(DistributionPoint distributionPoint, X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters, Date date, X509Certificate x509Certificate, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        if (x509AttributeCertificate.getExtensionValue(X509Extensions.NoRevAvail.getId()) != null) {
            return;
        }
        Date date2 = new Date(System.currentTimeMillis());
        if (date.getTime() > date2.getTime()) {
            throw new AnnotatedException("Validation time is in future.");
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(distributionPoint, x509AttributeCertificate, date2, pKIXExtendedParameters).iterator();
        boolean z2 = false;
        AnnotatedException e2 = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask reasonsMaskProcessCRLD = RFC3280CertPathUtilities.processCRLD(x509crl, distributionPoint);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        X509CRL x509crlProcessCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? RFC3280CertPathUtilities.processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()), RFC3280CertPathUtilities.processCRLG(x509crl, RFC3280CertPathUtilities.processCRLF(x509crl, x509AttributeCertificate, null, null, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509AttributeCertificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        RFC3280CertPathUtilities.processCRLB1(distributionPoint, x509AttributeCertificate, x509crl);
                        RFC3280CertPathUtilities.processCRLB2(distributionPoint, x509AttributeCertificate, x509crl);
                        RFC3280CertPathUtilities.processCRLC(x509crlProcessCRLH, x509crl, pKIXExtendedParameters);
                        RFC3280CertPathUtilities.processCRLI(date, x509crlProcessCRLH, x509AttributeCertificate, certStatus, pKIXExtendedParameters);
                        RFC3280CertPathUtilities.processCRLJ(date, x509crl, x509AttributeCertificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        z2 = true;
                    } catch (AnnotatedException e3) {
                        e2 = e3;
                    }
                }
            } catch (AnnotatedException e4) {
                e2 = e4;
            }
        }
        if (!z2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static void checkCRLs(org.spongycastle.x509.X509AttributeCertificate r17, org.spongycastle.jcajce.PKIXExtendedParameters r18, java.security.cert.X509Certificate r19, java.util.Date r20, java.util.List r21, org.spongycastle.jcajce.util.JcaJceHelper r22) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(org.spongycastle.x509.X509AttributeCertificate, org.spongycastle.jcajce.PKIXExtendedParameters, java.security.cert.X509Certificate, java.util.Date, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    protected static CertPath processAttrCert1(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (x509AttributeCertificate.getHolder().getIssuer() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(x509AttributeCertificate.getHolder().getSerialNumber());
            for (Principal principal : x509AttributeCertificate.getHolder().getIssuer()) {
                try {
                    if (principal instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) principal).getEncoded());
                    }
                    hashSet.addAll(CertPathValidatorUtilities.findCertificates(new PKIXCertStoreSelector.Builder(x509CertSelector).build(), pKIXExtendedParameters.getCertStores()));
                } catch (IOException e2) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e2);
                } catch (AnnotatedException e3) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e3);
                }
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (x509AttributeCertificate.getHolder().getEntityNames() != null) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            for (Principal principal2 : x509AttributeCertificate.getHolder().getEntityNames()) {
                try {
                    if (principal2 instanceof X500Principal) {
                        x509CertStoreSelector.setIssuer(((X500Principal) principal2).getEncoded());
                    }
                    hashSet.addAll(CertPathValidatorUtilities.findCertificates(new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build(), pKIXExtendedParameters.getCertStores()));
                } catch (IOException e4) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e4);
                } catch (AnnotatedException e5) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e5);
                }
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
        Iterator it = hashSet.iterator();
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResultBuild = null;
        while (it.hasNext()) {
            X509CertStoreSelector x509CertStoreSelector2 = new X509CertStoreSelector();
            x509CertStoreSelector2.setCertificate((X509Certificate) it.next());
            builder.setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertStoreSelector2).build());
            try {
                try {
                    certPathBuilderResultBuild = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new PKIXExtendedBuilderParameters.Builder(builder.build()).build());
                } catch (InvalidAlgorithmParameterException e6) {
                    throw new RuntimeException(e6.getMessage());
                } catch (CertPathBuilderException e7) {
                    extCertPathValidatorException = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", e7);
                }
            } catch (NoSuchAlgorithmException e8) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e8);
            } catch (NoSuchProviderException e9) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e9);
            }
        }
        if (extCertPathValidatorException == null) {
            return certPathBuilderResultBuild.getCertPath();
        }
        throw extCertPathValidatorException;
    }

    protected static CertPathValidatorResult processAttrCert2(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, pKIXExtendedParameters);
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException(e2.getMessage());
            } catch (CertPathValidatorException e3) {
                throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e4);
        } catch (NoSuchProviderException e5) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e5);
        }
    }

    protected static void processAttrCert3(X509Certificate x509Certificate, PKIXExtendedParameters pKIXExtendedParameters) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\u0011\u001e9S*i<v\u0018:Nb]P@&Eq,(~\u0012D.\u0001\u001a7-<y\u0013,6\b", (short) (C1499aX.Xd() ^ (-2333)), (short) (C1499aX.Xd() ^ (-6575)))).getMethod(Ig.wd("\u0013j\u0006yz2w\u0004\u0013^\\", (short) (FB.Xd() ^ 7026)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((boolean[]) method.invoke(x509Certificate, objArr)) != null) {
                Class<?> cls = Class.forName(EO.Od("G\u0011s?\u000b\r\u0013I\nk\\Ix;\rq\u001b\u000b\u001dOj.QW\bYy?J{\n*M\\", (short) (Od.Xd() ^ (-6211))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1607wl.Xd() ^ 7810);
                int[] iArr = new int["\u000f\f\u001ao\t\u001cv\u0014\u0001\u0006\u0003".length()];
                QB qb = new QB("\u000f\f\u001ao\t\u001cv\u0014\u0001\u0006\u0003");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    if (!((boolean[]) method2.invoke(x509Certificate, objArr2))[0]) {
                        Class<?> cls2 = Class.forName(C1593ug.zd("\t\u0001\u0017\u0003P\u0017\n\t\u001c\u001a\u0012\u001e$Y\u0010\u0013!$^\ngcmx\u001c*-#!% \u001f3%", (short) (C1580rY.Xd() ^ (-21347)), (short) (C1580rY.Xd() ^ (-13908))));
                        Class<?>[] clsArr2 = new Class[0];
                        Object[] objArr3 = new Object[0];
                        short sXd2 = (short) (C1580rY.Xd() ^ (-8456));
                        int[] iArr2 = new int["_\\j@YlGdQVS".length()];
                        QB qb2 = new QB("_\\j@YlGdQVS");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Method method3 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                        try {
                            method3.setAccessible(true);
                            if (!((boolean[]) method3.invoke(x509Certificate, objArr3))[1]) {
                                throw new CertPathValidatorException(C1561oA.Kd("5ijia[ooa\u001dadrukimhg{m)s~\u007f\u0003s\u00020\u0002\bu\u0001~y7\u0004~\u0014;\u007f~\r\u000e\u0010\u0016B\u0006\nE\u001c\u001b\u000e\u000eJ \u001cM%\u0011\u001d\u001b\u0017\u0015)\u001bV\u001c\"!$0\u001e*^3*)1%9;9-<w", (short) (C1633zX.Xd() ^ (-22709))));
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(Wg.Zd("<p\nZk\u0011\tkA$\u001c\u000bMf\u001c\u0004U;z\u0005&\u0007\u0014~^oV\u0011muU\u0017\u000f\u0002", (short) (ZN.Xd() ^ 18608), (short) (ZN.Xd() ^ 9508))).getMethod(C1561oA.Xd("`_o>^qhcDqqwyxhqw~~", (short) (C1499aX.Xd() ^ (-18825))), new Class[0]);
            try {
                method4.setAccessible(true);
                if (((Integer) method4.invoke(x509Certificate, objArr4)).intValue() != -1) {
                    throw new CertPathValidatorException(Wg.vd("\u001cNQNH@VTH\u0002HIYZRN4-.@4m:CFG:Fv?Lw\u001c&0+^\u001f`08$1-*e4-$I\u0010\u0011!\"\u001a\u0016\u001c\u0015\u0016(\u001cU\"+\u000f\u0010\u0003\u000fM", (short) (C1499aX.Xd() ^ (-3550))));
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    protected static void processAttrCert4(X509Certificate x509Certificate, Set set) throws Throwable {
        Iterator it = set.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("PFZD\u0010TEBSOEOS\u0007;<HI\u0002+\u0007\u0001\t\u00123?@402+(:*", (short) (C1580rY.Xd() ^ (-32432)), (short) (C1580rY.Xd() ^ (-2477)))).getMethod(hg.Vd("&#1\u000f0\u001c#\u001d\u001a*\rhba\u0001\"\u0018\u001c\u0010\u0015\u001b\u000b\u0015", (short) (FB.Xd() ^ 26635), (short) (FB.Xd() ^ 22974)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((X500Principal) method.invoke(x509Certificate, objArr)).getName(C1561oA.ud(":-)\u0017\u0016\u0018\u0015", (short) (ZN.Xd() ^ 9234))).equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                    z2 = true;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!z2) {
            throw new CertPathValidatorException(C1561oA.yd("6jgfZTddb\u001e^akn`^nidxf\"hs\u0001\u0004p~)sz(\u0004\u0006\b4u{\u0002u\u0001\u0013\b\u00169\u000f\n\u000e\u0019\u001b\t\tO", (short) (OY.Xd() ^ 24110)));
        }
    }

    protected static void processAttrCert5(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        try {
            x509AttributeCertificate.checkValidity(CertPathValidatorUtilities.getValidDate(pKIXExtendedParameters));
        } catch (CertificateExpiredException e2) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e2);
        } catch (CertificateNotYetValidException e3) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e3);
        }
    }

    protected static void processAttrCert7(X509AttributeCertificate x509AttributeCertificate, CertPath certPath, CertPath certPath2, PKIXExtendedParameters pKIXExtendedParameters, Set set) throws CertPathValidatorException {
        Set<String> criticalExtensionOIDs = x509AttributeCertificate.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                TargetInformation.getInstance(CertPathValidatorUtilities.getExtensionValue(x509AttributeCertificate, str));
            } catch (IllegalArgumentException e2) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e2);
            } catch (AnnotatedException e3) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e3);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((PKIXAttrCertChecker) it.next()).check(x509AttributeCertificate, certPath, certPath2, criticalExtensionOIDs);
        }
        if (!criticalExtensionOIDs.isEmpty()) {
            throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
        }
    }
}
