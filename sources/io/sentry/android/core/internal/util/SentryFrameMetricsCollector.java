package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.util.Objects;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
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
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryFrameMetricsCollector implements Application.ActivityLifecycleCallbacks {
    private final BuildInfoProvider buildInfoProvider;
    private Choreographer choreographer;
    private Field choreographerLastFrameTimeField;
    private WeakReference<Window> currentWindow;
    private Window.OnFrameMetricsAvailableListener frameMetricsAvailableListener;
    private Handler handler;
    private boolean isAvailable;
    private long lastFrameEndNanos;
    private long lastFrameStartNanos;
    private final Map<String, FrameMetricsCollectorListener> listenerMap;
    private final ILogger logger;
    private final Set<Window> trackedWindows;
    private final WindowFrameMetricsManager windowFrameMetricsManager;
    private static final long oneSecondInNanos = TimeUnit.SECONDS.toNanos(1);
    private static final long frozenFrameThresholdNanos = TimeUnit.MILLISECONDS.toNanos(700);

    public interface FrameMetricsCollectorListener {
        void onFrameMetricCollected(long j2, long j3, long j4, long j5, boolean z2, boolean z3, float f2);
    }

    public interface WindowFrameMetricsManager {
        default void addOnFrameMetricsAvailableListener(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void removeOnFrameMetricsAvailableListener(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public SentryFrameMetricsCollector(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this(context, iLogger, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.2
        });
    }

    public SentryFrameMetricsCollector(Context context, final ILogger iLogger, final BuildInfoProvider buildInfoProvider, WindowFrameMetricsManager windowFrameMetricsManager) throws Throwable {
        this.trackedWindows = new CopyOnWriteArraySet();
        this.listenerMap = new ConcurrentHashMap();
        this.isAvailable = false;
        this.lastFrameStartNanos = 0L;
        this.lastFrameEndNanos = 0L;
        Context context2 = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), C1561oA.yd("]rl(p}y\u0001v\u000b\u00040~\n3\u0007~\f\r\u0002\u0010\u0004\u007f", (short) (C1499aX.Xd() ^ (-5554))));
        this.logger = (ILogger) Objects.requireNonNull(iLogger, C1561oA.Yd("\\\u0001yzy\b6\u0001\f9\r\u0001\u000e\u0013\b\u0012\u0006\u0006", (short) (ZN.Xd() ^ 29361)));
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, Xg.qd(">rgkdJpisUxv~rnp~-w\u00030\u0004w\u0005\n~\t||", (short) (C1580rY.Xd() ^ (-29577)), (short) (C1580rY.Xd() ^ (-10479))));
        this.windowFrameMetricsManager = (WindowFrameMetricsManager) Objects.requireNonNull(windowFrameMetricsManager, Jg.Wd("^_\u0004\t\u0013\u001av$0-\"\u001bQ_Lb[zSv\u0003\u0015*\u00074n90}MP{^a\n\u000bi", (short) (FB.Xd() ^ 18564), (short) (FB.Xd() ^ 28934)));
        if ((context2 instanceof Application) && buildInfoProvider.getSdkInfoVersion() >= 24) {
            this.isAvailable = true;
            HandlerThread handlerThread = new HandlerThread(ZO.xd("\u0005,J^SNX\"j#dc\u0016e@m\u0018qQG`\u000ba\u0015\u001b\t,\b7\n\u001fu~R#|(A>p\u000b5x=\u0001\u000eQjf\u0019]#\"\bl\u001d\u0013J,\u0019)q\u0014\u0017", (short) (C1607wl.Xd() ^ 30357), (short) (C1607wl.Xd() ^ 27701)));
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector$$ExternalSyntheticLambda0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    iLogger.log(SentryLevel.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper());
            Application application = (Application) context2;
            Object[] objArr = {this};
            Method method = Class.forName(C1626yg.Ud("/P!i?\u007f_Ws\r..\u001b\u0003\u0005OoO\u001f\u0015\u0010Q\u001f", (short) (C1607wl.Xd() ^ 28359), (short) (C1607wl.Xd() ^ 13591))).getMethod(EO.Od("3\u0001\u00112tJWt\n\u0001\u0014b:3\"\u00021<\u0002h={7<,eb\u0016\fP+\bw^", (short) (C1580rY.Xd() ^ (-27585))), Class.forName(Ig.wd("\u0003=%\u0014\u0011MtFJ6<W?`D\u001f~\u000b0{2o\u0015N\u001d;m\u0012QU\r/2pe\"I{dWLQE2,\u00161X^F", (short) (C1499aX.Xd() ^ (-4260)))));
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
                Object[] objArr2 = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.Qd("\u0002\u000e\u0003\u0010\f\u0005~G\b\u000bDa\u0004\u0003\u0003v\u0003", (short) (C1633zX.Xd() ^ (-9969)))).getDeclaredMethod(C1593ug.zd("ML\\6KTZ9]^`Vd", (short) (C1633zX.Xd() ^ (-13433)), (short) (C1633zX.Xd() ^ (-5044))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr2));
                    Object[] objArr3 = {new Runnable() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m8925x2ab0da68(iLogger);
                        }
                    }};
                    Method method2 = Class.forName(C1561oA.od("\u0003\u000f\u0004\u0011\r\u0006\u007fH\t\fE^v\u0003w~v\u0003", (short) (C1633zX.Xd() ^ (-1630)))).getMethod(Wg.Zd("_$b~", (short) (C1633zX.Xd() ^ (-18041)), (short) (C1633zX.Xd() ^ (-20163))), Class.forName(C1561oA.Kd("me{g5tjxr:_\u0004}~rt\u007fy", (short) (C1633zX.Xd() ^ (-13611)))));
                    try {
                        method2.setAccessible(true);
                        method2.invoke(handler, objArr3);
                        try {
                            Field declaredField = Choreographer.class.getDeclaredField(C1561oA.Xd("I)?RT'TDQJ:PUN8LZ\\a", (short) (C1633zX.Xd() ^ (-20805))));
                            this.choreographerLastFrameTimeField = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            SentryLevel sentryLevel = SentryLevel.ERROR;
                            short sXd = (short) (C1580rY.Xd() ^ (-14336));
                            int[] iArr = new int[",F68?9pF>o43?k=2,g+8$1&a3)*#.0\u001a'g\u0018[hba\u0011fWU\rQS[[OVOWGSLFT\u0019\u007f".length()];
                            QB qb = new QB(",F68?9pF>o43?k=2,g+8$1&a3)*#.0\u001a'g\u0018[hba\u0011fWU\rQS[[OVOWGSLFT\u0019\u007f");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                                i2++;
                            }
                            iLogger.log(sentryLevel, new String(iArr, 0, i2), e2);
                        }
                        this.frameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector$$ExternalSyntheticLambda2
                            @Override // android.view.Window.OnFrameMetricsAvailableListener
                            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i3) throws Throwable {
                                this.f$0.m8926x94e06287(buildInfoProvider, window, frameMetrics, i3);
                            }
                        };
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
    }

    public SentryFrameMetricsCollector(Context context, SentryOptions sentryOptions, BuildInfoProvider buildInfoProvider) {
        this(context, sentryOptions, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.1
        });
    }

    public SentryFrameMetricsCollector(Context context, SentryOptions sentryOptions, BuildInfoProvider buildInfoProvider, WindowFrameMetricsManager windowFrameMetricsManager) {
        this(context, sentryOptions.getLogger(), buildInfoProvider, windowFrameMetricsManager);
    }

    private long getFrameCpuDuration(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    private long getFrameStartTimestamp(FrameMetrics frameMetrics) {
        return this.buildInfoProvider.getSdkInfoVersion() >= 26 ? frameMetrics.getMetric(10) : getLastKnownFrameStartTimeNanos();
    }

    public static boolean isFrozen(long j2) {
        return j2 > frozenFrameThresholdNanos;
    }

    public static boolean isSlow(long j2, long j3) {
        return j2 > j3;
    }

    private void setCurrentWindow(Window window) {
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != window) {
            this.currentWindow = new WeakReference<>(window);
            trackCurrentWindow();
        }
    }

    private void stopTrackingWindow(Window window) {
        if (this.trackedWindows.contains(window)) {
            if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
                try {
                    this.windowFrameMetricsManager.removeOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener);
                } catch (Exception e2) {
                    this.logger.log(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", e2);
                }
            }
            this.trackedWindows.remove(window);
        }
    }

    private void trackCurrentWindow() {
        WeakReference<Window> weakReference = this.currentWindow;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.isAvailable || this.trackedWindows.contains(window) || this.listenerMap.isEmpty() || this.buildInfoProvider.getSdkInfoVersion() < 24 || this.handler == null) {
            return;
        }
        this.trackedWindows.add(window);
        this.windowFrameMetricsManager.addOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener, this.handler);
    }

    public long getLastKnownFrameStartTimeNanos() {
        Field field;
        Choreographer choreographer = this.choreographer;
        if (choreographer == null || (field = this.choreographerLastFrameTimeField) == null) {
            return -1L;
        }
        try {
            Long l2 = (Long) field.get(choreographer);
            if (l2 != null) {
                return l2.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$io-sentry-android-core-internal-util-SentryFrameMetricsCollector, reason: not valid java name */
    /* synthetic */ void m8925x2ab0da68(ILogger iLogger) {
        try {
            this.choreographer = Choreographer.getInstance();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    /* JADX INFO: renamed from: lambda$new$2$io-sentry-android-core-internal-util-SentryFrameMetricsCollector, reason: not valid java name */
    /* synthetic */ void m8926x94e06287(BuildInfoProvider buildInfoProvider, Window window, FrameMetrics frameMetrics, int i2) throws Throwable {
        float refreshRate;
        long jNanoTime = System.nanoTime();
        if (buildInfoProvider.getSdkInfoVersion() >= 30) {
            Context context = window.getContext();
            short sXd = (short) (C1607wl.Xd() ^ 5144);
            short sXd2 = (short) (C1607wl.Xd() ^ 7261);
            int[] iArr = new int["6B7D@93{0;9>.6;s\b316&83".length()];
            QB qb = new QB("6B7D@93{0;9>.6;s\b316&83");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(hg.Vd("\u001e\u001b)w\u001c%!\u001c\u0010'", (short) (C1499aX.Xd() ^ (-19013)), (short) (C1499aX.Xd() ^ (-23310))), new Class[0]);
            try {
                method.setAccessible(true);
                refreshRate = ((Display) method.invoke(context, objArr)).getRefreshRate();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        long j2 = oneSecondInNanos;
        long frameCpuDuration = getFrameCpuDuration(frameMetrics);
        long jMax = Math.max(0L, frameCpuDuration - ((long) (j2 / refreshRate)));
        long frameStartTimestamp = getFrameStartTimestamp(frameMetrics);
        if (frameStartTimestamp < 0) {
            frameStartTimestamp = jNanoTime - frameCpuDuration;
        }
        long jMax2 = Math.max(frameStartTimestamp, this.lastFrameEndNanos);
        if (jMax2 == this.lastFrameStartNanos) {
            return;
        }
        this.lastFrameStartNanos = jMax2;
        this.lastFrameEndNanos = jMax2 + frameCpuDuration;
        boolean zIsSlow = isSlow(frameCpuDuration, (long) (j2 / (refreshRate - 1.0f)));
        boolean z2 = zIsSlow && isFrozen(frameCpuDuration);
        Iterator<FrameMetricsCollectorListener> it = this.listenerMap.values().iterator();
        while (it.hasNext()) {
            it.next().onFrameMetricCollected(jMax2, this.lastFrameEndNanos, frameCpuDuration, jMax, zIsSlow, z2, refreshRate);
            frameCpuDuration = frameCpuDuration;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        setCurrentWindow(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        stopTrackingWindow(activity.getWindow());
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.currentWindow = null;
    }

    public String startCollection(FrameMetricsCollectorListener frameMetricsCollectorListener) {
        if (!this.isAvailable) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        this.listenerMap.put(string, frameMetricsCollectorListener);
        trackCurrentWindow();
        return string;
    }

    public void stopCollection(String str) {
        if (this.isAvailable) {
            if (str != null) {
                this.listenerMap.remove(str);
            }
            WeakReference<Window> weakReference = this.currentWindow;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.listenerMap.isEmpty()) {
                return;
            }
            stopTrackingWindow(window);
        }
    }
}
