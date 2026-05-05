package org.bouncycastle.jcajce.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultJcaJceHelper implements JcaJceHelper {
    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 13780);
        int[] iArr = new int["\t~\u0013|H\r}z\u001c\u0018\u000e\u0018\u001cO\u0004\u0005!\"Zn\u0010\u001c\u001d\u0011\u001d\u001f\u0018\u0015'\u0017v\u0011aqkms".length()];
        QB qb = new QB("\t~\u0013|H\r}z\u001c\u0018\u000e\u0018\u001cO\u0004\u0005!\"Zn\u0010\u001c\u001d\u0011\u001d\u001f\u0018\u0015'\u0017v\u0011aqkms");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (C1580rY.Xd() ^ (-12481));
        int[] iArr2 = new int["c[q]+j`nh0Vxwouo".length()];
        QB qb2 = new QB("c[q]+j`nh0Vxwouo");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        Method declaredMethod = cls.getDeclaredMethod(Xg.qd(",+;\u00117=?-;14", (short) (C1499aX.Xd() ^ (-18509)), (short) (C1499aX.Xd() ^ (-8576))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(Jg.Wd("\u0001\u0006./\u0017jOk\u0011\u001c&/G\nBry^\u000b)E0A`j\u000e\u0010\u0019n\u0001", (short) (Od.Xd() ^ (-31321)), (short) (Od.Xd() ^ (-23354)))).getDeclaredMethod(C1626yg.Ud("\f\\GspM@S\u0014\u00103", (short) (Od.Xd() ^ (-29701)), (short) (Od.Xd() ^ (-30847))), Class.forName(ZO.xd("qH\u00179\u0006z%\u0003\"~\u0007:AQ@y", (short) (ZN.Xd() ^ 19822), (short) (ZN.Xd() ^ 27905))));
        try {
            declaredMethod.setAccessible(true);
            return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public SecureRandom createSecureRandom(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(Ig.wd("\rK2\u0002NFH\u0007=?4!R\u0019*#w{A(YI,*\u0006c", (short) (OY.Xd() ^ 30283))).getDeclaredMethod(C1561oA.Qd("C@N\"FJJ6B67", (short) (FB.Xd() ^ 14931)), Class.forName(EO.Od(")N\u0014\u001d+F\rt<\u0005&g07\u00163", (short) (Od.Xd() ^ (-15387)))));
        try {
            declaredMethod.setAccessible(true);
            return (SecureRandom) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }
}
