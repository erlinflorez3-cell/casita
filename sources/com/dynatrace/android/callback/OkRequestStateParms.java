package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
class OkRequestStateParms extends WebReqStateParms {
    private static final String LOGTAG = Global.LOG_PREFIX + "OkRequestStateParms";
    Request request;
    private Response response;
    private final boolean useRequestHeaders;
    private final boolean useResponseHeaders;

    OkRequestStateParms(Request request, CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates, int i2, boolean z2, boolean z3) {
        super(wrMethod, wrStates, i2);
        this.request = request;
        this.useResponseHeaders = z2;
        this.useRequestHeaders = z3;
    }

    private long calcHeader(Map<String, List<String>> map) {
        long length = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            long length2 = entry.getKey().length() + 4;
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                length += ((long) it.next().length()) + length2;
            }
            if ("Content-Length".equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                try {
                    length += Long.parseLong(entry.getValue().get(0));
                } catch (NumberFormatException e2) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOGTAG, "invalid content length", e2);
                    }
                }
            }
        }
        return length;
    }

    void calcHttpMessageBytes(Response response) {
        this.response = response;
        Response responseNetworkResponse = response.networkResponse();
        if (responseNetworkResponse != null) {
            try {
                Request request = responseNetworkResponse.request();
                long length = responseNetworkResponse.protocol().toString().length();
                this.requestLength = ((long) (request.method().length() + request.url().url().getFile().length())) + length + 4 + calcHeader(request.headers().toMultimap()) + 2;
                this.responseLength = length + ((long) String.valueOf(responseNetworkResponse.code()).length()) + ((long) responseNetworkResponse.message().length()) + 4 + calcHeader(responseNetworkResponse.headers().toMultimap()) + 2;
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, e2.getMessage(), e2);
                }
                this.requestLength = -1L;
                this.responseLength = -1L;
            }
        }
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    protected String getRequestClassName() {
        return getRequestClassName(this.request);
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestDesc() {
        return Utility.truncateWebRequest(WebRequestUtils.removeUrlCredentials(this.request.url().toString()).legacyAgentUrl);
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestHost() {
        return this.request.url().host();
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestMethod() {
        return this.request.method();
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    URL getUrl() {
        return this.request.url().url();
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    Object[] getWebContext() {
        return new Object[]{this.request, this.response, this.exception};
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    boolean isSupportedByGrail() {
        return true;
    }

    void parseHeaders() {
        if (this.useResponseHeaders) {
            this.responseHeaders = OkHeaderInterceptor.theInterceptor.responseHeaders;
        }
        if (this.useRequestHeaders) {
            this.requestHeaders = OkHeaderInterceptor.theInterceptor.requestHeaders;
        }
    }
}
