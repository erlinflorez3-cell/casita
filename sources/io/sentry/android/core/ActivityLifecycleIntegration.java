package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.FullyDisplayedReporter;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.Instrumenter;
import io.sentry.Integration;
import io.sentry.MeasurementUnit;
import io.sentry.NoOpTransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.TracesSamplingDecision;
import io.sentry.TransactionContext;
import io.sentry.TransactionFinishedCallback;
import io.sentry.TransactionOptions;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    static final String APP_START_COLD = "app.start.cold";
    static final String APP_START_WARM = "app.start.warm";
    private static final String TRACE_ORIGIN = "auto.ui.activity";
    static final String TTFD_OP = "ui.load.full_display";
    static final long TTFD_TIMEOUT_MILLIS = 25000;
    static final String TTID_OP = "ui.load.initial_display";
    static final String UI_LOAD_OP = "ui.load";
    private final ActivityFramesTracker activityFramesTracker;
    private ISpan appStartSpan;
    private final Application application;
    private final BuildInfoProvider buildInfoProvider;
    private IHub hub;
    private boolean isAllActivityCallbacksAvailable;
    private SentryAndroidOptions options;
    private boolean performanceEnabled = false;
    private boolean timeToFullDisplaySpanEnabled = false;
    private boolean firstActivityCreated = false;
    private FullyDisplayedReporter fullyDisplayedReporter = null;
    private final WeakHashMap<Activity, ISpan> ttidSpanMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, ISpan> ttfdSpanMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, ActivityLifecycleTimeSpan> activityLifecycleMap = new WeakHashMap<>();
    private SentryDate lastPausedTime = new SentryNanotimeDate(new Date(0), 0);
    private long lastPausedUptimeMillis = 0;
    private Future<?> ttfdAutoCloseFuture = null;
    private final WeakHashMap<Activity, ITransaction> activitiesWithOngoingTransactions = new WeakHashMap<>();

    public ActivityLifecycleIntegration(Application application, BuildInfoProvider buildInfoProvider, ActivityFramesTracker activityFramesTracker) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
        if (buildInfoProvider.getSdkInfoVersion() >= 29) {
            this.isAllActivityCallbacksAvailable = true;
        }
    }

    private void cancelTtfdAutoClose() {
        Future<?> future = this.ttfdAutoCloseFuture;
        if (future != null) {
            future.cancel(false);
            this.ttfdAutoCloseFuture = null;
        }
    }

    private void clear() {
        this.firstActivityCreated = false;
        this.activityLifecycleMap.clear();
    }

    private void finishAppStartSpan() {
        SentryDate projectedStopTimestamp = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options).getProjectedStopTimestamp();
        if (!this.performanceEnabled || projectedStopTimestamp == null) {
            return;
        }
        finishSpan(this.appStartSpan, projectedStopTimestamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: finishExceededTtfdSpan, reason: merged with bridge method [inline-methods] */
    public void m8899xd0749c28(ISpan iSpan, ISpan iSpan2) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.setDescription(getExceededTtfdDesc(iSpan));
        SentryDate finishDate = iSpan2 != null ? iSpan2.getFinishDate() : null;
        if (finishDate == null) {
            finishDate = iSpan.getStartDate();
        }
        finishSpan(iSpan, finishDate, SpanStatus.DEADLINE_EXCEEDED);
    }

    private void finishSpan(ISpan iSpan) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.finish();
    }

    private void finishSpan(ISpan iSpan, SentryDate sentryDate) {
        finishSpan(iSpan, sentryDate, null);
    }

    private void finishSpan(ISpan iSpan, SentryDate sentryDate, SpanStatus spanStatus) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        if (spanStatus == null) {
            spanStatus = iSpan.getStatus() != null ? iSpan.getStatus() : SpanStatus.OK;
        }
        iSpan.finish(spanStatus, sentryDate);
    }

    private void finishSpan(ISpan iSpan, SpanStatus spanStatus) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.finish(spanStatus);
    }

    private void finishTransaction(final ITransaction iTransaction, ISpan iSpan, ISpan iSpan2) {
        if (iTransaction == null || iTransaction.isFinished()) {
            return;
        }
        finishSpan(iSpan, SpanStatus.DEADLINE_EXCEEDED);
        m8899xd0749c28(iSpan2, iSpan);
        cancelTtfdAutoClose();
        SpanStatus status = iTransaction.getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        iTransaction.finish(status);
        IHub iHub = this.hub;
        if (iHub != null) {
            iHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda8
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    this.f$0.m8894x44f2e05d(iTransaction, iScope);
                }
            });
        }
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String getAppStartDesc(boolean z2) {
        return z2 ? "Cold Start" : "Warm Start";
    }

    private String getAppStartOp(boolean z2) {
        return z2 ? APP_START_COLD : APP_START_WARM;
    }

    private String getExceededTtfdDesc(ISpan iSpan) {
        String description = iSpan.getDescription();
        return (description == null || !description.endsWith(" - Deadline Exceeded")) ? iSpan.getDescription() + " - Deadline Exceeded" : description;
    }

    private String getTtfdDesc(String str) {
        return str + " full display";
    }

    private String getTtidDesc(String str) {
        return str + " initial display";
    }

    private boolean isPerformanceEnabled(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean isRunningTransactionOrTrace(Activity activity) {
        return this.activitiesWithOngoingTransactions.containsKey(activity);
    }

    static /* synthetic */ void lambda$clearScope$4(ITransaction iTransaction, IScope iScope, ITransaction iTransaction2) {
        if (iTransaction2 == iTransaction) {
            iScope.clearTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFirstFrameDrawn, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m8897xab3f137f(ISpan iSpan, ISpan iSpan2) {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
        TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
        if (appStartTimeSpan.hasStarted() && appStartTimeSpan.hasNotStopped()) {
            appStartTimeSpan.stop();
        }
        if (sdkInitTimeSpan.hasStarted() && sdkInitTimeSpan.hasNotStopped()) {
            sdkInitTimeSpan.stop();
        }
        finishAppStartSpan();
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null || iSpan2 == null) {
            finishSpan(iSpan2);
            return;
        }
        SentryDate sentryDateNow = sentryAndroidOptions.getDateProvider().now();
        long millis = TimeUnit.NANOSECONDS.toMillis(sentryDateNow.diff(iSpan2.getStartDate()));
        iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_INITIAL_DISPLAY, Long.valueOf(millis), MeasurementUnit.Duration.MILLISECOND);
        if (iSpan != null && iSpan.isFinished()) {
            iSpan.updateEndDate(sentryDateNow);
            iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(millis), MeasurementUnit.Duration.MILLISECOND);
        }
        finishSpan(iSpan2, sentryDateNow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFullFrameDrawn, reason: merged with bridge method [inline-methods] */
    public void m8895xcabdace(ISpan iSpan) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null || iSpan == null) {
            finishSpan(iSpan);
        } else {
            SentryDate sentryDateNow = sentryAndroidOptions.getDateProvider().now();
            iSpan.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(sentryDateNow.diff(iSpan.getStartDate()))), MeasurementUnit.Duration.MILLISECOND);
            finishSpan(iSpan, sentryDateNow);
        }
        cancelTtfdAutoClose();
    }

    private void setSpanOrigin(ISpan iSpan) {
        if (iSpan != null) {
            iSpan.getSpanContext().setOrigin(TRACE_ORIGIN);
        }
    }

    private void startTracing(Activity activity) {
        SentryDate startTimestamp;
        Boolean boolValueOf;
        SentryDate sentryDate;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.hub == null || isRunningTransactionOrTrace(activity)) {
            return;
        }
        if (!this.performanceEnabled) {
            this.activitiesWithOngoingTransactions.put(activity, NoOpTransaction.getInstance());
            TracingUtils.startNewTrace(this.hub);
            return;
        }
        stopPreviousTransactions();
        final String activityName = getActivityName(activity);
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        TracesSamplingDecision tracesSamplingDecision = null;
        if (ContextUtils.isForegroundImportance() && appStartTimeSpanWithFallback.hasStarted()) {
            startTimestamp = appStartTimeSpanWithFallback.getStartTimestamp();
            boolValueOf = Boolean.valueOf(AppStartMetrics.getInstance().getAppStartType() == AppStartMetrics.AppStartType.COLD);
        } else {
            startTimestamp = null;
            boolValueOf = null;
        }
        TransactionOptions transactionOptions = new TransactionOptions();
        transactionOptions.setDeadlineTimeout(30000L);
        if (this.options.isEnableActivityLifecycleTracingAutoFinish()) {
            transactionOptions.setIdleTimeout(this.options.getIdleTimeout());
            transactionOptions.setTrimEnd(true);
        }
        transactionOptions.setWaitForChildren(true);
        transactionOptions.setTransactionFinishedCallback(new TransactionFinishedCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1
            @Override // io.sentry.TransactionFinishedCallback
            public final void execute(ITransaction iTransaction) {
                this.f$0.m8898x4339eaa7(weakReference, activityName, iTransaction);
            }
        });
        if (this.firstActivityCreated || startTimestamp == null || boolValueOf == null) {
            sentryDate = this.lastPausedTime;
        } else {
            TracesSamplingDecision appStartSamplingDecision = AppStartMetrics.getInstance().getAppStartSamplingDecision();
            AppStartMetrics.getInstance().setAppStartSamplingDecision(null);
            tracesSamplingDecision = appStartSamplingDecision;
            sentryDate = startTimestamp;
        }
        transactionOptions.setStartTimestamp(sentryDate);
        transactionOptions.setAppStartTransaction(tracesSamplingDecision != null);
        final ITransaction iTransactionStartTransaction = this.hub.startTransaction(new TransactionContext(activityName, TransactionNameSource.COMPONENT, UI_LOAD_OP, tracesSamplingDecision), transactionOptions);
        setSpanOrigin(iTransactionStartTransaction);
        if (!this.firstActivityCreated && startTimestamp != null && boolValueOf != null) {
            ISpan iSpanStartChild = iTransactionStartTransaction.startChild(getAppStartOp(boolValueOf.booleanValue()), getAppStartDesc(boolValueOf.booleanValue()), startTimestamp, Instrumenter.SENTRY);
            this.appStartSpan = iSpanStartChild;
            setSpanOrigin(iSpanStartChild);
            finishAppStartSpan();
        }
        final ISpan iSpanStartChild2 = iTransactionStartTransaction.startChild(TTID_OP, getTtidDesc(activityName), sentryDate, Instrumenter.SENTRY);
        this.ttidSpanMap.put(activity, iSpanStartChild2);
        setSpanOrigin(iSpanStartChild2);
        if (this.timeToFullDisplaySpanEnabled && this.fullyDisplayedReporter != null && this.options != null) {
            final ISpan iSpanStartChild3 = iTransactionStartTransaction.startChild(TTFD_OP, getTtfdDesc(activityName), sentryDate, Instrumenter.SENTRY);
            setSpanOrigin(iSpanStartChild3);
            try {
                this.ttfdSpanMap.put(activity, iSpanStartChild3);
                this.ttfdAutoCloseFuture = this.options.getExecutorService().schedule(new Runnable() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8899xd0749c28(iSpanStartChild3, iSpanStartChild2);
                    }
                }, TTFD_TIMEOUT_MILLIS);
            } catch (RejectedExecutionException e2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e2);
            }
        }
        this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda3
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                this.f$0.m8900x5daf4da9(iTransactionStartTransaction, iScope);
            }
        });
        this.activitiesWithOngoingTransactions.put(activity, iTransactionStartTransaction);
    }

    private void stopPreviousTransactions() {
        for (Map.Entry<Activity, ITransaction> entry : this.activitiesWithOngoingTransactions.entrySet()) {
            finishTransaction(entry.getValue(), this.ttidSpanMap.get(entry.getKey()), this.ttfdSpanMap.get(entry.getKey()));
        }
    }

    private void stopTracing(Activity activity, boolean z2) {
        if (this.performanceEnabled && z2) {
            finishTransaction(this.activitiesWithOngoingTransactions.get(activity), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: applyScope, reason: merged with bridge method [inline-methods] */
    public void m8900x5daf4da9(final IScope iScope, final ITransaction iTransaction) {
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda9
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction2) {
                this.f$0.m8893xd15ba770(iScope, iTransaction, iTransaction2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: clearScope, reason: merged with bridge method [inline-methods] */
    public void m8894x44f2e05d(final IScope iScope, final ITransaction iTransaction) {
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda0
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction2) {
                ActivityLifecycleIntegration.lambda$clearScope$4(iTransaction, iScope, iTransaction2);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.activityFramesTracker.stop();
    }

    WeakHashMap<Activity, ITransaction> getActivitiesWithOngoingTransactions() {
        return this.activitiesWithOngoingTransactions;
    }

    ActivityFramesTracker getActivityFramesTracker() {
        return this.activityFramesTracker;
    }

    WeakHashMap<Activity, ActivityLifecycleTimeSpan> getActivityLifecycleMap() {
        return this.activityLifecycleMap;
    }

    ISpan getAppStartSpan() {
        return this.appStartSpan;
    }

    WeakHashMap<Activity, ISpan> getTtfdSpanMap() {
        return this.ttfdSpanMap;
    }

    WeakHashMap<Activity, ISpan> getTtidSpanMap() {
        return this.ttidSpanMap;
    }

    /* JADX INFO: renamed from: lambda$applyScope$3$io-sentry-android-core-ActivityLifecycleIntegration, reason: not valid java name */
    /* synthetic */ void m8893xd15ba770(IScope iScope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            iScope.setTransaction(iTransaction);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
        }
    }

    /* JADX INFO: renamed from: lambda$startTracing$0$io-sentry-android-core-ActivityLifecycleIntegration, reason: not valid java name */
    /* synthetic */ void m8898x4339eaa7(WeakReference weakReference, String str, ITransaction iTransaction) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        FullyDisplayedReporter fullyDisplayedReporter;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.isAllActivityCallbacksAvailable) {
            onActivityPreCreated(activity, bundle);
        }
        if (this.hub != null && (sentryAndroidOptions = this.options) != null && sentryAndroidOptions.isEnableScreenTracking()) {
            final String className = ClassUtil.getClassName(activity);
            this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda4
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.setScreen(className);
                }
            });
        }
        startTracing(activity);
        final ISpan iSpan = this.ttfdSpanMap.get(activity);
        this.firstActivityCreated = true;
        if (this.performanceEnabled && iSpan != null && (fullyDisplayedReporter = this.fullyDisplayedReporter) != null) {
            fullyDisplayedReporter.registerFullyDrawnListener(new FullyDisplayedReporter.FullyDisplayedReporterListener() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda5
                @Override // io.sentry.FullyDisplayedReporter.FullyDisplayedReporterListener
                public final void onFullyDrawn() {
                    this.f$0.m8895xcabdace(iSpan);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        this.activityLifecycleMap.remove(activity);
        if (this.performanceEnabled) {
            finishSpan(this.appStartSpan, SpanStatus.CANCELLED);
            ISpan iSpan = this.ttidSpanMap.get(activity);
            ISpan iSpan2 = this.ttfdSpanMap.get(activity);
            finishSpan(iSpan, SpanStatus.DEADLINE_EXCEEDED);
            m8899xd0749c28(iSpan2, iSpan);
            cancelTtfdAutoClose();
            stopTracing(activity, true);
            this.appStartSpan = null;
            this.ttidSpanMap.remove(activity);
            this.ttfdSpanMap.remove(activity);
        }
        this.activitiesWithOngoingTransactions.remove(activity);
        if (this.activitiesWithOngoingTransactions.isEmpty() && !activity.isChangingConfigurations()) {
            clear();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        if (!this.isAllActivityCallbacksAvailable) {
            onActivityPrePaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (this.appStartSpan == null) {
            this.activityLifecycleMap.remove(activity);
            return;
        }
        ActivityLifecycleTimeSpan activityLifecycleTimeSpan = this.activityLifecycleMap.get(activity);
        if (activityLifecycleTimeSpan != null) {
            activityLifecycleTimeSpan.getOnCreate().stop();
            activityLifecycleTimeSpan.getOnCreate().setDescription(activity.getClass().getName() + ".onCreate");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        ActivityLifecycleTimeSpan activityLifecycleTimeSpanRemove = this.activityLifecycleMap.remove(activity);
        if (this.appStartSpan == null || activityLifecycleTimeSpanRemove == null) {
            return;
        }
        activityLifecycleTimeSpanRemove.getOnStart().stop();
        activityLifecycleTimeSpanRemove.getOnStart().setDescription(activity.getClass().getName() + ".onStart");
        AppStartMetrics.getInstance().addActivityLifecycleTimeSpans(activityLifecycleTimeSpanRemove);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (this.firstActivityCreated) {
            return;
        }
        IHub iHub = this.hub;
        this.lastPausedTime = iHub != null ? iHub.getOptions().getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime();
        this.lastPausedUptimeMillis = SystemClock.uptimeMillis();
        ActivityLifecycleTimeSpan activityLifecycleTimeSpan = new ActivityLifecycleTimeSpan();
        activityLifecycleTimeSpan.getOnCreate().setStartedAt(this.lastPausedUptimeMillis);
        this.activityLifecycleMap.put(activity, activityLifecycleTimeSpan);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.firstActivityCreated = true;
        IHub iHub = this.hub;
        this.lastPausedTime = iHub != null ? iHub.getOptions().getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime();
        this.lastPausedUptimeMillis = SystemClock.uptimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        ActivityLifecycleTimeSpan activityLifecycleTimeSpan;
        if (this.appStartSpan == null || (activityLifecycleTimeSpan = this.activityLifecycleMap.get(activity)) == null) {
            return;
        }
        activityLifecycleTimeSpan.getOnStart().setStartedAt(SystemClock.uptimeMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.isAllActivityCallbacksAvailable) {
            onActivityPostStarted(activity);
        }
        if (this.performanceEnabled) {
            final ISpan iSpan = this.ttidSpanMap.get(activity);
            final ISpan iSpan2 = this.ttfdSpanMap.get(activity);
            if (activity.getWindow() != null) {
                FirstDrawDoneListener.registerForNextDraw(activity, new Runnable() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8896x1e0461fe(iSpan2, iSpan);
                    }
                }, this.buildInfoProvider);
            } else {
                short sXd = (short) (C1580rY.Xd() ^ (-25320));
                int[] iArr = new int["'3(51*$l-0i\u0007)((\u001c(".length()];
                QB qb = new QB("'3(51*$l-0i\u0007)((\u001c(");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1593ug.zd("^]mG\\ekJnoqgu", (short) (OY.Xd() ^ 26556), (short) (OY.Xd() ^ 9994)), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    Runnable runnable = new Runnable() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m8897xab3f137f(iSpan2, iSpan);
                        }
                    };
                    Class<?> cls = Class.forName(C1561oA.od("gshuqjd-mp*C[g\\c[g", (short) (C1499aX.Xd() ^ (-7191))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd2 = (short) (C1499aX.Xd() ^ (-31791));
                    int[] iArr2 = new int["RJ`L\u001aYO]W\u001fDhbcWYd^".length()];
                    QB qb2 = new QB("RJ`L\u001aYO]W\u001fDhbcWYd^");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr2 = {runnable};
                    Method method = cls.getMethod(Wg.Zd("\u001b1\u000f\\", (short) (OY.Xd() ^ 21111), (short) (OY.Xd() ^ 6480)), clsArr);
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
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.isAllActivityCallbacksAvailable) {
            onActivityPostCreated(activity, null);
            onActivityPreStarted(activity);
        }
        if (this.performanceEnabled) {
            this.activityFramesTracker.addActivity(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) throws Throwable {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, C1561oA.Xd("~\u0012\u001c#\"*r!\u0018'% \u001c\b*/%,,2_*5b6*7<1;//", (short) (Od.Xd() ^ (-31021))));
        this.hub = (IHub) Objects.requireNonNull(iHub, Wg.vd("\n8\"`/:c7/<=2@40", (short) (C1607wl.Xd() ^ 31751)));
        this.performanceEnabled = isPerformanceEnabled(this.options);
        this.fullyDisplayedReporter = this.options.getFullyDisplayedReporter();
        this.timeToFullDisplaySpanEnabled = this.options.isEnableTimeToFullDisplayTracing();
        Application application = this.application;
        Class<?> cls = Class.forName(Qg.kd("%1&3/(\"j\u001d+*fx'&!\u001d\u0016\u0013%\u0019\u001e\u001c", (short) (C1580rY.Xd() ^ (-7499)), (short) (C1580rY.Xd() ^ (-31315))));
        Class<?>[] clsArr = {Class.forName(hg.Vd("/;0=92,t'54p\u000310+' \u001d/#(&Zv\u0018(\u001c(\u001a$(y\u0016\u0012\u0010\r\"\u000b\u0013\u000bg\u0005\u000f\u000e\u0003\u0001\u0002\t\u0010", (short) (C1580rY.Xd() ^ (-15315)), (short) (C1580rY.Xd() ^ (-15404))))};
        Object[] objArr = {this};
        short sXd = (short) (C1499aX.Xd() ^ (-12985));
        int[] iArr = new int["\u001b\r\u000e\u000f\u0018\u0018\b\u0014a\u0003\u0013\u0007\u0013\u0005\u000f\u0013d\u0001|zw\ru}uRoyxmklsz".length()];
        QB qb = new QB("\u001b\r\u000e\u000f\u0018\u0018\b\u0014a\u0003\u0013\u0007\u0013\u0005\u000f\u0013d\u0001|zw\ru}uRoyxmklsz");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
            this.options.getLogger().log(SentryLevel.DEBUG, C1561oA.yd("g\t\u0019\r\u0019\u000b\u0015\u0019j\u0007\u0003\u0001}\u0013{\u0004\u001c~#(\u0018\u0019#\u0011#\u0017\u001c\u001aJ\u0013\u0017\u001b;'10(&n", (short) (FB.Xd() ^ 9276)), new Object[0]);
            short sXd2 = (short) (Od.Xd() ^ (-7519));
            int[] iArr2 = new int["l\u0010\"\u0018&\u001a&,\u007f\u001e\u001c\u001c\u001b2\u001d'!".length()];
            QB qb2 = new QB("l\u0010\"\u0018&\u001a&,\u007f\u001e\u001c\u001c\u001b2\u001d'!");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            IntegrationUtils.addIntegrationToSdkVersion(new String(iArr2, 0, i3));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void setFirstActivityCreated(boolean z2) {
        this.firstActivityCreated = z2;
    }
}
