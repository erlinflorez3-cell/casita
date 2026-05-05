package com.incode.camera.commons.utils;

import com.incode.recogkitandroid.IdCaptureKitAndroid;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003¨\u0006\u0004"}, d2 = {"getDocumentSide", "Lcom/incode/camera/commons/utils/Side;", "Lcom/incode/recogkitandroid/IdCaptureKitAndroid$Result;", "Lcom/incode/recogkitandroid/IdCaptureKitAndroid;", "core-light_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RecogKitResultExtensionKt {
    private static int CameraConstants = 0;
    private static int ProcessCameraProviderExtensionsKt = 1;

    public static final Side getDocumentSide(IdCaptureKitAndroid.Result result) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(result, "");
        String str = result.side;
        if (Intrinsics.areEqual(str, "front")) {
            int i3 = CameraConstants + 79;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            return Side.FRONT;
        }
        if (!Intrinsics.areEqual(str, "back")) {
            return Side.UNKNOWN;
        }
        int i5 = CameraConstants + 109;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        int i6 = i5 % 2;
        return Side.BACK;
    }
}
