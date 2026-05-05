package androidx.camera.core.impl;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface RequestProcessor {

    public interface Callback {
        default void onCaptureBufferLost(Request request, long j2, int i2) {
        }

        default void onCaptureCompleted(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(Request request, CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceAborted(int i2) {
        }

        default void onCaptureSequenceCompleted(int i2, long j2) {
        }

        default void onCaptureStarted(Request request, long j2, long j3) {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Request {
        Config getParameters();

        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(Request request, Callback callback);

    void stopRepeating();

    int submit(Request request, Callback callback);

    int submit(List<Request> list, Callback callback);
}
