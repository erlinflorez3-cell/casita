package io.sentry.metrics;

import io.sentry.IMetricsAggregator;
import io.sentry.ISpan;
import io.sentry.MeasurementUnit;
import io.sentry.SentryNanotimeDate;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class MetricsApi {
    private final IMetricsInterface aggregator;

    public interface IMetricsInterface {
        Map<String, String> getDefaultTagsForMetrics();

        LocalMetricsAggregator getLocalMetricsAggregator();

        IMetricsAggregator getMetricsAggregator();

        ISpan startSpanForMetric(String str, String str2);
    }

    public MetricsApi(IMetricsInterface iMetricsInterface) {
        this.aggregator = iMetricsInterface;
    }

    public void distribution(String str, double d2) {
        distribution(str, d2, null, null, null);
    }

    public void distribution(String str, double d2, MeasurementUnit measurementUnit) {
        distribution(str, d2, measurementUnit, null, null);
    }

    public void distribution(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map) {
        distribution(str, d2, measurementUnit, map, null);
    }

    public void distribution(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, Long l2) {
        this.aggregator.getMetricsAggregator().distribution(str, d2, measurementUnit, MetricsHelper.mergeTags(map, this.aggregator.getDefaultTagsForMetrics()), l2 != null ? l2.longValue() : System.currentTimeMillis(), this.aggregator.getLocalMetricsAggregator());
    }

    public void gauge(String str, double d2) {
        gauge(str, d2, null, null, null);
    }

    public void gauge(String str, double d2, MeasurementUnit measurementUnit) {
        gauge(str, d2, measurementUnit, null, null);
    }

    public void gauge(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map) {
        gauge(str, d2, measurementUnit, map, null);
    }

    public void gauge(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, Long l2) {
        this.aggregator.getMetricsAggregator().gauge(str, d2, measurementUnit, MetricsHelper.mergeTags(map, this.aggregator.getDefaultTagsForMetrics()), l2 != null ? l2.longValue() : System.currentTimeMillis(), this.aggregator.getLocalMetricsAggregator());
    }

    public void increment(String str) {
        increment(str, 1.0d, null, null, null);
    }

    public void increment(String str, double d2) {
        increment(str, d2, null, null, null);
    }

    public void increment(String str, double d2, MeasurementUnit measurementUnit) {
        increment(str, d2, measurementUnit, null, null);
    }

    public void increment(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map) {
        increment(str, d2, measurementUnit, map, null);
    }

    public void increment(String str, double d2, MeasurementUnit measurementUnit, Map<String, String> map, Long l2) {
        this.aggregator.getMetricsAggregator().increment(str, d2, measurementUnit, MetricsHelper.mergeTags(map, this.aggregator.getDefaultTagsForMetrics()), l2 != null ? l2.longValue() : System.currentTimeMillis(), this.aggregator.getLocalMetricsAggregator());
    }

    public void set(String str, int i2) {
        set(str, i2, (MeasurementUnit) null, (Map<String, String>) null, (Long) null);
    }

    public void set(String str, int i2, MeasurementUnit measurementUnit) {
        set(str, i2, measurementUnit, (Map<String, String>) null, (Long) null);
    }

    public void set(String str, int i2, MeasurementUnit measurementUnit, Map<String, String> map) {
        set(str, i2, measurementUnit, map, (Long) null);
    }

    public void set(String str, int i2, MeasurementUnit measurementUnit, Map<String, String> map, Long l2) {
        this.aggregator.getMetricsAggregator().set(str, i2, measurementUnit, MetricsHelper.mergeTags(map, this.aggregator.getDefaultTagsForMetrics()), l2 != null ? l2.longValue() : System.currentTimeMillis(), this.aggregator.getLocalMetricsAggregator());
    }

    public void set(String str, String str2) {
        set(str, str2, (MeasurementUnit) null, (Map<String, String>) null, (Long) null);
    }

    public void set(String str, String str2, MeasurementUnit measurementUnit) {
        set(str, str2, measurementUnit, (Map<String, String>) null, (Long) null);
    }

    public void set(String str, String str2, MeasurementUnit measurementUnit, Map<String, String> map) {
        set(str, str2, measurementUnit, map, (Long) null);
    }

    public void set(String str, String str2, MeasurementUnit measurementUnit, Map<String, String> map, Long l2) {
        this.aggregator.getMetricsAggregator().set(str, str2, measurementUnit, MetricsHelper.mergeTags(map, this.aggregator.getDefaultTagsForMetrics()), l2 != null ? l2.longValue() : System.currentTimeMillis(), this.aggregator.getLocalMetricsAggregator());
    }

    public void timing(String str, Runnable runnable) {
        timing(str, runnable, null, null);
    }

    public void timing(String str, Runnable runnable, MeasurementUnit.Duration duration) {
        timing(str, runnable, duration, null);
    }

    public void timing(String str, Runnable runnable, MeasurementUnit.Duration duration, Map<String, String> map) {
        long jNanoTime;
        MeasurementUnit.Duration duration2 = duration;
        if (duration2 == null) {
            duration2 = MeasurementUnit.Duration.SECOND;
        }
        Map<String, String> mapMergeTags = MetricsHelper.mergeTags(map, this.aggregator.getDefaultTagsForMetrics());
        ISpan iSpanStartSpanForMetric = this.aggregator.startSpanForMetric("metric.timing", str);
        LocalMetricsAggregator localMetricsAggregator = iSpanStartSpanForMetric != null ? iSpanStartSpanForMetric.getLocalMetricsAggregator() : this.aggregator.getLocalMetricsAggregator();
        if (iSpanStartSpanForMetric != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                iSpanStartSpanForMetric.setTag(entry.getKey(), entry.getValue());
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jNanoTime2 = System.nanoTime();
        try {
            runnable.run();
        } finally {
            if (iSpanStartSpanForMetric != null) {
                iSpanStartSpanForMetric.finish();
                jNanoTime = (iSpanStartSpanForMetric.getFinishDate() != null ? iSpanStartSpanForMetric.getFinishDate() : new SentryNanotimeDate()).diff(iSpanStartSpanForMetric.getStartDate());
            } else {
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            this.aggregator.getMetricsAggregator().distribution(str, MetricsHelper.convertNanosTo(duration2, jNanoTime), duration2, mapMergeTags, jCurrentTimeMillis, localMetricsAggregator);
        }
    }
}
