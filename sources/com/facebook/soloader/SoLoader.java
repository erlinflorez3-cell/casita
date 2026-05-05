package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import com.facebook.soloader.nativeloader.NativeLoader;
import com.facebook.soloader.nativeloader.SystemDelegate;
import com.facebook.soloader.observer.ObserverHolder;
import com.facebook.soloader.recovery.DefaultRecoveryStrategyFactory;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.recovery.RecoveryStrategyFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
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
public class SoLoader {
    static final boolean DEBUG = false;
    public static final int SOLOADER_ALLOW_ASYNC_INIT = 2;
    public static final int SOLOADER_DISABLE_BACKUP_SOSOURCE = 8;
    public static final int SOLOADER_DISABLE_FS_SYNC_JOB = 256;

    @Deprecated
    public static final int SOLOADER_DONT_TREAT_AS_SYSTEMAPP = 32;
    public static final int SOLOADER_ENABLE_BACKUP_SOSOURCE_DSONOTFOUND_ERROR_RECOVERY = 2048;
    public static final int SOLOADER_ENABLE_BASE_APK_SPLIT_SOURCE = 1024;

    @Deprecated
    public static final int SOLOADER_ENABLE_DIRECT_SOSOURCE = 64;
    public static final int SOLOADER_ENABLE_EXOPACKAGE = 1;
    public static final int SOLOADER_ENABLE_SYSTEMLOAD_WRAPPER_SOSOURCE = 512;
    public static final int SOLOADER_EXPLICITLY_ENABLE_BACKUP_SOSOURCE = 128;
    public static final int SOLOADER_IMPLICIT_DEPENDENCIES_TEST = 4096;
    public static final int SOLOADER_LOOK_IN_ZIP = 4;
    public static final int SOLOADER_SKIP_MERGED_JNI_ONLOAD = 16;
    public static final String SO_STORE_NAME_MAIN = "lib-main";
    public static final String TAG = "SoLoader";
    public static final String VERSION = "0.12.1";
    private static int sFlags = 0;

    @Nullable
    static SoFileLoader sSoFileLoader = null;
    private static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();

    @Nullable
    static Context sApplicationContext = null;

    @Nullable
    private static volatile SoSource[] sSoSources = null;
    private static final AtomicInteger sSoSourcesVersion = new AtomicInteger(0);

    @Nullable
    private static RecoveryStrategyFactory sRecoveryStrategyFactory = null;
    private static final Set<String> sLoadedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Map<String, Object> sLoadingLibraries = new HashMap();
    private static final Set<String> sLoadedAndJniInvoked = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Map<String, Object> sInvokingJniForLibrary = new HashMap();

    @Nullable
    private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;
    private static boolean isEnabled = true;
    private static int sAppType = 0;

    @Nullable
    private static ExternalSoMapping externalSoMapping = null;
    static final boolean SYSTRACE_LIBRARY_LOADING = true;

    interface AppType {
        public static final int SYSTEM_APP = 2;
        public static final int THIRD_PARTY_APP = 1;
        public static final int UNSET = 0;
        public static final int UPDATED_SYSTEM_APP = 3;
    }

    static class TestOnlyUtils {
        TestOnlyUtils() {
        }

        static void resetStatus() {
            synchronized (SoLoader.class) {
                SoLoader.sLoadedLibraries.clear();
                SoLoader.sLoadedAndJniInvoked.clear();
                SoLoader.sLoadingLibraries.clear();
                SoLoader.sSoFileLoader = null;
                SoLoader.sApplicationContext = null;
                RecoveryStrategyFactory unused = SoLoader.sRecoveryStrategyFactory = null;
                ObserverHolder.resetObserversForTestsOnly();
            }
            setSoSources(null);
        }

        static void setContext(Context context) {
            SoLoader.sApplicationContext = context;
        }

        static void setSoFileLoader(SoFileLoader soFileLoader) {
            SoLoader.sSoFileLoader = soFileLoader;
        }

        static void setSoSources(SoSource[] soSourceArr) {
            SoLoader.sSoSourcesLock.writeLock().lock();
            try {
                SoSource[] unused = SoLoader.sSoSources = soSourceArr;
                SoLoader.sSoSourcesVersion.getAndIncrement();
            } finally {
                SoLoader.sSoSourcesLock.writeLock().unlock();
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        WrongAbiError(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.getSupportedAbis()) + " error: " + str);
            initCause(th);
        }
    }

