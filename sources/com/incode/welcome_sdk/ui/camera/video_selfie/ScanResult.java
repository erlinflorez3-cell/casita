package com.incode.welcome_sdk.ui.camera.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public enum ScanResult {
    OK,
    RETRY,
    ERROR,
    FINISHED_WITH_ERROR;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12140f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12141g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12142h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12143j = 0;

    public static ScanResult valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f12141g + 39;
        f12142h = i3 % 128;
        int i4 = i3 % 2;
        ScanResult scanResult = (ScanResult) Enum.valueOf(ScanResult.class, str);
        int i5 = f12141g + 105;
        f12142h = i5 % 128;
        if (i5 % 2 == 0) {
            return scanResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ScanResult[] valuesCustom() {
        ScanResult[] scanResultArr;
        int i2 = 2 % 2;
        int i3 = f12141g + 13;
        f12142h = i3 % 128;
        if (i3 % 2 != 0) {
            scanResultArr = (ScanResult[]) values().clone();
            int i4 = 66 / 0;
        } else {
            scanResultArr = (ScanResult[]) values().clone();
        }
        int i5 = f12142h + 13;
        f12141g = i5 % 128;
        if (i5 % 2 != 0) {
            return scanResultArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = f12143j + 117;
        f12140f = i2 % 128;
        int i3 = i2 % 2;
    }
}
