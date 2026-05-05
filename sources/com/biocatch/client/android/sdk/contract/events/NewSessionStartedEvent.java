package com.biocatch.client.android.sdk.contract.events;

/* JADX INFO: loaded from: classes3.dex */
public class NewSessionStartedEvent {
    private String sessionID;

    public NewSessionStartedEvent(String str) {
        this.sessionID = str;
    }

    public String getSessionID() {
        return this.sessionID;
    }
}
