package androidx.camera.core;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public interface CameraControl {
    ListenableFuture<Void> cancelFocusAndMetering();

    ListenableFuture<Void> enableTorch(boolean z2);

    ListenableFuture<Integer> setExposureCompensationIndex(int i2);

    ListenableFuture<Void> setLinearZoom(float f2);

    ListenableFuture<Void> setZoomRatio(float f2);

    ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);

    /* JADX INFO: loaded from: classes.dex */
    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }

        public OperationCanceledException(String str, Throwable th) {
            super(str, th);
        }
    }
}
