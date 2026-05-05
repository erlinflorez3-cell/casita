package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.data.FaceLoginAttemptSyncError;
import com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult;

/* JADX INFO: loaded from: classes5.dex */
public interface SyncFaceLoginAttemptsListener {
    void onError(FaceLoginAttemptSyncError faceLoginAttemptSyncError);

    void onFaceLoginAttemptSyncCompleted(FaceLoginAttemptSyncResult faceLoginAttemptSyncResult);

    void onSyncProgressUpdate(float f2);
}
