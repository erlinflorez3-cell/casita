package com.incode.camera.analysis.document.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/incode/camera/analysis/document/stages/Glare;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "glareThreshold", "", "(F)V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Glare extends DocumentStage {
    private static int IncodeCamera = 1;
    private static int getAvailableCameraInternals = 0;
    private final float CameraConstants;

    public Glare(float f2) {
        this.CameraConstants = f2;
    }

    public /* synthetic */ Glare(float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.3f : f2);
    }

    @Override // com.incode.camera.analysis.Stage
    public final /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 113;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        int i5 = IncodeCamera + 43;
        getAvailableCameraInternals = i5 % 128;
        if (i5 % 2 == 0) {
            return resultPerform2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<DocumentAnalysisEvent> perform2(DocumentStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 107;
        getAvailableCameraInternals = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(input, "");
            input.getCaptureInfo().getGlare();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(input, "");
        Float glare = input.getCaptureInfo().getGlare();
        if (glare == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (glare.floatValue() <= this.CameraConstants) {
            return new Stage.Result.Proceed(null, 1, null);
        }
        Stage.Result.Abort abort = new Stage.Result.Abort(new DocumentAnalysisEvent.Glare(input.getCaptureInfo()));
        int i4 = getAvailableCameraInternals + 115;
        IncodeCamera = i4 % 128;
        int i5 = i4 % 2;
        return abort;
    }

    public Glare() {
        this(0.0f, 1, null);
    }
}
