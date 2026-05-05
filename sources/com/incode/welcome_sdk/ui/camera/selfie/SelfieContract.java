package com.incode.welcome_sdk.ui.camera.selfie;

import android.content.Intent;
import android.graphics.Bitmap;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.results.FaceAuthenticationResult;
import com.incode.welcome_sdk.results.FaceLoginResult;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import kotlin.Deprecated;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfieContract {

    public interface Presenter extends CameraContract.Presenter {
        void checkDeviceEnvironment();

        FaceProcessingUtils.DetectionData getDetectionData();

        int getProcessingText();

        FaceProcessingUtils.DetectionData getSelfieDetectionResultNoConstraints(Bitmap bitmap, boolean z2);

        boolean isAutoCaptureEnabled();

        boolean isManualCaptureMode();

        void prepare();

        void publishResult(SelfieScanResult selfieScanResult);

        void setAllowFaceAuthModeFallback(boolean z2);

        void setAutoCaptureEnabled(boolean z2);

        void setAutoCaptureTimeout(int i2);

        void setCaptureAttempts(int i2);

        void setCustomerUUID(String str);

        void setFaceAuthMode(SelfieScan.FaceAuthMode faceAuthMode);

        void setFacePositionConstraint(FacePositionConstraint facePositionConstraint);

        @Deprecated(message = "use setFaceAuthMode() instead")
        void setFaceRecognitionMode(SelfieScan.FaceRecognitionMode faceRecognitionMode);

        void setIntent(Intent intent);

        void setLivenessDetectionMode(SelfieScan.LivenessDetectionMode livenessDetectionMode);

        void setMinFaceWidth(float f2);

        void setMode(SelfieActivity.SelfieScanModeExtended selfieScanModeExtended);

        void setStoreLocalAuthenticationEnabled(boolean z2);

        void setStreamFramesToken(String str);

        void startFaceDetection(boolean z2);

        void stopFaceDetection();
    }

    public interface View extends CameraContract.View {
        void enteredManualCaptureMode();

        boolean isVoiceOverActive();

        void onEnrollComplete(double d2, Boolean bool, String str, String str2, int i2, int i3, int i4, n.c cVar);

        void onEnrollError(int i2, int i3, n.c cVar, int i4, boolean z2);

        void onFaceAuthenticationComplete(FaceAuthenticationResult faceAuthenticationResult);

        void onFaceAuthenticationError(int i2, int i3, n.c cVar, int i4, boolean z2);

        void onFaceScanFailed(Throwable th);

        void onLoginComplete(boolean z2, boolean z3, Boolean bool, String str, String str2, FaceLoginResult faceLoginResult);

        void onMaskCheckComplete(boolean z2, String str, String str2);

        void onSelfieCaptureComplete(String str, String str2);

        void retryCapture();

        void setShutterButtonVisible(boolean z2);

        void showInfo(int i2);

        void showVerifyingTextInCameraLid();
    }
}
