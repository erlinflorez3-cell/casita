package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.an;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.av;
import com.incode.welcome_sdk.i;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadPresenter implements VideoUploadContract.Presenter {

    /* JADX INFO: renamed from: i */
    private static int f12664i = 0;

    /* JADX INFO: renamed from: o */
    private static int f12665o = 1;

    /* JADX INFO: renamed from: a */
    private final int f12666a;

    /* JADX INFO: renamed from: b */
    private final VideoUploadContract.View f12667b;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcomeRepository f12668c;

    /* JADX INFO: renamed from: d */
    private boolean f12669d;

    /* JADX INFO: renamed from: e */
    private final CompositeDisposable f12670e;

    /* JADX INFO: renamed from: f */
    private VideoUploadStep f12671f;

    /* JADX INFO: renamed from: g */
    private int f12672g;

    /* JADX INFO: renamed from: h */
    private String f12673h;

    /* JADX INFO: renamed from: j */
    private File f12674j;

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~(i8 | i6);
        int i10 = ~i6;
        int i11 = ~((~i5) | i10);
        int i12 = ~(i10 | i4);
        int i13 = i11 | i12;
        int i14 = (~(i5 | i8)) | i12 | i9;
        int i15 = i6 + i4 + i7 + ((-168536539) * i3) + (1787681333 * i2);
        int i16 = i15 * i15;
        int i17 = ((-1349843359) * i6) + 1460535296 + ((-923239215) * i4) + ((-1716058528) * i9) + (i13 * (-1289454384)) + ((-1289454384) * i14) + (366215168 * i7) + (1604583424 * i3) + (216268800 * i2) + (1778253824 * i16);
        int i18 = (i6 * (-925914073)) + 175428941 + (i4 * (-925912777)) + (i9 * (-864)) + (i13 * 432) + (i14 * 432) + (i7 * (-925913209)) + (i3 * 1252505731) + (i2 * 30625011) + (i16 * (-2030960640));
        if (i17 + (i18 * i18 * 899809280) == 1) {
            return b(objArr);
        }
        VideoUploadPresenter videoUploadPresenter = (VideoUploadPresenter) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i19 = 2 % 2;
        int i20 = f12665o + 49;
        f12664i = i20 % 128;
        int i21 = i20 % 2;
        Timber.Forest.e(th);
        EventUtils.sendEvent(videoUploadPresenter.f12668c, Event.VIDEO_SELFIE_VIDEO_UPLOAD_ERROR, Modules.VIDEO_ONBOARDING, (HashMap<String, Object>) MapsKt.hashMapOf(TuplesKt.to(EventValues.SCREEN_NAME.getValue(), videoUploadPresenter.f12668c.getCurrentScreenName().name()), TuplesKt.to(EventValues.ERROR_MESSAGE.getValue(), ExceptionsKt.stackTraceToString(th))));
        int i22 = f12665o + 67;
        f12664i = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    @Inject
    public VideoUploadPresenter(IncodeWelcomeRepository incodeWelcomeRepository, VideoUploadContract.View view) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f12668c = incodeWelcomeRepository;
        this.f12667b = view;
        this.f12666a = 3;
        this.f12670e = new CompositeDisposable();
        this.f12671f = VideoUploadStep.f12712a;
    }

    public static final /* synthetic */ void access$generateVideoSelfieUrl(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12664i + 13;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        videoUploadPresenter.c();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f12664i + 45;
        f12665o = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getIncodeWelcomeRepository$p(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12665o;
        int i4 = i3 + 99;
        f12664i = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = videoUploadPresenter.f12668c;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 27;
        f12664i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return incodeWelcomeRepository;
    }

    public static final /* synthetic */ int access$getRETRY_COUNT$p(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12665o + 29;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
        int i5 = videoUploadPresenter.f12666a;
        if (i4 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int access$getRetryCounter$p(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12664i;
        int i4 = i3 + 21;
        f12665o = i4 % 128;
        int i5 = i4 % 2;
        int i6 = videoUploadPresenter.f12672g;
        int i7 = i3 + 53;
        f12665o = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ File access$getVideoFile$p(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12665o + 99;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
        File file = videoUploadPresenter.f12674j;
        if (i4 == 0) {
            return file;
        }
        throw null;
    }

    public static final /* synthetic */ VideoUploadContract.View access$getView$p(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12664i + 55;
        int i4 = i3 % 128;
        f12665o = i4;
        int i5 = i3 % 2;
        Object obj = null;
        VideoUploadContract.View view = videoUploadPresenter.f12667b;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 89;
        f12664i = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$sendVideoUploadErrorEvent(VideoUploadPresenter videoUploadPresenter, Throwable th) {
        int i2 = 2 % 2;
        int i3 = f12665o + 57;
        f12664i = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {videoUploadPresenter, th};
            int iB = i.b.b();
            int iB2 = i.b.b();
            b(i.b.b(), i.b.b(), 682445701, iB, -682445701, objArr, iB2);
            int i4 = 97 / 0;
        } else {
            Object[] objArr2 = {videoUploadPresenter, th};
            int iB3 = i.b.b();
            int iB4 = i.b.b();
            b(i.b.b(), i.b.b(), 682445701, iB3, -682445701, objArr2, iB4);
        }
        int i5 = f12664i + 57;
        f12665o = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setGeneratedVideoUrl$p(VideoUploadPresenter videoUploadPresenter, String str) {
        int i2 = 2 % 2;
        int i3 = f12665o;
        int i4 = i3 + 103;
        f12664i = i4 % 128;
        int i5 = i4 % 2;
        videoUploadPresenter.f12673h = str;
        int i6 = i3 + 111;
        f12664i = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$setRetryCounter$p(VideoUploadPresenter videoUploadPresenter, int i2) {
        int i3 = 2 % 2;
        int i4 = f12664i;
        int i5 = i4 + 9;
        f12665o = i5 % 128;
        int i6 = i5 % 2;
        videoUploadPresenter.f12672g = i2;
        int i7 = i4 + 27;
        f12665o = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$setVideoFile$p(VideoUploadPresenter videoUploadPresenter, File file) {
        int i2 = 2 % 2;
        int i3 = f12665o + 17;
        int i4 = i3 % 128;
        f12664i = i4;
        int i5 = i3 % 2;
        videoUploadPresenter.f12674j = file;
        int i6 = i4 + 31;
        f12665o = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$showNoNetworkMessage(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12664i + 59;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        videoUploadPresenter.a();
        int i5 = f12664i + 83;
        f12665o = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$uploadVideoToUrl(VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12664i + 81;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        videoUploadPresenter.d();
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
    }

    public final boolean isAudioDisabled() {
        int i2 = 2 % 2;
        int i3 = f12665o;
        int i4 = i3 + 91;
        f12664i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f12669d;
        int i5 = i3 + 35;
        f12664i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return z2;
    }

    public final void setAudioDisabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12664i;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12665o = i4 % 128;
        int i5 = i4 % 2;
        this.f12669d = z2;
        int i6 = i3 + 63;
        f12665o = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uploadVideo() {
        /*
            r8 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.f12665o
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.f12664i = r0
            int r1 = r1 % r3
            r5 = 3
            r4 = 1
            r6 = 0
            java.lang.String r7 = "Upload video, currentUploadStep: "
            if (r1 == 0) goto L3e
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadStep r0 = r8.f12671f
            java.lang.String r1 = r0.name()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r2.d(r1, r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadStep r0 = r8.f12671f
            int[] r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.WhenMappings.f12677d
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L71
            if (r0 == r3) goto L6d
            if (r0 == r5) goto L69
        L3d:
            return
        L3e:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadStep r0 = r8.f12671f
            java.lang.String r1 = r0.name()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r2.d(r1, r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadStep r0 = r8.f12671f
            int[] r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.WhenMappings.f12677d
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L71
            if (r0 == r3) goto L6d
            if (r0 == r5) goto L69
            goto L3d
        L69:
            r8.d()
            goto L3d
        L6d:
            r8.c()
            return
        L71:
            r8.b()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.f12664i
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.f12665o = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L80
            return
        L80:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter.uploadVideo():void");
    }

    static final class b extends Lambda implements Function1<File, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12681a = 1;

        /* JADX INFO: renamed from: c */
        private static int f12682c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(File file) {
            int i2 = 2 % 2;
            int i3 = f12682c + 87;
            f12681a = i3 % 128;
            int i4 = i3 % 2;
            a(file);
            Unit unit = Unit.INSTANCE;
            int i5 = f12682c + 65;
            f12681a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 93 / 0;
            }
            return unit;
        }

        private void a(File file) {
            int i2 = 2 % 2;
            int i3 = f12682c + 35;
            f12681a = i3 % 128;
            int i4 = i3 % 2;
            VideoUploadPresenter.access$setVideoFile$p(VideoUploadPresenter.this, file);
            VideoUploadPresenter.access$generateVideoSelfieUrl(VideoUploadPresenter.this);
            int i5 = f12681a + 69;
            f12682c = i5 % 128;
            int i6 = i5 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12684a = 1;

        /* JADX INFO: renamed from: d */
        private static int f12685d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12685d + 85;
            f12684a = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12685d + 11;
            f12684a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
            }
            return unit;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12685d + 25;
            f12684a = i3 % 128;
            int i4 = i3 % 2;
            VideoUploadPresenter videoUploadPresenter = VideoUploadPresenter.this;
            Intrinsics.checkNotNull(th);
            VideoUploadPresenter.access$sendVideoUploadErrorEvent(videoUploadPresenter, th);
            VideoUploadPresenter.access$getView$p(VideoUploadPresenter.this).startNextStep(false);
            VideoUploadPresenter.access$getView$p(VideoUploadPresenter.this).showError(false);
            int i5 = f12685d + 17;
            f12684a = i5 % 128;
            int i6 = i5 % 2;
        }

        c() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12665o + 15;
        f12664i = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12664i + 71;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12664i + 125;
        f12665o = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private final void b() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f12670e;
        Single<File> singleObserveOn = an.c(this.f12668c).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b();
        Consumer<? super File> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.a(bVar, obj);
            }
        };
        final c cVar = new c();
        compositeDisposable.add(singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.b(cVar, obj);
            }
        }));
        int i3 = f12665o + 91;
        f12664i = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static final class a extends Lambda implements Function1<av, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12678a = 1;

        /* JADX INFO: renamed from: e */
        private static int f12679e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(av avVar) {
            int i2 = 2 % 2;
            int i3 = f12678a + 61;
            f12679e = i3 % 128;
            int i4 = i3 % 2;
            d(avVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f12678a + 121;
            f12679e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void d(av avVar) {
            boolean z2;
            int i2 = 2 % 2;
            IncodeWelcomeRepository incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p = VideoUploadPresenter.access$getIncodeWelcomeRepository$p(VideoUploadPresenter.this);
            Pair pair = new Pair(VideoUploadPresenter.access$getVideoFile$p(VideoUploadPresenter.this), avVar);
            if (!VideoUploadPresenter.this.isAudioDisabled()) {
                int i3 = f12679e + 39;
                int i4 = i3 % 128;
                f12678a = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 59;
                f12679e = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            EventUtils.sendVideoUploadMetadataEvents(incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p, pair, z2);
        }

        a() {
            super(1);
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12664i + 65;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12665o + 97;
        f12664i = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class d extends Lambda implements Function1<av, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12687c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12688d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(av avVar) {
            int i2 = 2 % 2;
            int i3 = f12688d + 61;
            f12687c = i3 % 128;
            int i4 = i3 % 2;
            e(avVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f12688d + 39;
            f12687c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(av avVar) {
            int i2 = 2 % 2;
            int i3 = f12687c + 99;
            f12688d = i3 % 128;
            if (i3 % 2 == 0) {
                VideoUploadPresenter.access$setGeneratedVideoUrl$p(VideoUploadPresenter.this, avVar.a());
                VideoUploadPresenter.access$uploadVideoToUrl(VideoUploadPresenter.this);
                int i4 = 68 / 0;
            } else {
                VideoUploadPresenter.access$setGeneratedVideoUrl$p(VideoUploadPresenter.this, avVar.a());
                VideoUploadPresenter.access$uploadVideoToUrl(VideoUploadPresenter.this);
            }
            int i5 = f12687c + 29;
            f12688d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        d() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12690a = 1;

        /* JADX INFO: renamed from: e */
        private static int f12691e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12690a + 13;
            f12691e = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12691e + 83;
            f12690a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return unit;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12690a + 99;
            int i4 = i3 % 128;
            f12691e = i4;
            int i5 = i3 % 2;
            if (!(th instanceof NoConnectivityException)) {
                VideoUploadPresenter videoUploadPresenter = VideoUploadPresenter.this;
                Intrinsics.checkNotNull(th);
                VideoUploadPresenter.access$sendVideoUploadErrorEvent(videoUploadPresenter, th);
                VideoUploadPresenter videoUploadPresenter2 = VideoUploadPresenter.this;
                VideoUploadPresenter.access$setRetryCounter$p(videoUploadPresenter2, VideoUploadPresenter.access$getRetryCounter$p(videoUploadPresenter2) + 1);
                if (VideoUploadPresenter.access$getRetryCounter$p(videoUploadPresenter2) == VideoUploadPresenter.access$getRETRY_COUNT$p(VideoUploadPresenter.this)) {
                    VideoUploadPresenter.access$getView$p(VideoUploadPresenter.this).startNextStep(false);
                    int i6 = f12690a + 1;
                    f12691e = i6 % 128;
                    int i7 = i6 % 2;
                }
                VideoUploadContract.View.DefaultImpls.showError$default(VideoUploadPresenter.access$getView$p(VideoUploadPresenter.this), false, 1, null);
                int i8 = f12690a + 23;
                f12691e = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            int i10 = i4 + 83;
            f12690a = i10 % 128;
            if (i10 % 2 != 0) {
                VideoUploadPresenter.access$showNoNetworkMessage(VideoUploadPresenter.this);
            } else {
                VideoUploadPresenter.access$showNoNetworkMessage(VideoUploadPresenter.this);
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12665o + 45;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12664i + 95;
        f12665o = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12665o + 95;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12665o + 7;
        f12664i = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void c() {
        int i2 = 2 % 2;
        this.f12671f = VideoUploadStep.f12713b;
        CompositeDisposable compositeDisposable = this.f12670e;
        Observable<av> observableGenerateVideoSelfieUrl = this.f12668c.generateVideoSelfieUrl();
        final a aVar = new a();
        Observable<av> observableObserveOn = observableGenerateVideoSelfieUrl.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.d(aVar, obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d();
        Consumer<? super av> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.e(dVar, obj);
            }
        };
        final e eVar = new e();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.c(eVar, obj);
            }
        }));
        int i3 = f12665o + 23;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class j extends Lambda implements Function1<ResponseBody, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12699c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12700d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseBody responseBody) {
            int i2 = 2 % 2;
            int i3 = f12700d + 33;
            f12699c = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f12699c + 125;
            f12700d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f12699c + 23;
            f12700d = i3 % 128;
            int i4 = i3 % 2;
            IncodeWelcomeRepository incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p = VideoUploadPresenter.access$getIncodeWelcomeRepository$p(VideoUploadPresenter.this);
            Event event = Event.VIDEO_SELFIE_VIDEO_UPLOADED;
            Modules modules = Modules.VIDEO_ONBOARDING;
            ScreenName currentScreenName = VideoUploadPresenter.access$getIncodeWelcomeRepository$p(VideoUploadPresenter.this).getCurrentScreenName();
            Intrinsics.checkNotNullExpressionValue(currentScreenName, "");
            EventUtils.sendEvent(incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p, event, modules, currentScreenName);
            int i5 = f12700d + 77;
            f12699c = i5 % 128;
            int i6 = i5 % 2;
        }

        j() {
            super(1);
        }
    }

    public static final void g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12664i + 49;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12665o + 29;
        f12664i = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class f extends Lambda implements Function1<ResponseBody, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12693c = 1;

        /* JADX INFO: renamed from: e */
        private static int f12694e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseBody responseBody) {
            int i2 = 2 % 2;
            int i3 = f12694e + 103;
            f12693c = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f12694e + 95;
            f12693c = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d() {
            int i2 = 2 % 2;
            int i3 = f12693c + 93;
            f12694e = i3 % 128;
            int i4 = i3 % 2;
            VideoUploadPresenter.access$getView$p(VideoUploadPresenter.this).startNextStep(true);
            int i5 = f12694e + 115;
            f12693c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
        }

        f() {
            super(1);
        }
    }

    static final class g extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12696a = 0;

        /* JADX INFO: renamed from: d */
        private static int f12697d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12697d + 21;
            f12696a = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12697d + 17;
            f12696a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12697d;
            int i4 = i3 + 17;
            f12696a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                if (!(th instanceof NoConnectivityException)) {
                    VideoUploadPresenter videoUploadPresenter = VideoUploadPresenter.this;
                    Intrinsics.checkNotNull(th);
                    VideoUploadPresenter.access$sendVideoUploadErrorEvent(videoUploadPresenter, th);
                    VideoUploadContract.View.DefaultImpls.showError$default(VideoUploadPresenter.access$getView$p(VideoUploadPresenter.this), false, 1, null);
                    return;
                }
                int i5 = i3 + 103;
                f12696a = i5 % 128;
                if (i5 % 2 == 0) {
                    VideoUploadPresenter.access$showNoNetworkMessage(VideoUploadPresenter.this);
                    return;
                } else {
                    VideoUploadPresenter.access$showNoNetworkMessage(VideoUploadPresenter.this);
                    obj.hashCode();
                    throw null;
                }
            }
            boolean z2 = th instanceof NoConnectivityException;
            throw null;
        }

        g() {
            super(1);
        }
    }

    public static final void j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12665o + 91;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12665o + 93;
        f12664i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void f(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12665o + 35;
        f12664i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12665o + 35;
        f12664i = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void d() {
        int i2 = 2 % 2;
        this.f12671f = VideoUploadStep.f12716e;
        CompositeDisposable compositeDisposable = this.f12670e;
        Observable<ResponseBody> observable = this.f12668c.uploadVideo(this.f12673h, this.f12674j).toObservable();
        final j jVar = new j();
        Observable<ResponseBody> observableObserveOn = observable.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.g(jVar, obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final f fVar = new f();
        Consumer<? super ResponseBody> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.j(fVar, obj);
            }
        };
        final g gVar = new g();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadPresenter.f(gVar, obj);
            }
        }));
        int i3 = f12664i + 81;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f12665o + 71;
        f12664i = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12667b.showNetworkError();
            int i4 = 86 / 0;
        } else {
            this.f12667b.showNetworkError();
        }
        int i5 = f12664i + 101;
        f12665o = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f12664i + 113;
        f12665o = i3 % 128;
        int i4 = i3 % 2;
        this.f12670e.clear();
        int i5 = f12664i + 63;
        f12665o = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract.Presenter
    public final void publishResult(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = f12665o + 37;
        f12664i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfieResult, "");
            EventUtils.sendScreenClosed(this.f12668c, ScreenName.VIDEO_SELFIE_VIDEO_UPLOAD, Modules.VIDEO_ONBOARDING);
            IncodeWelcome.Companion.getInstance().getVideoSelfieBus().onNext(videoSelfieResult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoSelfieResult, "");
        EventUtils.sendScreenClosed(this.f12668c, ScreenName.VIDEO_SELFIE_VIDEO_UPLOAD, Modules.VIDEO_ONBOARDING);
        IncodeWelcome.Companion.getInstance().getVideoSelfieBus().onNext(videoSelfieResult);
        int i4 = f12665o + 35;
        f12664i = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b */
        private static int f12675b = 0;

        /* JADX INFO: renamed from: c */
        private static int f12676c = 1;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f12677d;

        static {
            int[] iArr = new int[VideoUploadStep.values().length];
            try {
                iArr[VideoUploadStep.f12712a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoUploadStep.f12713b.ordinal()] = 2;
                int i2 = f12675b + 59;
                f12676c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 5;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoUploadStep.f12716e.ordinal()] = 3;
                int i5 = f12676c + 55;
                f12675b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            f12677d = iArr;
            int i7 = f12676c + 81;
            f12675b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 77 / 0;
            }
        }
    }

    public static final void b(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iB = i.b.b();
        int iB2 = i.b.b();
        b(i.b.b(), i.b.b(), 588146062, iB, -588146061, objArr, iB2);
    }

    private final void b(Throwable th) {
        int iB = i.b.b();
        int iB2 = i.b.b();
        int iB3 = i.b.b();
        b(i.b.b(), iB3, 682445701, iB, -682445701, new Object[]{this, th}, iB2);
    }
}
