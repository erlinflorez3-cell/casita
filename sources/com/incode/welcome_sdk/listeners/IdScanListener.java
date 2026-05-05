package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.results.IdScanResult;

/* JADX INFO: loaded from: classes5.dex */
public interface IdScanListener extends BaseListener {
    void onIdBackCompleted(IdScanResult idScanResult);

    void onIdFrontCompleted(IdScanResult idScanResult);
}
