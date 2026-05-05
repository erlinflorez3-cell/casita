package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import io.sentry.DateUtils;
import io.sentry.IConnectionStatusProvider;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.DeviceOrientations;
import io.sentry.android.core.internal.util.RootChecker;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceInfoUtil {
    private static volatile DeviceInfoUtil instance = null;
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final Boolean isEmulator;
    private final SentryAndroidOptions options;
    private final OperatingSystem os;
    private final ContextUtils.SideLoadedInfo sideLoadedInfo;
    private final Long totalMem;

    /* JADX INFO: renamed from: io.sentry.android.core.DeviceInfoUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[IConnectionStatusProvider.ConnectionStatus.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[IConnectionStatusProvider.ConnectionStatus.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DeviceInfoUtil(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.context = context;
        this.options = sentryAndroidOptions;
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(sentryAndroidOptions.getLogger());
        this.buildInfoProvider = buildInfoProvider;
        CpuInfoUtils.getInstance().readMaxFrequencies();
        this.os = retrieveOperatingSystemInformation();
        this.isEmulator = buildInfoProvider.isEmulator();
        this.sideLoadedInfo = ContextUtils.retrieveSideLoadedInfo(context, sentryAndroidOptions.getLogger(), buildInfoProvider);
        ActivityManager.MemoryInfo memInfo = ContextUtils.getMemInfo(context, sentryAndroidOptions.getLogger());
        if (memInfo != null) {
            this.totalMem = Long.valueOf(memInfo.totalMem);
        } else {
            this.totalMem = null;
        }
    }

    private Intent getBatteryIntent() {
        return ContextUtils.registerReceiver(this.context, this.buildInfoProvider, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public static Float getBatteryLevel(Intent intent, SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return null;
            }
            return Float.valueOf((intExtra / intExtra2) * 100.0f);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    private Float getBatteryTemperature(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    private Date getBootTime() {
        try {
            return DateUtils.getDateTime(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, e2, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String getDeviceId() {
        try {
            return Installation.id(this.context);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private File getExternalStorageDep(File file) throws Throwable {
        Context context = this.context;
        short sXd = (short) (ZN.Xd() ^ 911);
        int[] iArr = new int["frgtpic,`kin^fk$8cafVhc".length()];
        QB qb = new QB("frgtpic,`kin^fk$8cafVhc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (OY.Xd() ^ 30666);
        int[] iArr2 = new int["\r\u0005\u0017\u0003T\u0014\u0006\u0014\u0012Y{\u001e!\u0019\u001b\u0015".length()];
        QB qb2 = new QB("\r\u0005\u0017\u0003T\u0014\u0006\u0014\u0012Y{\u001e!\u0019\u001b\u0015");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {null};
        Method method = cls.getMethod(C1561oA.Yd("edtFzwiwthtOswq\u0001Rx\u0003\u0005", (short) (Od.Xd() ^ (-5875))), clsArr);
        try {
            method.setAccessible(true);
            File[] fileArr = (File[]) method.invoke(context, objArr);
            if (fileArr != null) {
                String absolutePath = file != null ? file.getAbsolutePath() : null;
                for (File file2 : fileArr) {
                    if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                        return file2;
                    }
                }
            } else {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.INFO;
                short sXd3 = (short) (C1580rY.Xd() ^ (-31405));
                short sXd4 = (short) (C1580rY.Xd() ^ (-28813));
                int[] iArr3 = new int["\u0003%+W))./& +%`62c7+(,h10@\u0012FC5C@4@\u001b?C=L\u001eDNP".length()];
                QB qb3 = new QB("\u0003%+W))./& +%`62c7+(,h10@\u0012FC5C@4@\u001b?C=L\u001eDNP");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                    i4++;
                }
                logger.log(sentryLevel, new String(iArr3, 0, i4), new Object[0]);
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private StatFs getExternalStorageStat(File file) {
        try {
            File externalStorageDep = getExternalStorageDep(file);
            if (externalStorageDep != null) {
                return new StatFs(externalStorageDep.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.options.getLogger().log(SentryLevel.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static DeviceInfoUtil getInstance(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (instance == null) {
            synchronized (DeviceInfoUtil.class) {
                if (instance == null) {
                    instance = new DeviceInfoUtil(ContextUtils.getApplicationContext(context), sentryAndroidOptions);
                }
            }
        }
        return instance;
    }

    private Device.DeviceOrientation getOrientation() {
        Device.DeviceOrientation orientation;
        try {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("zzghL9+g\u0004\u0003xqIEBn+J@-\u0015\u001b\u000e", (short) (C1607wl.Xd() ^ 24356), (short) (C1607wl.Xd() ^ 21204))).getMethod(ZO.xd("CZ\u0001|3[Q\u0004l\u0007\u0015~", (short) (C1607wl.Xd() ^ 2428), (short) (C1607wl.Xd() ^ 25535)), new Class[0]);
            try {
                method.setAccessible(true);
                orientation = DeviceOrientations.getOrientation(((Resources) method.invoke(context, objArr)).getConfiguration().orientation);
                if (orientation == null) {
                    try {
                        this.options.getLogger().log(SentryLevel.INFO, C1626yg.Ud("$O(F\u00072vl\u001c6\u0010F<\u001aDo7}Zyno7\u00142OC\u001f\u001b3A\u001e]h,;S\u0011F\u0014\u0017?(AkH{\b(\u000b\rb\u001bu\u0017TC='\u000fudBf`\u001fjsdQoiU5", (short) (C1633zX.Xd() ^ (-25150)), (short) (C1633zX.Xd() ^ (-1728))), new Object[0]);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        this.options.getLogger().log(SentryLevel.ERROR, Ig.wd("L(Zz-.M#SC>\u001dK\u0006>\u001daj\u001cRNY.)\u0007_G\u007fhO-\n)", (short) (FB.Xd() ^ 14827)), th);
                        return orientation;
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            th = th2;
            orientation = null;
        }
        return orientation;
    }

    private TimeZone getTimeZone() throws Throwable {
        if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("=\u001bRIU$3\u001d\u0015\u0006zf&1'G1W\u000fl oA", (short) (Od.Xd() ^ (-13174)))).getMethod(C1561oA.Qd("\u0003\u007f\u000ej|\n\u0005\n\u0006uv\u0004", (short) (ZN.Xd() ^ 14228)), new Class[0]);
            try {
                method.setAccessible(true);
                LocaleList locales = ((Resources) method.invoke(context, objArr)).getConfiguration().getLocales();
                if (!locales.isEmpty()) {
                    return Calendar.getInstance(locales.get(0)).getTimeZone();
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long getTotalExternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    private Long getTotalInternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    private Long getUnusedExternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    private Long getUnusedInternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    public static Boolean isCharging(Intent intent, SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z2 = true;
            if (intExtra != 1 && intExtra != 2) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    public static void resetInstance() {
        instance = null;
    }

    private OperatingSystem retrieveOperatingSystemInformation() {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setName(EventMetricsAggregator.OS_NAME);
        operatingSystem.setVersion(Build.VERSION.RELEASE);
        operatingSystem.setBuild(Build.DISPLAY);
        String kernelVersion = ContextUtils.getKernelVersion(this.options.getLogger());
        if (kernelVersion != null) {
            operatingSystem.setKernelVersion(kernelVersion);
        }
        if (this.options.isEnableRootCheck()) {
            operatingSystem.setRooted(Boolean.valueOf(new RootChecker(this.context, this.buildInfoProvider, this.options.getLogger()).isDeviceRooted()));
        }
        return operatingSystem;
    }

    private void setDeviceIO(Device device, boolean z2) throws Throwable {
        Intent batteryIntent = getBatteryIntent();
        if (batteryIntent != null) {
            device.setBatteryLevel(getBatteryLevel(batteryIntent, this.options));
            device.setCharging(isCharging(batteryIntent, this.options));
            device.setBatteryTemperature(getBatteryTemperature(batteryIntent));
        }
        int i2 = AnonymousClass1.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[this.options.getConnectionStatusProvider().getConnectionStatus().ordinal()];
        device.setOnline(i2 != 1 ? i2 != 2 ? null : true : false);
        ActivityManager.MemoryInfo memInfo = ContextUtils.getMemInfo(this.context, this.options.getLogger());
        if (memInfo != null && z2) {
            device.setFreeMemory(Long.valueOf(memInfo.availMem));
            device.setLowMemory(Boolean.valueOf(memInfo.lowMemory));
        }
        Context context = this.context;
        Object[] objArr = {null};
        Method method = Class.forName(C1593ug.zd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (ZN.Xd() ^ 4214), (short) (ZN.Xd() ^ 676))).getMethod(C1561oA.Kd("_^n@tqcqnbnImqkzLr|", (short) (C1607wl.Xd() ^ 26846)), Class.forName(C1561oA.od("3)='r0$0(m\u00122/%)!", (short) (C1607wl.Xd() ^ 24745))));
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            if (file != null) {
                StatFs statFs = new StatFs(file.getPath());
                device.setStorageSize(getTotalInternalStorage(statFs));
                device.setFreeStorage(getUnusedInternalStorage(statFs));
            }
            StatFs externalStorageStat = getExternalStorageStat(file);
            if (externalStorageStat != null) {
                device.setExternalStorageSize(getTotalExternalStorage(externalStorageStat));
                device.setExternalFreeStorage(getUnusedExternalStorage(externalStorageStat));
            }
            if (device.getConnectionType() == null) {
                device.setConnectionType(this.options.getConnectionStatusProvider().getConnectionType());
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Device collectDeviceInformation(boolean z2, boolean z3) throws Throwable {
        Device device = new Device();
        if (this.options.isSendDefaultPii()) {
            device.setName(ContextUtils.getDeviceName(this.context));
        }
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(ContextUtils.getFamily(this.options.getLogger()));
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        device.setArchs(ContextUtils.getArchitectures(this.buildInfoProvider));
        device.setOrientation(getOrientation());
        Boolean bool = this.isEmulator;
        if (bool != null) {
            device.setSimulator(bool);
        }
        DisplayMetrics displayMetrics = ContextUtils.getDisplayMetrics(this.context, this.options.getLogger());
        if (displayMetrics != null) {
            device.setScreenWidthPixels(Integer.valueOf(displayMetrics.widthPixels));
            device.setScreenHeightPixels(Integer.valueOf(displayMetrics.heightPixels));
            device.setScreenDensity(Float.valueOf(displayMetrics.density));
            device.setScreenDpi(Integer.valueOf(displayMetrics.densityDpi));
        }
        device.setBootTime(getBootTime());
        device.setTimezone(getTimeZone());
        if (device.getId() == null) {
            device.setId(getDeviceId());
        }
        Locale locale = Locale.getDefault();
        if (device.getLanguage() == null) {
            device.setLanguage(locale.getLanguage());
        }
        if (device.getLocale() == null) {
            device.setLocale(locale.toString());
        }
        List<Integer> maxFrequencies = CpuInfoUtils.getInstance().readMaxFrequencies();
        if (!maxFrequencies.isEmpty()) {
            device.setProcessorFrequency(Double.valueOf(((Integer) Collections.max(maxFrequencies)).doubleValue()));
            device.setProcessorCount(Integer.valueOf(maxFrequencies.size()));
        }
        device.setMemorySize(this.totalMem);
        if (z2 && this.options.isCollectAdditionalContext()) {
            setDeviceIO(device, z3);
        }
        return device;
    }

    public OperatingSystem getOperatingSystem() {
        return this.os;
    }

    public ContextUtils.SideLoadedInfo getSideLoadedInfo() {
        return this.sideLoadedInfo;
    }

    public Long getTotalMemory() {
        return this.totalMem;
    }
}
