package io.sentry.metrics;

import com.braze.Constants;

/* JADX INFO: loaded from: classes6.dex */
public enum MetricType {
    Counter("c"),
    Gauge("g"),
    Distribution("d"),
    Set(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);

    final String statsdCode;

    MetricType(String str) {
        this.statsdCode = str;
    }
}
