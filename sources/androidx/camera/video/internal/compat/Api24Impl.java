package androidx.camera.video.internal.compat;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* JADX INFO: loaded from: classes.dex */
public final class Api24Impl {
    private Api24Impl() {
    }

    public static int getTimestamp(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i2) {
        return audioRecord.getTimestamp(audioTimestamp, i2);
    }

    public static int getClientAudioSessionId(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }
}
