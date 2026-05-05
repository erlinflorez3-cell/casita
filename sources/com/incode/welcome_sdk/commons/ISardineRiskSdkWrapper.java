package com.incode.welcome_sdk.commons;

import io.reactivex.Completable;

/* JADX INFO: loaded from: classes5.dex */
public interface ISardineRiskSdkWrapper {
    Completable downloadConfigAndInitIfAvailable();

    void logScreenShown(String str);

    Completable uploadEvents();
}
