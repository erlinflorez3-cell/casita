package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public interface ILogger {
    boolean isEnabled(SentryLevel sentryLevel);

    void log(SentryLevel sentryLevel, String str, Throwable th);

    void log(SentryLevel sentryLevel, String str, Object... objArr);

    void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr);
}
