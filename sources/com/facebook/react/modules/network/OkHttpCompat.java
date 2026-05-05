package com.facebook.react.modules.network;

import java.util.Collections;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public class OkHttpCompat {
    public static CookieJarContainer getCookieJarContainer(OkHttpClient okHttpClient) {
        return (CookieJarContainer) okHttpClient.cookieJar();
    }

    public static Headers getHeadersFromMap(Map<String, String> map) {
        return map == null ? Headers.of((Map<String, String>) Collections.emptyMap()) : Headers.of(map);
    }
}
