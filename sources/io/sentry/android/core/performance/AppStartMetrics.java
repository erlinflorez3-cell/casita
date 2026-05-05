package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.ITransactionProfiler;
import io.sentry.NoOpLogger;
import io.sentry.TracesSamplingDecision;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
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
public class AppStartMetrics extends ActivityLifecycleCallbacksAdapter {
    private static long CLASS_LOADED_UPTIME_MS = SystemClock.uptimeMillis();
    private static volatile AppStartMetrics instance = null;
    private AppStartType appStartType = AppStartType.UNKNOWN;
    private ITransactionProfiler appStartProfiler = null;
    private TracesSamplingDecision appStartSamplingDecision = null;
    private boolean isCallbackRegistered = false;
    private boolean shouldSendStartMeasurements = true;
    private final AtomicInteger activeActivitiesCounter = new AtomicInteger();
    private final AtomicBoolean firstDrawDone = new AtomicBoolean(false);
    private final TimeSpan appStartSpan = new TimeSpan();
    private final TimeSpan sdkInitTimeSpan = new TimeSpan();
    private final TimeSpan applicationOnCreate = new TimeSpan();
    private final Map<ContentProvider, TimeSpan> contentProviderOnCreates = new HashMap();
    private final List<ActivityLifecycleTimeSpan> activityLifecycles = new ArrayList();
    private boolean appLaunchedInForeground = ContextUtils.isForegroundImportance();

    public enum AppStartType {
        UNKNOWN,
        COLD,
        WARM
    }

