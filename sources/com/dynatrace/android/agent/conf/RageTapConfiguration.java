package com.dynatrace.android.agent.conf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class RageTapConfiguration {
    public static final int DEFAULT_DISPERSION_RADIUS = 100;
    public static final int DEFAULT_MINIMUM_NUMBER_OF_TAPS = 3;
    public static final RageTapConfiguration DEFAULT_RAGE_TAP_CONFIGURATION = builder().build();
    public static final int DEFAULT_TAP_DURATION = 100;
    public static final int DEFAULT_TIMESPAN_DIFFERENCE = 300;
    private final int dispersionRadius;
    private final int minimumNumberOfTaps;
    private final int tapDuration;
    private final int timespanDifference;

    public static class Builder {
        private int dispersionRadius;
        private int minimumNumberOfTaps;
        private int tapDuration;
        private int timespanDifference;

        public Builder() {
            this.tapDuration = 100;
            this.dispersionRadius = 100;
            this.timespanDifference = 300;
            this.minimumNumberOfTaps = 3;
        }

        public Builder(RageTapConfiguration oldRageTapConfiguration) {
            this.tapDuration = oldRageTapConfiguration.tapDuration;
            this.dispersionRadius = oldRageTapConfiguration.dispersionRadius;
            this.timespanDifference = oldRageTapConfiguration.timespanDifference;
            this.minimumNumberOfTaps = oldRageTapConfiguration.minimumNumberOfTaps;
        }

        public RageTapConfiguration build() {
            return new RageTapConfiguration(this);
        }

        public Builder withDispersionRadius(int dispersionRadius) {
            this.dispersionRadius = dispersionRadius;
            return this;
        }

        public Builder withMinimumNumberOfTaps(int minimumNumberOfTaps) {
            this.minimumNumberOfTaps = minimumNumberOfTaps;
            return this;
        }

        public Builder withTapDuration(int tapDuration) {
            this.tapDuration = tapDuration;
            return this;
        }

        public Builder withTimespanDifference(int timespanDifference) {
            this.timespanDifference = timespanDifference;
            return this;
        }
    }

    private RageTapConfiguration(Builder builder) {
        this.tapDuration = builder.tapDuration;
        this.dispersionRadius = builder.dispersionRadius;
        this.timespanDifference = builder.timespanDifference;
        this.minimumNumberOfTaps = builder.minimumNumberOfTaps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        RageTapConfiguration rageTapConfiguration = (RageTapConfiguration) o2;
        return this.tapDuration == rageTapConfiguration.tapDuration && this.dispersionRadius == rageTapConfiguration.dispersionRadius && this.timespanDifference == rageTapConfiguration.timespanDifference && this.minimumNumberOfTaps == rageTapConfiguration.minimumNumberOfTaps;
    }

    public int getDispersionRadius() {
        return this.dispersionRadius;
    }

    public int getMinimumNumberOfTaps() {
        return this.minimumNumberOfTaps;
    }

    public int getTapDuration() {
        return this.tapDuration;
    }

    public int getTimespanDifference() {
        return this.timespanDifference;
    }

    public int hashCode() {
        return (((((this.tapDuration * 31) + this.dispersionRadius) * 31) + this.timespanDifference) * 31) + this.minimumNumberOfTaps;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "RageTapConfiguration{tapDuration=" + this.tapDuration + ", dispersionRadius=" + this.dispersionRadius + ", timespanDifference=" + this.timespanDifference + ", minimumNumberOfTaps=" + this.minimumNumberOfTaps + AbstractJsonLexerKt.END_OBJ;
    }
}
