package com.incode.welcome_sdk.commons.utils;

import android.graphics.RectF;
import com.incode.recogkitandroid.Face;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class FaceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6312a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6313d = 1;

    public static boolean isNegativeX(Face face) {
        int i2 = 2 % 2;
        if (face.rect.f3644x + face.rect.width < 0.0f) {
            int i3 = f6313d + 37;
            f6312a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f6312a + 79;
        f6313d = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static FaceProcessingUtils.FaceLandmarksState getLandmarkState(Face face) {
        int i2 = 2 % 2;
        FaceProcessingUtils.FaceLandmarksState faceLandmarksState = new FaceProcessingUtils.FaceLandmarksState();
        if (face.rightEye != null) {
            faceLandmarksState.landmarkCount++;
            faceLandmarksState.rightEyeDetected = true;
            faceLandmarksState.rightEye = face.rightEye;
        }
        if (face.leftEye != null) {
            faceLandmarksState.landmarkCount++;
            faceLandmarksState.leftEyeDetected = true;
            faceLandmarksState.leftEye = face.leftEye;
            int i3 = f6313d + 75;
            f6312a = i3 % 128;
            int i4 = i3 % 2;
        }
        if (face.rightMouthCorner != null) {
            int i5 = f6313d + 123;
            f6312a = i5 % 128;
            int i6 = i5 % 2;
            faceLandmarksState.landmarkCount++;
            faceLandmarksState.rightMouthDetected = true;
            faceLandmarksState.rightMouth = face.rightMouthCorner;
        }
        if (face.leftMouthCorner != null) {
            int i7 = f6312a + 23;
            f6313d = i7 % 128;
            int i8 = i7 % 2;
            faceLandmarksState.landmarkCount++;
            faceLandmarksState.leftMouthDetected = true;
            faceLandmarksState.leftMouth = face.leftMouthCorner;
        }
        if (face.noseTip != null) {
            faceLandmarksState.landmarkCount++;
            faceLandmarksState.noseTipDetected = true;
            faceLandmarksState.noseTip = face.noseTip;
        }
        faceLandmarksState.rightEyeOpenProbability = 1.0f;
        faceLandmarksState.leftEyeOpenProbability = 1.0f;
        Timber.d("Num of needed landmarks: %s", Integer.valueOf(faceLandmarksState.landmarkCount));
        return faceLandmarksState;
    }

    public static String incodeFaceToString(Face face) {
        int i2 = 2 % 2;
        int i3 = f6312a + 73;
        int i4 = i3 % 128;
        f6313d = i4;
        int i5 = i3 % 2;
        if (face != null) {
            return String.format("LE:%s RE:%s LM:%s RM:%s, RECT:%s", face.leftEye, face.rightEye, face.leftMouthCorner, face.rightMouthCorner, new RectF(face.rect.f3644x, face.rect.f3645y, face.rect.f3644x + face.rect.width, face.rect.f3645y + face.rect.height));
        }
        int i6 = i4 + 33;
        f6312a = i6 % 128;
        if (i6 % 2 == 0) {
            return "null";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
