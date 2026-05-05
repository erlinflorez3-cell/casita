package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.ui.camera.CameraContract;

/* JADX INFO: loaded from: classes5.dex */
public class BaseValidationContract {

    public interface Presenter extends CameraContract.Presenter {
        void autoShutterTimerElapsed();

        IdScan.AutocaptureUXMode getAutocaptureUXMode();

        ValidationState getCurrentValidationState();

        IdScan.IdType getDetectedIdType();

        DocumentType getDocumentType();

        IdCategory getIdCategory();

        ValidationPhase getValidationPhase();

        boolean hasClassifierFoundID();

        void init(Intent intent);

        boolean isIdAutoCaptureEnabled();

        boolean isManualCaptureMode();

        @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
        void onDestroy();

        void setIdAutoCaptureEnabled(boolean z2);

        void setIdCaptureStarted();

        boolean showIdOverlay();

        void skipCurrentPhase();

        void uploadSavedScan();

        void userSelectedManualCapture();
    }

    public interface View extends CameraContract.View {
        @Override // com.incode.welcome_sdk.ui.BaseView
        void closeScreen();

        void enteredManualCaptureMode();

        Activity getActivity();

        Bitmap getCroppedBitmap(Bitmap bitmap, int i2);

        void hideAutocaptureUI();

        void initializeUiViews();

        boolean isVoiceOverActive();

        void onDocumentValidationCompleted(DocumentValidationResult documentValidationResult);

        void onIdOrientationChanged(IdOrientation idOrientation);

        void onImageTaken(Bitmap bitmap);

        void onShutterButtonPressed();

        void onUploadStarted(ValidationPhase validationPhase);

        void onValidationStateChanged(ValidationState validationState);

        void setShutterButtonVisible(boolean z2);

        void setUploadProgress(int i2);

        void showAutocaptureUI(long j2);

        void showCaptureHint();

        void showNoNetworkSnackbar();

        void showReviewActivity(DocumentType documentType);

        void userSelectedManualCapture();
    }
}
