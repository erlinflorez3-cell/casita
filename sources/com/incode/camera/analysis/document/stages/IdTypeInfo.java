package com.incode.camera.analysis.document.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/incode/camera/analysis/document/stages/IdTypeInfo;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IdTypeInfo extends DocumentStage {
    private static int CameraConstants = 0;
    private static int IncodeCamera = 1;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 5;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = IncodeCamera + 51;
        CameraConstants = i6 % 128;
        int i7 = i6 % 2;
        return resultPerform2;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<DocumentAnalysisEvent> perform2(DocumentStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 83;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        CaptureInfo captureInfo = input.getCaptureInfo();
        if (captureInfo.getCls() == null || captureInfo.getIdType() == null || captureInfo.getSide() == null) {
            if (logger != null) {
                logger.invoke("    Not enough data to determine idType/side -> CLS=" + captureInfo.getCls() + ", idType=" + captureInfo.getIdType() + ", side=" + captureInfo.getSide());
            }
            return new Stage.Result.Proceed(null, 1, null);
        }
        if (captureInfo.getCls().floatValue() > 0.6f) {
            int i5 = CameraConstants + 85;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            if (logger != null) {
                logger.invoke("    idType: " + captureInfo.getIdType() + ", side: " + captureInfo.getSide());
            }
            return new Stage.Result.Proceed(new DocumentAnalysisEvent.IdTypeExtracted(captureInfo.getIdType(), captureInfo.getSide()));
        }
        if (logger != null) {
            int i7 = IncodeCamera + 59;
            CameraConstants = i7 % 128;
            if (i7 % 2 != 0) {
                logger.invoke("    Not enough confidence to determine idType/side -> CLS=" + captureInfo.getCls());
                throw null;
            }
            logger.invoke("    Not enough confidence to determine idType/side -> CLS=" + captureInfo.getCls());
        }
        Stage.Result.Proceed proceed = new Stage.Result.Proceed(null, 1, null);
        int i8 = CameraConstants + 1;
        IncodeCamera = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 70 / 0;
        }
        return proceed;
    }
}
