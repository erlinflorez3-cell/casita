package com.incode.camera.analysis.document;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentKitWrapper;", "", "idCaptureKit", "Lcom/incode/recogkitandroid/IdCaptureKitAndroid;", "(Lcom/incode/recogkitandroid/IdCaptureKitAndroid;)V", "detectId", "Lcom/incode/recogkitandroid/IdCaptureKitAndroid$Result;", TypedValues.AttributesType.S_FRAME, "Landroid/graphics/Bitmap;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentKitWrapper {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3595e1 = 1;
    private static int getAvailableCameraInternals = 0;
    private final IdCaptureKitAndroid CameraConstants;

    public DocumentKitWrapper(IdCaptureKitAndroid idCaptureKitAndroid) {
        Intrinsics.checkNotNullParameter(idCaptureKitAndroid, "");
        this.CameraConstants = idCaptureKitAndroid;
    }

    public final IdCaptureKitAndroid.Result detectId(Bitmap frame) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = f3595e1 + 85;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(frame, "");
        IdCaptureKitAndroid.Result resultCaptureId = this.CameraConstants.captureId(frame);
        Intrinsics.checkNotNullExpressionValue(resultCaptureId, "");
        int i5 = f3595e1 + 113;
        getAvailableCameraInternals = i5 % 128;
        int i6 = i5 % 2;
        return resultCaptureId;
    }
}
