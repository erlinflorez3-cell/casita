package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public final class CameraX {
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    final CameraRepository mCameraRepository;
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final ListenableFuture<Void> mInitInternalFuture;
    private InternalInitState mInitState;
    private final Object mInitializeLock;
    private final Integer mMinLogLevel;
    private final RetryPolicy mRetryPolicy;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private ListenableFuture<Void> mShutdownInternalFuture;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();

    private enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(Context context, CameraXConfig.Provider provider) {
        this(context, provider, new QuirkSettingsLoader());
    }

    CameraX(Context context, CameraXConfig.Provider provider, Function<Context, QuirkSettings> function) {
        this.mCameraRepository = new CameraRepository();
        this.mInitializeLock = new Object();
        this.mInitState = InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = Futures.immediateFuture(null);
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.mCameraXConfig = configProvider.getCameraXConfig();
        }
        updateQuirkSettings(context, this.mCameraXConfig.getQuirkSettings(), function);
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new RetryPolicy.Builder(this.mCameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mInitInternalFuture = initInternal(context);
    }

    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        String string;
        String strOd = C1561oA.od("Xu\u0001w\u0004qg", (short) (Od.Xd() ^ (-2373)));
        ComponentCallbacks2 applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            short sXd = (short) (C1633zX.Xd() ^ (-26522));
            int[] iArr = new int["JXO^\\WS\u001eTaahZdk&<iipbvs".length()];
            QB qb = new QB("JXO^\\WS\u001eTaahZdk&<iipbvs");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("\u0017$b\u000e\r\u001eU\u0019\u000f\u001c1\u0015\u0012\u0012G\u0015\u0010", (short) (FB.Xd() ^ 23255), (short) (FB.Xd() ^ 15147)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(applicationContext, objArr);
                ComponentName componentName = new ComponentName(applicationContext, (Class<?>) MetadataHolderService.class);
                short sXd2 = (short) (C1499aX.Xd() ^ (-25));
                int[] iArr2 = new int["<JAPNIE\u0010FSSZLV]\u0018[Y\u001b>PS\\SZYBWeY`_m".length()];
                QB qb2 = new QB("<JAPNIE\u0010FSSZLV]\u0018[Y\u001b>PS\\SZYBWeY`_m");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Wg.vd("cqdsuph3]jfmcmp+5b]aeeYc^9IVS", (short) (Od.Xd() ^ (-4144))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, Integer.valueOf(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE)};
                Method method2 = cls.getMethod(Qg.kd("NKY7HTWIBC&JAI", (short) (ZN.Xd() ^ 32607), (short) (ZN.Xd() ^ 22071)), clsArr);
                try {
                    method2.setAccessible(true);
                    ServiceInfo serviceInfo = (ServiceInfo) method2.invoke(packageManager, objArr2);
                    if (serviceInfo.metaData == null) {
                        string = null;
                    } else {
                        string = serviceInfo.metaData.getString(hg.Vd("6B7D@93Fz/,7.:(s(35'n),.)i\b\u001f-\u0019\u001b\u0017)\u0015z!\u001d\u0014\u0014 \u007f\u0011\u001d \u0012\u000b\fShhhbukr|_jh_a^uefbhZTT`", (short) (Od.Xd() ^ (-18697)), (short) (Od.Xd() ^ (-22243))));
                    }
                    if (string == null) {
                        Logger.e(strOd, C1561oA.ud("\u00111`$$$\u001e1'.Xz\u0018#\u001a&\u0014\ns\u001f\u001d\u0014\u0016\u0013Xy\u001b\u0017\u001d\u000f\t\t\u0015A\u0014\u0010\u0004\u0001\u0006\u0002\u0004~|7\u007f\u00044\u0001w\u0006q<rn\u0001l8)\\ok%qruu kghags\u0019[XkhY\u0013[d\u0010h]b\fOSM\bUUY\u0004LPDLTBB{<y===7J@Gq:=?:2908=);/42b+/_8-2.Z\u001c.!#\u001aT'(\u0015\u0019O\u0010!LR\u000e\u000b\u0016\r\u0019\u0007Q\u0007\u0004\u000f\u0006\u0012\u007fOCI", (short) (C1499aX.Xd() ^ (-9516))));
                        return null;
                    }
                    return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e4) {
            Logger.e(strOd, C1561oA.yd("\u0010*13+)c7ApB4B?500\u001eW\u001b\u001b\u001b\u0015(.5_\u0002\u001f*!-KA+VTKMJ Ab^dVPPLx>IEBs@GUA\fB>P<", (short) (C1499aX.Xd() ^ (-8005))), e4);
            return null;
        }
    }

    private static void updateQuirkSettings(Context context, QuirkSettings quirkSettings, Function<Context, QuirkSettings> function) {
        if (quirkSettings != null) {
            Logger.d(TAG, "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            quirkSettings = function.apply(context);
            Logger.d(TAG, "QuirkSettings from app metadata: " + quirkSettings);
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            Logger.d(TAG, "QuirkSettings by default: " + quirkSettings);
        }
        QuirkSettingsHolder.instance().set(quirkSettings);
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public ListenableFuture<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public ListenableFuture<Void> shutdown() {
        return shutdownInternal();
    }

    private ListenableFuture<Void> initInternal(final Context context) {
        ListenableFuture<Void> future;
        synchronized (this.mInitializeLock) {
            Preconditions.checkState(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f$0.m163lambda$initInternal$0$androidxcameracoreCameraX(context, completer);
                }
            });
        }
        return future;
    }

    /* JADX INFO: renamed from: lambda$initInternal$0$androidx-camera-core-CameraX */
    /* synthetic */ Object m163lambda$initInternal$0$androidxcameracoreCameraX(Context context, CallbackToFutureAdapter.Completer completer) throws Exception {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), 1, context, completer);
        return "CameraX initInternal";
    }

    private void initAndRetryRecursively(final Executor executor, final long j2, final int i2, final Context context, final CallbackToFutureAdapter.Completer<Void> completer) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m162lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(context, executor, i2, completer, j2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010b A[Catch: all -> 0x0163, TryCatch #3 {all -> 0x0163, blocks: (B:69:0x0010, B:71:0x001e, B:72:0x0032, B:74:0x0044, B:76:0x005e, B:78:0x0068, B:79:0x0070, B:81:0x007f, B:82:0x0082, B:83:0x008a, B:84:0x0096, B:85:0x0097, B:86:0x00a3, B:100:0x00bc, B:104:0x00d7, B:105:0x010b, B:106:0x010d, B:109:0x0113, B:111:0x0119, B:112:0x0120, B:114:0x0124, B:115:0x014c, B:117:0x0150, B:118:0x0154, B:123:0x0162, B:87:0x00a4, B:88:0x00b0, B:107:0x010e, B:108:0x0112), top: B:129:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: lambda$initAndRetryRecursively$2$androidx-camera-core-CameraX */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */ void m162lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(android.content.Context r22, final java.util.concurrent.Executor r23, final int r24, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer r25, final long r26) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.m162lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(android.content.Context, java.util.concurrent.Executor, int, androidx.concurrent.futures.CallbackToFutureAdapter$Completer, long):void");
    }

    /* JADX INFO: renamed from: lambda$initAndRetryRecursively$1$androidx-camera-core-CameraX */
    /* synthetic */ void m161lambda$initAndRetryRecursively$1$androidxcameracoreCameraX(Executor executor, long j2, int i2, Context context, CallbackToFutureAdapter.Completer completer) {
        initAndRetryRecursively(executor, j2, i2 + 1, context, completer);
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private ListenableFuture<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
            int iOrdinal = this.mInitState.ordinal();
            if (iOrdinal == 0) {
                this.mInitState = InternalInitState.SHUTDOWN;
                return Futures.immediateFuture(null);
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.mInitState = InternalInitState.SHUTDOWN;
                decreaseMinLogLevelReference(this.mMinLogLevel);
                this.mShutdownInternalFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda4
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return this.f$0.m165lambda$shutdownInternal$4$androidxcameracoreCameraX(completer);
                    }
                });
            }
            return this.mShutdownInternalFuture;
        }
    }

    /* JADX INFO: renamed from: lambda$shutdownInternal$4$androidx-camera-core-CameraX */
    /* synthetic */ Object m165lambda$shutdownInternal$4$androidxcameracoreCameraX(final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mCameraRepository.deinit().addListener(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m164lambda$shutdownInternal$3$androidxcameracoreCameraX(completer);
            }
        }, this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    /* JADX INFO: renamed from: lambda$shutdownInternal$3$androidx-camera-core-CameraX */
    /* synthetic */ void m164lambda$shutdownInternal$3$androidxcameracoreCameraX(CallbackToFutureAdapter.Completer completer) {
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        completer.set(null);
    }

    boolean isInitialized() {
        boolean z2;
        synchronized (this.mInitializeLock) {
            z2 = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z2;
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            updateOrResetMinLogLevel();
        }
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
            if (iIntValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
            }
            updateOrResetMinLogLevel();
        }
    }

    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    private void traceExecutionState(RetryPolicy.ExecutionState executionState) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:CameraProvider-RetryStatus", executionState != null ? executionState.getStatus() : -1);
        }
    }
}
