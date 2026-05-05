package com.incode.camera.analysis.face.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.face.FaceAnalysisEvent;
import com.incode.camera.analysis.face.FaceStageInput;
import com.incode.camera.commons.utils.BitmapUtils;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/incode/camera/analysis/face/stages/Brightness;", "Lcom/incode/camera/analysis/face/stages/FaceStage;", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "input", "Lcom/incode/camera/analysis/face/FaceStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Brightness extends FaceStage {
    private static int CameraConstants = 0;
    private static int ProcessCameraProviderExtensionsKt = 1;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<FaceAnalysisEvent> perform(FaceStageInput faceStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 115;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<FaceAnalysisEvent> resultPerform2 = perform2(faceStageInput, (Function1<? super String, Unit>) function1);
        int i5 = ProcessCameraProviderExtensionsKt + 77;
        CameraConstants = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return resultPerform2;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<FaceAnalysisEvent> perform2(FaceStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 83;
        CameraConstants = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(input, "");
            BitmapUtils.INSTANCE.isTooDark(input.getBitmap(), input.getConfig().getLightMinThreshold());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(input, "");
        if (!BitmapUtils.INSTANCE.isTooDark(input.getBitmap(), input.getConfig().getLightMinThreshold())) {
            return new Stage.Result.Proceed(null, 1, null);
        }
        Stage.Result.Abort abort = new Stage.Result.Abort(FaceAnalysisEvent.TooDark.INSTANCE);
        int i4 = ProcessCameraProviderExtensionsKt + 71;
        CameraConstants = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return abort;
    }
}
