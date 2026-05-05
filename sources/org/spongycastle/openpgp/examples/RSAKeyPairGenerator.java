package org.spongycastle.openpgp.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.SignatureException;
import java.util.Date;
import org.spongycastle.bcpg.ArmoredOutputStream;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPSecretKey;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.openpgp.operator.jcajce.JcaPGPContentSignerBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcaPGPDigestCalculatorProviderBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcaPGPKeyPair;
import org.spongycastle.openpgp.operator.jcajce.JcePBESecretKeyEncryptorBuilder;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
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
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class RSAKeyPairGenerator {
    private static void exportKeyPair(OutputStream outputStream, OutputStream outputStream2, KeyPair keyPair, String str, char[] cArr, boolean z2) throws PGPException, SignatureException, IOException, InvalidKeyException, NoSuchProviderException {
        OutputStream armoredOutputStream = z2 ? new ArmoredOutputStream(outputStream) : outputStream;
        PGPDigestCalculator pGPDigestCalculator = new JcaPGPDigestCalculatorProviderBuilder().build().get(2);
        JcaPGPKeyPair jcaPGPKeyPair = new JcaPGPKeyPair(1, keyPair, new Date());
        PGPSecretKey pGPSecretKey = new PGPSecretKey(16, jcaPGPKeyPair, str, pGPDigestCalculator, null, null, new JcaPGPContentSignerBuilder(jcaPGPKeyPair.getPublicKey().getAlgorithm(), 2), new JcePBESecretKeyEncryptorBuilder(3, pGPDigestCalculator).setProvider(BouncyCastleProvider.PROVIDER_NAME).build(cArr));
        pGPSecretKey.encode(armoredOutputStream);
        armoredOutputStream.close();
        OutputStream armoredOutputStream2 = z2 ? new ArmoredOutputStream(outputStream2) : outputStream2;
        pGPSecretKey.getPublicKey().encode(armoredOutputStream2);
        armoredOutputStream2.close();
    }

    public static void main(String[] strArr) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        String strWd = Jg.Wd("f~\u007f", (short) (C1580rY.Xd() ^ (-6036)), (short) (C1580rY.Xd() ^ (-8622)));
        String strXd = ZO.xd("/\u007f", (short) (OY.Xd() ^ 18134), (short) (OY.Xd() ^ 2797));
        short sXd = (short) (C1499aX.Xd() ^ (-19892));
        short sXd2 = (short) (C1499aX.Xd() ^ (-3092));
        int[] iArr = new int["~Dwc-\u001d|c\u001aM\u000bC~qF\u0019l\r,!}pu&?).E+D".length()];
        QB qb = new QB("~Dwc-\u001d|c\u001aM\u000bC~qF\u0019l\r,!}pu&?).E+D");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strWd, strXd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Qd("ro}Quyyeqef", (short) (OY.Xd() ^ 20982)), Class.forName(Ig.wd("c\bKZw\tm+X\u001076da~Z", (short) (Od.Xd() ^ (-1329)))), Class.forName(EO.Od("\u001dCF\u0016BEj\u007fOV}|E2k?", (short) (OY.Xd() ^ 2698))));
        try {
            declaredMethod.setAccessible(true);
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {1024};
            Method method = Class.forName(C1593ug.zd("|t\u000bvD\u000b}|\u0010\u000e\u0006\u0012\u0018Mk\u0007\u001cs\u0006\u000f\u0019n\u000e\u0018\u0010\u001e\u000e\"\u001e\"", (short) (Od.Xd() ^ (-7890)), (short) (Od.Xd() ^ (-3575)))).getMethod(C1561oA.od("(,&0$\u001b%!1\u001b", (short) (FB.Xd() ^ 21977)), Integer.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(keyPairGenerator, objArr2);
                Object[] objArr3 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd("\u007fw\u000eyG\u000e\u0001\u007f\u0013\u0011\t\u0015\u001bPn\n\u001fv\t\u0012\u001cq\u0011\u001b\u0013!\u0011%!%", (short) (FB.Xd() ^ 3249))).getMethod(Wg.Zd("l>!y!a\u0010#bN|ta{^", (short) (C1499aX.Xd() ^ (-22282)), (short) (C1499aX.Xd() ^ (-4630))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    KeyPair keyPair = (KeyPair) method2.invoke(keyPairGenerator, objArr3);
                    int length = strArr.length;
                    String strXd2 = C1561oA.Xd("ln]h\u0004\u0019p\u0003\f\u0016k\u000b\u0015\r\u001b\u000b\u001f\u001b\u001fM\n\\\u0012\u000fR\u001d\u0019\u001b%,\".4[-\u001f23\u0011*5%8+", (short) (OY.Xd() ^ 2161));
                    if (length < 2) {
                        System.out.println(strXd2);
                        System.exit(0);
                    }
                    if (strArr[0].equals(Wg.vd("\u00025", (short) (C1607wl.Xd() ^ 16010)))) {
                        if (strArr.length < 3) {
                            System.out.println(strXd2);
                            System.exit(0);
                        }
                        exportKeyPair(new FileOutputStream(Qg.kd("yjgugu.`q`", (short) (C1607wl.Xd() ^ 8229), (short) (C1607wl.Xd() ^ 16915))), new FileOutputStream(hg.Vd("KO;\u00068I8", (short) (C1633zX.Xd() ^ (-28150)), (short) (C1633zX.Xd() ^ (-20945)))), keyPair, strArr[1], strArr[2].toCharArray(), true);
                        return;
                    }
                    short sXd3 = (short) (C1580rY.Xd() ^ (-13772));
                    int[] iArr2 = new int["ZKHVHV\u000fBOE".length()];
                    QB qb2 = new QB("ZKHVHV\u000fBOE");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    exportKeyPair(new FileOutputStream(new String(iArr2, 0, i3)), new FileOutputStream(C1561oA.yd("U[E\u0012CRF", (short) (Od.Xd() ^ (-14613)))), keyPair, strArr[0], strArr[1].toCharArray(), false);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