    private static void addApplicationSoSource(ArrayList<SoSource> arrayList, int i2) {
        ApplicationSoSource applicationSoSource = new ApplicationSoSource(sApplicationContext, i2);
        LogUtil.d(TAG, "Adding application source: " + applicationSoSource.toString());
        arrayList.add(0, applicationSoSource);
    }

    private static void addBackupSoSource(Context context, ArrayList<SoSource> arrayList, boolean z2) throws IOException {
        if ((-1) - (((-1) - sFlags) | ((-1) - 8)) != 0) {
            return;
        }
        arrayList.add(0, new BackupSoSource(context, SO_STORE_NAME_MAIN, !z2));
    }

    private static void addDirectApkSoSource(Context context, ArrayList<SoSource> arrayList) {
        DirectApkSoSource directApkSoSource = new DirectApkSoSource(context);
        LogUtil.d(TAG, "validating/adding directApk source: " + directApkSoSource.toString());
        if (directApkSoSource.isValid()) {
            arrayList.add(0, directApkSoSource);
        }
    }

    private static void addSystemLibSoSource(ArrayList<SoSource> arrayList) {
        String str = SysUtil.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + Global.COLON + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(Global.COLON)))) {
            LogUtil.d(TAG, "adding system library source: " + str3);
            arrayList.add(new DirectorySoSource(new File(str3), 2));
        }
    }

    private static void addSystemLoadWrapperSoSource(Context context, ArrayList<SoSource> arrayList) {
        SystemLoadWrapperSoSource systemLoadWrapperSoSource = new SystemLoadWrapperSoSource();
        LogUtil.d(TAG, "adding systemLoadWrapper source: " + systemLoadWrapperSoSource);
        arrayList.add(0, systemLoadWrapperSoSource);
    }

    public static boolean areSoSourcesAbisSupported() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources != null) {
                String[] supportedAbis = SysUtil.getSupportedAbis();
                for (SoSource soSource : sSoSources) {
                    for (String str : soSource.getSoSourceAbis()) {
                        boolean zEquals = false;
                        for (int i2 = 0; i2 < supportedAbis.length && !zEquals; i2++) {
                            zEquals = str.equals(supportedAbis[i2]);
                        }
                        if (!zEquals) {
                            LogUtil.e(TAG, "abi not supported: " + str);
                            reentrantReadWriteLock = sSoSourcesLock;
                        }
                    }
                }
                sSoSourcesLock.readLock().unlock();
                return true;
            }
            reentrantReadWriteLock.readLock().unlock();
            return false;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    private static void assertInitialized() {
        if (!isInitialized()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    public static SoSource[] cloneSoSources() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            SoSource[] soSourceArr = sSoSources == null ? new SoSource[0] : (SoSource[]) sSoSources.clone();
            reentrantReadWriteLock.readLock().unlock();
            return soSourceArr;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    public static void deinitForTest() {
        TestOnlyUtils.setSoSources(null);
    }

    private static void doLoadLibraryBySoName(String str, @Nullable String str2, int i2, @Nullable StrictMode.ThreadPolicy threadPolicy) throws UnsatisfiedLinkError {
        boolean z2;
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                LogUtil.e(TAG, "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z2 = true;
            } else {
                z2 = false;
            }
            if (SYSTRACE_LIBRARY_LOADING) {
                if (str2 != null) {
                    Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (SoSource soSource : sSoSources) {
                            if (loadLibraryFromSoSource(soSource, str, i2, threadPolicy)) {
                                if (z2) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw SoLoaderDSONotFoundError.create(str, sApplicationContext, sSoSources);
                    } catch (IOException e2) {
                        SoLoaderULError soLoaderULError = new SoLoaderULError(str, e2.toString());
                        soLoaderULError.initCause(e2);
                        throw soLoaderULError;
                    }
                } finally {
                }
            } finally {
                if (SYSTRACE_LIBRARY_LOADING) {
                    if (str2 != null) {
                        Api18TraceUtils.endSection();
                    }
                    Api18TraceUtils.endSection();
                }
                if (z2) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    private static int getAppType(@Nullable Context context) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = sAppType;
        if (i2 != 0) {
            return i2;
        }
        String strZd = C1593ug.zd("LiGk^bdr", (short) (C1633zX.Xd() ^ (-3264)), (short) (C1633zX.Xd() ^ (-2316)));
        int i3 = 1;
        if (context == null) {
            LogUtil.d(strZd, C1561oA.od("P[Y^N`[\u0006NW\u0003PVLK\n|B<FE:89@sGAp$\u0017\u0017\u001f\u0010*\u001a\n\u001a\u001b\u001f$\u0005\u0013\u0012`!/.\u00115+\u001f", (short) (Od.Xd() ^ (-8474))));
            return 1;
        }
        Class<?> cls = Class.forName(C1561oA.Kd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (C1633zX.Xd() ^ (-15402))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 11633);
        short sXd2 = (short) (OY.Xd() ^ 4491);
        int[] iArr = new int["\u0003pf<ZB#\u0013\u0002xy'\u0004kCbOK".length()];
        QB qb = new QB("\u0003pf<ZB#\u0013\u0002xy'\u0004kCbOK");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(((i4 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strXd = C1561oA.Xd("*8/><73}4AAH:DK\u0006IG\t\u001dMNKIDCWMTT0VOY", (short) (ZN.Xd() ^ 25827));
            String strVd = Wg.vd("MTJQ^", (short) (C1580rY.Xd() ^ (-21642)));
            try {
                Class<?> cls2 = Class.forName(strXd);
                Field field = 1 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            if ((-1) - (((-1) - ((Integer) obj).intValue()) | ((-1) - 1)) != 0) {
                String strKd = Qg.kd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[\u001d\u0019Xj\u0019\u0018\u0013\u000f\b\u0005\u0017\u000b\u0010\u000eg\f\u0003\u000b", (short) (OY.Xd() ^ 7615), (short) (OY.Xd() ^ 5358));
                String strVd2 = hg.Vd("bg[`k", (short) (C1633zX.Xd() ^ (-15270)), (short) (C1633zX.Xd() ^ (-3157)));
                try {
                    Class<?> cls3 = Class.forName(strKd);
                    Field field2 = 1 != 0 ? cls3.getField(strVd2) : cls3.getDeclaredField(strVd2);
                    field2.setAccessible(true);
                    obj2 = field2.get(applicationInfo);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                int iIntValue = ((Integer) obj2).intValue();
                i3 = (iIntValue + 128) - (iIntValue | 128) != 0 ? 3 : 2;
            }
            StringBuilder sb = new StringBuilder(C1561oA.ud("\u000532-)\"\u001f1%*(\u0002&\u001d%b\u001a\u001f\u0013\u0018#N\u0017 eJ", (short) (OY.Xd() ^ 32184)));
            String strYd = C1561oA.yd("\u001b) /-($n\u0015\"\")\u001b%,f\u001a\u0018Ym\u001e\u001f\u001c\u001a\u0005\u0004\u0018\u000e\u0015\u0015p\u0017\u007f\n", (short) (ZN.Xd() ^ 24840));
            String strYd2 = C1561oA.Yd("ovls\u0001", (short) (C1607wl.Xd() ^ 13550));
            try {
                Class<?> cls4 = Class.forName(strYd);
                Field field3 = 1 != 0 ? cls4.getField(strYd2) : cls4.getDeclaredField(strYd2);
                field3.setAccessible(true);
                obj3 = field3.get(applicationInfo);
            } catch (Throwable th3) {
                obj3 = null;
            }
            LogUtil.d(strZd, sb.append(((Integer) obj3).intValue()).append(Xg.qd("P\u0013#$\t/'\u001dX#.u\\", (short) (ZN.Xd() ^ 29480), (short) (ZN.Xd() ^ 19884))).append(i3).toString());
            return i3;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int getApplicationSoSourceFlags() {
        int i2 = sAppType;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    @Nullable
    public static String[] getLibraryDependencies(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            String[] libraryDependencies = null;
            if (sSoSources != null) {
                int i2 = 0;
                while (libraryDependencies == null) {
                    if (i2 >= sSoSources.length) {
                        break;
                    }
                    libraryDependencies = sSoSources[i2].getLibraryDependencies(str);
                    i2++;
                }
            }
            return libraryDependencies;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    @Nullable
    public static String getLibraryPath(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            String libraryPath = null;
            if (sSoSources != null) {
                int i2 = 0;
                while (libraryPath == null) {
                    if (i2 >= sSoSources.length) {
                        break;
                    }
                    libraryPath = sSoSources[i2].getLibraryPath(str);
                    i2++;
                }
            }
            return libraryPath;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static int getLoadedLibrariesCount() {
        return sLoadedLibraries.size();
    }

    @Nullable
    private static synchronized RecoveryStrategy getRecoveryStrategy() {
        RecoveryStrategyFactory recoveryStrategyFactory;
        recoveryStrategyFactory = sRecoveryStrategyFactory;
        return recoveryStrategyFactory == null ? null : recoveryStrategyFactory.get();
    }

    @Nullable
    public static File getSoFile(String str) {
        File soFileByName;
        ExternalSoMapping externalSoMapping2 = externalSoMapping;
        String strMapLibName = externalSoMapping2 != null ? externalSoMapping2.mapLibName(str) : MergedSoMapping.mapLibName(str);
        if (strMapLibName != null) {
            str = strMapLibName;
        }
        String strMapLibraryName = System.mapLibraryName(str);
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                for (int i2 = 0; i2 < sSoSources.length; i2++) {
                    try {
                        soFileByName = sSoSources[i2].getSoFileByName(strMapLibraryName);
                    } catch (IOException unused) {
                    }
                    if (soFileByName != null) {
                        return soFileByName;
                    }
                }
            }
            sSoSourcesLock.readLock().unlock();
            return null;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static int getSoSourcesVersion() {
        return sSoSourcesVersion.get();
    }

    public static void init(Context context, int i2) throws IOException {
        init(context, i2, null);
    }

    public static void init(Context context, int i2, @Nullable SoFileLoader soFileLoader) throws IOException {
        if (isInitialized()) {
            LogUtil.w(TAG, "SoLoader already initialized");
            return;
        }
        LogUtil.w(TAG, "Initializing SoLoader: " + i2);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zInitEnableConfig = initEnableConfig(context);
            isEnabled = zInitEnableConfig;
            if (zInitEnableConfig) {
                int appType = getAppType(context);
                sAppType = appType;
                if ((i2 + 128) - (128 | i2) == 0 && SysUtil.isSupportedDirectLoad(context, appType)) {
                    i2 = (i2 + 8) - (i2 & 8);
                }
                initSoLoader(context, soFileLoader, i2);
                initSoSources(context, i2);
                LogUtil.v(TAG, "Init SoLoader delegate");
                NativeLoader.initIfUninitialized(new NativeLoaderToSoLoaderDelegate());
            } else {
                initDummySoSource();
                LogUtil.v(TAG, "Init System Loader delegate");
                NativeLoader.initIfUninitialized(new SystemDelegate());
            }
            LogUtil.w(TAG, "SoLoader initialized: " + i2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void init(Context context, @Nullable ExternalSoMapping externalSoMapping2) throws IOException {
        synchronized (SoLoader.class) {
            externalSoMapping = externalSoMapping2;
        }
        init(context, 0);
    }

    public static void init(Context context, boolean z2) {
        try {
            init(context, z2 ? 1 : 0, null);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void initDummySoSource() {
        if (sSoSources != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (sSoSources != null) {
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                sSoSources = new SoSource[0];
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    private static boolean initEnableConfig(Context context) throws Throwable {
        String str;
        Object[] objArr;
        Method method;
        if (externalSoMapping != null) {
            return true;
        }
        Bundle bundle = null;
        short sXd = (short) (OY.Xd() ^ 12958);
        short sXd2 = (short) (OY.Xd() ^ 28213);
        int[] iArr = new int["MT$u:\nl\f'\u0001Q1sX E2D\u000bT\u001f\u0006y".length()];
        QB qb = new QB("MT$u:\nl\f'\u0001Q1sX E2D\u000bT\u001f\u0006y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        try {
            objArr = new Object[0];
            method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("\u000e];E\u0014'F>\u0011u>g\u007fb", (short) (Od.Xd() ^ (-229)), (short) (Od.Xd() ^ (-29136))), new Class[0]);
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        try {
            method.setAccessible(true);
            str = (String) method.invoke(context, objArr);
            try {
                Class<?> cls = Class.forName(C1626yg.Ud("\u0010r03X\u0006qu_\u0005a1St^2TOB:\u0012'\u0015", (short) (ZN.Xd() ^ 17538), (short) (ZN.Xd() ^ 19686)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (ZN.Xd() ^ 26161);
                int[] iArr2 = new int["[2OF/TD*Q\u0003l\u001f]F|\u0004h".length()];
                QB qb2 = new QB("[2OF/TD*Q\u0003l\u001f]F|\u0004h");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(EO.Od("J\u0007^PM|\u0010\u0019qmbRr}$C;>\u0016D\u0019b\u0005~\u0018FO=Hl\u000b0]", (short) (C1580rY.Xd() ^ (-5722))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(C1561oA.Qd("zp\u0005n:wkwo5Yyvlph", (short) (FB.Xd() ^ 19311)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls2.getMethod(C1593ug.zd("=<L\u001aJKHFA@TJQQ-SLV", (short) (C1633zX.Xd() ^ (-17642)), (short) (C1633zX.Xd() ^ (-31795))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        bundle = ((ApplicationInfo) method3.invoke(packageManager, objArr3)).metaData;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (Exception e5) {
                e = e5;
                short sXd4 = (short) (C1607wl.Xd() ^ 4908);
                int[] iArr3 = new int["e}s\u0006|pm}mk&nwvwf vgqd\u001bjZ[bW\\Y\u0013_R^PUR^\u000b\u0012".length()];
                QB qb3 = new QB("e}s\u0006|pm}mk&nwvwf vgqd\u001bjZ[bW\\Y\u0013_R^PUR^\u000b\u0012");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                LogUtil.w(Wg.Zd("cy\t:4YxF", (short) (C1633zX.Xd() ^ (-11887)), (short) (C1633zX.Xd() ^ (-18761))), new String(iArr3, 0, i4) + str + C1561oA.Kd("\u000f", (short) (FB.Xd() ^ 31738)), e);
            }
            return bundle == null || bundle.getBoolean(C1561oA.Xd("Zgf(a]`caopm1wtrvimo}:r|pr}ww", (short) (Od.Xd() ^ (-22969))), true);
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    private static synchronized void initSoLoader(@Nullable Context context, @Nullable SoFileLoader soFileLoader, int i2) {
        Object obj;
        String strVd = Wg.vd("YffmWkh#UTd2Z[XVih|rqqGtlseyn\u001bnb\u000b\r\u000b\bww4\u0004\u0004{|=*s{y\u000b\u0011\u0017\u0011B\u0016\n\f\u0004\u0012\u0006\u0010}\u0001<\u0012&W(,\u001c\u001b\u001e$\u0010\u001cP\u0015\u001a\u001a!\u0013?<v\u000b341/\"!5+**\u0010-*GNL69t<0<=4,/8A\u0007\\X$\u0003", (short) (C1580rY.Xd() ^ (-8046)));
        synchronized (SoLoader.class) {
            if (context != null) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Qg.kd("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019Mxv{k}x", (short) (C1499aX.Xd() ^ (-7078)), (short) (C1499aX.Xd() ^ (-22878)))).getMethod(hg.Vd("+(6\u00020/*&\u001f\u001c.\"'%x$\"'\u0017)$", (short) (C1633zX.Xd() ^ (-2523)), (short) (C1633zX.Xd() ^ (-19112))), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    if (context2 == null) {
                        short sXd = (short) (C1499aX.Xd() ^ (-18548));
                        int[] iArr = new int["\u0014/\u000b-\u001e  ,".length()];
                        QB qb = new QB("\u0014/\u000b-\u001e  ,");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                            i3++;
                        }
                        String str = new String(iArr, 0, i3);
                        StringBuilder sb = new StringBuilder(strVd);
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1561oA.yd("0>1@:5-w*73:(25o\"OKR@TM", (short) (C1633zX.Xd() ^ (-17467)))).getMethod(C1561oA.Yd("edtBrspnih|ryyU{t~", (short) (C1499aX.Xd() ^ (-3438))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(context, objArr2);
                            String strQd = Xg.qd("9G>MKFB\rCPPWISZ\u0015XV\u0018,\\]ZXSRf\\cc?e^h", (short) (OY.Xd() ^ 27129), (short) (OY.Xd() ^ 28899));
                            short sXd2 = (short) (ZN.Xd() ^ 22738);
                            short sXd3 = (short) (ZN.Xd() ^ 5404);
                            int[] iArr2 = new int["^LS\u001f\u001f\"?o\u001cC%\t\be=^".length()];
                            QB qb2 = new QB("^LS\u001f\u001f\"?o\u001cC%\t\be=^");
                            int i4 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
                                i4++;
                            }
                            String str2 = new String(iArr2, 0, i4);
                            try {
                                Class<?> cls = Class.forName(strQd);
                                Field field = 1 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            LogUtil.w(str, sb.append((String) obj).toString());
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        context = context2;
                    }
                    sApplicationContext = context;
                    sRecoveryStrategyFactory = new DefaultRecoveryStrategyFactory(context, makeRecoveryFlags(i2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (soFileLoader != null || sSoFileLoader == null) {
                if (soFileLoader != null) {
                    sSoFileLoader = soFileLoader;
                } else {
                    sSoFileLoader = new InstrumentedSoFileLoader(new SoFileLoaderImpl());
                }
            }
        }
    }

    private static void initSoSources(@Nullable Context context, int i2) throws IOException {
        if (sSoSources != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (sSoSources != null) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            sFlags = i2;
            ArrayList arrayList = new ArrayList();
            boolean z2 = true;
            boolean z3 = (512 & i2) != 0;
            boolean z4 = (1024 & i2) != 0;
            if (z3) {
                addSystemLoadWrapperSoSource(context, arrayList);
            } else if (z4) {
                addSystemLibSoSource(arrayList);
                arrayList.add(0, new DirectSplitSoSource(Constants.SENSITIVITY_BASE));
            } else {
                addSystemLibSoSource(arrayList);
                if (context != null) {
                    if ((i2 + 1) - (1 | i2) != 0) {
                        addApplicationSoSource(arrayList, getApplicationSoSourceFlags());
                        LogUtil.d(TAG, "Adding exo package source: lib-main");
                        arrayList.add(0, new ExoSoSource(context, SO_STORE_NAME_MAIN));
                    } else {
                        if (SysUtil.isSupportedDirectLoad(context, sAppType)) {
                            addDirectApkSoSource(context, arrayList);
                        }
                        addApplicationSoSource(arrayList, getApplicationSoSourceFlags());
                        if ((i2 + 4096) - (i2 | 4096) == 0) {
                            z2 = false;
                        }
                        addBackupSoSource(context, arrayList, z2);
                    }
                }
            }
            SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
            int iMakePrepareFlags = makePrepareFlags();
            int length = soSourceArr.length;
            while (true) {
                int i3 = length - 1;
                if (length <= 0) {
                    sSoSources = soSourceArr;
                    sSoSourcesVersion.getAndIncrement();
                    LogUtil.i(TAG, "init finish: " + sSoSources.length + " SO sources prepared");
                    return;
                }
                LogUtil.i(TAG, "Preparing SO source: " + soSourceArr[i3]);
                boolean z5 = SYSTRACE_LIBRARY_LOADING;
                if (z5) {
                    Api18TraceUtils.beginTraceSection(TAG, Global.UNDERSCORE, soSourceArr[i3].getClass().getSimpleName());
                }
                soSourceArr[i3].prepare(iMakePrepareFlags);
                if (z5) {
                    Api18TraceUtils.endSection();
                }
                length = i3;
            }
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static boolean isInitialized() {
        if (sSoSources != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z2 = sSoSources != null;
            reentrantReadWriteLock.readLock().unlock();
            return z2;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    static void loadDependency(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        ObserverHolder.onLoadDependencyStart(str, i2);
        try {
            ObserverHolder.onLoadDependencyEnd(null, loadLibraryBySoNameImpl(str, null, null, (-1) - (((-1) - i2) & ((-1) - 1)), threadPolicy));
        } finally {
        }
    }

    public static boolean loadLibrary(String str) {
        return isEnabled ? loadLibrary(str, 0) : NativeLoader.loadLibrary(str);
    }

    public static boolean loadLibrary(String str, int i2) throws UnsatisfiedLinkError {
        SystemLoadLibraryWrapper systemLoadLibraryWrapper;
        Boolean boolLoadLibraryOnNonAndroid = loadLibraryOnNonAndroid(str);
        if (boolLoadLibraryOnNonAndroid != null) {
            return boolLoadLibraryOnNonAndroid.booleanValue();
        }
        if (!isEnabled) {
            return NativeLoader.loadLibrary(str);
        }
        int i3 = sAppType;
        if ((i3 != 2 && i3 != 3) || (systemLoadLibraryWrapper = sSystemLoadLibraryWrapper) == null) {
            return loadLibraryOnAndroid(str, i2);
        }
        systemLoadLibraryWrapper.loadLibrary(str);
        return true;
    }

    private static boolean loadLibraryBySoName(String str, @Nullable String str2, @Nullable String str3, int i2, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        RecoveryStrategy recoveryStrategyRecover = null;
        while (true) {
            try {
                return loadLibraryBySoNameImpl(str, str2, str3, i2, threadPolicy);
            } catch (UnsatisfiedLinkError e2) {
                recoveryStrategyRecover = recover(str, e2, recoveryStrategyRecover);
            }
        }
    }

    private static boolean loadLibraryBySoNameImpl(String str, @Nullable String str2, @Nullable String str3, int i2, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        boolean z2;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && sLoadedAndJniInvoked.contains(str2)) {
            return false;
        }
        Set<String> set = sLoadedLibraries;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            if (!set.contains(str)) {
                z2 = false;
            } else {
                if (str3 == null) {
                    return false;
                }
                z2 = true;
            }
            Map<String, Object> map = sLoadingLibraries;
            if (map.containsKey(str)) {
                obj = map.get(str);
            } else {
                obj = new Object();
                map.put(str, obj);
            }
            Map<String, Object> map2 = sInvokingJniForLibrary;
            if (map2.containsKey(str2)) {
                obj2 = map2.get(str2);
            } else {
                obj2 = new Object();
                map2.put(str2, obj2);
            }
            ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
            reentrantReadWriteLock.readLock().lock();
            try {
                synchronized (obj) {
                    if (!z2) {
                        if (set.contains(str)) {
                            if (str3 == null) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            z2 = true;
                        }
                        if (!z2) {
                            try {
                                LogUtil.d(TAG, "About to load: " + str);
                                doLoadLibraryBySoName(str, str2, i2, threadPolicy);
                                LogUtil.d(TAG, "Loaded: " + str);
                                set.add(str);
                            } catch (UnsatisfiedLinkError e2) {
                                String message = e2.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e2;
                                }
                                throw new WrongAbiError(e2, message.substring(message.lastIndexOf("unexpected e_machine:")));
                            }
                        }
                    }
                    synchronized (obj2) {
                        if ((i2 + 16) - (i2 | 16) == 0 && str3 != null) {
                            if (TextUtils.isEmpty(str2) || !sLoadedAndJniInvoked.contains(str2)) {
                                boolean z3 = SYSTRACE_LIBRARY_LOADING;
                                if (z3 && externalSoMapping == null) {
                                    Api18TraceUtils.beginTraceSection("MergedSoMapping.invokeJniOnload[", str2, "]");
                                }
                                try {
                                    try {
                                        LogUtil.d(TAG, "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                        ExternalSoMapping externalSoMapping2 = externalSoMapping;
                                        if (externalSoMapping2 != null) {
                                            externalSoMapping2.invokeJniOnload(str2);
                                        } else {
                                            MergedSoMapping.invokeJniOnload(str2);
                                        }
                                        sLoadedAndJniInvoked.add(str2);
                                        if (z3 && externalSoMapping == null) {
                                            Api18TraceUtils.endSection();
                                        }
                                    } catch (UnsatisfiedLinkError e3) {
                                        throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e3);
                                    }
                                } catch (Throwable th) {
                                    if (SYSTRACE_LIBRARY_LOADING && externalSoMapping == null) {
                                        Api18TraceUtils.endSection();
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return !z2;
                }
            } catch (Throwable th2) {
                sSoSourcesLock.readLock().unlock();
                throw th2;
            }
        }
    }

    private static boolean loadLibraryFromSoSource(SoSource soSource, String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        ObserverHolder.onSoSourceLoadLibraryStart(soSource);
        try {
            boolean z2 = soSource.loadLibrary(str, i2, threadPolicy) != 0;
            ObserverHolder.onSoSourceLoadLibraryEnd(null);
            return z2;
        } finally {
        }
    }

    private static boolean loadLibraryOnAndroid(String str, int i2) {
        ExternalSoMapping externalSoMapping2 = externalSoMapping;
        String strMapLibName = externalSoMapping2 != null ? externalSoMapping2.mapLibName(str) : MergedSoMapping.mapLibName(str);
        String str2 = strMapLibName != null ? strMapLibName : str;
        ObserverHolder.onLoadLibraryStart(str, strMapLibName, i2);
        try {
            boolean zLoadLibraryBySoName = loadLibraryBySoName(System.mapLibraryName(str2), str, strMapLibName, i2, null);
            ObserverHolder.onLoadLibraryEnd(null, zLoadLibraryBySoName);
            return zLoadLibraryBySoName;
        } finally {
        }
    }

    @Nullable
    private static Boolean loadLibraryOnNonAndroid(String str) {
        Boolean boolValueOf;
        if (sSoSources != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        boolean zContains = sLoadedLibraries.contains(str);
                        boolean z2 = !zContains;
                        if (!zContains) {
                            SystemLoadLibraryWrapper systemLoadLibraryWrapper = sSystemLoadLibraryWrapper;
                            if (systemLoadLibraryWrapper != null) {
                                systemLoadLibraryWrapper.loadLibrary(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                        boolValueOf = Boolean.valueOf(z2);
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                assertInitialized();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    public static String makeLdLibraryPath() {
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            ArrayList arrayList = new ArrayList();
            SoSource[] soSourceArr = sSoSources;
            if (soSourceArr != null) {
                for (SoSource soSource : soSourceArr) {
                    soSource.addToLdLibraryPath(arrayList);
                }
            }
            String strJoin = TextUtils.join(Global.COLON, arrayList);
            LogUtil.d(TAG, "makeLdLibraryPath final path: " + strJoin);
            return strJoin;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static int makePrepareFlags() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = sFlags;
            int i3 = (i2 + 2) - (2 | i2) != 0 ? 1 : 0;
            if ((i2 + 256) - (256 | i2) != 0) {
                i3 = (-1) - (((-1) - i3) & ((-1) - 4));
            }
            if ((i2 + 128) - (i2 | 128) == 0) {
                i3 = (i3 + 8) - (i3 & 8);
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i3;
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    private static int makeRecoveryFlags(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? 1 : 0;
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = new SoSource[sSoSources.length + 1];
            soSourceArr[0] = soSource;
            System.arraycopy(sSoSources, 0, soSourceArr, 1, sSoSources.length);
            sSoSources = soSourceArr;
            sSoSourcesVersion.getAndIncrement();
            LogUtil.d(TAG, "Prepended to SO sources: " + soSource);
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    private static RecoveryStrategy recover(String str, UnsatisfiedLinkError unsatisfiedLinkError, @Nullable RecoveryStrategy recoveryStrategy) {
        LogUtil.w(TAG, "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (recoveryStrategy == null) {
                try {
                    try {
                        recoveryStrategy = getRecoveryStrategy();
                        if (recoveryStrategy == null) {
                            LogUtil.w(TAG, "No recovery strategy");
                            throw unsatisfiedLinkError;
                        }
                    } catch (NoBaseApkException e2) {
                        LogUtil.e(TAG, "Base APK not found during recovery", e2);
                        throw e2;
                    }
                } catch (Exception e3) {
                    LogUtil.e(TAG, "Got an exception during recovery, will throw the initial error instead", e3);
                    throw unsatisfiedLinkError;
                }
            }
            if (recoverLocked(unsatisfiedLinkError, recoveryStrategy)) {
                sSoSourcesVersion.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return recoveryStrategy;
            }
            reentrantReadWriteLock.writeLock().unlock();
            LogUtil.w(TAG, "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    private static boolean recoverLocked(UnsatisfiedLinkError unsatisfiedLinkError, RecoveryStrategy recoveryStrategy) {
        ObserverHolder.onRecoveryStart(recoveryStrategy);
        try {
            boolean zRecover = recoveryStrategy.recover(unsatisfiedLinkError, sSoSources);
            ObserverHolder.onRecoveryEnd(null);
            return zRecover;
        } finally {
        }
    }

    public static void setInTestMode() {
        TestOnlyUtils.setSoSources(new SoSource[]{new NoopSoSource()});
    }

    static synchronized void setRecoveryStrategyFactory(RecoveryStrategyFactory recoveryStrategyFactory) {
        sRecoveryStrategyFactory = recoveryStrategyFactory;
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            for (SoSource soSource : sSoSources) {
                File fileUnpackLibrary = soSource.unpackLibrary(str);
                if (fileUnpackLibrary != null) {
                    return fileUnpackLibrary;
                }
            }
            sSoSourcesLock.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static boolean useDepsFile(Context context, boolean z2, boolean z3) {
        return NativeDeps.useDepsFile(context, z2, z3);
    }
}
