package org.spongycastle.x509;

import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.x509.AccessDescription;
import org.spongycastle.asn1.x509.AuthorityInformationAccess;
import org.spongycastle.asn1.x509.AuthorityKeyIdentifier;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.DistributionPointName;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.GeneralSubtree;
import org.spongycastle.asn1.x509.NameConstraints;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.asn1.x509.qualified.MonetaryValue;
import org.spongycastle.asn1.x509.qualified.QCStatement;
import org.spongycastle.i18n.ErrorBundle;
import org.spongycastle.i18n.filter.TrustedInput;
import org.spongycastle.i18n.filter.UntrustedInput;
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.jce.provider.PKIXNameConstraintValidator;
import org.spongycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.spongycastle.util.Integers;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.spongycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected List[] errors;
    private boolean initialized;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f28207n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = X509Extensions.QCStatements.getId();
    private static final String CRL_DIST_POINTS = X509Extensions.CRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 != bArr.length; i2++) {
                stringBuffer.append(Integer.toHexString((-1) - (((-1) - bArr[i2]) | ((-1) - 255))));
                stringBuffer.append(TokenParser.SP);
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e2) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e2.getMessage(), e2, e2.getClass().getName()}), e2);
                }
            } catch (CertPathReviewerException e3) {
                addError(e3.getErrorMessage(), e3.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(KEY_USAGE);
                criticalExtensionOIDs.remove(CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(NAME_CONSTRAINTS);
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e4) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e4.getMessage(), e4, e4.getClass().getName()}), e4.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i2 = 0; i2 < aSN1Sequence2.size(); i2++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i2));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e2) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e2, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e3) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e3, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e4) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e5) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e5, this.certPath, size);
                        }
                    } catch (IOException e6) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e6, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) getExtensionValue(x509Certificate, NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i3 = 0; i3 != excludedSubtrees.length; i3++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i3]);
                            }
                        }
                    }
                } catch (AnnotatedException e7) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e7, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e8) {
            addError(e8.getErrorMessage(), e8.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int iIntValue;
        int i2 = this.f28207n;
        int i3 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!isSelfIssued(x509Certificate)) {
                if (i2 <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i2--;
                i3++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate, BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (iIntValue = pathLenConstraint.intValue()) < i2) {
                i2 = iIntValue;
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i3)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        r31 = getQualifierSet(r1.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        r18 = r3[r9 - 1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r5 >= r18.size()) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        r1 = (org.spongycastle.jce.provider.PKIXPolicyNode) r18.get(r5);
        r17 = r1.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
    
        if (r17.hasNext() == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0160, code lost:
    
        r0 = r17.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0168, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016a, code lost:
    
        r16 = r1.getChildren();
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0173, code lost:
    
        if (r16.hasNext() == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0183, code lost:
    
        if (r0.equals(((org.spongycastle.jce.provider.PKIXPolicyNode) r16.next()).getValidPolicy()) == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (r15 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0189, code lost:
    
        r15 = new java.util.HashSet();
        r15.add(r0);
        r14 = new org.spongycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r9, r15, r1, r31, r0, false);
        r1.addChild(r14);
        r3[r9].add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b2, code lost:
    
        if ((r0 instanceof org.spongycastle.asn1.ASN1ObjectIdentifier) == false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b4, code lost:
    
        r0 = ((org.spongycastle.asn1.ASN1ObjectIdentifier) r0).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01bc, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkPolicy() {
        /*
            Method dump skipped, instruction units count: 1439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkSignatures() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    private X509CRL getCRL(String str) throws Throwable {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals(C1561oA.od("U`_Z", (short) (C1580rY.Xd() ^ (-12899)))) && !url.getProtocol().equals(C1561oA.Kd("q~\u007f|\u0001", (short) (FB.Xd() ^ 20017)))) {
                return null;
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            Callback.connect(httpURLConnection);
            if (Callback.getResponseCode(httpURLConnection) != 200) {
                throw new Exception(Callback.getResponseMessage(httpURLConnection));
            }
            short sXd = (short) (C1607wl.Xd() ^ 10906);
            short sXd2 = (short) (C1607wl.Xd() ^ 19455);
            int[] iArr = new int["%\u0005\u0017\u001a,".length()];
            QB qb = new QB("%\u0005\u0017\u001a,");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            String strXd = C1561oA.Xd("aR", (short) (OY.Xd() ^ 29819));
            Class<?> cls = Class.forName(Wg.vd("$\u001c.\u001ac*\u0019\u001875)57l\u001f\"\u001c\u001fUk\u000b\u0019\u0018\u000e\u0018\u001c\u0013\u0012\"\u0014q\u000e|\u000f\u0007\u000b\u000f", (short) (C1580rY.Xd() ^ (-18968))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Qg.kd("1';%p.\".&k\u00100-#'\u001f", (short) (Od.Xd() ^ (-2302)), (short) (Od.Xd() ^ (-2443))));
            clsArr[1] = Class.forName(hg.Vd("I?S=\tF:F>\u0004(HE;?7", (short) (C1607wl.Xd() ^ 15778), (short) (C1607wl.Xd() ^ 2509)));
            Object[] objArr = {str2, strXd};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("2/=\u0011599%1%&", (short) (Od.Xd() ^ (-27661))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                InputStream inputStream = Callback.getInputStream(httpURLConnection);
                Class<?> cls2 = Class.forName(C1561oA.yd("I?S=\tM>;LH>HL\u007f45ABz\u000f0<=1-/(%7'\u0007!\"2,.4", (short) (C1607wl.Xd() ^ 7269)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.Yd("g_ua/kr2Ntw}}]\u007f~ro|", (short) (C1499aX.Xd() ^ (-1061))));
                Object[] objArr2 = {inputStream};
                Method method = cls2.getMethod(Xg.qd("poyq\u007fo\u0004uTd_", (short) (FB.Xd() ^ 30701), (short) (FB.Xd() ^ 20087)), clsArr2);
                try {
                    method.setAccessible(true);
                    return (X509CRL) ((CRL) method.invoke(certificateFactory, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            Object[] objArr3 = {new UntrustedInput(str), e4.getMessage(), e4, e4.getClass().getName()};
            short sXd3 = (short) (C1607wl.Xd() ^ 32323);
            short sXd4 = (short) (C1607wl.Xd() ^ 28352);
            int[] iArr2 = new int["e\u0017F?\u001fL\u00056I\u000e0\u0018\rHr\u0014~\u0003q\u0017Hon\u0004;msvs\u001a,y-\nxCS\u000bWi\u0010Bjbzu".length()];
            QB qb2 = new QB("e\u0017F?\u001fL\u00056I\u000e0\u0018\rHr\u0014~\u0003q\u0017Hon\u0004;msvs\u001a,y-\nxCS\u000bWi\u0010Bjbzu");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            throw new CertPathReviewerException(new ErrorBundle(new String(iArr2, 0, i3), ZO.xd("&qp@W4\u0012\u0014Bt?&r\u0006j.Z7I\u001d9PUGu\u0010 @fos\r@\u0017u3j\u0016", (short) (C1607wl.Xd() ^ 23967), (short) (C1607wl.Xd() ^ 17036)), objArr3));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i2) {
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z2 = false;
            for (int i3 = 0; i3 < aSN1Sequence.size(); i3++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i3));
                if (QCStatement.id_etsi_qcs_QcCompliance.equals(qCStatement.getStatementId())) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance"), i2);
                } else if (!QCStatement.id_qcs_pkixQCSyntax_v1.equals(qCStatement.getStatementId())) {
                    if (QCStatement.id_etsi_qcs_QcSSCD.equals(qCStatement.getStatementId())) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD"), i2);
                    } else if (QCStatement.id_etsi_qcs_LimiteValue.equals(qCStatement.getStatementId())) {
                        MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                        monetaryValue.getCurrency();
                        double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                        addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i2);
                    } else {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i2);
                        z2 = true;
                    }
                }
            }
            return !z2;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i2);
            return false;
        }
    }

    protected void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    protected void addError(ErrorBundle errorBundle, int i2) {
        if (i2 < -1 || i2 >= this.f28207n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i2 + 1].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle, int i2) {
        if (i2 < -1 || i2 >= this.f28207n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i2 + 1].add(errorBundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d7  */
    /* JADX WARN: Type inference failed for: r0v143, types: [org.spongycastle.x509.PKIXCRLUtil] */
    /* JADX WARN: Type inference failed for: r0v340, types: [org.spongycastle.x509.PKIXCRLUtil] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.security.cert.PKIXParameters] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.security.cert.PKIXParameters] */
    /* JADX WARN: Type inference failed for: r2v35, types: [org.spongycastle.x509.PKIXCRLUtil] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void checkCRLs(java.security.cert.PKIXParameters r25, java.security.cert.X509Certificate r26, java.util.Date r27, java.security.cert.X509Certificate r28, java.security.PublicKey r29, java.util.Vector r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    protected void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i2) throws Throwable {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i2);
    }

    protected void doChecks() throws Throwable {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i2 = this.f28207n;
        this.notifications = new List[i2 + 1];
        this.errors = new List[i2 + 1];
        int i3 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i3 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i3] = new ArrayList();
            this.errors[i3] = new ArrayList();
            i3++;
        }
    }

    protected Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i2 = 0; i2 < names.length; i2++) {
                        if (names[i2].getTagNo() == 6) {
                            vector.add(((DERIA5String) names[i2].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f28207n;
    }

    public List getErrors(int i2) throws Throwable {
        doChecks();
        return this.errors[i2 + 1];
    }

    public List[] getErrors() throws Throwable {
        doChecks();
        return this.errors;
    }

    public List getNotifications(int i2) throws Throwable {
        doChecks();
        return this.notifications[i2 + 1];
    }

    public List[] getNotifications() throws Throwable {
        doChecks();
        return this.notifications;
    }

    protected Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i2 = 0; i2 < accessDescriptions.length; i2++) {
                if (accessDescriptions[i2].getAccessMethod().equals(AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i2].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((DERIA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() throws Throwable {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() throws Throwable {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() throws Throwable {
        doChecks();
        return this.trustAnchor;
    }

    protected Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(X509Extensions.AuthorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                if (keyIdentifier != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        this.certPath = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.f28207n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        PKIXParameters pKIXParameters2 = (PKIXParameters) pKIXParameters.clone();
        this.pkixParams = pKIXParameters2;
        this.validDate = getValidDate(pKIXParameters2);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() throws Throwable {
        doChecks();
        int i2 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i2 >= listArr.length) {
                return true;
            }
            if (!listArr[i2].isEmpty()) {
                return false;
            }
            i2++;
        }
    }
}
