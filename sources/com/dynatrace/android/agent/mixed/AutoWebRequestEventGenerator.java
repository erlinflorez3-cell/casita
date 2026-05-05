package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.events.enrichment.EventKeys;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AutoWebRequestEventGenerator extends BaseWebRequestEventGenerator {
    private Throwable exception;
    private String httpRequestMethod;
    private Map<String, List<String>> requestHeaders;
    private Map<String, List<String>> responseHeaders;
    private WebRequestTraceContext traceContext;

    public AutoWebRequestEventGenerator() {
        super("auto");
        this.requestHeaders = null;
        this.responseHeaders = null;
        this.traceContext = null;
    }

    private void handleHttp(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, "http");
        jSONObject.put("http.request.method", this.httpRequestMethod);
        if (this.statusCode > 0) {
            jSONObject.put("http.response.status_code", this.statusCode);
        }
        if (this.statusCode >= 400 && this.statusCode <= 599) {
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        }
        if (this.reasonPhrase != null) {
            jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, this.reasonPhrase);
        }
        Map<String, List<String>> map = this.responseHeaders;
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    jSONObject.put("http.response.header." + key.toLowerCase(), String.join(", ", entry.getValue()));
                }
            }
        }
        Map<String, List<String>> map2 = this.requestHeaders;
        if (map2 != null) {
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                if (key2 != null) {
                    jSONObject.put("http.request.header." + key2.toLowerCase(), String.join(", ", entry2.getValue()));
                }
            }
        }
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    public JSONObject generateRumRequestEvent() {
        return super.generateRumRequestEvent();
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    protected JSONObject populateJson(JSONObject jSONObject) throws JSONException {
        if ("http".equalsIgnoreCase(this.networkProtocolName) || "https".equalsIgnoreCase(this.networkProtocolName)) {
            handleHttp(jSONObject);
        } else {
            jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, this.networkProtocolName);
        }
        if (this.exception != null) {
            jSONObject.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            StringWriter stringWriter = new StringWriter();
            this.exception.printStackTrace(new PrintWriter(stringWriter));
            jSONObject.put(EventKeys.EXCEPTION.STACK_TRACE, stringWriter.toString());
            jSONObject.put(EventKeys.EXCEPTION.TYPE, this.exception.getClass().getName());
            jSONObject.put(EventKeys.EXCEPTION.MESSAGE, this.exception.getMessage());
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        }
        WebRequestTraceContext webRequestTraceContext = this.traceContext;
        if (webRequestTraceContext != null) {
            if (webRequestTraceContext.getTraceparentId() != null) {
                jSONObject.put(EventKeys.TRACE_ID, this.traceContext.getTraceId());
                jSONObject.put(EventKeys.SPAN_ID, this.traceContext.getSpanId());
            }
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, this.traceContext.getHint());
        }
        return jSONObject;
    }

    public void setException(Throwable th) {
        this.exception = th;
    }

    public void setHttpRequestHeaders(Map<String, List<String>> map) {
        this.requestHeaders = map;
    }

    public void setHttpRequestMethod(String str) {
        this.httpRequestMethod = str;
    }

    public void setHttpResponseHeaders(Map<String, List<String>> map) {
        this.responseHeaders = map;
    }

    public void setWebRequestTraceContext(WebRequestTraceContext webRequestTraceContext) {
        this.traceContext = webRequestTraceContext;
    }
}
