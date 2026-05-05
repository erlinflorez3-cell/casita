package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class VideoSelfie extends BaseModule {

    /* JADX INFO: renamed from: a */
    private static int f10658a = 0;

    /* JADX INFO: renamed from: b */
    private static int f10659b = 1;
    private final boolean backIdComparisonEnabled;
    private final boolean backIdOcrComparisonEnabled;
    private final boolean brightnessCheckEnabled;
    private final boolean closedEyesCheckEnabled;
    private final boolean disableAudio;
    private final int documentScanCameraFacing;
    private final boolean documentScanEnabled;
    private final boolean enableBackShownAsFrontCheck;
    private final boolean enableFrontShownAsBackCheck;
    private final boolean frontIdComparisonEnabled;
    private final boolean frontIdOcrComparisonEnabled;
    private final boolean headCoverCheckEnabled;
    private final int idBackCameraFacing;
    private final int idFrontCameraFacing;
    private final boolean idScanEnabled;
    private final boolean lensesCheckEnabled;
    private final boolean livenessEnabled;
    private final String localConsentText;
    private final List<VideoSelfieLocalQuestion> localRandomQuestions;
    private final int logoResId;
    private final boolean maskCheckEnabled;
    private final int maxVideoLength;
    private final boolean minVideoLengthRequired;
    private final int randomQuestionsCameraFacing;
    private final int randomQuestionsCount;
    private final boolean randomQuestionsEnabled;
    private final int selfieCameraFacing;
    private final SelfieMode selfieMode;
    private final boolean selfieScanEnabled;
    private final boolean showSelfieStepFirst;
    private final boolean showTutorials;
    private final int voiceConsentCameraFacing;
    private final boolean voiceConsentEnabled;
    private final boolean voiceConsentFaceRecognitionEnabled;
    private final boolean waitForTutorials;

    public enum SelfieMode {
        SELFIE_MATCH,
        FACE_MATCH
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f10660a = 1;

        /* JADX INFO: renamed from: e */
        private static int f10661e = 0;
        private boolean showTutorials = true;
        private boolean waitForTutorials = false;
        private boolean minVideoLengthRequired = true;
        private SelfieMode selfieMode = SelfieMode.SELFIE_MATCH;
        private boolean livenessEnabled = false;
        private boolean eyesClosedCheckEnabled = true;
        private boolean headCoverCheckEnabled = false;
        private boolean selfieScanEnabled = true;
        private int selfieCameraFacing = CameraFacing.FRONT.getCameraFacing();
        private boolean idScanEnabled = true;
        private boolean enableBackShownAsFrontCheck = false;
        private boolean enableFrontShownAsBackCheck = false;
        private int idFrontCameraFacing = CameraFacing.BACK.getCameraFacing();
        private int idBackCameraFacing = CameraFacing.BACK.getCameraFacing();
        private boolean documentScanEnabled = true;
        private int documentScanCameraFacing = CameraFacing.BACK.getCameraFacing();
        private boolean randomQuestionsEnabled = false;
        private int randomQuestionsCount = 3;
        private List<VideoSelfieLocalQuestion> localRandomQuestions = new ArrayList();
        private int randomQuestionsCameraFacing = CameraFacing.FRONT.getCameraFacing();
        private boolean voiceConsentEnabled = false;
        private boolean voiceConsentFaceRecognitionEnabled = false;
        private String localConsentText = "";
        private int voiceConsentCameraFacing = CameraFacing.FRONT.getCameraFacing();
        private boolean disableAudio = false;
        private int maxVideoLength = 300;
        private boolean lensesCheckEnabled = true;
        private boolean maskCheckEnabled = false;
        private boolean brightnessCheckEnabled = true;
        private boolean frontIdComparisonEnabled = true;
        private boolean frontIdOcrComparisonEnabled = true;
        private boolean backIdComparisonEnabled = true;
        private boolean backIdOcrComparisonEnabled = true;
        private boolean showSelfieStepFirst = false;
        private int logoResId = 0;

        public final Builder setShowTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a;
            int i4 = i3 + 93;
            f10661e = i4 % 128;
            int i5 = i4 % 2;
            this.showTutorials = z2;
            int i6 = i3 + 105;
            f10661e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setWaitForTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 21;
            f10661e = i3 % 128;
            if (i3 % 2 == 0) {
                this.waitForTutorials = z2;
                return this;
            }
            this.waitForTutorials = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setMinVideoLengthRequired(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 101;
            f10660a = i4 % 128;
            if (i4 % 2 == 0) {
                this.minVideoLengthRequired = z2;
                int i5 = 10 / 0;
            } else {
                this.minVideoLengthRequired = z2;
            }
            int i6 = i3 + 29;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setSelfieMode(SelfieMode selfieMode) {
            int i2 = 2 % 2;
            int i3 = f10661e + 69;
            f10660a = i3 % 128;
            if (i3 % 2 != 0) {
                this.selfieMode = selfieMode;
                return this;
            }
            this.selfieMode = selfieMode;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setLivenessEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 81;
            f10660a = i4 % 128;
            int i5 = i4 % 2;
            this.livenessEnabled = z2;
            int i6 = i3 + 73;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setEyesClosedCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e + 91;
            f10660a = i3 % 128;
            if (i3 % 2 != 0) {
                this.eyesClosedCheckEnabled = z2;
                return this;
            }
            this.eyesClosedCheckEnabled = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setHeadCoverCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e + 85;
            int i4 = i3 % 128;
            f10660a = i4;
            int i5 = i3 % 2;
            this.headCoverCheckEnabled = z2;
            int i6 = i4 + 61;
            f10661e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setLensesCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 19;
            f10661e = i3 % 128;
            if (i3 % 2 == 0) {
                this.lensesCheckEnabled = z2;
                return this;
            }
            this.lensesCheckEnabled = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setMaskCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 89;
            int i4 = i3 % 128;
            f10661e = i4;
            int i5 = i3 % 2;
            this.maskCheckEnabled = z2;
            int i6 = i4 + 63;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setBrightnessCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e + 23;
            int i4 = i3 % 128;
            f10660a = i4;
            int i5 = i3 % 2;
            this.brightnessCheckEnabled = z2;
            int i6 = i4 + 57;
            f10661e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setSelfieScanEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 69;
            f10660a = i4 % 128;
            int i5 = i4 % 2;
            this.selfieScanEnabled = z2;
            int i6 = i3 + 101;
            f10660a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
            return this;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setSelfieCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10661e + 69;
            f10660a = i3 % 128;
            int i4 = i3 % 2;
            Timber.e("Builder.setSelfieCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            this.selfieCameraFacing = cameraFacing.getCameraFacing();
            int i5 = f10660a + 29;
            f10661e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setIdScanEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e + 1;
            int i4 = i3 % 128;
            f10660a = i4;
            int i5 = i3 % 2;
            this.idScanEnabled = z2;
            int i6 = i4 + 45;
            f10661e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setEnableBackShownAsFrontCheck(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 5;
            f10660a = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                this.enableBackShownAsFrontCheck = z2;
                int i5 = i3 + 83;
                f10660a = i5 % 128;
                if (i5 % 2 != 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            this.enableBackShownAsFrontCheck = z2;
            obj.hashCode();
            throw null;
        }

        public final Builder setEnableFrontShownAsBackCheck(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10661e = i3 % 128;
            if (i3 % 2 == 0) {
                this.enableFrontShownAsBackCheck = z2;
                return this;
            }
            this.enableFrontShownAsBackCheck = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setIdScanCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10660a + 5;
            f10661e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.e("Builder.setIdScanCameraFacing() is deprecated and will be removed in a future version.", new Object[1]);
            } else {
                Timber.e("Builder.setIdScanCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            }
            setIdBackCameraFacing(cameraFacing);
            setIdFrontCameraFacing(cameraFacing);
            int i4 = f10660a + 77;
            f10661e = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setIdFrontCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10661e + 91;
            f10660a = i3 % 128;
            int i4 = i3 % 2;
            Timber.e("Builder.setIdFrontCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            this.idFrontCameraFacing = cameraFacing.getCameraFacing();
            int i5 = f10661e + 51;
            f10660a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setIdBackCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10660a + 65;
            f10661e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.e("Builder.setIdBackCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            } else {
                Timber.e("Builder.setIdBackCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            }
            this.idBackCameraFacing = cameraFacing.getCameraFacing();
            return this;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setDocumentScanEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 111;
            f10661e = i3 % 128;
            int i4 = i3 % 2;
            Timber.e("Builder.setDocumentScanEnabled() is deprecated and will be removed in a future version.", new Object[0]);
            this.documentScanEnabled = z2;
            int i5 = f10661e + 87;
            f10660a = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setDocumentScanCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10661e + 7;
            f10660a = i3 % 128;
            int i4 = i3 % 2;
            Timber.e("Builder.setDocumentScanCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            this.documentScanCameraFacing = cameraFacing.getCameraFacing();
            int i5 = f10660a + 37;
            f10661e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setRandomQuestionsEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 97;
            f10661e = i3 % 128;
            if (i3 % 2 != 0) {
                this.randomQuestionsEnabled = z2;
                int i4 = 27 / 0;
            } else {
                this.randomQuestionsEnabled = z2;
            }
            return this;
        }

        public final Builder setRandomQuestionsCount(int i2) {
            int i3 = 2 % 2;
            int i4 = f10661e + 69;
            f10660a = i4 % 128;
            if (i4 % 2 != 0) {
                this.randomQuestionsCount = i2;
                return this;
            }
            this.randomQuestionsCount = i2;
            throw null;
        }

        public final Builder setRandomQuestions(List<VideoSelfieLocalQuestion> list) {
            int i2 = 2 % 2;
            int i3 = f10660a + 69;
            f10661e = i3 % 128;
            if (i3 % 2 == 0) {
                this.localRandomQuestions = list;
                return this;
            }
            this.localRandomQuestions = list;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setRandomQuestionsCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10661e + 113;
            f10660a = i3 % 128;
            int i4 = i3 % 2;
            Timber.e("Builder.setRandomQuestionsCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            this.randomQuestionsCameraFacing = cameraFacing.getCameraFacing();
            int i5 = f10661e + 103;
            f10660a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setVoiceConsentEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 99;
            f10660a = i4 % 128;
            int i5 = i4 % 2;
            this.voiceConsentEnabled = z2;
            int i6 = i3 + 87;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setConsent(String str) {
            int i2 = 2 % 2;
            int i3 = f10660a + 69;
            int i4 = i3 % 128;
            f10661e = i4;
            int i5 = i3 % 2;
            this.localConsentText = str;
            int i6 = i4 + 65;
            f10660a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 15 / 0;
            }
            return this;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setVoiceConsentCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10660a + 75;
            f10661e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.e("Builder.setVoiceConsentCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            } else {
                Timber.e("Builder.setVoiceConsentCameraFacing() is deprecated and will be removed in a future version.", new Object[0]);
            }
            this.voiceConsentCameraFacing = cameraFacing.getCameraFacing();
            int i4 = f10661e + 11;
            f10660a = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder setVoiceConsentFaceRecognitionEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 25;
            f10660a = i4 % 128;
            int i5 = i4 % 2;
            this.voiceConsentFaceRecognitionEnabled = z2;
            int i6 = i3 + 57;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setMaxVideoLength(int i2) {
            int i3 = 2 % 2;
            int i4 = f10660a;
            int i5 = i4 + 21;
            f10661e = i5 % 128;
            int i6 = i5 % 2;
            this.maxVideoLength = i2;
            int i7 = i4 + 105;
            f10661e = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setDisableAudio(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 21;
            f10660a = i4 % 128;
            if (i4 % 2 != 0) {
                this.disableAudio = z2;
                int i5 = i3 + 39;
                f10660a = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.disableAudio = z2;
            throw null;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version.")
        public final Builder setAssistedOnboardingEnabled() {
            int i2 = 2 % 2;
            int i3 = f10660a + 9;
            f10661e = i3 % 128;
            int i4 = i3 % 2;
            Timber.w("Builder.setAssistedOnboardingEnabled() is deprecated and will be removed in a future version.", new Object[0]);
            setSelfieCameraFacing(CameraFacing.BACK);
            setIdScanCameraFacing(CameraFacing.BACK);
            setDocumentScanCameraFacing(CameraFacing.BACK);
            setRandomQuestionsCameraFacing(CameraFacing.BACK);
            setVoiceConsentCameraFacing(CameraFacing.BACK);
            int i5 = f10660a + 19;
            f10661e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setFrontIdComparisonEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 33;
            int i4 = i3 % 128;
            f10661e = i4;
            int i5 = i3 % 2;
            this.frontIdComparisonEnabled = z2;
            int i6 = i4 + 71;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setFrontIdOcrComparisonEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e;
            int i4 = i3 + 121;
            f10660a = i4 % 128;
            int i5 = i4 % 2;
            this.frontIdOcrComparisonEnabled = z2;
            int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10660a = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setBackIdComparisonEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a + 49;
            int i4 = i3 % 128;
            f10661e = i4;
            if (i3 % 2 != 0) {
                this.backIdComparisonEnabled = z2;
                int i5 = 27 / 0;
            } else {
                this.backIdComparisonEnabled = z2;
            }
            int i6 = i4 + 107;
            f10660a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setBackIdOcrComparisonEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10660a;
            int i4 = i3 + 15;
            f10661e = i4 % 128;
            int i5 = i4 % 2;
            this.backIdOcrComparisonEnabled = z2;
            int i6 = i3 + 15;
            f10661e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setShowSelfieStepFirst(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10661e + 67;
            f10660a = i3 % 128;
            if (i3 % 2 == 0) {
                this.showSelfieStepFirst = z2;
                int i4 = 59 / 0;
            } else {
                this.showSelfieStepFirst = z2;
            }
            return this;
        }

        public final Builder setLogo(int i2) {
            int i3 = 2 % 2;
            int i4 = f10661e + 51;
            int i5 = i4 % 128;
            f10660a = i5;
            int i6 = i4 % 2;
            this.logoResId = i2;
            int i7 = i5 + 9;
            f10661e = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.modules.VideoSelfie build() {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.VideoSelfie.Builder.build():com.incode.welcome_sdk.modules.VideoSelfie");
        }
    }

    VideoSelfie(boolean z2, boolean z3, boolean z4, SelfieMode selfieMode, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i2, boolean z12, boolean z13, boolean z14, int i3, int i4, boolean z15, int i5, boolean z16, int i6, List<VideoSelfieLocalQuestion> list, int i7, boolean z17, String str, int i8, boolean z18, boolean z19, int i9, boolean z20, boolean z21, boolean z22, boolean z23, int i10, boolean z24) {
        super(Modules.VIDEO_ONBOARDING);
        this.showTutorials = z2;
        this.waitForTutorials = z3;
        this.minVideoLengthRequired = z4;
        this.selfieMode = selfieMode;
        this.livenessEnabled = z5;
        this.closedEyesCheckEnabled = z6;
        this.headCoverCheckEnabled = z7;
        this.lensesCheckEnabled = z8;
        this.maskCheckEnabled = z9;
        this.brightnessCheckEnabled = z10;
        this.selfieScanEnabled = z11;
        this.selfieCameraFacing = i2;
        this.idScanEnabled = z12;
        this.enableBackShownAsFrontCheck = z13;
        this.enableFrontShownAsBackCheck = z14;
        this.idFrontCameraFacing = i3;
        this.idBackCameraFacing = i4;
        this.documentScanEnabled = z15;
        this.documentScanCameraFacing = i5;
        this.randomQuestionsEnabled = z16;
        this.randomQuestionsCount = i6;
        this.localRandomQuestions = list;
        this.randomQuestionsCameraFacing = i7;
        this.voiceConsentEnabled = z17;
        this.localConsentText = str;
        this.voiceConsentCameraFacing = i8;
        this.voiceConsentFaceRecognitionEnabled = z18;
        this.disableAudio = z19;
        this.maxVideoLength = i9;
        this.frontIdComparisonEnabled = z20;
        this.frontIdOcrComparisonEnabled = z21;
        this.backIdComparisonEnabled = z22;
        this.backIdOcrComparisonEnabled = z23;
        this.showSelfieStepFirst = z24;
        this.logoResId = i10;
    }

    public boolean isShowTutorials() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 11;
        f10658a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.showTutorials;
        int i6 = i3 + 35;
        f10658a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public boolean isWaitForTutorials() {
        int i2 = 2 % 2;
        int i3 = f10658a + 31;
        int i4 = i3 % 128;
        f10659b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.waitForTutorials;
        int i6 = i4 + 121;
        f10658a = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isMinVideoLengthRequired() {
        int i2 = 2 % 2;
        int i3 = f10659b + 55;
        f10658a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.minVideoLengthRequired;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SelfieMode getSelfieMode() {
        int i2 = 2 % 2;
        int i3 = f10658a + 75;
        f10659b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.selfieMode;
        }
        throw null;
    }

    public boolean isLivenessEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 111;
        f10658a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.livenessEnabled;
        }
        throw null;
    }

    public boolean isSelfieScanEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10659b + 87;
        int i4 = i3 % 128;
        f10658a = i4;
        if (i3 % 2 != 0) {
            z2 = this.selfieScanEnabled;
            int i5 = 61 / 0;
        } else {
            z2 = this.selfieScanEnabled;
        }
        int i6 = i4 + 29;
        f10659b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public int getSelfieCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f10658a;
        int i4 = i3 + 57;
        f10659b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.selfieCameraFacing;
        int i7 = i3 + 13;
        f10659b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public boolean isIdScanEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 65;
        f10658a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.idScanEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isEnableBackShownAsFrontCheck() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 33;
        f10658a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.enableBackShownAsFrontCheck;
        int i6 = i3 + 31;
        f10658a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public boolean isEnableFrontShownAsBackCheck() {
        int i2 = 2 % 2;
        int i3 = f10659b + 69;
        int i4 = i3 % 128;
        f10658a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.enableFrontShownAsBackCheck;
        int i6 = i4 + 97;
        f10659b = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public int getIdFrontCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f10658a + 43;
        int i4 = i3 % 128;
        f10659b = i4;
        int i5 = i3 % 2;
        int i6 = this.idFrontCameraFacing;
        int i7 = i4 + 117;
        f10658a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public int getIdBackCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 53;
        f10658a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.idBackCameraFacing;
        int i7 = i3 + 51;
        f10658a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public boolean isDocumentScanEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10659b + 55;
        int i4 = i3 % 128;
        f10658a = i4;
        if (i3 % 2 != 0) {
            z2 = this.documentScanEnabled;
            int i5 = 51 / 0;
        } else {
            z2 = this.documentScanEnabled;
        }
        int i6 = i4 + 69;
        f10659b = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public int getDocumentScanCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f10659b + 61;
        f10658a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.documentScanCameraFacing;
        if (i4 != 0) {
            int i6 = 4 / 0;
        }
        return i5;
    }

    public boolean isRandomQuestionsEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 37;
        f10658a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.randomQuestionsEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getRandomQuestionsCount() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f10659b;
        int i5 = i4 + 105;
        f10658a = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = this.randomQuestionsCount;
            int i6 = 48 / 0;
        } else {
            i2 = this.randomQuestionsCount;
        }
        int i7 = i4 + 7;
        f10658a = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public List<VideoSelfieLocalQuestion> getLocalRandomQuestions() {
        int i2 = 2 % 2;
        int i3 = f10659b + 93;
        f10658a = i3 % 128;
        int i4 = i3 % 2;
        List<VideoSelfieLocalQuestion> list = this.localRandomQuestions;
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        return list;
    }

    public int getRandomQuestionsCameraFacing() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f10658a;
        int i5 = i4 + 39;
        f10659b = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.randomQuestionsCameraFacing;
            int i6 = 71 / 0;
        } else {
            i2 = this.randomQuestionsCameraFacing;
        }
        int i7 = i4 + 25;
        f10659b = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isVoiceConsentEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 77;
        int i4 = i3 % 128;
        f10658a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.voiceConsentEnabled;
        int i6 = i4 + 15;
        f10659b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return z2;
    }

    public String getLocalConsentText() {
        int i2 = 2 % 2;
        int i3 = f10658a + 109;
        int i4 = i3 % 128;
        f10659b = i4;
        int i5 = i3 % 2;
        String str = this.localConsentText;
        int i6 = i4 + 75;
        f10658a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
        return str;
    }

    public int getVoiceConsentCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f10659b + 51;
        int i4 = i3 % 128;
        f10658a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.voiceConsentCameraFacing;
        int i6 = i4 + 55;
        f10659b = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public boolean isVoiceConsentFaceRecognitionEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 31;
        f10658a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.voiceConsentFaceRecognitionEnabled;
        int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10658a = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public boolean isDisableAudio() {
        int i2 = 2 % 2;
        int i3 = f10659b + 75;
        f10658a = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.disableAudio;
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
        return z2;
    }

    public int getMaxVideoLength() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f10658a + 117;
        int i5 = i4 % 128;
        f10659b = i5;
        if (i4 % 2 == 0) {
            i2 = this.maxVideoLength;
            int i6 = 47 / 0;
        } else {
            i2 = this.maxVideoLength;
        }
        int i7 = i5 + 19;
        f10658a = i7 % 128;
        if (i7 % 2 == 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isClosedEyesCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 21;
        f10658a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.closedEyesCheckEnabled;
        int i6 = i3 + 51;
        f10658a = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isHeadCoverCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10658a;
        int i4 = i3 + 33;
        f10659b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.headCoverCheckEnabled;
        int i5 = i3 + 27;
        f10659b = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public boolean isLensesCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 69;
        int i4 = i3 % 128;
        f10658a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.lensesCheckEnabled;
        int i6 = i4 + 41;
        f10659b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public boolean isMaskCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10658a;
        int i4 = i3 + 57;
        f10659b = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.maskCheckEnabled;
        int i5 = i3 + 73;
        f10659b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return z2;
    }

    public boolean isBrightnessCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 97;
        f10658a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.brightnessCheckEnabled;
        int i6 = i3 + 91;
        f10658a = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public boolean isFrontIdComparisonEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 41;
        f10658a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.frontIdComparisonEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isFrontIdOcrComparisonEnabled() {
        int i2 = 2 % 2;
        int i3 = f10658a;
        int i4 = i3 + 125;
        f10659b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.frontIdOcrComparisonEnabled;
        int i6 = i3 + 1;
        f10659b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public boolean isBackIdComparisonEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b;
        int i4 = i3 + 27;
        f10658a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.backIdComparisonEnabled;
        int i6 = i3 + 41;
        f10658a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public boolean isBackIdOcrComparisonEnabled() {
        int i2 = 2 % 2;
        int i3 = f10659b + 69;
        int i4 = i3 % 128;
        f10658a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.backIdOcrComparisonEnabled;
        int i6 = i4 + 95;
        f10659b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return z2;
    }

    public boolean showSelfieStepFirst() {
        int i2 = 2 % 2;
        int i3 = f10658a + 19;
        f10659b = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.showSelfieStepFirst;
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        return z2;
    }

    public int getLogoResId() {
        int i2 = 2 % 2;
        int i3 = f10658a;
        int i4 = i3 + 43;
        f10659b = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.logoResId;
        int i6 = i3 + 19;
        f10659b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return i5;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10659b + 15;
        f10658a = i3 % 128;
        int i4 = i3 % 2;
        verifyIfAfter(list, Modules.ACCEPT_VIDEO_SELFIE);
        int i5 = f10659b + 87;
        f10658a = i5 % 128;
        int i6 = i5 % 2;
    }
}
