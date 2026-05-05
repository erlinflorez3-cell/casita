package io.sentry.metrics;

import io.sentry.protocol.SentryId;

/* JADX INFO: loaded from: classes6.dex */
public interface IMetricsClient {
    SentryId captureMetrics(EncodedMetrics encodedMetrics);
}
