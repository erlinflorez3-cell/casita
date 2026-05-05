package com.dynatrace.android.agent.measurement;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MeasurementPoint {
    private final int sequenceNumber;
    private final long timestamp;

    public MeasurementPoint(long j2, int i2) {
        this.timestamp = j2;
        this.sequenceNumber = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeasurementPoint measurementPoint = (MeasurementPoint) obj;
        return this.sequenceNumber == measurementPoint.sequenceNumber && this.timestamp == measurementPoint.timestamp;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i2 = this.sequenceNumber * 31;
        long j2 = this.timestamp;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "MeasurementPoint{sequenceNumber=" + this.sequenceNumber + ", timestamp=" + this.timestamp + AbstractJsonLexerKt.END_OBJ;
    }
}
