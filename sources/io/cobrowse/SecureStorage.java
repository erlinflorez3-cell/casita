package io.cobrowse;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
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

/* JADX INFO: loaded from: classes3.dex */
final class SecureStorage {
    private static final String ALIAS = "io.cobrowse";
    private static final String CIPHER = "RSA/ECB/PKCS1Padding";
    private static SecureStorage instance = null;

    private SecureStorage() {
    }

    private String decrypt(Context context, String str) throws Exception {
        Object[] objArr = {str.getBytes(StandardCharsets.UTF_8), 0};
        Method declaredMethod = Class.forName(C1561oA.Xd("\u0019'\u001e-+&\"l55+/q\u0007':-~}", (short) (C1633zX.Xd() ^ (-27311)))).getDeclaredMethod(Wg.vd("\u0005\u0007\u0002\u000f\u0001\u0003", (short) (Od.Xd() ^ (-19644))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            short sXd = (short) (Od.Xd() ^ (-30726));
            short sXd2 = (short) (Od.Xd() ^ (-10729));
            int[] iArr = new int["CC0\u001d2/-\u001993*9\u00164DFEIME".length()];
            QB qb = new QB("CC0\u001d2/-\u001993*9\u00164DFEIME");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Cipher cipher = Cipher.getInstance(new String(iArr, 0, i2));
            cipher.init(2, getPrivateKey(getKeyStore(context)));
            return new String(cipher.doFinal(bArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private String encrypt(Context context, String str) throws Exception {
        Cipher cipher = Cipher.getInstance(hg.Vd("::'\u0014)&$\u00100*!0\r+;=<@D<", (short) (Od.Xd() ^ (-12050)), (short) (Od.Xd() ^ (-20014))));
        cipher.init(1, getPublicKey(getKeyStore(context)));
        Object[] objArr = {cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0};
        Method declaredMethod = Class.forName(C1561oA.ud("Zf[hd]W fdXZ\u001b.L]N\u001e\u001b", (short) (FB.Xd() ^ 9054))).getDeclaredMethod(C1561oA.yd("BL>K=?", (short) (OY.Xd() ^ 9750)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return new String((byte[]) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private synchronized void generateKeyPair(Context context) throws Exception {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 1000);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias(C1561oA.Yd("?F\u0006<I=NLURE", (short) (Od.Xd() ^ (-9981)))).setSubject(new X500Principal(Xg.qd("\u0014 \u0010\u0017D8IGPM@", (short) (FB.Xd() ^ 15965), (short) (FB.Xd() ^ 6242)))).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
        String strWd = Jg.Wd("FU)", (short) (C1607wl.Xd() ^ 9310), (short) (C1607wl.Xd() ^ 23761));
        String strXd = ZO.xd("(\u0013A\u001f#n MCrvI\u0002L)", (short) (OY.Xd() ^ 10208), (short) (OY.Xd() ^ 28818));
        Class<?> cls = Class.forName(C1626yg.Ud(";xJiAMJ4oO\u001a{?Nk\u0014\u0019_&B/\u0004\u0012\u0015a'a8\f:", (short) (ZN.Xd() ^ 24165), (short) (ZN.Xd() ^ 3445)));
        Class<?>[] clsArr = {Class.forName(Ig.wd("-J\u0012!%\u000e#`\u00129\\_\u0012\u0003\u0014s", (short) (C1499aX.Xd() ^ (-13712)))), Class.forName(EO.Od("P\u0017>I\u0007\u0002R@sn\u0012Q}~9\u0012", (short) (C1499aX.Xd() ^ (-28395))))};
        Object[] objArr = {strWd, strXd};
        short sXd = (short) (OY.Xd() ^ 22917);
        int[] iArr = new int["41?\u00137;;'3'(".length()];
        QB qb = new QB("41?\u00137;;'3'(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
            Class<?> cls2 = Class.forName(C1593ug.zd("H@VB\u0010VIH[YQ]c\u00197Rg?QZd:Yc[iYmim", (short) (C1580rY.Xd() ^ (-10639)), (short) (C1580rY.Xd() ^ (-17344))));
            Class<?>[] clsArr2 = {Class.forName(C1561oA.od("~t\tr>\u0003sp\u0002}s}\u00025yuif0BlfmoeobfHXhVaXfVbB^RO", (short) (C1499aX.Xd() ^ (-5634))))};
            Object[] objArr2 = {keyPairGeneratorSpecBuild};
            short sXd2 = (short) (C1580rY.Xd() ^ (-6999));
            int[] iArr2 = new int["7=9E;4@>P<".length()];
            QB qb2 = new QB("7=9E;4@>P<");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            Method method = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                method.setAccessible(true);
                method.invoke(keyPairGenerator, objArr2);
                Object[] objArr3 = new Object[0];
                Method method2 = Class.forName(Wg.Zd("\u0006\u001c\u0019!U:\u0012/vSqZ\u0007\u001b]gA70UF8.V\u0013\u007f\u0016\u0007)\u001a", (short) (C1580rY.Xd() ^ (-12275)), (short) (C1580rY.Xd() ^ (-3213)))).getMethod(C1561oA.Xd("\u0003\u0002\f\u0004\u0012\u0002\u0016\bn\n\u001fv\t\u0012\u001c", (short) (Od.Xd() ^ (-17688))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    method2.invoke(keyPairGenerator, objArr3);
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

    private synchronized KeyStore getKeyStore(Context context) throws Exception {
        KeyStore keyStore;
        Object[] objArr = {Wg.vd("Kyl{}xpXw\rc\u0006\u0006\ny", (short) (C1633zX.Xd() ^ (-4010)))};
        Method declaredMethod = Class.forName(Qg.kd("LBV@\fPA>OKAKO\u0003\u001f8K$D>@2", (short) (FB.Xd() ^ 4183), (short) (FB.Xd() ^ 15533))).getDeclaredMethod(C1561oA.ud("\u0010\r\u001bn\u0013\u0017\u0017\u0003\u000f\u0003\u0004", (short) (C1499aX.Xd() ^ (-23374))), Class.forName(hg.Vd("\u0004y\u000ewC\u0001t\u0001x>b\u0003\u007fuyq", (short) (C1607wl.Xd() ^ 30629), (short) (C1607wl.Xd() ^ 21313))));
        try {
            declaredMethod.setAccessible(true);
            keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {null};
            Method method = Class.forName(C1561oA.yd(";3E1zA0/NL@LN\u0004\u001e9:\u00153//#", (short) (C1499aX.Xd() ^ (-27174)))).getMethod(Xg.qd("%)\u001c ", (short) (C1580rY.Xd() ^ (-5052)), (short) (C1580rY.Xd() ^ (-8206))), Class.forName(C1561oA.Yd("( 6\"o6)(;91=Cx\u00172G\"D@D8w!E8<,NJNB.@RBOHXJX", (short) (C1499aX.Xd() ^ (-5267)))));
            try {
                method.setAccessible(true);
                method.invoke(keyStore, objArr2);
                Object[] objArr3 = {Jg.Wd("`\u0013oG\nN=<X+\u0017", (short) (Od.Xd() ^ (-25295)), (short) (Od.Xd() ^ (-11973)))};
                Method method2 = Class.forName(ZO.xd("3X\u000b.X\u00147\u001d%alSEAhD\u001b:0{ey", (short) (C1633zX.Xd() ^ (-7521)), (short) (C1633zX.Xd() ^ (-58)))).getMethod(Ig.wd("(ZWBV\t6cmy\u0001N\u0011", (short) (C1580rY.Xd() ^ (-18049))), Class.forName(C1626yg.Ud("J\\\u001f*:TF\u0017\u0003:S`8@$\u0010", (short) (FB.Xd() ^ 10935), (short) (FB.Xd() ^ 3800))));
                try {
                    method2.setAccessible(true);
                    boolean zBooleanValue = ((Boolean) method2.invoke(keyStore, objArr3)).booleanValue();
                    if (zBooleanValue) {
                        PrivateKey privateKey = getPrivateKey(keyStore);
                        PublicKey publicKey = getPublicKey(keyStore);
                        if (privateKey == null || publicKey == null) {
                            Object[] objArr4 = {EO.Od("v'\u0014l `X%l\u0018\u0004", (short) (C1607wl.Xd() ^ 8590))};
                            Method method3 = Class.forName(C1561oA.Qd("yo\u0004m9}nk|xnx|0LexQqkm_", (short) (FB.Xd() ^ 11203))).getMethod(C1561oA.od("ZZ`XfV5]b_e", (short) (Od.Xd() ^ (-32126))), Class.forName(C1593ug.zd("H@VB\u0010OESM\u0015;]\\TZT", (short) (C1499aX.Xd() ^ (-27576)), (short) (C1499aX.Xd() ^ (-3547)))));
                            try {
                                method3.setAccessible(true);
                                method3.invoke(keyStore, objArr4);
                                zBooleanValue = false;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                    }
                    if (!zBooleanValue) {
                        generateKeyPair(context);
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
        return keyStore;
    }

    private SharedPreferences getPreferences(Application application) {
        return application.getSharedPreferences("io.cobrowse", 0);
    }

    private synchronized PrivateKey getPrivateKey(KeyStore keyStore) throws Exception {
        short sXd = (short) (Od.Xd() ^ (-6432));
        int[] iArr = new int["\")h\u001f, 1/85(".length()];
        QB qb = new QB("\")h\u001f, 1/85(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2), null};
        Method method = Class.forName(Wg.Zd("\u0002\u0001:k^(@\u0005=>[-V?d#}}#D\u000e'", (short) (C1580rY.Xd() ^ (-8290)), (short) (C1580rY.Xd() ^ (-14418)))).getMethod(Wg.vd("@?O'BW", (short) (FB.Xd() ^ 20628)), Class.forName(C1561oA.Xd("\n\u0002\u0018\u0004Q\u0011\u0007\u0015\u000fV|\u001f\u001e\u0016\u001c\u0016", (short) (C1499aX.Xd() ^ (-14413)))), char[].class);
        try {
            method.setAccessible(true);
            Key key = (Key) method.invoke(keyStore, objArr);
            if (!(key instanceof PrivateKey)) {
                return null;
            }
            return (PrivateKey) key;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private synchronized PublicKey getPublicKey(KeyStore keyStore) throws Exception {
        String strKd = Qg.kd("!&c\u0018#\u0015$ '\"\u0013", (short) (ZN.Xd() ^ 30795), (short) (ZN.Xd() ^ 8888));
        short sXd = (short) (C1499aX.Xd() ^ (-23060));
        short sXd2 = (short) (C1499aX.Xd() ^ (-24898));
        int[] iArr = new int["\u0011\u0007\u001b\u0005P\u0015\u0006\u0003\u0014\u0010\u0006\u0010\u0014Gc|\u0010h\t\u0003\u0005v".length()];
        QB qb = new QB("\u0011\u0007\u001b\u0005P\u0015\u0006\u0003\u0014\u0010\u0006\u0010\u0014Gc|\u0010h\t\u0003\u0005v");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr = {strKd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("sp~Lu\u0002\u0003vz|ur\r|", (short) (FB.Xd() ^ 1152)), Class.forName(C1561oA.ud("@6J4\u007f=1=5z\u001f?<26.", (short) (C1633zX.Xd() ^ (-14136)))));
        try {
            method.setAccessible(true);
            Certificate certificate = (Certificate) method.invoke(keyStore, objArr);
            if (certificate == null) {
                return null;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Yd("RJ`L\u001a`SRec[gm#Y\\jm(>aorhfjedxj", (short) (C1633zX.Xd() ^ (-30859)))).getMethod(Xg.qd("NM]:`NYWR;Vk", (short) (C1580rY.Xd() ^ (-2667)), (short) (C1580rY.Xd() ^ (-22703))), new Class[0]);
            try {
                method2.setAccessible(true);
                return (PublicKey) method2.invoke(certificate, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static SecureStorage instance() {
        if (instance == null) {
            instance = new SecureStorage();
        }
        return instance;
    }

    synchronized String getValue(Application application, String str) {
        String string = getPreferences(application).getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return decrypt(application, string);
        } catch (Exception unused) {
            return null;
        }
    }

    synchronized boolean setValue(Application application, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        try {
            String strEncrypt = encrypt(application, str2);
            editorEdit = getPreferences(application).edit();
            editorEdit.putString(str, strEncrypt);
        } catch (Exception unused) {
            return false;
        }
        return editorEdit.commit();
    }
}
