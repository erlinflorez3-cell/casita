package io.sentry;

import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IHub {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void addBreadcrumb(Breadcrumb breadcrumb, Hint hint);

    default void addBreadcrumb(String str) {
        addBreadcrumb(new Breadcrumb(str));
    }

    default void addBreadcrumb(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb(str);
        breadcrumb.setCategory(str2);
        addBreadcrumb(breadcrumb);
    }

    void bindClient(ISentryClient iSentryClient);

    SentryId captureCheckIn(CheckIn checkIn);

    default SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, new Hint());
    }

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint);

    default SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, new Hint());
    }

    SentryId captureEvent(SentryEvent sentryEvent, Hint hint);

    SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback);

    default SentryId captureEvent(SentryEvent sentryEvent, ScopeCallback scopeCallback) {
        return captureEvent(sentryEvent, new Hint(), scopeCallback);
    }

    default SentryId captureException(Throwable th) {
        return captureException(th, new Hint());
    }

    SentryId captureException(Throwable th, Hint hint);

    SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback);

    default SentryId captureException(Throwable th, ScopeCallback scopeCallback) {
        return captureException(th, new Hint(), scopeCallback);
    }

    default SentryId captureMessage(String str) {
        return captureMessage(str, SentryLevel.INFO);
    }

    default SentryId captureMessage(String str, ScopeCallback scopeCallback) {
        return captureMessage(str, SentryLevel.INFO, scopeCallback);
    }

    SentryId captureMessage(String str, SentryLevel sentryLevel);

    SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback);

    SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint);

    default SentryId captureTransaction(SentryTransaction sentryTransaction, Hint hint) {
        return captureTransaction(sentryTransaction, null, hint);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, hint, null);
    }

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData);

    void captureUserFeedback(UserFeedback userFeedback);

    void clearBreadcrumbs();

    /* JADX INFO: renamed from: clone */
    IHub m8869clone();

    void close();

    void close(boolean z2);

    void configureScope(ScopeCallback scopeCallback);

    TransactionContext continueTrace(String str, List<String> list);

    void endSession();

    void flush(long j2);

    BaggageHeader getBaggage();

    SentryId getLastEventId();

    SentryOptions getOptions();

    RateLimiter getRateLimiter();

    ISpan getSpan();

    SentryTraceHeader getTraceparent();

    ITransaction getTransaction();

    Boolean isCrashedLastRun();

    boolean isEnabled();

    boolean isHealthy();

    MetricsApi metrics();

    void popScope();

    void pushScope();

    void removeExtra(String str);

    void removeTag(String str);

    @Deprecated
    default void reportFullDisplayed() {
        reportFullyDisplayed();
    }

    void reportFullyDisplayed();

    void setExtra(String str, String str2);

    void setFingerprint(List<String> list);

    void setLevel(SentryLevel sentryLevel);

    void setSpanContext(Throwable th, ISpan iSpan, String str);

    void setTag(String str, String str2);

    void setTransaction(String str);

    void setUser(User user);

    void startSession();

    default ITransaction startTransaction(TransactionContext transactionContext) {
        return startTransaction(transactionContext, new TransactionOptions());
    }

    ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions);

    default ITransaction startTransaction(String str, String str2) {
        return startTransaction(str, str2, new TransactionOptions());
    }

    default ITransaction startTransaction(String str, String str2, TransactionOptions transactionOptions) {
        return startTransaction(new TransactionContext(str, str2), transactionOptions);
    }

    @Deprecated
    SentryTraceHeader traceHeaders();

    void withScope(ScopeCallback scopeCallback);
}
