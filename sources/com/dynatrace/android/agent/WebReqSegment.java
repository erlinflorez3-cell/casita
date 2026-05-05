package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class WebReqSegment extends CustomSegment {
    private long endLcSeqNum;
    private boolean forwardToGrail;
    private long receivedBytes;
    protected int respCode;
    protected String respPhrase;
    private long sendBytes;
    private String serverTiming;

    public WebReqSegment(long j2, int i2, long j3, long j4, int i3, String str, String str2, long j5, long j6, Session session, int i4, String str3, boolean z2) {
        super(str2, 6, EventType.WEB_REQUEST, j2, i2, j3, j4, session, i4, z2);
        this.respCode = i3;
        this.respPhrase = str;
        this.endLcSeqNum = Utility.getEventSeqNum();
        this.sendBytes = j5;
        this.receivedBytes = j6;
        this.serverTiming = str3;
        this.forwardToGrail = z2;
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sb = new StringBuilder();
        sb.append(SegmentConstants.E_ET).append(this.eventType.getProtocolId());
        sb.append("&na=").append(Utility.urlEncode(getName()));
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&pa=").append(getParentTagId());
        sb.append("&s0=").append(this.lcSeqNum);
        sb.append("&t0=").append(getStartTime());
        sb.append("&s1=").append(this.endLcSeqNum);
        sb.append("&t1=").append(getEndTime() - getStartTime());
        if (this.respCode > 0) {
            sb.append("&rc=").append(this.respCode);
        } else if (this.respPhrase != null) {
            sb.append("&rc=").append(Utility.urlEncode(this.respPhrase));
        }
        if (this.sendBytes >= 0 && this.receivedBytes >= 0) {
            sb.append("&bs=").append(this.sendBytes);
            sb.append("&br=").append(this.receivedBytes);
        }
        if (this.serverTiming != null) {
            sb.append("&si=").append(Utility.urlEncode(this.serverTiming));
        }
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
