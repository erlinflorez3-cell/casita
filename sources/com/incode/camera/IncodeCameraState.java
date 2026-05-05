package com.incode.camera;

import android.util.Size;
import androidx.camera.core.CameraInfo;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/incode/camera/IncodeCameraState;", "", "()V", "Error", "Initialized", "NotInitialized", "Lcom/incode/camera/IncodeCameraState$Error;", "Lcom/incode/camera/IncodeCameraState$Initialized;", "Lcom/incode/camera/IncodeCameraState$NotInitialized;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IncodeCameraState {
    private IncodeCameraState() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/incode/camera/IncodeCameraState$NotInitialized;", "Lcom/incode/camera/IncodeCameraState;", "()V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotInitialized extends IncodeCameraState {
        public NotInitialized() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/incode/camera/IncodeCameraState$Initialized;", "Lcom/incode/camera/IncodeCameraState;", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "resolution", "Landroid/util/Size;", "(Landroidx/camera/core/CameraInfo;Landroid/util/Size;)V", "getCameraInfo", "()Landroidx/camera/core/CameraInfo;", "getResolution", "()Landroid/util/Size;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Initialized extends IncodeCameraState {
        private static int IncodeCamera = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3571e1 = 0;
        private final CameraInfo CameraConstants;
        private final Size getAvailableCameraInternals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialized(CameraInfo cameraInfo, Size size) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraInfo, "");
            this.CameraConstants = cameraInfo;
            this.getAvailableCameraInternals = size;
        }

        public final CameraInfo getCameraInfo() {
            int i2 = 2 % 2;
            int i3 = f3571e1 + 45;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            CameraInfo cameraInfo = this.CameraConstants;
            int i5 = i4 + 109;
            f3571e1 = i5 % 128;
            int i6 = i5 % 2;
            return cameraInfo;
        }

        public final Size getResolution() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 17;
            int i4 = i3 % 128;
            f3571e1 = i4;
            int i5 = i3 % 2;
            Size size = this.getAvailableCameraInternals;
            int i6 = i4 + 27;
            IncodeCamera = i6 % 128;
            int i7 = i6 % 2;
            return size;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/incode/camera/IncodeCameraState$Error;", "Lcom/incode/camera/IncodeCameraState;", SentryEvent.JsonKeys.EXCEPTION, "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends IncodeCameraState {
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private final Throwable getAvailableCameraInternals;

        public Error(Throwable th) {
            super(null);
            this.getAvailableCameraInternals = th;
        }

        public final Throwable getException() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 37;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            int i5 = i3 % 2;
            Throwable th = this.getAvailableCameraInternals;
            int i6 = i4 + 5;
            IncodeCamera = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 32 / 0;
            }
            return th;
        }
    }

    public /* synthetic */ IncodeCameraState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
