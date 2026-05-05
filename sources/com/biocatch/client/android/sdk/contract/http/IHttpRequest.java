package com.biocatch.client.android.sdk.contract.http;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IHttpRequest {
    String getBody();

    int getConnectionTimeout();

    Map<String, String> getHeaders();

    String getMethod();

    int getResponseTimeout();

    String getURL();
}
