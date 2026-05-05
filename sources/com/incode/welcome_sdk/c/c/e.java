package com.incode.welcome_sdk.c.c;

import com.incode.welcome_sdk.c.c.b;
import com.incode.welcome_sdk.commons.utils.z;
import io.sentry.BaggageHeader;
import io.sentry.Breadcrumb;
import io.sentry.CheckIn;
import io.sentry.ExternalOptions;
import io.sentry.Hint;
import io.sentry.Hub;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.IOptionsObserver;
import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ITransaction;
import io.sentry.Integration;
import io.sentry.JavaMemoryCollector;
import io.sentry.NoOpHub;
import io.sentry.NoOpLogger;
import io.sentry.OptionsContainer;
import io.sentry.ScopeCallback;
import io.sentry.SentryEvent;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryTraceHeader;
import io.sentry.SystemOutLogger;
import io.sentry.TransactionContext;
import io.sentry.TransactionOptions;
import io.sentry.UserFeedback;
import io.sentry.backpressure.BackpressureMonitor;
import io.sentry.backpressure.NoOpBackpressureMonitor;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.config.PropertiesProviderFactory;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.debugmeta.ResourcesDebugMetaLoader;
import io.sentry.internal.modules.CompositeModulesLoader;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.ManifestModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.modules.ResourcesModulesLoader;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.DebugMetaPropertiesApplier;
import io.sentry.util.FileUtils;
import io.sentry.util.Platform;
import io.sentry.util.thread.IMainThreadChecker;
import io.sentry.util.thread.MainThreadChecker;
import io.sentry.util.thread.NoOpMainThreadChecker;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f4529b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IHub f4531d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f4530c = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<IHub> f4532e = new ThreadLocal<>();

    public interface c<T extends SentryOptions> {
        void configure(T t2);
    }

    private e() {
    }

    static {
        NoOpHub noOpHub = NoOpHub.getInstance();
        Intrinsics.checkNotNullExpressionValue(noOpHub, "");
        f4531d = noOpHub;
        f4528a = System.currentTimeMillis();
    }

    public static IHub c() {
        if (f4529b) {
            return f4531d;
        }
        ThreadLocal<IHub> threadLocal = f4532e;
        IHub iHubM8871clone = threadLocal.get();
        if (iHubM8871clone == null || (iHubM8871clone instanceof NoOpHub)) {
            iHubM8871clone = f4531d.m8871clone();
            threadLocal.set(iHubM8871clone);
        }
        Intrinsics.checkNotNull(iHubM8871clone);
        return iHubM8871clone;
    }

    public static boolean b() {
        return c().isEnabled();
    }

    public final <T extends SentryOptions> void e(OptionsContainer<T> optionsContainer, c<T> cVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        ILogger logger;
        Intrinsics.checkNotNullParameter(optionsContainer, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        T tCreateInstance = optionsContainer.createInstance();
        Intrinsics.checkNotNullExpressionValue(tCreateInstance, "");
        T t2 = tCreateInstance;
        try {
            cVar.configure(t2);
        } catch (Throwable th) {
            if (t2 != null && (logger = t2.getLogger()) != null) {
                logger.log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
            }
        }
        e((SentryOptions) t2, true);
    }

    public final void b(SentryOptions sentryOptions) {
        Intrinsics.checkNotNullParameter(sentryOptions, "");
        e(sentryOptions, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SentryOptions sentryOptions) throws Throwable {
        Intrinsics.checkNotNullParameter(sentryOptions, "");
        z zVar = z.f6699c;
        Method methodD = z.d("io.sentry.SentryOptions", "loadLazyFields", new Class[0]);
        if (methodD == null) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error in calling io.sentry.SentryOptions.loadLazyFields(). Will proceed without crash reporting working.", new Object[0]);
        } else {
            z zVar2 = z.f6699c;
            z.b(methodD, sentryOptions, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SentryOptions sentryOptions) {
        Intrinsics.checkNotNullParameter(sentryOptions, "");
        for (IOptionsObserver iOptionsObserver : sentryOptions.getOptionsObservers()) {
            iOptionsObserver.setRelease(sentryOptions.getRelease());
            iOptionsObserver.setProguardUuid(sentryOptions.getProguardUuid());
            iOptionsObserver.setSdkVersion(sentryOptions.getSdkVersion());
            iOptionsObserver.setDist(sentryOptions.getDist());
            iOptionsObserver.setEnvironment(sentryOptions.getEnvironment());
            iOptionsObserver.setTags(sentryOptions.getTags());
            iOptionsObserver.setReplayErrorSampleRate(sentryOptions.getSessionReplay().getOnErrorSampleRate());
        }
        PersistingScopeObserver persistingScopeObserverFindPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (persistingScopeObserverFindPersistingScopeObserver != null) {
            persistingScopeObserverFindPersistingScopeObserver.resetCache();
        }
    }

    private final boolean c(SentryOptions sentryOptions) throws Throwable {
        ILogger logger = sentryOptions.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "");
        if (sentryOptions.isEnableExternalConfiguration()) {
            sentryOptions.merge(ExternalOptions.from(PropertiesProviderFactory.create(), logger));
        }
        String dsn = sentryOptions.getDsn();
        if (sentryOptions.isEnabled() && (dsn == null || dsn.length() != 0)) {
            if (dsn == null) {
                throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.".toString());
            }
            z zVar = z.f6699c;
            Method methodD = z.d("io.sentry.SentryOptions", "retrieveParsedDsn", new Class[0]);
            if (methodD == null) {
                logger.log(SentryLevel.ERROR, "Error in calling io.sentry.SentryOptions.retrieveParsedDsn(). Will proceed without crash reporting working.", new Object[0]);
            } else {
                z zVar2 = z.f6699c;
                z.b(methodD, sentryOptions, new Object[0]);
            }
            if (sentryOptions.isDebug() && (logger instanceof NoOpLogger)) {
                sentryOptions.setLogger(new SystemOutLogger());
                logger = sentryOptions.getLogger();
                Intrinsics.checkNotNullExpressionValue(logger, "");
            }
            logger.log(SentryLevel.INFO, "Initializing SDK with DSN: '%s'", sentryOptions.getDsn());
            String outboxPath = sentryOptions.getOutboxPath();
            if (outboxPath != null) {
                new File(outboxPath).mkdirs();
            } else {
                logger.log(SentryLevel.INFO, "No outbox dir path is defined in options.", new Object[0]);
            }
            String cacheDirPath = sentryOptions.getCacheDirPath();
            if (cacheDirPath != null) {
                new File(cacheDirPath).mkdirs();
                IEnvelopeCache envelopeDiskCache = sentryOptions.getEnvelopeDiskCache();
                Intrinsics.checkNotNullExpressionValue(envelopeDiskCache, "");
                if (envelopeDiskCache instanceof NoOpEnvelopeCache) {
                    sentryOptions.setEnvelopeDiskCache(EnvelopeCache.create(sentryOptions));
                }
            }
            String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
            if (sentryOptions.isProfilingEnabled() && profilingTracesDirPath != null) {
                final File file = new File(profilingTracesDirPath);
                file.mkdirs();
                try {
                    sentryOptions.getExecutorService().submit(new Runnable() { // from class: com.incode.welcome_sdk.c.c.e$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.e(file);
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    logger.log(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
                }
            }
            IModulesLoader modulesLoader = sentryOptions.getModulesLoader();
            Intrinsics.checkNotNullExpressionValue(modulesLoader, "");
            if (!sentryOptions.isSendModules()) {
                sentryOptions.setModulesLoader(NoOpModulesLoader.getInstance());
            } else if (modulesLoader instanceof NoOpModulesLoader) {
                sentryOptions.setModulesLoader(new CompositeModulesLoader(Arrays.asList(new ManifestModulesLoader(logger), new ResourcesModulesLoader(logger)), logger));
            }
            if (sentryOptions.getDebugMetaLoader() instanceof NoOpDebugMetaLoader) {
                sentryOptions.setDebugMetaLoader(new ResourcesDebugMetaLoader(logger));
            }
            DebugMetaPropertiesApplier.applyToOptions(sentryOptions, sentryOptions.getDebugMetaLoader().loadDebugMeta());
            int iA = com.incode.welcome_sdk.c.c.c.a(sentryOptions);
            if (iA == 8) {
                if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(Class.forName("io.sentry.SentryOptions").getMethod("getThreadChecker", new Class[0]).invoke(sentryOptions, new Object[0]).getClass()), Reflection.getOrCreateKotlinClass(Class.forName("io.sentry.util.thread.NoOpThreadChecker").getClass()))) {
                    Class.forName("io.sentry.SentryOptions").getMethod("setThreadChecker", new Class[0]).invoke(sentryOptions, Class.forName("io.sentry.util.thread.ThreadChecker").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
                }
            } else {
                IMainThreadChecker mainThreadChecker = sentryOptions.getMainThreadChecker();
                Intrinsics.checkNotNullExpressionValue(mainThreadChecker, "");
                if (mainThreadChecker instanceof NoOpMainThreadChecker) {
                    sentryOptions.setMainThreadChecker(MainThreadChecker.getInstance());
                }
            }
            if (sentryOptions.getPerformanceCollectors().isEmpty()) {
                sentryOptions.addPerformanceCollector(new JavaMemoryCollector());
            }
            if (sentryOptions.isEnableBackpressureHandling()) {
                if (iA == 8) {
                    if (Platform.isJvm() && (sentryOptions.getBackpressureMonitor() instanceof NoOpBackpressureMonitor)) {
                        Class<?> cls = Class.forName("io.sentry.ScopesAdapter");
                        Object objNewInstance = Class.forName("io.sentry.backpressure.BackpressureMonitor").getConstructor(SentryOptions.class, cls).newInstance(sentryOptions, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
                        Intrinsics.checkNotNull(objNewInstance, "");
                        sentryOptions.setBackpressureMonitor((BackpressureMonitor) objNewInstance);
                    }
                } else {
                    b.e eVar = b.f4513a;
                    sentryOptions.setBackpressureMonitor(new BackpressureMonitor(sentryOptions, b.f4514b));
                }
                sentryOptions.getBackpressureMonitor().start();
            }
            return true;
        }
        e();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f4528a - TimeUnit.MINUTES.toMillis(5L)) {
                FileUtils.deleteRecursively(file2);
            }
        }
    }

    public final synchronized void e() {
        IHub iHubC = c();
        NoOpHub noOpHub = NoOpHub.getInstance();
        Intrinsics.checkNotNullExpressionValue(noOpHub, "");
        f4531d = noOpHub;
        f4532e.remove();
        iHubC.close();
    }

    public static SentryId b(SentryEvent sentryEvent, Hint hint) {
        Intrinsics.checkNotNullParameter(sentryEvent, "");
        SentryId sentryIdCaptureEvent = c().captureEvent(sentryEvent, hint);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureEvent, "");
        return sentryIdCaptureEvent;
    }

    public static SentryId d(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(sentryEvent, "");
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        SentryId sentryIdCaptureEvent = c().captureEvent(sentryEvent, hint, scopeCallback);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureEvent, "");
        return sentryIdCaptureEvent;
    }

    public static SentryId e(String str, SentryLevel sentryLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sentryLevel, "");
        SentryId sentryIdCaptureMessage = c().captureMessage(str, sentryLevel);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureMessage, "");
        return sentryIdCaptureMessage;
    }

    public static SentryId a(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sentryLevel, "");
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        SentryId sentryIdCaptureMessage = c().captureMessage(str, sentryLevel, scopeCallback);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureMessage, "");
        return sentryIdCaptureMessage;
    }

    public static SentryId d(Throwable th, Hint hint) {
        Intrinsics.checkNotNullParameter(th, "");
        SentryId sentryIdCaptureException = c().captureException(th, hint);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureException, "");
        return sentryIdCaptureException;
    }

    public static SentryId d(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        SentryId sentryIdCaptureException = c().captureException(th, hint, scopeCallback);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureException, "");
        return sentryIdCaptureException;
    }

    public static void b(UserFeedback userFeedback) {
        Intrinsics.checkNotNullParameter(userFeedback, "");
        c().captureUserFeedback(userFeedback);
    }

    public static void e(Breadcrumb breadcrumb, Hint hint) {
        Intrinsics.checkNotNullParameter(breadcrumb, "");
        c().addBreadcrumb(breadcrumb, hint);
    }

    public static void c(SentryLevel sentryLevel) {
        c().setLevel(sentryLevel);
    }

    public static void d(String str) {
        c().setTransaction(str);
    }

    public static void b(User user) {
        c().setUser(user);
    }

    public static void e(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        c().setFingerprint(list);
    }

    public static void a() {
        c().clearBreadcrumbs();
    }

    public static void c(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c().setTag(str, str2);
    }

    public static void e(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c().removeTag(str);
    }

    public static void e(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c().setExtra(str, str2);
    }

    public static void c(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c().removeExtra(str);
    }

    public static SentryId d() {
        SentryId lastEventId = c().getLastEventId();
        Intrinsics.checkNotNullExpressionValue(lastEventId, "");
        return lastEventId;
    }

    public static void f() {
        if (f4529b) {
            return;
        }
        c().pushScope();
    }

    public static void i() {
        if (f4529b) {
            return;
        }
        c().popScope();
    }

    public static void a(ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        c().withScope(scopeCallback);
    }

    public static void d(ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        c().configureScope(scopeCallback);
    }

    public static void d(ISentryClient iSentryClient) {
        Intrinsics.checkNotNullParameter(iSentryClient, "");
        c().bindClient(iSentryClient);
    }

    public static boolean g() {
        return c().isHealthy();
    }

    public static void c(long j2) {
        c().flush(j2);
    }

    public static void j() {
        c().startSession();
    }

    public static void h() {
        c().endSession();
    }

    public static ITransaction d(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        Intrinsics.checkNotNullParameter(transactionContext, "");
        Intrinsics.checkNotNullParameter(transactionOptions, "");
        ITransaction iTransactionStartTransaction = c().startTransaction(transactionContext, transactionOptions);
        Intrinsics.checkNotNullExpressionValue(iTransactionStartTransaction, "");
        return iTransactionStartTransaction;
    }

    @Deprecated(message = "Please use {@link IncodeSentry#traceparent} instead.", replaceWith = @ReplaceWith(expression = "IncodeSentry.traceparent", imports = {"com.incode.welcome_sdk.analytics.sentry.IncodeSentry.traceparent"}))
    public static SentryTraceHeader o() {
        return c().traceHeaders();
    }

    public static Boolean k() {
        return c().isCrashedLastRun();
    }

    @JvmStatic
    public static final void m() {
        c().reportFullyDisplayed();
    }

    public static TransactionContext e(String str, List<String> list) {
        return c().continueTrace(str, list);
    }

    public static SentryTraceHeader n() {
        return c().getTraceparent();
    }

    public static BaggageHeader l() {
        return c().getBaggage();
    }

    @JvmStatic
    public static final SentryId c(CheckIn checkIn) {
        Intrinsics.checkNotNullParameter(checkIn, "");
        SentryId sentryIdCaptureCheckIn = c().captureCheckIn(checkIn);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureCheckIn, "");
        return sentryIdCaptureCheckIn;
    }

    private final synchronized void e(final SentryOptions sentryOptions, boolean z2) {
        if (c().isEnabled()) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
        }
        if (c(sentryOptions)) {
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: com.incode.welcome_sdk.c.c.e$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        e.a(sentryOptions);
                    }
                });
            } catch (RejectedExecutionException e2) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
            }
            sentryOptions.getLogger().log(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(z2));
            f4529b = z2;
            int iA = com.incode.welcome_sdk.c.c.c.a(sentryOptions);
            if (iA != 8) {
                IHub iHubC = c();
                f4531d = new Hub(sentryOptions);
                f4532e.set(f4531d);
                iHubC.close(true);
            }
            if (sentryOptions.getExecutorService().isClosed()) {
                sentryOptions.setExecutorService(new SentryExecutorService());
            }
            for (Integration integration : sentryOptions.getIntegrations()) {
                if (iA != 8) {
                    b.e eVar = b.f4513a;
                    integration.register(b.f4514b, sentryOptions);
                }
            }
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: com.incode.welcome_sdk.c.c.e$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.d(sentryOptions);
                    }
                });
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to notify options observers.", th);
            }
            b.e eVar2 = b.f4513a;
            b bVar = b.f4514b;
            try {
                Constructor<?> declaredConstructor = Class.forName("io.sentry.PreviousSessionFinalizer").getDeclaredConstructor(SentryOptions.class, IHub.class);
                declaredConstructor.setAccessible(true);
                ISentryExecutorService executorService = sentryOptions.getExecutorService();
                Object objNewInstance = declaredConstructor.newInstance(sentryOptions, bVar);
                Intrinsics.checkNotNull(objNewInstance, "");
                executorService.submit((Runnable) objNewInstance);
            } catch (Throwable th2) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to finalize previous session.", th2);
            }
        }
    }
}
