package com.incode.camera.analysis.face.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.face.FaceAnalysisEvent;
import com.incode.camera.analysis.face.FaceStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/incode/camera/analysis/face/stages/FaceDistance;", "Lcom/incode/camera/analysis/face/stages/FaceStage;", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "input", "Lcom/incode/camera/analysis/face/FaceStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceDistance extends FaceStage {
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<FaceAnalysisEvent> perform(FaceStageInput faceStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 47;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<FaceAnalysisEvent> resultPerform2 = perform2(faceStageInput, (Function1<? super String, Unit>) function1);
        int i5 = ProcessCameraProviderExtensionsKt + 105;
        IncodeCamera = i5 % 128;
        int i6 = i5 % 2;
        return resultPerform2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.camera.analysis.Stage.Result<com.incode.camera.analysis.face.FaceAnalysisEvent> perform2(com.incode.camera.analysis.face.FaceStageInput r6, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r7) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.incode.camera.commons.utils.FaceMetadata r2 = r6.getFaceMetadata$core_light_release()
            float r0 = r2.getNfx()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            if (r0 < 0) goto L4d
            float r0 = r2.getNfy()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L4d
            int r0 = com.incode.camera.analysis.face.stages.FaceDistance.IncodeCamera
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.camera.analysis.face.stages.FaceDistance.ProcessCameraProviderExtensionsKt = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L72
            float r1 = r2.getNfx()
            float r0 = r2.getNfw()
            float r1 = r1 * r0
            int r0 = r2.getFrameWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4d
        L3b:
            float r1 = r2.getNfy()
            float r0 = r2.getNfh()
            float r1 = r1 + r0
            int r0 = r2.getFrameHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5b
        L4d:
            com.incode.camera.analysis.face.FaceAnalysisEvent$FaceTooClose r1 = com.incode.camera.analysis.face.FaceAnalysisEvent.FaceTooClose.INSTANCE
            com.incode.camera.analysis.face.FaceAnalysisEvent r1 = (com.incode.camera.analysis.face.FaceAnalysisEvent) r1
        L51:
            if (r1 == 0) goto L85
            com.incode.camera.analysis.Stage$Result$Abort r0 = new com.incode.camera.analysis.Stage$Result$Abort
            r0.<init>(r1)
            com.incode.camera.analysis.Stage$Result r0 = (com.incode.camera.analysis.Stage.Result) r0
            return r0
        L5b:
            float r1 = r2.getNfw()
            com.incode.camera.analysis.face.FaceAnalyzer$Config r0 = r6.getConfig()
            float r0 = r0.getMinFaceSizeDimension()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L70
            com.incode.camera.analysis.face.FaceAnalysisEvent$FaceTooFar r1 = com.incode.camera.analysis.face.FaceAnalysisEvent.FaceTooFar.INSTANCE
            com.incode.camera.analysis.face.FaceAnalysisEvent r1 = (com.incode.camera.analysis.face.FaceAnalysisEvent) r1
            goto L51
        L70:
            r1 = r3
            goto L51
        L72:
            float r1 = r2.getNfx()
            float r0 = r2.getNfw()
            float r1 = r1 + r0
            int r0 = r2.getFrameWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4d
            goto L3b
        L85:
            com.incode.camera.analysis.Stage$Result$Proceed r2 = new com.incode.camera.analysis.Stage$Result$Proceed
            r0 = 1
            r2.<init>(r3, r0, r3)
            com.incode.camera.analysis.Stage$Result r2 = (com.incode.camera.analysis.Stage.Result) r2
            int r0 = com.incode.camera.analysis.face.stages.FaceDistance.ProcessCameraProviderExtensionsKt
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.camera.analysis.face.stages.FaceDistance.IncodeCamera = r0
            int r1 = r1 % r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.face.stages.FaceDistance.perform2(com.incode.camera.analysis.face.FaceStageInput, kotlin.jvm.functions.Function1):com.incode.camera.analysis.Stage$Result");
    }
}
