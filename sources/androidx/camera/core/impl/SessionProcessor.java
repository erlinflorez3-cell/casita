package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface SessionProcessor {

    public interface CaptureCallback {
        default void onCaptureCompleted(long j2, int i2, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(int i2) {
        }

        default void onCaptureProcessProgressed(int i2) {
        }

        default void onCaptureProcessStarted(int i2) {
        }

        default void onCaptureSequenceAborted(int i2) {
        }

        default void onCaptureSequenceCompleted(int i2) {
        }

        default void onCaptureStarted(int i2, long j2) {
        }
    }

    void abortCapture(int i2);

    void deInitSession();

    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(RequestProcessor requestProcessor);

    void setParameters(Config config);

    int startCapture(boolean z2, TagBundle tagBundle, CaptureCallback captureCallback);

    int startRepeating(TagBundle tagBundle, CaptureCallback captureCallback);

    default int startTrigger(Config config, TagBundle tagBundle, CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    default Map<Integer, List<Size>> getSupportedPostviewSize(Size size) {
        return Collections.emptyMap();
    }

    default Set<Integer> getSupportedCameraOperations() {
        return Collections.emptySet();
    }
}
