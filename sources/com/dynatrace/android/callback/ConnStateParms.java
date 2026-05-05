package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import com.google.common.net.HttpHeaders;
import cz.msebera.android.httpclient.client.utils.URLEncodedUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ConnStateParms extends WebReqStateParms {
    private static final Map<String, Integer> additionalHeader;
    private static final Map<String, List<String>> additionalOneAgentHeaders;
    HttpURLConnection conn;
    private final boolean useRequestHeaders;
    private final boolean useResponseHeaders;
    private static final String LOGTAG = Global.LOG_PREFIX + "ConnStateParms";
    private static final int BYTES_CONTENT_TYPE_HEADER = "Content-Type: application/x-www-form-urlencoded".length() + 2;

    static {
        HashMap map = new HashMap();
        additionalHeader = map;
        map.put("User-Agent", Integer.valueOf("User-Agent: ".length() + CallbackCore.defaultUserAgent().length()));
        map.put("Connection", Integer.valueOf("Connection: keep-alive".length()));
        map.put("Accept-Encoding", Integer.valueOf("Accept-Encoding: gzip".length()));
        HashMap map2 = new HashMap();
        additionalOneAgentHeaders = map2;
        map2.put("User-Agent", Collections.singletonList(CallbackCore.defaultUserAgent()));
        map2.put("Connection", Collections.singletonList("keep-alive"));
        map2.put("Accept-Encoding", Collections.singletonList("gzip"));
    }

    ConnStateParms(HttpURLConnection httpURLConnection, CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates, int i2, boolean z2, boolean z3) {
        super(wrMethod, wrStates, i2);
        this.conn = httpURLConnection;
        this.useResponseHeaders = z2;
        this.useRequestHeaders = z3;
    }

    private long calcHeader(Map<String, List<String>> map) {
        long length;
        long length2 = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                if (entry.getValue().size() > 0) {
                    length = entry.getValue().get(0).length() + 2;
                    length2 += length;
                }
            } else if (!entry.getKey().startsWith("X-Android")) {
                long length3 = entry.getKey().length() + 4;
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    length2 += ((long) it.next().length()) + length3;
                }
                if ("Content-Length".equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                    try {
                        length = Long.parseLong(entry.getValue().get(0));
                        length2 += length;
                    } catch (NumberFormatException e2) {
                        if (Global.DEBUG) {
                            Utility.zlogD(LOGTAG, "invalid content length", e2);
                        }
                    }
                }
            }
        }
        return length2;
    }

    private int calcRequestFirstLineLength(String str, String str2) {
        int length = str.length();
        return (str2 == null || str2.length() < 1) ? length + 13 : length + 12 + str2.length();
    }

    void calcRequestBytes(boolean z2) {
        if (this.requestLength >= 0) {
            return;
        }
        try {
            this.requestLength = calcRequestFirstLineLength(this.conn.getRequestMethod(), this.conn.getURL().getFile());
            Map<String, List<String>> requestProperties = this.conn.getRequestProperties();
            this.requestLength += calcHeader(requestProperties) + 2;
            for (Map.Entry<String, Integer> entry : additionalHeader.entrySet()) {
                if (!requestProperties.containsKey(entry.getKey())) {
                    this.requestLength += (long) (entry.getValue().intValue() + 2);
                }
            }
            if (!requestProperties.containsKey("Host")) {
                this.requestLength += (long) ("Host".length() + this.conn.getURL().toURI().getAuthority().length() + 4);
            }
            if (!z2 || requestProperties.containsKey("Content-Type")) {
                return;
            }
            this.requestLength += (long) BYTES_CONTENT_TYPE_HEADER;
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "can't calculate request size", e2);
            }
            this.requestLength = -1L;
        }
    }

    void calcResponseBytes() {
        if (this.responseLength >= 0) {
            return;
        }
        try {
            this.responseLength = calcHeader(this.conn.getHeaderFields()) + 2;
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "can't calculate request size", e2);
            }
            this.responseLength = -1L;
        }
    }

    public void evaluateServerTiming() {
        evaluateServerTiming(this.conn.getHeaderFields().get(HttpHeaders.SERVER_TIMING));
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    protected String getRequestClassName() {
        return getRequestClassName(this.conn);
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestDesc() {
        if (this.desc != null) {
            return this.desc;
        }
        this.desc = "NA";
        HttpURLConnection httpURLConnection = this.conn;
        if (httpURLConnection != null) {
            this.desc = Utility.truncateWebRequest(WebRequestUtils.removeUrlCredentials(httpURLConnection.getURL().toString()).legacyAgentUrl);
        }
        return this.desc;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestHost() {
        HttpURLConnection httpURLConnection = this.conn;
        return httpURLConnection != null ? httpURLConnection.getURL().getHost() : "NA";
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    String getRequestMethod() {
        HttpURLConnection httpURLConnection = this.conn;
        return httpURLConnection != null ? httpURLConnection.getRequestMethod() : "NA";
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    URL getUrl() {
        HttpURLConnection httpURLConnection = this.conn;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL();
        }
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    Object[] getWebContext() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    boolean isSupportedByGrail() {
        return true;
    }

    public void parseRequestHeaders(boolean z2) {
        try {
            if (this.useRequestHeaders) {
                this.requestHeaders = new HashMap(this.conn.getRequestProperties());
                for (Map.Entry<String, List<String>> entry : additionalOneAgentHeaders.entrySet()) {
                    if (!this.requestHeaders.containsKey(entry.getKey())) {
                        this.requestHeaders.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!this.requestHeaders.containsKey("Host")) {
                    this.requestHeaders.put("Host", Collections.singletonList(this.conn.getURL().toURI().getAuthority()));
                }
                if (z2 && !this.requestHeaders.containsKey("Content-Type")) {
                    this.requestHeaders.put("Content-Type", Collections.singletonList(URLEncodedUtils.CONTENT_TYPE));
                }
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "request headers tracked");
            }
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "not possible to parse headers as connection is already established", e2);
        }
    }

    public void parseResponseHeaders() {
        try {
            if (this.useResponseHeaders) {
                this.responseHeaders = new HashMap(this.conn.getHeaderFields());
                Iterator<String> it = this.responseHeaders.keySet().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next != null && next.contains("X-Android")) {
                        it.remove();
                    }
                }
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "response headers tracked");
            }
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "response headers can not be received", e2);
        }
    }
}
