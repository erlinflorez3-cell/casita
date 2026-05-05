package com.dynatrace.android.agent.db;

import com.dynatrace.android.agent.comm.MonitoringDataPacket;

/* JADX INFO: loaded from: classes3.dex */
public class MonitoringDataEntity {
    public final boolean finished;
    public final long lastRowId;
    public final MonitoringDataPacket monitoringData;
    public final int sequenceNumber;
    public final int serverId;
    public final int sessionId;
    public final long visitorId;

    public MonitoringDataEntity(long j2, int i2, int i3, int i4, long j3, MonitoringDataPacket monitoringDataPacket, boolean z2) {
        this.visitorId = j2;
        this.sessionId = i2;
        this.sequenceNumber = i3;
        this.serverId = i4;
        this.lastRowId = j3;
        this.monitoringData = monitoringDataPacket;
        this.finished = z2;
    }
}
