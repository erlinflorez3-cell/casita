package org.bouncycastle.jcajce.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderJcaJceHelper implements JcaJceHelper {
    protected final Provider provider;

    public ProviderJcaJceHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) throws Throwable {
        Provider provider = this.provider;
        Class<?> cls = Class.forName(Ig.wd("\u007f #}SD\u001a\bSo`\u0016L~\\\u007f48)\u0016qFvku-H\u0016+MR\u000f-_\u00015\"", (short) (ZN.Xd() ^ 5453)));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(EO.Od("'E\t\u001b0L\u0015\u0002J$C\u0007PUF`", (short) (C1633zX.Xd() ^ (-27877))));
        short sXd = (short) (FB.Xd() ^ 28092);
        int[] iArr = new int[".$8\"m2# 1-#-1d\u0006'#)\u001b\u0015\u0015!".length()];
        QB qb = new QB(".$8\"m2# 1-#-1d\u0006'#)\u001b\u0015\u0015!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str, provider};
        Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("\u001c\u001b+\u0001'-/\u001d+!$", (short) (Od.Xd() ^ (-20884)), (short) (Od.Xd() ^ (-20247))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) throws Throwable {
        Object[] objArr = {str, this.provider};
        Method declaredMethod = Class.forName(C1561oA.od("rh|f2vgduqgqu)E^qGW^f:W_UaOa[]", (short) (C1607wl.Xd() ^ 12120))).getDeclaredMethod(C1561oA.Xd("65E\u001bAGI7E;>", (short) (OY.Xd() ^ 8595)), Class.forName(C1561oA.Kd("XPfR _Uc]%Kmldjd", (short) (C1633zX.Xd() ^ (-8138)))), Class.forName(Wg.Zd("\u001d\u0017O]\r\u0014)J@@\\\u000brj.sR\\r\u0013vG", (short) (FB.Xd() ^ 16477), (short) (FB.Xd() ^ 11055))));
        try {
            declaredMethod.setAccessible(true);
            return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public SecureRandom createSecureRandom(String str) throws Throwable {
        Provider provider = this.provider;
        short sXd = (short) (C1633zX.Xd() ^ (-1199));
        int[] iArr = new int["\u000e\u0004\u001c\u0006M\u0012\u0007\u0004!\u001d\u0017!!T|\u000e\u0017((\u001a\u0002\u0010 \u0015+(".length()];
        QB qb = new QB("\u000e\u0004\u001c\u0006M\u0012\u0007\u0004!\u001d\u0017!!T|\u000e\u0017((\u001a\u0002\u0010 \u0015+(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {str, provider};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.ud("nkyMquuamab", (short) (OY.Xd() ^ 9033)), Class.forName(Qg.kd("\n\u007f\u0014}I\u0007z\u0007~Dh\t\u0006{\u007fw", (short) (C1607wl.Xd() ^ 28462), (short) (C1607wl.Xd() ^ 28494))), Class.forName(hg.Vd("\u0018\u000e\"\fW\u001c\r\n\u001b\u0017\r\u0017\u001bNo\u0011\r\u0013\u0005~~\u000b", (short) (Od.Xd() ^ (-15949)), (short) (Od.Xd() ^ (-12451)))));
        try {
            declaredMethod.setAccessible(true);
            return (SecureRandom) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.provider);
    }
}
