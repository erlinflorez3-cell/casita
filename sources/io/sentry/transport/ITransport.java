package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface ITransport extends Closeable {
    void close(boolean z2) throws IOException;

    void flush(long j2);

    RateLimiter getRateLimiter();

    default boolean isHealthy() {
        return true;
    }

    default void send(SentryEnvelope sentryEnvelope) throws IOException {
        send(sentryEnvelope, new Hint());
    }

    void send(SentryEnvelope sentryEnvelope, Hint hint) throws IOException;
}
