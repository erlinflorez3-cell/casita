package com.dynatrace.android.agent.comm;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidResponseException extends Exception {
    private HttpResponse response;

    public InvalidResponseException(String str, HttpResponse httpResponse) {
        super(str);
        this.response = httpResponse;
    }

    public InvalidResponseException(String str, Throwable th, HttpResponse httpResponse) {
        super(str, th);
        this.response = httpResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }
}
