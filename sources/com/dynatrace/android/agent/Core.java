package com.dynatrace.android.agent;

import android.app.Activity;
import android.app.Application;
import android.location.Location;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.dynatrace.agent.OneAgentStartup;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ConfigurationFactory;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.InitialServerIdProvider;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.cookie.CookieHandler;
import com.dynatrace.android.agent.crash.CrashCatcher;
import com.dynatrace.android.agent.crash.CrashListener;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.data.SessionParameterStore;
import com.dynatrace.android.agent.data.SessionParameterUtil;
import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.events.eventsapi.BizEventSegment;
import com.dynatrace.android.agent.events.eventsapi.CopyAttributeFilter;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregatorFactory;
import com.dynatrace.android.agent.events.eventsapi.EventPayloadGenerator;
import com.dynatrace.android.agent.events.eventsapi.EventPayloadUtility;
import com.dynatrace.android.agent.events.ragetap.RageTapObserver;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.mixed.AgentServiceLocator;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.mixed.TimeProviderFactory;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.internal.api.SelfMonitoring;
import com.dynatrace.android.lifecycle.ActivityLifecycleMonitor;
import com.dynatrace.android.lifecycle.activitytracking.ActiveActivityMonitor;
import com.dynatrace.android.lifecycle.appstart.ApplicationStartMonitor;
import com.dynatrace.android.lifecycle.appstate.ApplicationStateMonitor;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.ragetap.measure.TapMonitorFactory;
import com.dynatrace.android.window.OnKeyEventListener;
import com.dynatrace.android.window.OnTouchEventListener;
import com.dynatrace.android.window.WindowCallbackMonitor;
import com.dynatrace.android.window.WindowListenerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Core {
    public static final int DEFAULT_PURGE_DATA_TIMEOUT_MS = 540000;
    private static final int DEFAULT_SEND_EVENT_TIMEOUT_TICKS = 12;
    static final int FLUSH_WAIT_TIME_MS = 5000;
    static final int SECONDS_PER_TICK = 10;
    private static CookieHandler cookieHandler = null;
    public static DataAccessObject dao = null;
    private static final String TAG = Global.LOG_PREFIX + "Core";
    private static final ActivityLifecycleMonitor ACTIVITY_LIFECYCLE_MONITOR = new ActivityLifecycleMonitor();
    private static final ApplicationStartMonitor APPLICATION_START_MONITOR = new ApplicationStartMonitor();
    private static final ApplicationStateMonitor APPLICATION_STATE_MONITOR = new ApplicationStateMonitor();
    private static final ActiveActivityMonitor ACTIVE_ACTIVITY_MONITOR = new ActiveActivityMonitor();
    private static final WindowCallbackMonitor WINDOW_CALLBACK_MONITOR = new WindowCallbackMonitor();
    public static final GuardedEventDispatcher GUARDED_EVENT_DISPATCHER = new GuardedEventDispatcher();
    private static final ConfigurationPublisher CONFIGURATION_PUBLISHER = new ConfigurationPublisher();
    private static BasicSegment basicSegment = null;
    private static long mSendEventTimeoutTicks = 12;
    private static CalloutTable mCalloutTable = new CalloutTable(12);
    static CommunicationManager communicationManager = new CommunicationManager(mCalloutTable);
    static OneAgentFacade oneAgentFacade = null;
    private static AtomicBoolean isFirstStartup = new AtomicBoolean(true);
    private static AdkSettings adk = AdkSettings.getInstance();
    private static CrashReporter crashReporter = new CrashReporter(communicationManager);
    private static RageTapDetector rageTapDetector = null;
    private static CommunicationManagerBridge communicationManagerBridge = null;
    private static OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge = null;
    private static OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge = null;
    private static OneAgentStartup oneAgentStartup = null;
    private static AgentServiceLocator currentLocator = null;
    private static EventThrottler eventThrottler = null;
    private static SessionParameterStore sessionParameterStore = null;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.Core$1 */
    class AnonymousClass1 implements EventThrottler.SummaryReceiver {
        AnonymousClass1() {
        }

        @Override // com.dynatrace.agent.events.EventThrottler.SummaryReceiver
        public void onDroppedEventSummary(String str) {
            SelfMonitoring.reportLogEvent("EventThrottling", str);
        }

        @Override // com.dynatrace.agent.events.EventThrottler.SummaryReceiver
        public void onInvalidEventSummary(String str) {
            SelfMonitoring.reportLogEvent("EventThrottlingInvalidEventType", str);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.Core$2 */
    class AnonymousClass2 implements WindowListenerFactory {
        AnonymousClass2() {
        }

        @Override // com.dynatrace.android.window.WindowListenerFactory
        public OnKeyEventListener generateOnKeyEventListener() {
            return null;
        }

        @Override // com.dynatrace.android.window.WindowListenerFactory
        public OnTouchEventListener generateOnTouchEventListener(Window window) {
            final View rootView = window.getDecorView().getRootView();
            return new OnTouchEventListener() { // from class: com.dynatrace.android.agent.Core$2$$ExternalSyntheticLambda0
                @Override // com.dynatrace.android.window.OnTouchEventListener
                public final void onTouchEvent(MotionEvent motionEvent) {
                    Core.oneAgentUserInteractionManagerBridge.onMotionEvent(rootView, motionEvent);
                }
            };
        }
    }

    static CustomSegment addEvent(String str, int i2, long j2, DTXActionImpl dTXActionImpl, Session session, int i3, String... strArr) {
        CustomSegment customSegment = dTXActionImpl;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Handle event name=%s type=%s", str, Integer.valueOf(i2)));
        }
        long j3 = j2 >= 0 ? j2 : 0L;
        if (i2 != 1) {
            if (i2 != 2) {
                customSegment = null;
                if (i2 == 4) {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    customSegment = new CustomSegment(str, 4, EventType.NAMED_EVENT, j3, session, i3, true);
                    mCalloutTable.addOtherEvent();
                } else if (i2 == 20) {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    customSegment = new ErrorSegment(str, strArr[0], strArr[1], strArr[2], j3, session, i3, strArr[3], true);
                    mCalloutTable.addOtherEvent();
                } else if (i2 != 21) {
                    switch (i2) {
                        case 6:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.VALUE_INT64, j3, session, i3, true);
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 7:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.VALUE_DOUBLE, j3, session, i3, true);
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 8:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.VALUE_STRING, j3, session, i3, true);
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 9:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CustomSegment(str, 6, EventType.ERROR_INT, j3, session, i3, true ^ session.isGrailEventsShouldBeCaptured());
                            customSegment.mValue = Utility.truncateString(strArr[0], 250);
                            mCalloutTable.addOtherEvent();
                            break;
                        case 10:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new ErrorSegment(str, strArr[0], strArr[1], strArr[2], j3, session, i3, strArr[3], !session.isGrailEventsShouldBeCaptured());
                            mCalloutTable.addOtherEvent();
                            break;
                        case 11:
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            customSegment = new CrashSegment(str, strArr[0], strArr[1], session, i3, strArr[2], !session.isGrailEventsShouldBeCaptured());
                            mCalloutTable.addOtherEvent();
                            CrashCatcher.notifyListeners(strArr[2], str, strArr[0], strArr[1]);
                            break;
                        case 12:
                            customSegment = new CustomSegment(str, 12, EventType.IDENTIFY_USER, j3, session, i3, true ^ session.isGrailEventsShouldBeCaptured());
                            mCalloutTable.addOtherEvent();
                            break;
                        default:
                            if (Global.DEBUG) {
                                Utility.zlogD(TAG, String.format("addEvent invalid type: %d", Integer.valueOf(i2)));
                            }
                            break;
                    }
                } else {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    customSegment = new CrashSegment(str, strArr[0], strArr[1], session, i3, strArr[2], true);
                    mCalloutTable.addOtherEvent();
                    CrashCatcher.notifyListeners(strArr[2], str, strArr[0], strArr[1]);
                }
            } else if (customSegment != null) {
                customSegment.updateEndTime();
            }
        } else if (customSegment != null) {
            mCalloutTable.addActionEvent(customSegment);
        }
        saveSegment(customSegment, i2);
        return customSegment;
    }

    public static void applyAgentStateFromOneAgent(AgentState agentState) {
        communicationManager.handleAgentStateReceivedFromOneAgent(agentState);
    }

    public static void applyConfigurationFromOneAgent(ServerConfiguration serverConfiguration) {
        communicationManager.handleConfigReceivedFromOneAgent(serverConfiguration);
    }

    static void applyServerConfiguration(ServerConfiguration serverConfiguration) {
        adk.switchServerConfiguration(serverConfiguration);
        long sendIntervalSec = (serverConfiguration.getSendIntervalSec() + 9) / 10;
        mSendEventTimeoutTicks = sendIntervalSec;
        mCalloutTable.changeSendEventTimeout(sendIntervalSec);
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Send event timeout set to: %s ticks", Long.valueOf(sendIntervalSec)));
        }
        if (serverConfiguration.isSwitchServer()) {
            int serverId = serverConfiguration.getServerId();
            AdkSettings.getInstance().serverId = serverId;
            CommunicationManagerBridge communicationManagerBridge2 = communicationManagerBridge;
            if (communicationManagerBridge2 != null) {
                communicationManagerBridge2.updateServerId(serverId);
            }
        }
    }

    private static JSONObject createIdentifyUserEvent(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.length() > 250) {
                str = str.substring(0, 250);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EventKeys.DT.RUM.USER_TAG, str);
                jSONObject.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "identifyUser event was generated: " + jSONObject);
                return jSONObject;
            } catch (JSONException unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "identifyUser event can't be generated");
            }
        }
        return null;
    }

    protected static void endVisit() {
        Session sessionDetermineActiveSession = Session.determineActiveSession(true);
        int i2 = AdkSettings.getInstance().serverId;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Ending current visit of session " + sessionDetermineActiveSession.sessionId);
        }
        saveSegment(VisitSegment.createVisitSegment(sessionDetermineActiveSession, i2, true));
        startNewSession(true, sessionDetermineActiveSession.getPrivacyRules());
    }

    static void flushEvents() {
        if (dao == null) {
            return;
        }
        DatabaseWriteQueue.getInstance().flushQueue();
        mCalloutTable.purge();
        communicationManager.flushEvents();
    }

    public static void forceCloseActiveActions(String str) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("%s ... force closed actions due to %s", Thread.currentThread().getName(), str));
        }
        ActionThreadLocal.closeAll();
        DTXAutoAction.closeAll();
    }

    public static ApplicationStartMonitor getApplicationStartMonitor() {
        return APPLICATION_START_MONITOR;
    }

    public static CalloutTable getCalloutTable() {
        return mCalloutTable;
    }

    static boolean getCaptureState() {
        return communicationManager.isUemActive();
    }

    static ConfigurationPublisher getConfigurationPublisher() {
        return CONFIGURATION_PUBLISHER;
    }

    static CrashListener getCrashListener() {
        return crashReporter;
    }

    static String getOcvbString(Session session) {
        return basicSegment.createEventData(session).toString();
    }

    public static OneAgentLifecycleManagerBridge getOneAgentLifecycleManagerBridge() {
        return oneAgentLifecycleManagerBridge;
    }

    public static OneAgentUserInteractionManagerBridge getOneAgentUserInteractionManagerBridge() {
        return oneAgentUserInteractionManagerBridge;
    }

    static WebReqTag getRequestTag() {
        Session sessionDetermineActiveSession;
        WebReqTag webReqTag;
        int i2;
        long tagId;
        if (!communicationManager.isUemActive()) {
            return null;
        }
        DTXActionImpl currentAction = ActionThreadLocal.getCurrentAction();
        if (currentAction == null) {
            currentAction = DTXAutoAction.getAutoAction();
        }
        if (currentAction != null) {
            tagId = currentAction.getTagId();
            sessionDetermineActiveSession = currentAction.session;
            i2 = currentAction.serverId;
            webReqTag = currentAction.getInternalRequestTag();
        } else {
            sessionDetermineActiveSession = null;
            webReqTag = null;
            i2 = 0;
            tagId = 0;
        }
        if (webReqTag == null) {
            sessionDetermineActiveSession = Session.determineActiveSession(false);
            i2 = AdkSettings.getInstance().serverId;
            webReqTag = new WebReqTag(0L, i2, sessionDetermineActiveSession);
            tagId = 0;
        }
        if (!sessionDetermineActiveSession.getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            return null;
        }
        CustomSegment customSegment = new CustomSegment(webReqTag.toString(), 100, EventType.PLACEHOLDER, tagId, sessionDetermineActiveSession, i2, true);
        if (tagId == 0) {
            DTXActionImpl.addOrphanEvent(customSegment);
        } else {
            currentAction.addChildEvent(customSegment);
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Added an event %s id=%d pid=%d", customSegment.getName(), Long.valueOf(customSegment.getTagId()), Long.valueOf(customSegment.getParentTagId())));
        }
        return webReqTag;
    }

    static void handleTrafficLimitationForCookies(Session session) {
        if (AdkSettings.getInstance().hybridApp) {
            cookieHandler.onTrafficControlUpdate(session);
        }
    }

    static /* synthetic */ void lambda$reportUserTag$0(Session session, RumEventDispatcher rumEventDispatcher) {
        JSONObject jSONObjectCreateIdentifyUserEvent = createIdentifyUserEvent(session.getUserTag());
        if (jSONObjectCreateIdentifyUserEvent != null) {
            rumEventDispatcher.dispatchEvent(jSONObjectCreateIdentifyUserEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(session), true, null);
        }
    }

    static /* synthetic */ void lambda$sendEvent$1(Session session, JSONObject jSONObject, Object[] objArr, RumEventDispatcher rumEventDispatcher) {
        if (session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            rumEventDispatcher.dispatchEventWithRestrictions(jSONObject, SessionInformationGenerator.generate(session), objArr);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendEvent eventType shouldn't be collected, because of data collection level: " + EventType.EVENT_API);
        }
    }

    static /* synthetic */ void lambda$sendSessionPropertyEvent$2(Session session, JSONObject jSONObject, RumEventDispatcher rumEventDispatcher) {
        if (session.getPrivacyRules().shouldCollectEvent(EventType.EVENT_API)) {
            rumEventDispatcher.dispatchSessionPropertiesWithRestrictions(jSONObject, SessionInformationGenerator.generate(session));
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendSessionPropertyEvent shouldn't be collected because of data collection level");
        }
    }

    public static void modifyUserAction(UserActionModifier userActionModifier) {
        DTXAutoAction autoAction = DTXAutoAction.getAutoAction();
        if (autoAction != null) {
            userActionModifier.modify(new ExposedUserAction(autoAction));
        } else if (Global.DEBUG) {
            Utility.zlogD(TAG, "Cannot modify UserAction since there is none pending");
        }
    }

    static void persistEventCmn(CustomSegment customSegment) {
        if (customSegment.session.getPrivacyRules().shouldCollectEvent(customSegment.getEventType())) {
            EventThrottler eventThrottler2 = eventThrottler;
            if (eventThrottler2 == null || !eventThrottler2.acceptEvent(customSegment.eventType.getProtocolId())) {
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, "Dropped event due to throttling");
                }
            } else {
                String string = customSegment.createEventData().toString();
                basicSegment.update(false);
                String ocvbString = getOcvbString(customSegment.session);
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, String.format("Store %dbytes", Integer.valueOf(ocvbString.length() + string.length())));
                }
                DatabaseWriteQueue.getInstance().accept(new DatabaseWriteQueue.DatabaseRecord(ocvbString, string, customSegment.session, customSegment.getEventType().getProtocolId(), customSegment.getStartTime(), customSegment.getServerId(), AdkSettings.appIdEncoded));
            }
        }
    }

    public static void removeFromCalloutTable(CustomSegment customSegment) {
        mCalloutTable.removeActionSendEvent(customSegment);
    }

    public static void reportUserTag(final Session session) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportUserTag, session: " + session.getUserTag());
        addEvent(session.getUserTag(), 12, 0L, null, session, AdkSettings.getInstance().serverId, new String[0]);
        GUARDED_EVENT_DISPATCHER.executeWithVerification(session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.Core$$ExternalSyntheticLambda0
            @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
            public final void execute(RumEventDispatcher rumEventDispatcher) {
                Core.lambda$reportUserTag$0(session, rumEventDispatcher);
            }
        });
    }

    public static synchronized void resetLifecycleData() {
        forceCloseActiveActions("resetLifecycle");
        Utility.resetEventSeqNum();
    }

    static void restoreCookies() {
        if (AdkSettings.getInstance().hybridApp) {
            cookieHandler.restoreCookies();
        }
    }

    public static void saveSegment(CustomSegment customSegment) {
        saveSegment(customSegment, customSegment.getType());
    }

    private static void saveSegment(CustomSegment customSegment, int i2) {
        if (customSegment != null && customSegment.isFinalized() && customSegment.isEnabled()) {
            if (basicSegment != null) {
                persistEventCmn(customSegment);
                if (CustomSegment.firstSendOccurred.get() == 0) {
                    CustomSegment.firstSendOccurred.set(1);
                }
            } else if (Global.DEBUG) {
                Utility.zlogD(TAG, "discarded");
            }
            if (i2 == 2) {
                mCalloutTable.removeActionSendEvent(customSegment);
            }
        }
    }

    static void sendBizEvent(String str, JSONObject jSONObject) {
        long systemTimeNanos = TimeLineProvider.getSystemTimeNanos();
        if (jSONObject == null) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Cannot send biz event whose attributes are 'null'");
            }
        } else if (str == null || str.isEmpty()) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Cannot send biz event whose type is 'null' or empty");
            }
        } else {
            Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            storeBizEvent(str, sessionDetermineActiveSessionForInternalEvent, new EventPayloadGenerator(new CopyAttributeFilter()).generatePayload(new EnrichmentAttributesGenerator().withTimeStamp(systemTimeNanos).withEventMetrics(EventMetricsAggregatorFactory.createEventMetricsAggregator().aggregateEventMetrics(sessionDetermineActiveSessionForInternalEvent, AdkSettings.getInstance().getConfiguration(), AndroidMetrics.getInstance())).generateBizEventAttributes(str, jSONObject), jSONObject, false));
        }
    }

    static void sendEvent(final JSONObject jSONObject, final Object[] objArr) {
        if (jSONObject == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "cannot use 'null' fields for sendEvent");
        } else {
            final Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSessionForInternalEvent, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.Core$$ExternalSyntheticLambda1
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    Core.lambda$sendEvent$1(sessionDetermineActiveSessionForInternalEvent, jSONObject, objArr, rumEventDispatcher);
                }
            });
        }
    }

    static void sendSessionPropertyEvent(final JSONObject jSONObject) {
        if (jSONObject == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "cannot use 'null' properties for sendSessionPropertyEvent");
        } else {
            final Session sessionDetermineActiveSessionForInternalEvent = Session.determineActiveSessionForInternalEvent();
            GUARDED_EVENT_DISPATCHER.executeWithVerification(sessionDetermineActiveSessionForInternalEvent, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.Core$$ExternalSyntheticLambda2
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    Core.lambda$sendSessionPropertyEvent$2(sessionDetermineActiveSessionForInternalEvent, jSONObject, rumEventDispatcher);
                }
            });
        }
    }

    static void setGpsLocation(Location location) {
        MetricsRepository metricsRepositoryProvideMetricsRepository;
        if (Global.DEBUG && location != null) {
            Utility.zlogD(TAG, String.format("SetGpsCoord Lat:%s Lon:%s", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        }
        AndroidMetrics.getInstance().setGpsLocation(location);
        AgentServiceLocator agentServiceLocator = currentLocator;
        if (agentServiceLocator == null || (metricsRepositoryProvideMetricsRepository = agentServiceLocator.provideMetricsRepository()) == null) {
            return;
        }
        metricsRepositoryProvideMetricsRepository.updateLocationMetrics(location);
    }

    static synchronized void shutdown(long j2) {
        Global.isAlive.set(false);
        SessionParameterStore sessionParameterStore2 = sessionParameterStore;
        if (sessionParameterStore2 != null) {
            sessionParameterStore2.flush();
        }
        Application application = (Application) AdkSettings.getInstance().getContext();
        APPLICATION_STATE_MONITOR.stopMonitoring(application);
        APPLICATION_START_MONITOR.onAgentShutdown(application);
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge2 = oneAgentLifecycleManagerBridge;
        if (oneAgentLifecycleManagerBridge2 != null) {
            oneAgentLifecycleManagerBridge2.onAgentShutdown();
        }
        AgentServiceLocator agentServiceLocator = currentLocator;
        if (agentServiceLocator != null) {
            agentServiceLocator.shutdown();
        }
        ACTIVITY_LIFECYCLE_MONITOR.stopMonitoring(application);
        ACTIVE_ACTIVITY_MONITOR.stopMonitoring(application);
        WINDOW_CALLBACK_MONITOR.stopMonitoring(application);
        rageTapDetector = null;
        DatabaseWriteQueue.getInstance().stopThread();
        communicationManager.shutdown(j2);
        currentLocator = null;
        GUARDED_EVENT_DISPATCHER.resetEventDispatcher();
        oneAgentStartup = null;
        communicationManagerBridge = null;
        oneAgentLifecycleManagerBridge = null;
        oneAgentFacade = null;
    }

    public static void startNewSession(Session session, boolean z2) {
        RageTapDetector rageTapDetector2;
        if (z2) {
            resetLifecycleData();
        }
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        int serverId = serverConfiguration.getServerId();
        AdkSettings.getInstance().serverId = serverId;
        CommunicationManagerBridge communicationManagerBridge2 = communicationManagerBridge;
        if (communicationManagerBridge2 != null) {
            communicationManagerBridge2.updateServerId(serverId);
        }
        basicSegment.update(true);
        if (AdkSettings.getInstance().hybridApp) {
            if (!z2) {
                cookieHandler.onAgentStart();
            }
            cookieHandler.onSessionStart(session, AdkSettings.appIdEncoded);
        }
        if (AdkSettings.getInstance().getConfiguration().isRageTapDetectionEnabled && (rageTapDetector2 = rageTapDetector) != null) {
            rageTapDetector2.onNewSession(session);
        }
        if (session.getPrivacyRules().shouldCollectEvent(EventType.ACTION_AUTO_LOADING_APP)) {
            DTXAutoAction dTXAutoAction = new DTXAutoAction(Global.LOADING + AdkSettings.applName, session, serverId, true);
            dTXAutoAction.updateEndTime();
            dTXAutoAction.endActionSequenceNum = Utility.getEventSeqNum();
            dTXAutoAction.eventType = EventType.ACTION_AUTO_LOADING_APP;
            saveSegment(dTXAutoAction);
        }
        communicationManager.startNewSession(session);
        flushEvents();
        AgentStateListener agentStateListener = adk.getAgentStateListener();
        if (agentStateListener != null) {
            agentStateListener.onNewSessionStarted(serverConfiguration, session, serverId, new SrBeaconParamListener());
        }
        HashMap map = new HashMap();
        map.put(ConfigurationPublisher.ConfigChange.IS_3RDGEN_ENABLED, Boolean.valueOf(session.isGrailEventsShouldBeCaptured()));
        CONFIGURATION_PUBLISHER.notify(map);
    }

    public static void startNewSession(boolean z2, PrivacyRules privacyRules) {
        startNewSession(z2, privacyRules, TimeLineProvider.getSystemTime());
    }

    public static void startNewSession(boolean z2, PrivacyRules privacyRules, long j2) {
        long jGenerateVisitorId;
        boolean z3;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "new session with " + privacyRules.getPrivacySettings().toString());
        }
        if (privacyRules.keepVisitorId()) {
            int sessionId = sessionParameterStore.getSessionId() + 1;
            jGenerateVisitorId = sessionParameterStore.getVisitorId();
            if (jGenerateVisitorId == 0) {
                jGenerateVisitorId = SessionParameterUtil.generateVisitorId();
                z3 = true;
            } else {
                z3 = false;
            }
            Session sessionCurrentSession = Session.currentSession();
            i = (sessionCurrentSession == null || sessionCurrentSession.visitorId == jGenerateVisitorId) ? 0 : 1;
            if (z3 || (z2 && i != 0)) {
                AdkSettings.getInstance().setNewVisitorSent(false);
            }
            sessionParameterStore.update(sessionId, jGenerateVisitorId);
            i = sessionId;
        } else {
            jGenerateVisitorId = SessionParameterUtil.generateVisitorId();
            sessionParameterStore.update(0, 0L);
            AdkSettings.getInstance().setNewVisitorSent(true);
            setGpsLocation(null);
        }
        Session sessionStartNewSession = z2 ? Session.startNewSession(privacyRules, j2) : Session.startNewSessionIfNeeded(privacyRules);
        sessionStartNewSession.visitorId = jGenerateVisitorId;
        sessionStartNewSession.sessionId = i;
        if (!z2) {
            sessionStartNewSession.internalSetPrivacyRules(privacyRules);
        }
        startNewSession(sessionStartNewSession, z2);
    }

    static void startup(Application application, Activity activity, Configuration configuration, AgentServiceLocator agentServiceLocator) throws Throwable {
        PrivacyRules privacyRules;
        AgentStateListener agentStateListenerGenerateAgentStateListener;
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge2;
        currentLocator = agentServiceLocator;
        if (configuration.debugLogLevel) {
            Global.DEBUG = true;
        }
        if (Global.DEBUG) {
            String str = TAG;
            Utility.zlogD(str, "startup configuration: " + configuration);
            Utility.zlogI(str, String.format("%s %s Target API %d Android API %d", AdkSettings.getADKName(), Version.getFullVersion(), Integer.valueOf(Utility.getAppTargetSdk(application)), Integer.valueOf(Build.VERSION.SDK_INT)));
            if (activity != null) {
                Utility.zlogD(str, "agent started within activity '" + activity.getClass().getName() + "'");
            }
        }
        SessionParameterStore sessionParameterStore2 = new SessionParameterStore(application);
        sessionParameterStore = sessionParameterStore2;
        sessionParameterStore2.preload();
        DTXAutoAction.setAutoInstrProperties(configuration);
        adk.setup(configuration, application);
        ServerConfiguration serverConfiguration = adk.preferencesManager.getServerConfiguration(new InitialServerIdProvider().getDefaultServerId(configuration), configuration.startupWithGrailEnabled);
        if (serverConfiguration.isGen3Enabled()) {
            currentLocator.init(CONFIGURATION_PUBLISHER);
            GUARDED_EVENT_DISPATCHER.initEventDispatcher(agentServiceLocator.provideRumEventDispatcher());
            oneAgentStartup = agentServiceLocator.provideOneAgentStartup();
            communicationManagerBridge = agentServiceLocator.provideCommunicationManagerBridge();
            oneAgentLifecycleManagerBridge = agentServiceLocator.provideOneAgentLifecycleManagerBridge();
            if (ConfigurationFactory.isUserInteractionEnabled()) {
                oneAgentUserInteractionManagerBridge = agentServiceLocator.provideOneAgentUserInteractionManagerBridge();
            }
            oneAgentFacade = agentServiceLocator.provideOneAgentFacade();
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "RUM powered by Grail deactivated");
        }
        eventThrottler = new EventThrottler(new TimeProviderFactory().createTimelineProvider(), configuration.eventThrottlingLimit, new EventThrottler.SummaryReceiver() { // from class: com.dynatrace.android.agent.Core.1
            AnonymousClass1() {
            }

            @Override // com.dynatrace.agent.events.EventThrottler.SummaryReceiver
            public void onDroppedEventSummary(String str2) {
                SelfMonitoring.reportLogEvent("EventThrottling", str2);
            }

            @Override // com.dynatrace.agent.events.EventThrottler.SummaryReceiver
            public void onInvalidEventSummary(String str2) {
                SelfMonitoring.reportLogEvent("EventThrottlingInvalidEventType", str2);
            }
        });
        applyServerConfiguration(serverConfiguration);
        if (configuration.userOptIn) {
            privacyRules = new PrivacyRules(adk.preferencesManager.readPrivacySettings());
        } else {
            adk.preferencesManager.removePrivacySettings();
            privacyRules = PrivacyRules.PRIVACY_MODE_DEACTIVATED;
        }
        AdkSettings.appIdEncoded = configuration.appIdEncoded;
        AndroidMetrics.getInstance();
        if (isFirstStartup.get()) {
            Session.startNewSessionIfNeeded(privacyRules, serverConfiguration.isGen3Enabled());
        } else {
            Utility.resetEventSeqNum();
            Session.startNewSession(privacyRules, serverConfiguration.isGen3Enabled());
        }
        HashMap map = new HashMap();
        map.put(ConfigurationPublisher.ConfigChange.IS_3RDGEN_ENABLED, Boolean.valueOf(serverConfiguration.isGen3Enabled()));
        CONFIGURATION_PUBLISHER.notify(map);
        DataAccessObject dataAccessObject = new DataAccessObject(application);
        dao = dataAccessObject;
        dataAccessObject.deleteEventsWithMismatchAppId(configuration.appIdEncoded);
        boolean z2 = configuration.sessionReplayComponentProvider != null;
        if (z2) {
            agentStateListenerGenerateAgentStateListener = configuration.sessionReplayComponentProvider.generateAgentStateListener();
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "set new agent state listener: " + agentStateListenerGenerateAgentStateListener);
            }
            adk.setAgentStateListener(agentStateListenerGenerateAgentStateListener);
        } else {
            agentStateListenerGenerateAgentStateListener = null;
        }
        basicSegment = new BasicSegment(configuration.instrumentationFlavor);
        DatabaseWriteQueue.getInstance().start();
        mCalloutTable.changeSendEventTimeout(mSendEventTimeoutTicks);
        communicationManager.startup(dao, configuration, agentStateListenerGenerateAgentStateListener, communicationManagerBridge);
        if (configuration.crashReporting) {
            CrashCatcher.installUncaughtExceptionHandler();
            CrashCatcher.registerUncaughtExceptionListener(getCrashListener());
        }
        if (agentStateListenerGenerateAgentStateListener != null) {
            agentStateListenerGenerateAgentStateListener.onAgentStarted(application, configuration, adk.getServerConfiguration(), privacyRules);
        }
        if (configuration.activityMonitoring) {
            ACTIVITY_LIFECYCLE_MONITOR.startMonitoring(application, TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        }
        ACTIVE_ACTIVITY_MONITOR.startMonitoring(application);
        if (configuration.applicationMonitoring) {
            APPLICATION_START_MONITOR.onAgentStart(application, TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        }
        APPLICATION_STATE_MONITOR.startMonitoring(application);
        if (serverConfiguration.isGen3Enabled() && (oneAgentLifecycleManagerBridge2 = oneAgentLifecycleManagerBridge) != null) {
            oneAgentLifecycleManagerBridge2.onAppStart();
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(configuration.sessionReplayComponentProvider.generateWindowListenerFactory());
        }
        if (serverConfiguration.isGen3Enabled() && oneAgentUserInteractionManagerBridge != null) {
            arrayList.add(new AnonymousClass2());
        }
        if (configuration.isRageTapDetectionEnabled) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new RageTapObserver());
            if (z2) {
                arrayList2.add(configuration.sessionReplayComponentProvider.generateRageTapListener());
            }
            rageTapDetector = new RageTapDetector(arrayList2, Executors.newScheduledThreadPool(1), TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
            arrayList.add(new TapMonitorFactory(rageTapDetector, TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER));
        }
        WINDOW_CALLBACK_MONITOR.startMonitoring(application, activity, arrayList);
        if (configuration.hybridApp) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (configuration.monitoredDomains != null) {
                Collections.addAll(hashSet, configuration.monitoredDomains);
            }
            if (configuration.monitoredHttpsDomains != null) {
                Collections.addAll(hashSet2, configuration.monitoredHttpsDomains);
            }
            if (configuration.mode == AgentMode.APP_MON) {
                if (configuration.getServerUrl().startsWith("https://")) {
                    hashSet2.add(configuration.getServerUrl());
                } else {
                    hashSet.add(configuration.getServerUrl());
                }
            }
            if (configuration.fileDomainCookies) {
                hashSet.add("file://");
            }
            cookieHandler = new CookieHandler(hashSet, hashSet2, configuration.fileDomainCookies, configuration.mode);
        }
        startNewSession(false, privacyRules);
        OneAgentStartup oneAgentStartup2 = oneAgentStartup;
        if (oneAgentStartup2 != null) {
            oneAgentStartup2.start(serverConfiguration);
        }
        communicationManager.startTimerLoop(true);
        Global.isAlive.set(true);
        isFirstStartup.set(false);
    }

    static void storeBizEvent(String str, Session session, String str2) {
        if (str2 == null) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Event \"" + str + "\" has been discarded");
            }
        } else {
            BizEventSegment bizEventSegmentBuild = new BizEventSegment.Builder().withSession(session).withServerId(adk.serverId).withEventName(str).withUrlEncodedJsonPayload(EventPayloadUtility.replacePlaceholderWithMacro(Utility.urlEncode(str2))).withForwardToGrail(true).build();
            getCalloutTable().addOtherEvent();
            saveSegment(bizEventSegmentBuild);
        }
    }
}
