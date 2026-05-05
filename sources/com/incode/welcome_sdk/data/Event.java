package com.incode.welcome_sdk.data;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Event extends Enum<Event> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Event[] $VALUES;
    private final String value;
    public static final Event SDK_INFO = new Event("SDK_INFO", 0, "sdkInfo");
    public static final Event ERROR = new Event("ERROR", 1, "error");
    public static final Event USER_CANCELLED = new Event("USER_CANCELLED", 2, "userCancelled");
    public static final Event CLOSE_BUTTON_PRESSED = new Event("CLOSE_BUTTON_PRESSED", 3, "closeButtonPressed");
    public static final Event BACKGROUND = new Event("BACKGROUND", 4, AppStateModule.APP_STATE_BACKGROUND);
    public static final Event FOREGROUND = new Event("FOREGROUND", 5, "foreground");
    public static final Event CONTINUE = new Event("CONTINUE", 6, "continue");
    public static final Event VIDEO_RECORDING_ERROR = new Event("VIDEO_RECORDING_ERROR", 7, "videoRecordingError");
    public static final Event INTRO = new Event("INTRO", 8, "intro");
    public static final Event CLOSE_INTRO = new Event("CLOSE_INTRO", 9, "closeIntro");
    public static final Event PHONE_CHANGE_CLICKED = new Event("PHONE_CHANGE_CLICKED", 10, "changePhoneClicked");
    public static final Event EMAIL_CHANGE_CLICKED = new Event("EMAIL_CHANGE_CLICKED", 11, "changeEmailClicked");
    public static final Event OTP_SUBMITTED = new Event("OTP_SUBMITTED", 12, "otpSubmitted");
    public static final Event OTP_TRY_AGAIN_CLICKED = new Event("OTP_TRY_AGAIN_CLICKED", 13, "tryAgainOTPClicked");
    public static final Event OTP_CORRECT_ENTERED = new Event("OTP_CORRECT_ENTERED", 14, "correctOTPEntered");
    public static final Event OTP_WRONG_ENTERED = new Event("OTP_WRONG_ENTERED", 15, "wrongOTPEntered");
    public static final Event START_ID_CAPTURE = new Event("START_ID_CAPTURE", 16, "startIdCapture");
    public static final Event TUTORIAL_FRONT_ID = new Event("TUTORIAL_FRONT_ID", 17, "tutorialFrontId");
    public static final Event CAMERA_FRONT_ID = new Event("CAMERA_FRONT_ID", 18, "cameraFrontId");
    public static final Event NEED_HELP_FRONT_ID = new Event("NEED_HELP_FRONT_ID", 19, "needHelpFrontId");
    public static final Event CLOSE_NEED_HELP_FRONT_ID = new Event("CLOSE_NEED_HELP_FRONT_ID", 20, "closeNeedHelpFrontId");
    public static final Event RETAKE_TRY_AGAIN = new Event("RETAKE_TRY_AGAIN", 21, "retakeTryAgain");
    public static final Event RETAKE_CONTINUE = new Event("RETAKE_CONTINUE", 22, "retakeContinue");
    public static final Event TUTORIAL_BACK_ID = new Event("TUTORIAL_BACK_ID", 23, "tutorialBackId");
    public static final Event CAMERA_BACK_ID = new Event("CAMERA_BACK_ID", 24, "cameraBackId");
    public static final Event NEED_HELP_BACK_ID = new Event("NEED_HELP_BACK_ID", 25, "needHelpBackId");
    public static final Event CLOSE_NEED_HELP_BACK_ID = new Event("CLOSE_NEED_HELP_BACK_ID", 26, "closeNeedHelpBackId");
    public static final Event SWITCH_TO_MANUAL_CAPTURE_FRONT_ID = new Event("SWITCH_TO_MANUAL_CAPTURE_FRONT_ID", 27, "switchToManualCaptureFrontId");
    public static final Event SWITCH_TO_MANUAL_CAPTURE_BACK_ID = new Event("SWITCH_TO_MANUAL_CAPTURE_BACK_ID", 28, "switchToManualCaptureBackId");
    public static final Event SWITCH_TO_MANUAL_CAPTURE_SELFIE = new Event("SWITCH_TO_MANUAL_CAPTURE_SELFIE", 29, "switchToManualCaptureSelfie");
    public static final Event TUTORIAL_PASSPORT = new Event("TUTORIAL_PASSPORT", 30, "tutorialPassport");
    public static final Event CAMERA_PASSPORT = new Event("CAMERA_PASSPORT", 31, "cameraPassport");
    public static final Event PASSPORT_CLICKED = new Event("PASSPORT_CLICKED", 32, "passportClicked");
    public static final Event CLICKED_DONT_ALLOW = new Event("CLICKED_DONT_ALLOW", 33, "clickedDontAllow");
    public static final Event CLICKED_ALLOW = new Event("CLICKED_ALLOW", 34, "clickedAllow");
    public static final Event CLICKED_QUIT = new Event("CLICKED_QUIT", 35, "clickedQuit");
    public static final Event CLICKED_OPEN_SETTINGS = new Event("CLICKED_OPEN_SETTINGS", 36, "clickedOpenSettings");
    public static final Event ID_CLICKED = new Event("ID_CLICKED", 37, "idClicked");
    public static final Event CLICK_SCAN = new Event("CLICK_SCAN", 38, "clickScan");
    public static final Event START_SECOND_ID_CAPTURE = new Event("START_SECOND_ID_CAPTURE", 39, "startSecondIdCapture");
    public static final Event TUTORIAL_FRONT_SECOND_ID = new Event("TUTORIAL_FRONT_SECOND_ID", 40, "tutorialFrontSecondId");
    public static final Event CAMERA_FRONT_SECOND_ID = new Event("CAMERA_FRONT_SECOND_ID", 41, "cameraFrontSecondId");
    public static final Event NEED_HELP_FRONT_SECOND_ID = new Event("NEED_HELP_FRONT_SECOND_ID", 42, "needHelpFrontSecondId");
    public static final Event CLOSE_NEED_HELP_FRONT_SECOND_ID = new Event("CLOSE_NEED_HELP_FRONT_SECOND_ID", 43, "closeNeedHelpFrontSecondId");
    public static final Event TUTORIAL_BACK_SECOND_ID = new Event("TUTORIAL_BACK_SECOND_ID", 44, "tutorialBackSecondId");
    public static final Event CAMERA_BACK_SECOND_ID = new Event("CAMERA_BACK_SECOND_ID", 45, "cameraBackSecondId");
    public static final Event NEED_HELP_BACK_SECOND_ID = new Event("NEED_HELP_BACK_SECOND_ID", 46, "needHelpBackSecondId");
    public static final Event CLOSE_NEED_HELP_BACK_SECOND_ID = new Event("CLOSE_NEED_HELP_BACK_SECOND_ID", 47, "closeNeedHelpBackSecondId");
    public static final Event TUTORIAL_SECOND_PASSPORT = new Event("TUTORIAL_SECOND_PASSPORT", 48, "tutorialSecondPassport");
    public static final Event CAMERA_SECOND_PASSPORT = new Event("CAMERA_SECOND_PASSPORT", 49, "cameraSecondPassport");
    public static final Event NEED_HELP_QR_SCAN = new Event("NEED_HELP_QR_SCAN", 50, "needHelpQrScan");
    public static final Event CLOSE_NEED_HELP_QR_SCAN = new Event("CLOSE_NEED_HELP_QR_SCAN", 51, "closeNeedHelpQrScan");
    public static final Event START_SELFIE = new Event("START_SELFIE", 52, "startSelfie");
    public static final Event TUTORIAL_SELFIE = new Event("TUTORIAL_SELFIE", 53, "tutorialSelfie");
    public static final Event CAMERA_SELFIE = new Event("CAMERA_SELFIE", 54, "cameraSelfie");
    public static final Event LOCAL_LIVENESS_FAILED = new Event("LOCAL_LIVENESS_FAILED", 55, "localLivenessFailed");
    public static final Event TUTORIAL_DOCUMENT_VALIDATION = new Event("TUTORIAL_DOCUMENT_VALIDATION", 56, "tutorialDocumentValidation");
    public static final Event START_DOCUMENT_VALIDATION = new Event("START_DOCUMENT_VALIDATION", 57, "startDocumentValidation");
    public static final Event NEED_HELP_DOCUMENT_VALIDATION = new Event("NEED_HELP_DOCUMENT_VALIDATION", 58, "needHelpDocumentValidation");
    public static final Event CLOSE_NEED_HELP_DOCUMENT_VALIDATION = new Event("CLOSE_NEED_HELP_DOCUMENT_VALIDATION", 59, "closeNeedHelpDocumentValidation");
    public static final Event TUTORIAL_VIDEO_SELFIE = new Event("TUTORIAL_VIDEO_SELFIE", 60, "tutorialVideoSelfie");
    public static final Event START_OTP = new Event("START_OTP", 61, "startOtp");
    public static final Event START_VIDEO_CONFERENCE = new Event("START_VIDEO_CONFERENCE", 62, "startVideoConference");
    public static final Event CONFERENCE_USER_FIRST_IN_QUEUE = new Event("CONFERENCE_USER_FIRST_IN_QUEUE", 63, "userFirstInQueue");
    public static final Event CONFERENCE_USER_STREAM_SHOWN = new Event("CONFERENCE_USER_STREAM_SHOWN", 64, "userStreamShown");
    public static final Event CONFERENCE_EXECUTIVE_STREAM_SHOWN = new Event("CONFERENCE_EXECUTIVE_STREAM_SHOWN", 65, "webExecutiveStreamShown");
    public static final Event START_FRONT_ID_SCAN_SCREEN_RECORDING = new Event("START_FRONT_ID_SCAN_SCREEN_RECORDING", 66, "startFrontIdScanScreenRecording");
    public static final Event START_BACK_ID_SCAN_SCREEN_RECORDING = new Event("START_BACK_ID_SCAN_SCREEN_RECORDING", 67, "startBackIdScanScreenRecording");
    public static final Event START_SELFIE_SCAN_SCREEN_RECORDING = new Event("START_SELFIE_SCAN_SCREEN_RECORDING", 68, "startSelfieScanScreenRecording");
    public static final Event FINISH_GPT_SIGN_UP = new Event("FINISH_GPT_SIGN_UP", 69, "finishGptSignup");
    public static final Event START_VIDEO_SELFIE = new Event("START_VIDEO_SELFIE", 70, "startVideoSelfie");
    public static final Event VIDEO_SELFIE_SELFIE_MATCHED = new Event("VIDEO_SELFIE_SELFIE_MATCHED", 71, "videoSelfieSelfieMatched");
    public static final Event VIDEO_SELFIE_ID_FRONT_DETECTED = new Event("VIDEO_SELFIE_ID_FRONT_DETECTED", 72, "videoSelfieIdFrontDetected");
    public static final Event VIDEO_SELFIE_ID_BACK_DETECTED = new Event("VIDEO_SELFIE_ID_BACK_DETECTED", 73, "videoSelfieIdBackDetected");
    public static final Event VIDEO_SELFIE_PASSPORT_DETECTED = new Event("VIDEO_SELFIE_PASSPORT_DETECTED", 74, "videoSelfiePassportDetected");
    public static final Event VIDEO_SELFIE_POA_SCANNED = new Event("VIDEO_SELFIE_POA_SCANNED", 75, "videoSelfiePoaScanned");
    public static final Event VIDEO_SELFIE_QUESTION_X_ANSWERED = new Event("VIDEO_SELFIE_QUESTION_X_ANSWERED", 76, "videoSelfieQuestion%dAnswered");
    public static final Event VIDEO_SELFIE_TOS_ACCEPTED = new Event("VIDEO_SELFIE_TOS_ACCEPTED", 77, "videoSelfieTosAccepted");
    public static final Event VIDEO_SELFIE_TOS_NOT_ACCEPTED = new Event("VIDEO_SELFIE_TOS_NOT_ACCEPTED", 78, "videoSelfieTosNotAccepted");
    public static final Event VIDEO_SELFIE_FACE_PROCESSING_STATES = new Event("VIDEO_SELFIE_FACE_PROCESSING_STATES", 79, "videoSelfieFaceProcessingStates");
    public static final Event VIDEO_SELFIE_ID_FRONT_PROCESSING_STATES = new Event("VIDEO_SELFIE_ID_FRONT_PROCESSING_STATES", 80, "videoSelfieIdFrontProcessingStates");
    public static final Event VIDEO_SELFIE_ID_BACK_PROCESSING_STATES = new Event("VIDEO_SELFIE_ID_BACK_PROCESSING_STATES", 81, "videoSelfieIdBackProcessingStates");
    public static final Event VIDEO_SELFIE_PASSPORT_PROCESSING_STATES = new Event("VIDEO_SELFIE_PASSPORT_PROCESSING_STATES", 82, "videoSelfiePassportProcessingStates");
    public static final Event VIDEO_SELFIE_BACK_ID_UPLOAD_PROGRESS = new Event("VIDEO_SELFIE_BACK_ID_UPLOAD_PROGRESS", 83, "videoSelfieBackIDUploadProgress");
    public static final Event VIDEO_SELFIE_BACK_ID_UPLOAD_SUCCEEDED = new Event("VIDEO_SELFIE_BACK_ID_UPLOAD_SUCCEEDED", 84, "videoSelfieBackIDUploadSucceeded");
    public static final Event VIDEO_SELFIE_BACK_ID_ATTEMPT_FAILED = new Event("VIDEO_SELFIE_BACK_ID_ATTEMPT_FAILED", 85, "videoSelfieBackIDAttemptFailed");
    public static final Event VIDEO_SELFIE_FACE_CAPTURE = new Event("VIDEO_SELFIE_FACE_CAPTURE", 86, "videoSelfieFaceCapture");
    public static final Event VIDEO_SELFIE_FACE_UPLOAD_PROGRESS = new Event("VIDEO_SELFIE_FACE_UPLOAD_PROGRESS", 87, "videoSelfieFaceUploadProgress");
    public static final Event VIDEO_SELFIE_FACE_ATTEMPT_FAILED = new Event("VIDEO_SELFIE_FACE_ATTEMPT_FAILED", 88, "videoSelfieFaceAttemptFailed");
    public static final Event VIDEO_SELFIE_FACE_UPLOAD_SUCCEEDED = new Event("VIDEO_SELFIE_FACE_UPLOAD_SUCCEEDED", 89, "videoSelfieFaceUploadSucceeded");
    public static final Event VIDEO_SELFIE_FRONT_ID_CAPTURE = new Event("VIDEO_SELFIE_FRONT_ID_CAPTURE", 90, "videoSelfieFrontIDCapture");
    public static final Event VIDEO_SELFIE_FRONT_ID_UPLOAD_PROGRESS = new Event("VIDEO_SELFIE_FRONT_ID_UPLOAD_PROGRESS", 91, "videoSelfieFrontIDUploadProgress");
    public static final Event VIDEO_SELFIE_FRONT_ID_UPLOAD_SUCCEEDED = new Event("VIDEO_SELFIE_FRONT_ID_UPLOAD_SUCCEEDED", 92, "videoSelfieFrontIDUploadSucceeded");
    public static final Event VIDEO_SELFIE_FRONT_ID_ATTEMPT_FAILED = new Event("VIDEO_SELFIE_FRONT_ID_ATTEMPT_FAILED", 93, "videoSelfieFrontIDAttemptFailed");
    public static final Event VIDEO_SELFIE_BACK_ID_CAPTURE = new Event("VIDEO_SELFIE_BACK_ID_CAPTURE", 94, "videoSelfieBackIDCapture");
    public static final Event VIDEO_SELFIE_DOCUMENT_CAPTURE = new Event("VIDEO_SELFIE_DOCUMENT_CAPTURE", 95, "videoSelfieDocumentCapture");
    public static final Event VIDEO_SELFIE_VIDEO_LINK_GENERATED = new Event("VIDEO_SELFIE_VIDEO_LINK_GENERATED", 96, "videoSelfieVideoLinkGenerated");
    public static final Event VIDEO_SELFIE_VIDEO_INFO = new Event("VIDEO_SELFIE_VIDEO_INFO", 97, "videoSelfieVideoInfo");
    public static final Event VIDEO_SELFIE_VIDEO_UPLOADED = new Event("VIDEO_SELFIE_VIDEO_UPLOADED", 98, "videoSelfieVideoUploaded");
    public static final Event VIDEO_SELFIE_VIDEO_UPLOAD_ERROR = new Event("VIDEO_SELFIE_VIDEO_UPLOAD_ERROR", 99, "videoSelfieVideoUploadError");
    public static final Event FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED = new Event("FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED", 100, "frontIdScanScreenRecordVideoLinkGenerated");
    public static final Event BACK_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED = new Event("BACK_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED", 101, "backIdScanScreenRecordVideoLinkGenerated");
    public static final Event SELFIE_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED = new Event("SELFIE_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED", 102, "selfieScanScreenRecordVideoLinkGenerated");
    public static final Event FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED = new Event("FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED", 103, "frontIdScanScreenRecordVideoUploaded");
    public static final Event BACK_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED = new Event("BACK_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED", 104, "backIdScanScreenRecordVideoUploaded");
    public static final Event SELFIE_SCAN_SCREEN_RECORD_VIDEO_UPLOADED = new Event("SELFIE_SCAN_SCREEN_RECORD_VIDEO_UPLOADED", 105, "selfieScanScreenRecordVideoUploaded");
    public static final Event SCREEN_RECORD_VIDEO_UPLOAD_ERROR = new Event("SCREEN_RECORD_VIDEO_UPLOAD_ERROR", 106, "screenRecordVideoUploadError");
    public static final Event EMULATOR_DETECTION_DISABLED = new Event("EMULATOR_DETECTION_DISABLED", 107, "emulatorDetectionDisabled");
    public static final Event ROOT_DETECTION_DISABLED = new Event("ROOT_DETECTION_DISABLED", 108, "rootDetectionDisabled");
    public static final Event HOOK_DETECTION_DISABLED = new Event("HOOK_DETECTION_DISABLED", 109, "hookDetectionDisabled");
    public static final Event VIRTUAL_ENVIRONMENT_DETECTION_DISABLED = new Event("VIRTUAL_ENVIRONMENT_DETECTION_DISABLED", 110, "virtualEnvironmentDetectionDisabled");
    public static final Event EXIT_CONFIRM = new Event("EXIT_CONFIRM", 111, "exitConfirm");
    public static final Event EXIT_CTA_TAPPED = new Event("EXIT_CTA_TAPPED", PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, "ctaTapped");
    public static final Event EXTERNAL_APP_SESSION_START = new Event("EXTERNAL_APP_SESSION_START", 113, "externalAppSessionStart");
    public static final Event EXTERNAL_SCREEN_VIEWED = new Event("EXTERNAL_SCREEN_VIEWED", 114, "externalScreenViewed");
    public static final Event NFC_OCR_SCREEN_OPENED = new Event("NFC_OCR_SCREEN_OPENED", 115, "nfcOcrScreenOpened");
    public static final Event NFC_OCR_INFO_UPDATED = new Event("NFC_OCR_INFO_UPDATED", 116, "nfcOcrInfoUpdated");
    public static final Event NFC_SYMBOL_CHECK_SCREEN_OPENED = new Event("NFC_SYMBOL_CHECK_SCREEN_OPENED", 117, "nfcSymbolCheckScreenOpened");
    public static final Event NFC_SYMBOL_CHECK_BTN_NO = new Event("NFC_SYMBOL_CHECK_BTN_NO", 118, "nfcSymbolCheckBtnNo");
    public static final Event NFC_SYMBOL_CHECK_BTN_YES = new Event("NFC_SYMBOL_CHECK_BTN_YES", PanasonicMakernoteDirectory.TAG_BURST_SPEED, "nfcSymbolCheckBtnYes");
    public static final Event NFC_INTRO_TUTORIAL_SCREEN_OPENED = new Event("NFC_INTRO_TUTORIAL_SCREEN_OPENED", 120, "nfcIntroTutorialScreenOpened");
    public static final Event NFC_INTRO_TUTORIAL_BTN_START_SCANNING = new Event("NFC_INTRO_TUTORIAL_BTN_START_SCANNING", 121, "nfcIntroTutorialBtnStartScanning");
    public static final Event NFC_SCAN_BTN_CANCEL = new Event("NFC_SCAN_BTN_CANCEL", 122, "nfcScanBtnCancel");
    public static final Event NFC_SCAN_UPLOAD_STARTED = new Event("NFC_SCAN_UPLOAD_STARTED", 123, "nfcScanUploadStarted");
    public static final Event NFC_SCAN_SUCCESS_SCREEN = new Event("NFC_SCAN_SUCCESS_SCREEN", 124, "nfcScanSuccessScreen");
    public static final Event NFC_SCAN_FAILURE_SCREEN = new Event("NFC_SCAN_FAILURE_SCREEN", 125, "nfcScanFailureScreen");
    public static final Event NFC_SCAN_FAILURE_SCREEN_BTN_CONTINUE = new Event("NFC_SCAN_FAILURE_SCREEN_BTN_CONTINUE", 126, "nfcScanFailureScreenBtnContinue");
    public static final Event NFC_UNHAPPY_TUTORIAL_SCREEN_ONE_OPENED = new Event("NFC_UNHAPPY_TUTORIAL_SCREEN_ONE_OPENED", 127, "nfcUnhappyTutorialScreenOneOpened");
    public static final Event NFC_UNHAPPY_TUTORIAL_SCREEN_TWO_OPENED = new Event("NFC_UNHAPPY_TUTORIAL_SCREEN_TWO_OPENED", 128, "nfcUnhappyTutorialScreenTwoOpened");
    public static final Event NFC_UNHAPPY_TUTORIAL_SCREEN_THREE_OPENED = new Event("NFC_UNHAPPY_TUTORIAL_SCREEN_THREE_OPENED", 129, "nfcUnhappyTutorialScreenThreeOpened");
    public static final Event NFC_UNHAPPY_TUTORIAL_SCREEN_FOUR_OPENED = new Event("NFC_UNHAPPY_TUTORIAL_SCREEN_FOUR_OPENED", 130, "nfcUnhappyTutorialScreenFourOpened");
    public static final Event NFC_UNHAPPY_TUTORIAL_HELP_OPENED = new Event("NFC_UNHAPPY_TUTORIAL_HELP_OPENED", 131, "nfcUnhappyTutorialHelpOpened");
    public static final Event NFC_UNHAPPY_TUTORIAL_HELP_CLOSED = new Event("NFC_UNHAPPY_TUTORIAL_HELP_CLOSED", 132, "nfcUnhappyTutorialHelpClosed");
    public static final Event NFC_UNHAPPY_TUTORIAL_BTN_START_SCANNING = new Event("NFC_UNHAPPY_TUTORIAL_BTN_START_SCANNING", 133, "nfcUnhappyTutorialBtnStartScanning");
    public static final Event NFC_NOT_SUPPORTED_ON_DEVICE = new Event("NFC_NOT_SUPPORTED_ON_DEVICE", 134, "nfcNotSupportedOnDevice");
    public static final Event NFC_MISSING_PERMISSION_SCREEN = new Event("NFC_MISSING_PERMISSION_SCREEN", 135, "nfcMissingPermissionScreen");
    public static final Event NFC_MISSING_PERMISSION_SCREEN_BTN_OPEN_SETTINGS = new Event("NFC_MISSING_PERMISSION_SCREEN_BTN_OPEN_SETTINGS", 136, "nfcMissingPermissionScreenBtnOpenSettings");
    public static final Event MODULE_OPENED = new Event("MODULE_OPENED", 137, "moduleOpened");
    public static final Event MODULE_CLOSED = new Event("MODULE_CLOSED", 138, "moduleClosed");
    public static final Event SCREEN_OPENED = new Event("SCREEN_OPENED", 139, "screenOpened");
    public static final Event SCREEN_CLOSED = new Event("SCREEN_CLOSED", 140, "screenClosed");
    public static final Event FRONT_ID_DETECTED = new Event("FRONT_ID_DETECTED", 141, "frontIdDetected");
    public static final Event BACK_ID_DETECTED = new Event("BACK_ID_DETECTED", 142, "backIdDetected");
    public static final Event NFC_SCAN_FAILURE = new Event("NFC_SCAN_FAILURE", 143, "nfcScanFailure");
    public static final Event NFC_DONT_MOVE_SCREEN = new Event("NFC_DONT_MOVE_SCREEN", 144, "nfcDontMoveScreen");
    public static final Event EKYB_SUCCEEDED = new Event("EKYB_SUCCEEDED", 145, "eKYBSucceeded");
    public static final Event EKYB_FAILED = new Event("EKYB_FAILED", 146, "eKYBFailed");
    public static final Event SELFIE_UPLOAD_PROGRESS = new Event("SELFIE_UPLOAD_PROGRESS", 147, "selfieUploadProgress");
    public static final Event SELFIE_ATTEMPT_FAILED = new Event("SELFIE_ATTEMPT_FAILED", 148, "selfieAttemptFailed");
    public static final Event SELFIE_UPLOAD_SUCCEEDED = new Event("SELFIE_UPLOAD_SUCCEEDED", 149, "selfieUploadSucceeded");
    public static final Event FACE_AUTHENTICATION_SUCCEEDED = new Event("FACE_AUTHENTICATION_SUCCEEDED", 150, "faceAuthenticationSucceeded");
    public static final Event FACE_AUTHENTICATION_FAILED = new Event("FACE_AUTHENTICATION_FAILED", 151, "faceAuthenticationFailed");
    public static final Event CURP_VALIDATION_PROGRESS = new Event("CURP_VALIDATION_PROGRESS", 152, "curpValidationProgress");
    public static final Event CURP_VALIDATION_FAILED = new Event("CURP_VALIDATION_FAILED", 153, "curpValidationFailed");
    public static final Event CURP_VALIDATION_SUCCEEDED = new Event("CURP_VALIDATION_SUCCEEDED", 154, "curpValidationSucceeded");
    public static final Event BACK_ID_UPLOAD_SUCCEEDED = new Event("BACK_ID_UPLOAD_SUCCEEDED", 155, "backIDUploadSucceeded");
    public static final Event BACK_ID_ATTEMPT_FAILED = new Event("BACK_ID_ATTEMPT_FAILED", 156, "backIDAttemptFailed");
    public static final Event FRONT_ID_UPLOAD_SUCCEEDED = new Event("FRONT_ID_UPLOAD_SUCCEEDED", 157, "frontIDUploadSucceeded");
    public static final Event HINT_SHOWED = new Event("HINT_SHOWED", 158, "hintShowed");
    public static final Event SCAN_RETAKE_CLICKED = new Event("SCAN_RETAKE_CLICKED", 159, "scanRetakeClicked");
    public static final Event SCAN_UPLOAD_RETRY_CLICKED = new Event("SCAN_UPLOAD_RETRY_CLICKED", 160, "scanUploadRetryClicked");
    public static final Event SCAN_BACK_CLICKED = new Event("SCAN_BACK_CLICKED", 161, "scanBackClicked");
    public static final Event SCAN_FRONT_CLICKED = new Event("SCAN_FRONT_CLICKED", 162, "scanFrontClicked");
    public static final Event CONTINUE_CLICKED = new Event("CONTINUE_CLICKED", 163, "continueClicked");
    public static final Event MANUAL_CAPTURE_SCAN = new Event("MANUAL_CAPTURE_SCAN", 164, "manualCaptureScan");
    public static final Event CLICK_MANUAL_SCAN = new Event("CLICK_MANUAL_SCAN", 165, "clickManualScan");
    public static final Event SWITCHED_ORIENTATION = new Event("SWITCHED_ORIENTATION", 166, "switchedOrientation");
    public static final Event CORRECTION_FEEDBACK = new Event("CORRECTION_FEEDBACK", 167, "correctionFeedback");
    public static final Event FRONT_ID_ATTEMPT_FAILED = new Event("FRONT_ID_ATTEMPT_FAILED", 168, "frontIDAttemptFailed");
    public static final Event GOVERNMENT_VALIDATION_SUCCEEDED = new Event("GOVERNMENT_VALIDATION_SUCCEEDED", 169, "governmentValidationSucceeded");
    public static final Event GOVERNMENT_VALIDATION_FAILED = new Event("GOVERNMENT_VALIDATION_FAILED", 170, "governmentValidationFailed");
    public static final Event DOCUMENT_UPLOAD_SUCCEEDED = new Event("DOCUMENT_UPLOAD_SUCCEEDED", 171, "documentUploadSucceeded");
    public static final Event DOCUMENT_ATTEMPT_FAILED = new Event("DOCUMENT_ATTEMPT_FAILED", 172, "documentAttemptFailed");
    public static final Event INCODE_WATCHLIST_VALIDATION_FAILED = new Event("INCODE_WATCHLIST_VALIDATION_FAILED", 173, "incodeWatchlistValidationFailed");
    public static final Event INCODE_WATCHLIST_VALIDATION_SUCCEEDED = new Event("INCODE_WATCHLIST_VALIDATION_SUCCEEDED", 174, "incodeWatchlistValidationSucceeded");
    public static final Event CAPTURE_ATTEMPT_FINISHED = new Event("CAPTURE_ATTEMPT_FINISHED", 175, "captureAttemptFinished");
    public static final Event STR_SESSION_DID_CONNECT = new Event("STR_SESSION_DID_CONNECT", 176, "strSessionDidConnect");
    public static final Event STR_SESSION_DID_DISCONNECT = new Event("STR_SESSION_DID_DISCONNECT", 177, "strSessionDidDisconnect");
    public static final Event STR_SESSION_DID_FAIL_WITH_ERROR = new Event("STR_SESSION_DID_FAIL_WITH_ERROR", 178, "strSessionDidFailWithError");
    public static final Event STR_STREAM_PUBLISHER_CREATED = new Event("STR_STREAM_PUBLISHER_CREATED", 179, "strStreamPublisherCreated");
    public static final Event STR_STREAM_PUBLISHER_DESTROYED = new Event("STR_STREAM_PUBLISHER_DESTROYED", 180, "strStreamPublisherDestroyed");
    public static final Event STR_STREAM_PUBLISHER_DID_FAIL_WITH_ERROR = new Event("STR_STREAM_PUBLISHER_DID_FAIL_WITH_ERROR", 181, "strStreamPublisherDidFailWithError");

    private static final /* synthetic */ Event[] $values() {
        return new Event[]{SDK_INFO, ERROR, USER_CANCELLED, CLOSE_BUTTON_PRESSED, BACKGROUND, FOREGROUND, CONTINUE, VIDEO_RECORDING_ERROR, INTRO, CLOSE_INTRO, PHONE_CHANGE_CLICKED, EMAIL_CHANGE_CLICKED, OTP_SUBMITTED, OTP_TRY_AGAIN_CLICKED, OTP_CORRECT_ENTERED, OTP_WRONG_ENTERED, START_ID_CAPTURE, TUTORIAL_FRONT_ID, CAMERA_FRONT_ID, NEED_HELP_FRONT_ID, CLOSE_NEED_HELP_FRONT_ID, RETAKE_TRY_AGAIN, RETAKE_CONTINUE, TUTORIAL_BACK_ID, CAMERA_BACK_ID, NEED_HELP_BACK_ID, CLOSE_NEED_HELP_BACK_ID, SWITCH_TO_MANUAL_CAPTURE_FRONT_ID, SWITCH_TO_MANUAL_CAPTURE_BACK_ID, SWITCH_TO_MANUAL_CAPTURE_SELFIE, TUTORIAL_PASSPORT, CAMERA_PASSPORT, PASSPORT_CLICKED, CLICKED_DONT_ALLOW, CLICKED_ALLOW, CLICKED_QUIT, CLICKED_OPEN_SETTINGS, ID_CLICKED, CLICK_SCAN, START_SECOND_ID_CAPTURE, TUTORIAL_FRONT_SECOND_ID, CAMERA_FRONT_SECOND_ID, NEED_HELP_FRONT_SECOND_ID, CLOSE_NEED_HELP_FRONT_SECOND_ID, TUTORIAL_BACK_SECOND_ID, CAMERA_BACK_SECOND_ID, NEED_HELP_BACK_SECOND_ID, CLOSE_NEED_HELP_BACK_SECOND_ID, TUTORIAL_SECOND_PASSPORT, CAMERA_SECOND_PASSPORT, NEED_HELP_QR_SCAN, CLOSE_NEED_HELP_QR_SCAN, START_SELFIE, TUTORIAL_SELFIE, CAMERA_SELFIE, LOCAL_LIVENESS_FAILED, TUTORIAL_DOCUMENT_VALIDATION, START_DOCUMENT_VALIDATION, NEED_HELP_DOCUMENT_VALIDATION, CLOSE_NEED_HELP_DOCUMENT_VALIDATION, TUTORIAL_VIDEO_SELFIE, START_OTP, START_VIDEO_CONFERENCE, CONFERENCE_USER_FIRST_IN_QUEUE, CONFERENCE_USER_STREAM_SHOWN, CONFERENCE_EXECUTIVE_STREAM_SHOWN, START_FRONT_ID_SCAN_SCREEN_RECORDING, START_BACK_ID_SCAN_SCREEN_RECORDING, START_SELFIE_SCAN_SCREEN_RECORDING, FINISH_GPT_SIGN_UP, START_VIDEO_SELFIE, VIDEO_SELFIE_SELFIE_MATCHED, VIDEO_SELFIE_ID_FRONT_DETECTED, VIDEO_SELFIE_ID_BACK_DETECTED, VIDEO_SELFIE_PASSPORT_DETECTED, VIDEO_SELFIE_POA_SCANNED, VIDEO_SELFIE_QUESTION_X_ANSWERED, VIDEO_SELFIE_TOS_ACCEPTED, VIDEO_SELFIE_TOS_NOT_ACCEPTED, VIDEO_SELFIE_FACE_PROCESSING_STATES, VIDEO_SELFIE_ID_FRONT_PROCESSING_STATES, VIDEO_SELFIE_ID_BACK_PROCESSING_STATES, VIDEO_SELFIE_PASSPORT_PROCESSING_STATES, VIDEO_SELFIE_BACK_ID_UPLOAD_PROGRESS, VIDEO_SELFIE_BACK_ID_UPLOAD_SUCCEEDED, VIDEO_SELFIE_BACK_ID_ATTEMPT_FAILED, VIDEO_SELFIE_FACE_CAPTURE, VIDEO_SELFIE_FACE_UPLOAD_PROGRESS, VIDEO_SELFIE_FACE_ATTEMPT_FAILED, VIDEO_SELFIE_FACE_UPLOAD_SUCCEEDED, VIDEO_SELFIE_FRONT_ID_CAPTURE, VIDEO_SELFIE_FRONT_ID_UPLOAD_PROGRESS, VIDEO_SELFIE_FRONT_ID_UPLOAD_SUCCEEDED, VIDEO_SELFIE_FRONT_ID_ATTEMPT_FAILED, VIDEO_SELFIE_BACK_ID_CAPTURE, VIDEO_SELFIE_DOCUMENT_CAPTURE, VIDEO_SELFIE_VIDEO_LINK_GENERATED, VIDEO_SELFIE_VIDEO_INFO, VIDEO_SELFIE_VIDEO_UPLOADED, VIDEO_SELFIE_VIDEO_UPLOAD_ERROR, FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED, BACK_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED, SELFIE_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED, FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED, BACK_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED, SELFIE_SCAN_SCREEN_RECORD_VIDEO_UPLOADED, SCREEN_RECORD_VIDEO_UPLOAD_ERROR, EMULATOR_DETECTION_DISABLED, ROOT_DETECTION_DISABLED, HOOK_DETECTION_DISABLED, VIRTUAL_ENVIRONMENT_DETECTION_DISABLED, EXIT_CONFIRM, EXIT_CTA_TAPPED, EXTERNAL_APP_SESSION_START, EXTERNAL_SCREEN_VIEWED, NFC_OCR_SCREEN_OPENED, NFC_OCR_INFO_UPDATED, NFC_SYMBOL_CHECK_SCREEN_OPENED, NFC_SYMBOL_CHECK_BTN_NO, NFC_SYMBOL_CHECK_BTN_YES, NFC_INTRO_TUTORIAL_SCREEN_OPENED, NFC_INTRO_TUTORIAL_BTN_START_SCANNING, NFC_SCAN_BTN_CANCEL, NFC_SCAN_UPLOAD_STARTED, NFC_SCAN_SUCCESS_SCREEN, NFC_SCAN_FAILURE_SCREEN, NFC_SCAN_FAILURE_SCREEN_BTN_CONTINUE, NFC_UNHAPPY_TUTORIAL_SCREEN_ONE_OPENED, NFC_UNHAPPY_TUTORIAL_SCREEN_TWO_OPENED, NFC_UNHAPPY_TUTORIAL_SCREEN_THREE_OPENED, NFC_UNHAPPY_TUTORIAL_SCREEN_FOUR_OPENED, NFC_UNHAPPY_TUTORIAL_HELP_OPENED, NFC_UNHAPPY_TUTORIAL_HELP_CLOSED, NFC_UNHAPPY_TUTORIAL_BTN_START_SCANNING, NFC_NOT_SUPPORTED_ON_DEVICE, NFC_MISSING_PERMISSION_SCREEN, NFC_MISSING_PERMISSION_SCREEN_BTN_OPEN_SETTINGS, MODULE_OPENED, MODULE_CLOSED, SCREEN_OPENED, SCREEN_CLOSED, FRONT_ID_DETECTED, BACK_ID_DETECTED, NFC_SCAN_FAILURE, NFC_DONT_MOVE_SCREEN, EKYB_SUCCEEDED, EKYB_FAILED, SELFIE_UPLOAD_PROGRESS, SELFIE_ATTEMPT_FAILED, SELFIE_UPLOAD_SUCCEEDED, FACE_AUTHENTICATION_SUCCEEDED, FACE_AUTHENTICATION_FAILED, CURP_VALIDATION_PROGRESS, CURP_VALIDATION_FAILED, CURP_VALIDATION_SUCCEEDED, BACK_ID_UPLOAD_SUCCEEDED, BACK_ID_ATTEMPT_FAILED, FRONT_ID_UPLOAD_SUCCEEDED, HINT_SHOWED, SCAN_RETAKE_CLICKED, SCAN_UPLOAD_RETRY_CLICKED, SCAN_BACK_CLICKED, SCAN_FRONT_CLICKED, CONTINUE_CLICKED, MANUAL_CAPTURE_SCAN, CLICK_MANUAL_SCAN, SWITCHED_ORIENTATION, CORRECTION_FEEDBACK, FRONT_ID_ATTEMPT_FAILED, GOVERNMENT_VALIDATION_SUCCEEDED, GOVERNMENT_VALIDATION_FAILED, DOCUMENT_UPLOAD_SUCCEEDED, DOCUMENT_ATTEMPT_FAILED, INCODE_WATCHLIST_VALIDATION_FAILED, INCODE_WATCHLIST_VALIDATION_SUCCEEDED, CAPTURE_ATTEMPT_FINISHED, STR_SESSION_DID_CONNECT, STR_SESSION_DID_DISCONNECT, STR_SESSION_DID_FAIL_WITH_ERROR, STR_STREAM_PUBLISHER_CREATED, STR_STREAM_PUBLISHER_DESTROYED, STR_STREAM_PUBLISHER_DID_FAIL_WITH_ERROR};
    }

    public static EnumEntries<Event> getEntries() {
        return $ENTRIES;
    }

    public static Event valueOf(String str) {
        return (Event) Enum.valueOf(Event.class, str);
    }

    public static Event[] values() {
        return (Event[]) $VALUES.clone();
    }

    private Event(String str, int i2, String str2) {
        super(str, i2);
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Event[] eventArr$values = $values();
        $VALUES = eventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(eventArr$values);
    }

    @Deprecated(message = "Replace with getValue()", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    public final String getName() {
        return this.value;
    }
}
