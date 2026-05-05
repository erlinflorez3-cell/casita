package com.incode.welcome_sdk.ui.camera;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.incode.recogkitandroid.FaceAttributes;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.recogkitandroid.QualityResult;
import com.incode.recogkitandroid.SelfieFaceQualityKitAndroid;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.components.d;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.f;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.results.Status;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdealEnvironmentTestResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CameraPresenter extends BaseModulePresenter implements CameraContract.Presenter {
    private static int A = 0;
    private static int D = 1;
    private IdealEnvironmentTestResult B;
    private int C;

    /* JADX INFO: renamed from: a */
    public PublishSubject<Bitmap> f11261a;

    /* JADX INFO: renamed from: b */
    public boolean f11262b;

    /* JADX INFO: renamed from: c */
    public float f11263c;

    /* JADX INFO: renamed from: d */
    public boolean f11264d;

    /* JADX INFO: renamed from: e */
    public CompositeDisposable f11265e;

    /* JADX INFO: renamed from: f */
    public volatile float f11266f;

    /* JADX INFO: renamed from: g */
    public s.b f11267g;

    /* JADX INFO: renamed from: h */
    private final CameraContract.View f11268h;
    public volatile float headYAngle;
    public volatile float headZAngle;

    /* JADX INFO: renamed from: i */
    public volatile float f11269i;

    /* JADX INFO: renamed from: j */
    private final String f11270j;

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f11271k;

    /* JADX INFO: renamed from: l */
    private final Executor f11272l;

    /* JADX INFO: renamed from: m */
    private final IncodeWelcomeRepository f11273m;
    public Scheduler mDetectionScheduler;

    /* JADX INFO: renamed from: n */
    private final AtomicBoolean f11274n;

    /* JADX INFO: renamed from: o */
    private final AtomicBoolean f11275o;

    /* JADX INFO: renamed from: p */
    private int f11276p;

    /* JADX INFO: renamed from: q */
    private boolean f11277q;

    /* JADX INFO: renamed from: r */
    private float f11278r;

    /* JADX INFO: renamed from: s */
    private int f11279s;

    /* JADX INFO: renamed from: t */
    private int f11280t;

    /* JADX INFO: renamed from: u */
    private CompositeDisposable f11281u;

    /* JADX INFO: renamed from: v */
    private Bitmap f11282v;

    /* JADX INFO: renamed from: w */
    private final PublishSubject<byte[]> f11283w;

    /* JADX INFO: renamed from: x */
    private byte[] f11284x;

    /* JADX INFO: renamed from: y */
    private float f11285y;

    /* JADX INFO: renamed from: z */
    private Status f11286z;

    public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = (~(i2 | i6)) | (~(i8 | i10));
        int i13 = ~(i10 | i7 | i6);
        int i14 = i7 + i6 + i5 + ((-194346734) * i4) + (9035316 * i3);
        int i15 = i14 * i14;
        int i16 = (((-787818500) * i7) - 443744256) + ((-1492047866) * i6) + (352114683 * i11) + (i12 * (-352114683)) + ((-352114683) * i13) + ((-1139933184) * i5) + (1190920192 * i4) + (1456996352 * i3) + ((-1774911488) * i15);
        int i17 = (i7 * 1174986172) + 1294669563 + (i6 * 1174986598) + (i11 * (-213)) + (i12 * Mp4VideoDirectory.TAG_COLOR_TABLE) + (i13 * Mp4VideoDirectory.TAG_COLOR_TABLE) + (i5 * 1174986385) + (i4 * (-1060063438)) + (i3 * 107475828) + (i15 * 168099840);
        if (i16 + (i17 * i17 * 40566784) == 1) {
            return a(objArr);
        }
        CameraPresenter cameraPresenter = (CameraPresenter) objArr[0];
        int i18 = 2 % 2;
        if (cameraPresenter.f11282v == null) {
            return null;
        }
        int i19 = A;
        int i20 = i19 + 115;
        D = i20 % 128;
        int i21 = i20 % 2;
        cameraPresenter.f11282v = null;
        int i22 = i19 + 69;
        D = i22 % 128;
        if (i22 % 2 != 0) {
            return null;
        }
        int i23 = 4 % 3;
        return null;
    }

    protected abstract void onDetectionError(Throwable th);

    protected abstract Observable<Object> processPreviewFrame(Observable<Bitmap> observable, Runnable runnable);

    public Scheduler getDetectionScheduler() {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 1;
        D = i4 % 128;
        int i5 = i4 % 2;
        Scheduler scheduler = this.mDetectionScheduler;
        int i6 = i3 + 3;
        D = i6 % 128;
        int i7 = i6 % 2;
        return scheduler;
    }

    public CameraPresenter(CameraContract.View view, IncodeWelcomeRepository incodeWelcomeRepository) {
        super(view);
        this.f11270j = CameraPresenter.class.getName();
        this.f11275o = new AtomicBoolean();
        this.f11262b = false;
        this.f11264d = true;
        this.f11271k = new AtomicBoolean();
        this.f11274n = new AtomicBoolean();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f11272l = executorServiceNewSingleThreadExecutor;
        this.mDetectionScheduler = Schedulers.from(executorServiceNewSingleThreadExecutor);
        this.f11277q = true;
        this.f11278r = 1.0f;
        this.f11263c = 1.0f;
        this.f11285y = 1.0f;
        this.headYAngle = Float.MAX_VALUE;
        this.headZAngle = Float.MAX_VALUE;
        this.C = 750;
        this.f11286z = null;
        this.f11267g = new s.b();
        this.f11268h = view;
        this.f11273m = incodeWelcomeRepository;
        this.f11281u = new CompositeDisposable();
        this.f11265e = new CompositeDisposable();
        this.f11283w = PublishSubject.create();
        this.f11261a = PublishSubject.create();
        c();
    }

    protected CameraContract.View getCameraView() {
        int i2 = 2 % 2;
        int i3 = D;
        int i4 = i3 + 9;
        A = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        CameraContract.View view = this.f11268h;
        int i5 = i3 + 45;
        A = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public IncodeWelcomeRepository getRepository() {
        IncodeWelcomeRepository incodeWelcomeRepository;
        int i2 = 2 % 2;
        int i3 = A + 65;
        int i4 = i3 % 128;
        D = i4;
        if (i3 % 2 == 0) {
            incodeWelcomeRepository = this.f11273m;
            int i5 = 63 / 0;
        } else {
            incodeWelcomeRepository = this.f11273m;
        }
        int i6 = i4 + 7;
        A = i6 % 128;
        if (i6 % 2 == 0) {
            return incodeWelcomeRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void createCameraSourceAndFaceProcessor(int i2) {
        int i3 = 2 % 2;
        int i4 = A + 27;
        D = i4 % 128;
        int i5 = i4 % 2;
        if (i2 == CameraFacing.BACK.getCameraFacing()) {
            this.f11267g.f9967d = CameraFacing.BACK;
        } else {
            this.f11267g.f9967d = CameraFacing.FRONT;
        }
        if (IncodeWelcome.getInstance().isTestMode()) {
            return;
        }
        this.f11268h.createCameraSource(i2);
        CameraPreview cameraPreview = getCameraView().getCameraPreview();
        if (cameraPreview != null) {
            this.f11277q = cameraPreview.isAutofocusMode();
        }
        int i6 = A + 79;
        D = i6 % 128;
        int i7 = i6 % 2;
    }

    protected void fillInMetadata(boolean z2) {
        f fVar;
        int i2 = 2 % 2;
        this.f11267g.f9969h = getMotionStatus();
        this.f11267g.f9968e = new s.i(getRepository().getDeviceFingerprint(), IncodeWelcome.getInstance().getScreenDimensions());
        fillInCameraSettingsMetadata();
        s.b bVar = this.f11267g;
        if (!z2) {
            fVar = f.AUTO;
            int i3 = A + 73;
            D = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 2;
            }
        } else {
            int i5 = D + 3;
            A = i5 % 128;
            int i6 = i5 % 2;
            fVar = f.MANUAL;
        }
        bVar.f9964a = fVar;
    }

    protected void fillInCameraSettingsMetadata() {
        int i2 = 2 % 2;
        this.f11267g.f9966c = new s.a(this.f11279s, this.f11276p, s.a.d(this.f11277q));
        int i3 = D + 33;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public Point getDesiredPreviewSize(boolean z2) {
        return new Point(720, z2 ? 960 : 1280);
    }

    public /* synthetic */ Bitmap e(byte[] bArr) throws Exception {
        int i2 = 2 % 2;
        int i3 = A + 99;
        D = i3 % 128;
        int i4 = i3 % 2;
        Bitmap rotatedCroppedBitmapFromFrame = BitmapUtils.getRotatedCroppedBitmapFromFrame(this.f11268h.getContext(), bArr, this.f11279s, this.f11276p, 1.0f, 1.0f, this.f11280t);
        int i5 = A + 53;
        D = i5 % 128;
        if (i5 % 2 != 0) {
            return rotatedCroppedBitmapFromFrame;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Bitmap c(Bitmap bitmap) throws Exception {
        int i2 = 2 % 2;
        int i3 = D + 31;
        A = i3 % 128;
        int i4 = i3 % 2;
        Bitmap memoryLeakProtectedBitmap = BitmapUtils.getMemoryLeakProtectedBitmap(bitmap, this.f11270j);
        int i5 = D + 3;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return memoryLeakProtectedBitmap;
    }

    public /* synthetic */ ObservableSource b(Observable observable) {
        int i2 = 2 % 2;
        int i3 = A + 73;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            return processPreviewFrame(observable, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
        }
        processPreviewFrame(observable, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void e() {
        int i2 = 2 % 2;
        int i3 = D + 19;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.f11271k.set(false);
        int i5 = A + 81;
        D = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void c(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = D + 1;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onResume() {
        int i2 = 2 % 2;
        int i3 = A + 91;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!this.f11262b)) {
            this.f11275o.set(true);
        }
        this.f11265e.add(this.f11283w.subscribeOn(this.mDetectionScheduler).observeOn(this.mDetectionScheduler).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return this.f$0.e((byte[]) obj2);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return this.f$0.c((Bitmap) obj2);
            }
        }).compose(new ObservableTransformer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda9
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return this.f$0.b(observable);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.stopProcessing();
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                CameraPresenter.c(obj2);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                this.f$0.onDetectionError((Throwable) obj2);
            }
        }));
        this.f11264d = false;
        int i4 = A + 29;
        D = i4 % 128;
        int i5 = i4 % 2;
    }

    public void stopProcessing() {
        AtomicBoolean atomicBoolean;
        int i2 = 2 % 2;
        int i3 = A + 47;
        D = i3 % 128;
        boolean z2 = false;
        if (i3 % 2 == 0) {
            this.f11275o.set(false);
            atomicBoolean = this.f11271k;
            z2 = true;
        } else {
            this.f11275o.set(false);
            atomicBoolean = this.f11271k;
        }
        atomicBoolean.set(z2);
        int i4 = D + 29;
        A = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void setProcessingInProgress(boolean z2) {
        int i2 = 2 % 2;
        int i3 = A + 121;
        D = i3 % 128;
        int i4 = i3 % 2;
        this.f11271k.set(z2);
        int i5 = D + 33;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void retryProcessingBytes(boolean z2) {
        int i2 = 2 % 2;
        int i3 = A + 55;
        D = i3 % 128;
        int i4 = i3 % 2;
        enableProcessing(true);
        if (z2) {
            int i5 = D + 23;
            A = i5 % 128;
            int i6 = i5 % 2;
            this.f11283w.onNext(this.f11284x);
            int i7 = D + 89;
            A = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 4;
            }
        }
    }

    public void retryProcessingBitmap(boolean z2) {
        int i2 = 2 % 2;
        int i3 = D + 51;
        A = i3 % 128;
        int i4 = i3 % 2;
        enableProcessing(true);
        if (z2) {
            this.f11261a.onNext(this.f11282v);
        }
        int i5 = A + 65;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = A + 91;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11264d = false;
        } else {
            this.f11264d = true;
        }
        this.f11262b = this.f11275o.get();
        this.f11265e.clear();
        int i4 = A + 31;
        D = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = A + 63;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            BitmapUtils.deleteMemoryLeakProtectedBitmap(this.f11270j);
            int iO = d.a.o();
            int iO2 = d.a.o();
            int iO3 = d.a.o();
            c(iO, d.a.o(), iO3, new Object[]{this}, iO2, 254336901, -254336900);
            int i4 = 15 / 0;
        } else {
            BitmapUtils.deleteMemoryLeakProtectedBitmap(this.f11270j);
            int iO4 = d.a.o();
            int iO5 = d.a.o();
            int iO6 = d.a.o();
            c(iO4, d.a.o(), iO6, new Object[]{this}, iO5, 254336901, -254336900);
        }
        int i5 = D + 75;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CameraPresenter cameraPresenter = (CameraPresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = D + 111;
        int i4 = i3 % 128;
        A = i4;
        if (i3 % 2 == 0) {
            byte[] bArr = cameraPresenter.f11284x;
            if (bArr != null && bArr.length > 0) {
                cameraPresenter.f11284x = null;
                int i5 = i4 + 13;
                D = i5 % 128;
                int i6 = i5 % 2;
            }
            return null;
        }
        byte[] bArr2 = cameraPresenter.f11284x;
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public final void processPreviewRawFrame(byte[] bArr) {
        int i2 = 2 % 2;
        int iO = d.a.o();
        int iO2 = d.a.o();
        int iO3 = d.a.o();
        c(iO, d.a.o(), iO3, new Object[]{this}, iO2, 254336901, -254336900);
        this.f11284x = bArr;
        if (!this.f11275o.get() || !this.f11271k.compareAndSet(false, true)) {
            return;
        }
        int i3 = A + 79;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            if (skipProcessingFrame()) {
                this.f11271k.set(false);
                return;
            }
            this.f11283w.onNext(bArr);
            int i4 = D + 87;
            A = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        skipProcessingFrame();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public final void processPreviewRawBitmap(Bitmap bitmap) {
        int i2 = 2 % 2;
        int iO = d.a.o();
        int iO2 = d.a.o();
        c(iO, d.a.o(), d.a.o(), new Object[]{this}, iO2, -29551056, 29551056);
        this.f11282v = bitmap;
        if (this.f11275o.get() && !(!this.f11271k.compareAndSet(false, true))) {
            if (!skipProcessingFrame()) {
                this.f11261a.onNext(bitmap);
            } else {
                int i3 = D + 89;
                A = i3 % 128;
                int i4 = i3 % 2;
                this.f11271k.set(false);
                return;
            }
        }
        int i5 = A + 69;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
    }

    public boolean skipProcessingFrame() {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 99;
        D = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f11264d;
        int i6 = i3 + 15;
        D = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public boolean isCameraFocused() {
        int i2 = 2 % 2;
        int i3 = A + 1;
        D = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsCameraFocused = this.f11268h.getCameraPreview().isCameraFocused();
        int i5 = A + 41;
        D = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsCameraFocused;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void takePicture() {
        int i2 = 2 % 2;
        int i3 = D + 125;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onPictureTaken(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = D + 1;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.CameraPresenter$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11287a;

        /* JADX INFO: renamed from: c */
        private static int f11288c = 1;

        /* JADX INFO: renamed from: d */
        private static int f11289d = 0;

        static {
            int[] iArr = new int[f.c.valuesCustom().length];
            f11287a = iArr;
            try {
                iArr[f.c.CROP_WIDTH.ordinal()] = 1;
                int i2 = f11288c + 123;
                f11289d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11287a[f.c.CROP_HEIGHT.ordinal()] = 2;
                int i5 = f11289d + 109;
                f11288c = i5 % 128;
                int i6 = i5 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onCameraSizeParamsChanged(int i2, int i3, int i4, int i5, f.c cVar, int i6) {
        int i7 = 2 % 2;
        int i8 = D + 57;
        A = i8 % 128;
        int i9 = i8 % 2;
        this.f11280t = i6;
        this.f11279s = i2;
        this.f11276p = i3;
        if (cVar == null) {
            cVar = com.incode.welcome_sdk.commons.utils.f.b(i4, i5, this.f11268h.getScreenWidth(), this.f11268h.getScreenHeight());
        }
        int i10 = AnonymousClass3.f11287a[cVar.ordinal()];
        if (i10 == 1) {
            this.f11278r = i5 / this.f11268h.getScreenHeight();
            int i11 = A + 29;
            D = i11 % 128;
            int i12 = i11 % 2;
        } else if (i10 == 2) {
            this.f11278r = i4 / this.f11268h.getScreenWidth();
        }
        Pair<Float, Float> pairA = com.incode.welcome_sdk.commons.utils.f.a(i4, i5, this.f11268h.getScreenWidth(), this.f11268h.getScreenHeight(), cVar);
        this.f11263c = pairA.first.floatValue();
        this.f11285y = pairA.second.floatValue();
        BitmapUtils.deleteMemoryLeakProtectedBitmap(this.f11270j);
        Timber.d("onCameraSizeParamsChanged preview w:%s h:%s w:%s h:%s scale:%s cropW:%s cropH:%s angle:%s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(this.f11278r), Float.valueOf(this.f11263c), Float.valueOf(this.f11285y), Integer.valueOf(i6));
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onStart(boolean z2, boolean z3) {
        int i2 = 2 % 2;
        int i3 = D + 121;
        A = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void setCameraFacing(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 93;
        A = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public boolean isProcessingEnabled() {
        int i2 = 2 % 2;
        int i3 = D + 109;
        A = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f11275o.get();
        int i5 = A + 123;
        D = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void enableProcessing(boolean z2) {
        int i2 = 2 % 2;
        int i3 = D + 69;
        A = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11275o.set(z2);
            int i4 = D + 7;
            A = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f11275o.set(z2);
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public boolean isIdealCaptureEnvironmentTestInProgress() {
        int i2 = 2 % 2;
        int i3 = A + 41;
        D = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f11274n.get();
        int i5 = A + 103;
        D = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void setIdealCaptureEnvironmentTestInProgress(boolean z2) {
        int i2 = 2 % 2;
        int i3 = D + 79;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.f11274n.set(z2);
        int i5 = D + 3;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isBlurred(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = A + 123;
        D = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsBlurred = isBlurred(bitmap, 50.0f);
        if (i4 == 0) {
            int i5 = 5 / 0;
        }
        return zIsBlurred;
    }

    protected boolean isBlurred(Bitmap bitmap, float f2) {
        int i2 = 2 % 2;
        int i3 = D + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        A = i3 % 128;
        if (i3 % 2 != 0) {
            RecogKitUtils.isFullRecogKitAvailable();
            throw null;
        }
        if (!RecogKitUtils.isFullRecogKitAvailable()) {
            int i4 = A + 9;
            D = i4 % 128;
            return i4 % 2 == 0;
        }
        this.f11266f = -1.0f;
        try {
            this.f11266f = ImageProcessingKit.getBlurrinessLevel(bitmap);
            this.f11268h.onBlurrinessUpdate(this.f11266f, f2);
            int i5 = D + 101;
            A = i5 % 128;
            int i6 = i5 % 2;
        } catch (ImageProcessingKitInvalidInputException | ImageProcessingKitProcessException e2) {
            Timber.e(e2);
        }
        return this.f11266f < f2;
    }

    public boolean isTooDark(Bitmap bitmap, float f2) {
        int i2 = 2 % 2;
        if (RecogKitUtils.isFullRecogKitAvailable()) {
            this.f11269i = -1.0f;
            try {
                this.f11269i = ImageProcessingKit.getCenterBrightnessLevel(bitmap);
                this.f11268h.onBrightnessValueUpdate(this.f11269i, f2);
            } catch (ImageProcessingKitInvalidInputException | ImageProcessingKitProcessException e2) {
                Timber.e(e2);
            }
            if (this.f11269i < f2) {
                int i3 = A + 61;
                D = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = A + 7;
            D = i5 % 128;
            int i6 = i5 % 2;
        }
        return false;
    }

    public boolean faceHasClosedEyes(FaceAttributes faceAttributes, FaceProcessingUtils.FaceLandmarksState faceLandmarksState) {
        int i2 = 2 % 2;
        int i3 = A + 81;
        D = i3 % 128;
        int i4 = i3 % 2;
        if (!RecogKitUtils.isFullRecogKitAvailable()) {
            int i5 = A + 5;
            D = i5 % 128;
            int i6 = i5 % 2;
            if (faceLandmarksState.eyesOpen()) {
                int i7 = D + 67;
                A = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = A + 55;
            D = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        if (!faceAttributes.closedEyes) {
            int i11 = D + 45;
            A = i11 % 128;
            int i12 = i11 % 2;
            if (!(!faceLandmarksState.eyesOpen())) {
                return false;
            }
        }
        return true;
    }

    public boolean faceHasHeadCover(FaceAttributes faceAttributes) {
        int i2 = 2 % 2;
        int i3 = D + 23;
        A = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            RecogKitUtils.isFullRecogKitAvailable();
            obj.hashCode();
            throw null;
        }
        if (!RecogKitUtils.isFullRecogKitAvailable()) {
            int i4 = D;
            int i5 = i4 + 83;
            A = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 115;
            A = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        return faceAttributes.headwear;
    }

    public boolean faceHasLenses(FaceAttributes faceAttributes) {
        int i2 = 2 % 2;
        int i3 = D + 17;
        A = i3 % 128;
        int i4 = i3 % 2;
        if (RecogKitUtils.isFullRecogKitAvailable()) {
            return faceAttributes.eyeglasses;
        }
        int i5 = D;
        int i6 = i5 + 105;
        A = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 71;
        A = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public boolean faceHasMask(FaceAttributes faceAttributes) {
        int i2 = 2 % 2;
        int i3 = A + 99;
        D = i3 % 128;
        int i4 = i3 % 2;
        if (RecogKitUtils.isFullRecogKitAvailable()) {
            return faceAttributes.mask;
        }
        int i5 = A + 71;
        D = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public FaceAttributes detectFaceAttributes(RecogManager recogManager, Bitmap bitmap, FaceProcessingUtils.FaceLandmarksState faceLandmarksState) {
        int i2 = 2 % 2;
        int i3 = D + 65;
        A = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (RecogKitUtils.isFullRecogKitAvailable()) {
                try {
                    FaceAttributes faceAttributesDetectAttributes = recogManager.getFaceAttributesDetectorKit().detectAttributes(bitmap, faceLandmarksState.rightEye.x, faceLandmarksState.rightEye.y, faceLandmarksState.leftEye.x, faceLandmarksState.leftEye.y);
                    int i4 = A + 97;
                    D = i4 % 128;
                    if (i4 % 2 != 0) {
                        return faceAttributesDetectAttributes;
                    }
                    throw null;
                } catch (Exception e2) {
                    Timber.e(e2);
                    return null;
                }
            }
            int i5 = D + 69;
            A = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        RecogKitUtils.isFullRecogKitAvailable();
        throw null;
    }

    public QualityResult estimateFaceQuality(SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid, Bitmap bitmap, FaceProcessingUtils.FaceLandmarksState faceLandmarksState) {
        int i2 = 2 % 2;
        if (RecogKitUtils.isFullRecogKitAvailable()) {
            try {
                QualityResult qualityResultEstimateFaceQuality = selfieFaceQualityKitAndroid.estimateFaceQuality(bitmap, faceLandmarksState.rightEye.x, faceLandmarksState.rightEye.y, faceLandmarksState.leftEye.x, faceLandmarksState.leftEye.y, faceLandmarksState.noseTip.x, faceLandmarksState.noseTip.y, faceLandmarksState.rightMouth.x, faceLandmarksState.rightMouth.y, faceLandmarksState.leftMouth.x, faceLandmarksState.leftMouth.y);
                int i3 = A + 61;
                D = i3 % 128;
                if (i3 % 2 != 0) {
                    return qualityResultEstimateFaceQuality;
                }
                throw null;
            } catch (Exception e2) {
                Timber.e(e2);
                return null;
            }
        }
        int i4 = A + 91;
        D = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private void c() {
        int i2 = 2 % 2;
        if (!Build.MODEL.contains("SM-A135")) {
            int i3 = D + 41;
            A = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
                if (!Build.MODEL.contains("ZTE Blade A5")) {
                    return;
                }
            } else if (!Build.MODEL.contains("ZTE Blade A5")) {
                return;
            }
        }
        this.C = 1250;
        int i5 = A + 115;
        D = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public Single<Integer> getIdealCaptureEnvironmentTestSingle() {
        int i2 = 2 % 2;
        int i3 = D + 21;
        A = i3 % 128;
        int i4 = i3 % 2;
        Single<Integer> singleDoFinally = this.f11268h.startIdealCaptureEnvironmentTest().delay(this.C, TimeUnit.MILLISECONDS, Schedulers.computation()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((Integer) obj);
            }
        }).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f$0.handleIdealCaptureEnvironmentTestResult(((Integer) obj).intValue());
            }
        }).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.a();
            }
        });
        int i5 = A + 115;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return singleDoFinally;
    }

    public /* synthetic */ SingleSource d(Integer num) throws Exception {
        int i2 = 2 % 2;
        int i3 = A + 15;
        D = i3 % 128;
        int i4 = i3 % 2;
        Single<Integer> singleEvaluateFrameForIdealCaptureEnvironmentTestSingle = this.f11268h.evaluateFrameForIdealCaptureEnvironmentTestSingle(num.intValue());
        int i5 = this.C;
        if (i4 != 0) {
            return singleEvaluateFrameForIdealCaptureEnvironmentTestSingle.delay(i5, TimeUnit.MILLISECONDS, Schedulers.computation()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((Integer) obj);
                }
            });
        }
        singleEvaluateFrameForIdealCaptureEnvironmentTestSingle.delay(i5, TimeUnit.MILLISECONDS, Schedulers.computation()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((Integer) obj);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ SingleSource b(Integer num) throws Exception {
        int i2 = 2 % 2;
        if (num.intValue() != -2 && num.intValue() != -3 && num.intValue() != -1) {
            this.f11267g.f9965b = Status.PASS;
            return Single.just(num);
        }
        if (num.intValue() == -2) {
            int i3 = D + 61;
            A = i3 % 128;
            if (i3 % 2 != 0) {
                this.f11267g.f9965b = Status.FAIL;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.f11267g.f9965b = Status.FAIL;
            int i4 = A + 125;
            D = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.f11267g.f9965b = Status.UNCLEAR;
        }
        return this.f11268h.evaluateFrameForIdealCaptureEnvironmentTestFallbackSingle();
    }

    public /* synthetic */ void a() throws Exception {
        int i2 = 2 % 2;
        int i3 = A + 11;
        D = i3 % 128;
        int i4 = i3 % 2;
        setIdealCaptureEnvironmentTestInProgress(false);
        int i5 = D + 19;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void handleIdealCaptureEnvironmentTestResult(int r4) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPresenter.D
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPresenter.A = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L29
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r1 = r0.isCaptureOnlyMode()
            r0 = 14
            int r0 = r0 / 0
            if (r1 == 0) goto L1f
        L1c:
            r3.saveUnsafeEnvironmentResult(r4)
        L1f:
            r0 = 3
            if (r4 != r0) goto L34
            com.incode.welcome_sdk.data.remote.beans.s$b r1 = r3.f11267g
            com.incode.welcome_sdk.results.Status r0 = com.incode.welcome_sdk.results.Status.FAIL
            r1.f9970j = r0
            return
        L29:
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r0 = r0.isCaptureOnlyMode()
            if (r0 == 0) goto L1f
            goto L1c
        L34:
            r0 = 1
            if (r4 != r0) goto L56
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPresenter.D
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPresenter.A = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.data.remote.beans.s$b r1 = r3.f11267g
            com.incode.welcome_sdk.results.Status r0 = com.incode.welcome_sdk.results.Status.PASS
            r1.f9970j = r0
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPresenter.D
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPresenter.A = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L55
            r0 = 73
            int r0 = r0 / 0
        L55:
            return
        L56:
            r0 = 4
            if (r4 == r0) goto L5b
            if (r4 != r2) goto L61
        L5b:
            com.incode.welcome_sdk.data.remote.beans.s$b r1 = r3.f11267g
            com.incode.welcome_sdk.results.Status r0 = com.incode.welcome_sdk.results.Status.UNCLEAR
            r1.f9970j = r0
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraPresenter.handleIdealCaptureEnvironmentTestResult(int):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onIdealCaptureEnvironmentFound() {
        int i2 = 2 % 2;
        int i3 = D + 37;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void saveUnsafeEnvironmentResult(int i2) {
        int i3 = 2 % 2;
        int i4 = D + 87;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected IdealEnvironmentTestResult getIdealCaptureEnvironmentTestResultToRetry() {
        int i2 = 2 % 2;
        int i3 = D + 21;
        int i4 = i3 % 128;
        A = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IdealEnvironmentTestResult idealEnvironmentTestResult = this.B;
        int i5 = i4 + 67;
        D = i5 % 128;
        int i6 = i5 % 2;
        return idealEnvironmentTestResult;
    }

    protected void setIdealCaptureEnvironmentTestResultToRetry(IdealEnvironmentTestResult idealEnvironmentTestResult) {
        int i2 = 2 % 2;
        int i3 = A + 19;
        int i4 = i3 % 128;
        D = i4;
        int i5 = i3 % 2;
        this.B = idealEnvironmentTestResult;
        int i6 = i4 + 39;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
        }
    }

    public Observable<ResponseSuccess> sendZoomedFrame(String str, Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = A + 53;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            IncodeWelcome.getInstance().isCaptureOnlyMode();
            throw null;
        }
        if (!IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            int i4 = D + 21;
            A = i4 % 128;
            int i5 = i4 % 2;
            if (!IncodeWelcome.getInstance().isDelayedMode()) {
                int i6 = D + 67;
                A = i6 % 128;
                int i7 = i6 % 2;
                if (bitmap != null) {
                    return getRepository().sendZoomedFrame(str, BitmapUtils.getBase64FromBitmap(bitmap)).subscribeOn(Schedulers.io()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda2
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return Observable.just((ResponseSuccess) obj);
                        }
                    }).doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPresenter$$ExternalSyntheticLambda3
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            Timber.e((Throwable) obj);
                        }
                    });
                }
            }
        }
        Observable<ResponseSuccess> observableJust = Observable.just(new ResponseSuccess(false));
        int i8 = D + 91;
        A = i8 % 128;
        int i9 = i8 % 2;
        return observableJust;
    }

    public Status getMotionStatus() {
        int i2 = 2 % 2;
        if (this.f11286z == null) {
            int i3 = D + 1;
            A = i3 % 128;
            if (i3 % 2 != 0) {
                this.f11286z = IncodeWelcome.getInstance().getDeviceStats().getMotionStatus();
                throw null;
            }
            this.f11286z = IncodeWelcome.getInstance().getDeviceStats().getMotionStatus();
        }
        Status status = this.f11286z;
        int i4 = D + 47;
        A = i4 % 128;
        int i5 = i4 % 2;
        return status;
    }

    private void d() {
        int iO = d.a.o();
        int iO2 = d.a.o();
        int iO3 = d.a.o();
        c(iO, d.a.o(), iO3, new Object[]{this}, iO2, -29551056, 29551056);
    }

    private void b() {
        int iO = d.a.o();
        int iO2 = d.a.o();
        int iO3 = d.a.o();
        c(iO, d.a.o(), iO3, new Object[]{this}, iO2, 254336901, -254336900);
    }
}