    /* JADX INFO: renamed from: checkCreateTimeOnMain */
    public void m8930x5b2eef10() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("HTIVRKE\u000eNQ\u000b(JII=I", (short) (Od.Xd() ^ (-877)))).getDeclaredMethod(C1561oA.yd("\u001f\u001e*\u0004\u001d&(\u0007/0.$6", (short) (C1633zX.Xd() ^ (-7671))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8927x1d07b267();
                }
            };
            short sXd = (short) (C1499aX.Xd() ^ (-27366));
            int[] iArr = new int["\u0018&\u001d,*%!k.3n\n$2)2,:".length()];
            QB qb = new QB("\u0018&\u001d,*%!k.3n\n$2)2,:");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr2 = {runnable};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\to1u", (short) (C1499aX.Xd() ^ (-4793)), (short) (C1499aX.Xd() ^ (-23771))), Class.forName(Xg.qd("JBXD\u0012QGUO\u0017<`Z[OQ\\V", (short) (Od.Xd() ^ (-29361)), (short) (Od.Xd() ^ (-13448)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static AppStartMetrics getInstance() {
        if (instance == null) {
            synchronized (AppStartMetrics.class) {
                if (instance == null) {
                    instance = new AppStartMetrics();
                }
            }
        }
        return instance;
    }

    public static void onApplicationCreate(Application application) throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStarted()) {
            appStartMetrics.applicationOnCreate.setStartedAt(jUptimeMillis);
            appStartMetrics.registerLifecycleCallbacks(application);
        }
    }

    public static void onApplicationPostCreate(Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStopped()) {
            appStartMetrics.applicationOnCreate.setDescription(application.getClass().getName() + ".onCreate");
            appStartMetrics.applicationOnCreate.setStoppedAt(jUptimeMillis);
        }
    }

    public static void onContentProviderCreate(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.setStartedAt(jUptimeMillis);
        getInstance().contentProviderOnCreates.put(contentProvider, timeSpan);
    }

    public static void onContentProviderPostCreate(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        TimeSpan timeSpan = getInstance().contentProviderOnCreates.get(contentProvider);
        if (timeSpan == null || !timeSpan.hasNotStopped()) {
            return;
        }
        timeSpan.setDescription(contentProvider.getClass().getName() + ".onCreate");
        timeSpan.setStoppedAt(jUptimeMillis);
    }

    public void addActivityLifecycleTimeSpans(ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        this.activityLifecycles.add(activityLifecycleTimeSpan);
    }

    public void clear() {
        this.appStartType = AppStartType.UNKNOWN;
        this.appStartSpan.reset();
        this.sdkInitTimeSpan.reset();
        this.applicationOnCreate.reset();
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
        ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
        if (iTransactionProfiler != null) {
            iTransactionProfiler.close();
        }
        this.appStartProfiler = null;
        this.appStartSamplingDecision = null;
        this.appLaunchedInForeground = false;
        this.isCallbackRegistered = false;
        this.shouldSendStartMeasurements = true;
        this.firstDrawDone.set(false);
        this.activeActivitiesCounter.set(0);
    }

    public List<ActivityLifecycleTimeSpan> getActivityLifecycleTimeSpans() {
        ArrayList arrayList = new ArrayList(this.activityLifecycles);
        Collections.sort(arrayList);
        return arrayList;
    }

    public ITransactionProfiler getAppStartProfiler() {
        return this.appStartProfiler;
    }

    public TracesSamplingDecision getAppStartSamplingDecision() {
        return this.appStartSamplingDecision;
    }

    public TimeSpan getAppStartTimeSpan() {
        return this.appStartSpan;
    }

    public TimeSpan getAppStartTimeSpanWithFallback(SentryAndroidOptions sentryAndroidOptions) {
        if (this.appStartType != AppStartType.UNKNOWN && this.appLaunchedInForeground) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                TimeSpan appStartTimeSpan = getAppStartTimeSpan();
                if (appStartTimeSpan.hasStarted() && appStartTimeSpan.getDurationMs() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return appStartTimeSpan;
                }
            }
            TimeSpan sdkInitTimeSpan = getSdkInitTimeSpan();
            if (sdkInitTimeSpan.hasStarted() && sdkInitTimeSpan.getDurationMs() <= TimeUnit.MINUTES.toMillis(1L)) {
                return sdkInitTimeSpan;
            }
        }
        return new TimeSpan();
    }

    public AppStartType getAppStartType() {
        return this.appStartType;
    }

    public TimeSpan getApplicationOnCreateTimeSpan() {
        return this.applicationOnCreate;
    }

    public long getClassLoadedUptimeMs() {
        return CLASS_LOADED_UPTIME_MS;
    }

    public List<TimeSpan> getContentProviderOnCreateTimeSpans() {
        ArrayList arrayList = new ArrayList(this.contentProviderOnCreates.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public TimeSpan getSdkInitTimeSpan() {
        return this.sdkInitTimeSpan;
    }

    public boolean isAppLaunchedInForeground() {
        return this.appLaunchedInForeground;
    }

    /* JADX INFO: renamed from: lambda$checkCreateTimeOnMain$1$io-sentry-android-core-performance-AppStartMetrics */
    /* synthetic */ void m8927x1d07b267() {
        if (this.activeActivitiesCounter.get() == 0) {
            this.appLaunchedInForeground = false;
            ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
            if (iTransactionProfiler == null || !iTransactionProfiler.isRunning()) {
                return;
            }
            this.appStartProfiler.close();
            this.appStartProfiler = null;
        }
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.activeActivitiesCounter.incrementAndGet() == 1 && !this.firstDrawDone.get()) {
            long startUptimeMs = jUptimeMillis - this.appStartSpan.getStartUptimeMs();
            if (!this.appLaunchedInForeground || startUptimeMs > TimeUnit.MINUTES.toMillis(1L)) {
                this.appStartType = AppStartType.WARM;
                this.shouldSendStartMeasurements = true;
                this.appStartSpan.reset();
                this.appStartSpan.start();
                this.appStartSpan.setStartedAt(jUptimeMillis);
                CLASS_LOADED_UPTIME_MS = jUptimeMillis;
                this.contentProviderOnCreates.clear();
                this.applicationOnCreate.reset();
            } else {
                this.appStartType = bundle == null ? AppStartType.COLD : AppStartType.WARM;
            }
        }
        this.appLaunchedInForeground = true;
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.activeActivitiesCounter.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.appLaunchedInForeground = false;
        this.shouldSendStartMeasurements = true;
        this.firstDrawDone.set(false);
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) throws Throwable {
        if (this.firstDrawDone.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            FirstDrawDoneListener.registerForNextDraw(activity, new Runnable() { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8928xf57a779c();
                }
            }, new BuildInfoProvider(NoOpLogger.getInstance()));
            return;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("jV2\u0016ptp%\fmzgJ\u0012a\u0001\u001c", (short) (C1607wl.Xd() ^ 28629), (short) (C1607wl.Xd() ^ 10012))).getDeclaredMethod(C1626yg.Ud("\u0005\u0007U_1%\u001b\u0010*^Hzj", (short) (FB.Xd() ^ 5900), (short) (FB.Xd() ^ 20058)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8929x235311fb();
                }
            };
            short sXd = (short) (Od.Xd() ^ (-11230));
            int[] iArr = new int["Z\"\bs.\u0004\u0019o~w8l2ICi\u00190".length()];
            QB qb = new QB("Z\"\bs.\u0004\u0019o~w8l2ICi\u00190");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr2 = {runnable};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("ywzz", (short) (C1607wl.Xd() ^ 23558)), Class.forName(EO.Od("k5\u0018^jVs(\u0001f\u0005N\u0013\u0011\u007f\"yl", (short) (C1580rY.Xd() ^ (-11603)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void onAppStartSpansSent() {
        this.shouldSendStartMeasurements = false;
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
    }

    /* JADX INFO: renamed from: onFirstFrameDrawn, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public synchronized void m8929x235311fb() {
        if (!this.firstDrawDone.getAndSet(true)) {
            AppStartMetrics appStartMetrics = getInstance();
            appStartMetrics.getSdkInitTimeSpan().stop();
            appStartMetrics.getAppStartTimeSpan().stop();
        }
    }

    public void registerLifecycleCallbacks(Application application) throws Throwable {
        if (this.isCallbackRegistered) {
            return;
        }
        boolean z2 = true;
        this.isCallbackRegistered = true;
        if (!this.appLaunchedInForeground && !ContextUtils.isForegroundImportance()) {
            z2 = false;
        }
        this.appLaunchedInForeground = z2;
        Object[] objArr = {instance};
        Method method = Class.forName(C1593ug.zd("]kbqojf1euv5Iyzwupo\u0004y\u0001\u0001", (short) (ZN.Xd() ^ 11283), (short) (ZN.Xd() ^ 4197))).getMethod(C1561oA.Kd("!\u0015\u0018\u001b&(\u001a(w\u001b-#1%17\u000b)''&=(2,\u000b*67..1:C", (short) (Od.Xd() ^ (-6427))), Class.forName(C1561oA.od("Zf[hd]W R`_\u001c.\\[VRKHZNSQ\u0006\"CSGSEOS%A=;8M6>6\u00130:9.,-4;", (short) (C1580rY.Xd() ^ (-30693)))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
            Object[] objArr2 = new Object[0];
            Method declaredMethod = Class.forName(Wg.Zd("\\e\fHp)TI9}&0\u0002\u0002n\u0012O", (short) (FB.Xd() ^ 24661), (short) (FB.Xd() ^ 15237))).getDeclaredMethod(C1561oA.Xd("\u0006\u0005\u0015n\u0004\r\u0013q\u0016\u0017\u0019\u000f\u001d", (short) (ZN.Xd() ^ 8978)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr2));
                Object[] objArr3 = {new Runnable() { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f$0.m8930x5b2eef10();
                    }
                }};
                Method method2 = Class.forName(Wg.vd("x\u0007}\r\u0003}yD\u000f\u0014Oj|\u000b\u0002\u000blz", (short) (C1499aX.Xd() ^ (-18841)))).getMethod(hg.Vd("SQTT", (short) (C1580rY.Xd() ^ (-11970)), (short) (C1580rY.Xd() ^ (-18239))), Class.forName(Qg.kd("6,@*u3'3+p\u00146.-\u001f\u001f( ", (short) (FB.Xd() ^ 22672), (short) (FB.Xd() ^ 6366))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler, objArr3);
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

    public void setAppLaunchedInForeground(boolean z2) {
        this.appLaunchedInForeground = z2;
    }

    public void setAppStartProfiler(ITransactionProfiler iTransactionProfiler) {
        this.appStartProfiler = iTransactionProfiler;
    }

    public void setAppStartSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        this.appStartSamplingDecision = tracesSamplingDecision;
    }

    public void setAppStartType(AppStartType appStartType) {
        this.appStartType = appStartType;
    }

    public void setClassLoadedUptimeMs(long j2) {
        CLASS_LOADED_UPTIME_MS = j2;
    }

    public boolean shouldSendStartMeasurements() {
        return this.shouldSendStartMeasurements && this.appLaunchedInForeground;
    }
}
