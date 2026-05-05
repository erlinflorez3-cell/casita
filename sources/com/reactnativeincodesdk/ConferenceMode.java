package com.reactnativeincodesdk;

/* JADX INFO: loaded from: classes5.dex */
public enum ConferenceMode {
    CONFERENCE,
    RESULTS,
    BOTH;

    public boolean isConferenceEnabled() {
        return this == CONFERENCE || this == BOTH;
    }

    public boolean isResultsScreenEnabled() {
        return this == RESULTS || this == BOTH;
    }
}
