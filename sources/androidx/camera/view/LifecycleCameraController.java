package androidx.camera.view;

import android.content.Context;
import androidx.camera.core.Camera;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCameraController extends CameraController {
    private static final String TAG = "CamLifecycleController";
    private LifecycleOwner mLifecycleOwner;

    public LifecycleCameraController(Context context) {
        super(context);
    }

    LifecycleCameraController(Context context, ListenableFuture<ProcessCameraProviderWrapper> listenableFuture) {
        super(context, listenableFuture);
    }

    public void bindToLifecycle(LifecycleOwner lifecycleOwner) {
        Threads.checkMainThread();
        this.mLifecycleOwner = lifecycleOwner;
        startCameraAndTrackStates();
    }

    public void unbind() {
        Threads.checkMainThread();
        this.mLifecycleOwner = null;
        this.mCamera = null;
        if (this.mCameraProvider != null) {
            this.mCameraProvider.unbindAll();
        }
    }

    @Override // androidx.camera.view.CameraController
    Camera startCamera() {
        UseCaseGroup useCaseGroupCreateUseCaseGroup;
        if (this.mLifecycleOwner == null || this.mCameraProvider == null || (useCaseGroupCreateUseCaseGroup = createUseCaseGroup()) == null) {
            return null;
        }
        try {
            return this.mCameraProvider.bindToLifecycle(this.mLifecycleOwner, this.mCameraSelector, useCaseGroupCreateUseCaseGroup);
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e2);
        }
    }

    void shutDownForTests() {
        if (this.mCameraProvider != null) {
            this.mCameraProvider.shutdownAsync();
        }
    }
}
