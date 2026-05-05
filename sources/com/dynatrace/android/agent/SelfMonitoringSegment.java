package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class SelfMonitoringSegment extends CustomSegment {
    public SelfMonitoringSegment(String str, String str2, Session session, int i2) {
        super(str, 13, EventType.SELF_MONITORING_EVENT, 0L, session, i2, false);
        this.mValue = Utility.truncateString(str2, 1000);
    }
}
