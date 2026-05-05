package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.Util;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class CameraInstance {
    private static final String TAG = "CameraInstance";
    private CameraManager cameraManager;
    private CameraThread cameraThread;
    private DisplayConfiguration displayConfiguration;
    private Handler mainHandler;
    private Handler readyHandler;
    private CameraSurface surface;
    private boolean open = false;
    private boolean cameraClosed = true;
    private CameraSettings cameraSettings = new CameraSettings();
    private Runnable opener = new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = CameraInstance.TAG;
                CameraInstance.this.cameraManager.open();
            } catch (Exception e2) {
                CameraInstance.this.notifyError(e2);
                String unused2 = CameraInstance.TAG;
            }
        }
    };
    private Runnable configure = new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = CameraInstance.TAG;
                CameraInstance.this.cameraManager.configure();
                if (CameraInstance.this.readyHandler != null) {
                    CameraInstance.this.readyHandler.obtainMessage(R.id.zxing_prewiew_size_ready, CameraInstance.this.getPreviewSize()).sendToTarget();
                }
            } catch (Exception e2) {
                CameraInstance.this.notifyError(e2);
                String unused2 = CameraInstance.TAG;
            }
        }
    };
    private Runnable previewStarter = new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance.3
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = CameraInstance.TAG;
                CameraInstance.this.cameraManager.setPreviewDisplay(CameraInstance.this.surface);
                CameraInstance.this.cameraManager.startPreview();
            } catch (Exception e2) {
                CameraInstance.this.notifyError(e2);
                String unused2 = CameraInstance.TAG;
            }
        }
    };
    private Runnable closer = new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance.4
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = CameraInstance.TAG;
                CameraInstance.this.cameraManager.stopPreview();
                CameraInstance.this.cameraManager.close();
            } catch (Exception e2) {
                String unused2 = CameraInstance.TAG;
            }
            CameraInstance.this.cameraClosed = true;
            CameraInstance.this.readyHandler.sendEmptyMessage(R.id.zxing_camera_closed);
            CameraInstance.this.cameraThread.decrementInstances();
        }
    };

    public CameraInstance(Context context) {
        Util.validateMainThread();
        this.cameraThread = CameraThread.getInstance();
        CameraManager cameraManager = new CameraManager(context);
        this.cameraManager = cameraManager;
        cameraManager.setCameraSettings(this.cameraSettings);
        this.mainHandler = new Handler();
    }

    public CameraInstance(CameraManager cameraManager) {
        Util.validateMainThread();
        this.cameraManager = cameraManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Size getPreviewSize() {
        return this.cameraManager.getPreviewSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyError(Exception exc) {
        Handler handler = this.readyHandler;
        if (handler != null) {
            handler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }

    private void validateOpen() {
        if (!this.open) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void changeCameraParameters(final CameraParametersCallback cameraParametersCallback) {
        Util.validateMainThread();
        if (this.open) {
            this.cameraThread.enqueue(new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8614x78173d15(cameraParametersCallback);
                }
            });
        }
    }

    public void close() {
        Util.validateMainThread();
        if (this.open) {
            this.cameraThread.enqueue(this.closer);
        } else {
            this.cameraClosed = true;
        }
        this.open = false;
    }

    public void configureCamera() {
        Util.validateMainThread();
        validateOpen();
        this.cameraThread.enqueue(this.configure);
    }

    protected CameraManager getCameraManager() {
        return this.cameraManager;
    }

    public int getCameraRotation() {
        return this.cameraManager.getCameraRotation();
    }

    public CameraSettings getCameraSettings() {
        return this.cameraSettings;
    }

    protected CameraThread getCameraThread() {
        return this.cameraThread;
    }

    public DisplayConfiguration getDisplayConfiguration() {
        return this.displayConfiguration;
    }

    protected CameraSurface getSurface() {
        return this.surface;
    }

    public boolean isCameraClosed() {
        return this.cameraClosed;
    }

    public boolean isOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: lambda$changeCameraParameters$1$com-journeyapps-barcodescanner-camera-CameraInstance, reason: not valid java name */
    /* synthetic */ void m8614x78173d15(CameraParametersCallback cameraParametersCallback) {
        this.cameraManager.changeCameraParameters(cameraParametersCallback);
    }

    /* JADX INFO: renamed from: lambda$requestPreview$2$com-journeyapps-barcodescanner-camera-CameraInstance, reason: not valid java name */
    /* synthetic */ void m8615xd7cc81fa(PreviewCallback previewCallback) {
        this.cameraManager.requestPreviewFrame(previewCallback);
    }

    /* JADX INFO: renamed from: lambda$requestPreview$3$com-journeyapps-barcodescanner-camera-CameraInstance, reason: not valid java name */
    /* synthetic */ void m8616xf1e80099(final PreviewCallback previewCallback) {
        if (this.open) {
            this.cameraThread.enqueue(new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8615xd7cc81fa(previewCallback);
                }
            });
        } else {
            String str = TAG;
        }
    }

    /* JADX INFO: renamed from: lambda$setTorch$0$com-journeyapps-barcodescanner-camera-CameraInstance, reason: not valid java name */
    /* synthetic */ void m8617xdd5ef35b(boolean z2) {
        this.cameraManager.setTorch(z2);
    }

    public void open() {
        Util.validateMainThread();
        this.open = true;
        this.cameraClosed = false;
        this.cameraThread.incrementAndEnqueue(this.opener);
    }

    public void requestPreview(final PreviewCallback previewCallback) throws Throwable {
        Handler handler = this.mainHandler;
        Runnable runnable = new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8616xf1e80099(previewCallback);
            }
        };
        short sXd = (short) (C1499aX.Xd() ^ (-22957));
        short sXd2 = (short) (C1499aX.Xd() ^ (-13946));
        int[] iArr = new int["f\u0016eRS\u0012s9QvCpN~\rI;X".length()];
        QB qb = new QB("f\u0016eRS\u0012s9QvCpN~\rI;X");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(Ig.wd("\b$kvK4M\u000b<o\u0012\u001bHBQ9ep", (short) (FB.Xd() ^ 4271)))};
        Object[] objArr = {runnable};
        short sXd3 = (short) (C1580rY.Xd() ^ (-19470));
        int[] iArr2 = new int["g\u0015=_".length()];
        QB qb2 = new QB("g\u0015=_");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        if (this.open) {
            return;
        }
        this.cameraSettings = cameraSettings;
        this.cameraManager.setCameraSettings(cameraSettings);
    }

    public void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
        this.displayConfiguration = displayConfiguration;
        this.cameraManager.setDisplayConfiguration(displayConfiguration);
    }

    public void setReadyHandler(Handler handler) {
        this.readyHandler = handler;
    }

    public void setSurface(CameraSurface cameraSurface) {
        this.surface = cameraSurface;
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        setSurface(new CameraSurface(surfaceHolder));
    }

    public void setTorch(final boolean z2) {
        Util.validateMainThread();
        if (this.open) {
            this.cameraThread.enqueue(new Runnable() { // from class: com.journeyapps.barcodescanner.camera.CameraInstance$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8617xdd5ef35b(z2);
                }
            });
        }
    }

    public void startPreview() {
        Util.validateMainThread();
        validateOpen();
        this.cameraThread.enqueue(this.previewStarter);
    }
}
