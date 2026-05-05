package com.incode.welcome_sdk.ui.camera;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.core.app.NotificationManagerCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.commons.ui.CameraOverlayView;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.ab;
import com.incode.welcome_sdk.commons.utils.ad;
import com.incode.welcome_sdk.commons.utils.ah;
import com.incode.welcome_sdk.commons.utils.e;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class CameraPreview extends ViewGroup implements SurfaceHolder.Callback {
    private static int O = 0;
    private static int S = 1;
    private volatile String A;
    private volatile Camera.Size B;
    private volatile int C;
    private volatile int D;
    private volatile boolean E;
    private int F;
    private boolean G;
    private Camera.AutoFocusMoveCallback H;
    private int I;
    private volatile boolean J;
    private final CompositeDisposable K;
    private boolean L;
    private int M;
    private MirrorVideoCapturer N;
    private boolean P;
    private byte[] Q;
    private final Object R;

    /* JADX INFO: renamed from: a */
    protected float f11290a;

    /* JADX INFO: renamed from: b */
    protected int f11291b;

    /* JADX INFO: renamed from: c */
    protected int f11292c;

    /* JADX INFO: renamed from: d */
    protected float f11293d;

    /* JADX INFO: renamed from: e */
    protected float f11294e;

    /* JADX INFO: renamed from: f */
    protected volatile Camera.Size f11295f;

    /* JADX INFO: renamed from: g */
    protected CameraContract.Presenter f11296g;

    /* JADX INFO: renamed from: h */
    protected SurfaceView f11297h;

    /* JADX INFO: renamed from: i */
    protected CameraContract.View f11298i;

    /* JADX INFO: renamed from: j */
    protected volatile int f11299j;

    /* JADX INFO: renamed from: k */
    private final int f11300k;

    /* JADX INFO: renamed from: l */
    private Rect f11301l;

    /* JADX INFO: renamed from: m */
    protected volatile int f11302m;

    /* JADX INFO: renamed from: n */
    private final int f11303n;

    /* JADX INFO: renamed from: o */
    protected List<OnLayoutCameraPreviewListener> f11304o;

    /* JADX INFO: renamed from: p */
    private float f11305p;

    /* JADX INFO: renamed from: q */
    private float f11306q;

    /* JADX INFO: renamed from: r */
    private SurfaceHolder f11307r;

    /* JADX INFO: renamed from: s */
    private CameraOverlayView f11308s;

    /* JADX INFO: renamed from: t */
    private float f11309t;

    /* JADX INFO: renamed from: u */
    private Scheduler f11310u;

    /* JADX INFO: renamed from: v */
    private AtomicInteger f11311v;

    /* JADX INFO: renamed from: w */
    private PublishSubject<byte[]> f11312w;

    /* JADX INFO: renamed from: x */
    private volatile Camera f11313x;

    /* JADX INFO: renamed from: y */
    private Camera.PreviewCallback f11314y;

    /* JADX INFO: renamed from: z */
    private boolean f11315z;

    public interface OnLayoutCameraPreviewListener {
        void layoutCameraPreview(int i2, int i3, int i4, int i5);
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = (~(i8 | i2)) | i3;
        int i10 = (~(i8 | (~i2))) | (~((~i3) | i8)) | (~(i3 | i6 | i2));
        int i11 = ~(i2 | i3);
        int i12 = i3 + i6 + i7 + ((-813770285) * i5) + (135932771 * i4);
        int i13 = i12 * i12;
        int i14 = (526900465 * i3) + 74317824 + ((-1745228167) * i6) + ((-249289968) * i9) + (2022838664 * i10) + ((-2022838664) * i11) + (277610496 * i7) + (1331953664 * i5) + ((-366739456) * i4) + ((-1308753920) * i13);
        int i15 = (i3 * 1149714451) + 247108311 + (i6 * 1149714091) + (i9 * (-720)) + (i10 * (-360)) + (i11 * SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) + (i7 * 1149713731) + (i5 * 1918847289) + (i4 * (-2006650391)) + (i13 * 460980224);
        int i16 = i14 + (i15 * i15 * (-1418592256));
        if (i16 == 1) {
            return a(objArr);
        }
        if (i16 != 2) {
            if (i16 != 3) {
                return i16 != 4 ? d(objArr) : b(objArr);
            }
            int i17 = 2 % 2;
            int i18 = S + 83;
            O = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        CameraPreview cameraPreview = (CameraPreview) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i20 = 2 % 2;
        int i21 = S + 117;
        O = i21 % 128;
        int i22 = i21 % 2;
        cameraPreview.E = zBooleanValue;
        int i23 = S + 7;
        O = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public CameraPreview(CameraContract.View view, CameraContract.Presenter presenter, Camera camera, Scheduler scheduler, final int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, boolean z3) {
        super(view.getContext());
        this.f11292c = 0;
        this.f11291b = 0;
        this.f11301l = new Rect(0, 0, 0, 0);
        this.f11293d = 0.0f;
        this.f11294e = 0.0f;
        this.f11290a = 1.0f;
        this.f11305p = 1.0f;
        this.f11309t = 1.0f;
        this.f11306q = 0.5f;
        this.f11311v = new AtomicInteger(0);
        this.E = false;
        this.I = 1920;
        this.M = PhotoshopDirectory.TAG_COUNT_INFORMATION;
        this.L = false;
        this.K = new CompositeDisposable();
        this.P = false;
        this.R = new Object();
        Context context = view.getContext();
        this.f11298i = view;
        this.f11296g = presenter;
        this.f11313x = camera;
        this.f11310u = scheduler;
        this.C = i2;
        this.D = i3;
        this.f11297h = new SurfaceView(context);
        setStaticTransformationsEnabled(true);
        addView(this.f11297h);
        CameraOverlayView cameraOverlayView = new CameraOverlayView(context);
        this.f11308s = cameraOverlayView;
        addView(cameraOverlayView);
        SurfaceHolder holder = this.f11297h.getHolder();
        this.f11307r = holder;
        holder.addCallback(this);
        this.F = i4;
        this.f11300k = i5;
        this.f11303n = i6;
        this.G = z2;
        this.I = i7;
        this.M = i8;
        this.L = z3;
        if (z3) {
            Timber.d("Creating CameraPreview that ignores PictureSize", new Object[0]);
        }
        Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.c(i2);
            }
        }).subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.h();
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CameraPreview.j((Throwable) obj);
            }
        });
    }

    public /* synthetic */ void c(int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = O + 25;
        S = i4 % 128;
        int i5 = i4 % 2;
        setCameraParameters(i2, this.f11313x);
        int i6 = S + 71;
        O = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ void h() throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 21;
        S = i3 % 128;
        int i4 = i3 % 2;
        this.f11315z = true;
        requestLayout();
        int i5 = O + 69;
        S = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void j(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 85;
        S = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th, "Camera: Couldn't setup camera", new Object[1]);
        } else {
            Timber.e(th, "Camera: Couldn't setup camera", new Object[0]);
        }
    }

    public void setVideoCapturer(MirrorVideoCapturer mirrorVideoCapturer) {
        int i2 = 2 % 2;
        int i3 = O + 15;
        int i4 = i3 % 128;
        S = i4;
        if (i3 % 2 != 0) {
            this.N = mirrorVideoCapturer;
            int i5 = i4 + 25;
            O = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.N = mirrorVideoCapturer;
        throw null;
    }

    public byte[] getLastCompleteFrameBytes() {
        byte[] bArr;
        synchronized (this.R) {
            bArr = this.Q;
        }
        return bArr;
    }

    public Camera.Size getPreviewSize() {
        Camera.Size size;
        int i2 = 2 % 2;
        int i3 = O + 41;
        S = i3 % 128;
        if (i3 % 2 == 0) {
            size = this.f11295f;
            int i4 = 75 / 0;
        } else {
            size = this.f11295f;
        }
        int i5 = S + 39;
        O = i5 % 128;
        int i6 = i5 % 2;
        return size;
    }

    public int getCameraRotation() {
        int i2 = 2 % 2;
        int i3 = S + 59;
        O = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f11299j;
        int i6 = O + 25;
        S = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public float getCameraPreviewScale() {
        int i2 = 2 % 2;
        int i3 = S + 39;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11290a;
        }
        throw null;
    }

    public float getCameraScale() {
        int i2 = 2 % 2;
        int i3 = O;
        int i4 = i3 + 61;
        S = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.f11309t;
        int i6 = i3 + 43;
        S = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return f2;
    }

    public void setCameraScale(float f2) {
        int i2 = 2 % 2;
        int i3 = S + 5;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11305p = f2;
            this.f11309t = f2;
            this.f11297h.invalidate();
        } else {
            this.f11305p = f2;
            this.f11309t = f2;
            this.f11297h.invalidate();
            throw null;
        }
    }

    public void setInternalCameraScale(float f2) {
        int i2 = 2 % 2;
        int i3 = S + 117;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11305p = f2;
            this.f11297h.invalidate();
        } else {
            this.f11305p = f2;
            this.f11297h.invalidate();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void prepareCameraPreviewScaleAnimation(float f2) {
        int i2 = 2 % 2;
        int i3 = S + 111;
        int i4 = i3 % 128;
        O = i4;
        int i5 = i3 % 2;
        this.f11309t = f2;
        int i6 = i4 + 115;
        S = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVerticalBias(float f2) {
        int i2 = 2 % 2;
        int i3 = S;
        int i4 = i3 + 15;
        O = i4 % 128;
        int i5 = i4 % 2;
        this.f11306q = f2;
        int i6 = i3 + 13;
        O = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.CameraPreview$1 */
    final class AnonymousClass1 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: c */
        private static int f11316c = 0;

        /* JADX INFO: renamed from: e */
        private static int f11317e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Runnable f11318b;

        AnonymousClass1(Runnable runnable) {
            runnable = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i2 = 2 % 2;
            int i3 = f11317e + 47;
            f11316c = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i2 = 2 % 2;
            Runnable runnable = runnable;
            if (runnable != null) {
                int i3 = f11316c + 75;
                f11317e = i3 % 128;
                int i4 = i3 % 2;
                runnable.run();
                int i5 = f11317e + 33;
                f11316c = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = f11317e + 95;
            f11316c = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            int i2 = 2 % 2;
            int i3 = f11317e + 103;
            int i4 = i3 % 128;
            f11316c = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            Runnable runnable = runnable;
            if (runnable != null) {
                int i5 = i4 + 45;
                f11317e = i5 % 128;
                if (i5 % 2 != 0) {
                    runnable.run();
                } else {
                    runnable.run();
                    throw null;
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            int i2 = 2 % 2;
            int i3 = f11317e + 123;
            f11316c = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public void animateCameraPreviewScale(Runnable runnable) {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, "internalCameraScale", new FloatEvaluator(), Float.valueOf(this.f11305p), Float.valueOf(this.f11309t));
        objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview.1

            /* JADX INFO: renamed from: c */
            private static int f11316c = 0;

            /* JADX INFO: renamed from: e */
            private static int f11317e = 1;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Runnable f11318b;

            AnonymousClass1(Runnable runnable2) {
                runnable = runnable2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i22 = 2 % 2;
                int i3 = f11317e + 47;
                f11316c = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i22 = 2 % 2;
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    int i3 = f11316c + 75;
                    f11317e = i3 % 128;
                    int i4 = i3 % 2;
                    runnable2.run();
                    int i5 = f11317e + 33;
                    f11316c = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = f11317e + 95;
                f11316c = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                int i22 = 2 % 2;
                int i3 = f11317e + 103;
                int i4 = i3 % 128;
                f11316c = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    int i5 = i4 + 45;
                    f11317e = i5 % 128;
                    if (i5 % 2 != 0) {
                        runnable2.run();
                    } else {
                        runnable2.run();
                        throw null;
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                int i22 = 2 % 2;
                int i3 = f11317e + 123;
                f11316c = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }
        });
        objectAnimatorOfObject.setDuration(600L);
        objectAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfObject.start();
        int i3 = O + 55;
        S = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.view.ViewGroup
    protected boolean getChildStaticTransformation(View view, Transformation transformation) {
        int i2 = 2 % 2;
        int i3 = O + 79;
        int i4 = i3 % 128;
        S = i4;
        int i5 = i3 % 2;
        if (view instanceof SurfaceView) {
            transformation.clear();
            Matrix matrix = transformation.getMatrix();
            float f2 = this.f11305p;
            matrix.setScale(f2, f2, view.getWidth() * 0.5f, view.getHeight() * this.f11306q);
            int i6 = O + 69;
            S = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i4 + 93;
        O = i8 % 128;
        return i8 % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0013, code lost:
    
        if (r3.f11313x != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0017, code lost:
    
        if (r3.f11295f == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0019, code lost:
    
        r3.f11298i.onCameraSourceCreated();
        layoutCameraPreview(r4, r5);
        r1 = com.incode.welcome_sdk.ui.camera.CameraPreview.S + 89;
        com.incode.welcome_sdk.ui.camera.CameraPreview.O = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        if ((r1 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        if (r3.f11313x != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003e, code lost:
    
        throw new com.incode.welcome_sdk.commons.exceptions.IncodeGenericError("Camera: Preview size is null, cannot layout camera preview");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        throw new com.incode.welcome_sdk.commons.exceptions.IncodeGenericError("Camera: Camera is null, cannot layout camera preview");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(int r4, int r5) throws java.lang.Exception {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPreview.S
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPreview.O = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2d
            android.hardware.Camera r1 = r3.f11313x
            r0 = 6
            int r0 = r0 / 0
            if (r1 == 0) goto L3f
        L15:
            android.hardware.Camera$Size r0 = r3.f11295f
            if (r0 == 0) goto L37
            com.incode.welcome_sdk.ui.camera.CameraContract$View r0 = r3.f11298i
            r0.onCameraSourceCreated()
            r3.layoutCameraPreview(r4, r5)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPreview.S
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPreview.O = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L32
            return
        L2d:
            android.hardware.Camera r0 = r3.f11313x
            if (r0 == 0) goto L3f
            goto L15
        L32:
            r0 = 0
            r0.hashCode()
            throw r0
        L37:
            com.incode.welcome_sdk.commons.exceptions.IncodeGenericError r1 = new com.incode.welcome_sdk.commons.exceptions.IncodeGenericError
            java.lang.String r0 = "Camera: Preview size is null, cannot layout camera preview"
            r1.<init>(r0)
            throw r1
        L3f:
            com.incode.welcome_sdk.commons.exceptions.IncodeGenericError r1 = new com.incode.welcome_sdk.commons.exceptions.IncodeGenericError
            java.lang.String r0 = "Camera: Camera is null, cannot layout camera preview"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraPreview.d(int, int):void");
    }

    public static /* synthetic */ void c() throws Exception {
        int i2 = 2 % 2;
        int i3 = S + 101;
        O = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
    }

    public /* synthetic */ void f(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 123;
        S = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Camera: Couldn't layout camera", new Object[0]);
        this.f11296g.error(th);
        int i5 = S + 69;
        O = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = S + 107;
        int i8 = i7 % 128;
        O = i8;
        int i9 = i7 % 2;
        final int i10 = i4 - i2;
        final int i11 = i5 - i3;
        if (this.f11315z && i10 > 0 && i11 > 0) {
            int i12 = i8 + 47;
            S = i12 % 128;
            int i13 = i12 % 2;
            this.f11315z = false;
            Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Action
                public final void run() {
                    this.f$0.setCameraSize();
                }
            }).subscribeOn(this.f11310u).observeOn(AndroidSchedulers.mainThread()).andThen(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.d(i10, i11);
                }
            })).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda5
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    CameraPreview.c();
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.f((Throwable) obj);
                }
            });
        }
        int i14 = S + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        O = i14 % 128;
        int i15 = i14 % 2;
    }

    public void addOnLayoutCameraPreviewListener(OnLayoutCameraPreviewListener onLayoutCameraPreviewListener) {
        int i2 = 2 % 2;
        int i3 = O + 95;
        S = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f11304o == null) {
            this.f11304o = new ArrayList();
            int i4 = O + 107;
            S = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.f11304o.contains(onLayoutCameraPreviewListener)) {
            return;
        }
        int i6 = S + 97;
        O = i6 % 128;
        if (i6 % 2 == 0) {
            this.f11304o.add(onLayoutCameraPreviewListener);
        } else {
            this.f11304o.add(onLayoutCameraPreviewListener);
            throw null;
        }
    }

    public void removeOnLayoutCameraPreviewListener(OnLayoutCameraPreviewListener onLayoutCameraPreviewListener) {
        int i2 = 2 % 2;
        int i3 = S;
        int i4 = i3 + 117;
        O = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<OnLayoutCameraPreviewListener> list = this.f11304o;
        if (list != null) {
            int i5 = i3 + 101;
            O = i5 % 128;
            if (i5 % 2 == 0) {
                list.remove(onLayoutCameraPreviewListener);
            } else {
                list.remove(onLayoutCameraPreviewListener);
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void layoutCameraPreview(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraPreview.layoutCameraPreview(int, int):void");
    }

    private PointF a(PointF pointF) {
        int i2 = 2 % 2;
        PointF pointF2 = new PointF(pointF.x + this.f11293d, pointF.y + this.f11294e);
        int i3 = S + 25;
        O = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return pointF2;
    }

    private PointF c(PointF pointF) {
        int i2 = 2 % 2;
        PointF pointF2 = new PointF(pointF.x / this.f11290a, pointF.y / this.f11290a);
        int i3 = S + 21;
        O = i3 % 128;
        int i4 = i3 % 2;
        return pointF2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CameraPreview cameraPreview = (CameraPreview) objArr[0];
        PointF pointF = (PointF) objArr[1];
        int i2 = 2 % 2;
        int i3 = S + 111;
        O = i3 % 128;
        int i4 = i3 % 2;
        PointF pointFC = cameraPreview.c(cameraPreview.a(pointF));
        int i5 = S + 59;
        O = i5 % 128;
        if (i5 % 2 == 0) {
            return pointFC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PointF d(PointF pointF) {
        int i2 = 2 % 2;
        PointF pointF2 = new PointF(pointF.x * this.f11290a, pointF.y * this.f11290a);
        int i3 = S + 125;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            return pointF2;
        }
        throw null;
    }

    public PointF pointToCameraCoordinates(PointF pointF, int i2, int i3) {
        int i4 = 2 % 2;
        PointF pointF2 = new PointF((pointF.x / (i2 / 2000.0f)) - 1000.0f, (pointF.y / (i3 / 2000.0f)) - 1000.0f);
        int i5 = O + 113;
        S = i5 % 128;
        int i6 = i5 % 2;
        return pointF2;
    }

    public SurfaceView getSurfaceView() {
        int i2 = 2 % 2;
        int i3 = O + 87;
        int i4 = i3 % 128;
        S = i4;
        int i5 = i3 % 2;
        SurfaceView surfaceView = this.f11297h;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        O = i6 % 128;
        if (i6 % 2 == 0) {
            return surfaceView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        PublishSubject<byte[]> publishSubject;
        CameraPreview cameraPreview = (CameraPreview) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        boolean z2 = cameraPreview.N != null;
        if (bArr == null) {
            if (z2) {
                Timber.w("OpenTok cannot process null bytes!", new Object[0]);
            }
            return null;
        }
        if (cameraPreview.f11296g.isProcessingEnabled() || cameraPreview.f11296g.isIdealCaptureEnvironmentTestInProgress()) {
            synchronized (cameraPreview.R) {
                byte[] bArr2 = new byte[bArr.length];
                cameraPreview.Q = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            if (!cameraPreview.E) {
                cameraPreview.f11298i.onPreviewRawFrame(bArr);
            }
        }
        if (cameraPreview.f11311v.get() > 0 && (publishSubject = cameraPreview.f11312w) != null) {
            publishSubject.onNext(bArr);
        }
        if (cameraPreview.J) {
            cameraPreview.J = false;
            cameraPreview.f11298i.onPreviewStarted();
        }
        if (z2 && !cameraPreview.f11296g.isIdealCaptureEnvironmentTestInProgress()) {
            cameraPreview.N.onPreviewFrame(bArr);
        }
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        final CameraPreview cameraPreview = (CameraPreview) objArr[0];
        int i2 = 2 % 2;
        int i3 = S + 61;
        O = i3 % 128;
        int i4 = i3 % 2;
        try {
            cameraPreview.f11313x.reconnect();
            cameraPreview.H = new Camera.AutoFocusMoveCallback() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda10
                @Override // android.hardware.Camera.AutoFocusMoveCallback
                public final void onAutoFocusMoving(boolean z2, Camera camera) {
                    this.f$0.e(z2, camera);
                }
            };
            cameraPreview.f11314y = new Camera.PreviewCallback() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda12
                @Override // android.hardware.Camera.PreviewCallback
                public final void onPreviewFrame(byte[] bArr, Camera camera) {
                    this.f$0.b(bArr, camera);
                }
            };
            cameraPreview.f11313x.setPreviewCallback(cameraPreview.f11314y);
            int i5 = O + 7;
            S = i5 % 128;
            int i6 = i5 % 2;
            return null;
        } catch (IOException e2) {
            Timber.e(e2, "Camera: Error setting camera preview", new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void b() throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 81;
        S = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = S + 7;
        O = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th, "Camera: Couldn't set preview and callback", new Object[1]);
        } else {
            Timber.e(th, "Camera: Couldn't set preview and callback", new Object[0]);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        int i2 = 2 % 2;
        Timber.d("Camera: surfaceCreated called", new Object[0]);
        this.J = true;
        new CompositeDisposable().add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.e();
            }
        }).subscribeOn(this.f11310u).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                CameraPreview.b();
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CameraPreview.b((Throwable) obj);
            }
        }));
        int i3 = S + 105;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void d() throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 103;
        S = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (this.f11313x != null) {
                int i5 = O + 125;
                S = i5 % 128;
                int i6 = i5 % 2;
                int cameraUsageCount = CameraManager.f11257d.getCameraUsageCount(this.f11313x);
                Timber.v("Camera: surfaceDestroyed; camera usages:%s", Integer.valueOf(cameraUsageCount));
                if (cameraUsageCount == 1) {
                    Timber.v("Camera: surfaceDestroyed; stopping preview", new Object[0]);
                    this.f11313x.stopPreview();
                    this.f11313x.setPreviewCallback(null);
                    Camera.AutoFocusMoveCallback autoFocusMoveCallback = this.H;
                    if (autoFocusMoveCallback != null) {
                        autoFocusMoveCallback.onAutoFocusMoving(false, this.f11313x);
                    }
                }
                CameraManager.f11257d.releaseCamera(this.f11313x);
            }
        } catch (Exception e2) {
            Timber.e(e2, "Camera: Error stopping camera preview", new Object[0]);
        }
    }

    public static /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 3;
        S = i3 % 128;
        Object[] objArr = new Object[0];
        if (i3 % 2 == 0) {
            Timber.e(th, "Camera: Couldn't stop preview and remove callback", objArr);
        } else {
            Timber.e(th, "Camera: Couldn't stop preview and remove callback", objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
    @Override // android.view.SurfaceHolder.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void surfaceDestroyed(android.view.SurfaceHolder r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPreview.O
            int r2 = r0 + 121
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.CameraPreview.S = r0
            int r2 = r2 % r3
            java.lang.String r1 = "Camera: surfaceDestroyed called"
            if (r2 != 0) goto L47
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            timber.log.Timber.d(r1, r0)
            io.reactivex.disposables.CompositeDisposable r0 = r4.K
            r0.clear()
            android.view.SurfaceHolder r0 = r4.f11307r
            if (r0 == 0) goto L2d
        L1f:
            android.view.SurfaceHolder r0 = r4.f11307r
            r0.removeCallback(r4)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPreview.S
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPreview.O = r0
            int r1 = r1 % r3
        L2d:
            com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda1
            r0.<init>()
            io.reactivex.Completable r1 = io.reactivex.Completable.fromAction(r0)
            io.reactivex.Scheduler r0 = r4.f11310u
            io.reactivex.Completable r2 = r1.subscribeOn(r0)
            io.reactivex.functions.Action r1 = com.incode.welcome_sdk.commons.utils.ah.f6384b
            com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda2 r0 = new com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda2
            r0.<init>()
            r2.subscribe(r1, r0)
            return
        L47:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            timber.log.Timber.d(r1, r0)
            io.reactivex.disposables.CompositeDisposable r0 = r4.K
            r0.clear()
            android.view.SurfaceHolder r0 = r4.f11307r
            if (r0 == 0) goto L2d
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraPreview.surfaceDestroyed(android.view.SurfaceHolder):void");
    }

    public /* synthetic */ void d(SurfaceHolder surfaceHolder) throws Exception {
        int i2 = 2 % 2;
        int i3 = S + 27;
        O = i3 % 128;
        int i4 = i3 % 2;
        try {
            Timber.v("Camera: surfaceChanged; stopping preview", new Object[0]);
            this.f11313x.stopPreview();
            int i5 = O + 75;
            S = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e2) {
            Timber.e(e2, "Camera: Error stopping camera preview", new Object[0]);
        }
        try {
            this.f11313x.setPreviewDisplay(surfaceHolder);
            this.f11313x.setPreviewCallback(this.f11314y);
            this.f11313x.setAutoFocusMoveCallback(this.H);
            Timber.v("Camera: surfaceChanged; starting preview", new Object[0]);
            this.f11313x.startPreview();
        } catch (Exception e3) {
            Timber.e(e3, "Camera: Error starting camera preview", new Object[0]);
        }
    }

    public static /* synthetic */ void c(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 59;
        S = i3 % 128;
        Object[] objArr = new Object[0];
        if (i3 % 2 == 0) {
            Timber.e(th, "Camera: Couldn't set preview and callback", objArr);
        } else {
            Timber.e(th, "Camera: Couldn't set preview and callback", objArr);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(final SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = S + 103;
        O = i6 % 128;
        int i7 = i6 % 2;
        Timber.d("Camera: onSurfaceChanged called", new Object[0]);
        if (this.f11307r.getSurface() == null) {
            Timber.d("Camera: preview surface does not exist", new Object[0]);
            return;
        }
        this.f11307r = surfaceHolder;
        Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.d(surfaceHolder);
            }
        }).subscribeOn(this.f11310u).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                CameraPreview.a();
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CameraPreview.c((Throwable) obj);
            }
        });
        int i8 = S + 13;
        O = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void setCameraZoom(Camera.Parameters parameters, int i2) {
        int i3 = 2 % 2;
        if (parameters.isZoomSupported()) {
            Iterator<Integer> it = parameters.getZoomRatios().iterator();
            int i4 = 0;
            while (it.hasNext() && it.next().intValue() <= i2) {
                int i5 = S + 113;
                O = i5 % 128;
                int i6 = i5 % 2;
                i4++;
            }
            int maxZoom = parameters.getMaxZoom();
            if (i4 > maxZoom) {
                i4 = maxZoom;
            }
            parameters.setZoom(i4);
            int i7 = S + 107;
            O = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public void setCameraSize() {
        int i2 = 2 % 2;
        Camera.Parameters parametersA = e.a(this.f11313x);
        if (parametersA == null) {
            int i3 = O + 123;
            S = i3 % 128;
            int i4 = i3 % 2;
            Timber.w("Cannot setCameraSize() with null Camera.Parameters", new Object[0]);
            return;
        }
        e.c cVarE = e.e(this.f11313x, getResources(), this.C, this.f11300k, this.f11303n, this.G, this.I, this.M, this.L);
        if (cVarE == null || cVarE.e() == null) {
            Timber.e("Cannot setCameraSize() because getBestPreviewSize() returned null sizePair or previewSize.", new Object[0]);
            int i5 = O + 19;
            S = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.f11295f = cVarE.e();
        parametersA.setPreviewSize(this.f11295f.width, this.f11295f.height);
        this.B = cVarE.b();
        parametersA.setPictureSize(this.B.width, this.B.height);
        setCameraZoom(parametersA, this.F);
        Timber.d("FPS range: %s", parametersA.getSupportedPreviewFpsRange());
        if (e.d(this.f11313x, parametersA)) {
            return;
        }
        int i6 = O + 19;
        S = i6 % 128;
        if (i6 % 2 == 0) {
            Timber.w("Cannot setCameraParameters() in setCameraSize()!", new Object[0]);
        } else {
            Timber.w("Cannot setCameraParameters() in setCameraSize()!", new Object[0]);
        }
    }

    public void setCameraParameters(int i2, Camera camera) {
        int i3;
        int i4 = 2 % 2;
        Timber.d("Camera: setCameraParameters called", new Object[0]);
        Camera.Parameters parametersA = e.a(camera);
        if (parametersA == null) {
            Timber.w("Cannot setCameraParameters with null Camera.Parameters", new Object[0]);
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo);
        String focusMode = parametersA.getFocusMode();
        if (cameraInfo.facing == 1) {
            int i5 = S + 109;
            O = i5 % 128;
            int i6 = i5 % 2;
            i3 = cameraInfo.orientation % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            Timber.d("Camera: setCameraParameters rotation result: %s", Integer.valueOf(i3));
            int i7 = (360 - i3) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            Timber.d("Camera: setCameraParameters rotation result after mirror compensation: %s", Integer.valueOf(i7));
            camera.setDisplayOrientation(i7);
            String str = "fixed";
            if (parametersA.getSupportedFocusModes().contains("fixed")) {
                int i8 = S + 101;
                O = i8 % 128;
                int i9 = i8 % 2;
                Timber.d("Camera: FOCUS_MODE_FIXED", new Object[0]);
                int i10 = S + 51;
                O = i10 % 128;
                int i11 = i10 % 2;
            } else {
                str = "fixed-face";
                if (!(!parametersA.getSupportedFocusModes().contains("fixed-face"))) {
                    Timber.d("Camera: FOCUS_MODE_FIXED_FACE", new Object[0]);
                } else if (parametersA.getSupportedFocusModes().contains("continuous-picture")) {
                    Timber.d("Camera: FOCUS_MODE_CONTINUOUS_PICTURE", new Object[0]);
                    focusMode = "continuous-picture";
                } else {
                    Timber.d("Camera: unhandled focus mode:%s", parametersA.getFocusMode());
                }
            }
            focusMode = str;
        } else {
            i3 = (cameraInfo.orientation + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            camera.setDisplayOrientation(i3);
            if (parametersA.getSupportedFocusModes().contains("continuous-picture")) {
                focusMode = "continuous-picture";
            } else {
                Timber.w("Camera: focus mode: continuous-picture is not supported on this device.", new Object[0]);
            }
        }
        parametersA.setFocusMode(focusMode);
        parametersA.setPictureFormat(256);
        parametersA.setJpegQuality(100);
        parametersA.setPreviewFormat(17);
        List<Integer> supportedPreviewFrameRates = parametersA.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates != null) {
            int i12 = O + 41;
            S = i12 % 128;
            int i13 = i12 % 2;
            parametersA.setPreviewFrameRate(((Integer) Collections.max(supportedPreviewFrameRates)).intValue());
        }
        this.A = focusMode;
        this.f11299j = i3;
        this.f11302m = ab.a(this.f11299j, this.C, this.D);
        parametersA.setRotation(this.f11302m);
        if (e.d(camera, parametersA)) {
            return;
        }
        Timber.w("Cannot set all camera parameters() in setCameraParameters()!", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPreview.O
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPreview.S = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L28
            int r1 = r12.getActionMasked()
            r0 = 46
            int r0 = r0 / 0
            if (r1 == 0) goto L2f
        L18:
            boolean r2 = super.onTouchEvent(r12)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraPreview.S
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraPreview.O = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L6b
            return r2
        L28:
            int r0 = r12.getActionMasked()
            if (r0 == 0) goto L2f
            goto L18
        L2f:
            android.graphics.PointF r2 = new android.graphics.PointF
            float r1 = r12.getX()
            float r0 = r12.getY()
            r2.<init>(r1, r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r2}
            int r4 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b.C0229b.AnonymousClass5.d()
            int r10 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b.C0229b.AnonymousClass5.d()
            int r8 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b.C0229b.AnonymousClass5.d()
            int r6 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b.C0229b.AnonymousClass5.d()
            r5 = 1022705358(0x3cf53ece, float:0.029937174)
            r9 = -1022705357(0xffffffffc30ac133, float:-138.75468)
            java.lang.Object r2 = a(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            com.incode.welcome_sdk.commons.ui.CameraOverlayView r1 = r11.f11308s
            android.graphics.PointF r0 = r11.d(r2)
            r1.setFocusPoint(r0)
            r0 = 10
            r11.requestCameraAutofocus(r2, r0)
            goto L18
        L6b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraPreview.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean isCameraFocused() {
        int i2 = 2 % 2;
        int i3 = S + 3;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            return this.P;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void focusToBarcode(IdCaptureKitAndroid.BarcodeQuad barcodeQuad) {
        int i2 = 2 % 2;
        this.f11308s.showQuadOverlay(d(new PointF(barcodeQuad.quad[0])), d(new PointF(barcodeQuad.quad[1])), d(new PointF(barcodeQuad.quad[2])), d(new PointF(barcodeQuad.quad[3])));
        requestCameraAutofocus(new PointF((barcodeQuad.quad[0].x + barcodeQuad.quad[2].x) / 2.0f, (barcodeQuad.quad[1].y + barcodeQuad.quad[3].y) / 2.0f), 2);
        int i3 = S + 43;
        O = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ void e(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = S + 105;
        O = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("Camera: Reverting to default focus mode", new Object[0]);
        if (this.f11313x != null) {
            int i5 = S + 61;
            O = i5 % 128;
            if (i5 % 2 == 0) {
                this.f11313x.cancelAutoFocus();
                Camera.Parameters parametersA = e.a(this.f11313x);
                if (parametersA != null) {
                    parametersA.setFocusMode(this.A);
                    if (!e.d(this.f11313x, parametersA)) {
                        Timber.w("Cannot setCameraParameters() while reverting to default focus mode!", new Object[0]);
                    }
                } else {
                    int i6 = S + 5;
                    O = i6 % 128;
                    if (i6 % 2 != 0) {
                        Timber.w("Cannot revert to default focus mode with null Camera.Parameters", new Object[0]);
                        return;
                    } else {
                        Timber.w("Cannot revert to default focus mode with null Camera.Parameters", new Object[0]);
                        return;
                    }
                }
            } else {
                this.f11313x.cancelAutoFocus();
                e.a(this.f11313x);
                throw null;
            }
        }
        this.P = false;
    }

    public /* synthetic */ void c(int i2, boolean z2, Camera camera) {
        int i3 = 2 % 2;
        int i4 = O + 47;
        S = i4 % 128;
        int i5 = i4 % 2;
        this.P = true;
        this.f11308s.setFocusPoint(null);
        this.f11308s.clearQuadOverlay();
        this.K.add(Observable.timer(i2, TimeUnit.SECONDS).observeOn(this.f11310u).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda20
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Timber.e((Throwable) obj);
            }
        }));
        int i6 = O + 113;
        S = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* synthetic */ void b(PointF pointF, final int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = S + 23;
        O = i4 % 128;
        int i5 = i4 % 2;
        if (!isAutofocusMode()) {
            this.P = true;
            this.f11308s.setFocusPoint(null);
            this.f11308s.clearQuadOverlay();
            return;
        }
        RectF rectF = new RectF(ad.c(ad.b(pointToCameraCoordinates(pointF, this.f11292c, this.f11291b)), new Rect(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000, 1000)));
        Matrix matrix = new Matrix();
        Timber.d("Camera: cameraRotation:%s frameRotation:%s", Integer.valueOf(this.f11299j), Integer.valueOf(this.f11302m));
        matrix.setRotate(-this.f11299j, 0.0f, 0.0f);
        matrix.mapRect(rectF);
        Timber.d("Camera: focusing to:%s", rectF);
        this.K.clear();
        Camera.Parameters parametersA = e.a(this.f11313x);
        if (parametersA != null) {
            parametersA.setFocusMode("auto");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(ad.c(rectF), 1000));
            parametersA.setFocusAreas(arrayList);
            if (!e.d(this.f11313x, parametersA)) {
                int i6 = S + 105;
                O = i6 % 128;
                int i7 = i6 % 2;
                Timber.w("Cannot setCameraParameters() in requestCameraAutoFocus()!", new Object[0]);
            }
            this.f11313x.autoFocus(new Camera.AutoFocusCallback() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda21
                @Override // android.hardware.Camera.AutoFocusCallback
                public final void onAutoFocus(boolean z2, Camera camera) {
                    this.f$0.c(i2, z2, camera);
                }
            });
            return;
        }
        int i8 = S + 115;
        O = i8 % 128;
        int i9 = i8 % 2;
        Timber.w("Cannot requestCameraAutoFocus() with null Camera.Parameters", new Object[0]);
    }

    public static /* synthetic */ void a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 123;
        S = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th, "Camera: Autofocus request failed", new Object[1]);
        } else {
            Timber.e(th, "Camera: Autofocus request failed", new Object[0]);
        }
    }

    public void requestCameraAutofocus(final PointF pointF, final int i2) {
        int i3 = 2 % 2;
        int i4 = O + 87;
        S = i4 % 128;
        if (i4 % 2 == 0) {
            Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda16
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.b(pointF, i2);
                }
            }).subscribeOn(this.f11310u).observeOn(AndroidSchedulers.mainThread()).subscribe(ah.f6384b, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda17
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    CameraPreview.a((Throwable) obj);
                }
            });
            int i5 = 11 / 0;
        } else {
            Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda16
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.b(pointF, i2);
                }
            }).subscribeOn(this.f11310u).observeOn(AndroidSchedulers.mainThread()).subscribe(ah.f6384b, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda17
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    CameraPreview.a((Throwable) obj);
                }
            });
        }
    }

    public /* synthetic */ void d(CompositeDisposable compositeDisposable) throws Exception {
        int i2 = 2 % 2;
        int i3 = O + 101;
        S = i3 % 128;
        int i4 = i3 % 2;
        this.f11311v.decrementAndGet();
        compositeDisposable.clear();
        int i5 = O + 95;
        S = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
    }

    public static /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = S + 25;
        O = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void getSinglePreviewFrame(final androidx.core.util.Consumer<Bitmap> consumer) {
        int i2 = 2 % 2;
        int i3 = O + 93;
        S = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.f11312w == null) {
                this.f11312w = PublishSubject.create();
                int i4 = O + 53;
                S = i4 % 128;
                int i5 = i4 % 2;
            }
            this.f11311v.incrementAndGet();
            final CompositeDisposable compositeDisposable = new CompositeDisposable();
            Observable observableDoFinally = this.f11312w.take(1L).subscribeOn(this.f11310u).observeOn(this.f11310u).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda22
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.getSinglePreviewFrameSynchronous((byte[]) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda23
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.d(compositeDisposable);
                }
            });
            Objects.requireNonNull(consumer);
            compositeDisposable.add(observableDoFinally.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda24
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    consumer.accept((Bitmap) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraPreview$$ExternalSyntheticLambda25
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    CameraPreview.d((Throwable) obj);
                }
            }));
            return;
        }
        throw null;
    }

    public Bitmap getSinglePreviewFrameSynchronous(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = O + 21;
        S = i3 % 128;
        return i3 % 2 == 0 ? BitmapUtils.getRotatedCroppedBitmapFromFrame(getContext(), bArr, this.f11295f.width, this.f11295f.height, 2.0f, 0.0f, this.f11302m) : BitmapUtils.getRotatedCroppedBitmapFromFrame(getContext(), bArr, this.f11295f.width, this.f11295f.height, 1.0f, 1.0f, this.f11302m);
    }

    public void notifyCameraReleased() {
        int i2 = 2 % 2;
        int i3 = O + 43;
        S = i3 % 128;
        int i4 = i3 % 2;
        Timber.v("Camera: setting mCamera to null", new Object[0]);
        this.K.clear();
        this.P = false;
        this.f11313x = null;
        int i5 = O + 111;
        S = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
    }

    public boolean isAutofocusMode() {
        int i2 = 2 % 2;
        int i3 = O + 11;
        S = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = e.c(this.f11313x);
        int i5 = S + 23;
        O = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public /* synthetic */ void e(boolean z2, Camera camera) {
        Object[] objArr = {this, Boolean.valueOf(z2), camera};
        int iD = b.C0229b.AnonymousClass5.d();
        int iD2 = b.C0229b.AnonymousClass5.d();
        a(iD, 1223028375, b.C0229b.AnonymousClass5.d(), objArr, b.C0229b.AnonymousClass5.d(), -1223028373, iD2);
    }

    public /* synthetic */ void b(byte[] bArr, Camera camera) {
        int iD = b.C0229b.AnonymousClass5.d();
        int iD2 = b.C0229b.AnonymousClass5.d();
        int iD3 = b.C0229b.AnonymousClass5.d();
        a(iD, -728064134, b.C0229b.AnonymousClass5.d(), new Object[]{this, bArr, camera}, iD3, 728064138, iD2);
    }

    public /* synthetic */ void e() throws Exception {
        int iD = b.C0229b.AnonymousClass5.d();
        int iD2 = b.C0229b.AnonymousClass5.d();
        int iD3 = b.C0229b.AnonymousClass5.d();
        a(iD, 1678476844, b.C0229b.AnonymousClass5.d(), new Object[]{this}, iD3, -1678476844, iD2);
    }

    public static /* synthetic */ void a() throws Exception {
        int iD = b.C0229b.AnonymousClass5.d();
        int iD2 = b.C0229b.AnonymousClass5.d();
        int iD3 = b.C0229b.AnonymousClass5.d();
        a(iD, -21247654, b.C0229b.AnonymousClass5.d(), new Object[0], iD3, 21247657, iD2);
    }

    private PointF b(PointF pointF) {
        int iD = b.C0229b.AnonymousClass5.d();
        int iD2 = b.C0229b.AnonymousClass5.d();
        int iD3 = b.C0229b.AnonymousClass5.d();
        return (PointF) a(iD, 1022705358, b.C0229b.AnonymousClass5.d(), new Object[]{this, pointF}, iD3, -1022705357, iD2);
    }
}
