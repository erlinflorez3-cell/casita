package com.dynatrace.android.agent.data;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.RageTapConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.dynatrace.android.agent.util.Utility;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class Session {
    private static final int SELF_MONITORING_SESSION_LIMIT = 20;
    static final int TC_MAX_VALUE = 100;
    private volatile long lastInteractionTime;
    private PrivacyRules privacyRules;
    private final RageTapConfiguration rageTapConfiguration;
    private Random random;
    public int sessionId;
    public final long sessionStartTime;
    public String userTag;
    public long visitorId;
    private static final String TAG = Global.LOG_PREFIX + "Session";
    static RandomFactory randomFactory = new RandomFactory();
    private static volatile Session currentSession = null;
    public int sequenceNumber = 0;
    public int multiplicity = -1;
    public String srBasicParam = null;
    private SessionState state = SessionState.CREATED;
    private boolean isGrailEventsShouldBeCaptured = false;
    private volatile int selfMonitoringCount = 0;

    public Session(long j2, Random random, PrivacyRules privacyRules, RageTapConfiguration rageTapConfiguration) {
        this.sessionStartTime = j2;
        this.lastInteractionTime = j2;
        this.random = random;
        this.privacyRules = privacyRules;
        this.rageTapConfiguration = rageTapConfiguration;
    }

    public static Session currentSession() {
        return currentSession != null ? currentSession : startNewSessionIfNeeded(PrivacyRules.PRIVACY_MODE_DEACTIVATED);
    }

    public static Session determineActiveSession(boolean z2) {
        return determineActiveSession(z2, TimeLineProvider.getSystemTime());
    }

    public static Session determineActiveSession(boolean z2, long j2) {
        Session sessionCurrentSession = currentSession();
        if (!z2) {
            SessionSplitConfiguration sessionSplitConfiguration = AdkSettings.getInstance().getSessionSplitConfiguration();
            if (sessionCurrentSession.lastInteractionTime + sessionSplitConfiguration.getInactivityTimeoutMs() < j2 || sessionCurrentSession.sessionStartTime + sessionSplitConfiguration.getMaxSessionDurationMs() < j2) {
                Core.startNewSession(true, sessionCurrentSession.getPrivacyRules(), j2);
                if (sessionCurrentSession.getUserTag() != null && sessionCurrentSession.getPrivacyRules().shouldCollectEvent(EventType.IDENTIFY_USER)) {
                    currentSession.setUserTag(sessionCurrentSession.userTag);
                    Core.reportUserTag(currentSession);
                }
                sessionCurrentSession = currentSession;
            }
        }
        sessionCurrentSession.lastInteractionTime = j2;
        return sessionCurrentSession;
    }

    public static Session determineActiveSessionForInternalEvent() {
        return currentSession;
    }

    private boolean rollDice(int i2, int i3) {
        return this.random.nextInt(i2) < i3;
    }

    public static Session startNewSession(PrivacyRules privacyRules) {
        return startNewSession(privacyRules, TimeLineProvider.getSystemTime());
    }

    public static Session startNewSession(PrivacyRules privacyRules, long j2) {
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        boolean zIsGrailEventsShouldBeCaptured = currentSession != null ? currentSession.isGrailEventsShouldBeCaptured() : false;
        currentSession = new Session(j2, randomFactory.generateRandom(), privacyRules, serverConfiguration.getRageTapConfiguration());
        currentSession.setGrailEventsShouldBeCaptured(zIsGrailEventsShouldBeCaptured);
        return currentSession;
    }

    public static void startNewSession(PrivacyRules privacyRules, boolean z2) {
        startNewSession(privacyRules, TimeLineProvider.getSystemTime()).setGrailEventsShouldBeCaptured(z2);
    }

    public static Session startNewSessionIfNeeded(PrivacyRules privacyRules) {
        if (currentSession == null) {
            synchronized (Session.class) {
                if (currentSession == null) {
                    return startNewSession(privacyRules);
                }
            }
        }
        return currentSession;
    }

    public static void startNewSessionIfNeeded(PrivacyRules privacyRules, boolean z2) {
        if (currentSession == null) {
            synchronized (Session.class) {
                if (currentSession == null) {
                    startNewSession(privacyRules).setGrailEventsShouldBeCaptured(z2);
                }
            }
        }
    }

    public void addSelfMonitoringEvent() {
        this.selfMonitoringCount++;
    }

    public PrivacyRules getPrivacyRules() {
        return this.privacyRules;
    }

    public RageTapConfiguration getRageTapConfiguration() {
        return this.rageTapConfiguration;
    }

    public long getRunningTime() {
        return TimeLineProvider.getSystemTime() - this.sessionStartTime;
    }

    public long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public String getUserTag() {
        return this.userTag;
    }

    public void handleTrafficLimitation(ServerConfiguration serverConfiguration) {
        if (this.state != SessionState.CREATED) {
            return;
        }
        int multiplicity = serverConfiguration.getMultiplicity();
        boolean zRollDice = multiplicity > 0;
        if (!zRollDice && Global.DEBUG) {
            Utility.zlogD(TAG, "Session disabled by overload prevention (mp=0)");
        }
        if (zRollDice && !(zRollDice = rollDice(100, serverConfiguration.getTrafficControlPercentage())) && Global.DEBUG) {
            Utility.zlogD(TAG, "Session disabled by traffic control: tc=" + serverConfiguration.getTrafficControlPercentage());
        }
        this.state = zRollDice ? SessionState.ENABLED : SessionState.DISABLED;
        this.multiplicity = multiplicity;
    }

    @Deprecated
    public void internalSetPrivacyRules(PrivacyRules privacyRules) {
        this.privacyRules = privacyRules;
    }

    public boolean isActive() {
        return this.state.isActive();
    }

    public boolean isConfigurationApplied() {
        return this.state.isConfigurationApplied();
    }

    public boolean isGrailEventsShouldBeCaptured() {
        return this.isGrailEventsShouldBeCaptured;
    }

    public boolean isSelfMonitoringLimitReached() {
        return this.selfMonitoringCount >= 20;
    }

    public void setGrailEventsShouldBeCaptured(boolean z2) {
        this.isGrailEventsShouldBeCaptured = z2;
    }

    public void setUserTag(String str) {
        this.userTag = str;
    }

    public synchronized void updateLastInteractionTime(long j2) {
        if (j2 > this.lastInteractionTime) {
            this.lastInteractionTime = j2;
        }
    }
}
