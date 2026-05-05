package com.incode.welcome_sdk.ui.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.utils.e;
import com.incode.welcome_sdk.data.remote.beans.FacialRecognitionResults;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.ui.camera.CameraActivity;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdealEnvironmentTestResult;
import com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper;
import com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.sentry.protocol.SentryStackFrame;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import timber.log.Timber;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CameraActivity extends RecordableActivity implements CameraContract.View {
    private static int L = 1;
    private static int M = 0;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private CompositeDisposable J;
    private float K;
    private OpenTokSessionWrapper N;

    /* JADX INFO: renamed from: b */
    public Camera f11176b;

    /* JADX INFO: renamed from: c */
    public int f11177c;

    /* JADX INFO: renamed from: d */
    public CameraPreview f11178d;

    /* JADX INFO: renamed from: f */
    @Inject
    protected VideoStreamingManager f11180f;

    /* JADX INFO: renamed from: g */
    public int f11181g;

    /* JADX INFO: renamed from: i */
    private CameraPresenter f11183i;

    /* JADX INFO: renamed from: j */
    private Executor f11184j;

    /* JADX INFO: renamed from: k */
    private int f11185k;

    /* JADX INFO: renamed from: l */
    private ImageView f11186l;

    /* JADX INFO: renamed from: m */
    private Scheduler f11187m;

    /* JADX INFO: renamed from: n */
    private ViewGroup f11188n;

    /* JADX INFO: renamed from: o */
    private MovementDetector f11189o;

    /* JADX INFO: renamed from: p */
    private CameraPreviewType f11190p;

    /* JADX INFO: renamed from: q */
    private int f11191q;

    /* JADX INFO: renamed from: r */
    private int f11192r;

    /* JADX INFO: renamed from: s */
    private int f11193s;

    /* JADX INFO: renamed from: t */
    private int f11194t;

    /* JADX INFO: renamed from: u */
    private Runnable f11195u;

    /* JADX INFO: renamed from: v */
    private int f11196v;

    /* JADX INFO: renamed from: w */
    private String f11197w;

    /* JADX INFO: renamed from: x */
    private String f11198x;

    /* JADX INFO: renamed from: y */
    private int f11199y;

    /* JADX INFO: renamed from: z */
    private boolean f11200z;

    /* JADX INFO: renamed from: e */
    public int f11179e = -1;

    /* JADX INFO: renamed from: h */
    private boolean f11182h = false;

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i2;
        int i9 = i8 | i4;
        int i10 = (~i9) | (~(i8 | i3));
        int i11 = (~((~i3) | i8 | (~i4))) | (~(i2 | i4));
        int i12 = i2 + i4 + i7 + ((-540997959) * i5) + (162607451 * i6);
        int i13 = i12 * i12;
        int i14 = ((-612843245) * i2) + 1723858944 + (1667710703 * i4) + (i10 * (-1007206674)) + (1007206674 * i9) + ((-1007206674) * i11) + ((-1620049920) * i7) + ((-672137216) * i5) + (483393536 * i6) + (377683968 * i13);
        int i15 = (i2 * 228155117) + 240245784 + (i4 * 228155665) + (i10 * 274) + (i9 * (-274)) + (i11 * 274) + (i7 * 228155391) + (i5 * (-329950905)) + (i6 * (-2026639707)) + (i13 * 159186944);
        int i16 = i14 + (i15 * i15 * (-1451425792));
        if (i16 == 1) {
            return b(objArr);
        }
        if (i16 == 2) {
            return e(objArr);
        }
        if (i16 == 3) {
            return c(objArr);
        }
        if (i16 == 4) {
            return a(objArr);
        }
        if (i16 != 5) {
            return d(objArr);
        }
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        OpenTokSessionWrapper openTokSessionWrapper = (OpenTokSessionWrapper) objArr[1];
        SingleEmitter singleEmitter = (SingleEmitter) objArr[2];
        int i17 = 2 % 2;
        if (openTokSessionWrapper.getSession() != null) {
            int i18 = M + 23;
            L = i18 % 128;
            if (i18 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                objArr2[1] = openTokSessionWrapper.getSession().getSessionId();
                Timber.d("OpenTok session %s is ready", objArr2);
            } else {
                Timber.d("OpenTok session %s is ready", openTokSessionWrapper.getSession().getSessionId());
            }
            cameraActivity.N = openTokSessionWrapper;
            singleEmitter.onSuccess(OpenTokSessionInitResult.JUST_INITIALIZED);
        } else {
            Timber.e("OpenTok session is null", new Object[0]);
            singleEmitter.onSuccess(OpenTokSessionInitResult.NOT_INITIALIZED);
            int i19 = M + 17;
            L = i19 % 128;
            int i20 = i19 % 2;
        }
        return null;
    }

    protected abstract CameraPreviewType getCameraType();

    protected abstract void handlePermissionDenied(Exception exc);

    protected abstract void setContentView();

    public CameraActivity() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f11184j = executorServiceNewSingleThreadExecutor;
        this.f11187m = Schedulers.from(executorServiceNewSingleThreadExecutor);
        this.f11185k = 0;
        this.f11194t = 0;
        this.f11192r = 0;
        this.f11191q = 0;
        this.f11193s = 0;
        this.f11199y = 0;
        this.f11196v = 0;
        this.f11195u = null;
        this.f11198x = "android.permission.CAMERA";
        this.f11197w = "android.permission.RECORD_AUDIO";
        this.f11177c = 720;
        this.f11181g = 1280;
        this.C = false;
        this.f11200z = false;
        this.F = 1920;
        this.E = PhotoshopDirectory.TAG_COUNT_INFORMATION;
        this.G = true;
        this.I = false;
        this.H = false;
        this.J = new CompositeDisposable();
        this.N = null;
        this.K = 1.0f;
    }

    protected enum OpenTokSessionInitResult {
        JUST_INITIALIZED,
        ALREADY_INITIALIZED,
        NOT_INITIALIZED;


        /* JADX INFO: renamed from: e */
        private static int f11205e = 0;

        /* JADX INFO: renamed from: f */
        private static int f11206f = 0;

        /* JADX INFO: renamed from: g */
        private static int f11207g = 1;

        /* JADX INFO: renamed from: i */
        private static int f11208i = 1;

        public static OpenTokSessionInitResult valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f11205e + 71;
            f11208i = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            OpenTokSessionInitResult openTokSessionInitResult = (OpenTokSessionInitResult) Enum.valueOf(OpenTokSessionInitResult.class, str);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f11208i + 31;
            f11205e = i5 % 128;
            if (i5 % 2 == 0) {
                return openTokSessionInitResult;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static OpenTokSessionInitResult[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f11205e + 47;
            f11208i = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            OpenTokSessionInitResult[] openTokSessionInitResultArr = (OpenTokSessionInitResult[]) values().clone();
            int i4 = f11205e + 121;
            f11208i = i4 % 128;
            int i5 = i4 % 2;
            return openTokSessionInitResultArr;
        }

        static {
            int i2 = f11207g + 81;
            f11206f = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void safeOnCreate(Bundle bundle, CameraPresenter cameraPresenter) {
        int i2 = 2 % 2;
        int i3 = M + 65;
        L = i3 % 128;
        int i4 = i3 % 2;
        this.f11183i = cameraPresenter;
        super.safeOnCreate(bundle);
        setContentView();
        this.f11190p = getCameraType();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.camera_preview);
        this.f11188n = viewGroup;
        if (viewGroup == null) {
            throw new RuntimeException("Activity layout must contain ViewGroup with an id 'camera_preview'");
        }
        this.f11189o = IncodeWelcome.getInstance().getMovementDetector();
        getWindow().addFlags(128);
        int i5 = L + 39;
        M = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    protected void disableCamera() {
        int i2 = 2 % 2;
        int i3 = M + 43;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        this.f11182h = true;
        int i6 = i4 + 1;
        M = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2d
            super.onResume()
            com.incode.welcome_sdk.ui.camera.MovementDetector r1 = r3.f11189o
            r0 = 40
            int r0 = r0 / 0
            if (r1 == 0) goto L27
        L19:
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.camera.MovementDetector r0 = r3.f11189o
            r0.start()
        L27:
            com.incode.welcome_sdk.ui.camera.CameraPresenter r0 = r3.f11183i
            r0.onResume()
            return
        L2d:
            super.onResume()
            com.incode.welcome_sdk.ui.camera.MovementDetector r0 = r3.f11189o
            if (r0 == 0) goto L27
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        int i2 = 2 % 2;
        int i3 = M + 55;
        L = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        checkCameraAndAudioPermissions();
        int i5 = L + 61;
        M = i5 % 128;
        int i6 = i5 % 2;
    }

    protected void checkCameraAndAudioPermissions() {
        int i2 = 2 % 2;
        int i3 = M + 111;
        L = i3 % 128;
        int i4 = i3 % 2;
        if (isCameraPermissionGranted()) {
            if (IncodeWelcome.getInstance().getInternalConfig().isRecordSession()) {
                startSessionScreenRecording();
            }
            if (this.H) {
                int i5 = L + 85;
                M = i5 % 128;
                int i6 = i5 % 2;
                if (!isAudioPermissionGranted()) {
                    int i7 = M + 109;
                    L = i7 % 128;
                    if (i7 % 2 == 0) {
                        d();
                        int i8 = 16 / 0;
                        return;
                    } else {
                        d();
                        return;
                    }
                }
            }
            if (!this.D) {
                onCameraPermissionGranted();
            }
            onReadyToCreateCamera();
            return;
        }
        requestCameraPermission();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onReadyToCreateCamera() {
        int i2 = 2 % 2;
        int i3 = L + 87;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11183i.createCameraSourceAndFaceProcessor(getCameraFacing());
            int i4 = 42 / 0;
        } else {
            this.f11183i.createCameraSourceAndFaceProcessor(getCameraFacing());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = L + 79;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            super.onSaveInstanceState(bundle);
            z2 = false;
        } else {
            super.onSaveInstanceState(bundle);
            z2 = true;
        }
        this.B = z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = L;
        int i4 = i3 + 17;
        M = i4 % 128;
        if (i4 % 2 != 0) {
            this.A = false;
            this.D = false;
        } else {
            this.A = false;
            this.D = true;
        }
        int i5 = i3 + 51;
        M = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = M + 7;
        L = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CameraPreview cameraPreview = this.f11178d;
        if (cameraPreview != null) {
            this.K = cameraPreview.getCameraScale();
        }
        MovementDetector movementDetector = this.f11189o;
        if (movementDetector != null) {
            int i4 = L + 101;
            M = i4 % 128;
            if (i4 % 2 != 0) {
                movementDetector.stop();
                throw null;
            }
            movementDetector.stop();
            int i5 = L + 125;
            M = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f11183i.onPause();
        super.onPause();
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i2 = 2 % 2;
        int i3 = L + 37;
        M = i3 % 128;
        int i4 = i3 % 2;
        if (this.f11188n.getChildCount() > 0) {
            this.f11188n.removeViewAt(0);
            int i5 = M + 123;
            L = i5 % 128;
            int i6 = i5 % 2;
        }
        super.onStop();
        int i7 = L + 109;
        M = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 60 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = M + 101;
        L = i3 % 128;
        if (i3 % 2 != 0) {
            this.J.clear();
            this.f11183i.onDestroy();
            super.safeOnDestroy();
        } else {
            this.J.clear();
            this.f11183i.onDestroy();
            super.safeOnDestroy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    protected void onResumeFragments() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = L + 59;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            super.onResumeFragments();
            if (this.A) {
                int i4 = L + 21;
                M = i4 % 128;
                if (i4 % 2 != 0) {
                    b();
                    z2 = true;
                } else {
                    b();
                    z2 = false;
                }
                this.A = z2;
                int i5 = M + 29;
                L = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        super.onResumeFragments();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public boolean isCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = L + 27;
        M = i3 % 128;
        int i4 = i3 % 2;
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            return false;
        }
        int i5 = L + 21;
        M = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void requestCameraPermission() {
        int i2 = 2 % 2;
        int i3 = L + 23;
        M = i3 % 128;
        int i4 = i3 % 2;
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 1001);
        int i5 = M + 65;
        L = i5 % 128;
        int i6 = i5 % 2;
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = L + 113;
        M = i3 % 128;
        int i4 = i3 % 2;
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1003);
        int i5 = L + 65;
        M = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.RecordableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int i3 = 2 % 2;
        int i4 = M + 95;
        L = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
            if (i2 == 1001) {
                if (isCameraPermissionGranted()) {
                    int i5 = M + 41;
                    L = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (this.H && !isAudioPermissionGranted()) {
                            d();
                            return;
                        } else {
                            e();
                            return;
                        }
                    }
                    throw null;
                }
                prepareCameraPermissionsMandatoryDialog();
                return;
            }
            if (i2 == 1003) {
                if (this.H) {
                    int i6 = L + 115;
                    M = i6 % 128;
                    int i7 = i6 % 2;
                    if (!isAudioPermissionGranted()) {
                        int i8 = M + 71;
                        L = i8 % 128;
                        int i9 = i8 % 2;
                        showAudioPermissionsMandatory();
                        return;
                    }
                }
                e();
                return;
            }
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
        obj.hashCode();
        throw null;
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = L + 79;
        M = i3 % 128;
        int i4 = i3 % 2;
        if (IncodeWelcome.getInstance().getInternalConfig().isRecordSession()) {
            startSessionScreenRecording();
            int i5 = L + 35;
            M = i5 % 128;
            int i6 = i5 % 2;
        }
        onCameraPermissionGranted();
        onReadyToCreateCamera();
    }

    protected void prepareCameraPermissionsMandatoryDialog() {
        int i2 = 2 % 2;
        if (!isFinishing()) {
            int i3 = M;
            int i4 = i3 + 21;
            L = i4 % 128;
            int i5 = i4 % 2;
            if (!this.B) {
                int i6 = i3 + 55;
                L = i6 % 128;
                int i7 = i6 % 2;
                b();
                return;
            }
        }
        this.A = true;
        int i8 = L + 23;
        M = i8 % 128;
        int i9 = i8 % 2;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = L + 25;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_camera_permission_image, R.string.onboard_sdk_dialog_camera_permissions_mandatory_title, R.string.onboard_sdk_dialog_camera_permissions_mandatory_subtitle, "android.permission.CAMERA", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        } else {
            PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_camera_permission_image, R.string.onboard_sdk_dialog_camera_permissions_mandatory_title, R.string.onboard_sdk_dialog_camera_permissions_mandatory_subtitle, "android.permission.CAMERA", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
            int i4 = 52 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        Object obj = null;
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
        int i3 = L + 85;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected int getDesiredCameraZoom() {
        int i2 = 2 % 2;
        int i3 = L;
        int i4 = i3 + 125;
        M = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 25;
        M = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return 100;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0014, code lost:
    
        if (r4.f11182h != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        r1 = r2 + 53;
        com.incode.welcome_sdk.ui.camera.CameraActivity.M = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001d, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        if (r4.f11182h != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0027, code lost:
    
        c(r5);
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void createCameraSource(int r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r2 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r2 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L20
            boolean r1 = r4.f11182h
            r0 = 93
            int r0 = r0 / 0
            if (r1 == 0) goto L27
        L16:
            int r1 = r2 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L25
            return
        L20:
            boolean r0 = r4.f11182h
            if (r0 == 0) goto L27
            goto L16
        L25:
            r0 = 0
            throw r0
        L27:
            r4.c(r5)
            r4.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.createCameraSource(int):void");
    }

    protected Completable connectCameraPreviewWithOpenTok(OpenTokSessionInitResult openTokSessionInitResult) {
        PublisherWrapper publisherWrapper;
        int i2 = 2 % 2;
        if (openTokSessionInitResult != OpenTokSessionInitResult.JUST_INITIALIZED) {
            publisherWrapper = null;
            if (openTokSessionInitResult != OpenTokSessionInitResult.ALREADY_INITIALIZED) {
                Timber.w("OpenTok not initialized.", new Object[0]);
            } else {
                int i3 = M + 73;
                L = i3 % 128;
                if (i3 % 2 != 0) {
                    publisherWrapper = this.N.getPublisherWrapper();
                    if (publisherWrapper != null) {
                        this.f11178d.setVideoCapturer((MirrorVideoCapturer) publisherWrapper.getPublisher().getCapturer());
                        int i4 = L + 105;
                        M = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } else {
                    this.N.getPublisherWrapper();
                    throw null;
                }
            }
        } else {
            int i6 = L + 15;
            M = i6 % 128;
            if (i6 % 2 != 0) {
                MirrorVideoCapturer mirrorVideoCapturerA = a();
                this.f11178d.setVideoCapturer(mirrorVideoCapturerA);
                publisherWrapper = d(mirrorVideoCapturerA);
                this.N.publishToStream(publisherWrapper);
                int i7 = 43 / 0;
            } else {
                MirrorVideoCapturer mirrorVideoCapturerA2 = a();
                this.f11178d.setVideoCapturer(mirrorVideoCapturerA2);
                publisherWrapper = d(mirrorVideoCapturerA2);
                this.N.publishToStream(publisherWrapper);
            }
            int i8 = L + 99;
            M = i8 % 128;
            int i9 = i8 % 2;
        }
        if (publisherWrapper == null) {
            return Completable.complete();
        }
        return publisherWrapper.getStartStreamApiCalledCompletable().timeout(10000L, TimeUnit.MILLISECONDS).onErrorComplete();
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = M + 125;
        L = i3 % 128;
        int i4 = i3 % 2;
        if (this.f11190p.equals(CameraPreviewType.FIXED_WIDTH)) {
            this.f11178d = new FixedWidthCameraPreview(this, this.f11183i, this.f11176b, this.f11187m, this.f11179e, this.f11185k, getDesiredCameraZoom(), this.f11177c, this.f11181g, false, this.F, this.E, this.G);
        } else {
            this.f11178d = new CameraPreview(this, this.f11183i, this.f11176b, this.f11187m, this.f11179e, this.f11185k, getDesiredCameraZoom(), this.f11177c, this.f11181g, this.f11200z, this.F, this.E, this.G);
        }
        float f2 = this.K;
        if (f2 != 1.0f) {
            this.f11178d.setCameraScale(f2);
        }
        if (this.f11188n.getChildCount() > 0 && (this.f11188n.getChildAt(0) instanceof CameraPreview)) {
            int i5 = M + 95;
            L = i5 % 128;
            int i6 = i5 % 2;
            this.f11188n.removeViewAt(0);
            int i7 = M + 33;
            L = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f11188n.addView(this.f11178d, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    private void c(int i2) {
        int i3 = 2 % 2;
        try {
            Camera cameraAcquireCamera = CameraManager.f11257d.acquireCamera(i2);
            int i4 = M + 61;
            L = i4 % 128;
            int i5 = i4 % 2;
            Camera.Parameters parametersA = e.a(cameraAcquireCamera);
            if (parametersA != null) {
                int i6 = L + 49;
                M = i6 % 128;
                if (i6 % 2 != 0) {
                    parametersA.setRotation(f());
                    a(i2, parametersA);
                    e.d(cameraAcquireCamera, parametersA);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                parametersA.setRotation(f());
                a(i2, parametersA);
                if (!e.d(cameraAcquireCamera, parametersA)) {
                    int i7 = L + 71;
                    M = i7 % 128;
                    int i8 = i7 % 2;
                    Timber.w("Cannot setCameraParameters() in instantiateCameraSource()!", new Object[0]);
                    int i9 = M + 49;
                    L = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            Point desiredPreviewSize = this.f11183i.getDesiredPreviewSize(this.C);
            this.f11177c = desiredPreviewSize.x;
            this.f11181g = desiredPreviewSize.y;
            cameraAcquireCamera.enableShutterSound(false);
            this.f11179e = i2;
            this.f11176b = cameraAcquireCamera;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't create camera source", new Object[0]);
            this.f11183i.error(e2);
        }
    }

    protected Single<OpenTokSessionInitResult> waitForOpenTokConnection() {
        int i2 = 2 % 2;
        int i3 = L + 21;
        M = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda7
                @Override // io.reactivex.SingleOnSubscribe
                public final void subscribe(SingleEmitter singleEmitter) throws Exception {
                    this.f$0.d(singleEmitter);
                }
            });
            obj.hashCode();
            throw null;
        }
        Single<OpenTokSessionInitResult> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda7
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) throws Exception {
                this.f$0.d(singleEmitter);
            }
        });
        int i4 = L + 65;
        M = i4 % 128;
        if (i4 % 2 == 0) {
            return singleCreate;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void a(OpenTokSessionWrapper openTokSessionWrapper, SingleEmitter singleEmitter, Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = M + 39;
        L = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Error while waiting for session to connect for module: %s", openTokSessionWrapper.getModule());
        singleEmitter.onSuccess(OpenTokSessionInitResult.NOT_INITIALIZED);
        int i5 = M + 87;
        L = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0018, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        r7.onSuccess(com.incode.welcome_sdk.ui.camera.CameraActivity.OpenTokSessionInitResult.NOT_INITIALIZED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002b, code lost:
    
        if (r6.N != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        timber.log.Timber.d("Current stream frames module: %s", r2);
        r5 = r6.f11180f.getOpenTokSession(r2);
        r6.J.add(r5.getSessionConnectedCompletable().timeout(10000, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda15(r6, r5, r7), new com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda16(r5, r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r7.onSuccess(com.incode.welcome_sdk.ui.camera.CameraActivity.OpenTokSessionInitResult.ALREADY_INITIALIZED);
        r1 = com.incode.welcome_sdk.ui.camera.CameraActivity.M + 71;
        com.incode.welcome_sdk.ui.camera.CameraActivity.L = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(final io.reactivex.SingleEmitter r7) throws java.lang.Exception {
        /*
            r6 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L20
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            com.incode.welcome_sdk.data.b r2 = r0.currentStreamFramesModule
            r0 = 87
            int r0 = r0 / 0
            if (r2 != 0) goto L29
        L1a:
            com.incode.welcome_sdk.ui.camera.CameraActivity$OpenTokSessionInitResult r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.OpenTokSessionInitResult.NOT_INITIALIZED
            r7.onSuccess(r0)
            return
        L20:
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            com.incode.welcome_sdk.data.b r2 = r0.currentStreamFramesModule
            if (r2 != 0) goto L29
            goto L1a
        L29:
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper r0 = r6.N
            if (r0 != 0) goto L5c
            java.lang.String r1 = "Current stream frames module: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            timber.log.Timber.d(r1, r0)
            com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager r0 = r6.f11180f
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper r5 = r0.getOpenTokSession(r2)
            io.reactivex.disposables.CompositeDisposable r4 = r6.J
            io.reactivex.Completable r3 = r5.getSessionConnectedCompletable()
            r1 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Completable r2 = r3.timeout(r1, r0)
            com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda15 r1 = new com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda15
            r1.<init>()
            com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda16 r0 = new com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda16
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r4.add(r0)
            return
        L5c:
            com.incode.welcome_sdk.ui.camera.CameraActivity$OpenTokSessionInitResult r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.OpenTokSessionInitResult.ALREADY_INITIALIZED
            r7.onSuccess(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.M
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.L = r0
            int r1 = r1 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.d(io.reactivex.SingleEmitter):void");
    }

    protected boolean isStreamingEnabled() {
        int i2 = 2 % 2;
        int i3 = M + 11;
        L = i3 % 128;
        int i4 = i3 % 2;
        if (IncodeWelcome.getInstance().currentStreamFramesModule == null) {
            return false;
        }
        int i5 = M + 9;
        L = i5 % 128;
        return i5 % 2 != 0;
    }

    private MirrorVideoCapturer a() {
        int i2 = 2 % 2;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f11179e, cameraInfo);
        MirrorVideoCapturer mirrorVideoCapturerCreateCapturer = this.f11180f.createCapturer(defaultDisplay, this.f11178d.f11295f, cameraInfo);
        int i3 = L + 25;
        M = i3 % 128;
        int i4 = i3 % 2;
        return mirrorVideoCapturerCreateCapturer;
    }

    private PublisherWrapper d(MirrorVideoCapturer mirrorVideoCapturer) {
        int i2 = 2 % 2;
        int i3 = M + 39;
        L = i3 % 128;
        int i4 = i3 % 2;
        PublisherWrapper publisherWrapperCreatePublisher = this.f11180f.createPublisher(this.N, mirrorVideoCapturer, this.H);
        int i5 = M + 109;
        L = i5 % 128;
        int i6 = i5 % 2;
        return publisherWrapperCreatePublisher;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 float) = (r2v0 float), (r2v4 float) binds: [B:31:0x0050, B:23:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053 A[PHI: r2
  0x0053: PHI (r2v1 float) = (r2v0 float), (r2v3 float), (r2v4 float) binds: [B:31:0x0050, B:25:0x0023, B:23:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r7, android.hardware.Camera.Parameters r8) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r5
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L4c
            float r2 = r8.getHorizontalViewAngle()
            if (r7 != 0) goto L53
        L16:
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r0 = r0 + 67
            int r1 = r0 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r1
            int r0 = r0 % r5
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L53
            int r1 = r1 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.L = r0
            int r1 = r1 % r5
        L2c:
            float r0 = r8.getHorizontalViewAngle()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "CameraP: cameraAngle: %s"
            timber.log.Timber.d(r0, r1)
            r6.onCameraAngleMeasured(r2, r4)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L55
            return
        L4c:
            float r2 = r8.getHorizontalViewAngle()
            if (r7 != r4) goto L53
            goto L16
        L53:
            r4 = r3
            goto L2c
        L55:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.a(int, android.hardware.Camera$Parameters):void");
    }

    public void onCameraAngleMeasured(float f2, boolean z2) {
        int i2 = 2 % 2;
        int i3 = L + 37;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            this.C = z2;
        } else {
            this.C = z2;
            throw null;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        Runnable runnable = (Runnable) objArr[1];
        int i2 = 2 % 2;
        int i3 = L + 21;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            runnable.run();
            cameraActivity.hideCameraReconfigurationUi();
            int i4 = 88 / 0;
            return null;
        }
        runnable.run();
        cameraActivity.hideCameraReconfigurationUi();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void c(boolean r4, int r5) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.M
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.L = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L26
            r0 = 98
            int r0 = r0 / 0
            if (r4 == 0) goto L17
        L14:
            r3.releaseCamera()
        L17:
            com.incode.welcome_sdk.ui.camera.CameraPresenter r0 = r3.f11183i
            r0.createCameraSourceAndFaceProcessor(r5)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r2
            return
        L26:
            if (r4 == 0) goto L17
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.c(boolean, int):void");
    }

    public /* synthetic */ void a(final boolean z2, final int i2) {
        int i3 = 2 % 2;
        int i4 = M + 31;
        L = i4 % 128;
        int i5 = i4 % 2;
        stopPreview(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(z2, i2);
            }
        });
        int i6 = M + 39;
        L = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void reconfigureCamera(final int r11, final java.lang.Runnable r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.reconfigureCamera(int, java.lang.Runnable):void");
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        Runnable runnable = (Runnable) objArr[1];
        int i2 = 2 % 2;
        int i3 = L + 125;
        M = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (cameraActivity.getCameraPreview() == null) {
                runnable.run();
                return null;
            }
            ImageView imageView = cameraActivity.f11186l;
            runnable.run();
            int i4 = L + 9;
            M = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        cameraActivity.getCameraPreview();
        throw null;
    }

    protected void showCameraReconfigurationUi(boolean z2) {
        int i2 = 2 % 2;
        int i3 = L + 107;
        M = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void hideCameraReconfigurationUi() {
        int i2 = 2 % 2;
        int i3 = L + 15;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraSourceCreated() {
        int i2 = 2 % 2;
        int i3 = M + 7;
        L = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = L + 91;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th, "Couldn't connect the camera preview with OpenTok", new Object[0]);
        } else {
            Timber.e(th, "Couldn't connect the camera preview with OpenTok", new Object[0]);
        }
        int i4 = L + 97;
        M = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewStarted() {
        int i2 = 2 % 2;
        int i3 = M + 5;
        L = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
        this.J.add(waitForOpenTokConnection().observeOn(AndroidSchedulers.mainThread()).flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.connectCameraPreviewWithOpenTok((CameraActivity.OpenTokSessionInitResult) obj);
            }
        }).subscribeOn(this.f11187m).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.onCameraStreamingStartedConditionally();
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CameraActivity.e((Throwable) obj);
            }
        }));
        int i5 = M + 47;
        L = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onCameraStreamingStartedConditionally() {
        int i2 = 2 % 2;
        int i3 = M + 25;
        L = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public CameraPreview getCameraPreview() {
        int i2 = 2 % 2;
        int i3 = M;
        int i4 = i3 + 23;
        L = i4 % 128;
        int i5 = i4 % 2;
        CameraPreview cameraPreview = this.f11178d;
        int i6 = i3 + 11;
        L = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return cameraPreview;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.M
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.L = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L49
            java.lang.Runnable r1 = r5.f11195u
            r0 = 96
            int r0 = r0 / 0
            if (r1 == 0) goto L3f
        L16:
            int r0 = r5.f11179e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.C
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = r5.f11177c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.f11181g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.String r0 = "reconfigureCamera done. id:%s isNarrow:%s width:%s height:%s"
            timber.log.Timber.d(r0, r1)
            java.lang.Runnable r0 = r5.f11195u
            r0.run()
            r0 = 0
            r5.f11195u = r0
        L3f:
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.M
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.L = r0
            int r1 = r1 % r4
            return
        L49:
            java.lang.Runnable r0 = r5.f11195u
            if (r0 == 0) goto L3f
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.i():void");
    }

    private int f() {
        int i2 = 2 % 2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i3 = 0;
        Camera.getCameraInfo(0, cameraInfo);
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                int i4 = L + 33;
                M = i4 % 128;
                int i5 = i4 % 2;
                i3 = 180;
            } else if (rotation == 3) {
                int i6 = M + 35;
                L = i6 % 128;
                int i7 = i6 % 2;
                i3 = 270;
            }
        }
        return ((cameraInfo.orientation - i3) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewLayoutChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = L + 11;
        M = i7 % 128;
        int i8 = i7 % 2;
        this.f11194t = i2;
        this.f11192r = i3;
        this.f11191q = i4;
        this.f11193s = i5;
        this.f11199y = (this.f11188n.getWidth() - i2) / 2;
        this.f11196v = (this.f11188n.getHeight() - i3) / 2;
        int i9 = M + 95;
        L = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewRawFrame(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = L + 7;
        M = i3 % 128;
        int i4 = i3 % 2;
        MovementDetector movementDetector = this.f11189o;
        if (movementDetector == null || !movementDetector.isDeviceStable()) {
            return;
        }
        this.f11183i.processPreviewRawFrame(bArr);
        int i5 = M + 51;
        L = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void o() throws Exception {
        int i2 = 2 % 2;
        Timber.v("stopping preview", new Object[0]);
        Camera camera = this.f11176b;
        if (camera != null) {
            int i3 = L + 77;
            M = i3 % 128;
            if (i3 % 2 != 0) {
                camera.stopPreview();
                this.f11176b.setPreviewCallback(null);
                int i4 = 55 / 0;
            } else {
                camera.stopPreview();
                this.f11176b.setPreviewCallback(null);
            }
            int i5 = M + 113;
            L = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ void d(Runnable runnable) throws Exception {
        int i2 = 2 % 2;
        int i3 = L + 121;
        M = i3 % 128;
        int i4 = i3 % 2;
        runnable.run();
        int i5 = L + 1;
        M = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void d(Runnable runnable, Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = M + 11;
        L = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th, "Couldn't stop preview", new Object[1]);
        } else {
            Timber.e(th, "Couldn't stop preview", new Object[0]);
        }
        runnable.run();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopPreview(final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = L + 1;
        M = i3 % 128;
        int i4 = i3 % 2;
        Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.o();
            }
        }).subscribeOn(this.f11187m).observeOn(this.f11187m).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                CameraActivity.d(runnable);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CameraActivity.d(runnable, (Throwable) obj);
            }
        });
        int i5 = L + 3;
        M = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void releaseCamera() {
        int i2 = 2 % 2;
        Timber.v("releasing camera", new Object[0]);
        CameraPreview cameraPreview = this.f11178d;
        if (cameraPreview != null) {
            cameraPreview.notifyCameraReleased();
        }
        Camera camera = this.f11176b;
        if (camera != null) {
            int i3 = M + 43;
            L = i3 % 128;
            if (i3 % 2 == 0) {
                camera.stopPreview();
                this.f11176b.setPreviewCallback(null);
                CameraManager.f11257d.releaseCamera(this.f11176b);
                this.f11176b = null;
                int i4 = 69 / 0;
            } else {
                camera.stopPreview();
                this.f11176b.setPreviewCallback(null);
                CameraManager.f11257d.releaseCamera(this.f11176b);
                this.f11176b = null;
            }
            int i5 = M + 109;
            L = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onBrightnessValueUpdate(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = L + 87;
        M = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onBlurrinessUpdate(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = M + 89;
        L = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.d("Blur value: %s", Float.valueOf(f2));
        } else {
            Timber.d("Blur value: %s", Float.valueOf(f2));
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopVideoRecording() {
        int i2 = 2 % 2;
        int i3 = L + 93;
        M = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void restartVideoRecording() {
        int i2 = 2 % 2;
        int i3 = L + 57;
        M = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.RecordableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = L + 11;
        M = i5 % 128;
        if (i5 % 2 != 0) {
            super.onActivityResult(i2, i3, intent);
            if (i2 != 18044) {
                return;
            }
        } else {
            super.onActivityResult(i2, i3, intent);
            if (i2 != 1002) {
                return;
            }
        }
        if (i3 == -1) {
            IncodeWelcome.recordingPermissionData = new IncodeWelcome.RecordingPermissionData(intent, i3);
            checkCameraAndAudioPermissions();
            int i6 = M + 111;
            L = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        onVideoRecordingPermissionDenied();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onVideoRecordingPermissionDenied() {
        int i2 = 2 % 2;
        int i3 = M + 47;
        L = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        int i3 = L + 13;
        M = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!isChained()) {
                int i4 = L + 83;
                M = i4 % 128;
                if (i4 % 2 == 0) {
                    handlePermissionDenied(exc);
                } else {
                    handlePermissionDenied(exc);
                    throw null;
                }
            }
            finish();
            return;
        }
        isChained();
        obj.hashCode();
        throw null;
    }

    protected String getVideoRecordingFileName() {
        int i2 = 2 % 2;
        int i3 = L + 93;
        M = i3 % 128;
        if (i3 % 2 != 0) {
            getClass().getSimpleName();
            throw null;
        }
        String simpleName = getClass().getSimpleName();
        int i4 = M + 11;
        L = i4 % 128;
        int i5 = i4 % 2;
        return simpleName;
    }

    public void setUseHeightPaddingFactor(boolean z2) {
        int i2 = 2 % 2;
        int i3 = M + 69;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        this.f11200z = z2;
        int i6 = i4 + 95;
        M = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setMaxPictureSizeHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = M;
        int i5 = i4 + 17;
        L = i5 % 128;
        int i6 = i5 % 2;
        this.F = i2;
        int i7 = i4 + 89;
        L = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setMinPictureSizeHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = L + 59;
        M = i4 % 128;
        if (i4 % 2 == 0) {
            this.E = i2;
        } else {
            this.E = i2;
            throw null;
        }
    }

    public void setIgnorePictureSize(boolean z2) {
        int i2 = 2 % 2;
        int i3 = M + 71;
        int i4 = i3 % 128;
        L = i4;
        int i5 = i3 % 2;
        this.G = z2;
        int i6 = i4 + 13;
        M = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setStreamFramesEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = M;
        int i4 = i3 + 97;
        L = i4 % 128;
        int i5 = i4 % 2;
        this.I = z2;
        int i6 = i3 + 41;
        L = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setStreamAudioEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = M + 37;
        L = i3 % 128;
        if (i3 % 2 != 0) {
            this.H = z2;
        } else {
            this.H = z2;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006e A[PHI: r2
  0x006e: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:40:0x006b, B:37:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<java.lang.Integer> startIdealCaptureEnvironmentTest() {
        /*
            r5 = this;
            r2 = 2
            int r0 = r2 % r2
            com.incode.welcome_sdk.ui.camera.CameraPresenter r1 = r5.f11183i
            r0 = 1
            r1.setIdealCaptureEnvironmentTestInProgress(r0)
            android.hardware.Camera r0 = r5.f11176b
            android.hardware.Camera$Parameters r3 = com.incode.welcome_sdk.commons.utils.e.a(r0)
            if (r3 != 0) goto L29
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L27
            r4 = 78
        L1e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            io.reactivex.Single r0 = io.reactivex.Single.just(r0)
            return r0
        L27:
            r4 = -3
            goto L1e
        L29:
            boolean r0 = r3.isZoomSupported()
            if (r0 == 0) goto L70
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r2
            r4 = 4
            if (r1 == 0) goto L54
            int r2 = r3.getZoom()
            int r2 = r2 >>> r4
            int r0 = r3.getMaxZoom()
            int r1 = r0 >> 46
            com.incode.welcome_sdk.ui.camera.CameraPreview r0 = r5.f11178d
            r0.setCameraZoom(r3, r1)
            android.hardware.Camera r0 = r5.f11176b
            boolean r0 = com.incode.welcome_sdk.commons.utils.e.d(r0, r3)
            if (r0 != 0) goto L6e
            goto L1e
        L54:
            int r0 = r3.getZoom()
            int r2 = r0 * 100
            int r0 = r3.getMaxZoom()
            int r1 = r0 * 100
            com.incode.welcome_sdk.ui.camera.CameraPreview r0 = r5.f11178d
            r0.setCameraZoom(r3, r1)
            android.hardware.Camera r0 = r5.f11176b
            boolean r0 = com.incode.welcome_sdk.commons.utils.e.d(r0, r3)
            if (r0 != 0) goto L6e
            goto L1e
        L6e:
            r4 = r2
            goto L1e
        L70:
            r4 = -1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.startIdealCaptureEnvironmentTest():io.reactivex.Single");
    }

    public static /* synthetic */ void b(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = M + 11;
        L = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.d("Frame upload success", new Object[1]);
        } else {
            Timber.d("Frame upload success", new Object[0]);
        }
        int i4 = M + 33;
        L = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = L + 3;
        M = i3 % 128;
        int i4 = i3 % 2;
        Timber.e("Frame upload error", new Object[0]);
        int i5 = L + 123;
        M = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestSingle(int i2) {
        IdealEnvironmentTestResult idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest;
        int i3 = 2 % 2;
        int i4 = M + 71;
        L = i4 % 128;
        int i5 = i4 % 2;
        try {
            try {
                idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest = evaluateFrameForIdealCaptureEnvironmentTest(i2);
            } catch (NoConnectivityException e2) {
                e = e2;
                idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest = null;
            }
            try {
                this.f11183i.setIdealCaptureEnvironmentTestResultToRetry(idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest);
                this.J.add(this.f11183i.sendZoomedFrame(idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest.getSource(), idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest.getBitmap()).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda17
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        CameraActivity.b((ResponseSuccess) obj);
                    }
                }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda18
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        CameraActivity.a((Throwable) obj);
                    }
                }));
                return Single.just(Integer.valueOf(idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest.getResult()));
            } catch (NoConnectivityException e3) {
                e = e3;
                if (idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest != null) {
                    return Single.just(Integer.valueOf(idealEnvironmentTestResultEvaluateFrameForIdealCaptureEnvironmentTest.getResult()));
                }
                Single<Integer> singleError = Single.error(e);
                b(i2);
                int i6 = L + 75;
                M = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 35 / 0;
                }
                return singleError;
            }
        } catch (Exception e4) {
            return Single.error(e4);
        } finally {
            b(i2);
        }
    }

    protected IdealEnvironmentTestResult evaluateFrameForIdealCaptureEnvironmentTest(int i2) throws Exception {
        int i3 = 2 % 2;
        IdealEnvironmentTestResult idealEnvironmentTestResult = new IdealEnvironmentTestResult(-2, null, null);
        int i4 = M + 79;
        L = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return idealEnvironmentTestResult;
    }

    private void b(int i2) {
        int i3 = 2 % 2;
        Camera.Parameters parametersA = e.a(this.f11176b);
        if (parametersA == null) {
            int i4 = M + 3;
            L = i4 % 128;
            if (i4 % 2 == 0) {
                Timber.w("Problem while fetching parameters", new Object[1]);
                return;
            } else {
                Timber.w("Problem while fetching parameters", new Object[0]);
                return;
            }
        }
        if (parametersA.isZoomSupported()) {
            int i5 = L + 17;
            M = i5 % 128;
            int i6 = i5 % 2;
            this.f11178d.setCameraZoom(parametersA, i2);
            if (e.d(this.f11176b, parametersA)) {
                return;
            }
            int i7 = M + 73;
            L = i7 % 128;
            if (i7 % 2 == 0) {
                Timber.w("Problem while setting parameters", new Object[1]);
            } else {
                Timber.w("Problem while setting parameters", new Object[0]);
            }
            int i8 = L + 95;
            M = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestFallbackSingle() {
        int i2 = 2 % 2;
        int i3 = M + 69;
        L = i3 % 128;
        int i4 = i3 % 2;
        final int iJ = j();
        Single<Integer> singleDoOnError = Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.h();
            }
        }).delay(1000L, TimeUnit.MILLISECONDS).andThen(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Float.valueOf(this.f$0.g());
            }
        })).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((Float) obj);
            }
        }).delay(1000L, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(iJ, (Float) obj);
            }
        }).delay(1000L, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CameraActivity.c((Integer) obj);
            }
        }).onErrorReturnItem(4).doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraActivity$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b(iJ, (Throwable) obj);
            }
        });
        int i5 = L + 89;
        M = i5 % 128;
        int i6 = i5 % 2;
        return singleDoOnError;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        Float f2 = (Float) objArr[1];
        int i2 = 2 % 2;
        int i3 = L + 85;
        M = i3 % 128;
        int i4 = i3 % 2;
        cameraActivity.n();
        int i5 = M + 121;
        L = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return f2;
    }

    public /* synthetic */ Integer d(int i2, Float f2) throws Exception {
        int i3;
        int i4 = 2 % 2;
        int i5 = L + 43;
        M = i5 % 128;
        int i6 = i5 % 2;
        if (g() / f2.floatValue() < 1.4f) {
            i3 = 3;
        } else {
            int i7 = L + 47;
            M = i7 % 128;
            int i8 = i7 % 2;
            i3 = 1;
        }
        Object[] objArr = {this, Integer.valueOf(i2)};
        a(962898315, FacialRecognitionResults.d(), -962898311, FacialRecognitionResults.d(), objArr, FacialRecognitionResults.d(), FacialRecognitionResults.d());
        return Integer.valueOf(i3);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        int i2 = 2 % 2;
        int i3 = L;
        int i4 = i3 + 15;
        M = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 39;
        M = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
        return num;
    }

    public /* synthetic */ void b(int i2, Throwable th) throws Exception {
        int i3 = 2 % 2;
        int i4 = M + 83;
        L = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {this, Integer.valueOf(i2)};
        a(962898315, FacialRecognitionResults.d(), -962898311, FacialRecognitionResults.d(), objArr, FacialRecognitionResults.d(), FacialRecognitionResults.d());
        int i6 = M + 121;
        L = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private int j() {
        int i2 = 2 % 2;
        int i3 = M + 33;
        L = i3 % 128;
        int i4 = i3 % 2;
        Camera.Parameters parametersA = e.a(this.f11176b);
        if (parametersA == null) {
            throw new RuntimeException("Problem while fetching parameters");
        }
        int exposureCompensation = parametersA.getExposureCompensation();
        int i5 = M + 59;
        L = i5 % 128;
        int i6 = i5 % 2;
        return exposureCompensation;
    }

    public void h() {
        int i2 = 2 % 2;
        int i3 = M + 45;
        L = i3 % 128;
        int i4 = i3 % 2;
        Camera.Parameters parametersA = e.a(this.f11176b);
        if (parametersA == null) {
            throw new RuntimeException("Problem while fetching parameters");
        }
        parametersA.setExposureCompensation(parametersA.getMinExposureCompensation());
        if (!e.d(this.f11176b, parametersA)) {
            Timber.w("Problem while setting parameters", new Object[0]);
            int i5 = L + 91;
            M = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = M + 97;
        L = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public float g() {
        int i2 = 2 % 2;
        int i3 = M + 41;
        L = i3 % 128;
        int i4 = i3 % 2;
        try {
            float centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(k());
            int i5 = L + 73;
            M = i5 % 128;
            int i6 = i5 % 2;
            return centerBrightnessLevel;
        } catch (ImageProcessingKitInvalidInputException | ImageProcessingKitProcessException e2) {
            throw new RuntimeException(e2);
        }
    }

    private Bitmap k() {
        int i2 = 2 % 2;
        int i3 = L + 27;
        M = i3 % 128;
        int i4 = i3 % 2;
        Bitmap singlePreviewFrameSynchronous = this.f11178d.getSinglePreviewFrameSynchronous(this.f11178d.getLastCompleteFrameBytes());
        int i5 = M + 71;
        L = i5 % 128;
        if (i5 % 2 != 0) {
            return singlePreviewFrameSynchronous;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0018, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
    
        r1.setExposureCompensation(r1.getMaxExposureCompensation());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if ((!com.incode.welcome_sdk.commons.utils.e.d(r5.f11176b, r1)) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r2 = com.incode.welcome_sdk.ui.camera.CameraActivity.L + 5;
        com.incode.welcome_sdk.ui.camera.CameraActivity.M = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if ((r2 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        timber.log.Timber.w("Problem while setting parameters", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003f, code lost:
    
        timber.log.Timber.w("Problem while setting parameters", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        throw new java.lang.RuntimeException("Problem while fetching parameters");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L45
            android.hardware.Camera r0 = r5.f11176b
            android.hardware.Camera$Parameters r1 = com.incode.welcome_sdk.commons.utils.e.a(r0)
            r0 = 8
            int r0 = r0 / r3
            if (r1 == 0) goto L4e
        L1a:
            int r0 = r1.getMaxExposureCompensation()
            r1.setExposureCompensation(r0)
            android.hardware.Camera r0 = r5.f11176b
            boolean r1 = com.incode.welcome_sdk.commons.utils.e.d(r0, r1)
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L2c
        L2b:
            return
        L2c:
            int r0 = com.incode.welcome_sdk.ui.camera.CameraActivity.L
            int r2 = r0 + 5
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.CameraActivity.M = r0
            int r2 = r2 % r4
            java.lang.String r1 = "Problem while setting parameters"
            if (r2 == 0) goto L3f
            java.lang.Object[] r0 = new java.lang.Object[r3]
            timber.log.Timber.w(r1, r0)
            goto L2b
        L3f:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            timber.log.Timber.w(r1, r0)
            goto L2b
        L45:
            android.hardware.Camera r0 = r5.f11176b
            android.hardware.Camera$Parameters r1 = com.incode.welcome_sdk.commons.utils.e.a(r0)
            if (r1 == 0) goto L4e
            goto L1a
        L4e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Problem while fetching parameters"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraActivity.n():void");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CameraActivity cameraActivity = (CameraActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = M + 23;
        L = i3 % 128;
        if (i3 % 2 != 0) {
            Camera.Parameters parametersA = e.a(cameraActivity.f11176b);
            if (parametersA == null) {
                Timber.w("Problem while fetching parameters", new Object[0]);
                int i4 = M + 79;
                L = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            parametersA.setExposureCompensation(iIntValue);
            if (!e.d(cameraActivity.f11176b, parametersA)) {
                Timber.w("Problem while setting parameters", new Object[0]);
            }
            return null;
        }
        e.a(cameraActivity.f11176b);
        throw null;
    }

    public /* synthetic */ void e(OpenTokSessionWrapper openTokSessionWrapper, SingleEmitter singleEmitter) throws Exception {
        int iD = FacialRecognitionResults.d();
        int iD2 = FacialRecognitionResults.d();
        a(-1287842448, iD, 1287842453, FacialRecognitionResults.d(), new Object[]{this, openTokSessionWrapper, singleEmitter}, FacialRecognitionResults.d(), iD2);
    }

    public /* synthetic */ void b(Runnable runnable) {
        int iD = FacialRecognitionResults.d();
        int iD2 = FacialRecognitionResults.d();
        a(428321487, iD, -428321484, FacialRecognitionResults.d(), new Object[]{this, runnable}, FacialRecognitionResults.d(), iD2);
    }

    public /* synthetic */ Float c(Float f2) throws Exception {
        int iD = FacialRecognitionResults.d();
        int iD2 = FacialRecognitionResults.d();
        return (Float) a(94539574, iD, -94539573, FacialRecognitionResults.d(), new Object[]{this, f2}, FacialRecognitionResults.d(), iD2);
    }

    public static /* synthetic */ Integer c(Integer num) throws Exception {
        Object[] objArr = {num};
        return (Integer) a(-228887989, FacialRecognitionResults.d(), 228887991, FacialRecognitionResults.d(), objArr, FacialRecognitionResults.d(), FacialRecognitionResults.d());
    }

    private void a(int i2) {
        Object[] objArr = {this, Integer.valueOf(i2)};
        a(962898315, FacialRecognitionResults.d(), -962898311, FacialRecognitionResults.d(), objArr, FacialRecognitionResults.d(), FacialRecognitionResults.d());
    }

    private void e(Runnable runnable) {
        int iD = FacialRecognitionResults.d();
        int iD2 = FacialRecognitionResults.d();
        a(-73114635, iD, 73114635, FacialRecognitionResults.d(), new Object[]{this, runnable}, FacialRecognitionResults.d(), iD2);
    }
}
