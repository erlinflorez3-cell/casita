package com.incode.welcome_sdk.c.c;

import io.sentry.BaggageHeader;
import io.sentry.Breadcrumb;
import io.sentry.CheckIn;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.ISentryClient;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.ProfilingTraceData;
import io.sentry.ScopeCallback;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.SentryTraceHeader;
import io.sentry.TraceContext;
import io.sentry.TransactionContext;
import io.sentry.TransactionOptions;
import io.sentry.UserFeedback;
import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements IHub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f4513a = new e(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f4514b = new b();

    private b() {
    }

    @Override // io.sentry.IHub
    public final boolean isEnabled() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.b();
    }

    @Override // io.sentry.IHub
    public final SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        Intrinsics.checkNotNullParameter(sentryEvent, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.b(sentryEvent, hint);
    }

    @Override // io.sentry.IHub
    public final SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(sentryEvent, "");
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.d(sentryEvent, hint, scopeCallback);
    }

    @Override // io.sentry.IHub
    public final SentryId captureMessage(String str, SentryLevel sentryLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sentryLevel, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.e(str, sentryLevel);
    }

    @Override // io.sentry.IHub
    public final SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sentryLevel, "");
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.a(str, sentryLevel, scopeCallback);
    }

    @Override // io.sentry.IHub
    public final SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        Intrinsics.checkNotNullParameter(sentryEnvelope, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        SentryId sentryIdCaptureEnvelope = com.incode.welcome_sdk.c.c.e.c().captureEnvelope(sentryEnvelope, hint);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureEnvelope, "");
        return sentryIdCaptureEnvelope;
    }

    @Override // io.sentry.IHub
    public final SentryId captureException(Throwable th, Hint hint) {
        Intrinsics.checkNotNullParameter(th, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.d(th, hint);
    }

    @Override // io.sentry.IHub
    public final SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.d(th, hint, scopeCallback);
    }

    @Override // io.sentry.IHub
    public final void captureUserFeedback(UserFeedback userFeedback) {
        Intrinsics.checkNotNullParameter(userFeedback, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.b(userFeedback);
    }

    @Override // io.sentry.IHub
    public final void startSession() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.j();
    }

    @Override // io.sentry.IHub
    public final void endSession() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.h();
    }

    @Override // io.sentry.IHub
    public final void close(boolean z2) {
        close();
    }

    @Override // io.sentry.IHub
    public final void close() {
        com.incode.welcome_sdk.c.c.e.f4530c.e();
    }

    @Override // io.sentry.IHub
    public final void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        Intrinsics.checkNotNullParameter(breadcrumb, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.e(breadcrumb, hint);
    }

    @Override // io.sentry.IHub
    public final void addBreadcrumb(Breadcrumb breadcrumb) {
        Intrinsics.checkNotNullParameter(breadcrumb, "");
        addBreadcrumb(breadcrumb, new Hint());
    }

    @Override // io.sentry.IHub
    public final void setLevel(SentryLevel sentryLevel) {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.c(sentryLevel);
    }

    @Override // io.sentry.IHub
    public final void setTransaction(String str) {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.d(str);
    }

    @Override // io.sentry.IHub
    public final void setUser(User user) {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.b(user);
    }

    @Override // io.sentry.IHub
    public final void setFingerprint(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.e(list);
    }

    @Override // io.sentry.IHub
    public final void clearBreadcrumbs() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.a();
    }

    @Override // io.sentry.IHub
    public final void setTag(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.c(str, str2);
    }

    @Override // io.sentry.IHub
    public final void removeTag(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.e(str);
    }

    @Override // io.sentry.IHub
    public final void setExtra(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.e(str, str2);
    }

    @Override // io.sentry.IHub
    public final void removeExtra(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.c(str);
    }

    @Override // io.sentry.IHub
    public final SentryId getLastEventId() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.d();
    }

    @Override // io.sentry.IHub
    public final void pushScope() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.f();
    }

    @Override // io.sentry.IHub
    public final void popScope() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.i();
    }

    @Override // io.sentry.IHub
    public final void withScope(ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.a(scopeCallback);
    }

    @Override // io.sentry.IHub
    public final void configureScope(ScopeCallback scopeCallback) {
        Intrinsics.checkNotNullParameter(scopeCallback, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.d(scopeCallback);
    }

    @Override // io.sentry.IHub
    public final void bindClient(ISentryClient iSentryClient) {
        Intrinsics.checkNotNullParameter(iSentryClient, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.d(iSentryClient);
    }

    @Override // io.sentry.IHub
    public final boolean isHealthy() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.g();
    }

    @Override // io.sentry.IHub
    public final void flush(long j2) {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.c(j2);
    }

    @Override // io.sentry.IHub
    /* JADX INFO: renamed from: clone */
    public final IHub m8871clone() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        IHub iHubM8871clone = com.incode.welcome_sdk.c.c.e.c().m8871clone();
        Intrinsics.checkNotNullExpressionValue(iHubM8871clone, "");
        return iHubM8871clone;
    }

    @Override // io.sentry.IHub
    public final SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        Intrinsics.checkNotNullParameter(sentryTransaction, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        SentryId sentryIdCaptureTransaction = com.incode.welcome_sdk.c.c.e.c().captureTransaction(sentryTransaction, traceContext, hint, profilingTraceData);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureTransaction, "");
        return sentryIdCaptureTransaction;
    }

    @Override // io.sentry.IHub
    public final ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        Intrinsics.checkNotNullParameter(transactionContext, "");
        Intrinsics.checkNotNullParameter(transactionOptions, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.d(transactionContext, transactionOptions);
    }

    @Override // io.sentry.IHub
    @Deprecated(message = "See reasoning from HubAdapter in the base Sentry repo.")
    public final SentryTraceHeader traceHeaders() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.o();
    }

    @Override // io.sentry.IHub
    public final void setSpanContext(Throwable th, ISpan iSpan, String str) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(iSpan, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        com.incode.welcome_sdk.c.c.e.c().setSpanContext(th, iSpan, str);
    }

    @Override // io.sentry.IHub
    public final ISpan getSpan() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.c().getSpan();
    }

    @Override // io.sentry.IHub
    public final ITransaction getTransaction() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.c().getTransaction();
    }

    @Override // io.sentry.IHub
    public final SentryOptions getOptions() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        SentryOptions options = com.incode.welcome_sdk.c.c.e.c().getOptions();
        Intrinsics.checkNotNullExpressionValue(options, "");
        return options;
    }

    @Override // io.sentry.IHub
    public final Boolean isCrashedLastRun() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.k();
    }

    @Override // io.sentry.IHub
    public final void reportFullyDisplayed() {
        com.incode.welcome_sdk.c.c.e.m();
    }

    @Override // io.sentry.IHub
    public final TransactionContext continueTrace(String str, List<String> list) {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.e(str, list);
    }

    @Override // io.sentry.IHub
    public final SentryTraceHeader getTraceparent() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.n();
    }

    @Override // io.sentry.IHub
    public final BaggageHeader getBaggage() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.l();
    }

    @Override // io.sentry.IHub
    public final SentryId captureCheckIn(CheckIn checkIn) {
        Intrinsics.checkNotNullParameter(checkIn, "");
        return com.incode.welcome_sdk.c.c.e.c(checkIn);
    }

    @Override // io.sentry.IHub
    public final SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint) {
        Intrinsics.checkNotNullParameter(sentryReplayEvent, "");
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        SentryId sentryIdCaptureReplay = com.incode.welcome_sdk.c.c.e.c().captureReplay(sentryReplayEvent, hint);
        Intrinsics.checkNotNullExpressionValue(sentryIdCaptureReplay, "");
        return sentryIdCaptureReplay;
    }

    @Override // io.sentry.IHub
    public final RateLimiter getRateLimiter() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        return com.incode.welcome_sdk.c.c.e.c().getRateLimiter();
    }

    @Override // io.sentry.IHub
    public final MetricsApi metrics() {
        com.incode.welcome_sdk.c.c.e eVar = com.incode.welcome_sdk.c.c.e.f4530c;
        MetricsApi metricsApiMetrics = com.incode.welcome_sdk.c.c.e.c().metrics();
        Intrinsics.checkNotNullExpressionValue(metricsApiMetrics, "");
        return metricsApiMetrics;
    }

    public static final class e {
        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }
}
