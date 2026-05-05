package org.spongycastle.jce.provider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.ExtendedPKIXParameters;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.spongycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws Throwable {
        PKIXExtendedParameters baseParameters;
        X500Name subjectPrincipal;
        PublicKey publicKey;
        HashSet hashSet;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            baseParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            baseParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                short sXd = (short) (C1499aX.Xd() ^ (-15359));
                short sXd2 = (short) (C1499aX.Xd() ^ (-32102));
                int[] iArr = new int["$6H8E>N@NP}LUTV\u0003FJ\u0006H\b".length()];
                QB qb = new QB("$6H8E>N@NP}LUTV\u0003FJ\u0006H\b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i2)).append(PKIXParameters.class.getName());
                short sXd3 = (short) (Od.Xd() ^ (-12090));
                int[] iArr2 = new int["e.266\".\"#j".length()];
                QB qb2 = new QB("e.266\".\"#j");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                throw new InvalidAlgorithmParameterException(sbAppend.append(new String(iArr2, 0, i3)).toString());
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException(C1561oA.Qd("\b\u0005\u0007\u0004\u0004O{osy{{'ox$qwml+\u001eqddm\u0019aj\u0016ccg\u0012R\\[]dQO\nOWY\u0006HIUVJFHA>PDIGwG7I<rH2<82.@497u", (short) (C1580rY.Xd() ^ (-26677))));
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        int algorithmIdentifier = -1;
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException(EO.Od("\u0007nO7f\u0011\u001eq;od\u0007U\u0003IYB./.s}O]\u001c:bD", (short) (OY.Xd() ^ 101)), null, certPath, -1);
        }
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor == null) {
                throw new CertPathValidatorException(Ig.wd("\u0001q\u0005!\u007fu\u0019l:ADkm,#J:mFyd\u0004liL, ?-|\u0010E\f\u007fYUtW_zC#uf\r@", (short) (FB.Xd() ^ 32575)), null, certPath, -1);
            }
            PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
            int iPrepareNextCertI2 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[iPrepareNextCertI2];
            for (int i4 = 0; i4 < iPrepareNextCertI2; i4++) {
                arrayListArr[i4] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            short sXd4 = (short) (C1580rY.Xd() ^ (-16011));
            int[] iArr3 = new int["HCIALRFJ@;<".length()];
            QB qb3 = new QB("HCIALRFJ@;<");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((sXd4 ^ i5) + xuXd3.CK(iKK3));
                i5++;
            }
            hashSet3.add(new String(iArr3, 0, i5));
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), Qg.kd("'\"( #)\u001d!\u001f\u001a\u001b", (short) (Od.Xd() ^ (-2719)), (short) (Od.Xd() ^ (-692))), false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int iPrepareNextCertI1 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : iPrepareNextCertI2;
            int iPrepareNextCertJ = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : iPrepareNextCertI2;
            if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                iPrepareNextCertI2 = 0;
            }
            X509Certificate trustedCert = trustAnchorFindTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    subjectPrincipal = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    publicKey = trustedCert.getPublicKey();
                } else {
                    subjectPrincipal = PrincipalUtils.getCA(trustAnchorFindTrustAnchor);
                    publicKey = trustAnchorFindTrustAnchor.getCAPublicKey();
                }
                try {
                    algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                    if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                        short sXd5 = (short) (Od.Xd() ^ (-8952));
                        short sXd6 = (short) (Od.Xd() ^ (-26995));
                        int[] iArr4 = new int["\u0006\u0012\"\u0016\u0013!K\u000e\u000f\u001b\u001c\u0010\f\u000e\u0007\u0004\u0016\u0006?\b\f<~\u007f\f\r\u0001|~wt\u0007z\u007f}.}m\u007fr)lvkx$qqu l_q_c\u001amYi]Zh6a_cc`NUY^\\\u0016".length()];
                        QB qb4 = new QB("\u0006\u0012\"\u0016\u0013!K\u000e\u000f\u001b\u001c\u0010\f\u000e\u0007\u0004\u0016\u0006?\b\f<~\u007f\f\r\u0001|~wt\u0007z\u007f}.}m\u007fr)lvkx$qqu l_q_c\u001amYi]Zh6a_cc`NUY^\\\u0016");
                        int i6 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i6] = xuXd4.fK(sXd5 + i6 + xuXd4.CK(iKK4) + sXd6);
                            i6++;
                        }
                        throw new ExtCertPathValidatorException(new String(iArr4, 0, i6), null, certPath, 0);
                    }
                    List certPathCheckers = pKIXExtendedParametersBuild.getCertPathCheckers();
                    Iterator it = certPathCheckers.iterator();
                    while (it.hasNext()) {
                        ((PKIXCertPathChecker) it.next()).init(false);
                    }
                    int size2 = certificates.size() - 1;
                    int iPrepareNextCertM = size;
                    X509Certificate x509Certificate = null;
                    while (size2 >= 0) {
                        int i7 = size - size2;
                        x509Certificate = (X509Certificate) certificates.get(size2);
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParametersBuild, size2, publicKey, size2 == certificates.size() + (-1), subjectPrincipal, trustedCert, this.helper);
                        RFC3280CertPathUtilities.processCertBC(certPath, size2, pKIXNameConstraintValidator);
                        pKIXPolicyNode = RFC3280CertPathUtilities.processCertE(certPath, size2, RFC3280CertPathUtilities.processCertD(certPath, size2, hashSet4, pKIXPolicyNode, arrayListArr, iPrepareNextCertJ));
                        RFC3280CertPathUtilities.processCertF(certPath, size2, pKIXPolicyNode, iPrepareNextCertI1);
                        if (i7 != size) {
                            if (x509Certificate != null) {
                                Object[] objArr = new Object[0];
                                Method method = Class.forName(C1561oA.ud("8.B,w<-*;7-7;n#$01i\u0013nhpy\u001b'(\u001c\u0018\u001a\u0013\u0010\"\u0012", (short) (C1580rY.Xd() ^ (-21810)))).getMethod(C1561oA.yd("-,<\u001f'57.--", (short) (ZN.Xd() ^ 21788)), new Class[0]);
                                try {
                                    method.setAccessible(true);
                                    if (((Integer) method.invoke(x509Certificate, objArr)).intValue() == 1) {
                                        short sXd7 = (short) (C1607wl.Xd() ^ 9886);
                                        int[] iArr5 = new int["dt\u0003\u0005{\u0003\u00035G7{~\r\u0010\u0006\u0004\b\u0003\u0002\u0016\b\u0017D\t\b\u0016O\u001eJ\u000e\u0012M$#\u0016\u0016R\u0015(UyxX))!0k".length()];
                                        QB qb5 = new QB("dt\u0003\u0005{\u0003\u00035G7{~\r\u0010\u0006\u0004\b\u0003\u0002\u0016\b\u0017D\t\b\u0016O\u001eJ\u000e\u0012M$#\u0016\u0016R\u0015(UyxX))!0k");
                                        int i8 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i8] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd7 + sXd7) + sXd7) + i8));
                                            i8++;
                                        }
                                        throw new CertPathValidatorException(new String(iArr5, 0, i8), null, certPath, size2);
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                            RFC3280CertPathUtilities.prepareNextCertA(certPath, size2);
                            pKIXPolicyNode = RFC3280CertPathUtilities.prepareCertB(certPath, size2, arrayListArr, pKIXPolicyNode, iPrepareNextCertI2);
                            RFC3280CertPathUtilities.prepareNextCertG(certPath, size2, pKIXNameConstraintValidator);
                            int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, size2, iPrepareNextCertI1);
                            int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, size2, iPrepareNextCertI2);
                            int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, size2, iPrepareNextCertJ);
                            iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, size2, iPrepareNextCertH1);
                            iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, size2, iPrepareNextCertH2);
                            iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, size2, iPrepareNextCertH3);
                            RFC3280CertPathUtilities.prepareNextCertK(certPath, size2);
                            iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, size2, RFC3280CertPathUtilities.prepareNextCertL(certPath, size2, iPrepareNextCertM));
                            RFC3280CertPathUtilities.prepareNextCertN(certPath, size2);
                            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                hashSet2 = new HashSet(criticalExtensionOIDs);
                                hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            } else {
                                hashSet2 = new HashSet();
                            }
                            RFC3280CertPathUtilities.prepareNextCertO(certPath, size2, hashSet2, certPathCheckers);
                            subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate);
                            try {
                                publicKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), size2, this.helper);
                                AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                                algorithmIdentifier2.getAlgorithm();
                                algorithmIdentifier2.getParameters();
                                trustedCert = x509Certificate;
                            } catch (CertPathValidatorException e3) {
                                throw new CertPathValidatorException(Xg.qd("Meyv#{txrqwq+wr\b/s\u0001\b\u007fx5\u0005\u0007\r9|\u0001<\u0010\u0004\u0014\u0013\u000b\b\u001a\n\nT", (short) (C1580rY.Xd() ^ (-27539)), (short) (C1580rY.Xd() ^ (-6895))), e3, certPath, size2);
                            }
                        }
                        size2--;
                        pKIXExtendedParametersBuild = pKIXExtendedParameters;
                    }
                    int i9 = size2 + 1;
                    int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i9, RFC3280CertPathUtilities.wrapupCertA(iPrepareNextCertI1, x509Certificate));
                    Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i9, certPathCheckers, hashSet);
                    PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParametersBuild, initialPolicies, i9, arrayListArr, pKIXPolicyNode, hashSet4);
                    if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchorFindTrustAnchor, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException(Jg.Wd("\u001c:HK\u0006ebnev\u007f\u000f\b\u001c\u0010W\u0001\u000b\u000e \u001c*`?A\u0002M[[g\\\u0002Y", (short) (OY.Xd() ^ 13498), (short) (OY.Xd() ^ 30441)), null, certPath, size2);
                } catch (CertPathValidatorException e4) {
                    throw new ExtCertPathValidatorException(ZO.xd("\u0007[%\r9s2`J\u001du#d}>9\b~37N\u001fvG+@a*3.{g\u001b\u0006\u0006\u0013\n8~8PaXlAdqCtX <c5cKsx7Z2{].\ns<_w", (short) (ZN.Xd() ^ 7566), (short) (ZN.Xd() ^ 26444)), e4, certPath, -1);
                }
            } catch (IllegalArgumentException e5) {
                short sXd8 = (short) (Od.Xd() ^ (-12377));
                short sXd9 = (short) (Od.Xd() ^ (-6130));
                int[] iArr6 = new int["|\u0019x\u0015BT^t:mOp#\tF<\u0013yrQkl\u0010\u001cb\u000e\u0005\u001d\"N4<D\u000bPt\u0019\u000e!Z\u0010Fpxc)*\u001c#".length()];
                QB qb6 = new QB("|\u0019x\u0015BT^t:mOp#\tF<\u0013yrQkl\u0010\u001cb\u000e\u0005\u001d\"N4<D\u000bPt\u0019\u000e!Z\u0010Fpxc)*\u001c#");
                int i10 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i10] = xuXd6.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + (i10 * sXd9))) + xuXd6.CK(iKK6));
                    i10++;
                }
                throw new ExtCertPathValidatorException(new String(iArr6, 0, i10), e5, certPath, algorithmIdentifier);
            }
        } catch (AnnotatedException e6) {
            throw new CertPathValidatorException(e6.getMessage(), e6, certPath, certificates.size() - 1);
        }
    }
}
