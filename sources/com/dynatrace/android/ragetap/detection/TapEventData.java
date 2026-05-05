package com.dynatrace.android.ragetap.detection;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class TapEventData {
    private final long eventTime;
    private final long timestamp;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f2846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f2847y;

    public TapEventData(float f2, float f3, long j2, long j3) {
        this.f2846x = f2;
        this.f2847y = f3;
        this.timestamp = j2;
        this.eventTime = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TapEventData tapEventData = (TapEventData) obj;
        return Float.compare(tapEventData.f2846x, this.f2846x) == 0 && Float.compare(tapEventData.f2847y, this.f2847y) == 0 && this.timestamp == tapEventData.timestamp && this.eventTime == tapEventData.eventTime;
    }

    public long getEventTime() {
        return this.eventTime;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getX() {
        return this.f2846x;
    }

    public float getY() {
        return this.f2847y;
    }

    public int hashCode() {
        float f2 = this.f2846x;
        int iFloatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f2847y;
        int iFloatToIntBits2 = (iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        long j2 = this.timestamp;
        int i2 = (iFloatToIntBits2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.eventTime;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "TapEventData{x=" + this.f2846x + ", y=" + this.f2847y + ", timestamp=" + this.timestamp + ", eventTime=" + this.eventTime + AbstractJsonLexerKt.END_OBJ;
    }
}
