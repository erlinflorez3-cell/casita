package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraParametersCallback;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.journeyapps.barcodescanner.camera.CameraSurface;
import com.journeyapps.barcodescanner.camera.CenterCropStrategy;
import com.journeyapps.barcodescanner.camera.DisplayConfiguration;
import com.journeyapps.barcodescanner.camera.FitCenterStrategy;
import com.journeyapps.barcodescanner.camera.FitXYStrategy;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CameraPreview extends ViewGroup {
    private static final int ROTATION_LISTENER_DELAY_MS = 250;
    private static final String TAG = "CameraPreview";
    private CameraInstance cameraInstance;
    private CameraSettings cameraSettings;
    private Size containerSize;
    private Size currentSurfaceSize;
    private DisplayConfiguration displayConfiguration;
    private final StateListener fireState;
    private Rect framingRect;
    private Size framingRectSize;
    private double marginFraction;
    private int openedOrientation;
    private boolean previewActive;
    private Rect previewFramingRect;
    private PreviewScalingStrategy previewScalingStrategy;
    private Size previewSize;
    private RotationCallback rotationCallback;
    private RotationListener rotationListener;
    private final Handler.Callback stateCallback;
    private Handler stateHandler;
    private List<StateListener> stateListeners;
    private final SurfaceHolder.Callback surfaceCallback;
    private Rect surfaceRect;
    private SurfaceView surfaceView;
    private TextureView textureView;
    private boolean torchOn;
    private boolean useTextureView;
    private WindowManager windowManager;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$1 */
    class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            CameraPreview.this.currentSurfaceSize = new Size(i2, i3);
            CameraPreview.this.startPreviewIfReady();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$2 */
    class AnonymousClass2 implements SurfaceHolder.Callback {
        AnonymousClass2() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            if (surfaceHolder == null) {
                String unused = CameraPreview.TAG;
                return;
            }
            CameraPreview.this.currentSurfaceSize = new Size(i3, i4);
            CameraPreview.this.startPreviewIfReady();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.currentSurfaceSize = null;
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$3 */
    class AnonymousClass3 implements Handler.Callback {
        AnonymousClass3() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == R.id.zxing_prewiew_size_ready) {
                CameraPreview.this.previewSized((Size) message.obj);
                return true;
            }
            if (message.what != R.id.zxing_camera_error) {
                if (message.what != R.id.zxing_camera_closed) {
                    return false;
                }
                CameraPreview.this.fireState.cameraClosed();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!CameraPreview.this.isActive()) {
                return false;
            }
            CameraPreview.this.pause();
            CameraPreview.this.fireState.cameraError(exc);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$4 */
    class AnonymousClass4 implements RotationCallback {
        AnonymousClass4() {
        }

        /* JADX INFO: renamed from: lambda$onRotationChanged$0$com-journeyapps-barcodescanner-CameraPreview$4 */
        /* synthetic */ void m8608xa84c9589() {
            CameraPreview.this.rotationChanged();
        }

        @Override // com.journeyapps.barcodescanner.RotationCallback
        public void onRotationChanged(int i2) throws Throwable {
            Handler handler = CameraPreview.this.stateHandler;
            Object[] objArr = {new Runnable() { // from class: com.journeyapps.barcodescanner.CameraPreview$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8608xa84c9589();
                }
            }, 250L};
            Method method = Class.forName(ZO.xd("\u000e+'=\u001cs\u0006V`(Sqw\u000eE|qj", (short) (Od.Xd() ^ (-10884)), (short) (Od.Xd() ^ (-12282)))).getMethod(Ig.wd("c=\u000fk\u0013W\u0007+dDE", (short) (C1633zX.Xd() ^ (-27862))), Class.forName(C1626yg.Ud("\u001b 4?Ey.X9>\u0018^B\u0015W/~A", (short) (FB.Xd() ^ IptcDirectory.TAG_DIGITAL_TIME_CREATED), (short) (FB.Xd() ^ 19019))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$5 */
    class AnonymousClass5 implements StateListener {
        AnonymousClass5() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void cameraClosed() {
            Iterator it = CameraPreview.this.stateListeners.iterator();
            while (it.hasNext()) {
                ((StateListener) it.next()).cameraClosed();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void cameraError(Exception exc) {
            Iterator it = CameraPreview.this.stateListeners.iterator();
            while (it.hasNext()) {
                ((StateListener) it.next()).cameraError(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewSized() {
            Iterator it = CameraPreview.this.stateListeners.iterator();
            while (it.hasNext()) {
                ((StateListener) it.next()).previewSized();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewStarted() {
            Iterator it = CameraPreview.this.stateListeners.iterator();
            while (it.hasNext()) {
                ((StateListener) it.next()).previewStarted();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewStopped() {
            Iterator it = CameraPreview.this.stateListeners.iterator();
            while (it.hasNext()) {
                ((StateListener) it.next()).previewStopped();
            }
        }
    }

    public interface StateListener {
        void cameraClosed();

        void cameraError(Exception exc);

        void previewSized();

        void previewStarted();

        void previewStopped();
    }

    public CameraPreview(Context context) throws Throwable {
        super(context);
        this.useTextureView = false;
        this.previewActive = false;
        this.openedOrientation = -1;
        this.stateListeners = new ArrayList();
        this.cameraSettings = new CameraSettings();
        this.framingRect = null;
        this.previewFramingRect = null;
        this.framingRectSize = null;
        this.marginFraction = 0.1d;
        this.previewScalingStrategy = null;
        this.torchOn = false;
        this.surfaceCallback = new SurfaceHolder.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.2
            AnonymousClass2() {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                if (surfaceHolder == null) {
                    String unused = CameraPreview.TAG;
                    return;
                }
                CameraPreview.this.currentSurfaceSize = new Size(i3, i4);
                CameraPreview.this.startPreviewIfReady();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.this.currentSurfaceSize = null;
            }
        };
        this.stateCallback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.3
            AnonymousClass3() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_prewiew_size_ready) {
                    CameraPreview.this.previewSized((Size) message.obj);
                    return true;
                }
                if (message.what != R.id.zxing_camera_error) {
                    if (message.what != R.id.zxing_camera_closed) {
                        return false;
                    }
                    CameraPreview.this.fireState.cameraClosed();
                    return false;
                }
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.isActive()) {
                    return false;
                }
                CameraPreview.this.pause();
                CameraPreview.this.fireState.cameraError(exc);
                return false;
            }
        };
        this.rotationCallback = new AnonymousClass4();
        this.fireState = new StateListener() { // from class: com.journeyapps.barcodescanner.CameraPreview.5
            AnonymousClass5() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraClosed() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).cameraClosed();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraError(Exception exc) {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).cameraError(exc);
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewSized() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewSized();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStarted() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewStarted();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStopped() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewStopped();
                }
            }
        };
        initialize(context, null, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.useTextureView = false;
        this.previewActive = false;
        this.openedOrientation = -1;
        this.stateListeners = new ArrayList();
        this.cameraSettings = new CameraSettings();
        this.framingRect = null;
        this.previewFramingRect = null;
        this.framingRectSize = null;
        this.marginFraction = 0.1d;
        this.previewScalingStrategy = null;
        this.torchOn = false;
        this.surfaceCallback = new SurfaceHolder.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.2
            AnonymousClass2() {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                if (surfaceHolder == null) {
                    String unused = CameraPreview.TAG;
                    return;
                }
                CameraPreview.this.currentSurfaceSize = new Size(i3, i4);
                CameraPreview.this.startPreviewIfReady();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.this.currentSurfaceSize = null;
            }
        };
        this.stateCallback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.3
            AnonymousClass3() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_prewiew_size_ready) {
                    CameraPreview.this.previewSized((Size) message.obj);
                    return true;
                }
                if (message.what != R.id.zxing_camera_error) {
                    if (message.what != R.id.zxing_camera_closed) {
                        return false;
                    }
                    CameraPreview.this.fireState.cameraClosed();
                    return false;
                }
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.isActive()) {
                    return false;
                }
                CameraPreview.this.pause();
                CameraPreview.this.fireState.cameraError(exc);
                return false;
            }
        };
        this.rotationCallback = new AnonymousClass4();
        this.fireState = new StateListener() { // from class: com.journeyapps.barcodescanner.CameraPreview.5
            AnonymousClass5() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraClosed() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).cameraClosed();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraError(Exception exc) {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).cameraError(exc);
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewSized() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewSized();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStarted() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewStarted();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStopped() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewStopped();
                }
            }
        };
        initialize(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.useTextureView = false;
        this.previewActive = false;
        this.openedOrientation = -1;
        this.stateListeners = new ArrayList();
        this.cameraSettings = new CameraSettings();
        this.framingRect = null;
        this.previewFramingRect = null;
        this.framingRectSize = null;
        this.marginFraction = 0.1d;
        this.previewScalingStrategy = null;
        this.torchOn = false;
        this.surfaceCallback = new SurfaceHolder.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.2
            AnonymousClass2() {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i22, int i3, int i4) {
                if (surfaceHolder == null) {
                    String unused = CameraPreview.TAG;
                    return;
                }
                CameraPreview.this.currentSurfaceSize = new Size(i3, i4);
                CameraPreview.this.startPreviewIfReady();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.this.currentSurfaceSize = null;
            }
        };
        this.stateCallback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.3
            AnonymousClass3() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_prewiew_size_ready) {
                    CameraPreview.this.previewSized((Size) message.obj);
                    return true;
                }
                if (message.what != R.id.zxing_camera_error) {
                    if (message.what != R.id.zxing_camera_closed) {
                        return false;
                    }
                    CameraPreview.this.fireState.cameraClosed();
                    return false;
                }
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.isActive()) {
                    return false;
                }
                CameraPreview.this.pause();
                CameraPreview.this.fireState.cameraError(exc);
                return false;
            }
        };
        this.rotationCallback = new AnonymousClass4();
        this.fireState = new StateListener() { // from class: com.journeyapps.barcodescanner.CameraPreview.5
            AnonymousClass5() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraClosed() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).cameraClosed();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraError(Exception exc) {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).cameraError(exc);
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewSized() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewSized();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStarted() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewStarted();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStopped() {
                Iterator it = CameraPreview.this.stateListeners.iterator();
                while (it.hasNext()) {
                    ((StateListener) it.next()).previewStopped();
                }
            }
        };
        initialize(context, attributeSet, i2, 0);
    }

    private void calculateFrames() {
        Size size;
        if (this.containerSize == null || (size = this.previewSize) == null || this.displayConfiguration == null) {
            this.previewFramingRect = null;
            this.framingRect = null;
            this.surfaceRect = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i2 = size.width;
        int i3 = this.previewSize.height;
        int i4 = this.containerSize.width;
        int i5 = this.containerSize.height;
        Rect rectScalePreview = this.displayConfiguration.scalePreview(this.previewSize);
        if (rectScalePreview.width() <= 0 || rectScalePreview.height() <= 0) {
            return;
        }
        this.surfaceRect = rectScalePreview;
        this.framingRect = calculateFramingRect(new Rect(0, 0, i4, i5), this.surfaceRect);
        Rect rect = new Rect(this.framingRect);
        rect.offset(-this.surfaceRect.left, -this.surfaceRect.top);
        Rect rect2 = new Rect((rect.left * i2) / this.surfaceRect.width(), (rect.top * i3) / this.surfaceRect.height(), (rect.right * i2) / this.surfaceRect.width(), (rect.bottom * i3) / this.surfaceRect.height());
        this.previewFramingRect = rect2;
        if (rect2.width() > 0 && this.previewFramingRect.height() > 0) {
            this.fireState.previewSized();
            return;
        }
        this.previewFramingRect = null;
        this.framingRect = null;
        String str = TAG;
    }

    private void containerSized(Size size) {
        this.containerSize = size;
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance == null || cameraInstance.getDisplayConfiguration() != null) {
            return;
        }
        DisplayConfiguration displayConfiguration = new DisplayConfiguration(getDisplayRotation(), size);
        this.displayConfiguration = displayConfiguration;
        displayConfiguration.setPreviewScalingStrategy(getPreviewScalingStrategy());
        this.cameraInstance.setDisplayConfiguration(this.displayConfiguration);
        this.cameraInstance.configureCamera();
        boolean z2 = this.torchOn;
        if (z2) {
            this.cameraInstance.setTorch(z2);
        }
    }

    private int getDisplayRotation() {
        return this.windowManager.getDefaultDisplay().getRotation();
    }

    private void initCamera() {
        if (this.cameraInstance != null) {
            String str = TAG;
            return;
        }
        CameraInstance cameraInstanceCreateCameraInstance = createCameraInstance();
        this.cameraInstance = cameraInstanceCreateCameraInstance;
        cameraInstanceCreateCameraInstance.setReadyHandler(this.stateHandler);
        this.cameraInstance.open();
        this.openedOrientation = getDisplayRotation();
    }

    private void initialize(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        if (getBackground() == null) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        initializeAttributes(attributeSet);
        String strKd = Qg.kd("\u000b{\u007ft~\u0006", (short) (C1633zX.Xd() ^ (-7194)), (short) (C1633zX.Xd() ^ (-9111)));
        Class<?> cls = Class.forName(hg.Vd("\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eFZ\u0006\u0004\tx\u000b\u0006", (short) (C1580rY.Xd() ^ (-10291)), (short) (C1580rY.Xd() ^ (-13421))));
        Class<?>[] clsArr = {Class.forName(C1561oA.ud("* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018", (short) (Od.Xd() ^ (-18644))))};
        Object[] objArr = {strKd};
        short sXd = (short) (FB.Xd() ^ 3092);
        int[] iArr = new int["VSa?d]]MdIZfi[TU".length()];
        QB qb = new QB("VSa?d]]MdIZfi[TU");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            this.windowManager = (WindowManager) method.invoke(context, objArr);
            this.stateHandler = new Handler(this.stateCallback);
            this.rotationListener = new RotationListener();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void previewSized(Size size) {
        this.previewSize = size;
        if (this.containerSize != null) {
            calculateFrames();
            requestLayout();
            startPreviewIfReady();
        }
    }

    public void rotationChanged() {
        if (!isActive() || getDisplayRotation() == this.openedOrientation) {
            return;
        }
        pause();
        resume();
    }

    private void setupSurfaceView() {
        if (this.useTextureView) {
            TextureView textureView = new TextureView(getContext());
            this.textureView = textureView;
            textureView.setSurfaceTextureListener(surfaceTextureListener());
            addView(this.textureView);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        surfaceView.getHolder().addCallback(this.surfaceCallback);
        addView(this.surfaceView);
    }

    private void startCameraPreview(CameraSurface cameraSurface) {
        if (this.previewActive || this.cameraInstance == null) {
            return;
        }
        String str = TAG;
        this.cameraInstance.setSurface(cameraSurface);
        this.cameraInstance.startPreview();
        this.previewActive = true;
        previewStarted();
        this.fireState.previewStarted();
    }

    public void startPreviewIfReady() {
        Size size = this.currentSurfaceSize;
        if (size == null || this.previewSize == null || this.surfaceRect == null) {
            return;
        }
        if (this.surfaceView != null && size.equals(new Size(this.surfaceRect.width(), this.surfaceRect.height()))) {
            startCameraPreview(new CameraSurface(this.surfaceView.getHolder()));
            return;
        }
        TextureView textureView = this.textureView;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.previewSize != null) {
            this.textureView.setTransform(calculateTextureTransform(new Size(this.textureView.getWidth(), this.textureView.getHeight()), this.previewSize));
        }
        startCameraPreview(new CameraSurface(this.textureView.getSurfaceTexture()));
    }

    private TextureView.SurfaceTextureListener surfaceTextureListener() {
        return new TextureView.SurfaceTextureListener() { // from class: com.journeyapps.barcodescanner.CameraPreview.1
            AnonymousClass1() {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                CameraPreview.this.currentSurfaceSize = new Size(i2, i3);
                CameraPreview.this.startPreviewIfReady();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
    }

    public void addStateListener(StateListener stateListener) {
        this.stateListeners.add(stateListener);
    }

    protected Rect calculateFramingRect(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.framingRectSize != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.framingRectSize.width) / 2), Math.max(0, (rect3.height() - this.framingRectSize.height) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(((double) rect3.width()) * this.marginFraction, ((double) rect3.height()) * this.marginFraction);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected Matrix calculateTextureTransform(Size size, Size size2) {
        float f2;
        float f3 = size.width / size.height;
        float f4 = size2.width / size2.height;
        float f5 = 1.0f;
        if (f3 < f4) {
            float f6 = f4 / f3;
            f2 = 1.0f;
            f5 = f6;
        } else {
            f2 = f3 / f4;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f2);
        matrix.postTranslate((size.width - (size.width * f5)) / 2.0f, (size.height - (size.height * f2)) / 2.0f);
        return matrix;
    }

    public void changeCameraParameters(CameraParametersCallback cameraParametersCallback) {
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null) {
            cameraInstance.changeCameraParameters(cameraParametersCallback);
        }
    }

    protected CameraInstance createCameraInstance() {
        CameraInstance cameraInstance = new CameraInstance(getContext());
        cameraInstance.setCameraSettings(this.cameraSettings);
        return cameraInstance;
    }

    public CameraInstance getCameraInstance() {
        return this.cameraInstance;
    }

    public CameraSettings getCameraSettings() {
        return this.cameraSettings;
    }

    public Rect getFramingRect() {
        return this.framingRect;
    }

    public Size getFramingRectSize() {
        return this.framingRectSize;
    }

    public double getMarginFraction() {
        return this.marginFraction;
    }

    public Rect getPreviewFramingRect() {
        return this.previewFramingRect;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        PreviewScalingStrategy previewScalingStrategy = this.previewScalingStrategy;
        return previewScalingStrategy != null ? previewScalingStrategy : this.textureView != null ? new CenterCropStrategy() : new FitCenterStrategy();
    }

    public Size getPreviewSize() {
        return this.previewSize;
    }

    protected void initializeAttributes(AttributeSet attributeSet) throws Throwable {
        Context context = getContext();
        int[] iArr = R.styleable.zxing_camera_preview;
        short sXd = (short) (OY.Xd() ^ 7506);
        int[] iArr2 = new int["\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<".length()];
        QB qb = new QB("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i2));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (ZN.Xd() ^ 23559);
        short sXd3 = (short) (ZN.Xd() ^ 31179);
        int[] iArr3 = new int["UcZigb^)qqgk.Bvwvnh||n]p\u0001".length()];
        QB qb2 = new QB("UcZigb^)qqgk.Bvwvnh||n]p\u0001");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr3[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i3));
        clsArr[1] = int[].class;
        Object[] objArr = {attributeSet, iArr};
        Method method = cls.getMethod(Jg.Wd("X\n@=IngHatq\u0001\u007f3\b&1*ap%S", (short) (C1499aX.Xd() ^ (-18587)), (short) (C1499aX.Xd() ^ (-6809))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int dimension = (int) typedArray.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
            int dimension2 = (int) typedArray.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
            if (dimension > 0 && dimension2 > 0) {
                this.framingRectSize = new Size(dimension, dimension2);
            }
            this.useTextureView = typedArray.getBoolean(R.styleable.zxing_camera_preview_zxing_use_texture_view, true);
            int integer = typedArray.getInteger(R.styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
            if (integer == 1) {
                this.previewScalingStrategy = new CenterCropStrategy();
            } else if (integer == 2) {
                this.previewScalingStrategy = new FitCenterStrategy();
            } else if (integer == 3) {
                this.previewScalingStrategy = new FitXYStrategy();
            }
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected boolean isActive() {
        return this.cameraInstance != null;
    }

    public boolean isCameraClosed() {
        CameraInstance cameraInstance = this.cameraInstance;
        return cameraInstance == null || cameraInstance.isCameraClosed();
    }

    public boolean isPreviewActive() {
        return this.previewActive;
    }

    public boolean isUseTextureView() {
        return this.useTextureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupSurfaceView();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        containerSized(new Size(i4 - i2, i5 - i3));
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView == null) {
            TextureView textureView = this.textureView;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.surfaceRect;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, this.surfaceRect.top, this.surfaceRect.right, this.surfaceRect.bottom);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.torchOn);
        return bundle;
    }

    public void pause() {
        TextureView textureView;
        SurfaceView surfaceView;
        Util.validateMainThread();
        String str = TAG;
        this.openedOrientation = -1;
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null) {
            cameraInstance.close();
            this.cameraInstance = null;
            this.previewActive = false;
        } else {
            this.stateHandler.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.currentSurfaceSize == null && (surfaceView = this.surfaceView) != null) {
            surfaceView.getHolder().removeCallback(this.surfaceCallback);
        }
        if (this.currentSurfaceSize == null && (textureView = this.textureView) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.containerSize = null;
        this.previewSize = null;
        this.previewFramingRect = null;
        this.rotationListener.stop();
        this.fireState.previewStopped();
    }

    public void pauseAndWait() {
        CameraInstance cameraInstance = getCameraInstance();
        pause();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.isCameraClosed() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    protected void previewStarted() {
    }

    public void resume() {
        Util.validateMainThread();
        String str = TAG;
        initCamera();
        if (this.currentSurfaceSize != null) {
            startPreviewIfReady();
        } else {
            SurfaceView surfaceView = this.surfaceView;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.surfaceCallback);
            } else {
                TextureView textureView = this.textureView;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        surfaceTextureListener().onSurfaceTextureAvailable(this.textureView.getSurfaceTexture(), this.textureView.getWidth(), this.textureView.getHeight());
                    } else {
                        this.textureView.setSurfaceTextureListener(surfaceTextureListener());
                    }
                }
            }
        }
        requestLayout();
        this.rotationListener.listen(getContext(), this.rotationCallback);
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.cameraSettings = cameraSettings;
    }

    public void setFramingRectSize(Size size) {
        this.framingRectSize = size;
    }

    public void setMarginFraction(double d2) {
        if (d2 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.marginFraction = d2;
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy) {
        this.previewScalingStrategy = previewScalingStrategy;
    }

    public void setTorch(boolean z2) {
        this.torchOn = z2;
        CameraInstance cameraInstance = this.cameraInstance;
        if (cameraInstance != null) {
            cameraInstance.setTorch(z2);
        }
    }

    public void setUseTextureView(boolean z2) {
        this.useTextureView = z2;
    }
}
