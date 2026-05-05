package com.incode.welcome_sdk.ui.camera.review_photo;

/* JADX INFO: loaded from: classes5.dex */
public enum ReviewPhotoResult {
    CONTINUE,
    SCAN_AGAIN;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11967a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11971e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11972g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f11973i = 0;

    public static ReviewPhotoResult valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f11971e + 15;
        f11967a = i3 % 128;
        int i4 = i3 % 2;
        ReviewPhotoResult reviewPhotoResult = (ReviewPhotoResult) Enum.valueOf(ReviewPhotoResult.class, str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f11971e + 29;
        f11967a = i5 % 128;
        if (i5 % 2 != 0) {
            return reviewPhotoResult;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ReviewPhotoResult[] valuesCustom() {
        int i2 = 2 % 2;
        int i3 = f11967a + 1;
        f11971e = i3 % 128;
        int i4 = i3 % 2;
        ReviewPhotoResult[] reviewPhotoResultArr = (ReviewPhotoResult[]) values().clone();
        int i5 = f11971e + 17;
        f11967a = i5 % 128;
        int i6 = i5 % 2;
        return reviewPhotoResultArr;
    }

    static {
        int i2 = f11973i + 109;
        f11972g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }
}
