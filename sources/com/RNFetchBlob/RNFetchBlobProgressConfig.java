package com.RNFetchBlob;

/* JADX INFO: loaded from: classes4.dex */
public class RNFetchBlobProgressConfig {
    private int count;
    private boolean enable;
    private int interval;
    private long lastTick = 0;
    private int tick = 0;
    private ReportType type;

    enum ReportType {
        Upload,
        Download
    }

    RNFetchBlobProgressConfig(boolean z2, int i2, int i3, ReportType reportType) {
        this.count = -1;
        this.interval = -1;
        this.enable = false;
        ReportType reportType2 = ReportType.Download;
        this.enable = z2;
        this.interval = i2;
        this.type = reportType;
        this.count = i3;
    }

    public boolean shouldReport(float f2) {
        int i2 = this.count;
        boolean z2 = false;
        boolean z3 = i2 <= 0 || f2 <= 0.0f || Math.floor((double) (f2 * ((float) i2))) > ((double) this.tick);
        if (System.currentTimeMillis() - this.lastTick > this.interval && this.enable && z3) {
            z2 = true;
        }
        if (z2) {
            this.tick++;
            this.lastTick = System.currentTimeMillis();
        }
        return z2;
    }
}
