package org.bouncycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.ess.ESSCertID;
import org.bouncycastle.asn1.ess.ESSCertIDv2;
import org.bouncycastle.asn1.ess.SigningCertificate;
import org.bouncycastle.asn1.ess.SigningCertificateV2;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.Accuracy;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerationException;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampTokenGenerator {
    public static final int R_MICROSECONDS = 2;
    public static final int R_MILLISECONDS = 3;
    public static final int R_SECONDS = 0;
    public static final int R_TENTHS_OF_SECONDS = 1;
    private int accuracyMicros;
    private int accuracyMillis;
    private int accuracySeconds;
    private List attrCerts;
    private List certs;
    private List crls;
    private Locale locale;
    boolean ordering;
    private Map otherRevoc;
    private int resolution;
    private SignerInfoGenerator signerInfoGen;
    GeneralName tsa;
    private ASN1ObjectIdentifier tsaPolicyOID;

    public TimeStampTokenGenerator(SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier) throws TSPException, IllegalArgumentException {
        this(signerInfoGenerator, digestCalculator, aSN1ObjectIdentifier, false);
    }

    public TimeStampTokenGenerator(final SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2) throws TSPException, IllegalArgumentException {
        SignerInfoGenerator signerInfoGenerator2;
        this.resolution = 0;
        this.locale = null;
        this.accuracySeconds = -1;
        this.accuracyMillis = -1;
        this.accuracyMicros = -1;
        this.ordering = false;
        this.tsa = null;
        this.certs = new ArrayList();
        this.crls = new ArrayList();
        this.attrCerts = new ArrayList();
        this.otherRevoc = new HashMap();
        this.signerInfoGen = signerInfoGenerator;
        this.tsaPolicyOID = aSN1ObjectIdentifier;
        if (!signerInfoGenerator.hasAssociatedCertificate()) {
            throw new IllegalArgumentException("SignerInfoGenerator must have an associated certificate");
        }
        X509CertificateHolder associatedCertificate = signerInfoGenerator.getAssociatedCertificate();
        TSPUtil.validateCertificate(associatedCertificate);
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(associatedCertificate.getEncoded());
            outputStream.close();
            if (digestCalculator.getAlgorithmIdentifier().getAlgorithm().equals(OIWObjectIdentifiers.idSHA1)) {
                final ESSCertID eSSCertID = new ESSCertID(digestCalculator.getDigest(), z2 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), associatedCertificate.getSerialNumber()) : null);
                signerInfoGenerator2 = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.1
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) throws CMSAttributeTableGenerationException {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        return attributes.get(PKCSObjectIdentifiers.id_aa_signingCertificate) == null ? attributes.add(PKCSObjectIdentifiers.id_aa_signingCertificate, new SigningCertificate(eSSCertID)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            } else {
                final ESSCertIDv2 eSSCertIDv2 = new ESSCertIDv2(new AlgorithmIdentifier(digestCalculator.getAlgorithmIdentifier().getAlgorithm()), digestCalculator.getDigest(), z2 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), new ASN1Integer(associatedCertificate.getSerialNumber())) : null);
                signerInfoGenerator2 = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.2
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) throws CMSAttributeTableGenerationException {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        return attributes.get(PKCSObjectIdentifiers.id_aa_signingCertificateV2) == null ? attributes.add(PKCSObjectIdentifiers.id_aa_signingCertificateV2, new SigningCertificateV2(eSSCertIDv2)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            }
            this.signerInfoGen = signerInfoGenerator2;
        } catch (IOException e2) {
            throw new TSPException("Exception processing certificate.", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[PHI: r1
  0x006e: PHI (r1v4 int) = (r1v3 int), (r1v7 int) binds: [B:20:0x0063, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.bouncycastle.asn1.ASN1GeneralizedTime createGeneralizedTime(java.util.Date r7) throws org.bouncycastle.tsp.TSPException {
        /*
            r6 = this;
            java.util.Locale r0 = r6.locale
            java.lang.String r1 = "yyyyMMddHHmmss.SSS"
            if (r0 != 0) goto L34
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            r4.<init>(r1)
        Lb:
            java.util.SimpleTimeZone r1 = new java.util.SimpleTimeZone
            r0 = 0
            java.lang.String r3 = "Z"
            r1.<init>(r0, r3)
            r4.setTimeZone(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = r4.format(r7)
            r2.<init>(r0)
            java.lang.String r0 = "."
            int r5 = r2.indexOf(r0)
            if (r5 >= 0) goto L3c
            r2.append(r3)
            org.bouncycastle.asn1.ASN1GeneralizedTime r1 = new org.bouncycastle.asn1.ASN1GeneralizedTime
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            return r1
        L34:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.util.Locale r0 = r6.locale
            r4.<init>(r1, r0)
            goto Lb
        L3c:
            int r1 = r6.resolution
            r4 = 1
            if (r1 == r4) goto L5d
            r0 = 2
            if (r1 == r0) goto L66
            r0 = 3
            if (r1 != r0) goto L92
        L47:
            int r0 = r2.length()
            int r0 = r0 - r4
            char r1 = r2.charAt(r0)
            r0 = 48
            if (r1 != r0) goto L76
            int r0 = r2.length()
            int r0 = r0 - r4
            r2.deleteCharAt(r0)
            goto L47
        L5d:
            int r0 = r2.length()
            int r1 = r5 + 2
            if (r0 <= r1) goto L47
            goto L6e
        L66:
            int r0 = r2.length()
            int r1 = r5 + 3
            if (r0 <= r1) goto L47
        L6e:
            int r0 = r2.length()
            r2.delete(r1, r0)
            goto L47
        L76:
            int r0 = r2.length()
            int r0 = r0 - r4
            if (r0 != r5) goto L85
            int r0 = r2.length()
            int r0 = r0 - r4
            r2.deleteCharAt(r0)
        L85:
            r2.append(r3)
            org.bouncycastle.asn1.ASN1GeneralizedTime r1 = new org.bouncycastle.asn1.ASN1GeneralizedTime
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            return r1
        L92:
            org.bouncycastle.tsp.TSPException r2 = new org.bouncycastle.tsp.TSPException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "unknown time-stamp resolution: "
            r1.<init>(r0)
            int r0 = r6.resolution
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tsp.TimeStampTokenGenerator.createGeneralizedTime(java.util.Date):org.bouncycastle.asn1.ASN1GeneralizedTime");
    }

    public void addAttributeCertificates(Store store) {
        this.attrCerts.addAll(store.getMatches(null));
    }

    public void addCRLs(Store store) {
        this.crls.addAll(store.getMatches(null));
    }

    public void addCertificates(Store store) {
        this.certs.addAll(store.getMatches(null));
    }

    public void addOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        this.otherRevoc.put(aSN1ObjectIdentifier, store.getMatches(null));
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) throws TSPException {
        return generate(timeStampRequest, bigInteger, date, null);
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, Extensions extensions) throws TSPException {
        MessageImprint messageImprint = new MessageImprint(new AlgorithmIdentifier(timeStampRequest.getMessageImprintAlgOID(), DERNull.INSTANCE), timeStampRequest.getMessageImprintDigest());
        int i2 = this.accuracySeconds;
        Accuracy accuracy = (i2 > 0 || this.accuracyMillis > 0 || this.accuracyMicros > 0) ? new Accuracy(i2 > 0 ? new ASN1Integer(this.accuracySeconds) : null, this.accuracyMillis > 0 ? new ASN1Integer(this.accuracyMillis) : null, this.accuracyMicros > 0 ? new ASN1Integer(this.accuracyMicros) : null) : null;
        boolean z2 = this.ordering;
        ASN1Boolean aSN1Boolean = z2 ? ASN1Boolean.getInstance(z2) : null;
        ASN1Integer aSN1Integer = timeStampRequest.getNonce() != null ? new ASN1Integer(timeStampRequest.getNonce()) : null;
        ASN1ObjectIdentifier reqPolicy = this.tsaPolicyOID;
        if (timeStampRequest.getReqPolicy() != null) {
            reqPolicy = timeStampRequest.getReqPolicy();
        }
        Extensions extensions2 = timeStampRequest.getExtensions();
        if (extensions != null) {
            ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
            if (extensions2 != null) {
                Enumeration enumerationOids = extensions2.oids();
                while (enumerationOids.hasMoreElements()) {
                    extensionsGenerator.addExtension(extensions2.getExtension(ASN1ObjectIdentifier.getInstance(enumerationOids.nextElement())));
                }
            }
            Enumeration enumerationOids2 = extensions.oids();
            while (enumerationOids2.hasMoreElements()) {
                extensionsGenerator.addExtension(extensions.getExtension(ASN1ObjectIdentifier.getInstance(enumerationOids2.nextElement())));
            }
            extensions2 = extensionsGenerator.generate();
        }
        TSTInfo tSTInfo = new TSTInfo(reqPolicy, messageImprint, new ASN1Integer(bigInteger), this.resolution == 0 ? this.locale == null ? new ASN1GeneralizedTime(date) : new ASN1GeneralizedTime(date, this.locale) : createGeneralizedTime(date), accuracy, aSN1Boolean, aSN1Integer, this.tsa, extensions2);
        try {
            CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
            if (timeStampRequest.getCertReq()) {
                cMSSignedDataGenerator.addCertificates(new CollectionStore(this.certs));
                cMSSignedDataGenerator.addAttributeCertificates(new CollectionStore(this.attrCerts));
            }
            cMSSignedDataGenerator.addCRLs(new CollectionStore(this.crls));
            if (!this.otherRevoc.isEmpty()) {
                for (ASN1ObjectIdentifier aSN1ObjectIdentifier : this.otherRevoc.keySet()) {
                    cMSSignedDataGenerator.addOtherRevocationInfo(aSN1ObjectIdentifier, new CollectionStore((Collection) this.otherRevoc.get(aSN1ObjectIdentifier)));
                }
            }
            cMSSignedDataGenerator.addSignerInfoGenerator(this.signerInfoGen);
            return new TimeStampToken(cMSSignedDataGenerator.generate(new CMSProcessableByteArray(PKCSObjectIdentifiers.id_ct_TSTInfo, tSTInfo.getEncoded("DER")), true));
        } catch (IOException e2) {
            throw new TSPException("Exception encoding info", e2);
        } catch (CMSException e3) {
            throw new TSPException("Error generating time-stamp token", e3);
        }
    }

    public void setAccuracyMicros(int i2) {
        this.accuracyMicros = i2;
    }

    public void setAccuracyMillis(int i2) {
        this.accuracyMillis = i2;
    }

    public void setAccuracySeconds(int i2) {
        this.accuracySeconds = i2;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setOrdering(boolean z2) {
        this.ordering = z2;
    }

    public void setResolution(int i2) {
        this.resolution = i2;
    }

    public void setTSA(GeneralName generalName) {
        this.tsa = generalName;
    }
}
