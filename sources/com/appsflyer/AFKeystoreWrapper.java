package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
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

/* JADX INFO: loaded from: classes.dex */
public class AFKeystoreWrapper {
    public KeyStore getMonetizationNetwork;
    private Context getRevenue;
    public final Object getMediationNetwork = new Object();
    public String getCurrencyIso4217Code = "";
    public int AFAdRevenueData = 0;

    public AFKeystoreWrapper(Context context) {
        this.getRevenue = context;
        short sXd = (short) (OY.Xd() ^ 15523);
        int[] iArr = new int["\u0015;7C1*64G>D>o\u001c7L\u000f1-1\u001dfg".length()];
        QB qb = new QB("\u0015;7C1*64G>D>o\u001c7L\u000f1-1\u001dfg");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        AFLogger.afInfoLog(new String(iArr, 0, i2));
        String strKd = Qg.kd("\\\t}\u000b\u0007\u007fy_x\fd\u0005~\u0001r", (short) (ZN.Xd() ^ 3700), (short) (ZN.Xd() ^ 29335));
        short sXd2 = (short) (Od.Xd() ^ (-19725));
        short sXd3 = (short) (Od.Xd() ^ (-16948));
        int[] iArr2 = new int["\n\u007f\u0014}I\u000e~{\r\t~\t\r@\\u\ta\u0002{}o".length()];
        QB qb2 = new QB("\n\u007f\u0014}I\u000e~{\r\t~\t\r@\\u\ta\u0002{}o");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
            i3++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.ud("XNbL\u0018UIUM\u00137WTJNF", (short) (C1499aX.Xd() ^ (-11237))));
            Object[] objArr = {strKd};
            short sXd4 = (short) (Od.Xd() ^ (-2336));
            int[] iArr3 = new int["c`rFfjnZrfk".length()];
            QB qb3 = new QB("c`rFfjnZrfk");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                i4++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                this.getMonetizationNetwork = keyStore;
                Class<?> cls2 = Class.forName(C1561oA.Yd("}u\fwE\f~}\u0011\u000f\u0007\u0013\u0019Nl\b\u001dw\u001a\u0016\u001a\u000e", (short) (OY.Xd() ^ 23387)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(Xg.qd("]UkW%k^]pnfrx.Lg|Wyuym-Vzmqa\u0004\u007f\u0004wcu\bw\u0005}\u000e\u007f\u000e", (short) (Od.Xd() ^ (-17998)), (short) (Od.Xd() ^ (-25882))));
                Object[] objArr2 = {null};
                Method method = cls2.getMethod(Jg.Wd("eg\u0019R", (short) (C1580rY.Xd() ^ (-14724)), (short) (C1580rY.Xd() ^ (-6581))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e4) {
            AFLogger.afErrorLog(ZO.xd("\u000e`X5k9N\u001b\n#\byJ4T?\u0018h9\u0003\u0012:NT\r9=\u0006k)[5 8ET\u007f+!jRsF(t\tW\u001fWKuyc\u00012a", (short) (ZN.Xd() ^ 31280), (short) (ZN.Xd() ^ 24006)), e4);
        }
    }

    private static boolean AFAdRevenueData(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final boolean AFAdRevenueData() {
        boolean z2;
        synchronized (this.getMediationNetwork) {
            KeyStore keyStore = this.getMonetizationNetwork;
            z2 = false;
            if (keyStore != null) {
                try {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1626yg.Ud("Yd8k~BO\u0012('X \u0010\t\u0014h\u0010kF\f!C", (short) (C1633zX.Xd() ^ (-23033)), (short) (C1633zX.Xd() ^ (-17122)))).getMethod(Ig.wd("\u000bg\u0001\u0012\u0003@<", (short) (C1499aX.Xd() ^ (-19038))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Enumeration enumeration = (Enumeration) method.invoke(keyStore, objArr);
                        while (true) {
                            if (!enumeration.hasMoreElements()) {
                                break;
                            }
                            String str = (String) enumeration.nextElement();
                            if (str != null && AFAdRevenueData(str)) {
                                short sXd = (short) (FB.Xd() ^ 27333);
                                int[] iArr = new int["(".length()];
                                QB qb = new QB("(");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                                    i2++;
                                }
                                String[] strArrSplit = str.split(new String(iArr, 0, i2));
                                if (strArrSplit.length == 3) {
                                    AFLogger.afInfoLog(C1561oA.Qd("\u0014<A9.h)f3&8&**.&]}\u0002Z%\u001e1V-\u001e(\u001bQ\u0012\u001c\u0018\u000f e4", (short) (OY.Xd() ^ 16163)).concat(String.valueOf(str)));
                                    z2 = true;
                                    String[] strArrSplit2 = strArrSplit[1].trim().split(C1593ug.zd("\u000f", (short) (C1607wl.Xd() ^ 15683), (short) (C1607wl.Xd() ^ 3137)));
                                    String[] strArrSplit3 = strArrSplit[2].trim().split(C1561oA.od("g", (short) (C1499aX.Xd() ^ (-30784))));
                                    if (strArrSplit2.length == 2 && strArrSplit3.length == 2) {
                                        this.getCurrencyIso4217Code = strArrSplit2[1].trim();
                                        this.AFAdRevenueData = Integer.parseInt(strArrSplit3[1].trim());
                                    }
                                }
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder(C1561oA.Kd("|*1)\"-f5a/-8:f\u0013.C\u001e@<@4o\u0012><5H;J\u0012x", (short) (C1499aX.Xd() ^ (-4962)))).append(th.getClass().getName()).toString(), th);
                }
            }
        }
        return z2;
    }

    public final String getCurrencyIso4217Code() {
        String str;
        synchronized (this.getMediationNetwork) {
            str = this.getCurrencyIso4217Code;
        }
        return str;
    }

    public final String getMonetizationNetwork() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.getMediationNetwork) {
            sb.append(this.getCurrencyIso4217Code).append(",KSAppsFlyerRICounter=");
            sb.append(this.AFAdRevenueData);
        }
        return sb.toString();
    }

    public final int getRevenue() {
        int i2;
        synchronized (this.getMediationNetwork) {
            i2 = this.AFAdRevenueData;
        }
        return i2;
    }

    public final void getRevenue(String str) {
        short sXd = (short) (Od.Xd() ^ (-30508));
        short sXd2 = (short) (Od.Xd() ^ (-29499));
        int[] iArr = new int["\tYh\u00054Jk\u0005kJ)\u0014+Z#\u001b3g+#1\\}U5\\z\u000fA4:".length()];
        QB qb = new QB("\tYh\u00054Jk\u0005kJ)\u0014+Z#\u001b3g+#1\\}U5\\z\u000fA4:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        AFLogger.afInfoLog(new String(iArr, 0, i2).concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.getMediationNetwork) {
                KeyStore keyStore = this.getMonetizationNetwork;
                Object[] objArr = {str};
                Method method = Class.forName(C1561oA.Xd("ZRhT\"h[Zmkcou+IdyTvrvj", (short) (OY.Xd() ^ 32361))).getMethod(Qg.kd("\"-+0\u001c#'+w\"\u001e\u0015&", (short) (OY.Xd() ^ 30990), (short) (OY.Xd() ^ 12243)), Class.forName(Wg.vd(")\u001f3\u001dp.\".\u001ec\b(-#'\u001f", (short) (Od.Xd() ^ (-15807)))));
                try {
                    method.setAccessible(true);
                    if (((Boolean) method.invoke(keyStore, objArr)).booleanValue()) {
                        AFLogger.afInfoLog(Ig.wd("tyF\u0018\u0001`@x@\u0001\u0001cNt\u0010~CI x\u0001<", (short) (C1607wl.Xd() ^ 14002)).concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 3);
                        X500Principal x500Principal = new X500Principal(hg.Vd("KUCFrgtpicQAG'\u001aH58feg9^jUa", (short) (ZN.Xd() ^ 30942), (short) (ZN.Xd() ^ 17461)));
                        Class<?> cls = Class.forName(C1561oA.ud("x\u0005y\u0007\u0003{u>\u0003sp\u0002}s}\u00025qj}vvprd,HatA^fGWgU`WeUaA]QN\u000e+]PRIIU", (short) (C1633zX.Xd() ^ (-3005))));
                        Class<?>[] clsArr = {Class.forName(C1561oA.yd("E;S=W\fTE6GG=KO\u00079`^U\u001ag#! \u0011:\u001a\u0014\u00176[Q)\u001d&, *", (short) (OY.Xd() ^ 20673)))};
                        Object[] objArr2 = {x500Principal};
                        short sXd3 = (short) (Od.Xd() ^ (-8440));
                        int[] iArr2 = new int["REU%HVYOMQLK_Q@cQZVUg".length()];
                        QB qb2 = new QB("REU%HVYOMQLK_Q@cQZVUg");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                            i3++;
                        }
                        Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            method2.setAccessible(true);
                            KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method2.invoke(builder, objArr2);
                            Object[] objArr3 = {BigInteger.ONE};
                            Method method3 = Class.forName(Xg.qd("0>5DB=9\u0004J=<OMEQW\rKF[VXTXL\u00164Od3R\\?QcS`Yi[iKi_^ ?shlegu", (short) (C1499aX.Xd() ^ (-32206)), (short) (C1499aX.Xd() ^ (-16748)))).getMethod(ZO.xd("fAjnp.gBla#x\u0017\b}\r,\u00142c\t60X\u000ew", (short) (C1499aX.Xd() ^ (-32340)), (short) (C1499aX.Xd() ^ (-29817))), Class.forName(Jg.Wd("aD$&>-{VeYxw@QR_+]fJ", (short) (FB.Xd() ^ 1814), (short) (FB.Xd() ^ 4384))));
                            try {
                                method3.setAccessible(true);
                                KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method3.invoke(builder2, objArr3);
                                Object[] objArr4 = {calendar.getTime()};
                                Method method4 = Class.forName(C1626yg.Ud("&\\n?\n\u007fx<Nd\u0019(\u000f%h.\u0012r=`/TK\\|\u0007)\u0003\u001b_*s\u0007`\u001ey>y4=n\u001b\u001a?W8vS15|tH", (short) (C1633zX.Xd() ^ (-25968)), (short) (C1633zX.Xd() ^ (-27454)))).getMethod(EO.Od(".jGzd\u001eHmI\\PtRA6yKzf3zBc", (short) (C1580rY.Xd() ^ (-28275))), Class.forName(Ig.wd("s\u0018[jgqP&m?W\u0013v]", (short) (FB.Xd() ^ 5537))));
                                try {
                                    method4.setAccessible(true);
                                    KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method4.invoke(builder3, objArr4);
                                    Date time = calendar2.getTime();
                                    short sXd4 = (short) (OY.Xd() ^ 31654);
                                    int[] iArr3 = new int[">J?LHA;\u0004H96GC9CGz70C<<68*q\u000e':\u0007$,\r\u001d-\u001b&\u001d+\u001b'\u0007#\u0017\u0014Sp#\u0016\u0018\u000f\u000f\u001b".length()];
                                    QB qb3 = new QB(">J?LHA;\u0004H96GC9CGz70C<<68*q\u000e':\u0007$,\r\u001d-\u001b&\u001d+\u001b'\u0007#\u0017\u0014Sp#\u0016\u0018\u000f\u000f\u001b");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                                        i4++;
                                    }
                                    Object[] objArr5 = {time};
                                    Method method5 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.od("\r}\fYz\u0007\b{wyro\u0002qYy}Imzjv", (short) (ZN.Xd() ^ 25612)), Class.forName(C1593ug.zd(")!7#p99/3u\r+?1", (short) (Od.Xd() ^ (-21811)), (short) (Od.Xd() ^ (-19825)))));
                                    try {
                                        method5.setAccessible(true);
                                        KeyGenParameterSpec.Builder builder5 = (KeyGenParameterSpec.Builder) method5.invoke(builder4, objArr5);
                                        Object[] objArr6 = new Object[0];
                                        Method method6 = Class.forName(C1561oA.Kd("w\u0006|\f\n\u0005\u0001K\u0012\u0005\u0004\u0017\u0015\r\u0019\u001fT\u0013\u000e#\u001e \u001c \u0014]{\u0017,z\u001a$\u0007\u0019+\u001b(!1#1\u00131'&g\u0007;04-/=", (short) (Od.Xd() ^ (-28246)))).getMethod(Wg.Zd("Rc4\u000bo", (short) (Od.Xd() ^ (-22914)), (short) (Od.Xd() ^ (-5495))), new Class[0]);
                                        try {
                                            method6.setAccessible(true);
                                            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) method6.invoke(builder5, objArr6);
                                            String strXd = C1561oA.Xd("@B1", (short) (C1607wl.Xd() ^ 28799));
                                            short sXd5 = (short) (C1580rY.Xd() ^ (-28470));
                                            int[] iArr4 = new int["\u001eLCRHC?'J_:\\PTH".length()];
                                            QB qb4 = new QB("\u001eLCRHC?'J_:\\PTH");
                                            int i5 = 0;
                                            while (qb4.YK()) {
                                                int iKK4 = qb4.KK();
                                                Xu xuXd4 = Xu.Xd(iKK4);
                                                iArr4[i5] = xuXd4.fK((sXd5 ^ i5) + xuXd4.CK(iKK4));
                                                i5++;
                                            }
                                            String str2 = new String(iArr4, 0, i5);
                                            Class<?> cls2 = Class.forName(Qg.kd(".$8\"m2# 1-#-1d\u0001\u001a-\u0003\u0013\u001a\"u\u0013\u001b\u0011\u001d\u000b\u001d\u0017\u0019", (short) (C1499aX.Xd() ^ (-7475)), (short) (C1499aX.Xd() ^ (-31921))));
                                            Class<?>[] clsArr2 = {Class.forName(hg.Vd("4*>(s1%1)n\u001330&*\"", (short) (C1580rY.Xd() ^ (-2987)), (short) (C1580rY.Xd() ^ (-27227)))), Class.forName(C1561oA.ud("UK_I\u0015RFRJ\u00104TQGKC", (short) (Od.Xd() ^ (-6683))))};
                                            Object[] objArr7 = {strXd, str2};
                                            short sXd6 = (short) (FB.Xd() ^ QuickTimeMetadataDirectory.TAG_CONTENT_IDENTIFIER);
                                            int[] iArr5 = new int["liwKoss_k_`".length()];
                                            QB qb5 = new QB("liwKoss_k_`");
                                            int i6 = 0;
                                            while (qb5.YK()) {
                                                int iKK5 = qb5.KK();
                                                Xu xuXd5 = Xu.Xd(iKK5);
                                                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd6 ^ i6));
                                                i6++;
                                            }
                                            Method declaredMethod = cls2.getDeclaredMethod(new String(iArr5, 0, i6), clsArr2);
                                            try {
                                                declaredMethod.setAccessible(true);
                                                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr7);
                                                Object[] objArr8 = {keyGenParameterSpec};
                                                Method method7 = Class.forName(C1561oA.Yd("tl\u0003n<\u0003ut\b\u0006}\n\u0010Ec~\u0014k}\u0007\u0011f\u0006\u0010\b\u0016\u0006\u001a\u0016\u001a", (short) (C1633zX.Xd() ^ (-19024)))).getMethod(Jg.Wd("\u000e\u0004X!k!\u0006@.V", (short) (FB.Xd() ^ 30173), (short) (FB.Xd() ^ 5260)), Class.forName(Xg.qd("A9O;\tOBATRJV\\\u0012XVLK\u0017+WS\\`XdY_CUgWd]m_mOmcb", (short) (C1633zX.Xd() ^ (-10228)), (short) (C1633zX.Xd() ^ (-2989)))));
                                                try {
                                                    method7.setAccessible(true);
                                                    method7.invoke(keyPairGenerator, objArr8);
                                                    Object[] objArr9 = new Object[0];
                                                    Method method8 = Class.forName(ZO.xd("3E|\u0006\rLfmz\u000fzGd?\u0003j\u007f\rB[MJH!\u0010]?\u0004kGW-6", (short) (C1633zX.Xd() ^ (-29360)), (short) (C1633zX.Xd() ^ (-23296)))).getMethod(C1626yg.Ud("U\u0011[r~<\u0002Ko\u0006+\u0011\u001cV\u001f", (short) (C1633zX.Xd() ^ (-7974)), (short) (C1633zX.Xd() ^ (-18074))), new Class[0]);
                                                    try {
                                                        method8.setAccessible(true);
                                                        method8.invoke(keyPairGenerator, objArr9);
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
                            } catch (InvocationTargetException e8) {
                                throw e8.getCause();
                            }
                        } catch (InvocationTargetException e9) {
                            throw e9.getCause();
                        }
                    }
                } catch (InvocationTargetException e10) {
                    throw e10.getCause();
                }
            }
        } catch (Throwable th) {
            short sXd7 = (short) (OY.Xd() ^ 8440);
            int[] iArr6 = new int["\u0004^y\u001drT\u001f\u0007U\u0014".length()];
            QB qb6 = new QB("\u0004^y\u001drT\u001f\u0007U\u0014");
            int i7 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i7] = xuXd6.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i7)) + xuXd6.CK(iKK6));
                i7++;
            }
            AFLogger.afErrorLog(new StringBuilder(new String(iArr6, 0, i7)).append(th.getMessage()).append(C1561oA.Qd("9\bzy\u000b\u0007\u0006wu", (short) (ZN.Xd() ^ 28042))).toString(), th);
        }
    }
}
