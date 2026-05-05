package com.journeyapps.barcodescanner.camera;

/* JADX INFO: loaded from: classes5.dex */
public class CameraSettings {
    private int requestedCameraId = -1;
    private boolean scanInverted = false;
    private boolean barcodeSceneModeEnabled = false;
    private boolean meteringEnabled = false;
    private boolean autoFocusEnabled = true;
    private boolean continuousFocusEnabled = false;
    private boolean exposureEnabled = false;
    private boolean autoTorchEnabled = false;
    private FocusMode focusMode = FocusMode.AUTO;

    public enum FocusMode {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public FocusMode getFocusMode() {
        return this.focusMode;
    }

    public int getRequestedCameraId() {
        return this.requestedCameraId;
    }

    public boolean isAutoFocusEnabled() {
        return this.autoFocusEnabled;
    }

    public boolean isAutoTorchEnabled() {
        return this.autoTorchEnabled;
    }

    public boolean isBarcodeSceneModeEnabled() {
        return this.barcodeSceneModeEnabled;
    }

    public boolean isContinuousFocusEnabled() {
        return this.continuousFocusEnabled;
    }

    public boolean isExposureEnabled() {
        return this.exposureEnabled;
    }

    public boolean isMeteringEnabled() {
        return this.meteringEnabled;
    }

    public boolean isScanInverted() {
        return this.scanInverted;
    }

    public void setAutoFocusEnabled(boolean z2) {
        this.autoFocusEnabled = z2;
        if (z2 && this.continuousFocusEnabled) {
            this.focusMode = FocusMode.CONTINUOUS;
        } else if (z2) {
            this.focusMode = FocusMode.AUTO;
        } else {
            this.focusMode = null;
        }
    }

    public void setAutoTorchEnabled(boolean z2) {
        this.autoTorchEnabled = z2;
    }

    public void setBarcodeSceneModeEnabled(boolean z2) {
        this.barcodeSceneModeEnabled = z2;
    }

    public void setContinuousFocusEnabled(boolean z2) {
        this.continuousFocusEnabled = z2;
        if (z2) {
            this.focusMode = FocusMode.CONTINUOUS;
        } else if (this.autoFocusEnabled) {
            this.focusMode = FocusMode.AUTO;
        } else {
            this.focusMode = null;
        }
    }

    public void setExposureEnabled(boolean z2) {
        this.exposureEnabled = z2;
    }

    public void setFocusMode(FocusMode focusMode) {
        this.focusMode = focusMode;
    }

    public void setMeteringEnabled(boolean z2) {
        this.meteringEnabled = z2;
    }

    public void setRequestedCameraId(int i2) {
        this.requestedCameraId = i2;
    }

    public void setScanInverted(boolean z2) {
        this.scanInverted = z2;
    }
}
