package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class VisitSegment extends CustomSegment {
    private boolean forwardToGrail;

    protected VisitSegment(Session session, int i2, boolean z2) {
        super("", 5, EventType.VISIT_END, 0L, session, i2, z2);
        this.forwardToGrail = z2;
    }

    protected static VisitSegment createVisitSegment(Session session, int i2, boolean z2) {
        VisitSegment visitSegment = new VisitSegment(session, i2, z2);
        visitSegment.updateEndTime(session.getRunningTime());
        return visitSegment;
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sb = new StringBuilder();
        sb.append(SegmentConstants.E_ET).append(this.eventType.getProtocolId());
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&pa=").append(getParentTagId());
        sb.append("&s0=").append(getLcSeqNum() + 100);
        sb.append("&t0=").append(getStartTime());
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
