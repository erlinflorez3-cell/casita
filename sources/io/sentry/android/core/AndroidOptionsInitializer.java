package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.DeduplicateMultithreadedEventProcessor;
import io.sentry.DefaultTransactionPerformanceCollector;
import io.sentry.ILogger;
import io.sentry.ITransactionProfiler;
import io.sentry.NoOpConnectionStatusProvider;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SendFireAndForgetEnvelopeSender;
import io.sentry.SendFireAndForgetOutboxSender;
import io.sentry.SentryLevel;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.debugmeta.AssetsDebugMetaLoader;
import io.sentry.android.core.internal.gestures.AndroidViewGestureTargetLocator;
import io.sentry.android.core.internal.modules.AssetsModulesLoader;
import io.sentry.android.core.internal.util.AndroidConnectionStatusProvider;
import io.sentry.android.core.internal.util.AndroidMainThreadChecker;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.PersistingOptionsObserver;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.FB;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
final class AndroidOptionsInitializer {
    static final String COMPOSE_CLASS_NAME = "androidx.compose.ui.node.Owner";
    static final long DEFAULT_FLUSH_TIMEOUT_MS = 4000;
    static final String SENTRY_COMPOSE_GESTURE_INTEGRATION_CLASS_NAME = "io.sentry.compose.gestures.ComposeGestureTargetLocator";
    static final String SENTRY_COMPOSE_VIEW_HIERARCHY_INTEGRATION_CLASS_NAME = "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter";

    private AndroidOptionsInitializer() {
    }

