package com.dynatrace.android.callback;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.WebReqSegment;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.AutoWebRequestEventGenerator;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.mixed.WebRequestTraceContext;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class CbWebReqTracker {
    private static final String LOGTAG = Global.LOG_PREFIX + "CbWebReqTracker";
    DTXAutoAction action;
    boolean canFinalize;
    private long endTime;
    private String eventData;
    private String server;
    final Session session;
    long startTime;
    WebReqStateParms stateParm;
    WebReqTag webReqTag;
    private CustomSegment wrtEvent;
    private long requestLength = -1;
    private long responseLength = -1;
    private Map<String, List<String>> requestHeaders = null;
    private Map<String, List<String>> responseHeaders = null;
    private WebRequestTraceContext traceContext = null;

    /* JADX INFO: renamed from: com.dynatrace.android.callback.CbWebReqTracker$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates;

        static {
            int[] iArr = new int[CbConstants.WrStates.values().length];
            $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates = iArr;
            try {
                iArr[CbConstants.WrStates.PRE_EXEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[CbConstants.WrStates.POST_EXEC_ERR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[CbConstants.WrStates.POST_EXEC_OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[CbConstants.WrStates.POST_EXEC_FINALIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    CbWebReqTracker(DTXAutoAction dTXAutoAction, Session session) {
        this.action = dTXAutoAction;
        this.session = session;
    }

    private void abandonTagAndUserAction() {
        DTXAutoAction dTXAutoAction = this.action;
        if (dTXAutoAction != null) {
            dTXAutoAction.removeChildEvent(this.webReqTag.toString());
        }
        this.webReqTag = null;
    }

    private AutoWebRequestEventGenerator setUpEventGenerator(WebReqStateParms webReqStateParms, WebRequestUtils.FormattedUrl formattedUrl) {
        AutoWebRequestEventGenerator autoWebRequestEventGenerator = new AutoWebRequestEventGenerator();
        autoWebRequestEventGenerator.setUrl(formattedUrl.oneAgentUrl);
        autoWebRequestEventGenerator.setException(webReqStateParms.exception);
        autoWebRequestEventGenerator.setNetworkProtocolName(webReqStateParms.getUrl().getProtocol());
        autoWebRequestEventGenerator.setHttpRequestMethod(webReqStateParms.getRequestMethod());
        autoWebRequestEventGenerator.setStatusCode(webReqStateParms.respCode);
        autoWebRequestEventGenerator.setReasonPhrase(webReqStateParms.reasonPhrase);
        autoWebRequestEventGenerator.setHttpRequestHeaders(this.requestHeaders);
        autoWebRequestEventGenerator.setHttpResponseHeaders(this.responseHeaders);
        autoWebRequestEventGenerator.setWebRequestTraceContext(this.traceContext);
        return autoWebRequestEventGenerator;
    }

    boolean checkForManualTag(String str, String str2) {
        WebReqTag webReqTag = this.webReqTag;
        if (webReqTag == null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("ManualTag '%s' is used", str));
            }
            return false;
        }
        if (!webReqTag.sameAs(str)) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("AutoTag %s != ManualTag '%s'", this.webReqTag.toString(), str));
            }
            abandonTagAndUserAction();
            return false;
        }
        if (str2 == null) {
            return false;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("ManualTag x-dtc exists: '%s'", str2));
        }
        abandonTagAndUserAction();
        return true;
    }

    public WebRequestTraceContext getTraceContext() {
        return this.traceContext;
    }

    /* JADX INFO: renamed from: lambda$sendEvents$0$com-dynatrace-android-callback-CbWebReqTracker */
    /* synthetic */ void m7129xf642be7b(WebReqStateParms webReqStateParms, RumEventDispatcher rumEventDispatcher) {
        if (!this.session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "auto web request event shouldn't be collected, because of data collection level: " + EventType.EVENT_API);
            return;
        }
        if (!webReqStateParms.isSupportedByGrail()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "auto web request event not supported by: " + webReqStateParms.getClass().getName());
            return;
        }
        JSONObject jSONObjectGenerateRumRequestEvent = setUpEventGenerator(webReqStateParms, WebRequestUtils.removeUrlCredentials(webReqStateParms.getUrl().toString())).generateRumRequestEvent();
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "auto web request event is generated: " + jSONObjectGenerateRumRequestEvent);
        if (jSONObjectGenerateRumRequestEvent == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "invalid RUM Request event for url " + webReqStateParms.getUrl().toString());
            return;
        }
        long sessionStartTime = this.session.getSessionStartTime();
        long j2 = this.startTime;
        rumEventDispatcher.dispatchEvent(jSONObjectGenerateRumRequestEvent, sessionStartTime + j2, this.endTime - j2, SessionInformationGenerator.generate(this.session), false, webReqStateParms.getWebContext());
    }

    void procNewState(WebReqStateParms webReqStateParms) {
        if (this.server == null) {
            this.server = webReqStateParms.getRequestHost();
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, webReqStateParms.getRequestMethod() + RemoteSettings.FORWARD_SLASH_STRING + webReqStateParms.trackingMethod + RemoteSettings.FORWARD_SLASH_STRING + webReqStateParms.state);
        }
        int i2 = AnonymousClass1.$SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[webReqStateParms.state.ordinal()];
        if (i2 == 1) {
            if (this.startTime <= 0) {
                this.startTime = this.session.getRunningTime();
            }
            long j2 = this.requestLength;
            if (j2 >= 0) {
                webReqStateParms.requestLength = j2;
            } else if (webReqStateParms instanceof ConnStateParms) {
                ((ConnStateParms) webReqStateParms).calcRequestBytes(webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream);
            }
            long j3 = this.responseLength;
            if (j3 >= 0) {
                webReqStateParms.responseLength = j3;
            }
            Map<String, List<String>> map = this.requestHeaders;
            if (map != null) {
                webReqStateParms.requestHeaders = map;
            } else if (webReqStateParms instanceof ConnStateParms) {
                ((ConnStateParms) webReqStateParms).parseRequestHeaders(webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream);
            }
            Map<String, List<String>> map2 = this.responseHeaders;
            if (map2 != null) {
                webReqStateParms.responseHeaders = map2;
                return;
            }
            return;
        }
        if (i2 == 2) {
            if (webReqStateParms.requestLength >= 0) {
                this.requestLength = webReqStateParms.requestLength;
            }
            if (webReqStateParms.responseLength >= 0) {
                this.responseLength = webReqStateParms.responseLength;
            }
            if (webReqStateParms.responseHeaders != null) {
                this.responseHeaders = webReqStateParms.responseHeaders;
            }
            if (webReqStateParms.requestHeaders != null) {
                this.requestHeaders = webReqStateParms.requestHeaders;
            }
            if (webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream && this.endTime > 0) {
                this.endTime = 0L;
                return;
            } else {
                this.canFinalize = true;
                this.endTime = this.session.getRunningTime();
                return;
            }
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            webReqStateParms.canFinalize = true;
            this.canFinalize = true;
            if (this.endTime <= 0) {
                this.endTime = this.session.getRunningTime();
                return;
            }
            return;
        }
        if ((webReqStateParms instanceof ConnStateParms) && webReqStateParms.trackingMethod != CbConstants.WrMethod.getOutputStream) {
            ConnStateParms connStateParms = (ConnStateParms) webReqStateParms;
            connStateParms.calcResponseBytes();
            connStateParms.evaluateServerTiming();
            connStateParms.parseResponseHeaders();
        }
        if (webReqStateParms.requestLength >= 0) {
            this.requestLength = webReqStateParms.requestLength;
        }
        if (webReqStateParms.responseLength >= 0) {
            this.responseLength = webReqStateParms.responseLength;
        }
        if (webReqStateParms.responseHeaders != null) {
            this.responseHeaders = webReqStateParms.responseHeaders;
        }
        if (webReqStateParms.requestHeaders != null) {
            this.requestHeaders = webReqStateParms.requestHeaders;
        }
        if (webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream) {
            this.endTime = this.session.getRunningTime();
            return;
        }
        this.canFinalize = webReqStateParms.canFinalize;
        if (this.endTime <= 0) {
            this.endTime = this.session.getRunningTime();
        }
    }

    void sendEvents(final WebReqStateParms webReqStateParms) {
        WebReqTag webReqTag;
        if (Global.DEBUG) {
            WebReqTag webReqTag2 = this.webReqTag;
            String string = webReqTag2 != null ? webReqTag2.toString() : "none!";
            String str = LOGTAG;
            Utility.zlogD(str, String.format("WRE: sT=%d eT=%d server=%s tag=%s", Long.valueOf(this.startTime), Long.valueOf(this.endTime), this.server, string));
            Utility.zlogD(str, String.format("WRE: desc=%s rc=%d msg=%s", webReqStateParms.getRequestDesc(), Integer.valueOf(webReqStateParms.respCode), webReqStateParms.reason));
        }
        if (Dynatrace.getCaptureStatus() && this.webReqTag != null) {
            WebReqSegment webReqSegment = new WebReqSegment(this.webReqTag.getParentTagId(), this.webReqTag.getSeqNumber(), this.startTime, this.endTime, webReqStateParms.respCode, webReqStateParms.reason, webReqStateParms.getRequestDesc(), webReqStateParms.requestLength, webReqStateParms.responseLength, this.session, this.webReqTag.getServerId(), webReqStateParms.serverTimingValue, !this.session.isGrailEventsShouldBeCaptured());
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(this.session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.callback.CbWebReqTracker$$ExternalSyntheticLambda0
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    this.f$0.m7129xf642be7b(webReqStateParms, rumEventDispatcher);
                }
            });
            if (CallbackCore.captureTestData) {
                this.wrtEvent = webReqSegment;
                this.eventData = webReqSegment.createEventData().toString();
            }
            Core.saveSegment(webReqSegment);
        }
        DTXAutoAction dTXAutoAction = this.action;
        if (dTXAutoAction == null || (webReqTag = this.webReqTag) == null) {
            return;
        }
        dTXAutoAction.onWrFinished(webReqTag.getParentTagId());
    }

    public void setTraceContext(WebRequestTraceContext webRequestTraceContext) {
        this.traceContext = webRequestTraceContext;
    }

    void setWebReqTag(WebReqTag webReqTag) {
        this.webReqTag = webReqTag;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.canFinalize)).append("&&");
        sb.append(String.valueOf(this.startTime)).append("&&");
        sb.append(String.valueOf(this.endTime)).append("&&");
        sb.append(String.valueOf(this.server)).append("&&");
        WebReqTag webReqTag = this.webReqTag;
        if (webReqTag != null) {
            sb.append(webReqTag.toString()).append("&&");
        } else {
            sb.append("NA&&");
        }
        DTXAutoAction dTXAutoAction = this.action;
        if (dTXAutoAction != null) {
            sb.append(dTXAutoAction.createEventData().toString()).append("&&");
        } else {
            sb.append("NA&&");
        }
        if (this.wrtEvent != null) {
            sb.append(this.eventData);
        } else {
            sb.append("NA");
        }
        return sb.toString();
    }
}
