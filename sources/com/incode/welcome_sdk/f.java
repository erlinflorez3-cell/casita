package com.incode.welcome_sdk;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.hbisoft.hbrecorder.HBRecorder;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.k;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.g;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c */
    public static final c f10224c = new c((byte) 0);

    /* JADX INFO: renamed from: f */
    private static int f10225f = 1;

    /* JADX INFO: renamed from: g */
    private static int f10226g = 1;

    /* JADX INFO: renamed from: h */
    private static int f10227h = 0;

    /* JADX INFO: renamed from: j */
    private static int f10228j = 0;

    /* JADX INFO: renamed from: a */
    private HBRecorder f10229a;

    /* JADX INFO: renamed from: b */
    private final Context f10230b;

    /* JADX INFO: renamed from: d */
    private Disposable f10231d;

    /* JADX INFO: renamed from: e */
    private final IncodeWelcomeRepository f10232e;

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = ~(i8 | i9 | i2);
        int i11 = ~i2;
        int i12 = (~(i8 | i11)) | (~(i9 | i6 | i2));
        int i13 = (~(i2 | i8)) | (~(i9 | i11));
        int i14 = i6 + i3 + i7 + ((-1255669517) * i5) + (533247121 * i4);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-1895547823)) - 858849280) + ((-1895547823) * i3) + (i10 * (-204618832)) + (i12 * (-204618832)) + ((-204618832) * i13) + ((-2100166656) * i7) + (760610816 * i5) + ((-1057882112) * i4) + (1344208896 * i15);
        int i17 = ((i6 * (-122328301)) - 2132886715) + (i3 * (-122328301)) + (i10 * 272) + (i12 * 272) + (i13 * 272) + (i7 * (-122328029)) + (i5 * (-1196579527)) + (i4 * 656595923) + (i15 * 138215424);
        return i16 + ((i17 * i17) * (-833028096)) != 1 ? c(objArr) : e(objArr);
    }

    public f(Context context, IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f10230b = context;
        this.f10232e = incodeWelcomeRepository;
    }

    public static final /* synthetic */ Context c(f fVar) {
        int i2 = 2 % 2;
        int i3 = f10227h;
        int i4 = i3 + 113;
        f10225f = i4 % 128;
        int i5 = i4 % 2;
        Context context = fVar.f10230b;
        int i6 = i3 + 51;
        f10225f = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        throw null;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        HBRecorder hBRecorder = this.f10229a;
        if (hBRecorder != null) {
            if (hBRecorder.isBusyRecording()) {
                int i3 = f10227h + 81;
                f10225f = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = f10225f + 41;
            f10227h = i5 % 128;
            int i6 = i5 % 2;
        }
        return false;
    }

    static final class e extends Lambda implements Function1<Lifecycle.Event, Boolean> {

        /* JADX INFO: renamed from: a */
        private static int f10245a = 1;

        /* JADX INFO: renamed from: b */
        private static int f10246b = 1;

        /* JADX INFO: renamed from: c */
        public static final e f10247c = new e();

        /* JADX INFO: renamed from: d */
        private static int f10248d = 0;

        /* JADX INFO: renamed from: e */
        private static int f10249e = 0;

        private static Boolean a(Lifecycle.Event event) {
            int i2 = 2 % 2;
            int i3 = f10246b + 25;
            f10248d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(event, "");
            Boolean boolValueOf = Boolean.valueOf(event == Lifecycle.Event.ON_STOP);
            int i5 = f10248d + 49;
            f10246b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
            }
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(Lifecycle.Event event) {
            int i2 = 2 % 2;
            int i3 = f10248d + 75;
            f10246b = i3 % 128;
            int i4 = i3 % 2;
            Boolean boolA = a(event);
            int i5 = f10248d + 57;
            f10246b = i5 % 128;
            if (i5 % 2 != 0) {
                return boolA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f10249e + 1;
            f10245a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    public static final boolean e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10225f + 51;
        f10227h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i5 = f10227h + 89;
        f10225f = i5 % 128;
        if (i5 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f10233a = 1;

        /* JADX INFO: renamed from: b */
        private static int f10234b = 1;

        /* JADX INFO: renamed from: c */
        private static int f10235c = 0;

        /* JADX INFO: renamed from: d */
        public static final b f10236d = new b();

        /* JADX INFO: renamed from: e */
        private static int f10237e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f10234b + 17;
            f10237e = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f10237e + 49;
            f10234b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f10234b + 15;
            f10237e = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th);
            int i5 = f10234b + 25;
            f10237e = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f10235c + 79;
            f10233a = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f10240c = 0;

        /* JADX INFO: renamed from: d */
        private static int f10241d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ f f10242a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f10243b;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ com.incode.welcome_sdk.modules.g f10244e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f10240c + 53;
            f10241d = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            int i5 = f10241d + 9;
            f10240c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x001a, code lost:
        
            if (com.incode.welcome_sdk.commons.utils.StringUtils.isNotBlank(r5.f10243b) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
        
            timber.log.Timber.Forest.d("Schedule screen recording upload, module: %s", r5.f10244e);
            r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6702c;
            r3 = com.incode.welcome_sdk.f.c(r5.f10242a);
            r2 = r5.f10244e;
            r1 = r5.f10243b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.d.c(r3, r2, r1);
            r1 = com.incode.welcome_sdk.f.d.f10241d + 109;
            com.incode.welcome_sdk.f.d.f10240c = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            if ((r1 % 2) != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        
            if (com.incode.welcome_sdk.commons.utils.StringUtils.isNotBlank(r5.f10243b) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        
            timber.log.Timber.Forest.e("API token is blank. Remove video instead of uploading.", new java.lang.Object[0]);
            r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6702c;
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.d.c(com.incode.welcome_sdk.f.c(r5.f10242a), r5.f10244e);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e() {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.f.d.f10240c
                int r1 = r0 + 9
                int r0 = r1 % 128
                com.incode.welcome_sdk.f.d.f10241d = r0
                int r1 = r1 % r4
                r3 = 0
                if (r1 != 0) goto L49
                java.lang.String r0 = r5.f10243b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r1 = com.incode.welcome_sdk.commons.utils.StringUtils.isNotBlank(r0)
                r0 = 46
                int r0 = r0 / r3
                if (r1 == 0) goto L59
            L1c:
                timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                com.incode.welcome_sdk.modules.g r0 = r5.f10244e
                java.lang.Object[] r1 = new java.lang.Object[]{r0}
                java.lang.String r0 = "Schedule screen recording upload, module: %s"
                r2.d(r0, r1)
                com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$d r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6702c
                com.incode.welcome_sdk.f r0 = r5.f10242a
                android.content.Context r3 = com.incode.welcome_sdk.f.c(r0)
                com.incode.welcome_sdk.modules.g r2 = r5.f10244e
                java.lang.String r1 = r5.f10243b
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.d.c(r3, r2, r1)
                int r0 = com.incode.welcome_sdk.f.d.f10241d
                int r1 = r0 + 109
                int r0 = r1 % 128
                com.incode.welcome_sdk.f.d.f10240c = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L54
                return
            L49:
                java.lang.String r0 = r5.f10243b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = com.incode.welcome_sdk.commons.utils.StringUtils.isNotBlank(r0)
                if (r0 == 0) goto L59
                goto L1c
            L54:
                r0 = 0
                r0.hashCode()
                throw r0
            L59:
                timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                java.lang.String r1 = "API token is blank. Remove video instead of uploading."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r2.e(r1, r0)
                com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$d r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6702c
                com.incode.welcome_sdk.f r0 = r5.f10242a
                android.content.Context r1 = com.incode.welcome_sdk.f.c(r0)
                com.incode.welcome_sdk.modules.g r0 = r5.f10244e
                com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.d.c(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.f.d.e():void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, com.incode.welcome_sdk.modules.g gVar, f fVar) {
            super(1);
            this.f10243b = str;
            this.f10244e = gVar;
            this.f10242a = fVar;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f10225f + 105;
        f10227h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            return null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = 81 / 0;
        return null;
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10227h + 121;
        f10225f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f10227h + 87;
        f10225f = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void c(f fVar, String str, com.incode.welcome_sdk.modules.g gVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fVar, "");
        Intrinsics.checkNotNullParameter(gVar, "");
        fVar.f10231d = null;
        fVar.d();
        Single<Long> singleTimer = Single.timer(2L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
        final d dVar = new d(str, gVar, fVar);
        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.f$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.d(dVar, obj);
            }
        };
        final b bVar = b.f10236d;
        singleTimer.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.f$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.a(bVar, obj);
            }
        });
        int i3 = f10225f + 125;
        f10227h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
    }

    public final Disposable a(final com.incode.welcome_sdk.modules.g gVar, IncodeWelcome.RecordingPermissionData recordingPermissionData, Observable<Lifecycle.Event> observable, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10225f + 111;
        f10227h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(gVar, "");
        Intrinsics.checkNotNullParameter(recordingPermissionData, "");
        Intrinsics.checkNotNullParameter(observable, "");
        Timber.Forest.d("startScreenRecording: %s", gVar);
        Disposable disposable = this.f10231d;
        if (disposable != null) {
            int i5 = f10227h + 7;
            f10225f = i5 % 128;
            int i6 = i5 % 2;
            disposable.dispose();
        } else {
            int i7 = f10225f + 5;
            f10227h = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 3;
            }
        }
        final String token = this.f10232e.getToken();
        HBRecorder hBRecorder = new HBRecorder(this.f10230b.getApplicationContext(), new com.incode.welcome_sdk.commons.extensions.g(this.f10232e, gVar));
        hBRecorder.enableCustomSettings();
        hBRecorder.isAudioEnabled(z2);
        hBRecorder.setVideoEncoder("DEFAULT");
        hBRecorder.setScreenDimensions(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 480);
        hBRecorder.setVideoFrameRate(24);
        hBRecorder.setVideoBitrate(2000000);
        hBRecorder.setOutputPath(gVar.e(this.f10232e));
        hBRecorder.setFileName(gVar.d());
        hBRecorder.startScreenRecording(recordingPermissionData.getData(), recordingPermissionData.getResultCode());
        Timber.Forest.d("HBRecorder startScreenRecording called", new Object[0]);
        this.f10229a = hBRecorder;
        b(gVar);
        com.incode.welcome_sdk.commons.m.b(new k.e(gVar));
        final e eVar = e.f10247c;
        Disposable disposableSubscribe = observable.filter(new Predicate() { // from class: com.incode.welcome_sdk.f$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return f.e(eVar, obj);
            }
        }).take(1L).doFinally(new Action() { // from class: com.incode.welcome_sdk.f$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Action
            public final void run() {
                f.c(this.f$0, token, gVar);
            }
        }).subscribe();
        this.f10231d = disposableSubscribe;
        Intrinsics.checkNotNull(disposableSubscribe);
        return disposableSubscribe;
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f10227h + 35;
        f10225f = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("stopScreenRecording", new Object[0]);
        HBRecorder hBRecorder = this.f10229a;
        if (hBRecorder == null) {
            int i5 = f10225f + 15;
            f10227h = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (hBRecorder != null) {
            hBRecorder.stopScreenRecording();
            int i7 = f10225f + 43;
            f10227h = i7 % 128;
            int i8 = i7 % 2;
        }
        Timber.Forest.d("HBRecorder stopScreenRecording called", new Object[0]);
        this.f10229a = null;
        if (c.a()) {
            int i9 = f10227h + 27;
            f10225f = i9 % 128;
            int i10 = i9 % 2;
            IncodeWelcome.Companion companion = IncodeWelcome.Companion;
            IncodeWelcome.recordingPermissionData = null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i2 = 2 % 2;
        Disposable disposable = ((f) objArr[0]).f10231d;
        if (disposable == null) {
            return null;
        }
        int i3 = f10227h + 1;
        f10225f = i3 % 128;
        int i4 = i3 % 2;
        disposable.dispose();
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            throw null;
        }
        int i5 = f10227h + 125;
        f10225f = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void b(com.incode.welcome_sdk.modules.g gVar) {
        int i2 = 2 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f10232e;
        g.b bVar = com.incode.welcome_sdk.modules.g.f10683c;
        Event eventE = g.b.e(gVar);
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), this.f10232e.getCurrentScreenName().name());
        Unit unit = Unit.INSTANCE;
        EventUtils.sendEvent(incodeWelcomeRepository, eventE, (Modules) null, (HashMap<String, Object>) map);
        int i3 = f10225f + 81;
        f10227h = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class c {

        /* JADX INFO: renamed from: a */
        private static int f10238a = 0;

        /* JADX INFO: renamed from: c */
        private static int f10239c = 1;

        private c() {
        }

        public static boolean a() {
            int i2 = 2 % 2;
            int i3 = f10238a + 7;
            f10239c = i3 % 128;
            if (i3 % 2 == 0) {
                if (Build.VERSION.SDK_INT < 71) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT < 34) {
                return false;
            }
            int i4 = f10238a;
            int i5 = i4 + 125;
            f10239c = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 37;
            f10239c = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        int i2 = f10228j + 123;
        f10226g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void d(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        a(iD, -532558290, com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), objArr, com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), 532558290, iD2);
    }

    public final Unit a() {
        int iD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD3 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        return (Unit) a(iD, -2091190666, com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), new Object[]{this}, iD3, 2091190667, iD2);
    }
}
