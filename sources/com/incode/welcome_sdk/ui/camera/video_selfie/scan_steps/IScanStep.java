package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import io.reactivex.Observable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IScanStep<T, S> {

    /* JADX INFO: renamed from: a */
    private static int f12294a = 0;

    /* JADX INFO: renamed from: d */
    private static int f12295d = 1;

    /* JADX INFO: renamed from: c */
    private int f12296c;

    /* JADX INFO: renamed from: e */
    private BaseView f12297e;

    public abstract void cleanup(Runnable runnable);

    public abstract boolean isComplete();

    public abstract boolean processesFrames();

    public abstract void showWinState();

    public abstract void start();

    private IScanStep() {
    }

    protected IScanStep(int i2, BaseView baseView) {
        this.f12296c = i2;
        this.f12297e = baseView;
    }

    public final int getCameraFacing() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f12294a;
        int i5 = i4 + 77;
        f12295d = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.f12296c;
            int i6 = 61 / 0;
        } else {
            i2 = this.f12296c;
        }
        int i7 = i4 + 23;
        f12295d = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isSkipped() {
        int i2 = 2 % 2;
        int i3 = f12294a + 77;
        f12295d = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public Point getDesiredPreviewSize(boolean z2) {
        return new Point(720, z2 ? 960 : 1280);
    }

    public Observable<ScanResult> findAndProcess(Bitmap bitmap, FacePositionConstraint facePositionConstraint, Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12294a + 47;
        f12295d = i3 % 128;
        int i4 = i3 % 2;
        ScanResult scanResult = ScanResult.OK;
        if (i4 != 0) {
            return Observable.just(scanResult);
        }
        Observable.just(scanResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void addProcessingErrorState(S s2) {
        int i2 = 2 % 2;
        int i3 = f12294a + 21;
        f12295d = i3 % 128;
        int i4 = i3 % 2;
    }

    public void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12294a + 103;
        f12295d = i3 % 128;
        int i4 = i3 % 2;
    }

    public void logProcessingEvents(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12295d + 79;
        f12294a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void showDoneStateWithError() {
        int i2 = 2 % 2;
        int i3 = f12294a + 65;
        f12295d = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onContinueClicked() {
        int i2 = 2 % 2;
        int i3 = f12295d + 47;
        f12294a = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean isWithinConstraints(Rect rect, FacePositionConstraint facePositionConstraint) {
        int i2 = 2 % 2;
        if (rect != null && !rect.isEmpty()) {
            if (facePositionConstraint == null) {
                return true;
            }
            if (rect.left >= facePositionConstraint.getMinX() && rect.right <= facePositionConstraint.getMaxX()) {
                int i3 = f12294a + 25;
                f12295d = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = rect.top;
                    facePositionConstraint.getMinY();
                    throw null;
                }
                if (rect.top >= facePositionConstraint.getMinY()) {
                    int i5 = f12295d + 107;
                    f12294a = i5 % 128;
                    int i6 = i5 % 2;
                    if (rect.bottom <= facePositionConstraint.getMaxY()) {
                        int i7 = f12294a + 47;
                        f12295d = i7 % 128;
                        int i8 = i7 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void showRealtimeFeedback(S s2) {
        int i2 = 2 % 2;
        int i3 = f12295d + 117;
        f12294a = i3 % 128;
        int i4 = i3 % 2;
    }
}
