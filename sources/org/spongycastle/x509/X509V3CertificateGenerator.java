package org.spongycastle.x509;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.TBSCertificate;
import org.spongycastle.asn1.x509.Time;
import org.spongycastle.asn1.x509.V3TBSCertificateGenerator;
import org.spongycastle.asn1.x509.X509ExtensionsGenerator;
import org.spongycastle.asn1.x509.X509Name;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.X509CertificateObject;
import org.spongycastle.x509.extension.X509ExtensionUtil;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class X509V3CertificateGenerator {
    private AlgorithmIdentifier sigAlgId;
    private ASN1ObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private V3TBSCertificateGenerator tbsGen = new V3TBSCertificateGenerator();
    private X509ExtensionsGenerator extGenerator = new X509ExtensionsGenerator();

    private DERBitString booleanToBitString(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i2 = 0; i2 != zArr.length; i2++) {
            int i3 = i2 / 8;
            bArr[i3] = (byte) ((-1) - (((-1) - bArr[i3]) & ((-1) - (zArr[i2] ? 1 << (7 - (i2 % 8)) : 0))));
        }
        int length = zArr.length % 8;
        return length == 0 ? new DERBitString(bArr) : new DERBitString(bArr, 8 - length);
    }

    private X509Certificate generateJcaObject(TBSCertificate tBSCertificate, byte[] bArr) throws CertificateParsingException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.sigAlgId);
        aSN1EncodableVector.add(new DERBitString(bArr));
        return new X509CertificateObject(Certificate.getInstance(new DERSequence(aSN1EncodableVector)));
    }

    private TBSCertificate generateTbsCert() {
        if (!this.extGenerator.isEmpty()) {
            this.tbsGen.setExtensions(this.extGenerator.generate());
        }
        return this.tbsGen.generateTBSCertificate();
    }

    public void addExtension(String str, boolean z2, ASN1Encodable aSN1Encodable) {
        addExtension(new ASN1ObjectIdentifier(str), z2, aSN1Encodable);
    }

    public void addExtension(String str, boolean z2, byte[] bArr) {
        addExtension(new ASN1ObjectIdentifier(str), z2, bArr);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z2, aSN1Encodable);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, byte[] bArr) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z2, bArr);
    }

    public void copyAndAddExtension(String str, boolean z2, X509Certificate x509Certificate) throws Throwable {
        byte[] extensionValue = x509Certificate.getExtensionValue(str);
        if (extensionValue != null) {
            try {
                addExtension(str, z2, X509ExtensionUtil.fromExtensionValue(extensionValue));
                return;
            } catch (IOException e2) {
                String string = e2.toString();
                Class<?> cls = Class.forName(C1593ug.zd("tl\u0003n<\u0003ut\b\u0006}\n\u0010E{~\r\u0010J`\u0004\u0012\u0015\u000b\t\r\b\u0007\u001b\rx\u000b\u001d\u001f\u0016\u001c\u0016t)\u0015\u0018$)\u001f&&", (short) (C1499aX.Xd() ^ (-18531)), (short) (C1499aX.Xd() ^ (-15378))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1580rY.Xd() ^ (-14909));
                int[] iArr = new int["lbv`,i]ia'Kkh^bZ".length()];
                QB qb = new QB("lbv`,i]ia'Kkh^bZ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {string};
                Constructor<?> constructor = cls.getConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                    throw ((CertificateParsingException) constructor.newInstance(objArr));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
        short sXd2 = (short) (Od.Xd() ^ (-17739));
        int[] iArr2 = new int["bvseoulss&".length()];
        QB qb2 = new QB("bvseoulss&");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        StringBuilder sbAppend = new StringBuilder(new String(iArr2, 0, i3)).append(str);
        short sXd3 = (short) (Od.Xd() ^ (-17882));
        short sXd4 = (short) (Od.Xd() ^ (-32251));
        int[] iArr3 = new int["OZ\u0017\u0017|\t\u0006;Dq58".length()];
        QB qb3 = new QB("OZ\u0017\u0017|\t\u0006;Dq58");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
            i4++;
        }
        String string2 = sbAppend.append(new String(iArr3, 0, i4)).toString();
        Class<?> cls2 = Class.forName(C1561oA.Xd("5-C/|C65HF>JP\u0006<?MP\u000b!DRUKIMHG[M9K]_V\\V5iUXdi_ff", (short) (Od.Xd() ^ (-12139))));
        Class<?>[] clsArr2 = new Class[1];
        short sXd5 = (short) (C1580rY.Xd() ^ (-5802));
        int[] iArr4 = new int[".&<(u5+9#j\u001132*0*".length()];
        QB qb4 = new QB(".&<(u5+9#j\u001132*0*");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((sXd5 ^ i5) + xuXd4.CK(iKK4));
            i5++;
        }
        clsArr2[0] = Class.forName(new String(iArr4, 0, i5));
        Object[] objArr2 = {string2};
        Constructor<?> constructor2 = cls2.getConstructor(clsArr2);
        try {
            constructor2.setAccessible(true);
            throw ((CertificateParsingException) constructor2.newInstance(objArr2));
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public void copyAndAddExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, X509Certificate x509Certificate) throws Throwable {
        copyAndAddExtension(aSN1ObjectIdentifier.getId(), z2, x509Certificate);
    }

    public X509Certificate generate(PrivateKey privateKey) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        return generate(privateKey, (SecureRandom) null);
    }

    public X509Certificate generate(PrivateKey privateKey, String str) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        return generate(privateKey, str, null);
    }

    public X509Certificate generate(PrivateKey privateKey, String str, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        TBSCertificate tBSCertificateGenerateTbsCert = generateTbsCert();
        try {
            try {
                return generateJcaObject(tBSCertificateGenerateTbsCert, X509Util.calculateSignature(this.sigOID, this.signatureAlgorithm, str, privateKey, secureRandom, tBSCertificateGenerateTbsCert));
            } catch (CertificateParsingException e2) {
                throw new ExtCertificateEncodingException("exception producing certificate object", e2);
            }
        } catch (IOException e3) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e3);
        }
    }

    public X509Certificate generate(PrivateKey privateKey, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        TBSCertificate tBSCertificateGenerateTbsCert = generateTbsCert();
        try {
            try {
                return generateJcaObject(tBSCertificateGenerateTbsCert, X509Util.calculateSignature(this.sigOID, this.signatureAlgorithm, privateKey, secureRandom, tBSCertificateGenerateTbsCert));
            } catch (CertificateParsingException e2) {
                throw new ExtCertificateEncodingException("exception producing certificate object", e2);
            }
        } catch (IOException e3) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e3);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return generateX509Certificate(privateKey, str, null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str, SecureRandom secureRandom) throws SignatureException, InvalidKeyException, SecurityException, NoSuchProviderException {
        try {
            return generate(privateKey, str, secureRandom);
        } catch (InvalidKeyException e2) {
            throw e2;
        } catch (NoSuchProviderException e3) {
            throw e3;
        } catch (SignatureException e4) {
            throw e4;
        } catch (GeneralSecurityException e5) {
            throw new SecurityException("exception: " + e5);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, SecureRandom secureRandom) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public Iterator getSignatureAlgNames() {
        return X509Util.getAlgNames();
    }

    public void reset() {
        this.tbsGen = new V3TBSCertificateGenerator();
        this.extGenerator.reset();
    }

    public void setIssuerDN(X500Principal x500Principal) {
        try {
            this.tbsGen.setIssuer(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't process principal: " + e2);
        }
    }

    public void setIssuerDN(X509Name x509Name) {
        this.tbsGen.setIssuer(x509Name);
    }

    public void setIssuerUniqueID(boolean[] zArr) {
        this.tbsGen.setIssuerUniqueID(booleanToBitString(zArr));
    }

    public void setNotAfter(Date date) {
        this.tbsGen.setEndDate(new Time(date));
    }

    public void setNotBefore(Date date) {
        this.tbsGen.setStartDate(new Time(date));
    }

    public void setPublicKey(PublicKey publicKey) throws IllegalArgumentException {
        try {
            this.tbsGen.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(publicKey.getEncoded()).readObject()));
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to process key - " + e2.toString());
        }
    }

    public void setSerialNumber(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("serial number must be a positive integer");
        }
        this.tbsGen.setSerialNumber(new ASN1Integer(bigInteger));
    }

    public void setSignatureAlgorithm(String str) {
        this.signatureAlgorithm = str;
        try {
            ASN1ObjectIdentifier algorithmOID = X509Util.getAlgorithmOID(str);
            this.sigOID = algorithmOID;
            AlgorithmIdentifier sigAlgID = X509Util.getSigAlgID(algorithmOID, str);
            this.sigAlgId = sigAlgID;
            this.tbsGen.setSignature(sigAlgID);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested: " + str);
        }
    }

    public void setSubjectDN(X500Principal x500Principal) {
        try {
            this.tbsGen.setSubject(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't process principal: " + e2);
        }
    }

    public void setSubjectDN(X509Name x509Name) {
        this.tbsGen.setSubject(x509Name);
    }

    public void setSubjectUniqueID(boolean[] zArr) {
        this.tbsGen.setSubjectUniqueID(booleanToBitString(zArr));
    }
}
