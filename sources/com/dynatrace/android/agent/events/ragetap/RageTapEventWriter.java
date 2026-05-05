package com.dynatrace.android.agent.events.ragetap;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class RageTapEventWriter {
    private static final String ASSIGN = "=";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String NAME = "na";
    private static final String NUMBER_OF_TAPS = "nt";
    private static final String SEQUENCE_NUMBER = "s0";
    private static final String TIME_FIRST_TAP_DOWN = "t0";
    private static final String TIME_LAST_TAP_UP = "t1";

    public StringBuilder toBeaconString(RageTapSegment rageTapSegment) {
        StringBuilder sb = new StringBuilder();
        sb.append("et=").append(rageTapSegment.getEventType().getProtocolId());
        if (rageTapSegment.getActivityName() != null) {
            sb.append("&na=").append(Utility.urlEncode(rageTapSegment.getName()));
        }
        sb.append("&s0=").append(rageTapSegment.getLcSeqNum());
        sb.append("&t0=").append(rageTapSegment.getFirstTapDown());
        sb.append("&t1=").append(rageTapSegment.getLastTapUp());
        sb.append("&nt=").append(rageTapSegment.getNumOfTaps());
        sb.append("&fw=").append(rageTapSegment.getForwardToGrail() ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
