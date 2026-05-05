package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.e;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.commons.utils.ad;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.Something;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.DaggerVideoRecordingComponent;
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
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class BackId extends IScanStep<Bitmap, ValidationState> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f12233p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f12234q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int[] f12235t = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IdCaptureKitAndroid f12238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f12239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoRecordingContract.View f12240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CompositeDisposable f12241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FrontId.a f12242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Scheduler f12246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<String> f12247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f12249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ValidationState f12250o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12251s;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, short r11) {
        /*
            int r0 = r10 * 2
            int r8 = 4 - r0
            int r7 = r11 + 98
            int r0 = r9 * 2
            int r6 = r0 + 1
            byte[] r5 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.$$a
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L27
            r0 = r6
            r2 = r3
        L13:
            int r7 = r7 + r0
            int r8 = r8 + 1
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r8]
            goto L13
        L27:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.$$c(int, int, short):java.lang.String");
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~((~i2) | i8 | i7);
        int i10 = (~i7) | i8;
        int i11 = i9 | (~(i10 | i2)) | (~(i5 | i2 | i7));
        int i12 = ~i10;
        int i13 = (~(i7 | i5)) | i2 | i12;
        int i14 = (~(i8 | i2)) | i12;
        int i15 = i5 + i2 + i6 + (933655473 * i4) + ((-1037598838) * i3);
        int i16 = i15 * i15;
        int i17 = (((-1556109539) * i5) - 925892608) + (470833381 * i2) + (i11 * (-1134012188)) + (1134012188 * i13) + ((-1134012188) * i14) + (1604845568 * i6) + ((-1691877376) * i4) + ((-393216000) * i3) + ((-1633878016) * i16);
        int i18 = ((i5 * (-727610197)) - 1081761860) + (i2 * (-727608285)) + (i11 * 956) + (i13 * (-956)) + (i14 * 956) + (i6 * (-727609241)) + (i4 * 1532828727) + (i3 * (-747900794)) + (i16 * 556466176);
        int i19 = i17 + (i18 * i18 * (-1911357440));
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? d(objArr) : e(objArr) : a(objArr);
        }
        BackId backId = (BackId) objArr[0];
        int i20 = 2 % 2;
        int i21 = f12234q + 35;
        f12233p = i21 % 128;
        int i22 = i21 % 2;
        backId.e(UiState.DEFAULT, ValidationFeedback.f11699d);
        ScanResult scanResult = ScanResult.RETRY;
        int i23 = f12234q + 9;
        f12233p = i23 % 128;
        int i24 = i23 % 2;
        return scanResult;
    }

    static void init$0() {
        $$a = new byte[]{104, 119, -28, 53};
        $$b = 162;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* bridge */ /* synthetic */ void addProcessingErrorState(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12234q + 113;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        addProcessingErrorState2(validationState);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f12233p + 125;
        f12234q = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* bridge */ /* synthetic */ void showRealtimeFeedback(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12234q + 37;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        showRealtimeFeedback2(validationState);
        if (i4 == 0) {
            int i5 = 35 / 0;
        }
    }

    public BackId(VideoRecordingContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, Observable<IdCaptureKitAndroid> observable, boolean z2, int i2, Scheduler scheduler, boolean z3, boolean z4) {
        super(i2, view);
        this.f12236a = BackId.class.getName();
        this.f12241f = new CompositeDisposable();
        this.f12248m = 0;
        this.f12240e = view;
        this.f12239d = incodeWelcomeRepository;
        this.f12243h = z2;
        this.f12237b = CameraFacing.BACK.getCameraFacing() == i2;
        this.f12247l = new ArrayList<>();
        this.f12246k = scheduler;
        this.f12241f.add(observable.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d((IdCaptureKitAndroid) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BackId.d((Throwable) obj);
            }
        }));
        this.f12249n = z3;
        this.f12251s = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(IdCaptureKitAndroid idCaptureKitAndroid) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12233p;
        int i4 = i3 + 85;
        f12234q = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.f12238c = idCaptureKitAndroid;
            int i5 = i3 + 69;
            f12234q = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f12238c = idCaptureKitAndroid;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12234q + 27;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th);
        int i5 = f12233p + 21;
        f12234q = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public Point getDesiredPreviewSize(boolean z2) {
        return new Point(PhotoshopDirectory.TAG_COUNT_INFORMATION, z2 ? 1440 : 1920);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12234q + 117;
        int i4 = i3 % 128;
        f12233p = i4;
        int i5 = i3 % 2;
        this.f12244i = true;
        int i6 = i4 + 13;
        f12234q = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void start() {
        int i2 = 2 % 2;
        int i3 = f12233p + 85;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        this.f12240e.startVideoSelfieProgressStep(VideoSelfieScanState.f12195a);
        e(UiState.DEFAULT, ValidationFeedback.f11698c);
        e(true);
        d(true);
        this.f12241f.add(Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Timber.e((Throwable) obj);
            }
        }));
        int i5 = f12233p + 25;
        f12234q = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean processesFrames() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f12234q + 31;
        int i4 = i3 % 128;
        f12233p = i4;
        if (i3 % 2 == 0) {
            z2 = this.f12244i;
            int i5 = 66 / 0;
        } else {
            z2 = this.f12244i;
        }
        int i6 = i4 + 31;
        f12234q = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public Observable<ScanResult> findAndProcess(Bitmap bitmap, FacePositionConstraint facePositionConstraint, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12233p + 93;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        Observable<ScanResult> map = Observable.just(a(bitmap, facePositionConstraint)).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((Something) obj);
            }
        }).observeOn(this.f12246k).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BackId.a(runnable, (Something) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((Something) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BackId.d((ScanResult) obj);
            }
        }).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BackId.d(runnable, (ScanResult) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((ScanResult) obj);
            }
        });
        int i5 = f12233p + 7;
        f12234q = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Something a(Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12233p + 81;
        f12234q = i3 % 128;
        if (i3 % 2 != 0) {
            addProcessingErrorState2((ValidationState) something.f12148d);
            showRealtimeFeedback2((ValidationState) something.f12148d);
            int i4 = 52 / 0;
        } else {
            addProcessingErrorState2((ValidationState) something.f12148d);
            showRealtimeFeedback2((ValidationState) something.f12148d);
        }
        return something;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Runnable runnable = (Runnable) objArr[0];
        int i2 = 2 % 2;
        if (((Something) objArr[1]).f12146b != null) {
            int i3 = f12234q + 29;
            f12233p = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        runnable.run();
        int i5 = f12234q + 103;
        f12233p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ScanResult c(Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12233p + 109;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = (Bitmap) something.f12147c;
        if (i4 != 0) {
            int iD = DaggerVideoRecordingComponent.b.d();
            int iD2 = DaggerVideoRecordingComponent.b.d();
            int iD3 = DaggerVideoRecordingComponent.b.d();
            throw null;
        }
        int iD4 = DaggerVideoRecordingComponent.b.d();
        int iD5 = DaggerVideoRecordingComponent.b.d();
        int iD6 = DaggerVideoRecordingComponent.b.d();
        ScanResult scanResult = (ScanResult) e(-2120700442, DaggerVideoRecordingComponent.b.d(), new Object[]{this, bitmap}, iD6, 2120700445, iD5, iD4);
        int i5 = f12234q + 71;
        f12233p = i5 % 128;
        int i6 = i5 % 2;
        return scanResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ObservableSource d(ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12233p + 41;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        Observable observableJust = Observable.just(scanResult);
        if (scanResult != ScanResult.RETRY) {
            return observableJust;
        }
        int i5 = f12234q + 53;
        f12233p = i5 % 128;
        int i6 = i5 % 2;
        Observable observableDelay = observableJust.delay(2L, TimeUnit.SECONDS);
        int i7 = f12233p + 95;
        f12234q = i7 % 128;
        int i8 = i7 % 2;
        return observableDelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean d(java.lang.Runnable r4, com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r5) throws java.lang.Exception {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q
            int r1 = r0 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12233p = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L32
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r1 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
            r0 = 91
            int r0 = r0 / r2
            if (r5 != r1) goto L19
        L16:
            r4.run()
        L19:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.OK
            if (r5 == r0) goto L30
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12233p
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L38
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
            if (r5 == r0) goto L30
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR
            if (r5 != r0) goto L37
        L30:
            r0 = 1
            return r0
        L32:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
            if (r5 != r0) goto L19
            goto L16
        L37:
            return r2
        L38:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.d(java.lang.Runnable, com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult):boolean");
    }

    private static void r(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        e eVar = new e();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f12235t;
        int i5 = 1605946101;
        long j2 = 0;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 93;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objC = com.c.a.e.e.c(i5);
                    if (objC == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int mode = View.MeasureSpec.getMode(0) + 19;
                        int packedPositionType = ExpandableListView.getPackedPositionType(j2) + IptcDirectory.TAG_ACTION_ADVISED;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e(cNormalizeMetaState, mode, packedPositionType, 1596115084, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                    i3++;
                    i5 = 1605946101;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f12235t;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objC2 = com.c.a.e.e.c(1605946101);
                if (objC2 == null) {
                    byte b4 = (byte) i6;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) Color.blue(i6), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, TextUtils.lastIndexOf("", '0', i6, i6) + 555, 1596115084, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
                i8++;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        eVar.f2735a = i6;
        while (eVar.f2735a < iArr.length) {
            cArr[i6] = (char) (iArr[eVar.f2735a] >> 16);
            cArr[1] = (char) iArr[eVar.f2735a];
            cArr[2] = (char) (iArr[eVar.f2735a + 1] >> 16);
            cArr[3] = (char) iArr[eVar.f2735a + 1];
            eVar.f2736c = (cArr[0] << 16) + cArr[1];
            eVar.f2737d = (cArr[2] << 16) + cArr[3];
            e.b(iArr4);
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = $11 + 43;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                eVar.f2736c ^= iArr4[i9];
                Object[] objArr4 = {eVar, Integer.valueOf(e.c(eVar.f2736c)), eVar, eVar};
                Object objC3 = com.c.a.e.e.c(-190252621);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -197985334, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
                eVar.f2736c = eVar.f2737d;
                eVar.f2737d = iIntValue;
            }
            int i12 = eVar.f2736c;
            eVar.f2736c = eVar.f2737d;
            eVar.f2737d = i12;
            eVar.f2737d ^= iArr4[16];
            eVar.f2736c ^= iArr4[17];
            int i13 = eVar.f2736c;
            int i14 = eVar.f2737d;
            cArr[0] = (char) (eVar.f2736c >>> 16);
            cArr[1] = (char) eVar.f2736c;
            cArr[2] = (char) (eVar.f2737d >>> 16);
            cArr[3] = (char) eVar.f2737d;
            e.b(iArr4);
            cArr2[eVar.f2735a * 2] = cArr[0];
            cArr2[(eVar.f2735a * 2) + 1] = cArr[1];
            cArr2[(eVar.f2735a * 2) + 2] = cArr[2];
            cArr2[(eVar.f2735a * 2) + 3] = cArr[3];
            Object[] objArr5 = {eVar, eVar};
            Object objC4 = com.c.a.e.e.c(-1176571471);
            if (objC4 == null) {
                objC4 = com.c.a.e.e.e((char) (Color.rgb(0, 0, 0) + 16819996), 16 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 133, -1186663480, false, "a", new Class[]{Object.class, Object.class});
            }
            ((Method) objC4).invoke(null, objArr5);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult e(ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12234q + 63;
        f12233p = i3 % 128;
        if (i3 % 2 == 0) {
            logProcessingEvents(this.f12239d);
            int i4 = 70 / 0;
        } else {
            logProcessingEvents(this.f12239d);
        }
        return scanResult;
    }

    private Something<Bitmap, ValidationState> a(Bitmap bitmap, FacePositionConstraint facePositionConstraint) {
        boolean z2;
        int i2 = 2 % 2;
        if (facePositionConstraint == null) {
            int i3 = f12233p + 1;
            f12234q = i3 % 128;
            z2 = i3 % 2 == 0;
        } else {
            try {
                Rect rectAsRect = facePositionConstraint.asRect();
                if (rectAsRect.width() >= 384 && rectAsRect.height() >= 384) {
                    bitmap = BitmapUtils.cropToRect(bitmap, rectAsRect);
                }
            } catch (RecogKitInvalidInputException | RecogKitProcessException e2) {
                e2.printStackTrace();
                return Something.empty(ValidationState.O);
            }
        }
        Bitmap memoryLeakProtectedBitmap = BitmapUtils.getMemoryLeakProtectedBitmap(bitmap, this.f12236a);
        if (isTooDark(memoryLeakProtectedBitmap)) {
            Timber.d("Back ID too dark", new Object[0]);
            this.f12245j = false;
            return Something.empty(ValidationState.f11854n);
        }
        IdCaptureKitAndroid.Result resultCaptureId = this.f12238c.captureId(memoryLeakProtectedBitmap, Boolean.valueOf(!this.f12245j), Boolean.TRUE);
        this.f12245j = false;
        if (resultCaptureId.cls < 0.98f) {
            int i4 = f12233p + 61;
            f12234q = i4 % 128;
            int i5 = i4 % 2;
            Timber.d("Back ID not classified, idCaptureKitResult.cls: %s", Float.valueOf(resultCaptureId.cls));
            return Something.empty(ValidationState.O);
        }
        Timber.d("Back ID classified, idCaptureKitResult.cls: %s", Float.valueOf(resultCaptureId.cls));
        if (this.f12237b && resultCaptureId.blur > IncodeWelcome.getInstance().getInternalConfig().getIdBlurThreshold()) {
            Timber.d("Back ID blur value: %s", Float.valueOf(resultCaptureId.blur));
            return Something.empty(ValidationState.f11858r);
        }
        if (resultCaptureId.glare > IncodeWelcome.getInstance().getInternalConfig().getIdGlareThreshold()) {
            Timber.d("Back ID glare value: %s", Float.valueOf(resultCaptureId.glare));
            return Something.empty(ValidationState.f11860t);
        }
        if (this.f12243h) {
            String str = resultCaptureId.side;
            Object[] objArr = new Object[1];
            r(new int[]{-316239512, 238550016, -1558079857, -544062240}, (ViewConfiguration.getTapTimeout() >> 16) + 5, objArr);
            if (str.equalsIgnoreCase(((String) objArr[0]).intern())) {
                int i6 = f12234q + 29;
                f12233p = i6 % 128;
                int i7 = i6 % 2;
                Timber.d("ID front detected while scanning back", new Object[0]);
                return Something.empty(ValidationState.D);
            }
        }
        this.f12245j = true;
        if (resultCaptureId.quad == null || resultCaptureId.quad.length == 0) {
            Timber.d("Back ID classified but missing quad", new Object[0]);
            return Something.empty(ValidationState.f11859s);
        }
        Timber.d("Quad lengths: %s", Integer.valueOf(resultCaptureId.quad.length));
        Rect rectA = ad.a(resultCaptureId);
        Timber.d("Found Back ID location rect: %s", rectA);
        if (getCameraFacing() == 0) {
            if (rectA.width() < memoryLeakProtectedBitmap.getWidth() * (z2 ? 0.5f : 0.8f)) {
                Timber.d("Back ID too small", new Object[0]);
                return Something.empty(ValidationState.f11855o);
            }
        }
        EventUtils.sendVideoSelfieProcessingEvent(this.f12239d, Event.VIDEO_SELFIE_BACK_ID_CAPTURE, Modules.VIDEO_ONBOARDING, this.f12247l);
        File imagesDirectory = this.f12239d.getImagesDirectory();
        Object[] objArr2 = new Object[1];
        r(new int[]{1285736727, -683873855, -427233640, 589723650, -1044490039, 1943008960}, TextUtils.getOffsetBefore("", 0) + 10, objArr2);
        BitmapUtils.saveBitmapToFile(memoryLeakProtectedBitmap, imagesDirectory, ((String) objArr2[0]).intern());
        return Something.from(memoryLeakProtectedBitmap, rectA, ValidationState.C);
    }

    /* JADX INFO: renamed from: showRealtimeFeedback, reason: avoid collision after fix types in other method */
    public void showRealtimeFeedback2(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12233p + 37;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass5.f12254d[validationState.ordinal()];
        if (i5 == 1) {
            e(UiState.DEFAULT, ValidationFeedback.f11701f);
            return;
        }
        if (i5 == 2) {
            e(UiState.DEFAULT, ValidationFeedback.f11707l);
            return;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                e(UiState.DEFAULT, ValidationFeedback.f11704i);
                return;
            } else {
                if (i5 != 5) {
                    return;
                }
                e(UiState.DEFAULT, ValidationFeedback.f11710o);
                return;
            }
        }
        e(UiState.DEFAULT, ValidationFeedback.f11709n);
        int i6 = f12233p + 79;
        f12234q = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        BackId backId = (BackId) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i2 = 2 % 2;
        if (IncodeWelcome.getInstance().isSubmitOnlyMode()) {
            return ScanResult.OK;
        }
        if (IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            int i3 = f12233p + 43;
            f12234q = i3 % 128;
            int i4 = i3 % 2;
            ScanResult scanResult = ScanResult.OK;
            int i5 = f12233p + 19;
            f12234q = i5 % 128;
            int i6 = i5 % 2;
            return scanResult;
        }
        backId.e(UiState.PROCESSING, ValidationFeedback.f11714s);
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(bitmap);
        if (backId.f12249n) {
            Object[] objArr2 = {backId, base64FromBitmap};
            int iD = DaggerVideoRecordingComponent.b.d();
            int iD2 = DaggerVideoRecordingComponent.b.d();
            return (ScanResult) ((Observable) e(1465544941, DaggerVideoRecordingComponent.b.d(), objArr2, DaggerVideoRecordingComponent.b.d(), -1465544941, iD2, iD)).blockingFirst();
        }
        if (!backId.f12251s) {
            return ScanResult.OK;
        }
        ScanResult scanResultBlockingFirst = backId.b(base64FromBitmap).blockingFirst();
        int i7 = f12234q + 77;
        f12233p = i7 % 128;
        if (i7 % 2 != 0) {
            return scanResultBlockingFirst;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        final BackId backId = (BackId) objArr[0];
        final String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f12234q + 45;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        Observable observableOnErrorReturn = backId.f12239d.videoSelfieCompareBackId(str).doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e((Disposable) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(str, (com.incode.welcome_sdk.data.remote.beans.ad) obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((Throwable) obj);
            }
        });
        int i5 = f12233p + 111;
        f12234q = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Disposable disposable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12233p + 53;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(this.f12239d, Event.VIDEO_SELFIE_BACK_ID_UPLOAD_PROGRESS, Modules.VIDEO_ONBOARDING, this.f12247l);
        int i5 = f12234q + 117;
        f12233p = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str, com.incode.welcome_sdk.data.remote.beans.ad adVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12234q + 45;
        f12233p = i3 % 128;
        if (i3 % 2 == 0) {
            adVar.e();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!adVar.e()) {
            return c(FrontId.a.ID_TYPE_MATCH, ValidationFeedback.f11720y);
        }
        if (adVar.d() < 1.0d) {
            Observable<ScanResult> observableC = c(FrontId.a.ID_PHOTO_MATCH, ValidationFeedback.f11717v);
            int i4 = f12233p + 53;
            f12234q = i4 % 128;
            int i5 = i4 % 2;
            return observableC;
        }
        if (!this.f12251s) {
            return Observable.just(ScanResult.OK);
        }
        int i6 = f12234q + 5;
        f12233p = i6 % 128;
        int i7 = i6 % 2;
        return b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12234q + 15;
        int i4 = i3 % 128;
        f12233p = i4;
        int i5 = i3 % 2;
        if (th instanceof NoConnectivityException) {
            int i6 = i4 + 113;
            f12234q = i6 % 128;
            int i7 = i6 % 2;
            return d();
        }
        return c(FrontId.a.UNKNOWN, ValidationFeedback.f11712q).blockingFirst();
    }

    private Observable<ScanResult> b(String str) {
        int i2 = 2 % 2;
        int i3 = f12234q + 69;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f12239d;
        if (i4 == 0) {
            Observable<ScanResult> observableOnErrorReturn = incodeWelcomeRepository.videoSelfieCompareBackIdOcr(str).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((ResponseSuccess) obj);
                }
            }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((Throwable) obj);
                }
            });
            int i5 = 44 / 0;
            return observableOnErrorReturn;
        }
        return incodeWelcomeRepository.videoSelfieCompareBackIdOcr(str).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((ResponseSuccess) obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource e(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12233p + 81;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        if (responseSuccess.isSuccess()) {
            EventUtils.sendVideoSelfieProcessingEvent(this.f12239d, Event.VIDEO_SELFIE_BACK_ID_UPLOAD_SUCCEEDED, Modules.VIDEO_ONBOARDING, this.f12247l);
            return Observable.just(ScanResult.OK);
        }
        Observable<ScanResult> observableC = c(FrontId.a.OCR_MATCH, ValidationFeedback.f11716u);
        int i5 = f12234q + 121;
        f12233p = i5 % 128;
        int i6 = i5 % 2;
        return observableC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r5 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return c(com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.a.UNKNOWN, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11712q).blockingFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1 = r2 + 13;
        com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if ((r1 % 2) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r0 = 21 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult e(java.lang.Throwable r5) throws java.lang.Exception {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q
            int r0 = r0 + 103
            int r2 = r0 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12233p = r2
            int r0 = r0 % r3
            if (r0 != 0) goto L2d
            boolean r1 = r5 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException
            r0 = 84
            int r0 = r0 / 0
            if (r1 == 0) goto L32
        L16:
            int r1 = r2 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L28
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r1 = r4.d()
            r0 = 21
            int r0 = r0 / 0
        L27:
            return r1
        L28:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r1 = r4.d()
            goto L27
        L2d:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException
            if (r0 == 0) goto L32
            goto L16
        L32:
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$a r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId.a.UNKNOWN
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11712q
            io.reactivex.Observable r0 = r4.c(r1, r0)
            java.lang.Object r0 = r0.blockingFirst()
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.e(java.lang.Throwable):com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult");
    }

    private Observable<ScanResult> c(FrontId.a aVar, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12233p + 51;
        f12234q = i3 % 128;
        if (i3 % 2 == 0) {
            EventUtils.sendVideoSelfieProcessingEvent(this.f12239d, Event.VIDEO_SELFIE_BACK_ID_ATTEMPT_FAILED, Modules.VIDEO_ONBOARDING, this.f12247l);
            if (com.incode.welcome_sdk.commons.httpinterceptors.e.c(this.f12240e.getContext())) {
                this.f12248m++;
            }
            if (this.f12248m >= 3) {
                this.f12242g = aVar;
                return Observable.just(ScanResult.FINISHED_WITH_ERROR);
            }
            int i4 = f12233p + 37;
            f12234q = i4 % 128;
            int i5 = i4 % 2;
            e(UiState.RETRY, validationFeedback);
            return Observable.timer(1000L, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((Long) obj);
                }
            });
        }
        EventUtils.sendVideoSelfieProcessingEvent(this.f12239d, Event.VIDEO_SELFIE_BACK_ID_ATTEMPT_FAILED, Modules.VIDEO_ONBOARDING, this.f12247l);
        com.incode.welcome_sdk.commons.httpinterceptors.e.c(this.f12240e.getContext());
        throw null;
    }

    private ScanResult d() {
        int i2 = 2 % 2;
        int i3 = f12233p + 115;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(this.f12239d, Event.VIDEO_SELFIE_BACK_ID_ATTEMPT_FAILED, Modules.VIDEO_ONBOARDING, this.f12247l);
        e(UiState.ERROR, ValidationFeedback.G);
        this.f12240e.showNoNetworkMessage(VideoSelfieScanState.f12195a);
        ScanResult scanResult = ScanResult.ERROR;
        int i5 = f12233p + 79;
        f12234q = i5 % 128;
        if (i5 % 2 == 0) {
            return scanResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isComplete() {
        int i2 = 2 % 2;
        int i3 = f12233p + 97;
        int i4 = i3 % 128;
        f12234q = i4;
        boolean z2 = i3 % 2 != 0;
        int i5 = i4 + 15;
        f12233p = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: addProcessingErrorState, reason: avoid collision after fix types in other method */
    public void addProcessingErrorState2(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12234q + 123;
        int i4 = i3 % 128;
        f12233p = i4;
        int i5 = i3 % 2;
        if (validationState != null) {
            int i6 = i4 + 83;
            f12234q = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 10 / 0;
                if (validationState == this.f12250o) {
                    return;
                }
            } else if (validationState == this.f12250o) {
                return;
            }
            String strValidationStateToEvent = EventUtils.validationStateToEvent(validationState);
            if (strValidationStateToEvent != null) {
                this.f12250o = validationState;
                this.f12247l.add(strValidationStateToEvent);
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12234q + 57;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_ID_BACK_DETECTED, Modules.VIDEO_ONBOARDING, this.f12247l);
        int i5 = f12234q + 89;
        f12233p = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logProcessingEvents(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12233p + 31;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_ID_BACK_PROCESSING_STATES, Modules.VIDEO_ONBOARDING, this.f12247l);
        int i5 = f12234q + 33;
        f12233p = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showWinState() {
        int i2 = 2 % 2;
        int i3 = f12234q + 71;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        e(UiState.SUCCESS, ValidationFeedback.f11703h);
        int i5 = f12233p + 55;
        f12234q = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12252a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12253b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f12254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f12255e;

        static {
            int[] iArr = new int[FrontId.a.valuesCustom().length];
            f12255e = iArr;
            try {
                iArr[FrontId.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12255e[FrontId.a.ID_TYPE_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12255e[FrontId.a.ID_PHOTO_MATCH.ordinal()] = 3;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12255e[FrontId.a.OCR_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ValidationState.values().length];
            f12254d = iArr2;
            try {
                iArr2[ValidationState.f11854n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12254d[ValidationState.f11858r.ordinal()] = 2;
                int i3 = f12252a + 125;
                f12253b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12254d[ValidationState.f11860t.ordinal()] = 3;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12254d[ValidationState.D.ordinal()] = 4;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12254d[ValidationState.f11855o.ordinal()] = 5;
                int i7 = f12253b + 21;
                f12252a = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r1 == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r1 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 == 4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        e(com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.B);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4.f12242g != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        e(com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11719x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        e(com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11718w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        e(com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11711p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.AnonymousClass5.f12255e[r4.f12242g.ordinal()];
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        e(com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11711p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.f12242g != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1 = r2 + 17;
        com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if ((r1 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.AnonymousClass5.f12255e[r4.f12242g.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r1 == 1) goto L24;
     */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showDoneStateWithError() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r2 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12233p
            int r1 = r2 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L3d
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$a r1 = r4.f12242g
            r0 = 98
            int r0 = r0 / 0
            if (r1 == 0) goto L69
        L16:
            int r1 = r2 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.f12234q = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L5a
            int[] r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.AnonymousClass5.f12255e
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$a r0 = r4.f12242g
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L52
            if (r1 == r3) goto L4a
            r0 = 3
            if (r1 == r0) goto L42
            r0 = 4
            if (r1 == r0) goto L35
        L34:
            return
        L35:
            com.incode.welcome_sdk.ui.camera.video_selfie.UiState r1 = com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.B
            r4.e(r1, r0)
            goto L34
        L3d:
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$a r0 = r4.f12242g
            if (r0 == 0) goto L69
            goto L16
        L42:
            com.incode.welcome_sdk.ui.camera.video_selfie.UiState r1 = com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11719x
            r4.e(r1, r0)
            return
        L4a:
            com.incode.welcome_sdk.ui.camera.video_selfie.UiState r1 = com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11718w
            r4.e(r1, r0)
            return
        L52:
            com.incode.welcome_sdk.ui.camera.video_selfie.UiState r1 = com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11711p
            r4.e(r1, r0)
            return
        L5a:
            int[] r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.AnonymousClass5.f12255e
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId$a r0 = r4.f12242g
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r0 = 0
            r0.hashCode()
            throw r0
        L69:
            com.incode.welcome_sdk.ui.camera.video_selfie.UiState r1 = com.incode.welcome_sdk.ui.camera.video_selfie.UiState.ERROR
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11711p
            r4.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId.showDoneStateWithError():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void cleanup(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12234q + 19;
        f12233p = i3 % 128;
        int i4 = i3 % 2;
        this.f12240e.finishVideoSelfieProgressStep(VideoSelfieScanState.f12195a);
        BitmapUtils.deleteMemoryLeakProtectedBitmap(this.f12236a);
        this.f12241f.clear();
        e(false);
        d(false);
        runnable.run();
        int i5 = f12234q + 17;
        f12233p = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private void e(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12233p + 65;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        this.f12240e.setIdFrameVisible(IdScan.IdType.ID, z2, getCameraFacing());
        int i5 = f12234q + 123;
        f12233p = i5 % 128;
        int i6 = i5 % 2;
    }

    private void d(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12233p + 75;
        f12234q = i3 % 128;
        int i4 = i3 % 2;
        this.f12240e.setFeedbackIdVisible(z2, getCameraFacing());
        int i5 = f12233p + 31;
        f12234q = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e(UiState uiState, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12234q + 107;
        f12233p = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12240e.setIdFrameColor(IdScan.IdType.ID, uiState, getCameraFacing());
            this.f12240e.showFeedbackId(validationFeedback, getCameraFacing());
            int i4 = 86 / 0;
        } else {
            this.f12240e.setIdFrameColor(IdScan.IdType.ID, uiState, getCameraFacing());
            this.f12240e.showFeedbackId(validationFeedback, getCameraFacing());
        }
    }

    public boolean isTooDark(Bitmap bitmap) {
        float centerBrightnessLevel;
        int i2 = 2 % 2;
        if (!RecogKitUtils.isFullRecogKitAvailable()) {
            int i3 = f12233p + 77;
            f12234q = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        try {
            centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(bitmap);
            int i5 = f12234q + 21;
            f12233p = i5 % 128;
            int i6 = i5 % 2;
        } catch (ImageProcessingKitInvalidInputException | ImageProcessingKitProcessException e2) {
            Timber.e(e2);
            centerBrightnessLevel = -1.0f;
        }
        if (centerBrightnessLevel >= 50.0f) {
            return false;
        }
        int i7 = f12234q + 31;
        f12233p = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f12234q = 0;
        f12233p = 1;
        f12235t = new int[]{-1142406853, 1841867453, 784858221, 556907838, -89555470, 2055632326, -1017305436, 1872650862, 1694391862, -994188269, 1110765251, 697433023, 1324544348, 1120919530, -681410153, -1414597663, -931371769, -1388296621};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(Runnable runnable, Something something) throws Exception {
        Object[] objArr = {runnable, something};
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        return ((Boolean) e(-726466203, DaggerVideoRecordingComponent.b.d(), objArr, DaggerVideoRecordingComponent.b.d(), 726466205, iD2, iD)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult e(Long l2) throws Exception {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        return (ScanResult) e(-733997753, DaggerVideoRecordingComponent.b.d(), new Object[]{this, l2}, iD3, 733997754, iD2, iD);
    }

    private Observable<ScanResult> e(String str) {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        return (Observable) e(1465544941, DaggerVideoRecordingComponent.b.d(), new Object[]{this, str}, iD3, -1465544941, iD2, iD);
    }

    private ScanResult a(Bitmap bitmap) {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        return (ScanResult) e(-2120700442, DaggerVideoRecordingComponent.b.d(), new Object[]{this, bitmap}, iD3, 2120700445, iD2, iD);
    }
}
