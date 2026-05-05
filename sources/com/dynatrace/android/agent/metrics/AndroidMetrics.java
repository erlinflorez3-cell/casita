package com.dynatrace.android.agent.metrics;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.util.RootDetector;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.SdkVersionProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
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
public class AndroidMetrics {
    private static final String LOGTAG = Global.LOG_PREFIX + "AndroidMetrics";
    private static volatile AndroidMetrics theInstance = null;
    private AppVersion appVersion;
    private final AppVersionTracker appVersionTracker;
    private final BatteryTracker batteryTracker;
    private final Context context;
    public String cpuInformation;
    private String currentActivityName;
    public String deviceCarrier;
    public Integer deviceMemoryFree;
    public Integer deviceMemorySize;
    public boolean deviceRooted;
    public String manufacturer;
    public String modelId;
    public String operatingSystem;
    public String osVersion;
    TimeLineProvider timeLineProvider;
    public String userLang;
    public volatile ConnectionType connectionType = ConnectionType.OFFLINE;
    public String networkProtocol = null;
    public int deviceOrientation = 0;
    public int batteryLevel = Integer.MIN_VALUE;
    public Location mockDeviceLocation = null;
    ScreenMetrics screenMetrics = null;
    private long commonMetricsTimestamp = 0;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.metrics.AndroidMetrics$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType = iArr;
            try {
                iArr[ConnectionType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType[ConnectionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType[ConnectionType.LAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AndroidMetrics(Context context) {
        this.context = context;
        if (context == null) {
            this.appVersionTracker = null;
            this.batteryTracker = null;
        } else {
            this.appVersionTracker = new AppVersionTracker(context, new SdkVersionProviderImpl());
            this.batteryTracker = BatteryTracker.generateBatteryTracker(context);
        }
        this.timeLineProvider = TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER;
    }

    public static String formatUserLanguage(Locale locale) {
        String language = locale.getLanguage();
        return locale.getCountry().length() > 0 ? language + Global.UNDERSCORE + locale.getCountry() : language;
    }

    private ActivityManager getActivityMgr() throws Throwable {
        try {
            Context context = this.context;
            String strZd = C1593ug.zd("fi{q\u007fs\u007f\u0006", (short) (Od.Xd() ^ (-7755)), (short) (Od.Xd() ^ (-5149)));
            Class<?> cls = Class.forName(C1561oA.od("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (C1580rY.Xd() ^ (-15376))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Kd("]UkW%dZhb*Prqioi", (short) (C1633zX.Xd() ^ (-4990))));
            Object[] objArr = {strZd};
            Method method = cls.getMethod(Wg.Zd("G2sI\"\t\u0014{6\tM)_Akd", (short) (C1499aX.Xd() ^ (-28319)), (short) (C1499aX.Xd() ^ (-3953))), clsArr);
            try {
                method.setAccessible(true);
                return (ActivityManager) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            if (Global.DEBUG) {
                Utility.zlogW(LOGTAG, e3.toString());
            }
            return null;
        }
    }

    public static AndroidMetrics getInstance() {
        if (theInstance == null) {
            synchronized (AndroidMetrics.class) {
                if (theInstance == null) {
                    theInstance = new AndroidMetrics(AdkSettings.getInstance().getContext());
                    theInstance.init();
                }
            }
        }
        return theInstance;
    }

    private String getMobileNetworkProtocol(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 20:
                return "5G";
            default:
                return networkInfo.getSubtypeName();
        }
    }

    private NetworkInfo getNetworkInfo() throws Throwable {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        String strXd = C1561oA.Xd("\u0014!!\"\u001a\u0019+!/#/5", (short) (C1633zX.Xd() ^ (-16595)));
        try {
            Class<?> cls = Class.forName(Wg.vd("\u007f\u000e\u0005\u0014\n\u0005\u0001Ky\u0007\u0007\u000ew\u0002\tCQ~~\u0006o\u0004\u0001", (short) (OY.Xd() ^ 10219)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Qg.kd("\u0005z\u000fxD\u0002u\u0002y?c\u0004\u0001vzr", (short) (C1580rY.Xd() ^ (-18563)), (short) (C1580rY.Xd() ^ (-27634))));
            Object[] objArr = {strXd};
            Method method = cls.getMethod(hg.Vd("\b\u0005\u0013p\u0016\u000f\u000f~\u0006j{\b\u000b|uv", (short) (FB.Xd() ^ 23006), (short) (FB.Xd() ^ 25432)), clsArr);
            try {
                method.setAccessible(true);
                return ((ConnectivityManager) method.invoke(context, objArr)).getActiveNetworkInfo();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            if (!Global.DEBUG) {
                return null;
            }
            Utility.zlogW(LOGTAG, e3.toString());
            return null;
        }
    }

    private void init() throws Throwable {
        this.manufacturer = Build.MANUFACTURER;
        this.deviceRooted = this.context != null && RootDetector.INSTANCE.isDeviceRooted(this.context);
        this.osVersion = Build.VERSION.RELEASE;
        this.operatingSystem = "Android " + this.osVersion;
        this.cpuInformation = Utility.getCPUInfo();
        this.modelId = Build.MODEL;
        this.userLang = formatUserLanguage(Locale.getDefault());
        updateVerboseMetrics();
        updateBasicMetrics();
        updateCommonMetrics();
        ScreenMetrics initialScreenMetrics = getInitialScreenMetrics();
        this.screenMetrics = initialScreenMetrics;
        setInitialScreenMetricsIn3rdGen(initialScreenMetrics);
    }

    private void setInitialScreenMetricsIn3rdGen(ScreenMetrics screenMetrics) {
        CoreComponent holder = CoreComponent.Holder.getInstance();
        if (holder != null) {
            holder.getMetricsRepository().updateScreenMetrics(screenMetrics);
        }
    }

    private void updateBatteryStrength() {
        BatteryTracker batteryTracker = this.batteryTracker;
        if (batteryTracker != null) {
            this.batteryLevel = batteryTracker.captureBatteryLevel();
        }
    }

    private void updateCarrier() throws Throwable {
        Context context = this.context;
        if (context == null) {
            return;
        }
        this.deviceCarrier = null;
        String strUd = C1561oA.ud("e\\b`V", (short) (ZN.Xd() ^ 7221));
        try {
            Class<?> cls = Class.forName(C1561oA.yd("eqfsohb+ozx}muz3W\u0003\u0001\u0006u\b\u0003", (short) (FB.Xd() ^ 24916)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1607wl.Xd() ^ 21200);
            int[] iArr = new int["\u0012\n \fY\u0019\u000f\u001d\u0017^\u0005'&\u001e$\u001e".length()];
            QB qb = new QB("\u0012\n \fY\u0019\u000f\u001d\u0017^\u0005'&\u001e$\u001e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {strUd};
            Method method = cls.getMethod(Xg.qd("?>N.UPRDM4GUZNIL", (short) (C1607wl.Xd() ^ 3418), (short) (C1607wl.Xd() ^ 22922)), clsArr);
            try {
                method.setAccessible(true);
                String networkOperatorName = ((TelephonyManager) method.invoke(context, objArr)).getNetworkOperatorName();
                if (networkOperatorName != null) {
                    if (networkOperatorName == null) {
                        networkOperatorName = Jg.Wd("6\u001aZ>R]\u0014", (short) (OY.Xd() ^ 32188), (short) (OY.Xd() ^ 397));
                    }
                    this.deviceCarrier = Utility.truncateString(networkOperatorName, 250);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            if (Global.DEBUG) {
                Utility.zlogW(LOGTAG, e3.toString());
            }
        }
    }

    private void updateConnInfo() throws Throwable {
        NetworkInfo networkInfo = getNetworkInfo();
        this.connectionType = getConnType(networkInfo);
        int i2 = AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType[this.connectionType.ordinal()];
        if (i2 == 1) {
            this.networkProtocol = "802.11x";
            return;
        }
        if (i2 == 2) {
            this.networkProtocol = getMobileNetworkProtocol(networkInfo);
        } else if (i2 != 3) {
            this.networkProtocol = null;
        } else {
            this.networkProtocol = "Ethernet";
        }
    }

    private void updateDeviceOrientation() throws Throwable {
        Context context = this.context;
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("{ar\u0005x*\u001c=\u0011U|\f\u0017h81.4\u0007;S2-", (short) (Od.Xd() ^ (-7688)), (short) (Od.Xd() ^ (-10634)))).getMethod(C1626yg.Ud("?^|\n\u0010\u000b\u0010@=9f~", (short) (OY.Xd() ^ 32462), (short) (OY.Xd() ^ 24288)), new Class[0]);
            try {
                method.setAccessible(true);
                this.deviceOrientation = ((Resources) method.invoke(context, objArr)).getConfiguration().orientation;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private void updateMemoryInfo() throws Throwable {
        ActivityManager activityMgr = getActivityMgr();
        if (activityMgr == null) {
            this.deviceMemoryFree = null;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityMgr.getMemoryInfo(memoryInfo);
        this.deviceMemoryFree = Integer.valueOf((int) (memoryInfo.availMem / 1048576));
    }

    public AppVersion getAppVersion() {
        return this.appVersion;
    }

    public long getCommonMetricsAge() {
        return this.timeLineProvider.now() - this.commonMetricsTimestamp;
    }

    public ConnectionType getConnType() {
        return getConnType(getNetworkInfo());
    }

    public ConnectionType getConnType(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable() || !networkInfo.isConnected()) {
            return ConnectionType.OFFLINE;
        }
        switch (networkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return ConnectionType.MOBILE;
            case 1:
            case 13:
                return ConnectionType.WIFI;
            case 6:
            case 7:
            case 8:
            default:
                return ConnectionType.OTHER;
            case 9:
                return ConnectionType.LAN;
        }
    }

    public String getCurrentActivityName() {
        return this.currentActivityName;
    }

    ScreenMetrics getInitialScreenMetrics() throws Throwable {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        Object[] objArr = {Ig.wd("\u0010_7(z;s", (short) (OY.Xd() ^ 5637))};
        Method method = Class.forName(EO.Od("+\u0010I3h8K,%\u0011\u0006u6A\u00176!K\u0002\u00048\u0003X", (short) (C1580rY.Xd() ^ (-31010)))).getMethod(C1593ug.zd("CBR2YTVHQ8KY^RMP", (short) (ZN.Xd() ^ 11577), (short) (ZN.Xd() ^ 1157)), Class.forName(C1561oA.Qd("\u0018\u000e\"\fW\u0015\t\u0015\rRv\u0017\u0014\n\u000e\u0006", (short) (Od.Xd() ^ (-9722)))));
        try {
            method.setAccessible(true);
            Display display = ((DisplayManager) method.invoke(context, objArr)).getDisplay(0);
            if (display != null) {
                return ActivityScreenMetricsCollector.calculateMetrics(display, this.deviceOrientation);
            }
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, C1561oA.od("6af\\S\u000e[[_\nOQUJ\u0005E\u0003FFF@SIPz\u001eBKGB6M", (short) (OY.Xd() ^ 17476)));
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public ScreenMetrics getScreenMetrics() {
        return this.screenMetrics;
    }

    public boolean isNetworkAvailable() throws Throwable {
        NetworkInfo networkInfo = getNetworkInfo();
        boolean z2 = networkInfo != null && (networkInfo.isAvailable() || networkInfo.isConnected());
        if (!z2 && Global.DEBUG) {
            Utility.zlogI(LOGTAG, "Network connection is not available");
        }
        return z2;
    }

    boolean screenMetricsAreValid(ScreenMetrics screenMetrics) {
        return screenMetrics != null && screenMetrics.getScreenHeight() > 0 && screenMetrics.getScreenWidth() > 0 && screenMetrics.getScreenDensityDpi() > 0 && screenMetrics.getScreenDensityFactor() != Float.POSITIVE_INFINITY && screenMetrics.getScreenDensityFactor() > 0.0f;
    }

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public void setCurrentActivityName(String str) {
        this.currentActivityName = str;
    }

    public void setGpsLocation(Location location) {
        this.mockDeviceLocation = location;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "GPS/Network getLastKnownLocation mockDeviceLocation:" + this.mockDeviceLocation);
        }
    }

    public void updateBasicMetrics() throws Throwable {
        Long lValueOf = Global.DEBUG ? Long.valueOf(this.timeLineProvider.now()) : 0L;
        updateCarrier();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("Basic metrics updated in %s ms", Long.valueOf(this.timeLineProvider.now() - lValueOf.longValue())));
        }
    }

    public void updateCommonMetrics() throws Throwable {
        Long lValueOf = Global.DEBUG ? Long.valueOf(this.timeLineProvider.now()) : 0L;
        updateConnInfo();
        updateDeviceOrientation();
        updateBatteryStrength();
        updateMemoryInfo();
        AppVersionTracker appVersionTracker = this.appVersionTracker;
        if (appVersionTracker != null) {
            AppVersion appVersionDetermineAppVersion = appVersionTracker.determineAppVersion();
            if (appVersionDetermineAppVersion.getVersionCode() < 1 || appVersionDetermineAppVersion.getVersionName() == null) {
                this.appVersion = null;
            } else {
                this.appVersion = appVersionDetermineAppVersion;
            }
        }
        this.commonMetricsTimestamp = this.timeLineProvider.now();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("Common metrics updated in %s ms", Long.valueOf(this.commonMetricsTimestamp - lValueOf.longValue())));
        }
    }

    public void updateScreenMetrics(ScreenMetrics screenMetrics) throws Throwable {
        if (screenMetricsAreValid(screenMetrics)) {
            this.screenMetrics = screenMetrics;
        } else {
            if (Global.DEBUG) {
                Utility.zlogW(LOGTAG, "Rejecting invalid screen metrics: " + screenMetrics);
            }
            this.screenMetrics = null;
        }
        updateDeviceOrientation();
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x00b0 A[PHI: r1 r5
  0x00b0: PHI (r1v9 'e' java.io.IOException) = (r1v7 'e' java.io.IOException), (r1v13 'e' java.io.IOException) binds: [B:124:0x0082, B:146:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:124:0x0082, B:146:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateVerboseMetrics() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.metrics.AndroidMetrics.updateVerboseMetrics():void");
    }
}
