package com.incode.camera.analysis.face.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.face.FaceAnalysisEvent;
import com.incode.camera.analysis.face.FaceKitWrapper;
import com.incode.camera.analysis.face.FaceStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/incode/camera/analysis/face/stages/CreateTemplate;", "Lcom/incode/camera/analysis/face/stages/FaceStage;", "faceKitWrapper", "Lcom/incode/camera/analysis/face/FaceKitWrapper;", "(Lcom/incode/camera/analysis/face/FaceKitWrapper;)V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "input", "Lcom/incode/camera/analysis/face/FaceStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CreateTemplate extends FaceStage {
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final FaceKitWrapper f3627e1;

    public CreateTemplate(FaceKitWrapper faceKitWrapper) {
        Intrinsics.checkNotNullParameter(faceKitWrapper, "");
        this.f3627e1 = faceKitWrapper;
    }

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<FaceAnalysisEvent> perform(FaceStageInput faceStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 51;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<FaceAnalysisEvent> resultPerform2 = perform2(faceStageInput, (Function1<? super String, Unit>) function1);
        int i5 = IncodeCamera + 99;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return resultPerform2;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<FaceAnalysisEvent> perform2(FaceStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        Stage.Result.Proceed proceed = new Stage.Result.Proceed(new FaceAnalysisEvent.Template(this.f3627e1.createTemplate(input)));
        int i3 = IncodeCamera + 69;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        int i4 = i3 % 2;
        return proceed;
    }
}
