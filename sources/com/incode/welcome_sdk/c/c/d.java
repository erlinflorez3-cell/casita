package com.incode.welcome_sdk.c.c;

import com.incode.welcome_sdk.c.c.a;
import com.incode.welcome_sdk.commons.utils.z;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.EventDropReason;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryId;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import java.io.Closeable;
import java.lang.Thread;
import java.util.Objects;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Integration, Closeable, Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHub f4523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryOptions f4525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f4527e;

    private d(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "");
        Object objRequireNonNull = Objects.requireNonNull(aVar, "threadAdapter is required.");
        Intrinsics.checkNotNullExpressionValue(objRequireNonNull, "");
        this.f4524b = (a) objRequireNonNull;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d() {
        this(a.c.f4512c);
        a.c.d dVar = a.c.f4511a;
    }

    @Override // io.sentry.Integration
    public final void register(IHub iHub, SentryOptions sentryOptions) {
        Intrinsics.checkNotNullParameter(iHub, "");
        Intrinsics.checkNotNullParameter(sentryOptions, "");
        if (this.f4526d) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f4526d = true;
        this.f4523a = (IHub) Objects.requireNonNull(iHub, "Hub is required");
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        this.f4525c = sentryOptions2;
        Intrinsics.checkNotNull(sentryOptions2);
        ILogger logger = sentryOptions2.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "");
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        SentryOptions sentryOptions3 = this.f4525c;
        Intrinsics.checkNotNull(sentryOptions3);
        logger.log(sentryLevel, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(sentryOptions3.isEnableUncaughtExceptionHandler()));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandlerE = this.f4524b.e();
        if (uncaughtExceptionHandlerE != null) {
            logger.log(SentryLevel.DEBUG, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerE.getClass().getName() + "'", new Object[0]);
            if (uncaughtExceptionHandlerE instanceof d) {
                this.f4527e = ((d) uncaughtExceptionHandlerE).f4527e;
            } else if (uncaughtExceptionHandlerE instanceof UncaughtExceptionHandlerIntegration) {
                z zVar = z.f6699c;
                Object objB = z.b("io.sentry.UncaughtExceptionHandlerIntegration", "defaultExceptionHandler", uncaughtExceptionHandlerE);
                Intrinsics.checkNotNull(objB, "");
                this.f4527e = (Thread.UncaughtExceptionHandler) objB;
            } else {
                this.f4527e = uncaughtExceptionHandlerE;
            }
        }
        this.f4524b.c(this);
        logger.log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion(getClass().getName());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        ILogger logger;
        Intrinsics.checkNotNullParameter(thread, "");
        Intrinsics.checkNotNullParameter(th, "");
        SentryOptions sentryOptions = this.f4525c;
        ILogger logger2 = sentryOptions != null ? sentryOptions.getLogger() : null;
        if (StringsKt.contains$default((CharSequence) ExceptionsKt.stackTraceToString(th), (CharSequence) "com.incode", false, 2, (Object) null) && this.f4525c != null && this.f4523a != null) {
            if (logger2 != null) {
                logger2.log(SentryLevel.INFO, "Uncaught exception received.", new Object[0]);
            }
            try {
                SentryOptions sentryOptions2 = this.f4525c;
                Intrinsics.checkNotNull(sentryOptions2);
                long flushTimeoutMillis = sentryOptions2.getFlushTimeoutMillis();
                Intrinsics.checkNotNull(logger2);
                UncaughtExceptionHandlerIntegration.UncaughtExceptionHint uncaughtExceptionHint = new UncaughtExceptionHandlerIntegration.UncaughtExceptionHint(flushTimeoutMillis, logger2);
                Intrinsics.checkNotNullParameter(thread, "");
                Intrinsics.checkNotNullParameter(th, "");
                Mechanism mechanism = new Mechanism();
                mechanism.setHandled(Boolean.FALSE);
                mechanism.setType("UncaughtExceptionHandler");
                SentryEvent sentryEvent = new SentryEvent(new ExceptionMechanismException(mechanism, th, thread));
                sentryEvent.setLevel(SentryLevel.FATAL);
                IHub iHub = this.f4523a;
                Intrinsics.checkNotNull(iHub);
                if (iHub.getTransaction() == null && sentryEvent.getEventId() != null) {
                    SentryId eventId = sentryEvent.getEventId();
                    Intrinsics.checkNotNull(eventId);
                    uncaughtExceptionHint.setFlushable(eventId);
                }
                Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(uncaughtExceptionHint);
                IHub iHub2 = this.f4523a;
                Intrinsics.checkNotNull(iHub2);
                SentryId sentryIdCaptureEvent = iHub2.captureEvent(sentryEvent, hintCreateWithTypeCheckHint);
                Intrinsics.checkNotNullExpressionValue(sentryIdCaptureEvent, "");
                boolean zAreEqual = Intrinsics.areEqual(sentryIdCaptureEvent, SentryId.EMPTY_ID);
                EventDropReason eventDropReason = HintUtils.getEventDropReason(hintCreateWithTypeCheckHint);
                if ((!zAreEqual || EventDropReason.MULTITHREADED_DEDUPLICATION == eventDropReason) && !uncaughtExceptionHint.waitFlush()) {
                    logger2.log(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", sentryEvent.getEventId());
                }
            } catch (Throwable th2) {
                if (logger2 != null) {
                    logger2.log(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", th2);
                }
            }
        }
        if (this.f4527e != null) {
            SentryOptions sentryOptions3 = this.f4525c;
            if (sentryOptions3 != null && (logger = sentryOptions3.getLogger()) != null) {
                logger.log(SentryLevel.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4527e;
            Intrinsics.checkNotNull(uncaughtExceptionHandler);
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        SentryOptions sentryOptions4 = this.f4525c;
        if (sentryOptions4 == null || !sentryOptions4.isPrintUncaughtStackTrace()) {
            return;
        }
        th.printStackTrace();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (Intrinsics.areEqual(this, this.f4524b.e())) {
            this.f4524b.c(this.f4527e);
            SentryOptions sentryOptions = this.f4525c;
            if (sentryOptions != null) {
                Intrinsics.checkNotNull(sentryOptions);
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        new c((byte) 0);
    }
}
