package org.spongycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.cms.Attribute;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.ExtendedKeyUsage;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.asn1.x509.KeyPurposeId;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cms.SignerInformation;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;
import org.spongycastle.util.Integers;

/* JADX INFO: loaded from: classes2.dex */
public class TSPUtil {
    private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private static final Map digestLengths;
    private static final Map digestNames;

    static {
        HashMap map = new HashMap();
        digestLengths = map;
        HashMap map2 = new HashMap();
        digestNames = map2;
        map.put(PKCSObjectIdentifiers.md5.getId(), Integers.valueOf(16));
        map.put(OIWObjectIdentifiers.idSHA1.getId(), Integers.valueOf(20));
        map.put(NISTObjectIdentifiers.id_sha224.getId(), Integers.valueOf(28));
        map.put(NISTObjectIdentifiers.id_sha256.getId(), Integers.valueOf(32));
        map.put(NISTObjectIdentifiers.id_sha384.getId(), Integers.valueOf(48));
        map.put(NISTObjectIdentifiers.id_sha512.getId(), Integers.valueOf(64));
        map.put(TeleTrusTObjectIdentifiers.ripemd128.getId(), Integers.valueOf(16));
        map.put(TeleTrusTObjectIdentifiers.ripemd160.getId(), Integers.valueOf(20));
        map.put(TeleTrusTObjectIdentifiers.ripemd256.getId(), Integers.valueOf(32));
        map.put(CryptoProObjectIdentifiers.gostR3411.getId(), Integers.valueOf(32));
        map2.put(PKCSObjectIdentifiers.md5.getId(), MessageDigestAlgorithms.MD5);
        map2.put(OIWObjectIdentifiers.idSHA1.getId(), "SHA1");
        map2.put(NISTObjectIdentifiers.id_sha224.getId(), "SHA224");
        map2.put(NISTObjectIdentifiers.id_sha256.getId(), McElieceCCA2ParameterSpec.DEFAULT_MD);
        map2.put(NISTObjectIdentifiers.id_sha384.getId(), "SHA384");
        map2.put(NISTObjectIdentifiers.id_sha512.getId(), "SHA512");
        map2.put(PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), "SHA1");
        map2.put(PKCSObjectIdentifiers.sha224WithRSAEncryption.getId(), "SHA224");
        map2.put(PKCSObjectIdentifiers.sha256WithRSAEncryption.getId(), McElieceCCA2ParameterSpec.DEFAULT_MD);
        map2.put(PKCSObjectIdentifiers.sha384WithRSAEncryption.getId(), "SHA384");
        map2.put(PKCSObjectIdentifiers.sha512WithRSAEncryption.getId(), "SHA512");
        map2.put(TeleTrusTObjectIdentifiers.ripemd128.getId(), "RIPEMD128");
        map2.put(TeleTrusTObjectIdentifiers.ripemd160.getId(), "RIPEMD160");
        map2.put(TeleTrusTObjectIdentifiers.ripemd256.getId(), "RIPEMD256");
        map2.put(CryptoProObjectIdentifiers.gostR3411.getId(), "GOST3411");
    }

    static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws TSPIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z2, aSN1Encodable);
        } catch (IOException e2) {
            throw new TSPIOException("cannot encode extension: " + e2.getMessage(), e2);
        }
    }

    static int getDigestLength(String str) throws TSPException {
        Integer num = (Integer) digestLengths.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new TSPException("digest algorithm cannot be found.");
    }

    static List getExtensionOIDs(Extensions extensions) {
        return extensions == null ? EMPTY_LIST : Collections.unmodifiableList(Arrays.asList(extensions.getExtensionOIDs()));
    }

    public static Collection getSignatureTimestamps(SignerInformation signerInformation, DigestCalculatorProvider digestCalculatorProvider) throws TSPValidationException {
        ArrayList arrayList = new ArrayList();
        AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        if (unsignedAttributes != null) {
            ASN1EncodableVector all = unsignedAttributes.getAll(PKCSObjectIdentifiers.id_aa_signatureTimeStampToken);
            for (int i2 = 0; i2 < all.size(); i2++) {
                ASN1Set attrValues = ((Attribute) all.get(i2)).getAttrValues();
                for (int i3 = 0; i3 < attrValues.size(); i3++) {
                    try {
                        TimeStampToken timeStampToken = new TimeStampToken(ContentInfo.getInstance(attrValues.getObjectAt(i3)));
                        TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
                        DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampInfo.getHashAlgorithm());
                        OutputStream outputStream = digestCalculator.getOutputStream();
                        outputStream.write(signerInformation.getSignature());
                        outputStream.close();
                        if (!org.spongycastle.util.Arrays.constantTimeAreEqual(digestCalculator.getDigest(), timeStampInfo.getMessageImprintDigest())) {
                            throw new TSPValidationException("Incorrect digest in message imprint");
                        }
                        arrayList.add(timeStampToken);
                    } catch (OperatorCreationException unused) {
                        throw new TSPValidationException("Unknown hash algorithm specified in timestamp");
                    } catch (Exception unused2) {
                        throw new TSPValidationException("Timestamp could not be parsed");
                    }
                }
            }
        }
        return arrayList;
    }

    public static void validateCertificate(X509CertificateHolder x509CertificateHolder) throws TSPValidationException {
        if (x509CertificateHolder.toASN1Structure().getVersionNumber() != 3) {
            throw new IllegalArgumentException("Certificate must have an ExtendedKeyUsage extension.");
        }
        Extension extension = x509CertificateHolder.getExtension(Extension.extendedKeyUsage);
        if (extension == null) {
            throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension.");
        }
        if (!extension.isCritical()) {
            throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension marked as critical.");
        }
        ExtendedKeyUsage extendedKeyUsage = ExtendedKeyUsage.getInstance(extension.getParsedValue());
        if (!extendedKeyUsage.hasKeyPurposeId(KeyPurposeId.id_kp_timeStamping) || extendedKeyUsage.size() != 1) {
            throw new TSPValidationException("ExtendedKeyUsage not solely time stamping.");
        }
    }
}
