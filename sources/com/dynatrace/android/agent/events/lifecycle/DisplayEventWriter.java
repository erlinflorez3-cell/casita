package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class DisplayEventWriter {
    private static final String ASSIGN = "=";
    private static final String CURRENT_ACTION_ID = "ca";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String NAME = "na";
    private static final String PARENT_ACTION_ID = "pa";
    private static final String SEQ_NR_ACTION_START = "s0";
    private static final String SEQ_NR_DURATION = "s4";
    private static final String SEQ_NR_LC_CREATE = "s1";
    private static final String SEQ_NR_LC_RESUME = "s3";
    private static final String SEQ_NR_LC_START = "s2";
    private static final String THREAD_ID = "it";
    private static final String TIME_ACTION_START = "t0";
    private static final String TIME_DURATION = "t4";
    private static final String TIME_LC_CREATE = "t1";
    private static final String TIME_LC_RESUME = "t3";
    private static final String TIME_LC_START = "t2";

    public StringBuilder toBeaconString(DisplaySegment displaySegment) {
        MeasurementPoint actionCreationPoint = displaySegment.getActionCreationPoint();
        MeasurementPoint createEvent = displaySegment.getCreateEvent();
        MeasurementPoint startEvent = displaySegment.getStartEvent();
        MeasurementPoint resumeEvent = displaySegment.getResumeEvent();
        MeasurementPoint endpoint = displaySegment.getEndpoint();
        StringBuilder sb = new StringBuilder();
        sb.append("et=").append(displaySegment.getEventType().getProtocolId());
        sb.append("&na=").append(Utility.urlEncode(displaySegment.getName()));
        sb.append("&it=").append(Utility.getCurrentThreadId());
        sb.append("&ca=").append(displaySegment.getTagId());
        sb.append("&pa=").append(displaySegment.getParentTagId());
        sb.append("&s0=").append(actionCreationPoint.getSequenceNumber());
        sb.append("&t0=").append(actionCreationPoint.getTimestamp());
        if (createEvent != null) {
            sb.append("&s1=").append(createEvent.getSequenceNumber());
            sb.append("&t1=").append(createEvent.getTimestamp());
        }
        if (startEvent != null) {
            sb.append("&s2=").append(startEvent.getSequenceNumber());
            sb.append("&t2=").append(startEvent.getTimestamp());
        }
        if (resumeEvent != null) {
            sb.append("&s3=").append(resumeEvent.getSequenceNumber());
            sb.append("&t3=").append(resumeEvent.getTimestamp());
        }
        if (endpoint != null) {
            sb.append("&s4=").append(endpoint.getSequenceNumber());
            sb.append("&t4=").append(endpoint.getTimestamp());
        }
        sb.append("&fw=").append(displaySegment.getForwardToGrail() ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
