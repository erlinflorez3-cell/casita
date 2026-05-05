package com.incode.camera;

import android.content.Context;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.ResolutionInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.util.concurrent.ListenableFuture;
import com.incode.camera.IncodeCameraSelector;
import com.incode.camera.IncodeCameraState;
import com.incode.camera.analysis.AnalysisEvent;
import com.incode.camera.analysis.FrameAnalyzerWrapper;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ã\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00019\b\u0007\u0018\u0000 q*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0004qrstB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010H\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u0003J\u0018\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020L2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u0004\u0018\u00010 J\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020\rJ\b\u0010V\u001a\u00020\rH\u0007J\u0006\u0010W\u001a\u00020\rJ\u0006\u0010X\u001a\u00020IJ\u000e\u0010Y\u001a\u00020I2\u0006\u0010Z\u001a\u00020TJ\u0010\u0010[\u001a\u00020I2\b\b\u0001\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020IJ\u0006\u0010_\u001a\u00020IJ\u000e\u0010`\u001a\u00020I2\u0006\u0010\u001f\u001a\u00020 J\u001c\u0010a\u001a\u00020I2\u0006\u0010b\u001a\u00020c2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020f0eJ\b\u0010g\u001a\u00020IH\u0007J\u0006\u0010h\u001a\u00020IJ\u0006\u0010i\u001a\u00020IJ,\u0010j\u001a\u0002Hk\"\u0004\b\u0001\u0010k2\u0017\u0010l\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002Hk0m¢\u0006\u0002\bnH\u0002¢\u0006\u0002\u0010oJ\u0006\u0010p\u001a\u00020IR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0002022\u0006\u00101\u001a\u000202@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009X\u0082\u0004¢\u0006\u0004\n\u0002\u0010:R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0012\u0010=\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010>R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006u"}, d2 = {"Lcom/incode/camera/IncodeCamera;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Landroidx/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "previewView", "Landroidx/camera/view/PreviewView;", "frameAnalyzerWrapper", "Lcom/incode/camera/analysis/FrameAnalyzerWrapper;", "withVideoCapture", "", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lcom/incode/camera/analysis/FrameAnalyzerWrapper;Z)V", "_cameraState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/incode/camera/IncodeCameraState;", "activeRecording", "Landroidx/camera/video/Recording;", "analysisEvents", "Lkotlinx/coroutines/flow/Flow;", "getAnalysisEvents", "()Lkotlinx/coroutines/flow/Flow;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "cameraState", "Lkotlinx/coroutines/flow/StateFlow;", "getCameraState", "()Lkotlinx/coroutines/flow/StateFlow;", "config", "Lcom/incode/camera/IncodeCamera$Config;", "getConfig", "()Lcom/incode/camera/IncodeCamera$Config;", "setConfig", "(Lcom/incode/camera/IncodeCamera$Config;)V", "getContext", "()Landroid/content/Context;", "exposureCompensationState", "Lcom/incode/camera/IncodeCamera$ExposureCompensationState;", "getExposureCompensationState", "()Lcom/incode/camera/IncodeCamera$ExposureCompensationState;", "setExposureCompensationState", "(Lcom/incode/camera/IncodeCamera$ExposureCompensationState;)V", "getFrameAnalyzerWrapper", "()Lcom/incode/camera/analysis/FrameAnalyzerWrapper;", "imageAnalysis", "Landroidx/camera/core/ImageAnalysis;", "<set-?>", "Landroidx/camera/core/Preview;", "imagePreview", "getImagePreview", "()Landroidx/camera/core/Preview;", "instanceHolder", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "lifecycleObserver", "com/incode/camera/IncodeCamera$lifecycleObserver$1", "Lcom/incode/camera/IncodeCamera$lifecycleObserver$1;", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "surfaceComboForVideoLivenessFound", "Ljava/lang/Boolean;", "tapToFocusFeature", "Lcom/incode/camera/TapToFocusFeature;", "getTapToFocusFeature", "()Lcom/incode/camera/TapToFocusFeature;", "tapToFocusFeature$delegate", "Lkotlin/Lazy;", "videoCapture", "Landroidx/camera/video/VideoCapture;", "Landroidx/camera/video/Recorder;", "configure", "", "cameraProviderFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getCameraForTheMostSupportedUseCases", "Landroidx/camera/core/Camera;", "processCameraProvider", "useCaseGroup", "Landroidx/camera/core/UseCaseGroup;", "getConfiguration", "getExposureCompensationIndex", "", "isExposureCompensationSupported", "isVideoLivenessRecordingSupported", "isZoomSupported", "resetCameraZoom", "setExposure", "value", "setLinearZoom", "linearZoom", "", "setMaxExposureCompensation", "setMinExposureCompensation", "startCamera", "startRecording", "videoFile", "Ljava/io/File;", "recordingListener", "Landroidx/core/util/Consumer;", "Landroidx/camera/video/VideoRecordEvent;", "stopCamera", "stopRecording", "toggleTorch", "withConfiguredCamera", "R", "instruction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "zoomCameraToMax", "Companion", "Config", "ExposureCompensationState", "InstanceHolder", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IncodeCamera<T extends AnalysisEvent> implements LifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int getConfiguration = 0;
    private static int startCamera = 0;
    private static int stopCamera = 1;
    private static int toggleTorch = 1;
    private final boolean CameraConstants;
    private final FrameAnalyzerWrapper<T> IncodeCamera;
    private final LifecycleOwner ProcessCameraProviderExtensionsKt;
    public Config config;

    /* JADX INFO: renamed from: e1 */
    private final Context f3552e1;
    private ImageAnalysis getAnalysisEvents;
    private final PreviewView getAvailableCameraInternals;
    private Recording getCameraState;
    private Preview getConfig;
    private ExposureCompensationState getContext;
    private final Lazy getExposureCompensationState;
    private final IncodeCamera$lifecycleObserver$1<T> getFrameAnalyzerWrapper;
    private VideoCapture<Recorder> getImagePreview;
    private InstanceHolder getPreviewView;
    private final Flow<T> isVideoLivenessRecordingSupported;
    private final ExecutorService setConfig;
    private Boolean setExposureCompensationState;
    private final StateFlow<IncodeCameraState> startRecording;
    private final MutableStateFlow<IncodeCameraState> stopRecording;

    public IncodeCamera(Context context, LifecycleOwner lifecycleOwner, PreviewView previewView, FrameAnalyzerWrapper<T> frameAnalyzerWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(previewView, "");
        Intrinsics.checkNotNullParameter(frameAnalyzerWrapper, "");
        this.f3552e1 = context;
        this.ProcessCameraProviderExtensionsKt = lifecycleOwner;
        this.getAvailableCameraInternals = previewView;
        this.IncodeCamera = frameAnalyzerWrapper;
        this.CameraConstants = z2;
        this.getContext = ExposureCompensationState.UNKNOWN;
        this.getFrameAnalyzerWrapper = (IncodeCamera$lifecycleObserver$1<T>) new DefaultLifecycleObserver(this) { // from class: com.incode.camera.IncodeCamera$lifecycleObserver$1
            private static int CameraConstants = 0;
            private static int ProcessCameraProviderExtensionsKt = 1;
            private /* synthetic */ IncodeCamera<T> IncodeCamera;

            {
                this.IncodeCamera = this;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner owner) {
                int i2 = 2 % 2;
                int i3 = CameraConstants + 51;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(owner, "");
                super.onDestroy(owner);
                IncodeCamera.access$getCameraExecutor$p(this.IncodeCamera).shutdown();
                int i5 = ProcessCameraProviderExtensionsKt + 7;
                CameraConstants = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        };
        this.setConfig = Executors.newSingleThreadExecutor();
        this.getExposureCompensationState = LazyKt.lazy(new Function0<TapToFocusFeature>(this) { // from class: com.incode.camera.IncodeCamera$tapToFocusFeature$2
            private static int CameraConstants = 0;
            private static int getAvailableCameraInternals = 1;
            private /* synthetic */ IncodeCamera<T> ProcessCameraProviderExtensionsKt;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TapToFocusFeature invoke() {
                int i2 = 2 % 2;
                TapToFocusFeature tapToFocusFeature = new TapToFocusFeature(this.ProcessCameraProviderExtensionsKt.getPreviewView());
                int i3 = CameraConstants + 123;
                getAvailableCameraInternals = i3 % 128;
                if (i3 % 2 != 0) {
                    return tapToFocusFeature;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ TapToFocusFeature invoke() {
                int i2 = 2 % 2;
                int i3 = CameraConstants + 57;
                getAvailableCameraInternals = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    invoke();
                    obj.hashCode();
                    throw null;
                }
                TapToFocusFeature tapToFocusFeatureInvoke = invoke();
                int i4 = CameraConstants + 69;
                getAvailableCameraInternals = i4 % 128;
                if (i4 % 2 != 0) {
                    return tapToFocusFeatureInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.ProcessCameraProviderExtensionsKt = this;
            }
        });
        MutableStateFlow<IncodeCameraState> MutableStateFlow = StateFlowKt.MutableStateFlow(new IncodeCameraState.NotInitialized());
        this.stopRecording = MutableStateFlow;
        this.startRecording = MutableStateFlow;
        MutableSharedFlow events = frameAnalyzerWrapper.getEvents();
        this.isVideoLivenessRecordingSupported = events == null ? SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null) : events;
    }

    public static final /* synthetic */ ExecutorService access$getCameraExecutor$p(IncodeCamera incodeCamera) {
        int i2 = 2 % 2;
        int i3 = startCamera + 101;
        int i4 = i3 % 128;
        stopCamera = i4;
        int i5 = i3 % 2;
        ExecutorService executorService = incodeCamera.setConfig;
        int i6 = i4 + 71;
        startCamera = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return executorService;
    }

    public static final /* synthetic */ ImageAnalysis access$getImageAnalysis$p(IncodeCamera incodeCamera) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 33;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        ImageAnalysis imageAnalysis = incodeCamera.getAnalysisEvents;
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
        return imageAnalysis;
    }

    public static final /* synthetic */ Boolean access$getSurfaceComboForVideoLivenessFound$p(IncodeCamera incodeCamera) {
        int i2 = 2 % 2;
        int i3 = startCamera + 27;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = incodeCamera.setExposureCompensationState;
        if (i4 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ VideoCapture access$getVideoCapture$p(IncodeCamera incodeCamera) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 79;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        VideoCapture<Recorder> videoCapture = incodeCamera.getImagePreview;
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        return videoCapture;
    }

    public static final /* synthetic */ MutableStateFlow access$get_cameraState$p(IncodeCamera incodeCamera) {
        int i2 = 2 % 2;
        int i3 = startCamera + 81;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<IncodeCameraState> mutableStateFlow = incodeCamera.stopRecording;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        return mutableStateFlow;
    }

    public /* synthetic */ IncodeCamera(Context context, LifecycleOwner lifecycleOwner, PreviewView previewView, FrameAnalyzerWrapper frameAnalyzerWrapper, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, lifecycleOwner, previewView, frameAnalyzerWrapper, (i2 & 16) != 0 ? false : z2);
    }

    public final Context getContext() {
        int i2 = 2 % 2;
        int i3 = stopCamera;
        int i4 = i3 + 125;
        startCamera = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context context = this.f3552e1;
        int i5 = i3 + 83;
        startCamera = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return context;
    }

    public final PreviewView getPreviewView() {
        int i2 = 2 % 2;
        int i3 = startCamera + 63;
        stopCamera = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getAvailableCameraInternals;
        }
        throw null;
    }

    public final FrameAnalyzerWrapper<T> getFrameAnalyzerWrapper() {
        int i2 = 2 % 2;
        int i3 = stopCamera + 75;
        int i4 = i3 % 128;
        startCamera = i4;
        int i5 = i3 % 2;
        FrameAnalyzerWrapper<T> frameAnalyzerWrapper = this.IncodeCamera;
        int i6 = i4 + 13;
        stopCamera = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return frameAnalyzerWrapper;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lcom/incode/camera/IncodeCamera$Config;", "", "cameraSelector", "Lcom/incode/camera/IncodeCameraSelector;", "previewResolutionSelector", "Landroidx/camera/core/resolutionselector/ResolutionSelector;", "analyzerResolutionSelector", "enableTapToFocus", "", "analyzerFormat", "", "(Lcom/incode/camera/IncodeCameraSelector;Landroidx/camera/core/resolutionselector/ResolutionSelector;Landroidx/camera/core/resolutionselector/ResolutionSelector;ZI)V", "getAnalyzerFormat", "()I", "getAnalyzerResolutionSelector", "()Landroidx/camera/core/resolutionselector/ResolutionSelector;", "getCameraSelector", "()Lcom/incode/camera/IncodeCameraSelector;", "getEnableTapToFocus", "()Z", "getPreviewResolutionSelector", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {
        private static int getConfig = 0;
        private static int getPreviewView = 1;
        private final int CameraConstants;
        private final ResolutionSelector IncodeCamera;
        private final boolean ProcessCameraProviderExtensionsKt;

        /* JADX INFO: renamed from: e1 */
        private final IncodeCameraSelector f3553e1;
        private final ResolutionSelector getAvailableCameraInternals;

        public Config(IncodeCameraSelector incodeCameraSelector, ResolutionSelector resolutionSelector, ResolutionSelector resolutionSelector2, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(incodeCameraSelector, "");
            Intrinsics.checkNotNullParameter(resolutionSelector, "");
            Intrinsics.checkNotNullParameter(resolutionSelector2, "");
            this.f3553e1 = incodeCameraSelector;
            this.IncodeCamera = resolutionSelector;
            this.getAvailableCameraInternals = resolutionSelector2;
            this.ProcessCameraProviderExtensionsKt = z2;
            this.CameraConstants = i2;
        }

        public /* synthetic */ Config(IncodeCameraSelector incodeCameraSelector, ResolutionSelector resolutionSelector, ResolutionSelector resolutionSelector2, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? new IncodeCameraSelector(IncodeCameraSelector.Facing.FRONT) : incodeCameraSelector, (i3 & 2) != 0 ? IncodeCameraConfigurator.idCapturePreviewResolutionSelector() : resolutionSelector, (i3 & 4) != 0 ? IncodeCameraConfigurator.idCaptureAnalysisResolutionSelector() : resolutionSelector2, (i3 & 8) != 0 ? true : z2, (i3 & 16) == 0 ? i2 : 1);
        }

        public final IncodeCameraSelector getCameraSelector() {
            int i2 = 2 % 2;
            int i3 = getPreviewView + 3;
            getConfig = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f3553e1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ResolutionSelector getPreviewResolutionSelector() {
            int i2 = 2 % 2;
            int i3 = getConfig + 111;
            int i4 = i3 % 128;
            getPreviewView = i4;
            int i5 = i3 % 2;
            ResolutionSelector resolutionSelector = this.IncodeCamera;
            int i6 = i4 + 55;
            getConfig = i6 % 128;
            if (i6 % 2 == 0) {
                return resolutionSelector;
            }
            throw null;
        }

        public final ResolutionSelector getAnalyzerResolutionSelector() {
            ResolutionSelector resolutionSelector;
            int i2 = 2 % 2;
            int i3 = getConfig;
            int i4 = i3 + 65;
            getPreviewView = i4 % 128;
            if (i4 % 2 == 0) {
                resolutionSelector = this.getAvailableCameraInternals;
                int i5 = 38 / 0;
            } else {
                resolutionSelector = this.getAvailableCameraInternals;
            }
            int i6 = i3 + 45;
            getPreviewView = i6 % 128;
            int i7 = i6 % 2;
            return resolutionSelector;
        }

        public final boolean getEnableTapToFocus() {
            int i2 = 2 % 2;
            int i3 = getConfig;
            int i4 = i3 + 57;
            getPreviewView = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.ProcessCameraProviderExtensionsKt;
            int i6 = i3 + 115;
            getPreviewView = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getAnalyzerFormat() {
            int i2 = 2 % 2;
            int i3 = getPreviewView + 59;
            int i4 = i3 % 128;
            getConfig = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = this.CameraConstants;
            int i6 = i4 + 91;
            getPreviewView = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public Config() {
            this(null, null, null, false, 0, 31, null);
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            int i3 = getConfig + 99;
            int i4 = i3 % 128;
            getPreviewView = i4;
            int i5 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                int i6 = i4 + 9;
                getConfig = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            Config config = (Config) other;
            if (!Intrinsics.areEqual(this.f3553e1, config.f3553e1) || !Intrinsics.areEqual(this.IncodeCamera, config.IncodeCamera) || !Intrinsics.areEqual(this.getAvailableCameraInternals, config.getAvailableCameraInternals)) {
                return false;
            }
            if (this.ProcessCameraProviderExtensionsKt == config.ProcessCameraProviderExtensionsKt) {
                return this.CameraConstants == config.CameraConstants;
            }
            int i8 = getConfig + 121;
            getPreviewView = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = getConfig + 49;
            getPreviewView = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((((((this.f3553e1.hashCode() * 31) + this.IncodeCamera.hashCode()) * 31) + this.getAvailableCameraInternals.hashCode()) * 31) + Boolean.hashCode(this.ProcessCameraProviderExtensionsKt)) * 31) + Integer.hashCode(this.CameraConstants);
            int i5 = getConfig + 73;
            getPreviewView = i5 % 128;
            if (i5 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = getConfig + 87;
            getPreviewView = i3 % 128;
            int i4 = i3 % 2;
            String str = "Config(cameraSelector=" + this.f3553e1 + ", previewResolutionSelector=" + this.IncodeCamera + ", analyzerResolutionSelector=" + this.getAvailableCameraInternals + ", enableTapToFocus=" + this.ProcessCameraProviderExtensionsKt + ", analyzerFormat=" + this.CameraConstants + ")";
            int i5 = getPreviewView + 3;
            getConfig = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return str;
        }

        public static /* synthetic */ Config copy$default(Config config, IncodeCameraSelector incodeCameraSelector, ResolutionSelector resolutionSelector, ResolutionSelector resolutionSelector2, boolean z2, int i2, int i3, Object obj) {
            int i4 = 2 % 2;
            if ((i3 & 1) != 0) {
                incodeCameraSelector = config.f3553e1;
                int i5 = getConfig + 29;
                getPreviewView = i5 % 128;
                int i6 = i5 % 2;
            }
            if ((i3 & 2) != 0) {
                resolutionSelector = config.IncodeCamera;
            }
            if ((i3 & 4) != 0) {
                resolutionSelector2 = config.getAvailableCameraInternals;
            }
            if ((i3 & 8) != 0) {
                int i7 = getConfig + 81;
                getPreviewView = i7 % 128;
                int i8 = i7 % 2;
                z2 = config.ProcessCameraProviderExtensionsKt;
            }
            if ((i3 & 16) != 0) {
                int i9 = getConfig + 89;
                getPreviewView = i9 % 128;
                int i10 = i9 % 2;
                i2 = config.CameraConstants;
            }
            return config.copy(incodeCameraSelector, resolutionSelector, resolutionSelector2, z2, i2);
        }

        public final Config copy(IncodeCameraSelector cameraSelector, ResolutionSelector previewResolutionSelector, ResolutionSelector analyzerResolutionSelector, boolean enableTapToFocus, int analyzerFormat) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(cameraSelector, "");
            Intrinsics.checkNotNullParameter(previewResolutionSelector, "");
            Intrinsics.checkNotNullParameter(analyzerResolutionSelector, "");
            Config config = new Config(cameraSelector, previewResolutionSelector, analyzerResolutionSelector, enableTapToFocus, analyzerFormat);
            int i3 = getPreviewView + 63;
            getConfig = i3 % 128;
            int i4 = i3 % 2;
            return config;
        }

        public final int component5() {
            int i2 = 2 % 2;
            int i3 = getConfig + 113;
            getPreviewView = i3 % 128;
            if (i3 % 2 != 0) {
                return this.CameraConstants;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean component4() {
            int i2 = 2 % 2;
            int i3 = getPreviewView + 21;
            int i4 = i3 % 128;
            getConfig = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z2 = this.ProcessCameraProviderExtensionsKt;
            int i5 = i4 + 113;
            getPreviewView = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final ResolutionSelector component3() {
            int i2 = 2 % 2;
            int i3 = getConfig;
            int i4 = i3 + 35;
            getPreviewView = i4 % 128;
            int i5 = i4 % 2;
            ResolutionSelector resolutionSelector = this.getAvailableCameraInternals;
            int i6 = i3 + 117;
            getPreviewView = i6 % 128;
            if (i6 % 2 != 0) {
                return resolutionSelector;
            }
            throw null;
        }

        public final ResolutionSelector component2() {
            int i2 = 2 % 2;
            int i3 = getPreviewView;
            int i4 = i3 + 91;
            getConfig = i4 % 128;
            int i5 = i4 % 2;
            ResolutionSelector resolutionSelector = this.IncodeCamera;
            int i6 = i3 + 13;
            getConfig = i6 % 128;
            int i7 = i6 % 2;
            return resolutionSelector;
        }

        public final IncodeCameraSelector component1() {
            int i2 = 2 % 2;
            int i3 = getConfig;
            int i4 = i3 + 81;
            getPreviewView = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IncodeCameraSelector incodeCameraSelector = this.f3553e1;
            int i5 = i3 + 23;
            getPreviewView = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
            return incodeCameraSelector;
        }
    }

    public final Config getConfig() {
        int i2 = 2 % 2;
        int i3 = startCamera + 87;
        stopCamera = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Config config = this.config;
        if (config != null) {
            return config;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = startCamera + 63;
        stopCamera = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void setConfig(Config config) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 125;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(config, "");
        this.config = config;
        int i5 = startCamera + 63;
        stopCamera = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/incode/camera/IncodeCamera$InstanceHolder;", "", "camera", "Landroidx/camera/core/Camera;", "cameraControl", "Landroidx/camera/core/CameraControl;", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "processCameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "(Landroidx/camera/core/Camera;Landroidx/camera/core/CameraControl;Landroidx/camera/core/CameraInfo;Landroidx/camera/lifecycle/ProcessCameraProvider;)V", "getCamera", "()Landroidx/camera/core/Camera;", "getCameraControl", "()Landroidx/camera/core/CameraControl;", "getCameraInfo", "()Landroidx/camera/core/CameraInfo;", "getProcessCameraProvider", "()Landroidx/camera/lifecycle/ProcessCameraProvider;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class InstanceHolder {

        /* JADX INFO: renamed from: e1 */
        private static int f3555e1 = 0;
        private static int setConfig = 1;
        private final CameraInfo CameraConstants;
        private final Camera IncodeCamera;
        private final CameraControl ProcessCameraProviderExtensionsKt;
        private final ProcessCameraProvider getAvailableCameraInternals;

        public InstanceHolder(Camera camera, CameraControl cameraControl, CameraInfo cameraInfo, ProcessCameraProvider processCameraProvider) {
            Intrinsics.checkNotNullParameter(camera, "");
            Intrinsics.checkNotNullParameter(cameraControl, "");
            Intrinsics.checkNotNullParameter(cameraInfo, "");
            Intrinsics.checkNotNullParameter(processCameraProvider, "");
            this.IncodeCamera = camera;
            this.ProcessCameraProviderExtensionsKt = cameraControl;
            this.CameraConstants = cameraInfo;
            this.getAvailableCameraInternals = processCameraProvider;
        }

        public final Camera getCamera() {
            Camera camera;
            int i2 = 2 % 2;
            int i3 = setConfig + 85;
            int i4 = i3 % 128;
            f3555e1 = i4;
            if (i3 % 2 != 0) {
                camera = this.IncodeCamera;
                int i5 = 72 / 0;
            } else {
                camera = this.IncodeCamera;
            }
            int i6 = i4 + 75;
            setConfig = i6 % 128;
            int i7 = i6 % 2;
            return camera;
        }

        public final CameraControl getCameraControl() {
            int i2 = 2 % 2;
            int i3 = setConfig + 27;
            f3555e1 = i3 % 128;
            if (i3 % 2 == 0) {
                return this.ProcessCameraProviderExtensionsKt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CameraInfo getCameraInfo() {
            int i2 = 2 % 2;
            int i3 = setConfig + 39;
            f3555e1 = i3 % 128;
            if (i3 % 2 == 0) {
                return this.CameraConstants;
            }
            throw null;
        }

        public final ProcessCameraProvider getProcessCameraProvider() {
            int i2 = 2 % 2;
            int i3 = setConfig;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3555e1 = i4 % 128;
            int i5 = i4 % 2;
            ProcessCameraProvider processCameraProvider = this.getAvailableCameraInternals;
            int i6 = i3 + 5;
            f3555e1 = i6 % 128;
            int i7 = i6 % 2;
            return processCameraProvider;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/incode/camera/IncodeCamera$ExposureCompensationState;", "", "(Ljava/lang/String;I)V", "isValid", "", "UNKNOWN", "UNSUPPORTED", "MIN", "MAX", "LAST_OPERATION_CANCELLED", "INVALID_VALUE_ATTEMPTED", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExposureCompensationState extends Enum<ExposureCompensationState> {
        private static final /* synthetic */ ExposureCompensationState[] CameraConstants;
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1 */
        private static final /* synthetic */ EnumEntries f3554e1;
        private static int getAvailableCameraInternals = 1;
        private static int getFrameAnalyzerWrapper = 1;
        public static final ExposureCompensationState UNKNOWN = new ExposureCompensationState("UNKNOWN", 0);
        public static final ExposureCompensationState UNSUPPORTED = new ExposureCompensationState("UNSUPPORTED", 1);
        public static final ExposureCompensationState MIN = new ExposureCompensationState("MIN", 2);
        public static final ExposureCompensationState MAX = new ExposureCompensationState("MAX", 3);
        public static final ExposureCompensationState LAST_OPERATION_CANCELLED = new ExposureCompensationState("LAST_OPERATION_CANCELLED", 4);
        public static final ExposureCompensationState INVALID_VALUE_ATTEMPTED = new ExposureCompensationState("INVALID_VALUE_ATTEMPTED", 5);

        private ExposureCompensationState(String str, int i2) {
            super(str, i2);
        }

        static {
            ExposureCompensationState[] exposureCompensationStateArrProcessCameraProviderExtensionsKt = ProcessCameraProviderExtensionsKt();
            CameraConstants = exposureCompensationStateArrProcessCameraProviderExtensionsKt;
            f3554e1 = EnumEntriesKt.enumEntries(exposureCompensationStateArrProcessCameraProviderExtensionsKt);
            int i2 = IncodeCamera + 97;
            getFrameAnalyzerWrapper = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0023, code lost:
        
            if (r5 != com.incode.camera.IncodeCamera.ExposureCompensationState.INVALID_VALUE_ATTEMPTED) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
        
            r1 = r2 + 99;
            com.incode.camera.IncodeCamera.ExposureCompensationState.getAvailableCameraInternals = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:
        
            if (r5 != com.incode.camera.IncodeCamera.ExposureCompensationState.INVALID_VALUE_ATTEMPTED) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean isValid() {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                com.incode.camera.IncodeCamera$ExposureCompensationState r0 = com.incode.camera.IncodeCamera.ExposureCompensationState.UNSUPPORTED
                r3 = 0
                if (r5 == r0) goto L33
                int r2 = com.incode.camera.IncodeCamera.ExposureCompensationState.ProcessCameraProviderExtensionsKt
                int r1 = r2 + 3
                int r0 = r1 % 128
                com.incode.camera.IncodeCamera.ExposureCompensationState.getAvailableCameraInternals = r0
                int r1 = r1 % r4
                com.incode.camera.IncodeCamera$ExposureCompensationState r0 = com.incode.camera.IncodeCamera.ExposureCompensationState.LAST_OPERATION_CANCELLED
                if (r5 == r0) goto L33
                int r1 = r2 + 85
                int r0 = r1 % 128
                com.incode.camera.IncodeCamera.ExposureCompensationState.getAvailableCameraInternals = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L2e
                com.incode.camera.IncodeCamera$ExposureCompensationState r1 = com.incode.camera.IncodeCamera.ExposureCompensationState.INVALID_VALUE_ATTEMPTED
                r0 = 29
                int r0 = r0 / r3
                if (r5 == r1) goto L33
            L25:
                int r1 = r2 + 99
                int r0 = r1 % 128
                com.incode.camera.IncodeCamera.ExposureCompensationState.getAvailableCameraInternals = r0
                int r1 = r1 % r4
                r0 = 1
                return r0
            L2e:
                com.incode.camera.IncodeCamera$ExposureCompensationState r0 = com.incode.camera.IncodeCamera.ExposureCompensationState.INVALID_VALUE_ATTEMPTED
                if (r5 == r0) goto L33
                goto L25
            L33:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.IncodeCamera.ExposureCompensationState.isValid():boolean");
        }

        private static final /* synthetic */ ExposureCompensationState[] ProcessCameraProviderExtensionsKt() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 121;
            int i4 = i3 % 128;
            getAvailableCameraInternals = i4;
            int i5 = i3 % 2;
            ExposureCompensationState[] exposureCompensationStateArr = {UNKNOWN, UNSUPPORTED, MIN, MAX, LAST_OPERATION_CANCELLED, INVALID_VALUE_ATTEMPTED};
            int i6 = i4 + 23;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return exposureCompensationStateArr;
        }

        public static EnumEntries<ExposureCompensationState> getEntries() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 13;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 != 0) {
                return f3554e1;
            }
            throw null;
        }

        public static ExposureCompensationState valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 101;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            ExposureCompensationState exposureCompensationState = (ExposureCompensationState) Enum.valueOf(ExposureCompensationState.class, str);
            if (i4 == 0) {
                int i5 = 68 / 0;
            }
            return exposureCompensationState;
        }

        public static ExposureCompensationState[] values() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 121;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            ExposureCompensationState[] exposureCompensationStateArr = CameraConstants;
            if (i4 == 0) {
                return (ExposureCompensationState[]) exposureCompensationStateArr.clone();
            }
            ExposureCompensationState[] exposureCompensationStateArr2 = (ExposureCompensationState[]) exposureCompensationStateArr.clone();
            int i5 = 74 / 0;
            return exposureCompensationStateArr2;
        }
    }

    public final ExposureCompensationState getExposureCompensationState() {
        int i2 = 2 % 2;
        int i3 = stopCamera;
        int i4 = i3 + 9;
        startCamera = i4 % 128;
        int i5 = i4 % 2;
        ExposureCompensationState exposureCompensationState = this.getContext;
        int i6 = i3 + 45;
        startCamera = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 9 / 0;
        }
        return exposureCompensationState;
    }

    public final void setExposureCompensationState(ExposureCompensationState exposureCompensationState) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 27;
        startCamera = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(exposureCompensationState, "");
            this.getContext = exposureCompensationState;
        } else {
            Intrinsics.checkNotNullParameter(exposureCompensationState, "");
            this.getContext = exposureCompensationState;
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/IncodeCamera$Companion;", "", "()V", "RECOMMENDED_480P_BITRATE", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Preview getImagePreview() {
        int i2 = 2 % 2;
        int i3 = stopCamera;
        int i4 = i3 + 77;
        startCamera = i4 % 128;
        int i5 = i4 % 2;
        Preview preview = this.getConfig;
        if (preview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 33;
        startCamera = i6 % 128;
        int i7 = i6 % 2;
        return preview;
    }

    private final TapToFocusFeature IncodeCamera() {
        int i2 = 2 % 2;
        int i3 = startCamera + 77;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        TapToFocusFeature tapToFocusFeature = (TapToFocusFeature) this.getExposureCompensationState.getValue();
        if (i4 != 0) {
            return tapToFocusFeature;
        }
        throw null;
    }

    public final StateFlow<IncodeCameraState> getCameraState() {
        int i2 = 2 % 2;
        int i3 = startCamera;
        int i4 = i3 + 9;
        stopCamera = i4 % 128;
        int i5 = i4 % 2;
        StateFlow<IncodeCameraState> stateFlow = this.startRecording;
        int i6 = i3 + 45;
        stopCamera = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
        return stateFlow;
    }

    public final Flow<T> getAnalysisEvents() {
        int i2 = 2 % 2;
        int i3 = startCamera + 117;
        stopCamera = i3 % 128;
        if (i3 % 2 != 0) {
            return this.isVideoLivenessRecordingSupported;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IncodeCamera(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 111;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = stopCamera + 17;
        startCamera = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    private final void IncodeCamera(ListenableFuture<ProcessCameraProvider> listenableFuture) {
        int i2 = 2 % 2;
        try {
            Timber.Forest.d("IncodeCamera configure called.", new Object[0]);
            ProcessCameraProvider processCameraProvider = listenableFuture.get();
            UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
            Preview.Builder resolutionSelector = new Preview.Builder().setResolutionSelector(getConfig().getPreviewResolutionSelector());
            Config config = getConfig();
            Intrinsics.checkNotNull(processCameraProvider);
            Preview previewBuild = resolutionSelector.setTargetFrameRate(IncodeCameraConfigurator.getOptimalFrameRateRange$core_light_release(config, processCameraProvider)).build();
            Intrinsics.checkNotNullExpressionValue(previewBuild, "");
            this.getConfig = previewBuild;
            if (!IncodeCameraConfigurator.isUseCaseCombinationSupported$core_light_release(getConfig(), processCameraProvider, getImagePreview())) {
                throw new CameraUseCaseAdapter.CameraException("Trying to configure imagePreview use case on a device that cannot support it. Does the device not have a camera?");
            }
            builder.addUseCase(getImagePreview());
            ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setOutputImageFormat(getConfig().getAnalyzerFormat()).setImageQueueDepth(0).setResolutionSelector(getConfig().getAnalyzerResolutionSelector()).build();
            Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "");
            imageAnalysisBuild.setAnalyzer(this.setConfig, this.IncodeCamera);
            this.getAnalysisEvents = imageAnalysisBuild;
            Config config2 = getConfig();
            UseCase[] useCaseArr = new UseCase[2];
            useCaseArr[0] = getImagePreview();
            ImageAnalysis imageAnalysis = this.getAnalysisEvents;
            if (imageAnalysis == null) {
                int i3 = stopCamera + 11;
                startCamera = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysis = null;
            }
            useCaseArr[1] = imageAnalysis;
            if (!IncodeCameraConfigurator.isUseCaseCombinationSupported$core_light_release(config2, processCameraProvider, useCaseArr)) {
                throw new CameraUseCaseAdapter.CameraException("Device does not have an available camera that can do imagePreview and analysis. Cannot continue with Incode module.");
            }
            ImageAnalysis imageAnalysis2 = this.getAnalysisEvents;
            if (imageAnalysis2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysis2 = null;
            }
            builder.addUseCase(imageAnalysis2);
            Recorder.Builder builder2 = new Recorder.Builder();
            Quality quality = Quality.SD;
            VideoCapture<Recorder> videoCaptureWithOutput = VideoCapture.withOutput(builder2.setQualitySelector(QualitySelector.from(quality, FallbackStrategy.lowerQualityOrHigherThan(quality))).setAspectRatio(0).setTargetVideoEncodingBitRate(750000).setVideoCapabilitiesSource(0).build());
            Intrinsics.checkNotNullExpressionValue(videoCaptureWithOutput, "");
            this.getImagePreview = videoCaptureWithOutput;
            if (this.CameraConstants) {
                Config config3 = getConfig();
                UseCase[] useCaseArr2 = new UseCase[3];
                useCaseArr2[0] = getImagePreview();
                ImageAnalysis imageAnalysis3 = this.getAnalysisEvents;
                if (imageAnalysis3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = startCamera + 93;
                    stopCamera = i4 % 128;
                    int i5 = i4 % 2;
                    imageAnalysis3 = null;
                }
                useCaseArr2[1] = imageAnalysis3;
                VideoCapture<Recorder> videoCapture = this.getImagePreview;
                if (videoCapture == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    videoCapture = null;
                }
                useCaseArr2[2] = videoCapture;
                if (IncodeCameraConfigurator.isUseCaseCombinationSupported$core_light_release(config3, processCameraProvider, useCaseArr2)) {
                    VideoCapture<Recorder> videoCapture2 = this.getImagePreview;
                    if (videoCapture2 == null) {
                        int i6 = startCamera + 7;
                        stopCamera = i6 % 128;
                        if (i6 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        videoCapture2 = null;
                    }
                    builder.addUseCase(videoCapture2);
                } else {
                    int i7 = stopCamera + 121;
                    startCamera = i7 % 128;
                    int i8 = i7 % 2;
                    Timber.Forest.w("Device does not have an available camera that can do imagePreview, analysis, and videoCapture. Proceeding without videoCapture.", new Object[0]);
                }
            }
            UseCaseGroup useCaseGroupBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "");
            final Camera cameraE1 = e1(processCameraProvider, useCaseGroupBuild);
            ResolutionFilter resolutionFilter = getConfig().getPreviewResolutionSelector().getResolutionFilter();
            if (resolutionFilter == null || !resolutionFilter.equals(IncodeCameraConfigurator.INSTANCE.getPreviewUpTo720p16x9Or4x3ResolutionFilter$core_light_release())) {
                this.getAvailableCameraInternals.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
            } else {
                int i9 = startCamera + 15;
                stopCamera = i9 % 128;
                int i10 = i9 % 2;
                this.getAvailableCameraInternals.setImplementationMode(PreviewView.ImplementationMode.PERFORMANCE);
            }
            getImagePreview().setSurfaceProvider(this.getAvailableCameraInternals.getSurfaceProvider());
            CameraControl cameraControl = cameraE1.getCameraControl();
            Intrinsics.checkNotNullExpressionValue(cameraControl, "");
            CameraInfo cameraInfo = cameraE1.getCameraInfo();
            LiveData<CameraState> cameraState = cameraInfo.getCameraState();
            LifecycleOwner lifecycleOwner = this.ProcessCameraProviderExtensionsKt;
            final Function1<CameraState, Unit> function1 = new Function1<CameraState, Unit>(this) { // from class: com.incode.camera.IncodeCamera$configure$cameraInfo$1$1
                private static int IncodeCamera = 0;
                private static int ProcessCameraProviderExtensionsKt = 1;
                private /* synthetic */ IncodeCamera<T> getAvailableCameraInternals;

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(CameraState cameraState2) {
                    int i11 = 2 % 2;
                    int i12 = ProcessCameraProviderExtensionsKt + 33;
                    IncodeCamera = i12 % 128;
                    int i13 = i12 % 2;
                    invoke2(cameraState2);
                    Unit unit = Unit.INSTANCE;
                    if (i13 != 0) {
                        throw null;
                    }
                    int i14 = IncodeCamera + 69;
                    ProcessCameraProviderExtensionsKt = i14 % 128;
                    if (i14 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CameraState cameraState2) {
                    Object value;
                    CameraState.StateError error;
                    Object value2;
                    CameraInfo cameraInfo2;
                    ResolutionInfo resolutionInfo;
                    if (cameraState2.getType() == CameraState.Type.OPEN) {
                        Timber.Forest.d("Camera OPEN", new Object[0]);
                        MutableStateFlow mutableStateFlowAccess$get_cameraState$p = IncodeCamera.access$get_cameraState$p(this.getAvailableCameraInternals);
                        Camera camera = cameraE1;
                        IncodeCamera<T> incodeCamera = this.getAvailableCameraInternals;
                        do {
                            value2 = mutableStateFlowAccess$get_cameraState$p.getValue();
                            cameraInfo2 = camera.getCameraInfo();
                            Intrinsics.checkNotNullExpressionValue(cameraInfo2, "");
                            ImageAnalysis imageAnalysisAccess$getImageAnalysis$p = IncodeCamera.access$getImageAnalysis$p(incodeCamera);
                            if (imageAnalysisAccess$getImageAnalysis$p == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                imageAnalysisAccess$getImageAnalysis$p = null;
                            }
                            resolutionInfo = imageAnalysisAccess$getImageAnalysis$p.getResolutionInfo();
                        } while (!mutableStateFlowAccess$get_cameraState$p.compareAndSet(value2, new IncodeCameraState.Initialized(cameraInfo2, resolutionInfo != null ? resolutionInfo.getResolution() : null)));
                    }
                    CameraState.StateError error2 = cameraState2.getError();
                    if ((error2 != null ? error2.getType() : null) == CameraState.ErrorType.CRITICAL) {
                        MutableStateFlow mutableStateFlowAccess$get_cameraState$p2 = IncodeCamera.access$get_cameraState$p(this.getAvailableCameraInternals);
                        do {
                            value = mutableStateFlowAccess$get_cameraState$p2.getValue();
                            error = cameraState2.getError();
                        } while (!mutableStateFlowAccess$get_cameraState$p2.compareAndSet(value, new IncodeCameraState.Error(error != null ? error.getCause() : null)));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.getAvailableCameraInternals = this;
                }
            };
            cameraState.observe(lifecycleOwner, new Observer() { // from class: com.incode.camera.IncodeCamera$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    IncodeCamera.IncodeCamera(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(cameraInfo, "");
            this.getPreviewView = new InstanceHolder(cameraE1, cameraControl, cameraInfo, processCameraProvider);
            TapToFocusFeature.enableTapToFocus$default(IncodeCamera(), getConfig().getEnableTapToFocus(), cameraControl, null, 4, null);
            Timber.Forest forest = Timber.Forest;
            ImageAnalysis imageAnalysis4 = this.getAnalysisEvents;
            if (imageAnalysis4 == null) {
                int i11 = stopCamera + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                startCamera = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysis4 = null;
            }
            ResolutionInfo resolutionInfo = imageAnalysis4.getResolutionInfo();
            forest.d("Camera initialized, analyzer resolution: " + (resolutionInfo != null ? resolutionInfo.getResolution() : null), new Object[0]);
        } catch (Exception e2) {
            Exception exc = e2;
            Timber.Forest.e(exc, "Failed to configure camera.", new Object[0]);
            MutableStateFlow<IncodeCameraState> mutableStateFlow = this.stopRecording;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new IncodeCameraState.Error(exc))) {
            }
        }
    }

    private final Camera e1(ProcessCameraProvider processCameraProvider, UseCaseGroup useCaseGroup) throws UnsupportedOperationException, IllegalArgumentException, NullPointerException {
        VideoCapture<Recorder> videoCapture;
        Camera cameraBindToLifecycle;
        UseCaseGroup.Builder builder;
        int i2 = 2 % 2;
        while (true) {
            videoCapture = null;
            try {
                cameraBindToLifecycle = processCameraProvider.bindToLifecycle(this.ProcessCameraProviderExtensionsKt, getConfig().getCameraSelector().toCameraXSelector(), useCaseGroup);
                try {
                    if (!this.CameraConstants) {
                        break;
                    }
                    List<UseCase> useCases = useCaseGroup.getUseCases();
                    VideoCapture<Recorder> videoCapture2 = this.getImagePreview;
                    if (videoCapture2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        videoCapture2 = null;
                    }
                    if (!useCases.contains(videoCapture2)) {
                        break;
                    }
                    this.setExposureCompensationState = Boolean.TRUE;
                    break;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    String message = e.getMessage();
                    if (message == null || !StringsKt.contains((CharSequence) message, (CharSequence) "No supported surface combination is found for camera device", true)) {
                        break;
                    }
                    if (this.CameraConstants) {
                        int i3 = startCamera + 79;
                        stopCamera = i3 % 128;
                        int i4 = i3 % 2;
                        List<UseCase> useCases2 = useCaseGroup.getUseCases();
                        VideoCapture<Recorder> videoCapture3 = this.getImagePreview;
                        if (videoCapture3 == null) {
                            int i5 = startCamera + 111;
                            stopCamera = i5 % 128;
                            if (i5 % 2 == 0) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i6 = 43 / 0;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            int i7 = startCamera + 117;
                            stopCamera = i7 % 128;
                            int i8 = i7 % 2;
                        } else {
                            videoCapture = videoCapture3;
                        }
                        if (useCases2.contains(videoCapture)) {
                            int i9 = stopCamera + 123;
                            startCamera = i9 % 128;
                            int i10 = i9 % 2;
                            this.setExposureCompensationState = Boolean.FALSE;
                            Timber.Forest.w("Device cannot produce a surface combination that supports video liveness. Proceeding without videoCapture.", new Object[0]);
                        }
                    }
                    List<UseCase> useCases3 = useCaseGroup.getUseCases();
                    Intrinsics.checkNotNullExpressionValue(useCases3, "");
                    builder = new UseCaseGroup.Builder();
                    int size = useCases3.size() - 1;
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = startCamera + 109;
                        stopCamera = i13 % 128;
                        int i14 = i13 % 2;
                        builder.addUseCase(useCases3.get(i12));
                        i11++;
                    }
                    if (i11 <= 0) {
                        int i15 = stopCamera + 117;
                        startCamera = i15 % 128;
                        int i16 = i15 % 2;
                        Timber.Forest.e("Device has no supported surface combination for any of the requested use-cases!", new Object[0]);
                        throw e;
                    }
                    useCaseGroup = builder.build();
                    Intrinsics.checkNotNullExpressionValue(useCaseGroup, "");
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                cameraBindToLifecycle = null;
            }
            useCaseGroup = builder.build();
            Intrinsics.checkNotNullExpressionValue(useCaseGroup, "");
        }
        Intrinsics.checkNotNull(cameraBindToLifecycle);
        int i17 = stopCamera + 35;
        startCamera = i17 % 128;
        if (i17 % 2 == 0) {
            return cameraBindToLifecycle;
        }
        videoCapture.hashCode();
        throw null;
    }

    private final <R> R CameraConstants(Function1<? super InstanceHolder, ? extends R> function1) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 63;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        InstanceHolder instanceHolder = this.getPreviewView;
        if (instanceHolder == null) {
            throw new IllegalStateException("Camera must be configured before calling this method.".toString());
        }
        Intrinsics.checkNotNull(instanceHolder);
        R rInvoke = function1.invoke(instanceHolder);
        int i5 = stopCamera + 83;
        startCamera = i5 % 128;
        int i6 = i5 % 2;
        return rInvoke;
    }

    public static final void CameraConstants(IncodeCamera incodeCamera, ListenableFuture listenableFuture) {
        int i2 = 2 % 2;
        int i3 = stopCamera + 95;
        startCamera = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(incodeCamera, "");
            Intrinsics.checkNotNullParameter(listenableFuture, "");
            incodeCamera.IncodeCamera(listenableFuture);
            int i4 = 3 / 0;
        } else {
            Intrinsics.checkNotNullParameter(incodeCamera, "");
            Intrinsics.checkNotNullParameter(listenableFuture, "");
            incodeCamera.IncodeCamera(listenableFuture);
        }
        int i5 = stopCamera + 97;
        startCamera = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void startCamera(Config config) {
        int i2 = 2 % 2;
        int i3 = startCamera + 17;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(config, "");
        Lifecycle lifecycle = this.ProcessCameraProviderExtensionsKt.getLifecycle();
        lifecycle.removeObserver(this.getFrameAnalyzerWrapper);
        lifecycle.addObserver(this.getFrameAnalyzerWrapper);
        Timber.Forest.d("Start camera called with: " + config, new Object[0]);
        setConfig(config);
        InstanceHolder instanceHolder = this.getPreviewView;
        if (instanceHolder != null) {
            int i5 = stopCamera + 9;
            startCamera = i5 % 128;
            int i6 = i5 % 2;
            ProcessCameraProvider processCameraProvider = instanceHolder.getProcessCameraProvider();
            if (processCameraProvider != null) {
                processCameraProvider.unbindAll();
            }
        }
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(this.f3552e1);
        companion.addListener(new Runnable() { // from class: com.incode.camera.IncodeCamera$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IncodeCamera.CameraConstants(this.f$0, companion);
            }
        }, ContextCompat.getMainExecutor(this.f3552e1));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001c A[PHI: r0
  0x001c: PHI (r0v9 com.incode.camera.IncodeCamera$InstanceHolder) = (r0v5 com.incode.camera.IncodeCamera$InstanceHolder), (r0v12 com.incode.camera.IncodeCamera$InstanceHolder) binds: [B:29:0x0032, B:23:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void stopCamera() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.camera.IncodeCamera.startCamera
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.camera.IncodeCamera.stopCamera = r0
            int r1 = r1 % r3
            r0 = 0
            java.lang.String r2 = "stop camera"
            if (r1 != 0) goto L29
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.d(r2, r0)
            com.incode.camera.IncodeCamera$InstanceHolder r0 = r4.getPreviewView
            if (r0 == 0) goto L35
        L1c:
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r0.getProcessCameraProvider()
            if (r0 == 0) goto L35
            r0.unbindAll()
            r0.shutdownAsync()
            return
        L29:
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.d(r2, r0)
            com.incode.camera.IncodeCamera$InstanceHolder r0 = r4.getPreviewView
            if (r0 == 0) goto L35
            goto L1c
        L35:
            int r0 = com.incode.camera.IncodeCamera.stopCamera
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.camera.IncodeCamera.startCamera = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L41
            return
        L41:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.IncodeCamera.stopCamera():void");
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$isVideoLivenessRecordingSupported$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke", "(Lcom/incode/camera/IncodeCamera$InstanceHolder;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11581 extends Lambda implements Function1<InstanceHolder, Boolean> {
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private /* synthetic */ IncodeCamera<T> CameraConstants;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 17;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            InstanceHolder instanceHolder2 = instanceHolder;
            if (i3 % 2 == 0) {
                invoke2(instanceHolder2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Boolean boolInvoke2 = invoke2(instanceHolder2);
            int i4 = IncodeCamera + 81;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i4 % 2;
            return boolInvoke2;
        }

        /* JADX INFO: renamed from: invoke */
        public final Boolean invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 59;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            Camera camera = instanceHolder.getCamera();
            UseCase[] useCaseArr = new UseCase[3];
            boolean z2 = false;
            useCaseArr[0] = this.CameraConstants.getImagePreview();
            ImageAnalysis imageAnalysisAccess$getImageAnalysis$p = IncodeCamera.access$getImageAnalysis$p(this.CameraConstants);
            VideoCapture videoCapture = null;
            if (imageAnalysisAccess$getImageAnalysis$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = ProcessCameraProviderExtensionsKt + 3;
                IncodeCamera = i5 % 128;
                int i6 = i5 % 2;
                imageAnalysisAccess$getImageAnalysis$p = null;
            }
            useCaseArr[1] = imageAnalysisAccess$getImageAnalysis$p;
            VideoCapture videoCaptureAccess$getVideoCapture$p = IncodeCamera.access$getVideoCapture$p(this.CameraConstants);
            if (videoCaptureAccess$getVideoCapture$p == null) {
                int i7 = ProcessCameraProviderExtensionsKt + 45;
                IncodeCamera = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                videoCapture = videoCaptureAccess$getVideoCapture$p;
            }
            useCaseArr[2] = videoCapture;
            if (camera.isUseCasesCombinationSupported(useCaseArr) && Intrinsics.areEqual(IncodeCamera.access$getSurfaceComboForVideoLivenessFound$p(this.CameraConstants), Boolean.TRUE)) {
                z2 = true;
            } else {
                int i9 = ProcessCameraProviderExtensionsKt + 91;
                IncodeCamera = i9 % 128;
                int i10 = i9 % 2;
            }
            return Boolean.valueOf(z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11581(IncodeCamera<T> incodeCamera) {
            super(1);
            this.CameraConstants = incodeCamera;
        }
    }

    public final boolean isVideoLivenessRecordingSupported() {
        int i2 = 2 % 2;
        boolean zBooleanValue = ((Boolean) CameraConstants(new Function1<InstanceHolder, Boolean>(this) { // from class: com.incode.camera.IncodeCamera.isVideoLivenessRecordingSupported.1
            private static int IncodeCamera = 0;
            private static int ProcessCameraProviderExtensionsKt = 1;
            private /* synthetic */ IncodeCamera<T> CameraConstants;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Boolean invoke(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = IncodeCamera + 17;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                InstanceHolder instanceHolder2 = instanceHolder;
                if (i3 % 2 == 0) {
                    invoke2(instanceHolder2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Boolean boolInvoke2 = invoke2(instanceHolder2);
                int i4 = IncodeCamera + 81;
                ProcessCameraProviderExtensionsKt = i4 % 128;
                int i5 = i4 % 2;
                return boolInvoke2;
            }

            /* JADX INFO: renamed from: invoke */
            public final Boolean invoke2(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = IncodeCamera + 59;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                Camera camera = instanceHolder.getCamera();
                UseCase[] useCaseArr = new UseCase[3];
                boolean z2 = false;
                useCaseArr[0] = this.CameraConstants.getImagePreview();
                ImageAnalysis imageAnalysisAccess$getImageAnalysis$p = IncodeCamera.access$getImageAnalysis$p(this.CameraConstants);
                VideoCapture videoCapture = null;
                if (imageAnalysisAccess$getImageAnalysis$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = ProcessCameraProviderExtensionsKt + 3;
                    IncodeCamera = i5 % 128;
                    int i6 = i5 % 2;
                    imageAnalysisAccess$getImageAnalysis$p = null;
                }
                useCaseArr[1] = imageAnalysisAccess$getImageAnalysis$p;
                VideoCapture videoCaptureAccess$getVideoCapture$p = IncodeCamera.access$getVideoCapture$p(this.CameraConstants);
                if (videoCaptureAccess$getVideoCapture$p == null) {
                    int i7 = ProcessCameraProviderExtensionsKt + 45;
                    IncodeCamera = i7 % 128;
                    int i8 = i7 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    videoCapture = videoCaptureAccess$getVideoCapture$p;
                }
                useCaseArr[2] = videoCapture;
                if (camera.isUseCasesCombinationSupported(useCaseArr) && Intrinsics.areEqual(IncodeCamera.access$getSurfaceComboForVideoLivenessFound$p(this.CameraConstants), Boolean.TRUE)) {
                    z2 = true;
                } else {
                    int i9 = ProcessCameraProviderExtensionsKt + 91;
                    IncodeCamera = i9 % 128;
                    int i10 = i9 % 2;
                }
                return Boolean.valueOf(z2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11581(IncodeCamera<T> this) {
                super(1);
                this.CameraConstants = this;
            }
        })).booleanValue();
        int i3 = stopCamera + 39;
        startCamera = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return zBooleanValue;
    }

    public final void startRecording(File videoFile, Consumer<VideoRecordEvent> recordingListener) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoFile, "");
        Intrinsics.checkNotNullParameter(recordingListener, "");
        Recording recording = this.getCameraState;
        VideoCapture<Recorder> videoCapture = null;
        if (recording != null) {
            Intrinsics.checkNotNull(recording);
            recording.stop();
            this.getCameraState = null;
        }
        VideoCapture<Recorder> videoCapture2 = this.getImagePreview;
        if (videoCapture2 == null) {
            int i3 = stopCamera + 43;
            startCamera = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = startCamera + 99;
            stopCamera = i5 % 128;
            int i6 = i5 % 2;
        } else {
            videoCapture = videoCapture2;
        }
        this.getCameraState = ((Recorder) videoCapture.getOutput()).prepareRecording(this.f3552e1, new FileOutputOptions.Builder(videoFile).build()).start(ContextCompat.getMainExecutor(this.f3552e1), recordingListener);
        int i7 = stopCamera + 59;
        startCamera = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 20 / 0;
        }
    }

    public final void stopRecording() {
        int i2 = 2 % 2;
        int i3 = stopCamera;
        int i4 = i3 + 19;
        startCamera = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
            if (this.getCameraState == null) {
                return;
            }
        } else if (this.getCameraState == null) {
            return;
        }
        int i6 = i3 + 67;
        startCamera = i6 % 128;
        int i7 = i6 % 2;
        Recording recording = this.getCameraState;
        Intrinsics.checkNotNull(recording);
        recording.stop();
    }

    public final Config getConfiguration() {
        int i2 = 2 % 2;
        int i3 = stopCamera;
        int i4 = i3 + 13;
        startCamera = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.config == null) {
            int i5 = i3 + 19;
            startCamera = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        return getConfig();
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$toggleTorch$1 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11641 extends Lambda implements Function1<InstanceHolder, ListenableFuture<Void>> {
        private static int CameraConstants = 1;
        public static final C11641 INSTANCE = ;
        private static int IncodeCamera = 1;
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1 */
        private static int f3563e1 = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ ListenableFuture<Void> invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3563e1 + 25;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            ListenableFuture<Void> listenableFutureInvoke2 = invoke2(instanceHolder);
            if (i4 == 0) {
                int i5 = 26 / 0;
            }
            int i6 = f3563e1 + 89;
            IncodeCamera = i6 % 128;
            if (i6 % 2 != 0) {
                return listenableFutureInvoke2;
            }
            throw null;
        }

        /* JADX INFO: renamed from: invoke */
        public final ListenableFuture<Void> invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            Integer value = instanceHolder.getCameraInfo().getTorchState().getValue();
            if (value == null) {
                int i3 = f3563e1 + 49;
                IncodeCamera = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else if (value.intValue() == 1) {
                ListenableFuture<Void> listenableFutureEnableTorch = instanceHolder.getCameraControl().enableTorch(false);
                int i4 = IncodeCamera + 67;
                f3563e1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 89 / 0;
                }
                return listenableFutureEnableTorch;
            }
            ListenableFuture<Void> listenableFutureEnableTorch2 = instanceHolder.getCameraControl().enableTorch(true);
            int i6 = f3563e1 + 23;
            IncodeCamera = i6 % 128;
            int i7 = i6 % 2;
            return listenableFutureEnableTorch2;
        }

        static {
            int i2 = ProcessCameraProviderExtensionsKt + 37;
            CameraConstants = i2 % 128;
            int i3 = i2 % 2;
        }

        C11641() {
        }
    }

    public final void toggleTorch() {
        int i2 = 2 % 2;
        int i3 = stopCamera + 35;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        CameraConstants(C11641.INSTANCE);
        int i5 = startCamera + 109;
        stopCamera = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$isZoomSupported$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke", "(Lcom/incode/camera/IncodeCamera$InstanceHolder;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11591 extends Lambda implements Function1<InstanceHolder, Boolean> {
        private static int CameraConstants = 0;
        public static final C11591 INSTANCE = ;
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private static int getAvailableCameraInternals = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 21;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            Boolean boolInvoke2 = invoke2(instanceHolder);
            int i5 = getAvailableCameraInternals + 43;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return boolInvoke2;
        }

        /* JADX INFO: renamed from: invoke */
        public final Boolean invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            ZoomState value = instanceHolder.getCameraInfo().getZoomState().getValue();
            boolean z2 = false;
            if (value == null) {
                int i3 = IncodeCamera + 99;
                getAvailableCameraInternals = i3 % 128;
                int i4 = i3 % 2;
            } else if (value.getMaxZoomRatio() > value.getMinZoomRatio()) {
                int i5 = getAvailableCameraInternals + 35;
                IncodeCamera = i5 % 128;
                if (i5 % 2 == 0) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }

        static {
            int i2 = ProcessCameraProviderExtensionsKt + 43;
            CameraConstants = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        C11591() {
        }
    }

    public final boolean isZoomSupported() {
        int i2 = 2 % 2;
        int i3 = stopCamera + 15;
        startCamera = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) CameraConstants(C11591.INSTANCE)).booleanValue();
            int i4 = stopCamera + 31;
            startCamera = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            obj.hashCode();
            throw null;
        }
        ((Boolean) CameraConstants(C11591.INSTANCE)).booleanValue();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$setLinearZoom$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11611 extends Lambda implements Function1<InstanceHolder, Void> {
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1 */
        private static int f3560e1 = 1;
        private /* synthetic */ float CameraConstants;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Void invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3560e1 + 87;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            Void voidInvoke2 = invoke2(instanceHolder);
            int i5 = ProcessCameraProviderExtensionsKt + 91;
            f3560e1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return voidInvoke2;
        }

        /* JADX INFO: renamed from: invoke */
        public final Void invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3560e1 + 43;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                instanceHolder.getCameraControl().setLinearZoom(f).get();
                throw null;
            }
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            Void r2 = instanceHolder.getCameraControl().setLinearZoom(f).get();
            int i4 = f3560e1 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i4 % 2;
            return r2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11611(float f2) {
            super(1);
            f = f2;
        }
    }

    public final void setLinearZoom(float linearZoom) {
        int i2 = 2 % 2;
        CameraConstants(new Function1<InstanceHolder, Void>() { // from class: com.incode.camera.IncodeCamera.setLinearZoom.1
            private static int ProcessCameraProviderExtensionsKt = 0;

            /* JADX INFO: renamed from: e1 */
            private static int f3560e1 = 1;
            private /* synthetic */ float CameraConstants;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Void invoke(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = f3560e1 + 87;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                Void voidInvoke2 = invoke2(instanceHolder);
                int i5 = ProcessCameraProviderExtensionsKt + 91;
                f3560e1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 6 / 0;
                }
                return voidInvoke2;
            }

            /* JADX INFO: renamed from: invoke */
            public final Void invoke2(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = f3560e1 + 43;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(instanceHolder, "");
                    instanceHolder.getCameraControl().setLinearZoom(f).get();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                Void r2 = instanceHolder.getCameraControl().setLinearZoom(f).get();
                int i4 = f3560e1 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                ProcessCameraProviderExtensionsKt = i4 % 128;
                int i5 = i4 % 2;
                return r2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11611(float linearZoom2) {
                super(1);
                f = linearZoom2;
            }
        });
        int i3 = stopCamera + 27;
        startCamera = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$zoomCameraToMax$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11651 extends Lambda implements Function1<InstanceHolder, Void> {
        private static int CameraConstants = 0;
        public static final C11651 INSTANCE = ;
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1 */
        private static int f3564e1 = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Void invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3564e1 + 97;
            IncodeCamera = i3 % 128;
            InstanceHolder instanceHolder2 = instanceHolder;
            if (i3 % 2 == 0) {
                return invoke2(instanceHolder2);
            }
            invoke2(instanceHolder2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: invoke */
        public final Void invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3564e1 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            CameraControl cameraControl = instanceHolder.getCameraControl();
            ZoomState value = instanceHolder.getCameraInfo().getZoomState().getValue();
            Intrinsics.checkNotNull(value);
            Void r2 = cameraControl.setZoomRatio(value.getMaxZoomRatio()).get();
            int i5 = IncodeCamera + 23;
            f3564e1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            return r2;
        }

        static {
            int i2 = CameraConstants + 75;
            ProcessCameraProviderExtensionsKt = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        C11651() {
        }
    }

    public final void zoomCameraToMax() {
        int i2 = 2 % 2;
        int i3 = startCamera + 37;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        CameraConstants(C11651.INSTANCE);
        int i5 = stopCamera + 115;
        startCamera = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void resetCameraZoom() {
        CameraControl cameraControl;
        ListenableFuture<Void> zoomRatio;
        int i2 = 2 % 2;
        int i3 = startCamera + 91;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        InstanceHolder instanceHolder = this.getPreviewView;
        if (instanceHolder == null || (cameraControl = instanceHolder.getCameraControl()) == null) {
            return;
        }
        int i5 = startCamera + 25;
        stopCamera = i5 % 128;
        if (i5 % 2 == 0) {
            zoomRatio = cameraControl.setZoomRatio(1.0f);
            if (zoomRatio == null) {
                return;
            }
        } else {
            zoomRatio = cameraControl.setZoomRatio(1.0f);
            if (zoomRatio == null) {
                return;
            }
        }
        zoomRatio.get();
        int i6 = stopCamera + 37;
        startCamera = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$isExposureCompensationSupported$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke", "(Lcom/incode/camera/IncodeCamera$InstanceHolder;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11571 extends Lambda implements Function1<InstanceHolder, Boolean> {
        public static final C11571 INSTANCE = ;
        private static int IncodeCamera = 1;
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1 */
        private static int f3558e1 = 0;
        private static int getAvailableCameraInternals = 0;

        /* JADX INFO: renamed from: invoke */
        public final Boolean invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 39;
            f3558e1 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            Boolean boolValueOf = Boolean.valueOf(instanceHolder.getCameraInfo().getExposureState().isExposureCompensationSupported());
            int i5 = f3558e1 + 47;
            IncodeCamera = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
            }
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3558e1 + 39;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            Boolean boolInvoke2 = invoke2(instanceHolder);
            int i5 = IncodeCamera + 81;
            f3558e1 = i5 % 128;
            if (i5 % 2 == 0) {
                return boolInvoke2;
            }
            throw null;
        }

        static {
            int i2 = getAvailableCameraInternals + 1;
            ProcessCameraProviderExtensionsKt = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
        }

        C11571() {
        }
    }

    public final boolean isExposureCompensationSupported() {
        int i2 = 2 % 2;
        int i3 = startCamera + 117;
        stopCamera = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) CameraConstants(C11571.INSTANCE)).booleanValue();
        int i5 = startCamera + 71;
        stopCamera = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$setExposure$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11601 extends Lambda implements Function1<InstanceHolder, Object> {
        private static int CameraConstants = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private /* synthetic */ IncodeCamera<T> IncodeCamera;

        /* JADX INFO: renamed from: e1 */
        private /* synthetic */ int f3559e1;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 103;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke2 = invoke2(instanceHolder);
            int i5 = ProcessCameraProviderExtensionsKt + 99;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke2;
        }

        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(InstanceHolder instanceHolder) {
            Object obj;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            if (!this.IncodeCamera.isExposureCompensationSupported()) {
                this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.UNSUPPORTED);
                return Unit.INSTANCE;
            }
            int i3 = ProcessCameraProviderExtensionsKt + 39;
            CameraConstants = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    obj = instanceHolder.getCameraControl().setExposureCompensationIndex(i).get();
                    int i4 = 27 / 0;
                } else {
                    obj = instanceHolder.getCameraControl().setExposureCompensationIndex(i).get();
                }
            } catch (CameraControl.OperationCanceledException unused) {
                this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.LAST_OPERATION_CANCELLED);
                obj = Unit.INSTANCE;
            } catch (IllegalArgumentException unused2) {
                this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.INVALID_VALUE_ATTEMPTED);
                obj = Unit.INSTANCE;
            }
            int i5 = CameraConstants + 95;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 != 0) {
                return obj;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11601(IncodeCamera<T> incodeCamera, int i2) {
            super(1);
            this.IncodeCamera = incodeCamera;
            i = i2;
        }
    }

    public final void setExposure(int value) {
        int i2 = 2 % 2;
        CameraConstants(new Function1<InstanceHolder, Object>(this) { // from class: com.incode.camera.IncodeCamera.setExposure.1
            private static int CameraConstants = 0;
            private static int ProcessCameraProviderExtensionsKt = 1;
            private /* synthetic */ IncodeCamera<T> IncodeCamera;

            /* JADX INFO: renamed from: e1 */
            private /* synthetic */ int f3559e1;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Object invoke(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = CameraConstants + 103;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                Object objInvoke2 = invoke2(instanceHolder);
                int i5 = ProcessCameraProviderExtensionsKt + 99;
                CameraConstants = i5 % 128;
                int i6 = i5 % 2;
                return objInvoke2;
            }

            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(InstanceHolder instanceHolder) {
                Object obj;
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                if (!this.IncodeCamera.isExposureCompensationSupported()) {
                    this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.UNSUPPORTED);
                    return Unit.INSTANCE;
                }
                int i3 = ProcessCameraProviderExtensionsKt + 39;
                CameraConstants = i3 % 128;
                try {
                    if (i3 % 2 != 0) {
                        obj = instanceHolder.getCameraControl().setExposureCompensationIndex(i).get();
                        int i4 = 27 / 0;
                    } else {
                        obj = instanceHolder.getCameraControl().setExposureCompensationIndex(i).get();
                    }
                } catch (CameraControl.OperationCanceledException unused) {
                    this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.LAST_OPERATION_CANCELLED);
                    obj = Unit.INSTANCE;
                } catch (IllegalArgumentException unused2) {
                    this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.INVALID_VALUE_ATTEMPTED);
                    obj = Unit.INSTANCE;
                }
                int i5 = CameraConstants + 95;
                ProcessCameraProviderExtensionsKt = i5 % 128;
                if (i5 % 2 != 0) {
                    return obj;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11601(IncodeCamera<T> this, int value2) {
                super(1);
                this.IncodeCamera = this;
                i = value2;
            }
        });
        int i3 = stopCamera + 5;
        startCamera = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$getExposureCompensationIndex$1 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke", "(Lcom/incode/camera/IncodeCamera$InstanceHolder;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends Lambda implements Function1<InstanceHolder, Integer> {
        private static int CameraConstants = 0;
        public static final AnonymousClass1 INSTANCE = ;
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1 */
        private static int f3557e1 = 1;
        private static int getAvailableCameraInternals = 0;

        /* JADX INFO: renamed from: invoke */
        public final Integer invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3557e1 + 85;
            CameraConstants = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                return Integer.valueOf(instanceHolder.getCameraInfo().getExposureState().getExposureCompensationIndex());
            }
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            Integer.valueOf(instanceHolder.getCameraInfo().getExposureState().getExposureCompensationIndex());
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Integer invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 11;
            f3557e1 = i3 % 128;
            int i4 = i3 % 2;
            Integer numInvoke2 = invoke2(instanceHolder);
            int i5 = f3557e1 + 87;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return numInvoke2;
        }

        static {
            int i2 = ProcessCameraProviderExtensionsKt + 61;
            getAvailableCameraInternals = i2 % 128;
            int i3 = i2 % 2;
        }

        AnonymousClass1() {
        }
    }

    public final int getExposureCompensationIndex() {
        int i2 = 2 % 2;
        int i3 = stopCamera + 63;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = ((Number) CameraConstants(AnonymousClass1.INSTANCE)).intValue();
        int i5 = stopCamera + 3;
        startCamera = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$setMinExposureCompensation$1 */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11631 extends Lambda implements Function1<InstanceHolder, Unit> {
        private static int CameraConstants = 1;

        /* JADX INFO: renamed from: e1 */
        private static int f3562e1 = 0;
        private /* synthetic */ IncodeCamera<T> IncodeCamera;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3562e1 + 69;
            CameraConstants = i3 % 128;
            int i4 = i3 % 2;
            invoke2(instanceHolder);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f3562e1 + 103;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = f3562e1 + 43;
            CameraConstants = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            IncodeCamera<T> incodeCamera = this.IncodeCamera;
            Object lower = instanceHolder.getCameraInfo().getExposureState().getExposureCompensationRange().getLower();
            Intrinsics.checkNotNullExpressionValue(lower, "");
            incodeCamera.setExposure(((Number) lower).intValue());
            if (this.IncodeCamera.getExposureCompensationState().isValid()) {
                int i5 = CameraConstants + 25;
                f3562e1 = i5 % 128;
                if (i5 % 2 == 0) {
                    this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.MIN);
                    return;
                }
                this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.MIN);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11631(IncodeCamera<T> incodeCamera) {
            super(1);
            this.IncodeCamera = incodeCamera;
        }
    }

    public final void setMinExposureCompensation() {
        int i2 = 2 % 2;
        CameraConstants(new Function1<InstanceHolder, Unit>(this) { // from class: com.incode.camera.IncodeCamera.setMinExposureCompensation.1
            private static int CameraConstants = 1;

            /* JADX INFO: renamed from: e1 */
            private static int f3562e1 = 0;
            private /* synthetic */ IncodeCamera<T> IncodeCamera;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = f3562e1 + 69;
                CameraConstants = i3 % 128;
                int i4 = i3 % 2;
                invoke2(instanceHolder);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f3562e1 + 103;
                CameraConstants = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = f3562e1 + 43;
                CameraConstants = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                IncodeCamera<T> incodeCamera = this.IncodeCamera;
                Object lower = instanceHolder.getCameraInfo().getExposureState().getExposureCompensationRange().getLower();
                Intrinsics.checkNotNullExpressionValue(lower, "");
                incodeCamera.setExposure(((Number) lower).intValue());
                if (this.IncodeCamera.getExposureCompensationState().isValid()) {
                    int i5 = CameraConstants + 25;
                    f3562e1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.MIN);
                        return;
                    }
                    this.IncodeCamera.setExposureCompensationState(ExposureCompensationState.MIN);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11631(IncodeCamera<T> this) {
                super(1);
                this.IncodeCamera = this;
            }
        });
        int i3 = startCamera + 59;
        stopCamera = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.camera.IncodeCamera$setMaxExposureCompensation$1 */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lcom/incode/camera/IncodeCamera$InstanceHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C11621 extends Lambda implements Function1<InstanceHolder, Unit> {
        private static int CameraConstants = 1;

        /* JADX INFO: renamed from: e1 */
        private static int f3561e1 = 0;
        private /* synthetic */ IncodeCamera<T> ProcessCameraProviderExtensionsKt;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 71;
            f3561e1 = i3 % 128;
            int i4 = i3 % 2;
            invoke2(instanceHolder);
            Unit unit = Unit.INSTANCE;
            int i5 = f3561e1 + 111;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InstanceHolder instanceHolder) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 15;
            f3561e1 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(instanceHolder, "");
            IncodeCamera<T> incodeCamera = this.ProcessCameraProviderExtensionsKt;
            Object upper = instanceHolder.getCameraInfo().getExposureState().getExposureCompensationRange().getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "");
            incodeCamera.setExposure(((Number) upper).intValue());
            if (this.ProcessCameraProviderExtensionsKt.getExposureCompensationState().isValid()) {
                this.ProcessCameraProviderExtensionsKt.setExposureCompensationState(ExposureCompensationState.MAX);
            }
            int i5 = f3561e1 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            CameraConstants = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11621(IncodeCamera<T> incodeCamera) {
            super(1);
            this.ProcessCameraProviderExtensionsKt = incodeCamera;
        }
    }

    public final void setMaxExposureCompensation() {
        int i2 = 2 % 2;
        CameraConstants(new Function1<InstanceHolder, Unit>(this) { // from class: com.incode.camera.IncodeCamera.setMaxExposureCompensation.1
            private static int CameraConstants = 1;

            /* JADX INFO: renamed from: e1 */
            private static int f3561e1 = 0;
            private /* synthetic */ IncodeCamera<T> ProcessCameraProviderExtensionsKt;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = CameraConstants + 71;
                f3561e1 = i3 % 128;
                int i4 = i3 % 2;
                invoke2(instanceHolder);
                Unit unit = Unit.INSTANCE;
                int i5 = f3561e1 + 111;
                CameraConstants = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InstanceHolder instanceHolder) {
                int i22 = 2 % 2;
                int i3 = CameraConstants + 15;
                f3561e1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(instanceHolder, "");
                IncodeCamera<T> incodeCamera = this.ProcessCameraProviderExtensionsKt;
                Object upper = instanceHolder.getCameraInfo().getExposureState().getExposureCompensationRange().getUpper();
                Intrinsics.checkNotNullExpressionValue(upper, "");
                incodeCamera.setExposure(((Number) upper).intValue());
                if (this.ProcessCameraProviderExtensionsKt.getExposureCompensationState().isValid()) {
                    this.ProcessCameraProviderExtensionsKt.setExposureCompensationState(ExposureCompensationState.MAX);
                }
                int i5 = f3561e1 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                CameraConstants = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11621(IncodeCamera<T> this) {
                super(1);
                this.ProcessCameraProviderExtensionsKt = this;
            }
        });
        int i3 = stopCamera + 11;
        startCamera = i3 % 128;
        int i4 = i3 % 2;
    }

    static {
        int i2 = getConfiguration + 23;
        toggleTorch = i2 % 128;
        int i3 = i2 % 2;
    }
}
