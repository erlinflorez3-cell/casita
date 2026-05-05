package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
class UriReqStateParms extends WebReqStateParms {
    private static final String LOGTAG = Global.LOG_PREFIX + "UriReqStateParms";
    private HttpHost host;
    private HttpContext httpContext;
    private HttpRequest request;
    private CbURIDesc uriDesc;
    private HttpUriRequest uriRequest;

    UriReqStateParms(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        super(CbConstants.WrMethod.execute, CbConstants.WrStates.PRE_EXEC, 0);
        this.host = httpHost;
        this.request = httpRequest;
        this.httpContext = httpContext;
        this.uriDesc = CbURIDesc.createURIDesc(httpRequest, httpHost);
        if (httpRequest == null || !(httpRequest instanceof HttpUriRequest)) {
            return;
        }
        this.uriRequest = (HttpUriRequest) httpRequest;
    }

    private static long calcHttpRequestLength(HttpContext httpContext) {
        RequestWrapper requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
        long j2 = 0;
        int length = 2;
        for (Header header : requestWrapper.getAllHeaders()) {
            length += header.toString().length() + 2;
            if ("Content-Length".equalsIgnoreCase(header.getName())) {
                j2 = Long.parseLong(header.getValue());
            }
        }
        return ((long) (requestWrapper.getRequestLine().toString().length() + 2 + length)) + j2;
    }

    private static long calcHttpResponseLength(HttpResponse httpResponse) {
        int length = httpResponse.getStatusLine().toString().length() + 2;
        long j2 = 0;
        boolean z2 = true;
        int length2 = 2;
        for (Header header : httpResponse.getAllHeaders()) {
            length2 += header.toString().length() + 2;
            if (z2 && "Content-Length".equals(header.getName())) {
                try {
                    j2 = Long.parseLong(header.getValue());
                } catch (NumberFormatException e2) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOGTAG, e2.getMessage());
                    }
                }
                z2 = false;
            }
        }
        return ((long) (length + length2)) + j2;
    }

    void calcHttpMessageBytes(HttpResponse httpResponse) {
        try {
            this.requestLength = calcHttpRequestLength(this.httpContext);
            this.responseLength = calcHttpResponseLength(httpResponse);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, e2.getMessage(), e2);
            }
            this.requestLength = -1L;
            this.responseLength = -1L;
        }
    }

    HttpHost getExecHost() {
        return this.host;
    }

    HttpRequest getRequest() {
        return this.request;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    protected String getRequestClassName() {
        return getRequestClassName(this.request);
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestDesc() {
        if (this.desc != null) {
            return this.desc;
        }
        this.desc = this.uriDesc.desc;
        return this.desc;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getRequestHeaders() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestHost() {
        return this.uriDesc.host;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestMethod() {
        RequestLine requestLine;
        HttpUriRequest httpUriRequest = this.uriRequest;
        if (httpUriRequest != null) {
            return httpUriRequest.getMethod();
        }
        HttpRequest httpRequest = this.request;
        return (!(httpRequest instanceof HttpEntityEnclosingRequest) || (requestLine = httpRequest.getRequestLine()) == null) ? "NA" : requestLine.getMethod();
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getResponseHeaders() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    URL getUrl() {
        if (this.uriDesc.uri != null) {
            try {
                return this.uriDesc.uri.toURL();
            } catch (MalformedURLException e2) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, e2.toString(), e2);
                }
            } catch (Exception e3) {
                if (Global.DEBUG) {
                    Utility.zlogW(LOGTAG, e3.toString());
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    Object[] getWebContext() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    boolean isSupportedByGrail() {
        return false;
    }
}
