package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes7.dex */
public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int i2, String str) {
        this.code = i2;
        this.body = str;
    }

    public String body() {
        return this.body;
    }

    public int code() {
        return this.code;
    }
}
