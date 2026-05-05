package com.incode.welcome_sdk.ui.camera.videostreaming;

import android.app.Application;
import android.hardware.Camera;
import android.view.Display;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.b;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.ab;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.CameraXVideoCapturer;
import com.incode.welcome_sdk.ui.camera.MirrorVideoCapturer;
import com.opentok.android.Publisher;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoStreamingManager {

    /* JADX INFO: renamed from: h */
    private static int f12763h = 1;

    /* JADX INFO: renamed from: i */
    private static int f12764i = 0;

    /* JADX INFO: renamed from: a */
    private HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> f12765a;

    /* JADX INFO: renamed from: b */
    private final Application f12766b;

    /* JADX INFO: renamed from: c */
    private String f12767c;

    /* JADX INFO: renamed from: d */
    private final IncodeWelcomeRepository f12768d;

    /* JADX INFO: renamed from: e */
    private final OpenTokEventListener f12769e;

    /* JADX INFO: renamed from: g */
    private final OpenTokEventListener f12770g;

    /* JADX INFO: renamed from: j */
    private final OpenTokEventListener f12771j;

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~((~i4) | i3 | i7);
        int i9 = ~((~i3) | i4);
        int i10 = ~i7;
        int i11 = i9 | (~(i10 | i4));
        int i12 = ~(i10 | i3);
        int i13 = i4 + i3 + i5 + ((-1568348280) * i6) + (1617068012 * i2);
        int i14 = i13 * i13;
        int i15 = (((-430874860) * i4) - 739508224) + (1544986862 * i3) + (i8 * 987930861) + ((-987930861) * i11) + (987930861 * i12) + (557056000 * i5) + ((-1885339648) * i6) + (1743781888 * i2) + (858456064 * i14);
        int i16 = (i4 * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i8 * 945) + (i11 * (-945)) + (i12 * 945) + (i5 * (-973780651)) + (i6 * 424585256) + (i2 * 537576796) + (i14 * 1078394880);
        int i17 = i15 + (i16 * i16 * 192741376);
        return i17 != 1 ? i17 != 2 ? a(objArr) : d(objArr) : c(objArr);
    }

    @Inject
    public VideoStreamingManager(Application application, IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f12766b = application;
        this.f12768d = incodeWelcomeRepository;
        this.f12765a = new HashMap<>();
        this.f12769e = new OpenTokEventListener(com.incode.welcome_sdk.data.b.f7597c, incodeWelcomeRepository);
        this.f12771j = new OpenTokEventListener(com.incode.welcome_sdk.data.b.f7596b, incodeWelcomeRepository);
        this.f12770g = new OpenTokEventListener(com.incode.welcome_sdk.data.b.f7598e, incodeWelcomeRepository);
    }

    public static final /* synthetic */ HashMap access$getSessionWrappers$p(VideoStreamingManager videoStreamingManager) {
        int i2 = 2 % 2;
        int i3 = f12764i + 41;
        int i4 = i3 % 128;
        f12763h = i4;
        int i5 = i3 % 2;
        HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> map = videoStreamingManager.f12765a;
        int i6 = i4 + 1;
        f12764i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
        return map;
    }

    public static final /* synthetic */ boolean access$isLoginMode(VideoStreamingManager videoStreamingManager) {
        boolean zBooleanValue;
        int i2 = 2 % 2;
        int i3 = f12764i + 121;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {videoStreamingManager};
        int iD = b.a.e.d();
        int iD2 = b.a.e.d();
        int iD3 = b.a.e.d();
        int iD4 = b.a.e.d();
        if (i4 == 0) {
            zBooleanValue = ((Boolean) a(iD4, -468139170, 468139171, objArr, iD2, iD3, iD)).booleanValue();
            int i5 = 60 / 0;
        } else {
            zBooleanValue = ((Boolean) a(iD4, -468139170, 468139171, objArr, iD2, iD3, iD)).booleanValue();
        }
        int i6 = f12764i + 9;
        f12763h = i6 % 128;
        int i7 = i6 % 2;
        return zBooleanValue;
    }

    public final Application getApplication() {
        int i2 = 2 % 2;
        int i3 = f12764i;
        int i4 = i3 + 27;
        f12763h = i4 % 128;
        int i5 = i4 % 2;
        Application application = this.f12766b;
        int i6 = i3 + 39;
        f12763h = i6 % 128;
        int i7 = i6 % 2;
        return application;
    }

    public final IncodeWelcomeRepository getRepository() {
        int i2 = 2 % 2;
        int i3 = f12763h + 7;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f12768d;
        if (i4 != 0) {
            int i5 = 12 / 0;
        }
        return incodeWelcomeRepository;
    }

    private final HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> e() {
        int i2 = 2 % 2;
        HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to(com.incode.welcome_sdk.data.b.f7597c, new OpenTokSessionWrapper(com.incode.welcome_sdk.data.b.f7597c, this.f12769e)), TuplesKt.to(com.incode.welcome_sdk.data.b.f7596b, new OpenTokSessionWrapper(com.incode.welcome_sdk.data.b.f7596b, this.f12771j)), TuplesKt.to(com.incode.welcome_sdk.data.b.f7598e, new OpenTokSessionWrapper(com.incode.welcome_sdk.data.b.f7598e, this.f12770g)));
        int i3 = f12763h + 91;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        return mapHashMapOf;
    }

    private final HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> b() {
        int i2 = 2 % 2;
        HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to(com.incode.welcome_sdk.data.b.f7598e, new OpenTokSessionWrapper(com.incode.welcome_sdk.data.b.f7598e, this.f12770g)));
        int i3 = f12763h + 1;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        return mapHashMapOf;
    }

    public final void initializeSessionWrappers() {
        int i2 = 2 % 2;
        int i3 = f12763h + 89;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        initializeSessionWrappers(null);
        int i5 = f12763h + 15;
        f12764i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    public static /* synthetic */ void initializeSessionWrappers$default(VideoStreamingManager videoStreamingManager, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f12763h;
        int i5 = i4 + 47;
        f12764i = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 33;
            f12764i = i7 % 128;
            int i8 = i7 % 2;
            str = null;
        }
        videoStreamingManager.initializeSessionWrappers(str);
        int i9 = f12764i + 75;
        f12763h = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void initializeSessionWrappers(String str) {
        HashMap<com.incode.welcome_sdk.data.b, OpenTokSessionWrapper> mapE;
        int i2 = 2 % 2;
        int i3 = f12764i + 65;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        this.f12767c = str;
        int iD = b.a.e.d();
        int iD2 = b.a.e.d();
        int iD3 = b.a.e.d();
        if (!((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{this}, iD2, iD3, iD)).booleanValue()) {
            mapE = e();
        } else {
            int i5 = f12764i + 23;
            f12763h = i5 % 128;
            if (i5 % 2 != 0) {
                mapE = b();
            } else {
                b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.f12765a = mapE;
    }

    static final class d extends Lambda implements Function1<Disposable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12783a = 1;

        /* JADX INFO: renamed from: e */
        private static int f12784e = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ com.incode.welcome_sdk.data.b f12785b;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f12783a + 83;
            f12784e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.d("Creating OpenTok session for " + this.f12785b, new Object[0]);
            } else {
                Timber.Forest.d("Creating OpenTok session for " + this.f12785b, new Object[0]);
            }
            int i4 = f12784e + 81;
            f12783a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Disposable disposable) {
            int i2 = 2 % 2;
            int i3 = f12783a + 113;
            f12784e = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 5 / 0;
            }
            int i6 = f12784e + 87;
            f12783a = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.incode.welcome_sdk.data.b bVar) {
            super(1);
            this.f12785b = bVar;
        }
    }

    public final Completable createOpenTokSession(com.incode.welcome_sdk.data.b bVar) {
        Single<ab> singleCreateOpenTokSessionAuth;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        int iD = b.a.e.d();
        int iD2 = b.a.e.d();
        int iD3 = b.a.e.d();
        if (!((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{this}, iD2, iD3, iD)).booleanValue()) {
            singleCreateOpenTokSessionAuth = this.f12768d.createOpenTokSession(bVar.e());
        } else {
            int i3 = f12764i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f12763h = i3 % 128;
            int i4 = i3 % 2;
            singleCreateOpenTokSessionAuth = this.f12768d.createOpenTokSessionAuth(this.f12767c, bVar.e());
            int i5 = f12764i + 39;
            f12763h = i5 % 128;
            int i6 = i5 % 2;
        }
        final d dVar = new d(bVar);
        Single<ab> singleObserveOn = singleCreateOpenTokSessionAuth.doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.a(dVar, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final b bVar2 = new b(bVar, this);
        Single<ab> singleDoOnError = singleObserveOn.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.b(bVar2, obj);
            }
        });
        final c cVar = new c(bVar);
        Completable completableIgnoreElement = singleDoOnError.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.e(cVar, obj);
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "");
        return completableIgnoreElement;
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12763h + 21;
        f12764i = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f12764i + 45;
        f12763h = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f12775c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12776d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ VideoStreamingManager f12777b;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ com.incode.welcome_sdk.data.b f12778e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12775c + 3;
            f12776d = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12775c + 85;
            f12776d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Error creating streaming session for module: " + this.f12778e, new Object[1]);
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Error creating streaming session for module: " + this.f12778e, new Object[0]);
            }
            EventUtils.sendEvent(this.f12777b.getRepository(), Event.ERROR, (Modules) null, n.a(th));
            int i4 = f12775c + 31;
            f12776d = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.incode.welcome_sdk.data.b bVar, VideoStreamingManager videoStreamingManager) {
            super(1);
            this.f12778e = bVar;
            this.f12777b = videoStreamingManager;
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12763h + 13;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12764i + 77;
        f12763h = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class c extends Lambda implements Function1<ab, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12779a = 0;

        /* JADX INFO: renamed from: b */
        private static int f12780b = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ com.incode.welcome_sdk.data.b f12782e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ab abVar) {
            int i2 = 2 % 2;
            int i3 = f12780b + 7;
            f12779a = i3 % 128;
            int i4 = i3 % 2;
            c(abVar);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[PHI: r1 r2
  0x0069: PHI (r1v21 com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper) = 
  (r1v17 com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper)
  (r1v25 com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper)
 binds: [B:45:0x0098, B:40:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r2v13 timber.log.Timber$Forest) = (r2v10 timber.log.Timber$Forest), (r2v14 timber.log.Timber$Forest) binds: [B:45:0x0098, B:40:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009b A[PHI: r2
  0x009b: PHI (r2v11 timber.log.Timber$Forest) = (r2v10 timber.log.Timber$Forest), (r2v14 timber.log.Timber$Forest) binds: [B:45:0x0098, B:40:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(com.incode.welcome_sdk.data.remote.beans.ab r12) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager.c.c(com.incode.welcome_sdk.data.remote.beans.ab):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.incode.welcome_sdk.data.b bVar) {
            super(1);
            this.f12782e = bVar;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12764i + 85;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12764i + 7;
        f12763h = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        VideoStreamingManager videoStreamingManager = (VideoStreamingManager) objArr[0];
        int i2 = 2 % 2;
        int i3 = f12763h + 77;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsNotBlank = StringUtils.isNotBlank(videoStreamingManager.f12767c);
        int i5 = f12763h + 57;
        f12764i = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(zIsNotBlank);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OpenTokSessionWrapper getOpenTokSession(com.incode.welcome_sdk.data.b bVar) {
        int i2 = 2 % 2;
        int i3 = f12763h + 103;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        OpenTokSessionWrapper openTokSessionWrapper = this.f12765a.get(bVar);
        Intrinsics.checkNotNull(openTokSessionWrapper);
        OpenTokSessionWrapper openTokSessionWrapper2 = openTokSessionWrapper;
        int i5 = f12763h + 91;
        f12764i = i5 % 128;
        int i6 = i5 % 2;
        return openTokSessionWrapper2;
    }

    public final MirrorVideoCapturer createCapturer(Display display, Camera.Size size, Camera.CameraInfo cameraInfo) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(display, "");
        Intrinsics.checkNotNullParameter(size, "");
        Intrinsics.checkNotNullParameter(cameraInfo, "");
        MirrorVideoCapturer mirrorVideoCapturer = new MirrorVideoCapturer(display, size, Publisher.CameraCaptureFrameRate.FPS_30, cameraInfo);
        int i3 = f12763h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12764i = i3 % 128;
        if (i3 % 2 == 0) {
            return mirrorVideoCapturer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PublisherWrapper createPublisher(OpenTokSessionWrapper openTokSessionWrapper, MirrorVideoCapturer mirrorVideoCapturer, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(openTokSessionWrapper, "");
        Intrinsics.checkNotNullParameter(mirrorVideoCapturer, "");
        Timber.Forest.d("res (old): " + mirrorVideoCapturer.getActualResolution() + " frame: " + mirrorVideoCapturer.getPreferredFrameRate(), new Object[0]);
        Publisher publisherBuild = new Publisher.Builder(this.f12766b).resolution(mirrorVideoCapturer.getActualResolution()).frameRate(mirrorVideoCapturer.getPreferredFrameRate()).capturer(mirrorVideoCapturer).audioTrack(z2).build();
        publisherBuild.setStyle("STYLE_VIDEO_SCALE", "STYLE_VIDEO_FILL");
        Intrinsics.checkNotNull(publisherBuild);
        PublisherWrapper publisherWrapper = new PublisherWrapper(this, publisherBuild, openTokSessionWrapper);
        int i3 = f12764i + 33;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        return publisherWrapper;
    }

    public final PublisherWrapper createPublisher(OpenTokSessionWrapper openTokSessionWrapper, CameraXVideoCapturer cameraXVideoCapturer, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(openTokSessionWrapper, "");
        Intrinsics.checkNotNullParameter(cameraXVideoCapturer, "");
        Timber.Forest.d("res: " + cameraXVideoCapturer.getOpenTokCaptureResolution() + " frame: " + cameraXVideoCapturer.getPreferredFrameRate(), new Object[0]);
        Publisher publisherBuild = new Publisher.Builder(this.f12766b).resolution(cameraXVideoCapturer.getOpenTokCaptureResolution()).frameRate(cameraXVideoCapturer.getPreferredFrameRate()).capturer(cameraXVideoCapturer).audioTrack(z2).build();
        publisherBuild.setStyle("STYLE_VIDEO_SCALE", "STYLE_VIDEO_FILL");
        Intrinsics.checkNotNull(publisherBuild);
        PublisherWrapper publisherWrapper = new PublisherWrapper(this, publisherBuild, openTokSessionWrapper);
        int i3 = f12763h + 59;
        f12764i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return publisherWrapper;
    }

    static final class a extends Lambda implements Function1<Disposable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12772a = 0;

        /* JADX INFO: renamed from: d */
        private static int f12773d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f12774b;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f12773d + 39;
            f12772a = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.d("Starting video recording: " + this.f12774b, new Object[0]);
            int i5 = f12772a + 109;
            f12773d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Disposable disposable) {
            int i2 = 2 % 2;
            int i3 = f12773d + 51;
            f12772a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f12773d + 35;
            f12772a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f12774b = str;
        }
    }

    public final Completable startOpenTokStreamRecording(String str, com.incode.welcome_sdk.data.b bVar) {
        Single<ResponseSuccess> singleStartOpenTokStreamRecording;
        int i2 = 2 % 2;
        int i3 = f12763h + 111;
        f12764i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bVar, "");
            int iD = b.a.e.d();
            int iD2 = b.a.e.d();
            int iD3 = b.a.e.d();
            ((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{this}, iD2, iD3, iD)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        int iD4 = b.a.e.d();
        int iD5 = b.a.e.d();
        int iD6 = b.a.e.d();
        if (((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{this}, iD5, iD6, iD4)).booleanValue()) {
            this.f12768d.persistVideoRecordingId(str);
            singleStartOpenTokStreamRecording = this.f12768d.startOpenTokStreamRecordingAuth(this.f12767c, str, "720x1280", bVar.e());
        } else {
            singleStartOpenTokStreamRecording = this.f12768d.startOpenTokStreamRecording(str, "720x1280", bVar.e());
            int i4 = f12763h + 111;
            f12764i = i4 % 128;
            int i5 = i4 % 2;
        }
        final a aVar = new a(str);
        Single<ResponseSuccess> singleDoOnSubscribe = singleStartOpenTokStreamRecording.doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VideoStreamingManager.d(aVar, obj2);
            }
        });
        final i iVar = i.f12807b;
        Single<ResponseSuccess> singleDoOnSuccess = singleDoOnSubscribe.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VideoStreamingManager.c(iVar, obj2);
            }
        });
        final g gVar = g.f12799d;
        Completable completableIgnoreElement = singleDoOnSuccess.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                VideoStreamingManager.g(gVar, obj2);
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "");
        return completableIgnoreElement;
    }

    static final class i extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12806a = 0;

        /* JADX INFO: renamed from: b */
        public static final i f12807b = new i();

        /* JADX INFO: renamed from: c */
        private static int f12808c = 1;

        /* JADX INFO: renamed from: d */
        private static int f12809d = 0;

        /* JADX INFO: renamed from: e */
        private static int f12810e = 1;

        private static void d(ResponseSuccess responseSuccess) {
            Boolean boolValueOf;
            int i2 = 2 % 2;
            Timber.Forest forest = Timber.Forest;
            if (responseSuccess != null) {
                int i3 = f12806a + 65;
                f12810e = i3 % 128;
                int i4 = i3 % 2;
                boolValueOf = Boolean.valueOf(responseSuccess.isSuccess());
            } else {
                int i5 = f12810e + 99;
                f12806a = i5 % 128;
                int i6 = i5 % 2;
                boolValueOf = null;
            }
            forest.d("Recording started: " + boolValueOf, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f12806a + 79;
            f12810e = i3 % 128;
            int i4 = i3 % 2;
            d(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 23 / 0;
            }
            int i6 = f12810e + 37;
            f12806a = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f12809d + 61;
            f12808c = i2 % 128;
            int i3 = i2 % 2;
        }

        i() {
            super(1);
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12764i + 31;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12764i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12763h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class g extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12796a = 0;

        /* JADX INFO: renamed from: b */
        private static int f12797b = 1;

        /* JADX INFO: renamed from: c */
        private static int f12798c = 1;

        /* JADX INFO: renamed from: d */
        public static final g f12799d = new g();

        /* JADX INFO: renamed from: e */
        private static int f12800e = 0;

        private static void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12797b + 81;
            f12796a = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e(th, "Error while recording is being started.", new Object[1]);
            } else {
                Timber.Forest.e(th, "Error while recording is being started.", new Object[0]);
            }
            int i4 = f12796a + 95;
            f12797b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12797b + 67;
            f12796a = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f12798c + 35;
            f12800e = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        g() {
            super(1);
        }
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12763h + 75;
        f12764i = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12764i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12763h + 11;
        f12764i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return null;
    }

    static final class j extends Lambda implements Function1<Disposable, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f12811b = 0;

        /* JADX INFO: renamed from: d */
        private static int f12812d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ String f12813a;

        private void e() {
            int i2 = 2 % 2;
            int i3 = f12811b + 71;
            f12812d = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.d("Stopping video recording: " + this.f12813a, new Object[0]);
            } else {
                Timber.Forest.d("Stopping video recording: " + this.f12813a, new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Disposable disposable) {
            int i2 = 2 % 2;
            int i3 = f12811b + 31;
            f12812d = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 18 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(1);
            this.f12813a = str;
        }
    }

    public final Completable stopOpenTokStreamRecording(String str, Function0<Unit> function0) {
        Single<ResponseSuccess> singleStopOpenTokStreamRecording;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int iD = b.a.e.d();
        int iD2 = b.a.e.d();
        int iD3 = b.a.e.d();
        if (((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{this}, iD2, iD3, iD)).booleanValue()) {
            int i3 = f12764i + 57;
            f12763h = i3 % 128;
            if (i3 % 2 == 0) {
                this.f12768d.stopOpenTokStreamRecordingAuth(this.f12767c, str, function0);
                throw null;
            }
            singleStopOpenTokStreamRecording = this.f12768d.stopOpenTokStreamRecordingAuth(this.f12767c, str, function0);
        } else {
            singleStopOpenTokStreamRecording = this.f12768d.stopOpenTokStreamRecording(str, function0);
            int i4 = f12763h + 57;
            f12764i = i4 % 128;
            int i5 = i4 % 2;
        }
        final j jVar = new j(str);
        Single<ResponseSuccess> singleDoOnSubscribe = singleStopOpenTokStreamRecording.doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.h(jVar, obj);
            }
        });
        final h hVar = h.f12802b;
        Single<ResponseSuccess> singleDoOnSuccess = singleDoOnSubscribe.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.f(hVar, obj);
            }
        });
        final f fVar = f.f12794d;
        Completable completableIgnoreElement = singleDoOnSuccess.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.j(fVar, obj);
            }
        }).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Action
            public final void run() {
                VideoStreamingManager.a(this.f$0);
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "");
        return completableIgnoreElement;
    }

    static final class h extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12801a = 1;

        /* JADX INFO: renamed from: b */
        public static final h f12802b = new h();

        /* JADX INFO: renamed from: c */
        private static int f12803c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12804d = 1;

        /* JADX INFO: renamed from: e */
        private static int f12805e = 0;

        private static void c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f12801a + 59;
            f12805e = i3 % 128;
            Boolean boolValueOf = null;
            if (i3 % 2 != 0) {
                Timber.Forest forest = Timber.Forest;
                throw null;
            }
            Timber.Forest forest2 = Timber.Forest;
            if (responseSuccess != null) {
                boolValueOf = Boolean.valueOf(responseSuccess.isSuccess());
            } else {
                int i4 = f12805e + 89;
                f12801a = i4 % 128;
                int i5 = i4 % 2;
            }
            forest2.d("Recording stopped: " + boolValueOf, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f12801a + 17;
            f12805e = i3 % 128;
            int i4 = i3 % 2;
            c(responseSuccess);
            Unit unit = Unit.INSTANCE;
            int i5 = f12805e + 25;
            f12801a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f12804d + 55;
            f12803c = i2 % 128;
            int i3 = i2 % 2;
        }

        h() {
            super(1);
        }
    }

    public static final void h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12763h + 61;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12763h + 71;
        f12764i = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class f extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12791a = 0;

        /* JADX INFO: renamed from: b */
        private static int f12792b = 1;

        /* JADX INFO: renamed from: c */
        private static int f12793c = 0;

        /* JADX INFO: renamed from: d */
        public static final f f12794d = new f();

        /* JADX INFO: renamed from: e */
        private static int f12795e = 1;

        private static void b(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12793c + 59;
            f12795e = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.e(th, "Error while recording is being stopped.", new Object[1]);
            } else {
                Timber.Forest.e(th, "Error while recording is being stopped.", new Object[0]);
            }
            int i4 = f12793c + 69;
            f12795e = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12793c + 111;
            f12795e = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f12792b + 27;
            f12791a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 16 / 0;
            }
        }

        f() {
            super(1);
        }
    }

    public static final void f(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12764i + 117;
        f12763h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 50 / 0;
        }
    }

    public static final void j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12763h + 39;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12764i + 23;
        f12763h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final void a(VideoStreamingManager videoStreamingManager) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoStreamingManager, "");
        int iD = b.a.e.d();
        int iD2 = b.a.e.d();
        int iD3 = b.a.e.d();
        Object obj = null;
        if (((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{videoStreamingManager}, iD2, iD3, iD)).booleanValue()) {
            int i3 = f12763h + 5;
            f12764i = i3 % 128;
            int i4 = i3 % 2;
            videoStreamingManager.f12768d.persistVideoRecordingId(null);
        }
        int i5 = f12764i + 65;
        f12763h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Completable awaitAllStreamsSuccessfullyClosed$default(VideoStreamingManager videoStreamingManager, long j2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f12763h + 103;
        f12764i = i4 % 128;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            j2 = 4;
        }
        Completable completableAwaitAllStreamsSuccessfullyClosed = videoStreamingManager.awaitAllStreamsSuccessfullyClosed(j2);
        int i5 = f12764i + 3;
        f12763h = i5 % 128;
        if (i5 % 2 != 0) {
            return completableAwaitAllStreamsSuccessfullyClosed;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final CompletableSource d(VideoStreamingManager videoStreamingManager) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoStreamingManager, "");
        Timber.Forest.d("Awaits to close all streams.", new Object[0]);
        ArrayList arrayList = new ArrayList();
        Collection<OpenTokSessionWrapper> collectionValues = videoStreamingManager.f12765a.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        int i3 = f12764i + 85;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f12764i + 33;
            f12763h = i5 % 128;
            if (i5 % 2 == 0) {
                ((OpenTokSessionWrapper) it.next()).getPublisherWrapper();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OpenTokSessionWrapper openTokSessionWrapper = (OpenTokSessionWrapper) it.next();
            if (openTokSessionWrapper.getPublisherWrapper() != null) {
                Timber.Forest.d("Stream still opened for module " + openTokSessionWrapper.getModule() + Global.COLON, new Object[0]);
                arrayList.add(openTokSessionWrapper.awaitStreamSuccessfullyClosedEvent());
            }
        }
        if (!arrayList.isEmpty()) {
            return Completable.concat(arrayList);
        }
        int i6 = f12764i + 25;
        f12763h = i6 % 128;
        int i7 = i6 % 2;
        return Completable.complete();
    }

    public static final void d() {
        int i2 = 2 % 2;
        int i3 = f12764i + 41;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("All OpenTok streams are closed.", new Object[0]);
        int i5 = f12764i + 103;
        f12763h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12786a = 0;

        /* JADX INFO: renamed from: b */
        private static int f12787b = 0;

        /* JADX INFO: renamed from: c */
        private static int f12788c = 1;

        /* JADX INFO: renamed from: d */
        public static final e f12789d = new e();

        /* JADX INFO: renamed from: e */
        private static int f12790e = 1;

        private static void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12786a + 55;
            f12790e = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Error occurred while awaiting a stream close event", new Object[0]);
            int i5 = f12786a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f12790e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12786a + 83;
            f12790e = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12786a + 11;
            f12790e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f12787b + 91;
            f12788c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    public static final void i(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12764i + 43;
        f12763h = i3 % 128;
        if (i3 % 2 != 0) {
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

    public final Completable awaitAllStreamsSuccessfullyClosed(long j2) {
        int i2 = 2 % 2;
        int i3 = f12763h + 109;
        f12764i = i3 % 128;
        int i4 = i3 % 2;
        Completable completableTimeout = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VideoStreamingManager.d(this.f$0);
            }
        }).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Action
            public final void run() {
                VideoStreamingManager.d();
            }
        }).timeout(j2, TimeUnit.SECONDS);
        final e eVar = e.f12789d;
        Completable completableOnErrorComplete = completableTimeout.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoStreamingManager.i(eVar, obj);
            }
        }).onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "");
        int i5 = f12763h + 13;
        f12764i = i5 % 128;
        int i6 = i5 % 2;
        return completableOnErrorComplete;
    }

    public static final void g(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iD = b.a.e.d();
        a(b.a.e.d(), 1183362599, -1183362599, objArr, b.a.e.d(), b.a.e.d(), iD);
    }

    public static final void e(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iD = b.a.e.d();
        a(b.a.e.d(), -2117612121, 2117612123, objArr, b.a.e.d(), b.a.e.d(), iD);
    }

    public final Completable awaitAllStreamsSuccessfullyClosed() {
        int i2 = 2 % 2;
        int i3 = f12764i + 7;
        f12763h = i3 % 128;
        int i4 = i3 % 2;
        Completable completableAwaitAllStreamsSuccessfullyClosed$default = awaitAllStreamsSuccessfullyClosed$default(this, 0L, 1, null);
        int i5 = f12763h + 75;
        f12764i = i5 % 128;
        int i6 = i5 % 2;
        return completableAwaitAllStreamsSuccessfullyClosed$default;
    }

    private final boolean c() {
        int iD = b.a.e.d();
        int iD2 = b.a.e.d();
        int iD3 = b.a.e.d();
        return ((Boolean) a(b.a.e.d(), -468139170, 468139171, new Object[]{this}, iD2, iD3, iD)).booleanValue();
    }
}
