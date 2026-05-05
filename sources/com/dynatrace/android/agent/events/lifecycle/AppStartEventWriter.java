package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartEventWriter {
    private static final String ASSIGN = "=";
    private static final String CURRENT_ACTION_ID = "ca";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String NAME = "na";
    private static final String PARENT_ACTION_ID = "pa";
    private static final String SEQ_NR_ACTION_END = "s1";
    private static final String SEQ_NR_ACTION_START = "s0";
    private static final String THREAD_ID = "it";
    private static final String TIME_ACTION_START = "t0";
    private static final String TIME_DURATION = "t1";

    public StringBuilder toBeaconString(AppStartSegment appStartSegment) {
        MeasurementPoint startPoint = appStartSegment.getStartPoint();
        MeasurementPoint endPoint = appStartSegment.getEndPoint();
        StringBuilder sb = new StringBuilder();
        sb.append("et=").append(appStartSegment.getEventType().getProtocolId());
        if (appStartSegment.getActivityName() != null) {
            sb.append("&na=").append(Utility.urlEncode(appStartSegment.getName()));
        }
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&ca=").append(appStartSegment.getTagId());
        sb.append("&pa=").append(appStartSegment.getParentTagId());
        sb.append("&s0=").append(startPoint.getSequenceNumber());
        sb.append("&t0=").append(startPoint.getTimestamp());
        sb.append("&s1=").append(endPoint.getSequenceNumber());
        sb.append("&t1=").append(endPoint.getTimestamp());
        sb.append("&fw=").append(appStartSegment.getForwardToGrail() ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
