package com.incode.camera.analysis.document.stages;

import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentStageInput;
import com.incode.camera.analysis.document.ImageKitWrapper;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/incode/camera/analysis/document/stages/Brightness;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "imageKitWrapper", "Lcom/incode/camera/analysis/document/ImageKitWrapper;", "(Lcom/incode/camera/analysis/document/ImageKitWrapper;)V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Brightness extends DocumentStage {
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3600e1 = 1;
    private final ImageKitWrapper CameraConstants;

    public Brightness(ImageKitWrapper imageKitWrapper) {
        Intrinsics.checkNotNullParameter(imageKitWrapper, "");
        this.CameraConstants = imageKitWrapper;
    }

    public static final /* synthetic */ ImageKitWrapper access$getImageKitWrapper$p(Brightness brightness) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 9;
        f3600e1 = i3 % 128;
        int i4 = i3 % 2;
        ImageKitWrapper imageKitWrapper = brightness.CameraConstants;
        if (i4 != 0) {
            return imageKitWrapper;
        }
        throw null;
    }

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f3600e1 + 73;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        int i5 = f3600e1 + 123;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        int i6 = i5 % 2;
        return resultPerform2;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/CaptureInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class IncodeCamera extends Lambda implements Function1<CaptureInfo, CaptureInfo> {
        private static int IncodeCamera = 0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3601e1 = 1;
        private /* synthetic */ DocumentStageInput getAvailableCameraInternals;

        private CaptureInfo CameraConstants(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = f3601e1 + 111;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            CaptureInfo captureInfoCopy$default = CaptureInfo.copy$default(captureInfo, null, null, null, null, null, Float.valueOf(Brightness.access$getImageKitWrapper$p(Brightness.this).getCenterBrightnessLevel(this.getAvailableCameraInternals.getBitmap())), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048543, null);
            int i5 = IncodeCamera + 67;
            f3601e1 = i5 % 128;
            if (i5 % 2 != 0) {
                return captureInfoCopy$default;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureInfo invoke(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = f3601e1 + 33;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            CaptureInfo captureInfoCameraConstants = CameraConstants(captureInfo);
            int i5 = IncodeCamera + 125;
            f3601e1 = i5 % 128;
            int i6 = i5 % 2;
            return captureInfoCameraConstants;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IncodeCamera(DocumentStageInput documentStageInput) {
            super(1);
            this.getAvailableCameraInternals = documentStageInput;
        }
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<DocumentAnalysisEvent> perform2(DocumentStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        input.updateCaptureInfo(new IncodeCamera(input));
        Float brightness = input.getCaptureInfo().getBrightness();
        if (brightness == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (brightness.floatValue() < input.getConfig().getLightMinThreshold()) {
            Stage.Result.Abort abort = new Stage.Result.Abort(new DocumentAnalysisEvent.TooDark(input.getCaptureInfo()));
            int i3 = f3600e1 + 17;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            return abort;
        }
        Object obj = null;
        Stage.Result.Proceed proceed = new Stage.Result.Proceed(null, 1, null);
        int i5 = f3600e1 + 43;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        if (i5 % 2 == 0) {
            return proceed;
        }
        obj.hashCode();
        throw null;
    }
}
