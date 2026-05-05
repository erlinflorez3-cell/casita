package com.biocatch.client.android.sdk.contract.events;

import com.biocatch.client.android.sdk.contract.State;

/* JADX INFO: loaded from: classes3.dex */
public class StateChangedEvent {
    private State state;

    public StateChangedEvent(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
