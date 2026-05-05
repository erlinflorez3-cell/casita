package androidx.camera.video;

import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class RecordingStats {
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();

    RecordingStats() {
    }

    static RecordingStats of(long j2, long j3, AudioStats audioStats) {
        Preconditions.checkArgument(j2 >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j3 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j2, j3, audioStats);
    }
}
