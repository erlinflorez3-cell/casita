package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.Executor;
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
public final class AFc1oSDK {
    private static String getRevenue = "372";
    private PackageInfo areAllFieldsValid;
    private final Executor component3;
    public final AFc1hSDK getCurrencyIso4217Code;
    public final AFc1qSDK getMediationNetwork;
    public final AFc1eSDK getMonetizationNetwork;
    private Bundle component2 = null;
    public String AFAdRevenueData = "";

    public AFc1oSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK, AFc1eSDK aFc1eSDK, Executor executor) {
        this.getCurrencyIso4217Code = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getMonetizationNetwork = aFc1eSDK;
        this.component3 = executor;
    }

    public static String component4() {
        return new StringBuilder("version: 6.17.6 (build ").append(getRevenue).append(")").toString();
    }

    public static String getCurrencyIso4217Code() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getMediationNetwork() {
        return UUID.randomUUID().toString();
    }

    public static String getMonetizationNetwork() {
        return "6.17.6";
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final String AFAdRevenueData(Context context) {
        try {
            return new AFb1mSDK(context, this.component3).getMediationNetwork();
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
            return null;
        }
    }

    public final String areAllFieldsValid() {
        AFh1rSDK aFh1rSDK = this.getMonetizationNetwork.component3;
        AFb1jSDK aFb1jSDK = aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getCurrencyIso4217Code, aFh1rSDK.getRevenue) : null;
        if (aFb1jSDK != null) {
            return aFb1jSDK.getRevenue;
        }
        return null;
    }

    public final boolean component2() {
        return !this.getMonetizationNetwork.AFAdRevenueData();
    }

    public final String component3() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getCurrencyIso4217Code("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final String getCurrencyIso4217Code(String str) {
        Object obj;
        try {
            if (this.component2 == null) {
                Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Qd("htivrke.bmkp`hm&:echXje", (short) (OY.Xd() ^ 11016))).getMethod(C1593ug.zd("\u0006\u0005\u0015q\u0004\u0007\u0010\u0007\u000e\ru\u000b\u0019\r\u0014\u0013!", (short) (FB.Xd() ^ 17645), (short) (FB.Xd() ^ 19857)), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    short sXd = (short) (C1580rY.Xd() ^ (-28777));
                    int[] iArr = new int["`lanjc]&ZechX`e\u001e2][`Pb]".length()];
                    QB qb = new QB("`lanjc]&ZechX`e\u001e2][`Pb]");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd2 = (short) (C1580rY.Xd() ^ (-2608));
                    int[] iArr2 = new int["CBR/ADMDKJ4HUN".length()];
                    QB qb2 = new QB("CBR/ADMDKJ4HUN");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                        i3++;
                    }
                    Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method2.setAccessible(true);
                        String str2 = (String) method2.invoke(context2, objArr2);
                        short sXd3 = (short) (C1633zX.Xd() ^ (-19240));
                        short sXd4 = (short) (C1633zX.Xd() ^ (-3434));
                        int[] iArr3 = new int["o\u0013<Dm[om\u000fTG\"DA\u007f/\u001dsh>Aw\u0014Cuk\tp.\u0017P\u0007\u0002".length()];
                        QB qb3 = new QB("o\u0013<Dm[om\u000fTG\"DA\u007f/\u001dsh>Aw\u0014Cuk\tp.\u0017P\u0007\u0002");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                            i4++;
                        }
                        Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(C1561oA.Xd("\t\u0001\u0017\u0003P\u0010\u0006\u0014\u000eU{\u001e\u001d\u0015\u001b\u0015", (short) (Od.Xd() ^ (-19448))));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr3 = {str2, 128};
                        Method method3 = cls2.getMethod(Wg.vd("!\u001e,w&% \u001c\u0015\u0012$\u0018\u001d\u001bt\u0019\u0010\u0018", (short) (C1633zX.Xd() ^ (-13973))), clsArr2);
                        try {
                            method3.setAccessible(true);
                            this.component2 = ((PackageItemInfo) ((ApplicationInfo) method3.invoke(packageManager, objArr3))).metaData;
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
            Bundle bundle = this.component2;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder(Qg.kd(" KPF=wEEIs?A24n;.:40.;;e2)7#%!3\u001f]", (short) (OY.Xd() ^ 3158), (short) (OY.Xd() ^ 14761))).append(th.getMessage()).toString(), th);
            return null;
        }
    }

    public final boolean getMediationNetwork(String str) {
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            return Boolean.parseBoolean(currencyIso4217Code);
        }
        return false;
    }

    public final boolean getMonetizationNetwork(Context context) throws Throwable {
        Object obj;
        try {
            Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("v\u0003w\u0005\u0001ys<p{y~nv{4Hsqvfxs", (short) (Od.Xd() ^ (-27783)), (short) (Od.Xd() ^ (-3791)))).getMethod(C1561oA.ud("&#1\f\u001c\u001d$\u0019\u001e\u001b\u0002\u0015!\u0013\u0018\u0015!", (short) (ZN.Xd() ^ 4498)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context2, objArr);
                short sXd = (short) (C1580rY.Xd() ^ (-21085));
                int[] iArr = new int["1?2AC>6\u0001;HDKAKN\t#PLSI]V".length()];
                QB qb = new QB("1?2AC>6\u0001;HDKAKN\t#PLSI]V");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Object[] objArr2 = new Object[0];
                Method method2 = cls.getMethod(C1561oA.Yd("\u0014\u0013#\u007f\u0012\u0015\u001e\u0015\u001c\u001b\u0005\u0019&\u001f", (short) (C1607wl.Xd() ^ 23538)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(Xg.qd("O]Tca\\X#Yffm_ip+nl.QcfofmlUjxlsr\u0001", (short) (C1607wl.Xd() ^ 16726), (short) (C1607wl.Xd() ^ 23529)));
                    Class<?>[] clsArr = new Class[2];
                    short sXd2 = (short) (C1607wl.Xd() ^ 22968);
                    short sXd3 = (short) (C1607wl.Xd() ^ 15276);
                    int[] iArr2 = new int["b;:HC\u001b{nQC\u0017[C\u001e\u0007!".length()];
                    QB qb2 = new QB("b;:HC\u001b{nQC\u0017[C\u001e\u0007!");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls2.getMethod(ZO.xd("G\u0016x'P\r?_\u001ag\u0001S+\u0005oHjS", (short) (OY.Xd() ^ 11249), (short) (OY.Xd() ^ 12536)), clsArr);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        String strUd = C1626yg.Ud("A\u0001 RB\u0007gti7\u0019@^gkJJS<v_\u0011:^Y\u001f\u000eX4,knJ6", (short) (C1607wl.Xd() ^ 7726), (short) (C1607wl.Xd() ^ 3355));
                        short sXd4 = (short) (OY.Xd() ^ 8581);
                        int[] iArr3 = new int["'\u0001A1k".length()];
                        QB qb3 = new QB("'\u0001A1k");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                            i4++;
                        }
                        String str2 = new String(iArr3, 0, i4);
                        try {
                            Class<?> cls3 = Class.forName(strUd);
                            Field field = 1 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PUBLIC_API;
            short sXd5 = (short) (OY.Xd() ^ 4027);
            int[] iArr4 = new int["\u007fc\f\u001eno&nGqKz'\u0017/\tw\u0003cqDkE\u000b8\r?\u0012Jw)\u0015iI\u0007H3\f\f".length()];
            QB qb4 = new QB("\u007fc\f\u001eno&nGqKz'\u0017/\tw\u0003cqDkE\u000b8\r?\u0012Jw)\u0015iI\u0007H3\f\f");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i5)) + xuXd4.CK(iKK4));
                i5++;
            }
            aFLogger.e(aFg1cSDK, new String(iArr4, 0, i5), e5);
        }
        return (-1) - (((-1) - ((Integer) obj).intValue()) | ((-1) - 1)) != 0;
    }

    public final String getRevenue(String str) throws Throwable {
        try {
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("\\h]jf_Y\"Va_dT\\a\u001a.YW\\L^Y", (short) (C1580rY.Xd() ^ (-30460)))).getMethod(C1593ug.zd("\u001b\u001a*\t\u001d,)0. #2", (short) (C1580rY.Xd() ^ (-25669)), (short) (C1580rY.Xd() ^ (-22854))), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                short sXd = (short) (C1580rY.Xd() ^ (-18862));
                int[] iArr = new int["\u0014\u0014\u0011\u0007\u000b\u0003".length()];
                QB qb = new QB("\u0014\u0014\u0011\u0007\u000b\u0003");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str2 = new String(iArr, 0, i2);
                Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (C1607wl.Xd() ^ 26296))).getMethod(Wg.Zd("=uN\u0014nR$\u0004K;mf<\u0016", (short) (OY.Xd() ^ 29404), (short) (OY.Xd() ^ 855)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    int identifier = resources.getIdentifier(str, str2, (String) method2.invoke(context2, objArr2));
                    if (identifier == 0) {
                        return null;
                    }
                    Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    Class<?> cls = Class.forName(C1561oA.Xd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013", (short) (ZN.Xd() ^ 4315)));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr3 = {Integer.valueOf(identifier)};
                    Method method3 = cls.getMethod(Wg.vd("cbnNlk_e[", (short) (ZN.Xd() ^ 18017)), clsArr);
                    try {
                        method3.setAccessible(true);
                        return (String) method3.invoke(context3, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Resources.NotFoundException e5) {
            AFLogger.afErrorLog(new StringBuilder(Qg.kd("\u001dHMC:tBBFp<>/1k>>;15-d6(5051!\"\\", (short) (FB.Xd() ^ 19465), (short) (FB.Xd() ^ 15489))).append(e5.getMessage()).toString(), e5);
            return null;
        }
    }

    public final PackageInfo n_() throws Throwable {
        if (this.areAllFieldsValid == null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(hg.Vd("[g\\ie^X!U`^cS[`\u0019-XV[K]X", (short) (C1580rY.Xd() ^ (-11017)), (short) (C1580rY.Xd() ^ (-24987)))).getMethod(C1561oA.ud("PM[6FGNCHE,?K=B?K", (short) (C1499aX.Xd() ^ (-28796))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                        Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                        short sXd = (short) (C1580rY.Xd() ^ (-7965));
                        int[] iArr = new int["y\bz\n\f\u0007~I\u0004\u0011\r\u0014\n\u0014\u0017Qk\u0019\u0015\u001c\u0012&\u001f".length()];
                        QB qb = new QB("y\bz\n\f\u0007~I\u0004\u0011\r\u0014\n\u0014\u0017Qk\u0019\u0015\u001c\u0012&\u001f");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                            i2++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i2));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr2 = new Object[0];
                        short sXd2 = (short) (FB.Xd() ^ 22565);
                        int[] iArr2 = new int["vu\u0006btw\u0001w~}g{\t\u0002".length()];
                        QB qb2 = new QB("vu\u0006btw\u0001w~}g{\t\u0002");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                            i3++;
                        }
                        Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            method2.setAccessible(true);
                            String str = (String) method2.invoke(context2, objArr2);
                            PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                            short sXd3 = (short) (FB.Xd() ^ 7470);
                            short sXd4 = (short) (FB.Xd() ^ 21101);
                            int[] iArr3 = new int["\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f*(i\r\u001f\"+\")(\u0011&4(/.<".length()];
                            QB qb3 = new QB("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f*(i\r\u001f\"+\")(\u0011&4(/.<");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                                i4++;
                            }
                            Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Class.forName(Jg.Wd("#@v/lx\u000beP$+Y\u0005\tou", (short) (FB.Xd() ^ 2006), (short) (FB.Xd() ^ 21729)));
                            clsArr2[1] = Class.forName(ZO.xd("Za\u00022'\u000b\n\u0010W<9h4*T\rfS*!\u001aDNme\fo,B\u0001$G1I*>\u0017s.~\u0019^wyX^dF\u0013A", (short) (FB.Xd() ^ 30970), (short) (FB.Xd() ^ 9729)));
                            Object[] objArr3 = {str, packageInfoFlagsOf};
                            Method method3 = cls2.getMethod(C1626yg.Ud("!g9t\bKM2h2=C\u00031", (short) (FB.Xd() ^ 26146), (short) (FB.Xd() ^ 30692)), clsArr2);
                            try {
                                method3.setAccessible(true);
                                this.areAllFieldsValid = (PackageInfo) method3.invoke(packageManager, objArr3);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } else {
                    Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(Ig.wd("H\f0UJ\bf\b\u0003\u001a\u001bC\u0006\u0005\u0003\u001en!G5k\"\u007f", (short) (C1607wl.Xd() ^ 23048))).getMethod(EO.Od("\b63v\u0007>b\u0010=?)\u0017OHB\u001ad", (short) (Od.Xd() ^ (-32621))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        PackageManager packageManager2 = (PackageManager) method4.invoke(context3, objArr4);
                        Context context4 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                        Class<?> cls3 = Class.forName(C1561oA.Qd("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (C1633zX.Xd() ^ (-18078))));
                        Class<?>[] clsArr3 = new Class[0];
                        Object[] objArr5 = new Object[0];
                        short sXd5 = (short) (C1633zX.Xd() ^ (-4574));
                        short sXd6 = (short) (C1633zX.Xd() ^ (-25314));
                        int[] iArr4 = new int["! 0\r\u001f\"+\")(\u0012&3,".length()];
                        QB qb4 = new QB("! 0\r\u001f\"+\")(\u0012&3,");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) - sXd6);
                            i5++;
                        }
                        Method method5 = cls3.getMethod(new String(iArr4, 0, i5), clsArr3);
                        try {
                            method5.setAccessible(true);
                            String str2 = (String) method5.invoke(context4, objArr5);
                            short sXd7 = (short) (FB.Xd() ^ 28448);
                            int[] iArr5 = new int[";G<IE>8\u00015@>C3;@x:6u\u0017'(/$)&\r ,\u001e# ,".length()];
                            QB qb5 = new QB(";G<IE>8\u00015@>C3;@x:6u\u0017'(/$)&\r ,\u001e# ,");
                            int i6 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i6] = xuXd5.fK(sXd7 + sXd7 + i6 + xuXd5.CK(iKK5));
                                i6++;
                            }
                            Class<?> cls4 = Class.forName(new String(iArr5, 0, i6));
                            Class<?>[] clsArr4 = new Class[2];
                            clsArr4[0] = Class.forName(C1561oA.Kd("_WmY'f\\jd,Rtskqk", (short) (C1633zX.Xd() ^ (-9357))));
                            clsArr4[1] = Integer.TYPE;
                            Object[] objArr6 = {str2, 0};
                            Method method6 = cls4.getMethod(Wg.Zd("]?W\u0011+\u0003$g\tXI\b\rw", (short) (FB.Xd() ^ 31824), (short) (FB.Xd() ^ 29020)), clsArr4);
                            try {
                                method6.setAccessible(true);
                                this.areAllFieldsValid = (PackageInfo) method6.invoke(packageManager2, objArr6);
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
            } catch (PackageManager.NameNotFoundException e8) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, C1561oA.Xd("U\nux\u0005\n\u007f\u0007\u00079\u0012\u0004\u0006\n\u0004?\u0015\u0014\u001c\r\u0013\rF\u000e\u0018I\u0012\u0011!M~\u0011\u0014\u001d\u0014\u001b\u001a~%\u001e(", (short) (OY.Xd() ^ 26661)), e8, false, false, true, false);
            }
        }
        return this.areAllFieldsValid;
    }
}
