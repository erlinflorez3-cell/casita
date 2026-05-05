package com.incode.camera.commons.utils;

import android.graphics.PointF;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.recogkitandroid.Face;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020\fJ\u0006\u0010'\u001a\u00020\fJ\u000e\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\fJ\u0006\u0010+\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u001e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u001e\u0010 \u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u001e\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000bR\u001e\u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000f¨\u0006-"}, d2 = {"Lcom/incode/camera/commons/utils/FaceLandmarks;", "", "()V", "<set-?>", "", "landmarkCount", "getLandmarkCount", "()I", "Landroid/graphics/PointF;", "leftEye", "getLeftEye", "()Landroid/graphics/PointF;", "", "leftEyeDetected", "getLeftEyeDetected", "()Z", "", "leftEyeOpenProbability", "getLeftEyeOpenProbability", "()F", "leftMouth", "getLeftMouth", "leftMouthDetected", "getLeftMouthDetected", "noseTip", "getNoseTip", "noseTipDetected", "getNoseTipDetected", "rightEye", "getRightEye", "rightEyeDetected", "getRightEyeDetected", "rightEyeOpenProbability", "getRightEyeOpenProbability", "rightMouth", "getRightMouth", "rightMouthDetected", "getRightMouthDetected", "allLandmarksDetected", "eyesDetected", "eyesOpen", "eyesOpenThreshold", "mouthEdgesDetected", "recognitionLandmarksDetected", "Companion", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceLandmarks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int MAX_NUM_OF_FACE_LANDMARKS = 5;
    private static int getCameraState = 1;
    private static int getImagePreview = 0;
    private static int isVideoLivenessRecordingSupported = 1;
    private static int stopCamera = 0;
    private boolean CameraConstants;
    private int IncodeCamera;
    private boolean ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private boolean f3633e1;
    private boolean getAvailableCameraInternals;
    private boolean getConfig;
    private float getExposureCompensationState;
    private float setExposureCompensationState;
    private PointF getPreviewView = new PointF();
    private PointF setConfig = new PointF();
    private PointF getContext = new PointF();
    private PointF getFrameAnalyzerWrapper = new PointF();
    private PointF getAnalysisEvents = new PointF();

    public static final /* synthetic */ void access$setLandmarkCount$p(FaceLandmarks faceLandmarks, int i2) {
        int i3 = 2 % 2;
        int i4 = getImagePreview;
        int i5 = i4 + 45;
        getCameraState = i5 % 128;
        int i6 = i5 % 2;
        faceLandmarks.IncodeCamera = i2;
        int i7 = i4 + 17;
        getCameraState = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setLeftEye$p(FaceLandmarks faceLandmarks, PointF pointF) {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 83;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        faceLandmarks.setConfig = pointF;
        if (i5 == 0) {
            int i6 = 31 / 0;
        }
        int i7 = i3 + 11;
        getCameraState = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$setLeftEyeDetected$p(FaceLandmarks faceLandmarks, boolean z2) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 33;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        faceLandmarks.f3633e1 = z2;
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
    }

    public static final /* synthetic */ void access$setLeftEyeOpenProbability$p(FaceLandmarks faceLandmarks, float f2) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 57;
        int i4 = i3 % 128;
        getImagePreview = i4;
        int i5 = i3 % 2;
        faceLandmarks.setExposureCompensationState = f2;
        int i6 = i4 + 121;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setLeftMouth$p(FaceLandmarks faceLandmarks, PointF pointF) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 23;
        getImagePreview = i3 % 128;
        int i4 = i3 % 2;
        faceLandmarks.getFrameAnalyzerWrapper = pointF;
        if (i4 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$setLeftMouthDetected$p(FaceLandmarks faceLandmarks, boolean z2) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 23;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        faceLandmarks.ProcessCameraProviderExtensionsKt = z2;
        int i6 = i4 + 89;
        getImagePreview = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$setNoseTip$p(FaceLandmarks faceLandmarks, PointF pointF) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        faceLandmarks.getAnalysisEvents = pointF;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 97;
        getImagePreview = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$setNoseTipDetected$p(FaceLandmarks faceLandmarks, boolean z2) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 63;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        faceLandmarks.getConfig = z2;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setRightEye$p(FaceLandmarks faceLandmarks, PointF pointF) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 93;
        getImagePreview = i3 % 128;
        int i4 = i3 % 2;
        faceLandmarks.getPreviewView = pointF;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setRightEyeDetected$p(FaceLandmarks faceLandmarks, boolean z2) {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 49;
        getImagePreview = i4 % 128;
        int i5 = i4 % 2;
        faceLandmarks.CameraConstants = z2;
        int i6 = i3 + 57;
        getImagePreview = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
    }

    public static final /* synthetic */ void access$setRightEyeOpenProbability$p(FaceLandmarks faceLandmarks, float f2) {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 101;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        faceLandmarks.getExposureCompensationState = f2;
        int i6 = i3 + 83;
        getCameraState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 81 / 0;
        }
    }

    public static final /* synthetic */ void access$setRightMouth$p(FaceLandmarks faceLandmarks, PointF pointF) {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 55;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        faceLandmarks.getContext = pointF;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 69;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setRightMouthDetected$p(FaceLandmarks faceLandmarks, boolean z2) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 53;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        faceLandmarks.getAvailableCameraInternals = z2;
        if (i5 == 0) {
            int i6 = 83 / 0;
        }
        int i7 = i4 + 5;
        getImagePreview = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 15 / 0;
        }
    }

    public final int getLandmarkCount() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 117;
        getCameraState = i3 % 128;
        if (i3 % 2 != 0) {
            return this.IncodeCamera;
        }
        throw null;
    }

    public final boolean getRightEyeDetected() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = getImagePreview + 17;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            z2 = this.CameraConstants;
            int i5 = 44 / 0;
        } else {
            z2 = this.CameraConstants;
        }
        int i6 = i4 + 7;
        getImagePreview = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getLeftEyeDetected() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 17;
        getCameraState = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f3633e1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getRightMouthDetected() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 5;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        boolean z2 = this.getAvailableCameraInternals;
        int i6 = i4 + 49;
        getImagePreview = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getLeftMouthDetected() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 125;
        int i4 = i3 % 128;
        getImagePreview = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.ProcessCameraProviderExtensionsKt;
        int i5 = i4 + 107;
        getCameraState = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean getNoseTipDetected() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = getImagePreview + 17;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            z2 = this.getConfig;
            int i5 = 86 / 0;
        } else {
            z2 = this.getConfig;
        }
        int i6 = i4 + 65;
        getImagePreview = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final PointF getRightEye() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 53;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        PointF pointF = this.getPreviewView;
        int i6 = i4 + 113;
        getImagePreview = i6 % 128;
        if (i6 % 2 == 0) {
            return pointF;
        }
        throw null;
    }

    public final PointF getLeftEye() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 105;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        PointF pointF = this.setConfig;
        int i6 = i4 + 121;
        getImagePreview = i6 % 128;
        int i7 = i6 % 2;
        return pointF;
    }

    public final PointF getRightMouth() {
        PointF pointF;
        int i2 = 2 % 2;
        int i3 = getImagePreview + 69;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            pointF = this.getContext;
            int i5 = 43 / 0;
        } else {
            pointF = this.getContext;
        }
        int i6 = i4 + 99;
        getImagePreview = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return pointF;
    }

    public final PointF getLeftMouth() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 83;
        int i4 = i3 % 128;
        getImagePreview = i4;
        int i5 = i3 % 2;
        PointF pointF = this.getFrameAnalyzerWrapper;
        int i6 = i4 + 29;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
        return pointF;
    }

    public final PointF getNoseTip() {
        PointF pointF;
        int i2 = 2 % 2;
        int i3 = getCameraState + 101;
        int i4 = i3 % 128;
        getImagePreview = i4;
        if (i3 % 2 != 0) {
            pointF = this.getAnalysisEvents;
            int i5 = 13 / 0;
        } else {
            pointF = this.getAnalysisEvents;
        }
        int i6 = i4 + 105;
        getCameraState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return pointF;
    }

    public final float getLeftEyeOpenProbability() {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 125;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.setExposureCompensationState;
        int i6 = i3 + 55;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getRightEyeOpenProbability() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 7;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        float f2 = this.getExposureCompensationState;
        int i6 = i4 + 105;
        getImagePreview = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean eyesDetected() {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r5 = com.incode.camera.commons.utils.FaceLandmarks.getImagePreview
            int r0 = r5 + 77
            int r4 = r0 % 128
            com.incode.camera.commons.utils.FaceLandmarks.getCameraState = r4
            int r0 = r0 % r6
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L23
            boolean r1 = r7.CameraConstants
            r0 = 29
            int r0 = r0 / r2
            if (r1 == 0) goto L27
        L17:
            boolean r0 = r7.f3633e1
            if (r0 == 0) goto L27
            int r1 = r4 + 55
            int r0 = r1 % 128
            com.incode.camera.commons.utils.FaceLandmarks.getImagePreview = r0
            int r1 = r1 % r6
            return r3
        L23:
            boolean r0 = r7.CameraConstants
            if (r0 == r3) goto L17
        L27:
            int r1 = r5 + 81
            int r0 = r1 % 128
            com.incode.camera.commons.utils.FaceLandmarks.getCameraState = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L31
            return r2
        L31:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.commons.utils.FaceLandmarks.eyesDetected():boolean");
    }

    public final boolean mouthEdgesDetected() {
        int i2 = 2 % 2;
        int i3 = getCameraState + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        getImagePreview = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.getAvailableCameraInternals) {
            return false;
        }
        int i5 = i4 + 97;
        getCameraState = i5 % 128;
        if (i5 % 2 != 0) {
            return this.ProcessCameraProviderExtensionsKt;
        }
        throw null;
    }

    public final boolean recognitionLandmarksDetected() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 47;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        if (eyesDetected()) {
            int i5 = getCameraState + 121;
            getImagePreview = i5 % 128;
            int i6 = i5 % 2;
            if (mouthEdgesDetected() && this.getConfig) {
                return true;
            }
        }
        int i7 = getCameraState + 11;
        getImagePreview = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean allLandmarksDetected() {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 61;
        getCameraState = i4 % 128;
        if (i4 % 2 != 0 ? this.IncodeCamera != 5 : this.IncodeCamera != 4) {
            return false;
        }
        int i5 = i3 + 87;
        getCameraState = i5 % 128;
        return true ^ (i5 % 2 == 0);
    }

    public final boolean eyesOpen(float eyesOpenThreshold) {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 117;
        getCameraState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
            if (this.setExposureCompensationState > eyesOpenThreshold) {
                return true;
            }
        } else if (this.setExposureCompensationState > eyesOpenThreshold) {
            return true;
        }
        if (this.getExposureCompensationState > eyesOpenThreshold) {
            return true;
        }
        int i6 = i3 + 123;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/incode/camera/commons/utils/FaceLandmarks$Companion;", "", "()V", "MAX_NUM_OF_FACE_LANDMARKS", "", "from", "Lcom/incode/camera/commons/utils/FaceLandmarks;", "detectedFace", "Lcom/incode/recogkitandroid/Face;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private static int CameraConstants = 0;
        private static int IncodeCamera = 1;

        private Companion() {
        }

        public final FaceLandmarks from(Face detectedFace) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(detectedFace, "");
            FaceLandmarks faceLandmarks = new FaceLandmarks();
            if (detectedFace.rightEye != null) {
                FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() + 1);
                FaceLandmarks.access$setRightEyeDetected$p(faceLandmarks, true);
                PointF pointF = detectedFace.rightEye;
                Intrinsics.checkNotNullExpressionValue(pointF, "");
                FaceLandmarks.access$setRightEye$p(faceLandmarks, pointF);
            }
            if (detectedFace.leftEye != null) {
                int i3 = CameraConstants + 111;
                IncodeCamera = i3 % 128;
                if (i3 % 2 == 0) {
                    FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() - 1);
                    FaceLandmarks.access$setLeftEyeDetected$p(faceLandmarks, false);
                } else {
                    FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() + 1);
                    FaceLandmarks.access$setLeftEyeDetected$p(faceLandmarks, true);
                }
                PointF pointF2 = detectedFace.leftEye;
                Intrinsics.checkNotNullExpressionValue(pointF2, "");
                FaceLandmarks.access$setLeftEye$p(faceLandmarks, pointF2);
            }
            if (detectedFace.rightMouthCorner != null) {
                int i4 = IncodeCamera + 77;
                CameraConstants = i4 % 128;
                if (i4 % 2 != 0) {
                    FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() << 1);
                    FaceLandmarks.access$setRightMouthDetected$p(faceLandmarks, false);
                } else {
                    FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() + 1);
                    FaceLandmarks.access$setRightMouthDetected$p(faceLandmarks, true);
                }
                PointF pointF3 = detectedFace.rightMouthCorner;
                Intrinsics.checkNotNullExpressionValue(pointF3, "");
                FaceLandmarks.access$setRightMouth$p(faceLandmarks, pointF3);
            }
            if (detectedFace.leftMouthCorner != null) {
                FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() + 1);
                FaceLandmarks.access$setLeftMouthDetected$p(faceLandmarks, true);
                PointF pointF4 = detectedFace.leftMouthCorner;
                Intrinsics.checkNotNullExpressionValue(pointF4, "");
                FaceLandmarks.access$setLeftMouth$p(faceLandmarks, pointF4);
            }
            if (detectedFace.noseTip != null) {
                FaceLandmarks.access$setLandmarkCount$p(faceLandmarks, faceLandmarks.getLandmarkCount() + 1);
                FaceLandmarks.access$setNoseTipDetected$p(faceLandmarks, true);
                PointF pointF5 = detectedFace.noseTip;
                Intrinsics.checkNotNullExpressionValue(pointF5, "");
                FaceLandmarks.access$setNoseTip$p(faceLandmarks, pointF5);
            }
            FaceLandmarks.access$setRightEyeOpenProbability$p(faceLandmarks, 1.0f);
            FaceLandmarks.access$setLeftEyeOpenProbability$p(faceLandmarks, 1.0f);
            int i5 = IncodeCamera + 21;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return faceLandmarks;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i2 = isVideoLivenessRecordingSupported + 1;
        stopCamera = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
