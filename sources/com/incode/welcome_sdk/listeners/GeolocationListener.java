package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.results.GeolocationResult;

/* JADX INFO: loaded from: classes5.dex */
public interface GeolocationListener extends BaseListener {
    void onGeolocationFetched(GeolocationResult geolocationResult);

    void onGeolocationUnavailable(Throwable th);
}
