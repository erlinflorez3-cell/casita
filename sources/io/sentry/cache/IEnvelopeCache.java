package io.sentry.cache;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;

/* JADX INFO: loaded from: classes6.dex */
public interface IEnvelopeCache extends Iterable<SentryEnvelope> {
    void discard(SentryEnvelope sentryEnvelope);

    default void store(SentryEnvelope sentryEnvelope) {
        store(sentryEnvelope, new Hint());
    }

    void store(SentryEnvelope sentryEnvelope, Hint hint);
}
