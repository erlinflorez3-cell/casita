package cz.msebera.android.httpclient.client;

import cz.msebera.android.httpclient.HttpResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface ConnectionBackoffStrategy {
    boolean shouldBackoff(HttpResponse httpResponse);

    boolean shouldBackoff(Throwable th);
}
