package com.dynatrace.android.agent.conf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplayConfiguration {
    public static final boolean DEFAULT_COLOR_MASKING_ENABLED = false;
    public static final boolean DEFAULT_COMPOSE_ENABLED = true;
    public static final int DEFAULT_PROTOCOL_VERSION = 1;
    public static final boolean DEFAULT_REPLAY_CAPTURE = false;
    public static final ReplayConfiguration DEFAULT_REPLAY_CONFIGURATION = builder().build();
    public static final boolean DEFAULT_REPLAY_CRASHES_ENABLED = false;
    public static final boolean DEFAULT_REPLAY_FULL_SESSION_CONFIG_RECEIVED = false;
    public static final boolean DEFAULT_REPLAY_PIXEL_COPY_ENABLED = false;
    public static final int DEFAULT_REPLAY_SELFMONITORING = 0;
    public static final int DEFAULT_REPLAY_TRAFFIC_CONTROL_PERCENTAGE = 0;
    public static final int DEFAULT_RETENTION_TIME = 0;
    private final boolean capture;
    private final boolean colorMaskingEnabled;
    private final boolean composeEnabled;
    private final boolean crashesEnabled;
    private final boolean fullSessionConfigReceived;
    private final boolean pixelCopyEnabled;
    private final int protocolVersion;
    private final int retentionTimeInMinutes;
    private final int selfMonitoring;
    private final int trafficControlPercentage;

    public static class Builder {
        private boolean capture;
        private boolean colorMaskingEnabled;
        private boolean composeEnabled;
        private boolean crashesEnabled;
        private boolean fullSessionConfigReceived;
        private boolean pixelCopyEnabled;
        private int protocolVersion;
        private int retentionTimeInMinutes;
        private int selfMonitoring;
        private int trafficControlPercentage;

        public Builder() {
            this.capture = false;
            this.fullSessionConfigReceived = false;
            this.crashesEnabled = false;
            this.trafficControlPercentage = 0;
            this.retentionTimeInMinutes = 0;
            this.protocolVersion = 1;
            this.selfMonitoring = 0;
            this.pixelCopyEnabled = false;
            this.colorMaskingEnabled = false;
            this.composeEnabled = true;
        }

        public Builder(ReplayConfiguration oldReplayConfiguration) {
            this.capture = oldReplayConfiguration.capture;
            this.fullSessionConfigReceived = oldReplayConfiguration.fullSessionConfigReceived;
            this.crashesEnabled = oldReplayConfiguration.crashesEnabled;
            this.trafficControlPercentage = oldReplayConfiguration.trafficControlPercentage;
            this.retentionTimeInMinutes = oldReplayConfiguration.retentionTimeInMinutes;
            this.protocolVersion = oldReplayConfiguration.protocolVersion;
            this.selfMonitoring = oldReplayConfiguration.selfMonitoring;
            this.pixelCopyEnabled = oldReplayConfiguration.pixelCopyEnabled;
            this.colorMaskingEnabled = oldReplayConfiguration.colorMaskingEnabled;
            this.composeEnabled = oldReplayConfiguration.composeEnabled;
        }

        public ReplayConfiguration build() {
            return new ReplayConfiguration(this);
        }

        public Builder withCapture(boolean capture) {
            this.capture = capture;
            return this;
        }

        public Builder withColorMaskingEnabled(boolean colorMaskingEnabled) {
            this.colorMaskingEnabled = colorMaskingEnabled;
            return this;
        }

        public Builder withComposeEnabled(boolean composeEnabled) {
            this.composeEnabled = composeEnabled;
            return this;
        }

        public Builder withCrashesEnabled(boolean crashesEnabled) {
            this.crashesEnabled = crashesEnabled;
            return this;
        }

        public Builder withFullSessionConfigReceived(boolean fullSessionConfigReceived) {
            this.fullSessionConfigReceived = fullSessionConfigReceived;
            return this;
        }

        public Builder withPixelCopyEnabled(boolean pixelCopyEnabled) {
            this.pixelCopyEnabled = pixelCopyEnabled;
            return this;
        }

        public Builder withProtocolVersion(int protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder withRetentionTimeInMinutes(int retentionTimeInMinutes) {
            this.retentionTimeInMinutes = retentionTimeInMinutes;
            return this;
        }

        public Builder withSelfMonitoring(int selfMonitoring) {
            this.selfMonitoring = selfMonitoring;
            return this;
        }

        public Builder withTrafficControlPercentage(int trafficControlPercentage) {
            this.trafficControlPercentage = trafficControlPercentage;
            return this;
        }
    }

    private ReplayConfiguration(Builder builder) {
        this.capture = builder.capture;
        this.fullSessionConfigReceived = builder.fullSessionConfigReceived;
        this.crashesEnabled = builder.crashesEnabled;
        this.trafficControlPercentage = builder.trafficControlPercentage;
        this.retentionTimeInMinutes = builder.retentionTimeInMinutes;
        this.protocolVersion = builder.protocolVersion;
        this.selfMonitoring = builder.selfMonitoring;
        this.pixelCopyEnabled = builder.pixelCopyEnabled;
        this.colorMaskingEnabled = builder.colorMaskingEnabled;
        this.composeEnabled = builder.composeEnabled;
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
        ReplayConfiguration replayConfiguration = (ReplayConfiguration) o2;
        return this.capture == replayConfiguration.capture && this.fullSessionConfigReceived == replayConfiguration.fullSessionConfigReceived && this.retentionTimeInMinutes == replayConfiguration.retentionTimeInMinutes && this.crashesEnabled == replayConfiguration.crashesEnabled && this.protocolVersion == replayConfiguration.protocolVersion && this.selfMonitoring == replayConfiguration.selfMonitoring && this.trafficControlPercentage == replayConfiguration.trafficControlPercentage && this.pixelCopyEnabled == replayConfiguration.pixelCopyEnabled && this.colorMaskingEnabled == replayConfiguration.colorMaskingEnabled && this.composeEnabled == replayConfiguration.composeEnabled;
    }

    public boolean getCrashesEnabled() {
        return this.crashesEnabled;
    }

    public boolean getFullSessionConfigReceived() {
        return this.fullSessionConfigReceived;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public int getRetentionTimeInMinutes() {
        return this.retentionTimeInMinutes;
    }

    public int getSelfMonitoring() {
        return this.selfMonitoring;
    }

    public int getTrafficControlPercentage() {
        return this.trafficControlPercentage;
    }

    public int hashCode() {
        int i2 = (((((((this.capture ? 1 : 0) * 31) + (this.fullSessionConfigReceived ? 1 : 0)) * 31) + (this.crashesEnabled ? 1 : 0)) * 31) + this.trafficControlPercentage) * 31;
        int i3 = this.retentionTimeInMinutes;
        return ((((((((((i2 + (i3 ^ (i3 >>> 32))) * 31) + this.protocolVersion) * 31) + this.selfMonitoring) * 31) + (this.pixelCopyEnabled ? 1 : 0)) * 31) + (this.colorMaskingEnabled ? 1 : 0)) * 31) + (this.composeEnabled ? 1 : 0);
    }

    public boolean isCaptureOn() {
        return this.capture;
    }

    public boolean isColorMaskingEnabled() {
        return this.colorMaskingEnabled;
    }

    public boolean isComposeEnabled() {
        return this.composeEnabled;
    }

    public boolean isPixelCopyEnabled() {
        return this.pixelCopyEnabled;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "ReplayConfiguration{capture=" + this.capture + ", fullSessionConfigReceived=" + this.fullSessionConfigReceived + ", crashesEnabled=" + this.crashesEnabled + ", trafficControlPercentage=" + this.trafficControlPercentage + ", retentionTime=" + this.retentionTimeInMinutes + ", protocolVersion=" + this.protocolVersion + ", selfMonitoring=" + this.selfMonitoring + ", pixelCopy=" + this.pixelCopyEnabled + ", colorMasking=" + this.colorMaskingEnabled + ", composeEnabled=" + this.composeEnabled + AbstractJsonLexerKt.END_OBJ;
    }
}
