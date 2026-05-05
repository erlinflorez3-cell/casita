package com.incode.welcome_sdk.ui.camera;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import io.reactivex.Single;

/* JADX INFO: loaded from: classes5.dex */
public class CameraContract {

    public interface Presenter {
        void createCameraSourceAndFaceProcessor(int i2);

        void enableProcessing(boolean z2);

        void error(Throwable th);

        Point getDesiredPreviewSize(boolean z2);

        Single<Integer> getIdealCaptureEnvironmentTestSingle();

        IncodeWelcomeRepository getRepository();

        boolean isCameraFocused();

        boolean isIdealCaptureEnvironmentTestInProgress();

        boolean isProcessingEnabled();

        void onCameraSizeParamsChanged(int i2, int i3, int i4, int i5, f.c cVar, int i6);

        void onDestroy();

        void onIdealCaptureEnvironmentFound();

        void onPause();

        void onPictureTaken(Bitmap bitmap);

        void onResume();

        void onStart(boolean z2, boolean z3);

        void processPreviewRawBitmap(Bitmap bitmap);

        void processPreviewRawFrame(byte[] bArr);

        void setCameraFacing(int i2);

        void setIdealCaptureEnvironmentTestInProgress(boolean z2);

        void takePicture();
    }

    public interface View extends BaseView, PermissionsMandatoryContract.View {
        void createCameraSource(int i2);

        Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestFallbackSingle();

        Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestSingle(int i2);

        int getCameraFacing();

        CameraPreview getCameraPreview();

        boolean isCameraPermissionGranted();

        void onBlurrinessUpdate(float f2, float f3);

        void onBrightnessValueUpdate(float f2, float f3);

        void onCameraPermissionGranted();

        void onCameraSourceCreated();

        void onDetectionResult(FaceProcessingUtils.FaceProcessingState faceProcessingState);

        void onPreviewLayoutChanged(int i2, int i3, int i4, int i5);

        void onPreviewRawFrame(byte[] bArr);

        void onPreviewStarted();

        void onReadyToCreateCamera();

        void onVideoRecordingPermissionDenied();

        void reconfigureCamera(int i2, Runnable runnable);

        void releaseCamera();

        void requestCameraPermission();

        void restartVideoRecording();

        void safeOnCreate(Bundle bundle, CameraPresenter cameraPresenter);

        Single<Integer> startIdealCaptureEnvironmentTest();

        void stopPreview(Runnable runnable);

        void stopVideoRecording();

        default Bitmap getLastCompleteFrame() {
            int i2 = 2 % 2;
            return null;
        }

        default boolean shouldProceedWithVideoLivenessFunction() {
            int i2 = 2 % 2;
            return false;
        }
    }
}
