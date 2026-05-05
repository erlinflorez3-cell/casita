package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {
    private final CameraInfo mCameraInfo;
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(Display display, CameraInfo cameraInfo, float f2, float f3) {
        this.mWidth = f2;
        this.mHeight = f3;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected PointF convertPoint(float f2, float f3) {
        float f4 = this.mWidth;
        float f5 = this.mHeight;
        boolean z2 = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z2);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f3 = f2;
            f2 = f3;
            f5 = f4;
            f4 = f5;
        }
        if (relativeCameraOrientation == 90) {
            f2 = f4 - f2;
        } else if (relativeCameraOrientation == 180) {
            f3 = f5 - f3;
            f2 = f4 - f2;
        } else if (relativeCameraOrientation == 270) {
            f3 = f5 - f3;
        }
        if (z2) {
            f3 = f5 - f3;
        }
        return new PointF(f3 / f5, f2 / f4);
    }

    private int getRelativeCameraOrientation(boolean z2) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z2 ? (360 - sensorRotationDegrees) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }
}
