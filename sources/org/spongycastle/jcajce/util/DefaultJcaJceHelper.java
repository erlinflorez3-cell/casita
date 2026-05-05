package org.spongycastle.jcajce.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultJcaJceHelper implements JcaJceHelper {
    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(C1561oA.ud("]SgQ\u001daRO`\\R\\`\u0014HIUV\u000f#DPQEAC<9K;\u001b56F@BH", (short) (FB.Xd() ^ 10930))).getDeclaredMethod(C1561oA.Yd("CBR(NTVDRHK", (short) (FB.Xd() ^ 5583)), Class.forName(C1561oA.yd("4,B.s3)79\u0001'I@8>8", (short) (C1607wl.Xd() ^ 14766))));
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(Xg.qd("\u0011\t\u001f\u000bX\u001f\u0012\u0011$\"\u001a&,a\u007f\u001b0\b\u001a#-\u0003\",$2\"626", (short) (C1607wl.Xd() ^ 15524), (short) (C1607wl.Xd() ^ 11164))).getDeclaredMethod(ZO.xd("j\u000e\u0012]K&\\7)aa", (short) (C1633zX.Xd() ^ (-21281)), (short) (C1633zX.Xd() ^ (-21572))), Class.forName(Jg.Wd("C\u0011+0\u0004WVhxICks\u007f\u000e\u001f", (short) (FB.Xd() ^ 8972), (short) (FB.Xd() ^ 16741))));
        try {
            declaredMethod.setAccessible(true);
            return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }
}
