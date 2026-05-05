package com.incode.welcome_sdk.ui.camera.selfie;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import com.incode.recogkitandroid.Face;
import com.incode.recogkitandroid.FaceAttributes;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.c;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.c.c.b;
import com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException;
import com.incode.welcome_sdk.commons.exceptions.IncodeHttpException;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.httpinterceptors.e;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.BasicDrawer;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.commons.utils.ae;
import com.incode.welcome_sdk.commons.utils.ah;
import com.incode.welcome_sdk.commons.utils.an;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.commons.utils.y;
import com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.RecognitionFaceInfo;
import com.incode.welcome_sdk.data.SelfieScanFrameLogs;
import com.incode.welcome_sdk.data.TemplateModel;
import com.incode.welcome_sdk.data.j;
import com.incode.welcome_sdk.data.local.FaceInfo;
import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode;
import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationOverallStatus;
import com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication;
import com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.ak;
import com.incode.welcome_sdk.data.remote.beans.ba;
import com.incode.welcome_sdk.data.remote.beans.f;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.data.remote.beans.v;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.modules.g;
import com.incode.welcome_sdk.results.DeviceStats;
import com.incode.welcome_sdk.results.FaceAuthenticationResult;
import com.incode.welcome_sdk.results.FaceLoginResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.ui.camera.CameraPresenter;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdealEnvironmentTestResult;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieContract;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokEventListener;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class SelfiePresenter extends CameraPresenter implements com.incode.welcome_sdk.commons.video_upload.a, SelfieContract.Presenter {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char ae = 0;
    private static int af = 0;
    private static int ag = 0;
    private static char[] ah = null;
    private final RecogManager A;
    private final boolean B;
    private Intent C;
    private final CompositeDisposable D;
    private Disposable E;
    private PublishSubject<Bitmap> F;
    private boolean G;
    private Boolean H;
    private Disposable I;
    private FaceProcessingUtils.FaceProcessingState J;
    private String K;
    private boolean L;
    private ArrayList<String> M;
    private FacePositionConstraint N;
    private float O;
    private Boolean P;
    private LinkedList<SelfieScanFrameLogs.e> Q;
    private long R;
    private String S;
    private volatile FaceProcessingUtils.DetectionData T;
    private AtomicInteger U;
    private boolean V;
    private FaceProcessingUtils.FaceProcessingState W;
    private Integer X;
    private final Single<Boolean> Y;
    private volatile float Z;
    private boolean aa;
    private final Handler ab;
    private PublishSubject<Object> ac;

    /* JADX INFO: renamed from: h */
    private final float f12035h;

    /* JADX INFO: renamed from: j */
    private final float f12036j;

    /* JADX INFO: renamed from: k */
    private int f12037k;

    /* JADX INFO: renamed from: l */
    private final float f12038l;

    /* JADX INFO: renamed from: m */
    private SelfieActivity.SelfieScanModeExtended f12039m;

    /* JADX INFO: renamed from: n */
    private int f12040n;

    /* JADX INFO: renamed from: o */
    private int f12041o;

    /* JADX INFO: renamed from: p */
    @Deprecated
    private SelfieScan.FaceRecognitionMode f12042p;

    /* JADX INFO: renamed from: q */
    private SelfieScan.LivenessDetectionMode f12043q;

    /* JADX INFO: renamed from: r */
    private boolean f12044r;

    /* JADX INFO: renamed from: s */
    private boolean f12045s;

    /* JADX INFO: renamed from: t */
    private SelfieScan.FaceAuthMode f12046t;

    /* JADX INFO: renamed from: u */
    private final SelfieContract.View f12047u;

    /* JADX INFO: renamed from: v */
    private boolean f12048v;

    /* JADX INFO: renamed from: w */
    private boolean f12049w;

    /* JADX INFO: renamed from: x */
    private boolean f12050x;

    /* JADX INFO: renamed from: y */
    private final b f12051y;

    /* JADX INFO: renamed from: z */
    private final CompositeDisposable f12052z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r6, byte r7, int r8) {
        /*
            int r1 = r6 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 + 118
            byte[] r6 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.$$c
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r6 != 0) goto L28
            r3 = r4
            r0 = r1
        L11:
            int r1 = -r1
            int r1 = r1 + r7
            r2 = r3
            r7 = r1
            r1 = r0
        L16:
            int r0 = r1 + 1
            byte r1 = (byte) r7
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r1 = r6[r0]
            goto L11
        L28:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.$$e(int, byte, int):java.lang.String");
    }

    public static /* synthetic */ Triple $r8$lambda$79L_dSgEXc9THdbDqYgEUj_4EuU(Object obj, Object obj2, Object obj3) {
        return new Triple(obj, obj2, obj3);
    }

    public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~(i4 | i6 | i2);
        int i9 = ~i6;
        int i10 = (~(i9 | i2)) | (~((~i2) | i4));
        int i11 = (~(i2 | (~i4))) | i9;
        int i12 = i4 + i6 + i3 + ((-2044576983) * i5) + (1743660113 * i7);
        int i13 = i12 * i12;
        int i14 = ((1047202342 * i4) - 713031680) + (164951516 * i6) + (i8 * 441125413) + (441125413 * i10) + ((-441125413) * i11) + (606076928 * i3) + (689963008 * i5) + ((-299892736) * i7) + ((-1081737216) * i13);
        int i15 = ((i4 * 2048727874) - 782056376) + (i6 * 2048728756) + (i8 * (-441)) + (i10 * (-441)) + (i11 * 441) + (i3 * 2048728315) + (i5 * 2142076211) + (i7 * (-1448904853)) + (i13 * 1885470720);
        switch (i14 + (i15 * i15 * (-1618345984))) {
            case 1:
                return b(objArr);
            case 2:
                return e(objArr);
            case 3:
                Object obj = objArr[0];
                int i16 = 2 % 2;
                int i17 = ag + 9;
                af = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 4:
                return c(objArr);
            case 5:
                final SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
                int i19 = 2 % 2;
                int i20 = af + 73;
                ag = i20 % 128;
                int i21 = i20 % 2;
                selfiePresenter.e(-1);
                selfiePresenter.f12047u.showNoNetworkMessage(new Function0() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f$0.C();
                    }
                });
                int i22 = af + 75;
                ag = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 6:
                return a(objArr);
            case 7:
                return h(objArr);
            case 8:
                Runnable runnable = (Runnable) objArr[0];
                int i24 = 2 % 2;
                int i25 = ag + 93;
                af = i25 % 128;
                int i26 = i25 % 2;
                runnable.run();
                int i27 = af + 25;
                ag = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 9:
                final SelfiePresenter selfiePresenter2 = (SelfiePresenter) objArr[0];
                final String str = (String) objArr[1];
                int i29 = 2 % 2;
                int i30 = ag + 59;
                af = i30 % 128;
                int i31 = i30 % 2;
                Single singleDoOnSuccess = ((Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{selfiePresenter2.T.bitmap}, -1008976873, BasicDrawer.d(), 1008976875, BasicDrawer.d())).subscribeOn(selfiePresenter2.mDetectionScheduler).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda53
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return this.f$0.b(str, (Pair) obj2);
                    }
                }).observeOn(AndroidSchedulers.mainThread()).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda54
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) throws Exception {
                        this.f$0.a((Triple) obj2);
                    }
                });
                int i32 = ag + 5;
                af = i32 % 128;
                int i33 = i32 % 2;
                return singleDoOnSuccess;
            case 10:
                return f(objArr);
            case 11:
                return j(objArr);
            case 12:
                return i(objArr);
            case 13:
                return g(objArr);
            case 14:
                return o(objArr);
            case 15:
                return n(objArr);
            case 16:
                return k(objArr);
            case 17:
                return m(objArr);
            case 18:
                return l(objArr);
            case 19:
                Runnable runnable2 = (Runnable) objArr[0];
                int i34 = 2 % 2;
                int i35 = ag + 7;
                af = i35 % 128;
                int i36 = i35 % 2;
                runnable2.run();
                int i37 = ag + 69;
                af = i37 % 128;
                int i38 = i37 % 2;
                return null;
            case 20:
                return q(objArr);
            case 21:
                SelfiePresenter selfiePresenter3 = (SelfiePresenter) objArr[0];
                int i39 = 2 % 2;
                selfiePresenter3.publishResult(new SelfieScanResult(ResultCode.ERROR, (Throwable) objArr[1], new DeviceStats(selfiePresenter3.getMotionStatus())));
                int i40 = ag + 13;
                af = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 22:
                return t(objArr);
            default:
                return d(objArr);
        }
    }

    static void init$0() {
        $$c = new byte[]{67, 111, Ascii.EM, 19};
        $$d = Mp4VideoDirectory.TAG_DEPTH;
    }

    @Inject
    public SelfiePresenter(IncodeWelcomeRepository incodeWelcomeRepository, b bVar, RecogManager recogManager, SelfieContract.View view) {
        super(view, incodeWelcomeRepository);
        this.f12041o = 0;
        this.f12039m = SelfieActivity.SelfieScanModeExtended.ENROLL;
        this.f12042p = SelfieScan.FaceRecognitionMode.getDefault();
        this.f12043q = SelfieScan.LivenessDetectionMode.getDefault();
        this.f12046t = SelfieScan.FaceAuthMode.SERVER;
        this.G = true;
        this.H = Boolean.FALSE;
        this.M = new ArrayList<>();
        this.Q = new LinkedList<>();
        this.P = Boolean.FALSE;
        this.W = FaceProcessingUtils.FaceProcessingState.EMPTY;
        this.ab = new Handler(Looper.getMainLooper());
        this.Y = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda39
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.D();
            }
        }).cache();
        this.ac = PublishSubject.create();
        this.f12047u = view;
        this.A = recogManager;
        this.f12051y = bVar;
        this.U = new AtomicInteger(0);
        IncodeWelcome.InternalConfig internalConfig = IncodeWelcome.getInstance().getInternalConfig();
        this.D = new CompositeDisposable();
        this.f12052z = new CompositeDisposable();
        this.B = IncodeWelcome.getInstance().isCaptureOnlyMode();
        this.f12035h = internalConfig.getBrightnessThreshold();
        this.f12036j = internalConfig.getSpoofThreshold();
        this.f12038l = internalConfig.getRecognitionThreshold();
        a();
        s();
        if (IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            checkDeviceEnvironment();
        }
    }

    public /* synthetic */ void A() {
        int i2 = 2 % 2;
        int i3 = ag + 117;
        af = i3 % 128;
        setProcessingInProgress(i3 % 2 != 0);
        int i4 = af + 79;
        ag = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ ObservableSource a(Observable observable) {
        int i2 = 2 % 2;
        int i3 = ag + 55;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            return processPreviewFrame(observable, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda47
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.A();
                }
            });
        }
        processPreviewFrame(observable, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.A();
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onResume() {
        int i2 = 2 % 2;
        int i3 = ag + 77;
        af = i3 % 128;
        int i4 = i3 % 2;
        if (!(!((CameraPresenter) this).f11262b)) {
            int i5 = af + 39;
            ag = i5 % 128;
            int i6 = i5 % 2;
            enableProcessing(true);
        }
        this.f11265e.add(((CameraPresenter) this).f11261a.subscribeOn(this.mDetectionScheduler).observeOn(this.mDetectionScheduler).compose(new ObservableTransformer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda59
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return this.f$0.a(observable);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda60
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.stopProcessing();
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda61
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SelfiePresenter.b(obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda62
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f$0.onDetectionError((Throwable) obj);
            }
        }));
        this.f11264d = false;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = ag + 121;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            super.onPause();
            stopAutoShutterTimer();
        } else {
            super.onPause();
            stopAutoShutterTimer();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setIntent(Intent intent) {
        int i2 = 2 % 2;
        int i3 = af + 85;
        int i4 = i3 % 128;
        ag = i4;
        int i5 = i3 % 2;
        this.C = intent;
        int i6 = i4 + 85;
        af = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setMode(SelfieActivity.SelfieScanModeExtended selfieScanModeExtended) {
        int i2 = 2 % 2;
        int i3 = af;
        int i4 = i3 + 29;
        ag = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (selfieScanModeExtended == null) {
            return;
        }
        this.f12039m = selfieScanModeExtended;
        int i5 = i3 + 73;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    @Deprecated
    public void setFaceRecognitionMode(SelfieScan.FaceRecognitionMode faceRecognitionMode) {
        int i2 = 2 % 2;
        int i3 = ag + 57;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        if (faceRecognitionMode != null) {
            this.f12042p = faceRecognitionMode;
            return;
        }
        int i6 = i4 + 99;
        ag = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
    }

    public void setClosedEyesCheckEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag + 89;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12044r = z2;
            int i4 = 86 / 0;
        } else {
            this.f12044r = z2;
        }
    }

    public void setHeadCoverCheckEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = af + 109;
        int i4 = i3 % 128;
        ag = i4;
        if (i3 % 2 != 0) {
            this.f12050x = z2;
            int i5 = i4 + 91;
            af = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.f12050x = z2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLensesCheckEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = af;
        int i4 = i3 + 27;
        ag = i4 % 128;
        int i5 = i4 % 2;
        this.f12049w = z2;
        int i6 = i3 + 93;
        ag = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setMaskCheckEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag + 55;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12048v = z2;
        } else {
            this.f12048v = z2;
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setLivenessDetectionMode(SelfieScan.LivenessDetectionMode livenessDetectionMode) {
        int i2 = 2 % 2;
        int i3 = ag + 49;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        if (livenessDetectionMode == null) {
            int i6 = i4 + 81;
            ag = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        this.f12043q = livenessDetectionMode;
        int i8 = i4 + 11;
        ag = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setFaceAuthMode(SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        if (faceAuthMode == null) {
            int i3 = ag + 25;
            af = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.f12046t = faceAuthMode;
        int i5 = af + 75;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setCustomerUUID(String str) {
        int i2 = 2 % 2;
        int i3 = ag;
        int i4 = i3 + 111;
        af = i4 % 128;
        int i5 = i4 % 2;
        this.K = str;
        int i6 = i3 + 117;
        af = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 50 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ad(java.lang.String r29, byte r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ad(java.lang.String, byte, int, java.lang.Object[]):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setStreamFramesToken(String str) {
        int i2 = 2 % 2;
        int i3 = ag + 117;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.S = str;
            return;
        }
        this.S = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setAllowFaceAuthModeFallback(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag;
        int i4 = i3 + 107;
        af = i4 % 128;
        int i5 = i4 % 2;
        this.f12045s = z2;
        int i6 = i3 + 59;
        af = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setAutoCaptureTimeout(int i2) {
        int i3 = 2 % 2;
        int i4 = af + 39;
        ag = i4 % 128;
        if (i4 % 2 != 0) {
            this.f12040n = i2;
            return;
        }
        this.f12040n = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setStoreLocalAuthenticationEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag + 45;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.aa = z2;
        } else {
            this.aa = z2;
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setCaptureAttempts(int i2) {
        int i3 = 2 % 2;
        int i4 = af;
        int i5 = i4 + 63;
        ag = i5 % 128;
        int i6 = i5 % 2;
        this.f12037k = i2;
        int i7 = i4 + 37;
        ag = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean isAgeAssuranceUXEnabled() {
        int i2 = 2 % 2;
        int i3 = ag + 63;
        af = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.V;
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        return z2;
    }

    public void setAgeAssuranceUXEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = af + 95;
        int i4 = i3 % 128;
        ag = i4;
        if (i3 % 2 == 0) {
            this.V = z2;
            int i5 = 96 / 0;
        } else {
            this.V = z2;
        }
        int i6 = i4 + 59;
        af = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0042, code lost:
    
        if (r4.A.getRecogKitAndroid() != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        if (r4.A.getSelfieFaceDetectorKit() == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0050, code lost:
    
        if (n() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0052, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005c, code lost:
    
        if (r4.A.getRecogKitAndroid() != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005f, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Selfie Face Detector did not load successfully. Local login is not available.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0072, code lost:
    
        throw new java.lang.IllegalStateException("Local face recognition not enabled during SDK init!");
     */
    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void prepare() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r3
            int[] r1 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.AnonymousClass2.f12054b
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r0 = r4.f12039m
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 1
            if (r0 == r2) goto L27
            if (r0 == r3) goto L1f
        L1b:
            r4.setAutoCaptureEnabled(r2)
            return
        L1f:
            com.incode.welcome_sdk.ui.camera.selfie.SelfieContract$View r1 = r4.f12047u
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_mask_check_info
            r1.showInfo(r0)
            goto L1b
        L27:
            com.incode.welcome_sdk.modules.SelfieScan$FaceAuthMode r1 = r4.f12046t
            com.incode.welcome_sdk.modules.SelfieScan$FaceAuthMode r0 = com.incode.welcome_sdk.modules.SelfieScan.FaceAuthMode.LOCAL
            if (r1 != r0) goto L1b
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L56
            com.incode.welcome_sdk.commons.RecogManager r0 = r4.A
            com.incode.recogkitandroid.RecogKitAndroid r1 = r0.getRecogKitAndroid()
            r0 = 13
            int r0 = r0 / 0
            if (r1 == 0) goto L6b
        L44:
            com.incode.welcome_sdk.commons.RecogManager r0 = r4.A
            com.incode.recogkitandroid.SelfieFaceDetectorKit r0 = r0.getSelfieFaceDetectorKit()
            if (r0 == 0) goto L63
            boolean r0 = r4.n()
            if (r0 == 0) goto L5f
            r4.d()
            goto L1b
        L56:
            com.incode.welcome_sdk.commons.RecogManager r0 = r4.A
            com.incode.recogkitandroid.RecogKitAndroid r0 = r0.getRecogKitAndroid()
            if (r0 == 0) goto L6b
            goto L44
        L5f:
            r4.e()
            goto L1b
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Selfie Face Detector did not load successfully. Local login is not available."
            r1.<init>(r0)
            throw r1
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Local face recognition not enabled during SDK init!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.prepare():void");
    }

    public /* synthetic */ void a(List list) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ag = i3 % 128;
        int i4 = i3 % 2;
        RecogKitUtils.trainRecogKitWithFaceInfos(this.A.getRecogKitAndroid(), list);
        int i5 = af + 105;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = af + 9;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.D.add(getRepository().getFaces().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda40
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a((List) obj);
            }
        }));
        int i5 = ag + 103;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        List list = (List) objArr[1];
        int i2 = 2 % 2;
        int i3 = ag + 29;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            RecogKitUtils.clearRecogKitRecognitionSet(selfiePresenter.A.getRecogKitAndroid());
            if (selfiePresenter.f12045s) {
                selfiePresenter.f12046t = SelfieScan.FaceAuthMode.SERVER;
                return null;
            }
            selfiePresenter.b("Can’t perform local face recognition. No templates. Try enabling the “Perform server and store user if local fails” option.");
            return null;
        }
        RecogKitUtils.trainRecogKitWithFaceInfos(selfiePresenter.A.getRecogKitAndroid(), list);
        int i4 = ag + 1;
        af = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return null;
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = ag + 23;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.D.add(getRepository().getFacesByCustomerId(this.K).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda50
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b((List) obj);
                }
            }, new SelfiePresenter$$ExternalSyntheticLambda67()));
            return;
        }
        this.D.add(getRepository().getFacesByCustomerId(this.K).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda50
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((List) obj);
            }
        }, new SelfiePresenter$$ExternalSyntheticLambda67()));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setFacePositionConstraint(FacePositionConstraint facePositionConstraint) {
        int i2 = 2 % 2;
        int i3 = ag + 49;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        this.N = facePositionConstraint;
        int i6 = i4 + 117;
        ag = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void startFaceDetection(boolean z2) {
        int i2 = 2 % 2;
        int i3 = af + 117;
        ag = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (isAutoCaptureEnabled()) {
                this.R = new Date().getTime();
                this.M = new ArrayList<>();
                this.J = null;
                enableProcessing(true);
                setProcessingInProgress(false);
                if (z2) {
                    int i4 = ag + 37;
                    af = i4 % 128;
                    if (i4 % 2 == 0) {
                        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this}, -1555821057, BasicDrawer.d(), 1555821071, BasicDrawer.d());
                        return;
                    } else {
                        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this}, -1555821057, BasicDrawer.d(), 1555821071, BasicDrawer.d());
                        throw null;
                    }
                }
            } else {
                this.f12047u.setShutterButtonVisible(true);
                EventUtils.sendSwitchToManualCaptureEvent(getRepository(), Event.SWITCH_TO_MANUAL_CAPTURE_SELFIE, this.f12047u.getModule(), this.M);
            }
            int i5 = af + 57;
            ag = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
                return;
            }
            return;
        }
        isAutoCaptureEnabled();
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void stopFaceDetection() {
        int i2 = 2 % 2;
        int i3 = af + 41;
        ag = i3 % 128;
        int i4 = i3 % 2;
        enableProcessing(false);
        int i5 = ag + 109;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public boolean isAutoCaptureEnabled() {
        int i2 = 2 % 2;
        int i3 = ag;
        int i4 = i3 + 13;
        af = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.G;
        int i5 = i3 + 49;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setAutoCaptureEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag;
        int i4 = i3 + 37;
        af = i4 % 128;
        int i5 = i4 % 2;
        this.G = z2;
        int i6 = i3 + 71;
        af = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public boolean isManualCaptureMode() {
        int i2 = 2 % 2;
        int i3 = af + 65;
        ag = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = this.H.booleanValue();
        int i5 = ag + 57;
        af = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        boolean z2 = false;
        final SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 1;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            SelfieActivity.SelfieScanModeExtended selfieScanModeExtended = selfiePresenter.f12039m;
            SelfieActivity.SelfieScanModeExtended selfieScanModeExtended2 = SelfieActivity.SelfieScanModeExtended.LOGIN;
            throw null;
        }
        if (selfiePresenter.f12039m == SelfieActivity.SelfieScanModeExtended.LOGIN) {
            z2 = true;
        } else {
            int i4 = af + 87;
            ag = i4 % 128;
            int i5 = i4 % 2;
        }
        return selfiePresenter.isDeviceEnvironmentSafe(z2).subscribeOn(Schedulers.io()).doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.o((Throwable) obj);
            }
        }).onErrorReturnItem(Boolean.FALSE);
    }

    public static /* synthetic */ void c(Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 99;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void checkDeviceEnvironment() {
        int i2 = 2 % 2;
        int i3 = ag + 89;
        af = i3 % 128;
        int i4 = i3 % 2;
        this.D.add(this.Y.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda17
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SelfiePresenter.c((Boolean) obj);
            }
        }, new SelfiePresenter$$ExternalSyntheticLambda67()));
        int i5 = af + 29;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    public /* synthetic */ void a(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 97;
        af = i3 % 128;
        int i4 = i3 % 2;
        c();
        if (i4 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = ag + 71;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = ag + 101;
        af = i3 % 128;
        int i4 = i3 % 2;
        this.D.add(this.ac.observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda42
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a(obj);
            }
        }, new SelfiePresenter$$ExternalSyntheticLambda67()));
        int i5 = ag + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        this.ac.onNext(new Object());
        int i3 = ag + 99;
        af = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001c, code lost:
    
        if (r2 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001e, code lost:
    
        r3.ac.onNext(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0028, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r2 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r3.f12047u.isVoiceOverActive() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag + 57;
        com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r1 % 128;
        r1 = r1 % 2;
        r2 = r2 << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        r3.I = io.reactivex.Observable.timer(r2, java.util.concurrent.TimeUnit.SECONDS).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda18(r3), new com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda67());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object o(java.lang.Object[] r7) {
        /*
            r6 = 0
            r3 = r7[r6]
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter r3 = (com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter) r3
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r5
            r4 = 0
            if (r1 == 0) goto L29
            r3.stopAutoShutterTimer()
            int r2 = r3.f12040n
            r0 = 88
            int r0 = r0 / r6
            if (r2 > 0) goto L31
        L1e:
            io.reactivex.subjects.PublishSubject<java.lang.Object> r1 = r3.ac
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.onNext(r0)
            return r4
        L29:
            r3.stopAutoShutterTimer()
            int r2 = r3.f12040n
            if (r2 > 0) goto L31
            goto L1e
        L31:
            com.incode.welcome_sdk.ui.camera.selfie.SelfieContract$View r0 = r3.f12047u
            boolean r0 = r0.isVoiceOverActive()
            if (r0 == 0) goto L44
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r5
            int r2 = r2 << 1
        L44:
            long r1 = (long) r2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r1 = io.reactivex.Observable.timer(r1, r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r2 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda18 r1 = new com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda18
            r1.<init>()
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda67 r0 = new com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda67
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.I = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.o(java.lang.Object[]):java.lang.Object");
    }

    public void stopAutoShutterTimer() {
        int i2 = 2 % 2;
        int i3 = ag + 91;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        Disposable disposable = this.I;
        if (disposable != null) {
            int i6 = i4 + 97;
            ag = i6 % 128;
            if (i6 % 2 != 0) {
                disposable.dispose();
            } else {
                disposable.dispose();
                throw null;
            }
        }
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = af + 51;
        ag = i3 % 128;
        int i4 = i3 % 2;
        stopAutoShutterTimer();
        if (this.W != FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED) {
            this.H = Boolean.TRUE;
            l();
            enableProcessing(false);
            setAutoCaptureEnabled(false);
            f();
            this.f12047u.enteredManualCaptureMode();
            EventUtils.sendSwitchToManualCaptureEvent(getRepository(), Event.SWITCH_TO_MANUAL_CAPTURE_SELFIE, this.f12047u.getModule(), this.M);
            return;
        }
        int i5 = ag + 123;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ FaceProcessingUtils.DetectionData h(Bitmap bitmap) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 3;
        ag = i3 % 128;
        int i4 = i3 % 2;
        File imagesDirectory = getRepository().getImagesDirectory();
        Object[] objArr = new Object[1];
        ad("\t\u0000㙒㙒\u0004\u000b\u0001\u0004\u0006\u0002\u0004\u000f\u000f\u000e\t\b㙛", (byte) (Color.rgb(0, 0, 0) + 16777308), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr);
        BitmapUtils.saveBitmapToFile(bitmap, imagesDirectory, ((String) objArr[0]).intern());
        File imagesDirectory2 = getRepository().getImagesDirectory();
        Object[] objArr2 = new Object[1];
        ad("\r\u000f\f\t\n\u000f", (byte) (TextUtils.indexOf("", "") + 16), ExpandableListView.getPackedPositionGroup(0L) + 6, objArr2);
        BitmapUtils.saveBitmapToFile(bitmap, imagesDirectory2, ((String) objArr2[0]).intern());
        if (!j()) {
            return new FaceProcessingUtils.DetectionData(bitmap);
        }
        FaceProcessingUtils.DetectionData selfieDetectionResultNoConstraints = getSelfieDetectionResultNoConstraints(bitmap, true);
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, selfieDetectionResultNoConstraints}, 937070029, BasicDrawer.d(), -937070018, BasicDrawer.d());
        int i5 = af + 63;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return selfieDetectionResultNoConstraints;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        int i2 = 2 % 2;
        int i3 = ag + 57;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            selfiePresenter.publishDetectionResult(FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED);
            selfiePresenter.T = detectionData;
            int i4 = 32 / 0;
        } else {
            selfiePresenter.publishDetectionResult(FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED);
            selfiePresenter.T = detectionData;
        }
        int i5 = ag + 67;
        af = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private void f() {
        int i2 = 2 % 2;
        int i3 = ag + 13;
        af = i3 % 128;
        int i4 = i3 % 2;
        if (this.F == null) {
            this.F = PublishSubject.create();
            int i5 = af + 87;
            ag = i5 % 128;
            int i6 = i5 % 2;
        }
        this.D.add(this.F.subscribeOn(this.mDetectionScheduler).observeOn(this.mDetectionScheduler).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda65
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.h((Bitmap) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda66
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.l((FaceProcessingUtils.DetectionData) obj);
            }
        }, new SelfiePresenter$$ExternalSyntheticLambda67()));
        int i7 = ag + 13;
        af = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private boolean j() {
        int i2 = 2 % 2;
        int i3 = af + 71;
        ag = i3 % 128;
        int i4 = i3 % 2;
        if (this.f12039m != SelfieActivity.SelfieScanModeExtended.LOGIN || this.f12046t != SelfieScan.FaceAuthMode.LOCAL) {
            return false;
        }
        int i5 = af + 91;
        int i6 = i5 % 128;
        ag = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 31;
        af = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void takePicture() {
        int i2 = 2 % 2;
        this.f12047u.setShutterButtonVisible(false);
        stopAutoShutterTimer();
        PublishSubject<Bitmap> publishSubject = this.F;
        if (publishSubject != null) {
            publishSubject.onNext(this.f12047u.getLastCompleteFrame());
            int i3 = af + 1;
            ag = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 4;
            }
        }
        int i5 = af + 47;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public int getProcessingText() {
        int i2 = 2 % 2;
        if (this.B) {
            int i3 = ag + 23;
            af = i3 % 128;
            if (i3 % 2 == 0) {
                return R.string.onboard_sdk_processing;
            }
            int i4 = 7 / 0;
            return R.string.onboard_sdk_processing;
        }
        int i5 = AnonymousClass2.f12054b[this.f12039m.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return R.string.onboard_sdk_processing;
            }
            if (i5 == 3 && SelfieScan.LivenessDetectionMode.LOCAL.equals(this.f12043q)) {
                return R.string.onboard_sdk_processing;
            }
        } else {
            if (SelfieScan.FaceAuthMode.LOCAL.equals(this.f12046t)) {
                return R.string.onboard_sdk_processing;
            }
            if (SelfieScan.FaceRecognitionMode.LOCAL.equals(this.f12042p)) {
                int i6 = af + 45;
                ag = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    SelfieScan.LivenessDetectionMode.LOCAL.equals(this.f12043q);
                    obj.hashCode();
                    throw null;
                }
                if (SelfieScan.LivenessDetectionMode.LOCAL.equals(this.f12043q)) {
                    int i7 = R.string.onboard_sdk_processing;
                    int i8 = af + 89;
                    ag = i8 % 128;
                    if (i8 % 2 != 0) {
                        return i7;
                    }
                    throw null;
                }
            }
        }
        return this.V ? R.string.onboard_sdk_selfie_verifying : R.string.onboard_sdk_selfie_uploading;
    }

    private void c(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        String strFaceProcessingStateToEvent;
        int i2 = 2 % 2;
        if (faceProcessingState == null || faceProcessingState == this.J || (strFaceProcessingStateToEvent = EventUtils.faceProcessingStateToEvent(faceProcessingState)) == null) {
            return;
        }
        int i3 = ag + 93;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            this.J = faceProcessingState;
            this.M.add(strFaceProcessingStateToEvent);
            throw null;
        }
        this.J = faceProcessingState;
        this.M.add(strFaceProcessingStateToEvent);
        int i4 = af + 105;
        ag = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public Observable<Object> processPreviewFrame(Observable<Bitmap> observable, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = af + 47;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Observable<Object> observableFlatMap = observable.observeOn(this.mDetectionScheduler).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda35
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Bitmap) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda36
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.o((FaceProcessingUtils.DetectionData) obj);
            }
        }).observeOn(this.mDetectionScheduler).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda37
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.d(runnable, (FaceProcessingUtils.DetectionData) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda38
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.k((FaceProcessingUtils.DetectionData) obj);
            }
        });
        int i5 = ag + 71;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return observableFlatMap;
        }
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) throws Throwable {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i2 = 2 % 2;
        int i3 = af + 107;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            selfiePresenter.isTooDark(bitmap, selfiePresenter.f12035h);
            FaceProcessingUtils.DetectionData detectionDataC = selfiePresenter.c(bitmap);
            if (detectionDataC.detectionResultState == FaceProcessingUtils.FaceProcessingState.FACE_DETECTED) {
                selfiePresenter.stopAutoShutterTimer();
                Bitmap bitmap2 = detectionDataC.bitmap;
                File imagesDirectory = selfiePresenter.getRepository().getImagesDirectory();
                Object[] objArr2 = new Object[1];
                ad("\t\u0000㙒㙒\u0004\u000b\u0001\u0004\u0006\u0002\u0004\u000f\u000f\u000e\t\b㙛", (byte) (View.MeasureSpec.getSize(0) + 92), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                BitmapUtils.saveBitmapToFile(bitmap2, imagesDirectory, ((String) objArr2[0]).intern());
                Bitmap bitmapCropFaceFromBitmap = BitmapUtils.cropFaceFromBitmap(detectionDataC.bitmap, detectionDataC.face);
                File imagesDirectory2 = selfiePresenter.getRepository().getImagesDirectory();
                Object[] objArr3 = new Object[1];
                ad("\r\u000f\f\t\n\u000f", (byte) (17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 6 - TextUtils.indexOf("", "", 0, 0), objArr3);
                BitmapUtils.saveBitmapToFile(bitmapCropFaceFromBitmap, imagesDirectory2, ((String) objArr3[0]).intern());
                bitmapCropFaceFromBitmap.recycle();
                int i4 = af + 87;
                ag = i4 % 128;
                int i5 = i4 % 2;
            }
            return detectionDataC;
        }
        selfiePresenter.isTooDark(bitmap, selfiePresenter.f12035h);
        FaceProcessingUtils.FaceProcessingState faceProcessingState = selfiePresenter.c(bitmap).detectionResultState;
        FaceProcessingUtils.FaceProcessingState faceProcessingState2 = FaceProcessingUtils.FaceProcessingState.FACE_DETECTED;
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        int i2 = 2 % 2;
        int i3 = af + 125;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        selfiePresenter.publishDetectionResult(detectionData.detectionResultState);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = af + 43;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public /* synthetic */ boolean d(Runnable runnable, FaceProcessingUtils.DetectionData detectionData) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 9;
        ag = i3 % 128;
        int i4 = i3 % 2;
        c(detectionData.detectionResultState);
        if (detectionData.detectionResultState == FaceProcessingUtils.FaceProcessingState.FACE_DETECTED) {
            int i5 = af + 13;
            ag = i5 % 128;
            int i6 = i5 % 2;
            enableProcessing(false);
            return true;
        }
        if (detectionData.detectionResultState == FaceProcessingUtils.FaceProcessingState.GET_READY) {
            int i7 = af + 33;
            ag = i7 % 128;
            int i8 = i7 % 2;
            enableProcessing(false);
            int i9 = ag + 7;
            af = i9 % 128;
            int i10 = i9 % 2;
        } else if (detectionData.detectionResultState == FaceProcessingUtils.FaceProcessingState.LENSES_DETECTED) {
            int i11 = ag + 71;
            af = i11 % 128;
            int i12 = i11 % 2;
            enableProcessing(false);
        } else if (detectionData.detectionResultState == FaceProcessingUtils.FaceProcessingState.NOT_READY) {
            this.ac.onNext(new Object());
        }
        runnable.run();
        return false;
    }

    public /* synthetic */ ObservableSource k(FaceProcessingUtils.DetectionData detectionData) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 1;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.T = detectionData;
            publishDetectionResult(FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED);
            return Observable.empty();
        }
        this.T = detectionData;
        publishDetectionResult(FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED);
        Observable.empty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = af + 25;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.U.set(0);
        this.W = faceProcessingState;
        int i5 = ag + 117;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    private void i() {
        int i2 = 2 % 2;
        int i3 = af + 55;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.d("Clear detection clearDetection", new Object[0]);
            setProcessingInProgress(true);
        } else {
            Timber.d("Clear detection clearDetection", new Object[0]);
            setProcessingInProgress(false);
        }
        d(FaceProcessingUtils.FaceProcessingState.NO_FACE);
    }

    public static /* synthetic */ void e(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 117;
        af = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ void g(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 41;
        af = i3 % 128;
        int i4 = i3 % 2;
        Timber.d(th);
        h();
        int i5 = ag + 59;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void retryProcessingBytes(boolean z2) {
        int i2 = 2 % 2;
        int i3 = af + 91;
        ag = i3 % 128;
        int i4 = i3 % 2;
        super.retryProcessingBytes(z2);
        Object obj = null;
        if (z2) {
            int i5 = af + 7;
            ag = i5 % 128;
            if (i5 % 2 == 0) {
                getIdealCaptureEnvironmentTestResultToRetry();
                obj.hashCode();
                throw null;
            }
            IdealEnvironmentTestResult idealCaptureEnvironmentTestResultToRetry = getIdealCaptureEnvironmentTestResultToRetry();
            if (this.T != null) {
                this.D.add(Observable.merge(sendZoomedFrame(idealCaptureEnvironmentTestResultToRetry.getSource(), idealCaptureEnvironmentTestResultToRetry.getBitmap()), c(this.T)).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda20
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) throws Exception {
                        SelfiePresenter.e(obj2);
                    }
                }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda21
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) throws Exception {
                        this.f$0.g((Throwable) obj2);
                    }
                }));
                int i6 = af + 95;
                ag = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = af + 7;
        ag = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void publishDetectionResult(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState r4) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L42
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = r3.W
            if (r0 == r4) goto L3c
            java.lang.String r1 = "publishDetectionResult Publishing %s: "
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            timber.log.Timber.d(r1, r0)
            r3.W = r4
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED
            if (r4 != r0) goto L37
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L3d
            boolean r1 = r3.B
            r0 = 55
            int r0 = r0 / 0
            if (r1 != 0) goto L37
        L34:
            r3.checkDeviceEnvironment()
        L37:
            com.incode.welcome_sdk.ui.camera.selfie.SelfieContract$View r0 = r3.f12047u
            r0.onDetectionResult(r4)
        L3c:
            return
        L3d:
            boolean r0 = r3.B
            if (r0 != 0) goto L37
            goto L34
        L42:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.publishDetectionResult(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState):void");
    }

    private Observable<?> c(SelfieActivity.SelfieScanModeExtended selfieScanModeExtended, FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = ag + 35;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.T = detectionData;
            int i4 = AnonymousClass2.f12054b[selfieScanModeExtended.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return j(detectionData);
                }
                if (i4 == 4) {
                    return m().toObservable();
                }
                return c(detectionData);
            }
            Observable<?> observable = ((Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData}, -433483324, BasicDrawer.d(), 433483339, BasicDrawer.d())).toObservable();
            int i5 = ag + 25;
            af = i5 % 128;
            int i6 = i5 % 2;
            return observable;
        }
        this.T = detectionData;
        int i7 = AnonymousClass2.f12054b[selfieScanModeExtended.ordinal()];
        throw null;
    }

    public /* synthetic */ Unit e(IncodeWelcomeRepository incodeWelcomeRepository) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 55;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            if (!e.c(this.f12047u.getContext())) {
                h();
            } else {
                VideoUploadJobService.d(this.f12047u.getContext(), g.f10681a, incodeWelcomeRepository.getToken());
                int i4 = ag + 65;
                af = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
        e.c(this.f12047u.getContext());
        throw null;
    }

    private Observable<?> c(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        if (this.B) {
            int i3 = ag + 95;
            af = i3 % 128;
            int i4 = i3 % 2;
            fillInMetadata(this.H.booleanValue());
            d(detectionData.bitmap);
            this.f12047u.onSelfieCaptureComplete(r(), p());
            Observable<?> observableEmpty = Observable.empty();
            int i5 = af + 125;
            ag = i5 % 128;
            int i6 = i5 % 2;
            return observableEmpty;
        }
        if (this.f12047u.shouldProceedWithVideoLivenessFunction()) {
            int i7 = af + 35;
            ag = i7 % 128;
            int i8 = i7 % 2;
            VideoUploadJobService.c(this);
            final IncodeWelcomeRepository repository = getRepository();
            return an.e(g.f10681a.d(repository)).andThen(Observable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda34
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.e(repository);
                }
            }));
        }
        Observable<v> observableA = a((String) null);
        int i9 = af + 5;
        ag = i9 % 128;
        if (i9 % 2 != 0) {
            return observableA;
        }
        throw null;
    }

    public /* synthetic */ Unit C() {
        int i2 = 2 % 2;
        int i3 = af + 89;
        ag = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f12047u.retryCapture();
            Unit unit = Unit.INSTANCE;
            int i4 = ag + 47;
            af = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        this.f12047u.retryCapture();
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private void h() {
        int i2 = 2 % 2;
        int i3 = af + 77;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            this.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.z();
                }
            });
            int i4 = 5 / 0;
        } else {
            this.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.z();
                }
            });
        }
    }

    private void e(int i2) {
        boolean z2;
        int i3 = 2 % 2;
        if (i2 != 0) {
            int i4 = ag + 91;
            af = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f12039m != SelfieActivity.SelfieScanModeExtended.ENROLL) {
            int i6 = ag + 13;
            af = i6 % 128;
            if (i6 % 2 != 0) {
                SelfieActivity.SelfieScanModeExtended selfieScanModeExtended = SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION;
                throw null;
            }
            if (this.f12039m != SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION) {
                b("An error occurred while doing face login.");
                return;
            }
        }
        this.f12047u.onEnrollError(n.b(0), n.c(0, z2), n.a(0), i2, IncodeWelcome.getInstance().getInternalConfig().getUxConfig().getShowFooter());
    }

    public /* synthetic */ Unit B() throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 79;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.f12047u.showVerifyingTextInCameraLid();
        Unit unit = Unit.INSTANCE;
        int i5 = af + 19;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource d(String str, Unit unit) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 123;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.f12039m == SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION) {
                Observable observable = ((Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, str}, 1331703151, BasicDrawer.d(), -1331703142, BasicDrawer.d())).toObservable();
                int i4 = af + 103;
                ag = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 8 / 0;
                }
                return observable;
            }
            return a(str);
        }
        SelfieActivity.SelfieScanModeExtended selfieScanModeExtended = SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void x() {
        int i2 = 2 % 2;
        int i3 = ag + 15;
        af = i3 % 128;
        int i4 = i3 % 2;
        e(k());
        int i5 = af + 123;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    private static /* synthetic */ Object t(Object[] objArr) {
        final SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i2 = 2 % 2;
        int i3 = af + 57;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th);
            selfiePresenter.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.x();
                }
            });
            int i4 = 80 / 0;
            return null;
        }
        Timber.e(th);
        selfiePresenter.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.x();
            }
        });
        return null;
    }

    @Override // com.incode.welcome_sdk.commons.video_upload.a
    public void onVideoUploadComplete(final String str) {
        int i2 = 2 % 2;
        int i3 = af + 83;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.D.add(Observable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda24
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.B();
            }
        }).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda25
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(str, (Unit) obj);
            }
        }).subscribe(ah.f6383a, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda26
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.i((Throwable) obj);
            }
        }));
        int i5 = ag + 29;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.commons.video_upload.a
    public void onVideoUploadFailed() {
        int i2 = 2 % 2;
        int i3 = af + 43;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            g();
            int i4 = 22 / 0;
        } else {
            g();
        }
        int i5 = af + 35;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public /* synthetic */ void w() {
        int i2 = 2 % 2;
        int i3 = af + 13;
        ag = i3 % 128;
        int i4 = i3 % 2;
        e(k());
        int i5 = ag + 87;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void g() {
        int i2 = 2 % 2;
        if (e.c(this.f12047u.getContext())) {
            this.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.w();
                }
            });
            return;
        }
        int i3 = af + 107;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            h();
            int i4 = ag + 123;
            af = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        h();
        throw null;
    }

    private int k() {
        int i2 = 2 % 2;
        int i3 = af + 95;
        ag = i3 % 128;
        int i4 = i3 % 2;
        int iMax = Math.max(0, this.f12037k - this.f12041o);
        int i5 = ag + 5;
        af = i5 % 128;
        int i6 = i5 % 2;
        return iMax;
    }

    private Observable<v> a(final String str) {
        int i2 = 2 % 2;
        int i3 = ag + 51;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            Observable<v> observableDoOnNext = Observable.just(this.T).observeOn(this.mDetectionScheduler).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda55
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.a(str, (FaceProcessingUtils.DetectionData) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda64
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.e((v) obj);
                }
            });
            int i4 = ag + 105;
            af = i4 % 128;
            int i5 = i4 % 2;
            return observableDoOnNext;
        }
        Observable.just(this.T).observeOn(this.mDetectionScheduler).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda55
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a(str, (FaceProcessingUtils.DetectionData) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda64
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e((v) obj);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12053a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f12054b;

        /* JADX INFO: renamed from: c */
        private static int f12055c = 0;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f12056d;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f12057e;

        /* JADX INFO: renamed from: j */
        private static int f12058j = 1;

        static {
            int[] iArr = new int[SelfieScan.LivenessDetectionMode.values().length];
            f12053a = iArr;
            try {
                iArr[SelfieScan.LivenessDetectionMode.SERVER.ordinal()] = 1;
                int i2 = f12055c + 31;
                f12058j = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12053a[SelfieScan.LivenessDetectionMode.LOCAL.ordinal()] = 2;
                int i4 = f12058j + 27;
                f12055c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SelfieScan.FaceAuthMode.values().length];
            f12056d = iArr2;
            try {
                iArr2[SelfieScan.FaceAuthMode.LOCAL.ordinal()] = 1;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12056d[SelfieScan.FaceAuthMode.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[FaceProcessingUtils.FaceProcessingState.values().length];
            f12057e = iArr3;
            try {
                iArr3[FaceProcessingUtils.FaceProcessingState.INSUFFICIENT_FACE_SIZE.ordinal()] = 1;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12057e[FaceProcessingUtils.FaceProcessingState.FACE_TOO_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12057e[FaceProcessingUtils.FaceProcessingState.FACE_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[SelfieActivity.SelfieScanModeExtended.valuesCustom().length];
            f12054b = iArr4;
            try {
                iArr4[SelfieActivity.SelfieScanModeExtended.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12054b[SelfieActivity.SelfieScanModeExtended.MASK_CHECK.ordinal()] = 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12054b[SelfieActivity.SelfieScanModeExtended.ENROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12054b[SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public /* synthetic */ ObservableSource a(final String str, final FaceProcessingUtils.DetectionData detectionData) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 13;
        af = i3 % 128;
        int i4 = i3 % 2;
        Observable observableDefer = Observable.defer(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda63
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.d(detectionData, str);
            }
        });
        int i5 = ag + 45;
        af = i5 % 128;
        int i6 = i5 % 2;
        return observableDefer;
    }

    public /* synthetic */ ObservableSource d(FaceProcessingUtils.DetectionData detectionData, String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 67;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            if (AnonymousClass2.f12053a[this.f12043q.ordinal()] == 1) {
                return b(detectionData, str);
            }
            Observable<v> observableE = e(detectionData, str);
            int i4 = af + 43;
            ag = i4 % 128;
            int i5 = i4 % 2;
            return observableE;
        }
        int i6 = AnonymousClass2.f12053a[this.f12043q.ordinal()];
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if (r3 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ad, code lost:
    
        if (r3 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void e(com.incode.welcome_sdk.data.remote.beans.v r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.e(com.incode.welcome_sdk.data.remote.beans.v):void");
    }

    private Observable<v> e(FaceProcessingUtils.DetectionData detectionData, String str) throws Throwable {
        float fDetectSpoof;
        int i2 = 2 % 2;
        v vVar = new v();
        if (this.A.getRecogKitAndroid() == null) {
            throw new IllegalStateException("Local liveness not enabled during SDK init!");
        }
        if (detectionData.face != null) {
            y yVar = new y(detectionData.faceLandmarksState, detectionData.bitmap, true, this.O);
            if (yVar.b() != null) {
                Bitmap bitmapCropFaceFromBitmap = BitmapUtils.cropFaceFromBitmap(detectionData.bitmap, detectionData.face);
                File imagesDirectory = getRepository().getImagesDirectory();
                Object[] objArr = new Object[1];
                ad("\r\u000f\f\t\n\u000f", (byte) (TextUtils.getOffsetBefore("", 0) + 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7, objArr);
                BitmapUtils.saveBitmapToFile(bitmapCropFaceFromBitmap, imagesDirectory, ((String) objArr[0]).intern());
                bitmapCropFaceFromBitmap.recycle();
                try {
                    try {
                        fDetectSpoof = this.A.getFacePadKitAndroid().detectSpoof(detectionData.bitmap, yVar.b(), 1);
                    } catch (RecogKitInvalidInputException | RecogKitProcessException e2) {
                        Timber.e(e2);
                        yVar.c();
                        fDetectSpoof = -1.0f;
                    }
                    vVar.e(fDetectSpoof);
                    int i3 = af + 123;
                    ag = i3 % 128;
                    int i4 = i3 % 2;
                } finally {
                    yVar.c();
                }
            }
        }
        if (vVar.e() || vVar.b() == -1.0d || vVar.b() >= 0.5d) {
            int i5 = this.f12041o + 1;
            this.f12041o = i5;
            if (i5 == this.f12037k - 1) {
                int i6 = ag + 9;
                af = i6 % 128;
                if (i6 % 2 == 0) {
                    setLivenessDetectionMode(SelfieScan.LivenessDetectionMode.SERVER);
                    setFaceAuthMode(SelfieScan.FaceAuthMode.SERVER);
                } else {
                    setLivenessDetectionMode(SelfieScan.LivenessDetectionMode.SERVER);
                    setFaceAuthMode(SelfieScan.FaceAuthMode.SERVER);
                    throw null;
                }
            }
            HashMap map = new HashMap();
            map.put(EventValues.SCREEN_NAME.getValue(), ScreenName.SELFIE_CAMERA_CAPTURE.name());
            EventUtils.sendEvent(getRepository(), Event.LOCAL_LIVENESS_FAILED, this.f12047u.getModule(), (HashMap<String, Object>) map);
            int i7 = af + 27;
            ag = i7 % 128;
            int i8 = i7 % 2;
            return Observable.just(vVar);
        }
        return b(detectionData, str);
    }

    public /* synthetic */ void y() throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 53;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.f12047u.onSelfieCaptureComplete(r(), p());
        int i5 = af + 87;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
    }

    private Observable<v> b(FaceProcessingUtils.DetectionData detectionData, String str) {
        f fVar;
        int i2 = 2 % 2;
        int i3 = ag + 65;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            String base64FromBitmap = BitmapUtils.getBase64FromBitmap(detectionData.bitmap);
            Map<String, Float> mapD = FaceProcessingUtils.d(detectionData);
            if (IncodeWelcome.getInstance().isDelayedMode()) {
                return c.f().d(detectionData.bitmap, mapD).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda11
                    @Override // io.reactivex.functions.Action
                    public final void run() throws Exception {
                        this.f$0.y();
                    }
                }).andThen(Observable.empty());
            }
            fillInMetadata(this.H.booleanValue());
            IncodeWelcomeRepository repository = getRepository();
            s sVarC = this.f11267g.c();
            if (isAutoCaptureEnabled()) {
                fVar = f.AUTO;
            } else {
                fVar = f.MANUAL;
                int i4 = af + 57;
                ag = i4 % 128;
                int i5 = i4 % 2;
            }
            return repository.addFace(sVarC, base64FromBitmap, mapD, fVar, str).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda22
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.h((Throwable) obj);
                }
            }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda33
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((v) obj);
                }
            });
        }
        BitmapUtils.getBase64FromBitmap(detectionData.bitmap);
        FaceProcessingUtils.d(detectionData);
        IncodeWelcome.getInstance().isDelayedMode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ com.incode.welcome_sdk.data.remote.beans.v h(java.lang.Throwable r10) throws java.lang.Exception {
        /*
            r9 = this;
            r2 = 2
            int r0 = r2 % r2
            boolean r0 = r10 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException
            if (r0 != 0) goto L27
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r1
            int r0 = r0 % r2
            boolean r0 = r10 instanceof java.net.UnknownHostException
            if (r0 != 0) goto L27
            int r1 = r1 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.camera.selfie.SelfieContract$View r0 = r9.f12047u
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.incode.welcome_sdk.commons.httpinterceptors.e.c(r0)
            if (r0 != 0) goto L2a
        L27:
            r9.h()
        L2a:
            com.incode.welcome_sdk.data.remote.beans.v r1 = new com.incode.welcome_sdk.data.remote.beans.v
            r1.<init>()
            int r0 = com.incode.welcome_sdk.commons.utils.n.b(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r0}
            int r6 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.l.d()
            int r5 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.l.d()
            int r7 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.l.d()
            int r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.l.d()
            r4 = -1826971148(0xffffffff931aa1f4, float:-1.9517382E-27)
            r8 = 1826971148(0x6ce55e0c, float:2.2183051E27)
            com.incode.welcome_sdk.data.remote.beans.v.d(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.h(java.lang.Throwable):com.incode.welcome_sdk.data.remote.beans.v");
    }

    public static /* synthetic */ ObservableSource b(v vVar, ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 35;
        af = i3 % 128;
        int i4 = i3 % 2;
        Observable observableJust = Observable.just(vVar);
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        int i6 = ag + 79;
        af = i6 % 128;
        int i7 = i6 % 2;
        return observableJust;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001a, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
    
        r0 = r1.getImagePreview().getResolutionInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0024, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        r0 = r0.getResolution();
        r4.f11267g.f9966c = new com.incode.welcome_sdk.data.remote.beans.s.a(r0.getWidth(), r0.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        timber.log.Timber.w("Cannot instantiate camera settings metadata without ResolutionInfo", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        timber.log.Timber.w("Cannot instantiate camera settings metadata without a camera source", new java.lang.Object[0]);
        r1 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af + 93;
        com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void fillInCameraSettingsMetadata() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L3c
            com.incode.welcome_sdk.ui.camera.selfie.SelfieContract$View r0 = r4.f12047u
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity r0 = (com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity) r0
            com.incode.camera.IncodeCamera r1 = r0.getIncodeCamera()
            r0 = 78
            int r0 = r0 / r2
            if (r1 == 0) goto L4f
        L1c:
            androidx.camera.core.Preview r0 = r1.getImagePreview()
            androidx.camera.core.ResolutionInfo r0 = r0.getResolutionInfo()
            if (r0 == 0) goto L47
            android.util.Size r0 = r0.getResolution()
            com.incode.welcome_sdk.data.remote.beans.s$b r3 = r4.f11267g
            com.incode.welcome_sdk.data.remote.beans.s$a r2 = new com.incode.welcome_sdk.data.remote.beans.s$a
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r2.<init>(r1, r0)
            r3.f9966c = r2
            return
        L3c:
            com.incode.welcome_sdk.ui.camera.selfie.SelfieContract$View r0 = r4.f12047u
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity r0 = (com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity) r0
            com.incode.camera.IncodeCamera r1 = r0.getIncodeCamera()
            if (r1 == 0) goto L4f
            goto L1c
        L47:
            java.lang.String r1 = "Cannot instantiate camera settings metadata without ResolutionInfo"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            return
        L4f:
            java.lang.String r1 = "Cannot instantiate camera settings metadata without a camera source"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.fillInCameraSettingsMetadata():void");
    }

    private static /* synthetic */ Object n(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        int i2 = 2 % 2;
        int i3 = af + 97;
        ag = i3 % 128;
        int i4 = i3 % 2;
        if (!selfiePresenter.n()) {
            return (Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{selfiePresenter, detectionData}, 1919606896, BasicDrawer.d(), -1919606896, BasicDrawer.d());
        }
        Single<?> singleE = selfiePresenter.e(detectionData);
        int i5 = ag + 101;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return singleE;
        }
        throw null;
    }

    private boolean n() {
        int i2 = 2 % 2;
        int i3 = ag;
        int i4 = i3 + 87;
        af = i4 % 128;
        int i5 = i4 % 2;
        if (this.K == null) {
            int i6 = i3 + 67;
            af = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i3 + 71;
        af = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public /* synthetic */ Unit d(IncodeWelcomeRepository incodeWelcomeRepository) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 33;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            if (!e.c(this.f12047u.getContext())) {
                h();
            } else {
                VideoUploadJobService.d(this.f12047u.getContext(), g.f10681a, incodeWelcomeRepository.getToken());
                int i4 = af + 117;
                ag = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
        e.c(this.f12047u.getContext());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Single<?> m() {
        int i2 = 2 % 2;
        Object obj = null;
        if (!this.f12047u.shouldProceedWithVideoLivenessFunction()) {
            Single<?> single = (Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, null}, 1331703151, BasicDrawer.d(), -1331703142, BasicDrawer.d());
            int i3 = ag + 115;
            af = i3 % 128;
            int i4 = i3 % 2;
            return single;
        }
        int i5 = ag + 23;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            VideoUploadJobService.c(this);
            final IncodeWelcomeRepository repository = getRepository();
            return an.e(g.f10681a.d(repository)).andThen(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda16
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.d(repository);
                }
            }));
        }
        VideoUploadJobService.c(this);
        final IncodeWelcomeRepository repository2 = getRepository();
        an.e(g.f10681a.d(repository2)).andThen(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.d(repository2);
            }
        }));
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        final SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        String str = (String) objArr[1];
        Pair pair = (Pair) objArr[2];
        int i2 = 2 % 2;
        int i3 = af + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ag = i3 % 128;
        int i4 = i3 % 2;
        final String str2 = (String) pair.first;
        final String str3 = (String) pair.second;
        SingleSource singleSourceFlatMap = selfiePresenter.e(str3, str).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(str2, str3, (ResponseFaceAuthentication) obj);
            }
        });
        int i5 = af + 101;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return singleSourceFlatMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ SingleSource e(String str, String str2, ResponseFaceAuthentication responseFaceAuthentication) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 51;
        af = i3 % 128;
        int i4 = i3 % 2;
        if (responseFaceAuthentication.getError() != null) {
            int i5 = ag + 83;
            af = i5 % 128;
            int i6 = i5 % 2;
            if (responseFaceAuthentication.getError().getCode() == FaceAuthenticationErrorCode.NETWORK_ERROR) {
                int i7 = ag + 117;
                af = i7 % 128;
                if (i7 % 2 != 0) {
                    i();
                    Single.never();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i();
                Single singleNever = Single.never();
                int i8 = af + 61;
                ag = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 96 / 0;
                }
                return singleNever;
            }
        }
        return Single.just(new Triple(responseFaceAuthentication, str, str2));
    }

    public /* synthetic */ void a(Triple triple) throws Exception {
        FaceAuthenticationErrorCode code;
        boolean zIsFatal;
        int i2 = 2 % 2;
        int i3 = ag + 121;
        af = i3 % 128;
        int i4 = i3 % 2;
        ResponseFaceAuthentication responseFaceAuthentication = (ResponseFaceAuthentication) triple.getFirst();
        String str = (String) triple.getSecond();
        String str2 = (String) triple.getThird();
        this.f12041o++;
        FaceAuthenticationResult faceAuthenticationResultC = c(responseFaceAuthentication, str, str2);
        FaceAuthenticationException error = responseFaceAuthentication.getError();
        if (error != null) {
            code = error.getCode();
            zIsFatal = code.isFatal();
        } else {
            code = null;
            zIsFatal = false;
        }
        if (faceAuthenticationResultC.isSuccess || zIsFatal || this.f12041o >= this.f12037k) {
            this.f12047u.onFaceAuthenticationComplete(faceAuthenticationResultC);
            return;
        }
        this.f12047u.onFaceAuthenticationError(n.a(code), ((Integer) n.a(1885033654, new Object[]{code}, -1885033654, OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b())).intValue(), n.e(code), k(), IncodeWelcome.getInstance().getInternalConfig().getUxConfig().getShowFooter());
        i();
        int i5 = ag + 25;
        af = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
    }

    private Single<ResponseFaceAuthentication> e(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = af + 43;
        ag = i3 % 128;
        int i4 = i3 % 2;
        fillInMetadata(this.H.booleanValue());
        String faceAuthenticationHint = getRepository().getFaceAuthenticationHint();
        Single<ResponseFaceAuthentication> singleOnErrorReturn = getRepository().authenticateFace(this.f11267g.c(), str, FaceProcessingUtils.d(this.T), faceAuthenticationHint, str2).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda49
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.f((Throwable) obj);
            }
        });
        int i5 = ag + 109;
        af = i5 % 128;
        int i6 = i5 % 2;
        return singleOnErrorReturn;
    }

    public /* synthetic */ ResponseFaceAuthentication f(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 97;
        int i4 = i3 % 128;
        ag = i4;
        int i5 = i3 % 2;
        if (!(th instanceof NoConnectivityException) && !(th instanceof UnknownHostException)) {
            int i6 = i4 + 85;
            af = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                e.c(this.f12047u.getContext());
                obj.hashCode();
                throw null;
            }
            if (!(!e.c(this.f12047u.getContext()))) {
                return th instanceof IncodeHttpException ? new ResponseFaceAuthentication(FaceAuthenticationOverallStatus.FAIL, null, null, new FaceAuthenticationException(FaceAuthenticationErrorCode.UNKNOWN, ((IncodeHttpException) th).e())) : new ResponseFaceAuthentication(FaceAuthenticationOverallStatus.FAIL, null, null, new FaceAuthenticationException(FaceAuthenticationErrorCode.UNKNOWN, th.getMessage()));
            }
        }
        h();
        ResponseFaceAuthentication.d dVar = ResponseFaceAuthentication.Companion;
        ResponseFaceAuthentication responseFaceAuthenticationA = ResponseFaceAuthentication.d.a();
        int i7 = af + 49;
        ag = i7 % 128;
        int i8 = i7 % 2;
        return responseFaceAuthenticationA;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        final Bitmap bitmap = (Bitmap) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 61;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            return Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SelfiePresenter.b(bitmap);
                }
            });
        }
        int i4 = 27 / 0;
        return Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SelfiePresenter.b(bitmap);
            }
        });
    }

    public static /* synthetic */ Pair b(Bitmap bitmap) throws Exception {
        int i2 = 2 % 2;
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(bitmap);
        try {
            Pair pair = new Pair(base64FromBitmap, ae.e(base64FromBitmap, ae.c(base64FromBitmap, ae.c())));
            int i3 = af + 121;
            ag = i3 % 128;
            if (i3 % 2 != 0) {
                return pair;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
            throw e2;
        }
    }

    private static FaceAuthenticationResult c(ResponseFaceAuthentication responseFaceAuthentication, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = af + 99;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            responseFaceAuthentication.getOverallStatusString();
            FaceAuthenticationOverallStatus faceAuthenticationOverallStatus = FaceAuthenticationOverallStatus.PASS;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = false;
        if (responseFaceAuthentication.getOverallStatusString() == FaceAuthenticationOverallStatus.PASS) {
            int i4 = ag + 67;
            af = i4 % 128;
            if (i4 % 2 == 0) {
                z2 = true;
            }
        }
        return new FaceAuthenticationResult(ResultCode.SUCCESS, b(responseFaceAuthentication), z2, responseFaceAuthentication.getCandidate(), str, str2);
    }

    private static FaceAuthenticationException b(ResponseFaceAuthentication responseFaceAuthentication) {
        int i2 = 2 % 2;
        int i3 = ag + 49;
        af = i3 % 128;
        int i4 = i3 % 2;
        if (responseFaceAuthentication.getError() != null) {
            return new FaceAuthenticationException(responseFaceAuthentication.getError().getCode(), responseFaceAuthentication.getError().getMessage());
        }
        int i5 = ag + 19;
        int i6 = i5 % 128;
        af = i6;
        if (i5 % 2 != 0) {
            int i7 = 59 / 0;
        }
        int i8 = i6 + 55;
        ag = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        final SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        final FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        int i2 = 2 % 2;
        int i3 = af + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Single singleDoOnSuccess = Single.just(detectionData).observeOn(selfiePresenter.mDetectionScheduler).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.n((FaceProcessingUtils.DetectionData) obj);
            }
        }).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a(detectionData, (Triple) obj);
            }
        });
        int i5 = ag + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        af = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return singleDoOnSuccess;
    }

    public /* synthetic */ SingleSource n(FaceProcessingUtils.DetectionData detectionData) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 17;
        af = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass2.f12056d[this.f12046t.ordinal()];
        if (i5 == 1) {
            return Single.zip(Single.just(new ResponseFaceLogin(this.K)), a(detectionData), i(detectionData), new SelfiePresenter$$ExternalSyntheticLambda44());
        }
        if (i5 != 2) {
            Single singleJust = Single.just(new Triple(new ResponseFaceLogin(), Float.valueOf(-1.0f), new ba(-1.0d)));
            int i6 = ag + 41;
            af = i6 % 128;
            int i7 = i6 % 2;
            return singleJust;
        }
        Single singleZip = Single.zip(g(detectionData), Single.just(Float.valueOf(-1.0f)), Single.just(new ba(-1.0d)), new SelfiePresenter$$ExternalSyntheticLambda44());
        int i8 = ag + 39;
        af = i8 % 128;
        if (i8 % 2 == 0) {
            return singleZip;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x007e A[PHI: r3 r4 r6 r9
  0x007e: PHI (r3v2 float) = (r3v0 float), (r3v5 float) binds: [B:56:0x007b, B:47:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r4v2 float) = (r4v0 float), (r4v5 float) binds: [B:56:0x007b, B:47:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r6v3 com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin) = 
  (r6v1 com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin)
  (r6v7 com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin)
 binds: [B:56:0x007b, B:47:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:56:0x007b, B:47:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3 A[PHI: r3 r4 r6 r9
  0x00b3: PHI (r3v1 float) = (r3v0 float), (r3v5 float) binds: [B:55:0x0079, B:46:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r4v1 float) = (r4v0 float), (r4v5 float) binds: [B:55:0x0079, B:46:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r6v2 com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin) = 
  (r6v1 com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin)
  (r6v7 com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin)
 binds: [B:55:0x0079, B:46:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:55:0x0079, B:46:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData r18, kotlin.Triple r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.a(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData, kotlin.Triple):void");
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = af + 5;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("Added FaceLoginAttempt to the database.", new Object[0]);
        int i5 = af + 19;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void j(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 81;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Error occurred while inserting FaceLoginAttempt to the database.", new Object[0]);
        int i5 = ag + 97;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020 A[PHI: r4 r6
  0x0020: PHI (r4v2 android.util.Pair<java.lang.Float, java.lang.Float>) = (r4v0 android.util.Pair<java.lang.Float, java.lang.Float>), (r4v3 android.util.Pair<java.lang.Float, java.lang.Float>) binds: [B:22:0x0092, B:17:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0020: PHI (r6v2 java.util.Map<java.lang.String, java.lang.Float>) = (r6v0 java.util.Map<java.lang.String, java.lang.Float>), (r6v3 java.util.Map<java.lang.String, java.lang.Float>) binds: [B:22:0x0092, B:17:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData r19, float r20, float r21, java.lang.String r22) {
        /*
            r18 = this;
            r1 = r18
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r2 = r0 + 23
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r2 = r2 % r5
            r3 = r19
            if (r2 != 0) goto L8a
            java.util.Map r6 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.b(r3)
            android.util.Pair r4 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.c(r3)
            r0 = 90
            int r0 = r0 / 0
            if (r6 == 0) goto L3b
        L20:
            java.lang.Object r2 = r4.first
            java.lang.Float r2 = (java.lang.Float) r2
            java.lang.String r0 = "mouthX"
            r6.put(r0, r2)
            java.lang.Object r2 = r4.second
            java.lang.Float r2 = (java.lang.Float) r2
            java.lang.String r0 = "mouthY"
            r6.put(r0, r2)
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r2 = r0 + 29
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r2 = r2 % r5
        L3b:
            com.incode.welcome_sdk.data.local.d r4 = new com.incode.welcome_sdk.data.local.d
            android.graphics.Bitmap r0 = r3.bitmap
            java.lang.String r5 = com.incode.welcome_sdk.commons.utils.BitmapUtils.getBase64FromBitmap(r0)
            android.graphics.Bitmap r0 = r3.bitmap
            int r7 = r0.getWidth()
            android.graphics.Bitmap r0 = r3.bitmap
            int r8 = r0.getHeight()
            float r10 = r1.f12038l
            float r12 = r1.f12036j
            float r13 = r1.f11269i
            float r14 = r1.f11266f
            java.lang.String r0 = r1.K
            com.incode.welcome_sdk.modules.SelfieScan$FaceAuthMode r17 = com.incode.welcome_sdk.modules.SelfieScan.FaceAuthMode.LOCAL
            r15 = r22
            r11 = r21
            r9 = r20
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            io.reactivex.disposables.CompositeDisposable r3 = r1.D
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r18.getRepository()
            io.reactivex.Completable r1 = r0.addFaceLoginAttempt(r4)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Completable r2 = r1.subscribeOn(r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda14 r1 = new com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda14
            r1.<init>()
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda15 r0 = new com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda15
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            return
        L8a:
            java.util.Map r6 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.b(r3)
            android.util.Pair r4 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.c(r3)
            if (r6 == 0) goto L3b
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.c(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData, float, float, java.lang.String):void");
    }

    private boolean d(double d2) {
        int i2 = 2 % 2;
        int i3 = af + 55;
        int i4 = i3 % 128;
        ag = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (d2 <= this.f12036j) {
            return false;
        }
        int i5 = i4 + 39;
        af = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
    
        if (r6 >= r5.f12038l) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0018, code lost:
    
        r1 = r3 + 115;
        com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
    
        if (r6 >= r5.f12038l) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
    
        r1 = r3 + 43;
        com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
    
        if ((r1 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(float r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r0 = r0 + 15
            int r3 = r0 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r3
            int r0 = r0 % r4
            r2 = 0
            if (r0 == 0) goto L22
            float r0 = r5.f12038l
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r0 = 69
            int r0 = r0 / r2
            if (r1 < 0) goto L2b
        L18:
            int r1 = r3 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L29
            return r2
        L22:
            float r0 = r5.f12038l
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L2b
            goto L18
        L29:
            r0 = 1
            return r0
        L2b:
            int r1 = r3 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L35
            return r2
        L35:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.d(float):boolean");
    }

    public /* synthetic */ CompletableSource e(ResponseFaceLogin responseFaceLogin, ak akVar) throws Exception {
        int i2 = 2 % 2;
        Completable completableAddFace = getRepository().addFace(new FaceInfo(0L, akVar.d(), akVar.e(), responseFaceLogin.customerId));
        int i3 = af + 89;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
        return completableAddFace;
    }

    public static /* synthetic */ void u() throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 43;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("FaceInfo stored successfully.", new Object[0]);
        int i5 = af + 95;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    public static /* synthetic */ void a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 7;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th, "Error occurred while fetching the face template", new Object[1]);
        } else {
            Timber.e(th, "Error occurred while fetching the face template", new Object[0]);
        }
    }

    private void a(final ResponseFaceLogin responseFaceLogin) {
        int i2 = 2 % 2;
        int i3 = ag + 87;
        af = i3 % 128;
        int i4 = i3 % 2;
        this.D.add(getRepository().getFaceTemplate(responseFaceLogin.token, j.f7674c.a(), com.incode.welcome_sdk.data.c.f7613b.b(), null).subscribeOn(Schedulers.io()).flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda43
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(responseFaceLogin, (ak) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda45
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                SelfiePresenter.u();
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda46
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SelfiePresenter.a((Throwable) obj);
            }
        }));
        int i5 = ag + 33;
        af = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    private void b(String str) {
        int i2 = 2 % 2;
        this.f12047u.onFaceScanFailed(new IllegalStateException(str));
        int i3 = ag + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    private void c(boolean z2, boolean z3, Boolean bool, FaceLoginResult faceLoginResult) {
        int i2 = 2 % 2;
        int i3 = af + 93;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.f12047u.onLoginComplete(z2, z3, bool, r(), p(), faceLoginResult);
        int i5 = ag + 1;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    private Single<?> e(final FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = af + 95;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Single<?> singleDoOnSuccess = Single.just(detectionData).observeOn(this.mDetectionScheduler).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(detectionData, (FaceProcessingUtils.DetectionData) obj);
            }
        }).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b(detectionData, (Triple) obj);
            }
        });
        int i5 = af + 85;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return singleDoOnSuccess;
    }

    public /* synthetic */ SingleSource b(FaceProcessingUtils.DetectionData detectionData, FaceProcessingUtils.DetectionData detectionData2) throws Exception {
        Pair<String, Float> pair;
        int i2 = 2 % 2;
        int i3 = AnonymousClass2.f12056d[this.f12046t.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return Single.just(new Triple(new ResponseFaceLogin(), Float.valueOf(-1.0f), new ba(-1.0d)));
            }
            Single singleZip = Single.zip(h(detectionData), Single.just(Float.valueOf(-1.0f)), Single.just(new ba(-1.0d)), new SelfiePresenter$$ExternalSyntheticLambda44());
            int i4 = ag + 31;
            af = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
            return singleZip;
        }
        TemplateModel templateModel = null;
        Pair<String, Float> pairPredictFaceInfo = null;
        if (this.A.getRecogKitAndroid() != null) {
            TemplateModel templateFromDetectionData = RecogKitUtils.getTemplateFromDetectionData(this.A.getRecogKitAndroid(), detectionData);
            if (templateFromDetectionData != null) {
                int i6 = ag + 55;
                af = i6 % 128;
                int i7 = i6 % 2;
                pairPredictFaceInfo = RecogKitUtils.predictFaceInfo(this.A.getRecogKitAndroid(), templateFromDetectionData.getTemplate());
                int i8 = af + 57;
                ag = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 5;
                }
            }
            pair = pairPredictFaceInfo;
            templateModel = templateFromDetectionData;
        } else {
            pair = null;
        }
        return c(templateModel, pair);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void b(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData r18, kotlin.Triple r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.b(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData, kotlin.Triple):void");
    }

    private Single<Triple<ResponseFaceLogin, Float, ba>> c(TemplateModel templateModel, final Pair<String, Float> pair) {
        int i2 = 2 % 2;
        if (templateModel != null) {
            int i3 = af + 9;
            ag = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (pair != null) {
                Single singleFlatMap = getRepository().getCustomerUUIDByTemplateId((String) pair.first).defaultIfEmpty("").toSingle().observeOn(this.mDetectionScheduler).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda51
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return this.f$0.d(pair, (String) obj2);
                    }
                });
                int i4 = af + 111;
                ag = i4 % 128;
                int i5 = i4 % 2;
                return singleFlatMap;
            }
        }
        return Single.zip(Single.just(new ResponseFaceLogin()), Single.just(Float.valueOf(0.0f)), i(this.T), new SelfiePresenter$$ExternalSyntheticLambda44());
    }

    public /* synthetic */ SingleSource d(Pair pair, String str) throws Exception {
        return Single.zip(Single.just(new ResponseFaceLogin(str, ((Float) pair.second).floatValue() >= this.f12038l)), Single.just((Float) pair.second), i(this.T), new SelfiePresenter$$ExternalSyntheticLambda44());
    }

    private Single<Float> a(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = ag + 5;
        af = i3 % 128;
        int i4 = i3 % 2;
        if (this.A.getRecogKitAndroid() == null) {
            throw new IllegalStateException("Face login not enabled during SDK init!");
        }
        RecognitionFaceInfo recognitionFaceInfoPredictFace = RecogKitUtils.predictFace(this.A.getRecogKitAndroid(), RecogKitUtils.getFaceInfoFromDetectionData(this.A.getRecogKitAndroid(), detectionData));
        if (recognitionFaceInfoPredictFace == null) {
            return Single.just(Float.valueOf(-1.0f));
        }
        int i5 = af + 29;
        ag = i5 % 128;
        int i6 = i5 % 2;
        Single<Float> singleJust = Single.just(Float.valueOf(recognitionFaceInfoPredictFace.getPredictionConfidence()));
        int i7 = af + 1;
        ag = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 88 / 0;
        }
        return singleJust;
    }

    private Single<ResponseFaceLogin> g(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(detectionData.bitmap);
        try {
            Single<ResponseFaceLogin> singleOnErrorReturnItem = getRepository().loginFaceOneToOne(this.K, ae.e(base64FromBitmap, ae.c(new StringBuilder().append(base64FromBitmap).append(jCurrentTimeMillis).toString(), ae.c())), FaceProcessingUtils.d(detectionData), null, this.f12048v, this.C.getStringExtra("extraConfigurationId"), jCurrentTimeMillis, this.S, getRepository().getPersistedVideoRecordingId()).onErrorReturnItem(new ResponseFaceLogin());
            int i3 = ag + 79;
            af = i3 % 128;
            if (i3 % 2 == 0) {
                return singleOnErrorReturnItem;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
            return Single.error(e2);
        }
    }

    private Single<ResponseFaceLogin> h(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(detectionData.bitmap);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Single<ResponseFaceLogin> singleOnErrorReturnItem = getRepository().loginFaceOneToNServerLiveness(ae.e(base64FromBitmap, ae.c(new StringBuilder().append(base64FromBitmap).append(jCurrentTimeMillis).toString(), ae.c())), FaceProcessingUtils.d(detectionData), this.f12048v, this.C.getStringExtra("extraConfigurationId"), jCurrentTimeMillis, this.S, getRepository().getPersistedVideoRecordingId()).onErrorReturnItem(new ResponseFaceLogin());
            int i3 = af + 51;
            ag = i3 % 128;
            int i4 = i3 % 2;
            return singleOnErrorReturnItem;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
            return Single.error(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0018, code lost:
    
        if (r6.A.getRecogKitAndroid() != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x001c, code lost:
    
        if (r7.faceLandmarksState == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        if (r6.A.getRecogKitAndroid() != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0034, code lost:
    
        r3 = r6.A.getFacePadKitAndroid().detectSpoof(r7.bitmap, new com.incode.welcome_sdk.commons.utils.y(r7.faceLandmarksState, r7.bitmap, true, r6.O).b(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        timber.log.Timber.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        r3 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag + 9;
        com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0061, code lost:
    
        return io.reactivex.Single.just(new com.incode.welcome_sdk.data.remote.beans.ba(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        throw new java.lang.IllegalStateException("Local liveness not enabled during SDK init!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private io.reactivex.Single<com.incode.welcome_sdk.data.remote.beans.ba> i(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L2b
            com.incode.welcome_sdk.commons.RecogManager r0 = r6.A
            com.incode.recogkitandroid.RecogKitAndroid r1 = r0.getRecogKitAndroid()
            r0 = 30
            int r0 = r0 / 0
            if (r1 == 0) goto L62
        L1a:
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceLandmarksState r0 = r7.faceLandmarksState
            if (r0 == 0) goto L4b
            com.incode.welcome_sdk.commons.utils.y r4 = new com.incode.welcome_sdk.commons.utils.y
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceLandmarksState r2 = r7.faceLandmarksState
            android.graphics.Bitmap r1 = r7.bitmap
            float r0 = r6.O
            r3 = 1
            r4.<init>(r2, r1, r3, r0)
            goto L34
        L2b:
            com.incode.welcome_sdk.commons.RecogManager r0 = r6.A
            com.incode.recogkitandroid.RecogKitAndroid r0 = r0.getRecogKitAndroid()
            if (r0 == 0) goto L62
            goto L1a
        L34:
            com.incode.welcome_sdk.commons.RecogManager r0 = r6.A     // Catch: com.incode.recogkitandroid.RecogKitInvalidInputException -> L45 com.incode.recogkitandroid.RecogKitProcessException -> L47
            com.incode.recogkitandroid.FacePadKitAndroid r2 = r0.getFacePadKitAndroid()     // Catch: com.incode.recogkitandroid.RecogKitInvalidInputException -> L45 com.incode.recogkitandroid.RecogKitProcessException -> L47
            android.graphics.Bitmap r1 = r7.bitmap     // Catch: com.incode.recogkitandroid.RecogKitInvalidInputException -> L45 com.incode.recogkitandroid.RecogKitProcessException -> L47
            android.graphics.Bitmap r0 = r4.b()     // Catch: com.incode.recogkitandroid.RecogKitInvalidInputException -> L45 com.incode.recogkitandroid.RecogKitProcessException -> L47
            float r3 = r2.detectSpoof(r1, r0, r3)     // Catch: com.incode.recogkitandroid.RecogKitInvalidInputException -> L45 com.incode.recogkitandroid.RecogKitProcessException -> L47
            goto L4e
        L45:
            r0 = move-exception
            goto L48
        L47:
            r0 = move-exception
        L48:
            timber.log.Timber.e(r0)
        L4b:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L57
        L4e:
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r5
        L57:
            com.incode.welcome_sdk.data.remote.beans.ba r2 = new com.incode.welcome_sdk.data.remote.beans.ba
            double r0 = (double) r3
            r2.<init>(r0)
            io.reactivex.Single r0 = io.reactivex.Single.just(r2)
            return r0
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Local liveness not enabled during SDK init!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.i(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData):io.reactivex.Single");
    }

    public static /* synthetic */ void e(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 105;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("Liveness stat insert:%s", Boolean.valueOf(responseSuccess.isSuccess()));
        int i5 = af + 33;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 13;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th, "Liveness stat insert error", new Object[1]);
        } else {
            Timber.e(th, "Liveness stat insert error", new Object[0]);
        }
    }

    public static /* synthetic */ void c(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 93;
        af = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("Liveness stat update:%s", Boolean.valueOf(responseSuccess.isSuccess()));
        int i5 = af + 35;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    public static /* synthetic */ void c(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 113;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Liveness stat update error", new Object[0]);
        int i5 = ag + 37;
        af = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object q(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        String str = (String) objArr[1];
        FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        float fFloatValue2 = ((Number) objArr[4]).floatValue();
        String str2 = (String) objArr[5];
        String str3 = (String) objArr[6];
        float fFloatValue3 = ((Number) objArr[7]).floatValue();
        float fFloatValue4 = ((Number) objArr[8]).floatValue();
        int i2 = 2 % 2;
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        Object obj = null;
        if (!str.isEmpty()) {
            Single<ResponseSuccess> singleSubscribeOn = selfiePresenter.getRepository().updateLivenessStat(str, selfiePresenter.f12038l, selfiePresenter.f12036j, fFloatValue3, fFloatValue4, detectionData, str2, false, fFloatValue2, selfiePresenter.f12046t).subscribeOn(Schedulers.io());
            Objects.requireNonNull(compositeDisposable);
            compositeDisposable.add(singleSubscribeOn.doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda28
                @Override // io.reactivex.functions.Action
                public final void run() {
                    compositeDisposable.clear();
                }
            }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda31
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    SelfiePresenter.c((ResponseSuccess) obj2);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda32
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    SelfiePresenter.c((Throwable) obj2);
                }
            }));
            int i3 = af + 3;
            ag = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = af + 55;
        ag = i4 % 128;
        int i5 = i4 % 2;
        Observable<ResponseSuccess> observableSubscribeOn = selfiePresenter.getRepository().insertLivenessStat(fFloatValue, fFloatValue2, selfiePresenter.f12038l, selfiePresenter.f12036j, fFloatValue3, fFloatValue4, detectionData, str2, str3, selfiePresenter.f12046t).subscribeOn(Schedulers.io());
        Objects.requireNonNull(compositeDisposable);
        compositeDisposable.add(observableSubscribeOn.doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda28
            @Override // io.reactivex.functions.Action
            public final void run() {
                compositeDisposable.clear();
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda29
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                SelfiePresenter.e((ResponseSuccess) obj2);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda30
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                SelfiePresenter.e((Throwable) obj2);
            }
        }));
        return null;
    }

    private Observable<?> j(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = ag + 73;
        af = i3 % 128;
        int i4 = i3 % 2;
        Observable<?> observableDoOnNext = Observable.just(detectionData).observeOn(AndroidSchedulers.mainThread()).observeOn(this.mDetectionScheduler).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda27
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.m((FaceProcessingUtils.DetectionData) obj);
            }
        });
        int i5 = ag + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return observableDoOnNext;
        }
        throw null;
    }

    public /* synthetic */ void m(FaceProcessingUtils.DetectionData detectionData) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 47;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            FaceAttributes faceAttributesDetectFaceAttributes = detectFaceAttributes(this.A, detectionData.bitmap, detectionData.faceLandmarksState);
            if (faceAttributesDetectFaceAttributes == null) {
                this.f12047u.onFaceScanFailed(new IllegalStateException("Error while calculating mask confidence"));
                int i4 = ag + 79;
                af = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.f12047u.onMaskCheckComplete(faceHasMask(faceAttributesDetectFaceAttributes), r(), p());
            int i5 = af + 81;
            ag = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        detectFaceAttributes(this.A, detectionData.bitmap, detectionData.faceLandmarksState);
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void onDetectionError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = ag + 101;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th, "Couldn't process frame", new Object[0]);
            i();
            this.f12047u.onFaceScanFailed(th);
            if (th instanceof NoConnectivityException) {
                return;
            }
        } else {
            Timber.e(th, "Couldn't process frame", new Object[0]);
            i();
            this.f12047u.onFaceScanFailed(th);
            if (th instanceof NoConnectivityException) {
                return;
            }
        }
        this.f12047u.closeScreen();
        int i4 = ag + 29;
        af = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData c(android.graphics.Bitmap r17) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.c(android.graphics.Bitmap):com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData");
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        FaceProcessingUtils.FaceProcessingState faceProcessingState = (FaceProcessingUtils.FaceProcessingState) objArr[2];
        Face face = (Face) objArr[3];
        FaceProcessingUtils.FaceLandmarksState faceLandmarksState = (FaceProcessingUtils.FaceLandmarksState) objArr[4];
        int i2 = 2 % 2;
        int i3 = af + 37;
        ag = i3 % 128;
        int i4 = i3 % 2;
        detectionData.detectionResultState = faceProcessingState;
        detectionData.face = face;
        detectionData.faceLandmarksState = faceLandmarksState;
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{selfiePresenter, detectionData}, 937070029, BasicDrawer.d(), -937070018, BasicDrawer.d());
        int i5 = af + 17;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return detectionData;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData getSelfieDetectionResultNoConstraints(android.graphics.Bitmap r9, boolean r10) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData r2 = new com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData
            r2.<init>(r9)
            com.incode.welcome_sdk.commons.c.c.b r0 = r8.f12051y
            boolean r0 = r0.d()
            if (r0 != 0) goto L15
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.NOT_READY
            r2.detectionResultState = r0
            return r2
        L15:
            com.incode.welcome_sdk.commons.c.c.b r1 = r8.f12051y
            android.graphics.Bitmap r0 = r2.bitmap
            java.util.ArrayList r0 = r1.e(r0)
            r2.detectedFaces = r0
            java.util.ArrayList<com.incode.recogkitandroid.Face> r0 = r2.detectedFaces
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r7
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.NO_FACE
            r2.detectionResultState = r0
        L34:
            return r2
        L35:
            java.util.ArrayList<com.incode.recogkitandroid.Face> r0 = r2.detectedFaces
            r6 = 0
            java.lang.Object r3 = r0.get(r6)
            com.incode.recogkitandroid.Face r3 = (com.incode.recogkitandroid.Face) r3
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceLandmarksState r0 = com.incode.welcome_sdk.commons.utils.FaceUtils.getLandmarkState(r3)
            r2.faceLandmarksState = r0
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceLandmarksState r0 = r2.faceLandmarksState
            boolean r0 = r0.recognitionLandmarksDetected()
            if (r0 == 0) goto Lab
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L7f
            r0 = 73
            int r0 = r0 / r6
            if (r10 == 0) goto L82
        L5c:
            com.incode.welcome_sdk.commons.utils.y r5 = new com.incode.welcome_sdk.commons.utils.y
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceLandmarksState r4 = r2.faceLandmarksState
            android.graphics.Bitmap r1 = r2.bitmap
            float r0 = r8.O
            r5.<init>(r4, r1, r6, r0)
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = r5.a()
            r2.detectionResultState = r0
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r1 = r2.detectionResultState
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.FACE_DETECTED
            if (r1 != r0) goto L34
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af = r0
            int r1 = r1 % r7
            r2.face = r3
            goto L34
        L7f:
            if (r10 == 0) goto L82
            goto L5c
        L82:
            com.incode.recogkitandroid.Face$Rect r0 = r3.rect
            float r0 = r0.width
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            com.incode.recogkitandroid.Face$Rect r0 = r3.rect
            float r0 = r0.height
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Detected face size width: %s, height: %s"
            timber.log.Timber.d(r0, r1)
            r2.face = r3
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.FACE_DETECTED
            r2.detectionResultState = r0
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.af
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.ag = r0
            int r1 = r1 % r7
            goto L34
        Lab:
            com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$FaceProcessingState r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.NO_LANDMARKS
            r2.detectionResultState = r0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.getSelfieDetectionResultNoConstraints(android.graphics.Bitmap, boolean):com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData");
    }

    private boolean o() {
        int i2 = 2 % 2;
        int i3 = af;
        int i4 = i3 + 57;
        ag = i4 % 128;
        int i5 = i4 % 2;
        if (this.L) {
            return false;
        }
        int i6 = i3 + 7;
        ag = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            this.W.equals(FaceProcessingUtils.FaceProcessingState.EMPTY);
            obj.hashCode();
            throw null;
        }
        if (!this.W.equals(FaceProcessingUtils.FaceProcessingState.EMPTY)) {
            int i7 = ag + 63;
            af = i7 % 128;
            int i8 = i7 % 2;
            if (!this.W.equals(FaceProcessingUtils.FaceProcessingState.NO_FACE)) {
                int i9 = af + 125;
                ag = i9 % 128;
                if (i9 % 2 == 0) {
                    this.W.equals(FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT);
                    throw null;
                }
                if (!this.W.equals(FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT)) {
                    return false;
                }
            }
        }
        return true;
    }

    public /* synthetic */ void b(boolean z2, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 121;
        af = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.d("Timer expired, starting processing again", new Object[1]);
        } else {
            Timber.d("Timer expired, starting processing again", new Object[0]);
        }
        startFaceDetection(z2);
    }

    public static /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 81;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d(final boolean z2, int i2) {
        int i3 = 2 % 2;
        int i4 = ag + 63;
        af = i4 % 128;
        if (i4 % 2 != 0) {
            this.E = Observable.timer(i2, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda12
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(z2, (Long) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda13
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    SelfiePresenter.d((Throwable) obj);
                }
            });
            int i5 = 51 / 0;
        } else {
            this.E = Observable.timer(i2, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda12
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(z2, (Long) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda13
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    SelfiePresenter.d((Throwable) obj);
                }
            });
        }
        int i6 = af + 47;
        ag = i6 % 128;
        int i7 = i6 % 2;
    }

    private void l() {
        int i2 = 2 % 2;
        int i3 = ag + 15;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        Disposable disposable = this.E;
        if (disposable != null) {
            int i6 = i4 + 61;
            ag = i6 % 128;
            int i7 = i6 % 2;
            disposable.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object j(java.lang.Object[] r23) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter.j(java.lang.Object[]):java.lang.Object");
    }

    private void d(Bitmap bitmap) {
        int i2 = 2 % 2;
        EventUtils.sendFrameLogsEvent(getRepository(), this.f12047u.getModule(), new SelfieScanFrameLogs(this.R, new Date().getTime(), this.f12039m.name(), this.f12042p.name(), this.f12043q.name(), this.f12046t.name(), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), this.P, new SelfieScanFrameLogs.b(this.N, Float.valueOf(15.0f), Float.valueOf(this.f12035h), Float.valueOf(50.0f), Boolean.valueOf(this.f12049w), Boolean.valueOf(this.f12048v), Boolean.valueOf(this.f12044r), Boolean.valueOf(this.f12050x), Float.valueOf(this.O)), this.Q).toJson());
        int i3 = af + 15;
        ag = i3 % 128;
        int i4 = i3 % 2;
    }

    private String r() {
        int i2 = 2 % 2;
        int i3 = ag + 105;
        af = i3 % 128;
        int i4 = i3 % 2;
        String croppedSelfiePath = getRepository().getCroppedSelfiePath();
        int i5 = ag + 77;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return croppedSelfiePath;
        }
        throw null;
    }

    private String p() {
        int i2 = 2 % 2;
        int i3 = ag + 13;
        af = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repository = getRepository();
        if (i4 == 0) {
            return repository.getFullFrameSelfiePath();
        }
        repository.getFullFrameSelfiePath();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = ag + 65;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12052z.clear();
            this.D.clear();
            stopAutoShutterTimer();
            l();
            super.onDestroy();
            return;
        }
        this.f12052z.clear();
        this.D.clear();
        stopAutoShutterTimer();
        l();
        super.onDestroy();
        throw null;
    }

    public /* synthetic */ void q() {
        int i2 = 2 % 2;
        publishResult(new SelfieScanResult(ResultCode.EMULATOR_DETECTED, null, new DeviceStats(getMotionStatus()), -1.0d, null, -1.0d, null, -1.0d, null, null, null, 9));
        int i3 = ag + 23;
        af = i3 % 128;
        int i4 = i3 % 2;
    }

    private void s() {
        int i2 = 2 % 2;
        int i3 = ag + 87;
        af = i3 % 128;
        int i4 = i3 % 2;
        if (IncodeWelcome.getInstance().isTestMode()) {
            int i5 = af + 17;
            ag = i5 % 128;
            int i6 = i5 % 2;
            final Runnable runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.q();
                }
            };
            this.D.add(Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    SelfiePresenter.b(runnable, (Long) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    SelfiePresenter.d(runnable, (Throwable) obj);
                }
            }));
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void publishResult(SelfieScanResult selfieScanResult) {
        int i2 = 2 % 2;
        selfieScanResult.idealCaptureEnvironmentTestResult = this.X;
        if (this.B) {
            int i3 = af + 1;
            ag = i3 % 128;
            try {
            } catch (Exception unused) {
                Timber.w("SelfieScan metadata could not be encrypted!", new Object[0]);
                selfieScanResult.metadata = "";
            }
            if (i3 % 2 == 0) {
                selfieScanResult.metadata = com.incode.welcome_sdk.data.e.b.e(this.f11267g.c());
                throw null;
            }
            selfieScanResult.metadata = com.incode.welcome_sdk.data.e.b.e(this.f11267g.c());
            if (this.f12047u.shouldProceedWithVideoLivenessFunction()) {
                int i4 = af + 69;
                ag = i4 % 128;
                int i5 = i4 % 2;
                selfieScanResult.videoFilePath = g.f10681a.b(getRepository());
                int i6 = af + 29;
                ag = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        publishResultOnModuleBus(selfieScanResult);
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public void setMinFaceWidth(float f2) {
        int i2 = 2 % 2;
        int i3 = ag + 117;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        this.O = f2;
        int i6 = i4 + 37;
        ag = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource b(Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 73;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            bool.booleanValue();
            throw null;
        }
        if (bool.booleanValue()) {
            Observable<?> observableC = c(this.f12039m, this.T);
            int i4 = ag + 33;
            af = i4 % 128;
            if (i4 % 2 == 0) {
                return observableC;
            }
            throw null;
        }
        return Observable.empty();
    }

    public static /* synthetic */ void c(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 97;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        SelfiePresenter selfiePresenter = (SelfiePresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 31;
        af = i3 % 128;
        int i4 = i3 % 2;
        selfiePresenter.e(selfiePresenter.k());
        int i5 = ag + 49;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public /* synthetic */ void b(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = af + 91;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th);
            this.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.t();
                }
            });
        } else {
            Timber.e(th);
            this.ab.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.t();
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onIdealCaptureEnvironmentFound() {
        int i2 = 2 % 2;
        int i3 = af + 77;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            this.D.add(this.Y.flatMapObservable(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda56
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((Boolean) obj);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda57
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    SelfiePresenter.c(obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda58
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b((Throwable) obj);
                }
            }));
        } else {
            this.D.add(this.Y.flatMapObservable(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda56
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((Boolean) obj);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda57
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    SelfiePresenter.c(obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter$$ExternalSyntheticLambda58
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b((Throwable) obj);
                }
            }));
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void saveUnsafeEnvironmentResult(int i2) {
        int i3 = 2 % 2;
        int i4 = ag + 47;
        af = i4 % 128;
        if (i4 % 2 == 0) {
            this.X = Integer.valueOf(i2);
        } else {
            this.X = Integer.valueOf(i2);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.Presenter
    public FaceProcessingUtils.DetectionData getDetectionData() {
        int i2 = 2 % 2;
        int i3 = ag + 9;
        af = i3 % 128;
        int i4 = i3 % 2;
        FaceProcessingUtils.DetectionData detectionData = this.T;
        int i5 = ag + 43;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return detectionData;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        af = 0;
        ag = 1;
        ah = new char[]{23084, 23083, 23091, 23082, 23086, 23103, 23080, 23041, 23096, 23092, 23087, 23095, 23085, 23090, 23099, 23081};
        ae = (char) 28608;
    }

    public static /* synthetic */ void b(Object obj) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{obj}, -1091404843, BasicDrawer.d(), 1091404846, BasicDrawer.d());
    }

    public /* synthetic */ void b(List list) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, list}, -1595215299, BasicDrawer.d(), 1595215315, BasicDrawer.d());
    }

    public /* synthetic */ void o(Throwable th) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, th}, 1467576507, BasicDrawer.d(), -1467576486, BasicDrawer.d());
    }

    public /* synthetic */ SingleSource D() throws Exception {
        return (SingleSource) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this}, 1823888091, BasicDrawer.d(), -1823888074, BasicDrawer.d());
    }

    public /* synthetic */ void l(FaceProcessingUtils.DetectionData detectionData) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData}, -211695987, BasicDrawer.d(), 211695997, BasicDrawer.d());
    }

    public /* synthetic */ FaceProcessingUtils.DetectionData e(Bitmap bitmap) throws Exception {
        return (FaceProcessingUtils.DetectionData) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, bitmap}, 1343482747, BasicDrawer.d(), -1343482734, BasicDrawer.d());
    }

    public /* synthetic */ void o(FaceProcessingUtils.DetectionData detectionData) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData}, -1699249987, BasicDrawer.d(), 1699249988, BasicDrawer.d());
    }

    public /* synthetic */ void z() {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this}, 2084750153, BasicDrawer.d(), -2084750148, BasicDrawer.d());
    }

    public /* synthetic */ void i(Throwable th) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, th}, 1098911784, BasicDrawer.d(), -1098911762, BasicDrawer.d());
    }

    public /* synthetic */ ObservableSource b(v vVar) throws Exception {
        return (ObservableSource) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, vVar}, 18010684, BasicDrawer.d(), -18010678, BasicDrawer.d());
    }

    public /* synthetic */ SingleSource b(String str, Pair pair) throws Exception {
        return (SingleSource) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, str, pair}, -1365499631, BasicDrawer.d(), 1365499638, BasicDrawer.d());
    }

    public static /* synthetic */ void v() throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[0], 341750282, BasicDrawer.d(), -341750278, BasicDrawer.d());
    }

    public static /* synthetic */ void b(Runnable runnable, Long l2) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{runnable, l2}, 1639158391, BasicDrawer.d(), -1639158372, BasicDrawer.d());
    }

    public static /* synthetic */ void d(Runnable runnable, Throwable th) throws Exception {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{runnable, th}, -848655144, BasicDrawer.d(), 848655152, BasicDrawer.d());
    }

    public /* synthetic */ void t() {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this}, 703656101, BasicDrawer.d(), -703656089, BasicDrawer.d());
    }

    private void f(FaceProcessingUtils.DetectionData detectionData) {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData}, 937070029, BasicDrawer.d(), -937070018, BasicDrawer.d());
    }

    private FaceProcessingUtils.DetectionData c(FaceProcessingUtils.DetectionData detectionData, FaceProcessingUtils.FaceProcessingState faceProcessingState, Face face, FaceProcessingUtils.FaceLandmarksState faceLandmarksState) {
        return (FaceProcessingUtils.DetectionData) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData, faceProcessingState, face, faceLandmarksState}, -1880571348, BasicDrawer.d(), 1880571366, BasicDrawer.d());
    }

    private void b(String str, FaceProcessingUtils.DetectionData detectionData, float f2, float f3, String str2, String str3, float f4, float f5) {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, str, detectionData, Float.valueOf(f2), Float.valueOf(f3), str2, str3, Float.valueOf(f4), Float.valueOf(f5)}, 1550013338, BasicDrawer.d(), -1550013318, BasicDrawer.d());
    }

    private Single<?> d(FaceProcessingUtils.DetectionData detectionData) {
        return (Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData}, 1919606896, BasicDrawer.d(), -1919606896, BasicDrawer.d());
    }

    private static Single<Pair<String, String>> a(Bitmap bitmap) {
        return (Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{bitmap}, -1008976873, BasicDrawer.d(), 1008976875, BasicDrawer.d());
    }

    private Single<Triple<ResponseFaceAuthentication, String, String>> e(String str) {
        return (Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, str}, 1331703151, BasicDrawer.d(), -1331703142, BasicDrawer.d());
    }

    private Single<?> b(FaceProcessingUtils.DetectionData detectionData) {
        return (Single) a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this, detectionData}, -433483324, BasicDrawer.d(), 433483339, BasicDrawer.d());
    }

    private void b() {
        a(BasicDrawer.d(), BasicDrawer.d(), new Object[]{this}, -1555821057, BasicDrawer.d(), 1555821071, BasicDrawer.d());
    }
}
