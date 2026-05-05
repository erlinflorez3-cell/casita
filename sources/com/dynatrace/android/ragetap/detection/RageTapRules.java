package com.dynatrace.android.ragetap.detection;

import com.dynatrace.android.agent.conf.RageTapConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class RageTapRules {
    private final RageTapConfiguration configuration;

    public RageTapRules(RageTapConfiguration rageTapConfiguration) {
        this.configuration = rageTapConfiguration;
    }

    public boolean exceedsDispersionRadius(TapData tapData, TapData tapData2) {
        float x2 = tapData2.getTapDown().getX() - tapData.getTapDown().getX();
        float y2 = tapData2.getTapDown().getY() - tapData.getTapDown().getY();
        return (x2 * x2) + (y2 * y2) > ((float) (this.configuration.getDispersionRadius() * this.configuration.getDispersionRadius()));
    }

    public boolean exceedsTapDuration(TapData tapData) {
        return tapData.getTapUp().getTimestamp() - tapData.getTapDown().getTimestamp() > ((long) this.configuration.getTapDuration());
    }

    public boolean exceedsTimespanDifference(TapData tapData, long j2) {
        return j2 - tapData.getTapUp().getTimestamp() > ((long) this.configuration.getTimespanDifference());
    }

    public boolean exceedsTimespanDifference(TapData tapData, TapData tapData2) {
        return exceedsTimespanDifference(tapData, tapData2.getTapDown().getTimestamp());
    }

    public boolean hasMinimumNumberOfTaps(int i2) {
        return i2 >= this.configuration.getMinimumNumberOfTaps();
    }
}
