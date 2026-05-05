package com.dynatrace.android.agent;

import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ConfigurationPreset;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public class DTXAutoAction extends DTXActionImpl {
    private static final int INTERVAL = 100;
    private static volatile DTXAutoAction theAutoAction = null;
    private boolean abandonThis;
    private volatile int actionCount;
    private volatile long adjustedEndTime;
    private volatile boolean graceTimeOver;
    private volatile boolean hasDiscardedAppStart;
    private volatile boolean hasEvents;
    private volatile boolean haveAction;
    private volatile boolean haveWebReq;
    private boolean modifiedName;
    private volatile Timer theTimer;
    private volatile boolean waitTimeStarted;
    private volatile int webReqCount;
    private static final String LOGTAG = Global.LOG_PREFIX + "DTXAutoAction";
    static int graceTime = ConfigurationPreset.generateImproperConfiguration().graceTime;
    static int waitTime = ConfigurationPreset.generateImproperConfiguration().waitTime;
    static boolean sendEmptyActions = true;
    static UserActionModifier autoUserActionModifier = null;
    private static List<DTXAutoAction> outstandingGaua = Collections.synchronizedList(new ArrayList(5));

    /* JADX INFO: renamed from: com.dynatrace.android.agent.DTXAutoAction$1 */
    class AnonymousClass1 extends TimerTask {
        int intervals;
        final /* synthetic */ boolean val$execOnEachInterval;
        final /* synthetic */ int val$numPeriods;

        AnonymousClass1(int i2, boolean z2) {
            this.val$numPeriods = i2;
            this.val$execOnEachInterval = z2;
            this.intervals = i2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i2 = this.intervals;
            if (i2 > 0) {
                this.intervals = i2 - 1;
                if (!this.val$execOnEachInterval) {
                    return;
                }
            } else {
                DTXAutoAction.this.cancelTimer();
            }
            DTXAutoAction.this.onTimerPop(this.intervals);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.DTXAutoAction$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$dynatrace$android$agent$EventType = iArr;
            try {
                iArr[EventType.VALUE_INT64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.ERROR_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.ERROR_EXCEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.NAMED_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected DTXAutoAction(String str, Session session, int i2, boolean z2) {
        super(str, EventType.ACTION_AUTO, 0L, session, i2, z2, null);
        this.adjustedEndTime = 0L;
        this.webReqCount = 0;
        this.actionCount = 0;
        this.haveWebReq = false;
        this.haveAction = false;
        this.hasEvents = false;
        this.hasDiscardedAppStart = false;
        this.waitTimeStarted = false;
        this.abandonThis = false;
        this.theTimer = null;
        this.modifiedName = false;
        Core.addEvent(str, 1, getParentTagId(), this, session, i2, new String[0]);
    }

    private synchronized void bootGauaOff(DTXAutoAction dTXAutoAction, boolean z2) {
        if (theAutoAction == dTXAutoAction) {
            theAutoAction = null;
            if (z2 && dTXAutoAction != null) {
                outstandingGaua.add(dTXAutoAction);
            }
        }
    }

    private void cancelTimer(Timer timer) {
        this.graceTimeOver = this.waitTimeStarted;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: cancel timer=" + timer + " graceTimeOver=" + this.graceTimeOver);
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    public static void closeAll() {
        ArrayList arrayList;
        swapGaua(null);
        synchronized (outstandingGaua) {
            arrayList = new ArrayList(outstandingGaua);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((DTXAutoAction) it.next()).leaveAction();
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "GAUA close all internal errors", e2);
                }
            }
        }
    }

    public static DTXAutoAction createAutoAction(String str, Session session, int i2) {
        return createAutoAction(str, session, i2, true);
    }

    static DTXAutoAction createAutoAction(String str, Session session, int i2, boolean z2) {
        DTXAutoAction dTXAutoAction = new DTXAutoAction(str, session, i2, z2);
        swapGaua(dTXAutoAction);
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: new GAUA %s @ %d", str, Long.valueOf(dTXAutoAction.getStartTime())));
        }
        if (autoUserActionModifier != null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "invoking the AUA modifier on the current auto action");
            }
            autoUserActionModifier.modify(new ExposedUserAction(dTXAutoAction));
        }
        return dTXAutoAction;
    }

    public static DTXAutoAction getAutoAction() {
        return theAutoAction;
    }

    private synchronized Timer getTimer(boolean z2) {
        Timer timer;
        if (z2) {
            if (this.theTimer != null) {
                cancelTimer(this.theTimer);
            }
            timer = new Timer(LOGTAG);
            this.theTimer = timer;
        } else {
            timer = this.theTimer;
            this.theTimer = null;
        }
        return timer;
    }

    private boolean isAnEvent(CustomSegment customSegment) {
        switch (AnonymousClass2.$SwitchMap$com$dynatrace$android$agent$EventType[customSegment.getEventType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private boolean isLoadingApplicationAction() {
        return getName().equals(Global.LOADING + AdkSettings.applName);
    }

    public void onTimerPop(int i2) {
        int i3;
        this.graceTimeOver = true;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: onTimerPop for %s intv=%d WR=%d action=%d", getName(), Integer.valueOf(i2), Integer.valueOf(this.webReqCount), Integer.valueOf(this.actionCount)));
        }
        if (!this.waitTimeStarted) {
            bootGauaOff(this, true);
        }
        if (this.webReqCount > 0 || this.actionCount > 0) {
            if (!this.waitTimeStarted) {
                this.waitTimeStarted = true;
                if (isLoadingApplicationAction() && this.actionCount > 0) {
                    AppStartPlaceholderSegment appStartPlaceholderSegment = null;
                    boolean z2 = false;
                    for (CustomSegment customSegment : getChildEventVector()) {
                        if (customSegment instanceof LifecyclePlaceholderSegment) {
                            z2 = true;
                        } else if (customSegment instanceof AppStartPlaceholderSegment) {
                            appStartPlaceholderSegment = (AppStartPlaceholderSegment) customSegment;
                        }
                    }
                    if (!z2 && appStartPlaceholderSegment != null) {
                        if (Global.DEBUG) {
                            Utility.zlogD(LOGTAG, "onUA: detected pending AppStart action after grace period; dropping AppStart action");
                        }
                        removeChildEvent(appStartPlaceholderSegment.getName());
                        this.hasDiscardedAppStart = true;
                        appStartPlaceholderSegment.discardAction();
                    }
                }
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, String.format("onUA: starting waiting period for %s", getName()));
                }
                long sessionRunningTime = ((long) waitTime) - (getSessionRunningTime() - getStartTime());
                if (sessionRunningTime > 1000) {
                    i3 = 1000;
                } else {
                    i3 = 100;
                    if (sessionRunningTime < 0) {
                        sessionRunningTime = 0;
                    }
                }
                long j2 = i3;
                startTimer(j2, j2, Math.round(sessionRunningTime / i3) - 1, true);
                return;
            }
            if (i2 > 0) {
                return;
            }
        }
        cancelTimer();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: closing %s", getName()));
        }
        leaveAction();
    }

    public static void setAutoInstrProperties(Configuration configuration) {
        graceTime = configuration.graceTime;
        waitTime = configuration.waitTime;
        sendEmptyActions = configuration.sendEmptyAction;
        autoUserActionModifier = configuration.autoUserActionModifier;
    }

    private void startTimer(long j2, long j3, int i2, boolean z2) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: startTimer for %s delay=%dms period=%dms #period=%d", getName(), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2)));
        }
        AnonymousClass1 anonymousClass1 = new TimerTask(i2, z2) { // from class: com.dynatrace.android.agent.DTXAutoAction.1
            int intervals;
            final /* synthetic */ boolean val$execOnEachInterval;
            final /* synthetic */ int val$numPeriods;

            AnonymousClass1(int i22, boolean z22) {
                this.val$numPeriods = i22;
                this.val$execOnEachInterval = z22;
                this.intervals = i22;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int i22 = this.intervals;
                if (i22 > 0) {
                    this.intervals = i22 - 1;
                    if (!this.val$execOnEachInterval) {
                        return;
                    }
                } else {
                    DTXAutoAction.this.cancelTimer();
                }
                DTXAutoAction.this.onTimerPop(this.intervals);
            }
        };
        for (int i3 = 3; i3 > 0; i3--) {
            try {
                getTimer(true).schedule(anonymousClass1, j2, j3);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            } catch (IllegalStateException unused2) {
            }
        }
    }

    private static synchronized DTXAutoAction swapGaua(DTXAutoAction dTXAutoAction) {
        DTXAutoAction dTXAutoAction2;
        dTXAutoAction2 = theAutoAction;
        theAutoAction = dTXAutoAction;
        if (dTXAutoAction2 != null) {
            outstandingGaua.add(dTXAutoAction2);
        }
        return dTXAutoAction2;
    }

    public void cancelGracefully() {
        this.abandonThis = true;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "AutoAction '" + getName() + "' was canceled by the developer");
        }
    }

    public void cancelTimer() {
        cancelTimer(getTimer(false));
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
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
        sb.append("&mo=").append(this.modifiedName ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void discardAction() {
        this.abandonThis = true;
        leaveAction();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    protected WebReqTag getInternalRequestTag() {
        if (this.graceTimeOver) {
            return null;
        }
        return super.getInternalRequestTag();
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    protected long getOverrideEndTime() {
        if (this.haveWebReq || this.haveAction) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("onUA: use adjusted eT=%d dur=%d", Long.valueOf(this.adjustedEndTime), Long.valueOf(this.adjustedEndTime - getStartTime())));
            }
            return this.adjustedEndTime;
        }
        if (this.adjustedEndTime <= 0) {
            return super.getOverrideEndTime();
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA (empty): use adjusted eT=%d dur=%d", Long.valueOf(this.adjustedEndTime), Long.valueOf(this.adjustedEndTime - getStartTime())));
        }
        return this.adjustedEndTime;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    protected boolean getPreconditions() {
        return super.getPreconditions();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    public String getRequestTag() {
        return this.graceTimeOver ? Dynatrace.getRequestTag() : super.getRequestTag();
    }

    boolean isAbandoned() {
        return this.abandonThis;
    }

    public boolean isGraceTimeOver() {
        return this.graceTimeOver;
    }

    boolean isNameModified() {
        return this.modifiedName;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d8  */
    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void leaveAction() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.DTXAutoAction.leaveAction():void");
    }

    public synchronized void markOverrideEndTime() {
        if (isFinalized()) {
            return;
        }
        this.adjustedEndTime = getSessionRunningTime();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: new eT=%d dur=%d", Long.valueOf(this.adjustedEndTime), Long.valueOf(this.adjustedEndTime - getStartTime())));
        }
    }

    public void modifyName(String str) {
        String name = getName();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "changing the action name from '" + name + "' to '" + str + "'");
        }
        setName(str);
        if (getName().equals(name)) {
            return;
        }
        this.modifiedName = true;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    protected void notifyChildAdded(CustomSegment customSegment) {
        if (customSegment == null) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: add child %s to %s", customSegment.getName(), getName()));
        }
        int type = customSegment.getType();
        if (type == 5) {
            this.actionCount++;
            this.haveAction = true;
        } else if (type != 100 && type != 110) {
            this.hasEvents = isAnEvent(customSegment);
        } else {
            this.webReqCount++;
            this.haveWebReq = true;
        }
    }

    public void onLeaveAction(DTXActionImpl dTXActionImpl) {
        if (getChildEventVector().contains(dTXActionImpl)) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("onUA: child %s of %s done", dTXActionImpl.getName(), getName()));
            }
            markOverrideEndTime();
            this.actionCount--;
        }
    }

    public int onWrFinished(long j2) {
        if (isFinalized()) {
            return this.webReqCount;
        }
        if (this.webReqCount > 0 && j2 == getTagId()) {
            markOverrideEndTime();
            this.webReqCount--;
        }
        return this.webReqCount;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void removeChildEvent(String str) {
        if (str.startsWith(WebReqTag.getTagPrefix())) {
            this.webReqCount--;
        } else {
            this.actionCount--;
        }
        super.removeChildEvent(str);
    }

    public void startTimer() {
        startTimer(graceTime);
        markOverrideEndTime();
    }

    public void startTimer(int i2) {
        cancelTimer();
        if (i2 <= 0) {
            onTimerPop(0);
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: start grace period for %s", getName()));
        }
        long j2 = i2;
        startTimer(j2, j2, 0, false);
    }

    public void startTimerIfNeeded() {
        if (this.theTimer == null) {
            startTimer(graceTime);
        }
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public String tagRequest() {
        return this.graceTimeOver ? Dynatrace.getRequestTag() : super.tagRequest();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    public void tagRequest(HttpURLConnection httpURLConnection) {
        if (this.graceTimeOver) {
            return;
        }
        super.tagRequest(httpURLConnection);
    }
}
