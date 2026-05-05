package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MasterKeys {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final int KEY_SIZE = 256;
    static final String MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    public static final KeyGenParameterSpec AES256_GCM_SPEC = createAES256GCMKeyGenParameterSpec("_androidx_security_master_key_");
    private static final Object sLock = new Object();

    private MasterKeys() {
    }

    private static KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(String str) throws Throwable {
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 3);
        String[] strArr = {C1561oA.Xd("\u001f\u001c'", (short) (C1580rY.Xd() ^ (-25835)))};
        short sXd = (short) (Od.Xd() ^ (-4569));
        int[] iArr = new int["x\u0005}\u000b\u0003{yB\u0003st\u0006}s\u0002\u0006U\u0012\u000f\"\u0017\u0017\u0015\u0017\u0005Ll\u0006\u0015a\u0003\u000b\b\u0018,\u001a!\u0018*\u001a\"\u0002\"\u0016\u000fNo\"13..6".length()];
        QB qb = new QB("x\u0005}\u000b\u0003{yB\u0003st\u0006}s\u0002\u0006U\u0012\u000f\"\u0017\u0017\u0015\u0017\u0005Ll\u0006\u0015a\u0003\u000b\b\u0018,\u001a!\u0018*\u001a\"\u0002\"\u0016\u000fNo\"13..6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strArr};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u0001q\u007fLuwjqRsggt", (short) (C1499aX.Xd() ^ (-20468)), (short) (C1499aX.Xd() ^ (-15509))), String[].class);
        try {
            method.setAccessible(true);
            KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr);
            String[] strArr2 = new String[1];
            short sXd2 = (short) (Od.Xd() ^ (-3652));
            short sXd3 = (short) (Od.Xd() ^ (-27343));
            int[] iArr2 = new int["1Q1ACBFJB".length()];
            QB qb2 = new QB("1Q1ACBFJB");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                i3++;
            }
            strArr2[0] = new String(iArr2, 0, i3);
            Class<?> cls = Class.forName(C1561oA.ud("gshuqjd-qb_plblp$`Ylee_aS\u001b7Pc0MU6FVDOFTDP0L@=|\u001aL?A88D", (short) (OY.Xd() ^ 18354)));
            Class<?>[] clsArr = {String[].class};
            Object[] objArr2 = {strArr2};
            short sXd4 = (short) (OY.Xd() ^ 14079);
            int[] iArr3 = new int["\bx\u0007V~r\u0001\u0007\r\u0010\u0004\t\u0007gwyhlphs".length()];
            QB qb3 = new QB("\bx\u0007V~r\u0001\u0007\r\u0010\u0004\t\u0007gwyhlphs");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr2);
                Object[] objArr3 = {256};
                Method method3 = Class.forName(C1561oA.Yd("=KBQOJF\u0011WJI\\ZR^d\u001aXShceaeY#A\\q@_iL^p`mfvhvXvlk-L\u0001uyrt\u0003", (short) (C1607wl.Xd() ^ 29547))).getMethod(Xg.qd("\u007fr\u0003Zu\u000be|\u000fz", (short) (C1633zX.Xd() ^ (-14955)), (short) (C1633zX.Xd() ^ (-5663))), Integer.TYPE);
                try {
                    method3.setAccessible(true);
                    KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr3);
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(Jg.Wd("\u0015\u001365FaY\u0004^Akn\u0001[c\nR\u0001(-{\u001e\u00169Az\b\u0013<*Eo&(fFf\u007f\f`\u0003T\u001e\u0004\u00178S(0$I; ", (short) (FB.Xd() ^ 1257), (short) (FB.Xd() ^ 25910))).getMethod(ZO.xd("}\u001cD$N", (short) (FB.Xd() ^ 6813), (short) (FB.Xd() ^ 8231)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        return (KeyGenParameterSpec) method4.invoke(builder4, objArr4);
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
    }

    public static String getOrCreate(KeyGenParameterSpec keyGenParameterSpec) throws Throwable {
        validate(keyGenParameterSpec);
        synchronized (sLock) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("7Y\f_]\u001a\u0006|7\u0002YS\u0018\u001eO\ny\u0014%\u0011/#\n\u001eb\u0010o\u001ax\u0001\u0011#1\u000e*\u0006Mw2N]-\u0006\u0007\n", (short) (Od.Xd() ^ (-20875)), (short) (Od.Xd() ^ (-20743)))).getMethod(Ig.wd("\u0017e\u0003\u0006o>\b\u0002%lY;7B\u00026", (short) (C1607wl.Xd() ^ 18271)), new Class[0]);
            try {
                method.setAccessible(true);
                if (!keyExists((String) method.invoke(keyGenParameterSpec, objArr))) {
                    generateKey(keyGenParameterSpec);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(EO.Od("s[_\u000e%t\u000ep}MO=\u0006\u0005aBT\u0002E3\u0005;\n\u0013}\u0004\u0001P\\yuZ&\u0017Ak'=I*5?0\rz", (short) (C1607wl.Xd() ^ 10276))).getMethod(C1561oA.Qd("%\"0\u0006\u001f2++%'\u0019s\u001e\u001a\u0011\"", (short) (C1607wl.Xd() ^ 11715)), new Class[0]);
        try {
            method2.setAccessible(true);
            return (String) method2.invoke(keyGenParameterSpec, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void validate(KeyGenParameterSpec keyGenParameterSpec) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("JXO^\\WS\u001edWVig_kq'e`uprnrf0Ni~MlvYk}mzs\u0004u\u0004e\u0004yx", (short) (ZN.Xd() ^ 5643))).getMethod(Xg.qd("JIY1La<SeQ", (short) (C1499aX.Xd() ^ (-7933)), (short) (C1499aX.Xd() ^ (-16417))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(keyGenParameterSpec, objArr)).intValue() != 256) {
                short sXd = (short) (FB.Xd() ^ 17350);
                int[] iArr = new int["Jx3FJ\u0014Z\u000f\u0005CU\u001a\u001c\f\u0015\u001e\u0019''\tP\u0013\u0011!\u007f>\f\u0018zyVb\u0014wlW".length()];
                QB qb = new QB("Jx3FJ\u0014Z\u000f\u0005CU\u001a\u001c\f\u0015\u001e\u0019''\tP\u0013\u0011!\u007f>\f\u0018zyVb\u0014wlW");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                StringBuilder sb = new StringBuilder(new String(iArr, 0, i2));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Qd("3?4A=60x=.+<8.8<o,%811+-\u001ff\u0003\u001c/{\u0019!\u0002\u0012\"\u0010\u001b\u0012 \u0010\u001c{\u0018\f\t", (short) (C1580rY.Xd() ^ (-23515)))).getMethod(C1593ug.zd("%$4\f'<\u0017.@,", (short) (C1499aX.Xd() ^ (-7824)), (short) (C1499aX.Xd() ^ (-31101))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    throw new IllegalArgumentException(sb.append(((Integer) method2.invoke(keyGenParameterSpec, objArr2)).intValue()).append(C1561oA.od("g)/97", (short) (FB.Xd() ^ 21655))).toString());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(Jg.Wd("nWV!\u0015KOU\u0012\u0005GY\n\u0002QV\u0003|~na\u001f\"dL\u0015v\u0011Y'\u000e\u0013l:T~\u0003;n !\u0003cX\u000f", (short) (C1607wl.Xd() ^ 2817), (short) (C1607wl.Xd() ^ 17480))).getMethod(ZO.xd("s%a\u0005\u001a\u007fyw=C\u001ae(", (short) (C1633zX.Xd() ^ (-7842)), (short) (C1633zX.Xd() ^ (-24537))), new Class[0]);
            try {
                method3.setAccessible(true);
                if (!Arrays.equals((String[]) method3.invoke(keyGenParameterSpec, objArr3), new String[]{C1626yg.Ud("I+\u0018", (short) (C1499aX.Xd() ^ (-12159)), (short) (C1499aX.Xd() ^ (-20585)))})) {
                    StringBuilder sb2 = new StringBuilder(ZO.xd("\u0005W5S\u001a5$kEi\u0015@\u0015x9Bwv6\u0018X\u001a-c\u001bF\u0005\u007f~\nU\u000f4", (short) (C1499aX.Xd() ^ (-24507)), (short) (C1499aX.Xd() ^ (-25480))));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-12963));
                    short sXd3 = (short) (C1580rY.Xd() ^ (-4308));
                    int[] iArr2 = new int["M<De\u0018\u0016-bJ&m\u0007xrLFIE[1;tty/d\u00181}\u000f\u0007\\R\\LD\u000558U<h\u000b\bb".length()];
                    QB qb2 = new QB("M<De\u0018\u0016-bJ&m\u0007xrLFIE[1;tty/d\u00181}\u000f\u0007\\R\\LD\u000558U<h\u000b\bb");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(Ig.wd("\u0001-.[\u0015[{\u000b>,'\u0006i", (short) (C1499aX.Xd() ^ (-13540))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        throw new IllegalArgumentException(sb2.append(Arrays.toString((String[]) method4.invoke(keyGenParameterSpec, objArr4))).toString());
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                Class<?> cls = Class.forName(Ig.wd("4lRB]{Z\u0015\u000f!\u001dU~w/Z5p#\u001f]\u000b0;.3ncuq4aW\u000fEz\u001f35<E\u0007L_c", (short) (ZN.Xd() ^ 5515)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr5 = new Object[0];
                short sXd4 = (short) (ZN.Xd() ^ 2368);
                int[] iArr3 = new int["'U\u0015\u000fuO\u001fxK?I".length()];
                QB qb3 = new QB("'U\u0015\u000fuO\u001fxK?I");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                    i4++;
                }
                Method method5 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method5.setAccessible(true);
                    if (((Integer) method5.invoke(keyGenParameterSpec, objArr5)).intValue() != 3) {
                        short sXd5 = (short) (OY.Xd() ^ 4628);
                        int[] iArr4 = new int["\u0001\u0007\u0010{\b\u0006\u0002>\u0010\u0016\u0014\u0013\u0013\u0018\u000b\u001aG\u0016\u0019\u000f\u0011XM&\u0011\u001f&R\u0004\n\b\u0007\u0007\f~\u001a\u0001\u000b\u0001\u0011\u0019\u0011\u0016b@d\u0016\u001c\u001a\u0019\u0019\u001e\u0011,\u0012\u0014\u0013#+#(t=FLx".length()];
                        QB qb4 = new QB("\u0001\u0007\u0010{\b\u0006\u0002>\u0010\u0016\u0014\u0013\u0013\u0018\u000b\u001aG\u0016\u0019\u000f\u0011XM&\u0011\u001f&R\u0004\n\b\u0007\u0007\f~\u001a\u0001\u000b\u0001\u0011\u0019\u0011\u0016b@d\u0016\u001c\u001a\u0019\u0019\u001e\u0011,\u0012\u0014\u0013#+#(t=FLx");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd5 + sXd5) + sXd5) + i5));
                            i5++;
                        }
                        StringBuilder sb3 = new StringBuilder(new String(iArr4, 0, i5));
                        Class<?> cls2 = Class.forName(Xg.qd(")7.=;62|C65HF>JP\u0006D?TOQMQE\u000f-H],KU8J\\LYRbTbDbXW", (short) (FB.Xd() ^ 6839), (short) (FB.Xd() ^ 22150)));
                        Class<?>[] clsArr2 = new Class[0];
                        Object[] objArr6 = new Object[0];
                        short sXd6 = (short) (C1633zX.Xd() ^ (-14583));
                        short sXd7 = (short) (C1633zX.Xd() ^ (-1590));
                        int[] iArr5 = new int["d'h\rl.^&d\u001b[".length()];
                        QB qb5 = new QB("d'h\rl.^&d\u001b[");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((i6 * sXd7) ^ sXd6));
                            i6++;
                        }
                        Method method6 = cls2.getMethod(new String(iArr5, 0, i6), clsArr2);
                        try {
                            method6.setAccessible(true);
                            throw new IllegalArgumentException(sb3.append(((Integer) method6.invoke(keyGenParameterSpec, objArr6)).intValue()).toString());
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    }
                    Object[] objArr7 = new Object[0];
                    Method method7 = Class.forName(C1561oA.Qd("0<1>:3-u:+(95+59l)\"5..(*\u001cc\u007f\u0019,x\u0016\u001e~\u000f\u001f\r\u0018\u000f\u001d\r\u0019x\u0015\t\u0006", (short) (C1580rY.Xd() ^ (-27885)))).getMethod(C1593ug.zd("a`pBlbrzrwmttWimntzt\u0002", (short) (Od.Xd() ^ (-12330)), (short) (Od.Xd() ^ (-8834))), new Class[0]);
                    try {
                        method7.setAccessible(true);
                        String[] strArr = (String[]) method7.invoke(keyGenParameterSpec, objArr7);
                        String[] strArr2 = new String[1];
                        short sXd8 = (short) (C1580rY.Xd() ^ (-27322));
                        int[] iArr6 = new int["\u0002\"\u0002\u0012\u0014\u0013\u0017\u001b\u0013".length()];
                        QB qb6 = new QB("\u0002\"\u0002\u0012\u0014\u0013\u0017\u001b\u0013");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK(sXd8 + sXd8 + i7 + xuXd6.CK(iKK6));
                            i7++;
                        }
                        strArr2[0] = new String(iArr6, 0, i7);
                        if (!Arrays.equals(strArr, strArr2)) {
                            StringBuilder sb4 = new StringBuilder(hg.Vd("\r\u0011\u0018\u0002\f\b\u0002<\f{}|\u0001\u0005|4\u0001\u0002uu;.\u0005my~)VvVfhgkog\u001felp\u001b", (short) (FB.Xd() ^ 6384), (short) (FB.Xd() ^ 14665)));
                            Object[] objArr8 = new Object[0];
                            Method method8 = Class.forName(C1561oA.ud("1=2?;4.v;,):6,6:m*#6//)+\u001dd\u0001\u001a-y\u0017\u001f\u007f\u0010 \u000e\u0019\u0010\u001e\u000e\u001ay\u0016\n\u0007", (short) (C1633zX.Xd() ^ (-22532)))).getMethod(C1561oA.yd("EDP\"H>JRFK=D@#15RXZT]", (short) (C1580rY.Xd() ^ (-17201))), new Class[0]);
                            try {
                                method8.setAccessible(true);
                                throw new IllegalArgumentException(sb4.append(Arrays.toString((String[]) method8.invoke(keyGenParameterSpec, objArr8))).toString());
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        }
                        Class<?> cls3 = Class.forName(C1561oA.Kd("*8/><73}D76IG?KQ\u0007E@UPRNRF\u0010.I^-LV9K]MZScUcEcYX", (short) (ZN.Xd() ^ 19146)));
                        Class<?>[] clsArr3 = new Class[0];
                        Object[] objArr9 = new Object[0];
                        short sXd9 = (short) (C1580rY.Xd() ^ (-8492));
                        short sXd10 = (short) (C1580rY.Xd() ^ (-5078));
                        int[] iArr7 = new int["I\u000f<Zw\t\u00126pj\u0017 pM\u0003\r[6\u0007\u0006\t$k_\u000e\u001976".length()];
                        QB qb7 = new QB("I\u000f<Zw\t\u00126pj\u0017 pM\u0003\r[6\u0007\u0006\t$k_\u000e\u001976");
                        int i8 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i8] = xuXd7.fK(((i8 * sXd10) ^ sXd9) + xuXd7.CK(iKK7));
                            i8++;
                        }
                        Method method9 = cls3.getMethod(new String(iArr7, 0, i8), clsArr3);
                        try {
                            method9.setAccessible(true);
                            if (((Boolean) method9.invoke(keyGenParameterSpec, objArr9)).booleanValue()) {
                                Object[] objArr10 = new Object[0];
                                Method method10 = Class.forName(C1561oA.Xd("&4+:83/y@32EC;GM\u0003A<QLNJNB\f*EZ)HR5GYIVO_Q_A_UT", (short) (C1633zX.Xd() ^ (-18250)))).getMethod(Wg.vd("lkwY|oyIrrcaovhcv\u000b|\u0004\bpx\u0005vrt\u0001\u000bV\u0005\u0003\u0007\u001b\r\u0014\u0018}\r\f\r\r\u007f\u0010", (short) (FB.Xd() ^ 11590)), new Class[0]);
                                try {
                                    method10.setAccessible(true);
                                    if (((Integer) method10.invoke(keyGenParameterSpec, objArr10)).intValue() < 1) {
                                        throw new IllegalArgumentException(Qg.kd("XLX\u0012SSGSASGLJz;NL?;CH<52D8=;k4=h66:d7821/12\" Za\u000e+\u001c(u)'\u001a\u0016\u001e#\u0017\u0010\r\u001f\u0013\u0018\u0016|\u0007\u0011\r\u0007\u000b\u0015\u0019b\u0013\u000f|\u000f\u0003\b\u0006izw\u0003\u0001u\u0004/{\u0003\u007f\u007f*km'D5-", (short) (FB.Xd() ^ 30912), (short) (FB.Xd() ^ 12089)));
                                    }
                                } catch (InvocationTargetException e6) {
                                    throw e6.getCause();
                                }
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
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvocationTargetException e11) {
            throw e11.getCause();
        }
    }

    private static void generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE);
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e2) {
            throw new GeneralSecurityException(e2.getMessage(), e2);
        }
    }

    private static boolean keyExists(String str) throws Throwable {
        Object[] objArr = {C1593ug.zd("Gul{ytpXs\tc\u0006\u0002\u0006y", (short) (C1633zX.Xd() ^ (-9434)), (short) (C1633zX.Xd() ^ (-22959)))};
        Method declaredMethod = Class.forName(C1561oA.od("\f\u0002\u0016\u007fK\u0010\u0001}\u000f\u000b\u0001\u000b\u000fB^w\u000bc\u0004}\u007fq", (short) (C1580rY.Xd() ^ (-15683)))).getDeclaredMethod(Wg.Zd("\u0004:X$\t\u0015\u0005HT0\u0002", (short) (FB.Xd() ^ 27496), (short) (FB.Xd() ^ 21957)), Class.forName(C1561oA.Kd(")!7#p0&4.u\u001c>=5;5", (short) (C1633zX.Xd() ^ (-6019)))));
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            Class<?> cls = Class.forName(C1561oA.Xd("6.D0}D76IG?KQ\u0007%@U0RNRF", (short) (C1499aX.Xd() ^ (-14852))));
            Class<?>[] clsArr = {Class.forName(Wg.vd("5-?+|C21HF:FP\u0006 ;T/MIQE\u0001*REE5[WWK;M[K\\UaSe", (short) (C1633zX.Xd() ^ (-32714))))};
            Object[] objArr2 = {null};
            short sXd = (short) (ZN.Xd() ^ 23339);
            short sXd2 = (short) (ZN.Xd() ^ 1404);
            int[] iArr = new int["HJ;=".length()];
            QB qb = new QB("HJ;=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(keyStore, objArr2);
                Object[] objArr3 = {str};
                Method method2 = Class.forName(hg.Vd("cYmW#gXUfbXbf\u001a6Ob;[UWI", (short) (C1633zX.Xd() ^ (-32702)), (short) (C1633zX.Xd() ^ (-30104)))).getMethod(C1561oA.yd("ALNS;BJN\u0017AA8E", (short) (FB.Xd() ^ 4206)), Class.forName(C1561oA.ud("[QeO\u001bXLXP\u0016:ZWMQI", (short) (C1580rY.Xd() ^ (-8170)))));
                try {
                    method2.setAccessible(true);
                    return ((Boolean) method2.invoke(keyStore, objArr3)).booleanValue();
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
