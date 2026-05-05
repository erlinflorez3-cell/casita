package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorSegment extends CustomSegment {
    protected String exceptionName;
    protected boolean forwardToGrail;
    protected String platformType;
    protected String reason;
    protected String stacktrace;

    protected ErrorSegment(String str, int i2, EventType eventType, String str2, String str3, String str4, long j2, Session session, int i3, String str5, boolean z2) {
        super(str, i2, eventType, j2, session, i3, z2);
        this.exceptionName = str2;
        this.reason = str3;
        this.stacktrace = str4;
        this.platformType = str5;
        this.forwardToGrail = z2;
    }

    protected ErrorSegment(String str, String str2, String str3, String str4, long j2, Session session, int i2, String str5, boolean z2) {
        this(str, 6, EventType.ERROR_EXCEPTION, str2, str3, str4, j2, session, i2, str5, z2);
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sb = new StringBuilder();
        sb.append(SegmentConstants.E_ET).append(this.eventType.getProtocolId());
        sb.append("&na=").append(Utility.urlEncode(getName()));
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&pa=").append(getParentTagId());
        sb.append("&s0=").append(getLcSeqNum());
        sb.append("&t0=").append(getStartTime());
        appendOptionalValue(sb, "&rs=", Utility.urlEncode(this.reason));
        appendOptionalValue(sb, "&ev=", Utility.urlEncode(this.exceptionName));
        appendOptionalValue(sb, "&st=", Utility.urlEncode(this.stacktrace));
        sb.append("&tt=").append(this.platformType);
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
