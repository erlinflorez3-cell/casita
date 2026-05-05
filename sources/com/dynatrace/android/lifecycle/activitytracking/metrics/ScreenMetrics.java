package com.dynatrace.android.lifecycle.activitytracking.metrics;

import com.dynatrace.agent.metrics.OneAgentScreenMetrics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenMetrics implements OneAgentScreenMetrics {
    private final int screenDensityDpi;
    private final float screenDensityFactor;
    private final int screenHeight;
    private final int screenWidth;

    public static class Builder {
        private int screenDensityDpi;
        private float screenDensityFactor;
        private int screenHeight;
        private int screenWidth;

        public ScreenMetrics build() {
            return new ScreenMetrics(this);
        }

        public Builder withScreenDensityDpi(int i2) {
            this.screenDensityDpi = i2;
            return this;
        }

        public Builder withScreenDensityFactor(float f2) {
            this.screenDensityFactor = f2;
            return this;
        }

        public Builder withScreenHeight(int i2) {
            this.screenHeight = i2;
            return this;
        }

        public Builder withScreenWidth(int i2) {
            this.screenWidth = i2;
            return this;
        }
    }

    private ScreenMetrics(Builder builder) {
        this.screenWidth = builder.screenWidth;
        this.screenHeight = builder.screenHeight;
        this.screenDensityFactor = builder.screenDensityFactor;
        this.screenDensityDpi = builder.screenDensityDpi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScreenMetrics screenMetrics = (ScreenMetrics) obj;
        return this.screenWidth == screenMetrics.screenWidth && this.screenHeight == screenMetrics.screenHeight && this.screenDensityDpi == screenMetrics.screenDensityDpi && Float.compare(screenMetrics.screenDensityFactor, this.screenDensityFactor) == 0;
    }

    public int getScreenDensityDpi() {
        return this.screenDensityDpi;
    }

    public float getScreenDensityFactor() {
        return this.screenDensityFactor;
    }

    @Override // com.dynatrace.agent.metrics.OneAgentScreenMetrics
    public int getScreenHeight() {
        return this.screenHeight;
    }

    @Override // com.dynatrace.agent.metrics.OneAgentScreenMetrics
    public int getScreenWidth() {
        return this.screenWidth;
    }

    public int hashCode() {
        int i2 = ((((this.screenWidth * 31) + this.screenHeight) * 31) + this.screenDensityDpi) * 31;
        float f2 = this.screenDensityFactor;
        return i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        return "ActivityMetrics{screenWidth=" + this.screenWidth + ", screenHeight=" + this.screenHeight + ", screenDensityDpi=" + this.screenDensityDpi + ", screenDensityFactor=" + this.screenDensityFactor + AbstractJsonLexerKt.END_OBJ;
    }
}
