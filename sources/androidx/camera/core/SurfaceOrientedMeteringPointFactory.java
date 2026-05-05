package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceOrientedMeteringPointFactory extends MeteringPointFactory {
    private final float mHeight;
    private final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float f2, float f3) {
        this.mWidth = f2;
        this.mHeight = f3;
    }

    public SurfaceOrientedMeteringPointFactory(float f2, float f3, UseCase useCase) {
        super(getUseCaseAspectRatio(useCase));
        this.mWidth = f2;
        this.mHeight = f3;
    }

    private static Rational getUseCaseAspectRatio(UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
        if (attachedSurfaceResolution == null) {
            throw new IllegalStateException("UseCase " + useCase + " is not bound.");
        }
        return new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected PointF convertPoint(float f2, float f3) {
        return new PointF(f2 / this.mWidth, f3 / this.mHeight);
    }
}
