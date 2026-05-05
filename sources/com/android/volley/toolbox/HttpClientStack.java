package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.dynatrace.android.callback.HttpClientCallback;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HttpClientStack implements HttpStack {
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    protected final HttpClient mClient;

    /* JADX INFO: loaded from: classes.dex */
    public static final class HttpPatch extends HttpEntityEnclosingRequestBase {
        public static final String METHOD_NAME = "PATCH";

        public HttpPatch() {
        }

        public HttpPatch(String str) {
            setURI(URI.create(str));
        }

        public HttpPatch(URI uri) {
            setURI(uri);
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return "PATCH";
        }
    }

    public HttpClientStack(HttpClient httpClient) {
        this.mClient = httpClient;
    }

    static HttpUriRequest createHttpRequest(Request<?> request, Map<String, String> map) throws AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody == null) {
                    HttpGet httpGet = new HttpGet(request.getUrl());
                    HttpClientCallback.newInstance(httpGet);
                    return httpGet;
                }
                HttpPost httpPost = new HttpPost(request.getUrl());
                HttpClientCallback.newInstance(httpPost);
                httpPost.addHeader("Content-Type", request.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                return httpPost;
            case 0:
                HttpGet httpGet2 = new HttpGet(request.getUrl());
                HttpClientCallback.newInstance(httpGet2);
                return httpGet2;
            case 1:
                HttpPost httpPost2 = new HttpPost(request.getUrl());
                HttpClientCallback.newInstance(httpPost2);
                httpPost2.addHeader("Content-Type", request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPost2, request);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(request.getUrl());
                HttpClientCallback.newInstance(httpPut);
                httpPut.addHeader("Content-Type", request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPut, request);
                return httpPut;
            case 3:
                HttpDelete httpDelete = new HttpDelete(request.getUrl());
                HttpClientCallback.newInstance(httpDelete);
                return httpDelete;
            case 4:
                HttpHead httpHead = new HttpHead(request.getUrl());
                HttpClientCallback.newInstance(httpHead);
                return httpHead;
            case 5:
                HttpOptions httpOptions = new HttpOptions(request.getUrl());
                HttpClientCallback.newInstance(httpOptions);
                return httpOptions;
            case 6:
                HttpTrace httpTrace = new HttpTrace(request.getUrl());
                HttpClientCallback.newInstance(httpTrace);
                return httpTrace;
            case 7:
                HttpPatch httpPatch = new HttpPatch(request.getUrl());
                HttpClientCallback.newInstance(httpPatch);
                httpPatch.addHeader("Content-Type", request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPatch, request);
                return httpPatch;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static List<NameValuePair> getPostParameterPairs(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, map.get(str)));
        }
        return arrayList;
    }

    private static void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request<?> request) throws AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    private static void setHeaders(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    protected void onPrepareRequest(HttpUriRequest httpUriRequest) throws IOException {
    }

    @Override // com.android.volley.toolbox.HttpStack
    public org.apache.http.HttpResponse performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpUriRequest httpUriRequestCreateHttpRequest = createHttpRequest(request, map);
        setHeaders(httpUriRequestCreateHttpRequest, map);
        setHeaders(httpUriRequestCreateHttpRequest, request.getHeaders());
        onPrepareRequest(httpUriRequestCreateHttpRequest);
        HttpParams params = httpUriRequestCreateHttpRequest.getParams();
        int timeoutMs = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return HttpClientCallback.execute(this.mClient, httpUriRequestCreateHttpRequest);
    }
}
