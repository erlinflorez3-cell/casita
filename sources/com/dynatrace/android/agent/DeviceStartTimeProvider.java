package com.dynatrace.android.agent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceStartTimeProvider {
    private final long deviceStartTimeMillis;
    private final long deviceStartTimeNanos;

    public DeviceStartTimeProvider(long j2, long j3, long j4) {
        this.deviceStartTimeMillis = j2 - j3;
        this.deviceStartTimeNanos = TimeUnit.MILLISECONDS.toNanos(j2) - j4;
    }

    public long getDeviceStartTimeMillis() {
        return this.deviceStartTimeMillis;
    }

    public long getDeviceStartTimeNanos() {
        return this.deviceStartTimeNanos;
    }
}
