package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

/* JADX INFO: loaded from: classes6.dex */
public interface IMainThreadChecker {
    boolean isMainThread();

    boolean isMainThread(long j2);

    boolean isMainThread(SentryThread sentryThread);

    boolean isMainThread(Thread thread);
}
