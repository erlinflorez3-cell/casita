package com.dynatrace.android.agent;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.crash.CrashListener;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CrashReporter implements CrashListener {
    private static final String LOGTAG = Global.LOG_PREFIX + "CrashReporter";
    public static boolean hasCrashed = false;
    protected CommunicationManager communicationManager;
    private final StacktraceProcessorFactory processorFactory = new StacktraceProcessorFactory();

    public CrashReporter(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
    }

    protected static boolean hasCrashed() {
        return hasCrashed;
    }

    static /* synthetic */ void lambda$reportCrash$0(Throwable th, Thread thread, Session session, long j2, RumEventDispatcher rumEventDispatcher) {
        Object[] objArr = {th, thread};
        JSONObject jSONObjectCrashEvent = ErrorEvent.crashEvent(th);
        if (jSONObjectCrashEvent != null) {
            rumEventDispatcher.dispatchEvent(jSONObjectCrashEvent, j2, 0L, SessionInformationGenerator.generate(session), false, objArr);
        }
    }

    @Override // com.dynatrace.android.agent.crash.CrashListener
    public synchronized void notifyCustomCrash(String str, String str2, String str3, String str4) {
    }

    @Override // com.dynatrace.android.agent.crash.CrashListener
    public synchronized void notifyJavaCrash(Thread thread, Throwable th) {
        Session sessionDetermineActiveSession = Session.determineActiveSession(true);
        int i2 = AdkSettings.getInstance().serverId;
        this.communicationManager.stopTimerLoop();
        if (sessionDetermineActiveSession.isActive()) {
            reportCrash(thread, th, sessionDetermineActiveSession, i2);
        }
        Core.shutdown(5000L);
    }

    protected void reportCrash(final Thread thread, final Throwable th, final Session session, int i2) {
        final long systemTime = TimeLineProvider.getSystemTime();
        if (Global.DEBUG) {
            Utility.zlogE(LOGTAG, String.format("Processing exception (in thread %s) ...", thread != null ? thread.getName() : "unknown"), th);
        }
        if (!session.getPrivacyRules().shouldCollectEvent(EventType.CRASH)) {
            Core.forceCloseActiveActions("a crash");
            return;
        }
        InstrumentationFlavor instrumentationFlavor = AdkSettings.getInstance().getConfiguration().instrumentationFlavor;
        StacktraceData stacktraceDataProcess = this.processorFactory.determineCrashProcessor(th, instrumentationFlavor).process();
        String name = stacktraceDataProcess.getName();
        if (instrumentationFlavor == InstrumentationFlavor.REACT_NATIVE && name != null && name.contains("JavascriptException")) {
            Core.forceCloseActiveActions("a crash");
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportCrash, thread: " + thread + ", throwable: " + th + ", serverId: " + i2);
        Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.CrashReporter$$ExternalSyntheticLambda0
            @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
            public final void execute(RumEventDispatcher rumEventDispatcher) {
                CrashReporter.lambda$reportCrash$0(th, thread, session, systemTime, rumEventDispatcher);
            }
        });
        CrashSegment crashSegment = new CrashSegment(name, stacktraceDataProcess.getReason(), stacktraceDataProcess.getStacktrace(), session, i2, stacktraceDataProcess.getType().getProtocolValue(), !session.isGrailEventsShouldBeCaptured());
        Core.forceCloseActiveActions("a crash");
        int i3 = session.multiplicity != -1 ? session.multiplicity : 1;
        if (!session.isActive()) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Session state changed to inactive while processing crash: abort.");
            }
        } else {
            if (this.communicationManager.sendCrashData(crashSegment, i2, session, i3)) {
                return;
            }
            crashSegment.setSendImmediately(false);
            Core.saveSegment(crashSegment);
        }
    }
}
