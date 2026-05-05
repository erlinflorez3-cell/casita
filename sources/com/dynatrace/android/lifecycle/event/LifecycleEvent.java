package com.dynatrace.android.lifecycle.event;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import java.lang.Enum;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleEvent<T extends Enum<T>> {
    private final T eventType;
    private final int sequenceNumber;
    private final long timestamp;

    public LifecycleEvent(T t2, MeasurementPoint measurementPoint) {
        this.eventType = t2;
        this.timestamp = measurementPoint.getTimestamp();
        this.sequenceNumber = measurementPoint.getSequenceNumber();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
        return this.timestamp == lifecycleEvent.timestamp && this.sequenceNumber == lifecycleEvent.sequenceNumber && this.eventType == lifecycleEvent.eventType;
    }

    public T getEventType() {
        return this.eventType;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        long j2 = this.timestamp;
        return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.sequenceNumber;
    }

    public String toString() {
        return "LifecycleEvent{eventType=" + this.eventType + ", timestamp=" + this.timestamp + ", sequenceNumber=" + this.sequenceNumber + AbstractJsonLexerKt.END_OBJ;
    }
}
