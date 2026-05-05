package cz.msebera.android.httpclient.impl.client;

import cz.msebera.android.httpclient.HttpRequest;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class StandardHttpRequestRetryHandler extends DefaultHttpRequestRetryHandler {
    private final Map<String, Boolean> idempotentMethods;

    public StandardHttpRequestRetryHandler() {
        this(3, false);
    }

    public StandardHttpRequestRetryHandler(int i2, boolean z2) {
        super(i2, z2);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.idempotentMethods = concurrentHashMap;
        concurrentHashMap.put("GET", Boolean.TRUE);
        concurrentHashMap.put("HEAD", Boolean.TRUE);
        concurrentHashMap.put("PUT", Boolean.TRUE);
        concurrentHashMap.put("DELETE", Boolean.TRUE);
        concurrentHashMap.put("OPTIONS", Boolean.TRUE);
        concurrentHashMap.put("TRACE", Boolean.TRUE);
    }

    @Override // cz.msebera.android.httpclient.impl.client.DefaultHttpRequestRetryHandler
    protected boolean handleAsIdempotent(HttpRequest httpRequest) {
        Boolean bool = this.idempotentMethods.get(httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ROOT));
        return bool != null && bool.booleanValue();
    }
}
