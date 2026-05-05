package com.incode.welcome_sdk.ui.camera;

import android.graphics.ImageFormat;
import android.util.Size;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.Global;
import com.incode.camera.IncodeCameraState;
import com.opentok.android.BaseVideoCapturer;
import com.opentok.android.Publisher;
import com.opentok.android.VideoUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraXVideoCapturer extends BaseVideoCapturer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11468g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f11469i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Publisher.CameraCaptureResolution f11470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeCameraState.Initialized f11472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Publisher.CameraCaptureFrameRate f11473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11474e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BaseVideoCapturer.CaptureSettings f11475j;

    public CameraXVideoCapturer(IncodeCameraState.Initialized initialized, int i2) {
        Intrinsics.checkNotNullParameter(initialized, "");
        this.f11472c = initialized;
        Publisher.CameraCaptureResolution cameraCaptureResolution = Publisher.CameraCaptureResolution.HIGH;
        this.f11470a = cameraCaptureResolution;
        Publisher.CameraCaptureFrameRate cameraCaptureFrameRate = Publisher.CameraCaptureFrameRate.FPS_1;
        this.f11473d = cameraCaptureFrameRate;
        boolean z2 = i2 == 2;
        this.f11474e = z2;
        Size resolution = initialized.getResolution();
        int width = resolution != null ? resolution.getWidth() : 0;
        Size resolution2 = initialized.getResolution();
        this.f11471b = ((width * (resolution2 != null ? resolution2.getHeight() : 0)) * ImageFormat.getBitsPerPixel(z2 ? 17 : 35)) / 8;
        BaseVideoCapturer.CaptureSettings captureSettings = new BaseVideoCapturer.CaptureSettings();
        VideoUtils.Size sizeC = c(cameraCaptureResolution);
        captureSettings.width = sizeC.width;
        captureSettings.height = sizeC.height;
        captureSettings.fps = c(cameraCaptureFrameRate);
        captureSettings.format = z2 ? 2 : 3;
        captureSettings.expectedDelay = 0;
        Timber.Forest forest = Timber.Forest;
        int i3 = captureSettings.width;
        int i4 = captureSettings.height;
        Size resolution3 = initialized.getResolution();
        Integer numValueOf = resolution3 != null ? Integer.valueOf(resolution3.getWidth()) : null;
        Size resolution4 = initialized.getResolution();
        forest.d(StringsKt.trimIndent("\n            Setup video capturer with resolution: " + i3 + " x " + i4 + ".\n            Camera resolution feed: " + numValueOf + Global.BLANK + (resolution4 != null ? Integer.valueOf(resolution4.getHeight()) : null) + "\n        "), new Object[0]);
        this.f11475j = captureSettings;
    }

    public final Publisher.CameraCaptureResolution getOpenTokCaptureResolution() {
        int i2 = 2 % 2;
        int i3 = f11469i + 69;
        f11468g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f11470a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Publisher.CameraCaptureFrameRate getPreferredFrameRate() {
        int i2 = 2 % 2;
        int i3 = f11469i + 31;
        int i4 = i3 % 128;
        f11468g = i4;
        int i5 = i3 % 2;
        Publisher.CameraCaptureFrameRate cameraCaptureFrameRate = this.f11473d;
        int i6 = i4 + 105;
        f11469i = i6 % 128;
        int i7 = i6 % 2;
        return cameraCaptureFrameRate;
    }

    public final BaseVideoCapturer.CaptureSettings getCaptureSettings() {
        int i2 = 2 % 2;
        int i3 = f11469i;
        int i4 = i3 + 51;
        f11468g = i4 % 128;
        int i5 = i4 % 2;
        BaseVideoCapturer.CaptureSettings captureSettings = this.f11475j;
        int i6 = i3 + 47;
        f11468g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return captureSettings;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCameraFrame(androidx.camera.core.ImageProxy r19) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXVideoCapturer.onCameraFrame(androidx.camera.core.ImageProxy):void");
    }

    private static VideoUtils.Size c(Publisher.CameraCaptureResolution cameraCaptureResolution) {
        int i2 = 2 % 2;
        VideoUtils.Size size = new VideoUtils.Size();
        int i3 = WhenMappings.f11478c[cameraCaptureResolution.ordinal()];
        if (i3 == 1) {
            size.width = 352;
            size.height = 288;
            int i4 = f11468g + 17;
            f11469i = i4 % 128;
            int i5 = i4 % 2;
        } else if (i3 == 2) {
            size.width = OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE;
            size.height = 480;
        } else if (i3 == 3) {
            size.width = 1920;
            size.height = PhotoshopDirectory.TAG_COUNT_INFORMATION;
        } else {
            size.width = 1280;
            size.height = 720;
        }
        return size;
    }

    private static int c(Publisher.CameraCaptureFrameRate cameraCaptureFrameRate) {
        int i2 = 2 % 2;
        int i3 = f11468g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f11469i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = WhenMappings.f11476a[cameraCaptureFrameRate.ordinal()];
            if (i4 == 1) {
                int i5 = f11468g + 15;
                f11469i = i5 % 128;
                if (i5 % 2 == 0) {
                    return 30;
                }
                throw null;
            }
            if (i4 == 2) {
                return 15;
            }
            if (i4 == 3) {
                return 7;
            }
            if (i4 == 4) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i6 = WhenMappings.f11476a[cameraCaptureFrameRate.ordinal()];
        throw null;
    }

    public final boolean isCaptureStarted() {
        int i2 = 2 % 2;
        int i3 = f11469i;
        int i4 = i3 + 93;
        f11468g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 77;
        f11468g = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void init() {
        int i2 = 2 % 2;
        int i3 = f11468g + 97;
        f11469i = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int startCapture() {
        int i2 = 2 % 2;
        int i3 = f11469i;
        int i4 = i3 + 123;
        f11468g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 105;
        f11468g = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    public final int stopCapture() {
        int i2 = 2 % 2;
        int i3 = f11469i;
        int i4 = i3 + 41;
        f11468g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        f11468g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 26 / 0;
        }
        return 0;
    }

    public final void onPause() {
        int i2 = 2 % 2;
        int i3 = f11468g + 37;
        f11469i = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onResume() {
        int i2 = 2 % 2;
        int i3 = f11468g + 81;
        f11469i = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void destroy() {
        int i2 = 2 % 2;
        int i3 = f11469i + 1;
        f11468g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11477b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f11478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11479d = 0;

        static {
            int[] iArr = new int[Publisher.CameraCaptureResolution.values().length];
            try {
                iArr[Publisher.CameraCaptureResolution.LOW.ordinal()] = 1;
                int i2 = f11477b + 61;
                f11479d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Publisher.CameraCaptureResolution.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Publisher.CameraCaptureResolution.HIGH_1080P.ordinal()] = 3;
                int i4 = f11477b + 13;
                f11479d = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            f11478c = iArr;
            int[] iArr2 = new int[Publisher.CameraCaptureFrameRate.values().length];
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_30.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_15.ordinal()] = 2;
                int i7 = f11479d + 55;
                f11477b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_7.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f11476a = iArr2;
        }
    }
}
