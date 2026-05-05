package io.sentry.android.core;

/* JADX INFO: loaded from: classes6.dex */
public enum NdkHandlerStrategy {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    NdkHandlerStrategy(int i2) {
        this.value = i2;
    }

    public int getValue() {
        return this.value;
    }
}
