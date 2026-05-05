package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Process;
import android.os.Vibrator;
import android.text.method.ScrollingMovementMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Consumer;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.CameraPermissionDeniedException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.MicrophonePermissionDeniedException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.PermissionsDeniedException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.ScreenRecordingPermissionDeniedException;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.ag;
import com.incode.welcome_sdk.commons.utils.aj;
import com.incode.welcome_sdk.commons.utils.p;
import com.incode.welcome_sdk.d.al;
import com.incode.welcome_sdk.d.bc;
import com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.CameraFragment;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import com.incode.welcome_sdk.ui.camera.CameraPreviewType;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentDialog;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentDialogListener;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt;
import com.incode.welcome_sdk.ui.permissions.AudioPermissionMandatoryDialog;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoRecordingFragment extends CameraFragment implements VoiceConsentDialogListener, VideoRecordingContract.View, PermissionsMandatoryContract.View {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int T = 0;
    private static int U = 0;
    private static short[] V = null;
    private static int W = 0;
    private static byte[] X = null;
    private static int Y = 0;
    private static int Z = 0;
    private static int aa = 0;
    private static int ac = 0;
    private boolean A;
    private FacePositionConstraint C;
    private Context E;
    private Runnable F;
    private Vibrator H;
    private boolean J;
    private boolean L;
    private boolean M;
    private VoiceConsentDialog O;
    private String R;

    /* JADX INFO: renamed from: a */
    private VideoSelfieProgressListener f12453a;

    /* JADX INFO: renamed from: b */
    private bc f12454b;

    /* JADX INFO: renamed from: d */
    @Inject
    public VideoRecordingPresenter f12456d;

    /* JADX INFO: renamed from: h */
    private boolean f12460h;

    /* JADX INFO: renamed from: k */
    private boolean f12463k;

    /* JADX INFO: renamed from: l */
    private boolean f12464l;

    /* JADX INFO: renamed from: n */
    private boolean f12466n;

    /* JADX INFO: renamed from: o */
    private boolean f12467o;

    /* JADX INFO: renamed from: p */
    private boolean f12468p;

    /* JADX INFO: renamed from: r */
    private boolean f12470r;

    /* JADX INFO: renamed from: t */
    private boolean f12472t;

    /* JADX INFO: renamed from: u */
    private boolean f12473u;

    /* JADX INFO: renamed from: x */
    private int f12476x;

    /* JADX INFO: renamed from: c */
    private final Modules f12455c = Modules.VIDEO_ONBOARDING;

    /* JADX INFO: renamed from: e */
    private final ScreenName f12457e = ScreenName.VIDEO_SELFIE;

    /* JADX INFO: renamed from: f */
    private boolean f12458f = true;

    /* JADX INFO: renamed from: j */
    private boolean f12462j = true;

    /* JADX INFO: renamed from: i */
    private VideoSelfie.SelfieMode f12461i = VideoSelfie.SelfieMode.SELFIE_MATCH;

    /* JADX INFO: renamed from: g */
    private boolean f12459g = true;

    /* JADX INFO: renamed from: m */
    private boolean f12465m = true;

    /* JADX INFO: renamed from: q */
    private int f12469q = 3;

    /* JADX INFO: renamed from: s */
    private ArrayList<VideoSelfieLocalQuestion> f12471s = new ArrayList<>();

    /* JADX INFO: renamed from: v */
    private String f12474v = "";

    /* JADX INFO: renamed from: w */
    private int f12475w = 300;

    /* JADX INFO: renamed from: y */
    private boolean f12477y = true;

    /* JADX INFO: renamed from: z */
    private boolean f12478z = true;
    private boolean D = true;
    private boolean B = true;
    private float G = 1.0f;
    private final CompositeDisposable I = new CompositeDisposable();
    private final CompositeDisposable N = new CompositeDisposable();
    private final String K = "android.permission.RECORD_AUDIO";
    private VideoSelfieScanState Q = VideoSelfieScanState.f12198d;
    private final Runnable S = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            VideoRecordingFragment.c(this.f$0);
        }
    };
    private final Runnable P = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda11
        @Override // java.lang.Runnable
        public final void run() {
            VideoRecordingFragment.d(this.f$0);
        }
    };

    public interface VideoSelfieProgressListener {
        void onFinishVsProgressStep(VideoSelfieScanState videoSelfieScanState);

        void onStartVsProgressStep(VideoSelfieScanState videoSelfieScanState);
    }

    private static String $$c(int i2, int i3, short s2) {
        byte[] bArr = $$a;
        int i4 = 68 - i3;
        int i5 = i2 + 4;
        int i6 = s2 * 4;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i4 = (-i5) + i4;
            i5 = i5;
        }
        while (true) {
            i7++;
            int i8 = i5 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i8]) + i4;
            i5 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(int r12, int r13, java.lang.Object[] r14, int r15, int r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.a(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    static void init$0() {
        $$a = new byte[]{114, -78, MessagePack.Code.TRUE, 42};
        $$b = 204;
    }

    /* JADX INFO: renamed from: instrumented$0$e$--V */
    public static /* synthetic */ void m8403instrumented$0$e$V(Job job, bc bcVar, VideoRecordingFragment videoRecordingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            e(job, bcVar, videoRecordingFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$0$p$--V */
    public static /* synthetic */ void m8404instrumented$0$p$V(VideoRecordingFragment videoRecordingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            b(videoRecordingFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$0$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8405xb69a3a99(VideoRecordingFragment videoRecordingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            c(videoRecordingFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$p$--V */
    public static /* synthetic */ void m8406instrumented$1$p$V(VideoRecordingFragment videoRecordingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            a(videoRecordingFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8407x710fdb1a(VideoRecordingFragment videoRecordingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            e(videoRecordingFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$2$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8408x2b857b9b(VideoRecordingFragment videoRecordingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            d(videoRecordingFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ void access$checkPermissions(VideoRecordingFragment videoRecordingFragment, VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = Y + 49;
        ac = i3 % 128;
        int i4 = i3 % 2;
        videoRecordingFragment.e(videoSelfieResult);
        if (i4 != 0) {
            throw null;
        }
        int i5 = ac + 57;
        Y = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ bc access$getBinding(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 91;
        Y = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarD = videoRecordingFragment.d();
        int i5 = ac + 93;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return bcVarD;
    }

    public static final /* synthetic */ VideoSelfieScanState access$getCurrentVideoSelfieScanState$p(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac;
        int i4 = i3 + 75;
        Y = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieScanState videoSelfieScanState = videoRecordingFragment.Q;
        int i6 = i3 + 17;
        Y = i6 % 128;
        if (i6 % 2 != 0) {
            return videoSelfieScanState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CameraPreview access$getMPreview(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 37;
        Y = i3 % 128;
        int i4 = i3 % 2;
        CameraPreview mPreview = videoRecordingFragment.getMPreview();
        int i5 = ac + 15;
        Y = i5 % 128;
        int i6 = i5 % 2;
        return mPreview;
    }

    public static final /* synthetic */ int access$getPreviewOffsetX(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 111;
        Y = i3 % 128;
        if (i3 % 2 != 0) {
            return videoRecordingFragment.getPreviewOffsetX();
        }
        videoRecordingFragment.getPreviewOffsetX();
        throw null;
    }

    public static final /* synthetic */ int access$getPreviewOffsetY(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = Y + 41;
        ac = i3 % 128;
        int i4 = i3 % 2;
        int previewOffsetY = videoRecordingFragment.getPreviewOffsetY();
        int i5 = Y + 59;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return previewOffsetY;
    }

    public static final /* synthetic */ float access$getPreviewToLayoutScale$p(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 75;
        Y = i3 % 128;
        int i4 = i3 % 2;
        float f2 = videoRecordingFragment.G;
        if (i4 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setCurrentVideoSelfieScanState$p(VideoRecordingFragment videoRecordingFragment, VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        int i3 = ac;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        Y = i4 % 128;
        int i5 = i4 % 2;
        videoRecordingFragment.Q = videoSelfieScanState;
        int i6 = i3 + 73;
        Y = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 52 / 0;
        }
    }

    public static final /* synthetic */ void access$setPositionConstraint$p(VideoRecordingFragment videoRecordingFragment, FacePositionConstraint facePositionConstraint) {
        int i2 = 2 % 2;
        int i3 = Y;
        int i4 = i3 + 87;
        ac = i4 % 128;
        int i5 = i4 % 2;
        videoRecordingFragment.C = facePositionConstraint;
        int i6 = i3 + 7;
        ac = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$showAudioPermissionRationale(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 81;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        videoRecordingFragment.p();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = ac + 55;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$showCustomUiElementsThatDoNotOverlap(VideoRecordingFragment videoRecordingFragment, bc bcVar, View view) {
        int i2 = 2 % 2;
        int i3 = Y + 65;
        ac = i3 % 128;
        int i4 = i3 % 2;
        videoRecordingFragment.a(bcVar, view);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = Y + 121;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$showRecordingPermissionIntro$lambda$1$proceedAfterRecordingPermissionIntro(bc bcVar, VideoRecordingFragment videoRecordingFragment) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ac + 111;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        c(bcVar, videoRecordingFragment);
        if (i4 == 0) {
            throw null;
        }
        int i5 = ac + 37;
        Y = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$updateTapToAnswerButton(VideoRecordingFragment videoRecordingFragment, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = Y + 57;
        ac = i7 % 128;
        int i8 = i7 % 2;
        videoRecordingFragment.b(i2, i3, i4, i5);
        int i9 = Y + 97;
        ac = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = ac + 109;
        int i4 = i3 % 128;
        Y = i4;
        int i5 = i3 % 2;
        Modules modules = this.f12455c;
        int i6 = i4 + 49;
        ac = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = ac;
        int i4 = i3 + 105;
        Y = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f12457e;
        int i6 = i3 + 31;
        Y = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    private final bc d() {
        bc bcVar;
        int i2 = 2 % 2;
        int i3 = Y;
        int i4 = i3 + 29;
        ac = i4 % 128;
        if (i4 % 2 != 0) {
            bcVar = this.f12454b;
            int i5 = 92 / 0;
        } else {
            bcVar = this.f12454b;
        }
        int i6 = i3 + 39;
        ac = i6 % 128;
        int i7 = i6 % 2;
        return bcVar;
    }

    public final VideoRecordingPresenter getPresenter() {
        int i2 = 2 % 2;
        VideoRecordingPresenter videoRecordingPresenter = this.f12456d;
        if (videoRecordingPresenter != null) {
            int i3 = Y + 101;
            ac = i3 % 128;
            int i4 = i3 % 2;
            return videoRecordingPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = ac + 33;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return null;
    }

    public final void setPresenter(VideoRecordingPresenter videoRecordingPresenter) {
        int i2 = 2 % 2;
        int i3 = ac + 43;
        Y = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingPresenter, "");
            this.f12456d = videoRecordingPresenter;
        } else {
            Intrinsics.checkNotNullParameter(videoRecordingPresenter, "");
            this.f12456d = videoRecordingPresenter;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public final int getCameraFacing() {
        int i2 = 2 % 2;
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf("Not used")));
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        DaggerVideoRecordingComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).videoRecordingPresenterModule(new VideoRecordingPresenterModule(this)).build().inject(this);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.E = contextRequireContext;
        super.safeOnCreate(bundle, getPresenter());
        int i3 = ac + 117;
        Y = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = Y + 57;
        ac = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            this.f12454b = bc.e(layoutInflater, viewGroup);
            i();
            d();
            throw null;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.f12454b = bc.e(layoutInflater, viewGroup);
        i();
        bc bcVarD = d();
        IncodeTextView incodeTextView = bcVarD != null ? bcVarD.W : null;
        if (incodeTextView == null) {
            int i4 = Y + 81;
            ac = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } else {
            String string = getString(R.string.onboard_sdk_video_selfie_allow_screen_recording_subtitle);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getString(R.string.onboard_sdk_video_selfie_allow_screen_recording_subtitle_highlight);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            incodeTextView.setText(StringUtils.getSpannableStringWithHighlightedSection(string, string2, getContext(), R.color.onboard_sdk_white));
            int i5 = Y + 51;
            ac = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!this.f12464l) {
            int i7 = Y + 101;
            ac = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.f12462j) {
                setBackgroundFullscreenOverlayVisible(true);
            }
        }
        bc bcVarD2 = d();
        Intrinsics.checkNotNull(bcVarD2);
        ConstraintLayout constraintLayout = bcVarD2.M;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() throws Throwable {
        int i2 = 2 % 2;
        int i3 = ac + 65;
        Y = i3 % 128;
        if (i3 % 2 == 0) {
            super.onStart();
            b();
            int i4 = 15 / 0;
        } else {
            super.onStart();
            b();
        }
    }

    private final void b() throws Throwable {
        int i2 = 2 % 2;
        ag agVar = ag.f6381d;
        Object obj = null;
        if (ag.b()) {
            checkCameraPermissions();
            int i3 = Y + 101;
            ac = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = ac + 13;
        Y = i4 % 128;
        if (i4 % 2 != 0) {
            e();
        } else {
            e();
            throw null;
        }
    }

    private static final void c(bc bcVar, VideoRecordingFragment videoRecordingFragment) throws Throwable {
        int i2 = 2 % 2;
        int i3 = Y + 73;
        ac = i3 % 128;
        int i4 = i3 % 2;
        bcVar.f7011i.setVisibility(8);
        if (videoRecordingFragment.isResumed()) {
            int i5 = Y + 75;
            ac = i5 % 128;
            int i6 = i5 % 2;
            videoRecordingFragment.askForPermissions();
            int i7 = ac + 15;
            Y = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 4;
            }
        }
        bcVar.M.setOnClickListener(null);
    }

    static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f12530b = 1;

        /* JADX INFO: renamed from: d */
        private static int f12531d = 0;

        /* JADX INFO: renamed from: a */
        private int f12532a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ bc f12533c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ VideoRecordingFragment f12534e;

        /* JADX WARN: Code restructure failed: missing block: B:26:0x001b, code lost:
        
            if (r1 == 1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x001d, code lost:
        
            kotlin.ResultKt.throwOnFailure(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
        
            if (r0 == 1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.k.f12531d
                int r1 = r0 + 109
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.k.f12530b = r0
                int r1 = r1 % r5
                r4 = 1
                if (r1 != 0) goto L2a
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f12532a
                r0 = 22
                int r0 = r0 / 0
                if (r1 == 0) goto L35
                if (r1 != r4) goto L4f
            L1d:
                kotlin.ResultKt.throwOnFailure(r7)
            L20:
                com.incode.welcome_sdk.d.bc r1 = r6.f12533c
                com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r0 = r6.f12534e
                com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.access$showRecordingPermissionIntro$lambda$1$proceedAfterRecordingPermissionIntro(r1, r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L2a:
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.f12532a
                if (r0 == 0) goto L35
                if (r0 != r4) goto L4f
                goto L1d
            L35:
                kotlin.ResultKt.throwOnFailure(r7)
                r2 = r6
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r6.f12532a = r4
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r2)
                if (r0 != r3) goto L20
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.k.f12530b
                int r1 = r0 + 89
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.k.f12531d = r0
                int r1 = r1 % r5
                return r3
            L4f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12531d + 3;
            f12530b = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            int i5 = f12531d + 15;
            f12530b = i5 % 128;
            if (i5 % 2 != 0) {
                return objA;
            }
            throw null;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12531d + 113;
            f12530b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f12531d + 97;
            f12530b = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            k kVar = new k(this.f12533c, this.f12534e, continuation);
            int i3 = f12531d + 21;
            f12530b = i3 % 128;
            int i4 = i3 % 2;
            return kVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(bc bcVar, VideoRecordingFragment videoRecordingFragment, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f12533c = bcVar;
            this.f12534e = videoRecordingFragment;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ab(int r23, byte r24, short r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ab(int, byte, short, int, int, java.lang.Object[]):void");
    }

    private static final void e(Job job, bc bcVar, VideoRecordingFragment videoRecordingFragment, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ac + 33;
        Y = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(job, "");
            Intrinsics.checkNotNullParameter(bcVar, "");
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        } else {
            Intrinsics.checkNotNullParameter(job, "");
            Intrinsics.checkNotNullParameter(bcVar, "");
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        c(bcVar, videoRecordingFragment);
        int i4 = Y + 85;
        ac = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = ac + 51;
        Y = i3 % 128;
        int i4 = i3 % 2;
        final bc bcVarD = d();
        if (bcVarD != null) {
            bcVarD.f7011i.setVisibility(0);
            final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(bcVarD, this, null), 3, null);
            bcVarD.M.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoRecordingFragment.m8403instrumented$0$e$V(jobLaunch$default, bcVarD, this, view);
                }
            });
        } else {
            int i5 = Y + 101;
            ac = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i2 = 2 % 2;
        int i3 = Y + 45;
        ac = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12454b = null;
            this.I.clear();
            this.N.clear();
            super.onDestroyView();
            return;
        }
        this.f12454b = null;
        this.I.clear();
        this.N.clear();
        super.onDestroyView();
        throw null;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        VideoRecordingFragment videoRecordingFragment = (VideoRecordingFragment) objArr[0];
        View view = (View) objArr[1];
        int i2 = 2 % 2;
        int i3 = ac + 45;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Intrinsics.checkNotNull(view);
        videoRecordingFragment.e(view);
        int i5 = Y + 63;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return null;
    }

    private static final void e(VideoRecordingFragment videoRecordingFragment, View view) {
        int i2 = 2 % 2;
        int i3 = Y + 87;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            Intrinsics.checkNotNull(view);
            videoRecordingFragment.e(view);
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Intrinsics.checkNotNull(view);
        videoRecordingFragment.e(view);
        int i4 = Y + 105;
        ac = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$safeOnViewCreated$3 */
    static final class AnonymousClass3 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12535c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12536d = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f12535c + 97;
            f12536d = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f12536d + 93;
            f12535c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a() {
            VideoRecordingFragment videoRecordingFragment;
            int i2 = 2 % 2;
            int i3 = WhenMappings.f12538b[VideoRecordingFragment.access$getCurrentVideoSelfieScanState$p(VideoRecordingFragment.this).ordinal()];
            if (i3 == 1) {
                VideoRecordingFragment.this.getPresenter().downloadQuestionsAndVoiceConsentText(true);
            } else if (i3 == 2) {
                bc bcVarAccess$getBinding = VideoRecordingFragment.access$getBinding(VideoRecordingFragment.this);
                if (bcVarAccess$getBinding != null) {
                    int i4 = f12535c + 73;
                    f12536d = i4 % 128;
                    if (i4 % 2 != 0) {
                        videoRecordingFragment = VideoRecordingFragment.this;
                        bcVarAccess$getBinding.f7022t.setVisibility(4);
                        bcVarAccess$getBinding.f7016n.setVisibility(0);
                        bcVarAccess$getBinding.K.setVisibility(4);
                    } else {
                        videoRecordingFragment = VideoRecordingFragment.this;
                        bcVarAccess$getBinding.f7022t.setVisibility(3);
                        bcVarAccess$getBinding.f7016n.setVisibility(0);
                        bcVarAccess$getBinding.K.setVisibility(3);
                    }
                    videoRecordingFragment.getPresenter().retryProcessingBytes(false);
                }
            } else if (i3 == 3 || i3 == 4) {
                VideoRecordingFragment.this.getPresenter().retryProcessingBytes(false);
                int i5 = f12536d + 43;
                f12535c = i5 % 128;
                int i6 = i5 % 2;
            } else if (i3 == 5) {
                VideoRecordingFragment.this.getPresenter().onSpeechToTextTryAgainClicked();
            }
            VideoRecordingFragment.access$setCurrentVideoSelfieScanState$p(VideoRecordingFragment.this, VideoSelfieScanState.f12198d);
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$safeOnViewCreated$3$WhenMappings */
        public /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f12538b;

            /* JADX INFO: renamed from: d */
            private static int f12539d = 1;

            /* JADX INFO: renamed from: e */
            private static int f12540e = 0;

            static {
                int[] iArr = new int[VideoSelfieScanState.values().length];
                try {
                    iArr[VideoSelfieScanState.f12196b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoSelfieScanState.f12197c.ordinal()] = 2;
                    int i2 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VideoSelfieScanState.f12199e.ordinal()] = 3;
                    int i3 = f12540e + 45;
                    f12539d = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VideoSelfieScanState.f12195a.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VideoSelfieScanState.f12204j.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f12538b = iArr;
                int i6 = f12540e + 99;
                f12539d = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        AnonymousClass3() {
            super(0);
        }
    }

    public static final void b(VideoRecordingFragment videoRecordingFragment, FragmentManager fragmentManager, Fragment fragment) {
        int i2 = 2 % 2;
        int i3 = Y + 7;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        if (fragment instanceof AudioPermissionMandatoryDialog) {
            int i5 = ac + 5;
            Y = i5 % 128;
            if (i5 % 2 != 0) {
                ((AudioPermissionMandatoryDialog) fragment).setListener(videoRecordingFragment);
            } else {
                ((AudioPermissionMandatoryDialog) fragment).setListener(videoRecordingFragment);
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x002c A[PHI: r2
  0x002c: PHI (r2v9 com.incode.welcome_sdk.d.bc) = (r2v2 com.incode.welcome_sdk.d.bc), (r2v10 com.incode.welcome_sdk.d.bc) binds: [B:96:0x01e0, B:54:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void safeOnViewCreated(android.view.View r47, android.os.Bundle r48) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.safeOnViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.incode.welcome_sdk.commons.ui.FragmentWithListener, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i2 = 2 % 2;
        int i3 = ac + 21;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof VideoSelfieProgressListener) {
            int i5 = ac + 51;
            Y = i5 % 128;
            int i6 = i5 % 2;
            this.f12453a = (VideoSelfieProgressListener) context;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i2 = 2 % 2;
        int i3 = ac + 61;
        Y = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        if (getPendingShowPermissionsMandatoryDialog()) {
            int i5 = Y + 7;
            ac = i5 % 128;
            int i6 = i5 % 2;
            showCameraPermissionsMandatory();
            setPendingShowPermissionsMandatoryDialog(false);
            int i7 = ac + 23;
            Y = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void c() {
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(bcVarD.M);
            IncodeTextView incodeTextView = bcVarD.O;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            if (incodeTextView.getVisibility() != 0) {
                constraintSet.connect(bcVarD.f7024v.getId(), 4, bcVarD.O.getId(), 3);
            } else {
                int i3 = Y + 71;
                ac = i3 % 128;
                int i4 = i3 % 2;
                constraintSet.connect(bcVarD.f7024v.getId(), 4, 0, 4);
            }
            constraintSet.applyTo(bcVarD.M);
            IncodeTextView incodeTextView2 = bcVarD.O;
            Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
            if (incodeTextView2.getVisibility() != 0) {
                ConstraintLayout constraintLayout = bcVarD.f7024v;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                ConstraintLayout constraintLayout2 = constraintLayout;
                ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, 0, 0, (int) LayoutUtils.convertDpToPx(requireContext(), 20.0f));
                    constraintLayout2.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            return;
        }
        int i5 = ac + 109;
        Y = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void h() {
        al binding;
        int i2 = 2 % 2;
        int i3 = Y + 3;
        ac = i3 % 128;
        VideoSelfieActivity videoSelfieActivity = null;
        if (i3 % 2 != 0) {
            boolean z2 = getActivity() instanceof VideoSelfieActivity;
            videoSelfieActivity.hashCode();
            throw null;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof VideoSelfieActivity) {
            videoSelfieActivity = (VideoSelfieActivity) activity;
        } else {
            int i4 = Y + 53;
            ac = i4 % 128;
            int i5 = i4 % 2;
        }
        if (videoSelfieActivity == null || (binding = videoSelfieActivity.getBinding()) == null) {
            return;
        }
        int i6 = ac + 53;
        Y = i6 % 128;
        int i7 = i6 % 2;
        ConstraintLayout constraintLayout = binding.f6883e;
        if (constraintLayout != null) {
            int i8 = ac + 7;
            Y = i8 % 128;
            int i9 = i8 % 2;
            ViewTreeObserver viewTreeObserver = constraintLayout.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f12493a = 1;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f12494c = 0;

                    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onGlobalLayout() {
                        /*
                            r6 = this;
                            r5 = 2
                            int r0 = r5 % r5
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a
                            int r1 = r0 + 89
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c = r0
                            int r1 = r1 % r5
                            r3 = 0
                            if (r1 != 0) goto L9a
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r0 = r6.f12495e
                            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
                            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity
                            if (r0 == 0) goto L88
                            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity r2 = (com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity) r2
                        L1b:
                            if (r2 == 0) goto L7d
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a
                            int r1 = r0 + 39
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c = r0
                            int r1 = r1 % r5
                            com.incode.welcome_sdk.d.al r2 = r2.getBinding()
                            if (r2 == 0) goto L7d
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c
                            int r1 = r0 + 27
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a = r0
                            int r1 = r1 % r5
                            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f6883e
                        L37:
                            if (r2 == 0) goto L45
                            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
                            if (r1 == 0) goto L45
                            r0 = r6
                            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r0
                            r1.removeOnGlobalLayoutListener(r0)
                        L45:
                            r4 = 0
                            if (r2 == 0) goto L7b
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a
                            int r1 = r0 + 69
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c = r0
                            int r1 = r1 % r5
                            if (r1 != 0) goto L93
                            int r0 = r2.getHeight()
                        L57:
                            float r3 = (float) r0
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r0 = r6.f12495e
                            com.incode.welcome_sdk.d.bc r2 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.access$getBinding(r0)
                            if (r2 == 0) goto L75
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a
                            int r1 = r0 + 107
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c = r0
                            int r1 = r1 % r5
                            if (r1 == 0) goto L76
                            com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView r1 = r2.f7009g
                            r0 = 22
                            int r0 = r0 / r4
                            if (r1 == 0) goto L75
                        L72:
                            r1.setMarginBottom(r3)
                        L75:
                            return
                        L76:
                            com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView r1 = r2.f7009g
                            if (r1 == 0) goto L75
                            goto L72
                        L7b:
                            r0 = r4
                            goto L57
                        L7d:
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a
                            int r1 = r0 + 53
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c = r0
                            int r1 = r1 % r5
                            r2 = r3
                            goto L37
                        L88:
                            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12494c
                            int r1 = r0 + 109
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.f12493a = r0
                            int r1 = r1 % r5
                            r2 = r3
                            goto L1b
                        L93:
                            r2.getHeight()
                            r3.hashCode()
                            throw r3
                        L9a:
                            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r0 = r6.f12495e
                            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                            boolean r0 = r0 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity
                            r3.hashCode()
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$centerCameraOverlay$1.onGlobalLayout():void");
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.i():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void startVideoSelfieProgressStep(VideoSelfieScanState videoSelfieScanState) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        if (videoSelfieScanState != VideoSelfieScanState.f12197c) {
            int i3 = Y + 121;
            int i4 = i3 % 128;
            ac = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 79;
            Y = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            int i8 = ac + 43;
            Y = i8 % 128;
            int i9 = i8 % 2;
            z2 = false;
        }
        b(z2);
        VideoSelfieProgressListener videoSelfieProgressListener = this.f12453a;
        if (videoSelfieProgressListener != null) {
            videoSelfieProgressListener.onStartVsProgressStep(videoSelfieScanState);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void finishVideoSelfieProgressStep(VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        int i3 = Y + 113;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        VideoSelfieProgressListener videoSelfieProgressListener = this.f12453a;
        if (videoSelfieProgressListener != null) {
            int i5 = Y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            ac = i5 % 128;
            int i6 = i5 % 2;
            videoSelfieProgressListener.onFinishVsProgressStep(videoSelfieScanState);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public final void onCameraPermissionGranted() {
        Group group;
        int i2 = 2 % 2;
        int i3 = Y + 67;
        ac = i3 % 128;
        int i4 = i3 % 2;
        super.onCameraPermissionGranted();
        bc bcVarD = d();
        if (bcVarD != null) {
            group = bcVarD.f7010h;
        } else {
            int i5 = Y + 105;
            ac = i5 % 128;
            int i6 = i5 % 2;
            group = null;
        }
        if (group == null) {
            int i7 = Y + 51;
            ac = i7 % 128;
            int i8 = i7 % 2;
        } else {
            group.setVisibility(8);
        }
        getPresenter().prepareVideoSelfieSteps();
        finishVideoSelfieProgressStep(VideoSelfieScanState.f12196b);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        int i2 = 2 % 2;
        int i3 = Y + 13;
        ac = i3 % 128;
        int i4 = i3 % 2;
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(240340945, -240340931, new Object[]{this}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
        super.onPause();
        int i5 = ac + 107;
        Y = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = Y + 33;
        ac = i3 % 128;
        int i4 = i3 % 2;
        this.I.clear();
        getPresenter().onDestroy();
        super.safeOnDestroy();
        int i5 = ac + 37;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
    }

    private final void e(View view) {
        int i2 = 2 % 2;
        int i3 = ac + 35;
        Y = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ViewExtensionsKt.preventDoubleClick(view, 1600L);
            Runnable runnable = this.F;
            if (runnable == null) {
                int i4 = ac + 29;
                Y = i4 % 128;
                int i5 = i4 % 2;
                return;
            } else {
                runnable.run();
                int i6 = Y + 51;
                ac = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        ViewExtensionsKt.preventDoubleClick(view, 1600L);
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final boolean onBackPressed() {
        int i2 = 2 % 2;
        int i3 = ac + 9;
        Y = i3 % 128;
        int i4 = i3 % 2;
        getPresenter().onBackPressed();
        if (IncodeWelcome.Companion.getInstance().isCaptureOnlyMode()) {
            e(new VideoSelfieResult(ResultCode.SUCCESS, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
            int i5 = Y + 67;
            ac = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        e(new VideoSelfieResult(ResultCode.USER_CANCELLED, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment
    public final boolean shouldRecordScreen() {
        int i2 = 2 % 2;
        int i3 = Y;
        int i4 = i3 + 73;
        ac = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 73;
        ac = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment
    public final CameraPreviewType getCameraType() {
        int i2 = 2 % 2;
        int i3 = Y + 25;
        ac = i3 % 128;
        int i4 = i3 % 2;
        CameraPreviewType cameraPreviewType = CameraPreviewType.FULLSCREEN;
        if (i4 == 0) {
            return cameraPreviewType;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment
    public final void showCameraReconfigurationUi(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ac + 9;
        Y = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            if (z2) {
                if (getMActiveCameraId() != 1) {
                    bcVarD.P.setText(R.string.onboard_sdk_vs_switch_to_front_camera);
                    bcVarD.f7014l.setRotationY(0.0f);
                    int i5 = ac + 71;
                    Y = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    int i7 = ac + 61;
                    Y = i7 % 128;
                    int i8 = i7 % 2;
                    bcVarD.P.setText(R.string.onboard_sdk_vs_switch_to_back_camera);
                    bcVarD.f7014l.setRotationY(180.0f);
                }
                bcVarD.f7015m.setVisibility(0);
            } else {
                bcVarD.P.setText(R.string.onboard_sdk_vs_improving_resolution);
                bcVarD.f7014l.setRotationY(180.0f);
            }
            bcVarD.P.setVisibility(0);
            bcVarD.f7013k.setVisibility(0);
            bcVarD.f7014l.setVisibility(0);
            int iB = PermissionOnboardingEntryPointKt.b.b();
            int iB2 = PermissionOnboardingEntryPointKt.b.b();
            a(841820945, -841820944, new Object[]{bcVarD, true}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment
    public final void hideCameraReconfigurationUi() {
        bc bcVarD;
        int i2 = 2 % 2;
        int i3 = ac + 87;
        Y = i3 % 128;
        if (i3 % 2 == 0) {
            bcVarD = d();
            int i4 = 94 / 0;
            if (bcVarD == null) {
                return;
            }
        } else {
            bcVarD = d();
            if (bcVarD == null) {
                return;
            }
        }
        bcVarD.f7014l.setVisibility(4);
        bcVarD.f7013k.setVisibility(4);
        bcVarD.P.setVisibility(4);
        bcVarD.f7015m.setVisibility(4);
        int i5 = Y + 11;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public final void onDetectionResult(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = Y + 15;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void updateRecordingTimer(String str) {
        int i2 = 2 % 2;
        int i3 = ac + 103;
        Y = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001a, code lost:
    
        if (getPresenter().isStarted() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        getMCameraPresenter().createCameraSourceAndFaceProcessor(getMActiveCameraId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0030, code lost:
    
        if (getPresenter().isStarted() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r3.Q == com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState.f12196b) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y + 123;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r1 % 128;
        r1 = r1 % 2;
        getPresenter().start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.camera.CameraContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReadyToCreateCamera() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L28
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r0 = r3.getPresenter()
            boolean r1 = r0.isStarted()
            r0 = 17
            int r0 = r0 / 0
            if (r1 == 0) goto L33
        L1c:
            com.incode.welcome_sdk.ui.camera.CameraPresenter r1 = r3.getMCameraPresenter()
            int r0 = r3.getMActiveCameraId()
            r1.createCameraSourceAndFaceProcessor(r0)
            return
        L28:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r0 = r3.getPresenter()
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L33
            goto L1c
        L33:
            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState r1 = r3.Q
            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState.f12196b
            if (r1 == r0) goto L49
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r0 = r3.getPresenter()
            r0.start()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.onReadyToCreateCamera():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0021 A[PHI: r2
  0x0021: PHI (r2v1 com.incode.welcome_sdk.ui.camera.CameraPreview) = (r2v0 com.incode.welcome_sdk.ui.camera.CameraPreview), (r2v2 com.incode.welcome_sdk.ui.camera.CameraPreview) binds: [B:30:0x004f, B:24:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.camera.CameraContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCameraSourceCreated() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            super.onCameraSourceCreated()
            com.incode.welcome_sdk.d.bc r3 = r5.d()
            if (r3 == 0) goto L3c
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L4b
            com.incode.welcome_sdk.ui.camera.CameraPreview r2 = r5.getMPreview()
            r0 = 56
            int r0 = r0 / 0
            if (r2 == 0) goto L3c
        L21:
            android.widget.ImageView r0 = r3.f7008f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            float r0 = r1.verticalBias
            r2.setVerticalBias(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r4
        L3c:
            r5.t()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L52
            return
        L4b:
            com.incode.welcome_sdk.ui.camera.CameraPreview r2 = r5.getMPreview()
            if (r2 == 0) goto L3c
            goto L21
        L52:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.onCameraSourceCreated():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) throws Throwable {
        int i3 = 2 % 2;
        int i4 = ac + 87;
        Y = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (this.M) {
            super.checkCameraPermissions();
            int i5 = Y + 43;
            ac = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
                return;
            }
            return;
        }
        if (!q()) {
            p();
            return;
        }
        int i7 = Y + 13;
        ac = i7 % 128;
        int i8 = i7 % 2;
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = ac + 73;
        Y = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
        }
        super.onSaveInstanceState(bundle);
        setMSaveInstanceStateCalled(true);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public final void onPreviewLayoutChanged(int i2, int i3, int i4, int i5) {
        float f2;
        int i6 = 2 % 2;
        int i7 = ac + 29;
        Y = i7 % 128;
        if (i7 % 2 == 0) {
            super.onPreviewLayoutChanged(i2, i3, i4, i5);
            f2 = i4 - i2;
        } else {
            super.onPreviewLayoutChanged(i2, i3, i4, i5);
            f2 = i4 / i2;
        }
        this.G = f2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final FacePositionConstraint getPositionConstraint() {
        int i2 = 2 % 2;
        int i3 = Y;
        int i4 = i3 + 81;
        ac = i4 % 128;
        int i5 = i4 % 2;
        FacePositionConstraint facePositionConstraint = this.C;
        int i6 = i3 + 79;
        ac = i6 % 128;
        int i7 = i6 % 2;
        return facePositionConstraint;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showProcessingUi() {
        int i2 = 2 % 2;
        int i3 = ac + 11;
        Y = i3 % 128;
        LinearLayout linearLayout = null;
        if (i3 % 2 == 0) {
            d();
            linearLayout.hashCode();
            throw null;
        }
        bc bcVarD = d();
        if (bcVarD != null) {
            linearLayout = bcVarD.f7028z;
            int i4 = ac + 21;
            Y = i4 % 128;
            int i5 = i4 % 2;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void hideProcessingUI() {
        int i2 = 2 % 2;
        int i3 = ac + 83;
        Y = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarD = d();
        LinearLayout linearLayout = null;
        if (bcVarD != null) {
            int i5 = ac + 15;
            Y = i5 % 128;
            if (i5 % 2 == 0) {
                LinearLayout linearLayout2 = bcVarD.f7028z;
                throw null;
            }
            linearLayout = bcVarD.f7028z;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(4);
    }

    /* synthetic */ class i implements Consumer, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private static int f12524a = 1;

        /* JADX INFO: renamed from: d */
        private static int f12525d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ VideoRecordingPresenter f12526b;

        private void c(float f2) {
            int i2 = 2 % 2;
            int i3 = f12525d + 101;
            f12524a = i3 % 128;
            if (i3 % 2 == 0) {
                this.f12526b.setMinFaceWidth(f2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.f12526b.setMinFaceWidth(f2);
            int i4 = f12525d + 115;
            f12524a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // androidx.core.util.Consumer
        public final /* synthetic */ void accept(Object obj) {
            int i2 = 2 % 2;
            int i3 = f12525d + 21;
            f12524a = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            c(((Number) obj).floatValue());
            if (i4 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = f12524a + 75;
            f12525d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f12525d + 75;
            f12524a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i5 = f12524a + 103;
            f12525d = i5 % 128;
            if (i5 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (!(obj instanceof Consumer)) {
                int i3 = f12524a + 63;
                f12525d = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 27 / 0;
                }
                return false;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = f12524a + 1;
            f12525d = i5 % 128;
            int i6 = i5 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            if (i6 != 0) {
                int i7 = 4 / 0;
            }
            return zAreEqual;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            int i2 = 2 % 2;
            FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(1, this.f12526b, VideoRecordingPresenter.class, "setMinFaceWidth", "setMinFaceWidth(F)V", 0);
            int i3 = f12524a + 125;
            f12525d = i3 % 128;
            if (i3 % 2 == 0) {
                return functionReferenceImpl;
            }
            throw null;
        }

        i(VideoRecordingPresenter videoRecordingPresenter) {
            this.f12526b = videoRecordingPresenter;
        }
    }

    public static final void a(VideoRecordingFragment videoRecordingFragment, Runnable runnable, bc bcVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Intrinsics.checkNotNullParameter(bcVar, "");
        CameraPreview mPreview = videoRecordingFragment.getMPreview();
        if (mPreview != null) {
            com.incode.welcome_sdk.commons.utils.e.b(bcVar.G, mPreview, new i(videoRecordingFragment.getPresenter()));
            int i3 = Y + 19;
            ac = i3 % 128;
            int i4 = i3 % 2;
        }
        if (runnable != null) {
            int i5 = ac + 35;
            Y = i5 % 128;
            int i6 = i5 % 2;
            runnable.run();
        }
    }

    public static final void d(final VideoRecordingFragment videoRecordingFragment, final Runnable runnable, final bc bcVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Intrinsics.checkNotNullParameter(bcVar, "");
        CameraPreview mPreview = videoRecordingFragment.getMPreview();
        if (mPreview == null) {
            int i3 = Y + 23;
            ac = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = Y + 75;
        ac = i4 % 128;
        if (i4 % 2 == 0) {
            mPreview.animateCameraPreviewScale(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.a(this.f$0, runnable, bcVar);
                }
            });
        } else {
            mPreview.animateCameraPreviewScale(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.a(this.f$0, runnable, bcVar);
                }
            });
            int i5 = 31 / 0;
        }
    }

    public static final void a(OverlayWithHoleImageView overlayWithHoleImageView, Runnable runnable, VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(overlayWithHoleImageView, "");
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        overlayWithHoleImageView.setVisibility(4);
        overlayWithHoleImageView.a();
        if (runnable != null) {
            int i3 = ac + 73;
            Y = i3 % 128;
            int i4 = i3 % 2;
            runnable.run();
        }
        videoRecordingFragment.C = null;
        int i5 = ac + 15;
        Y = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void c(final OverlayWithHoleImageView overlayWithHoleImageView, final Runnable runnable, final VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = Y + 125;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(overlayWithHoleImageView, "");
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        overlayWithHoleImageView.d();
        overlayWithHoleImageView.e(ContextCompat.getColor(overlayWithHoleImageView.getContext(), android.R.color.transparent), new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecordingFragment.a(overlayWithHoleImageView, runnable, videoRecordingFragment);
            }
        });
        int i5 = ac + 1;
        Y = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setSelfieUIVisible(boolean z2, final Runnable runnable) {
        float cameraScale;
        final OverlayWithHoleImageView overlayWithHoleImageView;
        CameraPreview mPreview;
        int i2 = 2 % 2;
        Context context = this.E;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            context = null;
        }
        int color = ContextCompat.getColor(context, R.color.onboard_sdk_TextColorDefault);
        final bc bcVarD = d();
        if (bcVarD != null) {
            bcVarD.R.setTextColor(color);
            IncodeTextView incodeTextView = bcVarD.T;
            incodeTextView.setTextColor(color);
            incodeTextView.setDrawableTint(color);
            IncodeTextView incodeTextView2 = bcVarD.U;
            incodeTextView2.setTextColor(color);
            incodeTextView2.setDrawableTint(color);
            ViewGroup.LayoutParams layoutParams = bcVarD.f7008f.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            float f2 = ((ConstraintLayout.LayoutParams) layoutParams).verticalBias;
            if (z2) {
                int i3 = ac + 117;
                Y = i3 % 128;
                int i4 = i3 % 2;
                float width = bcVarD.f7008f.getWidth() / getLayoutWidth();
                CameraPreview mPreview2 = getMPreview();
                if (mPreview2 != null) {
                    int i5 = ac + 23;
                    Y = i5 % 128;
                    if (i5 % 2 == 0) {
                        mPreview2.prepareCameraPreviewScaleAnimation(width);
                        throw null;
                    }
                    mPreview2.prepareCameraPreviewScaleAnimation(width);
                }
                bcVarD.G.setVisibility(0);
                bcVarD.f7018p.setVisibility(0);
                bcVarD.f7009g.setMode(OverlayWithHoleImageView.Mode.CIRCLE);
                bcVarD.f7009g.setVisibility(0);
                OverlayWithHoleImageView overlayWithHoleImageView2 = bcVarD.f7009g;
                Context context3 = this.E;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    context2 = context3;
                }
                overlayWithHoleImageView2.e(ContextCompat.getColor(context2, R.color.onboard_sdk_white), new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda31
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRecordingFragment.d(this.f$0, runnable, bcVarD);
                    }
                });
                FacePositionConstraint facePositionConstraint = new FacePositionConstraint(bcVarD.f7008f.getLeft(), bcVarD.f7008f.getTop(), bcVarD.f7008f.getRight(), bcVarD.f7008f.getBottom());
                CameraPreview mPreview3 = getMPreview();
                if (mPreview3 != null) {
                    int i6 = ac + 41;
                    Y = i6 % 128;
                    int i7 = i6 % 2;
                    cameraScale = mPreview3.getCameraScale();
                } else {
                    cameraScale = 1.0f;
                }
                facePositionConstraint.scaleWithVerticalBias(1.0f / cameraScale, f2);
                facePositionConstraint.offsetBy(-getPreviewOffsetX(), -getPreviewOffsetY());
                facePositionConstraint.scaleFromOrigin(this.G);
                facePositionConstraint.scaleFromCenter(0.9f);
                this.C = facePositionConstraint;
            } else {
                CameraPreview mPreview4 = getMPreview();
                if (mPreview4 != null) {
                    mPreview4.prepareCameraPreviewScaleAnimation(1.0f);
                    int i8 = ac + 65;
                    Y = i8 % 128;
                    int i9 = i8 % 2;
                }
                bcVarD.G.setVisibility(4);
                bcVarD.f7018p.setVisibility(4);
                bcVarD.f7016n.setVisibility(4);
                bcVarD.f7022t.setVisibility(4);
                bcVarD.f7021s.setVisibility(4);
                bcVarD.f7019q.setVisibility(4);
                bcVarD.f7020r.setVisibility(4);
                bc bcVarD2 = d();
                if (bcVarD2 != null && (overlayWithHoleImageView = bcVarD2.f7009g) != null && (mPreview = getMPreview()) != null) {
                    mPreview.animateCameraPreviewScale(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoRecordingFragment.c(overlayWithHoleImageView, runnable, this);
                        }
                    });
                }
            }
            a(841820945, -841820944, new Object[]{bcVarD, Boolean.valueOf(z2)}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b());
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i2;
        VideoRecordingFragment videoRecordingFragment = (VideoRecordingFragment) objArr[0];
        UiState uiState = (UiState) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i3 = 2 % 2;
        int i4 = Y + 59;
        ac = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            videoRecordingFragment.d();
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        bc bcVarD = videoRecordingFragment.d();
        if (bcVarD != null) {
            if (uiState == null) {
                int i5 = Y + 35;
                ac = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                i2 = -1;
            } else {
                i2 = WhenMappings.f12479a[uiState.ordinal()];
            }
            if (i2 == 1) {
                bcVarD.K.setVisibility(4);
                bcVarD.G.setVisibility(4);
                bcVarD.f7019q.setVisibility(0);
                bcVarD.f7020r.setImageResource(R.drawable.onboard_sdk_ic_capture_success);
                bcVarD.f7020r.setVisibility(0);
            } else if (i2 == 2) {
                bcVarD.K.setVisibility(0);
                bcVarD.f7020r.setVisibility(4);
                p.c cVar = p.f6577e;
                Vibrator vibrator = videoRecordingFragment.H;
                if (vibrator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    vibrator = null;
                }
                p.c.a(vibrator, true);
            } else if (i2 == 3 || i2 == 4) {
                bcVarD.K.setVisibility(4);
                bcVarD.f7020r.setImageResource(R.drawable.onboard_sdk_ic_capture_error);
                bcVarD.f7020r.setVisibility(0);
                p.c cVar2 = p.f6577e;
                Vibrator vibrator2 = videoRecordingFragment.H;
                if (vibrator2 == null) {
                    int i6 = Y + 55;
                    ac = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    vibrator2 = null;
                }
                p.c.a(vibrator2, false);
                bcVarD.f7022t.setVisibility(0);
                bcVarD.f7016n.setVisibility(4);
            } else if (i2 != 5) {
                bcVarD.K.setVisibility(4);
                bcVarD.f7018p.setVisibility(0);
                bcVarD.f7016n.setVisibility(4);
                bcVarD.f7019q.setVisibility(4);
                bcVarD.f7022t.setVisibility(4);
                bcVarD.f7021s.setVisibility(4);
                bcVarD.f7023u.setVisibility(8);
                bcVarD.f7025w.setVisibility(8);
                bcVarD.f7020r.setImageResource(R.drawable.onboard_sdk_ic_face_capture);
                bcVarD.f7020r.setVisibility(0);
            } else {
                bcVarD.K.setVisibility(4);
                p.c cVar3 = p.f6577e;
                Vibrator vibrator3 = videoRecordingFragment.H;
                if (vibrator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = ac + 109;
                    Y = i7 % 128;
                    int i8 = i7 % 2;
                    vibrator3 = null;
                }
                p.c.a(vibrator3, false);
                bcVarD.f7021s.setVisibility(0);
                bcVarD.f7016n.setVisibility(4);
            }
            videoRecordingFragment.showFeedbackBottom(iIntValue);
        }
        return null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setSelfieUIState(final UiState uiState, final int i2) {
        int i3 = 2 % 2;
        int i4 = ac + 1;
        Y = i4 % 128;
        int i5 = i4 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i6 = Y + 73;
            ac = i6 % 128;
            int i7 = i6 % 2;
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.a(this.f$0, uiState, i2);
                }
            });
            int i8 = ac + 91;
            Y = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private final View e(IdScan.IdType idType) {
        int i2;
        int i3 = 2 % 2;
        int i4 = WhenMappings.f12480c[idType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bc bcVarD = d();
            return bcVarD != null ? bcVarD.F : null;
        }
        bc bcVarD2 = d();
        if (bcVarD2 != null) {
            imageView = bcVarD2.H;
            i2 = Y + 85;
            ac = i2 % 128;
        } else {
            i2 = ac + 93;
            Y = i2 % 128;
        }
        int i5 = i2 % 2;
        return imageView;
    }

    static final class c extends Lambda implements Function1<Rect, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12488a = 1;

        /* JADX INFO: renamed from: d */
        private static int f12489d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ VideoRecordingFragment f12490b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ View f12491c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ bc f12492e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Rect rect) {
            int i2 = 2 % 2;
            int i3 = f12488a + 59;
            f12489d = i3 % 128;
            int i4 = i3 % 2;
            c(rect);
            Unit unit = Unit.INSTANCE;
            int i5 = f12489d + 55;
            f12488a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return unit;
        }

        private void c(Rect rect) {
            float cameraScale;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(rect, "");
            this.f12492e.f7009g.setRoundedRect(rect, (int) this.f12490b.getResources().getDimension(R.dimen.onboard_sdk_video_selfie_id_vignette_corners_rounding_radius));
            this.f12492e.f7009g.setMode(OverlayWithHoleImageView.Mode.ROUNDED_RECT);
            this.f12492e.f7009g.setVisibility(0);
            this.f12491c.setVisibility(0);
            VideoRecordingFragment videoRecordingFragment = this.f12490b;
            FacePositionConstraint facePositionConstraint = new FacePositionConstraint(this.f12491c.getLeft(), this.f12491c.getTop(), this.f12491c.getRight(), this.f12491c.getBottom());
            VideoRecordingFragment videoRecordingFragment2 = this.f12490b;
            bc bcVar = this.f12492e;
            View view = this.f12491c;
            CameraPreview cameraPreviewAccess$getMPreview = VideoRecordingFragment.access$getMPreview(videoRecordingFragment2);
            if (cameraPreviewAccess$getMPreview != null) {
                int i3 = f12489d + 59;
                f12488a = i3 % 128;
                int i4 = i3 % 2;
                cameraScale = cameraPreviewAccess$getMPreview.getCameraScale();
            } else {
                int i5 = f12489d + 31;
                f12488a = i5 % 128;
                int i6 = i5 % 2;
                cameraScale = 1.0f;
            }
            facePositionConstraint.scaleWithVerticalBias(1.0f / cameraScale, 0.5f);
            facePositionConstraint.offsetBy(-VideoRecordingFragment.access$getPreviewOffsetX(videoRecordingFragment2), -VideoRecordingFragment.access$getPreviewOffsetY(videoRecordingFragment2));
            facePositionConstraint.scaleFromOrigin(VideoRecordingFragment.access$getPreviewToLayoutScale$p(videoRecordingFragment2));
            VideoRecordingFragment.access$showCustomUiElementsThatDoNotOverlap(videoRecordingFragment2, bcVar, view);
            VideoRecordingFragment.access$setPositionConstraint$p(videoRecordingFragment, facePositionConstraint);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(bc bcVar, VideoRecordingFragment videoRecordingFragment, View view) {
            super(1);
            this.f12492e = bcVar;
            this.f12490b = videoRecordingFragment;
            this.f12491c = view;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setIdFrameVisible(IdScan.IdType idType, boolean z2, int i2) {
        View viewE;
        bc bcVarD;
        int i3 = 2 % 2;
        int i4 = Y + 67;
        ac = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(idType, "");
            viewE = e(idType);
            int i5 = 30 / 0;
            if (viewE == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(idType, "");
            viewE = e(idType);
            if (viewE == null) {
                return;
            }
        }
        int i6 = Y + 11;
        ac = i6 % 128;
        if (i6 % 2 != 0) {
            bcVarD = d();
            int i7 = 70 / 0;
            if (bcVarD == null) {
                return;
            }
        } else {
            bcVarD = d();
            if (bcVarD == null) {
                return;
            }
        }
        if (z2) {
            Object[] objArr = {this, idType, new c(bcVarD, this, viewE)};
            int iB = PermissionOnboardingEntryPointKt.b.b();
            int iB2 = PermissionOnboardingEntryPointKt.b.b();
            a(-829071065, 829071078, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
            int i8 = ac + 65;
            Y = i8 % 128;
            int i9 = i8 % 2;
        } else {
            bcVarD.f7009g.setVisibility(4);
            viewE.setVisibility(4);
            this.C = null;
        }
        Object[] objArr2 = {bcVarD, Boolean.valueOf(z2)};
        int iB3 = PermissionOnboardingEntryPointKt.b.b();
        int iB4 = PermissionOnboardingEntryPointKt.b.b();
        a(841820945, -841820944, objArr2, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB4, iB3);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setFeedbackIdVisible(boolean z2, int i2) {
        int i3 = 2 % 2;
        int i4 = Y + 111;
        ac = i4 % 128;
        int i5 = i4 % 2;
        f();
        if (i2 != 1) {
            d(z2);
            int i6 = ac + 9;
            Y = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = ac + 21;
        Y = i8 % 128;
        if (i8 % 2 != 0) {
            a(z2);
        } else {
            a(z2);
            throw null;
        }
    }

    private final void b(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i4 = Y + 85;
            ac = i4 % 128;
            int i5 = i4 % 2;
            ImageView imageView = bcVarD.f7007e;
            if (imageView != null) {
                if (z2) {
                    int i6 = Y + 3;
                    ac = i6 % 128;
                    if (i6 % 2 != 0) {
                        i2 = R.drawable.onboard_sdk_close_button_inverted;
                        int i7 = 89 / 0;
                    } else {
                        i2 = R.drawable.onboard_sdk_close_button_inverted;
                    }
                } else {
                    i2 = R.drawable.onboard_sdk_close_button;
                }
                imageView.setImageResource(i2);
                int i8 = ac + 101;
                Y = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    private final void f() {
        IncodeTextView incodeTextView;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null && (incodeTextView = bcVarD.V) != null) {
            int i3 = ac + 109;
            Y = i3 % 128;
            int i4 = i3 % 2;
            incodeTextView.removeCallbacks(this.S);
            int i5 = Y + 117;
            ac = i5 % 128;
            int i6 = i5 % 2;
        }
        bc bcVarD2 = d();
        if (bcVarD2 != null) {
            int i7 = ac + 61;
            Y = i7 % 128;
            if (i7 % 2 == 0) {
                LinearLayout linearLayout = bcVarD2.f7012j;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            LinearLayout linearLayout2 = bcVarD2.f7012j;
            if (linearLayout2 != null) {
                linearLayout2.removeCallbacks(this.P);
                int i8 = Y + 35;
                ac = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        this.L = false;
    }

    public static final void c(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 1;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        bc bcVarD = videoRecordingFragment.d();
        if (bcVarD != null) {
            TransitionManager.beginDelayedTransition(bcVarD.M, new Fade().addTarget(bcVarD.V));
        }
        videoRecordingFragment.a(false);
        videoRecordingFragment.L = false;
        int i5 = Y + 31;
        ac = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        VideoRecordingFragment videoRecordingFragment = (VideoRecordingFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = Y + 17;
        ac = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            videoRecordingFragment.d();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        bc bcVarD = videoRecordingFragment.d();
        if (bcVarD != null) {
            TransitionManager.beginDelayedTransition(bcVarD.M, new Fade().addTarget(bcVarD.f7012j));
        } else {
            int i4 = ac + 65;
            Y = i4 % 128;
            int i5 = i4 % 2;
        }
        videoRecordingFragment.d(false);
        videoRecordingFragment.L = false;
        return null;
    }

    private final void a(boolean z2) {
        IncodeTextView incodeTextView;
        int i2;
        int i3 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i4 = ac + 17;
            Y = i4 % 128;
            int i5 = i4 % 2;
            incodeTextView = bcVarD.V;
        } else {
            incodeTextView = null;
        }
        if (incodeTextView == null) {
            return;
        }
        if (!(!z2)) {
            i2 = 0;
        } else {
            int i6 = ac + 91;
            Y = i6 % 128;
            int i7 = i6 % 2;
            i2 = 4;
        }
        incodeTextView.setVisibility(i2);
    }

    private final void d(boolean z2) {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        bc bcVarD = d();
        int i3 = 0;
        if (bcVarD != null) {
            int i4 = ac + 59;
            Y = i4 % 128;
            if (i4 % 2 == 0) {
                linearLayout = bcVarD.f7012j;
                int i5 = 88 / 0;
            } else {
                linearLayout = bcVarD.f7012j;
            }
        } else {
            linearLayout = null;
        }
        if (linearLayout == null) {
            int i6 = Y + 79;
            ac = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (z2) {
            int i8 = ac + 3;
            int i9 = i8 % 128;
            Y = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 105;
            ac = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = Y + 45;
            ac = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 3 % 2;
            }
            i3 = 4;
        }
        linearLayout.setVisibility(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0034, code lost:
    
        if (r2.isCancelable() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003b, code lost:
    
        if (r2.isCancelable() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object i(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.i(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showFeedbackId(final ValidationFeedback validationFeedback, final int i2) {
        int i3 = 2 % 2;
        int i4 = ac + 121;
        Y = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(validationFeedback, "");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i6 = ac + 51;
            Y = i6 % 128;
            int i7 = i6 % 2;
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.b(this.f$0, validationFeedback, i2);
                }
            });
            int i8 = Y + 27;
            ac = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        ValidationFeedback validationFeedback = (ValidationFeedback) objArr[0];
        int i2 = 2 % 2;
        int i3 = ac + 27;
        Y = i3 % 128;
        int i4 = i3 % 2;
        if (validationFeedback == ValidationFeedback.f11703h) {
            int i5 = R.color.onboard_sdk_state_success;
            int i6 = ac + 31;
            Y = i6 % 128;
            if (i6 % 2 != 0) {
                return Integer.valueOf(i5);
            }
            throw null;
        }
        return Integer.valueOf(R.color.onboard_sdk_white);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setFeedbackCenterVisible(boolean z2) {
        IncodeTextView incodeTextView;
        int i2;
        int i3 = 2 % 2;
        bc bcVarD = d();
        Object obj = null;
        if (bcVarD != null) {
            int i4 = ac + 109;
            Y = i4 % 128;
            if (i4 % 2 == 0) {
                IncodeTextView incodeTextView2 = bcVarD.Q;
                throw null;
            }
            incodeTextView = bcVarD.Q;
        } else {
            incodeTextView = null;
        }
        if (incodeTextView == null) {
            int i5 = Y + 109;
            ac = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (z2) {
            i2 = 0;
        } else {
            int i6 = ac + 41;
            Y = i6 % 128;
            int i7 = i6 % 2;
            i2 = 4;
        }
        incodeTextView.setVisibility(i2);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setFeedbackBottomVisible(boolean z2) {
        IncodeTextView incodeTextView;
        int i2;
        int i3 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            incodeTextView = bcVarD.R;
            int i4 = ac + 71;
            Y = i4 % 128;
            int i5 = i4 % 2;
        } else {
            incodeTextView = null;
        }
        if (incodeTextView == null) {
            return;
        }
        if (z2) {
            int i6 = Y + 27;
            ac = i6 % 128;
            int i7 = i6 % 2;
            i2 = 0;
        } else {
            i2 = 4;
        }
        incodeTextView.setVisibility(i2);
        int i8 = ac + 51;
        Y = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showFeedbackBottom(int i2) {
        int i3 = 2 % 2;
        int i4 = Y + 87;
        ac = i4 % 128;
        int i5 = i4 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i6 = ac + 73;
            Y = i6 % 128;
            int i7 = i6 % 2;
            aj.e(bcVarD.R);
            bcVarD.R.setText(i2);
            bcVarD.R.setVisibility(0);
        }
    }

    public static final void e(VideoRecordingFragment videoRecordingFragment, boolean z2, boolean z3) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ac + 45;
        Y = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        bc bcVarD = videoRecordingFragment.d();
        if (bcVarD == null) {
            int i6 = ac + 63;
            Y = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 55 / 0;
                return;
            }
            return;
        }
        aj.e(bcVarD.T);
        aj.e(bcVarD.U);
        FrameLayout frameLayout = bcVarD.f7023u;
        if (z2) {
            int i8 = ac + 7;
            Y = i8 % 128;
            int i9 = i8 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        bcVarD.f7025w.setVisibility(z3 ^ true ? 8 : 0);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setFeedbackTopVisible(final boolean z2, final boolean z3) {
        int i2 = 2 % 2;
        int i3 = ac + 123;
        Y = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            int i5 = ac + 117;
            Y = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = Y + 101;
        ac = i7 % 128;
        if (i7 % 2 == 0) {
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.e(this.f$0, z2, z3);
                }
            });
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecordingFragment.e(this.f$0, z2, z3);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void d(UiState uiState, Ref.IntRef intRef, VideoRecordingFragment videoRecordingFragment, IdScan.IdType idType) {
        int i2 = 2 % 2;
        int i3 = Y + 15;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(uiState, "");
        Intrinsics.checkNotNullParameter(intRef, "");
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Intrinsics.checkNotNullParameter(idType, "");
        switch (WhenMappings.f12479a[uiState.ordinal()]) {
            case 1:
                intRef.element = R.drawable.onboard_sdk_video_selfie_id_placeholder_success;
                int i5 = ac + 1;
                Y = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 4;
                }
                break;
            case 2:
                intRef.element = R.drawable.onboard_sdk_video_selfie_id_placeholder_processing_dashed_line;
                break;
            case 3:
                intRef.element = R.drawable.onboard_sdk_video_selfie_id_placeholder_error;
                break;
            case 4:
                intRef.element = R.drawable.onboard_sdk_video_selfie_id_placeholder_error;
                break;
            case 5:
                intRef.element = R.drawable.onboard_sdk_video_selfie_id_placeholder_error;
                break;
            case 6:
                intRef.element = R.drawable.onboard_sdk_video_selfie_id_placeholder;
                int i7 = Y + 47;
                ac = i7 % 128;
                int i8 = i7 % 2;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        View viewE = videoRecordingFragment.e(idType);
        if (viewE != null) {
            viewE.setBackgroundResource(intRef.element);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setIdFrameColor(final IdScan.IdType idType, final UiState uiState, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(uiState, "");
        final Ref.IntRef intRef = new Ref.IntRef();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            int i4 = ac + 89;
            Y = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
                return;
            }
            return;
        }
        int i6 = Y + 99;
        ac = i6 % 128;
        if (i6 % 2 == 0) {
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.d(uiState, intRef, this, idType);
                }
            });
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecordingFragment.d(uiState, intRef, this, idType);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setBackgroundFullscreenOverlayVisible(boolean z2) {
        OverlayWithHoleImageView overlayWithHoleImageView;
        OverlayWithHoleImageView overlayWithHoleImageView2;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null && (overlayWithHoleImageView2 = bcVarD.f7009g) != null) {
            int i3 = ac + 53;
            Y = i3 % 128;
            int i4 = i3 % 2;
            overlayWithHoleImageView2.setMode(OverlayWithHoleImageView.Mode.FULLSCREEN);
        }
        bc bcVarD2 = d();
        if (bcVarD2 != null) {
            overlayWithHoleImageView = bcVarD2.f7009g;
        } else {
            int i5 = Y + 125;
            ac = i5 % 128;
            int i6 = i5 % 2;
            overlayWithHoleImageView = null;
        }
        if (overlayWithHoleImageView == null) {
            int i7 = ac + 15;
            int i8 = i7 % 128;
            Y = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i9 = i8 + 35;
            ac = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i10 = 4;
        if (z2) {
            int i11 = ac + 41;
            int i12 = i11 % 128;
            Y = i12;
            int i13 = i11 % 2 == 0 ? 1 : 0;
            int i14 = i12 + 29;
            ac = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 4 % 4;
            }
            i10 = i13;
        }
        overlayWithHoleImageView.setVisibility(i10);
    }

    private final void c(boolean z2) {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = ac + 19;
            Y = i3 % 128;
            if (i3 % 2 == 0) {
                linearLayout = bcVarD.B;
                int i4 = 44 / 0;
            } else {
                linearLayout = bcVarD.B;
            }
        } else {
            linearLayout = null;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(z2 ? 0 : 8);
        int i5 = Y + 23;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void playWaveformAnimation(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ac + 109;
        Y = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i5 = ac + 87;
            Y = i5 % 128;
            int i6 = i5 % 2;
            if (!z2) {
                bcVarD.Z.c();
            } else {
                bcVarD.Z.b();
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setTapToAnswerButtonText(int i2) {
        IncodeButton incodeButton;
        int i3 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            incodeButton = bcVarD.f7004b;
            int i4 = ac + 125;
            Y = i4 % 128;
            int i5 = i4 % 2;
        } else {
            incodeButton = null;
        }
        if (incodeButton != null) {
            incodeButton.setText(getResources().getString(i2));
            return;
        }
        int i6 = Y + 39;
        ac = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setTapToAnswerLayoutVisible(boolean z2) {
        ConstraintLayout constraintLayout;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = Y + 13;
            ac = i3 % 128;
            int i4 = i3 % 2;
            constraintLayout = bcVarD.f7024v;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            return;
        }
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i5 = 1;
        if (!z2) {
            int i6 = Y + 37;
            ac = i6 % 128;
            int i7 = i6 % 2;
            i5 = 8;
        } else {
            int i8 = ac + 63;
            Y = i8 % 128;
            if (i8 % 2 != 0) {
                i5 = 0;
            }
        }
        constraintLayout2.setVisibility(i5);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setTapToAnswerContentVisible(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = ac + 33;
        Y = i6 % 128;
        int i7 = i6 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i8 = Y + 79;
            ac = i8 % 128;
            int i9 = i8 % 2;
            ConstraintLayout constraintLayout = bcVarD.L;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            ConstraintLayout constraintLayout2 = constraintLayout;
            int i10 = 0;
            int i11 = ac;
            if (z2) {
                int i12 = i11 + 31;
                Y = i12 % 128;
                i2 = i12 % 2 == 0 ? 1 : 0;
            } else {
                int i13 = i11 + 61;
                Y = i13 % 128;
                int i14 = i13 % 2;
                i2 = 8;
            }
            constraintLayout2.setVisibility(i2);
            IncodeTextView incodeTextView = bcVarD.Q;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            IncodeTextView incodeTextView2 = incodeTextView;
            if (!z2) {
                i3 = 8;
            } else {
                int i15 = ac + 73;
                Y = i15 % 128;
                int i16 = i15 % 2;
                i3 = 0;
            }
            incodeTextView2.setVisibility(i3);
            IncodeButton incodeButton = bcVarD.f7004b;
            Intrinsics.checkNotNullExpressionValue(incodeButton, "");
            IncodeButton incodeButton2 = incodeButton;
            if (z2) {
                int i17 = ac + 35;
                Y = i17 % 128;
                int i18 = i17 % 2;
                i4 = 0;
            } else {
                i4 = 8;
            }
            incodeButton2.setVisibility(i4);
            IncodeTextView incodeTextView3 = bcVarD.X;
            Intrinsics.checkNotNullExpressionValue(incodeTextView3, "");
            IncodeTextView incodeTextView4 = incodeTextView3;
            if (z2) {
                int i19 = ac + 103;
                Y = i19 % 128;
                int i20 = i19 % 2;
            } else {
                i10 = 8;
            }
            incodeTextView4.setVisibility(i10);
        }
    }

    public static final void e(VideoRecordingFragment videoRecordingFragment, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        if (videoRecordingFragment.J) {
            int i3 = ac + 21;
            Y = i3 % 128;
            if (i3 % 2 == 0) {
                videoRecordingFragment.g();
                videoRecordingFragment.e(z2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            videoRecordingFragment.g();
            videoRecordingFragment.e(z2);
        } else {
            videoRecordingFragment.c(true);
            videoRecordingFragment.c(R.color.onboard_sdk_colorPrimary);
            videoRecordingFragment.b(R.string.onboard_sdk_video_selfie_tap_when_done, R.drawable.onboard_sdk_ButtonPrimary_Background, R.color.onboard_sdk_white, 0);
            int i4 = ac + 111;
            Y = i4 % 128;
            int i5 = i4 % 2;
        }
        videoRecordingFragment.J = videoRecordingFragment.J ^ true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showQuestion(String str, final boolean z2) {
        int i2 = 2 % 2;
        int i3 = Y + 75;
        ac = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            d(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.e(this.f$0, z2);
                }
            });
            showFeedbackCenter(str);
            Object[] objArr = {bcVarD, Boolean.valueOf(isVisible())};
            int iB = PermissionOnboardingEntryPointKt.b.b();
            int iB2 = PermissionOnboardingEntryPointKt.b.b();
            a(841820945, -841820944, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
            return;
        }
        int i5 = Y + 51;
        ac = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void g() {
        int color;
        int i2;
        int i3 = 2 % 2;
        int i4 = Y + 83;
        ac = i4 % 128;
        if (i4 % 2 != 0) {
            color = ContextCompat.getColor(getContext(), R.color.onboard_sdk_white);
            i2 = 1;
        } else {
            color = ContextCompat.getColor(getContext(), R.color.onboard_sdk_white);
            i2 = 0;
        }
        a(i2, color);
    }

    private final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = Y + 75;
        ac = i4 % 128;
        if (i4 % 2 == 0) {
            a((int) getResources().getDimension(R.dimen.onboard_sdk_video_selfie_tap_to_answer_layout_stroke), ContextCompat.getColor(getContext(), i2));
        } else {
            a((int) getResources().getDimension(R.dimen.onboard_sdk_video_selfie_tap_to_answer_layout_stroke), ContextCompat.getColor(getContext(), i2));
            throw null;
        }
    }

    private final void a(int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        ConstraintLayout constraintLayout = null;
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.onboard_sdk_bg_tap_to_answer_layout, null);
        Intrinsics.checkNotNull(drawable, "");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setStroke(i2, i3);
        bc bcVarD = d();
        if (bcVarD != null) {
            constraintLayout = bcVarD.f7024v;
            i4 = Y + 93;
            ac = i4 % 128;
        } else {
            i4 = ac + 45;
            Y = i4 % 128;
        }
        int i6 = i4 % 2;
        if (constraintLayout != null) {
            constraintLayout.setBackground(gradientDrawable);
            return;
        }
        int i7 = Y + 65;
        ac = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(boolean r17) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.e(boolean):void");
    }

    private final Animator.AnimatorListener o() {
        int i2 = 2 % 2;
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$setupQuestionAnimationListener$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12541b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f12542d = 0;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12541b + 7;
                f12542d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                this.f12543e.getPresenter().onContinueClicked();
                VideoRecordingFragment.access$updateTapToAnswerButton(this.f12543e, R.string.onboard_sdk_video_selfie_tap_to_answer, R.drawable.onboard_sdk_btn_secondary, R.color.onboard_sdk_text_colors_button_secondary, R.drawable.onboard_sdk_ic_tap_to_speak);
                int i6 = f12542d + 61;
                f12541b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 22 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12541b + 41;
                f12542d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                int i6 = f12541b + 111;
                f12542d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 8 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12541b + 49;
                f12542d = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                } else {
                    Intrinsics.checkNotNullParameter(animator, "");
                    int i5 = 19 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12541b + 9;
                f12542d = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                    VideoRecordingFragment.access$getBinding(this.f12543e);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(animator, "");
                bc bcVarAccess$getBinding = VideoRecordingFragment.access$getBinding(this.f12543e);
                LinearLayout linearLayout = bcVarAccess$getBinding != null ? bcVarAccess$getBinding.B : null;
                if (linearLayout != null) {
                    linearLayout.setTranslationX(0.0f);
                    return;
                }
                int i5 = f12541b + 23;
                f12542d = i5 % 128;
                int i6 = i5 % 2;
            }
        };
        int i3 = Y + 19;
        ac = i3 % 128;
        if (i3 % 2 == 0) {
            return animatorListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static ObjectAnimator c(final View view, float f2, final boolean z2) {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f2);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$createTranslationXAnimator$1$1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f12500c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f12501e = 0;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12501e + 81;
                f12500c = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                int i6 = f12500c + 51;
                f12501e = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12500c + 29;
                f12501e = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                } else {
                    Intrinsics.checkNotNullParameter(animator, "");
                    int i5 = 66 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12500c + 85;
                f12501e = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                int i6 = f12501e + 95;
                f12500c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 33 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12501e + 75;
                f12500c = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                if (z2) {
                    view.setVisibility(4);
                }
                int i6 = f12501e + 105;
                f12500c = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "");
        int i3 = ac + 95;
        Y = i3 % 128;
        int i4 = i3 % 2;
        return objectAnimatorOfFloat;
    }

    private static ObjectAnimator b(final View view, float f2, final boolean z2) {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f2);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$createTranslationToStartPosition$1$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12496b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f12497c = 0;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12496b + 73;
                f12497c = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                } else {
                    Intrinsics.checkNotNullParameter(animator, "");
                    throw null;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12497c + 95;
                f12496b = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                } else {
                    Intrinsics.checkNotNullParameter(animator, "");
                    int i5 = 76 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12497c + 37;
                f12496b = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                    return;
                }
                Intrinsics.checkNotNullParameter(animator, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f12496b + 95;
                f12497c = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                if (z2) {
                    view.setVisibility(0);
                    int i6 = f12496b + 45;
                    f12497c = i6 % 128;
                    int i7 = i6 % 2;
                }
                int i8 = f12496b + 121;
                f12497c = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "");
        int i3 = Y + 105;
        ac = i3 % 128;
        if (i3 % 2 == 0) {
            return objectAnimatorOfFloat;
        }
        throw null;
    }

    private final void b(int i2, int i3, int i4, int i5) {
        bc bcVarD;
        int i6 = 2 % 2;
        int i7 = ac + 13;
        Y = i7 % 128;
        if (i7 % 2 == 0) {
            bcVarD = d();
            int i8 = 91 / 0;
            if (bcVarD == null) {
                return;
            }
        } else {
            bcVarD = d();
            if (bcVarD == null) {
                return;
            }
        }
        IncodeButton incodeButton = bcVarD.f7004b;
        if (incodeButton != null) {
            incodeButton.setText(incodeButton.getResources().getString(i2));
            incodeButton.setBackgroundResource(i3);
            incodeButton.setTextColor(ContextCompat.getColorStateList(requireContext(), i4));
            incodeButton.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, 0, 0, 0);
            int i9 = ac + 5;
            Y = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentText(String str) {
        int i2 = 2 % 2;
        int i3 = Y + 63;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.R = str;
        int i5 = Y + 87;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void a(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = Y + 89;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            boolean z2 = videoRecordingFragment.J;
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        if (videoRecordingFragment.J) {
            int i4 = Y + 43;
            ac = i4 % 128;
            int i5 = i4 % 2;
            videoRecordingFragment.N.clear();
            videoRecordingFragment.getPresenter().onTapWhenDoneButtonClicked();
        } else {
            videoRecordingFragment.getPresenter().setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12226d);
            videoRecordingFragment.getPresenter().restartAudioRecording();
            videoRecordingFragment.getPresenter().tagRecordingSegmentROIStart();
            videoRecordingFragment.c(R.color.onboard_sdk_colorPrimary);
            videoRecordingFragment.c(true);
            videoRecordingFragment.l();
            videoRecordingFragment.b(R.string.onboard_sdk_video_selfie_tap_when_done, R.drawable.onboard_sdk_ButtonPrimary_Background, R.color.onboard_sdk_white, 0);
        }
        videoRecordingFragment.J = !videoRecordingFragment.J;
        int i6 = Y + 57;
        ac = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentUiVisible(boolean z2) {
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD == null) {
            int i3 = ac + 107;
            Y = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = 0;
        if (z2) {
            bcVarD.X.setText(R.string.onboard_sdk_video_selfie_say_out_loud);
            d(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.a(this.f$0);
                }
            });
        } else {
            c(false);
            setTapToAnswerContentVisible(false);
            k();
        }
        IncodeTextView incodeTextView = bcVarD.Q;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        IncodeTextView incodeTextView2 = incodeTextView;
        if (z2) {
            int i5 = Y + 79;
            ac = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i4 = 8;
        }
        incodeTextView2.setVisibility(i4);
        Object[] objArr = {bcVarD, Boolean.valueOf(z2)};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(841820945, -841820944, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentFaceRecognitionUiVisible(boolean z2) {
        LinearLayout linearLayout;
        int i2;
        int i3 = 2 % 2;
        int i4 = Y + 89;
        ac = i4 % 128;
        int i5 = i4 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i6 = Y + 111;
            ac = i6 % 128;
            int i7 = i6 % 2;
            linearLayout = bcVarD.A;
        } else {
            linearLayout = null;
        }
        if (linearLayout == null) {
            return;
        }
        LinearLayout linearLayout2 = linearLayout;
        if (z2) {
            int i8 = Y + 81;
            ac = i8 % 128;
            int i9 = i8 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0018 A[PHI: r1
  0x0018: PHI (r1v5 com.incode.welcome_sdk.d.bc) = (r1v2 com.incode.welcome_sdk.d.bc), (r1v6 com.incode.welcome_sdk.d.bc) binds: [B:31:0x0021, B:26:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0024  */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setVoiceConsentPlaceholderFaceVisible(boolean r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L1d
            com.incode.welcome_sdk.d.bc r1 = r5.d()
            r0 = 79
            int r0 = r0 / r3
            if (r1 == 0) goto L24
        L18:
            android.widget.ImageView r2 = r1.G
        L1a:
            if (r2 != 0) goto L26
            return
        L1d:
            com.incode.welcome_sdk.d.bc r1 = r5.d()
            if (r1 == 0) goto L24
            goto L18
        L24:
            r2 = 0
            goto L1a
        L26:
            android.view.View r2 = (android.view.View) r2
            if (r6 == 0) goto L3b
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L37
            r0 = 4
            int r0 = r0 % r4
        L37:
            r2.setVisibility(r3)
            return
        L3b:
            r3 = 8
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.setVoiceConsentPlaceholderFaceVisible(boolean):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentFaceMatchErrorUiState() {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            linearLayout = bcVarD.C;
        } else {
            int i3 = ac + 51;
            Y = i3 % 128;
            int i4 = i3 % 2;
            linearLayout = null;
        }
        if (linearLayout == null) {
            int i5 = ac + 75;
            Y = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } else {
            linearLayout.setVisibility(0);
        }
        bc bcVarD2 = d();
        ImageView imageView = bcVarD2 != null ? bcVarD2.f7022t : null;
        if (imageView == null) {
            int i6 = Y + 9;
            ac = i6 % 128;
            int i7 = i6 % 2;
        } else {
            imageView.setVisibility(0);
        }
        setVoiceConsentUiVisible(false);
        setFeedbackCenterVisible(false);
        c(R.color.onboard_sdk_state_destructive);
    }

    static final class g extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12514a = 1;

        /* JADX INFO: renamed from: b */
        private static int f12515b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f12514a + 45;
            f12515b = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 92 / 0;
            }
            int i6 = f12514a + 17;
            f12515b = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d() {
            int i2 = 2 % 2;
            int i3 = f12514a + 69;
            f12515b = i3 % 128;
            if (i3 % 2 == 0) {
                VideoRecordingFragment.this.getPresenter().setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12223a);
            } else {
                VideoRecordingFragment.this.getPresenter().setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12223a);
                throw null;
            }
        }

        g() {
            super(1);
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = Y + 69;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = Y + 1;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentRetryFaceRecognitionUiState() {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        getPresenter().setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12227e);
        this.J = false;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = ac + 19;
            Y = i3 % 128;
            int i4 = i3 % 2;
            linearLayout = bcVarD.C;
            int i5 = Y + 81;
            ac = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 4;
            }
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        bc bcVarD2 = d();
        ImageView imageView = bcVarD2 != null ? bcVarD2.f7022t : null;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        setVoiceConsentFaceRecognitionUiVisible(true);
        setVoiceConsentPlaceholderFaceVisible(true);
        setVoiceConsentCameraOverlay(true, null);
        g();
        b(R.string.onboard_sdk_video_selfie_tap_to_speak, R.drawable.onboard_sdk_btn_secondary, R.color.onboard_sdk_text_colors_button_secondary, R.drawable.onboard_sdk_ic_tap_to_speak);
        setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_video_selfie_center_face_in_frame);
        CompositeDisposable compositeDisposable = this.I;
        Single<Long> singleObserveOn = Single.timer(1500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final g gVar = new g();
        compositeDisposable.add(singleObserveOn.subscribe(new io.reactivex.functions.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda20
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoRecordingFragment.b(gVar, obj);
            }
        }));
    }

    public static final void e(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = Y + 25;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            videoRecordingFragment.setTapToAnswerLayoutVisible(false);
        } else {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            videoRecordingFragment.setTapToAnswerLayoutVisible(true);
        }
        videoRecordingFragment.setVoiceConsentFaceRecognitionUiVisible(true);
        int i4 = Y + 41;
        ac = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void restartVoiceConsentUiOnStart() {
        int i2 = 2 % 2;
        bc bcVarD = d();
        ImageView imageView = null;
        LinearLayout linearLayout = bcVarD != null ? bcVarD.C : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        bc bcVarD2 = d();
        if (bcVarD2 != null) {
            int i3 = ac + 71;
            Y = i3 % 128;
            int i4 = i3 % 2;
            imageView = bcVarD2.f7022t;
        } else {
            int i5 = ac + 1;
            Y = i5 % 128;
            int i6 = i5 % 2;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        setVoiceConsentUiVisible(false);
        setVoiceConsentPlaceholderFaceVisible(true);
        setVoiceConsentCameraOverlay(true, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecordingFragment.e(this.f$0);
            }
        });
        g();
        b(R.string.onboard_sdk_video_selfie_tap_to_speak, R.drawable.onboard_sdk_btn_secondary, R.color.onboard_sdk_text_colors_button_secondary, R.drawable.onboard_sdk_ic_tap_to_speak);
        setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_video_selfie_center_face_in_frame);
        m();
        this.J = false;
    }

    /* synthetic */ class j implements Consumer, FunctionAdapter {

        /* JADX INFO: renamed from: c */
        private static int f12527c = 1;

        /* JADX INFO: renamed from: d */
        private static int f12528d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ VideoRecordingPresenter f12529e;

        private void b(float f2) {
            int i2 = 2 % 2;
            int i3 = f12527c + 27;
            f12528d = i3 % 128;
            int i4 = i3 % 2;
            this.f12529e.setMinFaceWidth(f2);
            int i5 = f12527c + 109;
            f12528d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.core.util.Consumer
        public final /* synthetic */ void accept(Object obj) {
            int i2 = 2 % 2;
            int i3 = f12527c + 17;
            f12528d = i3 % 128;
            int i4 = i3 % 2;
            b(((Number) obj).floatValue());
            if (i4 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f12527c + 111;
            f12528d = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i4 != 0) {
                int i5 = 37 / 0;
            }
            return iHashCode;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0018, code lost:
        
            if ((r6 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x001a, code lost:
        
            r2 = kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r6).getFunctionDelegate());
            r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.f12528d + 113;
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.f12527c = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
        
            if ((r1 % 2) != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
        
            r0 = 88 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
        
            if ((r6 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                boolean r0 = r6 instanceof androidx.core.util.Consumer
                r3 = 0
                if (r0 == 0) goto L3c
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.f12527c
                int r1 = r0 + 115
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.f12528d = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L37
                boolean r1 = r6 instanceof kotlin.jvm.internal.FunctionAdapter
                r0 = 30
                int r0 = r0 / r3
                if (r1 == 0) goto L3c
            L1a:
                kotlin.Function r1 = r5.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r6 = (kotlin.jvm.internal.FunctionAdapter) r6
                kotlin.Function r0 = r6.getFunctionDelegate()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.f12528d
                int r1 = r0 + 113
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.f12527c = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L36
                r0 = 88
                int r0 = r0 / r3
            L36:
                return r2
            L37:
                boolean r0 = r6 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r0 == 0) goto L3c
                goto L1a
            L3c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j.equals(java.lang.Object):boolean");
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            int i2 = 2 % 2;
            FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(1, this.f12529e, VideoRecordingPresenter.class, "setMinFaceWidth", "setMinFaceWidth(F)V", 0);
            int i3 = f12528d + 79;
            f12527c = i3 % 128;
            if (i3 % 2 != 0) {
                return functionReferenceImpl;
            }
            throw null;
        }

        j(VideoRecordingPresenter videoRecordingPresenter) {
            this.f12529e = videoRecordingPresenter;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0020, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0022, code lost:
    
        com.incode.welcome_sdk.commons.utils.e.b(r5.G, r3, new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.j(r6.getPresenter()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r7 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r7.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac + 45;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if ((r1 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r0 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.incode.welcome_sdk.d.bc r5, com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r6, java.lang.Runnable r7) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r4
            r2 = 0
            java.lang.String r0 = ""
            if (r1 == 0) goto L3a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.widget.ImageView r0 = r5.G
            r0.setVisibility(r2)
            com.incode.welcome_sdk.ui.camera.CameraPreview r3 = r6.getMPreview()
            if (r3 == 0) goto L4c
        L22:
            android.widget.ImageView r2 = r5.G
            android.view.View r2 = (android.view.View) r2
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r1 = r6.getPresenter()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$j r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$j
            r0.<init>(r1)
            androidx.core.util.Consumer r0 = (androidx.core.util.Consumer) r0
            com.incode.welcome_sdk.commons.utils.e.b(r2, r3, r0)
            if (r7 == 0) goto L39
            r7.run()
        L39:
            return
        L3a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.widget.ImageView r0 = r5.G
            r0.setVisibility(r2)
            com.incode.welcome_sdk.ui.camera.CameraPreview r3 = r6.getMPreview()
            if (r3 == 0) goto L4c
            goto L22
        L4c:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L5a
            r0 = 85
            int r0 = r0 / r2
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.c(com.incode.welcome_sdk.d.bc, com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment, java.lang.Runnable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView r3, java.lang.Runnable r4, com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r5) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r2
            java.lang.String r0 = ""
            if (r1 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.setVisibility(r2)
            r3.a()
            if (r4 == 0) goto L35
        L1e:
            r4.run()
        L21:
            r0 = 0
            r5.C = r0
            return
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 4
            r3.setVisibility(r0)
            r3.a()
            if (r4 == 0) goto L35
            goto L1e
        L35:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.d(com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView, java.lang.Runnable, com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentCameraOverlay(boolean z2, final Runnable runnable) {
        final OverlayWithHoleImageView overlayWithHoleImageView;
        int i2 = 2 % 2;
        final bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = Y + 25;
            ac = i3 % 128;
            int i4 = i3 % 2;
            ViewGroup.LayoutParams layoutParams = bcVarD.f7008f.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            float f2 = ((ConstraintLayout.LayoutParams) layoutParams).verticalBias;
            if (!z2) {
                bcVarD.f7017o.setVisibility(4);
                bcVarD.G.setVisibility(4);
                bc bcVarD2 = d();
                if (bcVarD2 == null || (overlayWithHoleImageView = bcVarD2.f7009g) == null) {
                    return;
                }
                int i5 = Y + 17;
                ac = i5 % 128;
                int i6 = i5 % 2;
                overlayWithHoleImageView.d();
                overlayWithHoleImageView.e(ContextCompat.getColor(overlayWithHoleImageView.getContext(), android.R.color.transparent), new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRecordingFragment.d(overlayWithHoleImageView, runnable, this);
                    }
                });
                return;
            }
            bcVarD.f7009g.setMode(OverlayWithHoleImageView.Mode.CIRCLE);
            if (!(!(getPresenter().getPreviousStep() instanceof Questions))) {
                bcVarD.f7009g.setCircleDiameter(getResources().getDimension(R.dimen.onboard_sdk_video_selfie_circle_camera_diameter));
                bcVarD.f7009g.invalidate();
            } else {
                int i7 = ac + 121;
                Y = i7 % 128;
                if (i7 % 2 == 0) {
                    bcVarD.f7009g.c();
                    int i8 = 78 / 0;
                } else {
                    bcVarD.f7009g.c();
                }
            }
            bcVarD.f7017o.setVisibility(0);
            bcVarD.f7009g.setVisibility(0);
            OverlayWithHoleImageView overlayWithHoleImageView2 = bcVarD.f7009g;
            Context context = this.E;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                context = null;
            }
            overlayWithHoleImageView2.e(ContextCompat.getColor(context, R.color.onboard_sdk_video_selfie_camera_overlay), new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.c(bcVarD, this, runnable);
                }
            });
            FacePositionConstraint facePositionConstraint = new FacePositionConstraint(bcVarD.f7008f.getLeft(), bcVarD.f7008f.getTop(), bcVarD.f7008f.getRight(), bcVarD.f7008f.getBottom());
            facePositionConstraint.scaleWithVerticalBias(1.0f, f2);
            facePositionConstraint.scaleFromOrigin(this.G);
            this.C = facePositionConstraint;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment r6, com.incode.welcome_sdk.ui.camera.video_selfie.UiState r7, int r8) {
        /*
            r5 = 2
            int r0 = r5 % r5
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.incode.welcome_sdk.d.bc r4 = r6.d()
            if (r4 == 0) goto L6a
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r5
            r3 = 0
            if (r1 != 0) goto L29
            r0 = 26
            int r0 = r0 / r3
            if (r7 != 0) goto L2c
        L1f:
            r2 = -1
        L20:
            r0 = 6
            if (r2 != r0) goto L43
            com.incode.welcome_sdk.views.IncodeTextView r0 = r4.ac
            r0.setText(r8)
            return
        L29:
            if (r7 != 0) goto L2c
            goto L1f
        L2c:
            int[] r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.WhenMappings.f12479a
            int r0 = r7.ordinal()
            r2 = r1[r0]
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L20
            r0 = 3
            int r0 = r0 / 4
            goto L20
        L43:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Voice consent UI State: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r7)
            java.lang.String r1 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.d(r1, r0)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L65
            return
        L65:
            r0 = 0
            r0.hashCode()
            throw r0
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.d(com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment, com.incode.welcome_sdk.ui.camera.video_selfie.UiState, int):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentFaceRecognitionUiState(final UiState uiState, final int i2) {
        int i3 = 2 % 2;
        int i4 = Y + 57;
        ac = i4 % 128;
        int i5 = i4 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i6 = Y + 53;
            ac = i6 % 128;
            int i7 = i6 % 2;
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.d(this.f$0, uiState, i2);
                }
            });
        }
    }

    public static final void c(VideoRecordingFragment videoRecordingFragment, DialogInterface dialogInterface) {
        int i2 = 2 % 2;
        int i3 = Y + 23;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        videoRecordingFragment.O = null;
        int i5 = ac + 21;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void h(final VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        videoRecordingFragment.getPresenter().setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12227e);
        VoiceConsentDialog.Companion companion = VoiceConsentDialog.f12211d;
        String str = videoRecordingFragment.R;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        VoiceConsentDialog voiceConsentDialogNewInstance = companion.newInstance(str);
        voiceConsentDialogNewInstance.setVoiceConsentDialogListener(videoRecordingFragment);
        Dialog dialog = voiceConsentDialogNewInstance.getDialog();
        if (dialog != null) {
            int i3 = Y + 81;
            ac = i3 % 128;
            int i4 = i3 % 2;
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    VideoRecordingFragment.c(this.f$0, dialogInterface);
                }
            });
        } else {
            int i5 = ac + 69;
            Y = i5 % 128;
            int i6 = i5 % 2;
        }
        videoRecordingFragment.O = voiceConsentDialogNewInstance;
        if (voiceConsentDialogNewInstance != null) {
            voiceConsentDialogNewInstance.show(videoRecordingFragment.getChildFragmentManager(), "VoiceConsentDialog");
        }
    }

    private final void l() {
        int i2 = 2 % 2;
        int i3 = ac + 69;
        Y = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.N.add(Completable.timer(10L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda30
                @Override // io.reactivex.functions.Action
                public final void run() {
                    VideoRecordingFragment.h(this.f$0);
                }
            }).subscribe());
            throw null;
        }
        this.N.add(Completable.timer(10L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda30
            @Override // io.reactivex.functions.Action
            public final void run() {
                VideoRecordingFragment.h(this.f$0);
            }
        }).subscribe());
        int i4 = ac + 7;
        Y = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void m() {
        VoiceConsentDialog voiceConsentDialog;
        boolean zIsShowing;
        int i2 = 2 % 2;
        int i3 = Y;
        int i4 = i3 + 43;
        ac = i4 % 128;
        int i5 = i4 % 2;
        VoiceConsentDialog voiceConsentDialog2 = this.O;
        boolean z2 = false;
        if (voiceConsentDialog2 != null) {
            int i6 = i3 + 15;
            ac = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                voiceConsentDialog2.getDialog();
                throw null;
            }
            if (voiceConsentDialog2.getDialog() != null) {
                int i7 = Y + 71;
                ac = i7 % 128;
                if (i7 % 2 != 0) {
                    voiceConsentDialog2.isRemoving();
                    obj.hashCode();
                    throw null;
                }
                if (!voiceConsentDialog2.isRemoving()) {
                    Dialog dialog = voiceConsentDialog2.getDialog();
                    if (dialog != null) {
                        int i8 = Y + 71;
                        ac = i8 % 128;
                        if (!(i8 % 2 == 0)) {
                            dialog.isShowing();
                            obj.hashCode();
                            throw null;
                        }
                        zIsShowing = dialog.isShowing();
                    } else {
                        zIsShowing = false;
                    }
                    if (zIsShowing) {
                        z2 = true;
                    }
                }
            }
        }
        if ((!z2) || (voiceConsentDialog = this.O) == null) {
            return;
        }
        voiceConsentDialog.dismiss();
    }

    private final void k() {
        int i2 = 2 % 2;
        int i3 = Y + 97;
        ac = i3 % 128;
        int i4 = i3 % 2;
        this.N.clear();
        int i5 = Y + 35;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentDialogListener
    public final void onVoiceConsentDialogDoneButtonClick() {
        int i2 = 2 % 2;
        int i3 = ac + 85;
        Y = i3 % 128;
        int i4 = i3 % 2;
        g();
        n();
        this.J = false;
        int i5 = Y + 1;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentDialogListener
    public final void onVoiceConsentDialogTryAgainButtonClick() {
        int i2 = 2 % 2;
        g();
        c(false);
        b(R.string.onboard_sdk_video_selfie_tap_to_speak, R.drawable.onboard_sdk_btn_secondary, R.color.onboard_sdk_text_colors_button_secondary, R.drawable.onboard_sdk_ic_tap_to_speak);
        if (this.f12473u) {
            int i3 = Y + 71;
            ac = i3 % 128;
            int i4 = i3 % 2;
            setTapToAnswerContentVisible(false);
            int i5 = Y + 27;
            ac = i5 % 128;
            int i6 = i5 % 2;
        }
        this.J = false;
        getPresenter().onVoiceConsentDialogTryAgain();
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void continueWithVoiceConsentAnswerProcess() {
        int i2 = 2 % 2;
        int i3 = Y + 21;
        ac = i3 % 128;
        int i4 = i3 % 2;
        g();
        n();
        int i5 = Y + 93;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void n() {
        int i2 = 2 % 2;
        int i3 = Y + 89;
        ac = i3 % 128;
        int i4 = i3 % 2;
        c(false);
        setVoiceConsentUiVisible(false);
        setTapToAnswerContentVisible(false);
        showProcessingUi();
        getPresenter().onVoiceConsentContinueClicked();
        int i5 = Y + 103;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setTapToAnswerResultVisible(boolean z2) {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = ac + 121;
            Y = i3 % 128;
            int i4 = i3 % 2;
            linearLayout = bcVarD.D;
            int i5 = ac + 47;
            Y = i5 % 128;
            int i6 = i5 % 2;
        } else {
            linearLayout = null;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(!z2 ? 8 : 0);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void setVoiceConsentUiDone(boolean z2) {
        int i2 = 2 % 2;
        int i3 = Y + 43;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!z2)) {
            hideProcessingUI();
            setTapToAnswerResultVisible(true);
            d(R.string.onboard_sdk_video_selfie_voice_consent_success, R.drawable.onboard_sdk_ic_capture_success);
            int i4 = ac + 115;
            Y = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void d(int i2, int i3) {
        bc bcVarD;
        int i4 = 2 % 2;
        int i5 = ac + 75;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            bcVarD = d();
            int i6 = 41 / 0;
            if (bcVarD == null) {
                return;
            }
        } else {
            bcVarD = d();
            if (bcVarD == null) {
                return;
            }
        }
        int i7 = ac + 31;
        Y = i7 % 128;
        if (i7 % 2 != 0) {
            bcVarD.ab.setText(getResources().getString(i2));
            bcVarD.f7026x.setBackgroundResource(i3);
        } else {
            bcVarD.ab.setText(getResources().getString(i2));
            bcVarD.f7026x.setBackgroundResource(i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void done() {
        int i2 = 2 % 2;
        int i3 = Y + 105;
        ac = i3 % 128;
        if (i3 % 2 == 0) {
            if (IncodeWelcome.Companion.getInstance().isCaptureOnlyMode()) {
                c(new VideoSelfieResult(ResultCode.SUCCESS, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
                int i4 = Y + 61;
                ac = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            b(this);
            return;
        }
        IncodeWelcome.Companion.getInstance().isCaptureOnlyMode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void onVoiceConsentTotalFailure(Throwable th) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        setVoiceConsentUiDone(false);
        e(new VideoSelfieResult(ResultCode.ERROR, th, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        int i3 = ac + 107;
        Y = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showTextToSpeechInstructions() {
        int i2 = 2 % 2;
        int i3 = Y + 117;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            hideProcessingUI();
            int iB = PermissionOnboardingEntryPointKt.b.b();
            int iB2 = PermissionOnboardingEntryPointKt.b.b();
            a(-2014391259, 2014391267, new Object[]{this, true}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
            return;
        }
        hideProcessingUI();
        int iB3 = PermissionOnboardingEntryPointKt.b.b();
        int iB4 = PermissionOnboardingEntryPointKt.b.b();
        a(-2014391259, 2014391267, new Object[]{this, true}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB4, iB3);
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12483c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12484d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12483c + 49;
            f12484d = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12483c + 99;
            f12484d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            VideoRecordingFragment.access$checkPermissions(VideoRecordingFragment.this, new VideoSelfieResult(ResultCode.ERROR, th, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            int i3 = f12483c + 65;
            f12484d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 57 / 0;
            }
        }

        a() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12507c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12508d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Throwable f12509b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f12507c + 69;
            f12508d = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f12507c + 35;
            f12508d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            VideoRecordingFragment.access$checkPermissions(VideoRecordingFragment.this, new VideoSelfieResult(ResultCode.ERROR, this.f12509b, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            int i3 = f12508d + 51;
            f12507c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 20 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Throwable th) {
            super(1);
            this.f12509b = th;
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = Y + 23;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = Y + 77;
        ac = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = ac + 109;
        Y = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = Y + 77;
        ac = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void onError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = Y + 61;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            ThrowableExtensionsKt.isNoConnectivityException(th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
            return;
        }
        CompositeDisposable compositeDisposable = this.I;
        Observable<Long> observableObserveOn = Observable.timer(200L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final e eVar = new e(th);
        io.reactivex.functions.Consumer<? super Long> consumer = new io.reactivex.functions.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VideoRecordingFragment.e(eVar, obj2);
            }
        };
        final a aVar = new a();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new io.reactivex.functions.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VideoRecordingFragment.a(aVar, obj2);
            }
        }));
        int i4 = Y + 29;
        ac = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showAllDone() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = Y + 9;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            hideProcessingUI();
            z2 = false;
        } else {
            hideProcessingUI();
            z2 = true;
        }
        setTapToAnswerLayoutVisible(z2);
        setTapToAnswerResultVisible(z2);
        d(R.string.onboard_sdk_video_selfie_voice_consent_success, R.drawable.onboard_sdk_ic_capture_success);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0015, code lost:
    
        if (r7.M != true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001b, code lost:
    
        if (q() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001d, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac + 111;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
    
        if ((r1 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        super.checkCameraPermissions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002f, code lost:
    
        if ((!r7.M) != true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0031, code lost:
    
        super.checkCameraPermissions();
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y + 31;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003e, code lost:
    
        super.checkCameraPermissions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        r6 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b();
        a(-1863581788, 1863581795, new java.lang.Object[]{r7}, com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b(), com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b(), com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void checkCameraPermissions() throws java.lang.Throwable {
        /*
            r7 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r3
            r2 = 1
            if (r1 != 0) goto L2c
            boolean r1 = r7.M
            r0 = 38
            int r0 = r0 / 0
            if (r1 == r2) goto L31
        L17:
            boolean r0 = r7.q()
            if (r0 == 0) goto L43
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L3e
            super.checkCameraPermissions()
            return
        L2c:
            boolean r0 = r7.M
            r0 = r0 ^ r2
            if (r0 == r2) goto L17
        L31:
            super.checkCameraPermissions()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r3
            return
        L3e:
            super.checkCameraPermissions()
            r0 = 0
            throw r0
        L43:
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            int r6 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b()
            int r5 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b()
            int r4 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b()
            int r3 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.b.b()
            r1 = 1863581795(0x6f140063, float:4.580425E28)
            r0 = -1863581788(0xffffffff90ebffa4, float:-9.3085033E-29)
            a(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.checkCameraPermissions():void");
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f12504b = 1;

        /* JADX INFO: renamed from: c */
        private static int f12505c = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f12505c + 53;
            f12504b = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c() {
            int i2 = 2 % 2;
            VideoRecordingFragment.this.onError(new ScreenRecordingPermissionDeniedException());
            int i3 = f12505c + 35;
            f12504b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
            }
        }

        d() {
            super(0);
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12486c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12487d = 1;

        private void b() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12486c + 67;
            f12487d = i3 % 128;
            int i4 = i3 % 2;
            ((VideoRecordingFragment) this.receiver).askForPermissions();
            int i5 = f12487d + 21;
            f12486c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12487d + 31;
            f12486c = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b(Object obj) {
            super(0, obj, VideoRecordingFragment.class, "askForPermissions", "askForPermissions()V", 0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public final void onVideoRecordingPermissionDenied() {
        int i2 = 2 % 2;
        d(new d(), new b(this));
        int i3 = Y + 37;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = ac + 121;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
        int i5 = Y + 51;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return null;
    }

    public static final void e(Function0 function0, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = ac + 111;
        Y = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            function0.invoke();
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            function0.invoke();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void d(final Function0<Unit> function0, final Function0<Unit> function02) {
        int i2 = 2 % 2;
        int i3 = Y + 105;
        ac = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "");
        ((BaseActivity) activity).handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                VideoRecordingFragment.b(function0, dialogInterface, i5);
            }
        }, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                VideoRecordingFragment.e(function02, dialogInterface, i5);
            }
        });
        int i5 = Y + 7;
        ac = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment
    public final String getVideoRecordingFileName() throws Throwable {
        int i2 = 2 % 2;
        int i3 = ac + 89;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        ab(1115752551 - (KeyEvent.getMaxKeyCode() >> 16), (byte) ((Process.myPid() >> 22) - 83), (short) Color.red(0), (-1810923897) + (ViewConfiguration.getScrollBarSize() >> 8), Color.rgb(0, 0, 0) + 16777116, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = ac + 71;
        Y = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void onCompletedConcatAudioVideo(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = Y + 7;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfieResult, "");
            getListener().onFinishConcatAudioVideo(videoSelfieResult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoSelfieResult, "");
        getListener().onFinishConcatAudioVideo(videoSelfieResult);
        int i4 = ac + 117;
        Y = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showFeedbackCenter(String str) {
        int i2 = 2 % 2;
        int i3 = ac + 67;
        Y = i3 % 128;
        int i4 = i3 % 2;
        showFeedbackCenter(str, R.color.onboard_sdk_TextColorDefault);
        int i5 = ac + 83;
        Y = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showCircleCameraOutline() {
        ImageView imageView;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = Y + 89;
            ac = i3 % 128;
            int i4 = i3 % 2;
            imageView = bcVarD.f7018p;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            return;
        }
        int i5 = Y + 67;
        ac = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void i(VideoRecordingFragment videoRecordingFragment) {
        ImageView imageView;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        bc bcVarD = videoRecordingFragment.d();
        Object obj = null;
        if (bcVarD != null) {
            int i3 = Y + 43;
            ac = i3 % 128;
            int i4 = i3 % 2;
            imageView = bcVarD.f7018p;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(4);
            return;
        }
        int i5 = Y + 43;
        ac = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void hideCircleCameraOutline() {
        int i2 = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = Y + 1;
            ac = i3 % 128;
            int i4 = i3 % 2;
            activity.runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.i(this.f$0);
                }
            });
            int i5 = ac + 107;
            Y = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void showFeedbackCenter(String str, int i2) {
        int i3 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i4 = Y + 59;
            ac = i4 % 128;
            if (i4 % 2 != 0) {
                IncodeTextView incodeTextView = bcVarD.Q;
                throw null;
            }
            IncodeTextView incodeTextView2 = bcVarD.Q;
            if (incodeTextView2 != null) {
                incodeTextView2.setMaxLines(3);
                incodeTextView2.setMovementMethod(new ScrollingMovementMethod());
                TextViewCompat.setAutoSizeTextTypeWithDefaults(incodeTextView2, 0);
                incodeTextView2.setText(str);
                incodeTextView2.setTextColor(ContextCompat.getColor(incodeTextView2.getContext(), i2));
                incodeTextView2.setVisibility(0);
                int i5 = ac + 113;
                Y = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private static final void b(VideoRecordingFragment videoRecordingFragment, View view) {
        int i2 = 2 % 2;
        int i3 = Y + 25;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
            int iB = PermissionOnboardingEntryPointKt.b.b();
            int iB2 = PermissionOnboardingEntryPointKt.b.b();
            a(-59539310, 59539321, new Object[]{videoRecordingFragment}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        Object[] objArr = {videoRecordingFragment};
        int iB3 = PermissionOnboardingEntryPointKt.b.b();
        int iB4 = PermissionOnboardingEntryPointKt.b.b();
        a(-59539310, 59539321, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB4, iB3);
        int i4 = Y + 49;
        ac = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12511a = 1;

        /* JADX INFO: renamed from: c */
        private static int f12512c = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f12512c + 65;
            f12511a = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f12512c + 1;
            f12511a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a() {
            int i2 = 2 % 2;
            VideoRecordingFragment.this.onError(new MicrophonePermissionDeniedException());
            int i3 = f12511a + 111;
            f12512c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 67 / 0;
            }
        }

        f() {
            super(0);
        }
    }

    /* synthetic */ class h extends FunctionReferenceImpl implements Function0<Unit> {

        /* JADX INFO: renamed from: d */
        private static int f12522d = 0;

        /* JADX INFO: renamed from: e */
        private static int f12523e = 1;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f12523e + 3;
            f12522d = i3 % 128;
            int i4 = i3 % 2;
            VideoRecordingFragment.access$showAudioPermissionRationale((VideoRecordingFragment) this.receiver);
            int i5 = f12523e + 77;
            f12522d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f12522d + 81;
            f12523e = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            int i5 = f12522d + 109;
            f12523e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        h(Object obj) {
            super(0, obj, VideoRecordingFragment.class, "showAudioPermissionRationale", "showAudioPermissionRationale()V", 0);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        VideoRecordingFragment videoRecordingFragment = (VideoRecordingFragment) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        videoRecordingFragment.d(videoRecordingFragment.new f(), new h(videoRecordingFragment));
        int i3 = Y + 103;
        ac = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void p() {
        bc bcVarD;
        int i2 = 2 % 2;
        int i3 = Y + 45;
        ac = i3 % 128;
        if (i3 % 2 != 0) {
            bcVarD = d();
            int i4 = 97 / 0;
            if (bcVarD == null) {
                return;
            }
        } else {
            bcVarD = d();
            if (bcVarD == null) {
                return;
            }
        }
        int i5 = ac + 101;
        Y = i5 % 128;
        int i6 = i5 % 2;
        bcVarD.f7010h.setVisibility(0);
        bcVarD.f7003a.setPaintFlags(bcVarD.f7003a.getPaintFlags() | 8);
        bcVarD.f7005c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecordingFragment.m8404instrumented$0$p$V(this.f$0, view);
            }
        });
        bcVarD.f7003a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecordingFragment.m8406instrumented$1$p$V(this.f$0, view);
            }
        });
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        VideoRecordingFragment videoRecordingFragment = (VideoRecordingFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = ac + 125;
        Y = i3 % 128;
        if (i3 % 2 != 0) {
            AudioPermissionMandatoryDialog.f16873c.newInstance().show(videoRecordingFragment.getChildFragmentManager(), "AudioPermissionMandatory");
            return null;
        }
        AudioPermissionMandatoryDialog.f16873c.newInstance().show(videoRecordingFragment.getChildFragmentManager(), "AudioPermissionMandatory");
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment, com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        int i3 = Y + 19;
        ac = i3 % 128;
        int i4 = i3 % 2;
        super.onBtnOpenSettingsClicked();
        bc bcVarD = d();
        PermissionsMandatoryContract.View view = null;
        Group group = bcVarD != null ? bcVarD.f7010h : null;
        if (group == null) {
            int i5 = ac + 89;
            Y = i5 % 128;
            if (i5 % 2 == 0) {
                view.hashCode();
                throw null;
            }
        } else {
            group.setVisibility(8);
        }
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof PermissionsMandatoryContract.View) {
            int i6 = Y + 25;
            ac = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            view = (PermissionsMandatoryContract.View) activity;
        }
        if (view != null) {
            view.onBtnOpenSettingsClicked();
        }
    }

    private final void t() {
        int i2 = 2 % 2;
        int i3 = ac + 83;
        Y = i3 % 128;
        if (i3 % 2 != 0) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                int i4 = Y + 59;
                ac = i4 % 128;
                int i5 = i4 % 2;
                Window window = activity.getWindow();
                if (window != null) {
                    int i6 = ac + 115;
                    Y = i6 % 128;
                    int i7 = i6 % 2;
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    Intrinsics.checkNotNullExpressionValue(attributes, "");
                    attributes.screenBrightness = 1.0f;
                    window.setAttributes(attributes);
                    return;
                }
                return;
            }
            return;
        }
        getActivity();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean q() {
        int i2 = 2 % 2;
        int i3 = ac + 113;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.E;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = ac + 63;
            Y = i5 % 128;
            int i6 = i5 % 2;
            context = null;
        }
        if (ContextCompat.checkSelfPermission(context, this.K) == 0) {
            return true;
        }
        int i7 = ac + 109;
        Y = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private final void d(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = Y + 97;
        int i4 = i3 % 128;
        ac = i4;
        int i5 = i3 % 2;
        this.F = runnable;
        int i6 = i4 + 63;
        Y = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ void b(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = Y + 71;
        ac = i3 % 128;
        int i4 = i3 % 2;
        videoRecordingFragment.c((VideoSelfieResult) null);
        int i5 = ac + 89;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    private final void c(VideoSelfieResult videoSelfieResult) {
        Throwable th;
        int i2 = 2 % 2;
        getPresenter().onDestroy();
        getListener().onFinishUsingCamera(videoSelfieResult);
        if (IncodeWelcome.Companion.getInstance().isCaptureOnlyMode()) {
            int i3 = ac;
            int i4 = i3 + 67;
            Y = i4 % 128;
            int i5 = i4 % 2;
            if (videoSelfieResult != null) {
                int i6 = i3 + 95;
                Y = i6 % 128;
                int i7 = i6 % 2;
                th = videoSelfieResult.error;
                int i8 = Y + 95;
                ac = i8 % 128;
                int i9 = i8 % 2;
            } else {
                th = null;
            }
            if (th != null) {
                getPresenter().proceedOnError(videoSelfieResult);
                return;
            }
            int i10 = Y + 101;
            ac = i10 % 128;
            if (i10 % 2 == 0) {
                getPresenter().concatAudioVideo(videoSelfieResult);
            } else {
                getPresenter().concatAudioVideo(videoSelfieResult);
                int i11 = 50 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if ((!r12.M) != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        if (r12.M != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(com.incode.welcome_sdk.results.VideoSelfieResult r13) {
        /*
            r12 = this;
            r2 = 2
            int r0 = r2 % r2
            java.lang.Throwable r0 = r13.error
            boolean r0 = r0 instanceof com.incode.welcome_sdk.commons.exceptions.video_selfie.ScreenRecordingPermissionDeniedException
            if (r0 != 0) goto L1e
            boolean r0 = r12.isCameraPermissionGranted()
            if (r0 == 0) goto L3d
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac = r0
            int r1 = r1 % r2
            boolean r0 = r12.q()
            if (r0 == 0) goto L22
        L1e:
            r12.c(r13)
            return
        L22:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.ac
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.Y = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L38
            boolean r1 = r12.M
            r0 = 88
            int r0 = r0 / 0
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L3d
            goto L1e
        L38:
            boolean r0 = r12.M
            if (r0 == 0) goto L3d
            goto L1e
        L3d:
            com.incode.welcome_sdk.results.VideoSelfieResult r0 = new com.incode.welcome_sdk.results.VideoSelfieResult
            com.incode.welcome_sdk.results.ResultCode r1 = com.incode.welcome_sdk.results.ResultCode.ERROR
            com.incode.welcome_sdk.commons.exceptions.video_selfie.PermissionsDeniedException r2 = r12.y()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r10 = 508(0x1fc, float:7.12E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.e(com.incode.welcome_sdk.results.VideoSelfieResult):void");
    }

    private final PermissionsDeniedException y() {
        int i2 = 2 % 2;
        int i3 = Y + 105;
        ac = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!this.M && !q()) {
                return new MicrophonePermissionDeniedException();
            }
            if (!isCameraPermissionGranted()) {
                CameraPermissionDeniedException cameraPermissionDeniedException = new CameraPermissionDeniedException();
                int i4 = ac + 73;
                Y = i4 % 128;
                int i5 = i4 % 2;
                return cameraPermissionDeniedException;
            }
            return new PermissionsDeniedException(null, 1, null);
        }
        obj.hashCode();
        throw null;
    }

    private final ArrayList<VideoSelfieLocalQuestion> v() {
        int i2 = 2 % 2;
        ArrayList<VideoSelfieLocalQuestion> arrayList = new ArrayList<>();
        String string = getString(R.string.onboard_sdk_video_selfie_default_question_1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.onboard_sdk_video_selfie_default_answer_1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList.add(new VideoSelfieLocalQuestion(string, string2));
        String string3 = getString(R.string.onboard_sdk_video_selfie_default_question_2);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.onboard_sdk_video_selfie_default_answer_2);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList.add(new VideoSelfieLocalQuestion(string3, string4));
        String string5 = getString(R.string.onboard_sdk_video_selfie_default_question_3);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.onboard_sdk_video_selfie_default_answer_3);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        arrayList.add(new VideoSelfieLocalQuestion(string5, string6));
        int i3 = Y + 69;
        ac = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void hidePassportOverlay() {
        ImageView imageView;
        int i2 = 2 % 2;
        bc bcVarD = d();
        if (bcVarD != null) {
            int i3 = ac + 105;
            Y = i3 % 128;
            int i4 = i3 % 2;
            imageView = bcVarD.E;
        } else {
            int i5 = Y + 107;
            ac = i5 % 128;
            int i6 = i5 % 2;
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(4);
            return;
        }
        int i7 = ac + 11;
        Y = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showPassportOverlay() {
        ImageView imageView;
        int i2 = 2 % 2;
        int i3 = Y + 91;
        ac = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarD = d();
        if (bcVarD == null) {
            imageView = null;
        } else {
            int i5 = ac + 21;
            Y = i5 % 128;
            int i6 = i5 % 2;
            imageView = bcVarD.E;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            return;
        }
        int i7 = Y + 61;
        ac = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 10 / 0;
        }
    }

    public static final void g(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = ac + 83;
        Y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoRecordingFragment, "");
        FragmentActivity activity = videoRecordingFragment.getActivity();
        Intrinsics.checkNotNull(activity, "");
        ((BaseActivity) activity).showNoNetworkMessage();
        int i5 = Y + 123;
        ac = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.View
    public final void showNoNetworkMessage(VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        int i3 = Y + 95;
        ac = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        if (this.Q != videoSelfieScanState) {
            this.Q = videoSelfieScanState;
            requireActivity().runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRecordingFragment.g(this.f$0);
                }
            });
            return;
        }
        int i5 = ac + 85;
        Y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
    }

    private static void c(View view, boolean z2) {
        int i2 = 2 % 2;
        int i3 = 0;
        if (!(view.getVisibility() == 8)) {
            if (!(!z2)) {
                int i4 = Y + 69;
                ac = i4 % 128;
                int i5 = i4 % 2;
            } else {
                i3 = 4;
            }
            view.setVisibility(i3);
        }
        int i6 = ac + 123;
        Y = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        bc bcVar = (bc) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = Y + 67;
        ac = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = bcVar.f7027y;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        c(imageView, zBooleanValue);
        IncodeTextView incodeTextView = bcVar.O;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        c(incodeTextView, zBooleanValue);
        int i5 = Y + 39;
        ac = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void a(bc bcVar, View view) {
        int i2 = 2 % 2;
        int i3 = ac + 7;
        Y = i3 % 128;
        int i4 = i3 % 2;
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(841820945, -841820944, new Object[]{bcVar, true}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
        bc bcVarD = d();
        if (bcVarD != null) {
            ImageView imageView = bcVarD.f7027y;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            a(view, imageView);
            IncodeTextView incodeTextView = bcVarD.O;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            a(view, incodeTextView);
            int i5 = ac + 53;
            Y = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static void a(View view, View view2) {
        int i2 = 2 % 2;
        int i3 = ac + 27;
        Y = i3 % 128;
        int i4 = i3 % 2;
        if (!(!ViewExtensionsKt.isOverlapping(view, view2))) {
            c(view2, false);
            int i5 = Y + 125;
            ac = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static void a() {
        U = -1004723158;
        W = 2036585424;
        T = 311644764;
        X = new byte[]{7, Ascii.DC4, Ascii.US, -27, -19, 9, -15, Ascii.GS, Ascii.SYN, -17, Ascii.VT, -28, -30, Ascii.GS, -28, Ascii.EM, -20, 10, -18, Ascii.DC4, Ascii.US, -27, -19};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        aa = 0;
        Z = 1;
        ac = 0;
        Y = 1;
        a();
        Object obj = null;
        new Companion(null);
        int i2 = aa + 1;
        Z = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void a(VideoRecordingFragment videoRecordingFragment, View view) {
        Object[] objArr = {videoRecordingFragment, view};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(137379629, -137379625, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    public static final void b(Function0 function0, DialogInterface dialogInterface, int i2) {
        Object[] objArr = {function0, dialogInterface, Integer.valueOf(i2)};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-1854736762, 1854736762, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    public static final void b(VideoRecordingFragment videoRecordingFragment, ValidationFeedback validationFeedback, int i2) {
        Object[] objArr = {videoRecordingFragment, validationFeedback, Integer.valueOf(i2)};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(874265993, -874265978, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    public static final void d(VideoRecordingFragment videoRecordingFragment) {
        Object[] objArr = {videoRecordingFragment};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(921010246, -921010236, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    public static final void a(VideoRecordingFragment videoRecordingFragment, UiState uiState, int i2) {
        Object[] objArr = {videoRecordingFragment, uiState, Integer.valueOf(i2)};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-1251713441, 1251713450, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private static final void d(VideoRecordingFragment videoRecordingFragment, View view) {
        Object[] objArr = {videoRecordingFragment, view};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(294775206, -294775200, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private static final void c(VideoRecordingFragment videoRecordingFragment, View view) {
        Object[] objArr = {videoRecordingFragment, view};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(124558695, -124558683, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private static void d(bc bcVar, boolean z2) {
        Object[] objArr = {bcVar, Boolean.valueOf(z2)};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(841820945, -841820944, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private final void g(boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-2014391259, 2014391267, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private final void s() {
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-1863581788, 1863581795, new Object[]{this}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private final void r() {
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-59539310, 59539321, new Object[]{this}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private final void b(ValidationFeedback validationFeedback) {
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(166586905, -166586900, new Object[]{this, validationFeedback}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private static int a(ValidationFeedback validationFeedback) {
        Object[] objArr = {validationFeedback};
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        return ((Integer) a(1771086264, -1771086262, objArr, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB)).intValue();
    }

    private final void c(ValidationFeedback validationFeedback) {
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-1688494374, 1688494377, new Object[]{this, validationFeedback}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12479a;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f12480c;

        /* JADX INFO: renamed from: d */
        private static int f12481d = 1;

        /* JADX INFO: renamed from: e */
        private static int f12482e = 0;

        static {
            int[] iArr = new int[UiState.valuesCustom().length];
            try {
                iArr[UiState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiState.PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiState.RETRY.ordinal()] = 3;
                int i2 = f12481d + 33;
                f12482e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UiState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UiState.ERROR_CONTINUE.ordinal()] = 5;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UiState.DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f12479a = iArr;
            int[] iArr2 = new int[IdScan.IdType.values().length];
            try {
                iArr2[IdScan.IdType.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdScan.IdType.PASSPORT.ordinal()] = 2;
                int i6 = f12482e + 105;
                f12481d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            f12480c = iArr2;
        }
    }

    private final void j() {
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(240340945, -240340931, new Object[]{this}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }

    private final void a(IdScan.IdType idType, Function1<? super Rect, Unit> function1) {
        int iB = PermissionOnboardingEntryPointKt.b.b();
        int iB2 = PermissionOnboardingEntryPointKt.b.b();
        a(-829071065, 829071078, new Object[]{this, idType, function1}, PermissionOnboardingEntryPointKt.b.b(), PermissionOnboardingEntryPointKt.b.b(), iB2, iB);
    }
}
