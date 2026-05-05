package com.incode.camera.analysis.document;

import android.graphics.Point;
import android.graphics.Rect;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.incode.camera.commons.utils.Side;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b=\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u001eJ\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010B\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010O\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010P\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010Q\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u0084\u0002\u0010R\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\rHÖ\u0001J\t\u0010W\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010,R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b-\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b/\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010,R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0015\u00104R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0013\u00104R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010)\u001a\u0004\b6\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010)\u001a\u0004\b7\u0010(R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b8\u0010\"R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b;\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006X"}, d2 = {"Lcom/incode/camera/analysis/document/CaptureInfo;", "", "quad", "", "Landroid/graphics/Point;", "side", "Lcom/incode/camera/commons/utils/Side;", "cls", "", "blur", "glare", "brightness", "detectionWidth", "", "minDetectionWidth", "maxDetectionWidth", "approximatedRect", "Landroid/graphics/Rect;", FirebaseAnalytics.Param.SCORE, "isVertical", "", "isClassified", "frontScore", "backScore", "idScore", "passportScore", "idType", "", "docAreaRatio", "iouScore", "(Ljava/util/List;Lcom/incode/camera/commons/utils/Side;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Rect;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "getApproximatedRect", "()Landroid/graphics/Rect;", "getBackScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBlur", "getBrightness", "getCls", "getDetectionWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDocAreaRatio", "setDocAreaRatio", "(Ljava/lang/Float;)V", "getFrontScore", "getGlare", "getIdScore", "getIdType", "()Ljava/lang/String;", "getIouScore", "setIouScore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxDetectionWidth", "getMinDetectionWidth", "getPassportScore", "getQuad", "()Ljava/util/List;", "getScore", "getSide", "()Lcom/incode/camera/commons/utils/Side;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Lcom/incode/camera/commons/utils/Side;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Rect;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)Lcom/incode/camera/analysis/document/CaptureInfo;", "equals", "other", "hashCode", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CaptureInfo {
    private static int isZoomSupported = 1;
    private static int toggleTorch = 0;
    private final List<Point> CameraConstants;
    private final Float IncodeCamera;
    private final Side ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final Float f3580e1;
    private final Float getAnalysisEvents;
    private final Float getAvailableCameraInternals;
    private final Boolean getCameraState;
    private final Integer getConfig;
    private final Rect getContext;
    private final Float getExposureCompensationState;
    private final Integer getFrameAnalyzerWrapper;
    private final Boolean getImagePreview;
    private final Integer getPreviewView;
    private Float isVideoLivenessRecordingSupported;
    private final Float setConfig;
    private final Float setExposureCompensationState;
    private final String startCamera;
    private Float startRecording;
    private final Float stopCamera;
    private final Float stopRecording;

    /* JADX WARN: Multi-variable type inference failed */
    public CaptureInfo(List<? extends Point> list, Side side, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Integer num3, Rect rect, Float f6, Boolean bool, Boolean bool2, Float f7, Float f8, Float f9, Float f10, String str, Float f11, Float f12) {
        this.CameraConstants = list;
        this.ProcessCameraProviderExtensionsKt = side;
        this.getAvailableCameraInternals = f2;
        this.IncodeCamera = f3;
        this.f3580e1 = f4;
        this.setConfig = f5;
        this.getConfig = num;
        this.getPreviewView = num2;
        this.getFrameAnalyzerWrapper = num3;
        this.getContext = rect;
        this.getAnalysisEvents = f6;
        this.getImagePreview = bool;
        this.getCameraState = bool2;
        this.getExposureCompensationState = f7;
        this.setExposureCompensationState = f8;
        this.stopCamera = f9;
        this.stopRecording = f10;
        this.startCamera = str;
        this.isVideoLivenessRecordingSupported = f11;
        this.startRecording = f12;
    }

    public /* synthetic */ CaptureInfo(List list, Side side, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Integer num3, Rect rect, Float f6, Boolean bool, Boolean bool2, Float f7, Float f8, Float f9, Float f10, String str, Float f11, Float f12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : side, (i2 & 4) != 0 ? null : f2, (i2 & 8) != 0 ? null : f3, (i2 & 16) != 0 ? null : f4, (i2 & 32) != 0 ? null : f5, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : rect, (i2 & 1024) != 0 ? null : f6, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : f7, (i2 & 16384) != 0 ? null : f8, (32768 & i2) != 0 ? null : f9, (65536 & i2) != 0 ? null : f10, (131072 & i2) != 0 ? null : str, (262144 & i2) != 0 ? null : f11, (i2 & 524288) != 0 ? null : f12);
    }

    public final List<Point> getQuad() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 13;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        List<Point> list = this.CameraConstants;
        int i6 = i3 + 113;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final Side getSide() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 25;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Side side = this.ProcessCameraProviderExtensionsKt;
        int i6 = i3 + 45;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return side;
    }

    public final Float getCls() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 103;
        toggleTorch = i3 % 128;
        if (i3 % 2 == 0) {
            return this.getAvailableCameraInternals;
        }
        throw null;
    }

    public final Float getBlur() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 39;
        isZoomSupported = i3 % 128;
        if (i3 % 2 != 0) {
            return this.IncodeCamera;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float getGlare() {
        Float f2;
        int i2 = 2 % 2;
        int i3 = toggleTorch + 107;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        if (i3 % 2 == 0) {
            f2 = this.f3580e1;
            int i5 = 12 / 0;
        } else {
            f2 = this.f3580e1;
        }
        int i6 = i4 + 41;
        toggleTorch = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float getBrightness() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 19;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        int i5 = i3 % 2;
        Float f2 = this.setConfig;
        int i6 = i4 + 49;
        toggleTorch = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final Integer getDetectionWidth() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 11;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Integer num = this.getConfig;
        int i6 = i4 + 25;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final Integer getMinDetectionWidth() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 59;
        toggleTorch = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.getPreviewView;
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        return num;
    }

    public final Integer getMaxDetectionWidth() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 41;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.getFrameAnalyzerWrapper;
        int i6 = i3 + 61;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final Rect getApproximatedRect() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 9;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Rect rect = this.getContext;
        int i6 = i4 + 109;
        isZoomSupported = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
        return rect;
    }

    public final Float getScore() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 57;
        toggleTorch = i3 % 128;
        int i4 = i3 % 2;
        Float f2 = this.getAnalysisEvents;
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        return f2;
    }

    public final Boolean isVertical() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 11;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Boolean bool = this.getImagePreview;
        int i6 = i4 + 43;
        isZoomSupported = i6 % 128;
        if (i6 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final Boolean isClassified() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 125;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.getCameraState;
        int i5 = i4 + 97;
        toggleTorch = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public final Float getFrontScore() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 49;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.getExposureCompensationState;
        int i6 = i3 + 53;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final Float getBackScore() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported;
        int i4 = i3 + 115;
        toggleTorch = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Float f2 = this.setExposureCompensationState;
        int i5 = i3 + 125;
        toggleTorch = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return f2;
    }

    public final Float getIdScore() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 21;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float f2 = this.stopCamera;
        int i5 = i4 + 17;
        toggleTorch = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public final Float getPassportScore() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 1;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.stopRecording;
        int i6 = i3 + 109;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final String getIdType() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported;
        int i4 = i3 + 43;
        toggleTorch = i4 % 128;
        int i5 = i4 % 2;
        String str = this.startCamera;
        int i6 = i3 + 71;
        toggleTorch = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Float getDocAreaRatio() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 87;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.isVideoLivenessRecordingSupported;
        int i6 = i3 + 7;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final void setDocAreaRatio(Float f2) {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 95;
        isZoomSupported = i3 % 128;
        int i4 = i3 % 2;
        this.isVideoLivenessRecordingSupported = f2;
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
    }

    public final Float getIouScore() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 27;
        isZoomSupported = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Float f2 = this.startRecording;
        int i5 = i3 + 89;
        isZoomSupported = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return f2;
    }

    public final void setIouScore(Float f2) {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 113;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        this.startRecording = f2;
        int i6 = i3 + 71;
        isZoomSupported = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public CaptureInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final boolean equals(Object other) {
        int i2 = 2 % 2;
        if (this == other) {
            int i3 = toggleTorch + 1;
            isZoomSupported = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(other instanceof CaptureInfo)) {
            return false;
        }
        CaptureInfo captureInfo = (CaptureInfo) other;
        if (!Intrinsics.areEqual(this.CameraConstants, captureInfo.CameraConstants)) {
            int i5 = isZoomSupported + 79;
            toggleTorch = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.ProcessCameraProviderExtensionsKt != captureInfo.ProcessCameraProviderExtensionsKt || !Intrinsics.areEqual((Object) this.getAvailableCameraInternals, (Object) captureInfo.getAvailableCameraInternals)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.IncodeCamera, (Object) captureInfo.IncodeCamera)) {
            int i7 = isZoomSupported + 97;
            toggleTorch = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual((Object) this.f3580e1, (Object) captureInfo.f3580e1) || !Intrinsics.areEqual((Object) this.setConfig, (Object) captureInfo.setConfig) || !Intrinsics.areEqual(this.getConfig, captureInfo.getConfig)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getPreviewView, captureInfo.getPreviewView)) {
            int i8 = isZoomSupported + 91;
            toggleTorch = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getFrameAnalyzerWrapper, captureInfo.getFrameAnalyzerWrapper) || !Intrinsics.areEqual(this.getContext, captureInfo.getContext)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.getAnalysisEvents, (Object) captureInfo.getAnalysisEvents)) {
            int i10 = toggleTorch + 113;
            isZoomSupported = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getImagePreview, captureInfo.getImagePreview)) {
            int i12 = isZoomSupported + 21;
            toggleTorch = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getCameraState, captureInfo.getCameraState)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.getExposureCompensationState, (Object) captureInfo.getExposureCompensationState)) {
            int i14 = toggleTorch + 43;
            isZoomSupported = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.setExposureCompensationState, (Object) captureInfo.setExposureCompensationState)) {
            int i16 = toggleTorch + 73;
            isZoomSupported = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.stopCamera, (Object) captureInfo.stopCamera)) {
            int i18 = isZoomSupported + 21;
            toggleTorch = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.stopRecording, (Object) captureInfo.stopRecording) || !Intrinsics.areEqual(this.startCamera, captureInfo.startCamera) || !Intrinsics.areEqual((Object) this.isVideoLivenessRecordingSupported, (Object) captureInfo.isVideoLivenessRecordingSupported) || !Intrinsics.areEqual((Object) this.startRecording, (Object) captureInfo.startRecording)) {
            return false;
        }
        int i20 = isZoomSupported + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        toggleTorch = i20 % 128;
        if (i20 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i2 = 2 % 2;
        List<Point> list = this.CameraConstants;
        int iHashCode8 = 0;
        int iHashCode9 = (list == null ? 0 : list.hashCode()) * 31;
        Side side = this.ProcessCameraProviderExtensionsKt;
        int iHashCode10 = (iHashCode9 + (side == null ? 0 : side.hashCode())) * 31;
        Float f2 = this.getAvailableCameraInternals;
        if (f2 == null) {
            int i3 = toggleTorch;
            int i4 = i3 + 67;
            isZoomSupported = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 71;
            isZoomSupported = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = f2.hashCode();
        }
        int i8 = (iHashCode10 + iHashCode) * 31;
        Float f3 = this.IncodeCamera;
        int iHashCode11 = (i8 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.f3580e1;
        int iHashCode12 = 1;
        if (f4 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = f4.hashCode();
            int i9 = isZoomSupported + 1;
            toggleTorch = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 / 5;
            }
        }
        int i11 = (iHashCode11 + iHashCode2) * 31;
        Float f5 = this.setConfig;
        int iHashCode13 = (i11 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Integer num = this.getConfig;
        if (num == null) {
            int i12 = isZoomSupported + 61;
            toggleTorch = i12 % 128;
            int i13 = i12 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num.hashCode();
        }
        int i14 = (iHashCode13 + iHashCode3) * 31;
        Integer num2 = this.getPreviewView;
        int iHashCode14 = (i14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.getFrameAnalyzerWrapper;
        if (num3 == null) {
            int i15 = isZoomSupported + 53;
            toggleTorch = i15 % 128;
            int i16 = i15 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num3.hashCode();
        }
        int i17 = (iHashCode14 + iHashCode4) * 31;
        Rect rect = this.getContext;
        int iHashCode15 = (i17 + (rect == null ? 0 : rect.hashCode())) * 31;
        Float f6 = this.getAnalysisEvents;
        if (f6 == null) {
            int i18 = toggleTorch + 21;
            isZoomSupported = i18 % 128;
            iHashCode5 = i18 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode5 = f6.hashCode();
        }
        int i19 = (iHashCode15 + iHashCode5) * 31;
        Boolean bool = this.getImagePreview;
        int iHashCode16 = (i19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getCameraState;
        if (bool2 == null) {
            int i20 = isZoomSupported + 37;
            toggleTorch = i20 % 128;
            if (i20 % 2 == 0) {
                iHashCode12 = 0;
            }
        } else {
            iHashCode12 = bool2.hashCode();
        }
        int i21 = (iHashCode16 + iHashCode12) * 31;
        Float f7 = this.getExposureCompensationState;
        if (f7 == null) {
            int i22 = isZoomSupported + 11;
            toggleTorch = i22 % 128;
            int i23 = i22 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = f7.hashCode();
        }
        int i24 = (i21 + iHashCode6) * 31;
        Float f8 = this.setExposureCompensationState;
        int iHashCode17 = (i24 + (f8 == null ? 0 : f8.hashCode())) * 31;
        Float f9 = this.stopCamera;
        int iHashCode18 = (iHashCode17 + (f9 == null ? 0 : f9.hashCode())) * 31;
        Float f10 = this.stopRecording;
        if (f10 == null) {
            int i25 = isZoomSupported + 95;
            toggleTorch = i25 % 128;
            int i26 = i25 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = f10.hashCode();
        }
        int i27 = (iHashCode18 + iHashCode7) * 31;
        String str = this.startCamera;
        int iHashCode19 = (i27 + (str == null ? 0 : str.hashCode())) * 31;
        Float f11 = this.isVideoLivenessRecordingSupported;
        int iHashCode20 = (iHashCode19 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.startRecording;
        if (f12 == null) {
            int i28 = toggleTorch + 97;
            isZoomSupported = i28 % 128;
            int i29 = i28 % 2;
        } else {
            iHashCode8 = f12.hashCode();
        }
        return iHashCode20 + iHashCode8;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 23;
        isZoomSupported = i3 % 128;
        int i4 = i3 % 2;
        String str = "CaptureInfo(quad=" + this.CameraConstants + ", side=" + this.ProcessCameraProviderExtensionsKt + ", cls=" + this.getAvailableCameraInternals + ", blur=" + this.IncodeCamera + ", glare=" + this.f3580e1 + ", brightness=" + this.setConfig + ", detectionWidth=" + this.getConfig + ", minDetectionWidth=" + this.getPreviewView + ", maxDetectionWidth=" + this.getFrameAnalyzerWrapper + ", approximatedRect=" + this.getContext + ", score=" + this.getAnalysisEvents + ", isVertical=" + this.getImagePreview + ", isClassified=" + this.getCameraState + ", frontScore=" + this.getExposureCompensationState + ", backScore=" + this.setExposureCompensationState + ", idScore=" + this.stopCamera + ", passportScore=" + this.stopRecording + ", idType=" + this.startCamera + ", docAreaRatio=" + this.isVideoLivenessRecordingSupported + ", iouScore=" + this.startRecording + ")";
        int i5 = isZoomSupported + 75;
        toggleTorch = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureInfo copy$default(CaptureInfo captureInfo, List list, Side side, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Integer num3, Rect rect, Float f6, Boolean bool, Boolean bool2, Float f7, Float f8, Float f9, Float f10, String str, Float f11, Float f12, int i2, Object obj) {
        List list2 = list;
        Float f13 = f6;
        Integer num4 = num;
        Side side2 = side;
        Float f14 = f5;
        Rect rect2 = rect;
        Float f15 = f3;
        Integer num5 = num3;
        Float f16 = f2;
        Integer num6 = num2;
        Float f17 = f4;
        Float f18 = f11;
        String str2 = str;
        Float f19 = f9;
        Float f20 = f8;
        Boolean bool3 = bool2;
        Float f21 = f7;
        Float f22 = f12;
        Float f23 = f10;
        Boolean bool4 = bool;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            list2 = captureInfo.CameraConstants;
        }
        if ((i2 & 2) != 0) {
            side2 = captureInfo.ProcessCameraProviderExtensionsKt;
        }
        if ((i2 & 4) != 0) {
            int i4 = toggleTorch + 63;
            isZoomSupported = i4 % 128;
            int i5 = i4 % 2;
            f16 = captureInfo.getAvailableCameraInternals;
        }
        if ((i2 & 8) != 0) {
            f15 = captureInfo.IncodeCamera;
        }
        if ((i2 & 16) != 0) {
            int i6 = isZoomSupported + 125;
            toggleTorch = i6 % 128;
            if (i6 % 2 != 0) {
                Float f24 = captureInfo.f3580e1;
                throw null;
            }
            f17 = captureInfo.f3580e1;
        }
        if ((i2 & 32) != 0) {
            int i7 = isZoomSupported + 39;
            toggleTorch = i7 % 128;
            int i8 = i7 % 2;
            f14 = captureInfo.setConfig;
        }
        if ((i2 & 64) != 0) {
            num4 = captureInfo.getConfig;
        }
        if ((i2 & 128) != 0) {
            num6 = captureInfo.getPreviewView;
        }
        if ((i2 & 256) != 0) {
            num5 = captureInfo.getFrameAnalyzerWrapper;
        }
        if ((i2 & 512) != 0) {
            rect2 = captureInfo.getContext;
        }
        if ((i2 & 1024) != 0) {
            f13 = captureInfo.getAnalysisEvents;
        }
        if ((i2 & 2048) != 0) {
            int i9 = toggleTorch + 31;
            isZoomSupported = i9 % 128;
            int i10 = i9 % 2;
            bool4 = captureInfo.getImagePreview;
        }
        if ((i2 & 4096) != 0) {
            bool3 = captureInfo.getCameraState;
        }
        if ((i2 & 8192) != 0) {
            int i11 = isZoomSupported + 115;
            toggleTorch = i11 % 128;
            if (i11 % 2 != 0) {
                Float f25 = captureInfo.getExposureCompensationState;
                throw null;
            }
            f21 = captureInfo.getExposureCompensationState;
        }
        if ((i2 & 16384) != 0) {
            f20 = captureInfo.setExposureCompensationState;
        }
        if ((32768 & i2) != 0) {
            f19 = captureInfo.stopCamera;
        }
        if ((65536 & i2) != 0) {
            f23 = captureInfo.stopRecording;
        }
        if ((131072 & i2) != 0) {
            str2 = captureInfo.startCamera;
        }
        if ((262144 & i2) != 0) {
            f18 = captureInfo.isVideoLivenessRecordingSupported;
        }
        if ((i2 & 524288) != 0) {
            f22 = captureInfo.startRecording;
        }
        return captureInfo.copy(list2, side2, f16, f15, f17, f14, num4, num6, num5, rect2, f13, bool4, bool3, f21, f20, f19, f23, str2, f18, f22);
    }

    public final CaptureInfo copy(List<? extends Point> quad, Side side, Float cls, Float blur, Float glare, Float brightness, Integer detectionWidth, Integer minDetectionWidth, Integer maxDetectionWidth, Rect approximatedRect, Float score, Boolean isVertical, Boolean isClassified, Float frontScore, Float backScore, Float idScore, Float passportScore, String idType, Float docAreaRatio, Float iouScore) {
        int i2 = 2 % 2;
        CaptureInfo captureInfo = new CaptureInfo(quad, side, cls, blur, glare, brightness, detectionWidth, minDetectionWidth, maxDetectionWidth, approximatedRect, score, isVertical, isClassified, frontScore, backScore, idScore, passportScore, idType, docAreaRatio, iouScore);
        int i3 = toggleTorch + 97;
        isZoomSupported = i3 % 128;
        int i4 = i3 % 2;
        return captureInfo;
    }

    public final Float component20() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 113;
        toggleTorch = i3 % 128;
        if (i3 % 2 == 0) {
            return this.startRecording;
        }
        throw null;
    }

    public final Float component19() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 65;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.isVideoLivenessRecordingSupported;
        int i6 = i3 + 47;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final String component18() {
        String str;
        int i2 = 2 % 2;
        int i3 = isZoomSupported;
        int i4 = i3 + 41;
        toggleTorch = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.startCamera;
            int i5 = 36 / 0;
        } else {
            str = this.startCamera;
        }
        int i6 = i3 + 121;
        toggleTorch = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Float component17() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 19;
        int i4 = i3 % 128;
        toggleTorch = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float f2 = this.stopRecording;
        int i5 = i4 + 45;
        isZoomSupported = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public final Float component16() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 39;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Float f2 = this.stopCamera;
        int i6 = i4 + 113;
        isZoomSupported = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
        return f2;
    }

    public final Float component15() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 97;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.setExposureCompensationState;
        int i6 = i3 + 99;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final Float component14() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 85;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        int i5 = i3 % 2;
        Float f2 = this.getExposureCompensationState;
        int i6 = i4 + 61;
        toggleTorch = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 12 / 0;
        }
        return f2;
    }

    public final Boolean component13() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 115;
        toggleTorch = i3 % 128;
        if (i3 % 2 == 0) {
            return this.getCameraState;
        }
        throw null;
    }

    public final Boolean component12() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 39;
        isZoomSupported = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getImagePreview;
        }
        throw null;
    }

    public final Float component11() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 81;
        isZoomSupported = i3 % 128;
        int i4 = i3 % 2;
        Float f2 = this.getAnalysisEvents;
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        return f2;
    }

    public final Rect component10() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 63;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        int i5 = i3 % 2;
        Rect rect = this.getContext;
        int i6 = i4 + 99;
        toggleTorch = i6 % 128;
        int i7 = i6 % 2;
        return rect;
    }

    public final Integer component9() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 121;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Integer num = this.getFrameAnalyzerWrapper;
        int i6 = i4 + 105;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final Integer component8() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 23;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Integer num = this.getPreviewView;
        int i6 = i4 + 85;
        isZoomSupported = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 82 / 0;
        }
        return num;
    }

    public final Integer component7() {
        int i2 = 2 % 2;
        int i3 = toggleTorch + 91;
        int i4 = i3 % 128;
        isZoomSupported = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.getConfig;
        int i5 = i4 + 27;
        toggleTorch = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Float component6() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 81;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.setConfig;
        int i6 = i3 + 125;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final Float component5() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported;
        int i4 = i3 + 17;
        toggleTorch = i4 % 128;
        int i5 = i4 % 2;
        Float f2 = this.f3580e1;
        int i6 = i3 + 41;
        toggleTorch = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final Float component4() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported;
        int i4 = i3 + 41;
        toggleTorch = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Float f2 = this.IncodeCamera;
        int i5 = i3 + 87;
        toggleTorch = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public final Float component3() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported + 111;
        int i4 = i3 % 128;
        toggleTorch = i4;
        int i5 = i3 % 2;
        Float f2 = this.getAvailableCameraInternals;
        int i6 = i4 + 121;
        isZoomSupported = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Side component2() {
        int i2 = 2 % 2;
        int i3 = isZoomSupported;
        int i4 = i3 + 85;
        toggleTorch = i4 % 128;
        int i5 = i4 % 2;
        Side side = this.ProcessCameraProviderExtensionsKt;
        int i6 = i3 + 81;
        toggleTorch = i6 % 128;
        if (i6 % 2 == 0) {
            return side;
        }
        throw null;
    }

    public final List<Point> component1() {
        int i2 = 2 % 2;
        int i3 = toggleTorch;
        int i4 = i3 + 21;
        isZoomSupported = i4 % 128;
        int i5 = i4 % 2;
        List<Point> list = this.CameraConstants;
        int i6 = i3 + 59;
        isZoomSupported = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }
}
