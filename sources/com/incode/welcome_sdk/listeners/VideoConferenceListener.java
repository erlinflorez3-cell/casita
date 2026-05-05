package com.incode.welcome_sdk.listeners;

/* JADX INFO: loaded from: classes5.dex */
public interface VideoConferenceListener extends BaseListener, EstimatedWaitingTimeListener, QueuePositionChangeListener {
    void onConferenceEnded();
}
