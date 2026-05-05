package org.spongycastle.openpgp.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.SignatureException;
import java.util.Date;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.bcpg.ArmoredOutputStream;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPKeyRingGenerator;
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
import yg.C1626yg;
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
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class DSAElGamalKeyRingGenerator {
    private static void exportKeyPair(OutputStream outputStream, OutputStream outputStream2, KeyPair keyPair, KeyPair keyPair2, String str, char[] cArr, boolean z2) throws PGPException, SignatureException, IOException, InvalidKeyException, NoSuchProviderException {
        if (z2) {
            outputStream = new ArmoredOutputStream(outputStream);
        }
        JcaPGPKeyPair jcaPGPKeyPair = new JcaPGPKeyPair(17, keyPair, new Date());
        JcaPGPKeyPair jcaPGPKeyPair2 = new JcaPGPKeyPair(16, keyPair2, new Date());
        PGPDigestCalculator pGPDigestCalculator = new JcaPGPDigestCalculatorProviderBuilder().build().get(2);
        PGPKeyRingGenerator pGPKeyRingGenerator = new PGPKeyRingGenerator(19, jcaPGPKeyPair, str, pGPDigestCalculator, null, null, new JcaPGPContentSignerBuilder(jcaPGPKeyPair.getPublicKey().getAlgorithm(), 2), new JcePBESecretKeyEncryptorBuilder(9, pGPDigestCalculator).setProvider(BouncyCastleProvider.PROVIDER_NAME).build(cArr));
        pGPKeyRingGenerator.addSubKey(jcaPGPKeyPair2);
        pGPKeyRingGenerator.generateSecretKeyRing().encode(outputStream);
        outputStream.close();
        if (z2) {
            outputStream2 = new ArmoredOutputStream(outputStream2);
        }
        pGPKeyRingGenerator.generatePublicKeyRing().encode(outputStream2);
        outputStream2.close();
    }

    public static void main(String[] strArr) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        int length = strArr.length;
        String strUd = C1626yg.Ud("4QnKXQ%72\u0015\u00037Q!\\^q\u000f[V\u0007cO%i0(b\u0019\u0007Mq\u0003a:P\u0003\u001bf&,\f\u0001\u001eW^C\\\u0007q:", (short) (Od.Xd() ^ (-2666)), (short) (Od.Xd() ^ (-5108)));
        if (length < 2) {
            System.out.println(strUd);
            System.exit(0);
        }
        String strWd = Ig.wd("$c\u0010", (short) (C1499aX.Xd() ^ (-30638)));
        String strOd = EO.Od("\u0016P", (short) (C1607wl.Xd() ^ 8611));
        Class<?> cls = Class.forName(C1561oA.Qd(".$8\"m2# 1-#-1d\u0001\u001a-\u0003\u0013\u001a\"u\u0013\u001b\u0011\u001d\u000b\u001d\u0017\u0019", (short) (ZN.Xd() ^ 6581)));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(C1593ug.zd("\u007fw\u000eyG\u0007|\u000b\u0005Lr\u0015\u0014\f\u0012\f", (short) (Od.Xd() ^ (-3784)), (short) (Od.Xd() ^ (-8685))));
        short sXd = (short) (FB.Xd() ^ 27777);
        int[] iArr = new int["wm\u0002k7thtl2Vvsime".length()];
        QB qb = new QB("wm\u0002k7thtl2Vvsime");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strWd, strOd};
        short sXd2 = (short) (C1580rY.Xd() ^ (-5817));
        int[] iArr2 = new int[">=M#IOQ?MCF".length()];
        QB qb2 = new QB(">=M#IOQ?MCF");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {1024};
            Method method = Class.forName(Wg.Zd("e-`\u001cf<\r\u001bk9N*-qm\u0018j\u0010A\u0018!\u0004\u0003\u001aQ-D\u0006!2", (short) (FB.Xd() ^ 22827), (short) (FB.Xd() ^ 19751))).getMethod(C1561oA.Xd("V\\XdZS_]o[", (short) (OY.Xd() ^ 10085)), Integer.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(keyPairGenerator, objArr2);
                Object[] objArr3 = new Object[0];
                Method method2 = Class.forName(Wg.vd("og}i7}po\u0003\u0001x\u0005\u000b@^ynFXakA`jbp`tpt", (short) (C1580rY.Xd() ^ (-16722)))).getMethod(Qg.kd("spxnzhzjOh{Qahp", (short) (ZN.Xd() ^ 6019), (short) (ZN.Xd() ^ 23414)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    KeyPair keyPair = (KeyPair) method2.invoke(keyPairGenerator, objArr3);
                    short sXd3 = (short) (C1499aX.Xd() ^ (-17746));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-26547));
                    int[] iArr3 = new int["\u001c\"\u001c\u0015 \u0013\u001d".length()];
                    QB qb3 = new QB("\u001c\"\u001c\u0015 \u0013\u001d");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                        i4++;
                    }
                    String str = new String(iArr3, 0, i4);
                    Class<?> cls2 = Class.forName(C1561oA.ud("\u0018\u000e\"\fW\u001c\r\n\u001b\u0017\r\u0017\u001bNj\u0004\u0017l|\u0004\f_|\u0005z\u0007t\u0007\u0001\u0003", (short) (OY.Xd() ^ 11361)));
                    Class<?>[] clsArr2 = {Class.forName(C1561oA.yd("OEYC\u0017THTT\u001a>^cY]U", (short) (OY.Xd() ^ 8315))), Class.forName(C1561oA.Yd("E=S?\rLBPJ\u00128ZYQWQ", (short) (ZN.Xd() ^ 29816)))};
                    Object[] objArr4 = {str, strOd};
                    short sXd5 = (short) (C1607wl.Xd() ^ 4943);
                    short sXd6 = (short) (C1607wl.Xd() ^ 25953);
                    int[] iArr4 = new int["SRb8^dfTbX[".length()];
                    QB qb4 = new QB("SRb8^dfTbX[");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) + sXd6);
                        i5++;
                    }
                    Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr4, 0, i5), clsArr2);
                    try {
                        declaredMethod2.setAccessible(true);
                        KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) declaredMethod2.invoke(null, objArr4);
                        DHParameterSpec dHParameterSpec = new DHParameterSpec(new BigInteger(ZO.xd("W:i#-eD\u001boW@D\u0002h=w\u0001,\u0001|f-~]\u0010\u0006\u0007|=\u0013.e\nML]<v\u000e\u0007o\u001fB]\u00066XH\\]\f<pGRKNo\u001f,ws(}=Sz&\u0001VdUKr`*ih?\u000eT]\u0004cR\u0019\u0005\u000f\nex<`3\u001c.OmOKi>lX !\u001a2P\u0019\u0003N{ J\u0004\r&X8`\u0004w$!\f8\n", (short) (C1499aX.Xd() ^ (-13543)), (short) (C1499aX.Xd() ^ (-30056))), 16), new BigInteger(Jg.Wd("\u0019^W\u0010kV+3>t/52GSIR!Q\"-\u001c\u001d|+2jxA\u0002\u0016\u0012Cb^]f-(0<\u0004~8\tK\u0006W\u0004\u001a!N'rrvyE@@Q\u0006?H\u0015\bbd`_:`8\u0001*3>~~\u0007_H\u0019$T\u001bv\"rsv=H\u0010\u000f\u0016\"Y\u000eli.cm;(\u0005|\u0003\u0001P}YU\u001b'[\u0017k+#=tJE\u0015EB", (short) (FB.Xd() ^ 11601), (short) (FB.Xd() ^ 2571)), 16));
                        Class<?> cls3 = Class.forName(C1626yg.Ud("AGlY\u0010\u001cs'\u0013{q?\fz\u0018 \u0016`7\u001bK\u0010\u0002-{\u0013!;\u00185", (short) (ZN.Xd() ^ 6392), (short) (ZN.Xd() ^ 31589)));
                        Class<?>[] clsArr3 = new Class[1];
                        short sXd7 = (short) (FB.Xd() ^ 13656);
                        int[] iArr5 = new int["\fM2\u0003LUit\\\u001f\u0012\u0001S\b[<xZz\u0014\u0005N|\b\u001fj|8=\\\u000e!Acz2WP\u0005oe".length()];
                        QB qb5 = new QB("\fM2\u0003LUit\\\u001f\u0012\u0001S\b[<xZz\u0014\u0005N|\b\u001fj|8=\\\u000e!Acz2WP\u0005oe");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd7 + i6)));
                            i6++;
                        }
                        clsArr3[0] = Class.forName(new String(iArr5, 0, i6));
                        Object[] objArr5 = {dHParameterSpec};
                        Method method3 = cls3.getMethod(EO.Od("\u0018Kz v;\u0014\u0004?h", (short) (C1580rY.Xd() ^ (-19756))), clsArr3);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(keyPairGenerator2, objArr5);
                            short sXd8 = (short) (C1580rY.Xd() ^ (-23903));
                            int[] iArr6 = new int["oeyc/sdarndnr&B[nDT[c7T\\R^L^XZ".length()];
                            QB qb6 = new QB("oeyc/sdarndnr&B[nDT[c7T\\R^L^XZ");
                            int i7 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i7] = xuXd6.fK(sXd8 + sXd8 + sXd8 + i7 + xuXd6.CK(iKK6));
                                i7++;
                            }
                            Object[] objArr6 = new Object[0];
                            Method method4 = Class.forName(new String(iArr6, 0, i7)).getMethod(C1593ug.zd("\n\t\u0013\u000b\u0019\t\u001d\u000fu\u0011&}\u0010\u0019#", (short) (C1607wl.Xd() ^ 3437), (short) (C1607wl.Xd() ^ 29702)), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                KeyPair keyPair2 = (KeyPair) method4.invoke(keyPairGenerator2, objArr6);
                                if (!strArr[0].equals(C1561oA.od("\u0014G", (short) (Od.Xd() ^ (-2478))))) {
                                    exportKeyPair(new FileOutputStream(C1561oA.Xd("xkjzn~9n}u", (short) (C1580rY.Xd() ^ (-972)))), new FileOutputStream(Wg.vd("\u0014\u001a\u0004P\u0002\u0011\u0005", (short) (Od.Xd() ^ (-4932)))), keyPair, keyPair2, strArr[0], strArr[1].toCharArray(), false);
                                    return;
                                }
                                if (strArr.length < 3) {
                                    System.out.println(strUd);
                                    System.exit(0);
                                }
                                exportKeyPair(new FileOutputStream(C1561oA.Kd("QDCSGW\u0012FYJ", (short) (FB.Xd() ^ 13191))), new FileOutputStream(Wg.Zd("C\u0012\u0004[\u0016$X", (short) (Od.Xd() ^ (-22894)), (short) (Od.Xd() ^ (-1868)))), keyPair, keyPair2, strArr[1], strArr[2].toCharArray(), true);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }
}
