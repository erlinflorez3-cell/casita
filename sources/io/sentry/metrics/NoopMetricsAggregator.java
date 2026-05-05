package io.sentry.metrics;

import io.sentry.IMetricsAggregator;
import io.sentry.ISpan;
import io.sentry.MeasurementUnit;
import io.sentry.metrics.MetricsApi;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class NoopMetricsAggregator implements IMetricsAggregator, MetricsApi.IMetricsInterface {
    private static final NoopMetricsAggregator instance = new NoopMetricsAggregator();

    public static NoopMetricsAggregator getInstance() {
        return instance;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.IMetricsAggregator
    public void distribution(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator) {
    }

    @Override // io.sentry.IMetricsAggregator
    public void flush(boolean z2) {
    }

    @Override // io.sentry.IMetricsAggregator
    public void gauge(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator) {
    }

    @Override // io.sentry.metrics.MetricsApi.IMetricsInterface
    public Map<String, String> getDefaultTagsForMetrics() {
        return Collections.emptyMap();
    }

    @Override // io.sentry.metrics.MetricsApi.IMetricsInterface
    public LocalMetricsAggregator getLocalMetricsAggregator() {
        return null;
    }

    @Override // io.sentry.metrics.MetricsApi.IMetricsInterface
    public IMetricsAggregator getMetricsAggregator() {
        return this;
    }

    @Override // io.sentry.IMetricsAggregator
    public void increment(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator) {
    }

    @Override // io.sentry.IMetricsAggregator
    public void set(String str, int i2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator) {
    }

    @Override // io.sentry.IMetricsAggregator
    public void set(String str, String str2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator) {
    }

    @Override // io.sentry.metrics.MetricsApi.IMetricsInterface
    public ISpan startSpanForMetric(String str, String str2) {
        return null;
    }
}
