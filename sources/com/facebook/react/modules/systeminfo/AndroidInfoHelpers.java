package com.facebook.react.modules.systeminfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Build;
import com.dynatrace.android.agent.Global;
import com.facebook.react.R;
import com.facebook.react.common.MapBuilder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
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
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidInfoHelpers {
    public static final String DEVICE_LOCALHOST = "localhost";
    public static final String EMULATOR_LOCALHOST = "10.0.2.2";
    public static final String GENYMOTION_LOCALHOST = "10.0.3.2";
    public static final String METRO_HOST_PROP_NAME = "metro.host";
    private static final String TAG = "AndroidInfoHelpers";
    private static String metroHostPropValue = null;

    public static String getAdbReverseTcpCommand(Context context) {
        return getAdbReverseTcpCommand(getDevServerPort(context));
    }

    public static String getAdbReverseTcpCommand(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    private static Integer getDevServerPort(Context context) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 10503);
        short sXd2 = (short) (C1607wl.Xd() ^ 8979);
        int[] iArr = new int["bncple_(\\gejZbg 4_]bRd_".length()];
        QB qb = new QB("bncple_(\\gejZbg 4_]bRd_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (ZN.Xd() ^ 730);
        int[] iArr2 = new int["DAO,>KFKG78E".length()];
        QB qb2 = new QB("DAO,>KFKG78E");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return Integer.valueOf(((Resources) method.invoke(context, objArr)).getInteger(R.integer.react_native_dev_server_port));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String getFriendlyDeviceName() {
        return isRunningOnGenymotion() ? Build.MODEL : Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static Map<String, String> getInspectorHostMetadata(@Nullable Context context) throws Throwable {
        String string;
        String str;
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("0<1>:3-u*538(05m\u0002-+0 2-", (short) (Od.Xd() ^ (-11414)))).getMethod(C1561oA.Yd("kjzHxyvton\u0003x\u007f\u007f[\u0002z\u0005", (short) (C1633zX.Xd() ^ (-4447))), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                int i2 = applicationInfo.labelRes;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Xg.qd("\"0'64/+u,99@2<C}\u0014AAH:NK", (short) (FB.Xd() ^ 30672), (short) (FB.Xd() ^ 26487))).getMethod(Jg.Wd("\u0011~<\u001bZ\u007fV\u007f\u00045<^\u001e\u0014", (short) (Od.Xd() ^ (-123)), (short) (Od.Xd() ^ (-21002))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    str = (String) method2.invoke(context, objArr2);
                    if (i2 == 0) {
                        string = applicationInfo.nonLocalizedLabel.toString();
                    } else {
                        Class<?> cls = Class.forName(ZO.xd("pht9`%MxKyi\u0002\u0015/|\u007f@CVzR\u0016}", (short) (C1580rY.Xd() ^ (-30891)), (short) (C1580rY.Xd() ^ (-9394))));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr3 = {Integer.valueOf(i2)};
                        Method method3 = cls.getMethod(C1626yg.Ud(")\u000f9<\"a9Ry", (short) (OY.Xd() ^ 30409), (short) (OY.Xd() ^ 28946)), clsArr);
                        try {
                            method3.setAccessible(true);
                            string = (String) method3.invoke(context, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } else {
            string = null;
            str = null;
        }
        String str2 = Build.MODEL;
        String strWd = Ig.wd("\u001b8d\r\u00048\u001d\u000fLkVk\u000f$C\u001eV]", (short) (Od.Xd() ^ (-25023)));
        String reactNativeVersionString = getReactNativeVersionString();
        String strOd = EO.Od("^ \u0012A&\u000e+&vN!\u0016qs", (short) (C1499aX.Xd() ^ (-6227)));
        short sXd = (short) (C1580rY.Xd() ^ (-23271));
        int[] iArr = new int["\u001c*)\u0001\u001b\u001b#(\u001c\u0018\u001a\u0015!".length()];
        QB qb = new QB("\u001c*)\u0001\u001b\u001b#(\u001c\u0018\u001a\u0015!");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        String str3 = new String(iArr, 0, i3);
        String strZd = C1593ug.zd("41';.8<8", (short) (OY.Xd() ^ 19606), (short) (OY.Xd() ^ 26418));
        String strOd2 = C1561oA.od("kwlyunh", (short) (C1607wl.Xd() ^ 10462));
        short sXd2 = (short) (ZN.Xd() ^ 7756);
        int[] iArr2 = new int["`bthcfPdqj".length()];
        QB qb2 = new QB("`bthcfPdqj");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i4));
            i4++;
        }
        return MapBuilder.of(strOd, string, str3, str, strZd, strOd2, new String(iArr2, 0, i4), str2, strWd, reactNativeVersionString);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:74|126|75|128|76|77|(6:116|78|(1:80)(1:130)|98|99|100)|81|122|82|(1:97)|98|99|100) */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0076 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #3 {, blocks: (B:70:0x0003, B:82:0x0040, B:98:0x0067, B:97:0x0064, B:95:0x005f, B:106:0x0071, B:108:0x0076, B:109:0x0079), top: B:118:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[Catch: all -> 0x007a, SYNTHETIC, TryCatch #3 {, blocks: (B:70:0x0003, B:82:0x0040, B:98:0x0067, B:97:0x0064, B:95:0x005f, B:106:0x0071, B:108:0x0076, B:109:0x0079), top: B:118:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0064 A[Catch: all -> 0x007a, PHI: r4
  0x0064: PHI (r4v5 java.lang.Process) = (r4v4 java.lang.Process), (r4v6 java.lang.Process) binds: [B:96:0x0062, B:83:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #3 {, blocks: (B:70:0x0003, B:82:0x0040, B:98:0x0067, B:97:0x0064, B:95:0x005f, B:106:0x0071, B:108:0x0076, B:109:0x0079), top: B:118:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized java.lang.String getMetroHostPropValue() {
        /*
            java.lang.Class<com.facebook.react.modules.systeminfo.AndroidInfoHelpers> r6 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.class
            monitor-enter(r6)
            java.lang.String r0 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L9
            monitor-exit(r6)
            return r0
        L9:
            r5 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            java.lang.String r1 = "/system/bin/getprop"
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            java.lang.String r1 = "metro.host"
            r0 = 1
            r2[r0] = r1     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            java.lang.Process r4 = r3.exec(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L6d
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L6d
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L6d
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L6d
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L6d
            r3.<init>(r2)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L6d
            java.lang.String r1 = ""
        L36:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L6b
            if (r0 == 0) goto L3e
            r1 = r0
            goto L36
        L3e:
            com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue = r1     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L6b
            r3.close()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L7a
        L43:
            if (r4 == 0) goto L67
            goto L64
        L46:
            r2 = move-exception
            goto L52
        L48:
            r2 = move-exception
            r3 = r5
            goto L52
        L4b:
            r0 = move-exception
            r3 = r5
            r4 = r3
            goto L6f
        L4f:
            r2 = move-exception
            r3 = r5
            r4 = r3
        L52:
            java.lang.String r1 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.TAG     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "Failed to query for metro.host prop:"
            com.facebook.common.logging.FLog.w(r1, r0, r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = ""
            com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue = r0     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7a
        L62:
            if (r4 == 0) goto L67
        L64:
            r4.destroy()     // Catch: java.lang.Throwable -> L7a
        L67:
            java.lang.String r0 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)
            return r0
        L6b:
            r0 = move-exception
            goto L6f
        L6d:
            r0 = move-exception
            r3 = r5
        L6f:
            if (r3 == 0) goto L74
            r3.close()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L7a
        L74:
            if (r4 == 0) goto L79
            r4.destroy()     // Catch: java.lang.Throwable -> L7a
        L79:
            throw r0     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.AndroidInfoHelpers.getMetroHostPropValue():java.lang.String");
    }

    private static String getReactNativeVersionString() {
        Map<String, Object> map = ReactNativeVersion.VERSION;
        return map.get("major") + "." + map.get("minor") + "." + map.get("patch") + (map.get("prerelease") != null ? Global.HYPHEN + map.get("prerelease") : "");
    }

    public static String getServerHost(Context context) {
        return getServerIpAddress(getDevServerPort(context).intValue());
    }

    public static String getServerHost(Integer num) {
        return getServerIpAddress(num.intValue());
    }

    private static String getServerIpAddress(int i2) {
        String metroHostPropValue2 = getMetroHostPropValue();
        if (metroHostPropValue2.equals("")) {
            metroHostPropValue2 = isRunningOnGenymotion() ? GENYMOTION_LOCALHOST : isRunningOnStockEmulator() ? EMULATOR_LOCALHOST : DEVICE_LOCALHOST;
        }
        return String.format(Locale.US, "%s:%d", metroHostPropValue2, Integer.valueOf(i2));
    }

    private static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean isRunningOnStockEmulator() {
        return Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.startsWith("google/sdk_gphone");
    }
}
