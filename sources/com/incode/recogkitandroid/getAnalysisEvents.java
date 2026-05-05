package com.incode.recogkitandroid;

/* JADX INFO: loaded from: classes7.dex */
public class getAnalysisEvents {
    public int ProcessCameraProviderExtensionsKt;
    public int getAvailableCameraInternals;

    public static char[] IncodeCamera(long j2, char[] cArr, int i2) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (i3 < cArr.length) {
            if ((((j2 >>> i3) & 1) != i2 || i4 >= 4) && i5 < length) {
                cArr2[i5] = cArr[i3];
                i5++;
                i3++;
            } else {
                cArr2[i4] = cArr[i3];
                i4++;
                i3++;
            }
        }
        return cArr2;
    }
}
