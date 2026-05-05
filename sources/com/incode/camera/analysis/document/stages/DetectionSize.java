package com.incode.camera.analysis.document.stages;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentAnalyzer;
import com.incode.camera.analysis.document.DocumentStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/incode/camera/analysis/document/stages/DetectionSize;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "documentSizeConstraint", "Lkotlin/Function0;", "Lcom/incode/camera/analysis/document/DocumentAnalyzer$DocumentSizeConstraint;", "(Lkotlin/jvm/functions/Function0;)V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DetectionSize extends DocumentStage {
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final Function0<DocumentAnalyzer.DocumentSizeConstraint> f3607e1;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 15;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        int i6 = ProcessCameraProviderExtensionsKt + 61;
        IncodeCamera = i6 % 128;
        if (i6 % 2 != 0) {
            return resultPerform2;
        }
        throw null;
    }

    public DetectionSize(Function0<DocumentAnalyzer.DocumentSizeConstraint> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.f3607e1 = function0;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/CaptureInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class getAvailableCameraInternals extends Lambda implements Function1<CaptureInfo, CaptureInfo> {
        private static int IncodeCamera = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3608e1 = 0;
        private /* synthetic */ int CameraConstants;
        private /* synthetic */ int ProcessCameraProviderExtensionsKt;
        private /* synthetic */ int getAvailableCameraInternals;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureInfo invoke(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3608e1 = i3 % 128;
            int i4 = i3 % 2;
            CaptureInfo captureInfoE1 = e1(captureInfo);
            int i5 = IncodeCamera + 31;
            f3608e1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
            return captureInfoE1;
        }

        private CaptureInfo e1(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 51;
            f3608e1 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            CaptureInfo captureInfoCopy$default = CaptureInfo.copy$default(captureInfo, null, null, null, null, null, null, Integer.valueOf(this.CameraConstants), Integer.valueOf(this.ProcessCameraProviderExtensionsKt), Integer.valueOf(this.getAvailableCameraInternals), null, null, null, null, null, null, null, null, null, null, null, 1048127, null);
            int i5 = IncodeCamera + 23;
            f3608e1 = i5 % 128;
            if (i5 % 2 == 0) {
                return captureInfoCopy$default;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getAvailableCameraInternals(int i2, int i3, int i4) {
            super(1);
            this.CameraConstants = i2;
            this.ProcessCameraProviderExtensionsKt = i3;
            this.getAvailableCameraInternals = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[PHI: r9 r10
  0x0082: PHI (r9v3 int) = (r9v0 int), (r9v4 int) binds: [B:29:0x00ff, B:17:0x0080] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r10v3 int) = (r10v0 int), (r10v4 int) binds: [B:29:0x00ff, B:17:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[PHI: r9 r10
  0x0091: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:29:0x00ff, B:19:0x008f, B:17:0x0080] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:29:0x00ff, B:19:0x008f, B:17:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.camera.analysis.Stage.Result<com.incode.camera.analysis.document.DocumentAnalysisEvent> perform2(com.incode.camera.analysis.document.DocumentStageInput r13, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.document.stages.DetectionSize.perform2(com.incode.camera.analysis.document.DocumentStageInput, kotlin.jvm.functions.Function1):com.incode.camera.analysis.Stage$Result");
    }
}
