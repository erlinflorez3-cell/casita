package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.android.agent.AdkSettings;

/* JADX INFO: loaded from: classes3.dex */
public class EventWriter {
    private static final String ASSIGN = "=";
    private static final String DELIMITER = "&";
    private static final String EVENT_TYPE = "et=";
    private static final String FORWARD_MESSAGE = "fw";
    private static final String PAYLOAD = "pl";

    public StringBuilder toBeaconString(BizEventSegment bizEventSegment) {
        StringBuilder sb = new StringBuilder();
        sb.append("et=").append(bizEventSegment.getEventType().getProtocolId());
        sb.append("&pl=").append(bizEventSegment.getUrlEncodedJsonPayload());
        sb.append("&fw=").append(bizEventSegment.getForwardToGrail() ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
        return sb;
    }
}
