package com.google.android.play.core.splitinstall.internal;

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
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
class zzh extends X509Certificate {
    private final X509Certificate zza;

    public zzh(X509Certificate x509Certificate) {
        this.zza = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("^ThR\u001ebSPa]S]a\u0015IJVW\u00109\u0015\u000f\u0017 AMNB>@96H8", (short) (OY.Xd() ^ 3475))).getMethod(C1561oA.Kd("\u000b\u0011\u000f\u000e\u0017\u0003\u000f\u001b\u0019\u0015\u001b'-", (short) (C1607wl.Xd() ^ 4372)), new Class[0]);
        try {
            method.setAccessible(true);
            method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Class<?> cls = Class.forName(Wg.Zd("#\u000bpc\u0001.1v\u001a^&9\u000f+q;Q\f%h\u0005\u0019\u0002d\u0007L.<x\u0015n=`y", (short) (FB.Xd() ^ 25856), (short) (FB.Xd() ^ 5869)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("\u0019\u0011'\u0013`))\u001f#e|\u001b/!", (short) (FB.Xd() ^ 12611)))};
        Object[] objArr = {date};
        short sXd = (short) (C1607wl.Xd() ^ 30448);
        int[] iArr = new int["mqqnq[is{u}\b\b".length()];
        QB qb = new QB("mqqnq[is{u}\b\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
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
    public final int getBasicConstraints() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("8.B,w<-*;7-7;n#$01i\u0013nhpy\u001b'(\u001c\u0018\u001a\u0013\u0010\"\u0012", (short) (ZN.Xd() ^ 13650), (short) (ZN.Xd() ^ 20697))).getMethod(hg.Vd("\u001d\u001a(t\u0013$\u0019\u0012p\u001c\u001a\u001e\u001e\u001b\t\u0010\u0014\u0019\u0017", (short) (Od.Xd() ^ (-22602)), (short) (Od.Xd() ^ (-31995))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(x509Certificate, objArr)).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return this.zza.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.zza.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return this.zza.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("2(<&q6'$51'15h\u001d\u001e*+c\rhbjs\u0015!\"\u0016\u0012\u0014\r\n\u001c\f", (short) (FB.Xd() ^ 6005))).getMethod(C1561oA.yd("\u0018\u0015'z(',\u001b+{\t", (short) (C1499aX.Xd() ^ (-16499))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\u000e\u0006\u001c\bU\u001c\u000f\u000e!\u001f\u0017#)^\u0015\u0018&)c\u000flhr}!/2(&*%$8*", (short) (OY.Xd() ^ 12046))).getMethod(Xg.qd("LK[1\\]`Q_C]YbgX=9", (short) (C1607wl.Xd() ^ 19706), (short) (C1607wl.Xd() ^ 26442)), new Class[0]);
        try {
            method.setAccessible(true);
            return (boolean[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u0010]\u001b\u001f\u000e|'N^t\u0014X\u007f]+V\"\\?\u0004\u0002%g\u0018;`\f;Y\u0005\u0018<\u0010:", (short) (C1633zX.Xd() ^ (-13249)), (short) (C1633zX.Xd() ^ (-2762)))).getMethod(ZO.xd("L\"};8ls,X10", (short) (C1633zX.Xd() ^ (-6993)), (short) (C1633zX.Xd() ^ (-26165))), new Class[0]);
        try {
            method.setAccessible(true);
            return (boolean[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return this.zza.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("8tBhE\u001bz8\\\tSw8;u8%\t8//[a\u000fZ\u0014[J1\u001aW\u007f\u0011z", (short) (C1580rY.Xd() ^ (-26753)), (short) (C1580rY.Xd() ^ (-22606)))).getMethod(Ig.wd("\b67p\tiR\u000fjRc", (short) (OY.Xd() ^ 23327)), new Class[0]);
        try {
            method.setAccessible(true);
            return (Date) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u001aAx\bD>\b\u0007;xe\u001bN\u0005Jr4L!\u0001!yVf\\K1{H?\u000bpe>", (short) (Od.Xd() ^ (-29662)))).getMethod(C1561oA.Qd("DAO(HL\u0019;;CE7", (short) (C1607wl.Xd() ^ 4584)), new Class[0]);
        try {
            method.setAccessible(true);
            return (Date) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return this.zza.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("'\u001f5!n5(':80<Bw.1?B|(\u0006\u0002\f\u0017:HKA?C>=QC", (short) (Od.Xd() ^ (-23414)), (short) (Od.Xd() ^ (-28230)))).getMethod(C1561oA.od("RO];LXNEO0VMACO", (short) (Od.Xd() ^ (-21363))), new Class[0]);
        try {
            method.setAccessible(true);
            return (BigInteger) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("\"\u001a0\u001ci0#\"53+7=r),:=w#\u0001|\u0007\u00125CF<:>98L>", (short) (C1633zX.Xd() ^ (-1444)))).getMethod(Wg.Zd("5|\rr\u000ejEwoeYli", (short) (C1580rY.Xd() ^ (-4796)), (short) (C1580rY.Xd() ^ (-13730))), new Class[0]);
        try {
            method.setAccessible(true);
            return (String) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("ldzf4zml\u007f}u\u0002\b=sv\u0005\bBmKGQ\\\u007f\u000e\u0011\u0007\u0005\t\u0004\u0003\u0017\t", (short) (ZN.Xd() ^ 9405))).getMethod(Wg.vd("43?\u001f:9\u0010<,\u0015\f\b", (short) (OY.Xd() ^ 2045)), new Class[0]);
        try {
            method.setAccessible(true);
            return (String) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd(">4H2}B30A=3=At)*67o\u0019tnv\u007f!-.\"\u001e \u0019\u0016(\u0018", (short) (OY.Xd() ^ 15963), (short) (OY.Xd() ^ 31717))).getMethod(hg.Vd("zw\u0006cxuNxrZjzhsx", (short) (C1580rY.Xd() ^ (-17191)), (short) (C1580rY.Xd() ^ (-25098))), new Class[0]);
        try {
            method.setAccessible(true);
            return (byte[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        short sXd = (short) (Od.Xd() ^ (-23926));
        int[] iArr = new int["\u001d\u0013'\u0011\\!\u0012\u000f \u001c\u0012\u001c S\b\t\u0015\u0016NwSMU^\u007f\f\r\u0001|~wt\u0007v".length()];
        QB qb = new QB("\u001d\u0013'\u0011\\!\u0012\u000f \u001c\u0012\u001c S\b\t\u0015\u0016NwSMU^\u007f\f\r\u0001|~wt\u0007v");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("0/?\u001f.-5)EGE9", (short) (OY.Xd() ^ 24988)), new Class[0]);
        try {
            method.setAccessible(true);
            return (byte[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("yq\bsA\bzy\r\u000b\u0003\u000f\u0015J\u0001\u0004\u0012\u0015OzXT^i\r\u001b\u001e\u0014\u0012\u0016\u0011\u0010$\u0016", (short) (C1499aX.Xd() ^ (-13520)))).getMethod(Xg.qd("'&6\u00169'0,+=\u000e\u0019", (short) (Od.Xd() ^ (-22669)), (short) (Od.Xd() ^ (-12138))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Principal) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("MZ`|L\u0003eZe\u001c{\"\u007f-q\u0005\u0013\b2mk]nRo\u0016!,+~\n\u001b/1", (short) (Od.Xd() ^ (-32032)), (short) (Od.Xd() ^ (-14705)))).getMethod(ZO.xd("\u001bt\u001c\u0013f`7h\u00042}@q<\u001f\u0011\u007f5", (short) (ZN.Xd() ^ 15454), (short) (ZN.Xd() ^ 20278)), new Class[0]);
        try {
            method.setAccessible(true);
            return (boolean[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("$y=:C\u0014R9Q).\\gyHn]\u0005{_J\\` \bL4#\u0006ITih'", (short) (C1499aX.Xd() ^ (-5552)), (short) (C1499aX.Xd() ^ (-3556)))).getMethod(Ig.wd("}/*xdPR\u000b`9&j\u001f%\u001dOw", (short) (OY.Xd() ^ 14557)), new Class[0]);
        try {
            method.setAccessible(true);
            return (byte[]) method.invoke(x509Certificate, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() throws Throwable {
        X509Certificate x509Certificate = this.zza;
        short sXd = (short) (Od.Xd() ^ (-968));
        int[] iArr = new int["k,\u0013bgY[2\u000f,!N\"P}\u001e\u007fwy_vJesPu\u001a?r\b\">y\u0011".length()];
        QB qb = new QB("k,\u0013bgY[2\u000f,!N\"P}\u001e\u007fwy_vJesPu\u001a?r\b\">y\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("\u0019\u0016$\u0005\u0013\u001f\u001f\u0014\u0019\u0017", (short) (C1580rY.Xd() ^ (-31140))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(x509Certificate, objArr)).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.zza.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        return this.zza.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.zza.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.zza.verify(publicKey, str);
    }
}
