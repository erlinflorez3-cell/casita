package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.braze.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1iSDK {
    private static AFf1iSDK getRevenue = null;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1iSDK.3
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put(Constants.BRAZE_PUSH_ACCENT_KEY, "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getMonetizationNetwork;

        AFa1uSDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    enum AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        AFa1ySDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    private AFf1iSDK() {
    }

    private static String AFAdRevenueData(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e2);
            return null;
        }
    }

    public static AFf1iSDK getCurrencyIso4217Code() {
        if (getRevenue == null) {
            getRevenue = new AFf1iSDK();
        }
        return getRevenue;
    }

    private AFg1gSDK getMediationNetwork() throws Throwable {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String strAFAdRevenueData = AFAdRevenueData(entry.getValue());
                if (strAFAdRevenueData != null && !strAFAdRevenueData.equals("")) {
                    aFg1gSDK.getMonetizationNetwork(entry.getKey(), strAFAdRevenueData);
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e2);
        }
        return aFg1gSDK;
    }

    private AFg1gSDK getMediationNetwork(Context context) {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            aFg1gSDK.getMonetizationNetwork(AFa1ySDK.HOOKING.getMonetizationNetwork, getRevenue());
            aFg1gSDK.getMonetizationNetwork(AFa1ySDK.DEBUGGABLE.getMonetizationNetwork, Boolean.valueOf(getMonetizationNetwork(context)));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
        }
        return aFg1gSDK;
    }

    private static boolean getMonetizationNetwork(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012J^\n\b\r|\u000f\n", (short) (C1499aX.Xd() ^ (-23885)))).getMethod(C1561oA.yd(">;I\u0015KJEA2/A5B@\u001a>-5", (short) (C1499aX.Xd() ^ (-7113))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            short sXd = (short) (Od.Xd() ^ (-2615));
            int[] iArr = new int["\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_#!bv'(%#\u001e\u001d1'..\n0)3".length()];
            QB qb = new QB("\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_#!bv'(%#\u001e\u001d1'..\n0)3");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strQd = Xg.qd("V]SZg", (short) (FB.Xd() ^ 27185), (short) (FB.Xd() ^ 23687));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 1 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return (((Integer) obj).intValue() & 2) != 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean getMonetizationNetwork(String str) {
        return str.matches("\\d+");
    }

    private static String getRevenue() {
        short sXd = (short) (C1499aX.Xd() ^ (-5527));
        short sXd2 = (short) (C1499aX.Xd() ^ (-11332));
        int[] iArr = new int["'".length()];
        QB qb = new QB("'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains(ZO.xd("\u0005\u0002\u001b2Od:y3!5rq5\u0016|+\u0003\u0019&+\"", (short) (ZN.Xd() ^ 3791), (short) (ZN.Xd() ^ 22678))) && i4 <= 2) {
                        i4++;
                        sb.append(AFa1uSDK.XPOSED.getMonetizationNetwork);
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(C1626yg.Ud("a\u0015p\u001a\u001c\nt\u0011FE\u00183eB$*\b\u0017{.FQ4\u001eZAO", (short) (Od.Xd() ^ (-29244)), (short) (Od.Xd() ^ (-11075)))).getMethod(Ig.wd("u'&a\u0010i\f\u0019j'>*n", (short) (C1580rY.Xd() ^ (-15154))), new Class[0]);
                        try {
                            method.setAccessible(true);
                            if (((String) method.invoke(stackTraceElement, objArr)).equals(EO.Od("M\u000fZE", (short) (C1607wl.Xd() ^ 4433)))) {
                                sb.append(C1561oA.Qd("`\u0016", (short) (ZN.Xd() ^ 16176)));
                            }
                            Object[] objArr2 = new Object[0];
                            Method method2 = Class.forName(C1593ug.zd("'\u001f5!n.$2,s\u001a<*-6 ?/25\u0016>8A:DK", (short) (ZN.Xd() ^ 15719), (short) (ZN.Xd() ^ 2112))).getMethod(C1561oA.od("63A\u00190>17+\u0014&1(", (short) (FB.Xd() ^ 9584)), new Class[0]);
                            try {
                                method2.setAccessible(true);
                                String str2 = (String) method2.invoke(stackTraceElement, objArr2);
                                short sXd3 = (short) (C1580rY.Xd() ^ (-10535));
                                int[] iArr2 = new int["OIWNWQ5]^[VV@Yi^f\\".length()];
                                QB qb2 = new QB("OIWNWQ5]^[VV@Yi^f\\");
                                int i5 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i5));
                                    i5++;
                                }
                                if (str2.equals(new String(iArr2, 0, i5))) {
                                    short sXd4 = (short) (FB.Xd() ^ 4685);
                                    short sXd5 = (short) (FB.Xd() ^ 6776);
                                    int[] iArr3 = new int["0#".length()];
                                    QB qb3 = new QB("0#");
                                    int i6 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i6] = xuXd3.fK(((i6 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                                        i6++;
                                    }
                                    sb.append(new String(iArr3, 0, i6));
                                }
                                sb.append(str);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Xd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$\u0012\u0015\u001e\b'\u0017\u001a\u001d}& )\",3", (short) (C1580rY.Xd() ^ (-28082)))).getMethod(Wg.vd("%$4\u0004.$78\u0004\u0018%\u001e", (short) (ZN.Xd() ^ 18983)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        String str3 = (String) method3.invoke(stackTraceElement, objArr3);
                        short sXd6 = (short) (Od.Xd() ^ (-27980));
                        short sXd7 = (short) (Od.Xd() ^ (-27356));
                        int[] iArr4 = new int["hsp0bncple_(bfk[gbT^\u001f_b\u001cGeRY]M0TNX".length()];
                        QB qb4 = new QB("hsp0bncple_(bfk[gbT^\u001f_b\u001cGeRY]M0TNX");
                        int i7 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i7] = xuXd4.fK(((sXd6 + i7) + xuXd4.CK(iKK4)) - sXd7);
                            i7++;
                        }
                        if (str3.equals(new String(iArr4, 0, i7))) {
                            i3++;
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
            }
            if (i3 > 1) {
                sb.append(hg.Vd("p|<", (short) (OY.Xd() ^ 5392), (short) (OY.Xd() ^ 16732)));
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly(C1561oA.ud("RXWROSK\u0003EIEBI|AMLHJ", (short) (OY.Xd() ^ 31065)), th);
        }
        try {
            StringBuilder sbAppend = new StringBuilder(C1561oA.yd("Y\u001a\u001b\u0017\nT", (short) (C1580rY.Xd() ^ (-3434)))).append(Process.myPid());
            short sXd8 = (short) (FB.Xd() ^ 4523);
            int[] iArr5 = new int["t4)9=".length()];
            QB qb5 = new QB("t4)9=");
            int i8 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i8] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd8 + sXd8) + sXd8) + i8));
                i8++;
            }
            if (getRevenue(sbAppend.append(new String(iArr5, 0, i8)).toString(), Xg.qd("!.&\" ", (short) (OY.Xd() ^ 8567), (short) (OY.Xd() ^ 25097)))) {
                sb.append(AFa1uSDK.FRIDA.getMonetizationNetwork);
                if (Build.VERSION.SDK_INT < 29) {
                    short sXd9 = (short) (C1633zX.Xd() ^ (-28591));
                    short sXd10 = (short) (C1633zX.Xd() ^ (-2078));
                    int[] iArr6 = new int["`teu\u001f=ks*7i,0".length()];
                    QB qb6 = new QB("`teu\u001f=ks*7i,0");
                    int i9 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i9] = xuXd6.fK(xuXd6.CK(iKK6) - ((i9 * sXd10) ^ sXd9));
                        i9++;
                    }
                    if (getRevenue(new String(iArr6, 0, i9), ZO.xd("F\u0010$\u0014", (short) (C1633zX.Xd() ^ (-11728)), (short) (C1633zX.Xd() ^ (-31727))))) {
                        sb.append(C1626yg.Ud("X8et", (short) (C1499aX.Xd() ^ (-3268)), (short) (C1499aX.Xd() ^ (-4787))));
                    }
                }
            }
        } catch (Exception e5) {
            AFLogger.afErrorLogForExcManagerOnly(Ig.wd("P\u0015>T1;g(\u0015\u0019\u001dH\u000b\u000b\u000e\\i1X)i", (short) (C1607wl.Xd() ^ 24341)), e5);
            sb.append(e5.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(str);
        return sb.toString();
    }

    private static boolean getRevenue(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e2) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e2);
            throw new Exception("FNF");
        } catch (IOException e3) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e3);
            throw new Exception("IOF");
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e4);
            throw new Exception("GF");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRevenue(android.content.Context r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto L9
            boolean r0 = getMonetizationNetwork(r6)     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto Lc
        L9:
            java.lang.String r3 = "invalid timestamp"
        Lc:
            com.appsflyer.internal.AFg1gSDK r2 = new com.appsflyer.internal.AFg1gSDK     // Catch: java.lang.Exception -> L25
            r2.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "pr"
            com.appsflyer.internal.AFg1gSDK r0 = r4.getMediationNetwork()     // Catch: java.lang.Exception -> L25
            r2.getMonetizationNetwork(r1, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "an"
            com.appsflyer.internal.AFg1gSDK r0 = r4.getMediationNetwork(r5)     // Catch: java.lang.Exception -> L25
            r2.getMonetizationNetwork(r1, r0)     // Catch: java.lang.Exception -> L25
            goto L2c
        L25:
            r1 = move-exception
            java.lang.String r0 = "could not get anti fraud data"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
            r2 = r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.getRevenue(android.content.Context, java.lang.String):java.lang.Object");
    }
}