    static File getCacheDir(Context context) throws Throwable {
        Class<?> cls = Class.forName(Xg.qd("6D;JHC?\n@MMTFPW\u0012(UU\\Nb_", (short) (FB.Xd() ^ 17962), (short) (FB.Xd() ^ 24772)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 29259);
        short sXd2 = (short) (FB.Xd() ^ 186);
        int[] iArr = new int["\u001b>fS\u000b#A\\D\u00102".length()];
        QB qb = new QB("\u001b>fS\u000b#A\\D\u00102");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return new File((File) method.invoke(context, objArr), ZO.xd("g\u000ezS_?", (short) (FB.Xd() ^ 31354), (short) (FB.Xd() ^ 19202)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String getSentryReleaseVersion(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    static void initializeIntegrationsAndProcessors(SentryAndroidOptions sentryAndroidOptions, Context context, BuildInfoProvider buildInfoProvider, LoadClass loadClass, ActivityFramesTracker activityFramesTracker) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof NoOpEnvelopeCache)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new AndroidEnvelopeCache(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof NoOpConnectionStatusProvider) {
            sentryAndroidOptions.setConnectionStatusProvider(new AndroidConnectionStatusProvider(context, sentryAndroidOptions.getLogger(), buildInfoProvider));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new PersistingScopeObserver(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new PersistingOptionsObserver(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new DeduplicateMultithreadedEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new DefaultAndroidEventProcessor(context, buildInfoProvider, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new PerformanceAndroidEventProcessor(sentryAndroidOptions, activityFramesTracker));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, buildInfoProvider));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new AnrV2EventProcessor(context, sentryAndroidOptions, buildInfoProvider));
        sentryAndroidOptions.setTransportGate(new AndroidTransportGate(sentryAndroidOptions));
        synchronized (AppStartMetrics.getInstance()) {
            ITransactionProfiler appStartProfiler = AppStartMetrics.getInstance().getAppStartProfiler();
            if (appStartProfiler != null) {
                sentryAndroidOptions.setTransactionProfiler(appStartProfiler);
                AppStartMetrics.getInstance().setAppStartProfiler(null);
            } else {
                sentryAndroidOptions.setTransactionProfiler(new AndroidTransactionProfiler(context, sentryAndroidOptions, buildInfoProvider, (SentryFrameMetricsCollector) Objects.requireNonNull(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        sentryAndroidOptions.setModulesLoader(new AssetsModulesLoader(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new AssetsDebugMetaLoader(context, sentryAndroidOptions.getLogger()));
        boolean zIsClassAvailable = loadClass.isClassAvailable("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zIsClassAvailable2 = loadClass.isClassAvailable(COMPOSE_CLASS_NAME, sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new AndroidViewGestureTargetLocator(zIsClassAvailable));
            if (zIsClassAvailable2 && loadClass.isClassAvailable(SENTRY_COMPOSE_GESTURE_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zIsClassAvailable2 && loadClass.isClassAvailable(SENTRY_COMPOSE_VIEW_HIERARCHY_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(AndroidMainThreadChecker.getInstance());
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new AndroidMemoryCollector());
            sentryAndroidOptions.addPerformanceCollector(new AndroidCpuCollector(sentryAndroidOptions.getLogger(), buildInfoProvider));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new SpanFrameMetricsCollector(sentryAndroidOptions, (SentryFrameMetricsCollector) Objects.requireNonNull(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new DefaultTransactionPerformanceCollector(sentryAndroidOptions));
    }

    static void initializeIntegrationsAndProcessors(SentryAndroidOptions sentryAndroidOptions, Context context, LoadClass loadClass, ActivityFramesTracker activityFramesTracker) {
        initializeIntegrationsAndProcessors(sentryAndroidOptions, context, new BuildInfoProvider(new AndroidLogger()), loadClass, activityFramesTracker);
    }

    static void installDefaultIntegrations(Context context, final SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider, LoadClass loadClass, ActivityFramesTracker activityFramesTracker, boolean z2, boolean z3, boolean z4) {
        LazyEvaluator lazyEvaluator = new LazyEvaluator(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.AndroidOptionsInitializer$$ExternalSyntheticLambda0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return Boolean.valueOf(AndroidEnvelopeCache.hasStartupCrashMarker(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new SendFireAndForgetEnvelopeSender(new SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath() { // from class: io.sentry.android.core.AndroidOptionsInitializer$$ExternalSyntheticLambda1
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath
            public final String getDirPath() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), lazyEvaluator));
        sentryAndroidOptions.addIntegration(new NdkIntegration(loadClass.loadClass(NdkIntegration.SENTRY_NDK_CLASS_NAME, sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.getOutboxFileObserver());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new SendFireAndForgetOutboxSender(new SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath() { // from class: io.sentry.android.core.AndroidOptionsInitializer$$ExternalSyntheticLambda2
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath
            public final String getDirPath() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), lazyEvaluator));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AnrIntegrationFactory.create(context, buildInfoProvider));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, buildInfoProvider, activityFramesTracker));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, loadClass));
            if (z2) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z3) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, buildInfoProvider, sentryAndroidOptions.getLogger()));
        if (z4) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, CurrentDateProvider.getInstance());
            replayIntegration.setBreadcrumbConverter(new DefaultReplayBreadcrumbConverter());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }

    static void loadDefaultAndMetadataOptions(SentryAndroidOptions sentryAndroidOptions, Context context) throws Throwable {
        AndroidLogger androidLogger = new AndroidLogger();
        loadDefaultAndMetadataOptions(sentryAndroidOptions, context, androidLogger, new BuildInfoProvider(androidLogger));
    }

    static void loadDefaultAndMetadataOptions(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) throws Throwable {
        Objects.requireNonNull(context, "The context is required.");
        Context applicationContext = ContextUtils.getApplicationContext(context);
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        Objects.requireNonNull(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setDateProvider(new SentryAndroidDateProvider());
        sentryAndroidOptions.setFlushTimeoutMillis(DEFAULT_FLUSH_TIMEOUT_MS);
        sentryAndroidOptions.setFrameMetricsCollector(new SentryFrameMetricsCollector(applicationContext, iLogger, buildInfoProvider));
        ManifestMetadataReader.applyMetadata(applicationContext, sentryAndroidOptions, buildInfoProvider);
        sentryAndroidOptions.setCacheDirPath(getCacheDir(applicationContext).getAbsolutePath());
        readDefaultOptionValues(sentryAndroidOptions, applicationContext, buildInfoProvider);
    }

    private static void readDefaultOptionValues(SentryAndroidOptions sentryAndroidOptions, Context context, BuildInfoProvider buildInfoProvider) {
        PackageInfo packageInfo = ContextUtils.getPackageInfo(context, buildInfoProvider);
        if (packageInfo != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(getSentryReleaseVersion(packageInfo, ContextUtils.getVersionCode(packageInfo, buildInfoProvider)));
            }
            String str = packageInfo.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(Installation.id(context));
            } catch (RuntimeException e2) {
                sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Could not generate distinct Id.", e2);
            }
        }
    }
}
