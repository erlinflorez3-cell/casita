package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.zxing.client.android.AmbientLightManager;
import com.google.zxing.client.android.camera.open.OpenCameraInterface;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.SourceData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraManager {
    private static final String TAG = "CameraManager";
    private AmbientLightManager ambientLightManager;
    private AutoFocusManager autoFocusManager;
    private Camera camera;
    private Camera.CameraInfo cameraInfo;
    private Context context;
    private String defaultParameters;
    private DisplayConfiguration displayConfiguration;
    private Size previewSize;
    private boolean previewing;
    private Size requestedPreviewSize;
    private CameraSettings settings = new CameraSettings();
    private int rotationDegrees = -1;
    private final CameraPreviewCallback cameraPreviewCallback = new CameraPreviewCallback();

    private final class CameraPreviewCallback implements Camera.PreviewCallback {
        private PreviewCallback callback;
        private Size resolution;

        public CameraPreviewCallback() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Size size = this.resolution;
            PreviewCallback previewCallback = this.callback;
            if (size == null || previewCallback == null) {
                String unused = CameraManager.TAG;
                if (previewCallback != null) {
                    previewCallback.onPreviewError(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                SourceData sourceData = new SourceData(bArr, size.width, size.height, camera.getParameters().getPreviewFormat(), CameraManager.this.getCameraRotation());
                if (CameraManager.this.cameraInfo.facing == 1) {
                    sourceData.setPreviewMirrored(true);
                }
                previewCallback.onPreview(sourceData);
            } catch (RuntimeException e2) {
                String unused2 = CameraManager.TAG;
                previewCallback.onPreviewError(e2);
            }
        }

        public void setCallback(PreviewCallback previewCallback) {
            this.callback = previewCallback;
        }

        public void setResolution(Size size) {
            this.resolution = size;
        }
    }

    public CameraManager(Context context) {
        this.context = context;
    }

    private int calculateDisplayRotation() {
        int rotation = this.displayConfiguration.getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = this.cameraInfo.facing == 1 ? (360 - ((this.cameraInfo.orientation + i2) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS)) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : ((this.cameraInfo.orientation - i2) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        String str = TAG;
        String str2 = "Camera Display Orientation: " + i3;
        return i3;
    }

    private Camera.Parameters getDefaultCameraParameters() {
        Camera.Parameters parameters = this.camera.getParameters();
        String str = this.defaultParameters;
        if (str == null) {
            this.defaultParameters = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List<Size> getPreviewSizes(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new Size(previewSize.width, previewSize.height);
                arrayList.add(new Size(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private void setCameraDisplayOrientation(int i2) {
        this.camera.setDisplayOrientation(i2);
    }

    private void setDesiredParameters(boolean z2) {
        Camera.Parameters defaultCameraParameters = getDefaultCameraParameters();
        if (defaultCameraParameters == null) {
            String str = TAG;
            return;
        }
        String str2 = TAG;
        String str3 = "Initial camera parameters: " + defaultCameraParameters.flatten();
        if (z2) {
        }
        CameraConfigurationUtils.setFocus(defaultCameraParameters, this.settings.getFocusMode(), z2);
        if (!z2) {
            CameraConfigurationUtils.setTorch(defaultCameraParameters, false);
            if (this.settings.isScanInverted()) {
                CameraConfigurationUtils.setInvertColor(defaultCameraParameters);
            }
            if (this.settings.isBarcodeSceneModeEnabled()) {
                CameraConfigurationUtils.setBarcodeSceneMode(defaultCameraParameters);
            }
            if (this.settings.isMeteringEnabled()) {
                CameraConfigurationUtils.setVideoStabilization(defaultCameraParameters);
                CameraConfigurationUtils.setFocusArea(defaultCameraParameters);
                CameraConfigurationUtils.setMetering(defaultCameraParameters);
            }
        }
        List<Size> previewSizes = getPreviewSizes(defaultCameraParameters);
        if (previewSizes.size() == 0) {
            this.requestedPreviewSize = null;
        } else {
            Size bestPreviewSize = this.displayConfiguration.getBestPreviewSize(previewSizes, isCameraRotated());
            this.requestedPreviewSize = bestPreviewSize;
            defaultCameraParameters.setPreviewSize(bestPreviewSize.width, this.requestedPreviewSize.height);
        }
        if (Build.DEVICE.equals("glass-1")) {
            CameraConfigurationUtils.setBestPreviewFPS(defaultCameraParameters);
        }
        String str4 = "Final camera parameters: " + defaultCameraParameters.flatten();
        this.camera.setParameters(defaultCameraParameters);
    }

    private void setParameters() {
        try {
            int iCalculateDisplayRotation = calculateDisplayRotation();
            this.rotationDegrees = iCalculateDisplayRotation;
            setCameraDisplayOrientation(iCalculateDisplayRotation);
        } catch (Exception unused) {
            String str = TAG;
        }
        try {
            setDesiredParameters(false);
        } catch (Exception unused2) {
            try {
                setDesiredParameters(true);
            } catch (Exception unused3) {
                String str2 = TAG;
            }
        }
        Camera.Size previewSize = this.camera.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.previewSize = this.requestedPreviewSize;
        } else {
            this.previewSize = new Size(previewSize.width, previewSize.height);
        }
        this.cameraPreviewCallback.setResolution(this.previewSize);
    }

    public void changeCameraParameters(CameraParametersCallback cameraParametersCallback) {
        Camera camera = this.camera;
        if (camera != null) {
            try {
                camera.setParameters(cameraParametersCallback.changeCameraParameters(camera.getParameters()));
            } catch (RuntimeException e2) {
                String str = TAG;
            }
        }
    }

    public void close() {
        Camera camera = this.camera;
        if (camera != null) {
            camera.release();
            this.camera = null;
        }
    }

    public void configure() {
        if (this.camera == null) {
            throw new RuntimeException("Camera not open");
        }
        setParameters();
    }

    public Camera getCamera() {
        return this.camera;
    }

    public int getCameraRotation() {
        return this.rotationDegrees;
    }

    public CameraSettings getCameraSettings() {
        return this.settings;
    }

    public DisplayConfiguration getDisplayConfiguration() {
        return this.displayConfiguration;
    }

    public Size getNaturalPreviewSize() {
        return this.previewSize;
    }

    public Size getPreviewSize() {
        if (this.previewSize == null) {
            return null;
        }
        return isCameraRotated() ? this.previewSize.rotate() : this.previewSize;
    }

    public boolean isCameraRotated() {
        int i2 = this.rotationDegrees;
        if (i2 != -1) {
            return i2 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean isOpen() {
        return this.camera != null;
    }

    public boolean isTorchOn() {
        String flashMode;
        Camera.Parameters parameters = this.camera.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void open() {
        Camera cameraOpen = OpenCameraInterface.open(this.settings.getRequestedCameraId());
        this.camera = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int cameraId = OpenCameraInterface.getCameraId(this.settings.getRequestedCameraId());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.cameraInfo = cameraInfo;
        Camera.getCameraInfo(cameraId, cameraInfo);
    }

    public void requestPreviewFrame(PreviewCallback previewCallback) {
        Camera camera = this.camera;
        if (camera == null || !this.previewing) {
            return;
        }
        this.cameraPreviewCallback.setCallback(previewCallback);
        camera.setOneShotPreviewCallback(this.cameraPreviewCallback);
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.settings = cameraSettings;
    }

    public void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
        this.displayConfiguration = displayConfiguration;
    }

    public void setPreviewDisplay(SurfaceHolder surfaceHolder) throws IOException {
        setPreviewDisplay(new CameraSurface(surfaceHolder));
    }

    public void setPreviewDisplay(CameraSurface cameraSurface) throws IOException {
        cameraSurface.setPreview(this.camera);
    }

    public void setTorch(boolean z2) {
        if (this.camera != null) {
            try {
                if (z2 != isTorchOn()) {
                    AutoFocusManager autoFocusManager = this.autoFocusManager;
                    if (autoFocusManager != null) {
                        autoFocusManager.stop();
                    }
                    Camera.Parameters parameters = this.camera.getParameters();
                    CameraConfigurationUtils.setTorch(parameters, z2);
                    if (this.settings.isExposureEnabled()) {
                        CameraConfigurationUtils.setBestExposure(parameters, z2);
                    }
                    this.camera.setParameters(parameters);
                    AutoFocusManager autoFocusManager2 = this.autoFocusManager;
                    if (autoFocusManager2 != null) {
                        autoFocusManager2.start();
                    }
                }
            } catch (RuntimeException e2) {
                String str = TAG;
            }
        }
    }

    public void startPreview() {
        Camera camera = this.camera;
        if (camera == null || this.previewing) {
            return;
        }
        camera.startPreview();
        this.previewing = true;
        this.autoFocusManager = new AutoFocusManager(this.camera, this.settings);
        AmbientLightManager ambientLightManager = new AmbientLightManager(this.context, this, this.settings);
        this.ambientLightManager = ambientLightManager;
        ambientLightManager.start();
    }

    public void stopPreview() {
        AutoFocusManager autoFocusManager = this.autoFocusManager;
        if (autoFocusManager != null) {
            autoFocusManager.stop();
            this.autoFocusManager = null;
        }
        AmbientLightManager ambientLightManager = this.ambientLightManager;
        if (ambientLightManager != null) {
            ambientLightManager.stop();
            this.ambientLightManager = null;
        }
        Camera camera = this.camera;
        if (camera == null || !this.previewing) {
            return;
        }
        camera.stopPreview();
        this.cameraPreviewCallback.setCallback(null);
        this.previewing = false;
    }
}
