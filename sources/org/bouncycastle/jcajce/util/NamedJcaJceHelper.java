package org.bouncycastle.jcajce.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class NamedJcaJceHelper implements JcaJceHelper {
    protected final String providerName;

    public NamedJcaJceHelper(String str) {
        this.providerName = str;
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameterGenerator.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameters.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) throws Throwable {
        String str2 = this.providerName;
        Class<?> cls = Class.forName(C1593ug.zd("\u0017\u000f%\u0011^%\u0018\u0017*( ,2g\u001e!/2l\u0003&47-+/*)=/\u0011-0B>BJ", (short) (C1499aX.Xd() ^ (-25534)), (short) (C1499aX.Xd() ^ (-5764))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (OY.Xd() ^ 16176);
        int[] iArr = new int["YOcM\u0019VJVN\u00148XUKOG".length()];
        QB qb = new QB("YOcM\u0019VJVN\u00148XUKOG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        short sXd2 = (short) (C1607wl.Xd() ^ 8773);
        int[] iArr2 = new int["ph~j8wm{u=c\u0006\u0005|\u0003|".length()];
        QB qb2 = new QB("ph~j8wm{u=c\u0006\u0005|\u0003|");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str, str2};
        Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("CSoQ\u0004\u0017%\u001f9@O", (short) (C1633zX.Xd() ^ (-4111)), (short) (C1633zX.Xd() ^ (-5125))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
        return Cipher.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return MessageDigest.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyAgreement.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyFactory.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyGenerator.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) throws Throwable {
        String str2 = this.providerName;
        Class<?> cls = Class.forName(C1561oA.Xd("rj\u0001l:\u0001sr\u0006\u0004{\b\u000eCa|\u0012i{\u0005\u000fd\u0004\u000e\u0006\u0014\u0004\u0018\u0014\u0018", (short) (ZN.Xd() ^ 3670)));
        Class<?>[] clsArr = {Class.forName(Wg.vd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0004Kq\u0014\u0013\u000b\u0011\u000b", (short) (ZN.Xd() ^ 9431))), Class.forName(Qg.kd("\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jn\u000f\f\u0002\u0006}", (short) (C1499aX.Xd() ^ (-31890)), (short) (C1499aX.Xd() ^ (-31409))))};
        Object[] objArr = {str, str2};
        short sXd = (short) (C1580rY.Xd() ^ (-7591));
        short sXd2 = (short) (C1580rY.Xd() ^ (-20325));
        int[] iArr = new int["iftHlpp\\h\\]".length()];
        QB qb = new QB("iftHlpp\\h\\]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Mac.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return SecretKeyFactory.getInstance(str, this.providerName);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public SecureRandom createSecureRandom(String str) throws Throwable {
        Object[] objArr = {str, this.providerName};
        Method declaredMethod = Class.forName(C1561oA.ud("\f\u0002\u0016\u007fK\u0010\u0001}\u000f\u000b\u0001\u000b\u000fBfwt\u0006\u0002s_mynxu", (short) (C1580rY.Xd() ^ (-7007)))).getDeclaredMethod(Xg.qd("NM]3Y_aO]SV", (short) (Od.Xd() ^ (-25234)), (short) (Od.Xd() ^ (-27597))), Class.forName(C1561oA.yd(" \u0016.\u0018_\u001d\u0015!%j\u00133,\"*\"", (short) (C1499aX.Xd() ^ (-12439)))), Class.forName(C1561oA.Yd("\u0018\u0010&\u0012_\u001f\u0015#\u001dd\u000b-,$*$", (short) (ZN.Xd() ^ 6479))));
        try {
            declaredMethod.setAccessible(true);
            return (SecureRandom) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Signature.getInstance(str, this.providerName);
    }
}
