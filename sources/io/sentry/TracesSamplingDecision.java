package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public final class TracesSamplingDecision {
    private final Double profileSampleRate;
    private final Boolean profileSampled;
    private final Double sampleRate;
    private final Boolean sampled;

    public TracesSamplingDecision(Boolean bool) {
        this(bool, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d2) {
        this(bool, d2, false, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d2, Boolean bool2, Double d3) {
        this.sampled = bool;
        this.sampleRate = d2;
        this.profileSampled = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.profileSampleRate = d3;
    }

    public Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public Boolean getProfileSampled() {
        return this.profileSampled;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public Boolean getSampled() {
        return this.sampled;
    }
}
