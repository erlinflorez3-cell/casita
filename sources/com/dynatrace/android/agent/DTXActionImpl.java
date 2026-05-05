package com.dynatrace.android.agent;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.crash.JavaStacktraceProcessor;
import com.dynatrace.android.agent.crash.PlatformType;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.net.HttpURLConnection;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DTXActionImpl extends CustomSegment implements DTXAction {
    private static final String DEPTH_WARNING = "Maximum depth of actions reached (10). Discarding creation of '%s'";
    public static final int MAX_DEPTH = 10;
    protected Vector<CustomSegment> childEventVector;
    protected int endActionSequenceNum;
    protected boolean forwardToGrail;
    int numberOfParentActions;
    private static final String LOGTAG = Global.LOG_PREFIX + "DTXActionImpl";
    private static ConcurrentHashMap<Long, Vector<CustomSegment>> orphanEvents = new ConcurrentHashMap<>();

    protected DTXActionImpl(String str, EventType eventType, long j2, Session session, int i2, boolean z2, DTXActionImpl dTXActionImpl) {
        super(str, 5, eventType, j2, session, i2, z2);
        this.endActionSequenceNum = -1;
        this.childEventVector = new Vector<>();
        this.numberOfParentActions = 0;
        this.parentAction = dTXActionImpl;
        if (dTXActionImpl == null) {
            this.rootAction = this;
        } else {
            this.rootAction = dTXActionImpl.rootAction;
        }
        this.forwardToGrail = z2;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "New action " + str);
        }
        if (nameMissing()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "The action name is null or empty hence this action will be deactivated");
            }
            disable();
        }
    }

    private void addChildEvent(String str, int i2, String... strArr) {
        if (getPreconditions()) {
            if (isLimitNumberOfAllowedUserEventsExceed()) {
                int iIncrementAndGetDroppedEvents = incrementAndGetDroppedEvents();
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Limit of actions is reached for reporting values, dropped events: " + iIncrementAndGetDroppedEvents);
                    return;
                }
                return;
            }
            CustomSegment customSegmentAddEvent = Core.addEvent(str, i2, getTagId(), null, this.session, this.serverId, strArr);
            if (customSegmentAddEvent != null) {
                addChildEvent(customSegmentAddEvent);
            }
        }
    }

    @Deprecated
    static void addOrphanEvent(CustomSegment customSegment) {
        Configuration configuration = AdkSettings.getInstance().getConfiguration();
        if (configuration == null || configuration.mode != AgentMode.SAAS) {
            Vector<CustomSegment> vector = orphanEvents.get(Long.valueOf(Utility.getCurrentThreadId()));
            if (vector == null) {
                vector = new Vector<>();
                orphanEvents.put(Long.valueOf(Utility.getCurrentThreadId()), vector);
            }
            vector.add(customSegment);
        }
    }

    protected static DTXAction createAction(String str, DTXAction dTXAction) {
        Session sessionDetermineActiveSession;
        int i2;
        long tagId;
        DTXActionImpl dTXActionImpl = dTXAction instanceof DTXActionImpl ? (DTXActionImpl) dTXAction : null;
        if (dTXActionImpl != null) {
            tagId = dTXActionImpl.getTagId();
            sessionDetermineActiveSession = dTXActionImpl.session;
            i2 = dTXActionImpl.serverId;
        } else {
            sessionDetermineActiveSession = Session.determineActiveSession(false);
            i2 = AdkSettings.getInstance().serverId;
            tagId = 0;
        }
        DTXActionImpl dTXActionImpl2 = new DTXActionImpl(str, EventType.ACTION_MANUAL, tagId, sessionDetermineActiveSession, i2, true, dTXActionImpl);
        if (dTXActionImpl != null && dTXActionImpl.isFinished()) {
            dTXActionImpl2.disable();
        }
        if (tagId != 0) {
            int i3 = dTXActionImpl.numberOfParentActions + 1;
            dTXActionImpl2.numberOfParentActions = i3;
            if (i3 >= 10) {
                if (Global.DEBUG) {
                    Utility.zlogW(LOGTAG, String.format(DEPTH_WARNING, dTXActionImpl2.getName()));
                }
                return dTXActionImpl2;
            }
            if (dTXActionImpl2.isLimitNumberOfAllowedUserEventsExceed()) {
                int iIncrementAndGetDroppedEvents = dTXActionImpl2.incrementAndGetDroppedEvents();
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Limit of actions is reached for user actions, dropped events: " + iIncrementAndGetDroppedEvents);
                }
                dTXActionImpl2.disable();
                return dTXActionImpl2;
            }
            dTXActionImpl.addChildEvent(dTXActionImpl2);
        }
        ActionThreadLocal.addAction(dTXActionImpl2);
        Core.addEvent(str, 1, tagId, dTXActionImpl2, sessionDetermineActiveSession, i2, new String[0]);
        return dTXActionImpl2;
    }

    @Deprecated
    static Vector<CustomSegment> getOrphanEvents() {
        Configuration configuration = AdkSettings.getInstance().getConfiguration();
        if (configuration == null || configuration.mode != AgentMode.SAAS) {
            return orphanEvents.remove(Long.valueOf(Utility.getCurrentThreadId()));
        }
        return null;
    }

    public final void addChildEvent(CustomSegment customSegment) {
        if (customSegment == null || !customSegment.isEnabled()) {
            return;
        }
        incrementChildEvents();
        this.childEventVector.add(customSegment);
        notifyChildAdded(customSegment);
    }

    @Deprecated
    protected void adoptOrphans() {
        Vector<CustomSegment> orphanEvents2 = getOrphanEvents();
        if (orphanEvents2 == null) {
            return;
        }
        for (CustomSegment customSegment : orphanEvents2) {
            if (customSegment.getStartTime() > getStartTime() && customSegment.getStartTime() < getEndTime()) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, String.format("%s adopting %s tagId=%s", getName(), customSegment.getName(), Long.valueOf(customSegment.getTagId())));
                }
                customSegment.setParentTagId(getTagId());
                addChildEvent(customSegment);
            } else if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("%s not adopting %s tagId=%s", getName(), customSegment.getName(), Long.valueOf(customSegment.getTagId())));
            }
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void cancel() {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Action '" + getName() + "' was canceled by the developer");
        }
        discardAction();
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sb = new StringBuilder();
        sb.append(SegmentConstants.E_ET).append(this.eventType.getProtocolId());
        sb.append("&na=").append(Utility.urlEncode(getName()));
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&ca=").append(getTagId());
        sb.append("&pa=").append(getParentTagId());
        sb.append("&s0=").append(getLcSeqNum());
        sb.append("&t0=").append(getStartTime());
        sb.append("&s1=").append(this.endActionSequenceNum);
        sb.append("&t1=").append(getEndTime() - getStartTime());
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }

    public void discardAction() {
        leaveAction(false);
    }

    public Vector<CustomSegment> getChildEventVector() {
        Vector<CustomSegment> vector;
        synchronized (this.childEventVector) {
            vector = new Vector<>(this.childEventVector);
        }
        return vector;
    }

    protected WebReqTag getInternalRequestTag() {
        if (!getPreconditions() || !this.session.getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            return null;
        }
        if (!isLimitNumberOfAllowedUserEventsExceed()) {
            return new WebReqTag(getTagId(), this.serverId, this.session);
        }
        int iIncrementAndGetDroppedEvents = incrementAndGetDroppedEvents();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Limit of actions is reached for web requests, dropped events: " + iIncrementAndGetDroppedEvents);
        }
        return null;
    }

    public int getNumberOfParentActions() {
        return this.numberOfParentActions;
    }

    protected boolean getPreconditions() {
        if (isFinalized()) {
            return false;
        }
        if (this.numberOfParentActions < 10) {
            return Dynatrace.getCaptureStatus();
        }
        if (Global.DEBUG) {
            Utility.zlogW(LOGTAG, String.format(DEPTH_WARNING, getName()));
        }
        return false;
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public String getRequestTag() {
        return WebReqTag.tagToString(getInternalRequestTag());
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final String getRequestTagHeader() {
        return Dynatrace.getRequestTagHeader();
    }

    WebReqTag internalTagRequest() {
        WebReqTag internalRequestTag = getInternalRequestTag();
        if (internalRequestTag == null) {
            return null;
        }
        addChildEvent(new CustomSegment(internalRequestTag.toString(), 110, EventType.PLACEHOLDER, getTagId(), this.session, this.serverId, this.forwardToGrail));
        return internalRequestTag;
    }

    WebReqTag internalTagRequest(HttpURLConnection httpURLConnection) {
        WebReqTag webReqTagInternalTagRequest;
        if (httpURLConnection == null || (webReqTagInternalTagRequest = internalTagRequest()) == null) {
            return null;
        }
        try {
            httpURLConnection.setRequestProperty(Dynatrace.getRequestTagHeader(), webReqTagInternalTagRequest.toString());
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, e2.toString());
            }
        }
        return webReqTagInternalTagRequest;
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final boolean isFinished() {
        return isFinalized();
    }

    /* JADX INFO: renamed from: lambda$reportError$0$com-dynatrace-android-agent-DTXActionImpl */
    /* synthetic */ void m7125lambda$reportError$0$comdynatraceandroidagentDTXActionImpl(String str, int i2, RumEventDispatcher rumEventDispatcher) {
        if (!this.session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "action reportError eventType shouldn't be collected, because of data collection level: " + EventType.EVENT_API);
            return;
        }
        JSONObject jSONObjectGenerateErrorEvent = ErrorEvent.generateErrorEvent(str, i2, true);
        if (jSONObjectGenerateErrorEvent != null) {
            rumEventDispatcher.dispatchEvent(jSONObjectGenerateErrorEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(this.session), true, null);
        }
    }

    /* JADX INFO: renamed from: lambda$reportError$1$com-dynatrace-android-agent-DTXActionImpl */
    /* synthetic */ void m7126lambda$reportError$1$comdynatraceandroidagentDTXActionImpl(Throwable th, String str, RumEventDispatcher rumEventDispatcher) {
        if (!this.session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "action reportError eventType shouldn't be collected, because of data collection level: " + EventType.EVENT_API);
            return;
        }
        JSONObject jSONObjectErrorExceptionEvent = ErrorEvent.errorExceptionEvent(th, str, true);
        if (jSONObjectErrorExceptionEvent != null) {
            rumEventDispatcher.dispatchEvent(jSONObjectErrorExceptionEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(this.session), true, null);
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void leaveAction() {
        leaveAction(true);
        sendSfmForDroppedEventsIfNeeded();
    }

    protected void leaveAction(boolean z2) {
        if (isFinalized()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("Action %s is already closed", getName()));
                return;
            }
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("Action %s closing ... saving=%b", getName(), Boolean.valueOf(z2)));
        }
        ActionThreadLocal.removeAction(this);
        boolean preconditions = getPreconditions();
        if (preconditions) {
            this.mEventEndTime = this.session.getRunningTime();
            adoptOrphans();
            leaveInnerActions(z2);
            this.endActionSequenceNum = Utility.getEventSeqNum();
            if (z2) {
                Core.addEvent(getName(), 2, getParentTagId(), this, this.session, this.serverId, new String[0]);
            } else {
                updateEndTime();
                Core.removeFromCalloutTable(this);
            }
        } else {
            leaveInnerActions(false);
            updateEndTime();
            Core.removeFromCalloutTable(this);
        }
        if (this.parentAction != null && (this.parentAction instanceof DTXAutoAction)) {
            ((DTXAutoAction) this.parentAction).onLeaveAction(this);
        }
        if (Global.DEBUG) {
            String str = LOGTAG;
            Utility.zlogD(str, String.format("Action %s closed: shouldSave=%b rc=%b", getName(), Boolean.valueOf(z2), Boolean.valueOf(preconditions)));
            if (preconditions) {
                return;
            }
            Utility.zlogW(str, String.format("Discard %s tagId=%d capture state=%b", getName(), Long.valueOf(getTagId()), Boolean.valueOf(preconditions)));
        }
    }

    protected void leaveInnerActions(boolean z2) {
        Vector<CustomSegment> vector = this.childEventVector;
        if (vector == null) {
            return;
        }
        synchronized (vector) {
            for (int size = this.childEventVector.size() - 1; size >= 0; size--) {
                CustomSegment customSegment = this.childEventVector.get(size);
                if (customSegment.getType() == 5) {
                    ((DTXActionImpl) customSegment).leaveAction(z2);
                }
            }
        }
    }

    protected void notifyChildAdded(CustomSegment customSegment) {
    }

    public void removeChildEvent(String str) {
        if (str == null) {
            return;
        }
        for (CustomSegment customSegment : getChildEventVector()) {
            if (customSegment.getName().equals(str)) {
                this.childEventVector.remove(customSegment);
                Core.removeFromCalloutTable(customSegment);
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Removing child: " + str);
                    return;
                }
                return;
            }
        }
    }

    @Deprecated
    void reportCrash(PlatformType platformType, String str, String str2, String str3) {
        Dynatrace.reportCrash(platformType, str, str2, str3);
    }

    void reportError(PlatformType platformType, String str, String str2, String str3, String str4) {
        if (platformType == null || str == null) {
            return;
        }
        addChildEvent(str, 20, Utility.truncateString(str2, 250), Utility.truncateString(str3, 1000), Utility.truncateString(str4, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH), platformType.getProtocolValue());
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportError(final String str, final int i2) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError within action context, errorName: " + str + ", errorCode: " + i2);
        if (str != null && getPreconditions()) {
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(this.session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.DTXActionImpl$$ExternalSyntheticLambda0
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    this.f$0.m7125lambda$reportError$0$comdynatraceandroidagentDTXActionImpl(str, i2, rumEventDispatcher);
                }
            });
            addChildEvent(str, 9, String.valueOf(i2));
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportError(final String str, final Throwable th) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError within action context, errorName: " + str + ", throwable: " + th);
        if (str != null && getPreconditions()) {
            if (th != null) {
                Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(this.session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.DTXActionImpl$$ExternalSyntheticLambda1
                    @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                    public final void execute(RumEventDispatcher rumEventDispatcher) {
                        this.f$0.m7126lambda$reportError$1$comdynatraceandroidagentDTXActionImpl(th, str, rumEventDispatcher);
                    }
                });
            }
            StacktraceData stacktraceData = th == null ? new StacktraceData(null, null, null, PlatformType.JAVA) : new JavaStacktraceProcessor(th, AdkSettings.getInstance().getConfiguration().mode == AgentMode.APP_MON ? 10 : Integer.MAX_VALUE).process();
            addChildEvent(str, 10, stacktraceData.getName(), stacktraceData.getReason(), stacktraceData.getStacktrace(), stacktraceData.getType().getProtocolValue());
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportEvent(String str) {
        addChildEvent(str, 4, new String[0]);
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, double d2) {
        addChildEvent(str, 7, String.valueOf(d2));
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, int i2) {
        addChildEvent(str, 6, String.valueOf(i2));
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, long j2) {
        addChildEvent(str, 6, String.valueOf(j2));
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, String str2) {
        addChildEvent(str, 8, str2);
    }

    public String tagRequest() {
        return WebReqTag.tagToString(internalTagRequest());
    }

    @Override // com.dynatrace.android.agent.DTXAction
    @Deprecated
    public void tagRequest(HttpURLConnection httpURLConnection) {
        internalTagRequest(httpURLConnection);
    }
}
