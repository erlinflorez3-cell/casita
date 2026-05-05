package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidMainThreadChecker;
import io.sentry.util.IntegrationUtils;
import java.io.Closeable;

/* JADX INFO: loaded from: classes6.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {
    private final MainLooperHandler handler;
    private SentryAndroidOptions options;
    volatile LifecycleWatcher watcher;

    public AppLifecycleIntegration() {
        this(new MainLooperHandler());
    }

    AppLifecycleIntegration(MainLooperHandler mainLooperHandler) {
        this.handler = mainLooperHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addObserver, reason: merged with bridge method [inline-methods] */
    public void m8907lambda$register$0$iosentryandroidcoreAppLifecycleIntegration(IHub iHub) {
        if (this.options == null) {
            return;
        }
        this.watcher = new LifecycleWatcher(iHub, this.options.getSessionTrackingIntervalMillis(), this.options.isEnableAutoSessionTracking(), this.options.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this.watcher);
            this.options.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("AppLifecycle");
        } catch (Throwable th) {
            this.watcher = null;
            this.options.getLogger().log(SentryLevel.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: removeObserver, reason: merged with bridge method [inline-methods] */
    public void m8906lambda$close$1$iosentryandroidcoreAppLifecycleIntegration() {
        LifecycleWatcher lifecycleWatcher = this.watcher;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.watcher = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.watcher == null) {
            return;
        }
        if (AndroidMainThreadChecker.getInstance().isMainThread()) {
            m8906lambda$close$1$iosentryandroidcoreAppLifecycleIntegration();
        } else {
            this.handler.post(new Runnable() { // from class: io.sentry.android.core.AppLifecycleIntegration$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8906lambda$close$1$iosentryandroidcoreAppLifecycleIntegration();
                }
            });
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0090 -> B:19:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0080
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // io.sentry.Integration
    public void register(final io.sentry.IHub r5, io.sentry.SentryOptions r6) {
        /*
            r4 = this;
            java.lang.String r0 = "Hub is required"
            io.sentry.util.Objects.requireNonNull(r5, r0)
            boolean r0 = r6 instanceof io.sentry.android.core.SentryAndroidOptions
            if (r0 == 0) goto L5b
            r1 = r6
            io.sentry.android.core.SentryAndroidOptions r1 = (io.sentry.android.core.SentryAndroidOptions) r1
        Lc:
            java.lang.String r0 = "SentryAndroidOptions is required"
            java.lang.Object r0 = io.sentry.util.Objects.requireNonNull(r1, r0)
            io.sentry.android.core.SentryAndroidOptions r0 = (io.sentry.android.core.SentryAndroidOptions) r0
            r4.options = r0
            io.sentry.ILogger r3 = r0.getLogger()
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.DEBUG
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            boolean r0 = r0.isEnableAutoSessionTracking()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "enableSessionTracking enabled: %s"
            r3.log(r2, r0, r1)
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            io.sentry.ILogger r3 = r0.getLogger()
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.DEBUG
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            boolean r0 = r0.isEnableAppLifecycleBreadcrumbs()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "enableAppLifecycleBreadcrumbs enabled: %s"
            r3.log(r2, r0, r1)
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            boolean r0 = r0.isEnableAutoSessionTracking()
            if (r0 != 0) goto L5d
            io.sentry.android.core.SentryAndroidOptions r0 = r4.options
            boolean r0 = r0.isEnableAppLifecycleBreadcrumbs()
            if (r0 == 0) goto L9b
            goto L5d
        L5b:
            r1 = 0
            goto Lc
        L5d:
            java.lang.String r0 = "androidx.lifecycle.DefaultLifecycleObserver"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            java.lang.String r0 = "androidx.lifecycle.ProcessLifecycleOwner"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            io.sentry.android.core.internal.util.AndroidMainThreadChecker r0 = io.sentry.android.core.internal.util.AndroidMainThreadChecker.getInstance()     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            boolean r0 = r0.isMainThread()     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            if (r0 == 0) goto L75
            r4.m8907lambda$register$0$iosentryandroidcoreAppLifecycleIntegration(r5)     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            goto L9b
        L75:
            io.sentry.android.core.MainLooperHandler r1 = r4.handler     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            io.sentry.android.core.AppLifecycleIntegration$$ExternalSyntheticLambda1 r0 = new io.sentry.android.core.AppLifecycleIntegration$$ExternalSyntheticLambda1     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            r1.post(r0)     // Catch: java.lang.ClassNotFoundException -> L80 java.lang.IllegalStateException -> L8f
            goto L9b
        L80:
            io.sentry.ILogger r3 = r6.getLogger()
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.WARNING
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed"
            r3.log(r2, r0, r1)
            goto L9b
        L8f:
            r3 = move-exception
            io.sentry.ILogger r2 = r6.getLogger()
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.ERROR
            java.lang.String r0 = "AppLifecycleIntegration could not be installed"
            r2.log(r1, r0, r3)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.AppLifecycleIntegration.register(io.sentry.IHub, io.sentry.SentryOptions):void");
    }
}
