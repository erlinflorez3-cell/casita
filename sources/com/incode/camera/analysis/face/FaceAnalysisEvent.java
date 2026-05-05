package com.incode.camera.analysis.face;

import android.graphics.Bitmap;
import com.braze.models.FeatureFlag;
import com.incode.camera.analysis.AnalysisEvent;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "Lcom/incode/camera/analysis/AnalysisEvent;", "()V", "Crop", "Error", "FaceRotated", "FaceTilted", "FaceTooClose", "FaceTooFar", "LensesDetected", "NoFaceDetected", "NoLandmarksDetected", "Template", "TooDark", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$Crop;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$Error;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceRotated;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTilted;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTooClose;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTooFar;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$LensesDetected;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$NoFaceDetected;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$NoLandmarksDetected;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$Template;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$TooDark;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FaceAnalysisEvent implements AnalysisEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$TooDark;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TooDark extends FaceAnalysisEvent {
        private static int CameraConstants = 1;
        public static final TooDark INSTANCE = new TooDark();

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3616e1 = 0;

        private TooDark() {
            super(null);
        }

        static {
            int i2 = CameraConstants + 101;
            f3616e1 = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    private FaceAnalysisEvent() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$NoFaceDetected;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoFaceDetected extends FaceAnalysisEvent {
        public static final NoFaceDetected INSTANCE = new NoFaceDetected();
        private static int IncodeCamera = 1;
        private static int getAvailableCameraInternals = 0;

        private NoFaceDetected() {
            super(null);
        }

        static {
            int i2 = IncodeCamera + 39;
            getAvailableCameraInternals = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$Template;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "template", "", "(Ljava/lang/String;)V", "getTemplate", "()Ljava/lang/String;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Template extends FaceAnalysisEvent {
        private static int IncodeCamera = 0;
        private static int getAvailableCameraInternals = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private final String f3615e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Template(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.f3615e1 = str;
        }

        public final String getTemplate() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 121;
            getAvailableCameraInternals = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            String str = this.f3615e1;
            int i5 = i3 + 15;
            getAvailableCameraInternals = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$Error;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", SentryEvent.JsonKeys.EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends FaceAnalysisEvent {
        private static int CameraConstants = 1;
        private static int ProcessCameraProviderExtensionsKt = 0;
        private final Exception getAvailableCameraInternals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            this.getAvailableCameraInternals = exc;
        }

        public final Exception getException() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 99;
            CameraConstants = i3 % 128;
            if (i3 % 2 != 0) {
                return this.getAvailableCameraInternals;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceRotated;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "Left", "Right", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class FaceRotated extends FaceAnalysisEvent {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceRotated$Left;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceRotated;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Left extends FaceRotated {
            private static int CameraConstants = 1;
            public static final Left INSTANCE = new Left();

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3611e1 = 0;

            private Left() {
            }

            static {
                int i2 = CameraConstants + 5;
                f3611e1 = i2 % 128;
                int i3 = i2 % 2;
            }
        }

        public FaceRotated() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceRotated$Right;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceRotated;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Right extends FaceRotated {
            public static final Right INSTANCE = new Right();
            private static int IncodeCamera = 1;

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3612e1 = 0;

            private Right() {
            }

            static {
                int i2 = IncodeCamera + 11;
                f3612e1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 53 / 0;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTilted;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "Left", "Right", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class FaceTilted extends FaceAnalysisEvent {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTilted$Left;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTilted;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Left extends FaceTilted {
            private static int CameraConstants = 0;
            public static final Left INSTANCE = new Left();
            private static int IncodeCamera = 1;

            private Left() {
            }

            static {
                int i2 = IncodeCamera + 3;
                CameraConstants = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
        }

        public FaceTilted() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTilted$Right;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTilted;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Right extends FaceTilted {
            public static final Right INSTANCE = new Right();
            private static int ProcessCameraProviderExtensionsKt = 1;
            private static int getAvailableCameraInternals = 0;

            private Right() {
            }

            static {
                int i2 = ProcessCameraProviderExtensionsKt + 43;
                getAvailableCameraInternals = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$Crop;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", FeatureFlag.PROPERTIES_TYPE_IMAGE, "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Crop extends FaceAnalysisEvent {
        private static int CameraConstants = 1;
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private final Bitmap f3610e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crop(Bitmap bitmap) {
            super(null);
            Intrinsics.checkNotNullParameter(bitmap, "");
            this.f3610e1 = bitmap;
        }

        public final Bitmap getImage() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 103;
            CameraConstants = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f3610e1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$LensesDetected;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LensesDetected extends FaceAnalysisEvent {
        private static int CameraConstants = 1;
        public static final LensesDetected INSTANCE = new LensesDetected();
        private static int ProcessCameraProviderExtensionsKt = 0;

        private LensesDetected() {
            super(null);
        }

        static {
            int i2 = ProcessCameraProviderExtensionsKt + 19;
            CameraConstants = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTooClose;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceTooClose extends FaceAnalysisEvent {
        public static final FaceTooClose INSTANCE = new FaceTooClose();
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;

        private FaceTooClose() {
            super(null);
        }

        static {
            int i2 = ProcessCameraProviderExtensionsKt + 51;
            IncodeCamera = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$FaceTooFar;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceTooFar extends FaceAnalysisEvent {
        public static final FaceTooFar INSTANCE = new FaceTooFar();
        private static int IncodeCamera = 0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3613e1 = 1;

        private FaceTooFar() {
            super(null);
        }

        static {
            int i2 = f3613e1 + 113;
            IncodeCamera = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalysisEvent$NoLandmarksDetected;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoLandmarksDetected extends FaceAnalysisEvent {
        public static final NoLandmarksDetected INSTANCE = new NoLandmarksDetected();

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3614e1 = 1;
        private static int getAvailableCameraInternals = 0;

        private NoLandmarksDetected() {
            super(null);
        }

        static {
            int i2 = f3614e1 + 1;
            getAvailableCameraInternals = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public /* synthetic */ FaceAnalysisEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
