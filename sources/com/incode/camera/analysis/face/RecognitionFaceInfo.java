package com.incode.camera.analysis.face;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003Jw\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\u0013\u00109\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*¨\u0006>"}, d2 = {"Lcom/incode/camera/analysis/face/RecognitionFaceInfo;", "", "faceBitmap", "Landroid/graphics/Bitmap;", "templateId", "", "template", "rex", "", "rey", "lex", "ley", "cmx", "cmy", "isBlocked", "", "predictionConfidence", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;FFFFFFZF)V", "getCmx", "()F", "setCmx", "(F)V", "getCmy", "setCmy", "getFaceBitmap", "()Landroid/graphics/Bitmap;", "()Z", "setBlocked", "(Z)V", "getLex", "setLex", "getLey", "setLey", "getPredictionConfidence", "setPredictionConfidence", "getRex", "setRex", "getRey", "setRey", "getTemplate", "()Ljava/lang/String;", "setTemplate", "(Ljava/lang/String;)V", "getTemplateId", "setTemplateId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RecognitionFaceInfo {
    private static int getAnalysisEvents = 0;
    private static int getCameraState = 1;
    private String CameraConstants;
    private String IncodeCamera;
    private final Bitmap ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private float f3626e1;
    private float getAvailableCameraInternals;
    private float getConfig;
    private float getContext;
    private float getFrameAnalyzerWrapper;
    private boolean getPreviewView;
    private float setConfig;
    private float setExposureCompensationState;

    public RecognitionFaceInfo(Bitmap bitmap, String str, String str2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ProcessCameraProviderExtensionsKt = bitmap;
        this.IncodeCamera = str;
        this.CameraConstants = str2;
        this.f3626e1 = f2;
        this.getAvailableCameraInternals = f3;
        this.getFrameAnalyzerWrapper = f4;
        this.setConfig = f5;
        this.getContext = f6;
        this.getConfig = f7;
        this.getPreviewView = z2;
        this.setExposureCompensationState = f8;
    }

    public final Bitmap getFaceBitmap() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 21;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Bitmap bitmap = this.ProcessCameraProviderExtensionsKt;
        int i5 = i4 + 79;
        getAnalysisEvents = i5 % 128;
        int i6 = i5 % 2;
        return bitmap;
    }

    public /* synthetic */ RecognitionFaceInfo(Bitmap bitmap, String str, String str2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i2 & 2) != 0 ? "" : str, str2, f2, f3, f4, f5, f6, f7, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? -1.0f : f8);
    }

    public final String getTemplateId() {
        String str;
        int i2 = 2 % 2;
        int i3 = getCameraState + 121;
        int i4 = i3 % 128;
        getAnalysisEvents = i4;
        if (i3 % 2 != 0) {
            str = this.IncodeCamera;
            int i5 = 50 / 0;
        } else {
            str = this.IncodeCamera;
        }
        int i6 = i4 + 93;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void setTemplateId(String str) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 51;
        getAnalysisEvents = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IncodeCamera = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.IncodeCamera = str;
            throw null;
        }
    }

    public final String getTemplate() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents;
        int i4 = i3 + 39;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        String str = this.CameraConstants;
        int i6 = i3 + 107;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void setTemplate(String str) {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 123;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.CameraConstants = str;
        int i5 = getAnalysisEvents + 19;
        getCameraState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float getRex() {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 113;
        getAnalysisEvents = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.f3626e1;
        int i6 = i3 + 29;
        getAnalysisEvents = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final void setRex(float f2) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 89;
        int i4 = i3 % 128;
        getAnalysisEvents = i4;
        int i5 = i3 % 2;
        this.f3626e1 = f2;
        int i6 = i4 + 35;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getRey() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents;
        int i4 = i3 + 107;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.getAvailableCameraInternals;
        int i6 = i3 + 23;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final void setRey(float f2) {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents;
        int i4 = i3 + 13;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        this.getAvailableCameraInternals = f2;
        int i6 = i3 + 25;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final float getLex() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 69;
        int i4 = i3 % 128;
        getAnalysisEvents = i4;
        int i5 = i3 % 2;
        float f2 = this.getFrameAnalyzerWrapper;
        int i6 = i4 + 105;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        throw null;
    }

    public final void setLex(float f2) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 97;
        int i4 = i3 % 128;
        getAnalysisEvents = i4;
        int i5 = i3 % 2;
        this.getFrameAnalyzerWrapper = f2;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 33;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final float getLey() {
        float f2;
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 7;
        getAnalysisEvents = i4 % 128;
        if (i4 % 2 != 0) {
            f2 = this.setConfig;
            int i5 = 48 / 0;
        } else {
            f2 = this.setConfig;
        }
        int i6 = i3 + 31;
        getAnalysisEvents = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final void setLey(float f2) {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 63;
        getAnalysisEvents = i4 % 128;
        int i5 = i4 % 2;
        this.setConfig = f2;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 97;
        getAnalysisEvents = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
    }

    public final float getCmx() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 55;
        getCameraState = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getContext;
        }
        throw null;
    }

    public final void setCmx(float f2) {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 53;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        this.getContext = f2;
        if (i5 == 0) {
            int i6 = 12 / 0;
        }
        int i7 = i4 + 33;
        getAnalysisEvents = i7 % 128;
        int i8 = i7 % 2;
    }

    public final float getCmy() {
        float f2;
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 107;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            f2 = this.getConfig;
            int i5 = 51 / 0;
        } else {
            f2 = this.getConfig;
        }
        int i6 = i4 + 59;
        getAnalysisEvents = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final void setCmy(float f2) {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 59;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        this.getConfig = f2;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isBlocked() {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 29;
        getAnalysisEvents = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.getPreviewView;
        int i6 = i3 + 81;
        getAnalysisEvents = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final void setBlocked(boolean z2) {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents;
        int i4 = i3 + 17;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.getPreviewView = z2;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 33;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final float getPredictionConfidence() {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 49;
        getAnalysisEvents = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        float f2 = this.setExposureCompensationState;
        int i5 = i3 + 101;
        getAnalysisEvents = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public final void setPredictionConfidence(float f2) {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 69;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        this.setExposureCompensationState = f2;
        if (i5 == 0) {
            int i6 = 69 / 0;
        }
        int i7 = i4 + 57;
        getAnalysisEvents = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object other) {
        int i2 = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecognitionFaceInfo)) {
            return false;
        }
        RecognitionFaceInfo recognitionFaceInfo = (RecognitionFaceInfo) other;
        if (!Intrinsics.areEqual(this.ProcessCameraProviderExtensionsKt, recognitionFaceInfo.ProcessCameraProviderExtensionsKt) || !Intrinsics.areEqual(this.IncodeCamera, recognitionFaceInfo.IncodeCamera) || !Intrinsics.areEqual(this.CameraConstants, recognitionFaceInfo.CameraConstants) || Float.compare(this.f3626e1, recognitionFaceInfo.f3626e1) != 0 || Float.compare(this.getAvailableCameraInternals, recognitionFaceInfo.getAvailableCameraInternals) != 0) {
            return false;
        }
        if (Float.compare(this.getFrameAnalyzerWrapper, recognitionFaceInfo.getFrameAnalyzerWrapper) != 0) {
            int i3 = getAnalysisEvents + 95;
            getCameraState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Float.compare(this.setConfig, recognitionFaceInfo.setConfig) != 0) {
            int i5 = getCameraState + 95;
            getAnalysisEvents = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Float.compare(this.getContext, recognitionFaceInfo.getContext) != 0 || Float.compare(this.getConfig, recognitionFaceInfo.getConfig) != 0) {
            return false;
        }
        if (this.getPreviewView == recognitionFaceInfo.getPreviewView) {
            return Float.compare(this.setExposureCompensationState, recognitionFaceInfo.setExposureCompensationState) == 0;
        }
        int i7 = getCameraState + 61;
        getAnalysisEvents = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 29;
        getAnalysisEvents = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((((((((((this.ProcessCameraProviderExtensionsKt.hashCode() * 31) + this.IncodeCamera.hashCode()) * 31) + this.CameraConstants.hashCode()) * 31) + Float.hashCode(this.f3626e1)) * 31) + Float.hashCode(this.getAvailableCameraInternals)) * 31) + Float.hashCode(this.getFrameAnalyzerWrapper)) * 31) + Float.hashCode(this.setConfig)) * 31) + Float.hashCode(this.getContext)) * 31) + Float.hashCode(this.getConfig)) * 31) + Boolean.hashCode(this.getPreviewView)) * 31) + Float.hashCode(this.setExposureCompensationState);
        int i5 = getCameraState + 97;
        getAnalysisEvents = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 75;
        getAnalysisEvents = i3 % 128;
        int i4 = i3 % 2;
        String str = "RecognitionFaceInfo(faceBitmap=" + this.ProcessCameraProviderExtensionsKt + ", templateId=" + this.IncodeCamera + ", template=" + this.CameraConstants + ", rex=" + this.f3626e1 + ", rey=" + this.getAvailableCameraInternals + ", lex=" + this.getFrameAnalyzerWrapper + ", ley=" + this.setConfig + ", cmx=" + this.getContext + ", cmy=" + this.getConfig + ", isBlocked=" + this.getPreviewView + ", predictionConfidence=" + this.setExposureCompensationState + ")";
        int i5 = getAnalysisEvents + 65;
        getCameraState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ RecognitionFaceInfo copy$default(RecognitionFaceInfo recognitionFaceInfo, Bitmap bitmap, String str, String str2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            bitmap = recognitionFaceInfo.ProcessCameraProviderExtensionsKt;
        }
        if ((i2 & 2) != 0) {
            int i4 = getCameraState + 17;
            getAnalysisEvents = i4 % 128;
            int i5 = i4 % 2;
            str = recognitionFaceInfo.IncodeCamera;
        }
        if ((i2 & 4) != 0) {
            int i6 = getCameraState + 67;
            getAnalysisEvents = i6 % 128;
            if (i6 % 2 != 0) {
                str2 = recognitionFaceInfo.CameraConstants;
                int i7 = 54 / 0;
            } else {
                str2 = recognitionFaceInfo.CameraConstants;
            }
        }
        if ((i2 & 8) != 0) {
            f2 = recognitionFaceInfo.f3626e1;
        }
        if ((i2 & 16) != 0) {
            f3 = recognitionFaceInfo.getAvailableCameraInternals;
        }
        if ((i2 & 32) != 0) {
            int i8 = getAnalysisEvents + 11;
            getCameraState = i8 % 128;
            int i9 = i8 % 2;
            f4 = recognitionFaceInfo.getFrameAnalyzerWrapper;
        }
        if ((i2 & 64) != 0) {
            f5 = recognitionFaceInfo.setConfig;
        }
        if ((i2 & 128) != 0) {
            f6 = recognitionFaceInfo.getContext;
        }
        if ((i2 & 256) != 0) {
            f7 = recognitionFaceInfo.getConfig;
        }
        if ((i2 & 512) != 0) {
            int i10 = getAnalysisEvents + 101;
            getCameraState = i10 % 128;
            int i11 = i10 % 2;
            z2 = recognitionFaceInfo.getPreviewView;
        }
        if ((i2 & 1024) != 0) {
            f8 = recognitionFaceInfo.setExposureCompensationState;
        }
        return recognitionFaceInfo.copy(bitmap, str, str2, f2, f3, f4, f5, f6, f7, z2, f8);
    }

    public final RecognitionFaceInfo copy(Bitmap faceBitmap, String templateId, String template, float rex, float rey, float lex, float ley, float cmx, float cmy, boolean isBlocked, float predictionConfidence) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(faceBitmap, "");
        Intrinsics.checkNotNullParameter(templateId, "");
        Intrinsics.checkNotNullParameter(template, "");
        RecognitionFaceInfo recognitionFaceInfo = new RecognitionFaceInfo(faceBitmap, templateId, template, rex, rey, lex, ley, cmx, cmy, isBlocked, predictionConfidence);
        int i3 = getCameraState + 93;
        getAnalysisEvents = i3 % 128;
        if (i3 % 2 == 0) {
            return recognitionFaceInfo;
        }
        throw null;
    }

    public final float component11() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 93;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f2 = this.setExposureCompensationState;
        int i5 = i4 + 53;
        getAnalysisEvents = i5 % 128;
        if (i5 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    public final boolean component10() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 13;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.getPreviewView;
        if (i4 == 0) {
            int i5 = 82 / 0;
        }
        return z2;
    }

    public final float component9() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 35;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f2 = this.getConfig;
        int i5 = i4 + 113;
        getAnalysisEvents = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return f2;
    }

    public final float component8() {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 101;
        getAnalysisEvents = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.getContext;
        int i6 = i3 + 125;
        getAnalysisEvents = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component7() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 109;
        getAnalysisEvents = i3 % 128;
        if (i3 % 2 == 0) {
            return this.setConfig;
        }
        throw null;
    }

    public final float component6() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 115;
        getCameraState = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getFrameAnalyzerWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component5() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 17;
        int i4 = i3 % 128;
        getCameraState = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f2 = this.getAvailableCameraInternals;
        int i5 = i4 + 23;
        getAnalysisEvents = i5 % 128;
        if (i5 % 2 == 0) {
            return f2;
        }
        obj.hashCode();
        throw null;
    }

    public final float component4() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents;
        int i4 = i3 + 61;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.f3626e1;
        int i6 = i3 + 17;
        getCameraState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return f2;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 37;
        getAnalysisEvents = i3 % 128;
        if (i3 % 2 == 0) {
            return this.CameraConstants;
        }
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 37;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IncodeCamera;
        int i5 = i4 + 79;
        getAnalysisEvents = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Bitmap component1() {
        int i2 = 2 % 2;
        int i3 = getAnalysisEvents + 107;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        Bitmap bitmap = this.ProcessCameraProviderExtensionsKt;
        int i6 = i4 + 117;
        getAnalysisEvents = i6 % 128;
        int i7 = i6 % 2;
        return bitmap;
    }
}
