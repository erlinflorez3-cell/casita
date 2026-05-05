package com.dynatrace.android.callback;

import com.dynatrace.android.callback.CbConstants;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class WebReqStateParms {
    protected String desc;
    int respCode;
    CbConstants.WrStates state;
    CbConstants.WrMethod trackingMethod;
    String reason = null;
    String reasonPhrase = null;
    long requestLength = -1;
    long responseLength = -1;
    boolean canFinalize = true;
    String serverTimingValue = null;
    Throwable exception = null;
    Map<String, List<String>> requestHeaders = null;
    Map<String, List<String>> responseHeaders = null;

    WebReqStateParms(CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates, int i2) {
        this.trackingMethod = wrMethod;
        this.state = wrStates;
        this.respCode = i2;
    }

    public void evaluateServerTiming(List<String> list) {
        this.serverTimingValue = new ServerTimingAnalyzer().analyze(list);
    }

    abstract String getRequestClassName();

    protected String getRequestClassName(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "NA";
    }

    abstract String getRequestDesc();

    public abstract Map<String, List<String>> getRequestHeaders();

    abstract String getRequestHost();

    abstract String getRequestMethod();

    public abstract Map<String, List<String>> getResponseHeaders();

    abstract URL getUrl();

    abstract Object[] getWebContext();

    abstract boolean isSupportedByGrail();

    public String toString() {
        return String.format("%s of %s.%s to %s", this.state, getRequestClassName(), this.trackingMethod, getRequestDesc());
    }
}
