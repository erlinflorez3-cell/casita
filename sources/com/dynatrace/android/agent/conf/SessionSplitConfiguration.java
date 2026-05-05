package com.dynatrace.android.agent.conf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionSplitConfiguration {
    public static final int DEFAULT_MAX_SESSION_DURATION_MINS = 360;
    static final SessionSplitConfiguration DEFAULT_SESSION_SPLIT_CONFIGURATION = builder().build();
    public static final int DEFAULT_SESSION_TIMEOUT_SEC = 600;
    private final int inactivityTimeout;
    private final int maxSessionDuration;

    public static class Builder {
        private int inactivityTimeout;
        private int maxSessionDuration;

        public Builder() {
            this.maxSessionDuration = SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            this.inactivityTimeout = 600;
        }

        public Builder(SessionSplitConfiguration sessionSplitConfig) {
            this.maxSessionDuration = sessionSplitConfig.maxSessionDuration;
            this.inactivityTimeout = sessionSplitConfig.inactivityTimeout;
        }

        public SessionSplitConfiguration build() {
            return new SessionSplitConfiguration(this);
        }

        public Builder withInactivityTimeout(int inactivityTimeoutSec) {
            this.inactivityTimeout = inactivityTimeoutSec;
            return this;
        }

        public Builder withMaxSessionDuration(int maxSessionDurationMins) {
            this.maxSessionDuration = maxSessionDurationMins;
            return this;
        }
    }

    private SessionSplitConfiguration(Builder builder) {
        this.maxSessionDuration = builder.maxSessionDuration;
        this.inactivityTimeout = builder.inactivityTimeout;
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
        SessionSplitConfiguration sessionSplitConfiguration = (SessionSplitConfiguration) o2;
        return this.maxSessionDuration == sessionSplitConfiguration.maxSessionDuration && this.inactivityTimeout == sessionSplitConfiguration.inactivityTimeout;
    }

    public long getInactivityTimeoutMs() {
        return ((long) this.inactivityTimeout) * 1000;
    }

    public long getInactivityTimeoutSeconds() {
        return this.inactivityTimeout;
    }

    public long getMaxSessionDurationMinutes() {
        return this.maxSessionDuration;
    }

    public long getMaxSessionDurationMs() {
        return ((long) (this.maxSessionDuration * 60)) * 1000;
    }

    public int hashCode() {
        return (this.maxSessionDuration * 31) + this.inactivityTimeout;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "SessionSplitConfiguration{maxSessionDuration=" + this.maxSessionDuration + ", inactivityTimeout=" + this.inactivityTimeout + AbstractJsonLexerKt.END_OBJ;
    }
}
