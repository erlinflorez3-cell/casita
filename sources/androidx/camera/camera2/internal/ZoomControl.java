package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final String TAG = "ZoomControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final ZoomStateImpl mCurrentZoomState;
    private final Executor mExecutor;
    final ZoomImpl mZoomImpl;
    private final MutableLiveData<ZoomState> mZoomStateLiveData;
    private boolean mIsActive = false;
    private Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.mZoomImpl.onCaptureResult(totalCaptureResult);
            return false;
        }
    };

    interface ZoomImpl {
        void addRequestOption(Camera2ImplConfig.Builder builder);

        Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f2, CallbackToFutureAdapter.Completer<Void> completer);
    }

    ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        ZoomImpl zoomImplCreateZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        this.mZoomImpl = zoomImplCreateZoomImpl;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplCreateZoomImpl.getMaxZoom(), zoomImplCreateZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new MutableLiveData<>(ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    static ZoomState getDefaultZoomState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ZoomImpl zoomImplCreateZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplCreateZoomImpl.getMaxZoom(), zoomImplCreateZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return ImmutableZoomState.create(zoomStateImpl);
    }

    private static ZoomImpl createZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (isAndroidRZoomSupported(cameraCharacteristicsCompat)) {
            return new AndroidRZoomImpl(cameraCharacteristicsCompat);
        }
        return new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    static boolean isAndroidRZoomSupported(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return Build.VERSION.SDK_INT >= 30 && getZoomRatioRange(cameraCharacteristicsCompat) != null;
    }

    private static Range<Float> getZoomRatioRange(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        try {
            return (Range) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e2) {
            Logger.w(TAG, "AssertionError, fail to get camera characteristic.", e2);
            return null;
        }
    }

    void addZoomOption(Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    void setActive(boolean z2) {
        ZoomState zoomStateCreate;
        if (this.mIsActive == z2) {
            return;
        }
        this.mIsActive = z2;
        if (!z2) {
            synchronized (this.mCurrentZoomState) {
                this.mCurrentZoomState.setZoomRatio(1.0f);
                zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
            }
            updateLiveData(zoomStateCreate);
            this.mZoomImpl.resetZoom();
            this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
        }
    }

    ListenableFuture<Void> setZoomRatio(float f2) throws Throwable {
        final ZoomState zoomStateCreate;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(f2);
                zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e2) {
                return Futures.immediateFailedFuture(e2);
            }
        }
        updateLiveData(zoomStateCreate);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m126xc6d8bfa2(zoomStateCreate, completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setZoomRatio$1$androidx-camera-camera2-internal-ZoomControl, reason: not valid java name */
    /* synthetic */ Object m126xc6d8bfa2(final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m125xd613203(completer, zoomState);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submitCameraZoomRatio, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m125xd613203(CallbackToFutureAdapter.Completer<Void> completer, ZoomState zoomState) throws Throwable {
        ZoomState zoomStateCreate;
        if (!this.mIsActive) {
            synchronized (this.mCurrentZoomState) {
                this.mCurrentZoomState.setZoomRatio(1.0f);
                zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
            }
            updateLiveData(zoomStateCreate);
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), completer);
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    ListenableFuture<Void> setLinearZoom(float f2) throws Throwable {
        final ZoomState zoomStateCreate;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(f2);
                zoomStateCreate = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e2) {
                return Futures.immediateFailedFuture(e2);
            }
        }
        updateLiveData(zoomStateCreate);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m124x9f268096(zoomStateCreate, completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setLinearZoom$3$androidx-camera-camera2-internal-ZoomControl, reason: not valid java name */
    /* synthetic */ Object m124x9f268096(final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m123xe5aef2f7(completer, zoomState);
            }
        });
        return "setLinearZoom";
    }

    private void updateLiveData(ZoomState zoomState) throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        short sXd = (short) (C1499aX.Xd() ^ (-15261));
        short sXd2 = (short) (C1499aX.Xd() ^ (-16869));
        int[] iArr = new int["p~u\u0005\u0003}yD\u0007\fGf\u000b\f\u000e\u0004\u0012".length()];
        QB qb = new QB("p~u\u0005\u0003}yD\u0007\fGf\u000b\f\u000e\u0004\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.od("\u0018\u0015#z\u000e\u0015\u0019u\u0018\u0017\u0017\u000b\u0017", (short) (OY.Xd() ^ 3634)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                this.mZoomStateLiveData.setValue(zoomState);
            } else {
                this.mZoomStateLiveData.postValue(zoomState);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    LiveData<ZoomState> getZoomState() {
        return this.mZoomStateLiveData;
    }
}
