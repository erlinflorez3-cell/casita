package com.dynatrace.android.ragetap.detection;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class TapData {
    private final TapEventData tapDown;
    private final TapEventData tapUp;

    public TapData(TapEventData tapEventData, TapEventData tapEventData2) {
        this.tapDown = tapEventData;
        this.tapUp = tapEventData2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TapData tapData = (TapData) obj;
        return this.tapDown.equals(tapData.tapDown) && this.tapUp.equals(tapData.tapUp);
    }

    public TapEventData getTapDown() {
        return this.tapDown;
    }

    public TapEventData getTapUp() {
        return this.tapUp;
    }

    public int hashCode() {
        return (this.tapDown.hashCode() * 31) + this.tapUp.hashCode();
    }

    public String toString() {
        return "TapData{tapDown=" + this.tapDown + ", tapUp=" + this.tapUp + AbstractJsonLexerKt.END_OBJ;
    }
}
