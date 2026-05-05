package com.incode.camera.analysis.face;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.FrameAnalyzer;
import com.incode.camera.analysis.StageExecutor;
import com.incode.camera.analysis.face.FaceAnalysisEvent;
import com.incode.camera.analysis.face.stages.Brightness;
import com.incode.camera.analysis.face.stages.CreateTemplate;
import com.incode.camera.analysis.face.stages.CropImage;
import com.incode.camera.analysis.face.stages.DetectFaces;
import com.incode.camera.analysis.face.stages.FaceAxisPosition;
import com.incode.camera.analysis.face.stages.FaceDistance;
import com.incode.camera.analysis.face.stages.FaceExistence;
import com.incode.camera.analysis.face.stages.FaceStage;
import com.incode.camera.analysis.face.stages.LandmarksExistence;
import com.incode.camera.analysis.face.stages.Lenses;
import com.incode.camera.commons.utils.StringExtensionKt;
import com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid;
import com.incode.recogkitandroid.RecogKitAndroid;
import com.incode.recogkitandroid.SelfieFaceDetectorKit;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002%&B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R'\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u00168PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalyzer;", "Lcom/incode/camera/analysis/FrameAnalyzer;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "Lcom/incode/camera/analysis/face/FaceStageInput;", "faceKitWrapper", "Lcom/incode/camera/analysis/face/FaceKitWrapper;", "config", "Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;", "statusBus", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "(Lcom/incode/camera/analysis/face/FaceKitWrapper;Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "frameDropDelayInMs", "", "getFrameDropDelayInMs", "()J", "setFrameDropDelayInMs", "(J)V", "stageExecutor", "Lcom/incode/camera/analysis/StageExecutor;", "getStageExecutor$core_light_release", "()Lcom/incode/camera/analysis/StageExecutor;", "stageExecutor$delegate", "Lkotlin/Lazy;", "stages", "", "Lcom/incode/camera/analysis/face/stages/FaceStage;", "getStages", "()Ljava/util/List;", "stages$delegate", "processBitmap", "cameraBitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Config", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceAnalyzer extends FrameAnalyzer<FaceAnalysisEvent, FaceStageInput> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int getConfig = 1;
    private static int getContext = 0;
    private static int getPreviewView = 1;
    private static int setConfig = 0;
    private long CameraConstants;
    private final Flow<FaceAnalysisEvent> IncodeCamera;
    private final MutableSharedFlow<FaceAnalysisEvent> ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1 */
    private final Config f3617e1;
    private final Lazy getAvailableCameraInternals;
    private final Lazy getFrameAnalyzerWrapper;

    public static final /* synthetic */ Config access$getConfig$p(FaceAnalyzer faceAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getContext + 93;
        int i4 = i3 % 128;
        getPreviewView = i4;
        int i5 = i3 % 2;
        Config config = faceAnalyzer.f3617e1;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        getContext = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return config;
    }

    public static final /* synthetic */ List access$getStages(FaceAnalyzer faceAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getPreviewView + 11;
        getContext = i3 % 128;
        int i4 = i3 % 2;
        List<FaceStage> listIncodeCamera = faceAnalyzer.IncodeCamera();
        int i5 = getPreviewView + 115;
        getContext = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return listIncodeCamera;
    }

    public static final /* synthetic */ MutableSharedFlow access$getStatusBus$p(FaceAnalyzer faceAnalyzer) {
        int i2 = 2 % 2;
        int i3 = getPreviewView;
        int i4 = i3 + 67;
        getContext = i4 % 128;
        int i5 = i4 % 2;
        MutableSharedFlow<FaceAnalysisEvent> mutableSharedFlow = faceAnalyzer.ProcessCameraProviderExtensionsKt;
        int i6 = i3 + 13;
        getContext = i6 % 128;
        int i7 = i6 % 2;
        return mutableSharedFlow;
    }

    /* synthetic */ FaceAnalyzer(FaceKitWrapper faceKitWrapper, Config config, MutableSharedFlow mutableSharedFlow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(faceKitWrapper, (i2 & 2) != 0 ? new Config(false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 127, null) : config, (i2 & 4) != 0 ? SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null) : mutableSharedFlow);
    }

    private FaceAnalyzer(final FaceKitWrapper faceKitWrapper, Config config, MutableSharedFlow<FaceAnalysisEvent> mutableSharedFlow) {
        this.f3617e1 = config;
        this.ProcessCameraProviderExtensionsKt = mutableSharedFlow;
        this.IncodeCamera = mutableSharedFlow;
        this.getAvailableCameraInternals = LazyKt.lazy(new Function0<StageExecutor<FaceStageInput, FaceAnalysisEvent>>() { // from class: com.incode.camera.analysis.face.FaceAnalyzer$stageExecutor$2
            private static int ProcessCameraProviderExtensionsKt = 1;
            private static int getAvailableCameraInternals = 0;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final StageExecutor<FaceStageInput, FaceAnalysisEvent> invoke() {
                int i2 = 2 % 2;
                StageExecutor<FaceStageInput, FaceAnalysisEvent> stageExecutor = new StageExecutor<>(FaceAnalyzer.access$getStatusBus$p(this.IncodeCamera), FaceAnalyzer.access$getStages(this.IncodeCamera));
                int i3 = getAvailableCameraInternals + 89;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                if (i3 % 2 != 0) {
                    return stageExecutor;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ StageExecutor<FaceStageInput, FaceAnalysisEvent> invoke() {
                int i2 = 2 % 2;
                int i3 = ProcessCameraProviderExtensionsKt + 47;
                getAvailableCameraInternals = i3 % 128;
                int i4 = i3 % 2;
                StageExecutor<FaceStageInput, FaceAnalysisEvent> stageExecutorInvoke = invoke();
                if (i4 != 0) {
                    int i5 = 30 / 0;
                }
                return stageExecutorInvoke;
            }

            {
                super(0);
            }
        });
        this.CameraConstants = 100L;
        this.getFrameAnalyzerWrapper = LazyKt.lazy(new Function0<List<? extends FaceStage>>() { // from class: com.incode.camera.analysis.face.FaceAnalyzer$stages$2
            private static int ProcessCameraProviderExtensionsKt = 0;

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3620e1 = 1;

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ List<? extends FaceStage> invoke() {
                int i2 = 2 % 2;
                int i3 = f3620e1 + 31;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                if (i3 % 2 != 0) {
                    invoke();
                    throw null;
                }
                List<? extends FaceStage> listInvoke = invoke();
                int i4 = f3620e1 + 17;
                ProcessCameraProviderExtensionsKt = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return listInvoke;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends FaceStage> invoke() {
                int i2 = 2 % 2;
                List<? extends FaceStage> listListOf = CollectionsKt.listOf((Object[]) new FaceStage[]{new Brightness(), new DetectFaces(faceKitWrapper), new FaceExistence(), new FaceAxisPosition(), new LandmarksExistence(), new Lenses(faceKitWrapper), new FaceDistance(), new CropImage(), new CreateTemplate(faceKitWrapper)});
                int i3 = f3620e1 + 9;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                return listListOf;
            }

            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;", "", "loggingEnabled", "", "loggingDistinct", "lightMinThreshold", "", "faceTiltRotationAngle", "minFaceSizeDimension", "faceDetectorThreshold", "scaleFactor", "", "(ZZFFFFI)V", "getFaceDetectorThreshold", "()F", "getFaceTiltRotationAngle", "getLightMinThreshold", "getLoggingDistinct", "()Z", "getLoggingEnabled", "getMinFaceSizeDimension", "getScaleFactor", "()I", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Config {
        private static int getFrameAnalyzerWrapper = 1;
        private static int setConfig = 0;
        private final float CameraConstants;
        private final boolean IncodeCamera;
        private final float ProcessCameraProviderExtensionsKt;

        /* JADX INFO: renamed from: e1 */
        private final boolean f3619e1;
        private final float getAvailableCameraInternals;
        private final int getContext;
        private final float getPreviewView;

        public Config(boolean z2, boolean z3, float f2, float f3, float f4, float f5, int i2) {
            this.f3619e1 = z2;
            this.IncodeCamera = z3;
            this.getAvailableCameraInternals = f2;
            this.ProcessCameraProviderExtensionsKt = f3;
            this.CameraConstants = f4;
            this.getPreviewView = f5;
            this.getContext = i2;
        }

        public /* synthetic */ Config(boolean z2, boolean z3, float f2, float f3, float f4, float f5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? true : z3, (i3 & 4) != 0 ? 50.0f : f2, (i3 & 8) != 0 ? 15.0f : f3, (i3 & 16) != 0 ? 270.0f : f4, (i3 & 32) != 0 ? 0.95f : f5, (i3 & 64) == 0 ? i2 : 1);
        }

        public final boolean getLoggingEnabled() {
            int i2 = 2 % 2;
            int i3 = setConfig + 25;
            int i4 = i3 % 128;
            getFrameAnalyzerWrapper = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f3619e1;
            int i6 = i4 + 89;
            setConfig = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 63 / 0;
            }
            return z2;
        }

        public final boolean getLoggingDistinct() {
            int i2 = 2 % 2;
            int i3 = setConfig + 79;
            getFrameAnalyzerWrapper = i3 % 128;
            if (i3 % 2 != 0) {
                return this.IncodeCamera;
            }
            throw null;
        }

        public final float getLightMinThreshold() {
            int i2 = 2 % 2;
            int i3 = getFrameAnalyzerWrapper + 115;
            int i4 = i3 % 128;
            setConfig = i4;
            int i5 = i3 % 2;
            float f2 = this.getAvailableCameraInternals;
            int i6 = i4 + 25;
            getFrameAnalyzerWrapper = i6 % 128;
            int i7 = i6 % 2;
            return f2;
        }

        public final float getFaceTiltRotationAngle() {
            int i2 = 2 % 2;
            int i3 = getFrameAnalyzerWrapper + 29;
            setConfig = i3 % 128;
            if (i3 % 2 == 0) {
                return this.ProcessCameraProviderExtensionsKt;
            }
            throw null;
        }

        public final float getMinFaceSizeDimension() {
            int i2 = 2 % 2;
            int i3 = setConfig + 35;
            int i4 = i3 % 128;
            getFrameAnalyzerWrapper = i4;
            int i5 = i3 % 2;
            float f2 = this.CameraConstants;
            int i6 = i4 + 67;
            setConfig = i6 % 128;
            int i7 = i6 % 2;
            return f2;
        }

        public final float getFaceDetectorThreshold() {
            int i2 = 2 % 2;
            int i3 = getFrameAnalyzerWrapper;
            int i4 = i3 + 51;
            setConfig = i4 % 128;
            int i5 = i4 % 2;
            float f2 = this.getPreviewView;
            int i6 = i3 + 85;
            setConfig = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 33 / 0;
            }
            return f2;
        }

        public final int getScaleFactor() {
            int i2 = 2 % 2;
            int i3 = setConfig;
            int i4 = i3 + 5;
            getFrameAnalyzerWrapper = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.getContext;
            int i7 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            getFrameAnalyzerWrapper = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 76 / 0;
            }
            return i6;
        }

        public Config() {
            this(false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 127, null);
        }
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final Flow<FaceAnalysisEvent> getEvents() {
        int i2 = 2 % 2;
        int i3 = getPreviewView + 35;
        getContext = i3 % 128;
        if (i3 % 2 == 0) {
            return this.IncodeCamera;
        }
        throw null;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final StageExecutor<FaceStageInput, FaceAnalysisEvent> getStageExecutor$core_light_release() {
        int i2 = 2 % 2;
        int i3 = getContext + 9;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        StageExecutor<FaceStageInput, FaceAnalysisEvent> stageExecutor = (StageExecutor) this.getAvailableCameraInternals.getValue();
        if (i4 != 0) {
            return stageExecutor;
        }
        throw null;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final long getFrameDropDelayInMs() {
        int i2 = 2 % 2;
        int i3 = getPreviewView;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        getContext = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.CameraConstants;
        int i6 = i3 + 99;
        getContext = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 77 / 0;
        }
        return j2;
    }

    public final void setFrameDropDelayInMs(long j2) {
        int i2 = 2 % 2;
        int i3 = getContext;
        int i4 = i3 + 7;
        getPreviewView = i4 % 128;
        int i5 = i4 % 2;
        this.CameraConstants = j2;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 3;
        getPreviewView = i6 % 128;
        int i7 = i6 % 2;
    }

    private final List<FaceStage> IncodeCamera() {
        int i2 = 2 % 2;
        int i3 = getPreviewView + 107;
        getContext = i3 % 128;
        int i4 = i3 % 2;
        List<FaceStage> list = (List) this.getFrameAnalyzerWrapper.getValue();
        int i5 = getPreviewView + 71;
        getContext = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: com.incode.camera.analysis.face.FaceAnalyzer$processBitmap$2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "Lkotlin/Function1;", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends Lambda implements Function1<Function1<? super String, ? extends Unit>, FaceAnalysisEvent> {
        private static int CameraConstants = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private /* synthetic */ Bitmap IncodeCamera;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ FaceAnalysisEvent invoke(Function1<? super String, ? extends Unit> function1) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 95;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            FaceAnalysisEvent faceAnalysisEventInvoke2 = invoke2((Function1<? super String, Unit>) function1);
            int i5 = ProcessCameraProviderExtensionsKt + 37;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return faceAnalysisEventInvoke2;
        }

        /* JADX INFO: renamed from: invoke */
        public final FaceAnalysisEvent invoke2(Function1<? super String, Unit> function1) {
            int i2 = 2 % 2;
            FaceAnalysisEvent faceAnalysisEvent = (FaceAnalysisEvent) FaceAnalyzer.this.getStageExecutor$core_light_release().withInput(new FaceStageInput(FaceAnalyzer.access$getConfig$p(FaceAnalyzer.this), bitmap)).execute(function1);
            int i3 = ProcessCameraProviderExtensionsKt + 121;
            CameraConstants = i3 % 128;
            int i4 = i3 % 2;
            return faceAnalysisEvent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Bitmap bitmap) {
            super(1);
            bitmap = bitmap;
        }
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final Object processBitmap(Bitmap bitmap, Continuation<? super FaceAnalysisEvent> continuation) {
        int i2 = 2 % 2;
        try {
            FaceAnalysisEvent faceAnalysisEventWithOptionalLogging = withOptionalLogging(this.f3617e1.getLoggingEnabled(), this.f3617e1.getLoggingDistinct(), new Function1<Function1<? super String, ? extends Unit>, FaceAnalysisEvent>() { // from class: com.incode.camera.analysis.face.FaceAnalyzer.processBitmap.2
                private static int CameraConstants = 0;
                private static int ProcessCameraProviderExtensionsKt = 1;
                private /* synthetic */ Bitmap IncodeCamera;

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ FaceAnalysisEvent invoke(Function1<? super String, ? extends Unit> function1) {
                    int i22 = 2 % 2;
                    int i3 = CameraConstants + 95;
                    ProcessCameraProviderExtensionsKt = i3 % 128;
                    int i4 = i3 % 2;
                    FaceAnalysisEvent faceAnalysisEventInvoke2 = invoke2((Function1<? super String, Unit>) function1);
                    int i5 = ProcessCameraProviderExtensionsKt + 37;
                    CameraConstants = i5 % 128;
                    int i6 = i5 % 2;
                    return faceAnalysisEventInvoke2;
                }

                /* JADX INFO: renamed from: invoke */
                public final FaceAnalysisEvent invoke2(Function1<? super String, Unit> function1) {
                    int i22 = 2 % 2;
                    FaceAnalysisEvent faceAnalysisEvent = (FaceAnalysisEvent) FaceAnalyzer.this.getStageExecutor$core_light_release().withInput(new FaceStageInput(FaceAnalyzer.access$getConfig$p(FaceAnalyzer.this), bitmap)).execute(function1);
                    int i3 = ProcessCameraProviderExtensionsKt + 121;
                    CameraConstants = i3 % 128;
                    int i4 = i3 % 2;
                    return faceAnalysisEvent;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Bitmap bitmap2) {
                    super(1);
                    bitmap = bitmap2;
                }
            });
            int i3 = getPreviewView + 1;
            int i4 = i3 % 128;
            getContext = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 33;
            getPreviewView = i6 % 128;
            if (i6 % 2 != 0) {
                return faceAnalysisEventWithOptionalLogging;
            }
            throw null;
        } catch (Exception e2) {
            Timber.Forest.e(e2);
            FaceAnalysisEvent.Error error = new FaceAnalysisEvent.Error(e2);
            this.ProcessCameraProviderExtensionsKt.tryEmit(error);
            return error;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/incode/camera/analysis/face/FaceAnalyzer$Companion;", "", "()V", "initOrNull", "Lcom/incode/camera/analysis/face/FaceAnalyzer;", "selfieFaceDetectorKit", "Lcom/incode/recogkitandroid/SelfieFaceDetectorKit;", "recogKitAndroid", "Lcom/incode/recogkitandroid/RecogKitAndroid;", "faceAttributesDetectorKit", "Lcom/incode/recogkitandroid/FaceAttributesDetectorKitAndroid;", "config", "Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1 */
        private static int f3618e1 = 1;

        private Companion() {
        }

        public static /* synthetic */ FaceAnalyzer initOrNull$default(Companion companion, SelfieFaceDetectorKit selfieFaceDetectorKit, RecogKitAndroid recogKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid, Config config, int i2, Object obj) {
            Config config2 = config;
            int i3 = 2 % 2;
            int i4 = ProcessCameraProviderExtensionsKt + 71;
            f3618e1 = i4 % 128;
            if (i4 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 16) != 0) {
                config2 = new Config(false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 127, null);
            }
            FaceAnalyzer faceAnalyzerInitOrNull = companion.initOrNull(selfieFaceDetectorKit, recogKitAndroid, faceAttributesDetectorKitAndroid, config2);
            int i5 = ProcessCameraProviderExtensionsKt + 27;
            f3618e1 = i5 % 128;
            int i6 = i5 % 2;
            return faceAnalyzerInitOrNull;
        }

        public final FaceAnalyzer initOrNull(SelfieFaceDetectorKit selfieFaceDetectorKit, RecogKitAndroid recogKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKit, Config config) {
            boolean z2;
            boolean z3;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(config, "");
            Object obj = null;
            if (selfieFaceDetectorKit != null) {
                int i3 = ProcessCameraProviderExtensionsKt;
                int i4 = i3 + 43;
                f3618e1 = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (recogKitAndroid != null) {
                    int i5 = i3 + 111;
                    f3618e1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (faceAttributesDetectorKit != null) {
                        FaceAnalyzer faceAnalyzer = new FaceAnalyzer(new FaceKitWrapper(selfieFaceDetectorKit, recogKitAndroid, faceAttributesDetectorKit), config, null, 4, null);
                        int i6 = f3618e1 + 101;
                        ProcessCameraProviderExtensionsKt = i6 % 128;
                        if (i6 % 2 == 0) {
                            return faceAnalyzer;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            Timber.Forest forest = Timber.Forest;
            boolean z4 = true;
            if (recogKitAndroid == null) {
                z2 = true;
            } else {
                int i7 = f3618e1 + 97;
                ProcessCameraProviderExtensionsKt = i7 % 128;
                int i8 = i7 % 2;
                z2 = false;
            }
            if (selfieFaceDetectorKit == null) {
                int i9 = f3618e1 + 123;
                ProcessCameraProviderExtensionsKt = i9 % 128;
                int i10 = i9 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (faceAttributesDetectorKit == null) {
                int i11 = ProcessCameraProviderExtensionsKt;
                int i12 = i11 + 3;
                f3618e1 = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 85;
                f3618e1 = i14 % 128;
                int i15 = i14 % 2;
            } else {
                z4 = false;
            }
            forest.e(StringExtensionKt.trimNewline("\n                Failed to initialize javaClass.\n                RecogKitAndroid null = " + z2 + ",\n                selfieFaceDetectorKit null = " + z3 + ",\n                faceAttributesDetectorKit null = " + z4), new Object[0]);
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FaceAnalyzer initOrNull(SelfieFaceDetectorKit selfieFaceDetectorKit, RecogKitAndroid recogKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 91;
            f3618e1 = i3 % 128;
            return i3 % 2 == 0 ? initOrNull$default(this, selfieFaceDetectorKit, recogKitAndroid, faceAttributesDetectorKitAndroid, null, 24, null) : initOrNull$default(this, selfieFaceDetectorKit, recogKitAndroid, faceAttributesDetectorKitAndroid, null, 8, null);
        }
    }

    static {
        int i2 = setConfig + 39;
        getConfig = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }
}
