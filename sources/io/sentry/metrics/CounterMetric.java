package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class CounterMetric extends Metric {
    private double value;

    public CounterMetric(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map) {
        super(MetricType.Counter, str, measurementUnit, map);
        this.value = d2;
    }

    @Override // io.sentry.metrics.Metric
    public void add(double d2) {
        this.value += d2;
    }

    public double getValue() {
        return this.value;
    }

    @Override // io.sentry.metrics.Metric
    public int getWeight() {
        return 1;
    }

    @Override // io.sentry.metrics.Metric
    public Iterable<?> serialize() {
        return Collections.singletonList(Double.valueOf(this.value));
    }
}
