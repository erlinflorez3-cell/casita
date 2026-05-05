package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;

/* JADX INFO: loaded from: classes6.dex */
class CMSUtils {
    private static final Set ecAlgs;
    private static final Set mqvAlgs;

    static {
        HashSet hashSet = new HashSet();
        mqvAlgs = hashSet;
        HashSet hashSet2 = new HashSet();
        ecAlgs = hashSet2;
        hashSet.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
        hashSet2.add(X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
        hashSet2.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
    }

    CMSUtils() {
    }

    static EnvelopedDataHelper createContentHelper(String str) {
        return str != null ? new EnvelopedDataHelper(new NamedJcaJceExtHelper(str)) : new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }

    static EnvelopedDataHelper createContentHelper(Provider provider) {
        return provider != null ? new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider)) : new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }

    static ASN1Encodable extractParameters(AlgorithmParameters algorithmParameters) throws CMSException {
        try {
            return AlgorithmParametersUtils.extractParameters(algorithmParameters);
        } catch (IOException e2) {
            throw new CMSException("cannot extract parameters: " + e2.getMessage(), e2);
        }
    }

    static IssuerAndSerialNumber getIssuerAndSerialNumber(X509Certificate x509Certificate) throws Throwable {
        X500Name issuer = Certificate.getInstance(x509Certificate.getEncoded()).getIssuer();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("G=Q;\u0007K<9JF<FJ}23?@x\"}w\u007f\t*67+')\"\u001f1!", (short) (C1580rY.Xd() ^ (-24956)))).getMethod(C1561oA.Kd("*)9\u0019,:2+7\u001aB;15C", (short) (C1499aX.Xd() ^ (-28899))), new Class[0]);
        try {
            method.setAccessible(true);
            return new IssuerAndSerialNumber(issuer, (BigInteger) method.invoke(x509Certificate, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static byte[] getSubjectKeyId(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
        if (extensionValue != null) {
            return ASN1OctetString.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getOctets();
        }
        return null;
    }

    static boolean isEC(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ecAlgs.contains(aSN1ObjectIdentifier);
    }

    static boolean isMQV(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return mqvAlgs.contains(aSN1ObjectIdentifier);
    }

    static boolean isRFC2631(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.id_alg_ESDH) || aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.id_alg_SSDH);
    }

    static void loadParameters(AlgorithmParameters algorithmParameters, ASN1Encodable aSN1Encodable) throws CMSException {
        try {
            AlgorithmParametersUtils.loadParameters(algorithmParameters, aSN1Encodable);
        } catch (IOException e2) {
            throw new CMSException("error encoding algorithm parameters.", e2);
        }
    }
}
