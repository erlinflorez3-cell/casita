package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoRecordingContract {

    public interface Presenter {
        void concatAudioVideo(VideoSelfieResult videoSelfieResult);

        IScanStep<Object, Object> getPreviousStep();

        boolean isStarted();

        void onBackPressed();

        void onContinueClicked();

        void onCreate(boolean z2, boolean z3, VideoSelfie.SelfieMode selfieMode, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i2, ArrayList<VideoSelfieLocalQuestion> arrayList, boolean z13, boolean z14, String str, boolean z15, int i3, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20);

        void onDestroy();

        void onSpeechToTextTryAgainClicked();

        void onTapWhenDoneButtonClicked();

        void onVoiceConsentContinueClicked();

        void onVoiceConsentDialogTryAgain();

        void prepareVideoSelfieSteps();

        void publishResult(VideoSelfieResult videoSelfieResult);

        void restartAudioRecording();

        void setMinFaceWidth(float f2);

        void setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState voiceConsentFaceRecognitionState);

        void start();

        void tagRecordingSegmentROIStart();
    }

    public interface View extends CameraContract.View {
        void continueWithVoiceConsentAnswerProcess();

        void done();

        void finishVideoSelfieProgressStep(VideoSelfieScanState videoSelfieScanState);

        FacePositionConstraint getPositionConstraint();

        void hideCircleCameraOutline();

        void hidePassportOverlay();

        void hideProcessingUI();

        void onCompletedConcatAudioVideo(VideoSelfieResult videoSelfieResult);

        void onError(Throwable th);

        void onVoiceConsentTotalFailure(Throwable th);

        void playWaveformAnimation(boolean z2);

        void restartVoiceConsentUiOnStart();

        void setBackgroundFullscreenOverlayVisible(boolean z2);

        void setFeedbackBottomVisible(boolean z2);

        void setFeedbackCenterVisible(boolean z2);

        void setFeedbackIdVisible(boolean z2, int i2);

        void setFeedbackTopVisible(boolean z2, boolean z3);

        void setIdFrameColor(IdScan.IdType idType, UiState uiState, int i2);

        void setIdFrameVisible(IdScan.IdType idType, boolean z2, int i2);

        void setSelfieUIState(UiState uiState, int i2);

        void setSelfieUIVisible(boolean z2, Runnable runnable);

        void setTapToAnswerButtonText(int i2);

        void setTapToAnswerContentVisible(boolean z2);

        void setTapToAnswerLayoutVisible(boolean z2);

        void setTapToAnswerResultVisible(boolean z2);

        void setVoiceConsentCameraOverlay(boolean z2, Runnable runnable);

        void setVoiceConsentFaceMatchErrorUiState();

        void setVoiceConsentFaceRecognitionUiState(UiState uiState, int i2);

        void setVoiceConsentFaceRecognitionUiVisible(boolean z2);

        void setVoiceConsentPlaceholderFaceVisible(boolean z2);

        void setVoiceConsentRetryFaceRecognitionUiState();

        void setVoiceConsentText(String str);

        void setVoiceConsentUiDone(boolean z2);

        void setVoiceConsentUiVisible(boolean z2);

        void showAllDone();

        void showCircleCameraOutline();

        void showFeedbackBottom(int i2);

        void showFeedbackCenter(String str);

        void showFeedbackId(ValidationFeedback validationFeedback, int i2);

        void showNoNetworkMessage(VideoSelfieScanState videoSelfieScanState);

        void showPassportOverlay();

        void showProcessingUi();

        void showQuestion(String str, boolean z2);

        void showTextToSpeechInstructions();

        void startVideoSelfieProgressStep(VideoSelfieScanState videoSelfieScanState);

        void updateRecordingTimer(String str);
    }
}
