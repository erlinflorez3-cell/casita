package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import java.io.Closeable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IMetricsAggregator extends Closeable {
    void distribution(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator);

    void flush(boolean z2);

    void gauge(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator);

    void increment(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator);

    void set(String str, int i2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator);

    void set(String str, String str2, MeasurementUnit measurementUnit, Map<String, String> map, long j2, LocalMetricsAggregator localMetricsAggregator);
}
