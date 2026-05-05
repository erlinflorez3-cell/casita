package org.spongycastle.jcajce.util;

import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
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
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderJcaJceHelper implements JcaJceHelper {
    protected final Provider provider;

    public ProviderJcaJceHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public CertificateFactory createCertificateFactory(String str) throws Throwable {
        Provider provider = this.provider;
        Class<?> cls = Class.forName(Ig.wd("\u001aa\t\u0014@(\u0006l/he\u000fHn(H\u0018\f\u000e;\u001e\u0004,%21M\u001a?bo'\u0019\r]\u001f\u000f", (short) (C1607wl.Xd() ^ 1114)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1633zX.Xd() ^ (-14152));
        int[] iArr = new int["4c\u001b\"&)\u0006['m)t!\n?^".length()];
        QB qb = new QB("4c\u001b\"&)\u0006['m)t!\n?^");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        short sXd2 = (short) (C1633zX.Xd() ^ (-30337));
        int[] iArr2 = new int["]SgQ\u001daRO`\\R\\`\u00145VRXJDDP".length()];
        QB qb2 = new QB("]SgQ\u001daRO`\\R\\`\u00145VRXJDDP");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str, provider};
        short sXd3 = (short) (FB.Xd() ^ 3321);
        short sXd4 = (short) (FB.Xd() ^ 20604);
        int[] iArr3 = new int["IHX.TZ\\JXNQ".length()];
        QB qb3 = new QB("IHX.TZ\\JXNQ");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (CertificateFactory) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Cipher createCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public MessageDigest createDigest(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyAgreement createKeyAgreement(String str) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyGenerator createKeyGenerator(String str) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public KeyPairGenerator createKeyPairGenerator(String str) throws Throwable {
        Provider provider = this.provider;
        short sXd = (short) (Od.Xd() ^ (-3566));
        int[] iArr = new int["@6J4\u007fD52C?5?Cv\u0013,?\u0015%,4\b%-#/\u001d/)+".length()];
        QB qb = new QB("@6J4\u007fD52C?5?Cv\u0013,?\u0015%,4\b%-#/\u001d/)+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {str, provider};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd("XWg=cikYg]`", (short) (OY.Xd() ^ LeicaMakernoteDirectory.TAG_CCD_BOARD_VERSION)), Class.forName(C1561oA.Kd("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u0001#\"\u001a \u001a", (short) (C1633zX.Xd() ^ (-14111)))), Class.forName(Wg.Zd("2M8Tv}E\u0014[:fC\u001e\u0014\u000bb1]\u0002R\u0005v", (short) (FB.Xd() ^ 2260), (short) (FB.Xd() ^ 21517))));
        try {
            declaredMethod.setAccessible(true);
            return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Mac createMac(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str, this.provider);
    }

    @Override // org.spongycastle.jcajce.util.JcaJceHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.provider);
    }
}
