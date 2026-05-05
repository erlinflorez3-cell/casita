package cz.msebera.android.httpclient.impl.client;

import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.ServiceUnavailableRetryStrategy;
import cz.msebera.android.httpclient.protocol.HttpContext;
import cz.msebera.android.httpclient.util.Args;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultServiceUnavailableRetryStrategy implements ServiceUnavailableRetryStrategy {
    private final int maxRetries;
    private final long retryInterval;

    public DefaultServiceUnavailableRetryStrategy() {
        this(1, 1000);
    }

    public DefaultServiceUnavailableRetryStrategy(int i2, int i3) {
        Args.positive(i2, "Max retries");
        Args.positive(i3, "Retry interval");
        this.maxRetries = i2;
        this.retryInterval = i3;
    }

    @Override // cz.msebera.android.httpclient.client.ServiceUnavailableRetryStrategy
    public long getRetryInterval() {
        return this.retryInterval;
    }

    @Override // cz.msebera.android.httpclient.client.ServiceUnavailableRetryStrategy
    public boolean retryRequest(HttpResponse httpResponse, int i2, HttpContext httpContext) {
        return i2 <= this.maxRetries && httpResponse.getStatusLine().getStatusCode() == 503;
    }
}
