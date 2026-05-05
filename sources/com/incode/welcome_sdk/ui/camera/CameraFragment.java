package com.incode.welcome_sdk.ui.camera;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.hbisoft.hbrecorder.HBRecorder;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.extensions.g;
import com.incode.welcome_sdk.commons.extensions.j;
import com.incode.welcome_sdk.commons.ui.BlurTransformation;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.ag;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.sentry.protocol.SentryStackFrame;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NotImplementedError;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import timber.log.Timber;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CameraFragment extends FragmentWithListener<CameraFragmentInterface> implements CameraContract.View {
    private static int G = 1;
    private static int I = 0;
    private static int L = 1;
    private static int M = 0;
    private int A;
    private int B;
    private int C;
    private CameraPreviewType D;
    private int E;
    private int F;
    private Runnable H;

    /* JADX INFO: renamed from: a */
    private int f11212a;

    /* JADX INFO: renamed from: b */
    private final Executor f11213b;

    /* JADX INFO: renamed from: c */
    private boolean f11214c;

    /* JADX INFO: renamed from: d */
    private Scheduler f11215d;

    /* JADX INFO: renamed from: e */
    private final int f11216e;

    /* JADX INFO: renamed from: f */
    private boolean f11217f;

    /* JADX INFO: renamed from: g */
    private int f11218g;

    /* JADX INFO: renamed from: h */
    private boolean f11219h;

    /* JADX INFO: renamed from: i */
    private int f11220i;

    /* JADX INFO: renamed from: j */
    private boolean f11221j;

    /* JADX INFO: renamed from: k */
    private boolean f11222k;

    /* JADX INFO: renamed from: l */
    private int f11223l;

    /* JADX INFO: renamed from: m */
    private HBRecorder f11224m;

    /* JADX INFO: renamed from: n */
    private float f11225n;

    /* JADX INFO: renamed from: o */
    private CameraPreview f11226o;

    /* JADX INFO: renamed from: p */
    private boolean f11227p;

    /* JADX INFO: renamed from: q */
    private final String f11228q;

    /* JADX INFO: renamed from: r */
    private int f11229r;

    /* JADX INFO: renamed from: s */
    private boolean f11230s;

    /* JADX INFO: renamed from: t */
    private boolean f11231t;

    /* JADX INFO: renamed from: u */
    private ViewGroup f11232u;

    /* JADX INFO: renamed from: v */
    private MovementDetector f11233v;

    /* JADX INFO: renamed from: w */
    private CameraPresenter f11234w;

    /* JADX INFO: renamed from: x */
    private Camera f11235x;

    /* JADX INFO: renamed from: y */
    private ImageView f11236y;

    /* JADX INFO: renamed from: z */
    private int f11237z;

    public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~(i8 | i5)) | i10 | (~(i9 | i5));
        int i12 = ~i5;
        int i13 = (~(i12 | i9 | i6)) | (~(i8 | i12 | i2));
        int i14 = i6 + i2 + i7 + ((-195996979) * i3) + ((-904719387) * i4);
        int i15 = i14 * i14;
        int i16 = (i6 * 1886715248) + 940376064 + (1886715248 * i2) + (i11 * (-42925423)) + (i10 * (-42925423)) + ((-42925423) * i13) + (1843789824 * i7) + ((-1389494272) * i3) + (1623064576 * i4) + (1510801408 * i15);
        int i17 = (i6 * 1590984816) + 1398186415 + (i2 * 1590984816) + (i11 * 737) + (i10 * 737) + (i13 * 737) + (i7 * 1590985553) + (i3 * (-1025631779)) + (i4 * 1121679989) + (i15 * 622657536);
        int i18 = i16 + (i17 * i17 * (-1928134656));
        return i18 != 1 ? i18 != 2 ? e(objArr) : a(objArr) : c(objArr);
    }

    protected abstract CameraPreviewType getCameraType();

    protected abstract boolean shouldRecordScreen();

    public static final /* synthetic */ Scheduler access$getMCameraScheduler$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G + 23;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        Scheduler scheduler = cameraFragment.f11215d;
        int i6 = i4 + 25;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return scheduler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access$getMIgnorePictureSize$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G + 89;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        boolean z2 = cameraFragment.f11222k;
        int i6 = i4 + 55;
        G = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public static final /* synthetic */ int access$getMLastKnownOrientation$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 67;
        G = i4 % 128;
        int i5 = i4 % 2;
        int i6 = cameraFragment.f11216e;
        int i7 = i3 + 27;
        G = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 17 / 0;
        }
        return i6;
    }

    public static final /* synthetic */ int access$getMMaxPictureSizeHeight$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 79;
        I = i4 % 128;
        int i5 = i4 % 2;
        int i6 = cameraFragment.f11220i;
        int i7 = i3 + 13;
        I = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public static final /* synthetic */ int access$getMMinPictureSizeHeight$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G + 37;
        I = i3 % 128;
        int i4 = i3 % 2;
        int i5 = cameraFragment.f11223l;
        if (i4 != 0) {
            int i6 = 40 / 0;
        }
        return i5;
    }

    public static final /* synthetic */ float access$getMSavedCameraScale$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 3;
        I = i4 % 128;
        int i5 = i4 % 2;
        float f2 = cameraFragment.f11225n;
        int i6 = i3 + 95;
        I = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public static final /* synthetic */ int access$getMTargetCameraPreviewHeight$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = I + 69;
        G = i3 % 128;
        int i4 = i3 % 2;
        int i5 = cameraFragment.f11218g;
        if (i4 != 0) {
            return i5;
        }
        throw null;
    }

    public static final /* synthetic */ int access$getMTargetCameraPreviewWidth$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 85;
        I = i4 % 128;
        int i5 = i4 % 2;
        int i6 = cameraFragment.f11212a;
        int i7 = i3 + 93;
        I = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public static final /* synthetic */ boolean access$getMUseHeightPaddingFactor$p(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 99;
        G = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = cameraFragment.f11219h;
        int i6 = i3 + 113;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CameraFragment() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
        ExecutorService executorService = executorServiceNewSingleThreadExecutor;
        this.f11213b = executorService;
        Scheduler schedulerFrom = Schedulers.from(executorService);
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "");
        this.f11215d = schedulerFrom;
        this.f11212a = 720;
        this.f11218g = 1280;
        this.f11220i = 1920;
        this.f11223l = PhotoshopDirectory.TAG_COUNT_INFORMATION;
        this.f11222k = true;
        this.f11225n = 1.0f;
        this.f11229r = -1;
        this.f11228q = "android.permission.CAMERA";
    }

    public interface CameraFragmentInterface {
        void onFinishConcatAudioVideo(VideoSelfieResult videoSelfieResult);

        void onFinishUsingCamera(BaseResult baseResult);

        void showPermissionsMandatoryDialog(PermissionsMandatoryDialog permissionsMandatoryDialog);

        public static final class DefaultImpls {

            /* JADX INFO: renamed from: c */
            private static int f11238c = 1;

            /* JADX INFO: renamed from: d */
            private static int f11239d = 0;

            public static /* synthetic */ void onFinishUsingCamera$default(CameraFragmentInterface cameraFragmentInterface, BaseResult baseResult, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = f11238c + 73;
                int i5 = i4 % 128;
                f11239d = i5;
                Object obj2 = null;
                if (i4 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFinishUsingCamera");
                }
                if ((i2 & 1) != 0) {
                    int i6 = i5 + 17;
                    f11238c = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    baseResult = null;
                }
                cameraFragmentInterface.onFinishUsingCamera(baseResult);
                int i7 = f11238c + 37;
                f11239d = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 88 / 0;
                }
            }
        }
    }

    public final CameraPreview getMPreview() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 75;
        I = i4 % 128;
        int i5 = i4 % 2;
        CameraPreview cameraPreview = this.f11226o;
        int i6 = i3 + 1;
        I = i6 % 128;
        int i7 = i6 % 2;
        return cameraPreview;
    }

    protected final void setMPreview(CameraPreview cameraPreview) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 97;
        I = i4 % 128;
        int i5 = i4 % 2;
        this.f11226o = cameraPreview;
        int i6 = i3 + 55;
        I = i6 % 128;
        int i7 = i6 % 2;
    }

    protected final boolean getMSaveInstanceStateCalled() {
        int i2 = 2 % 2;
        int i3 = I + 41;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f11227p;
        int i6 = i4 + 9;
        I = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    protected final void setMSaveInstanceStateCalled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = I + 67;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11227p = z2;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final int getMActiveCameraId() {
        int i2 = 2 % 2;
        int i3 = G + 91;
        int i4 = i3 % 128;
        I = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.f11229r;
        int i6 = i4 + 123;
        G = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    protected final void setMActiveCameraId(int i2) {
        int i3 = 2 % 2;
        int i4 = I + 71;
        G = i4 % 128;
        int i5 = i4 % 2;
        this.f11229r = i2;
        if (i5 == 0) {
            throw null;
        }
    }

    protected final boolean getPendingShowPermissionsMandatoryDialog() {
        int i2 = 2 % 2;
        int i3 = I + 113;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f11231t;
        int i6 = i4 + 117;
        I = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    protected final void setPendingShowPermissionsMandatoryDialog(boolean z2) {
        int i2 = 2 % 2;
        int i3 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        I = i3 % 128;
        int i4 = i3 % 2;
        this.f11231t = z2;
        if (i4 != 0) {
            throw null;
        }
    }

    protected final boolean getPermissionDialogShowed() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 73;
        G = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f11230s;
        int i5 = i3 + 95;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    protected final void setPermissionDialogShowed(boolean z2) {
        int i2 = 2 % 2;
        int i3 = I + 49;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11230s = z2;
        if (i4 == 0) {
            int i5 = 27 / 0;
        }
    }

    public final String getCameraPermission() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 103;
        G = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f11228q;
        int i5 = i3 + 45;
        G = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    protected final MovementDetector getMMovementDetector() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 11;
        G = i4 % 128;
        int i5 = i4 % 2;
        MovementDetector movementDetector = this.f11233v;
        int i6 = i3 + 111;
        G = i6 % 128;
        int i7 = i6 % 2;
        return movementDetector;
    }

    protected final void setMMovementDetector(MovementDetector movementDetector) {
        int i2 = 2 % 2;
        int i3 = G + 91;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        this.f11233v = movementDetector;
        int i6 = i4 + 51;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 92 / 0;
        }
    }

    public final CameraPresenter getMCameraPresenter() {
        int i2 = 2 % 2;
        int i3 = I + 109;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CameraPresenter cameraPresenter = this.f11234w;
        if (cameraPresenter != null) {
            return cameraPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        I = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setMCameraPresenter(CameraPresenter cameraPresenter) {
        int i2 = 2 % 2;
        int i3 = I + 115;
        G = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraPresenter, "");
            this.f11234w = cameraPresenter;
            throw null;
        }
        Intrinsics.checkNotNullParameter(cameraPresenter, "");
        this.f11234w = cameraPresenter;
        int i4 = G + 77;
        I = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final ViewGroup getMPreviewLayout() {
        int i2 = 2 % 2;
        int i3 = I + 43;
        G = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup viewGroup = this.f11232u;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = G + 23;
        I = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void setMPreviewLayout(ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = I + 109;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.f11232u = viewGroup;
            throw null;
        }
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.f11232u = viewGroup;
        int i4 = G + 15;
        I = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = com.incode.welcome_sdk.ui.camera.CameraFragment.I + 105;
        com.incode.welcome_sdk.ui.camera.CameraFragment.G = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.ui.camera.CameraPreviewType getMCameraPreviewType() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.G
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.I = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L17
            com.incode.welcome_sdk.ui.camera.CameraPreviewType r1 = r3.D
            r0 = 43
            int r0 = r0 / 0
            if (r1 == 0) goto L1c
        L16:
            return r1
        L17:
            com.incode.welcome_sdk.ui.camera.CameraPreviewType r1 = r3.D
            if (r1 == 0) goto L1c
            goto L16
        L1c:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.I
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.G = r0
            int r1 = r1 % r2
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraFragment.getMCameraPreviewType():com.incode.welcome_sdk.ui.camera.CameraPreviewType");
    }

    public final void setMCameraPreviewType(CameraPreviewType cameraPreviewType) {
        int i2 = 2 % 2;
        int i3 = I + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraPreviewType, "");
            this.D = cameraPreviewType;
        } else {
            Intrinsics.checkNotNullParameter(cameraPreviewType, "");
            this.D = cameraPreviewType;
            int i4 = 18 / 0;
        }
    }

    protected final int getLayoutWidth() {
        int i2 = 2 % 2;
        int i3 = I + 91;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        int i6 = this.C;
        int i7 = i4 + 97;
        I = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    protected final void setLayoutWidth(int i2) {
        int i3 = 2 % 2;
        int i4 = G + 37;
        I = i4 % 128;
        if (i4 % 2 != 0) {
            this.C = i2;
            int i5 = 70 / 0;
        } else {
            this.C = i2;
        }
    }

    protected final int getLayoutHeight() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 3;
        G = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.A;
        int i7 = i3 + 5;
        G = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void setLayoutHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = I + 81;
        int i5 = i4 % 128;
        G = i5;
        int i6 = i4 % 2;
        this.A = i2;
        int i7 = i5 + 111;
        I = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int getNormalizedPreviewWidth() {
        int i2 = 2 % 2;
        int i3 = I + 27;
        G = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.B;
        if (i4 == 0) {
            int i6 = 96 / 0;
        }
        return i5;
    }

    protected final void setNormalizedPreviewWidth(int i2) {
        int i3 = 2 % 2;
        int i4 = G;
        int i5 = i4 + 111;
        I = i5 % 128;
        int i6 = i5 % 2;
        this.B = i2;
        int i7 = i4 + 65;
        I = i7 % 128;
        int i8 = i7 % 2;
    }

    protected final int getNormalizedPreviewHeight() {
        int i2 = 2 % 2;
        int i3 = G + 55;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        int i6 = this.f11237z;
        int i7 = i4 + 75;
        G = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 63 / 0;
        }
        return i6;
    }

    protected final void setNormalizedPreviewHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = I;
        int i5 = i4 + 121;
        G = i5 % 128;
        int i6 = i5 % 2;
        this.f11237z = i2;
        int i7 = i4 + 33;
        G = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int getPreviewOffsetX() {
        int i2 = 2 % 2;
        int i3 = I + 97;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        int i6 = this.F;
        int i7 = i4 + 61;
        I = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    protected final void setPreviewOffsetX(int i2) {
        int i3 = 2 % 2;
        int i4 = I;
        int i5 = i4 + 89;
        G = i5 % 128;
        int i6 = i5 % 2;
        this.F = i2;
        int i7 = i4 + 37;
        G = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getPreviewOffsetY() {
        int i2 = 2 % 2;
        int i3 = G + 73;
        int i4 = i3 % 128;
        I = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.E;
        int i6 = i4 + 123;
        G = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    protected final void setPreviewOffsetY(int i2) {
        int i3 = 2 % 2;
        int i4 = G + 61;
        int i5 = i4 % 128;
        I = i5;
        int i6 = i4 % 2;
        this.E = i2;
        if (i6 != 0) {
            int i7 = 76 / 0;
        }
        int i8 = i5 + 95;
        G = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 21 / 0;
        }
    }

    public final void askForPermissions() throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 89;
        I = i3 % 128;
        int i4 = i3 % 2;
        if (!shouldRecordScreen()) {
            checkCameraPermissions();
            int i5 = G + 109;
            I = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i6 = G + 37;
        I = i6 % 128;
        if (i6 % 2 == 0) {
            a(947770158, new Object[]{this}, VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), -947770157, VideoConferencePresenter.VideoConferenceData.e());
        } else {
            a(947770158, new Object[]{this}, VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), -947770157, VideoConferencePresenter.VideoConferenceData.e());
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void safeOnCreate(Bundle bundle, CameraPresenter cameraPresenter) {
        int i2 = 2 % 2;
        int i3 = G + 5;
        I = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraPresenter, "");
        super.safeOnCreate(bundle);
        setMCameraPresenter(cameraPresenter);
        setMCameraPreviewType(getCameraType());
        int i5 = I + 11;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public void safeOnViewCreated(View view, Bundle bundle) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.safeOnViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.camera_preview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        setMPreviewLayout((ViewGroup) viewFindViewById);
        this.f11236y = (ImageView) view.findViewById(R.id.ivBlurFrame);
        this.f11233v = IncodeWelcome.Companion.getInstance().getMovementDetector();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = G + 13;
            I = i3 % 128;
            int i4 = i3 % 2;
            Window window = activity.getWindow();
            if (window != null) {
                window.addFlags(128);
                int i5 = G + 39;
                I = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        int i2 = 2 % 2;
        int i3 = G + 11;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            super.onResume();
            MovementDetector movementDetector = this.f11233v;
            if (movementDetector != null) {
                movementDetector.start();
            }
            getMCameraPresenter().onResume();
            int i4 = I + 89;
            G = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onResume();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = G + 35;
        I = i3 % 128;
        int i4 = i3 % 2;
        CameraPreview cameraPreview = this.f11226o;
        if (cameraPreview != null) {
            this.f11225n = cameraPreview.getCameraScale();
        }
        MovementDetector movementDetector = this.f11233v;
        if (movementDetector != null) {
            int i5 = G + 115;
            I = i5 % 128;
            if (i5 % 2 != 0) {
                movementDetector.stop();
                throw null;
            }
            movementDetector.stop();
        }
        getMCameraPresenter().onPause();
        super.onPause();
        int i6 = G + 125;
        I = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i2 = 2 % 2;
        int i3 = I + 125;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (getMPreviewLayout().getChildCount() > 0) {
            int i5 = I + 73;
            G = i5 % 128;
            int i6 = i5 % 2;
            getMPreviewLayout().removeViewAt(0);
        }
        super.onStop();
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = I + 51;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            if (shouldRecordScreen()) {
                int i4 = I + 79;
                G = i4 % 128;
                if (i4 % 2 != 0) {
                    stopVideoRecording();
                } else {
                    stopVideoRecording();
                    throw null;
                }
            }
            getMCameraPresenter().onDestroy();
            super.safeOnDestroy();
            return;
        }
        shouldRecordScreen();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = G + 87;
        I = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            z2 = false;
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            z2 = true;
        }
        this.f11227p = z2;
        int i4 = G + 15;
        I = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001c  */
    @Override // androidx.fragment.app.Fragment
    @kotlin.Deprecated(message = "Deprecated in Java")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) throws java.lang.Throwable {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            super.onActivityResult(r5, r6, r7)
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r5 != r0) goto L47
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.I
            int r2 = r0 + 63
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.G = r0
            int r2 = r2 % r3
            r1 = -1
            if (r2 != 0) goto L36
            r0 = 89
            int r0 = r0 / 0
            if (r6 != r1) goto L3b
        L1c:
            if (r7 == 0) goto L3b
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome$RecordingPermissionData r0 = new com.incode.welcome_sdk.IncodeWelcome$RecordingPermissionData
            r0.<init>(r7, r6)
            com.incode.welcome_sdk.IncodeWelcome.recordingPermissionData = r0
            r4.checkCameraPermissions()
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.I
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.G = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L39
            return
        L36:
            if (r6 != r1) goto L3b
            goto L1c
        L39:
            r0 = 0
            throw r0
        L3b:
            r4.onVideoRecordingPermissionDenied()
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.G
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.I = r0
            int r1 = r1 % r3
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) throws Throwable {
        int i3 = 2 % 2;
        int i4 = G + 19;
        I = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (!isCameraPermissionGranted()) {
            prepareCameraPermissionsMandatoryDialog();
            return;
        }
        if (!(!shouldRecordScreen())) {
            a();
            int i6 = I + 33;
            G = i6 % 128;
            int i7 = i6 % 2;
        }
        onCameraPermissionGranted();
        onReadyToCreateCamera();
    }

    protected void prepareCameraPermissionsMandatoryDialog() {
        int i2 = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = G + 35;
            I = i3 % 128;
            int i4 = i3 % 2;
            if (activity.isFinishing() || this.f11227p) {
                this.f11231t = true;
                return;
            }
            int i5 = G + 109;
            I = i5 % 128;
            if (i5 % 2 == 0) {
                showCameraPermissionsMandatory();
            } else {
                showCameraPermissionsMandatory();
                throw null;
            }
        }
    }

    public void showCameraPermissionsMandatory() {
        int i2 = 2 % 2;
        int i3 = G + 107;
        I = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.drawable.onboard_sdk_camera_permission_image;
        int i6 = R.string.onboard_sdk_dialog_camera_permissions_mandatory_title;
        int i7 = R.string.onboard_sdk_dialog_camera_permissions_mandatory_subtitle;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "");
        PermissionsMandatoryDialog permissionsMandatoryDialogNewInstance = PermissionsMandatoryDialog.newInstance(i5, i6, i7, "android.permission.CAMERA", ((BaseActivity) activity).getModule(), getRepo());
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            int i8 = I + 49;
            G = i8 % 128;
            int i9 = i8 % 2;
            FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                permissionsMandatoryDialogNewInstance.show(supportFragmentManager, PermissionsMandatoryDialog.TAG);
                return;
            }
        }
        int i10 = G + 3;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onBtnOpenSettingsClicked() throws Exception {
        String packageName;
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = G + 41;
            I = i3 % 128;
            if (i3 % 2 != 0) {
                activity.getPackageName();
                throw null;
            }
            packageName = activity.getPackageName();
        } else {
            packageName = null;
        }
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, packageName, null));
        CX.ud();
        startActivity(intent);
        int i4 = I + 49;
        G = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onPermissionMandatoryDialogClosed(Exception exc) {
        BaseActivity baseActivity;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            int i3 = G + 69;
            I = i3 % 128;
            if (i3 % 2 != 0) {
                baseActivity = (BaseActivity) activity;
                int i4 = 7 / 0;
            } else {
                baseActivity = (BaseActivity) activity;
            }
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            int i5 = G + 55;
            I = i5 % 128;
            int i6 = i5 % 2;
            baseActivity.onBackButtonPressed();
            int i7 = G + 113;
            I = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public boolean isCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = G + 87;
        I = i3 % 128;
        int i4 = i3 % 2;
        Context context = getContext();
        if (context == null) {
            int i5 = I + 113;
            G = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (ContextCompat.checkSelfPermission(context, this.f11228q) != 0) {
            return false;
        }
        int i7 = G + 61;
        I = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void requestCameraPermission() {
        int i2 = 2 % 2;
        int i3 = I + 89;
        G = i3 % 128;
        int i4 = i3 % 2;
        requestPermissions(new String[]{this.f11228q}, 1001);
        int i5 = G + 9;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = I + 1;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11231t = false;
            this.f11221j = false;
            getMCameraPresenter().enableProcessing(false);
        } else {
            this.f11231t = false;
            this.f11221j = true;
            getMCameraPresenter().enableProcessing(true);
        }
        int i4 = G + 53;
        I = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Camera b(int i2, CameraFragment cameraFragment) {
        int i3 = 2 % 2;
        int i4 = G + 97;
        I = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(cameraFragment, "");
        Camera cameraAcquireCamera = CameraManager.f11257d.acquireCamera(i2);
        Camera.Parameters parameters = cameraAcquireCamera.getParameters();
        if (parameters != null) {
            int i6 = I + 37;
            G = i6 % 128;
            int i7 = i6 % 2;
            parameters.setRotation(cameraFragment.e());
            cameraFragment.e(i2, parameters);
            Point desiredPreviewSize = cameraFragment.getMCameraPresenter().getDesiredPreviewSize(cameraFragment.f11217f);
            cameraFragment.f11212a = desiredPreviewSize.x;
            cameraFragment.f11218g = desiredPreviewSize.y;
            int i8 = I + 87;
            G = i8 % 128;
            int i9 = i8 % 2;
        } else {
            parameters = null;
        }
        cameraAcquireCamera.setParameters(parameters);
        cameraAcquireCamera.enableShutterSound(false);
        cameraFragment.f11229r = i2;
        cameraFragment.f11235x = cameraAcquireCamera;
        return cameraAcquireCamera;
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f11243c = 0;

        /* JADX INFO: renamed from: e */
        private static int f11244e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11243c + 121;
            f11244e = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f11244e + 9;
            f11243c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11243c + 37;
            f11244e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "Couldn't create camera source", new Object[0]);
            CameraFragment.this.getMCameraPresenter().error(th);
            int i5 = f11244e + 115;
            f11243c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<Camera, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f11246d = 1;

        /* JADX INFO: renamed from: e */
        private static int f11247e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Camera camera) {
            int i2 = 2 % 2;
            int i3 = f11247e + 67;
            f11246d = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            c(camera);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f11246d + 21;
            f11247e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        private void c(Camera camera) {
            FixedWidthCameraPreview cameraPreview;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(camera, "");
            CameraFragment cameraFragment = CameraFragment.this;
            if (cameraFragment.getMCameraPreviewType() == CameraPreviewType.FIXED_WIDTH) {
                CameraFragment cameraFragment2 = CameraFragment.this;
                cameraPreview = new FixedWidthCameraPreview(cameraFragment2, cameraFragment2.getMCameraPresenter(), camera, CameraFragment.access$getMCameraScheduler$p(CameraFragment.this), CameraFragment.this.getMActiveCameraId(), CameraFragment.access$getMLastKnownOrientation$p(CameraFragment.this), CameraFragment.this.getDesiredCameraZoom(), CameraFragment.access$getMTargetCameraPreviewWidth$p(CameraFragment.this), CameraFragment.access$getMTargetCameraPreviewHeight$p(CameraFragment.this), false, CameraFragment.access$getMMaxPictureSizeHeight$p(CameraFragment.this), CameraFragment.access$getMMinPictureSizeHeight$p(CameraFragment.this), CameraFragment.access$getMIgnorePictureSize$p(CameraFragment.this));
            } else {
                CameraFragment cameraFragment3 = CameraFragment.this;
                cameraPreview = new CameraPreview(cameraFragment3, cameraFragment3.getMCameraPresenter(), camera, CameraFragment.access$getMCameraScheduler$p(CameraFragment.this), CameraFragment.this.getMActiveCameraId(), CameraFragment.access$getMLastKnownOrientation$p(CameraFragment.this), CameraFragment.this.getDesiredCameraZoom(), CameraFragment.access$getMTargetCameraPreviewWidth$p(CameraFragment.this), CameraFragment.access$getMTargetCameraPreviewHeight$p(CameraFragment.this), CameraFragment.access$getMUseHeightPaddingFactor$p(CameraFragment.this), CameraFragment.access$getMMaxPictureSizeHeight$p(CameraFragment.this), CameraFragment.access$getMMinPictureSizeHeight$p(CameraFragment.this), CameraFragment.access$getMIgnorePictureSize$p(CameraFragment.this));
                int i3 = f11247e + 123;
                f11246d = i3 % 128;
                int i4 = i3 % 2;
            }
            cameraFragment.setMPreview(cameraPreview);
            if (CameraFragment.access$getMSavedCameraScale$p(CameraFragment.this) != 1.0f) {
                CameraPreview mPreview = CameraFragment.this.getMPreview();
                if (mPreview == null) {
                    int i5 = f11246d + 79;
                    f11247e = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    mPreview.setCameraScale(CameraFragment.access$getMSavedCameraScale$p(CameraFragment.this));
                }
            }
            if (CameraFragment.this.getMPreviewLayout().getChildCount() > 0 && (CameraFragment.this.getMPreviewLayout().getChildAt(0) instanceof CameraPreview)) {
                int i7 = f11246d + 47;
                f11247e = i7 % 128;
                int i8 = i7 % 2;
                CameraFragment.this.getMPreviewLayout().removeViewAt(0);
            }
            CameraFragment.this.getMPreviewLayout().addView(CameraFragment.this.getMPreview(), 0, new ViewGroup.LayoutParams(-1, -1));
            int i9 = f11247e + 41;
            f11246d = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = G + 121;
        I = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = G + 117;
        I = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = G + 61;
        I = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = G + 101;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void createCameraSource(final int i2) {
        int i3 = 2 % 2;
        if (!this.f11214c) {
            Single singleObserveOn = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CameraFragment.b(i2, this);
                }
            }).subscribeOn(this.f11215d).observeOn(AndroidSchedulers.mainThread());
            final d dVar = new d();
            Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CameraFragment.e(dVar, obj);
                }
            };
            final c cVar = new c();
            singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CameraFragment.d(cVar, obj);
                }
            });
            int i4 = G + 41;
            I = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = G + 17;
        I = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(int r7, android.hardware.Camera.Parameters r8) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.G
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.I = r0
            int r1 = r1 % r5
            float r4 = r8.getHorizontalViewAngle()
            r3 = 1
            if (r7 != r3) goto L4b
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.I
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.G = r1
            int r0 = r0 % r5
            if (r0 == 0) goto L4d
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L4b
            int r1 = r1 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.I = r0
            int r1 = r1 % r5
        L2b:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            float r0 = r8.getHorizontalViewAngle()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "CameraP: cameraAngle: %s"
            r2.d(r0, r1)
            r6.onCameraAngleMeasured(r4, r3)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.I
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraFragment.G = r0
            int r1 = r1 % r5
            return
        L4b:
            r3 = 0
            goto L2b
        L4d:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraFragment.e(int, android.hardware.Camera$Parameters):void");
    }

    public void onCameraAngleMeasured(float f2, boolean z2) {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 25;
        G = i4 % 128;
        int i5 = i4 % 2;
        this.f11217f = z2;
        int i6 = i3 + 77;
        G = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final void e(Runnable runnable, CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = G + 85;
        I = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(cameraFragment, "");
        runnable.run();
        cameraFragment.hideCameraReconfigurationUi();
        int i5 = G + 79;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }

    public static final void a(Ref.BooleanRef booleanRef, CameraFragment cameraFragment, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(booleanRef, "");
        Intrinsics.checkNotNullParameter(cameraFragment, "");
        if (booleanRef.element) {
            int i4 = G + 59;
            I = i4 % 128;
            int i5 = i4 % 2;
            cameraFragment.releaseCamera();
            int i6 = I + 103;
            G = i6 % 128;
            int i7 = i6 % 2;
        }
        cameraFragment.getMCameraPresenter().createCameraSourceAndFaceProcessor(i2);
        int i8 = G + 125;
        I = i8 % 128;
        int i9 = i8 % 2;
    }

    public static final void b(final CameraFragment cameraFragment, final Ref.BooleanRef booleanRef, final int i2) {
        int i3 = 2 % 2;
        int i4 = G + 29;
        I = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraFragment, "");
            Intrinsics.checkNotNullParameter(booleanRef, "");
            cameraFragment.stopPreview(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    CameraFragment.a(booleanRef, cameraFragment, i2);
                }
            });
        } else {
            Intrinsics.checkNotNullParameter(cameraFragment, "");
            Intrinsics.checkNotNullParameter(booleanRef, "");
            cameraFragment.stopPreview(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    CameraFragment.a(booleanRef, cameraFragment, i2);
                }
            });
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void reconfigureCamera(final int r12, final java.lang.Runnable r13) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraFragment.reconfigureCamera(int, java.lang.Runnable):void");
    }

    public static final void c(final CameraFragment cameraFragment, final Runnable runnable, final boolean z2, Bitmap bitmap) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraFragment, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        RequestBuilder requestBuilderAddListener = Glide.with(cameraFragment.requireActivity().getBaseContext()).load(bitmap).transform(new BlurTransformation(cameraFragment.requireActivity().getBaseContext())).addListener(new RequestListener<Drawable>() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$showCameraReconfigurationBlur$1$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f11249b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f11250d = 1;

            @Override // com.bumptech.glide.request.RequestListener
            public final /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z3) {
                int i3 = 2 % 2;
                int i4 = f11249b + 83;
                f11250d = i4 % 128;
                int i5 = i4 % 2;
                boolean zOnResourceReady2 = onResourceReady2(drawable, obj, target, dataSource, z3);
                int i6 = f11250d + 31;
                f11249b = i6 % 128;
                if (i6 % 2 == 0) {
                    return zOnResourceReady2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public final boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z3) {
                int i3 = 2 % 2;
                int i4 = f11250d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f11249b = i4 % 128;
                int i5 = i4 % 2;
                runnable.run();
                return false;
            }

            /* JADX INFO: renamed from: onResourceReady, reason: avoid collision after fix types in other method */
            public final boolean onResourceReady2(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z3) {
                boolean z4;
                int i3 = 2 % 2;
                int i4 = f11249b + 95;
                f11250d = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraFragment.showCameraReconfigurationUi(z2);
                    runnable.run();
                    z4 = true;
                } else {
                    cameraFragment.showCameraReconfigurationUi(z2);
                    runnable.run();
                    z4 = false;
                }
                int i5 = f11249b + 15;
                f11250d = i5 % 128;
                int i6 = i5 % 2;
                return z4;
            }
        });
        ImageView imageView = cameraFragment.f11236y;
        Intrinsics.checkNotNull(imageView);
        requestBuilderAddListener.into(imageView);
        int i3 = G + 29;
        I = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void c(final boolean z2, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 125;
        G = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = null;
        if (this.f11236y == null) {
            int i6 = i3 + 41;
            G = i6 % 128;
            if (i6 % 2 != 0) {
                runnable.run();
                return;
            } else {
                runnable.run();
                unit.hashCode();
                throw null;
            }
        }
        CameraPreview cameraPreview = getCameraPreview();
        if (cameraPreview != null) {
            cameraPreview.getSinglePreviewFrame(new androidx.core.util.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda4
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    CameraFragment.c(this.f$0, runnable, z2, (Bitmap) obj);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            int i7 = I + 89;
            G = i7 % 128;
            int i8 = i7 % 2;
        }
        if (unit == null) {
            runnable.run();
        }
    }

    public void showCameraReconfigurationUi(boolean z2) {
        int i2 = 2 % 2;
        int i3 = I + 107;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void hideCameraReconfigurationUi() {
        int i2 = 2 % 2;
        int i3 = I + 117;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraSourceCreated() {
        int i2 = 2 % 2;
        int i3 = I + 15;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CameraFragment cameraFragment = (CameraFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = G + 33;
        I = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraFragment, "");
            cameraFragment.d();
            return null;
        }
        Intrinsics.checkNotNullParameter(cameraFragment, "");
        cameraFragment.d();
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewStarted() {
        int i2 = 2 % 2;
        int i3 = G + 83;
        I = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i5 = G + 49;
            I = i5 % 128;
            int i6 = i5 % 2;
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    CameraFragment.c(this.f$0);
                }
            });
            return;
        }
        int i7 = G + 73;
        I = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public CameraPreview getCameraPreview() {
        int i2 = 2 % 2;
        int i3 = G + 81;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        CameraPreview cameraPreview = this.f11226o;
        int i6 = i4 + 43;
        G = i6 % 128;
        int i7 = i6 % 2;
        return cameraPreview;
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = G + 17;
        I = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("reconfigureCamera done. id:%s isNarrow:%s width:%s height:%s", Integer.valueOf(this.f11229r), Boolean.valueOf(this.f11217f), Integer.valueOf(this.f11212a), Integer.valueOf(this.f11218g));
        Runnable runnable = this.H;
        if (runnable != null) {
            runnable.run();
        } else {
            int i5 = I + 91;
            G = i5 % 128;
            int i6 = i5 % 2;
        }
        this.H = null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewLayoutChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = I + 27;
        G = i7 % 128;
        int i8 = i7 % 2;
        this.C = i2;
        this.A = i3;
        this.B = i4;
        this.f11237z = i5;
        this.F = (getMPreviewLayout().getWidth() - i2) / 2;
        this.E = (getMPreviewLayout().getHeight() - i3) / 2;
        int i9 = I + 13;
        G = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 50 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewRawFrame(byte[] bArr) {
        int i2 = 2 % 2;
        MovementDetector movementDetector = this.f11233v;
        if (movementDetector != null) {
            int i3 = G + 73;
            I = i3 % 128;
            int i4 = i3 % 2;
            if (!movementDetector.isDeviceStable()) {
                int i5 = I + 75;
                G = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = I + 25;
                G = i7 % 128;
                if (i7 % 2 != 0) {
                    getMCameraPresenter().processPreviewRawFrame(bArr);
                } else {
                    getMCameraPresenter().processPreviewRawFrame(bArr);
                    throw null;
                }
            }
        }
    }

    public static final void d(CameraFragment cameraFragment) {
        int i2 = 2 % 2;
        int i3 = I + 53;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraFragment, "");
        Timber.Forest.v("stopping preview", new Object[0]);
        Camera camera = cameraFragment.f11235x;
        Object obj = null;
        if (camera != null) {
            int i5 = G + 89;
            I = i5 % 128;
            if (i5 % 2 != 0) {
                camera.stopPreview();
                obj.hashCode();
                throw null;
            }
            camera.stopPreview();
        }
        Camera camera2 = cameraFragment.f11235x;
        if (camera2 == null) {
            int i6 = I + 63;
            G = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = G + 93;
        I = i8 % 128;
        if (i8 % 2 == 0) {
            camera2.setPreviewCallback(null);
        } else {
            camera2.setPreviewCallback(null);
            int i9 = 92 / 0;
        }
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f11240c = 0;

        /* JADX INFO: renamed from: d */
        private static int f11241d = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Runnable f11242e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11241d + 45;
            f11240c = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f11241d + 47;
            f11240c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
        
            if (r0 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
        
            r0.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0024, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        
            if (r0 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
        
            r1 = com.incode.welcome_sdk.ui.camera.CameraFragment.b.f11240c + 27;
            com.incode.welcome_sdk.ui.camera.CameraFragment.b.f11241d = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        
            if ((r1 % 2) == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void d(java.lang.Throwable r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.b.f11241d
                int r1 = r0 + 39
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.CameraFragment.b.f11240c = r0
                int r1 = r1 % r3
                java.lang.String r2 = "Couldn't stop preview"
                java.lang.String r0 = ""
                if (r1 == 0) goto L25
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.e(r5, r2, r0)
                java.lang.Runnable r0 = r4.f11242e
                if (r0 == 0) goto L35
            L21:
                r0.run()
                return
            L25:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.e(r5, r2, r0)
                java.lang.Runnable r0 = r4.f11242e
                if (r0 == 0) goto L35
                goto L21
            L35:
                int r0 = com.incode.welcome_sdk.ui.camera.CameraFragment.b.f11240c
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.CameraFragment.b.f11241d = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L41
                return
            L41:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraFragment.b.d(java.lang.Throwable):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f11242e = runnable;
        }
    }

    public static final void d(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = G + 103;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        if (runnable != null) {
            runnable.run();
            return;
        }
        int i6 = i4 + 61;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = I + 93;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = G + 35;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopPreview(final Runnable runnable) {
        int i2 = 2 % 2;
        Completable completableObserveOn = Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                CameraFragment.d(this.f$0);
            }
        }).subscribeOn(this.f11215d).observeOn(this.f11215d);
        Action action = new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Action
            public final void run() {
                CameraFragment.d(runnable);
            }
        };
        final b bVar = new b(runnable);
        completableObserveOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraFragment$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CameraFragment.b(bVar, obj);
            }
        });
        int i3 = G + 117;
        I = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void releaseCamera() {
        int i2 = 2 % 2;
        int i3 = I + 125;
        G = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.v("releasing camera", new Object[0]);
        CameraPreview cameraPreview = this.f11226o;
        if (cameraPreview != null) {
            int i5 = G + 113;
            I = i5 % 128;
            int i6 = i5 % 2;
            cameraPreview.notifyCameraReleased();
        }
        CameraManager.f11257d.releaseCamera(this.f11235x);
        this.f11235x = null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onBrightnessValueUpdate(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = I + 57;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onBlurrinessUpdate(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = I + 25;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.Forest.d("Blur value: %s", Float.valueOf(f2));
            return;
        }
        Timber.Forest forest = Timber.Forest;
        Object[] objArr = new Object[0];
        objArr[0] = Float.valueOf(f2);
        forest.d("Blur value: %s", objArr);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopVideoRecording() {
        int i2 = 2 % 2;
        HBRecorder hBRecorder = this.f11224m;
        if (hBRecorder != null) {
            int i3 = G + 117;
            I = i3 % 128;
            if (i3 % 2 != 0) {
                hBRecorder.stopScreenRecording();
                throw null;
            }
            hBRecorder.stopScreenRecording();
        } else {
            int i4 = I + 121;
            G = i4 % 128;
            int i5 = i4 % 2;
        }
        IncodeWelcome.Companion companion = IncodeWelcome.Companion;
        IncodeWelcome.recordingPermissionData = null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void restartVideoRecording() {
        HBRecorder hBRecorder;
        int i2 = 2 % 2;
        HBRecorder hBRecorder2 = this.f11224m;
        if (hBRecorder2 == null) {
            int i3 = I + 21;
            G = i3 % 128;
            int i4 = i3 % 2;
        } else {
            hBRecorder2.setFileName(getVideoRecordingFileName());
        }
        IncodeWelcome.RecordingPermissionData recordingPermissionData = IncodeWelcome.recordingPermissionData;
        if (recordingPermissionData == null || (hBRecorder = this.f11224m) == null) {
            return;
        }
        int i5 = I + 43;
        G = i5 % 128;
        int i6 = i5 % 2;
        hBRecorder.startScreenRecording(recordingPermissionData.getData(), recordingPermissionData.getResultCode());
        int i7 = G + 115;
        I = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onVideoRecordingPermissionDenied() {
        int i2 = 2 % 2;
        int i3 = G + 105;
        I = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void disableCamera() {
        int i2 = 2 % 2;
        int i3 = I + 111;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11214c = true;
    }

    private final int e() {
        Integer numValueOf;
        int i2;
        WindowManager windowManager;
        Display defaultDisplay;
        int i3 = 2 % 2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i4 = 0;
        Camera.getCameraInfo(0, cameraInfo);
        FragmentActivity activity = getActivity();
        if (activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            numValueOf = null;
        } else {
            int i5 = G + 37;
            I = i5 % 128;
            int i6 = i5 % 2;
            numValueOf = Integer.valueOf(defaultDisplay.getRotation());
            int i7 = G + 61;
            I = i7 % 128;
            int i8 = i7 % 2;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                i2 = I + 107;
            }
            G = i2 % 128;
            int i9 = i2 % 2;
            return ((cameraInfo.orientation - i4) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        }
        int i10 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        I = i10 % 128;
        int i11 = i10 % 2;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i4 = 90;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            i4 = 180;
        } else if (numValueOf == null) {
            i2 = I + 111;
            G = i2 % 128;
            int i92 = i2 % 2;
        } else if (numValueOf.intValue() == 3) {
            int i12 = I + 59;
            G = i12 % 128;
            i4 = i12 % 2 == 0 ? 6927 : 270;
        }
        return ((cameraInfo.orientation - i4) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
    }

    private final boolean c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = I + 1;
        int i4 = i3 % 128;
        G = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        HBRecorder hBRecorder = this.f11224m;
        if (hBRecorder == null || hBRecorder == null) {
            return false;
        }
        int i5 = i4 + 89;
        I = i5 % 128;
        int i6 = i5 % 2;
        boolean zIsBusyRecording = hBRecorder.isBusyRecording();
        if (i6 != 0) {
            if (!zIsBusyRecording) {
                return false;
            }
        } else if (!zIsBusyRecording) {
            return false;
        }
        return true;
    }

    private final void a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 53;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            if (!c()) {
                this.f11224m = new HBRecorder(getContext(), new g(getRepo(), IncodeWelcome.Companion.getInstance().getCurrentRecordModule()));
                b();
                return;
            }
            int i4 = I + 3;
            G = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
                return;
            }
            return;
        }
        c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void b() {
        HBRecorder hBRecorder;
        int i2 = 2 % 2;
        IncodeWelcomeRepository repository = getMCameraPresenter().getRepository();
        Intrinsics.checkNotNullExpressionValue(repository, "");
        EventUtils.sendEvent(repository, Event.START_VIDEO_SELFIE, Modules.VIDEO_ONBOARDING, (HashMap<String, Object>) MapsKt.hashMapOf(TuplesKt.to(EventValues.SCREEN_NAME.getValue(), getMCameraPresenter().getRepository().getCurrentScreenName().name())));
        HBRecorder hBRecorder2 = this.f11224m;
        String path = null;
        String strB = hBRecorder2 != null ? j.b(hBRecorder2) : null;
        Timber.Forest.d("Using codec: %s", strB);
        HBRecorder hBRecorder3 = this.f11224m;
        if (hBRecorder3 != null) {
            hBRecorder3.setVideoEncoder(strB);
        }
        HBRecorder hBRecorder4 = this.f11224m;
        if (hBRecorder4 != null) {
            hBRecorder4.enableCustomSettings();
        }
        HBRecorder hBRecorder5 = this.f11224m;
        if (hBRecorder5 != null) {
            hBRecorder5.isAudioEnabled(false);
        }
        HBRecorder hBRecorder6 = this.f11224m;
        if (hBRecorder6 != null) {
            hBRecorder6.setScreenDimensions(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 480);
        }
        HBRecorder hBRecorder7 = this.f11224m;
        if (hBRecorder7 != null) {
            int i3 = G + 69;
            I = i3 % 128;
            int i4 = i3 % 2;
            hBRecorder7.setVideoFrameRate(24);
        }
        HBRecorder hBRecorder8 = this.f11224m;
        if (hBRecorder8 != null) {
            int i5 = G + 73;
            I = i5 % 128;
            if (i5 % 2 != 0) {
                hBRecorder8.setVideoBitrate(2000000);
                path.hashCode();
                throw null;
            }
            hBRecorder8.setVideoBitrate(2000000);
        }
        HBRecorder hBRecorder9 = this.f11224m;
        if (hBRecorder9 != null) {
            IncodeWelcomeRepository repository2 = getMCameraPresenter().getRepository();
            if (repository2 != null) {
                int i6 = G + 27;
                I = i6 % 128;
                int i7 = i6 % 2;
                File imagesDirectory = repository2.getImagesDirectory();
                if (imagesDirectory != null) {
                    path = imagesDirectory.getPath();
                }
            }
            hBRecorder9.setOutputPath(path);
        }
        HBRecorder hBRecorder10 = this.f11224m;
        if (hBRecorder10 != null) {
            hBRecorder10.setFileName(getVideoRecordingFileName());
        }
        IncodeWelcome.RecordingPermissionData recordingPermissionData = IncodeWelcome.recordingPermissionData;
        if (recordingPermissionData == null || (hBRecorder = this.f11224m) == null) {
            return;
        }
        hBRecorder.startScreenRecording(recordingPermissionData.getData(), recordingPermissionData.getResultCode());
    }

    public void checkCameraPermissions() throws Throwable {
        int i2 = 2 % 2;
        int i3 = I + 27;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (!isCameraPermissionGranted()) {
            if (!this.f11230s) {
                requestCameraPermission();
                this.f11230s = true;
                return;
            } else {
                showCameraPermissionsMandatory();
                return;
            }
        }
        int i5 = I + 13;
        G = i5 % 128;
        int i6 = i5 % 2;
        if (shouldRecordScreen()) {
            a();
        }
        if (!this.f11221j) {
            onCameraPermissionGranted();
        }
        onReadyToCreateCamera();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onReadyToCreateCamera() {
        int i2 = 2 % 2;
        int i3 = G + 9;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            getMCameraPresenter().createCameraSourceAndFaceProcessor(getCameraFacing());
            return;
        }
        getMCameraPresenter().createCameraSourceAndFaceProcessor(getCameraFacing());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Exception {
        CameraFragment cameraFragment = (CameraFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = I + 47;
        G = i3 % 128;
        int i4 = i3 % 2;
        Context contextRequireContext = cameraFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intent intentD = ag.d(contextRequireContext);
        Object obj = null;
        if (intentD == null) {
            int i5 = G + 75;
            I = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = I + 51;
        G = i6 % 128;
        int i7 = i6 % 2;
        CX.ud();
        cameraFragment.startActivityForResult(intentD, 1002);
        int i8 = I + 59;
        G = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    protected int getDesiredCameraZoom() {
        int i2 = 2 % 2;
        int i3 = I + 69;
        G = i3 % 128;
        return i3 % 2 == 0 ? 111 : 100;
    }

    protected String getVideoRecordingFileName() {
        int i2 = 2 % 2;
        int i3 = I + 91;
        G = i3 % 128;
        int i4 = i3 % 2;
        String simpleName = getClass().getSimpleName();
        int i5 = G + 111;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return simpleName;
    }

    public void setUseHeightPaddingFactor(boolean z2) {
        int i2 = 2 % 2;
        int i3 = I + 83;
        int i4 = i3 % 128;
        G = i4;
        if (i3 % 2 != 0) {
            this.f11219h = z2;
            int i5 = i4 + 13;
            I = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 91 / 0;
                return;
            }
            return;
        }
        this.f11219h = z2;
        throw null;
    }

    public void setMaxPictureSizeHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = G + 113;
        int i5 = i4 % 128;
        I = i5;
        if (i4 % 2 != 0) {
            this.f11220i = i2;
            int i6 = 12 / 0;
        } else {
            this.f11220i = i2;
        }
        int i7 = i5 + 33;
        G = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void setMinPictureSizeHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = I;
        int i5 = i4 + 5;
        G = i5 % 128;
        int i6 = i5 % 2;
        this.f11223l = i2;
        int i7 = i4 + 5;
        G = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 89 / 0;
        }
    }

    public void setIgnorePictureSize(boolean z2) {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 125;
        G = i4 % 128;
        int i5 = i4 % 2;
        this.f11222k = z2;
        int i6 = i3 + 7;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> startIdealCaptureEnvironmentTest() {
        int i2 = 2 % 2;
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf("Not yet implemented")));
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestSingle(int i2) {
        int i3 = 2 % 2;
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf("Not yet implemented")));
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestFallbackSingle() {
        int i2 = 2 % 2;
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf("Not yet implemented")));
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
        int i2 = M + 121;
        L = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final void c(CameraFragment cameraFragment) {
        a(479015108, new Object[]{cameraFragment}, VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), -479015106, VideoConferencePresenter.VideoConferenceData.e());
    }

    public static final void e(Function1 function1, Object obj) {
        a(1467270046, new Object[]{function1, obj}, VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), -1467270046, VideoConferencePresenter.VideoConferenceData.e());
    }

    private final void i() {
        a(947770158, new Object[]{this}, VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), VideoConferencePresenter.VideoConferenceData.e(), -947770157, VideoConferencePresenter.VideoConferenceData.e());
    }
}
