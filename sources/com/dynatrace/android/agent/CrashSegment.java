package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class CrashSegment extends ErrorSegment {
    private boolean sendImmediately;

    public CrashSegment(String str, String str2, String str3, Session session, int i2, String str4, boolean z2) {
        super(str, 11, EventType.CRASH, str, str2, str3, 0L, session, i2, str4, z2);
        this.forwardToGrail = z2;
        this.sendImmediately = true;
    }

    @Override // com.dynatrace.android.agent.ErrorSegment, com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sb = new StringBuilder();
        sb.append(SegmentConstants.E_ET).append(this.eventType.getProtocolId());
        sb.append("&na=").append(Utility.urlEncode(getName()));
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&pa=0&s0=");
        sb.append(this.lcSeqNum);
        sb.append("&t0=").append(getStartTime());
        appendOptionalValue(sb, "&rs=", Utility.urlEncode(this.reason));
        appendOptionalValue(sb, "&st=", Utility.urlEncode(this.stacktrace));
        sb.append("&tt=").append(this.platformType);
        sb.append("&im=").append(this.sendImmediately ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        sb.append("&fw=").append(this.forwardToGrail ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }

    public void setSendImmediately(boolean z2) {
        this.sendImmediately = z2;
    }
}
