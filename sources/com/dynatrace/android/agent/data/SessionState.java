package com.dynatrace.android.agent.data;

/* JADX INFO: loaded from: classes3.dex */
enum SessionState {
    CREATED(true, false),
    ENABLED(true, true),
    DISABLED(false, true);

    private boolean active;
    private boolean configurationApplied;

    SessionState(boolean z2, boolean z3) {
        this.active = z2;
        this.configurationApplied = z3;
    }

    boolean isActive() {
        return this.active;
    }

    boolean isConfigurationApplied() {
        return this.configurationApplied;
    }
}
