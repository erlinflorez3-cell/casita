package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9377c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9378d = 1;
    private Pair<String, ResultsStatus> mOverallScore;

    b(Pair<String, ResultsStatus> pair) {
        this.mOverallScore = pair;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r5.mOverallScore != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r5.mOverallScore != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r1 = r2 + 53;
        com.incode.welcome_sdk.data.remote.beans.b.f9377c = r1 % 128;
        r1 = r1 % 2;
        r2 = java.lang.String.format("%s/100", r5.mOverallScore.first);
        r1 = com.incode.welcome_sdk.data.remote.beans.b.f9378d + 117;
        com.incode.welcome_sdk.data.remote.beans.b.f9377c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getOverallScore() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r2 = com.incode.welcome_sdk.data.remote.beans.b.f9378d
            int r1 = r2 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.b.f9377c = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L38
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r1 = r5.mOverallScore
            r0 = 82
            int r0 = r0 / 0
            if (r1 == 0) goto L3e
        L17:
            int r1 = r2 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.b.f9377c = r0
            int r1 = r1 % r4
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r0 = r5.mOverallScore
            F r0 = r0.first
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s/100"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            int r0 = com.incode.welcome_sdk.data.remote.beans.b.f9378d
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.b.f9377c = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L3d
            return r2
        L38:
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r0 = r5.mOverallScore
            if (r0 == 0) goto L3e
            goto L17
        L3d:
            throw r3
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.b.getOverallScore():java.lang.String");
    }

    public Pair<String, ResultsStatus> getOverallScoreAndResultStatus() {
        int i2 = 2 % 2;
        int i3 = f9378d + 19;
        f9377c = i3 % 128;
        int i4 = i3 % 2;
        Pair<String, ResultsStatus> pair = this.mOverallScore;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        return pair;
    }

    public int getOverallStatusIconResId() {
        int i2 = 2 % 2;
        int i3 = f9377c + 37;
        int i4 = i3 % 128;
        f9378d = i4;
        int i5 = i3 % 2;
        Pair<String, ResultsStatus> pair = this.mOverallScore;
        if (pair != null) {
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9377c = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                ResultsStatus resultsStatus = pair.second;
                obj.hashCode();
                throw null;
            }
            if (pair.second == null) {
                return 0;
            }
            int iconResId = this.mOverallScore.second.getIconResId();
            int i7 = f9377c + 45;
            f9378d = i7 % 128;
            if (i7 % 2 != 0) {
                return iconResId;
            }
            obj.hashCode();
            throw null;
        }
        return 0;
    }

    public int getOverallStatusColorResId() {
        int i2 = 2 % 2;
        Pair<String, ResultsStatus> pair = this.mOverallScore;
        if (pair != null) {
            int i3 = f9377c + 23;
            f9378d = i3 % 128;
            int i4 = i3 % 2;
            if (pair.second == null) {
                return 0;
            }
            int colorResId = this.mOverallScore.second.getColorResId();
            int i5 = f9378d + 19;
            f9377c = i5 % 128;
            int i6 = i5 % 2;
            return colorResId;
        }
        return 0;
    }

    public boolean getOverallStatusIsPositive() {
        int i2 = 2 % 2;
        int i3 = f9378d + 65;
        int i4 = i3 % 128;
        f9377c = i4;
        if (i3 % 2 == 0) {
            Pair<String, ResultsStatus> pair = this.mOverallScore;
            if (pair != null) {
                int i5 = i4 + 39;
                f9378d = i5 % 128;
                int i6 = i5 % 2;
                if (pair.second == null) {
                    return false;
                }
                return this.mOverallScore.second.isPositive();
            }
            return false;
        }
        throw null;
    }

    public boolean isManualCheckNeeded() {
        int i2 = 2 % 2;
        Pair<String, ResultsStatus> pair = this.mOverallScore;
        if (pair != null) {
            int i3 = f9377c + 27;
            f9378d = i3 % 128;
            if (i3 % 2 == 0) {
                ResultsStatus resultsStatus = pair.second;
                throw null;
            }
            if (pair.second != null) {
                boolean zIsManualCheckNeeded = this.mOverallScore.second.isManualCheckNeeded();
                int i4 = f9378d + 87;
                f9377c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 63 / 0;
                }
                return zIsManualCheckNeeded;
            }
        }
        return false;
    }
}
