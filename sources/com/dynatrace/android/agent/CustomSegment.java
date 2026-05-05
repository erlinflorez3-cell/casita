package com.dynatrace.android.agent;

import com.dynatrace.android.agent.crash.PlatformType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.internal.api.SelfMonitoring;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CustomSegment implements Segment {
    static final int ORPHAN_PLACEHOLDER = 100;
    static final int REPORT_ACTION = 5;
    static final int REPORT_ACTION_BEGIN = 1;
    static final int REPORT_ACTION_END = 2;
    static final int REPORT_CRASH_EVENT = 11;
    static final int REPORT_CRASH_EVENT_CROSS_PLATFORM = 21;
    static final int REPORT_CUSTOM_DBL_EVENT = 7;
    static final int REPORT_CUSTOM_INT_EVENT = 6;
    static final int REPORT_CUSTOM_STR_EVENT = 8;
    static final int REPORT_ERROR_INT_EVENT = 9;
    static final int REPORT_ERROR_STR_EVENT = 10;
    static final int REPORT_ERROR_STR_EVENT_CROSS_PLATFORM = 20;
    public static final int REPORT_EVENT_API = 17;
    public static final int REPORT_LIFECYCLE_EVENT = 15;
    static final int REPORT_NAMED_EVENT = 4;
    public static final int REPORT_RAGE_TAP = 16;
    public static final int REPORT_SELF_MONITORING_EVENT = 13;
    static final int REPORT_USER_EVENT = 12;
    static final int WEBREQ_PLACEHOLDER = 110;
    private final AtomicInteger childEvents;
    private final AtomicInteger droppedEvents;
    protected boolean enabled;
    protected EventType eventType;
    private boolean forwardToGrail;
    protected int lcSeqNum;
    private long mCurrentTagId;
    protected long mEventEndTime;
    protected long mEventStartTime;
    protected boolean mFinalized;
    private String mName;
    protected long mParentTagId;
    private int mType;
    protected String mValue;
    protected CustomSegment parentAction;
    protected CustomSegment rootAction;
    protected int serverId;
    protected Session session;
    static AtomicInteger firstSendOccurred = new AtomicInteger(0);
    public static int NUMBER_OF_ALLOWED_USER_ACTIONS = 100;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.CustomSegment$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$dynatrace$android$agent$EventType = iArr;
            try {
                iArr[EventType.VALUE_DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.NAMED_EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.IDENTIFY_USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.ERROR_INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.SELF_MONITORING_EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CustomSegment(String str, int i2, EventType eventType, long j2, int i3, long j3, long j4, Session session, int i4, boolean z2) {
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.mParentTagId = 0L;
        this.mFinalized = false;
        this.enabled = true;
        this.parentAction = null;
        this.rootAction = null;
        this.droppedEvents = new AtomicInteger(0);
        this.childEvents = new AtomicInteger(1);
        this.mName = "";
        this.session = session;
        this.mType = i2;
        this.eventType = eventType;
        this.mEventStartTime = j3;
        this.mEventEndTime = j4;
        this.mParentTagId = j2;
        this.mCurrentTagId = 0L;
        this.lcSeqNum = i3;
        this.serverId = i4;
        this.mFinalized = true;
        setName(str);
        if (j2 == 0) {
            session.updateLastInteractionTime(TimeLineProvider.getSystemTime());
        }
        this.forwardToGrail = z2;
    }

    public CustomSegment(String str, int i2, EventType eventType, long j2, Session session, int i3, boolean z2) {
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.mParentTagId = 0L;
        this.mFinalized = false;
        this.enabled = true;
        this.parentAction = null;
        this.rootAction = null;
        this.droppedEvents = new AtomicInteger(0);
        this.childEvents = new AtomicInteger(1);
        this.mName = "";
        this.mCurrentTagId = 0L;
        this.session = session;
        this.mType = i2;
        this.eventType = eventType;
        long runningTime = session.getRunningTime();
        this.mEventStartTime = runningTime;
        this.mEventEndTime = runningTime;
        this.mParentTagId = j2;
        this.mCurrentTagId = Utility.getNextTagId();
        this.lcSeqNum = Utility.getEventSeqNum();
        this.serverId = i3;
        this.mFinalized = i2 != 5;
        setName(str);
        if (j2 == 0) {
            session.updateLastInteractionTime(TimeLineProvider.getSystemTime());
        }
        this.forwardToGrail = z2;
    }

    public CustomSegment(String str, int i2, Session session, int i3, boolean z2) {
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.mParentTagId = 0L;
        this.mFinalized = false;
        this.enabled = true;
        this.parentAction = null;
        this.rootAction = null;
        this.droppedEvents = new AtomicInteger(0);
        this.childEvents = new AtomicInteger(1);
        this.mName = "";
        this.mCurrentTagId = 0L;
        this.mType = i2;
        this.mCurrentTagId = Utility.getNextTagId();
        this.session = session;
        this.serverId = i3;
        setName(str);
        this.forwardToGrail = z2;
    }

    private void generateCustomMessage(StringBuilder sb) {
        sb.append("&na=").append(Utility.urlEncode(getName()));
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&pa=").append(getParentTagId());
        sb.append("&s0=").append(getLcSeqNum());
        sb.append("&t0=").append(getStartTime());
    }

    private int totalEventsInTree() {
        return this.rootAction.childEvents.get();
    }

    protected void appendOptionalValue(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            if (str2.isEmpty()) {
                return;
            }
            sb.append(str2);
        }
    }

    @Override // com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sb = new StringBuilder();
        sb.append(SegmentConstants.E_ET).append(this.eventType.getProtocolId());
        switch (AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$EventType[this.eventType.ordinal()]) {
            case 1:
                generateCustomMessage(sb);
                sb.append("&vl=").append(Utility.urlEncode(this.mValue));
                break;
            case 2:
                generateCustomMessage(sb);
                appendOptionalValue(sb, "&vl=", Utility.urlEncode(this.mValue));
                break;
            case 3:
                generateCustomMessage(sb);
                sb.append("&vl=").append(Utility.urlEncode(this.mValue));
                break;
            case 4:
                generateCustomMessage(sb);
                break;
            case 5:
                generateCustomMessage(sb);
                break;
            case 6:
                generateCustomMessage(sb);
                sb.append("&ev=").append(Utility.urlEncode(this.mValue));
                sb.append("&tt=").append(PlatformType.CUSTOM.getProtocolValue());
                break;
            case 7:
                sb.append("&na=").append(Utility.urlEncode(getName()));
                appendOptionalValue(sb, "&pl=", Utility.urlEncode(this.mValue));
                sb.append("&t0=").append(getStartTime());
                break;
        }
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }

    public void disable() {
        this.enabled = false;
        this.mFinalized = true;
    }

    protected long getEndTime() {
        return this.mEventEndTime;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public int getLcSeqNum() {
        return this.lcSeqNum;
    }

    public String getName() {
        return this.mName;
    }

    protected long getOverrideEndTime() {
        return 0L;
    }

    public long getParentTagId() {
        return this.mParentTagId;
    }

    public int getServerId() {
        return this.serverId;
    }

    public Session getSession() {
        return this.session;
    }

    protected long getSessionRunningTime() {
        return this.session.getRunningTime();
    }

    public long getStartTime() {
        return this.mEventStartTime;
    }

    public long getTagId() {
        return this.mCurrentTagId;
    }

    protected int getType() {
        return this.mType;
    }

    public int incrementAndGetDroppedEvents() {
        return this.rootAction.droppedEvents.incrementAndGet();
    }

    public void incrementChildEvents() {
        this.rootAction.childEvents.incrementAndGet();
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isFinalized() {
        return this.mFinalized;
    }

    public boolean isLimitNumberOfAllowedUserEventsExceed() {
        return totalEventsInTree() >= NUMBER_OF_ALLOWED_USER_ACTIONS;
    }

    protected boolean nameMissing() {
        String str = this.mName;
        return str == null || str.isEmpty();
    }

    protected void sendSfmForDroppedEventsIfNeeded() {
        if (this.parentAction != null || this.droppedEvents.get() == 0) {
            return;
        }
        SelfMonitoring.reportLogEvent("EventThrottlingActionTreeSizeLimit", String.format(Locale.US, "The root action with id %d has exceeded child limitation of %d, discarded %d child events", Long.valueOf(this.mCurrentTagId), Integer.valueOf(NUMBER_OF_ALLOWED_USER_ACTIONS), Integer.valueOf(this.droppedEvents.get())));
    }

    public void setLcSeqNum(int i2) {
        this.lcSeqNum = i2;
    }

    protected void setName(String str) {
        if (str == null) {
            this.mName = "";
        } else {
            this.mName = Utility.truncateString(str, 250);
        }
    }

    protected void setParentTagId(long j2) {
        this.mParentTagId = j2;
    }

    public void setStartTime(long j2) {
        this.mEventStartTime = j2;
    }

    protected void updateEndTime() {
        long overrideEndTime = getOverrideEndTime();
        if (overrideEndTime > 0) {
            updateEndTime(overrideEndTime);
        } else {
            updateEndTime(getSessionRunningTime());
        }
    }

    protected void updateEndTime(long j2) {
        if (this.mFinalized) {
            return;
        }
        this.mEventEndTime = j2;
        this.mFinalized = true;
        if (this.mParentTagId == 0) {
            this.session.updateLastInteractionTime(TimeLineProvider.getSystemTime());
        }
    }
}
