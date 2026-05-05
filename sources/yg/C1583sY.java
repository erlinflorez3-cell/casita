package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* JADX INFO: renamed from: yg.sY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1583sY extends X509Certificate {
    private final X509Certificate Xd;

    C1583sY(X509Certificate x509Certificate) {
        this.Xd = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        Class<?> cls = Class.forName(Jg.Wd("`\u000e`yD8_\u001a\u001cW:\u0005\u0001`T\u0006\u0010?/\u0019\"[\u0014Zr.m\u0011\f|-hh\u0019", (short) (ZN.Xd() ^ (Od.Xd() ^ (1328252053 ^ 148243370))), (short) (ZN.Xd() ^ (1941543730 ^ 1941566570))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = C1499aX.Xd() ^ (-1134242392);
        int iXd2 = ZN.Xd() ^ (1413437030 ^ 1739929105);
        short sXd = (short) (ZN.Xd() ^ iXd);
        short sXd2 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr = new int["\u0001\u0017\u001d33\u00114\u0011\u0012AJ(;".length()];
        QB qb = new QB("\u0001\u0017\u001d33\u00114\u0011\u0012AJ(;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        Class<?> cls = Class.forName(C1626yg.Ud("59\\@0]SY6\u0002TYk\b\u0018\u000130$X/;!EcBcyT}0gB]", (short) (C1580rY.Xd() ^ (527499560 ^ (-527531828))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (258253270 ^ (-1351343714))))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (OY.Xd() ^ (192381384 ^ (-257723157))));
        int[] iArr = new int["]\u0002\u0015Xug\u0013(g\u0006&\u001d`O".length()];
        QB qb = new QB("]\u0002\u0015Xug\u0013(g\u0006&\u001d`O");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {date};
        Method method = cls.getMethod(EO.Od(">\u000e\u001d>NfAd,wzg;", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1094634001 ^ (-1159045048))))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = Od.Xd() ^ (1931873528 ^ (-886822848));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("si}g3whevrhrv*^_kl%N*$,5VbcWSUNK]M", (short) (C1633zX.Xd() ^ iXd))).getMethod(C1593ug.zd("DCS\"BULG(UU[]\\LU[bb", (short) (Od.Xd() ^ (OY.Xd() ^ (-69953401))), (short) (Od.Xd() ^ ((905382254 ^ 1361994895) ^ (-1691970551)))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(x509Certificate, objArr)).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        return this.Xd.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.Xd.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return this.Xd.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        short sXd = (short) (Od.Xd() ^ ((842829934 ^ 999686749) ^ (-162190311)));
        int[] iArr = new int["A7K5\u0001E63D@6@Dw,-9:r\u001cwqy\u0003$01%!#\u001c\u0019+\u001b".length()];
        QB qb = new QB("A7K5\u0001E63D@6@Dw,-9:r\u001cwqy\u0003$01%!#\u001c\u0019+\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd(":9I\u001fJKN?M +", (short) (ZN.Xd() ^ (Od.Xd() ^ (922513354 ^ 1895955396)))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = C1633zX.Xd() ^ (907372666 ^ 1111768276);
        int iXd2 = ZN.Xd() ^ (746924713 ^ (-521091399));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("\u001d!B9*zx\u0003\t\u0012\u0016-V\u0017Weft:qry\u000f$:Sab\u0005\u0014\u001a$+'", (short) (C1580rY.Xd() ^ iXd), (short) (C1580rY.Xd() ^ iXd2))).getMethod(C1561oA.Xd("a`pFqruftXrnw|mRN", (short) (C1633zX.Xd() ^ (620228072 ^ (-620210283)))), new Class[0]);
        try {
            method.setAccessible(true);
            return (boolean[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        Class<?> cls = Class.forName(Wg.vd("\u0017\r!\u000bV\u001b\f\t\u001a\u0016\f\u0016\u001aM\u0002\u0003/0h\u0012mgox\u001a&'\u001b\u0017\u0019\u0012\u000f\u0001p", (short) (FB.Xd() ^ (1775289950 ^ 1775290493))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = OY.Xd() ^ (1188371718 ^ (-1123968691));
        short sXd = (short) (C1633zX.Xd() ^ (1010874320 ^ (-1010864119)));
        short sXd2 = (short) (C1633zX.Xd() ^ iXd);
        int[] iArr = new int["30>\u0014-@\u001b8%*'".length()];
        QB qb = new QB("30>\u0014-@\u001b8%*'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return (boolean[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        return this.Xd.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        short sXd = (short) (FB.Xd() ^ ((2090100317 ^ 849561637) ^ 1312243843));
        int iXd = FB.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\f\u0002\u0016\u007fK\u0010\u0001}\u000f\u000b\u0001\u000b\u000fBvw\u0004\u0005=fB<DMnz{okmfcue", sXd, (short) (iXd ^ ((377740301 ^ 259003815) ^ 435400219)))).getMethod(C1561oA.ud("\u0013\u0010\u001ev\u0017\u001bf\u000b\u0018\b\u0014", (short) (ZN.Xd() ^ ((1631973391 ^ 642969030) ^ 1192720146))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Date) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = ZN.Xd() ^ (-864703077);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("7/A-v=,+:8,8:o\"%/2h\u0014mioz\u001a('\u001d\u0017\u001b\u0012\u0011!\u0013", (short) (Od.Xd() ^ iXd))).getMethod(C1561oA.Yd("('7\u00124:\t-/9=1", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207803358))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Date) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        return this.Xd.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        Class<?> cls = Class.forName(Xg.qd("sk\u0002m;\u0002ts\u0007\u0005|\t\u000fDz}\f\u000fItRNXc\u0007\u0015\u0018\u000e\f\u0010\u000b\n\u001e\u0010", (short) (FB.Xd() ^ (1514056407 ^ 1514047665)), (short) (FB.Xd() ^ (1086976117 ^ 1086976971))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = C1607wl.Xd() ^ 1849968500;
        short sXd = (short) (C1607wl.Xd() ^ ((1362098043 ^ 856008637) ^ 1646951713));
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr = new int["\"#.\t\u001f(\u001a\u000e\u001d| \u001b\f\u000b\u0014".length()];
        QB qb = new QB("\"#.\t\u001f(\u001a\u000e\u001d| \u001b\f\u000b\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return (BigInteger) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = Od.Xd() ^ (-1207820100);
        int iXd2 = C1633zX.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("2z%0-:\nnG\"\u0006f\u001eY\u0014:X,rQs7 m)F*L\u0002\u0019(Iz\u0006", (short) (iXd2 ^ ((973496518 ^ 278603885) ^ (-714936788))), (short) (C1633zX.Xd() ^ iXd))).getMethod(C1626yg.Ud("0wuU\u0011+Um\u0002h\u0007&\\", (short) (OY.Xd() ^ ((371603169 ^ 393284972) ^ 22505537)), (short) (OY.Xd() ^ (398879725 ^ 398875640))), new Class[0]);
        try {
            method.setAccessible(true);
            return (String) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = C1499aX.Xd() ^ (155378810 ^ 1255780136);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("q\u001b\u001ct^\u007f\u0004\u0017rE4\u0007<~Lp4D&DY\u0001$&\u0005Bf\u001e)^h\u0007FU", (short) (C1633zX.Xd() ^ iXd))).getMethod(EO.Od("+NQ\u0016fB6jAjd;", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1938802714 ^ 1074120347)))), new Class[0]);
        try {
            method.setAccessible(true);
            return (String) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = C1633zX.Xd();
        Object[] objArr = new Object[0];
        int iXd2 = C1607wl.Xd() ^ (-1849954117);
        Method method = Class.forName(C1561oA.Qd("\u0006{\u0010yE\nzw\t\u0005z\u0005\t<pq}~7`<6>Ghtuieg`]o_", (short) (iXd ^ ((1487054215 ^ 375470378) ^ (-1321453835))))).getMethod(C1593ug.zd("YXhH_^9eaK]o_ls", (short) (C1499aX.Xd() ^ (1070196838 ^ (-1070195810))), (short) (C1499aX.Xd() ^ iXd2)), new Class[0]);
        try {
            method.setAccessible(true);
            return (byte[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = OY.Xd() ^ (-69940345);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("\u0017\r!\u000bV\u001b\f\t\u001a\u0016\f\u0016\u001aM\u0002\u0003\u000f\u0010HqMGOXy\u0006\u0007zvxqn\u0001p", (short) (Od.Xd() ^ iXd))).getMethod(C1561oA.Kd("\u001d\u001c,\f#\"*\u001e242&", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (2144499143 ^ (-1280862027))))), new Class[0]);
        try {
            method.setAccessible(true);
            return (byte[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        short sXd = (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69953637)));
        int iXd = C1499aX.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("<3i4\"\tZy-\n\"\u000fS)@a\u0010sLXVp[\u0007hWzOm\u0012k\u000b?\u0010", sXd, (short) (iXd ^ ((346833317 ^ 574625351) ^ (-921454502))))).getMethod(C1561oA.Xd("sr\u0003b\u0006s|xw\nZe", (short) (Od.Xd() ^ ((859186649 ^ 801769206) ^ (-486308388)))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = C1607wl.Xd();
        Object[] objArr = new Object[0];
        int iXd2 = FB.Xd() ^ (1833355037 ^ (-849992709));
        Method method = Class.forName(Wg.vd("e[oY-qb_hdZdp$XY]^\u0017@$\u001e&/HTUIMOHEO?", (short) (iXd ^ ((425496640 ^ 897581636) ^ 752648538)))).getMethod(Qg.kd("MJX6WCJDAQ1ICJM<\u001f\u0019", (short) (C1580rY.Xd() ^ ((366401405 ^ 794261804) ^ (-981584869))), (short) (C1580rY.Xd() ^ iXd2)), new Class[0]);
        try {
            method.setAccessible(true);
            return (boolean[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = C1499aX.Xd() ^ (-1134241140);
        int iXd2 = ZN.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("+!5\u001fj/ \u001d.* *.a\u0016\u0017#$\\\u0006a[cl\u000e\u001a\u001b\u000f\u000b\r\u0006\u0003\u0015\u0005", (short) (iXd2 ^ ((1010919322 ^ 1992308685) ^ 1249991912)), (short) (ZN.Xd() ^ iXd))).getMethod(C1561oA.ud("`]kJ7G6WcdXTVOL^N", (short) (Od.Xd() ^ (Od.Xd() ^ (1804356447 ^ (-745655857))))), new Class[0]);
        try {
            method.setAccessible(true);
            return (byte[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() throws Throwable {
        X509Certificate x509Certificate = this.Xd;
        int iXd = C1607wl.Xd() ^ 1849950789;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("4*B,s8-*GC=GGz34LM\n3\u000b\u0005\u0011\u001aGSXLDFC@^N", (short) (C1607wl.Xd() ^ iXd))).getMethod(C1561oA.Yd("\b\u0007\u0017y\n\u0018\u001a\u0011\u0018\u0018", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609516433)))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(x509Certificate, objArr)).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return this.Xd.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.Xd.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.Xd.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.Xd.verify(publicKey, str);
    }
}
