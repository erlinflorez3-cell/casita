package org.bouncycastle.jce.provider;

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
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;
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
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
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
                short sXd = (short) (C1580rY.Xd() ^ (-20350));
                int[] iArr = new int["\u0007\u0019+\u001b(!1#13`/879e)-h+j".length()];
                QB qb = new QB("\u0007\u0019+\u001b(!1#13`/879e)-h+j");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                throw new InvalidAlgorithmParameterException(new String(iArr, 0, i2) + PKIXParameters.class.getName() + Wg.Zd("V[89\u0012:\u001f\u0010y]", (short) (Od.Xd() ^ (-17476)), (short) (Od.Xd() ^ (-10868))));
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException(C1561oA.od("&#%\"\"m\u001a\u000e\u0012\u0018\u001a\u001aE\u000e\u0017B\u0010\u0016\f\u000bI<\u0010\u0003\u0003\f7\u007f\t4\u0002\u0002\u00060pzy{\u0003om(muw$fgsthdf_\\nbge\u0016eUgZ\u0011fPZVPL^RWU\u0014", (short) (FB.Xd() ^ 11537)));
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        int algorithmIdentifier = -1;
        if (certificates.isEmpty()) {
            short sXd2 = (short) (C1580rY.Xd() ^ (-19498));
            short sXd3 = (short) (C1580rY.Xd() ^ (-902));
            int[] iArr2 = new int["v\u001a(+!\u001f#\u001e\u001d1'..`2$8-e0;h/8<AG|".length()];
            QB qb2 = new QB("v\u001a(+!\u001f#\u001e\u001d1'..`2$8-e0;h/8<AG|");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            throw new CertPathValidatorException(new String(iArr2, 0, i3), null, certPath, -1);
        }
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor == null) {
                throw new CertPathValidatorException(C1561oA.Qd("Fcebb\rMYMQWY\u0006KSU\u0002DEQRFBD=:L@ECsC3E8n<<@j08=5*r", (short) (C1499aX.Xd() ^ (-4141))), null, certPath, -1);
            }
            PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
            int iPrepareNextCertI2 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[iPrepareNextCertI2];
            for (int i4 = 0; i4 < iPrepareNextCertI2; i4++) {
                arrayListArr[i4] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add(hg.Vd("\u0016\u0011\u0017\u000f\u0012\u0018\f\u0010\u000e\t\n", (short) (FB.Xd() ^ 9724), (short) (FB.Xd() ^ 11038)));
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), C1561oA.ud("d_e]`fZ^\\WX", (short) (Od.Xd() ^ (-17105))), false);
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
                        throw new ExtCertPathValidatorException(C1561oA.yd("]iymr\u0001+mfrsgkmfc\u000e}7\u007f\f<~\u007f\u0004\u0005xt~wt\u0007\u0013\u0018\u0016F\u001e\u000e \u0013A\u0005\u000f\u0004\u0019D\u0012\u0012.X%\u00182 $Z&\u0012\"\u0016\u001b)v\"7;;8.59>4m", (short) (ZN.Xd() ^ 24763)), null, certPath, 0);
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
                        int i5 = size - size2;
                        x509Certificate = (X509Certificate) certificates.get(size2);
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParametersBuild, size2, publicKey, size2 == certificates.size() + (-1), subjectPrincipal, trustedCert, this.helper);
                        RFC3280CertPathUtilities.processCertBC(certPath, size2, pKIXNameConstraintValidator);
                        pKIXPolicyNode = RFC3280CertPathUtilities.processCertE(certPath, size2, RFC3280CertPathUtilities.processCertD(certPath, size2, hashSet4, pKIXPolicyNode, arrayListArr, iPrepareNextCertJ));
                        RFC3280CertPathUtilities.processCertF(certPath, size2, pKIXPolicyNode, iPrepareNextCertI1);
                        if (i5 != size) {
                            if (x509Certificate != null) {
                                Class<?> cls = Class.forName(C1561oA.Yd("rj\u0001l:\u0001sr\u0006\u0004{\b\u000eCy|\u000b\u000eHsQMWb\u0006\u0014\u0017\r\u000b\u000f\n\t\u001d\u000f", (short) (C1607wl.Xd() ^ 18136)));
                                Class<?>[] clsArr = new Class[0];
                                Object[] objArr = new Object[0];
                                short sXd4 = (short) (OY.Xd() ^ 4501);
                                short sXd5 = (short) (OY.Xd() ^ 27046);
                                int[] iArr3 = new int["\u0006\u0005\u0015w\b\u0016\u0018\u000f\u0016\u0016".length()];
                                QB qb3 = new QB("\u0006\u0005\u0015w\b\u0016\u0018\u000f\u0016\u0016");
                                int i6 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i6] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i6)) + sXd5);
                                    i6++;
                                }
                                Method method = cls.getMethod(new String(iArr3, 0, i6), clsArr);
                                try {
                                    method.setAccessible(true);
                                    if (((Integer) method.invoke(x509Certificate, objArr)).intValue() == 1) {
                                        throw new CertPathValidatorException(Jg.Wd("D\bI\u0001%?tZ\u001c?\u0017Q\u000bAl\u007f1_\u0012=Z\u001f\u0002y\u0006G6:\u0012l$\u0013\u0017KS\u0007nh\u000foCu\u000bn\u001cI\fz", (short) (C1499aX.Xd() ^ (-24432)), (short) (C1499aX.Xd() ^ (-13987))), null, certPath, size2);
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
                                throw new CertPathValidatorException(ZO.xd("%UH)MbpL\u0010\u0006/%\u001ev\f\u0002Aqe#y=ivSED>r\u001f:}i/0h1UfT", (short) (C1580rY.Xd() ^ (-31772)), (short) (C1580rY.Xd() ^ (-32648))), e3, certPath, size2);
                            }
                        }
                        size2--;
                        pKIXExtendedParametersBuild = pKIXExtendedParameters;
                    }
                    int i7 = size2 + 1;
                    int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i7, RFC3280CertPathUtilities.wrapupCertA(iPrepareNextCertI1, x509Certificate));
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
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i7, certPathCheckers, hashSet);
                    PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParametersBuild, initialPolicies, i7, arrayListArr, pKIXPolicyNode, hashSet4);
                    if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchorFindTrustAnchor, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException(C1626yg.Ud("\\i\u0016yp\u000b\u0016:\u001d\u0017]LIf\\j'\u001f'y(&=\u0019\u0003+\u0002\u0013\"i\u001dlQ", (short) (OY.Xd() ^ 16101), (short) (OY.Xd() ^ 31150)), null, certPath, size2);
                } catch (CertPathValidatorException e4) {
                    throw new ExtCertPathValidatorException(Ig.wd("_:%\u0014\u0015N\u0004}Sh6\rb[G\u0019x\u00145xgp\fGIP\\\u0012GP7 H\u0004\"-M!x^[~Uh\"!0\\_H\fz1\\\u0011z>d\u0017\u0018E_\u000e\\t}7\u0010A", (short) (C1633zX.Xd() ^ (-4613))), e4, certPath, -1);
                }
            } catch (IllegalArgumentException e5) {
                throw new ExtCertPathValidatorException(EO.Od("\u0007^o\u0015z.\u00116)Q\u0003{)0,T5\u0007.I\u0011f=h~dO\u0013R\u0003#\u000bq}\u0011\\qS\u0003\nGn\u001e+;Bj?X", (short) (C1580rY.Xd() ^ (-5002))), e5, certPath, algorithmIdentifier);
            }
        } catch (AnnotatedException e6) {
            throw new CertPathValidatorException(e6.getMessage(), e6, certPath, certificates.size() - 1);
        }
    }
}
