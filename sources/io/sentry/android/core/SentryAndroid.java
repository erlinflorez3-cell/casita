package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.Integration;
import io.sentry.OptionsContainer;
import io.sentry.ScopeCallback;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryAndroid {
    private static final String FRAGMENT_CLASS_NAME = "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks";
    static final String SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME = "io.sentry.android.fragment.FragmentLifecycleIntegration";
    static final String SENTRY_REPLAY_INTEGRATION_CLASS_NAME = "io.sentry.android.replay.ReplayIntegration";
    static final String SENTRY_TIMBER_INTEGRATION_CLASS_NAME = "io.sentry.android.timber.SentryTimberIntegration";
    private static final String TIMBER_CLASS_NAME = "timber.log.Timber";
    private static final long sdkInitMillis = SystemClock.uptimeMillis();

    private SentryAndroid() {
    }

    private static void deduplicateIntegrations(SentryOptions sentryOptions, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration integration : sentryOptions.getIntegrations()) {
            if (z2 && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z3 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i2 = 0; i2 < arrayList2.size() - 1; i2++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList2.get(i2));
            }
        }
        if (arrayList.size() > 1) {
            for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList.get(i3));
            }
        }
    }

    public static void init(Context context) {
        init(context, new AndroidLogger());
    }

    public static void init(Context context, ILogger iLogger) {
        init(context, iLogger, new Sentry.OptionsConfiguration() { // from class: io.sentry.android.core.SentryAndroid$$ExternalSyntheticLambda2
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                SentryAndroid.lambda$init$0((SentryAndroidOptions) sentryOptions);
            }
        });
    }

    public static synchronized void init(final Context context, final ILogger iLogger, final Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        try {
            try {
                try {
                    Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new Sentry.OptionsConfiguration() { // from class: io.sentry.android.core.SentryAndroid$$ExternalSyntheticLambda0
                        @Override // io.sentry.Sentry.OptionsConfiguration
                        public final void configure(SentryOptions sentryOptions) throws Throwable {
                            SentryAndroid.lambda$init$1(iLogger, context, optionsConfiguration, (SentryAndroidOptions) sentryOptions);
                        }
                    }, true);
                    IHub currentHub = Sentry.getCurrentHub();
                    if (ContextUtils.isForegroundImportance()) {
                        if (currentHub.getOptions().isEnableAutoSessionTracking()) {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            currentHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.SentryAndroid$$ExternalSyntheticLambda1
                                @Override // io.sentry.ScopeCallback
                                public final void run(IScope iScope) {
                                    SentryAndroid.lambda$init$2(atomicBoolean, iScope);
                                }
                            });
                            if (!atomicBoolean.get()) {
                                currentHub.startSession();
                            }
                        }
                        currentHub.getOptions().getReplayController().start();
                    }
                } catch (IllegalAccessException e2) {
                    iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                } catch (NoSuchMethodException e3) {
                    iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
                }
            } catch (InvocationTargetException e4) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (InstantiationException e5) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e5);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e5);
        }
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    static /* synthetic */ void lambda$init$0(SentryAndroidOptions sentryAndroidOptions) {
    }

    static /* synthetic */ void lambda$init$1(ILogger iLogger, Context context, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) throws Throwable {
        LoadClass loadClass = new LoadClass();
        boolean zIsClassAvailable = loadClass.isClassAvailable(C1561oA.od("\u0001twkmy4qsj0Uil`bn", (short) (Od.Xd() ^ (-2846))), sentryAndroidOptions);
        boolean z2 = loadClass.isClassAvailable(C1561oA.Kd("JXO^\\WSh\u001fXeU\\c\\fm(\\lm,ErbipiszTiwkrq\u007f2U\u0003ry\u0001y\u0004\u000bc\u0002\u007f\u007f~\u0016\u0001\u000b\u0005c\u0003\u000f\u0010\u0007\u0007\n\u0013\u001c", (short) (C1633zX.Xd() ^ (-9105))), sentryAndroidOptions) && loadClass.isClassAvailable(Wg.Zd("Yi\u0011a<0?'\u0019VtjkcIN2f(\u001ew\u0007wXl\\~\"7\u0011 \u0010\u0013\u0005uV^EM65*\u001c~m{lfSH@>\u001c-\u0015", (short) (C1607wl.Xd() ^ 13338), (short) (C1607wl.Xd() ^ 30437)), sentryAndroidOptions);
        boolean z3 = zIsClassAvailable && loadClass.isClassAvailable(C1561oA.Xd("<C\u0003I<FMLT\n>LCRPKG\u0012YOTJN\\\u0019?R\\cbjF\\aW[iAgn`co_sipp", (short) (Od.Xd() ^ (-32016))), sentryAndroidOptions);
        short sXd = (short) (ZN.Xd() ^ 14528);
        int[] iArr = new int["-2o4%-2/5h\u001b'\u001c)%\u001e8\u0001D6@;/Fy\u001d/94(?\u000eRWGHR@RFKI".length()];
        QB qb = new QB("-2o4%-2/5h\u001b'\u001c)%\u001e8\u0001D6@;/Fy\u001d/94(?\u000eRWGHR@RFKI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        boolean zIsClassAvailable2 = loadClass.isClassAvailable(new String(iArr, 0, i2), sentryAndroidOptions);
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(iLogger);
        LoadClass loadClass2 = new LoadClass();
        ActivityFramesTracker activityFramesTracker = new ActivityFramesTracker(loadClass2, sentryAndroidOptions);
        AndroidOptionsInitializer.loadDefaultAndMetadataOptions(sentryAndroidOptions, context, iLogger, buildInfoProvider);
        AndroidOptionsInitializer.installDefaultIntegrations(context, sentryAndroidOptions, buildInfoProvider, loadClass2, activityFramesTracker, z2, z3, zIsClassAvailable2);
        try {
            optionsConfiguration.configure(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, Qg.kd("@lkgi\u0016^b\u0013fYU\u000f\u0015<\\_SXVZ)TRIKHUQ?QEJH\u0007;FD;=:GC5um0-76+)*1r", (short) (ZN.Xd() ^ 296), (short) (ZN.Xd() ^ 21383)), th);
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        if (sentryAndroidOptions.isEnablePerformanceV2() && buildInfoProvider.getSdkInfoVersion() >= 24) {
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            if (appStartTimeSpan.hasNotStarted()) {
                appStartTimeSpan.setStartedAt(Process.getStartUptimeMillis());
            }
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (OY.Xd() ^ 23741), (short) (OY.Xd() ^ 10385))).getMethod(C1561oA.ud("qn|Hvuplebthmk?jhm]oj", (short) (C1580rY.Xd() ^ (-19241))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Context) method.invoke(context, objArr)) instanceof Application) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.yd("GSHUQJD\rQ\\Z_OW\\\u0015\u0019DBG7ID", (short) (C1580rY.Xd() ^ (-21194)))).getMethod(C1561oA.Yd("\n\t\u0019f\u0017\u0018\u0015\u0013\u000e\r!\u0017\u001e\u001es!!(\u001a.+", (short) (C1580rY.Xd() ^ (-297))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    appStartMetrics.registerLifecycleCallbacks((Application) ((Context) method2.invoke(context, objArr2)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
            if (sdkInitTimeSpan.hasNotStarted()) {
                sdkInitTimeSpan.setStartedAt(sdkInitMillis);
            }
            AndroidOptionsInitializer.initializeIntegrationsAndProcessors(sentryAndroidOptions, context, buildInfoProvider, loadClass2, activityFramesTracker);
            deduplicateIntegrations(sentryAndroidOptions, z2, z3);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static /* synthetic */ void lambda$init$2(AtomicBoolean atomicBoolean, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null || session.getStarted() == null) {
            return;
        }
        atomicBoolean.set(true);
    }
}
