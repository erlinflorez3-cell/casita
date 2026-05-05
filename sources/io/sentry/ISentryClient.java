package io.sentry;

import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;

/* JADX INFO: loaded from: classes6.dex */
public interface ISentryClient {
    SentryId captureCheckIn(CheckIn checkIn, IScope iScope, Hint hint);

    default SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, null);
    }

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint);

    default SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, null, null);
    }

    default SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return captureEvent(sentryEvent, null, hint);
    }

    default SentryId captureEvent(SentryEvent sentryEvent, IScope iScope) {
        return captureEvent(sentryEvent, iScope, null);
    }

    SentryId captureEvent(SentryEvent sentryEvent, IScope iScope, Hint hint);

    default SentryId captureException(Throwable th) {
        return captureException(th, null, null);
    }

    default SentryId captureException(Throwable th, Hint hint) {
        return captureException(th, null, hint);
    }

    default SentryId captureException(Throwable th, IScope iScope) {
        return captureException(th, iScope, null);
    }

    default SentryId captureException(Throwable th, IScope iScope, Hint hint) {
        return captureEvent(new SentryEvent(th), iScope, hint);
    }

    default SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return captureMessage(str, sentryLevel, null);
    }

    default SentryId captureMessage(String str, SentryLevel sentryLevel, IScope iScope) {
        SentryEvent sentryEvent = new SentryEvent();
        Message message = new Message();
        message.setFormatted(str);
        sentryEvent.setMessage(message);
        sentryEvent.setLevel(sentryLevel);
        return captureEvent(sentryEvent, iScope);
    }

    SentryId captureReplayEvent(SentryReplayEvent sentryReplayEvent, IScope iScope, Hint hint);

    default void captureSession(Session session) {
        captureSession(session, null);
    }

    void captureSession(Session session, Hint hint);

    default SentryId captureTransaction(SentryTransaction sentryTransaction) {
        return captureTransaction(sentryTransaction, null, null, null);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, IScope iScope, Hint hint) {
        return captureTransaction(sentryTransaction, null, iScope, hint);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null, null);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, IScope iScope, Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, iScope, hint, null);
    }

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, IScope iScope, Hint hint, ProfilingTraceData profilingTraceData);

    void captureUserFeedback(UserFeedback userFeedback);

    void close();

    void close(boolean z2);

    void flush(long j2);

    IMetricsAggregator getMetricsAggregator();

    RateLimiter getRateLimiter();

    boolean isEnabled();

    default boolean isHealthy() {
        return true;
    }
}
