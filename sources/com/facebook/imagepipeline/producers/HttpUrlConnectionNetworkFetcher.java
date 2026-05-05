package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.dynatrace.android.callback.Callback;
import com.facebook.common.internal.Objects;
import com.facebook.common.time.MonotonicClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class HttpUrlConnectionNetworkFetcher extends BaseNetworkFetcher<HttpUrlConnectionNetworkFetchState> {
    private static final String FETCH_TIME = "fetch_time";
    public static final int HTTP_DEFAULT_TIMEOUT = 30000;
    public static final int HTTP_PERMANENT_REDIRECT = 308;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;
    private static final String IMAGE_SIZE = "image_size";
    private static final int MAX_REDIRECTS = 5;
    private static final int NUM_NETWORK_THREADS = 3;
    private static final String QUEUE_TIME = "queue_time";
    private static final String TOTAL_TIME = "total_time";
    private final ExecutorService mExecutorService;
    private int mHttpConnectionTimeout;
    private final MonotonicClock mMonotonicClock;

    @Nullable
    private final Map<String, String> mRequestHeaders;

    @Nullable
    private String mUserAgent;

    public static class HttpUrlConnectionNetworkFetchState extends FetchState {
        private long fetchCompleteTime;
        private long responseTime;
        private long submitTime;

        public HttpUrlConnectionNetworkFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
        }
    }

    public HttpUrlConnectionNetworkFetcher() {
        this((String) null, (Map<String, String>) null, RealtimeSinceBootClock.get());
    }

    public HttpUrlConnectionNetworkFetcher(int i2) {
        this((String) null, (Map<String, String>) null, RealtimeSinceBootClock.get());
        this.mHttpConnectionTimeout = i2;
    }

    public HttpUrlConnectionNetworkFetcher(String str, int i2) {
        this(str, (Map<String, String>) null, RealtimeSinceBootClock.get());
        this.mHttpConnectionTimeout = i2;
    }

    public HttpUrlConnectionNetworkFetcher(String str, @Nullable Map<String, String> map, int i2) {
        this(str, map, RealtimeSinceBootClock.get());
        this.mHttpConnectionTimeout = i2;
    }

    HttpUrlConnectionNetworkFetcher(@Nullable String str, @Nullable Map<String, String> map, MonotonicClock monotonicClock) {
        this.mExecutorService = Executors.newFixedThreadPool(3);
        this.mMonotonicClock = monotonicClock;
        this.mRequestHeaders = map;
        this.mUserAgent = str;
    }

    private HttpURLConnection downloadFrom(Uri uri, int i2) throws Exception {
        HttpURLConnection httpURLConnectionOpenConnectionTo = openConnectionTo(uri);
        String str = this.mUserAgent;
        if (str != null) {
            httpURLConnectionOpenConnectionTo.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.mRequestHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionOpenConnectionTo.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnectionOpenConnectionTo.setConnectTimeout(this.mHttpConnectionTimeout);
        int responseCode = Callback.getResponseCode(httpURLConnectionOpenConnectionTo);
        if (isHttpSuccess(responseCode)) {
            return httpURLConnectionOpenConnectionTo;
        }
        if (!isHttpRedirect(responseCode)) {
            httpURLConnectionOpenConnectionTo.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = Callback.getHeaderField(httpURLConnectionOpenConnectionTo, "Location");
        httpURLConnectionOpenConnectionTo.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i2 <= 0 || uri2 == null || Objects.equal(uri2.getScheme(), scheme)) {
            throw new IOException(i2 == 0 ? error("URL %s follows too many redirects", uri.toString()) : error("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return downloadFrom(uri2, i2 - 1);
    }

    private static String error(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean isHttpRedirect(int i2) {
        if (i2 == 307 || i2 == 308) {
            return true;
        }
        switch (i2) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean isHttpSuccess(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    static HttpURLConnection openConnectionTo(Uri uri) throws IOException {
        URLConnection uRLConnectionOpenConnection = UriUtil.uriToUrl(uri).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ FetchState createFetchState(Consumer consumer, ProducerContext producerContext) {
        return createFetchState((Consumer<EncodedImage>) consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public HttpUrlConnectionNetworkFetchState createFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        return new HttpUrlConnectionNetworkFetchState(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(final HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState, final NetworkFetcher.Callback callback) {
        httpUrlConnectionNetworkFetchState.submitTime = this.mMonotonicClock.now();
        final Future<?> futureSubmit = this.mExecutorService.submit(new Runnable() { // from class: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                HttpUrlConnectionNetworkFetcher.this.fetchSync(httpUrlConnectionNetworkFetchState, callback);
            }
        });
        httpUrlConnectionNetworkFetchState.getContext().addCallbacks(new BaseProducerContextCallbacks() { // from class: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.2
            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
                if (futureSubmit.cancel(false)) {
                    callback.onCancellation();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void fetchSync(com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.HttpUrlConnectionNetworkFetchState r5, com.facebook.imagepipeline.producers.NetworkFetcher.Callback r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r3 = 0
            android.net.Uri r1 = r5.getUri()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            r0 = 5
            java.net.HttpURLConnection r2 = r4.downloadFrom(r1, r0)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            com.facebook.common.time.MonotonicClock r0 = r4.mMonotonicClock     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L38
            long r0 = r0.now()     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.HttpUrlConnectionNetworkFetchState.m7217$$Nest$fputresponseTime(r5, r0)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L38
            if (r2 == 0) goto L1d
            java.io.InputStream r3 = com.dynatrace.android.callback.Callback.getInputStream(r2)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L38
            r0 = -1
            r6.onResponse(r3, r0)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L38
        L1d:
            if (r3 == 0) goto L32
            r3.close()     // Catch: java.io.IOException -> L32
            goto L32
        L23:
            r0 = move-exception
            goto L27
        L25:
            r0 = move-exception
            r2 = r3
        L27:
            r6.onFailure(r0)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L2f
            r3.close()     // Catch: java.io.IOException -> L2f
        L2f:
            if (r2 == 0) goto L37
            goto L34
        L32:
            if (r2 == 0) goto L37
        L34:
            r2.disconnect()
        L37:
            return
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            r0 = move-exception
            r2 = r3
        L3c:
            if (r3 == 0) goto L41
            r3.close()     // Catch: java.io.IOException -> L41
        L41:
            if (r2 == 0) goto L46
            r2.disconnect()
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.fetchSync(com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher$HttpUrlConnectionNetworkFetchState, com.facebook.imagepipeline.producers.NetworkFetcher$Callback):void");
    }

    @Override // com.facebook.imagepipeline.producers.BaseNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public Map<String, String> getExtraMap(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState, int i2) {
        HashMap map = new HashMap(4);
        map.put(QUEUE_TIME, Long.toString(httpUrlConnectionNetworkFetchState.responseTime - httpUrlConnectionNetworkFetchState.submitTime));
        map.put(FETCH_TIME, Long.toString(httpUrlConnectionNetworkFetchState.fetchCompleteTime - httpUrlConnectionNetworkFetchState.responseTime));
        map.put(TOTAL_TIME, Long.toString(httpUrlConnectionNetworkFetchState.fetchCompleteTime - httpUrlConnectionNetworkFetchState.submitTime));
        map.put("image_size", Integer.toString(i2));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.BaseNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState, int i2) {
        httpUrlConnectionNetworkFetchState.fetchCompleteTime = this.mMonotonicClock.now();
    }
}
