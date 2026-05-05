package com.incode.camera.analysis.document;

import android.graphics.Bitmap;
import androidx.core.app.FrameMetricsAggregator;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.react.uimanager.ViewProps;
import com.incode.camera.analysis.FrameAnalyzer;
import com.incode.camera.analysis.StageExecutor;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.stages.Blur;
import com.incode.camera.analysis.document.stages.Bounds;
import com.incode.camera.analysis.document.stages.Brightness;
import com.incode.camera.analysis.document.stages.CaptureCandidate;
import com.incode.camera.analysis.document.stages.CaptureId;
import com.incode.camera.analysis.document.stages.Classification;
import com.incode.camera.analysis.document.stages.DetectionSize;
import com.incode.camera.analysis.document.stages.DocumentStage;
import com.incode.camera.analysis.document.stages.Glare;
import com.incode.camera.analysis.document.stages.IdTypeInfo;
import com.incode.camera.analysis.document.stages.OrientationInfo;
import com.incode.camera.commons.utils.ExecLogger;
import com.incode.camera.commons.utils.PointListToRectApproximator;
import com.incode.camera.commons.utils.StringExtensionKt;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003123BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0016\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-H\u0096@¢\u0006\u0002\u0010.J\b\u0010/\u001a\u000200H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u001e8PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R'\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalyzer;", "Lcom/incode/camera/analysis/FrameAnalyzer;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "Lcom/incode/camera/analysis/document/DocumentStageInput;", "recogWrapper", "Lcom/incode/camera/analysis/document/DocumentKitWrapper;", "imageKitWrapper", "Lcom/incode/camera/analysis/document/ImageKitWrapper;", "config", "Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;", "statusBus", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "execLogger", "Lcom/incode/camera/commons/utils/ExecLogger;", "approximator", "Lcom/incode/camera/commons/utils/PointListToRectApproximator;", "(Lcom/incode/camera/analysis/document/DocumentKitWrapper;Lcom/incode/camera/analysis/document/ImageKitWrapper;Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/incode/camera/commons/utils/ExecLogger;Lcom/incode/camera/commons/utils/PointListToRectApproximator;)V", "getConfig", "()Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "frameDropDelayInMs", "", "getFrameDropDelayInMs", "()J", "setFrameDropDelayInMs", "(J)V", "stageExecutor", "Lcom/incode/camera/analysis/StageExecutor;", "getStageExecutor$core_light_release", "()Lcom/incode/camera/analysis/StageExecutor;", "stageExecutor$delegate", "Lkotlin/Lazy;", "stages", "", "Lcom/incode/camera/analysis/document/stages/DocumentStage;", "getStages$core_light_release$annotations", "()V", "getStages$core_light_release", "()Ljava/util/List;", "stages$delegate", "processBitmap", "cameraBitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldLogAnalysis", "", "Companion", "Config", "DocumentSizeConstraint", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentAnalyzer extends FrameAnalyzer<DocumentAnalysisEvent, DocumentStageInput> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int getAnalysisEvents = 1;
    private static int getCameraState = 1;
    private static int getExposureCompensationState = 0;
    private static int getImagePreview = 0;
    private final ImageKitWrapper CameraConstants;
    private final ExecLogger IncodeCamera;
    private final DocumentKitWrapper ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1 */
    private final MutableSharedFlow<DocumentAnalysisEvent> f3590e1;
    private final Config getAvailableCameraInternals;
    private final Lazy getConfig;
    private final Lazy getContext;
    private final PointListToRectApproximator getFrameAnalyzerWrapper;
    private final Flow<DocumentAnalysisEvent> getPreviewView;
    private long setConfig;

    public static final /* synthetic */ PointListToRectApproximator access$getApproximator$p(DocumentAnalyzer documentAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getImagePreview;
        int i4 = i3 + 105;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        PointListToRectApproximator pointListToRectApproximator = documentAnalyzer.getFrameAnalyzerWrapper;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 41;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
        return pointListToRectApproximator;
    }

    public static final /* synthetic */ ImageKitWrapper access$getImageKitWrapper$p(DocumentAnalyzer documentAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 121;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        ImageKitWrapper imageKitWrapper = documentAnalyzer.CameraConstants;
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        return imageKitWrapper;
    }

    public static final /* synthetic */ DocumentKitWrapper access$getRecogWrapper$p(DocumentAnalyzer documentAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 5;
        getImagePreview = i3 % 128;
        int i4 = i3 % 2;
        DocumentKitWrapper documentKitWrapper = documentAnalyzer.ProcessCameraProviderExtensionsKt;
        if (i4 != 0) {
            int i5 = 36 / 0;
        }
        return documentKitWrapper;
    }

    public static final /* synthetic */ MutableSharedFlow access$getStatusBus$p(DocumentAnalyzer documentAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 53;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        MutableSharedFlow<DocumentAnalysisEvent> mutableSharedFlow = documentAnalyzer.f3590e1;
        if (i4 != 0) {
            return mutableSharedFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ DocumentAnalyzer(DocumentKitWrapper documentKitWrapper, ImageKitWrapper imageKitWrapper, Config config, MutableSharedFlow mutableSharedFlow, ExecLogger execLogger, PointListToRectApproximator pointListToRectApproximator, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentKitWrapper, imageKitWrapper, (i2 & 4) != 0 ? new Config(false, false, 0.0f, 0.0f, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : config, (i2 & 8) != 0 ? SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null) : mutableSharedFlow, (i2 & 16) != 0 ? new ExecLogger("DocumentAnalyzer") : execLogger, (i2 & 32) != 0 ? new PointListToRectApproximator() : pointListToRectApproximator);
    }

    public final Config getConfig() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 125;
        getCameraState = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getAvailableCameraInternals;
        }
        throw null;
    }

    public DocumentAnalyzer(DocumentKitWrapper documentKitWrapper, ImageKitWrapper imageKitWrapper, Config config, MutableSharedFlow<DocumentAnalysisEvent> mutableSharedFlow, ExecLogger execLogger, PointListToRectApproximator pointListToRectApproximator) {
        Intrinsics.checkNotNullParameter(documentKitWrapper, "");
        Intrinsics.checkNotNullParameter(imageKitWrapper, "");
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "");
        Intrinsics.checkNotNullParameter(execLogger, "");
        Intrinsics.checkNotNullParameter(pointListToRectApproximator, "");
        this.ProcessCameraProviderExtensionsKt = documentKitWrapper;
        this.CameraConstants = imageKitWrapper;
        this.getAvailableCameraInternals = config;
        this.f3590e1 = mutableSharedFlow;
        this.IncodeCamera = execLogger;
        this.getFrameAnalyzerWrapper = pointListToRectApproximator;
        this.getPreviewView = mutableSharedFlow;
        this.setConfig = 250L;
        this.getContext = LazyKt.lazy(new Function0<List<? extends DocumentStage>>() { // from class: com.incode.camera.analysis.document.DocumentAnalyzer$stages$2
            private static int IncodeCamera = 1;
            private static int getAvailableCameraInternals = 0;

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ List<? extends DocumentStage> invoke() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 41;
                IncodeCamera = i3 % 128;
                int i4 = i3 % 2;
                List<? extends DocumentStage> listInvoke = invoke();
                int i5 = getAvailableCameraInternals + 97;
                IncodeCamera = i5 % 128;
                int i6 = i5 % 2;
                return listInvoke;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends DocumentStage> invoke() {
                int i2 = 2 % 2;
                List listMutableListOf = CollectionsKt.mutableListOf(new Brightness(DocumentAnalyzer.access$getImageKitWrapper$p(this.CameraConstants)), new CaptureId(DocumentAnalyzer.access$getRecogWrapper$p(this.CameraConstants), DocumentAnalyzer.access$getApproximator$p(this.CameraConstants)), new IdTypeInfo(), new Classification(), new Bounds(), new OrientationInfo());
                DocumentAnalyzer documentAnalyzer = this.CameraConstants;
                if (documentAnalyzer.getConfig().getGlareThreshold() != null) {
                    listMutableListOf.add(new Glare(0.0f, 1, null));
                }
                if (documentAnalyzer.getConfig().getBlurThreshold() != null) {
                    listMutableListOf.add(new Blur());
                }
                listMutableListOf.add(new DetectionSize(documentAnalyzer.getConfig().getDocumentSizeConstraint()));
                listMutableListOf.add(new CaptureCandidate());
                List<? extends DocumentStage> list = CollectionsKt.toList(listMutableListOf);
                int i3 = getAvailableCameraInternals + 67;
                IncodeCamera = i3 % 128;
                int i4 = i3 % 2;
                return list;
            }

            {
                super(0);
            }
        });
        this.getConfig = LazyKt.lazy(new Function0<StageExecutor<DocumentStageInput, DocumentAnalysisEvent>>() { // from class: com.incode.camera.analysis.document.DocumentAnalyzer$stageExecutor$2
            private static int CameraConstants = 1;
            private static int IncodeCamera = 0;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final StageExecutor<DocumentStageInput, DocumentAnalysisEvent> invoke() {
                int i2 = 2 % 2;
                StageExecutor<DocumentStageInput, DocumentAnalysisEvent> stageExecutor = new StageExecutor<>(DocumentAnalyzer.access$getStatusBus$p(this.ProcessCameraProviderExtensionsKt), this.ProcessCameraProviderExtensionsKt.getStages$core_light_release());
                int i3 = IncodeCamera + 65;
                CameraConstants = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 64 / 0;
                }
                return stageExecutor;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ StageExecutor<DocumentStageInput, DocumentAnalysisEvent> invoke() {
                int i2 = 2 % 2;
                int i3 = CameraConstants + 21;
                IncodeCamera = i3 % 128;
                if (i3 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;", "", "loggingEnabled", "", "loggingDistinct", "lightMinThreshold", "", "classificationThreshold", "blurThreshold", "glareThreshold", "sideThreshold", "iouThreshold", "documentSizeConstraint", "Lkotlin/Function0;", "Lcom/incode/camera/analysis/document/DocumentAnalyzer$DocumentSizeConstraint;", "(ZZFFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;)V", "getBlurThreshold", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getClassificationThreshold", "()F", "getDocumentSizeConstraint", "()Lkotlin/jvm/functions/Function0;", "getGlareThreshold", "getIouThreshold", "getLightMinThreshold", "getLoggingDistinct", "()Z", "getLoggingEnabled", "getSideThreshold", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Config {
        private static int getImagePreview = 1;
        private static int setConfig = 0;
        private final float CameraConstants;
        private final boolean IncodeCamera;
        private final Float ProcessCameraProviderExtensionsKt;

        /* JADX INFO: renamed from: e1 */
        private final boolean f3591e1;
        private final float getAvailableCameraInternals;
        private final Float getConfig;
        private final Function0<DocumentSizeConstraint> getContext;
        private final Float getFrameAnalyzerWrapper;
        private final Float getPreviewView;

        public Config(boolean z2, boolean z3, float f2, float f3, Float f4, Float f5, Float f6, Float f7, Function0<DocumentSizeConstraint> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.f3591e1 = z2;
            this.IncodeCamera = z3;
            this.CameraConstants = f2;
            this.getAvailableCameraInternals = f3;
            this.ProcessCameraProviderExtensionsKt = f4;
            this.getPreviewView = f5;
            this.getFrameAnalyzerWrapper = f6;
            this.getConfig = f7;
            this.getContext = function0;
        }

        public final boolean getLoggingEnabled() {
            int i2 = 2 % 2;
            int i3 = setConfig;
            int i4 = i3 + 11;
            getImagePreview = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f3591e1;
            int i6 = i3 + 21;
            getImagePreview = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean getLoggingDistinct() {
            int i2 = 2 % 2;
            int i3 = getImagePreview + 13;
            setConfig = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.IncodeCamera;
            if (i4 != 0) {
                int i5 = 48 / 0;
            }
            return z2;
        }

        public final float getLightMinThreshold() {
            int i2 = 2 % 2;
            int i3 = setConfig;
            int i4 = i3 + 67;
            getImagePreview = i4 % 128;
            int i5 = i4 % 2;
            float f2 = this.CameraConstants;
            int i6 = i3 + 61;
            getImagePreview = i6 % 128;
            if (i6 % 2 != 0) {
                return f2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getClassificationThreshold() {
            int i2 = 2 % 2;
            int i3 = setConfig;
            int i4 = i3 + 27;
            getImagePreview = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f2 = this.getAvailableCameraInternals;
            int i5 = i3 + 89;
            getImagePreview = i5 % 128;
            int i6 = i5 % 2;
            return f2;
        }

        public /* synthetic */ Config(boolean z2, boolean z3, float f2, float f3, Float f4, Float f5, Float f6, Float f7, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3, (i2 & 4) != 0 ? 50.0f : f2, (i2 & 8) != 0 ? 0.98f : f3, (i2 & 16) != 0 ? Float.valueOf(0.3f) : f4, (i2 & 32) != 0 ? Float.valueOf(0.3f) : f5, (i2 & 64) != 0 ? Float.valueOf(0.7f) : f6, (i2 & 128) != 0 ? Float.valueOf(0.8f) : f7, (i2 & 256) != 0 ? AnonymousClass1.INSTANCE : function0);
        }

        public final Float getBlurThreshold() {
            int i2 = 2 % 2;
            int i3 = getImagePreview;
            int i4 = i3 + 85;
            setConfig = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Float f2 = this.ProcessCameraProviderExtensionsKt;
            int i5 = i3 + 71;
            setConfig = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 88 / 0;
            }
            return f2;
        }

        public final Float getGlareThreshold() {
            int i2 = 2 % 2;
            int i3 = setConfig + 73;
            getImagePreview = i3 % 128;
            if (i3 % 2 != 0) {
                return this.getPreviewView;
            }
            throw null;
        }

        public final Float getSideThreshold() {
            int i2 = 2 % 2;
            int i3 = getImagePreview + 51;
            setConfig = i3 % 128;
            int i4 = i3 % 2;
            Float f2 = this.getFrameAnalyzerWrapper;
            if (i4 != 0) {
                int i5 = 58 / 0;
            }
            return f2;
        }

        /* JADX INFO: renamed from: com.incode.camera.analysis.document.DocumentAnalyzer$Config$1 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/DocumentAnalyzer$DocumentSizeConstraint;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends Lambda implements Function0<DocumentSizeConstraint> {
            public static final AnonymousClass1 INSTANCE = ;
            private static int IncodeCamera = 1;
            private static int ProcessCameraProviderExtensionsKt = 1;

            /* JADX INFO: renamed from: e1 */
            private static int f3592e1 = 0;
            private static int getAvailableCameraInternals = 0;

            @Override // kotlin.jvm.functions.Function0
            public final DocumentSizeConstraint invoke() {
                int i2 = 2 % 2;
                DocumentSizeConstraint documentSizeConstraint = new DocumentSizeConstraint(0.0f, 0.0f, 0.0f, 7, null);
                int i3 = f3592e1 + 69;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                return documentSizeConstraint;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ DocumentSizeConstraint invoke() {
                int i2 = 2 % 2;
                int i3 = ProcessCameraProviderExtensionsKt + 17;
                f3592e1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    invoke();
                    throw null;
                }
                DocumentSizeConstraint documentSizeConstraintInvoke = invoke();
                int i4 = ProcessCameraProviderExtensionsKt + 113;
                f3592e1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return documentSizeConstraintInvoke;
                }
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = getAvailableCameraInternals + 13;
                IncodeCamera = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass1() {
            }
        }

        public final Float getIouThreshold() {
            int i2 = 2 % 2;
            int i3 = setConfig;
            int i4 = i3 + 79;
            getImagePreview = i4 % 128;
            int i5 = i4 % 2;
            Float f2 = this.getConfig;
            int i6 = i3 + 69;
            getImagePreview = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 62 / 0;
            }
            return f2;
        }

        public final Function0<DocumentSizeConstraint> getDocumentSizeConstraint() {
            int i2 = 2 % 2;
            int i3 = getImagePreview;
            int i4 = i3 + 3;
            setConfig = i4 % 128;
            int i5 = i4 % 2;
            Function0<DocumentSizeConstraint> function0 = this.getContext;
            int i6 = i3 + 65;
            setConfig = i6 % 128;
            int i7 = i6 % 2;
            return function0;
        }

        public Config() {
            this(false, false, 0.0f, 0.0f, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalyzer$DocumentSizeConstraint;", "", ViewProps.MIN_WIDTH, "", ViewProps.MAX_WIDTH, "verticalMultiplier", "(FFF)V", "getMaxWidth", "()F", "getMinWidth", "getVerticalMultiplier", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentSizeConstraint {
        private static int IncodeCamera = 1;
        private static int getAvailableCameraInternals = 0;
        private final float CameraConstants;
        private final float ProcessCameraProviderExtensionsKt;

        /* JADX INFO: renamed from: e1 */
        private final float f3593e1;

        public DocumentSizeConstraint(float f2, float f3, float f4) {
            this.ProcessCameraProviderExtensionsKt = f2;
            this.f3593e1 = f3;
            this.CameraConstants = f4;
        }

        public /* synthetic */ DocumentSizeConstraint(float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.5f : f2, (i2 & 2) != 0 ? 0.95f : f3, (i2 & 4) != 0 ? 1.0f : f4);
        }

        public final float getMinWidth() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 109;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            float f2 = this.ProcessCameraProviderExtensionsKt;
            if (i4 != 0) {
                int i5 = 79 / 0;
            }
            return f2;
        }

        public final float getMaxWidth() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 91;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            float f2 = this.f3593e1;
            int i5 = i4 + 17;
            getAvailableCameraInternals = i5 % 128;
            if (i5 % 2 == 0) {
                return f2;
            }
            throw null;
        }

        public final float getVerticalMultiplier() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 57;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f2 = this.CameraConstants;
            int i5 = i4 + 83;
            getAvailableCameraInternals = i5 % 128;
            int i6 = i5 % 2;
            return f2;
        }

        public DocumentSizeConstraint() {
            this(0.0f, 0.0f, 0.0f, 7, null);
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals;
            int i4 = i3 + 63;
            IncodeCamera = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentSizeConstraint)) {
                int i5 = i3 + 21;
                IncodeCamera = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            DocumentSizeConstraint documentSizeConstraint = (DocumentSizeConstraint) other;
            if (Float.compare(this.ProcessCameraProviderExtensionsKt, documentSizeConstraint.ProcessCameraProviderExtensionsKt) != 0) {
                return false;
            }
            if (Float.compare(this.f3593e1, documentSizeConstraint.f3593e1) != 0) {
                int i7 = getAvailableCameraInternals + 123;
                IncodeCamera = i7 % 128;
                return i7 % 2 == 0;
            }
            if (Float.compare(this.CameraConstants, documentSizeConstraint.CameraConstants) == 0) {
                return true;
            }
            int i8 = getAvailableCameraInternals + 7;
            IncodeCamera = i8 % 128;
            return i8 % 2 == 0;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 61;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((Float.hashCode(this.ProcessCameraProviderExtensionsKt) * 31) + Float.hashCode(this.f3593e1)) * 31) + Float.hashCode(this.CameraConstants);
            int i5 = getAvailableCameraInternals + 71;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 27;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            String str = "DocumentSizeConstraint(minWidth=" + this.ProcessCameraProviderExtensionsKt + ", maxWidth=" + this.f3593e1 + ", verticalMultiplier=" + this.CameraConstants + ")";
            int i5 = getAvailableCameraInternals + 63;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static /* synthetic */ DocumentSizeConstraint copy$default(DocumentSizeConstraint documentSizeConstraint, float f2, float f3, float f4, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 1) != 0) {
                int i4 = IncodeCamera;
                int i5 = i4 + 123;
                getAvailableCameraInternals = i5 % 128;
                if (i5 % 2 != 0) {
                    float f5 = documentSizeConstraint.ProcessCameraProviderExtensionsKt;
                    throw null;
                }
                f2 = documentSizeConstraint.ProcessCameraProviderExtensionsKt;
                int i6 = i4 + 81;
                getAvailableCameraInternals = i6 % 128;
                int i7 = i6 % 2;
            }
            if ((i2 & 2) != 0) {
                int i8 = getAvailableCameraInternals + 53;
                IncodeCamera = i8 % 128;
                int i9 = i8 % 2;
                f3 = documentSizeConstraint.f3593e1;
            }
            if ((i2 & 4) != 0) {
                f4 = documentSizeConstraint.CameraConstants;
            }
            return documentSizeConstraint.copy(f2, f3, f4);
        }

        public final DocumentSizeConstraint copy(float f2, float f3, float verticalMultiplier) {
            int i2 = 2 % 2;
            DocumentSizeConstraint documentSizeConstraint = new DocumentSizeConstraint(f2, f3, verticalMultiplier);
            int i3 = IncodeCamera + 19;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                return documentSizeConstraint;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float component3() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 101;
            int i4 = i3 % 128;
            getAvailableCameraInternals = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f2 = this.CameraConstants;
            int i5 = i4 + 13;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return f2;
        }

        public final float component2() {
            float f2;
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 101;
            getAvailableCameraInternals = i4 % 128;
            if (i4 % 2 != 0) {
                f2 = this.f3593e1;
                int i5 = 45 / 0;
            } else {
                f2 = this.f3593e1;
            }
            int i6 = i3 + 61;
            getAvailableCameraInternals = i6 % 128;
            int i7 = i6 % 2;
            return f2;
        }

        public final float component1() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 83;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            float f2 = this.ProcessCameraProviderExtensionsKt;
            if (i4 == 0) {
                int i5 = 42 / 0;
            }
            return f2;
        }
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final boolean shouldLogAnalysis() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 121;
        getImagePreview = i3 % 128;
        if (i3 % 2 != 0) {
            this.IncodeCamera.isTagLoggable("incodeAnalysis");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsTagLoggable = this.IncodeCamera.isTagLoggable("incodeAnalysis");
        int i4 = getImagePreview + 65;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        return zIsTagLoggable;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final Flow<DocumentAnalysisEvent> getEvents() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 13;
        getImagePreview = i3 % 128;
        int i4 = i3 % 2;
        Flow<DocumentAnalysisEvent> flow = this.getPreviewView;
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        return flow;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final long getFrameDropDelayInMs() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 109;
        getImagePreview = i3 % 128;
        if (i3 % 2 == 0) {
            return this.setConfig;
        }
        throw null;
    }

    public final void setFrameDropDelayInMs(long j2) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 99;
        getImagePreview = i3 % 128;
        int i4 = i3 % 2;
        this.setConfig = j2;
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
    }

    public final List<DocumentStage> getStages$core_light_release() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + 125;
        getCameraState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<DocumentStage> list = (List) this.getContext.getValue();
        int i4 = getImagePreview + 65;
        getCameraState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final StageExecutor<DocumentStageInput, DocumentAnalysisEvent> getStageExecutor$core_light_release() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 47;
        getImagePreview = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StageExecutor<DocumentStageInput, DocumentAnalysisEvent> stageExecutor = (StageExecutor) this.getConfig.getValue();
        int i4 = getCameraState + 107;
        getImagePreview = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return stageExecutor;
    }

    /* JADX INFO: renamed from: com.incode.camera.analysis.document.DocumentAnalyzer$processBitmap$2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "Lkotlin/Function1;", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends Lambda implements Function1<Function1<? super String, ? extends Unit>, DocumentAnalysisEvent> {
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1 */
        private static int f3594e1 = 0;
        private /* synthetic */ DocumentStageInput IncodeCamera;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ DocumentAnalysisEvent invoke(Function1<? super String, ? extends Unit> function1) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 87;
            f3594e1 = i3 % 128;
            Function1<? super String, ? extends Unit> function12 = function1;
            if (i3 % 2 != 0) {
                invoke2((Function1<? super String, Unit>) function12);
                throw null;
            }
            DocumentAnalysisEvent documentAnalysisEventInvoke2 = invoke2((Function1<? super String, Unit>) function12);
            int i4 = f3594e1 + 71;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
            return documentAnalysisEventInvoke2;
        }

        /* JADX INFO: renamed from: invoke */
        public final DocumentAnalysisEvent invoke2(Function1<? super String, Unit> function1) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 25;
            f3594e1 = i3 % 128;
            int i4 = i3 % 2;
            DocumentAnalysisEvent documentAnalysisEvent = (DocumentAnalysisEvent) DocumentAnalyzer.this.getStageExecutor$core_light_release().withInput(documentStageInput).execute(function1);
            int i5 = ProcessCameraProviderExtensionsKt + 79;
            f3594e1 = i5 % 128;
            int i6 = i5 % 2;
            return documentAnalysisEvent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DocumentStageInput documentStageInput) {
            super(1);
            documentStageInput = documentStageInput;
        }
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final Object processBitmap(Bitmap bitmap, Continuation<? super DocumentAnalysisEvent> continuation) {
        int i2 = 2 % 2;
        this.IncodeCamera.start();
        DocumentStageInput documentStageInput = new DocumentStageInput(this.getAvailableCameraInternals, bitmap);
        try {
            try {
                DocumentAnalysisEvent documentAnalysisEventWithOptionalLogging = withOptionalLogging(this.getAvailableCameraInternals.getLoggingEnabled(), this.getAvailableCameraInternals.getLoggingDistinct(), new Function1<Function1<? super String, ? extends Unit>, DocumentAnalysisEvent>() { // from class: com.incode.camera.analysis.document.DocumentAnalyzer.processBitmap.2
                    private static int ProcessCameraProviderExtensionsKt = 1;

                    /* JADX INFO: renamed from: e1 */
                    private static int f3594e1 = 0;
                    private /* synthetic */ DocumentStageInput IncodeCamera;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ DocumentAnalysisEvent invoke(Function1<? super String, ? extends Unit> function1) {
                        int i22 = 2 % 2;
                        int i3 = ProcessCameraProviderExtensionsKt + 87;
                        f3594e1 = i3 % 128;
                        Function1<? super String, ? extends Unit> function12 = function1;
                        if (i3 % 2 != 0) {
                            invoke2((Function1<? super String, Unit>) function12);
                            throw null;
                        }
                        DocumentAnalysisEvent documentAnalysisEventInvoke2 = invoke2((Function1<? super String, Unit>) function12);
                        int i4 = f3594e1 + 71;
                        ProcessCameraProviderExtensionsKt = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 15 / 0;
                        }
                        return documentAnalysisEventInvoke2;
                    }

                    /* JADX INFO: renamed from: invoke */
                    public final DocumentAnalysisEvent invoke2(Function1<? super String, Unit> function1) {
                        int i22 = 2 % 2;
                        int i3 = ProcessCameraProviderExtensionsKt + 25;
                        f3594e1 = i3 % 128;
                        int i4 = i3 % 2;
                        DocumentAnalysisEvent documentAnalysisEvent = (DocumentAnalysisEvent) DocumentAnalyzer.this.getStageExecutor$core_light_release().withInput(documentStageInput).execute(function1);
                        int i5 = ProcessCameraProviderExtensionsKt + 79;
                        f3594e1 = i5 % 128;
                        int i6 = i5 % 2;
                        return documentAnalysisEvent;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(DocumentStageInput documentStageInput2) {
                        super(1);
                        documentStageInput = documentStageInput2;
                    }
                });
                this.IncodeCamera.stopAndLogIfLoggable();
                int i3 = getCameraState + 29;
                int i4 = i3 % 128;
                getImagePreview = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 111;
                getCameraState = i6 % 128;
                int i7 = i6 % 2;
                return documentAnalysisEventWithOptionalLogging;
            } catch (Exception e2) {
                Timber.Forest.e(e2);
                DocumentAnalysisEvent.Error error = new DocumentAnalysisEvent.Error(e2, documentStageInput2.getCaptureInfo());
                this.f3590e1.tryEmit(error);
                this.IncodeCamera.stopAndLogIfLoggable();
                return error;
            }
        } catch (Throwable th) {
            this.IncodeCamera.stopAndLogIfLoggable();
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalyzer$Companion;", "", "()V", "initOrNull", "Lcom/incode/camera/analysis/document/DocumentAnalyzer;", "idCaptureKitAndroid", "Lcom/incode/recogkitandroid/IdCaptureKitAndroid;", "config", "Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private static int ProcessCameraProviderExtensionsKt = 0;
        private static int getAvailableCameraInternals = 1;

        private Companion() {
        }

        public static /* synthetic */ DocumentAnalyzer initOrNull$default(Companion companion, IdCaptureKitAndroid idCaptureKitAndroid, Config config, int i2, Object obj) {
            Config config2 = config;
            int i3 = 2 % 2;
            int i4 = getAvailableCameraInternals + 77;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
                config2 = new Config(false, false, 0.0f, 0.0f, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                int i5 = getAvailableCameraInternals + 89;
                ProcessCameraProviderExtensionsKt = i5 % 128;
                int i6 = i5 % 2;
            }
            return companion.initOrNull(idCaptureKitAndroid, config2);
        }

        public final DocumentAnalyzer initOrNull(IdCaptureKitAndroid idCaptureKitAndroid, Config config) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(config, "");
            if (idCaptureKitAndroid != null) {
                DocumentAnalyzer documentAnalyzer = new DocumentAnalyzer(new DocumentKitWrapper(idCaptureKitAndroid), new ImageKitWrapper(), config, null, null, null, 56, null);
                int i3 = ProcessCameraProviderExtensionsKt + 49;
                getAvailableCameraInternals = i3 % 128;
                int i4 = i3 % 2;
                return documentAnalyzer;
            }
            Timber.Forest.e(StringExtensionKt.trimNewline("\n                Failed to initialize javaClass.\n                IdCaptureKitAndroid == null"), new Object[0]);
            int i5 = ProcessCameraProviderExtensionsKt + 17;
            getAvailableCameraInternals = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DocumentAnalyzer initOrNull(IdCaptureKitAndroid idCaptureKitAndroid) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 121;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            DocumentAnalyzer documentAnalyzerInitOrNull$default = initOrNull$default(this, idCaptureKitAndroid, null, 2, null);
            int i5 = getAvailableCameraInternals + 65;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return documentAnalyzerInitOrNull$default;
        }
    }

    static {
        int i2 = getExposureCompensationState + 23;
        getAnalysisEvents = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void getStages$core_light_release$annotations() {
        int i2 = 2 % 2;
        int i3 = getImagePreview + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
    }
}
