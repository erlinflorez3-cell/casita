package com.dynatrace.android.agent;

import android.content.Context;
import android.os.Looper;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.android.agent.BasicSegment;
import com.dynatrace.android.agent.comm.CommHandler;
import com.dynatrace.android.agent.comm.CommunicationProblemListener;
import com.dynatrace.android.agent.comm.CommunicationProblemListenerTask;
import com.dynatrace.android.agent.comm.HttpResponse;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.comm.RequestExecutor;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.db.MonitoringDataEntity;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class CommunicationManager {
    private static final int COMM_MAX_RETRIES = 3;
    private static final String TAG = Global.LOG_PREFIX + "CommunicationManager";
    private CalloutTable calloutTable;
    private CommunicationProblemListener communicationProblemListener;
    private ConnectionAttemptMonitor connAttemptMonitor;
    protected DataAccessObject dao;
    private ThreadPoolExecutor executor;
    private Thread mtEventSender;
    private Timer mtTimer;
    RequestExecutor requestExecutor;
    BasicSegment.UpdatableDataGenerator updatableDataGenerator = new BasicSegment.UpdatableDataGenerator();
    TimeLineProvider timeLineProvider = TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER;
    private final Object serverConfigLock = new Object();
    private final Object sessionConfigLock = new Object();
    private AgentState state = new AgentState.Enabled(false);
    private AtomicBoolean mForceUemUpdate = new AtomicBoolean(false);
    private AtomicBoolean mForceSendEvent = new AtomicBoolean(false);
    private AtomicBoolean mUemActive = new AtomicBoolean(false);
    private boolean mEventSenderActive = false;
    private long uemLastUpdate = 0;
    private AgentStateListener agentStateListener = null;
    private CommunicationManagerBridge communicationManagerBridge = null;
    private boolean gen3Enabled = false;
    private volatile boolean waitingForInitialBPv4Config = true;
    private WriteLock writeLock = new WriteLock(this, null);

    /* JADX INFO: renamed from: com.dynatrace.android.agent.CommunicationManager$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState;

        static {
            int[] iArr = new int[SendState.values().length];
            $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState = iArr;
            try {
                iArr[SendState.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[SendState.MORE_DATA_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[SendState.DATA_NOT_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[SendState.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class DataSendTimerTask extends TimerTask {
        DataSendTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (CommunicationManager.this.connAttemptMonitor == null) {
                if (Global.DEBUG) {
                    Utility.zlogD(CommunicationManager.TAG, "invalid DataSendTimerTask appeared");
                }
                CommunicationManager.this.stopTimerLoop();
                return;
            }
            if (!CommunicationManager.this.connAttemptMonitor.moreAttemptsAllowed() && !CommunicationManager.this.mUemActive.get()) {
                CommunicationManager.this.stopTimerLoop();
                Core.shutdown(99L);
                CommunicationManager.this.connAttemptMonitor = null;
                return;
            }
            long jNow = CommunicationManager.this.timeLineProvider.now() - CommunicationManager.this.uemLastUpdate;
            if (CommunicationManager.this.connAttemptMonitor.reconnAttemptInProgress()) {
                CommunicationManager.this.mForceUemUpdate.set(CommunicationManager.this.connAttemptMonitor.isTimeToConnect());
                if (!CommunicationManager.this.mForceUemUpdate.get()) {
                    if (Global.DEBUG) {
                        Utility.zlogD(CommunicationManager.TAG, String.format("ReconnWait: mUemActive=%b lastCheck=%ds ago", Boolean.valueOf(CommunicationManager.this.mUemActive.get()), Long.valueOf(jNow / 1000)));
                        return;
                    }
                    return;
                }
            }
            if (jNow >= 7200000 && !CommunicationManager.this.gen3Enabled) {
                CommunicationManager.this.mForceUemUpdate.set(true);
            }
            if (!CommunicationManager.this.mForceUemUpdate.get()) {
                if (CommunicationManager.this.waitingForInitialBPv4Config) {
                    Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "taskTimer: keep waiting for the GET request executed via BPv4");
                } else {
                    CommunicationManager.this.mForceUemUpdate.set(CommunicationManager.this.connAttemptMonitor.isTimeToConnect() && Session.currentSession().isActive());
                }
            }
            if (Global.DEBUG) {
                Utility.zlogD(CommunicationManager.TAG, String.format("TaskTimer mForceUemUpdate=%b mUemActive=%b waitingForInitialBPv4Config=%b", Boolean.valueOf(CommunicationManager.this.mForceUemUpdate.get()), Boolean.valueOf(CommunicationManager.this.mUemActive.get()), Boolean.valueOf(CommunicationManager.this.waitingForInitialBPv4Config)));
            }
            if (CommunicationManager.this.mUemActive.get() || CommunicationManager.this.mForceUemUpdate.get()) {
                if (!CommunicationManager.this.waitingForInitialBPv4Config) {
                    if (CommunicationManager.this.calloutTable.isItTimeToSend()) {
                        CommunicationManager.this.mForceSendEvent.set(true);
                    }
                    if (CustomSegment.firstSendOccurred.get() == 1) {
                        CommunicationManager.this.mForceSendEvent.set(true);
                        CustomSegment.firstSendOccurred.set(2);
                    }
                }
                if (Global.DEBUG) {
                    Utility.zlogD(CommunicationManager.TAG, String.format("TaskTimer mForceSendEvent=%s thread ID=%d", Boolean.valueOf(CommunicationManager.this.mForceSendEvent.get()), Long.valueOf(Utility.getThreadId(CommunicationManager.this.mtEventSender))));
                }
                if (CommunicationManager.this.mForceSendEvent.get() || CommunicationManager.this.mForceUemUpdate.get()) {
                    synchronized (CommunicationManager.this.mtEventSender) {
                        CommunicationManager.this.mtEventSender.notify();
                    }
                    CommunicationManager communicationManager = CommunicationManager.this;
                    communicationManager.uemLastUpdate = communicationManager.timeLineProvider.now();
                }
            }
        }
    }

    private class EventSenderThread extends Thread {
        private EventSenderThread() {
            super(Global.LOG_PREFIX + "EventSenderThread");
        }

        /* synthetic */ EventSenderThread(CommunicationManager communicationManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z2;
            CommunicationManager.this.mEventSenderActive = true;
            do {
                try {
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    if (Global.DEBUG) {
                        Utility.zlogD(CommunicationManager.TAG, e2.getMessage(), e2);
                        return;
                    }
                    return;
                }
                synchronized (this) {
                    if (!CommunicationManager.this.mEventSenderActive) {
                        return;
                    }
                    wait();
                    z2 = CommunicationManager.this.mEventSenderActive;
                    CommunicationManager.this.doSenderTask(AndroidMetrics.getInstance().isNetworkAvailable());
                    return;
                }
            } while (z2);
        }
    }

    private class PostCrashReportThread extends Thread {
        private final boolean isRootEvent;
        private final MonitoringDataPacket monitoringData;
        private final ServerConfiguration serverConfig;
        private final int serverId;
        private final int sessionId;
        private boolean successfully;
        private final long visitorId;

        private PostCrashReportThread(ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i2, boolean z2, long j2, int i3) {
            this.successfully = false;
            setName("POST CrashReport");
            this.serverConfig = serverConfiguration;
            this.monitoringData = monitoringDataPacket;
            this.serverId = i2;
            this.isRootEvent = z2;
            this.visitorId = j2;
            this.sessionId = i3;
        }

        /* synthetic */ PostCrashReportThread(CommunicationManager communicationManager, ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i2, boolean z2, long j2, int i3, AnonymousClass1 anonymousClass1) {
            this(serverConfiguration, monitoringDataPacket, i2, z2, j2, i3);
        }

        public boolean hasBeenSuccessfully() {
            return this.successfully;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.successfully = CommunicationManager.this.handleSendEvents(this.serverConfig, this.monitoringData, this.serverId, this.isRootEvent, this.visitorId, this.sessionId, false);
        }
    }

    enum SendState {
        NO_DATA,
        DATA_NOT_SENT,
        MORE_DATA_AVAILABLE,
        FINISHED
    }

    protected class WriteLock {
        private File lockFile;

        private WriteLock() {
        }

        /* synthetic */ WriteLock(CommunicationManager communicationManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean available() throws Throwable {
            boolean z2 = false;
            try {
                StringBuilder sb = new StringBuilder();
                Context context = AdkSettings.getInstance().getContext();
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Qd("]i^kg`Z#Wb`eU]b\u001b/ZX]M_Z", (short) (ZN.Xd() ^ 28998))).getMethod(C1593ug.zd("=<L\u001c;>DB\"HR", (short) (OY.Xd() ^ 24909), (short) (OY.Xd() ^ 22879)), new Class[0]);
                try {
                    method.setAccessible(true);
                    File file = new File(sb.append((File) method.invoke(context, objArr)).append(File.separator).append(C1561oA.od("1KAK;\u0003@B5<", (short) (FB.Xd() ^ 1161))).toString());
                    boolean zExists = file.exists();
                    if (!zExists || CommunicationManager.this.timeLineProvider.now() - file.lastModified() <= StatsigLoggerKt.FLUSH_TIMER_MS) {
                        z2 = zExists;
                    } else {
                        file.delete();
                        if (Global.DEBUG) {
                            Utility.zlogD(CommunicationManager.TAG, C1561oA.Kd("Cmqcf\"wepouo)\u0002}u\u0002s/|\u0001u~", (short) (OY.Xd() ^ 14388)));
                        }
                    }
                    if (!z2) {
                        try {
                        } catch (IOException e2) {
                            if (Global.DEBUG) {
                                Utility.zlogE(CommunicationManager.TAG, e2.toString());
                            }
                        }
                        if (file.createNewFile()) {
                            file.deleteOnExit();
                            this.lockFile = file;
                        } else {
                            z2 = true;
                        }
                    }
                    return !z2;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                if (Global.DEBUG) {
                    Utility.zlogE(CommunicationManager.TAG, e4.toString());
                }
                return false;
            }
        }

        void release() {
            File file = this.lockFile;
            if (file != null) {
                file.delete();
                this.lockFile = null;
            }
        }
    }

    CommunicationManager(CalloutTable calloutTable) {
        this.calloutTable = calloutTable;
    }

    public void doSenderTask(boolean z2) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("EventSender active ... mForceSendEvent=%b mForceUemUpdate=%b", Boolean.valueOf(this.mForceSendEvent.get()), Boolean.valueOf(this.mForceUemUpdate.get())));
        }
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        if (!z2) {
            this.dao.deleteOldEvents(this.timeLineProvider.now(), serverConfiguration.isCachingCrashes());
            return;
        }
        Session sessionCurrentSession = Session.currentSession();
        if (!sessionCurrentSession.isConfigurationApplied() || !this.mForceSendEvent.compareAndSet(true, false)) {
            if (this.mForceUemUpdate.get()) {
                forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
                return;
            } else {
                if (sessionCurrentSession.isConfigurationApplied() || !this.mForceSendEvent.get()) {
                    return;
                }
                forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
                return;
            }
        }
        int i2 = AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[sendMonitoringData(serverConfiguration, sessionCurrentSession.visitorId).ordinal()];
        if (i2 == 1) {
            handleFlagUemUpdate(serverConfiguration);
            return;
        }
        if (i2 == 2) {
            this.mForceSendEvent.set(true);
            handleFlagUemUpdate(serverConfiguration);
        } else if (i2 == 3) {
            this.mForceSendEvent.set(true);
        } else if (i2 == 4 && this.mForceUemUpdate.get()) {
            forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
        }
    }

    private void forceUemStateUpdate(ServerConfiguration serverConfiguration, Session session) {
        this.dao.deleteOldEvents(this.timeLineProvider.now(), serverConfiguration.isCachingCrashes());
        boolean zIsConfigurationApplied = true;
        try {
            handleConfigReceivedFromConfigRequest(session, this.requestExecutor.sendBeacon(serverConfiguration, !session.isConfigurationApplied(), AdkSettings.getInstance().serverId, session));
            zIsConfigurationApplied = Session.currentSession().isConfigurationApplied();
        } catch (Exception e2) {
            if (Global.DEBUG) {
                logRequestError("beacon request failed", e2);
            }
            handleRequestError(e2);
        }
        if (zIsConfigurationApplied) {
            this.mForceUemUpdate.set(false);
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("UEM state update: UEM state: %b mForceUemUpdate: %b", Boolean.valueOf(this.mUemActive.get()), Boolean.valueOf(this.mForceUemUpdate.get())));
        }
    }

    private void handleConfigReceived(Session session, ServerConfiguration serverConfiguration, boolean z2) {
        CommunicationManagerBridge communicationManagerBridge;
        synchronized (this.serverConfigLock) {
            ServerConfiguration serverConfiguration2 = AdkSettings.getInstance().getServerConfiguration();
            if (serverConfiguration.getTimestamp() < serverConfiguration2.getTimestamp()) {
                Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "discard too old configuration");
                return;
            }
            boolean z3 = true;
            this.mUemActive.set(serverConfiguration.isCaptureOn() && (this.state instanceof AgentState.Enabled));
            if (serverConfiguration.getStatus() != ServerConfiguration.Status.ERROR) {
                AdkSettings.getInstance().preferencesManager.setServerConfiguration(serverConfiguration);
            } else if (Global.DEBUG) {
                Utility.zlogD(TAG, "Received faulty settings that will turn the agent off");
            }
            Core.applyServerConfiguration(serverConfiguration);
            boolean z4 = serverConfiguration.getTimestamp() > serverConfiguration2.getTimestamp();
            if (z2 && (communicationManagerBridge = this.communicationManagerBridge) != null) {
                communicationManagerBridge.updateConfigurationInOneAgent(serverConfiguration);
            }
            AgentStateListener agentStateListener = this.agentStateListener;
            if (agentStateListener != null) {
                if (z4) {
                    agentStateListener.onServerConfigurationChanged(serverConfiguration);
                }
                if (serverConfiguration.isSwitchServer()) {
                    this.agentStateListener.onServerIdForceChanged(serverConfiguration.getServerId());
                }
            }
            if (session == null || session.isConfigurationApplied()) {
                return;
            }
            synchronized (this.sessionConfigLock) {
                if (session.isConfigurationApplied()) {
                    z3 = false;
                } else {
                    session.handleTrafficLimitation(serverConfiguration);
                }
            }
            if (z3) {
                if (this.agentStateListener != null) {
                    this.agentStateListener.onSessionStatusChanged(session, serverConfiguration, new SrBeaconParamListener());
                }
                if (session.isActive()) {
                    updateSessionPropertiesForEvents(session);
                } else {
                    this.dao.deleteEventsFromVisit(session.visitorId, session.sessionId);
                }
                Core.handleTrafficLimitationForCookies(session);
            }
        }
    }

    private void handleConfigReceivedFromConfigRequest(Session session, ServerConfiguration serverConfiguration) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        handleConfigReceived(session, serverConfiguration, true);
        if (this.mtTimer == null || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            return;
        }
        connectionAttemptMonitor.notifyConnectionState(true, false);
    }

    private void handleConfigReceivedFromDataRequest(ServerConfiguration serverConfiguration) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        handleConfigReceived(null, serverConfiguration, true);
        if (this.mtTimer == null || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            return;
        }
        connectionAttemptMonitor.notifyConnectionState(true, false);
    }

    private void handleFlagUemUpdate(ServerConfiguration serverConfiguration) {
        Session sessionCurrentSession = Session.currentSession();
        if (sessionCurrentSession.isConfigurationApplied()) {
            this.mForceUemUpdate.set(false);
        } else if (this.mForceUemUpdate.get()) {
            forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
        }
    }

    private void handleRequestError(Exception exc) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        List<String> list;
        boolean z2 = exc instanceof InvalidResponseException;
        if (z2) {
            HttpResponse response = ((InvalidResponseException) exc).getResponse();
            if (response.responseCode == 429 && (list = response.headers.get("Retry-After")) != null && !list.isEmpty()) {
                try {
                    int i2 = Integer.parseInt(list.get(0));
                    this.mUemActive.set(false);
                    DatabaseWriteQueue.getInstance().flushQueue();
                    Core.dao.deleteAllEvents();
                    ConnectionAttemptMonitor connectionAttemptMonitor2 = this.connAttemptMonitor;
                    if (connectionAttemptMonitor2 != null) {
                        connectionAttemptMonitor2.notifyStateTooManyRequests(i2);
                        return;
                    }
                } catch (NumberFormatException e2) {
                    if (Global.DEBUG) {
                        Utility.zlogE(TAG, "can't parse Retry-After header", e2);
                    }
                }
            }
        }
        if (this.communicationProblemListener == null) {
            handleRequestError(false);
            return;
        }
        if (z2) {
            this.mUemActive.set(false);
            if (this.mtTimer != null && (connectionAttemptMonitor = this.connAttemptMonitor) != null) {
                connectionAttemptMonitor.stop();
            }
        } else {
            handleRequestError(true);
        }
        if (this.executor.isShutdown()) {
            return;
        }
        this.executor.execute(new CommunicationProblemListenerTask(this.communicationProblemListener, exc));
    }

    private void handleRequestError(boolean z2) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        this.mUemActive.set(false);
        if (this.mtTimer == null || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            return;
        }
        connectionAttemptMonitor.notifyConnectionState(false, z2);
    }

    public boolean handleSendEvents(ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i2, boolean z2, long j2, int i3, boolean z3) {
        boolean zAddNewVisitorInfoToDataChunk;
        try {
            if (AdkSettings.getInstance().newVisitorSent.get() || AdkSettings.getInstance().newVisitorSentPending.get() || !z2) {
                zAddNewVisitorInfoToDataChunk = false;
            } else {
                zAddNewVisitorInfoToDataChunk = BasicSegment.addNewVisitorInfoToDataChunk(monitoringDataPacket);
                if (zAddNewVisitorInfoToDataChunk) {
                    try {
                        AdkSettings.getInstance().newVisitorSentPending.set(true);
                    } catch (Exception e2) {
                        e = e2;
                        if (zAddNewVisitorInfoToDataChunk) {
                            AdkSettings.getInstance().newVisitorSentPending.set(false);
                        }
                        if (Global.DEBUG) {
                            logRequestError("data request failed", e);
                        }
                        handleRequestError(e);
                        return false;
                    }
                }
            }
            ServerConfiguration serverConfigurationSendData = this.requestExecutor.sendData(serverConfiguration, monitoringDataPacket.generatePayload(), i2, j2, i3, z3);
            if (zAddNewVisitorInfoToDataChunk) {
                AdkSettings.getInstance().setNewVisitorSent(true);
                AdkSettings.getInstance().newVisitorSentPending.set(false);
            }
            handleConfigReceivedFromDataRequest(serverConfigurationSendData);
            return true;
        } catch (Exception e3) {
            e = e3;
            zAddNewVisitorInfoToDataChunk = false;
        }
    }

    private void logRequestError(String str, Exception exc) {
        if (!(exc instanceof UnknownHostException)) {
            Utility.zlogD(TAG, str, exc);
            return;
        }
        String str2 = TAG;
        Utility.zlogD(str2, str);
        Utility.zlogD(str2, exc.toString());
    }

    private void updateSessionPropertiesForEvents(Session session) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "updateSessionPropertiesForEvents");
        }
        DatabaseWriteQueue.getInstance().flushQueue();
        this.dao.updateSessionProperties(session);
    }

    protected void flushEvents() {
        if (this.waitingForInitialBPv4Config) {
            Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "cannot flush events while still waiting for BPv4 configuration");
            return;
        }
        synchronized (this.mtEventSender) {
            this.mForceSendEvent.set(true);
            this.mtEventSender.notify();
        }
    }

    public void handleAgentStateReceivedFromOneAgent(AgentState agentState) {
        this.state = agentState;
        this.mUemActive.set((agentState instanceof AgentState.Enabled) && AdkSettings.getInstance().getServerConfiguration().isCaptureOn());
        Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "applied AgentState: " + agentState + " mUemActive: " + this.mUemActive.get());
    }

    public void handleConfigReceivedFromOneAgent(ServerConfiguration serverConfiguration) {
        handleConfigReceived(Session.currentSession(), serverConfiguration, false);
        if (this.waitingForInitialBPv4Config && this.mtTimer != null && this.connAttemptMonitor != null) {
            Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "config received from OneAgent, notify connection state: connected == true, restartTimer == false");
            this.connAttemptMonitor.notifyConnectionState(true, false);
        }
        this.waitingForInitialBPv4Config = false;
    }

    boolean isUemActive() {
        return this.mUemActive.get();
    }

    void scheduleNewBeaconRequest() {
        synchronized (this.mtEventSender) {
            this.mForceUemUpdate.set(true);
            this.mtEventSender.notify();
        }
    }

    boolean sendCrashData(CustomSegment customSegment, int i2, Session session, int i3) throws Throwable {
        ArrayList arrayList = new ArrayList();
        arrayList.add(customSegment.createEventData().toString());
        MonitoringDataPacket monitoringDataPacket = new MonitoringDataPacket(Core.getOcvbString(customSegment.session) + this.updatableDataGenerator.generateUpdatableData(session.sessionStartTime, i3, session.srBasicParam), arrayList);
        Thread threadCurrentThread = Thread.currentThread();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("dF\u0016\u0015o:n\n(>U%&vq7\"", (short) (Od.Xd() ^ (-3208)), (short) (Od.Xd() ^ (-13489)))).getDeclaredMethod(C1561oA.Xd("}|\rf{\u0005\u000bi\u000e\u000f\u0011\u0007\u0015", (short) (C1633zX.Xd() ^ (-18569))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            boolean z2 = threadCurrentThread == ((Looper) declaredMethod.invoke(null, objArr)).getThread();
            boolean z3 = customSegment.getParentTagId() == 0;
            ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
            if (!z2) {
                return handleSendEvents(serverConfiguration, monitoringDataPacket, i2, z3, session.visitorId, session.sessionId, false);
            }
            PostCrashReportThread postCrashReportThread = new PostCrashReportThread(this, serverConfiguration, monitoringDataPacket, i2, z3, session.visitorId, session.sessionId, null);
            postCrashReportThread.start();
            try {
                postCrashReportThread.join(5000L);
            } catch (InterruptedException e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, Wg.vd("YiYlb\u001bnbnnrukqk%zoznko,}\u0001~r}w\u0001", (short) (Od.Xd() ^ (-32502))), e2);
                }
            }
            return postCrashReportThread.hasBeenSuccessfully();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    SendState sendMonitoringData(ServerConfiguration serverConfiguration, long j2) {
        SendState sendState;
        String str;
        StringBuilder sb;
        if (!this.writeLock.available()) {
            return SendState.NO_DATA;
        }
        try {
            long jNow = this.timeLineProvider.now();
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "sendMonitoringData begin @" + jNow);
            }
            DatabaseWriteQueue.getInstance().flushQueue();
            this.dao.deleteOldEvents(jNow, serverConfiguration.isCachingCrashes());
            if (serverConfiguration.isCachingCrashes()) {
                this.dao.deleteOldCrashes(serverConfiguration.getMaxCachedCrashesCount());
            }
            MonitoringDataEntity monitoringDataEntityFetchEvents = this.dao.fetchEvents(serverConfiguration.maxSendLength(), this.updatableDataGenerator, jNow);
            if (monitoringDataEntityFetchEvents == null) {
                sendState = SendState.NO_DATA;
                if (Global.DEBUG) {
                    str = TAG;
                    sb = new StringBuilder("sendMonitoringData end @");
                    Utility.zlogD(str, sb.append(this.timeLineProvider.now()).toString());
                }
            } else {
                boolean z2 = true;
                boolean z3 = !monitoringDataEntityFetchEvents.finished;
                if (monitoringDataEntityFetchEvents.visitorId != j2) {
                    z2 = false;
                }
                if (handleSendEvents(serverConfiguration, monitoringDataEntityFetchEvents.monitoringData, monitoringDataEntityFetchEvents.serverId, z2, monitoringDataEntityFetchEvents.visitorId, monitoringDataEntityFetchEvents.sessionId, z3)) {
                    this.dao.deleteSentEvents(monitoringDataEntityFetchEvents);
                    sendState = monitoringDataEntityFetchEvents.finished ? SendState.FINISHED : SendState.MORE_DATA_AVAILABLE;
                    if (Global.DEBUG) {
                        str = TAG;
                        sb = new StringBuilder("sendMonitoringData end @");
                        Utility.zlogD(str, sb.append(this.timeLineProvider.now()).toString());
                    }
                } else {
                    sendState = SendState.DATA_NOT_SENT;
                    if (Global.DEBUG) {
                        str = TAG;
                        sb = new StringBuilder("sendMonitoringData end @");
                        Utility.zlogD(str, sb.append(this.timeLineProvider.now()).toString());
                    }
                }
            }
            this.writeLock.release();
            return sendState;
        } catch (Throwable th) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "sendMonitoringData end @" + this.timeLineProvider.now());
            }
            this.writeLock.release();
            throw th;
        }
    }

    protected void shutdown(long j2) {
        ThreadPoolExecutor threadPoolExecutor = this.executor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
        }
        this.mUemActive.set(false);
        Thread thread = this.mtEventSender;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Shutdown allocated time: %s ms threadId=%s", Long.valueOf(j2), Long.valueOf(Utility.getThreadId(thread))));
        }
        long jNow = this.timeLineProvider.now();
        synchronized (thread) {
            if (this.waitingForInitialBPv4Config) {
                Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "cannot flush events while still waiting for BPv4 configuration");
            } else {
                this.mForceSendEvent.set(true);
            }
            this.mEventSenderActive = false;
            thread.notify();
        }
        if (thread.isAlive()) {
            try {
                thread.join(j2);
            } catch (InterruptedException e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, String.format("Thread to send final events Interrupted, allotted time: %s ms", Long.valueOf(j2)), e2);
                }
            }
            if (thread.isAlive() && Global.DEBUG) {
                Utility.zlogE(TAG, String.format("Thread to send final events didn't complete in allotted time:%s ms", Long.valueOf(j2)));
            }
        }
        this.requestExecutor.resetBeaconRetries();
        this.waitingForInitialBPv4Config = true;
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Shutdown took: %s ms threadID=%s", Long.valueOf(this.timeLineProvider.now() - jNow), Long.valueOf(Utility.getThreadId(thread))));
        }
    }

    void startNewSession(Session session) {
        if (this.waitingForInitialBPv4Config) {
            Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "startNewSession: waiting for the GET request executed via BPv4");
        } else {
            this.mForceUemUpdate.set(session.isActive());
        }
    }

    synchronized void startTimerLoop(boolean z2) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        if (this.mtTimer != null) {
            return;
        }
        if (z2 || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            this.connAttemptMonitor = new ConnectionAttemptMonitor(3);
        } else {
            connectionAttemptMonitor.restartTimer();
        }
        Timer timer = new Timer(TAG);
        this.mtTimer = timer;
        timer.schedule(new DataSendTimerTask(), this.mEventSenderActive ? 0L : 100L, 10000L);
    }

    void startup(DataAccessObject dataAccessObject, Configuration configuration, AgentStateListener agentStateListener, CommunicationManagerBridge communicationManagerBridge) {
        this.communicationManagerBridge = communicationManagerBridge;
        this.dao = dataAccessObject;
        this.agentStateListener = agentStateListener;
        this.communicationProblemListener = configuration.communicationProblemListener;
        boolean zIsGen3Enabled = AdkSettings.getInstance().getServerConfiguration().isGen3Enabled();
        this.gen3Enabled = zIsGen3Enabled;
        if (!zIsGen3Enabled) {
            this.waitingForInitialBPv4Config = false;
        }
        if (this.communicationProblemListener != null) {
            this.executor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        this.requestExecutor = new RequestExecutor(new CommHandler(configuration), configuration, new ServerConfigurationManager(configuration.appIdEncoded));
        Thread thread = this.mtEventSender;
        if (thread != null && thread.isAlive()) {
            try {
                this.mtEventSender.interrupt();
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, "event sender thread problem", e2);
                }
            }
        }
        EventSenderThread eventSenderThread = new EventSenderThread(this, null);
        this.mtEventSender = eventSenderThread;
        eventSenderThread.start();
        this.mUemActive.set(true);
    }

    protected synchronized void stopTimerLoop() {
        Timer timer = this.mtTimer;
        if (timer != null) {
            timer.cancel();
            this.mtTimer.purge();
        }
        this.mtTimer = null;
        this.calloutTable.purge();
        ConnectionAttemptMonitor connectionAttemptMonitor = this.connAttemptMonitor;
        if (connectionAttemptMonitor != null) {
            connectionAttemptMonitor.cancelTimer();
        }
    }
}
