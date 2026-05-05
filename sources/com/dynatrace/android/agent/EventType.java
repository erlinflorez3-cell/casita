package com.dynatrace.android.agent;

import com.dynatrace.android.agent.conf.DataCollectionLevel;

/* JADX INFO: loaded from: classes3.dex */
public enum EventType {
    ACTION_MANUAL(1, DataCollectionLevel.PERFORMANCE),
    ACTION_AUTO(6, DataCollectionLevel.PERFORMANCE),
    ACTION_AUTO_LOADING_APP(6, DataCollectionLevel.OFF),
    NAMED_EVENT(10, DataCollectionLevel.USER_BEHAVIOR),
    VALUE_STRING(11, DataCollectionLevel.USER_BEHAVIOR),
    VALUE_INT64(12, DataCollectionLevel.USER_BEHAVIOR),
    VALUE_DOUBLE(13, DataCollectionLevel.USER_BEHAVIOR),
    VISIT_END(19, DataCollectionLevel.PERFORMANCE),
    APP_START(20, DataCollectionLevel.PERFORMANCE),
    DISPLAY(21, DataCollectionLevel.PERFORMANCE),
    REDISPLAY(22, DataCollectionLevel.PERFORMANCE),
    WEB_REQUEST(30, DataCollectionLevel.PERFORMANCE),
    ERROR_INT(40, DataCollectionLevel.PERFORMANCE),
    ERROR_EXCEPTION(42, DataCollectionLevel.PERFORMANCE),
    CRASH(50, DataCollectionLevel.OFF),
    IDENTIFY_USER(60, DataCollectionLevel.USER_BEHAVIOR),
    SELF_MONITORING_EVENT(90, DataCollectionLevel.PERFORMANCE),
    RAGE_TAP(97, DataCollectionLevel.PERFORMANCE),
    EVENT_API(98, DataCollectionLevel.PERFORMANCE),
    EVENT_BIZ(98, DataCollectionLevel.OFF),
    PLACEHOLDER(-1, DataCollectionLevel.USER_BEHAVIOR);

    private DataCollectionLevel dataCollectionLevel;
    private int protocolId;

    EventType(int i2, DataCollectionLevel dataCollectionLevel) {
        this.protocolId = i2;
        this.dataCollectionLevel = dataCollectionLevel;
    }

    public DataCollectionLevel getDataCollectionLevel() {
        return this.dataCollectionLevel;
    }

    public int getProtocolId() {
        return this.protocolId;
    }
}
