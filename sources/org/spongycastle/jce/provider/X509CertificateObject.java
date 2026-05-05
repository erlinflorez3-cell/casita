package org.spongycastle.jce.provider;

import cz.msebera.android.httpclient.HttpStatus;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OutputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.misc.MiscObjectIdentifiers;
import org.spongycastle.asn1.misc.NetscapeCertType;
import org.spongycastle.asn1.misc.NetscapeRevocationURL;
import org.spongycastle.asn1.misc.VerisignCzagExtension;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.style.RFC4519Style;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
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
public class X509CertificateObject extends X509Certificate implements PKCS12BagAttributeCarrier {
    private PKCS12BagAttributeCarrier attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private BasicConstraints basicConstraints;

    /* JADX INFO: renamed from: c */
    private Certificate f28018c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(Certificate certificate) throws Throwable {
        this.f28018c = certificate;
        try {
            byte[] extensionBytes = getExtensionBytes(Wg.Zd("_\niwThu\u000en", (short) (Od.Xd() ^ (-22593)), (short) (Od.Xd() ^ (-5958))));
            if (extensionBytes != null) {
                this.basicConstraints = BasicConstraints.getInstance(ASN1Primitive.fromByteArray(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes(C1561oA.Xd("HEMGLTJNS", (short) (C1633zX.Xd() ^ (-24762))));
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
                Object[] objArr = {Wg.vd("ZYcdbh\u0011Unnprmq\\n'Sj\u007fXwbitJ-", (short) (C1580rY.Xd() ^ (-29480))) + e2};
                Constructor<?> constructor = Class.forName(Qg.kd("i_s])m^[lh^hl TUab\u001b/P\\]QMOHEWG1AQQFJB\u001fQ;<FI=B@", (short) (C1499aX.Xd() ^ (-44)), (short) (C1499aX.Xd() ^ (-428)))).getConstructor(Class.forName(hg.Vd("UK_I\u0015RFRJ\u00104TQGKC", (short) (FB.Xd() ^ 23412), (short) (FB.Xd() ^ 13826))));
                try {
                    constructor.setAccessible(true);
                    throw ((CertificateParsingException) constructor.newInstance(objArr));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (Exception e4) {
            Object[] objArr2 = {C1561oA.ud("\"\u001f+**.X\u001b&$((%'\u0014$No\u000e\u001f\u0014\rk\u0017\u0015\u0019\u0019\u0016\u0004\u000b\u000f\u0014\u0012W<", (short) (C1499aX.Xd() ^ (-12068))) + e4};
            Constructor<?> constructor2 = Class.forName(C1561oA.yd("vl\u0001j>\u0003sp\n\u0006{\u0006\u0012Eyz\u000f\u0010H\\\u0006\u0012\u0013\u0007\u000b\r\u0006\u0003\u001d\rv\u0007\u001f\u001f\u0014\u0018\u0018t'\u0011\u001a$'\u001b(&", (short) (C1607wl.Xd() ^ 22489))).getConstructor(Class.forName(C1561oA.Yd("\u0003z\u0011|J\n\u007f\u000e\bOu\u0018\u0017\u000f\u0015\u000f", (short) (FB.Xd() ^ HttpStatus.SC_GONE))));
            try {
                constructor2.setAccessible(true);
                throw ((CertificateParsingException) constructor2.newInstance(objArr2));
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    private int calculateHashCode() {
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

    private void checkSignature(PublicKey publicKey, Signature signature) throws Throwable {
        if (isAlgIdEqual(this.f28018c.getSignatureAlgorithm(), this.f28018c.getTBSCertificate().getSignature())) {
            X509SignatureUtil.setSignatureParameters(signature, this.f28018c.getSignatureAlgorithm().getParameters());
            signature.initVerify(publicKey);
            signature.update(getTBSCertificate());
            if (!signature.verify(getSignature())) {
                throw new SignatureException(Xg.qd("&)7:0.2-,@2m3?6ErBDJvN>LDBV}VIUJ\u0003WZVWTROO\fXSh", (short) (C1580rY.Xd() ^ (-14508)), (short) (C1580rY.Xd() ^ (-10961))));
            }
            return;
        }
        Object[] objArr = {Jg.Wd("\u001ajWxR\u0010s[u\u000bz`FxZ{l?r\focoN(W\u000fxUUq\u0004\u007f[G!Sk^1\u001f;s\u000b9iS^Y-K<gP", (short) (C1607wl.Xd() ^ 24933), (short) (C1607wl.Xd() ^ 1362))};
        Constructor<?> constructor = Class.forName(ZO.xd("Zm\u0015:]\u001aWKbxQ,M7\u001eJ\u0006\\c\r\u000e=XZ>G~\u0016${jJW\u0017B?\u0002d\u0016", (short) (Od.Xd() ^ (-6952)), (short) (Od.Xd() ^ (-23668)))).getConstructor(Class.forName(C1626yg.Ud("`hV\u0001gvxeQ1}\u00013g~\u0007", (short) (C1580rY.Xd() ^ (-6116)), (short) (C1580rY.Xd() ^ (-109)))));
        try {
            constructor.setAccessible(true);
            throw ((CertificateException) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Collection getAlternativeNames(byte[] bArr) throws Throwable {
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
                        arrayList2.add(((ASN1String) generalName.getName()).getString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        arrayList2.add(X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(DEROctetString.getInstance(generalName.getName()).getOctets()).getHostAddress());
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                        break;
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.getInstance(generalName.getName()).getId());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException(Ig.wd("pBuK\u0006\u0015A #\r\u0001]\r\u001a\u0010Z", (short) (C1633zX.Xd() ^ (-11568))) + generalName.getTagNo());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e2) {
            String message = e2.getMessage();
            short sXd = (short) (ZN.Xd() ^ 31386);
            int[] iArr = new int["\u0003I,{XBd\u000bSA:#\u0013=VrL@R\u0004\\>f_bu\u000e`\u000e\r(S| /~\u0016\u0014$\u001d\u001fBx\b\u000f\u007f".length()];
            QB qb = new QB("\u0003I,{XBd\u000bSA:#\u0013=VrL@R\u0004\\>f_bu\u000e`\u000e\r(S| /~\u0016\u0014$\u001d\u001fBx\b\u000f\u007f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {message};
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(Class.forName(C1561oA.Qd("\u001b\u0011%\u000fZ\u0018\f\u0018\u0010Uy\u001a\u0017\r\u0011\t", (short) (C1633zX.Xd() ^ (-29558)))));
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
        Extensions extensions = this.f28018c.getTBSCertificate().getExtensions();
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
            throw new CertificateExpiredException("certificate expired on " + this.f28018c.getEndDate().getTime());
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f28018c.getStartDate().getTime());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) throws Throwable {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.security.cert.Certificate)) {
            return false;
        }
        java.security.cert.Certificate certificate = (java.security.cert.Certificate) obj;
        try {
            byte[] encoded = getEncoded();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\f\u0004\u001a\u0006S\u001a\r\f\u001f\u001d\u0015!'\\\u0013\u0016$'aw\u001b),\" $\u001f\u001e2$", (short) (Od.Xd() ^ (-28215)), (short) (Od.Xd() ^ (-23714)))).getMethod(C1561oA.od("\"\u001f-|%\u0019$\u0018\u0018\u0016", (short) (C1499aX.Xd() ^ (-11998))), new Class[0]);
            try {
                method.setAccessible(true);
                return Arrays.areEqual(encoded, (byte[]) method.invoke(certificate, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier
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
        Extensions extensions = this.f28018c.getTBSCertificate().getExtensions();
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
            return this.f28018c.getEncoded("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws Throwable {
        byte[] extensionBytes = getExtensionBytes(C1561oA.Kd("YV^X]e[af", (short) (C1499aX.Xd() ^ (-18919))));
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
            short sXd = (short) (C1607wl.Xd() ^ 9623);
            short sXd2 = (short) (C1607wl.Xd() ^ 14842);
            int[] iArr = new int["+L 1eeK NV,L\u007fH`. w`\u000f\u0011nw+}Kj\u0019>7\"R\u001a4erK1`e@Y\u0003[m".length()];
            QB qb = new QB("+L 1eeK NV,L\u007fH`. w`\u000f\u0011nw+}Kj\u0019>7\"R\u001a4erK1`e@Y\u0003[m");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            String str = new String(iArr, 0, i3);
            Class<?> cls = Class.forName(C1561oA.Xd(")!7#p7*)<:2>Dy03AD~\u00158FI?=A<;OA-?QSJPJ)]ILX]SZZ", (short) (ZN.Xd() ^ 14300)));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (C1499aX.Xd() ^ (-4715));
            int[] iArr2 = new int["\u0005|\u000fzD\u0004u\u0004\nQs\u0016\u0011\t\u000b\u0005".length()];
            QB qb2 = new QB("\u0005|\u000fzD\u0004u\u0004\nQs\u0016\u0011\t\u000b\u0005");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((sXd3 ^ i4) + xuXd2.CK(iKK2));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i4));
            Object[] objArr = {str};
            Constructor<?> constructor = cls.getConstructor(clsArr);
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
        Extensions extensions = this.f28018c.getTBSCertificate().getExtensions();
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
            return new X509Principal(X500Name.getInstance(this.f28018c.getIssuer().getEncoded()));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        DERBitString issuerUniqueId = this.f28018c.getTBSCertificate().getIssuerUniqueId();
        if (issuerUniqueId == null) {
            return null;
        }
        byte[] bytes = issuerUniqueId.getBytes();
        int length = (bytes.length * 8) - issuerUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 != length; i2++) {
            zArr[i2] = (bytes[i2 / 8] & (128 >>> (i2 % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this.f28018c.getIssuer());
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
        Extensions extensions = this.f28018c.getTBSCertificate().getExtensions();
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
        return this.f28018c.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f28018c.getStartDate().getDate();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f28018c.getSubjectPublicKeyInfo());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f28018c.getSerialNumber().getValue();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        String property;
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null && (property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID())) != null) {
            return property;
        }
        Provider[] providers = Security.getProviders();
        for (int i2 = 0; i2 != providers.length; i2++) {
            String property2 = providers[i2].getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f28018c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.f28018c.getSignatureAlgorithm().getParameters() != null) {
            try {
                return this.f28018c.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f28018c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(Extension.subjectAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new X509Principal(X500Name.getInstance(this.f28018c.getSubject().toASN1Primitive()));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        DERBitString subjectUniqueId = this.f28018c.getTBSCertificate().getSubjectUniqueId();
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
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this.f28018c.getSubject());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.f28018c.getTBSCertificate().getEncoded("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f28018c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.f28018c.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            String id = aSN1ObjectIdentifier.getId();
            if (!id.equals(RFC3280CertPathUtilities.KEY_USAGE) && !id.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) && !id.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) && !id.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) && !id.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) && !id.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) && !id.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) && !id.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) && !id.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) && !id.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) && !id.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = calculateHashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.cert.Certificate
    public String toString() {
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
                stringBuffer.append("                       ").append(new String(Hex.encode(signature, i2, 20))).append(strLineSeparator);
            } else {
                stringBuffer.append("                       ").append(new String(Hex.encode(signature, i2, signature.length - i2))).append(strLineSeparator);
            }
        }
        Extensions extensions = this.f28018c.getTBSCertificate().getExtensions();
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
                            stringBuffer.append(BasicConstraints.getInstance(aSN1InputStream.readObject())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(Extension.keyUsage)) {
                            stringBuffer.append(KeyUsage.getInstance(aSN1InputStream.readObject())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.netscapeCertType)) {
                            stringBuffer.append(new NetscapeCertType((DERBitString) aSN1InputStream.readObject())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.netscapeRevocationURL)) {
                            stringBuffer.append(new NetscapeRevocationURL((DERIA5String) aSN1InputStream.readObject())).append(strLineSeparator);
                        } else if (aSN1ObjectIdentifier.equals(MiscObjectIdentifiers.verisignCzagExtension)) {
                            stringBuffer.append(new VerisignCzagExtension((DERIA5String) aSN1InputStream.readObject())).append(strLineSeparator);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.getId());
                            stringBuffer.append(" value = ").append(ASN1Dump.dumpAsString(aSN1InputStream.readObject())).append(strLineSeparator);
                        }
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
        String signatureName = X509SignatureUtil.getSignatureName(this.f28018c.getSignatureAlgorithm());
        try {
            signature = Signature.getInstance(signatureName, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws Throwable {
        String signatureName = X509SignatureUtil.getSignatureName(this.f28018c.getSignatureAlgorithm());
        checkSignature(publicKey, str != null ? Signature.getInstance(signatureName, str) : Signature.getInstance(signatureName));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws Throwable {
        String signatureName = X509SignatureUtil.getSignatureName(this.f28018c.getSignatureAlgorithm());
        checkSignature(publicKey, provider != null ? Signature.getInstance(signatureName, provider) : Signature.getInstance(signatureName));
    }
}
