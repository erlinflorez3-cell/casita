package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.util.HexGenerator;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public class WebRequestTraceContext {
    private static final String HINT_EXTERNAL = "external";
    private static final String HINT_INVALID = "invalid";
    private static final String HINT_SET = "set";
    private String hint;
    private String spanId;
    private String traceId;

    public String getHint() {
        return this.hint;
    }

    public String getSpanId() {
        return this.spanId;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getTraceparentId() {
        if (this.traceId == null || this.spanId == null) {
            return null;
        }
        return "00-" + this.traceId + Global.HYPHEN + this.spanId + "-01";
    }

    public void setExternalContext(String str, String str2) {
        this.traceId = str;
        this.spanId = str2;
        this.hint = HINT_EXTERNAL;
    }

    public void setInternalContext() {
        this.traceId = HexGenerator.generateRandomHex(16);
        this.spanId = HexGenerator.generateRandomHex(8);
        this.hint = HINT_SET;
    }

    public void setInvalidContext() {
        this.traceId = null;
        this.spanId = null;
        this.hint = "invalid";
    }
}
