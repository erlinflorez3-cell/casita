package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.httpinterceptors.e;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.ad;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.Something;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class FrontId extends IScanStep<Bitmap, ValidationState> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: p */
    private static int f12263p = 0;

    /* JADX INFO: renamed from: r */
    private static char[] f12264r = null;

    /* JADX INFO: renamed from: t */
    private static int f12265t = 0;

    /* JADX INFO: renamed from: a */
    private final boolean f12266a;

    /* JADX INFO: renamed from: b */
    private final String f12267b;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcomeRepository f12268c;

    /* JADX INFO: renamed from: d */
    private IdCaptureKitAndroid f12269d;

    /* JADX INFO: renamed from: e */
    private final VideoRecordingContract.View f12270e;

    /* JADX INFO: renamed from: f */
    private boolean f12271f;

    /* JADX INFO: renamed from: g */
    private boolean f12272g;

    /* JADX INFO: renamed from: h */
    private boolean f12273h;

    /* JADX INFO: renamed from: i */
    private CompositeDisposable f12274i;

    /* JADX INFO: renamed from: j */
    private a f12275j;

    /* JADX INFO: renamed from: k */
    private int f12276k;

    /* JADX INFO: renamed from: l */
    private Scheduler f12277l;

    /* JADX INFO: renamed from: m */
    private boolean f12278m;

    /* JADX INFO: renamed from: n */
    private ArrayList<String> f12279n;

    /* JADX INFO: renamed from: o */
    private ValidationState f12280o;

    private static String $$c(short s2, int i2, short s3) {
        byte[] bArr = $$a;
        int i3 = i2 * 3;
        int i4 = s2 + 102;
        int i5 = s3 + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i3 + i4;
        }
        while (true) {
            i6++;
            i5++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~i2) | i9;
        int i11 = i8 | (~i10);
        int i12 = i2 | i9;
        int i13 = ~(i10 | i6);
        int i14 = i3 + i6 + i4 + (1075552530 * i5) + ((-1519595880) * i7);
        int i15 = i14 * i14;
        int i16 = (((-1050772794) * i3) - 1639710720) + ((-2116975300) * i6) + (i11 * (-533101253)) + (533101253 * i12) + ((-533101253) * i13) + ((-1583874048) * i4) + ((-189792256) * i5) + (1111490560 * i7) + (1415839744 * i15);
        int i17 = (i3 * 251836610) + 257048825 + (i6 * 251838484) + (i11 * 937) + (i12 * (-937)) + (i13 * 937) + (i4 * 251837547) + (i5 * 1710852742) + (i7 * (-1855850104)) + (i15 * (-1244921856));
        int i18 = i16 + (i17 * i17 * (-1300496384));
        if (i18 == 1) {
            return c(objArr);
        }
        if (i18 == 2) {
            return d(objArr);
        }
        if (i18 != 3) {
            FrontId frontId = (FrontId) objArr[0];
            Something something = (Something) objArr[1];
            int i19 = 2 % 2;
            int i20 = f12263p + 35;
            f12265t = i20 % 128;
            int i21 = i20 % 2;
            ScanResult scanResultE = frontId.e((Bitmap) something.f12147c);
            int i22 = f12265t + 77;
            f12263p = i22 % 128;
            int i23 = i22 % 2;
            return scanResultE;
        }
        FrontId frontId2 = (FrontId) objArr[0];
        int i24 = 2 % 2;
        int i25 = f12263p + 89;
        f12265t = i25 % 128;
        int i26 = i25 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(frontId2.f12268c, Event.VIDEO_SELFIE_FRONT_ID_ATTEMPT_FAILED, Modules.VIDEO_ONBOARDING, frontId2.f12279n);
        frontId2.d(UiState.ERROR, ValidationFeedback.G);
        frontId2.f12270e.showNoNetworkMessage(VideoSelfieScanState.f12199e);
        ScanResult scanResult = ScanResult.ERROR;
        int i27 = f12263p + 31;
        f12265t = i27 % 128;
        int i28 = i27 % 2;
        return scanResult;
    }

    static void init$0() {
        $$a = new byte[]{91, 80, 41, -1};
        $$b = 115;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* bridge */ /* synthetic */ void addProcessingErrorState(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12263p + 55;
        f12265t = i3 % 128;
        int i4 = i3 % 2;
        addProcessingErrorState2(validationState);
        int i5 = f12263p + 43;
        f12265t = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* synthetic */ void showRealtimeFeedback(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12263p + 101;
        f12265t = i3 % 128;
        int i4 = i3 % 2;
        showRealtimeFeedback2(validationState);
        int i5 = f12265t + 41;
        f12263p = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    enum a {
        UNKNOWN,
        ID_TYPE_MATCH,
        ID_PHOTO_MATCH,
        OCR_MATCH;


        /* JADX INFO: renamed from: f */
        private static int f12290f = 0;

        /* JADX INFO: renamed from: g */
        private static int f12291g = 0;

        /* JADX INFO: renamed from: h */
        private static int f12292h = 1;

        /* JADX INFO: renamed from: i */
        private static int f12293i = 1;

        public static a valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f12292h + 13;
            f12291g = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            int i5 = f12291g + 69;
            f12292h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return aVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f12292h + 21;
            f12291g = i3 % 128;
            int i4 = i3 % 2;
            a[] aVarArrValuesCustom = values();
            if (i4 == 0) {
                return (a[]) aVarArrValuesCustom.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f12290f + 15;
            f12293i = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
            }
        }
    }

    public FrontId(VideoRecordingContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, Observable<IdCaptureKitAndroid> observable, boolean z2, int i2, Scheduler scheduler, boolean z3, boolean z4) {
        super(i2, view);
        this.f12267b = FrontId.class.getName();
        this.f12274i = new CompositeDisposable();
        this.f12276k = 0;
        this.f12270e = view;
        this.f12268c = incodeWelcomeRepository;
        this.f12271f = z2;
        this.f12266a = CameraFacing.BACK.getCameraFacing() == i2;
        this.f12279n = new ArrayList<>();
        this.f12277l = scheduler;
        this.f12274i.add(observable.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d((IdCaptureKitAndroid) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Timber.e((Throwable) obj);
            }
        }));
        this.f12273h = z3;
        this.f12278m = z4;
    }

    public /* synthetic */ void d(IdCaptureKitAndroid idCaptureKitAndroid) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12263p;
        int i4 = i3 + 55;
        f12265t = i4 % 128;
        int i5 = i4 % 2;
        this.f12269d = idCaptureKitAndroid;
        int i6 = i3 + 123;
        f12265t = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public Point getDesiredPreviewSize(boolean z2) {
        return new Point(PhotoshopDirectory.TAG_COUNT_INFORMATION, z2 ? 1440 : 1920);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void start() {
        int i2 = 2 % 2;
        int i3 = f12265t + 91;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        this.f12270e.startVideoSelfieProgressStep(VideoSelfieScanState.f12199e);
        d(UiState.DEFAULT, ValidationFeedback.f11699d);
        c(true);
        d(true);
        int i5 = f12263p + 87;
        f12265t = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean processesFrames() {
        int i2 = 2 % 2;
        int i3 = f12265t + 99;
        f12263p = i3 % 128;
        return i3 % 2 != 0;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public Observable<ScanResult> findAndProcess(Bitmap bitmap, FacePositionConstraint facePositionConstraint, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12263p + 89;
        f12265t = i3 % 128;
        int i4 = i3 % 2;
        Observable<ScanResult> map = Observable.just(d(bitmap, facePositionConstraint)).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((Something) obj);
            }
        }).observeOn(this.f12277l).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FrontId.e(runnable, (Something) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Something) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FrontId.d((ScanResult) obj);
            }
        }).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FrontId.a(runnable, (ScanResult) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((ScanResult) obj);
            }
        });
        int i5 = f12265t + 29;
        f12263p = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Something a(Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12263p + 53;
        f12265t = i3 % 128;
        if (i3 % 2 == 0) {
            addProcessingErrorState2((ValidationState) something.f12148d);
            showRealtimeFeedback2((ValidationState) something.f12148d);
            int i4 = f12263p + 45;
            f12265t = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return something;
        }
        addProcessingErrorState2((ValidationState) something.f12148d);
        showRealtimeFeedback2((ValidationState) something.f12148d);
        throw null;
    }

    public static /* synthetic */ boolean e(Runnable runnable, Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12265t + 29;
        f12263p = i3 % 128;
        if (i3 % 2 != 0) {
            if (something.f12146b == null) {
                runnable.run();
                return false;
            }
            int i4 = f12263p + 57;
            f12265t = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        Rect rect = something.f12146b;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ObservableSource d(ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12265t + 101;
        f12263p = i3 % 128;
        if (i3 % 2 != 0) {
            Observable observableJust = Observable.just(scanResult);
            if (scanResult != ScanResult.RETRY) {
                return observableJust;
            }
            int i4 = f12265t + 73;
            f12263p = i4 % 128;
            if (i4 % 2 != 0) {
                return observableJust.delay(2L, TimeUnit.SECONDS);
            }
            int i5 = 58 / 0;
            return observableJust.delay(2L, TimeUnit.SECONDS);
        }
        Observable.just(scanResult);
        ScanResult scanResult2 = ScanResult.RETRY;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean a(java.lang.Runnable r4, com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r5) throws java.lang.Exception {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12263p
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12265t = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L3a
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r1 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
            r0 = 62
            int r0 = r0 / r2
            if (r5 != r1) goto L19
        L16:
            r4.run()
        L19:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.OK
            if (r5 == r0) goto L33
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
            if (r5 == r0) goto L33
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12265t
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12263p = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L35
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r1 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR
            r0 = 22
            int r0 = r0 / r2
            if (r5 != r1) goto L3f
        L33:
            r0 = 1
            return r0
        L35:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR
            if (r5 != r0) goto L3f
            goto L33
        L3a:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
            if (r5 != r0) goto L19
            goto L16
        L3f:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12263p
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12265t = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L4b
            return r2
        L4b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.a(java.lang.Runnable, com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult):boolean");
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        FrontId frontId = (FrontId) objArr[0];
        ScanResult scanResult = (ScanResult) objArr[1];
        int i2 = 2 % 2;
        int i3 = f12265t + 57;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        frontId.logProcessingEvents(frontId.f12268c);
        int i5 = f12265t + 61;
        f12263p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return scanResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00fb A[Catch: all -> 0x021d, TryCatch #0 {all -> 0x021d, blocks: (B:93:0x0042, B:95:0x0053, B:96:0x008c, B:113:0x00e3, B:115:0x00fb, B:116:0x0130, B:128:0x01bf, B:130:0x01d0, B:131:0x0207, B:121:0x014d, B:123:0x0166, B:124:0x01a8), top: B:155:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166 A[Catch: all -> 0x021d, TryCatch #0 {all -> 0x021d, blocks: (B:93:0x0042, B:95:0x0053, B:96:0x008c, B:113:0x00e3, B:115:0x00fb, B:116:0x0130, B:128:0x01bf, B:130:0x01d0, B:131:0x0207, B:121:0x014d, B:123:0x0166, B:124:0x01a8), top: B:155:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int[] r24, boolean r25, java.lang.String r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.q(int[], boolean, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.incode.welcome_sdk.ui.camera.video_selfie.Something<android.graphics.Bitmap, com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState> d(android.graphics.Bitmap r12, com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint r13) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.d(android.graphics.Bitmap, com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint):com.incode.welcome_sdk.ui.camera.video_selfie.Something");
    }

    /* JADX INFO: renamed from: showRealtimeFeedback */
    public void showRealtimeFeedback2(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = AnonymousClass5.f12281a[validationState.ordinal()];
        if (i3 == 1) {
            d(UiState.DEFAULT, ValidationFeedback.f11701f);
            return;
        }
        if (i3 == 2) {
            d(UiState.DEFAULT, ValidationFeedback.f11707l);
            return;
        }
        if (i3 == 3) {
            d(UiState.DEFAULT, ValidationFeedback.f11709n);
            return;
        }
        if (i3 == 4) {
            d(UiState.DEFAULT, ValidationFeedback.f11702g);
            int i4 = f12263p + 25;
            f12265t = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (i3 == 5) {
            d(UiState.DEFAULT, ValidationFeedback.f11710o);
        }
        int i6 = f12263p + 11;
        f12265t = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
    }

    private ScanResult e(Bitmap bitmap) {
        int i2 = 2 % 2;
        if (IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            int i3 = f12263p + 63;
            f12265t = i3 % 128;
            int i4 = i3 % 2;
            return ScanResult.OK;
        }
        d(UiState.PROCESSING, ValidationFeedback.f11714s);
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(bitmap);
        if (!this.f12273h) {
            return !(this.f12278m ^ true) ? a(base64FromBitmap).blockingFirst() : ScanResult.OK;
        }
        int i5 = f12265t + 41;
        f12263p = i5 % 128;
        int i6 = i5 % 2;
        return e(base64FromBitmap).blockingFirst();
    }

    private Observable<ScanResult> e(final String str) {
        int i2 = 2 % 2;
        int i3 = f12263p + 101;
        f12265t = i3 % 128;
        int i4 = i3 % 2;
        Observable<ScanResult> observableOnErrorReturn = this.f12268c.videoSelfieCompareFrontId(str).doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d((Disposable) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c(str, (ad) obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((Throwable) obj);
            }
        });
        int i5 = f12263p + 57;
        f12265t = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return observableOnErrorReturn;
    }

    public /* synthetic */ void d(Disposable disposable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12265t + 9;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f12268c;
        if (i4 != 0) {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_FRONT_ID_UPLOAD_PROGRESS, Modules.VIDEO_ONBOARDING, this.f12279n);
        } else {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_FRONT_ID_UPLOAD_PROGRESS, Modules.VIDEO_ONBOARDING, this.f12279n);
            int i5 = 29 / 0;
        }
    }

    public /* synthetic */ ObservableSource c(String str, ad adVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12265t + 93;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        if (!adVar.e()) {
            return c(a.ID_TYPE_MATCH, ValidationFeedback.f11720y);
        }
        if (adVar.d() < 1.0d) {
            return c(a.ID_PHOTO_MATCH, ValidationFeedback.f11717v);
        }
        if (this.f12278m) {
            int i5 = f12263p + 67;
            f12265t = i5 % 128;
            int i6 = i5 % 2;
            return a(str);
        }
        return Observable.just(ScanResult.OK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0015, code lost:
    
        if ((r12 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException) != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        return c(com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.a.UNKNOWN, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11712q).blockingFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if ((r12 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        r2 = (com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult) e(com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c(), -1586387691, com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c(), com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c(), 1586387694, com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c(), new java.lang.Object[]{r11});
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12263p + 53;
        com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12265t = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult c(java.lang.Throwable r12) throws java.lang.Exception {
        /*
            r11 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12265t
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12263p = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L26
            boolean r1 = r12 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException
            r0 = 17
            int r0 = r0 / 0
            r0 = 1
            if (r1 == r0) goto L2a
        L17:
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$a r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.a.UNKNOWN
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11712q
            io.reactivex.Observable r0 = r11.c(r1, r0)
            java.lang.Object r0 = r0.blockingFirst()
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult) r0
            return r0
        L26:
            boolean r0 = r12 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException
            if (r0 == 0) goto L17
        L2a:
            java.lang.Object[] r10 = new java.lang.Object[]{r11}
            int r4 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c()
            int r6 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c()
            int r7 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c()
            int r9 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.a.c()
            r5 = -1586387691(0xffffffffa171a515, float:-8.187246E-19)
            r8 = 1586387694(0x5e8e5aee, float:5.1288864E18)
            java.lang.Object r2 = e(r4, r5, r6, r7, r8, r9, r10)
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r2 = (com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult) r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12263p
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.f12265t = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.c(java.lang.Throwable):com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult");
    }

    private Observable<ScanResult> a(String str) {
        int i2 = 2 % 2;
        int i3 = f12265t + 113;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        Observable<ScanResult> observableOnErrorReturn = this.f12268c.videoSelfieCompareFrontIdOcr(str).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((ResponseSuccess) obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((Throwable) obj);
            }
        });
        int i5 = f12265t + 35;
        f12263p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return observableOnErrorReturn;
    }

    public /* synthetic */ ObservableSource e(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12265t + 3;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        if (!responseSuccess.isSuccess()) {
            return c(a.OCR_MATCH, ValidationFeedback.f11716u);
        }
        EventUtils.sendVideoSelfieProcessingEvent(this.f12268c, Event.VIDEO_SELFIE_FRONT_ID_UPLOAD_SUCCEEDED, Modules.VIDEO_ONBOARDING, this.f12279n);
        Observable observableJust = Observable.just(ScanResult.OK);
        int i5 = f12263p + 55;
        f12265t = i5 % 128;
        if (i5 % 2 == 0) {
            return observableJust;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        FrontId frontId = (FrontId) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i2 = 2 % 2;
        int i3 = f12263p + 117;
        f12265t = i3 % 128;
        if (i3 % 2 == 0) {
            if (th instanceof NoConnectivityException) {
                ScanResult scanResult = (ScanResult) e(Passport.a.c(), -1586387691, Passport.a.c(), Passport.a.c(), 1586387694, Passport.a.c(), new Object[]{frontId});
                int i4 = f12265t + 111;
                f12263p = i4 % 128;
                int i5 = i4 % 2;
                return scanResult;
            }
            return frontId.c(a.UNKNOWN, ValidationFeedback.f11712q).blockingFirst();
        }
        boolean z2 = th instanceof NoConnectivityException;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ScanResult d(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12265t + 79;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        d(UiState.DEFAULT, ValidationFeedback.f11699d);
        ScanResult scanResult = ScanResult.RETRY;
        int i5 = f12265t + 57;
        f12263p = i5 % 128;
        if (i5 % 2 != 0) {
            return scanResult;
        }
        throw null;
    }

    private Observable<ScanResult> c(a aVar, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12265t + 59;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(this.f12268c, Event.VIDEO_SELFIE_FRONT_ID_ATTEMPT_FAILED, Modules.VIDEO_ONBOARDING, this.f12279n);
        if (!(!e.c(this.f12270e.getContext()))) {
            int i5 = f12263p + 3;
            f12265t = i5 % 128;
            this.f12276k = i5 % 2 != 0 ? this.f12276k / 0 : this.f12276k + 1;
        }
        if (this.f12276k < 3) {
            d(UiState.RETRY, validationFeedback);
            return Observable.timer(1000L, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.d((Long) obj);
                }
            });
        }
        this.f12275j = aVar;
        return Observable.just(ScanResult.FINISHED_WITH_ERROR);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isComplete() {
        int i2 = 2 % 2;
        int i3 = f12265t + 73;
        int i4 = i3 % 128;
        f12263p = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 51;
        f12265t = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: addProcessingErrorState */
    public void addProcessingErrorState2(ValidationState validationState) {
        String strValidationStateToEvent;
        int i2 = 2 % 2;
        int i3 = f12263p + 37;
        int i4 = i3 % 128;
        f12265t = i4;
        int i5 = i3 % 2;
        if (validationState != null) {
            int i6 = i4 + 67;
            f12263p = i6 % 128;
            int i7 = i6 % 2;
            if (validationState == this.f12280o || (strValidationStateToEvent = EventUtils.validationStateToEvent(validationState)) == null) {
                return;
            }
            int i8 = f12265t + 25;
            f12263p = i8 % 128;
            int i9 = i8 % 2;
            this.f12280o = validationState;
            this.f12279n.add(strValidationStateToEvent);
            int i10 = f12265t + 107;
            f12263p = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 % 5;
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        new HashMap().put(EventValues.SCREEN_NAME.getValue(), incodeWelcomeRepository.getCurrentScreenName().name());
        EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_ID_FRONT_DETECTED, Modules.VIDEO_ONBOARDING, this.f12279n);
        int i3 = f12265t + 101;
        f12263p = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logProcessingEvents(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12263p + 77;
        f12265t = i3 % 128;
        if (i3 % 2 == 0) {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_ID_FRONT_PROCESSING_STATES, Modules.VIDEO_ONBOARDING, this.f12279n);
        } else {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_ID_FRONT_PROCESSING_STATES, Modules.VIDEO_ONBOARDING, this.f12279n);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showWinState() {
        int i2 = 2 % 2;
        int i3 = f12263p + 25;
        f12265t = i3 % 128;
        int i4 = i3 % 2;
        d(UiState.SUCCESS, ValidationFeedback.f11703h);
        int i5 = f12265t + 111;
        f12263p = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12281a;

        /* JADX INFO: renamed from: b */
        private static int f12282b = 1;

        /* JADX INFO: renamed from: c */
        private static int f12283c = 0;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f12284e;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            f12284e = iArr;
            try {
                iArr[a.UNKNOWN.ordinal()] = 1;
                int i2 = f12282b + 61;
                f12283c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12284e[a.ID_TYPE_MATCH.ordinal()] = 2;
                int i4 = f12282b + 31;
                f12283c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12284e[a.ID_PHOTO_MATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12284e[a.OCR_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ValidationState.values().length];
            f12281a = iArr2;
            try {
                iArr2[ValidationState.f11854n.ordinal()] = 1;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12281a[ValidationState.f11858r.ordinal()] = 2;
                int i7 = f12283c + 35;
                f12282b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12281a[ValidationState.f11860t.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12281a[ValidationState.f11865y.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12281a[ValidationState.f11855o.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showDoneStateWithError() {
        int i2 = 2 % 2;
        int i3 = f12265t;
        int i4 = i3 + 59;
        f12263p = i4 % 128;
        if (i4 % 2 != 0) {
            if (this.f12275j == null) {
                d(UiState.ERROR, ValidationFeedback.f11711p);
                return;
            }
            int i5 = i3 + 55;
            f12263p = i5 % 128;
            int i6 = i5 % 2;
            int i7 = AnonymousClass5.f12284e[this.f12275j.ordinal()];
            if (i7 == 1) {
                d(UiState.ERROR, ValidationFeedback.f11711p);
                return;
            }
            if (i7 == 2) {
                d(UiState.ERROR, ValidationFeedback.f11718w);
                return;
            } else if (i7 == 3) {
                d(UiState.ERROR, ValidationFeedback.f11719x);
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                d(UiState.ERROR, ValidationFeedback.B);
                return;
            }
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void cleanup(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12265t + 65;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        this.f12270e.finishVideoSelfieProgressStep(VideoSelfieScanState.f12199e);
        BitmapUtils.deleteMemoryLeakProtectedBitmap(this.f12267b);
        this.f12274i.clear();
        c(false);
        d(false);
        runnable.run();
        int i5 = f12265t + 33;
        f12263p = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void c(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12265t + 79;
        f12263p = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12270e.setIdFrameVisible(IdScan.IdType.ID, z2, getCameraFacing());
        } else {
            this.f12270e.setIdFrameVisible(IdScan.IdType.ID, z2, getCameraFacing());
            throw null;
        }
    }

    private void d(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12265t + 91;
        f12263p = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12270e.setFeedbackIdVisible(z2, getCameraFacing());
            int i4 = f12263p + 123;
            f12265t = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f12270e.setFeedbackIdVisible(z2, getCameraFacing());
        throw null;
    }

    private void d(UiState uiState, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12265t + 87;
        f12263p = i3 % 128;
        int i4 = i3 % 2;
        this.f12270e.setIdFrameColor(IdScan.IdType.ID, uiState, getCameraFacing());
        this.f12270e.showFeedbackId(validationFeedback, getCameraFacing());
        int i5 = f12263p + 45;
        f12265t = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public boolean isTooDark(Bitmap bitmap) {
        float centerBrightnessLevel;
        int i2 = 2 % 2;
        if (RecogKitUtils.isFullRecogKitAvailable()) {
            try {
                centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(bitmap);
            } catch (ImageProcessingKitInvalidInputException | ImageProcessingKitProcessException e2) {
                Timber.e(e2);
                centerBrightnessLevel = -1.0f;
            }
            if (centerBrightnessLevel < 50.0f) {
                return true;
            }
            int i3 = f12265t + 81;
            f12263p = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = f12265t + 113;
        f12263p = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f12265t = 0;
        f12263p = 1;
        f12264r = new char[]{30829, 30783, 30778, 30777, 30826, 30782, 30780, 30769, 30764, 30765, 30761, 30774, 30760, 30772, 30778};
    }

    public /* synthetic */ ScanResult e(Something something) throws Exception {
        return (ScanResult) e(Passport.a.c(), -925919826, Passport.a.c(), Passport.a.c(), 925919826, Passport.a.c(), new Object[]{this, something});
    }

    public /* synthetic */ ScanResult b(ScanResult scanResult) throws Exception {
        return (ScanResult) e(Passport.a.c(), 1770455, Passport.a.c(), Passport.a.c(), -1770453, Passport.a.c(), new Object[]{this, scanResult});
    }

    public /* synthetic */ ScanResult b(Throwable th) throws Exception {
        return (ScanResult) e(Passport.a.c(), 292404067, Passport.a.c(), Passport.a.c(), -292404066, Passport.a.c(), new Object[]{this, th});
    }

    private ScanResult c() {
        return (ScanResult) e(Passport.a.c(), -1586387691, Passport.a.c(), Passport.a.c(), 1586387694, Passport.a.c(), new Object[]{this});
    }
}
