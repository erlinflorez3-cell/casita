package com.incode.welcome_sdk.commons.utils;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.Pair;
import com.incode.recogkitandroid.Face;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceProcessingUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6308a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6309d = 0;

    public enum FaceProcessingState {
        EMPTY,
        NO_FACE,
        NO_LANDMARKS,
        INSUFFICIENT_FACE_SIZE,
        FACE_DETECTED,
        FACE_PROCESSING_STARTED,
        FACE_TOO_CLOSE,
        NOT_READY,
        FACE_ROTATED_LEFT,
        FACE_ROTATED_RIGHT,
        FACE_TILTED_LEFT,
        FACE_TILTED_RIGHT,
        LIGHT_TOO_DARK,
        BLURRED_CROP,
        FACE_NOT_IN_CONSTRAINT,
        MULTIPLE_FACES_DETECTED,
        EYES_CLOSED,
        HEAD_COVERED,
        GET_READY,
        LENSES_DETECTED,
        FACE_MASK_DETECTED,
        LOW_IMAGE_QUALITY
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.Float> d(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.DetectionData r3) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.d(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils$DetectionData):java.util.Map");
    }

    public static Map<String, Float> b(DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = f6309d + 121;
        f6308a = i3 % 128;
        int i4 = i3 % 2;
        if (detectionData.faceLandmarksState == null) {
            return null;
        }
        int i5 = f6308a + 65;
        f6309d = i5 % 128;
        int i6 = i5 % 2;
        if (detectionData.face == null) {
            return null;
        }
        HashMap map = new HashMap();
        Face.Rect rect = detectionData.face.rect;
        FaceLandmarksState faceLandmarksState = detectionData.faceLandmarksState;
        map.put("x", Float.valueOf(rect.f3644x));
        map.put("y", Float.valueOf(rect.f3645y));
        map.put("width", Float.valueOf(rect.width));
        map.put("height", Float.valueOf(rect.height));
        map.put("leftEyeX", Float.valueOf(faceLandmarksState.leftEye.x));
        map.put("leftEyeY", Float.valueOf(faceLandmarksState.leftEye.y));
        map.put("rightEyeX", Float.valueOf(faceLandmarksState.rightEye.x));
        map.put("rightEyeY", Float.valueOf(faceLandmarksState.rightEye.y));
        int i7 = f6309d + 41;
        f6308a = i7 % 128;
        int i8 = i7 % 2;
        return map;
    }

    public static Pair<Float, Float> c(DetectionData detectionData) {
        float f2;
        int i2 = 2 % 2;
        int i3 = f6308a + 97;
        f6309d = i3 % 128;
        if (i3 % 2 == 0) {
            FaceLandmarksState faceLandmarksState = detectionData.faceLandmarksState;
            float f3 = -1.0f;
            if (faceLandmarksState != null && faceLandmarksState.rightMouthDetected && faceLandmarksState.leftMouthDetected) {
                f3 = (faceLandmarksState.rightMouth.x + faceLandmarksState.leftMouth.x) / 2.0f;
                f2 = (faceLandmarksState.rightMouth.y + faceLandmarksState.leftMouth.y) / 2.0f;
            } else {
                f2 = -1.0f;
            }
            Pair<Float, Float> pair = new Pair<>(Float.valueOf(f3), Float.valueOf(f2));
            int i4 = f6309d + 61;
            f6308a = i4 % 128;
            int i5 = i4 % 2;
            return pair;
        }
        FaceLandmarksState faceLandmarksState2 = detectionData.faceLandmarksState;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static class FaceLandmarksState {
        public static final int MAX_NUM_OF_FACE_LANDMARKS = 5;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f6310a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f6311b = 0;
        public int landmarkCount;
        public PointF leftEye;
        public boolean leftEyeDetected;
        public float leftEyeOpenProbability;
        public PointF leftMouth;
        public boolean leftMouthDetected;
        public PointF noseTip;
        public boolean noseTipDetected;
        public PointF rightEye;
        public boolean rightEyeDetected;
        public float rightEyeOpenProbability;
        public PointF rightMouth;
        public boolean rightMouthDetected;

        public boolean eyesDetected() {
            int i2 = 2 % 2;
            int i3 = f6311b + 39;
            int i4 = i3 % 128;
            f6310a = i4;
            int i5 = i3 % 2;
            if (!this.rightEyeDetected) {
                return false;
            }
            int i6 = i4 + 97;
            f6311b = i6 % 128;
            int i7 = i6 % 2;
            if (!this.leftEyeDetected) {
                return false;
            }
            int i8 = i4 + 25;
            f6311b = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }

        public boolean mouthEdgesDetected() {
            int i2 = 2 % 2;
            int i3 = f6311b + 63;
            int i4 = i3 % 128;
            f6310a = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!this.rightMouthDetected || !this.leftMouthDetected) {
                return false;
            }
            int i5 = i4 + 35;
            f6311b = i5 % 128;
            return i5 % 2 == 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean recognitionLandmarksDetected() {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.f6310a
                int r1 = r0 + 45
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.f6311b = r0
                int r1 = r1 % r3
                boolean r0 = r4.eyesDetected()
                r2 = 0
                if (r0 == 0) goto L3d
                int r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.f6311b
                int r1 = r0 + 9
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.f6310a = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L36
                boolean r1 = r4.mouthEdgesDetected()
                r0 = 50
                int r0 = r0 / r2
                if (r1 == 0) goto L3d
            L27:
                int r0 = com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.f6311b
                int r1 = r0 + 53
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.f6310a = r0
                int r1 = r1 % r3
                boolean r0 = r4.noseTipDetected
                if (r0 == 0) goto L3d
                r0 = 1
                return r0
            L36:
                boolean r0 = r4.mouthEdgesDetected()
                if (r0 == 0) goto L3d
                goto L27
            L3d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceLandmarksState.recognitionLandmarksDetected():boolean");
        }

        public boolean allLandmarksDetected() {
            int i2 = 2 % 2;
            int i3 = f6310a;
            int i4 = i3 + 23;
            f6311b = i4 % 128;
            if (i4 % 2 != 0) {
                if (this.landmarkCount == 3) {
                    return true;
                }
            } else if (this.landmarkCount == 5) {
                return true;
            }
            int i5 = i3 + 79;
            f6311b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public boolean eyesOpen() {
            int i2 = 2 % 2;
            int i3 = f6311b;
            int i4 = i3 + 113;
            f6310a = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.leftEyeOpenProbability <= 0.9f && this.rightEyeOpenProbability <= 0.9f) {
                return false;
            }
            int i5 = i3 + 31;
            f6310a = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public String toString() {
            int i2 = 2 % 2;
            String string = new StringBuilder("FaceLandmarksState{rightEye=").append(this.rightEye).append(", leftEye=").append(this.leftEye).append(", noseTip=").append(this.noseTip).append(", rightMouth=").append(this.rightMouth).append(", leftMouth=").append(this.leftMouth).append(", centerEyes=").append((this.rightEye.x + this.leftEye.x) / 2.0f).append(", centerNose=").append(this.noseTip.x).append(", centerMouth=").append((this.rightMouth.x + this.leftMouth.x) / 2.0f).append(AbstractJsonLexerKt.END_OBJ).toString();
            int i3 = f6311b + 71;
            f6310a = i3 % 128;
            if (i3 % 2 != 0) {
                return string;
            }
            throw null;
        }
    }

    public static class DetectionData {
        public Bitmap bitmap;
        public ArrayList<Face> detectedFaces;
        public FaceProcessingState detectionResultState;
        public Face face;
        public FaceLandmarksState faceLandmarksState;

        public DetectionData() {
        }

        public DetectionData(Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }
}
