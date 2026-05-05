package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.api.internal.TraceparentHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class WebRequestTraceContextInizializer {
    public static WebRequestTraceContext initialize(String str, WebRequestTraceContextCallback webRequestTraceContextCallback) {
        WebRequestTraceContext webRequestTraceContext = new WebRequestTraceContext();
        if (str != null) {
            TraceparentHeader traceparentHeader = TraceparentHeader.Companion.parse(str);
            if (traceparentHeader == null) {
                webRequestTraceContext.setInvalidContext();
            } else {
                webRequestTraceContext.setExternalContext(traceparentHeader.getTraceId(), traceparentHeader.getParentId());
            }
        } else {
            webRequestTraceContext.setInternalContext();
            webRequestTraceContextCallback.invoke(webRequestTraceContext.getTraceparentId());
        }
        return webRequestTraceContext;
    }
}
