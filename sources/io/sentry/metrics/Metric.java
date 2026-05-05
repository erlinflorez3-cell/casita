package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Metric {
    private final String key;
    private final Map<String, String> tags;
    private final MetricType type;
    private final MeasurementUnit unit;

    public Metric(MetricType metricType, String str, MeasurementUnit measurementUnit, Map<String, String> map) {
        this.type = metricType;
        this.key = str;
        this.unit = measurementUnit;
        this.tags = map;
    }

    public abstract void add(double d2);

    public String getKey() {
        return this.key;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public MetricType getType() {
        return this.type;
    }

    public MeasurementUnit getUnit() {
        return this.unit;
    }

    public abstract int getWeight();

    public abstract Iterable<?> serialize();
}
