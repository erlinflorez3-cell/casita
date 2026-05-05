package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.Global;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.protocol.App;
import io.sentry.util.LazyEvaluator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
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

/* JADX INFO: loaded from: classes6.dex */
public final class ContextUtils {
    private static final AndroidLazyEvaluator<String> deviceName = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda0
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.lambda$static$0(context);
        }
    });
    private static final LazyEvaluator<Boolean> isForegroundImportance = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda1
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            return ContextUtils.lambda$static$1();
        }
    });
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo33 = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda2
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.lambda$static$2(context);
        }
    });
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda3
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.lambda$static$3(context);
        }
    });
    private static final AndroidLazyEvaluator<String> applicationName = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda4
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.lambda$static$4(context);
        }
    });
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo33 = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda5
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.lambda$static$5(context);
        }
    });
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.ContextUtils$$ExternalSyntheticLambda6
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.lambda$static$6(context);
        }
    });

    static class SideLoadedInfo {
        private final String installerStore;
        private final boolean isSideLoaded;

        public SideLoadedInfo(boolean z2, String str) {
            this.isSideLoaded = z2;
            this.installerStore = str;
        }

        public Map<String, String> asTags() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.isSideLoaded));
            String str = this.installerStore;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }

        public String getInstallerStore() {
            return this.installerStore;
        }

        public boolean isSideLoaded() {
            return this.isSideLoaded;
        }
    }

    private ContextUtils() {
    }

    public static Context getApplicationContext(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("#/$1-& h\u001d(&+\u001b#(`t \u001e#\u0013% ", (short) (Od.Xd() ^ (-22383)))).getMethod(C1561oA.yd("! 0}&'$\"%$8.--\u000308?1E:", (short) (Od.Xd() ^ (-24847))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            return context2 != null ? context2 : context;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static ApplicationInfo getApplicationInfo(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticAppInfo33.getValue(context) : staticAppInfo.getValue(context);
    }

    static String getApplicationName(Context context) {
        return applicationName.getValue(context);
    }

    static String[] getArchitectures(BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    static String getDeviceName(Context context) {
        return deviceName.getValue(context);
    }

    static DisplayMetrics getDisplayMetrics(Context context, ILogger iLogger) {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("?MDSQLH\u0013IVV]OY`\u001b1^^eWkh", (short) (Od.Xd() ^ (-9770)))).getMethod(Xg.qd("feuThwt{ykn}", (short) (Od.Xd() ^ (-2245)), (short) (Od.Xd() ^ (-19167))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, Jg.Wd("<pu{\u00046\u0007\b.7/==z&PQUVTqJk\u007f\u0013\u0013\u0012)j", (short) (C1499aX.Xd() ^ (-22629)), (short) (C1499aX.Xd() ^ (-19379))), th);
            return null;
        }
    }

    static String getFamily(ILogger iLogger) {
        try {
            return Build.MODEL.split(Global.BLANK, -1)[0];
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    static String getKernelVersion(ILogger iLogger) {
        String property = System.getProperty(EventKeys.OS.VERSION);
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } finally {
            }
        } catch (IOException e2) {
            iLogger.log(SentryLevel.ERROR, "Exception while attempting to read kernel information", e2);
            return property;
        }
    }

    static ActivityManager.MemoryInfo getMemInfo(Context context, ILogger iLogger) {
        short sXd = (short) (FB.Xd() ^ 26363);
        short sXd2 = (short) (FB.Xd() ^ 10667);
        int[] iArr = new int["!N?BBw\"Jd+\t2?klN\u0012Wmh FUw%".length()];
        QB qb = new QB("!N?BBw\"Jd+\t2?klN\u0012Wmh FUw%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strUd = C1626yg.Ud("t&]\u0001?\tH9", (short) (OY.Xd() ^ 25780), (short) (OY.Xd() ^ 6511));
        try {
            Class<?> cls = Class.forName(Ig.wd("\u0006Z\u001e!\u0006:EO->7\u0003D[IeQs;En^4", (short) (C1633zX.Xd() ^ (-6802))));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (C1633zX.Xd() ^ (-1562));
            int[] iArr2 = new int["\u0005C,yP;>&i>c%qdo\t".length()];
            QB qb2 = new QB("\u0005C,yP;>&i>c%qdo\t");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {strUd};
            Method method = cls.getMethod(C1561oA.Qd("[XfDibbRY>O[^PIJ", (short) (OY.Xd() ^ 2538)), clsArr);
            try {
                method.setAccessible(true);
                ActivityManager activityManager = (ActivityManager) method.invoke(context, objArr);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    return memoryInfo;
                }
                iLogger.log(SentryLevel.INFO, str, new Object[0]);
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, str, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x02a7 A[LOOP:3: B:184:0x02a1->B:186:0x02a7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.content.pm.PackageInfo getPackageInfo(android.content.Context r10, int r11, io.sentry.ILogger r12, io.sentry.android.core.BuildInfoProvider r13) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ContextUtils.getPackageInfo(android.content.Context, int, io.sentry.ILogger, io.sentry.android.core.BuildInfoProvider):android.content.pm.PackageInfo");
    }

    static PackageInfo getPackageInfo(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticPackageInfo33.getValue(context) : staticPackageInfo.getValue(context);
    }

    static String getVersionCode(PackageInfo packageInfo, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : getVersionCodeDep(packageInfo);
    }

    private static String getVersionCodeDep(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    static String getVersionName(PackageInfo packageInfo) {
        return packageInfo.versionName;
    }

    public static boolean isForegroundImportance() {
        return isForegroundImportance.getValue().booleanValue();
    }

    static /* synthetic */ String lambda$static$0(Context context) throws Throwable {
        Class<?> cls = Class.forName(EO.Od(":q\u001aOT\u001cb$\u0005DAe\u0006\t\u0017m8n\u0015#O\u000eX", (short) (OY.Xd() ^ 13885)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-30241));
        int[] iArr = new int["fcq?jhm]ejGYfa]fT`".length()];
        QB qb = new QB("fcq?jhm]ejGYfa]fT`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return Settings.Global.getString((ContentResolver) method.invoke(context, objArr), C1593ug.zd("rt\u0007zuxs\u0004w\u0005}", (short) (C1633zX.Xd() ^ (-27381)), (short) (C1633zX.Xd() ^ (-24207))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ Boolean lambda$static$1() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return Boolean.valueOf(runningAppProcessInfo.importance == 100);
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ PackageInfo lambda$static$2(Context context) {
        short sXd = (short) (ZN.Xd() ^ 18557);
        int[] iArr = new int["iujwslf/cnlqain';fdiYkf".length()];
        QB qb = new QB("iujwslf/cnlqain';fdiYkf");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (OY.Xd() ^ IptcDirectory.TAG_PROGRAM_VERSION);
            int[] iArr2 = new int["nm}Zloxovu^s\u0002u|{\n".length()];
            QB qb2 = new QB("nm}Zloxovu^s\u0002u|{\n");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls2 = Class.forName(Wg.Zd("}@c]\bw\u001eU88dVts%L\u000fn[\u000fk4\u001c", (short) (C1607wl.Xd() ^ 5049), (short) (C1607wl.Xd() ^ 9077)));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (C1633zX.Xd() ^ (-20970));
                int[] iArr3 = new int["10@\u001d/2;298\"6C<".length()];
                QB qb3 = new QB("10@\u001d/2;298\"6C<");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                    short sXd4 = (short) (C1499aX.Xd() ^ (-19693));
                    int[] iArr4 = new int["\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e)'h\f\u001e!*!('\u0010%3'.-;".length()];
                    QB qb4 = new QB("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e)'h\f\u001e!*!('\u0010%3'.-;");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK((sXd4 ^ i5) + xuXd4.CK(iKK4));
                        i5++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr4, 0, i5));
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Class.forName(Qg.kd("\\RfP\u001cYMYQ\u0017;[XNRJ", (short) (C1499aX.Xd() ^ (-15914)), (short) (C1499aX.Xd() ^ (-13739))));
                    clsArr3[1] = Class.forName(hg.Vd("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b X\u001a\u0016Uv\u0007\b\u000f\u0004\t\u0006l\u007f\f}\u0003\u007f\f<gwx\u007ftyvY}t|Rwkp{", (short) (C1607wl.Xd() ^ 28005), (short) (C1607wl.Xd() ^ 16119)));
                    Object[] objArr3 = {str, packageInfoFlagsOf};
                    Method method3 = cls3.getMethod(C1561oA.ud("52@\u001b+,3(-*\r1(0", (short) (C1580rY.Xd() ^ (-1426))), clsArr3);
                    try {
                        method3.setAccessible(true);
                        return (PackageInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ PackageInfo lambda$static$3(Context context) {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("KWP]UNL\u0015U`bgS[d\u001d=hjo[ml", (short) (Od.Xd() ^ (-10832)))).getMethod(C1561oA.Yd("wv\u0007cux\u0002x\u007f~g|\u000b~\u0006\u0005\u0013", (short) (C1580rY.Xd() ^ (-26219))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Xg.qd(".<3B@;7\u00028EEL>HO\n MMTFZW", (short) (C1633zX.Xd() ^ (-9799)), (short) (C1633zX.Xd() ^ (-23194)))).getMethod(Jg.Wd("|%-^(\u0006\u0003R\u0016u9\bfX", (short) (Od.Xd() ^ (-13822)), (short) (Od.Xd() ^ (-23326))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls = Class.forName(ZO.xd("c\u0017\u001f5\u000ed8\u001d.oC-|\u001a;F>\r\u001e\u007fkT<@Q5U6|EWP-", (short) (ZN.Xd() ^ 29852), (short) (ZN.Xd() ^ 798)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1626yg.Ud("\bGYfs\u000f!Ws&8zB<2r", (short) (C1607wl.Xd() ^ 16141), (short) (C1607wl.Xd() ^ 4703)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls.getMethod(Ig.wd("^/LK,QA/V\bm1ZY", (short) (OY.Xd() ^ 4649)), clsArr);
                    try {
                        method3.setAccessible(true);
                        return (PackageInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ String lambda$static$4(Context context) {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("\u0001>d\r\fR3G;\u0006\u0001+FOO-n3\\\\\fU}", (short) (C1499aX.Xd() ^ (-6696)))).getMethod(C1561oA.Qd("*'5\u0001/.)%\u001e\u001b-!&$}\"\u0019!", (short) (ZN.Xd() ^ 6119)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                int i2 = applicationInfo.labelRes;
                if (i2 != 0) {
                    Class<?> cls = Class.forName(Wg.vd("2@7FD?;\u0006<IIPBLS\u000e\u0004118*>;", (short) (Od.Xd() ^ (-21510))));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    Method method2 = cls.getMethod(Qg.kd("<9G%EB8<4", (short) (C1499aX.Xd() ^ (-14788)), (short) (C1499aX.Xd() ^ (-11614))), clsArr);
                    try {
                        method2.setAccessible(true);
                        return (String) method2.invoke(context, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (applicationInfo.nonLocalizedLabel != null) {
                    return applicationInfo.nonLocalizedLabel.toString();
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1593ug.zd("]kbqojf1gtt{mw~9O||\u0004u\n\u0007", (short) (Od.Xd() ^ (-20639)), (short) (Od.Xd() ^ (-24010)))).getMethod(C1561oA.od("nkyTdelafcJ]i[`]i", (short) (C1499aX.Xd() ^ (-1128))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method3.invoke(context, objArr3);
                    Class<?> cls2 = Class.forName(C1561oA.Kd("'5,;940z1>>E7AH\u0003FD\u0006);>G>ED-BPDKJX", (short) (C1633zX.Xd() ^ (-23511))));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(Wg.Zd("J~/}5c\u0019#S$]$O\rMG\u0005&!t^\u0013I\u0007{>\fA\u00025J0#d", (short) (Od.Xd() ^ (-12619)), (short) (Od.Xd() ^ (-29743))));
                    Object[] objArr4 = {applicationInfo};
                    Method method4 = cls2.getMethod(C1561oA.Xd("\u000e\r\u001dj\u001b\u001c\u0019\u0017\u0012\u0011%\u001b\"\"\u0001\u0017\u0019\u001d%", (short) (C1607wl.Xd() ^ 30336)), clsArr2);
                    try {
                        method4.setAccessible(true);
                        return ((CharSequence) method4.invoke(packageManager, objArr4)).toString();
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Throwable unused) {
            return null;
        }
        return null;
    }

    static /* synthetic */ ApplicationInfo lambda$static$5(Context context) {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("9E:GC<6~3><A19>v\u000b649);6", (short) (FB.Xd() ^ 6601), (short) (FB.Xd() ^ 3270))).getMethod(C1561oA.ud(".+9\u0014$%,!&#\n\u001d)\u001b \u001d)", (short) (ZN.Xd() ^ 5393)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1561oA.yd("DRETVQI\u0014N[W^T^a\u001c\u0016C?F<PI", (short) (C1607wl.Xd() ^ 7048)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1580rY.Xd() ^ (-32032));
                int[] iArr = new int["edtQcfofmlVjwp".length()];
                QB qb = new QB("edtQcfofmlVjwp");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(128L);
                    Class<?> cls2 = Class.forName(Xg.qd("Vd[jhc_*`mmtfpw2us5Xjmvmts\\q\u007fszy\b", (short) (C1580rY.Xd() ^ (-166)), (short) (C1580rY.Xd() ^ (-24264))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(Jg.Wd("cBC\u001aR|]VK}\u000f\u001c\u0006hY>", (short) (C1633zX.Xd() ^ (-7108)), (short) (C1633zX.Xd() ^ (-7830))));
                    clsArr2[1] = Class.forName(ZO.xd("\t\u0016$,4\nb_\u001b\u001dYW\u0011\u007f\u0011\n\u0019;\tp\u00025\u0011K\u0016r@n\u0001z9hf\u001fUYuy\u0014LO;!v4\\4UF\u0015\u000fMj\u0017", (short) (C1580rY.Xd() ^ (-18933)), (short) (C1580rY.Xd() ^ (-16820))));
                    Object[] objArr3 = {str, applicationInfoFlagsOf};
                    Method method3 = cls2.getMethod(C1626yg.Ud("3P%A?!}\u0011]\u0010Gg&;93\u0011j", (short) (C1607wl.Xd() ^ 7716), (short) (C1607wl.Xd() ^ 1328)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        return (ApplicationInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ ApplicationInfo lambda$static$6(Context context) {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("#]E+h>M.-\u0015\u0012}\u0007\u0018\fi1u\u001b\u0017P\u001e6", (short) (OY.Xd() ^ 27932))).getMethod(EO.Od("L|:=>\u0006y7\u0015&\u0010>\u0017\u007f\n![", (short) (C1607wl.Xd() ^ 28424)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Qd("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v", (short) (C1633zX.Xd() ^ (-29312)))).getMethod(C1593ug.zd("kjzWilulsr\\p}v", (short) (C1580rY.Xd() ^ (-5294)), (short) (C1580rY.Xd() ^ (-443))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls = Class.forName(C1561oA.od("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=~z:[klshmjQdpbgdp", (short) (Od.Xd() ^ (-25978))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.Kd("um\u0004o=|r\u0001zBh\u000b\n\u0002\b\u0002", (short) (Od.Xd() ^ (-27503))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls.getMethod(Wg.Zd("4>]F|\t%-OY|\r\u001b& Qq\u0006", (short) (C1633zX.Xd() ^ (-30799)), (short) (C1633zX.Xd() ^ (-28086))), clsArr);
                    try {
                        method3.setAccessible(true);
                        return (ApplicationInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    static Intent registerReceiver(Context context, SentryOptions sentryOptions, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerReceiver(context, new BuildInfoProvider(sentryOptions.getLogger()), broadcastReceiver, intentFilter);
    }

    static Intent registerReceiver(Context context, BuildInfoProvider buildInfoProvider, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Throwable {
        if (buildInfoProvider.getSdkInfoVersion() >= 33) {
            Object[] objArr = {broadcastReceiver, intentFilter, 4};
            Method method = Class.forName(C1561oA.Xd("!/&53.*t+88?1;B|\u0013@@G9MJ", (short) (C1607wl.Xd() ^ 31026))).getMethod(hg.Vd("B456??/;\u001a,)*-9'3", (short) (C1633zX.Xd() ^ (-12286)), (short) (C1633zX.Xd() ^ (-9854))), Class.forName(Wg.vd(":F;HLE?\bDOMRJRW\u0010\u000b:6'1/,=E\"41:=I7+", (short) (C1633zX.Xd() ^ (-27065)))), Class.forName(Qg.kd(">J?LHA;\u00048CAF6>C{\u0016:?/7<\r/18(4", (short) (ZN.Xd() ^ 17176), (short) (ZN.Xd() ^ 4632))), Integer.TYPE);
            try {
                method.setAccessible(true);
                return (Intent) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Class<?> cls = Class.forName(C1561oA.ud("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (ZN.Xd() ^ 7277)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1633zX.Xd() ^ (-12725));
        int[] iArr = new int["\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i~0.!%%$79\u0018,+.3A1?".length()];
        QB qb = new QB("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i~0.!%%$79\u0018,+.3A1?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Class.forName(C1561oA.Yd("Yg^mkfb-cppwisz5Qw~pz\u0002Tx|\u0006w\u0006", (short) (OY.Xd() ^ 17488)));
        Object[] objArr2 = {broadcastReceiver, intentFilter};
        short sXd2 = (short) (OY.Xd() ^ 1173);
        short sXd3 = (short) (OY.Xd() ^ 13987);
        int[] iArr2 = new int["@47:EG9G(<;>CQAO".length()];
        QB qb2 = new QB("@47:EG9G(<;>CQAO");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method2.setAccessible(true);
            return (Intent) method2.invoke(context, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void resetInstance() {
        deviceName.resetValue();
        isForegroundImportance.resetValue();
        staticPackageInfo33.resetValue();
        staticPackageInfo.resetValue();
        applicationName.resetValue();
        staticAppInfo33.resetValue();
        staticAppInfo.resetValue();
    }

    static SideLoadedInfo retrieveSideLoadedInfo(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) throws Throwable {
        String str;
        try {
            PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
            Class<?> cls = Class.forName(Jg.Wd("g\u00028\u0006K\u0003@\u0017GP`eOe.%%NN#M\u001fl", (short) (C1607wl.Xd() ^ 8119), (short) (C1607wl.Xd() ^ 17771)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-17116));
            short sXd2 = (short) (C1499aX.Xd() ^ (-8123));
            int[] iArr = new int["{G\"80]yZ\u001eS\u001f\fF'\u0010E0".length()];
            QB qb = new QB("{G\"80]yZ\u001eS\u001f\fF'\u0010E0");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                if (packageInfo != null && packageManager != null) {
                    str = packageInfo.packageName;
                    try {
                        Class<?> cls2 = Class.forName(C1626yg.Ud("\u00142y]pZdp(\u0005d/\u000bc\bSO=\u0003\u001d~\u000e(k$u;_ 0\u0007jG", (short) (FB.Xd() ^ 12953), (short) (FB.Xd() ^ 9364)));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(Ig.wd("2^a$)+Dh'9`c3  9", (short) (OY.Xd() ^ 24858)));
                        Object[] objArr2 = {str};
                        Method method2 = cls2.getMethod(EO.Od("m<\u0019M\"Ty\u000ex\f~.WfT}A5z\f^2T", (short) (ZN.Xd() ^ 26940)), clsArr2);
                        try {
                            method2.setAccessible(true);
                            String str2 = (String) method2.invoke(packageManager, objArr2);
                            return new SideLoadedInfo(str2 == null, str2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (IllegalArgumentException unused) {
                        SentryLevel sentryLevel = SentryLevel.DEBUG;
                        short sXd3 = (short) (C1633zX.Xd() ^ (-16108));
                        int[] iArr2 = new int["b0[+\u001b\u001c#\u0018\u001d\u001aS\u001c%\u001fV#M\u0016\u001a\u001e\u001e\n\u0014\u0013\u000b\tQ".length()];
                        QB qb2 = new QB("b0[+\u001b\u001c#\u0018\u001d\u001aS\u001c%\u001fV#M\u0016\u001a\u001e\u001e\n\u0014\u0013\u000b\tQ");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                            i3++;
                        }
                        iLogger.log(sentryLevel, new String(iArr2, 0, i3), str);
                        return null;
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    static void setAppPackageInfo(PackageInfo packageInfo, BuildInfoProvider buildInfoProvider, App app) {
        app.setAppIdentifier(packageInfo.packageName);
        app.setAppVersion(packageInfo.versionName);
        app.setAppBuild(getVersionCode(packageInfo, buildInfoProvider));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i2] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        app.setPermissions(map);
    }
}
