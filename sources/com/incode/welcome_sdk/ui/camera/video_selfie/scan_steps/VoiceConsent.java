package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.c.a.e.e;
import com.c.a.k;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.recogkitandroid.Face;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.c.c.b;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.FaceUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.commons.utils.y;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.RecognitionFaceInfo;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.aes.AESViewModel;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.Something;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceMatchLastFrame;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceConsent extends IScanStep<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int B = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f12412v = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f12413y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FaceProcessingUtils.FaceProcessingState f12414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompositeDisposable f12415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoRecordingContract.View f12416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<String> f12417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ReplaySubject<String> f12418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RecogManager f12419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f12420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f12421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IncodeWelcomeRepository f12422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f12423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f12424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f12425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final VideoRecordingPresenter f12426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f12427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f12428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private VoiceConsentFaceMatchLastFrame f12429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f12433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f12434u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private FaceProcessingUtils.DetectionData f12435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12436x;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, short r9) {
        /*
            int r7 = r7 * 4
            int r2 = r7 + 1
            int r0 = r9 * 3
            int r0 = 3 - r0
            int r1 = r8 * 2
            int r6 = r1 + 117
            byte[] r5 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.$$a
            byte[] r4 = new byte[r2]
            r3 = 0
            if (r5 != 0) goto L2b
            r6 = r7
            r2 = r0
            r1 = r3
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r2
        L19:
            byte r2 = (byte) r6
            r4[r1] = r2
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r2 = r0 + 1
            r0 = r5[r2]
            int r1 = r1 + 1
            goto L16
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.$$c(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(int r6, int r7, int r8, int r9, java.lang.Object[] r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.d(int, int, int, int, java.lang.Object[], int, int):java.lang.Object");
    }

    static void init$0() {
        $$a = new byte[]{35, -73, 121, Ascii.DC2};
        $$b = 127;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* bridge */ /* synthetic */ void addProcessingErrorState(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f12413y + 103;
        B = i3 % 128;
        int i4 = i3 % 2;
        addProcessingErrorState2(faceProcessingState);
        int i5 = f12413y + 3;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* bridge */ /* synthetic */ void showRealtimeFeedback(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f12413y + 61;
        B = i3 % 128;
        int i4 = i3 % 2;
        showRealtimeFeedback2(faceProcessingState);
        int i5 = f12413y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void z(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            obj = charArray;
        }
        k kVar = new k();
        char[] cArrE = k.e(f12412v ^ (-3501477462694648052L), (char[]) obj, i2);
        kVar.f2772b = 4;
        while (kVar.f2772b < cArrE.length) {
            kVar.f2773d = kVar.f2772b - 4;
            int i6 = kVar.f2772b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f12412v)};
                Object objC = e.c(1215460496);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objC = e.e((char) (92 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, TextUtils.lastIndexOf("", '0', 0, 0) + 1108, 1223194345, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrE[i6] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objC2 = e.c(-727400358);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = e.e((char) TextUtils.getOffsetBefore("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1282, -734084573, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
                int i7 = $10 + 43;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrE, 4, cArrE.length - 4);
    }

    public VoiceConsent(VideoRecordingContract.View view, ReplaySubject<String> replaySubject, int i2, IncodeWelcomeRepository incodeWelcomeRepository, b bVar, RecogManager recogManager, boolean z2, VideoRecordingPresenter videoRecordingPresenter) {
        super(i2, view);
        this.f12417d = new ArrayList<>();
        this.f12428o = IncodeWelcome.getInstance().isCaptureOnlyMode();
        this.f12425l = IncodeWelcome.getInstance().isSubmitOnlyMode();
        this.f12431r = 0;
        this.f12433t = 0;
        this.f12430q = 0;
        this.f12429p = null;
        this.f12432s = false;
        this.f12436x = false;
        this.f12434u = false;
        this.f12416c = view;
        this.f12415b = new CompositeDisposable();
        this.f12418e = replaySubject;
        this.f12422i = incodeWelcomeRepository;
        this.f12423j = bVar;
        this.f12419f = recogManager;
        this.f12427n = z2;
        this.f12426m = videoRecordingPresenter;
    }

    public VoiceConsent(VideoRecordingContract.View view, String str, int i2, IncodeWelcomeRepository incodeWelcomeRepository, b bVar, RecogManager recogManager, boolean z2, VideoRecordingPresenter videoRecordingPresenter) {
        super(i2, view);
        this.f12417d = new ArrayList<>();
        this.f12428o = IncodeWelcome.getInstance().isCaptureOnlyMode();
        this.f12425l = IncodeWelcome.getInstance().isSubmitOnlyMode();
        this.f12431r = 0;
        this.f12433t = 0;
        this.f12430q = 0;
        this.f12429p = null;
        this.f12432s = false;
        this.f12436x = false;
        this.f12434u = false;
        this.f12416c = view;
        this.f12415b = new CompositeDisposable();
        this.f12421h = str;
        this.f12422i = incodeWelcomeRepository;
        this.f12423j = bVar;
        this.f12419f = recogManager;
        this.f12427n = z2;
        this.f12426m = videoRecordingPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12413y;
        int i4 = i3 + 37;
        B = i4 % 128;
        int i5 = i4 % 2;
        this.f12420g = str;
        if (!this.f12427n) {
            int i6 = i3 + 121;
            B = i6 % 128;
            if (i6 % 2 == 0) {
                this.f12416c.setTapToAnswerLayoutVisible(true);
                this.f12416c.setVoiceConsentUiVisible(false);
                this.f12416c.setFeedbackCenterVisible(true);
                Object[] objArr = {this, this.f12420g};
                d(AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c(), 1391550802, objArr, -1391550800, AESViewModel.l.c());
            } else {
                this.f12416c.setTapToAnswerLayoutVisible(true);
                this.f12416c.setVoiceConsentUiVisible(true);
                this.f12416c.setFeedbackCenterVisible(true);
                Object[] objArr2 = {this, this.f12420g};
                d(AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c(), 1391550802, objArr2, -1391550800, AESViewModel.l.c());
            }
            b(this.f12420g);
            int i7 = f12413y + 11;
            B = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 2;
            }
        }
        this.f12416c.hideProcessingUI();
        this.f12416c.setVoiceConsentUiDone(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            r10 = this;
            r4 = 2
            int r0 = r4 % r4
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r1 = r10.f12416c
            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState.f12204j
            r1.startVideoSelfieProgressStep(r0)
            boolean r0 = r10.f12427n
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L7b
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y
            int r3 = r0 + 69
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B = r0
            int r3 = r3 % r4
            if (r3 != 0) goto L6e
            boolean r3 = r10.f12434u
            r0 = 68
            int r0 = r0 / r1
            if (r3 != 0) goto L73
        L22:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r10.f12416c
            r0.restartVoiceConsentUiOnStart()
        L27:
            boolean r0 = r10.f12428o
            if (r0 != 0) goto L81
            io.reactivex.subjects.ReplaySubject<java.lang.String> r0 = r10.f12418e
            boolean r0 = r0.hasValue()
            if (r0 == 0) goto L56
        L33:
            io.reactivex.disposables.CompositeDisposable r4 = r10.f12415b
            io.reactivex.subjects.ReplaySubject<java.lang.String> r1 = r10.f12418e
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r3 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda8 r2 = new com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda8
            r2.<init>()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r1 = r10.f12416c
            java.util.Objects.requireNonNull(r1)
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done$$ExternalSyntheticLambda1
            r0.<init>(r1)
            io.reactivex.disposables.Disposable r0 = r3.subscribe(r2, r0)
            r4.add(r0)
            return
        L56:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B = r0
            int r1 = r1 % r4
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r10.f12416c
            r0.showProcessingUi()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y
            int r1 = r0 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B = r0
            int r1 = r1 % r4
            goto L33
        L6e:
            boolean r0 = r10.f12434u
            if (r0 != 0) goto L73
            goto L22
        L73:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r3 = r10.f12426m
            com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState.f12227e
            r3.setVoiceConsentFaceRecognitionState(r0)
            goto L27
        L7b:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r10.f12416c
            r0.setBackgroundFullscreenOverlayVisible(r2)
            goto L27
        L81:
            boolean r0 = r10.f12427n
            if (r0 != 0) goto Lb3
            java.lang.String r0 = r10.f12421h
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r0}
            int r3 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            int r5 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            int r4 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            int r9 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            r6 = 1391550802(0x52f16152, float:5.1835994E11)
            r8 = -1391550800(0xffffffffad0e9eb0, float:-8.107001E-12)
            d(r3, r4, r5, r6, r7, r8, r9)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r10.f12416c
            r0.setFeedbackCenterVisible(r2)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r10.f12416c
            r0.setVoiceConsentUiVisible(r2)
            java.lang.String r0 = r10.f12421h
            r10.b(r0)
        Lb3:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r10.f12416c
            r0.setVoiceConsentUiDone(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.start():void");
    }

    public void setMinFaceWidth(float f2) {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 31;
        f12413y = i4 % 128;
        int i5 = i4 % 2;
        this.f12424k = f2;
        int i6 = i3 + 125;
        f12413y = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public Observable<ScanResult> findAndProcess(Bitmap bitmap, FacePositionConstraint facePositionConstraint, final Runnable runnable) {
        int i2 = 2 % 2;
        Something<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> somethingD = d(bitmap, facePositionConstraint);
        if (somethingD.f12148d == FaceProcessingUtils.FaceProcessingState.NOT_READY) {
            int i3 = f12413y + 101;
            B = i3 % 128;
            int i4 = i3 % 2;
            addProcessingErrorState2(somethingD.f12148d);
            showRealtimeFeedback2(somethingD.f12148d);
            EventUtils.sendVideoSelfieProcessingEvent(this.f12422i, Event.VIDEO_SELFIE_TOS_NOT_ACCEPTED, Modules.VIDEO_ONBOARDING, this.f12417d);
            this.f12426m.setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12225c);
            Observable<ScanResult> observableJust = Observable.just(ScanResult.FINISHED_WITH_ERROR);
            int i5 = f12413y + 95;
            B = i5 % 128;
            int i6 = i5 % 2;
            return observableJust;
        }
        return Observable.just(somethingD).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((Something) obj);
            }
        }).observeOn(this.f12426m.getDetectionScheduler()).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.e(runnable, (Something) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((Something) obj);
            }
        }).observeOn(this.f12426m.getDetectionScheduler()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((ScanResult) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((ScanResult) obj);
            }
        }).observeOn(this.f12426m.getDetectionScheduler()).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.c(runnable, (ScanResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ com.incode.welcome_sdk.ui.camera.video_selfie.Something c(com.incode.welcome_sdk.ui.camera.video_selfie.Something r4) throws java.lang.Exception {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            S r0 = r4.f12148d
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = (com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState) r0
            r3.addProcessingErrorState2(r0)
            S r0 = r4.f12148d
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = (com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState) r0
            r3.showRealtimeFeedback2(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r0 = r3.f12426m
            com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState r1 = r0.getVoiceConsentFaceRecognitionState()
            com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState.f12226d
            if (r1 != r0) goto L43
            android.graphics.Rect r0 = r4.f12146b
            if (r0 != 0) goto L43
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L44
            int r0 = r3.f12430q
            int r1 = r0 % 1
            r3.f12430q = r1
            r0 = 71
            if (r1 != r0) goto L43
        L34:
            r3.onFaceNotFound()
            r0 = 0
            r3.f12430q = r0
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y
            int r1 = r0 + 1
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B = r0
            int r1 = r1 % r2
        L43:
            return r4
        L44:
            int r0 = r3.f12430q
            int r1 = r0 + 1
            r3.f12430q = r1
            r0 = 10
            if (r1 != r0) goto L43
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.c(com.incode.welcome_sdk.ui.camera.video_selfie.Something):com.incode.welcome_sdk.ui.camera.video_selfie.Something");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(Runnable runnable, Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = B + 3;
        f12413y = i3 % 128;
        int i4 = i3 % 2;
        if (something.f12146b == null) {
            runnable.run();
            return false;
        }
        int i5 = B + 15;
        f12413y = i5 % 128;
        int i6 = i5 % 2;
        this.f12430q = 0;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ScanResult b(Something something) throws Exception {
        int i2 = 2 % 2;
        VoiceConsentFaceRecognitionState voiceConsentFaceRecognitionState = this.f12426m.getVoiceConsentFaceRecognitionState();
        Timber.d("VoiceConsent mapping result, state: %s", voiceConsentFaceRecognitionState);
        if (voiceConsentFaceRecognitionState == VoiceConsentFaceRecognitionState.f12223a) {
            onFaceDetected();
            this.f12426m.setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12227e);
            ScanResult scanResult = ScanResult.OK;
            int i3 = f12413y + 101;
            B = i3 % 128;
            int i4 = i3 % 2;
            return scanResult;
        }
        if (voiceConsentFaceRecognitionState != VoiceConsentFaceRecognitionState.f12226d) {
            return ScanResult.OK;
        }
        ScanResult scanResultE = e((FaceProcessingUtils.DetectionData) something.f12147c);
        if (scanResultE == ScanResult.ERROR) {
            showErrorOnFaceDoNotMatch();
        }
        if (this.f12428o) {
            this.f12435w = (FaceProcessingUtils.DetectionData) something.f12147c;
            int i5 = f12413y + 103;
            B = i5 % 128;
            int i6 = i5 % 2;
        }
        return scanResultE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ io.reactivex.ObservableSource c(com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r6) throws java.lang.Exception {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B = r0
            int r1 = r1 % r4
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r0 = r5.f12426m
            com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState r1 = r0.getVoiceConsentFaceRecognitionState()
            com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState.f12226d
            if (r1 != r0) goto L4c
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
            if (r6 == r0) goto L27
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r1 = r1 % r4
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR
            if (r6 != r0) goto L2c
        L27:
            com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceMatchLastFrame r0 = r5.f12429p
            r5.b(r0)
        L2c:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
            if (r6 != r0) goto L4c
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r6)
            r1 = 3000(0xbb8, double:1.482E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r2 = r3.delay(r1, r0)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L4b
            r0 = 17
            int r0 = r0 / 0
        L4b:
            return r2
        L4c:
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.c(com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult):io.reactivex.ObservableSource");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12413y + 79;
        B = i3 % 128;
        int i4 = i3 % 2;
        if (this.f12426m.getVoiceConsentFaceRecognitionState() == VoiceConsentFaceRecognitionState.f12226d && scanResult == ScanResult.ERROR) {
            retryOnFaceDoNotMatch();
            return Observable.just(scanResult);
        }
        Observable observableJust = Observable.just(scanResult);
        int i5 = f12413y + 51;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            return observableJust;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(Runnable runnable, ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        if (scanResult == ScanResult.RETRY) {
            runnable.run();
        }
        if (this.f12426m.getVoiceConsentFaceRecognitionState() == VoiceConsentFaceRecognitionState.f12226d) {
            int i3 = f12413y + 41;
            B = i3 % 128;
            int i4 = i3 % 2;
            if (scanResult == ScanResult.FINISHED_WITH_ERROR) {
                this.f12426m.setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12225c);
                EventUtils.sendVideoSelfieProcessingEvent(this.f12422i, Event.VIDEO_SELFIE_TOS_NOT_ACCEPTED, Modules.VIDEO_ONBOARDING, this.f12417d);
            }
        }
        if (scanResult == ScanResult.OK) {
            return true;
        }
        int i5 = B + 57;
        f12413y = i5 % 128;
        int i6 = i5 % 2;
        return scanResult == ScanResult.ERROR || scanResult == ScanResult.FINISHED_WITH_ERROR;
    }

    private Something<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> d(Bitmap bitmap, FacePositionConstraint facePositionConstraint) {
        int i2 = 2 % 2;
        if (!this.f12423j.d()) {
            return Something.empty(FaceProcessingUtils.FaceProcessingState.NOT_READY);
        }
        FaceProcessingUtils.DetectionData detectionData = new FaceProcessingUtils.DetectionData(bitmap);
        detectionData.detectedFaces = this.f12423j.e(detectionData.bitmap);
        ArrayList<Face> arrayList = detectionData.detectedFaces;
        if (arrayList.isEmpty()) {
            detectionData.detectionResultState = FaceProcessingUtils.FaceProcessingState.NO_FACE;
            return Something.empty(FaceProcessingUtils.FaceProcessingState.NO_FACE);
        }
        Timber.d("Face detected: %s", arrayList.get(0));
        Face face = arrayList.get(0);
        float f2 = face.yaw;
        float f3 = face.roll;
        Face.Rect rect = face.rect;
        if (!isWithinConstraints(new Rect((int) rect.f3644x, (int) rect.f3645y, ((int) rect.f3644x) + ((int) rect.width), ((int) rect.f3645y) + ((int) rect.height)), facePositionConstraint)) {
            int i3 = B + 39;
            f12413y = i3 % 128;
            int i4 = i3 % 2;
            Something<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> somethingEmpty = Something.empty(FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT);
            int i5 = f12413y + 63;
            B = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return somethingEmpty;
        }
        if (Math.abs(f2) > 15.0f) {
            Timber.v("Face rotation: %s", Float.valueOf(f2));
            return f2 > 0.0f ? Something.empty(FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_RIGHT) : Something.empty(FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_LEFT);
        }
        if (Math.abs(f3) > 15.0f) {
            Timber.v("Face tilt: %s", Float.valueOf(f3));
            return f3 > 0.0f ? Something.empty(FaceProcessingUtils.FaceProcessingState.FACE_TILTED_LEFT) : Something.empty(FaceProcessingUtils.FaceProcessingState.FACE_TILTED_RIGHT);
        }
        FaceProcessingUtils.FaceLandmarksState landmarkState = FaceUtils.getLandmarkState(face);
        Object obj = null;
        if (!landmarkState.recognitionLandmarksDetected()) {
            int i7 = f12413y + 123;
            B = i7 % 128;
            if (i7 % 2 != 0) {
                return Something.empty(FaceProcessingUtils.FaceProcessingState.NO_LANDMARKS);
            }
            Something.empty(FaceProcessingUtils.FaceProcessingState.NO_LANDMARKS);
            throw null;
        }
        Timber.d("Detected face size width: %s, height: %s", Float.valueOf(rect.width), Float.valueOf(rect.height));
        FaceProcessingUtils.FaceProcessingState faceProcessingStateA = new y(landmarkState, detectionData.bitmap, false, this.f12424k).a();
        if (faceProcessingStateA != FaceProcessingUtils.FaceProcessingState.FACE_DETECTED) {
            int i8 = B + 61;
            f12413y = i8 % 128;
            int i9 = i8 % 2;
            return Something.empty(faceProcessingStateA);
        }
        y yVar = new y(landmarkState, bitmap, true, this.f12424k);
        if (this.f12426m.isTooDark(yVar.b(), 0.0f)) {
            int i10 = B + 23;
            f12413y = i10 % 128;
            int i11 = i10 % 2;
            return Something.empty(FaceProcessingUtils.FaceProcessingState.LIGHT_TOO_DARK);
        }
        if (this.f12426m.isBlurred(yVar.b())) {
            return Something.empty(FaceProcessingUtils.FaceProcessingState.BLURRED_CROP);
        }
        detectionData.face = face;
        detectionData.faceLandmarksState = landmarkState;
        Something<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> somethingFrom = Something.from(detectionData, yVar.e(), FaceProcessingUtils.FaceProcessingState.FACE_DETECTED);
        int i12 = B + 39;
        f12413y = i12 % 128;
        if (i12 % 2 == 0) {
            return somethingFrom;
        }
        obj.hashCode();
        throw null;
    }

    private ScanResult e(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = f12413y + 105;
        B = i3 % 128;
        int i4 = i3 % 2;
        RecognitionFaceInfo recognitionFaceInfoPredictFace = RecogKitUtils.predictFace(this.f12419f.getRecogKitAndroid(), RecogKitUtils.getFaceInfoFromDetectionData(this.f12419f.getRecogKitAndroid(), detectionData));
        float recognitionThreshold = IncodeWelcome.getInstance().getInternalConfig().getRecognitionThreshold();
        Object[] objArr = {this, detectionData.bitmap, recognitionFaceInfoPredictFace, Float.valueOf(recognitionThreshold)};
        d(AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c(), 1846114107, objArr, -1846114107, AESViewModel.l.c());
        if (recognitionFaceInfoPredictFace != null) {
            Object[] objArr2 = {Float.valueOf(recognitionFaceInfoPredictFace.getPredictionConfidence()), Float.valueOf(recognitionThreshold)};
            if (((Boolean) d(AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c(), 192257826, objArr2, -192257825, AESViewModel.l.c())).booleanValue()) {
                this.f12432s = true;
                return ScanResult.RETRY;
            }
        }
        this.f12432s = false;
        int i5 = this.f12431r;
        this.f12431r = i5 + 1;
        ScanResult scanResultA = a(Integer.valueOf(i5));
        int i6 = f12413y + 89;
        B = i6 % 128;
        int i7 = i6 % 2;
        return scanResultA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r0 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult a(java.lang.Integer r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B = r0
            int r1 = r1 % r3
            int r1 = r5.intValue()
            r0 = 5
            if (r1 != r0) goto L34
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r2 = r0 + 47
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r2 = r2 % r3
            r1 = 3
            if (r2 == 0) goto L28
            int r0 = r4.f12433t
            r4.f12433t = r0
            if (r0 != r1) goto L31
        L25:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR
            return r0
        L28:
            int r0 = r4.f12433t
            int r0 = r0 + 1
            r4.f12433t = r0
            if (r0 != r1) goto L31
            goto L25
        L31:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
            return r0
        L34:
            com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.a(java.lang.Integer):com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r1 = r3 + 57;
        com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r6 >= r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6 >= r1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r8) {
        /*
            r7 = 0
            r0 = r8[r7]
            java.lang.Number r0 = (java.lang.Number) r0
            float r6 = r0.floatValue()
            r5 = 1
            r0 = r8[r5]
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r4 = 2
            int r0 = r4 % r4
            int r3 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r2 = r3 + 103
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r2 = r2 % r4
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 == 0) goto L2c
            r0 = 82
            int r0 = r0 / r7
            if (r1 < 0) goto L2f
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L2c:
            if (r1 < 0) goto L2f
            goto L27
        L2f:
            int r1 = r3 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r1 = r1 % r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = B + 99;
        f12413y = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("VoiceConsent face match frame added successfully", new Object[0]);
        this.f12429p = null;
        int i5 = B + 11;
        f12413y = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12413y + 41;
        B = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th);
        Object obj = null;
        this.f12429p = null;
        int i5 = f12413y + 43;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void b(VoiceConsentFaceMatchLastFrame voiceConsentFaceMatchLastFrame) {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 69;
        f12413y = i4 % 128;
        int i5 = i4 % 2;
        if (!this.f12428o) {
            int i6 = i3 + 73;
            int i7 = i6 % 128;
            f12413y = i7;
            int i8 = i6 % 2;
            if (voiceConsentFaceMatchLastFrame != null) {
                int i9 = i7 + 35;
                B = i9 % 128;
                int i10 = i9 % 2;
                this.f12422i.addVoiceConsentFace(voiceConsentFaceMatchLastFrame.getBase64Image(), voiceConsentFaceMatchLastFrame.getConfidence(), voiceConsentFaceMatchLastFrame.getThreshold()).subscribeOn(Schedulers.io()).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda9
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        this.f$0.e((ResponseSuccess) obj);
                    }
                }).doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        this.f$0.a((Throwable) obj);
                    }
                }).subscribe();
            }
        }
        int i11 = B + 107;
        f12413y = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12438c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12439e = 0;

        static {
            int[] iArr = new int[FaceProcessingUtils.FaceProcessingState.values().length];
            f12437b = iArr;
            try {
                iArr[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.INSUFFICIENT_FACE_SIZE.ordinal()] = 5;
                int i2 = f12438c + 9;
                f12439e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.FACE_TOO_CLOSE.ordinal()] = 6;
                int i5 = f12438c + 89;
                f12439e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.BLURRED_CROP.ordinal()] = 7;
                int i7 = f12439e + 35;
                f12438c = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.LENSES_DETECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.FACE_MASK_DETECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.EYES_CLOSED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.HEAD_COVERED.ordinal()] = 12;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.MULTIPLE_FACES_DETECTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.NO_FACE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.NOT_READY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12437b[FaceProcessingUtils.FaceProcessingState.LIGHT_TOO_DARK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX INFO: renamed from: showRealtimeFeedback, reason: avoid collision after fix types in other method */
    public void showRealtimeFeedback2(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        switch (AnonymousClass3.f12437b[faceProcessingState.ordinal()]) {
            case 1:
            case 2:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_tilted);
                int i3 = f12413y + 95;
                B = i3 % 128;
                int i4 = i3 % 2;
                return;
            case 3:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_rotated_left);
                return;
            case 4:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_rotated_right);
                return;
            case 5:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_too_far);
                return;
            case 6:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_too_close);
                return;
            case 7:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_blurred_crop);
                return;
            case 8:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_align_face);
                return;
            case 9:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_remove_lenses);
                return;
            case 10:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_mask_detected);
                return;
            case 11:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_open_eyes);
                return;
            case 12:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_remove_head_cover);
                return;
            case 13:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_multiple_faces_detected);
                int i5 = f12413y + 107;
                B = i5 % 128;
                int i6 = i5 % 2;
                return;
            case 14:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_feedback_position_your_face);
                return;
            case 15:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_face_scan_not_operational);
                return;
            case 16:
                this.f12416c.setVoiceConsentFaceRecognitionUiState(UiState.DEFAULT, R.string.onboard_sdk_face_scan_warn_selfie_too_dark);
                break;
        }
        int i7 = B + 79;
        f12413y = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFaceDetected() {
        /*
            r13 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r4 = r0 + 97
            int r0 = r4 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r4 = r4 % r5
            java.lang.String r3 = "VoiceConsent onFaceDetected"
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L69
            java.lang.Object[] r0 = new java.lang.Object[r1]
            timber.log.Timber.d(r3, r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r13.f12416c
            r0.setVoiceConsentUiVisible(r1)
            boolean r0 = r13.f12428o
            if (r0 == 0) goto L78
        L20:
            java.lang.String r0 = r13.f12421h
        L22:
            java.lang.Object[] r10 = new java.lang.Object[]{r13, r0}
            int r6 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            int r8 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            int r7 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            int r12 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.c()
            r9 = 1391550802(0x52f16152, float:5.1835994E11)
            r11 = -1391550800(0xffffffffad0e9eb0, float:-8.107001E-12)
            d(r6, r7, r8, r9, r10, r11, r12)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r13.f12416c
            r0.setFeedbackCenterVisible(r1)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r13.f12416c
            r0.setVoiceConsentUiDone(r2)
            boolean r0 = r13.f12428o
            if (r0 == r1) goto L5d
            java.lang.String r0 = r13.f12420g
        L4f:
            r13.b(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r13.f12416c
            r0.setVoiceConsentFaceRecognitionUiVisible(r2)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r13.f12416c
            r0.setVoiceConsentPlaceholderFaceVisible(r2)
            return
        L5d:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.B
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.f12413y = r0
            int r1 = r1 % r5
            java.lang.String r0 = r13.f12421h
            goto L4f
        L69:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.d(r3, r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r13.f12416c
            r0.setVoiceConsentUiVisible(r1)
            boolean r0 = r13.f12428o
            if (r0 == 0) goto L78
            goto L20
        L78:
            java.lang.String r0 = r13.f12420g
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent.onFaceDetected():void");
    }

    public void onFaceNotFound() {
        int i2 = 2 % 2;
        int i3 = f12413y + 115;
        B = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.d("VoiceConsent onFaceNotFound", new Object[0]);
        } else {
            Timber.d("VoiceConsent onFaceNotFound", new Object[0]);
        }
        this.f12416c.setVoiceConsentUiVisible(false);
        this.f12416c.setFeedbackCenterVisible(false);
        this.f12416c.setVoiceConsentRetryFaceRecognitionUiState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12413y + 25;
        B = i3 % 128;
        int i4 = i3 % 2;
        retryOnFaceDoNotMatch();
        int i5 = f12413y + 81;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    public ScanResult lastFrameNotMatched() {
        int i2 = 2 % 2;
        ScanResult scanResultA = a((Integer) 5);
        showErrorOnFaceDoNotMatch();
        if (scanResultA == ScanResult.FINISHED_WITH_ERROR) {
            int i3 = B + 35;
            f12413y = i3 % 128;
            if (i3 % 2 != 0) {
                b(this.f12429p);
                this.f12426m.setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12225c);
                throw null;
            }
            b(this.f12429p);
            this.f12426m.setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12225c);
        } else {
            this.f12415b.add(Single.timer(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.d((Long) obj);
                }
            }));
            int i4 = B + 53;
            f12413y = i4 % 128;
            int i5 = i4 % 2;
        }
        return scanResultA;
    }

    public void showErrorOnFaceDoNotMatch() {
        int i2 = 2 % 2;
        int i3 = f12413y + 97;
        B = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.d("VoiceConsent showErrorOnFaceDoNotMatch", new Object[0]);
            this.f12416c.setVoiceConsentFaceMatchErrorUiState();
            this.f12431r = 1;
        } else {
            Timber.d("VoiceConsent showErrorOnFaceDoNotMatch", new Object[0]);
            this.f12416c.setVoiceConsentFaceMatchErrorUiState();
            this.f12431r = 0;
        }
    }

    public void retryOnFaceDoNotMatch() {
        int i2 = 2 % 2;
        int i3 = B + 19;
        f12413y = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("VoiceConsent retryOnFaceDoNotMatch", new Object[0]);
        this.f12416c.setVoiceConsentRetryFaceRecognitionUiState();
        int i5 = f12413y + 73;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        VoiceConsent voiceConsent = (VoiceConsent) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f12413y + 89;
        B = i3 % 128;
        int i4 = i3 % 2;
        voiceConsent.f12416c.playWaveformAnimation(true);
        voiceConsent.f12416c.setTapToAnswerLayoutVisible(true);
        voiceConsent.f12416c.setTapToAnswerContentVisible(true);
        voiceConsent.f12416c.setTapToAnswerButtonText(R.string.onboard_sdk_video_selfie_tap_to_speak);
        voiceConsent.f12416c.setVoiceConsentText(str);
        int i5 = f12413y + 45;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return null;
    }

    private void b(String str) {
        int i2 = 2 % 2;
        int i3 = B + 79;
        f12413y = i3 % 128;
        int i4 = i3 % 2;
        this.f12416c.showFeedbackCenter(str);
        int i5 = B + 85;
        f12413y = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean processesFrames() {
        int i2 = 2 % 2;
        int i3 = B + 85;
        int i4 = i3 % 128;
        f12413y = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f12427n;
        int i6 = i4 + 3;
        B = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isComplete() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 29;
        f12413y = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f12436x;
        int i6 = i3 + 89;
        f12413y = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    /* JADX INFO: renamed from: addProcessingErrorState, reason: avoid collision after fix types in other method */
    public void addProcessingErrorState2(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        String strFaceProcessingStateToEvent;
        int i2 = 2 % 2;
        int i3 = B + 103;
        int i4 = i3 % 128;
        f12413y = i4;
        int i5 = i3 % 2;
        if (faceProcessingState != null) {
            int i6 = i4 + 27;
            B = i6 % 128;
            if (i6 % 2 != 0) {
                if (faceProcessingState != this.f12414a && (strFaceProcessingStateToEvent = EventUtils.faceProcessingStateToEvent(faceProcessingState)) != null) {
                    this.f12414a = faceProcessingState;
                    this.f12417d.add(strFaceProcessingStateToEvent);
                    return;
                }
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = B + 107;
        f12413y = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_TOS_ACCEPTED, Modules.VIDEO_ONBOARDING, this.f12417d);
            int i4 = 28 / 0;
        } else {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_TOS_ACCEPTED, Modules.VIDEO_ONBOARDING, this.f12417d);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showWinState() {
        VideoRecordingContract.View view;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f12413y + 31;
        B = i3 % 128;
        if (i3 % 2 == 0) {
            view = this.f12416c;
            z2 = false;
        } else {
            view = this.f12416c;
            z2 = true;
        }
        view.setVoiceConsentUiDone(z2);
        int i4 = f12413y + 75;
        B = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void cleanup(Runnable runnable) throws Throwable {
        Bitmap bitmap;
        File imagesDirectory;
        Object obj;
        int i2 = 2 % 2;
        int i3 = B + 77;
        f12413y = i3 % 128;
        int i4 = i3 % 2;
        this.f12416c.finishVideoSelfieProgressStep(VideoSelfieScanState.f12204j);
        this.f12416c.setFeedbackCenterVisible(false);
        this.f12416c.playWaveformAnimation(false);
        this.f12416c.setTapToAnswerContentVisible(false);
        this.f12416c.setTapToAnswerResultVisible(false);
        this.f12415b.clear();
        if (!this.f12427n) {
            runnable.run();
            return;
        }
        if (this.f12428o) {
            int i5 = f12413y + 57;
            B = i5 % 128;
            if (i5 % 2 == 0) {
                bitmap = this.f12435w.bitmap;
                imagesDirectory = this.f12422i.getImagesDirectory();
                Object[] objArr = new Object[1];
                z("際㟜⿂雭鈷怫播邕\u0094్츱\ue766먄\ue5e7塝緍嗈弁⇼펷콄좷謗⨏礝ꋍᒷ", (-1) >>> TextUtils.indexOf("", AbstractJsonLexerKt.END_OBJ, 1), objArr);
                obj = objArr[0];
            } else {
                bitmap = this.f12435w.bitmap;
                imagesDirectory = this.f12422i.getImagesDirectory();
                Object[] objArr2 = new Object[1];
                z("際㟜⿂雭鈷怫播邕\u0094్츱\ue766먄\ue5e7塝緍嗈弁⇼펷콄좷謗⨏礝ꋍᒷ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
                obj = objArr2[0];
            }
            BitmapUtils.saveBitmapToFile(bitmap, imagesDirectory, ((String) obj).intern());
        } else {
            b(this.f12429p);
        }
        this.f12416c.setVoiceConsentFaceRecognitionUiVisible(false);
        this.f12416c.setVoiceConsentCameraOverlay(false, runnable);
    }

    public boolean isSubmitVoiceConsentAudioAllowed() {
        int i2 = 2 % 2;
        int i3 = f12413y + 65;
        B = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f12432s;
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        return z2;
    }

    public void setProcessing(boolean z2) {
        int i2 = 2 % 2;
        int i3 = B + 121;
        f12413y = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12434u = z2;
            return;
        }
        this.f12434u = z2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isProcessingInProgress() {
        int i2 = 2 % 2;
        int i3 = B + 121;
        f12413y = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12434u;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f12413y = 0;
        B = 1;
        f12412v = 2735645719908254356L;
    }

    private void c(String str) {
        int iC = AESViewModel.l.c();
        int iC2 = AESViewModel.l.c();
        d(iC, AESViewModel.l.c(), iC2, 1391550802, new Object[]{this, str}, -1391550800, AESViewModel.l.c());
    }

    private void a(Bitmap bitmap, RecognitionFaceInfo recognitionFaceInfo, float f2) {
        Object[] objArr = {this, bitmap, recognitionFaceInfo, Float.valueOf(f2)};
        d(AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c(), 1846114107, objArr, -1846114107, AESViewModel.l.c());
    }

    private static boolean c(float f2, float f3) {
        Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3)};
        return ((Boolean) d(AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c(), 192257826, objArr, -192257825, AESViewModel.l.c())).booleanValue();
    }
}
