package com.incode.recogkitandroid;

/* JADX INFO: loaded from: classes7.dex */
public class BuildConfigUtils {
    private static int CameraConstants = 1;
    private static int getAvailableCameraInternals = 0;

    public static boolean isFullRecogKitAvailable() {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 83;
        int i4 = i3 % 128;
        CameraConstants = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 31;
        getAvailableCameraInternals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
        return true;
    }
}
