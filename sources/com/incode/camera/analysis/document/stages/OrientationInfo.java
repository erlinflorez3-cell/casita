package com.incode.camera.analysis.document.stages;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/incode/camera/analysis/document/stages/OrientationInfo;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OrientationInfo extends DocumentStage {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3609e1 = 1;
    private static int getAvailableCameraInternals = 0;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f3609e1 + 55;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        int i5 = getAvailableCameraInternals + 87;
        f3609e1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return resultPerform2;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<DocumentAnalysisEvent> perform2(DocumentStageInput input, Function1<? super String, Unit> logger) {
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        Boolean boolIsVertical = input.getCaptureInfo().isVertical();
        if (boolIsVertical == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        boolean zBooleanValue = boolIsVertical.booleanValue();
        if (logger != null) {
            int i3 = getAvailableCameraInternals;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3609e1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (zBooleanValue) {
                int i5 = i3 + 9;
                f3609e1 = i5 % 128;
                int i6 = i5 % 2;
                str = "VERTICAL";
            } else {
                str = "HORIZONTAL";
            }
            logger.invoke("    orientation: " + str + Global.BLANK);
        }
        return new Stage.Result.Proceed(new DocumentAnalysisEvent.Orientation(zBooleanValue));
    }
}
