package com.incode.recogkitandroid;

/* JADX INFO: loaded from: classes7.dex */
public class getPreviewView implements isVideoLivenessRecordingSupported {
    public int CameraConstants;
    public byte[] ProcessCameraProviderExtensionsKt;

    @Override // com.incode.recogkitandroid.isVideoLivenessRecordingSupported
    public void CameraConstants(startCamera startcamera) {
        this.CameraConstants = startcamera.getAvailableCameraInternals();
        this.ProcessCameraProviderExtensionsKt = (byte[]) startcamera.e1(byte[].class);
    }
}
