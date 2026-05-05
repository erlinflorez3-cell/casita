package com.dynatrace.android.agent;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.ManualWebRequestEventGenerator;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class WebRequestTiming {
    private static final String LOGTAG = Global.LOG_PREFIX + "WebRequestTiming";
    private final boolean forwardToGrail;
    private long mEventEndTime;
    private long mEventStartTime;
    private boolean mFinalized;
    private HttpURLConnection userConnection;
    private final WebReqTag webReqTag;

    protected WebRequestTiming(String str) {
        this(str, true);
    }

    protected WebRequestTiming(String str, boolean z2) {
        this.mFinalized = false;
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.userConnection = null;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Creating new web request timing for tag " + str);
        }
        this.webReqTag = WebReqTag.parseTag(str, Session.currentSession());
        this.forwardToGrail = z2;
    }

    @Deprecated
    protected WebRequestTiming(HttpURLConnection httpURLConnection) {
        this(getTag(httpURLConnection));
        this.userConnection = httpURLConnection;
    }

    private static String getTag(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        if (httpURLConnection.getRequestProperty(Dynatrace.getRequestTagHeader()) == null) {
            Dynatrace.tagRequest(httpURLConnection);
        }
        return httpURLConnection.getRequestProperty(Dynatrace.getRequestTagHeader());
    }

    private void stopWebRequest(final URI uri, final int i2, final String str, long j2, long j3) {
        WebReqTag webReqTag;
        if (uri == null) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUri\" must not be null");
                return;
            }
            return;
        }
        if (!isSchemeExists(uri)) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The URI scheme is empty");
                return;
            }
            return;
        }
        if (this.mEventStartTime == -1 || (webReqTag = this.webReqTag) == null) {
            return;
        }
        final Session session = webReqTag.getSession();
        if (isFinalized()) {
            return;
        }
        if (!Dynatrace.getCaptureStatus()) {
            this.mFinalized = true;
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Creating web timing event for " + this.webReqTag);
        }
        updateEndTime(session.getRunningTime());
        final WebRequestUtils.FormattedUrl formattedUrlRemoveUrlCredentials = WebRequestUtils.removeUrlCredentials(uri.toString());
        Core.saveSegment(new WebReqSegment(this.webReqTag.getParentTagId(), this.webReqTag.getSeqNumber(), this.mEventStartTime, this.mEventEndTime, i2, str, Utility.truncateWebRequest(formattedUrlRemoveUrlCredentials.legacyAgentUrl), j2, j3, session, this.webReqTag.getServerId(), null, !session.isGrailEventsShouldBeCaptured()));
        if (this.forwardToGrail) {
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.WebRequestTiming$$ExternalSyntheticLambda0
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    this.f$0.m7128xa4bf1245(session, formattedUrlRemoveUrlCredentials, uri, i2, str, rumEventDispatcher);
                }
            });
        }
    }

    private void updateEndTime(long j2) {
        if (this.mFinalized) {
            return;
        }
        this.mEventEndTime = j2;
        this.mFinalized = true;
    }

    public boolean isFinalized() {
        return this.mFinalized;
    }

    boolean isSchemeExists(URI uri) {
        return uri.getScheme() != null;
    }

    /* JADX INFO: renamed from: lambda$stopWebRequest$0$com-dynatrace-android-agent-WebRequestTiming */
    /* synthetic */ void m7128xa4bf1245(Session session, WebRequestUtils.FormattedUrl formattedUrl, URI uri, int i2, String str, RumEventDispatcher rumEventDispatcher) {
        if (!session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "stopWebRequest eventType shouldn't be collected, because of data collection level: " + EventType.EVENT_API);
            return;
        }
        ManualWebRequestEventGenerator manualWebRequestEventGenerator = new ManualWebRequestEventGenerator();
        manualWebRequestEventGenerator.setUrl(formattedUrl.oneAgentUrl);
        manualWebRequestEventGenerator.setNetworkProtocolName(uri.getScheme());
        manualWebRequestEventGenerator.setStatusCode(i2);
        manualWebRequestEventGenerator.setReasonPhrase(str);
        JSONObject jSONObjectGenerateRumRequestEvent = manualWebRequestEventGenerator.generateRumRequestEvent();
        if (jSONObjectGenerateRumRequestEvent == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "manual web request event is invalid " + uri);
            return;
        }
        try {
            jSONObjectGenerateRumRequestEvent.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "manual web request event is invalid " + uri);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "manual web request event is generated: " + jSONObjectGenerateRumRequestEvent);
        long sessionStartTime = session.getSessionStartTime();
        long j2 = this.mEventStartTime;
        rumEventDispatcher.dispatchEvent(jSONObjectGenerateRumRequestEvent, sessionStartTime + j2, this.mEventEndTime - j2, SessionInformationGenerator.generate(session), true, null);
    }

    public void startWebRequestTiming() {
        if (this.webReqTag == null || isFinalized()) {
            return;
        }
        this.mEventStartTime = this.webReqTag.getSession().getRunningTime();
    }

    @Deprecated
    public void stopWebRequestTiming() {
        HttpURLConnection httpURLConnection = this.userConnection;
        if (httpURLConnection == null) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming().");
            }
        } else {
            try {
                stopWebRequestTiming(httpURLConnection.getURL(), this.userConnection.getResponseCode(), this.userConnection.getResponseMessage());
            } catch (IOException e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "Unable to retrieve status information for web timing request.", e2);
                }
                stopWebRequestTiming(this.userConnection.getURL(), 0, e2.getMessage());
            }
        }
    }

    public void stopWebRequestTiming(String str, int i2, String str2) throws MalformedURLException {
        if (str != null) {
            stopWebRequestTiming(URI.create(str), i2, str2);
        } else if (Global.DEBUG) {
            Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUrl\" must not be null");
        }
    }

    public void stopWebRequestTiming(URI uri, int i2, String str) {
        stopWebRequest(uri, i2, str, -1L, -1L);
    }

    public void stopWebRequestTiming(URI uri, int i2, String str, long j2, long j3) {
        stopWebRequest(uri, i2, str, j2, j3);
    }

    public void stopWebRequestTiming(URL url, int i2, String str) {
        if (url == null) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUrl\" must not be null");
            }
        } else {
            try {
                stopWebRequestTiming(url.toURI(), i2, str);
            } catch (URISyntaxException e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUrl\" is not formatted strictly according to to RFC2396", e2);
                }
            }
        }
    }
}
