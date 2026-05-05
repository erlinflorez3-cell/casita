package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
class X509CertificateObject extends X509Certificate implements PKCS12BagAttributeCarrier {
    private PKCS12BagAttributeCarrier attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private BasicConstraints basicConstraints;
    private JcaJceHelper bcHelper;

    /* JADX INFO: renamed from: c */
    private Certificate f27640c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(JcaJceHelper jcaJceHelper, Certificate certificate) throws Throwable {
        this.bcHelper = jcaJceHelper;
        this.f27640c = certificate;
        try {
            byte[] extensionBytes = getExtensionBytes(ZO.xd(".\u0013\u0004o\u001d=^]!", (short) (C1633zX.Xd() ^ (-28903)), (short) (C1633zX.Xd() ^ (-26277))));
            if (extensionBytes != null) {
                this.basicConstraints = BasicConstraints.getInstance(ASN1Primitive.fromByteArray(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes(C1626yg.Ud("\u0012#\u0007Nuf\u00025!", (short) (FB.Xd() ^ 2163), (short) (FB.Xd() ^ 31648)));
                if (extensionBytes2 == null) {
                    this.keyUsage = null;
                    return;
                }
                DERBitString dERBitString = DERBitString.getInstance(ASN1Primitive.fromByteArray(extensionBytes2));
                byte[] bytes = dERBitString.getBytes();
                int length = (bytes.length * 8) - dERBitString.getPadBits();
                this.keyUsage = new boolean[length >= 9 ? length : 9];
                for (int i2 = 0; i2 != length; i2++) {
                    boolean[] zArr = this.keyUsage;
                    int i3 = bytes[i2 / 8];
                    int i4 = 128 >>> (i2 % 8);
                    zArr[i2] = (i3 + i4) - (i3 | i4) != 0;
                }
            } catch (Exception e2) {
                String str = Ig.wd("W\u0012Kd;\u0014\u001d\u001e[LQ6elle8\u007fO=Z.s\u0010S\u001ec", (short) (C1607wl.Xd() ^ 7811)) + e2;
                short sXd = (short) (ZN.Xd() ^ 11593);
                int[] iArr = new int[")n\u0018!/1|]*I@g\u001b[H(zn\u007f\u001dzS3$lsO\u0013wZ\u0011\u0002jM\u0006X%f'\u001c\"\u00058?NY".length()];
                QB qb = new QB(")n\u0018!/1|]*I@g\u001b[H(zn\u007f\u001dzS3$lsO\u0013wZ\u0011\u0002jM\u0006X%f'\u001c\"\u00058?NY");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + i5)) + xuXd.CK(iKK));
                    i5++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i5));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (Od.Xd() ^ (-22504));
                int[] iArr2 = new int["\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005".length()];
                QB qb2 = new QB("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i6 + xuXd2.CK(iKK2));
                    i6++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i6));
                Object[] objArr = {str};
                Constructor<?> constructor = cls.getConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                    throw ((CertificateParsingException) constructor.newInstance(objArr));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (Exception e4) {
            short sXd3 = (short) (C1633zX.Xd() ^ (-31294));
            short sXd4 = (short) (C1633zX.Xd() ^ (-3869));
            int[] iArr3 = new int[")(679?k0==CEDH7Iu\u00199LC>\u001fLLRTSCLRYY!\b".length()];
            QB qb3 = new QB(")(679?k0==CEDH7Iu\u00199LC>\u001fLLRTSCLRYY!\b");
            int i7 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i7] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i7)) - sXd4);
                i7++;
            }
            String str2 = new String(iArr3, 0, i7) + e4;
            Class<?> cls2 = Class.forName(C1561oA.od("\u0003x\rvB\u0007wt\u0006\u0002w\u0002\u00069mnz{4Hiuvjfha^p`JZjj_c[8jTU_bV[Y", (short) (C1580rY.Xd() ^ (-13616))));
            Class<?>[] clsArr2 = new Class[1];
            short sXd5 = (short) (Od.Xd() ^ (-3581));
            int[] iArr4 = new int["3+A-z:0>8\u007f&HG?E?".length()];
            QB qb4 = new QB("3+A-z:0>8\u007f&HG?E?");
            int i8 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i8] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i8));
                i8++;
            }
            clsArr2[0] = Class.forName(new String(iArr4, 0, i8));
            Object[] objArr2 = {str2};
            Constructor<?> constructor2 = cls2.getConstructor(clsArr2);
            try {
                constructor2.setAccessible(true);
                throw ((CertificateParsingException) constructor2.newInstance(objArr2));
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    private void checkSignature(PublicKey publicKey, Signature signature) throws Throwable {
        if (isAlgIdEqual(this.f27640c.getSignatureAlgorithm(), this.f27640c.getTBSCertificate().getSignature())) {
            X509SignatureUtil.setSignatureParameters(signature, this.f27640c.getSignatureAlgorithm().getParameters());
            signature.initVerify(publicKey);
            signature.update(getTBSCertificate());
            if (!signature.verify(getSignature())) {
                throw new SignatureException(Wg.Zd("G\u001c/V\u00126?^\"\\S3>pl \u0012\u007f\u00071#!\u0016H\u0005)B\u000e,EVopS{<be\tIn1#b\u001d", (short) (ZN.Xd() ^ 21686), (short) (ZN.Xd() ^ 17680)));
            }
            return;
        }
        Object[] objArr = {C1561oA.Xd("ofemauwui%gsox|t\u0001u{/y\u007f2gVh6z}\f\u000f;\u000b\r\u0013?\u0014\u0003\u0010\tD\u0007\u001aG\u0018\u001f\u001f\u0011\u001fM\u0012\u0015#&", (short) (C1499aX.Xd() ^ (-18995)))};
        Constructor<?> constructor = Class.forName(Wg.vd("VNdP\u001edWVig_kq']`NQ\f\"ESVLJNIH\\N/cor~\u0004y\u0001\u0001", (short) (ZN.Xd() ^ 11423))).getConstructor(Class.forName(Qg.kd("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005", (short) (C1607wl.Xd() ^ 26466), (short) (C1607wl.Xd() ^ 9531))));
        try {
            constructor.setAccessible(true);
            throw ((CertificateException) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Collection getAlternativeNames(byte[] bArr) throws Throwable {
        String id;
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration objects = ASN1Sequence.getInstance(bArr).getObjects();
            while (objects.hasMoreElements()) {
                GeneralName generalName = GeneralName.getInstance(objects.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(generalName.getEncoded());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        id = ((ASN1String) generalName.getName()).getString();
                        arrayList2.add(id);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        id = X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString();
                        arrayList2.add(id);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            id = InetAddress.getByAddress(DEROctetString.getInstance(generalName.getName()).getOctets()).getHostAddress();
                            arrayList2.add(id);
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                        break;
                    case 8:
                        id = ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        arrayList2.add(id);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException(hg.Vd("\f*,f:&+b06-!#/uZ", (short) (C1580rY.Xd() ^ (-3656)), (short) (C1580rY.Xd() ^ (-1694))) + generalName.getTagNo());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e2) {
            Object[] objArr = {e2.getMessage()};
            Constructor<?> constructor = Class.forName(C1561oA.ud("\u0003x\rvB\u0007wt\u0006\u0002w\u0002\u00069mnz{4Hiuvjfha^p`JZjj_c[8jTU_bV[Y", (short) (C1580rY.Xd() ^ (-25319)))).getConstructor(Class.forName(C1561oA.yd("<2J4\u0004A9E1v\u001f?@6>6", (short) (C1499aX.Xd() ^ (-15499)))));
            try {
                constructor.setAccessible(true);
                throw ((CertificateParsingException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    private byte[] getExtensionBytes(String str) {
        Extension extension;
        Extensions extensions = this.f27640c.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue().getOctets();
    }

    private boolean isAlgIdEqual(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier.getAlgorithm().equals(algorithmIdentifier2.getAlgorithm())) {
            return algorithmIdentifier.getParameters() == null ? algorithmIdentifier2.getParameters() == null || algorithmIdentifier2.getParameters().equals(DERNull.INSTANCE) : algorithmIdentifier2.getParameters() == null ? algorithmIdentifier.getParameters() == null || algorithmIdentifier.getParameters().equals(DERNull.INSTANCE) : algorithmIdentifier.getParameters().equals(algorithmIdentifier2.getParameters());
        }
        return false;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f27640c.getEndDate().getTime());
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f27640c.getStartDate().getTime());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CertificateObject)) {
            return super.equals(obj);
        }
        X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
        if (this.hashValueSet && x509CertificateObject.hashValueSet && this.hashValue != x509CertificateObject.hashValue) {
            return false;
        }
        return this.f27640c.equals(x509CertificateObject.f27640c);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        BasicConstraints basicConstraints = this.basicConstraints;
        if (basicConstraints == null || !basicConstraints.isCA()) {
            return -1;
        }
        if (this.basicConstraints.getPathLenConstraint() == null) {
            return Integer.MAX_VALUE;
        }
        return this.basicConstraints.getPathLenConstraint().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.f27640c.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.f27640c.getEncoded("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws Throwable {
        byte[] extensionBytes = getExtensionBytes(C1561oA.Yd("\u0011\u000e\u0016\u0010\u0015\u001d\u0013\u0019\u001e", (short) (OY.Xd() ^ 1204)));
        if (extensionBytes == null) {
            return null;
        }
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(extensionBytes).readObject();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 != aSN1Sequence.size(); i2++) {
                arrayList.add(((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(i2)).getId());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            short sXd = (short) (Od.Xd() ^ (-29821));
            short sXd2 = (short) (Od.Xd() ^ (-13915));
            int[] iArr = new int["N\\][_\u000e_b`UXgh_e_\u0019_spblcee\"ni~&|{jqp,r\u0007\u0004u\u007f\u0006|\u0004\u0004".length()];
            QB qb = new QB("N\\][_\u000e_b`UXgh_e_\u0019_spblcee\"ni~&|{jqp,r\u0007\u0004u\u007f\u0006|\u0004\u0004");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Object[] objArr = {new String(iArr, 0, i3)};
            Constructor<?> constructor = Class.forName(Jg.Wd("1u!O1z@C+.:\u000b$[flO`\u001e\t0\u000f\u0017!a|{Mf)\u0019@\u0015%py\b)p`8I#\u001d7y", (short) (OY.Xd() ^ 9603), (short) (OY.Xd() ^ 8456))).getConstructor(Class.forName(ZO.xd("Z5(\u0013@\u001f58r>\u0013i\u0014~\u001eF", (short) (C1499aX.Xd() ^ (-8308)), (short) (C1499aX.Xd() ^ (-7985)))));
            try {
                constructor.setAccessible(true);
                throw ((CertificateParsingException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f27640c.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e2) {
            throw new IllegalStateException("error parsing " + e2.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(Extension.issuerAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        try {
            return new X509Principal(X500Name.getInstance(this.f27640c.getIssuer().getEncoded()));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        DERBitString issuerUniqueId = this.f27640c.getTBSCertificate().getIssuerUniqueId();
        if (issuerUniqueId == null) {
            return null;
        }
        byte[] bytes = issuerUniqueId.getBytes();
        int length = (bytes.length * 8) - issuerUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = bytes[i2 / 8];
            int i4 = 128 >>> (i2 % 8);
            zArr[i2] = (i3 + i4) - (i3 | i4) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this.f27640c.getIssuer());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.keyUsage;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.f27640c.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (!extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f27640c.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f27640c.getStartDate().getDate();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f27640c.getSubjectPublicKeyInfo());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f27640c.getSerialNumber().getValue();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return X509SignatureUtil.getSignatureName(this.f27640c.getSignatureAlgorithm());
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f27640c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.f27640c.getSignatureAlgorithm().getParameters() != null) {
            try {
                return this.f27640c.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f27640c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(Extension.subjectAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new X509Principal(X500Name.getInstance(this.f27640c.getSubject().toASN1Primitive()));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        DERBitString subjectUniqueId = this.f27640c.getTBSCertificate().getSubjectUniqueId();
        if (subjectUniqueId == null) {
            return null;
        }
        byte[] bytes = subjectUniqueId.getBytes();
        int length = (bytes.length * 8) - subjectUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = bytes[i2 / 8];
            int i4 = 128 >>> (i2 % 8);
            zArr[i2] = (i3 + i4) - (i3 | i4) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this.f27640c.getSubject());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.f27640c.getTBSCertificate().getEncoded("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f27640c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.f27640c.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (!aSN1ObjectIdentifier.equals(Extension.keyUsage) && !aSN1ObjectIdentifier.equals(Extension.certificatePolicies) && !aSN1ObjectIdentifier.equals(Extension.policyMappings) && !aSN1ObjectIdentifier.equals(Extension.inhibitAnyPolicy) && !aSN1ObjectIdentifier.equals(Extension.cRLDistributionPoints) && !aSN1ObjectIdentifier.equals(Extension.issuingDistributionPoint) && !aSN1ObjectIdentifier.equals(Extension.deltaCRLIndicator) && !aSN1ObjectIdentifier.equals(Extension.policyConstraints) && !aSN1ObjectIdentifier.equals(Extension.basicConstraints) && !aSN1ObjectIdentifier.equals(Extension.subjectAlternativeName) && !aSN1ObjectIdentifier.equals(Extension.nameConstraints) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = super.hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i2 = 0;
            for (int i3 = 1; i3 < encoded.length; i3++) {
                i2 += encoded[i3] * i3;
            }
            return i2;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        StringBuffer stringBufferAppend;
        Object verisignCzagExtension;
        StringBuffer stringBufferAppend2;
        String str;
        StringBuffer stringBuffer = new StringBuffer("  [0]         Version: ");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(getVersion()).append(strLineSeparator);
        stringBuffer.append("         SerialNumber: ").append(getSerialNumber()).append(strLineSeparator);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(strLineSeparator);
        stringBuffer.append("           Start Date: ").append(getNotBefore()).append(strLineSeparator);
        stringBuffer.append("           Final Date: ").append(getNotAfter()).append(strLineSeparator);
        stringBuffer.append("            SubjectDN: ").append(getSubjectDN()).append(strLineSeparator);
        stringBuffer.append("           Public Key: ").append(getPublicKey()).append(strLineSeparator);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(strLineSeparator);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ").append(new String(Hex.encode(signature, 0, 20))).append(strLineSeparator);
        for (int i2 = 20; i2 < signature.length; i2 += 20) {
            if (i2 < signature.length - 20) {
                stringBufferAppend2 = stringBuffer.append("                       ");
                str = new String(Hex.encode(signature, i2, 20));
            } else {
                stringBufferAppend2 = stringBuffer.append("                       ");
                str = new String(Hex.encode(signature, i2, signature.length - i2));
            }
            stringBufferAppend2.append(str).append(strLineSeparator);
        }
        Extensions extensions = this.f27640c.getTBSCertificate().getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            if (enumerationOids.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (enumerationOids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append("                       critical(").append(extension.isCritical()).append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals(Extension.basicConstraints)) {
                            verisignCzagExtension = BasicConstraints.getInstance(aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals(Extension.keyUsage)) {
                            verisignCzagExtension = KeyUsage.getInstance(aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.netscapeCertType)) {
                            verisignCzagExtension = new NetscapeCertType((DERBitString) aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.netscapeRevocationURL)) {
                            verisignCzagExtension = new NetscapeRevocationURL((DERIA5String) aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.verisignCzagExtension)) {
                            verisignCzagExtension = new VerisignCzagExtension((DERIA5String) aSN1InputStream.readObject());
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.getId());
                            stringBufferAppend = stringBuffer.append(" value = ").append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                            stringBufferAppend.append(strLineSeparator);
                        }
                        stringBufferAppend = stringBuffer.append(verisignCzagExtension);
                        stringBufferAppend.append(strLineSeparator);
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(" value = *****").append(strLineSeparator);
                    }
                } else {
                    stringBuffer.append(strLineSeparator);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws Throwable {
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.f27640c.getSignatureAlgorithm());
        try {
            signature = this.bcHelper.createSignature(signatureName);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws Throwable {
        String signatureName = X509SignatureUtil.getSignatureName(this.f27640c.getSignatureAlgorithm());
        checkSignature(publicKey, str != null ? Signature.getInstance(signatureName, str) : Signature.getInstance(signatureName));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws Throwable {
        String signatureName = X509SignatureUtil.getSignatureName(this.f27640c.getSignatureAlgorithm());
        checkSignature(publicKey, provider != null ? Signature.getInstance(signatureName, provider) : Signature.getInstance(signatureName));
    }
}
