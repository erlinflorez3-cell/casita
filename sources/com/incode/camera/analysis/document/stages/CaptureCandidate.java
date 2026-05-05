package com.incode.camera.analysis.document.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentStageInput;
import com.incode.camera.commons.utils.StringExtensionKt;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/incode/camera/analysis/document/stages/CaptureCandidate;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "()V", "getScore", "", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CaptureCandidate extends DocumentStage {
    private static int IncodeCamera = 1;
    private static int getAvailableCameraInternals = 0;

    public static final /* synthetic */ float access$getScore(CaptureCandidate captureCandidate, DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 57;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        float fProcessCameraProviderExtensionsKt = ProcessCameraProviderExtensionsKt(documentStageInput, function1);
        int i5 = getAvailableCameraInternals + 79;
        IncodeCamera = i5 % 128;
        int i6 = i5 % 2;
        return fProcessCameraProviderExtensionsKt;
    }

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 79;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        return resultPerform2;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/CaptureInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e1 extends Lambda implements Function1<CaptureInfo, CaptureInfo> {
        private static int ProcessCameraProviderExtensionsKt = 1;
        private static int getAvailableCameraInternals = 0;
        private /* synthetic */ Function1<String, Unit> CameraConstants;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private /* synthetic */ DocumentStageInput f3602e1;

        private CaptureInfo IncodeCamera(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 111;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            CaptureInfo captureInfoCopy$default = CaptureInfo.copy$default(captureInfo, null, null, null, null, null, null, null, null, null, null, Float.valueOf(CaptureCandidate.access$getScore(CaptureCandidate.this, this.f3602e1, this.CameraConstants)), null, null, null, null, null, null, null, null, null, 1047551, null);
            int i5 = getAvailableCameraInternals + 9;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            return captureInfoCopy$default;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureInfo invoke(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 73;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            CaptureInfo captureInfoIncodeCamera = IncodeCamera(captureInfo);
            int i5 = ProcessCameraProviderExtensionsKt + 69;
            getAvailableCameraInternals = i5 % 128;
            int i6 = i5 % 2;
            return captureInfoIncodeCamera;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e1(DocumentStageInput documentStageInput, Function1<? super String, Unit> function1) {
            super(1);
            this.f3602e1 = documentStageInput;
            this.CameraConstants = function1;
        }
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<DocumentAnalysisEvent> perform2(DocumentStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        input.updateCaptureInfo(new e1(input, logger));
        Stage.Result.Proceed proceed = new Stage.Result.Proceed(new DocumentAnalysisEvent.CaptureCandidateGenerated(input.getBitmap(), input.getCaptureInfo()));
        int i3 = IncodeCamera + 1;
        getAvailableCameraInternals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return proceed;
    }

    private static float ProcessCameraProviderExtensionsKt(DocumentStageInput documentStageInput, Function1<? super String, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 47;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        CaptureInfo captureInfo = documentStageInput.getCaptureInfo();
        Float blur = captureInfo.getBlur();
        Intrinsics.checkNotNull(blur);
        float fFloatValue = 1.0f / (blur.floatValue() + 1.0f);
        Float glare = captureInfo.getGlare();
        Intrinsics.checkNotNull(glare);
        float fFloatValue2 = 1.0f / (glare.floatValue() + 1.0f);
        Float cls = captureInfo.getCls();
        Intrinsics.checkNotNull(cls);
        float fFloatValue3 = cls.floatValue() + fFloatValue + fFloatValue2;
        if (function1 != null) {
            function1.invoke(StringExtensionKt.trimNewline("\n                    result -> " + captureInfo + ",\n                    clsScore: " + captureInfo.getCls() + ",\n                    blurScore: " + fFloatValue + ",\n                    glareScore: " + fFloatValue2 + ",\n                    total: " + fFloatValue3 + ",\n                "));
        }
        int i5 = IncodeCamera + 31;
        getAvailableCameraInternals = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue3;
    }
}
