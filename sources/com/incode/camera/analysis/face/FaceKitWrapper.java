package com.incode.camera.analysis.face;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.incode.recogkitandroid.Face;
import com.incode.recogkitandroid.FaceAttributes;
import com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid;
import com.incode.recogkitandroid.RecogKitAndroid;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import com.incode.recogkitandroid.SelfieFaceDetectorKit;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/incode/camera/analysis/face/FaceKitWrapper;", "", "selfieFaceDetectorKit", "Lcom/incode/recogkitandroid/SelfieFaceDetectorKit;", "recogKitAndroid", "Lcom/incode/recogkitandroid/RecogKitAndroid;", "faceAttributesDetectorKitAndroid", "Lcom/incode/recogkitandroid/FaceAttributesDetectorKitAndroid;", "(Lcom/incode/recogkitandroid/SelfieFaceDetectorKit;Lcom/incode/recogkitandroid/RecogKitAndroid;Lcom/incode/recogkitandroid/FaceAttributesDetectorKitAndroid;)V", "createTemplate", "", "input", "Lcom/incode/camera/analysis/face/FaceStageInput;", "detectFace", "Ljava/util/ArrayList;", "Lcom/incode/recogkitandroid/Face;", "Lkotlin/collections/ArrayList;", TypedValues.AttributesType.S_FRAME, "Landroid/graphics/Bitmap;", "faceDetectorThreshold", "", "detectFaceAttributes", "Lcom/incode/recogkitandroid/FaceAttributes;", "bitmap", "rightEye", "Landroid/graphics/PointF;", "leftEye", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceKitWrapper {
    private static int IncodeCamera = 0;
    private static int getAvailableCameraInternals = 1;
    private final FaceAttributesDetectorKitAndroid CameraConstants;
    private final SelfieFaceDetectorKit ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final RecogKitAndroid f3621e1;

    public FaceKitWrapper(SelfieFaceDetectorKit selfieFaceDetectorKit, RecogKitAndroid recogKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid) {
        Intrinsics.checkNotNullParameter(selfieFaceDetectorKit, "");
        Intrinsics.checkNotNullParameter(recogKitAndroid, "");
        Intrinsics.checkNotNullParameter(faceAttributesDetectorKitAndroid, "");
        this.ProcessCameraProviderExtensionsKt = selfieFaceDetectorKit;
        this.f3621e1 = recogKitAndroid;
        this.CameraConstants = faceAttributesDetectorKitAndroid;
    }

    public final String createTemplate(FaceStageInput input) throws RecogKitInvalidInputException, RecogKitProcessException {
        float f2;
        float f3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        int scaleFactor = input.getConfig().getScaleFactor();
        Face requireFace = input.getRequireFace();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(0, ((int) requireFace.rect.f3644x) * scaleFactor);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(0, ((int) requireFace.rect.f3645y) * scaleFactor);
        int iCoerceAtMost = RangesKt.coerceAtMost(((int) requireFace.rect.width) * scaleFactor, input.getBitmap().getWidth());
        int iCoerceAtMost2 = RangesKt.coerceAtMost(((int) requireFace.rect.height) * scaleFactor, input.getBitmap().getHeight());
        Timber.Forest.d(StringsKt.replaceIndentByMargin$default("createRecognitionFaceInfo faceWidth: " + iCoerceAtMost + ",\n            |faceHeight: " + iCoerceAtMost2 + ", x: " + iCoerceAtLeast + ", y: " + iCoerceAtLeast2 + ", \n            |bitmapWidth: " + input.getBitmap().getWidth() + ", bitmapHeight: " + input.getBitmap().getHeight() + "}", null, null, 3, null), new Object[0]);
        float f4 = scaleFactor;
        float f5 = input.getRequireLandmarks$core_light_release().getRightEye().x * f4;
        float f6 = input.getRequireLandmarks$core_light_release().getRightEye().y * f4;
        float f7 = input.getRequireLandmarks$core_light_release().getLeftEye().x * f4;
        float f8 = input.getRequireLandmarks$core_light_release().getLeftEye().y * f4;
        if (input.getRequireLandmarks$core_light_release().mouthEdgesDetected()) {
            int i3 = IncodeCamera + 95;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            float f9 = input.getRequireLandmarks$core_light_release().getLeftMouth().x * f4;
            float f10 = input.getRequireLandmarks$core_light_release().getLeftMouth().y * f4;
            f2 = ((input.getRequireLandmarks$core_light_release().getRightMouth().x * f4) + f9) / 2.0f;
            f3 = ((input.getRequireLandmarks$core_light_release().getRightMouth().y * f4) + f10) / 2.0f;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        String template = this.f3621e1.getTemplate(input.getBitmap(), f5, f6, f7, f8, f2, f3);
        Intrinsics.checkNotNullExpressionValue(template, "");
        int i5 = IncodeCamera + 113;
        getAvailableCameraInternals = i5 % 128;
        int i6 = i5 % 2;
        return template;
    }

    public final ArrayList<Face> detectFace(Bitmap frame, float faceDetectorThreshold) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 29;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(frame, "");
        ArrayList<Face> arrayListDetect = this.ProcessCameraProviderExtensionsKt.detect(frame, faceDetectorThreshold);
        Intrinsics.checkNotNullExpressionValue(arrayListDetect, "");
        int i5 = getAvailableCameraInternals + 49;
        IncodeCamera = i5 % 128;
        int i6 = i5 % 2;
        return arrayListDetect;
    }

    public final FaceAttributes detectFaceAttributes(Bitmap bitmap, PointF rightEye, PointF leftEye) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 67;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(rightEye, "");
        Intrinsics.checkNotNullParameter(leftEye, "");
        FaceAttributes faceAttributesDetectAttributes = this.CameraConstants.detectAttributes(bitmap, rightEye.x, rightEye.y, leftEye.x, leftEye.y);
        Intrinsics.checkNotNullExpressionValue(faceAttributesDetectAttributes, "");
        int i5 = getAvailableCameraInternals + 61;
        IncodeCamera = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return faceAttributesDetectAttributes;
    }
}
