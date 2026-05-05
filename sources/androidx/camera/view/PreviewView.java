package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewViewImplementation;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.transform.OutputTransform;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    static final int DEFAULT_BACKGROUND_COLOR = 17170444;
    private static final ImplementationMode DEFAULT_IMPL_MODE = ImplementationMode.PERFORMANCE;
    private static final String TAG = "PreviewView";
    final AtomicReference<PreviewStreamStateObserver> mActiveStreamStateObserver;
    CameraController mCameraController;
    CameraInfoInternal mCameraInfoInternal;
    private final DisplayRotationListener mDisplayRotationListener;
    PreviewViewImplementation mImplementation;
    ImplementationMode mImplementationMode;
    OnFrameUpdateListener mOnFrameUpdateListener;
    Executor mOnFrameUpdateListenerExecutor;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;
    final MutableLiveData<StreamState> mPreviewStreamStateLiveData;
    final PreviewTransformation mPreviewTransform;
    PreviewViewMeteringPointFactory mPreviewViewMeteringPointFactory;
    final ScreenFlashView mScreenFlashView;
    final Preview.SurfaceProvider mSurfaceProvider;
    private MotionEvent mTouchUpEvent;
    boolean mUseDisplayRotation;
    private final ZoomGestureDetector mZoomGestureDetector;

    public interface OnFrameUpdateListener {
        void onFrameUpdate(long j2);
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-camera-view-PreviewView */
    /* synthetic */ void m334lambda$new$0$androidxcameraviewPreviewView(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i4 - i2 == i8 - i6 && i5 - i3 == i9 - i7) {
            return;
        }
        redrawPreview();
        attachToControllerIfReady(true);
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$1 */
    class AnonymousClass1 implements Preview.SurfaceProvider {
        AnonymousClass1() {
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        public void onSurfaceRequested(final SurfaceRequest surfaceRequest) {
            PreviewViewImplementation surfaceViewImplementation;
            if (!Threads.isMainThread()) {
                ContextCompat.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m336lambda$onSurfaceRequested$0$androidxcameraviewPreviewView$1(surfaceRequest);
                    }
                });
                return;
            }
            Logger.d(PreviewView.TAG, "Surface requested by Preview.");
            final CameraInternal camera = surfaceRequest.getCamera();
            PreviewView.this.mCameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView.this.mPreviewViewMeteringPointFactory.setSensorRect(camera.getCameraControlInternal().getSensorRect());
            surfaceRequest.setTransformationInfoListener(ContextCompat.getMainExecutor(PreviewView.this.getContext()), new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                    this.f$0.m337lambda$onSurfaceRequested$1$androidxcameraviewPreviewView$1(camera, surfaceRequest, transformationInfo);
                }
            });
            if (!PreviewView.shouldReuseImplementation(PreviewView.this.mImplementation, surfaceRequest, PreviewView.this.mImplementationMode)) {
                PreviewView previewView = PreviewView.this;
                if (PreviewView.shouldUseTextureView(surfaceRequest, previewView.mImplementationMode)) {
                    PreviewView previewView2 = PreviewView.this;
                    surfaceViewImplementation = new TextureViewImplementation(previewView2, previewView2.mPreviewTransform);
                } else {
                    PreviewView previewView3 = PreviewView.this;
                    surfaceViewImplementation = new SurfaceViewImplementation(previewView3, previewView3.mPreviewTransform);
                }
                previewView.mImplementation = surfaceViewImplementation;
            }
            final PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(camera.getCameraInfoInternal(), PreviewView.this.mPreviewStreamStateLiveData, PreviewView.this.mImplementation);
            PreviewView.this.mActiveStreamStateObserver.set(previewStreamStateObserver);
            camera.getCameraState().addObserver(ContextCompat.getMainExecutor(PreviewView.this.getContext()), previewStreamStateObserver);
            PreviewView.this.mImplementation.onSurfaceRequested(surfaceRequest, new PreviewViewImplementation.OnSurfaceNotInUseListener() { // from class: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda3
                @Override // androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener
                public final void onSurfaceNotInUse() {
                    this.f$0.m338lambda$onSurfaceRequested$2$androidxcameraviewPreviewView$1(previewStreamStateObserver, camera);
                }
            });
            PreviewView previewView4 = PreviewView.this;
            if (previewView4.indexOfChild(previewView4.mScreenFlashView) == -1) {
                PreviewView previewView5 = PreviewView.this;
                previewView5.addView(previewView5.mScreenFlashView);
            }
            if (PreviewView.this.mOnFrameUpdateListener == null || PreviewView.this.mOnFrameUpdateListenerExecutor == null) {
                return;
            }
            PreviewView.this.mImplementation.setFrameUpdateListener(PreviewView.this.mOnFrameUpdateListenerExecutor, PreviewView.this.mOnFrameUpdateListener);
        }

        /* JADX INFO: renamed from: lambda$onSurfaceRequested$0$androidx-camera-view-PreviewView$1 */
        /* synthetic */ void m336lambda$onSurfaceRequested$0$androidxcameraviewPreviewView$1(SurfaceRequest surfaceRequest) {
            PreviewView.this.mSurfaceProvider.onSurfaceRequested(surfaceRequest);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
        /* JADX INFO: renamed from: lambda$onSurfaceRequested$1$androidx-camera-view-PreviewView$1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        /* synthetic */ void m337lambda$onSurfaceRequested$1$androidxcameraviewPreviewView$1(androidx.camera.core.impl.CameraInternal r6, androidx.camera.core.SurfaceRequest r7, androidx.camera.core.SurfaceRequest.TransformationInfo r8) {
            /*
                r5 = this;
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "Preview transformation info updated. "
                r1.<init>(r0)
                java.lang.StringBuilder r0 = r1.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "PreviewView"
                androidx.camera.core.Logger.d(r1, r0)
                androidx.camera.core.impl.CameraInfoInternal r0 = r6.getCameraInfoInternal()
                int r0 = r0.getLensFacing()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3 = 0
                r2 = 1
                if (r0 != 0) goto L59
                java.lang.String r0 = "The lens facing is null, probably an external."
                androidx.camera.core.Logger.w(r1, r0)
            L29:
                r4 = r2
            L2a:
                androidx.camera.view.PreviewView r0 = androidx.camera.view.PreviewView.this
                androidx.camera.view.PreviewTransformation r1 = r0.mPreviewTransform
                android.util.Size r0 = r7.getResolution()
                r1.setTransformationInfo(r8, r0, r4)
                int r1 = r8.getTargetRotation()
                r0 = -1
                if (r1 == r0) goto L4a
                androidx.camera.view.PreviewView r0 = androidx.camera.view.PreviewView.this
                androidx.camera.view.PreviewViewImplementation r0 = r0.mImplementation
                if (r0 == 0) goto L54
                androidx.camera.view.PreviewView r0 = androidx.camera.view.PreviewView.this
                androidx.camera.view.PreviewViewImplementation r0 = r0.mImplementation
                boolean r0 = r0 instanceof androidx.camera.view.SurfaceViewImplementation
                if (r0 == 0) goto L54
            L4a:
                androidx.camera.view.PreviewView r0 = androidx.camera.view.PreviewView.this
                r0.mUseDisplayRotation = r2
            L4e:
                androidx.camera.view.PreviewView r0 = androidx.camera.view.PreviewView.this
                r0.redrawPreview()
                return
            L54:
                androidx.camera.view.PreviewView r0 = androidx.camera.view.PreviewView.this
                r0.mUseDisplayRotation = r3
                goto L4e
            L59:
                int r0 = r0.intValue()
                if (r0 != 0) goto L60
                goto L29
            L60:
                r4 = r3
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.AnonymousClass1.m337lambda$onSurfaceRequested$1$androidxcameraviewPreviewView$1(androidx.camera.core.impl.CameraInternal, androidx.camera.core.SurfaceRequest, androidx.camera.core.SurfaceRequest$TransformationInfo):void");
        }

        /* JADX INFO: renamed from: lambda$onSurfaceRequested$2$androidx-camera-view-PreviewView$1 */
        /* synthetic */ void m338lambda$onSurfaceRequested$2$androidxcameraviewPreviewView$1(PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(PreviewView.this.mActiveStreamStateObserver, previewStreamStateObserver, null)) {
                previewStreamStateObserver.updatePreviewStreamState(StreamState.IDLE);
            }
            previewStreamStateObserver.clear();
            cameraInternal.getCameraState().removeObserver(previewStreamStateObserver);
        }
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(context, attributeSet, i2, i3);
        ImplementationMode implementationMode = DEFAULT_IMPL_MODE;
        this.mImplementationMode = implementationMode;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        this.mPreviewTransform = previewTransformation;
        this.mUseDisplayRotation = true;
        this.mPreviewStreamStateLiveData = new MutableLiveData<>(StreamState.IDLE);
        this.mActiveStreamStateObserver = new AtomicReference<>();
        this.mPreviewViewMeteringPointFactory = new PreviewViewMeteringPointFactory(previewTransformation);
        this.mDisplayRotationListener = new DisplayRotationListener();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.PreviewView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                this.f$0.m334lambda$new$0$androidxcameraviewPreviewView(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        };
        this.mSurfaceProvider = new AnonymousClass1();
        Threads.checkMainThread();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("p0\u0012\u0006 m\u0003S9ij\u000f0?eI\u00057nX\nIW", (short) (C1580rY.Xd() ^ (-24168)))).getMethod(EO.Od("\u0007:9s\u0012Ci\u0014", (short) (ZN.Xd() ^ 15318)), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(attributeSet, R.styleable.PreviewView, i2, i3);
            ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.PreviewView, attributeSet, typedArrayObtainStyledAttributes, i2, i3);
            try {
                setScaleType(ScaleType.fromId(typedArrayObtainStyledAttributes.getInteger(R.styleable.PreviewView_scaleType, previewTransformation.getScaleType().getId())));
                setImplementationMode(ImplementationMode.fromId(typedArrayObtainStyledAttributes.getInteger(R.styleable.PreviewView_implementationMode, implementationMode.getId())));
                typedArrayObtainStyledAttributes.recycle();
                this.mZoomGestureDetector = new ZoomGestureDetector(context, new ZoomGestureDetector.OnZoomGestureListener() { // from class: androidx.camera.view.PreviewView$$ExternalSyntheticLambda1
                    @Override // androidx.camera.view.impl.ZoomGestureDetector.OnZoomGestureListener
                    public final boolean onZoomEvent(ZoomGestureDetector.ZoomEvent zoomEvent) {
                        return this.f$0.m335lambda$new$1$androidxcameraviewPreviewView(zoomEvent);
                    }
                });
                if (getBackground() == null) {
                    setBackgroundColor(ContextCompat.getColor(getContext(), 17170444));
                }
                ScreenFlashView screenFlashView = new ScreenFlashView(context);
                this.mScreenFlashView = screenFlashView;
                screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-camera-view-PreviewView */
    /* synthetic */ boolean m335lambda$new$1$androidxcameraviewPreviewView(ZoomGestureDetector.ZoomEvent zoomEvent) {
        CameraController cameraController;
        if (!(zoomEvent instanceof ZoomGestureDetector.ZoomEvent.Move) || (cameraController = this.mCameraController) == null) {
            return true;
        }
        cameraController.onPinchToZoom(((ZoomGestureDetector.ZoomEvent.Move) zoomEvent).getIncrementalScaleFactor());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Throwable {
        super.onAttachedToWindow();
        startListeningToDisplayChange();
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onAttachedToWindow();
        }
        attachToControllerIfReady(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws Throwable {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onDetachedFromWindow();
        }
        CameraController cameraController = this.mCameraController;
        if (cameraController != null) {
            cameraController.clearPreviewSurface();
        }
        stopListeningToDisplayChange();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mCameraController == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = motionEvent.getPointerCount() == 1;
        boolean z3 = motionEvent.getAction() == 1;
        boolean z4 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z2 || !z3 || !z4) {
            return this.mZoomGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.mTouchUpEvent = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.mCameraController != null) {
            MotionEvent motionEvent = this.mTouchUpEvent;
            float x2 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.mTouchUpEvent;
            this.mCameraController.onTapToFocus(this.mPreviewViewMeteringPointFactory, x2, motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f);
        }
        this.mTouchUpEvent = null;
        return super.performClick();
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.mImplementationMode = implementationMode;
        if (implementationMode == ImplementationMode.PERFORMANCE && this.mOnFrameUpdateListener != null) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.mImplementationMode;
    }

    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    public void setScaleType(ScaleType scaleType) {
        Threads.checkMainThread();
        this.mPreviewTransform.setScaleType(scaleType);
        redrawPreview();
        attachToControllerIfReady(false);
    }

    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.mPreviewTransform.getScaleType();
    }

    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.mPreviewViewMeteringPointFactory;
    }

    public LiveData<StreamState> getPreviewStreamState() {
        return this.mPreviewStreamStateLiveData;
    }

    public Bitmap getBitmap() {
        Threads.checkMainThread();
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation == null) {
            return null;
        }
        return previewViewImplementation.getBitmap();
    }

    public ViewPort getViewPort() {
        Threads.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        return getViewPort(getDisplay().getRotation());
    }

    public ViewPort getViewPort(int i2) {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), i2).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i2;
    }

    void redrawPreview() {
        Threads.checkMainThread();
        if (this.mImplementation != null) {
            updateDisplayRotationIfNeeded();
            this.mImplementation.redrawPreview();
        }
        this.mPreviewViewMeteringPointFactory.recalculate(new Size(getWidth(), getHeight()), getLayoutDirection());
        CameraController cameraController = this.mCameraController;
        if (cameraController != null) {
            cameraController.updatePreviewViewTransform(getSensorToViewTransform());
        }
    }

    static boolean shouldReuseImplementation(PreviewViewImplementation previewViewImplementation, SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        return (previewViewImplementation instanceof SurfaceViewImplementation) && !shouldUseTextureView(surfaceRequest, implementationMode);
    }

    static boolean shouldUseTextureView(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean zEquals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        boolean z2 = (DeviceQuirks.get(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.get(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z2) {
            return true;
        }
        int iOrdinal = implementationMode.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    void updateDisplayRotationIfNeeded() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        if (!this.mUseDisplayRotation || (display = getDisplay()) == null || (cameraInfoInternal = this.mCameraInfoInternal) == null) {
            return;
        }
        this.mPreviewTransform.overrideWithDisplayRotation(cameraInfoInternal.getSensorRotationDegrees(display.getRotation()), display.getRotation());
    }

    public void setFrameUpdateListener(Executor executor, OnFrameUpdateListener onFrameUpdateListener) {
        if (this.mImplementationMode == ImplementationMode.PERFORMANCE) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.mOnFrameUpdateListener = onFrameUpdateListener;
        this.mOnFrameUpdateListenerExecutor = executor;
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.setFrameUpdateListener(executor, onFrameUpdateListener);
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        ImplementationMode(int i2) {
            this.mId = i2;
        }

        int getId() {
            return this.mId;
        }

        static ImplementationMode fromId(int i2) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i2) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i2);
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        ScaleType(int i2) {
            this.mId = i2;
        }

        int getId() {
            return this.mId;
        }

        static ScaleType fromId(int i2) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i2) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i2);
        }
    }

    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
        CameraController cameraController2 = this.mCameraController;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.clearPreviewSurface();
            setScreenFlashUiInfo(null);
        }
        this.mCameraController = cameraController;
        attachToControllerIfReady(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public CameraController getController() {
        Threads.checkMainThread();
        return this.mCameraController;
    }

    public OutputTransform getOutputTransform() {
        Matrix surfaceToPreviewViewMatrix;
        Threads.checkMainThread();
        try {
            surfaceToPreviewViewMatrix = this.mPreviewTransform.getSurfaceToPreviewViewMatrix(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            surfaceToPreviewViewMatrix = null;
        }
        Rect surfaceCropRect = this.mPreviewTransform.getSurfaceCropRect();
        if (surfaceToPreviewViewMatrix == null || surfaceCropRect == null) {
            Logger.d(TAG, "Transform info is not ready");
            return null;
        }
        surfaceToPreviewViewMatrix.preConcat(TransformUtils.getNormalizedToBuffer(surfaceCropRect));
        if (this.mImplementation instanceof TextureViewImplementation) {
            surfaceToPreviewViewMatrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            Logger.w(TAG, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new OutputTransform(surfaceToPreviewViewMatrix, new Size(surfaceCropRect.width(), surfaceCropRect.height()));
    }

    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.mPreviewTransform.getSensorToViewTransform(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    private void attachToControllerIfReady(boolean z2) {
        Threads.checkMainThread();
        ViewPort viewPort = getViewPort();
        if (this.mCameraController != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.mCameraController.attachPreviewSurface(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e2) {
                if (!z2) {
                    throw e2;
                }
                Logger.e(TAG, e2.toString(), e2);
            }
        }
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        CameraController cameraController = this.mCameraController;
        if (cameraController == null) {
            Logger.d(TAG, "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cameraController.setScreenFlashUiInfo(new ScreenFlashUiInfo(ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW, screenFlash));
        }
    }

    private void startListeningToDisplayChange() throws Throwable {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        DisplayRotationListener displayRotationListener = this.mDisplayRotationListener;
        short sXd = (short) (C1499aX.Xd() ^ (-28328));
        int[] iArr = new int["\u001a&\u001b(,%\u001fg #\\y$##\u0017;".length()];
        QB qb = new QB("\u001a&\u001b(,%\u001fg #\\y$##\u0017;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("\u001e\u001b)\u0001\u0014\u001b\u001f{\u001e\u001d\u001d\u0011\u001d", (short) (C1607wl.Xd() ^ 20781), (short) (C1607wl.Xd() ^ 6650)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            displayManager.registerDisplayListener(displayRotationListener, new Handler((Looper) declaredMethod.invoke(null, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void stopListeningToDisplayChange() throws Throwable {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.mDisplayRotationListener);
    }

    private DisplayManager getDisplayManager() throws Throwable {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v", (short) (Od.Xd() ^ (-11842)))).getMethod(C1593ug.zd("~}\u000e[\f\r\n\b\u0003\u0002\u0016\f\u0013\u0013h\u0016\u0016\u001d\u000f# ", (short) (C1607wl.Xd() ^ 14565), (short) (C1607wl.Xd() ^ 10061)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd = (short) (C1580rY.Xd() ^ (-5091));
            int[] iArr = new int["LPYUPD[".length()];
            QB qb = new QB("LPYUPD[");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = {new String(iArr, 0, i2)};
            Method method2 = Class.forName(C1561oA.Kd("\u0012 \u0017&$\u001f\u001be\u001c))0\",3m\u0004118*>;", (short) (C1633zX.Xd() ^ (-20469)))).getMethod(C1561oA.Xd("HGW7^Y[MV=P^cWRU", (short) (FB.Xd() ^ 12689)), Class.forName(Wg.Zd("0zW\u00137\u0006\u0002^0\u0007so|{Q\"", (short) (C1499aX.Xd() ^ (-2638)), (short) (C1499aX.Xd() ^ (-6668)))));
            try {
                method2.setAccessible(true);
                return (DisplayManager) method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        this.mScreenFlashView.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    private ImageCapture.ScreenFlash getScreenFlashInternal() {
        return this.mScreenFlashView.getScreenFlash();
    }

    public ImageCapture.ScreenFlash getScreenFlash() {
        return getScreenFlashInternal();
    }

    public void setScreenFlashOverlayColor(int i2) {
        this.mScreenFlashView.setBackgroundColor(i2);
    }

    class DisplayRotationListener implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i2) {
                return;
            }
            PreviewView.this.redrawPreview();
        }
    }
}
