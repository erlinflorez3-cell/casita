package com.incode.camera.analysis.face.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.face.FaceAnalysisEvent;
import com.incode.camera.analysis.face.FaceStageInput;
import com.incode.camera.commons.utils.FaceLandmarks;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/incode/camera/analysis/face/stages/LandmarksExistence;", "Lcom/incode/camera/analysis/face/stages/FaceStage;", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "input", "Lcom/incode/camera/analysis/face/FaceStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LandmarksExistence extends FaceStage {
    private static int IncodeCamera = 0;
    private static int ProcessCameraProviderExtensionsKt = 1;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<FaceAnalysisEvent> perform(FaceStageInput faceStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 31;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<FaceAnalysisEvent> resultPerform2 = perform2(faceStageInput, (Function1<? super String, Unit>) function1);
        int i5 = ProcessCameraProviderExtensionsKt + 79;
        IncodeCamera = i5 % 128;
        int i6 = i5 % 2;
        return resultPerform2;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<FaceAnalysisEvent> perform2(FaceStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 25;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        FaceLandmarks landmarks$core_light_release = input.getLandmarks$core_light_release();
        if (landmarks$core_light_release != null) {
            landmarks$core_light_release.recognitionLandmarksDetected();
            return new Stage.Result.Proceed(null, 1, null);
        }
        Stage.Result.Abort abort = new Stage.Result.Abort(FaceAnalysisEvent.NoLandmarksDetected.INSTANCE);
        int i5 = ProcessCameraProviderExtensionsKt + 121;
        IncodeCamera = i5 % 128;
        int i6 = i5 % 2;
        return abort;
    }
}
