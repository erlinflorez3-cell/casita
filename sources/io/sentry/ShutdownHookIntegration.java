package io.sentry;

import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {
    private final Runtime runtime;
    private Thread thread;

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }

    public ShutdownHookIntegration(Runtime runtime) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "Runtime is required");
    }

    private void handleShutdownInProgress(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e2) {
            String message = e2.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.thread != null) {
            handleShutdownInProgress(new Runnable() { // from class: io.sentry.ShutdownHookIntegration$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8885lambda$close$2$iosentryShutdownHookIntegration();
                }
            });
        }
    }

    Thread getHook() {
        return this.thread;
    }

    /* JADX INFO: renamed from: lambda$close$2$io-sentry-ShutdownHookIntegration, reason: not valid java name */
    /* synthetic */ void m8885lambda$close$2$iosentryShutdownHookIntegration() {
        this.runtime.removeShutdownHook(this.thread);
    }

    /* JADX INFO: renamed from: lambda$register$1$io-sentry-ShutdownHookIntegration, reason: not valid java name */
    /* synthetic */ void m8886lambda$register$1$iosentryShutdownHookIntegration(SentryOptions sentryOptions) {
        this.runtime.addShutdownHook(this.thread);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("ShutdownHook");
    }

    @Override // io.sentry.Integration
    public void register(final IHub iHub, final SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.thread = new Thread(new Runnable() { // from class: io.sentry.ShutdownHookIntegration$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    iHub.flush(sentryOptions.getFlushTimeoutMillis());
                }
            });
            handleShutdownInProgress(new Runnable() { // from class: io.sentry.ShutdownHookIntegration$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8886lambda$register$1$iosentryShutdownHookIntegration(sentryOptions);
                }
            });
        }
    }
}
