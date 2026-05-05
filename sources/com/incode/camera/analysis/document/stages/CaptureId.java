package com.incode.camera.analysis.document.stages;

import android.graphics.Point;
import android.graphics.Rect;
import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentKitWrapper;
import com.incode.camera.analysis.document.DocumentStageInput;
import com.incode.camera.commons.utils.PointListToRectApproximator;
import com.incode.camera.commons.utils.RecogKitResultExtensionKt;
import com.incode.camera.commons.utils.Side;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import io.sentry.SentryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/incode/camera/analysis/document/stages/CaptureId;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "documentKitWrapper", "Lcom/incode/camera/analysis/document/DocumentKitWrapper;", "approximator", "Lcom/incode/camera/commons/utils/PointListToRectApproximator;", "(Lcom/incode/camera/analysis/document/DocumentKitWrapper;Lcom/incode/camera/commons/utils/PointListToRectApproximator;)V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CaptureId extends DocumentStage {
    private static int ProcessCameraProviderExtensionsKt = 1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3603e1 = 0;
    private final PointListToRectApproximator IncodeCamera;
    private final DocumentKitWrapper getAvailableCameraInternals;

    @Override // com.incode.camera.analysis.Stage
    public final /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 87;
        f3603e1 = i3 % 128;
        DocumentStageInput documentStageInput2 = documentStageInput;
        if (i3 % 2 != 0) {
            perform2(documentStageInput2, (Function1<? super String, Unit>) function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput2, (Function1<? super String, Unit>) function1);
        int i4 = f3603e1 + 87;
        ProcessCameraProviderExtensionsKt = i4 % 128;
        int i5 = i4 % 2;
        return resultPerform2;
    }

    public CaptureId(DocumentKitWrapper documentKitWrapper, PointListToRectApproximator pointListToRectApproximator) {
        Intrinsics.checkNotNullParameter(documentKitWrapper, "");
        Intrinsics.checkNotNullParameter(pointListToRectApproximator, "");
        this.getAvailableCameraInternals = documentKitWrapper;
        this.IncodeCamera = pointListToRectApproximator;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/CaptureInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class ProcessCameraProviderExtensionsKt extends Lambda implements Function1<CaptureInfo, CaptureInfo> {
        private static int IncodeCamera = 0;
        private static int getConfig = 1;
        private /* synthetic */ IdCaptureKitAndroid.Result CameraConstants;
        private /* synthetic */ Boolean ProcessCameraProviderExtensionsKt;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private /* synthetic */ List<Point> f3604e1;
        private /* synthetic */ Rect getAvailableCameraInternals;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureInfo invoke(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = getConfig + 83;
            IncodeCamera = i3 % 128;
            CaptureInfo captureInfo2 = captureInfo;
            if (i3 % 2 == 0) {
                return IncodeCamera(captureInfo2);
            }
            IncodeCamera(captureInfo2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private CaptureInfo IncodeCamera(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 73;
            getConfig = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            Side documentSide = RecogKitResultExtensionKt.getDocumentSide(this.CameraConstants);
            float f2 = this.CameraConstants.cls;
            float f3 = this.CameraConstants.blur;
            float f4 = this.CameraConstants.glare;
            Float brightness = captureInfo.getBrightness();
            float f5 = this.CameraConstants.frontScore;
            float f6 = this.CameraConstants.backScore;
            float f7 = this.CameraConstants.idScore;
            float f8 = this.CameraConstants.passportScore;
            CaptureInfo captureInfoCopy$default = CaptureInfo.copy$default(captureInfo, this.f3604e1, documentSide, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), brightness, null, null, null, this.getAvailableCameraInternals, null, this.ProcessCameraProviderExtensionsKt, null, Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), this.CameraConstants.idType, Float.valueOf(this.CameraConstants.docAreaRatio), Float.valueOf(this.CameraConstants.iouScore), 5568, null);
            int i5 = IncodeCamera + 27;
            getConfig = i5 % 128;
            int i6 = i5 % 2;
            return captureInfoCopy$default;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ProcessCameraProviderExtensionsKt(IdCaptureKitAndroid.Result result, List<? extends Point> list, Rect rect, Boolean bool) {
            super(1);
            this.CameraConstants = result;
            this.f3604e1 = list;
            this.getAvailableCameraInternals = rect;
            this.ProcessCameraProviderExtensionsKt = bool;
        }
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<DocumentAnalysisEvent> perform2(DocumentStageInput input, Function1<? super String, Unit> logger) throws RecogKitInvalidInputException, RecogKitProcessException {
        Boolean boolValueOf;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        IdCaptureKitAndroid.Result resultDetectId = this.getAvailableCameraInternals.detectId(input.getBitmap());
        Point[] pointArr = resultDetectId.quad;
        List<? extends Point> list = pointArr != null ? ArraysKt.toList(pointArr) : null;
        Rect approximatedRect = list != null ? this.IncodeCamera.getApproximatedRect(list) : null;
        if (approximatedRect != null) {
            int i3 = f3603e1 + 47;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            boolValueOf = Boolean.valueOf(approximatedRect.height() > approximatedRect.width());
        } else {
            int i5 = f3603e1 + 33;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            boolValueOf = null;
        }
        input.updateCaptureInfo(new ProcessCameraProviderExtensionsKt(resultDetectId, list, approximatedRect, boolValueOf));
        if (logger != null) {
            int i7 = ProcessCameraProviderExtensionsKt + 77;
            f3603e1 = i7 % 128;
            int i8 = i7 % 2;
            logger.invoke("    CaptureInfo -> " + input.getCaptureInfo());
        }
        return new Stage.Result.Proceed(null, 1, null);
    }
}
