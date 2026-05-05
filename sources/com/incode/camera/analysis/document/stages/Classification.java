package com.incode.camera.analysis.document.stages;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentStageInput;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¨\u0006\r"}, d2 = {"Lcom/incode/camera/analysis/document/stages/Classification;", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "input", "Lcom/incode/camera/analysis/document/DocumentStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "Companion", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Classification extends DocumentStage {
    public static final float ALIGNMENT_THRESHOLD = 0.6f;
    private static int CameraConstants = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3605e1 = 1;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<DocumentAnalysisEvent> perform(DocumentStageInput documentStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f3605e1 + 87;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<DocumentAnalysisEvent> resultPerform2 = perform2(documentStageInput, (Function1<? super String, Unit>) function1);
        int i5 = f3605e1 + 99;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        int i6 = i5 % 2;
        return resultPerform2;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/CaptureInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class CameraConstants extends Lambda implements Function1<CaptureInfo, CaptureInfo> {
        private static int CameraConstants = 0;
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3606e1 = 1;
        public static final CameraConstants getAvailableCameraInternals = new CameraConstants();

        private static CaptureInfo ProcessCameraProviderExtensionsKt(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 71;
            IncodeCamera = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(captureInfo, "");
                CaptureInfo.copy$default(captureInfo, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, 1044479, null);
                throw null;
            }
            Intrinsics.checkNotNullParameter(captureInfo, "");
            CaptureInfo captureInfoCopy$default = CaptureInfo.copy$default(captureInfo, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, 1044479, null);
            int i4 = ProcessCameraProviderExtensionsKt + 25;
            IncodeCamera = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return captureInfoCopy$default;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureInfo invoke(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 125;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            CaptureInfo captureInfoProcessCameraProviderExtensionsKt = ProcessCameraProviderExtensionsKt(captureInfo);
            int i5 = ProcessCameraProviderExtensionsKt + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            IncodeCamera = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 46 / 0;
            }
            return captureInfoProcessCameraProviderExtensionsKt;
        }

        static {
            int i2 = CameraConstants + 93;
            f3606e1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 66 / 0;
            }
        }

        CameraConstants() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053 A[PHI: r1 r2
  0x0053: PHI (r1v15 java.util.List<android.graphics.Point>) = (r1v12 java.util.List<android.graphics.Point>), (r1v16 java.util.List<android.graphics.Point>) binds: [B:20:0x00af, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r2v8 java.lang.Float) = (r2v6 java.lang.Float), (r2v9 java.lang.Float) binds: [B:20:0x00af, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.camera.analysis.Stage.Result<com.incode.camera.analysis.document.DocumentAnalysisEvent> perform2(com.incode.camera.analysis.document.DocumentStageInput r7, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.document.stages.Classification.perform2(com.incode.camera.analysis.document.DocumentStageInput, kotlin.jvm.functions.Function1):com.incode.camera.analysis.Stage$Result");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/analysis/document/stages/Classification$Companion;", "", "()V", "ALIGNMENT_THRESHOLD", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i2 = CameraConstants + 31;
        IncodeCamera = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
