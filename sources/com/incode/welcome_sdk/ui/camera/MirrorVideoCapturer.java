package com.incode.welcome_sdk.ui.camera;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.view.Display;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.opentok.android.BaseVideoCapturer;
import com.opentok.android.Publisher;
import com.opentok.android.VideoUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class MirrorVideoCapturer extends BaseVideoCapturer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f11493l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f11494m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11495n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f11496o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Camera.CameraInfo f11497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Publisher.CameraCaptureFrameRate f11498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Camera.Size f11499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Display f11500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Publisher.CameraCaptureResolution f11507k;

    public final Publisher.CameraCaptureFrameRate getPreferredFrameRate() {
        int i2 = 2 % 2;
        int i3 = f11495n;
        int i4 = i3 + 83;
        f11493l = i4 % 128;
        int i5 = i4 % 2;
        Publisher.CameraCaptureFrameRate cameraCaptureFrameRate = this.f11498b;
        int i6 = i3 + 37;
        f11493l = i6 % 128;
        int i7 = i6 % 2;
        return cameraCaptureFrameRate;
    }

    public MirrorVideoCapturer(Display display, Camera.Size size, Publisher.CameraCaptureFrameRate cameraCaptureFrameRate, Camera.CameraInfo cameraInfo) {
        Intrinsics.checkNotNullParameter(display, "");
        Intrinsics.checkNotNullParameter(size, "");
        Intrinsics.checkNotNullParameter(cameraCaptureFrameRate, "");
        this.f11500d = display;
        this.f11499c = size;
        this.f11498b = cameraCaptureFrameRate;
        this.f11497a = cameraInfo;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Publisher.CameraCaptureResolution getActualResolution() {
        int i2 = 2 % 2;
        int i3 = f11493l;
        int i4 = i3 + 95;
        f11495n = i4 % 128;
        int i5 = i4 % 2;
        Publisher.CameraCaptureResolution cameraCaptureResolution = this.f11507k;
        int i6 = i3 + 79;
        f11495n = i6 % 128;
        int i7 = i6 % 2;
        return cameraCaptureResolution;
    }

    public final void setActualResolution(Publisher.CameraCaptureResolution cameraCaptureResolution) {
        int i2 = 2 % 2;
        int i3 = f11495n;
        int i4 = i3 + 79;
        f11493l = i4 % 128;
        int i5 = i4 % 2;
        this.f11507k = cameraCaptureResolution;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 9;
        f11493l = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void init() {
        int i2 = 2 % 2;
        int i3 = f11495n + 97;
        f11493l = i3 % 128;
        int i4 = i3 % 2;
        a();
        int i5 = f11493l + 79;
        f11495n = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final synchronized int startCapture() {
        int i2 = 2 % 2;
        int i3 = f11495n;
        int i4 = i3 + 33;
        f11493l = i4 % 128;
        if (i4 % 2 == 0) {
            if (this.f11502f) {
                return -1;
            }
            this.f11504h = true;
            this.f11502f = true;
            int i5 = i3 + 53;
            f11493l = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        throw null;
    }

    public final synchronized int stopCapture() {
        int i2 = 2 % 2;
        int i3 = f11493l + 125;
        int i4 = i3 % 128;
        f11495n = i4;
        int i5 = i3 % 2;
        this.f11502f = false;
        int i6 = i4 + 111;
        f11493l = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    public final void destroy() {
        int i2 = 2 % 2;
        int i3 = f11495n + 23;
        f11493l = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isCaptureStarted() {
        int i2 = 2 % 2;
        int i3 = f11493l + 69;
        int i4 = i3 % 128;
        f11495n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f11502f;
        int i6 = i4 + 49;
        f11493l = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final BaseVideoCapturer.CaptureSettings getCaptureSettings() {
        int i2 = 2 % 2;
        VideoUtils.Size sizeA = a();
        int iB = b();
        BaseVideoCapturer.CaptureSettings captureSettings = new BaseVideoCapturer.CaptureSettings();
        this.f11501e = sizeA.width;
        int i3 = sizeA.height;
        this.f11505i = i3;
        this.f11503g = ((this.f11501e * i3) * ImageFormat.getBitsPerPixel(17)) / 8;
        captureSettings.fps = iB;
        captureSettings.width = this.f11501e;
        captureSettings.height = this.f11505i;
        captureSettings.format = 1;
        captureSettings.expectedDelay = 0;
        int i4 = f11495n + 53;
        f11493l = i4 % 128;
        int i5 = i4 % 2;
        return captureSettings;
    }

    public final synchronized void onPause() {
        int i2 = 2 % 2;
        int i3 = f11493l + 103;
        int i4 = i3 % 128;
        f11495n = i4;
        int i5 = i3 % 2;
        if (this.f11502f) {
            int i6 = i4 + 19;
            f11493l = i6 % 128;
            int i7 = i6 % 2;
            this.f11506j = true;
            stopCapture();
            int i8 = f11495n + 5;
            f11493l = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 2;
            } else {
                int i10 = 2 % 2;
            }
        }
    }

    public final void onResume() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f11495n + 109;
        int i4 = i3 % 128;
        f11493l = i4;
        int i5 = i3 % 2;
        if (this.f11506j) {
            int i6 = i4 + 95;
            f11495n = i6 % 128;
            if (i6 % 2 == 0) {
                startCapture();
                z2 = true;
            } else {
                startCapture();
                z2 = false;
            }
            this.f11506j = z2;
        }
    }

    private final int c() {
        int i2 = 2 % 2;
        int i3 = f11495n + 67;
        int i4 = i3 % 128;
        f11493l = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Camera.CameraInfo cameraInfo = this.f11497a;
        if (cameraInfo == null) {
            return 0;
        }
        int i5 = i4 + 111;
        f11495n = i5 % 128;
        int i6 = i5 % 2;
        int i7 = cameraInfo.orientation;
        if (i6 != 0) {
            return i7;
        }
        throw null;
    }

    private final boolean e() {
        int i2 = 2 % 2;
        Camera.CameraInfo cameraInfo = this.f11497a;
        if (cameraInfo != null) {
            int i3 = f11493l + 63;
            f11495n = i3 % 128;
            return i3 % 2 != 0 ? cameraInfo.facing == 1 : cameraInfo.facing == 1;
        }
        int i4 = f11495n + 85;
        f11493l = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final void onPreviewFrame(byte[] bArr) {
        Integer numValueOf;
        int i2 = 2 % 2;
        int i3 = f11493l;
        int i4 = i3 + 47;
        int i5 = i4 % 128;
        f11495n = i5;
        int i6 = i4 % 2;
        if (this.f11504h) {
            Object obj = null;
            if (bArr != null) {
                int i7 = i3 + 91;
                f11495n = i7 % 128;
                if (i7 % 2 == 0) {
                    Integer.valueOf(bArr.length);
                    obj.hashCode();
                    throw null;
                }
                numValueOf = Integer.valueOf(bArr.length);
            } else {
                int i8 = i5 + 17;
                f11493l = i8 % 128;
                int i9 = i8 % 2;
                numValueOf = null;
            }
            int i10 = this.f11503g;
            if (numValueOf == null) {
                int i11 = f11493l;
                int i12 = i11 + 105;
                f11495n = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i13 = i11 + 35;
                f11495n = i13 % 128;
                int i14 = i13 % 2;
            } else if (numValueOf.intValue() == i10) {
                int i15 = f11493l + 41;
                f11495n = i15 % 128;
                if (i15 % 2 == 0) {
                    provideByteArrayFrame(bArr, 0, this.f11501e, this.f11505i, e(this.f11500d.getRotation()), e());
                    return;
                } else {
                    provideByteArrayFrame(bArr, 1, this.f11501e, this.f11505i, e(this.f11500d.getRotation()), e());
                    return;
                }
            }
            Timber.Forest.i("VideoCapturer: Got a frame that's not the expected size: " + this.f11503g + ", actual size: " + numValueOf + ", frame width: " + this.f11501e + "; frame height: " + this.f11505i, new Object[0]);
        }
    }

    private final int e(int i2) {
        int i3 = 2 % 2;
        int i4 = 0;
        if (i2 == 0) {
            int i5 = f11495n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f11493l = i5 % 128;
            int i6 = i5 % 2;
        } else if (i2 == 1) {
            i4 = 270;
        } else if (i2 == 2) {
            i4 = 180;
        } else if (i2 == 3) {
            int i7 = f11495n + 15;
            f11493l = i7 % 128;
            int i8 = i7 % 2;
            i4 = 90;
        }
        int iC = c();
        if (e()) {
            return (((360 - i4) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) + iC) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        }
        return (i4 + iC) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.opentok.android.VideoUtils.Size a() {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.MirrorVideoCapturer.a():com.opentok.android.VideoUtils$Size");
    }

    private final int b() {
        int i2 = 2 % 2;
        int i3 = WhenMappings.f11511e[this.f11498b.ordinal()];
        if (i3 == 1) {
            return 30;
        }
        if (i3 == 2) {
            return 15;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = f11495n + 7;
            f11493l = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 27 / 0;
            }
            return 1;
        }
        int i6 = f11495n + 39;
        f11493l = i6 % 128;
        if (i6 % 2 == 0) {
            return 7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11509b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11510c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f11511e;

        static {
            int[] iArr = new int[Publisher.CameraCaptureResolution.values().length];
            try {
                iArr[Publisher.CameraCaptureResolution.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Publisher.CameraCaptureResolution.MEDIUM.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Publisher.CameraCaptureResolution.HIGH_1080P.ordinal()] = 3;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            f11508a = iArr;
            int[] iArr2 = new int[Publisher.CameraCaptureFrameRate.values().length];
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_30.ordinal()] = 1;
                int i4 = f11510c + 79;
                f11509b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_15.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_7.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Publisher.CameraCaptureFrameRate.FPS_1.ordinal()] = 4;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            f11511e = iArr2;
            int i8 = f11510c + 105;
            f11509b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    static {
        new Companion(null);
        int i2 = f11496o + 19;
        f11494m = i2 % 128;
        int i3 = i2 % 2;
    }
}
