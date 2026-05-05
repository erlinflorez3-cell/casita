package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.impl.utils.Threads;

/* JADX INFO: loaded from: classes2.dex */
class PreviewViewMeteringPointFactory extends MeteringPointFactory {
    static final PointF INVALID_POINT = new PointF(2.0f, 2.0f);
    private Matrix mMatrix;
    private final PreviewTransformation mPreviewTransformation;
    private Rect mSensorRect = null;

    PreviewViewMeteringPointFactory(PreviewTransformation previewTransformation) {
        this.mPreviewTransformation = previewTransformation;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected PointF convertPoint(float f2, float f3) {
        float[] fArr = {f2, f3};
        synchronized (this) {
            Matrix matrix = this.mMatrix;
            if (matrix == null) {
                return INVALID_POINT;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    public void setSensorRect(Rect rect) {
        setSurfaceAspectRatio(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.mSensorRect = rect;
        }
    }

    void recalculate(Size size, int i2) {
        Rect rect;
        Threads.checkMainThread();
        synchronized (this) {
            if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = this.mSensorRect) == null) {
                this.mMatrix = null;
            } else {
                this.mMatrix = this.mPreviewTransformation.getPreviewViewToNormalizedSensorMatrix(size, i2, rect);
            }
        }
    }
}
