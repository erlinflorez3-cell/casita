package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.data.local.model.delayed_onboarding.DelayedOnboardingSyncError;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.DelayedOnboardingSyncResult;

/* JADX INFO: loaded from: classes5.dex */
public interface SyncDelayedOnboardingListener {
    void onCancelled();

    void onDelayedOnboardingSyncCompleted(DelayedOnboardingSyncResult delayedOnboardingSyncResult);

    void onError(DelayedOnboardingSyncError delayedOnboardingSyncError);
}
