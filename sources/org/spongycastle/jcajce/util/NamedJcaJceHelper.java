package org.spongycastle.jcajce.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class NamedJcaJceHelper implements JcaJceHelper {
    protected final String providerName;

    public NamedJcaJceHelper(String str) {
        this.providerName = str;
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameterGenerator.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameters.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) throws Throwable {
        Object[] objArr = {str, this.providerName};
        Method declaredMethod = Class.forName(hg.Vd("QG[E\u0011UFCTPFPT\b<=IJ\u0003\u00178DE9570-?/\u000f)*:46<", (short) (Od.Xd() ^ (-960)), (short) (Od.Xd() ^ (-10503)))).getDeclaredMethod(C1561oA.Yd("\u000b\n\u001ao\u0016\u001c\u001e\f\u001a\u0010\u0013", (short) (Od.Xd() ^ (-8245))), Class.forName(C1561oA.ud("h^r\\(eYe]#GgdZ^V", (short) (C1607wl.Xd() ^ 18705))), Class.forName(C1561oA.yd("qi{g1pbpv>`\u0003}uwq", (short) (C1633zX.Xd() ^ (-5027)))));
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
        return Cipher.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return MessageDigest.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyAgreement.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyFactory.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyGenerator.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) throws Throwable {
        Object[] objArr = {str, this.providerName};
        Method declaredMethod = Class.forName(Xg.qd("D<R>\fREDWUMY_\u00153Nc;MV`6U_WeUiei", (short) (C1499aX.Xd() ^ (-10660)), (short) (C1499aX.Xd() ^ (-20018)))).getDeclaredMethod(C1626yg.Ud("\u001ey6\n/5v\u000305K", (short) (C1580rY.Xd() ^ (-26340)), (short) (C1580rY.Xd() ^ (-2573))), Class.forName(Jg.Wd("8\t@,V\u0013-<\u0017v\u001a!\u0014'+\u0006", (short) (OY.Xd() ^ 13754), (short) (OY.Xd() ^ 9407))), Class.forName(ZO.xd("J\fb+& otGe\u0001*O7[N", (short) (FB.Xd() ^ 31492), (short) (FB.Xd() ^ 20107))));
        try {
            declaredMethod.setAccessible(true);
            return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Mac.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return SecretKeyFactory.getInstance(str, this.providerName);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Signature.getInstance(str, this.providerName);
    }
}
