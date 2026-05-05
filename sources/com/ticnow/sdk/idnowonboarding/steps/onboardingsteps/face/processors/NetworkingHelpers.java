package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkingHelpers {
    public static String OK_HTTP_BUILDER_TAG = "APIRequest";
    public static String OK_HTTP_RESPONSE_CANCELED = "Canceled";
    private static OkHttpClient _apiClient = null;

    public static void cancelPendingRequests() {
        OkHttpClient apiClient = getApiClient();
        for (Call call : apiClient.dispatcher().queuedCalls()) {
            if (Objects.equals(call.request().tag(), OK_HTTP_BUILDER_TAG)) {
                call.cancel();
            }
        }
        for (Call call2 : apiClient.dispatcher().runningCalls()) {
            if (Objects.equals(call2.request().tag(), OK_HTTP_BUILDER_TAG)) {
                call2.cancel();
            }
        }
    }

    private static OkHttpClient createApiClient() {
        return new OkHttpClient.Builder().connectTimeout(180L, TimeUnit.SECONDS).readTimeout(180L, TimeUnit.SECONDS).writeTimeout(180L, TimeUnit.SECONDS).build();
    }

    public static synchronized OkHttpClient getApiClient() {
        if (_apiClient == null) {
            _apiClient = createApiClient();
        }
        return _apiClient;
    }
}
