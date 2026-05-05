package com.incode.recogkitandroid;

/* JADX INFO: loaded from: classes7.dex */
public class getContext {
    public int IncodeCamera;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f3656e1;
    public int getAvailableCameraInternals;

    public static void CameraConstants(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static int ProcessCameraProviderExtensionsKt(int i2) {
        CameraConstants cameraConstants = CameraConstants.ProcessCameraProviderExtensionsKt;
        return ((cameraConstants.f3643e1[0][(i2 >>> 24) & 255] + cameraConstants.f3643e1[1][(i2 >>> 16) & 255]) ^ cameraConstants.f3643e1[2][(i2 >>> 8) & 255]) + cameraConstants.f3643e1[3][i2 & 255];
    }
}
