package io.cobrowse;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
class SocketURL {
    SocketURL() {
    }

    public static HttpUrl resolve(String str, HttpUrl httpUrl) {
        return httpUrl.resolve(str).resolve("sockets/1/ws");
    }
}
