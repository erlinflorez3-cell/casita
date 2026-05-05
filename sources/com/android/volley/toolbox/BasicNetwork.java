package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class BasicNetwork implements Network {
    private static final int DEFAULT_POOL_SIZE = 4096;
    private final BaseHttpStack mBaseHttpStack;

    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(4096));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.mBaseHttpStack = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(4096));
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.mBaseHttpStack = new AdaptedHttpStack(httpStack);
        this.mPool = byteArrayPool;
    }

    @Deprecated
    protected static Map<String, String> convertHeaders(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i2 = 0; i2 < headerArr.length; i2++) {
            treeMap.put(headerArr[i2].getName(), headerArr[i2].getValue());
        }
        return treeMap;
    }

    @Override // com.android.volley.Network
    public NetworkResponse performRequest(Request<?> request) throws Throwable {
        Request<?> request2;
        byte[] bArr;
        HttpResponse httpResponseExecuteRequest;
        int statusCode;
        List<Header> headers;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            HttpResponse httpResponse = null;
            try {
                request2 = request;
                httpResponseExecuteRequest = this.mBaseHttpStack.executeRequest(request2, HttpHeaderParser.getCacheHeaders(request2.getCacheEntry()));
                try {
                    statusCode = httpResponseExecuteRequest.getStatusCode();
                    headers = httpResponseExecuteRequest.getHeaders();
                    break;
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                    httpResponse = httpResponseExecuteRequest;
                }
            } catch (IOException e3) {
                e = e3;
                bArr = null;
            }
            NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, e, jElapsedRealtime, httpResponse, bArr));
        }
        if (statusCode == 304) {
            return NetworkUtility.getNotModifiedNetworkResponse(request2, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
        }
        InputStream content = httpResponseExecuteRequest.getContent();
        byte[] bArrInputStreamToBytes = content != null ? NetworkUtility.inputStreamToBytes(content, httpResponseExecuteRequest.getContentLength(), this.mPool) : new byte[0];
        NetworkUtility.logSlowRequests(SystemClock.elapsedRealtime() - jElapsedRealtime, request2, bArrInputStreamToBytes, statusCode);
        if (statusCode < 200 || statusCode > 299) {
            throw new IOException();
        }
        return new NetworkResponse(statusCode, bArrInputStreamToBytes, false, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
    }
}
