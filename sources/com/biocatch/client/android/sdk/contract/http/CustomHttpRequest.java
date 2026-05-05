package com.biocatch.client.android.sdk.contract.http;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CustomHttpRequest implements IHttpRequest {
    private String body;
    private int connectionTimeout;
    private Map<String, String> headers;
    private String method;
    private int responseTimeout;
    private String url;

    @Override // com.biocatch.client.android.sdk.contract.http.IHttpRequest
    public String getBody() {
        return this.body;
    }

    @Override // com.biocatch.client.android.sdk.contract.http.IHttpRequest
    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    @Override // com.biocatch.client.android.sdk.contract.http.IHttpRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.biocatch.client.android.sdk.contract.http.IHttpRequest
    public String getMethod() {
        return this.method;
    }

    @Override // com.biocatch.client.android.sdk.contract.http.IHttpRequest
    public int getResponseTimeout() {
        return this.responseTimeout;
    }

    @Override // com.biocatch.client.android.sdk.contract.http.IHttpRequest
    public String getURL() {
        return this.url;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setConnectionTimeout(int i2) {
        this.connectionTimeout = i2;
    }

    public void setHeader(String str, String str2) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        this.headers.put(str, str2);
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setResponseTimeout(int i2) {
        this.responseTimeout = i2;
    }

    public void setURL(String str) {
        this.url = str;
    }
}
