package com.incode.welcome_sdk.data;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public enum ImageType {
    selfie,
    croppedFace,
    croppedIDFace,
    croppedSecondIDFace,
    document,
    signature,
    fullFrameFrontID,
    fullFrameBackID,
    croppedFrontID,
    croppedBackID;

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.ImageType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f7516a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f7517c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f7518d;

        static {
            int[] iArr = new int[ImageType.values().length];
            f7518d = iArr;
            try {
                iArr[ImageType.croppedFace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7518d[ImageType.croppedIDFace.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7518d[ImageType.croppedSecondIDFace.ordinal()] = 3;
                int i2 = f7517c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f7516a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7518d[ImageType.croppedFrontID.ordinal()] = 4;
                int i5 = f7516a + 73;
                f7517c = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7518d[ImageType.croppedBackID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String getImagePath(ImageType imageType) {
        int i2 = AnonymousClass1.f7518d[imageType.ordinal()];
        if (i2 == 1) {
            return "selfie";
        }
        if (i2 == 2) {
            return "id_front_face_crop";
        }
        if (i2 == 3) {
            return "second_id_front_face_crop";
        }
        if (i2 == 4) {
            return "result_front_id";
        }
        if (i2 != 5) {
            return null;
        }
        return "result_back_id";
    }
}
