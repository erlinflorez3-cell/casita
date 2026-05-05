package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AudioUtils {
    public static int channelCountToChannelConfig(int i2) {
        return i2 == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i2) {
        return i2 == 1 ? 16 : 12;
    }

    private AudioUtils() {
    }

    public static int getBytesPerFrame(int i2, int i3) {
        Preconditions.checkArgument(i3 > 0, "Invalid channel count: " + i3);
        if (i2 == 2) {
            return i3 * 2;
        }
        if (i2 == 3) {
            return i3;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i3 * 3;
            }
            if (i2 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i2);
            }
        }
        return i3 * 4;
    }

    public static long sizeToFrameCount(long j2, int i2) {
        long j3 = i2;
        Preconditions.checkArgument(j3 > 0, "bytesPerFrame must be greater than 0.");
        return j2 / j3;
    }

    public static long frameCountToSize(long j2, int i2) {
        long j3 = i2;
        Preconditions.checkArgument(j3 > 0, "bytesPerFrame must be greater than 0.");
        return j2 * j3;
    }

    public static long frameCountToDurationNs(long j2, int i2) {
        long j3 = i2;
        Preconditions.checkArgument(j3 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j2) / j3;
    }

    public static long computeInterpolatedTimeNs(int i2, long j2, AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i2) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j2 >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j2 - audioTimestamp.framePosition, i2);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }
}
