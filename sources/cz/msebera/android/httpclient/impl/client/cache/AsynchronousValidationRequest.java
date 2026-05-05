package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.cache.HttpCacheEntry;
import cz.msebera.android.httpclient.client.methods.HttpExecutionAware;
import cz.msebera.android.httpclient.client.methods.HttpRequestWrapper;
import cz.msebera.android.httpclient.client.protocol.HttpClientContext;
import cz.msebera.android.httpclient.conn.routing.HttpRoute;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;

/* JADX INFO: loaded from: classes5.dex */
public class AsynchronousValidationRequest implements Runnable {
    private final HttpCacheEntry cacheEntry;
    private final CachingExec cachingExec;
    private final int consecutiveFailedAttempts;
    private final HttpClientContext context;
    private final HttpExecutionAware execAware;
    private final String identifier;
    public HttpClientAndroidLog log = new HttpClientAndroidLog(getClass());
    private final AsynchronousValidator parent;
    private final HttpRequestWrapper request;
    private final HttpRoute route;

    AsynchronousValidationRequest(AsynchronousValidator asynchronousValidator, CachingExec cachingExec, HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware, HttpCacheEntry httpCacheEntry, String str, int i2) {
        this.parent = asynchronousValidator;
        this.cachingExec = cachingExec;
        this.route = httpRoute;
        this.request = httpRequestWrapper;
        this.context = httpClientContext;
        this.execAware = httpExecutionAware;
        this.cacheEntry = httpCacheEntry;
        this.identifier = str;
        this.consecutiveFailedAttempts = i2;
    }

    private boolean isNotServerError(int i2) {
        return i2 < 500;
    }

    private boolean isNotStale(HttpResponse httpResponse) {
        Header[] headers = httpResponse.getHeaders("Warning");
        if (headers == null) {
            return true;
        }
        for (Header header : headers) {
            String value = header.getValue();
            if (value.startsWith("110") || value.startsWith("111")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean revalidateCacheEntry() {
        /*
            r11 = this;
            r4 = 0
            cz.msebera.android.httpclient.impl.client.cache.CachingExec r5 = r11.cachingExec     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.conn.routing.HttpRoute r6 = r11.route     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.client.methods.HttpRequestWrapper r7 = r11.request     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.client.protocol.HttpClientContext r8 = r11.context     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.client.methods.HttpExecutionAware r9 = r11.execAware     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.client.cache.HttpCacheEntry r10 = r11.cacheEntry     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.client.methods.CloseableHttpResponse r1 = r5.revalidateCacheEntry(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            cz.msebera.android.httpclient.StatusLine r0 = r1.getStatusLine()     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.getStatusCode()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r11.isNotServerError(r0)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L27
            boolean r0 = r11.isNotStale(r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = r4
        L28:
            r1.close()     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            return r0
        L2c:
            r0 = move-exception
            r1.close()     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
            throw r0     // Catch: java.lang.RuntimeException -> L31 cz.msebera.android.httpclient.HttpException -> L47 java.io.IOException -> L50
        L31:
            r3 = move-exception
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r11.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "RuntimeException thrown during asynchronous revalidation: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r3)
            java.lang.String r0 = r0.toString()
            r2.error(r0)
            return r4
        L47:
            r2 = move-exception
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r11.log
            java.lang.String r0 = "HTTP protocol exception during asynchronous revalidation"
            r1.error(r0, r2)
            return r4
        L50:
            r2 = move-exception
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r11.log
            java.lang.String r0 = "Asynchronous revalidation failed due to I/O error"
            r1.debug(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.client.cache.AsynchronousValidationRequest.revalidateCacheEntry():boolean");
    }

    public int getConsecutiveFailedAttempts() {
        return this.consecutiveFailedAttempts;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (revalidateCacheEntry()) {
                this.parent.jobSuccessful(this.identifier);
            } else {
                this.parent.jobFailed(this.identifier);
            }
        } finally {
            this.parent.markComplete(this.identifier);
        }
    }
}
