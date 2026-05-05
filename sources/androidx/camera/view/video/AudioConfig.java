package androidx.camera.view.video;

/* JADX INFO: loaded from: classes2.dex */
public class AudioConfig {
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    AudioConfig(boolean z2) {
        this.mIsAudioEnabled = z2;
    }

    public static AudioConfig create(boolean z2) {
        return new AudioConfig(z2);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }
}
