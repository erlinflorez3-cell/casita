package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.bb;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract;
import com.incode.welcome_sdk.views.IncodeButton;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadFragment extends FragmentWithListener<VideoUploadFragmentInterface> implements VideoUploadContract.View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f12646d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12647g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12648h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12649i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12650j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bb f12652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public VideoUploadPresenter f12653c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12655f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Modules f12654e = Modules.VIDEO_ONBOARDING;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScreenName f12651a = ScreenName.VIDEO_SELFIE_VIDEO_UPLOAD;

    public interface VideoUploadFragmentInterface {
        void onFinishUpload(VideoSelfieResult videoSelfieResult);

        void onStartUpload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8417xb69a3a99(VideoUploadFragment videoUploadFragment, View view) {
        Callback.onClick_enter(view);
        try {
            c(videoUploadFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ void access$onRetry(VideoUploadFragment videoUploadFragment) {
        int i2 = 2 % 2;
        int i3 = f12649i + 65;
        f12650j = i3 % 128;
        int i4 = i3 % 2;
        videoUploadFragment.d();
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f12649i;
        int i4 = i3 + 29;
        f12650j = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f12654e;
        int i6 = i3 + 65;
        f12650j = i6 % 128;
        if (i6 % 2 != 0) {
            return modules;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f12649i + 65;
        f12650j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f12651a;
        }
        throw null;
    }

    private final bb c() {
        int i2 = 2 % 2;
        int i3 = f12649i + 21;
        f12650j = i3 % 128;
        int i4 = i3 % 2;
        bb bbVar = this.f12652b;
        Intrinsics.checkNotNull(bbVar);
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
        return bbVar;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12656a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12657e = 1;

        private Companion() {
        }

        public static /* synthetic */ VideoUploadFragment newInstance$default(Companion companion, Boolean bool, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f12657e + 91;
            int i5 = i4 % 128;
            f12656a = i5;
            int i6 = i4 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i5 + 33;
                f12657e = i7 % 128;
                int i8 = i7 % 2;
                bool = null;
            }
            return companion.newInstance(bool);
        }

        public final VideoUploadFragment newInstance(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f12657e + 107;
            f12656a = i3 % 128;
            int i4 = i3 % 2;
            if (bool == null) {
                return new VideoUploadFragment();
            }
            VideoUploadFragment videoUploadFragment = new VideoUploadFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("argHasUserCancelled", bool.booleanValue());
            videoUploadFragment.setArguments(bundle);
            int i5 = f12657e + 27;
            f12656a = i5 % 128;
            int i6 = i5 % 2;
            return videoUploadFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final VideoUploadPresenter getMPresenter() {
        int i2 = 2 % 2;
        int i3 = f12649i + 107;
        f12650j = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        VideoUploadPresenter videoUploadPresenter = this.f12653c;
        if (videoUploadPresenter != null) {
            return videoUploadPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = f12649i + 19;
        f12650j = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setMPresenter(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12649i + 41;
        f12650j = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoUploadPresenter, "");
            this.f12653c = videoUploadPresenter;
        } else {
            Intrinsics.checkNotNullParameter(videoUploadPresenter, "");
            this.f12653c = videoUploadPresenter;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        DaggerVideoUploadComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).videoUploadPresenterModule(new VideoUploadPresenterModule(this)).build().inject(this);
        VideoUploadFragmentInterface listener = getListener();
        if (listener == null) {
            return;
        }
        int i3 = f12649i + 69;
        f12650j = i3 % 128;
        if (i3 % 2 == 0) {
            listener.onStartUpload();
            int i4 = 13 / 0;
        } else {
            listener.onStartUpload();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f12649i + 81;
        f12650j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            this.f12652b = bb.c(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(c().a(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.f12652b = bb.c(layoutInflater, viewGroup);
        ConstraintLayout constraintLayoutA = c().a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "");
        return constraintLayoutA;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i2 = 2 % 2;
        int i3 = f12649i + 65;
        f12650j = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.f12652b = null;
        getMPresenter().onDestroy();
        super.onDestroyView();
        int i5 = f12650j + 69;
        f12649i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void c(VideoUploadFragment videoUploadFragment, View view) {
        int i2 = 2 % 2;
        int i3 = f12650j + 3;
        f12649i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoUploadFragment, "");
        IncodeButton incodeButton = videoUploadFragment.c().f7001d;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        videoUploadFragment.d();
        int i5 = f12649i + 79;
        f12650j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnViewCreated(View view, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f12649i + 1;
        f12650j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.safeOnViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12655f = arguments.getBoolean("argHasUserCancelled");
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i5 = f12649i + 35;
            f12650j = i5 % 128;
            int i6 = i5 % 2;
            Intent intent = activity.getIntent();
            if (intent != null) {
                getMPresenter().setAudioDisabled(intent.getBooleanExtra("extraIsAudioDisabled", false));
            }
        }
        EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
        getMPresenter().uploadVideo();
        c().f7001d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoUploadFragment.m8417xb69a3a99(this.f$0, view2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        r0 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r18.f12655f != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j + com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r19 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r1 = r4 + 123;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if ((r1 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r0 = getListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0.onFinishUpload(new com.incode.welcome_sdk.results.VideoSelfieResult(com.incode.welcome_sdk.results.ResultCode.SUCCESS, null, null, null, null, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_POSITION_TYPE, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i + 15;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if ((r1 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        r0 = getListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r0 = getListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        r0.onFinishUpload(new com.incode.welcome_sdk.results.VideoSelfieResult(com.incode.welcome_sdk.results.ResultCode.ERROR, new com.incode.welcome_sdk.commons.exceptions.video_selfie.VideoUploadException(), null, null, null, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r18.f12655f != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        r0 = getListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r0.onFinishUpload(new com.incode.welcome_sdk.results.VideoSelfieResult(com.incode.welcome_sdk.results.ResultCode.USER_CANCELLED, null, null, null, null, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i + 61;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if ((r1 % 2) != 0) goto L37;
     */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void startNextStep(boolean r19) {
        /*
            r18 = this;
            r6 = r18
            r5 = 2
            int r0 = r5 % r5
            int r4 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j
            int r1 = r4 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i = r0
            int r1 = r1 % r5
            r3 = 15
            r2 = 0
            if (r1 == 0) goto L47
            boolean r1 = r6.f12655f
            r0 = 66
            int r0 = r0 / 0
            if (r1 == 0) goto L59
        L1b:
            java.lang.Object r0 = r18.getListener()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment$VideoUploadFragmentInterface r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.VideoUploadFragmentInterface) r0
            if (r0 == 0) goto L4c
            com.incode.welcome_sdk.results.VideoSelfieResult r6 = new com.incode.welcome_sdk.results.VideoSelfieResult
            com.incode.welcome_sdk.results.ResultCode r7 = com.incode.welcome_sdk.results.ResultCode.USER_CANCELLED
            r16 = 510(0x1fe, float:7.15E-43)
            r17 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.onFinishUpload(r6)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L46
            int r0 = r3 / 0
        L46:
            return
        L47:
            boolean r0 = r6.f12655f
            if (r0 == 0) goto L59
            goto L1b
        L4c:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L58
            return
        L58:
            throw r2
        L59:
            if (r19 == 0) goto L98
            int r1 = r4 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L91
            java.lang.Object r0 = r18.getListener()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment$VideoUploadFragmentInterface r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.VideoUploadFragmentInterface) r0
            if (r0 == 0) goto L82
            com.incode.welcome_sdk.results.VideoSelfieResult r1 = new com.incode.welcome_sdk.results.VideoSelfieResult
            com.incode.welcome_sdk.results.ResultCode r2 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            r11 = 510(0x1fe, float:7.15E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.onFinishUpload(r1)
            return
        L82:
            int r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12649i
            int r1 = r1 + r3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.f12650j = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L8d
            return
        L8d:
            r2.hashCode()
            throw r2
        L91:
            java.lang.Object r0 = r18.getListener()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment$VideoUploadFragmentInterface r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.VideoUploadFragmentInterface) r0
            throw r2
        L98:
            java.lang.Object r0 = r18.getListener()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment$VideoUploadFragmentInterface r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.VideoUploadFragmentInterface) r0
            if (r0 == 0) goto Lbb
            com.incode.welcome_sdk.results.VideoSelfieResult r1 = new com.incode.welcome_sdk.results.VideoSelfieResult
            com.incode.welcome_sdk.results.ResultCode r2 = com.incode.welcome_sdk.results.ResultCode.ERROR
            com.incode.welcome_sdk.commons.exceptions.video_selfie.VideoUploadException r3 = new com.incode.welcome_sdk.commons.exceptions.video_selfie.VideoUploadException
            r3.<init>()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r11 = 508(0x1fc, float:7.12E-43)
            r12 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.onFinishUpload(r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.startNextStep(boolean):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract.View
    public final void showError(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12649i + 115;
        f12650j = i3 % 128;
        int i4 = i3 % 2;
        bb bbVarC = c();
        int i5 = 4;
        bbVarC.f6999b.setVisibility(4);
        bbVarC.f6998a.setVisibility(4);
        bbVarC.f7000c.setVisibility(0);
        IncodeButton incodeButton = bbVarC.f7001d;
        if (z2) {
            int i6 = f12649i + 41;
            f12650j = i6 % 128;
            int i7 = i6 % 2;
            i5 = 0;
        }
        incodeButton.setVisibility(i5);
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12658d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12659e = 1;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f12658d + 13;
            f12659e = i3 % 128;
            if (i3 % 2 == 0) {
                VideoUploadFragment.access$onRetry(VideoUploadFragment.this);
                int i4 = 19 / 0;
            } else {
                VideoUploadFragment.access$onRetry(VideoUploadFragment.this);
            }
            int i5 = f12658d + 101;
            f12659e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f12659e + 37;
            f12658d = i3 % 128;
            int i4 = i3 % 2;
            a();
            if (i4 != 0) {
                unit = Unit.INSTANCE;
                int i5 = 33 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f12659e + 19;
            f12658d = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        d() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract.View
    public final void showNetworkError() {
        int i2 = 2 % 2;
        bb bbVarC = c();
        bbVarC.f6999b.setVisibility(0);
        bbVarC.f6998a.setVisibility(4);
        bbVarC.f7000c.setVisibility(4);
        showNoNetworkMessage(new d());
        int i3 = f12649i + 79;
        f12650j = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void e() {
        bb bbVarC;
        int i2 = 2 % 2;
        int i3 = f12649i + 51;
        f12650j = i3 % 128;
        if (i3 % 2 == 0) {
            bbVarC = c();
            bbVarC.f6998a.setVisibility(1);
            bbVarC.f7000c.setVisibility(3);
        } else {
            bbVarC = c();
            bbVarC.f6998a.setVisibility(0);
            bbVarC.f7000c.setVisibility(4);
        }
        bbVarC.f6999b.setVisibility(4);
        int i4 = f12649i + 19;
        f12650j = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f12650j + 91;
        f12649i = i3 % 128;
        int i4 = i3 % 2;
        this.f12655f = false;
        e();
        getMPresenter().uploadVideo();
        int i5 = f12649i + 39;
        f12650j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f12646d = new Companion(defaultConstructorMarker);
        int i2 = f12648h + 1;
        f12647g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
