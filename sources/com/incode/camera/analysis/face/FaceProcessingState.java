package com.incode.camera.analysis.face;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/incode/camera/analysis/face/FaceProcessingState;", "", "(Ljava/lang/String;I)V", "EMPTY", "NO_FACE", "NO_LANDMARKS", "INSUFFICIENT_FACE_SIZE", "FACE_DETECTED", "FACE_PROCESSING_STARTED", "FACE_TOO_CLOSE", "NOT_READY", "DETECTOR_ERROR", "FACE_ROTATED_LEFT", "FACE_ROTATED_RIGHT", "FACE_TILTED_LEFT", "FACE_TILTED_RIGHT", "LIGHT_TOO_DARK", "BLURRED_CROP", "FACE_NOT_IN_CONSTRAINT", "MULTIPLE_FACES_DETECTED", "EYES_CLOSED", "GET_READY", "LENSES_DETECTED", "FACE_MASK_DETECTED", "TEMPLATE_EXTRACTED", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceProcessingState {
    private static int CameraConstants = 0;
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final /* synthetic */ FaceProcessingState[] f3622e1;
    private static final /* synthetic */ EnumEntries getAvailableCameraInternals;
    private static int getFrameAnalyzerWrapper = 1;
    public static final FaceProcessingState EMPTY = new FaceProcessingState("EMPTY", 0);
    public static final FaceProcessingState NO_FACE = new FaceProcessingState("NO_FACE", 1);
    public static final FaceProcessingState NO_LANDMARKS = new FaceProcessingState("NO_LANDMARKS", 2);
    public static final FaceProcessingState INSUFFICIENT_FACE_SIZE = new FaceProcessingState("INSUFFICIENT_FACE_SIZE", 3);
    public static final FaceProcessingState FACE_DETECTED = new FaceProcessingState("FACE_DETECTED", 4);
    public static final FaceProcessingState FACE_PROCESSING_STARTED = new FaceProcessingState("FACE_PROCESSING_STARTED", 5);
    public static final FaceProcessingState FACE_TOO_CLOSE = new FaceProcessingState("FACE_TOO_CLOSE", 6);
    public static final FaceProcessingState NOT_READY = new FaceProcessingState("NOT_READY", 7);
    public static final FaceProcessingState DETECTOR_ERROR = new FaceProcessingState("DETECTOR_ERROR", 8);
    public static final FaceProcessingState FACE_ROTATED_LEFT = new FaceProcessingState("FACE_ROTATED_LEFT", 9);
    public static final FaceProcessingState FACE_ROTATED_RIGHT = new FaceProcessingState("FACE_ROTATED_RIGHT", 10);
    public static final FaceProcessingState FACE_TILTED_LEFT = new FaceProcessingState("FACE_TILTED_LEFT", 11);
    public static final FaceProcessingState FACE_TILTED_RIGHT = new FaceProcessingState("FACE_TILTED_RIGHT", 12);
    public static final FaceProcessingState LIGHT_TOO_DARK = new FaceProcessingState("LIGHT_TOO_DARK", 13);
    public static final FaceProcessingState BLURRED_CROP = new FaceProcessingState("BLURRED_CROP", 14);
    public static final FaceProcessingState FACE_NOT_IN_CONSTRAINT = new FaceProcessingState("FACE_NOT_IN_CONSTRAINT", 15);
    public static final FaceProcessingState MULTIPLE_FACES_DETECTED = new FaceProcessingState("MULTIPLE_FACES_DETECTED", 16);
    public static final FaceProcessingState EYES_CLOSED = new FaceProcessingState("EYES_CLOSED", 17);
    public static final FaceProcessingState GET_READY = new FaceProcessingState("GET_READY", 18);
    public static final FaceProcessingState LENSES_DETECTED = new FaceProcessingState("LENSES_DETECTED", 19);
    public static final FaceProcessingState FACE_MASK_DETECTED = new FaceProcessingState("FACE_MASK_DETECTED", 20);
    public static final FaceProcessingState TEMPLATE_EXTRACTED = new FaceProcessingState("TEMPLATE_EXTRACTED", 21);

    private FaceProcessingState(String str, int i2) {
    }

    static {
        FaceProcessingState[] faceProcessingStateArrProcessCameraProviderExtensionsKt = ProcessCameraProviderExtensionsKt();
        f3622e1 = faceProcessingStateArrProcessCameraProviderExtensionsKt;
        getAvailableCameraInternals = EnumEntriesKt.enumEntries(faceProcessingStateArrProcessCameraProviderExtensionsKt);
        int i2 = CameraConstants + 125;
        getFrameAnalyzerWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
    }

    private static final /* synthetic */ FaceProcessingState[] ProcessCameraProviderExtensionsKt() {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 69;
        int i4 = i3 % 128;
        ProcessCameraProviderExtensionsKt = i4;
        int i5 = i3 % 2;
        FaceProcessingState[] faceProcessingStateArr = {EMPTY, NO_FACE, NO_LANDMARKS, INSUFFICIENT_FACE_SIZE, FACE_DETECTED, FACE_PROCESSING_STARTED, FACE_TOO_CLOSE, NOT_READY, DETECTOR_ERROR, FACE_ROTATED_LEFT, FACE_ROTATED_RIGHT, FACE_TILTED_LEFT, FACE_TILTED_RIGHT, LIGHT_TOO_DARK, BLURRED_CROP, FACE_NOT_IN_CONSTRAINT, MULTIPLE_FACES_DETECTED, EYES_CLOSED, GET_READY, LENSES_DETECTED, FACE_MASK_DETECTED, TEMPLATE_EXTRACTED};
        int i6 = i4 + 93;
        IncodeCamera = i6 % 128;
        if (i6 % 2 != 0) {
            return faceProcessingStateArr;
        }
        throw null;
    }

    public static EnumEntries<FaceProcessingState> getEntries() {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 35;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        if (i3 % 2 == 0) {
            return getAvailableCameraInternals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FaceProcessingState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 89;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        int i4 = i3 % 2;
        FaceProcessingState faceProcessingState = (FaceProcessingState) Enum.valueOf(FaceProcessingState.class, str);
        int i5 = IncodeCamera + 59;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        int i6 = i5 % 2;
        return faceProcessingState;
    }

    public static FaceProcessingState[] values() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 21;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        FaceProcessingState[] faceProcessingStateArr = (FaceProcessingState[]) f3622e1.clone();
        int i5 = IncodeCamera + 99;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        int i6 = i5 % 2;
        return faceProcessingStateArr;
    }
}
