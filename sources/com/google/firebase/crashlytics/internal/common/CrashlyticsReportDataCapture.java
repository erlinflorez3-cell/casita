package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.facebook.soloader.MinElf;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsReportDataCapture {
    private static final Map<String, Integer> ARCHITECTURES_BY_NAME;
    static final String GENERATOR;
    static final int GENERATOR_TYPE = 3;
    static final int REPORT_ANDROID_PLATFORM = 4;
    static final int SESSION_ANDROID_PLATFORM = 3;
    static final String SIGNAL_DEFAULT = "0";
    private final AppData appData;
    private final Context context;
    private final IdManager idManager;
    private final ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
    private final SettingsProvider settingsProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;

    static {
        HashMap map = new HashMap();
        ARCHITECTURES_BY_NAME = map;
        map.put("armeabi", 5);
        map.put(MinElf.ISA.ARM, 6);
        map.put(MinElf.ISA.AARCH64, 9);
        map.put(MinElf.ISA.X86, 0);
        map.put(MinElf.ISA.X86_64, 1);
        GENERATOR = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.2.1");
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        this.context = context;
        this.idManager = idManager;
        this.appData = appData;
        this.stackTraceTrimmingStrategy = stackTraceTrimmingStrategy;
        this.settingsProvider = settingsProvider;
    }

    private CrashlyticsReport.ApplicationExitInfo addBuildIdInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> listUnmodifiableList;
        if (!this.settingsProvider.getSettingsSync().featureFlagData.collectBuildIds || this.appData.buildIdInfoList.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (BuildIdInfo buildIdInfo : this.appData.buildIdInfoList) {
                arrayList.add(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder().setLibraryName(buildIdInfo.getLibraryName()).setArch(buildIdInfo.getArch()).setBuildId(buildIdInfo.getBuildId()).build());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReasonCode()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(applicationExitInfo.getTraceFile()).setBuildIdMappingForArch(listUnmodifiableList).build();
    }

    private CrashlyticsReport.Builder buildReportData() {
        return CrashlyticsReport.builder().setSdkVersion("19.2.1").setGmpAppId(this.appData.googleAppId).setInstallationUuid(this.idManager.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(this.idManager.getInstallIds().getFirebaseInstallationId()).setFirebaseAuthenticationToken(this.idManager.getInstallIds().getFirebaseAuthenticationToken()).setBuildVersion(this.appData.versionCode).setDisplayVersion(this.appData.versionName).setPlatform(4);
    }

    private static long ensureNonNegative(long j2) {
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    private static int getDeviceArchitecture() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = ARCHITECTURES_BY_NAME.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.BinaryImage populateBinaryImageData() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder().setBaseAddress(0L).setSize(0L).setName(this.appData.packageName).setUuid(this.appData.buildId).build();
    }

    private List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> populateBinaryImagesList() {
        return Collections.singletonList(populateBinaryImageData());
    }

    private CrashlyticsReport.Session.Event.Application populateEventApplicationData(int i2, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(Boolean.valueOf(applicationExitInfo.getImportance() != 100)).setCurrentProcessDetails(processDetailsFromApplicationExitInfo(applicationExitInfo)).setUiOrientation(i2).setExecution(populateExecutionData(applicationExitInfo)).build();
    }

    private CrashlyticsReport.Session.Event.Application populateEventApplicationData(int i2, TrimmedThrowableData trimmedThrowableData, Thread thread, int i3, int i4, boolean z2) {
        Boolean boolValueOf;
        CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails = this.processDetailsProvider.getCurrentProcessDetails(this.context);
        if (currentProcessDetails.getImportance() > 0) {
            boolValueOf = Boolean.valueOf(currentProcessDetails.getImportance() != 100);
        } else {
            boolValueOf = null;
        }
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(boolValueOf).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(this.processDetailsProvider.getAppProcessDetails(this.context)).setUiOrientation(i2).setExecution(populateExecutionData(trimmedThrowableData, thread, i3, i4, z2)).build();
    }

    private CrashlyticsReport.Session.Event.Device populateEventDeviceData(int i2) throws Throwable {
        BatteryState batteryState = BatteryState.get(this.context);
        Float batteryLevel = batteryState.getBatteryLevel();
        Double dValueOf = batteryLevel != null ? Double.valueOf(batteryLevel.doubleValue()) : null;
        int batteryVelocity = batteryState.getBatteryVelocity();
        boolean proximitySensorEnabled = CommonUtils.getProximitySensorEnabled(this.context);
        return CrashlyticsReport.Session.Event.Device.builder().setBatteryLevel(dValueOf).setBatteryVelocity(batteryVelocity).setProximityOn(proximitySensorEnabled).setOrientation(i2).setRamUsed(ensureNonNegative(CommonUtils.calculateTotalRamInBytes(this.context) - CommonUtils.calculateFreeRamInBytes(this.context))).setDiskUsed(CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Exception populateExceptionData(TrimmedThrowableData trimmedThrowableData, int i2, int i3) {
        return populateExceptionData(trimmedThrowableData, i2, i3, 0);
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Exception populateExceptionData(TrimmedThrowableData trimmedThrowableData, int i2, int i3, int i4) {
        String str = trimmedThrowableData.className;
        String str2 = trimmedThrowableData.localizedMessage;
        int i5 = 0;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace != null ? trimmedThrowableData.stacktrace : new StackTraceElement[0];
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (i4 >= i3) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.cause;
                i5++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder overflowCount = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder().setType(str).setReason(str2).setFrames(populateFramesList(stackTraceElementArr, i2)).setOverflowCount(i5);
        if (trimmedThrowableData2 != null && i5 == 0) {
            overflowCount.setCausedBy(populateExceptionData(trimmedThrowableData2, i2, i3, i4 + 1));
        }
        return overflowCount.build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution populateExecutionData(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setAppExitInfo(applicationExitInfo).setSignal(populateSignalData()).setBinaries(populateBinaryImagesList()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution populateExecutionData(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, int i3, boolean z2) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setThreads(populateThreadsList(trimmedThrowableData, thread, i2, z2)).setException(populateExceptionData(trimmedThrowableData, i2, i3)).setSignal(populateSignalData()).setBinaries(populateBinaryImagesList()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame populateFrameData(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) throws Throwable {
        long jMax;
        Class<?> cls = Class.forName(C1561oA.Kd("\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)\u0017\u001a#\r,\u001c\u001f\"\u0003+%.'18", (short) (FB.Xd() ^ 12128)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-12824));
        short sXd2 = (short) (C1499aX.Xd() ^ (-23590));
        int[] iArr = new int[":c\u001fn\"_EIyvJJ2s".length()];
        QB qb = new QB(":c\u001fn\"_EIyvJJ2s");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            long jIntValue = 0;
            if (((Boolean) method.invoke(stackTraceElement, objArr)).booleanValue()) {
                short sXd3 = (short) (FB.Xd() ^ 27348);
                int[] iArr2 = new int["]UkW%dZhb*Pr`clVuehkLtnwpz\u0002".length()];
                QB qb2 = new QB("]UkW%dZhb*Pr`clVuehkLtnwpz\u0002");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                try {
                    Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.vd("32B\u001b17/\u0019IB8<B", (short) (ZN.Xd() ^ 715)), new Class[0]).setAccessible(true);
                    jMax = Math.max(((Integer) r1.invoke(stackTraceElement, objArr2)).intValue(), 0L);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                jMax = 0;
            }
            StringBuilder sb = new StringBuilder();
            short sXd4 = (short) (OY.Xd() ^ 4501);
            short sXd5 = (short) (OY.Xd() ^ 10814);
            int[] iArr3 = new int["VL`J\u0016SGSK\u00115UABI1N<=>\u001dC;B9AF".length()];
            QB qb3 = new QB("VL`J\u0016SGSK\u00115UABI1N<=>\u001dC;B9AF");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                i4++;
            }
            Object[] objArr3 = new Object[0];
            Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(hg.Vd("0-;\t1%65\u000f!,#", (short) (C1499aX.Xd() ^ (-2873)), (short) (C1499aX.Xd() ^ (-8886))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend = sb.append((String) method2.invoke(stackTraceElement, objArr3)).append(C1561oA.ud("\n", (short) (C1499aX.Xd() ^ (-20164))));
                Object[] objArr4 = new Object[0];
                Method method3 = Class.forName(C1561oA.yd("\r\u0003\u001b\u0005T\u0012\n\u0016\u0012W\u007f \u0010\u0011\u001c\u0004%\u0013\u0018\u0019{\"\u001e% (1", (short) (FB.Xd() ^ 12050))).getMethod(C1561oA.Yd("PO_9RbW_U@TaZ", (short) (C1499aX.Xd() ^ (-7884))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    String string = sbAppend.append((String) method3.invoke(stackTraceElement, objArr4)).toString();
                    Object[] objArr5 = new Object[0];
                    Method method4 = Class.forName(Xg.qd("sk\u0002m;zp~x@f\tvy\u0003l\f{~\u0002b\u000b\u0005\u000e\u0007\u0011\u0018", (short) (C1607wl.Xd() ^ 23132), (short) (C1607wl.Xd() ^ 13464))).getMethod(Jg.Wd("\u0001./0Cw`z\u0002='", (short) (Od.Xd() ^ (-22810)), (short) (Od.Xd() ^ (-17291))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        String str = (String) method4.invoke(stackTraceElement, objArr5);
                        Object[] objArr6 = new Object[0];
                        Method method5 = Class.forName(ZO.xd("g\nTq\u0005B:;%cl`\u001a<\u0006j\tFsakDc\u0012\u001c&-", (short) (C1580rY.Xd() ^ (-13105)), (short) (C1580rY.Xd() ^ (-2820)))).getMethod(C1626yg.Ud("B`\b^Cyd~R.\u0015vN\u0001", (short) (C1607wl.Xd() ^ 27269), (short) (C1607wl.Xd() ^ 29719)), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            if (!((Boolean) method5.invoke(stackTraceElement, objArr6)).booleanValue()) {
                                Object[] objArr7 = new Object[0];
                                Method method6 = Class.forName(Ig.wd("\u001cMR\u001b<N]w\u0013\n5p\u0012\u001629\n\u0017Qg\bkvz\u0013T|", (short) (Od.Xd() ^ (-30675)))).getMethod(EO.Od("U#64DmF\"{\u0016aJ'", (short) (OY.Xd() ^ 11859)), new Class[0]);
                                try {
                                    method6.setAccessible(true);
                                    if (((Integer) method6.invoke(stackTraceElement, objArr7)).intValue() > 0) {
                                        Class<?> cls2 = Class.forName(C1561oA.Qd("_UiS\u001f\\P\\T\u001a>^JKR:WEFG&LDKBJO", (short) (Od.Xd() ^ (-31829))));
                                        Class<?>[] clsArr2 = new Class[0];
                                        Object[] objArr8 = new Object[0];
                                        short sXd6 = (short) (C1580rY.Xd() ^ (-31804));
                                        short sXd7 = (short) (C1580rY.Xd() ^ (-6954));
                                        int[] iArr4 = new int["43C\u001c:@8\"JC9=K".length()];
                                        QB qb4 = new QB("43C\u001c:@8\"JC9=K");
                                        int i5 = 0;
                                        while (qb4.YK()) {
                                            int iKK4 = qb4.KK();
                                            Xu xuXd4 = Xu.Xd(iKK4);
                                            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) - sXd7);
                                            i5++;
                                        }
                                        Method method7 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                                        try {
                                            method7.setAccessible(true);
                                            jIntValue = ((Integer) method7.invoke(stackTraceElement, objArr8)).intValue();
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e4) {
                                    throw e4.getCause();
                                }
                            }
                            return builder.setPc(jMax).setSymbol(string).setFile(str).setOffset(jIntValue).build();
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

    private List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> populateFramesList(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(populateFrameData(stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder().setImportance(i2)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private CrashlyticsReport.Session.Application populateSessionApplicationData() {
        return CrashlyticsReport.Session.Application.builder().setIdentifier(this.idManager.getAppIdentifier()).setVersion(this.appData.versionCode).setDisplayVersion(this.appData.versionName).setInstallationUuid(this.idManager.getInstallIds().getCrashlyticsInstallId()).setDevelopmentPlatform(this.appData.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.appData.developmentPlatformProvider.getDevelopmentPlatformVersion()).build();
    }

    private CrashlyticsReport.Session populateSessionData(String str, long j2) {
        return CrashlyticsReport.Session.builder().setStartedAt(j2).setIdentifier(str).setGenerator(GENERATOR).setApp(populateSessionApplicationData()).setOs(populateSessionOperatingSystemData()).setDevice(populateSessionDeviceData()).setGeneratorType(3).build();
    }

    private CrashlyticsReport.Session.Device populateSessionDeviceData() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int deviceArchitecture = getDeviceArchitecture();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jCalculateTotalRamInBytes = CommonUtils.calculateTotalRamInBytes(this.context);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIsEmulator = CommonUtils.isEmulator();
        int deviceState = CommonUtils.getDeviceState();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.builder().setArch(deviceArchitecture).setModel(Build.MODEL).setCores(iAvailableProcessors).setRam(jCalculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(str).setModelClass(Build.PRODUCT).build();
    }

    private CrashlyticsReport.Session.OperatingSystem populateSessionOperatingSystemData() {
        return CrashlyticsReport.Session.OperatingSystem.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(CommonUtils.isRooted()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Signal populateSignalData() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread populateThreadData(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return populateThreadData(thread, stackTraceElementArr, 0);
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread populateThreadData(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread.getName()).setImportance(i2).setFrames(populateFramesList(stackTraceElementArr, i2)).build();
    }

    private List<CrashlyticsReport.Session.Event.Application.Execution.Thread> populateThreadsList(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(populateThreadData(thread, trimmedThrowableData.stacktrace, i2));
        if (z2) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(populateThreadData(key, this.stackTraceTrimmingStrategy.getTrimmedStackTrace(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsFromApplicationExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return this.processDetailsProvider.buildProcessDetails(applicationExitInfo.getProcessName(), applicationExitInfo.getPid(), applicationExitInfo.getImportance());
    }

    public CrashlyticsReport.Session.Event captureAnrEventData(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (C1633zX.Xd() ^ (-24162)))).getMethod(C1561oA.Kd("\u001f\u001e.\r!0-42$'6", (short) (C1633zX.Xd() ^ (-14891))), new Class[0]);
        try {
            method.setAccessible(true);
            int i2 = ((Resources) method.invoke(context, objArr)).getConfiguration().orientation;
            return CrashlyticsReport.Session.Event.builder().setType(Wg.Zd("\u0003qF", (short) (Od.Xd() ^ (-16288)), (short) (Od.Xd() ^ (-16102)))).setTimestamp(applicationExitInfo.getTimestamp()).setApp(populateEventApplicationData(i2, addBuildIdInfo(applicationExitInfo))).setDevice(populateEventDeviceData(i2)).build();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public CrashlyticsReport.Session.Event captureEventData(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z2) throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("\u0018&\u001d,*%!k\"//6(29s\n77>0DA", (short) (C1580rY.Xd() ^ (-19869)))).getMethod(Wg.vd("\u0013\u0010\u001ez\r\u001a\u0015\u001a&\u0016\u0017$", (short) (C1580rY.Xd() ^ (-14823))), new Class[0]);
        try {
            method.setAccessible(true);
            int i4 = ((Resources) method.invoke(context, objArr)).getConfiguration().orientation;
            return CrashlyticsReport.Session.Event.builder().setType(str).setTimestamp(j2).setApp(populateEventApplicationData(i4, TrimmedThrowableData.makeTrimmedThrowableData(th, this.stackTraceTrimmingStrategy), thread, i2, i3, z2)).setDevice(populateEventDeviceData(i4)).build();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public CrashlyticsReport captureReportData(String str, long j2) {
        return buildReportData().setSession(populateSessionData(str, j2)).build();
    }
}
