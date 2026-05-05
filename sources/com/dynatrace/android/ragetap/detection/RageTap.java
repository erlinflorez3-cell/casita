package com.dynatrace.android.ragetap.detection;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class RageTap {
    private final TapData firstTap;
    private final TapData lastTap;
    private final int numOfTaps;

    public RageTap(TapData tapData, TapData tapData2, int i2) {
        this.firstTap = tapData;
        this.lastTap = tapData2;
        this.numOfTaps = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RageTap rageTap = (RageTap) obj;
        return this.numOfTaps == rageTap.numOfTaps && this.firstTap.equals(rageTap.firstTap) && this.lastTap.equals(rageTap.lastTap);
    }

    public TapData getFirstTap() {
        return this.firstTap;
    }

    public TapData getLastTap() {
        return this.lastTap;
    }

    public int getNumOfTaps() {
        return this.numOfTaps;
    }

    public int hashCode() {
        return (((this.firstTap.hashCode() * 31) + this.lastTap.hashCode()) * 31) + this.numOfTaps;
    }

    public String toString() {
        return "RageTap{firstTap=" + this.firstTap + ", lastTap=" + this.lastTap + ", numOfTaps=" + this.numOfTaps + AbstractJsonLexerKt.END_OBJ;
    }
}
