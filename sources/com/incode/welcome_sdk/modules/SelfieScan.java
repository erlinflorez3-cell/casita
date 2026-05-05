package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SelfieScan extends BaseModule {
    public static final float NO_RESULT = -1.0f;
    public static final float RECOGNITION_FAIL_RESULT = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10646b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10647e = 1;
    boolean allowFaceAuthModeFallback;
    final int autoCaptureTimeout;
    final boolean brightnessCheckEnabled;
    final float brightnessThreshold;
    final int cameraFacing;
    final int captureAttempts;
    final boolean closedEyesCheckEnabled;
    final String configurationId;

    @Deprecated
    final String customerToken;
    final String customerUUID;
    final FaceAuthMode faceAuthMode;
    FaceRecognitionMode faceRecognitionMode;
    final boolean headCoverCheckEnabled;
    final boolean lensesCheckEnabled;
    final LivenessDetectionMode livenessDetectionMode;
    final boolean logAuthenticationEnabled;
    final int logoResId;
    final boolean maskCheckEnabled;
    final Mode mode;
    final boolean showTutorials;
    final boolean storeLocalAuthenticationEnabled;
    final boolean streamAudioEnabled;
    final boolean streamFramesEnabled;
    final String streamFramesToken;
    final boolean videoLivenessRecordingEnabled;
    final boolean waitForTutorials;

    public enum FaceAuthMode {
        SERVER,
        LOCAL
    }

    public enum Mode {
        ENROLL,
        LOGIN,
        MASK_CHECK;

        public static Mode getDefault() {
            return ENROLL;
        }
    }

    @Deprecated
    public enum FaceRecognitionMode {
        SERVER,
        LOCAL;

        public static FaceRecognitionMode getDefault() {
            return SERVER;
        }
    }

    public enum LivenessDetectionMode {
        SERVER,
        LOCAL;

        public static LivenessDetectionMode getDefault() {
            return SERVER;
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10648d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10649e = 0;

        @Deprecated
        private String customerToken;
        private String customerUUID;
        private String streamFramesToken;
        private boolean showTutorials = true;
        private boolean waitForTutorials = false;
        private Mode mode = Mode.getDefault();
        private int cameraFacing = CameraFacing.FRONT.getCameraFacing();
        private FaceRecognitionMode faceRecognitionMode = FaceRecognitionMode.getDefault();
        private LivenessDetectionMode livenessDetectionMode = LivenessDetectionMode.getDefault();
        private FaceAuthMode faceAuthMode = null;
        private boolean allowFaceAuthModeFallback = false;
        private float brightnessThreshold = 50.0f;
        private String configurationId = null;
        private boolean eyesClosedCheckEnabled = true;
        private boolean headCoverCheckEnabled = false;
        private boolean lensesCheckEnabled = true;
        private boolean maskCheckEnabled = false;
        private boolean brightnessCheckEnabled = true;
        private boolean storeLocalAuthenticationEnabled = false;
        private boolean logAuthenticationEnabled = true;
        private int logoResId = 0;
        private int autoCaptureTimeout = -1;
        private int captureAttempts = -1;
        private boolean streamFramesEnabled = false;
        private boolean streamAudioEnabled = false;
        private boolean videoLivenessRecordingEnabled = false;

        public final Builder from(SelfieScan selfieScan) {
            int i2 = 2 % 2;
            Builder builder = new Builder();
            builder.showTutorials = selfieScan.showTutorials;
            builder.waitForTutorials = selfieScan.waitForTutorials;
            builder.mode = selfieScan.mode;
            builder.cameraFacing = selfieScan.cameraFacing;
            builder.faceRecognitionMode = selfieScan.faceRecognitionMode;
            builder.livenessDetectionMode = selfieScan.livenessDetectionMode;
            builder.faceAuthMode = selfieScan.faceAuthMode;
            builder.allowFaceAuthModeFallback = selfieScan.allowFaceAuthModeFallback;
            builder.brightnessThreshold = selfieScan.brightnessThreshold;
            builder.configurationId = selfieScan.configurationId;
            builder.customerToken = selfieScan.customerToken;
            builder.customerUUID = selfieScan.customerUUID;
            builder.eyesClosedCheckEnabled = selfieScan.closedEyesCheckEnabled;
            builder.headCoverCheckEnabled = selfieScan.headCoverCheckEnabled;
            builder.lensesCheckEnabled = selfieScan.lensesCheckEnabled;
            builder.maskCheckEnabled = selfieScan.maskCheckEnabled;
            builder.brightnessCheckEnabled = selfieScan.brightnessCheckEnabled;
            builder.storeLocalAuthenticationEnabled = selfieScan.storeLocalAuthenticationEnabled;
            builder.logAuthenticationEnabled = selfieScan.logAuthenticationEnabled;
            builder.logoResId = selfieScan.logoResId;
            builder.autoCaptureTimeout = selfieScan.autoCaptureTimeout;
            builder.captureAttempts = selfieScan.captureAttempts;
            builder.streamFramesEnabled = selfieScan.streamFramesEnabled;
            builder.streamAudioEnabled = selfieScan.streamAudioEnabled;
            builder.videoLivenessRecordingEnabled = selfieScan.videoLivenessRecordingEnabled;
            builder.streamFramesToken = selfieScan.streamFramesToken;
            int i3 = f10649e + 97;
            f10648d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 8 / 0;
            }
            return builder;
        }

        public final Builder setShowTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10648d + 27;
            int i4 = i3 % 128;
            f10649e = i4;
            int i5 = i3 % 2;
            this.showTutorials = z2;
            int i6 = i4 + 5;
            f10648d = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setWaitForTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10648d + 75;
            int i4 = i3 % 128;
            f10649e = i4;
            if (i3 % 2 == 0) {
                this.waitForTutorials = z2;
                int i5 = i4 + 47;
                f10648d = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.waitForTutorials = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setMode(Mode mode) {
            int i2 = 2 % 2;
            int i3 = f10649e + 11;
            int i4 = i3 % 128;
            f10648d = i4;
            if (i3 % 2 != 0) {
                this.mode = mode;
                int i5 = i4 + 5;
                f10649e = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.mode = mode;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setCameraFacing(CameraFacing cameraFacing) {
            int i2 = 2 % 2;
            int i3 = f10648d + 69;
            f10649e = i3 % 128;
            if (i3 % 2 != 0) {
                this.cameraFacing = cameraFacing.getCameraFacing();
                int i4 = 91 / 0;
            } else {
                this.cameraFacing = cameraFacing.getCameraFacing();
            }
            int i5 = f10649e + 31;
            f10648d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        @Deprecated
        public final Builder setFaceRecognitionMode(FaceRecognitionMode faceRecognitionMode) {
            int i2 = 2 % 2;
            int i3 = f10648d + 93;
            f10649e = i3 % 128;
            if (i3 % 2 == 0) {
                this.faceRecognitionMode = faceRecognitionMode;
                return this;
            }
            this.faceRecognitionMode = faceRecognitionMode;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setLivenessDetectionMode(LivenessDetectionMode livenessDetectionMode) {
            int i2 = 2 % 2;
            int i3 = f10648d + 31;
            f10649e = i3 % 128;
            if (i3 % 2 != 0) {
                this.livenessDetectionMode = livenessDetectionMode;
                int i4 = 56 / 0;
            } else {
                this.livenessDetectionMode = livenessDetectionMode;
            }
            return this;
        }

        public final Builder setFaceAuthMode(FaceAuthMode faceAuthMode) {
            int i2 = 2 % 2;
            int i3 = f10648d + 67;
            f10649e = i3 % 128;
            if (i3 % 2 != 0) {
                this.faceAuthMode = faceAuthMode;
                int i4 = 25 / 0;
            } else {
                this.faceAuthMode = faceAuthMode;
            }
            return this;
        }

        public final Builder setAllowFaceAuthModeFallback(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e;
            int i4 = i3 + 69;
            f10648d = i4 % 128;
            if (i4 % 2 != 0) {
                this.allowFaceAuthModeFallback = z2;
                int i5 = i3 + 65;
                f10648d = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.allowFaceAuthModeFallback = z2;
            throw null;
        }

        public final Builder setBrightnessThreshold(float f2) {
            int i2 = 2 % 2;
            int i3 = f10648d;
            int i4 = i3 + 53;
            f10649e = i4 % 128;
            int i5 = i4 % 2;
            this.brightnessThreshold = f2;
            int i6 = i3 + 107;
            f10649e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 64 / 0;
            }
            return this;
        }

        private Builder setConfigurationId(String str) {
            int i2 = 2 % 2;
            int i3 = f10649e;
            int i4 = i3 + 51;
            f10648d = i4 % 128;
            int i5 = i4 % 2;
            this.configurationId = str;
            int i6 = i3 + 63;
            f10648d = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        @Deprecated
        public final Builder setCustomerToken(String str) {
            int i2 = 2 % 2;
            int i3 = f10649e + 77;
            f10648d = i3 % 128;
            if (i3 % 2 != 0) {
                this.customerToken = str;
                return this;
            }
            this.customerToken = str;
            throw null;
        }

        public final Builder setCustomerUUID(String str) {
            int i2 = 2 % 2;
            int i3 = f10648d;
            int i4 = i3 + 109;
            f10649e = i4 % 128;
            int i5 = i4 % 2;
            this.customerUUID = str;
            int i6 = i3 + 39;
            f10649e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
            return this;
        }

        public final Builder setEyesClosedCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e + 65;
            f10648d = i3 % 128;
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
            int i3 = f10648d;
            int i4 = i3 + 67;
            f10649e = i4 % 128;
            int i5 = i4 % 2;
            this.headCoverCheckEnabled = z2;
            int i6 = i3 + 63;
            f10649e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setLensesCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e + 67;
            int i4 = i3 % 128;
            f10648d = i4;
            int i5 = i3 % 2;
            this.lensesCheckEnabled = z2;
            int i6 = i4 + 121;
            f10649e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setMaskCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e + 111;
            int i4 = i3 % 128;
            f10648d = i4;
            if (i3 % 2 == 0) {
                this.maskCheckEnabled = z2;
                int i5 = 25 / 0;
            } else {
                this.maskCheckEnabled = z2;
            }
            int i6 = i4 + 117;
            f10649e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setBrightnessCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10648d;
            int i4 = i3 + 5;
            f10649e = i4 % 128;
            int i5 = i4 % 2;
            this.brightnessCheckEnabled = z2;
            int i6 = i3 + 97;
            f10649e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 32 / 0;
            }
            return this;
        }

        public final Builder setStoreLocalAuthenticationEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e + 77;
            int i4 = i3 % 128;
            f10648d = i4;
            if (i3 % 2 == 0) {
                this.storeLocalAuthenticationEnabled = z2;
                int i5 = 94 / 0;
            } else {
                this.storeLocalAuthenticationEnabled = z2;
            }
            int i6 = i4 + 99;
            f10649e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setLogAuthenticationEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e + 107;
            int i4 = i3 % 128;
            f10648d = i4;
            int i5 = i3 % 2;
            this.logAuthenticationEnabled = z2;
            int i6 = i4 + 77;
            f10649e = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setAssistedOnboardingEnabled() {
            int i2 = 2 % 2;
            int i3 = f10648d + 1;
            f10649e = i3 % 128;
            int i4 = i3 % 2;
            setCameraFacing(CameraFacing.BACK);
            int i5 = f10648d + 43;
            f10649e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setLogo(int i2) {
            int i3 = 2 % 2;
            int i4 = f10648d + 35;
            f10649e = i4 % 128;
            if (i4 % 2 == 0) {
                this.logoResId = i2;
                return this;
            }
            this.logoResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setAutoCaptureTimeout(int i2) {
            int i3 = 2 % 2;
            int i4 = f10649e + 1;
            int i5 = i4 % 128;
            f10648d = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                this.autoCaptureTimeout = i2;
                int i6 = i5 + 105;
                f10649e = i6 % 128;
                if (i6 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.autoCaptureTimeout = i2;
            obj.hashCode();
            throw null;
        }

        public final Builder setCaptureAttempts(int i2) {
            int i3 = 2 % 2;
            int i4 = f10649e;
            int i5 = i4 + 113;
            f10648d = i5 % 128;
            int i6 = i5 % 2;
            this.captureAttempts = i2;
            int i7 = i4 + 83;
            f10648d = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setStreamFramesEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10648d + 33;
            int i4 = i3 % 128;
            f10649e = i4;
            if (i3 % 2 == 0) {
                this.streamFramesEnabled = z2;
                int i5 = i4 + 27;
                f10648d = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            this.streamFramesEnabled = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setStreamAudioEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10648d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f10649e = i4;
            int i5 = i3 % 2;
            this.streamAudioEnabled = z2;
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10648d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return this;
        }

        public final Builder setStreamFramesToken(String str) {
            int i2 = 2 % 2;
            int i3 = f10649e;
            int i4 = i3 + 35;
            f10648d = i4 % 128;
            int i5 = i4 % 2;
            this.streamFramesToken = str;
            int i6 = i3 + 105;
            f10648d = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setVideoLivenessRecordingEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10649e;
            int i4 = i3 + 35;
            f10648d = i4 % 128;
            if (i4 % 2 != 0) {
                this.videoLivenessRecordingEnabled = z2;
                int i5 = i3 + 75;
                f10648d = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 14 / 0;
                }
                return this;
            }
            this.videoLivenessRecordingEnabled = z2;
            throw null;
        }

        public final SelfieScan build() {
            int i2 = 2 % 2;
            SelfieScan selfieScan = new SelfieScan(this.showTutorials, this.waitForTutorials, this.mode, this.cameraFacing, this.faceRecognitionMode, this.livenessDetectionMode, this.brightnessThreshold, this.configurationId, this.customerToken, this.customerUUID, this.eyesClosedCheckEnabled, this.headCoverCheckEnabled, this.lensesCheckEnabled, this.maskCheckEnabled, this.brightnessCheckEnabled, this.storeLocalAuthenticationEnabled, this.logAuthenticationEnabled, this.faceAuthMode, this.allowFaceAuthModeFallback, this.logoResId, this.autoCaptureTimeout, this.captureAttempts, this.streamFramesEnabled, this.streamAudioEnabled, this.videoLivenessRecordingEnabled, this.streamFramesToken);
            int i3 = f10649e + 105;
            f10648d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
            return selfieScan;
        }
    }

    SelfieScan(boolean z2, boolean z3, Mode mode, int i2, FaceRecognitionMode faceRecognitionMode, LivenessDetectionMode livenessDetectionMode, float f2, String str, String str2, String str3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, FaceAuthMode faceAuthMode, boolean z11, int i3, int i4, int i5, boolean z12, boolean z13, boolean z14, String str4) {
        super(Modules.SELFIE);
        this.showTutorials = z2;
        this.waitForTutorials = z3;
        this.mode = mode;
        this.cameraFacing = i2;
        this.faceRecognitionMode = faceRecognitionMode;
        this.livenessDetectionMode = livenessDetectionMode;
        this.brightnessThreshold = f2;
        this.configurationId = str;
        this.customerToken = str2;
        this.customerUUID = str3;
        this.closedEyesCheckEnabled = z4;
        this.headCoverCheckEnabled = z5;
        this.lensesCheckEnabled = z6;
        this.maskCheckEnabled = z7;
        this.brightnessCheckEnabled = z8;
        this.storeLocalAuthenticationEnabled = z9;
        this.logAuthenticationEnabled = z10;
        this.allowFaceAuthModeFallback = z11;
        this.logoResId = i3;
        this.autoCaptureTimeout = i4;
        this.captureAttempts = i5;
        this.streamFramesEnabled = z12;
        this.streamAudioEnabled = z13;
        this.videoLivenessRecordingEnabled = z14;
        this.streamFramesToken = str4;
        if (faceAuthMode == null) {
            if (faceRecognitionMode == FaceRecognitionMode.LOCAL && livenessDetectionMode == LivenessDetectionMode.LOCAL) {
                this.faceAuthMode = FaceAuthMode.LOCAL;
            } else {
                this.faceAuthMode = FaceAuthMode.SERVER;
            }
        } else {
            this.faceAuthMode = faceAuthMode;
        }
        if (str3 != null) {
            this.faceRecognitionMode = FaceRecognitionMode.SERVER;
        }
    }

    public boolean isShowTutorials() {
        int i2 = 2 % 2;
        int i3 = f10646b + 49;
        int i4 = i3 % 128;
        f10647e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.showTutorials;
        int i6 = i4 + 7;
        f10646b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public boolean isWaitForTutorials() {
        int i2 = 2 % 2;
        int i3 = f10647e + 111;
        int i4 = i3 % 128;
        f10646b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.waitForTutorials;
        int i6 = i4 + 65;
        f10647e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
        return z2;
    }

    public Mode getMode() {
        int i2 = 2 % 2;
        int i3 = f10647e + 21;
        int i4 = i3 % 128;
        f10646b = i4;
        int i5 = i3 % 2;
        Mode mode = this.mode;
        int i6 = i4 + 33;
        f10647e = i6 % 128;
        int i7 = i6 % 2;
        return mode;
    }

    public int getCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f10647e + 73;
        f10646b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.cameraFacing;
        if (i4 != 0) {
            int i6 = 19 / 0;
        }
        return i5;
    }

    @Deprecated
    public FaceRecognitionMode getFaceRecognitionMode() {
        int i2 = 2 % 2;
        int i3 = f10647e + 35;
        int i4 = i3 % 128;
        f10646b = i4;
        int i5 = i3 % 2;
        FaceRecognitionMode faceRecognitionMode = this.faceRecognitionMode;
        int i6 = i4 + 59;
        f10647e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 63 / 0;
        }
        return faceRecognitionMode;
    }

    public LivenessDetectionMode getLivenessDetectionMode() {
        int i2 = 2 % 2;
        int i3 = f10647e + 65;
        f10646b = i3 % 128;
        int i4 = i3 % 2;
        LivenessDetectionMode livenessDetectionMode = this.livenessDetectionMode;
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        return livenessDetectionMode;
    }

    public FaceAuthMode getFaceAuthMode() {
        int i2 = 2 % 2;
        int i3 = f10646b + 19;
        f10647e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.faceAuthMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float getBrightnessThreshold() {
        int i2 = 2 % 2;
        int i3 = f10646b + 47;
        int i4 = i3 % 128;
        f10647e = i4;
        int i5 = i3 % 2;
        float f2 = this.brightnessThreshold;
        int i6 = i4 + 83;
        f10646b = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    public String getConfigurationId() {
        int i2 = 2 % 2;
        int i3 = f10646b + 99;
        f10647e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.configurationId;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    @Deprecated
    public String getCustomerToken() {
        int i2 = 2 % 2;
        int i3 = f10646b + 17;
        f10647e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.customerToken;
        }
        throw null;
    }

    public String getCustomerUUID() {
        int i2 = 2 % 2;
        int i3 = f10647e + 15;
        int i4 = i3 % 128;
        f10646b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.customerUUID;
        int i5 = i4 + 109;
        f10647e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean isClosedEyesCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10647e + 31;
        f10646b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.closedEyesCheckEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isHeadCoverCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10646b + 89;
        f10647e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.headCoverCheckEnabled;
        }
        throw null;
    }

    public boolean isLensesCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10646b + 23;
        f10647e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.lensesCheckEnabled;
        }
        throw null;
    }

    public boolean isMaskCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10647e;
        int i4 = i3 + 37;
        f10646b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.maskCheckEnabled;
        int i6 = i3 + 1;
        f10646b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public boolean isBrightnessCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10646b;
        int i4 = i3 + 37;
        f10647e = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.brightnessCheckEnabled;
        int i5 = i3 + 115;
        f10647e = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public boolean isStoreLocalAuthenticationEnabled() {
        int i2 = 2 % 2;
        int i3 = f10646b + 83;
        f10647e = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.storeLocalAuthenticationEnabled;
        if (i4 == 0) {
            int i5 = 44 / 0;
        }
        return z2;
    }

    public boolean isLogAuthenticationEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10647e + 17;
        int i4 = i3 % 128;
        f10646b = i4;
        if (i3 % 2 != 0) {
            z2 = this.logAuthenticationEnabled;
            int i5 = 6 / 0;
        } else {
            z2 = this.logAuthenticationEnabled;
        }
        int i6 = i4 + 47;
        f10647e = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public boolean isAllowFaceAuthModeFallback() {
        int i2 = 2 % 2;
        int i3 = f10647e + 81;
        f10646b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.allowFaceAuthModeFallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getLogoResId() {
        int i2 = 2 % 2;
        int i3 = f10646b;
        int i4 = i3 + 39;
        f10647e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.logoResId;
        int i7 = i3 + 65;
        f10647e = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public int getAutoCaptureTimeout() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f10647e + 23;
        int i5 = i4 % 128;
        f10646b = i5;
        if (i4 % 2 != 0) {
            i2 = this.autoCaptureTimeout;
            int i6 = 88 / 0;
        } else {
            i2 = this.autoCaptureTimeout;
        }
        int i7 = i5 + 23;
        f10647e = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public int getCaptureAttempts() {
        int i2 = 2 % 2;
        int i3 = f10646b;
        int i4 = i3 + 95;
        f10647e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.captureAttempts;
        int i7 = i3 + 25;
        f10647e = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public boolean isStreamFramesEnabled() {
        int i2 = 2 % 2;
        int i3 = f10647e + 37;
        int i4 = i3 % 128;
        f10646b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.streamFramesEnabled;
        int i5 = i4 + 53;
        f10647e = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public boolean isStreamAudioEnabled() {
        int i2 = 2 % 2;
        int i3 = f10647e + 91;
        int i4 = i3 % 128;
        f10646b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.streamAudioEnabled;
        int i6 = i4 + 7;
        f10647e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return z2;
    }

    public boolean isVideoLivenessRecordingEnabled() {
        int i2 = 2 % 2;
        int i3 = f10647e;
        int i4 = i3 + 23;
        f10646b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.videoLivenessRecordingEnabled;
        int i6 = i3 + 31;
        f10646b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getStreamFramesToken() {
        String str;
        int i2 = 2 % 2;
        int i3 = f10646b + 73;
        int i4 = i3 % 128;
        f10647e = i4;
        if (i3 % 2 == 0) {
            str = this.streamFramesToken;
            int i5 = 41 / 0;
        } else {
            str = this.streamFramesToken;
        }
        int i6 = i4 + 51;
        f10646b = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10647e + 87;
        f10646b = i3 % 128;
        if (i3 % 2 != 0) {
            verifyAddAndProcessDataNotAfterApprove(list);
            verifyNotAfter(list, Modules.FACE_MATCH);
            verifyNotAfter(list, Modules.INE_VALIDATION);
            int i4 = 25 / 0;
        } else {
            verifyAddAndProcessDataNotAfterApprove(list);
            verifyNotAfter(list, Modules.FACE_MATCH);
            verifyNotAfter(list, Modules.INE_VALIDATION);
        }
        int i5 = f10646b + 95;
        f10647e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
    }
}
