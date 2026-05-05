package com.incode.welcome_sdk.ui.id_capture.viewmodel;

import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ResolutionInfo;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.IncodeCamera;
import com.incode.camera.IncodeCameraConfigurator;
import com.incode.camera.IncodeCameraSelector;
import com.incode.camera.IncodeCameraState;
import com.incode.camera.analysis.FrameAnalyzer;
import com.incode.camera.analysis.FrameAnalyzerWrapper;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.commons.utils.Side;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.commons.j;
import com.incode.welcome_sdk.commons.o;
import com.incode.welcome_sdk.data.remote.beans.cb;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.Status;
import com.incode.welcome_sdk.ui.camera.CameraXActivity;
import com.incode.welcome_sdk.ui.camera.CameraXVideoCapturer;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel;
import com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler;
import com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler;
import com.incode.welcome_sdk.ui.id_capture.CaptureUiState;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureFrameLogger;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt;
import com.incode.welcome_sdk.ui.id_capture.IdCapturePresentableError;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError;
import com.incode.welcome_sdk.ui.id_capture.event.IdCaptureUiEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureViewModel extends ViewModel {
    private static int A = 1;
    private static int C = 0;
    private static int D = 0;
    private static int I = 1;
    private Job B;

    /* JADX INFO: renamed from: a */
    private final IdScan f15741a;

    /* JADX INFO: renamed from: b */
    private final IdScan.IdType f15742b;

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.commons.o f15743c;

    /* JADX INFO: renamed from: d */
    private final IdCaptureRepository f15744d;

    /* JADX INFO: renamed from: e */
    private final IncodeCamera<DocumentAnalysisEvent> f15745e;

    /* JADX INFO: renamed from: f */
    private final IdCaptureAnalytics f15746f;

    /* JADX INFO: renamed from: g */
    private final CaptureResultHolder f15747g;

    /* JADX INFO: renamed from: h */
    private final CoroutineDispatcher f15748h;

    /* JADX INFO: renamed from: i */
    private final AudioPermissionHandler f15749i;

    /* JADX INFO: renamed from: j */
    private final com.incode.welcome_sdk.commons.b f15750j;

    /* JADX INFO: renamed from: k */
    private final com.incode.welcome_sdk.commons.utils.ak f15751k;

    /* JADX INFO: renamed from: l */
    private final AutoCaptureTimeoutHandler f15752l;

    /* JADX INFO: renamed from: m */
    private final com.incode.welcome_sdk.commons.j f15753m;

    /* JADX INFO: renamed from: n */
    private final IdCaptureFrameLogger f15754n;

    /* JADX INFO: renamed from: o */
    private final List<com.incode.welcome_sdk.data.local.a> f15755o;

    /* JADX INFO: renamed from: p */
    private final FrameAnalyzerWrapper<DocumentAnalysisEvent> f15756p;

    /* JADX INFO: renamed from: q */
    private DocumentType f15757q;

    /* JADX INFO: renamed from: r */
    private boolean f15758r;

    /* JADX INFO: renamed from: s */
    private int f15759s;

    /* JADX INFO: renamed from: t */
    private DocumentType f15760t;

    /* JADX INFO: renamed from: u */
    private boolean f15761u;

    /* JADX INFO: renamed from: v */
    private final StateFlow<CaptureUiState> f15762v;

    /* JADX INFO: renamed from: w */
    private final MutableStateFlow<CaptureUiState> f15763w;

    /* JADX INFO: renamed from: x */
    private int f15764x;

    /* JADX INFO: renamed from: y */
    private final boolean f15765y;

    /* JADX INFO: renamed from: z */
    private final CoroutineExceptionHandler f15766z;

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | (~(i8 | i7)) | (~(i9 | i7));
        int i11 = ~(i2 | i8);
        int i12 = i7 | i11 | (~(i9 | i6));
        int i13 = i7 + i6 + i3 + ((-393945980) * i5) + (1728320405 * i4);
        int i14 = i13 * i13;
        int i15 = ((-1552544754) * i7) + 1566572544 + ((-1100352524) * i6) + (i10 * (-226096115)) + ((-226096115) * i11) + (226096115 * i12) + ((-1326448640) * i3) + (2076180480 * i5) + ((-877658112) * i4) + (214302720 * i14);
        int i16 = ((i7 * (-252835662)) - 192251156) + (i6 * (-252834676)) + (i10 * (-493)) + (i11 * (-493)) + (i12 * 493) + (i3 * (-252835169)) + (i5 * 1574575612) + (i4 * 147979147) + (i14 * (-1426456576));
        switch (i15 + (i16 * i16 * 2075787264)) {
            case 1:
                return b(objArr);
            case 2:
                return a(objArr);
            case 3:
                return c(objArr);
            case 4:
                return e(objArr);
            case 5:
                return g(objArr);
            case 6:
                return h(objArr);
            case 7:
                IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
                int i17 = 2 % 2;
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(idCaptureViewModel), null, null, idCaptureViewModel.new g(null), 3, null);
                int i18 = A + 23;
                C = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 8:
                return i(objArr);
            default:
                return d(objArr);
        }
    }

    public static final /* synthetic */ Flow access$documentAnalyzerEvents(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 5;
        C = i3 % 128;
        int i4 = i3 % 2;
        Flow<DocumentAnalysisEvent> flowC = idCaptureViewModel.c();
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        return flowC;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.commons.b access$getActivityActionsHandler$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 3;
        C = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.b bVar = idCaptureViewModel.f15750j;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        return bVar;
    }

    public static final /* synthetic */ IdCaptureAnalytics access$getAnalytics$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 45;
        C = i4 % 128;
        int i5 = i4 % 2;
        IdCaptureAnalytics idCaptureAnalytics = idCaptureViewModel.f15746f;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 47;
        C = i6 % 128;
        int i7 = i6 % 2;
        return idCaptureAnalytics;
    }

    public static final /* synthetic */ AudioPermissionHandler access$getAudioPermissionHandler$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 109;
        A = i4 % 128;
        int i5 = i4 % 2;
        AudioPermissionHandler audioPermissionHandler = idCaptureViewModel.f15749i;
        int i6 = i3 + 13;
        A = i6 % 128;
        int i7 = i6 % 2;
        return audioPermissionHandler;
    }

    public static final /* synthetic */ CaptureResultHolder access$getCaptureResultHolder$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 101;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        CaptureResultHolder captureResultHolder = idCaptureViewModel.f15747g;
        int i6 = i4 + 107;
        A = i6 % 128;
        int i7 = i6 % 2;
        return captureResultHolder;
    }

    public static final /* synthetic */ float access$getCenterBrightnessLevel(IdCaptureViewModel idCaptureViewModel, Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = A + 49;
        C = i3 % 128;
        int i4 = i3 % 2;
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        float fFloatValue = ((Float) b(iC, iC2, CameraXActivity.c.c(), new Object[]{bitmap}, iC3, 838146575, -838146569)).floatValue();
        int i5 = A + 97;
        C = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue;
    }

    public static final /* synthetic */ List access$getCountryList$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 27;
        A = i4 % 128;
        int i5 = i4 % 2;
        List<com.incode.welcome_sdk.data.local.a> list = idCaptureViewModel.f15755o;
        int i6 = i3 + 125;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static final /* synthetic */ CoroutineDispatcher access$getDispatcherIo$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 89;
        A = i4 % 128;
        int i5 = i4 % 2;
        CoroutineDispatcher coroutineDispatcher = idCaptureViewModel.f15748h;
        int i6 = i3 + 19;
        A = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return coroutineDispatcher;
    }

    public static final /* synthetic */ DocumentType access$getDocumentType$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 109;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        DocumentType documentType = idCaptureViewModel.f15760t;
        int i6 = i4 + 63;
        A = i6 % 128;
        int i7 = i6 % 2;
        return documentType;
    }

    public static final /* synthetic */ FrameAnalyzerWrapper access$getFrameAnalyzerWrapper$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C + 39;
        int i4 = i3 % 128;
        A = i4;
        int i5 = i3 % 2;
        FrameAnalyzerWrapper<DocumentAnalysisEvent> frameAnalyzerWrapper = idCaptureViewModel.f15756p;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 33;
        C = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 27 / 0;
        }
        return frameAnalyzerWrapper;
    }

    public static final /* synthetic */ IdCaptureFrameLogger access$getFrameLogger$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 117;
        A = i4 % 128;
        int i5 = i4 % 2;
        IdCaptureFrameLogger idCaptureFrameLogger = idCaptureViewModel.f15754n;
        int i6 = i3 + 31;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return idCaptureFrameLogger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IdCaptureRepository access$getIdCaptureRepository$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 41;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        IdCaptureRepository idCaptureRepository = idCaptureViewModel.f15744d;
        int i6 = i4 + 97;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return idCaptureRepository;
        }
        throw null;
    }

    public static final /* synthetic */ IdScan access$getIdScan$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 17;
        A = i4 % 128;
        int i5 = i4 % 2;
        IdScan idScan = idCaptureViewModel.f15741a;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 39;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return idScan;
        }
        throw null;
    }

    public static final /* synthetic */ IncodeCamera access$getIncodeCamera$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 15;
        A = i4 % 128;
        int i5 = i4 % 2;
        IncodeCamera<DocumentAnalysisEvent> incodeCamera = idCaptureViewModel.f15745e;
        int i6 = i3 + 3;
        A = i6 % 128;
        int i7 = i6 % 2;
        return incodeCamera;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.commons.j access$getOpenTokBinder$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 11;
        C = i4 % 128;
        int i5 = i4 % 2;
        com.incode.welcome_sdk.commons.j jVar = idCaptureViewModel.f15753m;
        int i6 = i3 + 69;
        C = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return jVar;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.commons.o access$getScreenRecordingInitializer$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C + 63;
        A = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.o oVar = idCaptureViewModel.f15743c;
        if (i4 != 0) {
            return oVar;
        }
        throw null;
    }

    public static final /* synthetic */ IdScan.IdType access$getSelectedIdType$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 125;
        C = i3 % 128;
        int i4 = i3 % 2;
        IdScan.IdType idType = idCaptureViewModel.f15742b;
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        return idType;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.commons.utils.ak access$getTalkBackUtil$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C + 113;
        int i4 = i3 % 128;
        A = i4;
        int i5 = i3 % 2;
        com.incode.welcome_sdk.commons.utils.ak akVar = idCaptureViewModel.f15751k;
        if (i5 == 0) {
            int i6 = 84 / 0;
        }
        int i7 = i4 + 55;
        C = i7 % 128;
        int i8 = i7 % 2;
        return akVar;
    }

    public static final /* synthetic */ Object access$handleAutoCaptureObtained(IdCaptureViewModel idCaptureViewModel, DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = C + 57;
        A = i3 % 128;
        int i4 = i3 % 2;
        Object objD = idCaptureViewModel.d(captureCandidateGenerated, (Continuation<? super Unit>) continuation);
        int i5 = A + 71;
        C = i5 % 128;
        int i6 = i5 % 2;
        return objD;
    }

    public static final /* synthetic */ boolean access$handleIdTypeExtractedEvent(IdCaptureViewModel idCaptureViewModel, DocumentAnalysisEvent.IdTypeExtracted idTypeExtracted) {
        int i2 = 2 % 2;
        int i3 = A + 81;
        C = i3 % 128;
        int i4 = i3 % 2;
        boolean zE = idCaptureViewModel.e(idTypeExtracted);
        int i5 = A + 37;
        C = i5 % 128;
        int i6 = i5 % 2;
        return zE;
    }

    public static final /* synthetic */ boolean access$isCloseButtonAllowed$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C + 117;
        A = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = idCaptureViewModel.f15765y;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        return z2;
    }

    public static final /* synthetic */ boolean access$isManualCaptureMode$p(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C + 95;
        int i4 = i3 % 128;
        A = i4;
        int i5 = i3 % 2;
        boolean z2 = idCaptureViewModel.f15761u;
        int i6 = i4 + 103;
        C = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public static final /* synthetic */ boolean access$isZoomTestSuccessful(IdCaptureViewModel idCaptureViewModel, DocumentAnalysisEvent documentAnalysisEvent) {
        int i2 = 2 % 2;
        int i3 = C + 47;
        A = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = idCaptureViewModel.c(documentAnalysisEvent);
        int i5 = A + 93;
        C = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public static final /* synthetic */ Object access$performInjectionDetection(IdCaptureViewModel idCaptureViewModel, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = A + 87;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            idCaptureViewModel.c((Continuation<? super Integer>) continuation);
            throw null;
        }
        Object objC = idCaptureViewModel.c((Continuation<? super Integer>) continuation);
        int i4 = C + 29;
        A = i4 % 128;
        if (i4 % 2 != 0) {
            return objC;
        }
        throw null;
    }

    public static final /* synthetic */ Object access$proceedWithNextSideCapture(IdCaptureViewModel idCaptureViewModel, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = A + 33;
        C = i3 % 128;
        int i4 = i3 % 2;
        Object objE = idCaptureViewModel.e((Continuation<? super Unit>) continuation);
        int i5 = A + 87;
        C = i5 % 128;
        int i6 = i5 % 2;
        return objE;
    }

    public static final /* synthetic */ void access$sendAnalyticsEventForFirstClassification(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 101;
        C = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.d();
        int i5 = C + 111;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setDocumentType$p(IdCaptureViewModel idCaptureViewModel, DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 111;
        C = i4 % 128;
        int i5 = i4 % 2;
        idCaptureViewModel.f15760t = documentType;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 17;
        C = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$setManualCaptureMode$p(IdCaptureViewModel idCaptureViewModel, boolean z2) {
        int i2 = 2 % 2;
        int i3 = C + 91;
        A = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.f15761u = z2;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object access$setupRecordingAndStreaming(IdCaptureViewModel idCaptureViewModel, IncodeCameraState.Initialized initialized, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = A + 87;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            idCaptureViewModel.d(initialized, (Continuation<? super Unit>) continuation);
            throw null;
        }
        Object objD = idCaptureViewModel.d(initialized, (Continuation<? super Unit>) continuation);
        int i4 = C + 59;
        A = i4 % 128;
        int i5 = i4 % 2;
        return objD;
    }

    public static final /* synthetic */ boolean access$shouldEnableAudioWhileStreamingOrRecording(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 83;
        C = i3 % 128;
        int i4 = i3 % 2;
        boolean zA = idCaptureViewModel.a();
        int i5 = C + 105;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            return zA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object access$shouldProcessAnalyzerEvents(IdCaptureViewModel idCaptureViewModel, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = C + 1;
        A = i3 % 128;
        int i4 = i3 % 2;
        Object objA = idCaptureViewModel.a((Continuation<? super Boolean>) continuation);
        if (i4 == 0) {
            int i5 = 19 / 0;
        }
        int i6 = A + 71;
        C = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 50 / 0;
        }
        return objA;
    }

    public static final /* synthetic */ void access$showAnalyzingState(IdCaptureViewModel idCaptureViewModel, boolean z2, ImageBitmap imageBitmap, Boolean bool) {
        int i2 = 2 % 2;
        int i3 = C + 81;
        A = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.a(z2, imageBitmap, bool);
        int i5 = C + 55;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$showError(IdCaptureViewModel idCaptureViewModel, Throwable th) {
        int i2 = 2 % 2;
        int i3 = A + 111;
        C = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.c(th);
        int i5 = C + 105;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Object access$simulateAnalyzingAnimationProgress(IdCaptureViewModel idCaptureViewModel, Deferred deferred, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = C + 91;
        A = i3 % 128;
        int i4 = i3 % 2;
        Object objE = idCaptureViewModel.e(deferred, continuation);
        int i5 = C + 67;
        A = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return objE;
    }

    public static final /* synthetic */ Object access$singleNextCapture(IdCaptureViewModel idCaptureViewModel, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = A + 47;
        C = i3 % 128;
        int i4 = i3 % 2;
        Object objB = idCaptureViewModel.b((Continuation<? super Bitmap>) continuation);
        int i5 = A + 87;
        C = i5 % 128;
        int i6 = i5 % 2;
        return objB;
    }

    public static final /* synthetic */ void access$startAutoCaptureExpirationTimer(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 37;
        C = i3 % 128;
        int i4 = i3 % 2;
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{idCaptureViewModel}, iC3, 1550214759, -1550214751);
        int i5 = C + 93;
        A = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$startDocumentUpload(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 63;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            int iC = CameraXActivity.c.c();
            int iC2 = CameraXActivity.c.c();
            int iC3 = CameraXActivity.c.c();
            b(iC, iC2, CameraXActivity.c.c(), new Object[]{idCaptureViewModel}, iC3, -413089780, 413089781);
            return;
        }
        int iC4 = CameraXActivity.c.c();
        int iC5 = CameraXActivity.c.c();
        int iC6 = CameraXActivity.c.c();
        b(iC4, iC5, CameraXActivity.c.c(), new Object[]{idCaptureViewModel}, iC6, -413089780, 413089781);
        int i4 = 77 / 0;
    }

    public static final /* synthetic */ Object access$switchOrientationIfNeeded(IdCaptureViewModel idCaptureViewModel, boolean z2, boolean z3, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = C + 95;
        A = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {idCaptureViewModel, Boolean.valueOf(z2), Boolean.valueOf(z3), continuation};
        Object objB = b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), objArr, CameraXActivity.c.c(), 364777428, -364777428);
        int i5 = C + 111;
        A = i5 % 128;
        int i6 = i5 % 2;
        return objB;
    }

    public static final /* synthetic */ void access$switchToManualCapture(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = A + 95;
        C = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.t();
        if (i4 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Object access$tweakCameraSettingsAndAnalyseCapture(IdCaptureViewModel idCaptureViewModel, Function1 function1, Function2 function2, Function1 function12, long j2, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = C + 87;
        A = i3 % 128;
        int i4 = i3 % 2;
        Object objD = idCaptureViewModel.d(function1, function2, function12, j2, continuation);
        if (i4 == 0) {
            int i5 = 32 / 0;
        }
        int i6 = A + 61;
        C = i6 % 128;
        int i7 = i6 % 2;
        return objD;
    }

    public static final /* synthetic */ void access$updateUiState(IdCaptureViewModel idCaptureViewModel, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = C + 91;
        A = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.c((Function1<? super CaptureUiState, CaptureUiState>) function1);
        if (i4 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$updateUiStateToManualCapture(IdCaptureViewModel idCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = C + 43;
        A = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.r();
        int i5 = A + 45;
        C = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ CaptureUiState.CaptureFrameSpec access$withAdjustedMultiplier(IdCaptureViewModel idCaptureViewModel, CaptureUiState.CaptureFrameSpec captureFrameSpec) {
        int i2 = 2 % 2;
        int i3 = A + 59;
        C = i3 % 128;
        int i4 = i3 % 2;
        CaptureUiState.CaptureFrameSpec captureFrameSpecD = idCaptureViewModel.d(captureFrameSpec);
        int i5 = A + 109;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            return captureFrameSpecD;
        }
        throw null;
    }

    public /* synthetic */ IdCaptureViewModel(IdCaptureRepository idCaptureRepository, IncodeCamera incodeCamera, com.incode.welcome_sdk.commons.o oVar, IdScan.IdType idType, IdScan idScan, com.incode.welcome_sdk.commons.b bVar, AudioPermissionHandler audioPermissionHandler, IdCaptureAnalytics idCaptureAnalytics, CaptureResultHolder captureResultHolder, CoroutineDispatcher coroutineDispatcher, com.incode.welcome_sdk.commons.j jVar, IdCaptureFrameLogger idCaptureFrameLogger, com.incode.welcome_sdk.commons.utils.ak akVar, AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(idCaptureRepository, incodeCamera, oVar, idType, idScan, bVar, audioPermissionHandler, idCaptureAnalytics, (i2 & 256) != 0 ? new CaptureResultHolder() : captureResultHolder, (i2 & 512) != 0 ? Dispatchers.getIO() : coroutineDispatcher, jVar, idCaptureFrameLogger, akVar, autoCaptureTimeoutHandler, list);
    }

    public IdCaptureViewModel(IdCaptureRepository idCaptureRepository, IncodeCamera<DocumentAnalysisEvent> incodeCamera, com.incode.welcome_sdk.commons.o oVar, IdScan.IdType idType, IdScan idScan, com.incode.welcome_sdk.commons.b bVar, AudioPermissionHandler audioPermissionHandler, IdCaptureAnalytics idCaptureAnalytics, CaptureResultHolder captureResultHolder, CoroutineDispatcher coroutineDispatcher, com.incode.welcome_sdk.commons.j jVar, IdCaptureFrameLogger idCaptureFrameLogger, com.incode.welcome_sdk.commons.utils.ak akVar, AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, List<com.incode.welcome_sdk.data.local.a> list) {
        DocumentType documentType;
        Intrinsics.checkNotNullParameter(idCaptureRepository, "");
        Intrinsics.checkNotNullParameter(incodeCamera, "");
        Intrinsics.checkNotNullParameter(oVar, "");
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(idScan, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(audioPermissionHandler, "");
        Intrinsics.checkNotNullParameter(idCaptureAnalytics, "");
        Intrinsics.checkNotNullParameter(captureResultHolder, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(jVar, "");
        Intrinsics.checkNotNullParameter(idCaptureFrameLogger, "");
        Intrinsics.checkNotNullParameter(akVar, "");
        Intrinsics.checkNotNullParameter(autoCaptureTimeoutHandler, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f15744d = idCaptureRepository;
        this.f15745e = incodeCamera;
        this.f15743c = oVar;
        this.f15742b = idType;
        this.f15741a = idScan;
        this.f15750j = bVar;
        this.f15749i = audioPermissionHandler;
        this.f15746f = idCaptureAnalytics;
        this.f15747g = captureResultHolder;
        this.f15748h = coroutineDispatcher;
        this.f15753m = jVar;
        this.f15754n = idCaptureFrameLogger;
        this.f15751k = akVar;
        this.f15752l = autoCaptureTimeoutHandler;
        this.f15755o = list;
        this.f15756p = incodeCamera.getFrameAnalyzerWrapper();
        if (idType == IdScan.IdType.PASSPORT) {
            documentType = DocumentType.PASSPORT;
        } else if (idScan.getScanStep() == IdScan.ScanStep.BOTH || idScan.getScanStep() == IdScan.ScanStep.FRONT) {
            documentType = DocumentType.FRONT_ID;
        } else {
            documentType = DocumentType.BACK_ID;
        }
        this.f15760t = documentType;
        boolean zShowCloseButton = idCaptureRepository.showCloseButton();
        this.f15765y = zShowCloseButton;
        MutableStateFlow<CaptureUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(CaptureUiState.f14575e.Loading(new CaptureUiState(false, null, null, null, false, false, null, null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, false, null, null, null, 67108863, null), CaptureUiState.CaptureFrameSpec.Companion.from$default(CaptureUiState.CaptureFrameSpec.f14613b, this.f15760t, false, false, null, 12, null), zShowCloseButton, idCaptureRepository.getUXConfig().getCloseButtonPosition(), idCaptureRepository.getUXConfig().getHelpButtonPosition()));
        this.f15763w = MutableStateFlow;
        this.f15762v = MutableStateFlow;
        this.f15766z = new IdCaptureViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        incodeCamera.startCamera(new IncodeCamera.Config(new IncodeCameraSelector(IncodeCameraSelector.Facing.BACK), IncodeCameraConfigurator.idCapturePreviewResolutionSelector(), IncodeCameraConfigurator.idCaptureAnalysisResolutionSelector(), false, 0, 24, null));
        Timber.Forest.d("Current documentType: " + this.f15760t, new Object[0]);
        IdCaptureViewModel idCaptureViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(idCaptureViewModel), null, null, new AnonymousClass4(null), 3, null);
        if (idCaptureRepository.shouldPublishDummyResultInTestMode()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(idCaptureViewModel), null, null, new AnonymousClass1(null), 3, null);
            return;
        }
        b();
        d();
        g();
        h();
    }

    public final StateFlow<CaptureUiState> getState() {
        StateFlow<CaptureUiState> stateFlow;
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 7;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            stateFlow = this.f15762v;
            int i5 = 45 / 0;
        } else {
            stateFlow = this.f15762v;
        }
        int i6 = i3 + 115;
        A = i6 % 128;
        int i7 = i6 % 2;
        return stateFlow;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$4 */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f15771b = 1;

        /* JADX INFO: renamed from: d */
        private static int f15772d = 0;

        /* JADX INFO: renamed from: a */
        private int f15773a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f15773a;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f15773a = 1;
                    if (IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).checkDeviceSafetyInCaptureOnlyMode(this) == coroutine_suspended) {
                        int i4 = f15772d + 65;
                        f15771b = i4 % 128;
                        if (i4 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = f15771b + 45;
                    f15772d = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 5 % 2;
                    }
                }
            } catch (Exception e2) {
                IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).reportTerminalError(e2);
                IdCaptureViewModel.access$getActivityActionsHandler$p(IdCaptureViewModel.this).getCloseScreenAction().invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15772d + 69;
            f15771b = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f15772d + 57;
            f15771b = i5 % 128;
            int i6 = i5 % 2;
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15771b + 45;
            f15772d = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                anonymousClass4.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass4.invokeSuspend(unit);
            int i5 = f15771b + 87;
            f15772d = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            AnonymousClass4 anonymousClass4 = IdCaptureViewModel.this.new AnonymousClass4(continuation);
            int i3 = f15771b + 9;
            f15772d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 99 / 0;
            }
            return anonymousClass4;
        }

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$1 */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: d */
        private static int f15767d = 1;

        /* JADX INFO: renamed from: e */
        private static int f15768e = 0;

        /* JADX INFO: renamed from: c */
        private int f15770c;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x001b, code lost:
        
            if (r1 == 1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x001d, code lost:
        
            kotlin.ResultKt.throwOnFailure(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0041, code lost:
        
            if (r0 == 1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.AnonymousClass1.f15768e
                int r1 = r0 + 99
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.AnonymousClass1.f15767d = r0
                int r1 = r1 % r5
                r4 = 1
                if (r1 != 0) goto L39
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f15770c
                r0 = 83
                int r0 = r0 / 0
                if (r1 == 0) goto L44
                if (r1 != r4) goto L60
            L1d:
                kotlin.ResultKt.throwOnFailure(r7)
            L20:
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getIdCaptureRepository$p(r0)
                r0.publishDummyResult()
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.commons.b r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getActivityActionsHandler$p(r0)
                kotlin.jvm.functions.Function0 r0 = r0.getCloseScreenAction()
                r0.invoke()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L39:
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.f15770c
                if (r0 == 0) goto L44
                if (r0 != r4) goto L60
                goto L1d
            L44:
                kotlin.ResultKt.throwOnFailure(r7)
                r2 = r6
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r6.f15770c = r4
                r0 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r2)
                if (r0 != r3) goto L20
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.AnonymousClass1.f15767d
                int r1 = r0 + 119
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.AnonymousClass1.f15768e = r0
                int r1 = r1 % r5
                if (r1 != 0) goto L68
                return r3
            L60:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L68:
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15768e + 83;
            f15767d = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 30 / 0;
            }
            return objC;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15768e + 61;
            f15767d = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                anonymousClass1.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass1.invokeSuspend(unit);
            int i5 = f15768e + 105;
            f15767d = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            AnonymousClass1 anonymousClass1 = IdCaptureViewModel.this.new AnonymousClass1(continuation);
            int i3 = f15767d + 1;
            f15768e = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass1;
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public static final class ag extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f15889b = 1;

        /* JADX INFO: renamed from: c */
        private static int f15890c = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Throwable f15892d;

        /* JADX INFO: renamed from: e */
        private int f15893e;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ag$4 */
        public static final class AnonymousClass4 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: a */
            public static int f15894a = 0;

            /* JADX INFO: renamed from: b */
            public static int f15895b = 0;

            /* JADX INFO: renamed from: d */
            private static int f15896d = 0;

            /* JADX INFO: renamed from: i */
            private static int f15897i = 1;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Throwable f15898c;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ IdCaptureViewModel f15899e;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f15896d + 79;
                f15897i = i3 % 128;
                int i4 = i3 % 2;
                CaptureUiState captureUiStateB = b(captureUiState);
                int i5 = f15896d + 93;
                f15897i = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                }
                return captureUiStateB;
            }

            private CaptureUiState b(CaptureUiState captureUiState) {
                Object upperCase;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(captureUiState, "");
                if (!(this.f15898c instanceof IdCaptureUploadError.UnacceptableId)) {
                    CaptureUiState.Companion companion = CaptureUiState.f14575e;
                    Throwable th = this.f15898c;
                    return companion.ErrorThereWasAProblem(captureUiState, th instanceof IdCapturePresentableError ? (IdCapturePresentableError) th : IdCapturePresentableError.f14783e.from(this.f15898c), captureUiState.getCaptureFrameSpec());
                }
                CaptureUiState.Companion companion2 = CaptureUiState.f14575e;
                IdCapturePresentableError idCapturePresentableErrorFrom = IdCapturePresentableError.f14783e.from(this.f15898c);
                CaptureUiState.CaptureFrameSpec captureFrameSpec = captureUiState.getCaptureFrameSpec();
                List listAccess$getCountryList$p = IdCaptureViewModel.access$getCountryList$p(this.f15899e);
                Throwable th2 = this.f15898c;
                Iterator it = listAccess$getCountryList$p.iterator();
                int i3 = f15897i + 39;
                f15896d = i3 % 128;
                int i4 = i3 % 2;
                while (true) {
                    upperCase = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i5 = f15896d + 25;
                    f15897i = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.checkNotNullExpressionValue(((com.incode.welcome_sdk.data.local.a) it.next()).c().toUpperCase(Locale.ROOT), "");
                        ((IdCaptureUploadError.UnacceptableId) th2).getCountryCode();
                        throw null;
                    }
                    Object next = it.next();
                    String upperCase2 = ((com.incode.welcome_sdk.data.local.a) next).c().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    String countryCode = ((IdCaptureUploadError.UnacceptableId) th2).getCountryCode();
                    if (countryCode != null) {
                        upperCase = countryCode.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    }
                    if (Intrinsics.areEqual(upperCase2, upperCase)) {
                        upperCase = next;
                        break;
                    }
                }
                CaptureUiState captureUiStateErrorUnacceptableId = companion2.ErrorUnacceptableId(captureUiState, idCapturePresentableErrorFrom, captureFrameSpec, (com.incode.welcome_sdk.data.local.a) upperCase);
                int i6 = f15897i + 73;
                f15896d = i6 % 128;
                int i7 = i6 % 2;
                return captureUiStateErrorUnacceptableId;
            }

            public static int a() {
                int i2 = f15894a;
                int i3 = i2 % 9704723;
                f15894a = i2 + 1;
                if (i3 != 0) {
                    return f15895b;
                }
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                f15895b = iFreeMemory;
                return iFreeMemory;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Throwable th, IdCaptureViewModel idCaptureViewModel) {
                super(1);
                this.f15898c = th;
                this.f15899e = idCaptureViewModel;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IdCaptureViewModel.access$updateUiState(IdCaptureViewModel.this, new AnonymousClass4(this.f15892d, IdCaptureViewModel.this));
            Unit unit = Unit.INSTANCE;
            int i3 = f15890c + 23;
            f15889b = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15890c + 113;
            f15889b = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                e(coroutineScope2, continuation2);
                throw null;
            }
            Object objE = e(coroutineScope2, continuation2);
            int i4 = f15889b + 87;
            f15890c = i4 % 128;
            int i5 = i4 % 2;
            return objE;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15889b + 27;
            f15890c = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((ag) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f15889b + 15;
            f15890c = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ag agVar = IdCaptureViewModel.this.new ag(this.f15892d, continuation);
            int i3 = f15889b + 47;
            f15890c = i3 % 128;
            if (i3 % 2 == 0) {
                return agVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ag(Throwable th, Continuation<? super ag> continuation) {
            super(2, continuation);
            this.f15892d = th;
        }
    }

    private final void c(Throwable th) {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ag(th, null), 3, null);
        int i3 = A + 21;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16088a = 0;

        /* JADX INFO: renamed from: e */
        private static int f16089e = 1;

        /* JADX INFO: renamed from: b */
        private int f16090b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16088a + 65;
            f16089e = i3 % 128;
            if (i3 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f16090b;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<IncodeCameraState> cameraState = IdCaptureViewModel.access$getIncodeCamera$p(IdCaptureViewModel.this).getCameraState();
                this.f16090b = 1;
                obj = FlowKt.first(new Flow<IncodeCameraState>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f16044b = 0;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f16045c = 1;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f16047b = 0;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f16048c = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f16049e;

                        /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                            /*
                                r7 = this;
                                r6 = 2
                                int r0 = r6 % r6
                                boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L6c
                                r5 = r9
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1$2$1 r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                                int r0 = r5.f16053d
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r2
                                if (r0 == 0) goto L6c
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16048c
                                int r1 = r0 + 123
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16047b = r0
                                int r1 = r1 % r6
                                int r0 = r5.f16053d
                                int r0 = r0 - r2
                                r5.f16053d = r0
                            L1f:
                                java.lang.Object r1 = r5.f16054e
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r5.f16053d
                                r4 = 1
                                if (r0 == 0) goto L3b
                                if (r0 != r4) goto L7b
                                kotlin.ResultKt.throwOnFailure(r1)
                            L2f:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16047b
                                int r1 = r0 + 125
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16048c = r0
                                int r1 = r1 % r6
                                return r2
                            L3b:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r2 = r7.f16049e
                                r0 = r5
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r0 = r8
                                com.incode.camera.IncodeCameraState r0 = (com.incode.camera.IncodeCameraState) r0
                                boolean r0 = r0 instanceof com.incode.camera.IncodeCameraState.NotInitialized
                                if (r0 != 0) goto L2f
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16047b
                                int r1 = r0 + 55
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16048c = r0
                                int r1 = r1 % r6
                                r5.f16053d = r4
                                java.lang.Object r0 = r2.emit(r8, r5)
                                if (r0 != r3) goto L2f
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16048c
                                int r1 = r0 + 89
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16047b = r0
                                int r1 = r1 % r6
                                int r1 = r0 + 55
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16048c = r0
                                int r1 = r1 % r6
                                return r3
                            L6c:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1$2$1 r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1$2$1
                                r5.<init>(r9)
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16048c
                                int r1 = r0 + 123
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16047b = r0
                                int r1 = r1 % r6
                                goto L1f
                            L7b:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleStreamingAndRecordingAndProceed$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private static int f16050b = 1;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f16051c = 0;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            int f16053d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            /* synthetic */ Object f16054e;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f16051c + 11;
                                f16050b = i3 % 128;
                                int i4 = i3 % 2;
                                this.f16054e = obj;
                                this.f16053d |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i4 != 0) {
                                    return anonymousClass2.emit(null, this);
                                }
                                int i5 = 62 / 0;
                                return anonymousClass2.emit(null, this);
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f16049e = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super IncodeCameraState> flowCollector, Continuation continuation) {
                        int i5 = 2 % 2;
                        Object objCollect = cameraState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = f16045c + 59;
                        f16044b = i6 % 128;
                        int i7 = i6 % 2;
                        return unit;
                    }
                }, this);
                if (obj == coroutine_suspended) {
                    int i5 = f16089e + 107;
                    f16088a = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 0 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            IncodeCameraState incodeCameraState = (IncodeCameraState) obj;
            if (incodeCameraState instanceof IncodeCameraState.Initialized) {
                this.f16090b = 2;
                if (IdCaptureViewModel.access$setupRecordingAndStreaming(IdCaptureViewModel.this, (IncodeCameraState.Initialized) incodeCameraState, this) == coroutine_suspended) {
                    int i7 = f16089e + 79;
                    f16088a = i7 % 128;
                    int i8 = i7 % 2;
                    return coroutine_suspended;
                }
            } else if (incodeCameraState instanceof IncodeCameraState.Error) {
                IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).reportTerminalError(((IncodeCameraState.Error) incodeCameraState).getException());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16089e + 13;
            f16088a = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            if (i4 != 0) {
                int i5 = 34 / 0;
            }
            int i6 = f16089e + 93;
            f16088a = i6 % 128;
            if (i6 % 2 == 0) {
                return objC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16088a + 47;
            f16089e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f16088a + 31;
            f16089e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            n nVar = IdCaptureViewModel.this.new n(continuation);
            int i3 = f16088a + 1;
            f16089e = i3 % 128;
            int i4 = i3 % 2;
            return nVar;
        }

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }
    }

    private final void b() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f15748h, null, new n(null), 2, null);
        int i3 = A + 55;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class aa extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f15786b = 0;

        /* JADX INFO: renamed from: c */
        private static int f15787c = 1;

        /* JADX INFO: renamed from: a */
        private int f15788a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ IncodeCameraState.Initialized f15790e;

        /* JADX WARN: Removed duplicated region for block: B:84:0x00e2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x017d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.aa.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class c extends SuspendLambda implements Function2<o.c, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a */
            private static int f15803a = 0;

            /* JADX INFO: renamed from: e */
            private static int f15804e = 1;

            /* JADX INFO: renamed from: b */
            private int f15805b;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Object f15806d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z2;
                int i2 = 2 % 2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (((o.c) this.f15806d) != o.c.f5325a) {
                    z2 = true;
                } else {
                    int i3 = f15803a + 59;
                    f15804e = i3 % 128;
                    int i4 = i3 % 2;
                    z2 = false;
                }
                Boolean boolBoxBoolean = Boxing.boxBoolean(z2);
                int i5 = f15804e + 71;
                f15803a = i5 % 128;
                if (i5 % 2 == 0) {
                    return boolBoxBoolean;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(o.c cVar, Continuation<? super Boolean> continuation) {
                int i2 = 2 % 2;
                int i3 = f15804e + 85;
                f15803a = i3 % 128;
                o.c cVar2 = cVar;
                Continuation<? super Boolean> continuation2 = continuation;
                if (i3 % 2 != 0) {
                    a(cVar2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objA = a(cVar2, continuation2);
                int i4 = f15804e + 107;
                f15803a = i4 % 128;
                int i5 = i4 % 2;
                return objA;
            }

            private Object a(o.c cVar, Continuation<? super Boolean> continuation) {
                int i2 = 2 % 2;
                int i3 = f15804e + 81;
                f15803a = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((c) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i4 != 0) {
                    int i5 = 18 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                c cVar = new c(continuation);
                cVar.f15806d = obj;
                c cVar2 = cVar;
                int i3 = f15804e + 5;
                f15803a = i3 % 128;
                int i4 = i3 % 2;
                return cVar2;
            }

            c(Continuation<? super c> continuation) {
                super(2, continuation);
            }
        }

        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super j.a>, Object> {

            /* JADX INFO: renamed from: b */
            private static int f15799b = 0;

            /* JADX INFO: renamed from: c */
            private static int f15800c = 1;

            /* JADX INFO: renamed from: a */
            private int f15801a;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ IdCaptureViewModel f15802d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f15801a;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f15801a = 1;
                    obj = FlowKt.first(IdCaptureViewModel.access$getOpenTokBinder$p(this.f15802d).e(), this);
                    if (obj == coroutine_suspended) {
                        int i4 = f15800c + 65;
                        int i5 = i4 % 128;
                        f15799b = i5;
                        int i6 = i4 % 2;
                        int i7 = i5 + 103;
                        f15800c = i7 % 128;
                        if (i7 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super j.a> continuation) {
                int i2 = 2 % 2;
                int i3 = f15800c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f15799b = i3 % 128;
                int i4 = i3 % 2;
                Object objD = d(coroutineScope, continuation);
                int i5 = f15800c + 67;
                f15799b = i5 % 128;
                int i6 = i5 % 2;
                return objD;
            }

            private Object d(CoroutineScope coroutineScope, Continuation<? super j.a> continuation) {
                int i2 = 2 % 2;
                int i3 = f15799b + 89;
                f15800c = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i4 == 0) {
                    int i5 = 46 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                a aVar = new a(this.f15802d, continuation);
                int i3 = f15799b + 89;
                f15800c = i3 % 128;
                if (i3 % 2 != 0) {
                    return aVar;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(IdCaptureViewModel idCaptureViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f15802d = idCaptureViewModel;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$aa$1 */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ImageProxy, Unit> {

            /* JADX INFO: renamed from: b */
            private static int f15791b = 0;

            /* JADX INFO: renamed from: d */
            private static int f15792d = 1;

            private void d(ImageProxy imageProxy) {
                int i2 = 2 % 2;
                int i3 = f15791b + 47;
                f15792d = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(imageProxy, "");
                    ((CameraXVideoCapturer) this.receiver).onCameraFrame(imageProxy);
                } else {
                    Intrinsics.checkNotNullParameter(imageProxy, "");
                    ((CameraXVideoCapturer) this.receiver).onCameraFrame(imageProxy);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ImageProxy imageProxy) {
                int i2 = 2 % 2;
                int i3 = f15791b + 71;
                f15792d = i3 % 128;
                int i4 = i3 % 2;
                d(imageProxy);
                Unit unit = Unit.INSTANCE;
                int i5 = f15792d + 17;
                f15791b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            AnonymousClass1(Object obj) {
                super(1, obj, CameraXVideoCapturer.class, "onCameraFrame", "onCameraFrame(Landroidx/camera/core/ImageProxy;)V", 0);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$aa$2 */
        static final class AnonymousClass2 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: b */
            private static int f15793b = 0;

            /* JADX INFO: renamed from: e */
            private static int f15794e = 1;

            private CaptureUiState d(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f15794e + 7;
                f15793b = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(captureUiState, "");
                CaptureUiState captureUiStatePreInit = CaptureUiState.f14575e.PreInit(captureUiState, CaptureUiState.CaptureFrameSpec.Companion.from$default(CaptureUiState.CaptureFrameSpec.f14613b, IdCaptureViewModel.access$getDocumentType$p(idCaptureViewModel), captureUiState.getCaptureFrameSpec().getVertical(), false, null, 12, null));
                int i5 = f15793b + 35;
                f15794e = i5 % 128;
                int i6 = i5 % 2;
                return captureUiStatePreInit;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f15793b + 75;
                f15794e = i3 % 128;
                int i4 = i3 % 2;
                CaptureUiState captureUiStateD = d(captureUiState);
                if (i4 == 0) {
                    int i5 = 2 / 0;
                }
                return captureUiStateD;
            }

            AnonymousClass2() {
                super(1);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$aa$4 */
        static final class AnonymousClass4 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: a */
            private static int f15796a = 0;

            /* JADX INFO: renamed from: d */
            private static int f15797d = 1;

            private CaptureUiState c(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f15797d + 77;
                f15796a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(captureUiState, "");
                CaptureUiState captureUiStateInit = CaptureUiState.f14575e.Init(captureUiState, CaptureUiState.CaptureFrameSpec.Companion.from$default(CaptureUiState.CaptureFrameSpec.f14613b, IdCaptureViewModel.access$getDocumentType$p(idCaptureViewModel), captureUiState.getCaptureFrameSpec().getVertical(), false, null, 12, null), IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel));
                int i5 = f15796a + 95;
                f15797d = i5 % 128;
                if (i5 % 2 != 0) {
                    return captureUiStateInit;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f15796a + 1;
                f15797d = i3 % 128;
                CaptureUiState captureUiState2 = captureUiState;
                if (i3 % 2 != 0) {
                    return c(captureUiState2);
                }
                c(captureUiState2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass4() {
                super(1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15787c + 81;
            f15786b = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            int i5 = f15786b + 75;
            f15787c = i5 % 128;
            if (i5 % 2 != 0) {
                return objC;
            }
            throw null;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15787c + 81;
            f15786b = i3 % 128;
            int i4 = i3 % 2;
            aa aaVar = (aa) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                aaVar.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = aaVar.invokeSuspend(unit);
            int i5 = f15786b + 81;
            f15787c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            aa aaVar = IdCaptureViewModel.this.new aa(this.f15790e, continuation);
            int i3 = f15786b + 7;
            f15787c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 86 / 0;
            }
            return aaVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aa(IncodeCameraState.Initialized initialized, Continuation<? super aa> continuation) {
            super(2, continuation);
            this.f15790e = initialized;
        }
    }

    private final Object d(IncodeCameraState.Initialized initialized, Continuation<? super Unit> continuation) {
        int i2 = 2 % 2;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new aa(initialized, null), continuation);
        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            Unit unit = Unit.INSTANCE;
            int i3 = C + 33;
            A = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int i5 = C + 71;
        A = i5 % 128;
        int i6 = i5 % 2;
        return objWithContext;
    }

    static final class an extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f15948b = 1;

        /* JADX INFO: renamed from: c */
        private static int f15949c = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15949c + 75;
            f15948b = i3 % 128;
            int i4 = i3 % 2;
            e();
            if (i4 == 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f15949c + 69;
            f15948b = i5 % 128;
            int i6 = i5 % 2;
            return unit2;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f15949c + 29;
            f15948b = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureViewModel.access$switchToManualCapture(IdCaptureViewModel.this);
            int i5 = f15948b + 115;
            f15949c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
        }

        an() {
            super(0);
        }
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
        int i2 = 2 % 2;
        idCaptureViewModel.f15752l.startAutoCaptureExpirationTimer(idCaptureViewModel.c(), ViewModelKt.getViewModelScope(idCaptureViewModel), idCaptureViewModel.new an());
        int i3 = A + 87;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return null;
    }

    private final boolean a() {
        int i2 = 2 % 2;
        int i3 = A + 69;
        C = i3 % 128;
        int i4 = i3 % 2;
        if (((!this.f15743c.d()) && !this.f15753m.c()) || !this.f15741a.isStreamAudioEnabled()) {
            return false;
        }
        int i5 = C + 23;
        A = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    static final class ad extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f15868b = 0;

        /* JADX INFO: renamed from: c */
        private static int f15869c = 1;

        /* JADX INFO: renamed from: a */
        private int f15870a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Object f15872e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15869c + 31;
            f15868b = i3 % 128;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f15870a;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f15872e;
                final Flow flowAccess$documentAnalyzerEvents = IdCaptureViewModel.access$documentAnalyzerEvents(IdCaptureViewModel.this);
                final Flow<DocumentAnalysisEvent> flow = new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f16190a = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f16191e = 1;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f16193c = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f16194e = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f16195d;

                        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                            /*
                                r6 = this;
                                r5 = 2
                                int r0 = r5 % r5
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16194e
                                int r1 = r0 + 87
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16193c = r0
                                int r1 = r1 % r5
                                boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L5f
                                r4 = r8
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r4
                                int r0 = r4.f16198b
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L5f
                                int r0 = r4.f16198b
                                int r0 = r0 - r1
                                r4.f16198b = r0
                            L1f:
                                java.lang.Object r1 = r4.f16199d
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r4.f16198b
                                r2 = 1
                                if (r0 == 0) goto L3d
                                if (r0 != r2) goto L67
                                kotlin.ResultKt.throwOnFailure(r1)
                            L2f:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16194e
                                int r1 = r0 + 123
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16193c = r0
                                int r1 = r1 % r5
                                if (r1 == 0) goto L65
                                return r2
                            L3d:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r1 = r6.f16195d
                                r0 = r4
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r0 = r7
                                com.incode.camera.analysis.document.DocumentAnalysisEvent r0 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r0
                                boolean r0 = r0 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.BoundsDetected
                                if (r0 != 0) goto L4d
                                goto L2f
                            L4d:
                                r4.f16198b = r2
                                java.lang.Object r0 = r1.emit(r7, r4)
                                if (r0 != r3) goto L2f
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16194e
                                int r1 = r0 + 21
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16193c = r0
                                int r1 = r1 % r5
                                return r3
                            L5f:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1$2$1 r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1$2$1
                                r4.<init>(r8)
                                goto L1f
                            L65:
                                r0 = 0
                                throw r0
                            L67:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private static int f16196a = 1;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f16197c = 0;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f16198b;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            /* synthetic */ Object f16199d;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f16197c + 17;
                                f16196a = i3 % 128;
                                int i4 = i3 % 2;
                                this.f16199d = obj;
                                this.f16198b |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i5 = f16196a + 89;
                                f16197c = i5 % 128;
                                int i6 = i5 % 2;
                                return objEmit;
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f16195d = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                        int i5 = 2 % 2;
                        Object objCollect = flowAccess$documentAnalyzerEvents.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            Unit unit = Unit.INSTANCE;
                            int i6 = f16191e + 81;
                            f16190a = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 31 / 0;
                            }
                            return unit;
                        }
                        int i8 = f16190a + 47;
                        f16191e = i8 % 128;
                        int i9 = i8 % 2;
                        return objCollect;
                    }
                };
                this.f15870a = 1;
                if (new Flow<DocumentAnalysisEvent.BoundsDetected>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f16201b = 1;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f16202d = 0;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private static int f16204a = 0;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f16205b = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f16206e;

                        /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r3 = 2
                                int r0 = r3 % r3
                                int r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16204a
                                int r1 = r2 + 43
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16205b = r0
                                int r1 = r1 % r3
                                boolean r0 = r7 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L55
                                int r1 = r2 + 57
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16205b = r0
                                int r1 = r1 % r3
                                if (r1 == 0) goto L63
                                r4 = r7
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                int r0 = r4.f16210b
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L55
                                int r0 = r4.f16210b
                                int r0 = r0 - r1
                                r4.f16210b = r0
                            L28:
                                java.lang.Object r1 = r4.f16211d
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r4.f16210b
                                r2 = 1
                                if (r0 == 0) goto L3b
                                if (r0 != r2) goto L5b
                                kotlin.ResultKt.throwOnFailure(r1)
                            L38:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            L3b:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r1 = r5.f16206e
                                r0 = r4
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.incode.camera.analysis.document.DocumentAnalysisEvent r6 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r6
                                java.lang.String r0 = ""
                                kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
                                com.incode.camera.analysis.document.DocumentAnalysisEvent$BoundsDetected r6 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.BoundsDetected) r6
                                r4.f16210b = r2
                                java.lang.Object r0 = r1.emit(r6, r4)
                                if (r0 != r3) goto L38
                                return r3
                            L55:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1$2$1 r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1$2$1
                                r4.<init>(r7)
                                goto L28
                            L5b:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            L63:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1$2$1 r7 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                                int r0 = r7.f16210b
                                r0 = 0
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$sendAnalyticsEventForFirstClassification$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f16207c = 0;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f16208e = 1;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f16210b;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            /* synthetic */ Object f16211d;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f16207c + 99;
                                f16208e = i3 % 128;
                                int i4 = i3 % 2;
                                this.f16211d = obj;
                                this.f16210b |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i5 = f16208e + 73;
                                f16207c = i5 % 128;
                                int i6 = i5 % 2;
                                return objEmit;
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f16206e = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super DocumentAnalysisEvent.BoundsDetected> flowCollector, Continuation continuation) {
                        int i5 = 2 % 2;
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = f16201b + 5;
                        f16202d = i6 % 128;
                        if (i6 % 2 == 0) {
                            return unit;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ad.5

                    /* JADX INFO: renamed from: a */
                    private static int f15873a = 1;

                    /* JADX INFO: renamed from: c */
                    private static int f15874c = 0;

                    /* JADX INFO: renamed from: e */
                    private /* synthetic */ CoroutineScope f15876e;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = f15873a + 27;
                        f15874c = i6 % 128;
                        int i7 = i6 % 2;
                        Object objE = e((DocumentAnalysisEvent.BoundsDetected) obj3);
                        int i8 = f15873a + 53;
                        f15874c = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objE;
                        }
                        throw null;
                    }

                    private Object e(DocumentAnalysisEvent.BoundsDetected boundsDetected) {
                        int i5 = 2 % 2;
                        int i6 = f15874c + 57;
                        f15873a = i6 % 128;
                        int i7 = i6 % 2;
                        IdCaptureViewModel.access$getAnalytics$p(idCaptureViewModel).sendCaptureFrameDetected(boundsDetected);
                        Object obj3 = null;
                        JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                        Unit unit = Unit.INSTANCE;
                        int i8 = f15874c + 63;
                        f15873a = i8 % 128;
                        if (i8 % 2 != 0) {
                            return unit;
                        }
                        obj3.hashCode();
                        throw null;
                    }

                    AnonymousClass5(CoroutineScope coroutineScope2) {
                        coroutineScope = coroutineScope2;
                    }
                }, this) == coroutine_suspended) {
                    int i5 = f15868b + 23;
                    f15869c = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ad$5 */
        static final class AnonymousClass5<T> implements FlowCollector {

            /* JADX INFO: renamed from: a */
            private static int f15873a = 1;

            /* JADX INFO: renamed from: c */
            private static int f15874c = 0;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ CoroutineScope f15876e;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                int i5 = 2 % 2;
                int i6 = f15873a + 27;
                f15874c = i6 % 128;
                int i7 = i6 % 2;
                Object objE = e((DocumentAnalysisEvent.BoundsDetected) obj3);
                int i8 = f15873a + 53;
                f15874c = i8 % 128;
                if (i8 % 2 == 0) {
                    return objE;
                }
                throw null;
            }

            private Object e(DocumentAnalysisEvent.BoundsDetected boundsDetected) {
                int i5 = 2 % 2;
                int i6 = f15874c + 57;
                f15873a = i6 % 128;
                int i7 = i6 % 2;
                IdCaptureViewModel.access$getAnalytics$p(idCaptureViewModel).sendCaptureFrameDetected(boundsDetected);
                Object obj3 = null;
                JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i8 = f15874c + 63;
                f15873a = i8 % 128;
                if (i8 % 2 != 0) {
                    return unit;
                }
                obj3.hashCode();
                throw null;
            }

            AnonymousClass5(CoroutineScope coroutineScope2) {
                coroutineScope = coroutineScope2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15869c + 81;
            f15868b = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            if (i4 != 0) {
                int i5 = 50 / 0;
            }
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15869c + 121;
            f15868b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((ad) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f15869c + 111;
            f15868b = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ad adVar = IdCaptureViewModel.this.new ad(continuation);
            adVar.f15872e = obj;
            ad adVar2 = adVar;
            int i3 = f15869c + 79;
            f15868b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 67 / 0;
            }
            return adVar2;
        }

        ad(Continuation<? super ad> continuation) {
            super(2, continuation);
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        Job job = this.B;
        if (job != null) {
            int i3 = A + 5;
            C = i3 % 128;
            int i4 = i3 % 2;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        } else {
            int i5 = A + 85;
            C = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 2;
            }
        }
        this.B = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f15748h, null, new ad(null), 2, null);
    }

    private final Flow<DocumentAnalysisEvent> c() {
        int i2 = 2 % 2;
        final Flow flowDrop = FlowKt.drop(this.f15745e.getAnalysisEvents(), 1);
        Flow<DocumentAnalysisEvent> flow = new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f15977a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f15978d = 0;

            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f15981a = 1;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f15982b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ FlowCollector f15983c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ IdCaptureViewModel f15984e;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        r3 = 2
                        int r0 = r3 % r3
                        boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L9a
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15981a
                        int r1 = r0 + 51
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15982b = r0
                        int r1 = r1 % r3
                        r5 = r8
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1$2$1 r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                        int r0 = r5.f15990d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r2
                        if (r0 == 0) goto L9a
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15982b
                        int r1 = r0 + 13
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15981a = r0
                        int r1 = r1 % r3
                        if (r1 != 0) goto L94
                        int r0 = r5.f15990d
                        int r0 = r0 * r2
                        r5.f15990d = r0
                    L2a:
                        java.lang.Object r0 = r5.f15987a
                        java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r5.f15990d
                        r2 = 1
                        if (r1 == 0) goto L4e
                        if (r1 == r2) goto L69
                        if (r1 != r3) goto La0
                        kotlin.ResultKt.throwOnFailure(r0)
                    L3c:
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15982b
                        int r1 = r0 + 71
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15981a = r0
                        int r1 = r1 % r3
                        if (r1 != 0) goto L4d
                        r0 = 56
                        int r0 = r0 / 0
                    L4d:
                        return r2
                    L4e:
                        kotlin.ResultKt.throwOnFailure(r0)
                        kotlinx.coroutines.flow.FlowCollector r1 = r6.f15983c
                        r0 = r5
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        r0 = r7
                        com.incode.camera.analysis.document.DocumentAnalysisEvent r0 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r0
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r6.f15984e
                        r5.f15988b = r7
                        r5.f15989c = r1
                        r5.f15990d = r2
                        java.lang.Object r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$shouldProcessAnalyzerEvents(r0, r5)
                        if (r0 != r4) goto L68
                        return r4
                    L68:
                        goto L72
                    L69:
                        java.lang.Object r1 = r5.f15989c
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        java.lang.Object r7 = r5.f15988b
                        kotlin.ResultKt.throwOnFailure(r0)
                    L72:
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        r0 = r0 ^ r2
                        if (r0 == r2) goto L3c
                        r2 = 0
                        r5.f15988b = r2
                        r5.f15989c = r2
                        r5.f15990d = r3
                        java.lang.Object r0 = r1.emit(r7, r5)
                        if (r0 != r4) goto L3c
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15982b
                        int r1 = r0 + 59
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.f15981a = r0
                        int r1 = r1 % r3
                        if (r1 == 0) goto La8
                        return r4
                    L94:
                        int r0 = r5.f15990d
                        int r0 = r0 - r2
                        r5.f15990d = r0
                        goto L2a
                    L9a:
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1$2$1 r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1$2$1
                        r5.<init>(r8)
                        goto L2a
                    La0:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    La8:
                        r2.hashCode()
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$documentAnalyzerEvents$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static int f15985f = 1;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static int f15986g = 0;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f15987a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f15988b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f15989c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    int f15990d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = f15986g + 105;
                        f15985f = i3 % 128;
                        int i4 = i3 % 2;
                        this.f15987a = obj;
                        this.f15990d |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i4 != 0) {
                            return anonymousClass2.emit(null, this);
                        }
                        int i5 = 52 / 0;
                        return anonymousClass2.emit(null, this);
                    }

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, IdCaptureViewModel idCaptureViewModel) {
                    this.f15983c = flowCollector;
                    this.f15984e = idCaptureViewModel;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                int i3 = 2 % 2;
                Object objCollect = flowDrop.collect(new AnonymousClass2(flowCollector, this), continuation);
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i4 = f15977a + 19;
                f15978d = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        };
        int i3 = C + 89;
        A = i3 % 128;
        int i4 = i3 % 2;
        return flow;
    }

    static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16234a = 0;

        /* JADX INFO: renamed from: b */
        private static int f16235b = 1;

        /* JADX INFO: renamed from: c */
        private int f16236c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16235b + 49;
            f16234a = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f16236c;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowAccess$documentAnalyzerEvents = IdCaptureViewModel.access$documentAnalyzerEvents(IdCaptureViewModel.this);
                this.f16236c = 1;
                if (FlowKt.conflate(new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f16108b = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f16109d = 1;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f16111b = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f16112d = 1;

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f16113a;

                        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                            /*
                                r7 = this;
                                r6 = 2
                                int r0 = r6 % r6
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16111b
                                int r1 = r0 + 71
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16112d = r0
                                int r1 = r1 % r6
                                boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L62
                                r5 = r9
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1$2$1 r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                                int r0 = r5.f16117b
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L62
                                int r0 = r5.f16117b
                                int r0 = r0 - r1
                                r5.f16117b = r0
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16112d
                                int r1 = r0 + 47
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16111b = r0
                                int r1 = r1 % r6
                            L28:
                                java.lang.Object r1 = r5.f16116a
                                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r5.f16117b
                                r3 = 1
                                if (r0 == 0) goto L46
                                if (r0 != r3) goto L6d
                                kotlin.ResultKt.throwOnFailure(r1)
                            L38:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16111b
                                int r1 = r0 + 11
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16112d = r0
                                int r1 = r1 % r6
                                if (r1 == 0) goto L68
                                return r2
                            L46:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r2 = r7.f16113a
                                r0 = r5
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r1 = r8
                                com.incode.camera.analysis.document.DocumentAnalysisEvent r1 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r1
                                boolean r0 = r1 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated
                                if (r0 != 0) goto L59
                                boolean r0 = r1 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation
                                if (r0 == 0) goto L38
                            L59:
                                r5.f16117b = r3
                                java.lang.Object r0 = r2.emit(r8, r5)
                                if (r0 != r4) goto L38
                                return r4
                            L62:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1$2$1 r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1$2$1
                                r5.<init>(r9)
                                goto L28
                            L68:
                                r0 = 0
                                r0.hashCode()
                                throw r0
                            L6d:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerCaptures$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            private static int f16114d = 1;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f16115e = 0;

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            /* synthetic */ Object f16116a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f16117b;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f16114d + 89;
                                f16115e = i3 % 128;
                                int i4 = i3 % 2;
                                this.f16116a = obj;
                                this.f16117b |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i4 == 0) {
                                    return anonymousClass2.emit(null, this);
                                }
                                int i5 = 31 / 0;
                                return anonymousClass2.emit(null, this);
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f16113a = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                        int i6 = 2 % 2;
                        Object objCollect = flowAccess$documentAnalyzerEvents.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i7 = f16109d + 83;
                        f16108b = i7 % 128;
                        int i8 = i7 % 2;
                        return objCollect;
                    }
                }).collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.4

                    /* JADX INFO: renamed from: b */
                    private static int f16238b = 1;

                    /* JADX INFO: renamed from: e */
                    private static int f16239e = 0;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = f16238b + 115;
                        f16239e = i7 % 128;
                        int i8 = i7 % 2;
                        Object objB = b((DocumentAnalysisEvent) obj2, continuation);
                        int i9 = f16238b + 33;
                        f16239e = i9 % 128;
                        if (i9 % 2 == 0) {
                            return objB;
                        }
                        throw null;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:43:0x0045, code lost:
                    
                        if (r2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L44;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x0047, code lost:
                    
                        return r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x0054, code lost:
                    
                        if (r2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L44;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
                    
                        r2 = kotlin.Unit.INSTANCE;
                        r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e + 39;
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16238b = r1 % 128;
                        r1 = r1 % 2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x0062, code lost:
                    
                        return r2;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private java.lang.Object b(com.incode.camera.analysis.document.DocumentAnalysisEvent r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                        /*
                            r4 = this;
                            r3 = 2
                            int r0 = r3 % r3
                            int r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16238b
                            int r1 = r2 + 57
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e = r0
                            int r1 = r1 % r3
                            if (r1 != 0) goto L66
                            boolean r0 = r5 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation
                            if (r0 == 0) goto L28
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                            com.incode.camera.analysis.document.DocumentAnalysisEvent$Orientation r5 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation) r5
                            boolean r0 = r5.isVertical()
                            java.lang.Object r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.a(r1, r0, r6)
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            if (r1 != r0) goto L25
                            return r1
                        L25:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L28:
                            boolean r0 = r5 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated
                            if (r0 == 0) goto L63
                            int r1 = r2 + 121
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e = r0
                            int r1 = r1 % r3
                            if (r1 == 0) goto L48
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r5 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r5
                            java.lang.Object r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$handleAutoCaptureObtained(r0, r5, r6)
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r0 = 36
                            int r0 = r0 / 0
                            if (r2 != r1) goto L57
                        L47:
                            return r2
                        L48:
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r5 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r5
                            java.lang.Object r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$handleAutoCaptureObtained(r0, r5, r6)
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            if (r2 != r0) goto L57
                            goto L47
                        L57:
                            kotlin.Unit r2 = kotlin.Unit.INSTANCE
                            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e
                            int r1 = r0 + 39
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16238b = r0
                            int r1 = r1 % r3
                            return r2
                        L63:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L66:
                            boolean r0 = r5 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation
                            r0 = 0
                            r0.hashCode()
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.b(com.incode.camera.analysis.document.DocumentAnalysisEvent, kotlin.coroutines.Continuation):java.lang.Object");
                    }

                    AnonymousClass4() {
                    }
                }, this) == coroutine_suspended) {
                    int i6 = f16234a + 57;
                    f16235b = i6 % 128;
                    int i7 = i6 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$v$4 */
        static final class AnonymousClass4<T> implements FlowCollector {

            /* JADX INFO: renamed from: b */
            private static int f16238b = 1;

            /* JADX INFO: renamed from: e */
            private static int f16239e = 0;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                int i6 = 2 % 2;
                int i7 = f16238b + 115;
                f16239e = i7 % 128;
                int i8 = i7 % 2;
                Object objB = b((DocumentAnalysisEvent) obj2, continuation);
                int i9 = f16238b + 33;
                f16239e = i9 % 128;
                if (i9 % 2 == 0) {
                    return objB;
                }
                throw null;
            }

            private Object b(DocumentAnalysisEvent v2, Continuation<? super Unit> v3) {
                /*
                    this = this;
                    r3 = 2
                    int r0 = r3 % r3
                    int r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16238b
                    int r1 = r2 + 57
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e = r0
                    int r1 = r1 % r3
                    if (r1 != 0) goto L66
                    boolean r0 = r5 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation
                    if (r0 == 0) goto L28
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                    com.incode.camera.analysis.document.DocumentAnalysisEvent$Orientation r5 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation) r5
                    boolean r0 = r5.isVertical()
                    java.lang.Object r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.a(r1, r0, r6)
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    if (r1 != r0) goto L25
                    return r1
                L25:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L28:
                    boolean r0 = r5 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated
                    if (r0 == 0) goto L63
                    int r1 = r2 + 121
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e = r0
                    int r1 = r1 % r3
                    if (r1 == 0) goto L48
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                    com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r5 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r5
                    java.lang.Object r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$handleAutoCaptureObtained(r0, r5, r6)
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = 36
                    int r0 = r0 / 0
                    if (r2 != r1) goto L57
                L47:
                    return r2
                L48:
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                    com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r5 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r5
                    java.lang.Object r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$handleAutoCaptureObtained(r0, r5, r6)
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    if (r2 != r0) goto L57
                    goto L47
                L57:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16239e
                    int r1 = r0 + 39
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.f16238b = r0
                    int r1 = r1 % r3
                    return r2
                L63:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L66:
                    boolean r0 = r5 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Orientation
                    r0 = 0
                    r0.hashCode()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.v.AnonymousClass4.b(com.incode.camera.analysis.document.DocumentAnalysisEvent, kotlin.coroutines.Continuation):java.lang.Object");
            }

            AnonymousClass4() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16234a + 57;
            f16235b = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            int i5 = f16234a + 51;
            f16235b = i5 % 128;
            int i6 = i5 % 2;
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16234a + 39;
            f16235b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 61 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            v vVar = IdCaptureViewModel.this.new v(continuation);
            int i3 = f16235b + 17;
            f16234a = i3 % 128;
            int i4 = i3 % 2;
            return vVar;
        }

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }
    }

    private final void h() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f15748h, null, new v(null), 2, null);
        int i3 = C + 73;
        A = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
    }

    static /* synthetic */ Object a(IdCaptureViewModel idCaptureViewModel, boolean z2, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = A + 53;
        C = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {idCaptureViewModel, Boolean.valueOf(z2), true, continuation};
        Object objB = b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), objArr, CameraXActivity.c.c(), 364777428, -364777428);
        int i5 = A + 123;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            return objB;
        }
        throw null;
    }

    static final class aj extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: b */
        private static int f15916b = 1;

        /* JADX INFO: renamed from: c */
        private static int f15917c = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ boolean f15918a;

        private CaptureUiState a(CaptureUiState captureUiState) {
            CaptureUiState.Companion companion;
            CaptureUiState.CaptureFrameSpec.Companion companion2;
            DocumentType documentTypeAccess$getDocumentType$p;
            boolean z2;
            int i2;
            int i3 = 2 % 2;
            int i4 = f15916b + 49;
            f15917c = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                companion = CaptureUiState.f14575e;
                companion2 = CaptureUiState.CaptureFrameSpec.f14613b;
                documentTypeAccess$getDocumentType$p = IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this);
                z2 = this.f15918a;
                i2 = 115;
            } else {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                companion = CaptureUiState.f14575e;
                companion2 = CaptureUiState.CaptureFrameSpec.f14613b;
                documentTypeAccess$getDocumentType$p = IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this);
                z2 = this.f15918a;
                i2 = 12;
            }
            return companion.Init(captureUiState, CaptureUiState.CaptureFrameSpec.Companion.from$default(companion2, documentTypeAccess$getDocumentType$p, z2, false, null, i2, null), IdCaptureViewModel.access$isCloseButtonAllowed$p(IdCaptureViewModel.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15916b + 99;
            f15917c = i3 % 128;
            CaptureUiState captureUiState2 = captureUiState;
            if (i3 % 2 == 0) {
                return a(captureUiState2);
            }
            a(captureUiState2);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aj(boolean z2) {
            super(1);
            this.f15918a = z2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r10) {
        /*
            r3 = 0
            r7 = r10[r3]
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r7 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel) r7
            r6 = 1
            r0 = r10[r6]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            r9 = 2
            r0 = r10[r9]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            r0 = 3
            r4 = r10[r0]
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            int r0 = r9 % r9
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r9
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Orientation event "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.d(r1, r0)
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.ui.id_capture.CaptureUiState> r0 = r7.f15763w
            java.lang.Object r0 = r0.getValue()
            com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = (com.incode.welcome_sdk.ui.id_capture.CaptureUiState) r0
            com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r0 = r0.getCaptureFrameSpec()
            boolean r0 = r0.getVertical()
            if (r0 == r5) goto L9c
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Switching orientation "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.d(r1, r0)
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$aj r0 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$aj
            r0.<init>(r5)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r7.c(r0)
            r0 = r8 ^ 1
            if (r0 == r6) goto L9c
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r2 = r0 + 95
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r2 = r2 % r9
            r0 = 1500(0x5dc, double:7.41E-321)
            if (r2 != 0) goto L8e
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r0, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = 69
            int r0 = r0 / r3
            if (r2 != r1) goto L99
        L8d:
            return r2
        L8e:
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r0, r4)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L99
            goto L8d
        L99:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.d(java.lang.Object[]):java.lang.Object");
    }

    private final boolean e(DocumentAnalysisEvent.IdTypeExtracted idTypeExtracted) {
        boolean zA;
        int i2 = 2 % 2;
        int i3 = C + 87;
        A = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.Forest.d("IdTypeExtracted event - idType:" + idTypeExtracted.getIdType() + ", side: " + idTypeExtracted.getSide(), new Object[0]);
            boolean zBooleanValue = ((Boolean) b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), new Object[]{this, IdCaptureMapperKt.getDocumentType(idTypeExtracted)}, CameraXActivity.c.c(), -1457926703, 1457926706)).booleanValue();
            zA = a(IdCaptureMapperKt.getDocumentType(idTypeExtracted));
            if ((!zBooleanValue ? 'B' : (char) 28) == 28) {
                return true;
            }
        } else {
            Timber.Forest.d("IdTypeExtracted event - idType:" + idTypeExtracted.getIdType() + ", side: " + idTypeExtracted.getSide(), new Object[0]);
            boolean zBooleanValue2 = ((Boolean) b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), new Object[]{this, IdCaptureMapperKt.getDocumentType(idTypeExtracted)}, CameraXActivity.c.c(), -1457926703, 1457926706)).booleanValue();
            zA = a(IdCaptureMapperKt.getDocumentType(idTypeExtracted));
            if (zBooleanValue2) {
                return true;
            }
        }
        if ((zA ? (char) 6 : 'I') != 'I') {
            return true;
        }
        int i4 = A + 117;
        C = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    static final class ap extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: a */
        private static int f15954a = 0;

        /* JADX INFO: renamed from: b */
        private static int f15955b = 1;

        private CaptureUiState e(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15955b + 83;
            f15954a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this);
                DocumentType documentType = DocumentType.FRONT_ID;
                throw null;
            }
            Intrinsics.checkNotNullParameter(captureUiState, "");
            if (IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this) == DocumentType.FRONT_ID) {
                return CaptureUiState.f14575e.ErrorWrongIdSideFront(captureUiState);
            }
            CaptureUiState captureUiStateErrorWrongIdSideBack = CaptureUiState.f14575e.ErrorWrongIdSideBack(captureUiState);
            int i4 = f15954a + 123;
            f15955b = i4 % 128;
            if (i4 % 2 != 0) {
                return captureUiStateErrorWrongIdSideBack;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15955b + 97;
            f15954a = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateE = e(captureUiState);
            int i5 = f15954a + 37;
            f15955b = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateE;
        }

        ap() {
            super(1);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
        int i2 = 2 % 2;
        if (idCaptureViewModel.e((DocumentType) objArr[1])) {
            idCaptureViewModel.f15764x++;
        } else {
            idCaptureViewModel.f15764x = 0;
        }
        if (idCaptureViewModel.f15764x != 3) {
            int i3 = A + 49;
            C = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Timber.Forest.d("Warn about wrong side, it should be " + idCaptureViewModel.f15760t.name(), new Object[0]);
        idCaptureViewModel.c(idCaptureViewModel.new ap());
        idCaptureViewModel.f15764x = 0;
        int i4 = C + 101;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean e(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r9) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            com.incode.welcome_sdk.modules.IdScan r0 = r8.f15741a
            boolean r0 = r0.isEnabledBackShownAsFrontCheck()
            r6 = 1
            r5 = 0
            r4 = 0
            if (r0 == 0) goto L49
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L66
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r8.f15760t
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            if (r1 != r0) goto L49
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            if (r9 != r0) goto L49
            r2 = r6
        L24:
            com.incode.welcome_sdk.modules.IdScan r0 = r8.f15741a
            boolean r0 = r0.isEnabledFrontShownAsBackCheck()
            if (r0 == 0) goto L47
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r8.f15760t
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            if (r1 != r0) goto L47
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            if (r9 != r0) goto L47
            r3 = r6
        L37:
            if (r2 != 0) goto L46
            int r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r2 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L62
            if (r3 == 0) goto L54
        L46:
            return r6
        L47:
            r3 = r5
            goto L37
        L49:
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r7
            r2 = r5
            goto L24
        L54:
            int r1 = r2 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L5e
            return r5
        L5e:
            r4.hashCode()
            throw r4
        L62:
            r4.hashCode()
            throw r4
        L66:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean c(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            com.incode.welcome_sdk.modules.IdScan r0 = r7.f15741a
            boolean r0 = r0.isEnabledBackShownAsFrontCheck()
            r5 = 0
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L72
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r7.f15760t
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            if (r1 != r0) goto L72
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L7a
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            if (r8 == r0) goto L27
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE
            if (r8 != r0) goto L72
        L27:
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r6
            r3 = r2
        L31:
            com.incode.welcome_sdk.modules.IdScan r0 = r7.f15741a
            boolean r0 = r0.isEnabledFrontShownAsBackCheck()
            if (r0 != 0) goto L4e
        L39:
            r0 = r4
        L3a:
            r3 = r3 ^ r2
            if (r3 == r2) goto L3e
        L3d:
            return r4
        L3e:
            if (r0 != 0) goto L3d
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L4c
            goto L3d
        L4c:
            r4 = r2
            goto L3d
        L4e:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r7.f15760t
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            if (r1 != r0) goto L39
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r6
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            if (r8 == r0) goto L70
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L74
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE
            if (r8 != r0) goto L39
        L70:
            r0 = r2
            goto L3a
        L72:
            r3 = r4
            goto L31
        L74:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE
            r5.hashCode()
            throw r5
        L7a:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.c(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType):boolean");
    }

    static final class c extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: a */
        private static int f15971a = 0;

        /* JADX INFO: renamed from: d */
        private static int f15972d = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ DocumentType f15973c;

        private CaptureUiState d(CaptureUiState captureUiState) {
            CaptureUiState captureUiStateChangeDocumentType;
            int i2 = 2 % 2;
            int i3 = f15971a + 75;
            f15972d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                captureUiStateChangeDocumentType = CaptureUiState.f14575e.ChangeDocumentType(captureUiState, this.f15973c);
                int i4 = 30 / 0;
            } else {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                captureUiStateChangeDocumentType = CaptureUiState.f14575e.ChangeDocumentType(captureUiState, this.f15973c);
            }
            int i5 = f15972d + 83;
            f15971a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 10 / 0;
            }
            return captureUiStateChangeDocumentType;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15971a + 105;
            f15972d = i3 % 128;
            CaptureUiState captureUiState2 = captureUiState;
            if (i3 % 2 != 0) {
                return d(captureUiState2);
            }
            d(captureUiState2);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DocumentType documentType) {
            super(1);
            this.f15973c = documentType;
        }
    }

    private final boolean a(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = C + 21;
        A = i3 % 128;
        int i4 = i3 % 2;
        int i5 = WhenMappings.f15775a[this.f15760t.ordinal()];
        if (i5 != 1 && i5 != 2) {
            return false;
        }
        int i6 = C + 37;
        A = i6 % 128;
        int i7 = i6 % 2;
        int i8 = WhenMappings.f15775a[documentType.ordinal()];
        if (i8 != 1 && i8 != 2) {
            this.f15759s = 0;
            return false;
        }
        int i9 = A + 59;
        int i10 = i9 % 128;
        C = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 57;
        A = i12 % 128;
        if (i12 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f15760t != documentType) {
            if (this.f15757q != documentType) {
                this.f15757q = documentType;
                this.f15759s = 0;
            }
            int i13 = this.f15759s + 1;
            this.f15759s = i13;
            if (i13 >= 3) {
                this.f15760t = documentType;
                c(new c(documentType));
                return true;
            }
        } else {
            this.f15759s = 0;
        }
        return false;
    }

    static final class ab extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f */
        private static int f15807f = 0;

        /* JADX INFO: renamed from: i */
        private static int f15808i = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Object f15809a;

        /* JADX INFO: renamed from: b */
        private Object f15810b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Ref.BooleanRef f15811c;

        /* JADX INFO: renamed from: e */
        private int f15813e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Ref.BooleanRef booleanRef;
            int i2 = 2 % 2;
            int i3 = f15808i + 103;
            f15807f = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f15813e;
            Object obj2 = null;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f15809a;
                booleanRef = new Ref.BooleanRef();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(IdCaptureViewModel.this, booleanRef, null), 3, null);
                this.f15809a = coroutineScope;
                this.f15810b = booleanRef;
                this.f15813e = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    int i6 = f15808i + 19;
                    f15807f = i6 % 128;
                    int i7 = i6 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.f15810b;
                coroutineScope = (CoroutineScope) this.f15809a;
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(IdCaptureViewModel.this, booleanRef, this.f15811c, null), 3, null);
            Unit unit = Unit.INSTANCE;
            int i8 = f15808i + 115;
            f15807f = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5 */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a */
            private static int f15847a = 0;

            /* JADX INFO: renamed from: c */
            private static int f15848c = 1;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ IdCaptureViewModel f15849b;

            /* JADX INFO: renamed from: d */
            private int f15850d;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ Ref.BooleanRef f15851e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f15850d;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowConflate = FlowKt.conflate(IdCaptureViewModel.access$documentAnalyzerEvents(this.f15849b));
                    final IdCaptureViewModel idCaptureViewModel = this.f15849b;
                    final Flow<DocumentAnalysisEvent> flow = new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f16119b = 0;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f16120e = 1;

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f16123c = 1;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f16124e = 0;

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private /* synthetic */ FlowCollector f16125a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private /* synthetic */ IdCaptureViewModel f16126b;

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                                /*
                                    r7 = this;
                                    r3 = 2
                                    int r0 = r3 % r3
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16124e
                                    int r1 = r0 + 31
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16123c = r0
                                    int r1 = r1 % r3
                                    boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L87
                                    r6 = r9
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1$2$1 r6 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r6
                                    int r0 = r6.f16132d
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L87
                                    int r0 = r6.f16132d
                                    int r0 = r0 - r1
                                    r6.f16132d = r0
                                L1f:
                                    java.lang.Object r0 = r6.f16130b
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r1 = r6.f16132d
                                    r5 = 0
                                    r4 = 1
                                    if (r1 == 0) goto L35
                                    if (r1 == r4) goto L59
                                    if (r1 != r3) goto L96
                                    kotlin.ResultKt.throwOnFailure(r0)
                                L32:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                L35:
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    kotlinx.coroutines.flow.FlowCollector r1 = r7.f16125a
                                    r0 = r6
                                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                    r0 = r8
                                    com.incode.camera.analysis.document.DocumentAnalysisEvent r0 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r0
                                    boolean r0 = r0 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.IdTypeExtracted
                                    if (r0 == 0) goto L54
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r7.f16126b
                                    r6.f16129a = r8
                                    r6.f16133e = r1
                                    r6.f16132d = r4
                                    java.lang.Object r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$shouldProcessAnalyzerEvents(r0, r6)
                                    if (r0 != r2) goto L53
                                    return r2
                                L53:
                                    goto L62
                                L54:
                                    java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                                    goto L62
                                L59:
                                    java.lang.Object r1 = r6.f16133e
                                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                                    java.lang.Object r8 = r6.f16129a
                                    kotlin.ResultKt.throwOnFailure(r0)
                                L62:
                                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                                    boolean r0 = r0.booleanValue()
                                    r0 = r0 ^ r4
                                    if (r0 == r4) goto L32
                                    r0 = 0
                                    r6.f16129a = r0
                                    r6.f16133e = r0
                                    r6.f16132d = r3
                                    java.lang.Object r0 = r1.emit(r8, r6)
                                    if (r0 != r2) goto L32
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16123c
                                    int r1 = r0 + 89
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16124e = r0
                                    int r1 = r1 % r3
                                    if (r1 == 0) goto L86
                                    r0 = 85
                                    int r0 = r0 / r5
                                L86:
                                    return r2
                                L87:
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1$2$1 r6 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1$2$1
                                    r6.<init>(r9)
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16124e
                                    int r1 = r0 + 123
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16123c = r0
                                    int r1 = r1 % r3
                                    goto L1f
                                L96:
                                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r0)
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {

                                /* JADX INFO: renamed from: g, reason: collision with root package name */
                                private static int f16127g = 0;

                                /* JADX INFO: renamed from: h, reason: collision with root package name */
                                private static int f16128h = 1;

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                Object f16129a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f16130b;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                int f16132d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                Object f16133e;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object objEmit;
                                    int i2 = 2 % 2;
                                    int i3 = f16127g + 5;
                                    f16128h = i3 % 128;
                                    int i4 = i3 % 2;
                                    this.f16130b = obj;
                                    this.f16132d |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i4 == 0) {
                                        objEmit = anonymousClass2.emit(null, this);
                                        int i5 = 28 / 0;
                                    } else {
                                        objEmit = anonymousClass2.emit(null, this);
                                    }
                                    int i6 = f16127g + 49;
                                    f16128h = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        int i7 = 19 / 0;
                                    }
                                    return objEmit;
                                }

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, IdCaptureViewModel idCaptureViewModel) {
                                this.f16125a = flowCollector;
                                this.f16126b = idCaptureViewModel;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                            int i4 = 2 % 2;
                            Object objCollect = flowConflate.collect(new AnonymousClass2(flowCollector, idCaptureViewModel), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Unit unit = Unit.INSTANCE;
                                int i5 = f16120e + 125;
                                f16119b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i6 = 23 / 0;
                                }
                                return unit;
                            }
                            int i7 = f16119b + 99;
                            f16120e = i7 % 128;
                            int i8 = i7 % 2;
                            return objCollect;
                        }
                    };
                    this.f15850d = 1;
                    if (new Flow<DocumentAnalysisEvent.IdTypeExtracted>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f16134c = 0;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f16135e = 1;

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private static int f16137b = 1;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f16138e = 0;

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private /* synthetic */ FlowCollector f16139a;

                            /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[PHI: r4
  0x0020: PHI (r4v4 com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1) = 
  (r4v3 com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1)
  (r4v6 com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1)
 binds: [B:21:0x0063, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                                /*
                                    r6 = this;
                                    r5 = 2
                                    int r0 = r5 % r5
                                    boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L66
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16138e
                                    int r1 = r0 + 47
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16137b = r0
                                    int r1 = r1 % r5
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    if (r1 != 0) goto L5d
                                    r4 = r8
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                    int r1 = r4.f16144e
                                    r1 = r1 & r2
                                    r0 = 80
                                    int r0 = r0 / 0
                                    if (r1 == 0) goto L66
                                L20:
                                    int r0 = r4.f16144e
                                    int r0 = r0 - r2
                                    r4.f16144e = r0
                                L25:
                                    java.lang.Object r1 = r4.f16143c
                                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r0 = r4.f16144e
                                    r2 = 1
                                    if (r0 == 0) goto L38
                                    if (r0 != r2) goto L6c
                                    kotlin.ResultKt.throwOnFailure(r1)
                                L35:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                L38:
                                    kotlin.ResultKt.throwOnFailure(r1)
                                    kotlinx.coroutines.flow.FlowCollector r1 = r6.f16139a
                                    r0 = r4
                                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                    com.incode.camera.analysis.document.DocumentAnalysisEvent r7 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r7
                                    java.lang.String r0 = ""
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
                                    com.incode.camera.analysis.document.DocumentAnalysisEvent$IdTypeExtracted r7 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.IdTypeExtracted) r7
                                    r4.f16144e = r2
                                    java.lang.Object r0 = r1.emit(r7, r4)
                                    if (r0 != r3) goto L35
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16137b
                                    int r1 = r0 + 11
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16138e = r0
                                    int r1 = r1 % r5
                                    if (r1 != 0) goto L74
                                    return r3
                                L5d:
                                    r4 = r8
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                    int r0 = r4.f16144e
                                    r0 = r0 & r2
                                    if (r0 == 0) goto L66
                                    goto L20
                                L66:
                                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1 r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1
                                    r4.<init>(r8)
                                    goto L25
                                L6c:
                                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r0)
                                    throw r1
                                L74:
                                    r0 = 0
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                private static int f16140b = 1;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                private static int f16141d = 0;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                /* synthetic */ Object f16143c;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                int f16144e;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    int i2 = 2 % 2;
                                    int i3 = f16141d + 101;
                                    f16140b = i3 % 128;
                                    int i4 = i3 % 2;
                                    this.f16143c = obj;
                                    this.f16144e |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    AnonymousClass1 anonymousClass1 = this;
                                    if (i4 != 0) {
                                        return anonymousClass2.emit(null, anonymousClass1);
                                    }
                                    anonymousClass2.emit(null, anonymousClass1);
                                    throw null;
                                }

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.f16139a = flowCollector;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector<? super DocumentAnalysisEvent.IdTypeExtracted> flowCollector, Continuation continuation) {
                            int i4 = 2 % 2;
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return Unit.INSTANCE;
                            }
                            int i5 = f16134c + 67;
                            f16135e = i5 % 128;
                            int i6 = i5 % 2;
                            return objCollect;
                        }
                    }.collect(new AnonymousClass2(this.f15851e, this.f15849b), this) == coroutine_suspended) {
                        int i4 = f15847a + 103;
                        f15848c = i4 % 128;
                        if (i4 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = f15847a + 39;
                    f15848c = i5 % 128;
                    int i6 = i5 % 2;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5$2 */
            static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: c */
                private static int f15852c = 1;

                /* JADX INFO: renamed from: e */
                private static int f15853e = 0;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ IdCaptureViewModel f15854a;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ Ref.BooleanRef f15855d;

                /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:
                
                    if (kotlinx.coroutines.DelayKt.delay(1500, r5) == r3) goto L47;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0065, code lost:
                
                    r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15853e + 87;
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15852c = r1 % 128;
                    r1 = r1 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
                
                    return r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
                
                    if (kotlinx.coroutines.DelayKt.delay(1500, r5) == r3) goto L47;
                 */
                /* JADX WARN: Removed duplicated region for block: B:53:0x007c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object e(com.incode.camera.analysis.document.DocumentAnalysisEvent.IdTypeExtracted r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
                    /*
                        r8 = this;
                        r7 = 2
                        int r0 = r7 % r7
                        boolean r0 = r10 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.e
                        if (r0 == 0) goto L7c
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15852c
                        int r1 = r0 + 125
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15853e = r0
                        int r1 = r1 % r7
                        r5 = r10
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5$2$e r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.e) r5
                        int r0 = r5.f15858b
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L7c
                        int r0 = r5.f15858b
                        int r0 = r0 - r1
                        r5.f15858b = r0
                    L1f:
                        java.lang.Object r1 = r5.f15859c
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r5.f15858b
                        r4 = 0
                        r6 = 1
                        if (r0 == 0) goto L3b
                        if (r0 != r6) goto L82
                        java.lang.Object r0 = r5.f15861e
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5$2 r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2) r0
                        kotlin.ResultKt.throwOnFailure(r1)
                    L34:
                        kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f15855d
                        r0.element = r4
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlin.jvm.internal.Ref$BooleanRef r1 = r8.f15855d
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r8.f15854a
                        boolean r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$handleIdTypeExtractedEvent(r0, r9)
                        r1.element = r0
                        kotlin.jvm.internal.Ref$BooleanRef r0 = r8.f15855d
                        boolean r0 = r0.element
                        if (r0 == 0) goto L7a
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15853e
                        int r2 = r0 + 69
                        int r0 = r2 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15852c = r0
                        int r2 = r2 % r7
                        r0 = 1500(0x5dc, double:7.41E-321)
                        if (r2 != 0) goto L6f
                        r5.f15861e = r8
                        r5.f15858b = r4
                        java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r5)
                        if (r0 != r3) goto L7a
                    L65:
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15853e
                        int r1 = r0 + 87
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.f15852c = r0
                        int r1 = r1 % r7
                        return r3
                    L6f:
                        r5.f15861e = r8
                        r5.f15858b = r6
                        java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r5)
                        if (r0 != r3) goto L7a
                        goto L65
                    L7a:
                        r0 = r8
                        goto L34
                    L7c:
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5$2$e r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5$2$e
                        r5.<init>(r8, r10)
                        goto L1f
                    L82:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass5.AnonymousClass2.e(com.incode.camera.analysis.document.DocumentAnalysisEvent$IdTypeExtracted, kotlin.coroutines.Continuation):java.lang.Object");
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    int i2 = 2 % 2;
                    int i3 = f15852c + 97;
                    f15853e = i3 % 128;
                    int i4 = i3 % 2;
                    Object objE = e((DocumentAnalysisEvent.IdTypeExtracted) obj, continuation);
                    int i5 = f15853e + 45;
                    f15852c = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objE;
                    }
                    throw null;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$5$2$e */
                static final class e extends ContinuationImpl {

                    /* JADX INFO: renamed from: a */
                    private static int f15856a = 0;

                    /* JADX INFO: renamed from: g */
                    private static int f15857g = 1;

                    /* JADX INFO: renamed from: b */
                    int f15858b;

                    /* JADX INFO: renamed from: c */
                    /* synthetic */ Object f15859c;

                    /* JADX INFO: renamed from: d */
                    private /* synthetic */ AnonymousClass2<T> f15860d;

                    /* JADX INFO: renamed from: e */
                    Object f15861e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = f15856a + 7;
                        f15857g = i3 % 128;
                        int i4 = i3 % 2;
                        this.f15859c = obj;
                        this.f15858b |= Integer.MIN_VALUE;
                        Object objE = this.f15860d.e(null, this);
                        int i5 = f15856a + 93;
                        f15857g = i5 % 128;
                        int i6 = i5 % 2;
                        return objE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    e(AnonymousClass2<? super T> anonymousClass2, Continuation<? super e> continuation) {
                        super(continuation);
                        this.f15860d = anonymousClass2;
                    }
                }

                AnonymousClass2(Ref.BooleanRef booleanRef, IdCaptureViewModel idCaptureViewModel) {
                    this.f15855d = booleanRef;
                    this.f15854a = idCaptureViewModel;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15848c + 49;
                f15847a = i3 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 == 0) {
                    return a(coroutineScope2, continuation2);
                }
                a(coroutineScope2, continuation2);
                throw null;
            }

            private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15847a + 95;
                f15848c = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f15847a + 81;
                f15848c = i5 % 128;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f15849b, this.f15851e, continuation);
                int i3 = f15848c + 123;
                f15847a = i3 % 128;
                if (i3 % 2 == 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(IdCaptureViewModel idCaptureViewModel, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.f15849b = idCaptureViewModel;
                this.f15851e = booleanRef;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2 */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: c */
            private static int f15814c = 0;

            /* JADX INFO: renamed from: i */
            private static int f15815i = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ Ref.BooleanRef f15816a;

            /* JADX INFO: renamed from: b */
            private int f15817b;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Ref.BooleanRef f15818d;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ IdCaptureViewModel f15819e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f15814c + 125;
                f15815i = i3 % 128;
                int i4 = i3 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.f15817b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowConflate = FlowKt.conflate(IdCaptureViewModel.access$documentAnalyzerEvents(this.f15819e));
                    final Ref.BooleanRef booleanRef = this.f15816a;
                    final IdCaptureViewModel idCaptureViewModel = this.f15819e;
                    this.f15817b = 1;
                    if (new IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1(new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f16145c = 1;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f16146d = 0;

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private static int f16150a = 1;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f16151e = 0;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private /* synthetic */ IdCaptureViewModel f16152b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private /* synthetic */ FlowCollector f16153c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            private /* synthetic */ Ref.BooleanRef f16154d;

                            /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
                            
                                if (r8 == r3) goto L20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
                            
                                return r3;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
                            
                                if (r8 == r3) goto L20;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                                /*
                                    Method dump skipped, instruction units count: 207
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {

                                /* JADX INFO: renamed from: f, reason: collision with root package name */
                                private static int f16155f = 0;

                                /* JADX INFO: renamed from: j, reason: collision with root package name */
                                private static int f16156j = 1;

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                /* synthetic */ Object f16157a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                Object f16158b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f16159c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f16160d;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    int i2 = 2 % 2;
                                    int i3 = f16155f + 43;
                                    f16156j = i3 % 128;
                                    int i4 = i3 % 2;
                                    this.f16157a = obj;
                                    this.f16159c |= Integer.MIN_VALUE;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i5 = f16156j + 117;
                                    f16155f = i5 % 128;
                                    int i6 = i5 % 2;
                                    return objEmit;
                                }

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, Ref.BooleanRef booleanRef, IdCaptureViewModel idCaptureViewModel) {
                                this.f16153c = flowCollector;
                                this.f16154d = booleanRef;
                                this.f16152b = idCaptureViewModel;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                            int i6 = 2 % 2;
                            Object objCollect = flowConflate.collect(new AnonymousClass2(flowCollector, booleanRef, idCaptureViewModel), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i7 = f16146d + 91;
                            f16145c = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 51 / 0;
                            }
                            return unit;
                        }
                    }).collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5

                        /* JADX INFO: renamed from: a */
                        private static int f15820a = 0;

                        /* JADX INFO: renamed from: b */
                        private static int f15821b = 1;

                        /* JADX INFO: renamed from: c */
                        private /* synthetic */ Ref.BooleanRef f15822c;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            int i6 = 2 % 2;
                            int i7 = f15820a + 99;
                            f15821b = i7 % 128;
                            int i8 = i7 % 2;
                            Object objD = d((DocumentAnalysisEvent.AnalysisAbortEvent) obj2, continuation);
                            int i9 = f15821b + 115;
                            f15820a = i9 % 128;
                            int i10 = i9 % 2;
                            return objD;
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$5 */
                        static final class C02555 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                            /* JADX INFO: renamed from: a */
                            private static int f15842a = 1;

                            /* JADX INFO: renamed from: b */
                            private static int f15843b = 0;

                            /* JADX INFO: renamed from: c */
                            private static int f15844c = 1;

                            /* JADX INFO: renamed from: d */
                            private static int f15845d = 0;

                            /* JADX INFO: renamed from: e */
                            public static final C02555 f15846e = ;

                            private static CaptureUiState b(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15844c + 49;
                                f15845d = i3 % 128;
                                if (i3 % 2 == 0) {
                                    Intrinsics.checkNotNullParameter(captureUiState, "");
                                    return CaptureUiState.f14575e.ErrorBlurryId(captureUiState);
                                }
                                Intrinsics.checkNotNullParameter(captureUiState, "");
                                CaptureUiState.f14575e.ErrorBlurryId(captureUiState);
                                throw null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15845d + 13;
                                f15844c = i3 % 128;
                                Object obj = null;
                                CaptureUiState captureUiState2 = captureUiState;
                                if (i3 % 2 == 0) {
                                    b(captureUiState2);
                                    obj.hashCode();
                                    throw null;
                                }
                                CaptureUiState captureUiStateB = b(captureUiState2);
                                int i4 = f15845d + 67;
                                f15844c = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return captureUiStateB;
                                }
                                throw null;
                            }

                            static {
                                int i2 = f15842a + 109;
                                f15843b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw null;
                                }
                            }

                            C02555() {
                            }
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$3 */
                        static final class AnonymousClass3 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                            /* JADX INFO: renamed from: a */
                            private static int f15832a = 1;

                            /* JADX INFO: renamed from: b */
                            public static final AnonymousClass3 f15833b = ;

                            /* JADX INFO: renamed from: c */
                            private static int f15834c = 0;

                            /* JADX INFO: renamed from: d */
                            private static int f15835d = 1;

                            /* JADX INFO: renamed from: e */
                            private static int f15836e = 0;

                            private static CaptureUiState d(CaptureUiState captureUiState) {
                                CaptureUiState captureUiStateErrorGlareId;
                                int i2 = 2 % 2;
                                int i3 = f15836e + 89;
                                f15832a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    Intrinsics.checkNotNullParameter(captureUiState, "");
                                    captureUiStateErrorGlareId = CaptureUiState.f14575e.ErrorGlareId(captureUiState);
                                    int i4 = 8 / 0;
                                } else {
                                    Intrinsics.checkNotNullParameter(captureUiState, "");
                                    captureUiStateErrorGlareId = CaptureUiState.f14575e.ErrorGlareId(captureUiState);
                                }
                                int i5 = f15836e + 5;
                                f15832a = i5 % 128;
                                int i6 = i5 % 2;
                                return captureUiStateErrorGlareId;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15836e + 45;
                                f15832a = i3 % 128;
                                int i4 = i3 % 2;
                                CaptureUiState captureUiStateD = d(captureUiState);
                                if (i4 == 0) {
                                    int i5 = 46 / 0;
                                }
                                return captureUiStateD;
                            }

                            static {
                                int i2 = f15834c + 43;
                                f15835d = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }

                            AnonymousClass3() {
                            }
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$4 */
                        static final class AnonymousClass4 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                            /* JADX INFO: renamed from: a */
                            public static final AnonymousClass4 f15837a = ;

                            /* JADX INFO: renamed from: b */
                            private static int f15838b = 0;

                            /* JADX INFO: renamed from: c */
                            private static int f15839c = 1;

                            /* JADX INFO: renamed from: d */
                            private static int f15840d = 0;

                            /* JADX INFO: renamed from: e */
                            private static int f15841e = 1;

                            private static CaptureUiState a(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15840d + 105;
                                f15841e = i3 % 128;
                                if (i3 % 2 == 0) {
                                    Intrinsics.checkNotNullParameter(captureUiState, "");
                                    CaptureUiState.f14575e.ErrorMisalignedId(captureUiState);
                                    throw null;
                                }
                                Intrinsics.checkNotNullParameter(captureUiState, "");
                                CaptureUiState captureUiStateErrorMisalignedId = CaptureUiState.f14575e.ErrorMisalignedId(captureUiState);
                                int i4 = f15840d + 25;
                                f15841e = i4 % 128;
                                int i5 = i4 % 2;
                                return captureUiStateErrorMisalignedId;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15840d + 13;
                                f15841e = i3 % 128;
                                int i4 = i3 % 2;
                                CaptureUiState captureUiStateA = a(captureUiState);
                                if (i4 == 0) {
                                    int i5 = 78 / 0;
                                }
                                return captureUiStateA;
                            }

                            static {
                                int i2 = f15838b + 115;
                                f15839c = i2 % 128;
                                int i3 = i2 % 2;
                            }

                            AnonymousClass4() {
                            }
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$2 */
                        static final class C02542 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                            /* JADX INFO: renamed from: a */
                            private static int f15827a = 1;

                            /* JADX INFO: renamed from: b */
                            private static int f15828b = 1;

                            /* JADX INFO: renamed from: c */
                            private static int f15829c = 0;

                            /* JADX INFO: renamed from: d */
                            private static int f15830d = 0;

                            /* JADX INFO: renamed from: e */
                            public static final C02542 f15831e = ;

                            private static CaptureUiState d(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15827a + 43;
                                f15830d = i3 % 128;
                                if (i3 % 2 != 0) {
                                    Intrinsics.checkNotNullParameter(captureUiState, "");
                                    CaptureUiState.f14575e.ErrorTooDark(captureUiState);
                                    throw null;
                                }
                                Intrinsics.checkNotNullParameter(captureUiState, "");
                                CaptureUiState captureUiStateErrorTooDark = CaptureUiState.f14575e.ErrorTooDark(captureUiState);
                                int i4 = f15827a + 41;
                                f15830d = i4 % 128;
                                int i5 = i4 % 2;
                                return captureUiStateErrorTooDark;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15827a + 15;
                                f15830d = i3 % 128;
                                int i4 = i3 % 2;
                                CaptureUiState captureUiStateD = d(captureUiState);
                                if (i4 != 0) {
                                    int i5 = 15 / 0;
                                }
                                return captureUiStateD;
                            }

                            static {
                                int i2 = f15828b + 67;
                                f15829c = i2 % 128;
                                int i3 = i2 % 2;
                            }

                            C02542() {
                            }
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$1 */
                        static final class AnonymousClass1 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                            /* JADX INFO: renamed from: d */
                            private static int f15824d = 0;

                            /* JADX INFO: renamed from: e */
                            private static int f15825e = 1;

                            private CaptureUiState e(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15824d + 93;
                                f15825e = i3 % 128;
                                if (i3 % 2 == 0) {
                                    Intrinsics.checkNotNullParameter(captureUiState, "");
                                    CaptureUiState.f14575e.ErrorFillTheFrame(captureUiState, booleanRef.element);
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                Intrinsics.checkNotNullParameter(captureUiState, "");
                                CaptureUiState captureUiStateErrorFillTheFrame = CaptureUiState.f14575e.ErrorFillTheFrame(captureUiState, booleanRef.element);
                                int i4 = f15824d + 43;
                                f15825e = i4 % 128;
                                int i5 = i4 % 2;
                                return captureUiStateErrorFillTheFrame;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                                int i2 = 2 % 2;
                                int i3 = f15825e + 99;
                                f15824d = i3 % 128;
                                Object obj = null;
                                CaptureUiState captureUiState2 = captureUiState;
                                if (i3 % 2 != 0) {
                                    e(captureUiState2);
                                    throw null;
                                }
                                CaptureUiState captureUiStateE = e(captureUiState2);
                                int i4 = f15825e + 61;
                                f15824d = i4 % 128;
                                if (i4 % 2 == 0) {
                                    return captureUiStateE;
                                }
                                obj.hashCode();
                                throw null;
                            }

                            AnonymousClass1() {
                                super(1);
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private java.lang.Object d(com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                            /*
                                r6 = this;
                                r5 = 2
                                int r0 = r5 % r5
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getAnalytics$p(r0)
                                java.lang.String r0 = r7.getDescription()
                                r1.storeEventValue(r0)
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureFrameLogger r4 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getFrameLogger$p(r0)
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getDocumentType$p(r0)
                                com.incode.camera.analysis.document.CaptureInfo r1 = r7.getCaptureInfo()
                                r0 = r7
                                com.incode.camera.analysis.document.DocumentAnalysisEvent r0 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r0
                                r3 = 0
                                r4.addFrameLogAndSendConditionally(r2, r1, r0, r3)
                                boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Blur
                                if (r0 == 0) goto L4a
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$5 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.C02555.f15846e
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15820a
                                int r1 = r0 + 95
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15821b = r0
                            L3c:
                                int r1 = r1 % r5
                            L3d:
                                r0 = 1500(0x5dc, double:7.41E-321)
                                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r0, r8)
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                if (r1 != r0) goto L9d
                                return r1
                            L4a:
                                boolean r1 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Glare
                                r0 = 1
                                if (r1 == r0) goto L8a
                                boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.NotAligned
                                if (r0 == 0) goto L5d
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$4 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.AnonymousClass4.f15837a
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                                goto L3d
                            L5d:
                                boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.TooDark
                                if (r0 == 0) goto L73
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$2 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.C02542.f15831e
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15821b
                                int r1 = r0 + 67
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15820a = r0
                                goto L3c
                            L73:
                                boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.NoDocumentDetected
                                if (r0 == 0) goto L3d
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r2 = r1
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$1 r1 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$1
                                kotlin.jvm.internal.Ref$BooleanRef r0 = r2
                                r1.<init>()
                                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r2, r1)
                                kotlin.jvm.internal.Ref$BooleanRef r0 = r2
                                r0.element = r3
                                goto L3d
                            L8a:
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15820a
                                int r1 = r0 + 107
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15821b = r0
                                int r1 = r1 % r5
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$3 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.AnonymousClass3.f15833b
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                                goto L3d
                            L9d:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.d(com.incode.camera.analysis.document.DocumentAnalysisEvent$AnalysisAbortEvent, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        AnonymousClass5(Ref.BooleanRef booleanRef2) {
                            booleanRef = booleanRef2;
                        }
                    }, this) == coroutine_suspended) {
                        int i6 = f15815i + 33;
                        f15814c = i6 % 128;
                        if (i6 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5 */
            static final class AnonymousClass5<T> implements FlowCollector {

                /* JADX INFO: renamed from: a */
                private static int f15820a = 0;

                /* JADX INFO: renamed from: b */
                private static int f15821b = 1;

                /* JADX INFO: renamed from: c */
                private /* synthetic */ Ref.BooleanRef f15822c;

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    int i6 = 2 % 2;
                    int i7 = f15820a + 99;
                    f15821b = i7 % 128;
                    int i8 = i7 % 2;
                    Object objD = d((DocumentAnalysisEvent.AnalysisAbortEvent) obj2, continuation);
                    int i9 = f15821b + 115;
                    f15820a = i9 % 128;
                    int i10 = i9 % 2;
                    return objD;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$5 */
                /*  JADX ERROR: Failed to generate init code
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] (LINE:65353) call: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.5.<init>():void type: CONSTRUCTOR in method: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.5.<clinit>():void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
                    	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
                    	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.5
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                    	... 110 more
                    */
                static final class C02555 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                    /* JADX INFO: renamed from: a */
                    private static int f15842a = 1;

                    /* JADX INFO: renamed from: b */
                    private static int f15843b = 0;

                    /* JADX INFO: renamed from: c */
                    private static int f15844c = 1;

                    /* JADX INFO: renamed from: d */
                    private static int f15845d = 0;

                    /* JADX INFO: renamed from: e */
                    public static final C02555 f15846e = new C02555();

                    private static CaptureUiState b(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15844c + 49;
                        f15845d = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(captureUiState, "");
                            return CaptureUiState.f14575e.ErrorBlurryId(captureUiState);
                        }
                        Intrinsics.checkNotNullParameter(captureUiState, "");
                        CaptureUiState.f14575e.ErrorBlurryId(captureUiState);
                        throw null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15845d + 13;
                        f15844c = i3 % 128;
                        Object obj = null;
                        CaptureUiState captureUiState2 = captureUiState;
                        if (i3 % 2 == 0) {
                            b(captureUiState2);
                            obj.hashCode();
                            throw null;
                        }
                        CaptureUiState captureUiStateB = b(captureUiState2);
                        int i4 = f15845d + 67;
                        f15844c = i4 % 128;
                        if (i4 % 2 != 0) {
                            return captureUiStateB;
                        }
                        throw null;
                    }

                    static {
                        int i2 = f15842a + 109;
                        f15843b = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    }

                    C02555() {
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$3 */
                /*  JADX ERROR: Failed to generate init code
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] (LINE:65353) call: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.3.<init>():void type: CONSTRUCTOR in method: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.3.<clinit>():void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
                    	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
                    	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.3
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                    	... 110 more
                    */
                static final class AnonymousClass3 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                    /* JADX INFO: renamed from: a */
                    private static int f15832a = 1;

                    /* JADX INFO: renamed from: b */
                    public static final AnonymousClass3 f15833b = new AnonymousClass3();

                    /* JADX INFO: renamed from: c */
                    private static int f15834c = 0;

                    /* JADX INFO: renamed from: d */
                    private static int f15835d = 1;

                    /* JADX INFO: renamed from: e */
                    private static int f15836e = 0;

                    private static CaptureUiState d(CaptureUiState captureUiState) {
                        CaptureUiState captureUiStateErrorGlareId;
                        int i2 = 2 % 2;
                        int i3 = f15836e + 89;
                        f15832a = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(captureUiState, "");
                            captureUiStateErrorGlareId = CaptureUiState.f14575e.ErrorGlareId(captureUiState);
                            int i4 = 8 / 0;
                        } else {
                            Intrinsics.checkNotNullParameter(captureUiState, "");
                            captureUiStateErrorGlareId = CaptureUiState.f14575e.ErrorGlareId(captureUiState);
                        }
                        int i5 = f15836e + 5;
                        f15832a = i5 % 128;
                        int i6 = i5 % 2;
                        return captureUiStateErrorGlareId;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15836e + 45;
                        f15832a = i3 % 128;
                        int i4 = i3 % 2;
                        CaptureUiState captureUiStateD = d(captureUiState);
                        if (i4 == 0) {
                            int i5 = 46 / 0;
                        }
                        return captureUiStateD;
                    }

                    static {
                        int i2 = f15834c + 43;
                        f15835d = i2 % 128;
                        if (i2 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    AnonymousClass3() {
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$4 */
                /*  JADX ERROR: Failed to generate init code
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] (LINE:65353) call: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.4.<init>():void type: CONSTRUCTOR in method: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.4.<clinit>():void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
                    	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
                    	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.4
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                    	... 110 more
                    */
                static final class AnonymousClass4 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                    /* JADX INFO: renamed from: a */
                    public static final AnonymousClass4 f15837a = new AnonymousClass4();

                    /* JADX INFO: renamed from: b */
                    private static int f15838b = 0;

                    /* JADX INFO: renamed from: c */
                    private static int f15839c = 1;

                    /* JADX INFO: renamed from: d */
                    private static int f15840d = 0;

                    /* JADX INFO: renamed from: e */
                    private static int f15841e = 1;

                    private static CaptureUiState a(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15840d + 105;
                        f15841e = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(captureUiState, "");
                            CaptureUiState.f14575e.ErrorMisalignedId(captureUiState);
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(captureUiState, "");
                        CaptureUiState captureUiStateErrorMisalignedId = CaptureUiState.f14575e.ErrorMisalignedId(captureUiState);
                        int i4 = f15840d + 25;
                        f15841e = i4 % 128;
                        int i5 = i4 % 2;
                        return captureUiStateErrorMisalignedId;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15840d + 13;
                        f15841e = i3 % 128;
                        int i4 = i3 % 2;
                        CaptureUiState captureUiStateA = a(captureUiState);
                        if (i4 == 0) {
                            int i5 = 78 / 0;
                        }
                        return captureUiStateA;
                    }

                    static {
                        int i2 = f15838b + 115;
                        f15839c = i2 % 128;
                        int i3 = i2 % 2;
                    }

                    AnonymousClass4() {
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$2 */
                /*  JADX ERROR: Failed to generate init code
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] (LINE:65353) call: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.2.<init>():void type: CONSTRUCTOR in method: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.2.<clinit>():void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
                    	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
                    	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.2.5.2
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                    	... 110 more
                    */
                static final class C02542 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                    /* JADX INFO: renamed from: a */
                    private static int f15827a = 1;

                    /* JADX INFO: renamed from: b */
                    private static int f15828b = 1;

                    /* JADX INFO: renamed from: c */
                    private static int f15829c = 0;

                    /* JADX INFO: renamed from: d */
                    private static int f15830d = 0;

                    /* JADX INFO: renamed from: e */
                    public static final C02542 f15831e = new C02542();

                    private static CaptureUiState d(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15827a + 43;
                        f15830d = i3 % 128;
                        if (i3 % 2 != 0) {
                            Intrinsics.checkNotNullParameter(captureUiState, "");
                            CaptureUiState.f14575e.ErrorTooDark(captureUiState);
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(captureUiState, "");
                        CaptureUiState captureUiStateErrorTooDark = CaptureUiState.f14575e.ErrorTooDark(captureUiState);
                        int i4 = f15827a + 41;
                        f15830d = i4 % 128;
                        int i5 = i4 % 2;
                        return captureUiStateErrorTooDark;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15827a + 15;
                        f15830d = i3 % 128;
                        int i4 = i3 % 2;
                        CaptureUiState captureUiStateD = d(captureUiState);
                        if (i4 != 0) {
                            int i5 = 15 / 0;
                        }
                        return captureUiStateD;
                    }

                    static {
                        int i2 = f15828b + 67;
                        f15829c = i2 % 128;
                        int i3 = i2 % 2;
                    }

                    C02542() {
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$1 */
                static final class AnonymousClass1 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

                    /* JADX INFO: renamed from: d */
                    private static int f15824d = 0;

                    /* JADX INFO: renamed from: e */
                    private static int f15825e = 1;

                    private CaptureUiState e(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15824d + 93;
                        f15825e = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(captureUiState, "");
                            CaptureUiState.f14575e.ErrorFillTheFrame(captureUiState, booleanRef.element);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(captureUiState, "");
                        CaptureUiState captureUiStateErrorFillTheFrame = CaptureUiState.f14575e.ErrorFillTheFrame(captureUiState, booleanRef.element);
                        int i4 = f15824d + 43;
                        f15825e = i4 % 128;
                        int i5 = i4 % 2;
                        return captureUiStateErrorFillTheFrame;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                        int i2 = 2 % 2;
                        int i3 = f15825e + 99;
                        f15824d = i3 % 128;
                        Object obj = null;
                        CaptureUiState captureUiState2 = captureUiState;
                        if (i3 % 2 != 0) {
                            e(captureUiState2);
                            throw null;
                        }
                        CaptureUiState captureUiStateE = e(captureUiState2);
                        int i4 = f15825e + 61;
                        f15824d = i4 % 128;
                        if (i4 % 2 == 0) {
                            return captureUiStateE;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    AnonymousClass1() {
                        super(1);
                    }
                }

                private Object d(DocumentAnalysisEvent.AnalysisAbortEvent v2, Continuation<? super Unit> v3) {
                    /*
                        this = this;
                        r5 = 2
                        int r0 = r5 % r5
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                        com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getAnalytics$p(r0)
                        java.lang.String r0 = r7.getDescription()
                        r1.storeEventValue(r0)
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                        com.incode.welcome_sdk.ui.id_capture.IdCaptureFrameLogger r4 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getFrameLogger$p(r0)
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r1
                        com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getDocumentType$p(r0)
                        com.incode.camera.analysis.document.CaptureInfo r1 = r7.getCaptureInfo()
                        r0 = r7
                        com.incode.camera.analysis.document.DocumentAnalysisEvent r0 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r0
                        r3 = 0
                        r4.addFrameLogAndSendConditionally(r2, r1, r0, r3)
                        boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Blur
                        if (r0 == 0) goto L4a
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$5 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.C02555.f15846e
                        kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15820a
                        int r1 = r0 + 95
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15821b = r0
                    L3c:
                        int r1 = r1 % r5
                    L3d:
                        r0 = 1500(0x5dc, double:7.41E-321)
                        java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r0, r8)
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        if (r1 != r0) goto L9d
                        return r1
                    L4a:
                        boolean r1 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.Glare
                        r0 = 1
                        if (r1 == r0) goto L8a
                        boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.NotAligned
                        if (r0 == 0) goto L5d
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$4 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.AnonymousClass4.f15837a
                        kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                        goto L3d
                    L5d:
                        boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.TooDark
                        if (r0 == 0) goto L73
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$2 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.C02542.f15831e
                        kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15821b
                        int r1 = r0 + 67
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15820a = r0
                        goto L3c
                    L73:
                        boolean r0 = r7 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.NoDocumentDetected
                        if (r0 == 0) goto L3d
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r2 = r1
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$1 r1 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$1
                        kotlin.jvm.internal.Ref$BooleanRef r0 = r2
                        r1.<init>()
                        kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r2, r1)
                        kotlin.jvm.internal.Ref$BooleanRef r0 = r2
                        r0.element = r3
                        goto L3d
                    L8a:
                        int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15820a
                        int r1 = r0 + 107
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.f15821b = r0
                        int r1 = r1 % r5
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = r1
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ab$2$5$3 r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.AnonymousClass3.f15833b
                        kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiState(r1, r0)
                        goto L3d
                    L9d:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ab.AnonymousClass2.AnonymousClass5.d(com.incode.camera.analysis.document.DocumentAnalysisEvent$AnalysisAbortEvent, kotlin.coroutines.Continuation):java.lang.Object");
                }

                AnonymousClass5(Ref.BooleanRef booleanRef2) {
                    booleanRef = booleanRef2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15814c + 111;
                f15815i = i3 % 128;
                int i4 = i3 % 2;
                Object objC = c(coroutineScope, continuation);
                int i5 = f15814c + 105;
                f15815i = i5 % 128;
                if (i5 % 2 != 0) {
                    return objC;
                }
                throw null;
            }

            private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15815i + 123;
                f15814c = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f15815i + 85;
                f15814c = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f15819e, this.f15816a, this.f15818d, continuation);
                int i3 = f15814c + 61;
                f15815i = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IdCaptureViewModel idCaptureViewModel, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f15819e = idCaptureViewModel;
                this.f15816a = booleanRef;
                this.f15818d = booleanRef2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15807f + 117;
            f15808i = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 54 / 0;
            }
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15808i + 91;
            f15807f = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((ab) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 1 / 0;
            }
            int i6 = f15807f + 59;
            f15808i = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ab abVar = IdCaptureViewModel.this.new ab(this.f15811c, continuation);
            abVar.f15809a = obj;
            ab abVar2 = abVar;
            int i3 = f15808i + 81;
            f15807f = i3 % 128;
            int i4 = i3 % 2;
            return abVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ab(Ref.BooleanRef booleanRef, Continuation<? super ab> continuation) {
            super(2, continuation);
            this.f15811c = booleanRef;
        }
    }

    private final void g() {
        int i2 = 2 % 2;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f15748h, null, new ab(booleanRef, null), 2, null);
        int i3 = A + 47;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void onEvent(IdCaptureUiEvent idCaptureUiEvent) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idCaptureUiEvent, "");
        this.f15746f.handleCaptureUiEvent(idCaptureUiEvent);
        Object obj = null;
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpClicked.f15006e)) {
            int i3 = A + 77;
            C = i3 % 128;
            if (i3 % 2 == 0) {
                b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), new Object[]{this}, CameraXActivity.c.c(), 885226910, -885226903);
                return;
            }
            b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), new Object[]{this}, CameraXActivity.c.c(), 885226910, -885226903);
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpCloseClicked.f15007b)) {
            i();
            int i4 = C + 19;
            A = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpScanClicked.f15013a)) {
            m();
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpManualScanClicked.f15011d)) {
            j();
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ManualCaptureClicked.f15016b)) {
            int i5 = C + 81;
            A = i5 % 128;
            int i6 = i5 % 2;
            x();
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ContinueClicked.f15002d)) {
            p();
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.RetakeScanClicked.f15019b)) {
            s();
            return;
        }
        if (!(!Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ScanTheBackClicked.f15027c))) {
            q();
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ScanTheFrontClicked.f15029b)) {
            l();
            return;
        }
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.RetryClicked.f15024e)) {
            o();
            return;
        }
        if (!Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.CloseClicked.f15000d)) {
            if (idCaptureUiEvent instanceof IdCaptureUiEvent.SmallScreenDeviceDetected) {
                f();
                return;
            }
            return;
        }
        int i7 = C + 91;
        A = i7 % 128;
        if (i7 % 2 != 0) {
            k();
        } else {
            k();
            obj.hashCode();
            throw null;
        }
    }

    private final void f() {
        int i2 = 2 % 2;
        int i3 = A + 89;
        C = i3 % 128;
        this.f15758r = i3 % 2 == 0;
    }

    private final void j() {
        int i2 = 2 % 2;
        int i3 = C + 71;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.f15752l.cancelAutoCaptureTimers();
        t();
        int i5 = C + 117;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16013a = 0;

        /* JADX INFO: renamed from: c */
        private static int f16014c = 1;

        /* JADX INFO: renamed from: d */
        private int f16015d;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$h$1 */
        static final class AnonymousClass1 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: d */
            private static int f16017d = 0;

            /* JADX INFO: renamed from: e */
            private static int f16018e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16017d + 17;
                f16018e = i3 % 128;
                int i4 = i3 % 2;
                CaptureUiState captureUiStateC = c(captureUiState);
                int i5 = f16017d + 79;
                f16018e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 13 / 0;
                }
                return captureUiStateC;
            }

            private CaptureUiState c(CaptureUiState captureUiState) {
                CaptureUiState.BottomButton bottomButton;
                int i2 = 2 % 2;
                int i3 = f16018e + 21;
                f16017d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(captureUiState, "");
                if (IdCaptureViewModel.access$isManualCaptureMode$p(idCaptureViewModel)) {
                    int i5 = f16018e + 33;
                    f16017d = i5 % 128;
                    int i6 = i5 % 2;
                    bottomButton = CaptureUiState.BottomButton.f14603c;
                } else {
                    bottomButton = null;
                }
                return CaptureUiState.f14575e.CloseHelpScreen(captureUiState, bottomButton, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel));
            }

            AnonymousClass1() {
                super(1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IdCaptureViewModel.access$updateUiState(IdCaptureViewModel.this, new Function1<CaptureUiState, CaptureUiState>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.h.1

                /* JADX INFO: renamed from: d */
                private static int f16017d = 0;

                /* JADX INFO: renamed from: e */
                private static int f16018e = 1;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                    int i22 = 2 % 2;
                    int i3 = f16017d + 17;
                    f16018e = i3 % 128;
                    int i4 = i3 % 2;
                    CaptureUiState captureUiStateC = c(captureUiState);
                    int i5 = f16017d + 79;
                    f16018e = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 13 / 0;
                    }
                    return captureUiStateC;
                }

                private CaptureUiState c(CaptureUiState captureUiState) {
                    CaptureUiState.BottomButton bottomButton;
                    int i22 = 2 % 2;
                    int i3 = f16018e + 21;
                    f16017d = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(captureUiState, "");
                    if (IdCaptureViewModel.access$isManualCaptureMode$p(idCaptureViewModel)) {
                        int i5 = f16018e + 33;
                        f16017d = i5 % 128;
                        int i6 = i5 % 2;
                        bottomButton = CaptureUiState.BottomButton.f14603c;
                    } else {
                        bottomButton = null;
                    }
                    return CaptureUiState.f14575e.CloseHelpScreen(captureUiState, bottomButton, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel));
                }

                AnonymousClass1() {
                    super(1);
                }
            });
            Unit unit = Unit.INSTANCE;
            int i3 = f16013a + 107;
            f16014c = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16013a + 5;
            f16014c = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 65 / 0;
            }
            int i6 = f16014c + 3;
            f16013a = i6 % 128;
            int i7 = i6 % 2;
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16014c + 3;
            f16013a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f16013a + 103;
            f16014c = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            h hVar = IdCaptureViewModel.this.new h(continuation);
            int i3 = f16013a + 23;
            f16014c = i3 % 128;
            if (i3 % 2 != 0) {
                return hVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }
    }

    private final void i() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
        int i3 = C + 85;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c */
        private static int f16004c = 0;

        /* JADX INFO: renamed from: e */
        private static int f16005e = 1;

        /* JADX INFO: renamed from: b */
        private int f16006b;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$g$1 */
        static final class AnonymousClass1 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: a */
            private static int f16008a = 0;

            /* JADX INFO: renamed from: b */
            private static int f16009b = 1;

            /* JADX INFO: renamed from: c */
            public static final AnonymousClass1 f16010c = ;

            /* JADX INFO: renamed from: d */
            private static int f16011d = 0;

            /* JADX INFO: renamed from: e */
            private static int f16012e = 1;

            private static CaptureUiState d(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16012e + 83;
                f16011d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(captureUiState, "");
                    return CaptureUiState.f14575e.HelpScreen(captureUiState);
                }
                Intrinsics.checkNotNullParameter(captureUiState, "");
                int i4 = 48 / 0;
                return CaptureUiState.f14575e.HelpScreen(captureUiState);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16012e + 111;
                f16011d = i3 % 128;
                CaptureUiState captureUiState2 = captureUiState;
                if (i3 % 2 != 0) {
                    d(captureUiState2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CaptureUiState captureUiStateD = d(captureUiState2);
                int i4 = f16011d + 63;
                f16012e = i4 % 128;
                int i5 = i4 % 2;
                return captureUiStateD;
            }

            static {
                int i2 = f16009b + 29;
                f16008a = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            AnonymousClass1() {
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16005e + 17;
            f16004c = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IdCaptureViewModel.access$updateUiState(IdCaptureViewModel.this, AnonymousClass1.f16010c);
            Unit unit = Unit.INSTANCE;
            int i5 = f16004c + 101;
            f16005e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16004c + 27;
            f16005e = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                return c(coroutineScope2, continuation2);
            }
            c(coroutineScope2, continuation2);
            throw null;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16004c + 73;
            f16005e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 65 / 0;
            }
            int i6 = f16004c + 43;
            f16005e = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            g gVar = IdCaptureViewModel.this.new g(continuation);
            int i3 = f16004c + 121;
            f16005e = i3 % 128;
            int i4 = i3 % 2;
            return gVar;
        }

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }
    }

    private final void o() {
        int i2 = 2 % 2;
        int i3 = C + 51;
        A = i3 % 128;
        int i4 = i3 % 2;
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{this}, iC3, -413089780, 413089781);
        int i5 = C + 81;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void k() {
        int i2 = 2 % 2;
        int i3 = C + 35;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.f15750j.getModuleQuitAttempt().invoke();
        int i5 = C + 59;
        A = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16084a = 0;

        /* JADX INFO: renamed from: e */
        private static int f16085e = 1;

        /* JADX INFO: renamed from: b */
        private int f16086b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f16086b;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                IdCaptureViewModel.access$setDocumentType$p(IdCaptureViewModel.this, DocumentType.FRONT_ID);
                this.f16086b = 1;
                if (IdCaptureViewModel.access$proceedWithNextSideCapture(IdCaptureViewModel.this, this) == coroutine_suspended) {
                    int i4 = f16084a + 27;
                    f16085e = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = f16085e + 77;
            f16084a = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16084a + 37;
            f16085e = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            int i5 = f16084a + 63;
            f16085e = i5 % 128;
            int i6 = i5 % 2;
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16084a + 45;
            f16085e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f16085e + 13;
            f16084a = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            m mVar = IdCaptureViewModel.this.new m(continuation);
            int i3 = f16084a + 27;
            f16085e = i3 % 128;
            int i4 = i3 % 2;
            return mVar;
        }

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }
    }

    private final void l() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m(null), 3, null);
        int i3 = A + 107;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16059a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16060b = 0;

        /* JADX INFO: renamed from: d */
        private int f16062d;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$j$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: d */
            private static int f16063d = 1;

            /* JADX INFO: renamed from: e */
            private static int f16064e = 0;

            private CaptureUiState b(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16064e + 125;
                f16063d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(captureUiState, "");
                    return CaptureUiState.Companion.Init$default(CaptureUiState.f14575e, captureUiState, null, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel), 1, null);
                }
                Intrinsics.checkNotNullParameter(captureUiState, "");
                return CaptureUiState.Companion.Init$default(CaptureUiState.f14575e, captureUiState, null, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel), 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16064e + 23;
                f16063d = i3 % 128;
                int i4 = i3 % 2;
                CaptureUiState captureUiStateB = b(captureUiState);
                int i5 = f16063d + 73;
                f16064e = i5 % 128;
                if (i5 % 2 == 0) {
                    return captureUiStateB;
                }
                throw null;
            }

            AnonymousClass5() {
                super(1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IdCaptureViewModel.access$updateUiState(IdCaptureViewModel.this, new Function1<CaptureUiState, CaptureUiState>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.j.5

                /* JADX INFO: renamed from: d */
                private static int f16063d = 1;

                /* JADX INFO: renamed from: e */
                private static int f16064e = 0;

                private CaptureUiState b(CaptureUiState captureUiState) {
                    int i22 = 2 % 2;
                    int i3 = f16064e + 125;
                    f16063d = i3 % 128;
                    if (i3 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(captureUiState, "");
                        return CaptureUiState.Companion.Init$default(CaptureUiState.f14575e, captureUiState, null, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel), 1, null);
                    }
                    Intrinsics.checkNotNullParameter(captureUiState, "");
                    return CaptureUiState.Companion.Init$default(CaptureUiState.f14575e, captureUiState, null, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel), 1, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                    int i22 = 2 % 2;
                    int i3 = f16064e + 23;
                    f16063d = i3 % 128;
                    int i4 = i3 % 2;
                    CaptureUiState captureUiStateB = b(captureUiState);
                    int i5 = f16063d + 73;
                    f16064e = i5 % 128;
                    if (i5 % 2 == 0) {
                        return captureUiStateB;
                    }
                    throw null;
                }

                AnonymousClass5() {
                    super(1);
                }
            });
            Unit unit = Unit.INSTANCE;
            int i3 = f16060b + 59;
            f16059a = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16060b + 59;
            f16059a = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f16059a + 85;
            f16060b = i5 % 128;
            int i6 = i5 % 2;
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16060b + 91;
            f16059a = i3 % 128;
            int i4 = i3 % 2;
            j jVar = (j) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return jVar.invokeSuspend(unit);
            }
            jVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            j jVar = IdCaptureViewModel.this.new j(continuation);
            int i3 = f16060b + 19;
            f16059a = i3 % 128;
            int i4 = i3 % 2;
            return jVar;
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }
    }

    private final void m() {
        int i2 = 2 % 2;
        this.f15761u = false;
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{this}, iC3, 1550214759, -1550214751);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(null), 3, null);
        int i3 = A + 101;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        public static int f16073a = 0;

        /* JADX INFO: renamed from: c */
        private static int f16074c = 0;

        /* JADX INFO: renamed from: d */
        public static int f16075d = 0;

        /* JADX INFO: renamed from: f */
        private static int f16076f = 1;

        /* JADX INFO: renamed from: e */
        private int f16078e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16076f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16074c = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f16078e;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                IdCaptureViewModel.access$setDocumentType$p(IdCaptureViewModel.this, DocumentType.BACK_ID);
                IdCaptureViewModel.access$updateUiState(IdCaptureViewModel.this, AnonymousClass5.f16079a);
                this.f16078e = 1;
                if (DelayKt.delay(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec, this) == coroutine_suspended) {
                    int i5 = f16076f;
                    int i6 = i5 + 5;
                    f16074c = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 74 / 0;
                    }
                    int i8 = i5 + 87;
                    f16074c = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f16078e = 2;
            if (IdCaptureViewModel.access$proceedWithNextSideCapture(IdCaptureViewModel.this, this) == coroutine_suspended) {
                int i10 = f16076f + 83;
                f16074c = i10 % 128;
                if (i10 % 2 == 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$l$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass5 f16079a = ;

            /* JADX INFO: renamed from: b */
            private static int f16080b = 0;

            /* JADX INFO: renamed from: c */
            private static int f16081c = 1;

            /* JADX INFO: renamed from: d */
            private static int f16082d = 0;

            /* JADX INFO: renamed from: e */
            private static int f16083e = 1;

            private static CaptureUiState b(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16081c + 97;
                f16080b = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(captureUiState, "");
                CaptureUiState captureUiStateShowTheBackOfYourId = CaptureUiState.f14575e.ShowTheBackOfYourId(captureUiState);
                int i5 = f16080b + 73;
                f16081c = i5 % 128;
                if (i5 % 2 != 0) {
                    return captureUiStateShowTheBackOfYourId;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i2 = 2 % 2;
                int i3 = f16080b + 31;
                f16081c = i3 % 128;
                CaptureUiState captureUiState2 = captureUiState;
                if (i3 % 2 != 0) {
                    return b(captureUiState2);
                }
                b(captureUiState2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = f16083e + 53;
                f16082d = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 99 / 0;
                }
            }

            AnonymousClass5() {
            }
        }

        public static int d() {
            int i2 = f16073a;
            int i3 = i2 % 5832314;
            f16073a = i2 + 1;
            if (i3 != 0) {
                return f16075d;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            f16075d = iUptimeMillis;
            return iUptimeMillis;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16076f + 75;
            f16074c = i3 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                b(coroutineScope2, continuation2);
                throw null;
            }
            Object objB = b(coroutineScope2, continuation2);
            int i4 = f16076f + 117;
            f16074c = i4 % 128;
            if (i4 % 2 == 0) {
                return objB;
            }
            obj.hashCode();
            throw null;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16076f + 117;
            f16074c = i3 % 128;
            int i4 = i3 % 2;
            l lVar = (l) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                lVar.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = lVar.invokeSuspend(unit);
            int i5 = f16076f + 35;
            f16074c = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            l lVar = IdCaptureViewModel.this.new l(continuation);
            int i3 = f16074c + 47;
            f16076f = i3 % 128;
            if (i3 % 2 != 0) {
                return lVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }
    }

    private final void q() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l(null), 3, null);
        int i3 = C + 61;
        A = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r5
            boolean r0 = r7 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.w
            r4 = 1
            if (r0 == r4) goto L4d
        L11:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$w r3 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$w
            r3.<init>(r7)
        L16:
            java.lang.Object r1 = r3.f16244b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f16246e
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L5d
            java.lang.Object r0 = r3.f16245c
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L29:
            r0.b()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r1)
            r0 = 0
            r6.f15761u = r0
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = r6.f15747g
            r3.f16245c = r6
            r3.f16246e = r4
            java.lang.Object r0 = r0.clear(r3)
            if (r0 != r2) goto L4b
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r5
            return r2
        L4b:
            r0 = r6
            goto L29
        L4d:
            r3 = r7
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$w r3 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.w) r3
            int r0 = r3.f16246e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L11
            int r0 = r3.f16246e
            int r0 = r0 - r1
            r3.f16246e = r0
            goto L16
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class al extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f15935a = 1;

        /* JADX INFO: renamed from: b */
        private static int f15936b = 0;

        /* JADX INFO: renamed from: c */
        private int f15937c;

        /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0041 A[PHI: r3
  0x0041: PHI (r3v7 com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics) = 
  (r3v1 com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics)
  (r3v8 com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics)
 binds: [B:48:0x00a3, B:36:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[PHI: r3
  0x00a6: PHI (r3v2 com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics) = 
  (r3v1 com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics)
  (r3v8 com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics)
 binds: [B:48:0x00a3, B:36:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15935a
                int r1 = r0 + 53
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15936b = r0
                int r1 = r1 % r4
                r3 = 1
                r2 = 0
                if (r1 == 0) goto Lad
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r6)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                boolean r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$isManualCaptureMode$p(r0)
                r0 = 83
                int r0 = r0 / r2
                if (r1 == r3) goto L7c
            L21:
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15936b
                int r1 = r0 + 119
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15935a = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L90
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$setManualCaptureMode$p(r0, r2)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics r3 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getAnalytics$p(r0)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getDocumentType$p(r0)
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
                if (r1 != r0) goto La6
            L41:
                com.incode.welcome_sdk.data.Event r0 = com.incode.welcome_sdk.data.Event.SWITCH_TO_MANUAL_CAPTURE_BACK_ID
                java.lang.String r2 = r0.getValue()
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15935a
                int r1 = r0 + 25
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15936b = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L54
                r0 = 3
                int r0 = r0 % r4
            L54:
                r3.storeEventValue(r2)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getDocumentType$p(r0)
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.PASSPORT
                if (r1 != r0) goto L8d
                com.incode.welcome_sdk.modules.IdScan$IdType r3 = com.incode.welcome_sdk.modules.IdScan.IdType.PASSPORT
            L63:
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getAnalytics$p(r0)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getDocumentType$p(r0)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.modules.IdScan r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getIdScan$p(r0)
                com.incode.welcome_sdk.IdCategory r0 = r0.getIdCategory()
                r2.sendSwitchToManualEvent(r1, r0, r3)
            L7c:
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$updateUiStateToManualCapture(r0)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15935a
                int r1 = r0 + 39
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.f15936b = r0
                int r1 = r1 % r4
                return r2
            L8d:
                com.incode.welcome_sdk.modules.IdScan$IdType r3 = com.incode.welcome_sdk.modules.IdScan.IdType.ID
                goto L63
            L90:
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$setManualCaptureMode$p(r0, r3)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics r3 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getAnalytics$p(r0)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getDocumentType$p(r0)
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
                if (r1 != r0) goto La6
                goto L41
            La6:
                com.incode.welcome_sdk.data.Event r0 = com.incode.welcome_sdk.data.Event.SWITCH_TO_MANUAL_CAPTURE_FRONT_ID
                java.lang.String r2 = r0.getValue()
                goto L54
            Lad:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r6)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                boolean r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$isManualCaptureMode$p(r0)
                if (r0 != 0) goto L7c
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.al.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15936b + 121;
            f15935a = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 73 / 0;
            }
            int i6 = f15936b + 71;
            f15935a = i6 % 128;
            int i7 = i6 % 2;
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15935a + 49;
            f15936b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((al) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f15935a + 111;
            f15936b = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            al alVar = IdCaptureViewModel.this.new al(continuation);
            int i3 = f15936b + 89;
            f15935a = i3 % 128;
            int i4 = i3 % 2;
            return alVar;
        }

        al(Continuation<? super al> continuation) {
            super(2, continuation);
        }
    }

    private final void t() {
        int i2 = 2 % 2;
        this.f15752l.cancelAutoCaptureTimers();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new al(null), 3, null);
        int i3 = A + 51;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class aq extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: d */
        private static int f15957d = 0;

        /* JADX INFO: renamed from: e */
        private static int f15958e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15958e + 57;
            f15957d = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateE = e(captureUiState);
            if (i4 != 0) {
                int i5 = 76 / 0;
            }
            return captureUiStateE;
        }

        private CaptureUiState e(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15958e + 97;
            f15957d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateTakePhotoManually$default = CaptureUiState.Companion.TakePhotoManually$default(CaptureUiState.f14575e, captureUiState, CaptureUiState.CaptureFrameSpec.Companion.from$default(CaptureUiState.CaptureFrameSpec.f14613b, captureUiState.getCaptureFrameSpec().getDocumentType(), false, false, null, 12, null), false, IdCaptureViewModel.access$isCloseButtonAllowed$p(IdCaptureViewModel.this), 2, null);
            int i5 = f15958e + 53;
            f15957d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
            }
            return captureUiStateTakePhotoManually$default;
        }

        aq() {
            super(1);
        }
    }

    private final void r() {
        int i2 = 2 % 2;
        c(new aq());
        int i3 = A + 15;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void p() {
        int i2 = 2 % 2;
        int i3 = A + 41;
        C = i3 % 128;
        int i4 = i3 % 2;
        this.f15744d.completeIdCapture();
        this.f15750j.getCloseScreenAction().invoke();
        int i5 = A + 53;
        C = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f16066b = 0;

        /* JADX INFO: renamed from: e */
        private static int f16067e = 1;

        /* JADX INFO: renamed from: d */
        private int f16069d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16067e + 39;
            f16066b = i3 % 128;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f16069d;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f16069d = 1;
                if (IdCaptureViewModel.access$getCaptureResultHolder$p(IdCaptureViewModel.this).clear(this) == coroutine_suspended) {
                    int i5 = f16067e + 79;
                    f16066b = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!(!IdCaptureViewModel.access$isManualCaptureMode$p(IdCaptureViewModel.this))) {
                IdCaptureViewModel.access$updateUiStateToManualCapture(IdCaptureViewModel.this);
            } else {
                IdCaptureViewModel.access$updateUiState(IdCaptureViewModel.this, new Function1<CaptureUiState, CaptureUiState>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.k.4

                    /* JADX INFO: renamed from: a */
                    private static int f16070a = 1;

                    /* JADX INFO: renamed from: b */
                    private static int f16071b = 0;

                    private CaptureUiState c(CaptureUiState captureUiState) {
                        int i7 = 2 % 2;
                        int i8 = f16071b + 73;
                        f16070a = i8 % 128;
                        int i9 = i8 % 2;
                        Intrinsics.checkNotNullParameter(captureUiState, "");
                        CaptureUiState captureUiStateInit$default = CaptureUiState.Companion.Init$default(CaptureUiState.f14575e, captureUiState, null, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel), 1, null);
                        int i10 = f16071b + 31;
                        f16070a = i10 % 128;
                        int i11 = i10 % 2;
                        return captureUiStateInit$default;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                        int i7 = 2 % 2;
                        int i8 = f16070a + 89;
                        f16071b = i8 % 128;
                        int i9 = i8 % 2;
                        CaptureUiState captureUiStateC = c(captureUiState);
                        if (i9 != 0) {
                            int i10 = 86 / 0;
                        }
                        return captureUiStateC;
                    }

                    AnonymousClass4() {
                        super(1);
                    }
                });
                IdCaptureViewModel.access$startAutoCaptureExpirationTimer(IdCaptureViewModel.this);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$k$4 */
        static final class AnonymousClass4 extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

            /* JADX INFO: renamed from: a */
            private static int f16070a = 1;

            /* JADX INFO: renamed from: b */
            private static int f16071b = 0;

            private CaptureUiState c(CaptureUiState captureUiState) {
                int i7 = 2 % 2;
                int i8 = f16071b + 73;
                f16070a = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.checkNotNullParameter(captureUiState, "");
                CaptureUiState captureUiStateInit$default = CaptureUiState.Companion.Init$default(CaptureUiState.f14575e, captureUiState, null, IdCaptureViewModel.access$isCloseButtonAllowed$p(idCaptureViewModel), 1, null);
                int i10 = f16071b + 31;
                f16070a = i10 % 128;
                int i11 = i10 % 2;
                return captureUiStateInit$default;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
                int i7 = 2 % 2;
                int i8 = f16070a + 89;
                f16071b = i8 % 128;
                int i9 = i8 % 2;
                CaptureUiState captureUiStateC = c(captureUiState);
                if (i9 != 0) {
                    int i10 = 86 / 0;
                }
                return captureUiStateC;
            }

            AnonymousClass4() {
                super(1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16066b + 63;
            f16067e = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            int i5 = f16066b + 61;
            f16067e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16066b + 11;
            f16067e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f16066b + 71;
            f16067e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            k kVar = IdCaptureViewModel.this.new k(continuation);
            int i3 = f16067e + 17;
            f16066b = i3 % 128;
            int i4 = i3 % 2;
            return kVar;
        }

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }
    }

    private final void s() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
        int i3 = C + 43;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class f extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: c */
        private static int f16001c = 0;

        /* JADX INFO: renamed from: d */
        private static int f16002d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f16001c + 59;
            f16002d = i3 % 128;
            CaptureUiState captureUiState2 = captureUiState;
            if (i3 % 2 != 0) {
                return b(captureUiState2);
            }
            b(captureUiState2);
            throw null;
        }

        private CaptureUiState b(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f16002d + 95;
            f16001c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateTakePhotoManually = CaptureUiState.f14575e.TakePhotoManually(captureUiState, captureUiState.getCaptureFrameSpec(), false, IdCaptureViewModel.access$isCloseButtonAllowed$p(IdCaptureViewModel.this));
            int i5 = f16001c + 123;
            f16002d = i5 % 128;
            if (i5 % 2 != 0) {
                return captureUiStateTakePhotoManually;
            }
            throw null;
        }

        f() {
            super(1);
        }
    }

    static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16055a = 1;

        /* JADX INFO: renamed from: c */
        private static int f16056c = 0;

        /* JADX INFO: renamed from: d */
        private int f16058d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f16058d;
            Object obj2 = null;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f16058d = 1;
                obj = IdCaptureViewModel.access$singleNextCapture(IdCaptureViewModel.this, this);
                if (obj == coroutine_suspended) {
                    int i4 = f16056c + 17;
                    f16055a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Timber.Forest.d("Manual capture obtained for documentType: " + IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this), new Object[0]);
                    IdCaptureViewModel.access$startDocumentUpload(IdCaptureViewModel.this);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            CaptureResultHolder captureResultHolderAccess$getCaptureResultHolder$p = IdCaptureViewModel.access$getCaptureResultHolder$p(IdCaptureViewModel.this);
            this.f16058d = 2;
            if (captureResultHolderAccess$getCaptureResultHolder$p.updateManualCapture((Bitmap) obj, this) == coroutine_suspended) {
                int i5 = f16056c + 53;
                f16055a = i5 % 128;
                if (i5 % 2 != 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
            Timber.Forest.d("Manual capture obtained for documentType: " + IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this), new Object[0]);
            IdCaptureViewModel.access$startDocumentUpload(IdCaptureViewModel.this);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16056c + 47;
            f16055a = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(coroutineScope, continuation);
            int i5 = f16055a + 17;
            f16056c = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16056c + 67;
            f16055a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 28 / 0;
            }
            int i6 = f16056c + 91;
            f16055a = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            i iVar = IdCaptureViewModel.this.new i(continuation);
            int i3 = f16056c + 95;
            f16055a = i3 % 128;
            int i4 = i3 % 2;
            return iVar;
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }
    }

    private final void x() {
        int i2 = 2 % 2;
        c(new f());
        Timber.Forest.d("Manual capture requested for documentType: " + this.f15760t, new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f15766z, null, new i(null), 2, null);
        int i3 = C + 91;
        A = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class ak extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f */
        private static int f15920f = 1;

        /* JADX INFO: renamed from: h */
        private static int f15921h = 0;

        /* JADX INFO: renamed from: a */
        private Object f15922a;

        /* JADX INFO: renamed from: b */
        private Object f15923b;

        /* JADX INFO: renamed from: c */
        private Object f15924c;

        /* JADX INFO: renamed from: d */
        private int f15925d;

        /* JADX INFO: renamed from: e */
        private Object f15926e;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ Object f15928i;

        /* JADX INFO: renamed from: j */
        private int f15929j;

        /* JADX WARN: Code restructure failed: missing block: B:102:0x0055, code lost:
        
            if (r0 == 5) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x01d0, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x002b, code lost:
        
            if (r9 == 5) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x002d, code lost:
        
            r3 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel) r21.f15928i;
            kotlin.ResultKt.throwOnFailure(r14);
            r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ak.f15921h + 81;
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ak.f15920f = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x01c8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:162:0x01ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ak.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IdScanResult>, Object> {

            /* JADX INFO: renamed from: a */
            private static int f15930a = 1;

            /* JADX INFO: renamed from: d */
            private static int f15931d = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Bitmap f15932b;

            /* JADX INFO: renamed from: c */
            private int f15933c;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ IdCaptureViewModel f15934e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Size resolution;
                Object objAccess$performInjectionDetection = obj;
                int i2 = 2 % 2;
                int i3 = f15931d + 11;
                f15930a = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.f15933c;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(objAccess$performInjectionDetection);
                    this.f15933c = 1;
                    objAccess$performInjectionDetection = IdCaptureViewModel.access$performInjectionDetection(this.f15934e, this);
                    if (objAccess$performInjectionDetection == coroutine_suspended) {
                        int i5 = f15930a + 123;
                        f15931d = i5 % 128;
                        if (i5 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objAccess$performInjectionDetection);
                        return objAccess$performInjectionDetection;
                    }
                    ResultKt.throwOnFailure(objAccess$performInjectionDetection);
                }
                int iIntValue = ((Number) objAccess$performInjectionDetection).intValue();
                s.b metadataBuilder = IdCaptureViewModel.access$getIdCaptureRepository$p(this.f15934e).getMetadataBuilder();
                IdCaptureViewModel idCaptureViewModel = this.f15934e;
                ResolutionInfo resolutionInfo = IdCaptureViewModel.access$getIncodeCamera$p(idCaptureViewModel).getImagePreview().getResolutionInfo();
                if (resolutionInfo != null && (resolution = resolutionInfo.getResolution()) != null) {
                    metadataBuilder.f9966c = new s.a(resolution.getWidth(), resolution.getHeight());
                }
                metadataBuilder.f9967d = IdCaptureViewModel.access$getIncodeCamera$p(idCaptureViewModel).getConfig().getCameraSelector().getFacing() == IncodeCameraSelector.Facing.FRONT ? CameraFacing.FRONT : CameraFacing.BACK;
                IdCaptureRepository idCaptureRepositoryAccess$getIdCaptureRepository$p = IdCaptureViewModel.access$getIdCaptureRepository$p(this.f15934e);
                IdScan.IdType idTypeAccess$getSelectedIdType$p = IdCaptureViewModel.access$getSelectedIdType$p(this.f15934e);
                DocumentType documentTypeAccess$getDocumentType$p = IdCaptureViewModel.access$getDocumentType$p(this.f15934e);
                com.incode.welcome_sdk.data.remote.beans.f fVar = IdCaptureViewModel.access$getCaptureResultHolder$p(this.f15934e).isManualCapture() ? com.incode.welcome_sdk.data.remote.beans.f.MANUAL : com.incode.welcome_sdk.data.remote.beans.f.AUTO;
                this.f15933c = 2;
                objAccess$performInjectionDetection = idCaptureRepositoryAccess$getIdCaptureRepository$p.storeAndUpload(idTypeAccess$getSelectedIdType$p, documentTypeAccess$getDocumentType$p, fVar, this.f15932b, iIntValue, this);
                if (objAccess$performInjectionDetection == coroutine_suspended) {
                    int i6 = f15931d + 41;
                    f15930a = i6 % 128;
                    if (i6 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
                return objAccess$performInjectionDetection;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super IdScanResult> continuation) {
                int i2 = 2 % 2;
                int i3 = f15930a + 101;
                f15931d = i3 % 128;
                int i4 = i3 % 2;
                Object objA = a(coroutineScope, continuation);
                int i5 = f15931d + 103;
                f15930a = i5 % 128;
                if (i5 % 2 != 0) {
                    return objA;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Object a(CoroutineScope coroutineScope, Continuation<? super IdScanResult> continuation) {
                int i2 = 2 % 2;
                int i3 = f15930a + 113;
                f15931d = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f15930a + 71;
                f15931d = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                a aVar = new a(this.f15934e, this.f15932b, continuation);
                int i3 = f15930a + 99;
                f15931d = i3 % 128;
                if (i3 % 2 == 0) {
                    return aVar;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(IdCaptureViewModel idCaptureViewModel, Bitmap bitmap, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f15934e = idCaptureViewModel;
                this.f15932b = bitmap;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15920f + 17;
            f15921h = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                a(coroutineScope2, continuation2);
                throw null;
            }
            Object objA = a(coroutineScope2, continuation2);
            int i4 = f15921h + 41;
            f15920f = i4 % 128;
            int i5 = i4 % 2;
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15921h + 65;
            f15920f = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((ak) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f15921h + 63;
            f15920f = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ak akVar = IdCaptureViewModel.this.new ak(continuation);
            akVar.f15928i = obj;
            ak akVar2 = akVar;
            int i3 = f15921h + 47;
            f15920f = i3 % 128;
            int i4 = i3 % 2;
            return akVar2;
        }

        ak(Continuation<? super ak> continuation) {
            super(2, continuation);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
        int i2 = 2 % 2;
        Object obj = null;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(idCaptureViewModel), idCaptureViewModel.f15766z.plus(idCaptureViewModel.f15748h), null, idCaptureViewModel.new ak(null), 2, null);
        int i3 = C + 19;
        A = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void c(Function1<? super CaptureUiState, CaptureUiState> function1) {
        CaptureUiState value;
        int i2 = 2 % 2;
        int i3 = A + 65;
        C = i3 % 128;
        int i4 = i3 % 2;
        CaptureUiState value2 = this.f15763w.getValue();
        MutableStateFlow<CaptureUiState> mutableStateFlow = this.f15763w;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, function1.invoke(value)));
        int i5 = A + 103;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {this, value2, this.f15763w.getValue()};
            b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), objArr, CameraXActivity.c.c(), 1856043678, -1856043676);
            return;
        }
        Object[] objArr2 = {this, value2, this.f15763w.getValue()};
        b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), objArr2, CameraXActivity.c.c(), 1856043678, -1856043676);
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
        CaptureUiState captureUiState = (CaptureUiState) objArr[1];
        CaptureUiState captureUiState2 = (CaptureUiState) objArr[2];
        int i2 = 2 % 2;
        int i3 = C + 33;
        A = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.f15756p.pauseImageProcessing(idCaptureViewModel.v());
        idCaptureViewModel.f15746f.trackUIStateUpdateIfNeeded(captureUiState, captureUiState2);
        int i5 = A + 63;
        C = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object d(com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.d(com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c */
        private static int f15992c = 0;

        /* JADX INFO: renamed from: e */
        private static int f15993e = 1;

        /* JADX INFO: renamed from: a */
        private int f15994a;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ DocumentAnalysisEvent.CaptureCandidateGenerated f15996d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15993e + 75;
            f15992c = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f15994a;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                final IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1 idCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1 = new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: d */
                    private static int f16020d = 1;

                    /* JADX INFO: renamed from: e */
                    private static int f16021e = 0;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: c */
                        private static int f16023c = 1;

                        /* JADX INFO: renamed from: e */
                        private static int f16024e = 0;

                        /* JADX INFO: renamed from: a */
                        private /* synthetic */ FlowCollector f16025a;

                        /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                            /*
                                r7 = this;
                                r6 = 2
                                int r0 = r6 % r6
                                boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                r5 = 1
                                r0 = r0 ^ r5
                                if (r0 == r5) goto L55
                                r4 = r9
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r4
                                int r0 = r4.f16031d
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L55
                                int r0 = r4.f16031d
                                int r0 = r0 - r1
                                r4.f16031d = r0
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16024e
                                int r1 = r0 + 79
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16023c = r0
                                int r1 = r1 % r6
                            L21:
                                java.lang.Object r1 = r4.f16030a
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r4.f16031d
                                if (r0 == 0) goto L33
                                if (r0 != r5) goto L5b
                                kotlin.ResultKt.throwOnFailure(r1)
                            L30:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            L33:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r2 = r7.f16025a
                                r0 = r4
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r0 = r8
                                com.incode.camera.analysis.document.DocumentAnalysisEvent r0 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r0
                                boolean r0 = r0 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated
                                if (r0 != 0) goto L43
                                goto L30
                            L43:
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16024e
                                int r1 = r0 + 53
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f16023c = r0
                                int r1 = r1 % r6
                                r4.f16031d = r5
                                java.lang.Object r0 = r2.emit(r8, r4)
                                if (r0 != r3) goto L30
                                return r3
                            L55:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1$2$1 r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1$2$1
                                r4.<init>(r9)
                                goto L21
                            L5b:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1$2$1 */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: b */
                            public static int f16026b = 0;

                            /* JADX INFO: renamed from: c */
                            public static int f16027c = 0;

                            /* JADX INFO: renamed from: g */
                            private static int f16028g = 0;

                            /* JADX INFO: renamed from: j */
                            private static int f16029j = 1;

                            /* JADX INFO: renamed from: a */
                            /* synthetic */ Object f16030a;

                            /* JADX INFO: renamed from: d */
                            int f16031d;

                            public static int a() {
                                int i2 = f16026b;
                                int i3 = i2 % 7206954;
                                f16026b = i2 + 1;
                                if (i3 != 0) {
                                    return f16027c;
                                }
                                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                f16027c = iMaxMemory;
                                return iMaxMemory;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object objEmit;
                                int i2 = 2 % 2;
                                int i3 = f16029j + 29;
                                f16028g = i3 % 128;
                                int i4 = i3 % 2;
                                this.f16030a = obj;
                                this.f16031d |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i4 != 0) {
                                    objEmit = anonymousClass2.emit(null, this);
                                    int i5 = 85 / 0;
                                } else {
                                    objEmit = anonymousClass2.emit(null, this);
                                }
                                int i6 = f16028g + 123;
                                f16029j = i6 % 128;
                                int i7 = i6 % 2;
                                return objEmit;
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f16025a = flowCollector;
                        }
                    }

                    public IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1() {
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                        int i6 = 2 % 2;
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i7 = f16021e + 21;
                        f16020d = i7 % 128;
                        int i8 = i7 % 2;
                        return objCollect;
                    }
                };
                this.f15994a = 1;
                if (FlowKt.conflate(new Flow<DocumentAnalysisEvent.CaptureCandidateGenerated>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f16033d = 1;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f16034e = 0;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private static int f16036a = 1;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f16037b = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f16038d;

                        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                            /*
                                r6 = this;
                                r5 = 2
                                int r0 = r5 % r5
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16036a
                                int r1 = r0 + 93
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16037b = r0
                                int r1 = r1 % r5
                                boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L60
                                r4 = r8
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                int r0 = r4.f16043d
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L60
                                int r0 = r4.f16043d
                                int r0 = r0 - r1
                                r4.f16043d = r0
                            L1f:
                                java.lang.Object r1 = r4.f16041b
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r4.f16043d
                                r2 = 1
                                if (r0 == 0) goto L3b
                                if (r0 != r2) goto L66
                                kotlin.ResultKt.throwOnFailure(r1)
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16036a
                                int r1 = r0 + 67
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16037b = r0
                                int r1 = r1 % r5
                            L38:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            L3b:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r1 = r6.f16038d
                                r0 = r4
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                com.incode.camera.analysis.document.DocumentAnalysisEvent r7 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r7
                                java.lang.String r0 = ""
                                kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
                                com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r7 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r7
                                r4.f16043d = r2
                                java.lang.Object r0 = r1.emit(r7, r4)
                                if (r0 != r3) goto L38
                                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16037b
                                int r1 = r0 + 51
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.f16036a = r0
                                int r1 = r1 % r5
                                if (r1 == 0) goto L6e
                                return r3
                            L60:
                                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1$2$1 r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1$2$1
                                r4.<init>(r8)
                                goto L1f
                            L66:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            L6e:
                                r0 = 0
                                r0.hashCode()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private static int f16039a = 0;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f16040e = 1;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f16041b;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            int f16043d;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f16040e + 17;
                                f16039a = i3 % 128;
                                int i4 = i3 % 2;
                                this.f16041b = obj;
                                this.f16043d |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i5 = f16039a + 97;
                                f16040e = i5 % 128;
                                if (i5 % 2 != 0) {
                                    return objEmit;
                                }
                                throw null;
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f16038d = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super DocumentAnalysisEvent.CaptureCandidateGenerated> flowCollector, Continuation continuation) {
                        int i6 = 2 % 2;
                        Object objCollect = idCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i7 = f16034e + 1;
                        f16033d = i7 % 128;
                        if (i7 % 2 != 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }).collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.1

                    /* JADX INFO: renamed from: b */
                    private static int f15997b = 0;

                    /* JADX INFO: renamed from: c */
                    private static int f15998c = 1;

                    /* JADX INFO: renamed from: d */
                    private /* synthetic */ IdCaptureViewModel f16000d;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = f15997b + 55;
                        f15998c = i7 % 128;
                        DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated = (DocumentAnalysisEvent.CaptureCandidateGenerated) obj2;
                        if (i7 % 2 != 0) {
                            return d(captureCandidateGenerated, continuation);
                        }
                        d(captureCandidateGenerated, continuation);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
                    
                        if (r3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L21;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
                    
                        r1 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15997b + 41;
                        com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15998c = r1 % 128;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
                    
                        if ((r1 % 2) != 0) goto L24;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
                    
                        r0 = 88 / 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
                    
                        return r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
                    
                        if (r3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L21;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
                    
                        return kotlin.Unit.INSTANCE;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private java.lang.Object d(com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                        /*
                            r6 = this;
                            r5 = 2
                            int r0 = r5 % r5
                            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15997b
                            int r1 = r0 + 25
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15998c = r0
                            int r1 = r1 % r5
                            r2 = 0
                            java.lang.String r4 = "Score check -> new score obtained for check: "
                            if (r1 != 0) goto L47
                            timber.log.Timber$Forest r3 = timber.log.Timber.Forest
                            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r1 = r1
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>(r4)
                            java.lang.StringBuilder r0 = r0.append(r1)
                            java.lang.String r1 = r0.toString()
                            r0 = 1
                            java.lang.Object[] r0 = new java.lang.Object[r0]
                            r3.d(r1, r0)
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r2
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getCaptureResultHolder$p(r0)
                            java.lang.Object r3 = r0.updateAutoCaptureResultConditionally(r7, r8)
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            if (r3 != r0) goto L6e
                        L38:
                            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15997b
                            int r1 = r0 + 41
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15998c = r0
                            int r1 = r1 % r5
                            if (r1 != 0) goto L46
                            r0 = 88
                            int r0 = r0 / r2
                        L46:
                            return r3
                        L47:
                            timber.log.Timber$Forest r3 = timber.log.Timber.Forest
                            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r1 = r1
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>(r4)
                            java.lang.StringBuilder r0 = r0.append(r1)
                            java.lang.String r1 = r0.toString()
                            java.lang.Object[] r0 = new java.lang.Object[r2]
                            r3.d(r1, r0)
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r2
                            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getCaptureResultHolder$p(r0)
                            java.lang.Object r3 = r0.updateAutoCaptureResultConditionally(r7, r8)
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            if (r3 != r0) goto L6e
                            goto L38
                        L6e:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.d(com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated, kotlin.coroutines.Continuation):java.lang.Object");
                    }

                    AnonymousClass1(IdCaptureViewModel idCaptureViewModel) {
                        idCaptureViewModel = idCaptureViewModel;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = f15992c + 43;
            f15993e = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$e$1 */
        static final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: b */
            private static int f15997b = 0;

            /* JADX INFO: renamed from: c */
            private static int f15998c = 1;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ IdCaptureViewModel f16000d;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                int i6 = 2 % 2;
                int i7 = f15997b + 55;
                f15998c = i7 % 128;
                DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated = (DocumentAnalysisEvent.CaptureCandidateGenerated) obj2;
                if (i7 % 2 != 0) {
                    return d(captureCandidateGenerated, continuation);
                }
                d(captureCandidateGenerated, continuation);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            private Object d(DocumentAnalysisEvent.CaptureCandidateGenerated v2, Continuation<? super Unit> v3) {
                /*
                    this = this;
                    r5 = 2
                    int r0 = r5 % r5
                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15997b
                    int r1 = r0 + 25
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15998c = r0
                    int r1 = r1 % r5
                    r2 = 0
                    java.lang.String r4 = "Score check -> new score obtained for check: "
                    if (r1 != 0) goto L47
                    timber.log.Timber$Forest r3 = timber.log.Timber.Forest
                    com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r1 = r1
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r4)
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r1 = r0.toString()
                    r0 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    r3.d(r1, r0)
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r2
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getCaptureResultHolder$p(r0)
                    java.lang.Object r3 = r0.updateAutoCaptureResultConditionally(r7, r8)
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    if (r3 != r0) goto L6e
                L38:
                    int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15997b
                    int r1 = r0 + 41
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.f15998c = r0
                    int r1 = r1 % r5
                    if (r1 != 0) goto L46
                    r0 = 88
                    int r0 = r0 / r2
                L46:
                    return r3
                L47:
                    timber.log.Timber$Forest r3 = timber.log.Timber.Forest
                    com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r1 = r1
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r4)
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r1 = r0.toString()
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3.d(r1, r0)
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = r2
                    com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.access$getCaptureResultHolder$p(r0)
                    java.lang.Object r3 = r0.updateAutoCaptureResultConditionally(r7, r8)
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    if (r3 != r0) goto L6e
                    goto L38
                L6e:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e.AnonymousClass1.d(com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated, kotlin.coroutines.Continuation):java.lang.Object");
            }

            AnonymousClass1(IdCaptureViewModel idCaptureViewModel) {
                idCaptureViewModel = idCaptureViewModel;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15992c + 107;
            f15993e = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 64 / 0;
            }
            return objE;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15992c + 103;
            f15993e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 65 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            e eVar = IdCaptureViewModel.this.new e(this.f15996d, continuation);
            int i3 = f15993e + 1;
            f15992c = i3 % 128;
            if (i3 % 2 == 0) {
                return eVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f15996d = captureCandidateGenerated;
        }
    }

    static final class d extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: d */
        private static int f15974d = 0;

        /* JADX INFO: renamed from: e */
        private static int f15975e = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15976c;

        private CaptureUiState b(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15974d + 53;
            f15975e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateTakingPhoto = CaptureUiState.f14575e.TakingPhoto(captureUiState, Integer.valueOf(this.f15976c));
            int i5 = f15974d + 41;
            f15975e = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateTakingPhoto;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15974d + 43;
            f15975e = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateB = b(captureUiState);
            int i5 = f15974d + 19;
            f15975e = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(1);
            this.f15976c = i2;
        }
    }

    static final class b extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: a */
        private static int f15966a = 0;

        /* JADX INFO: renamed from: b */
        private static int f15967b = 0;

        /* JADX INFO: renamed from: c */
        private static int f15968c = 1;

        /* JADX INFO: renamed from: d */
        private static int f15969d = 1;

        /* JADX INFO: renamed from: e */
        public static final b f15970e = new b();

        private static CaptureUiState a(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15966a + 125;
            f15969d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                return CaptureUiState.f14575e.TakingPhotoFlash(captureUiState);
            }
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState.f14575e.TakingPhotoFlash(captureUiState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15966a + 33;
            f15969d = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateA = a(captureUiState);
            int i5 = f15966a + 65;
            f15969d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
            }
            return captureUiStateA;
        }

        static {
            int i2 = f15968c + 41;
            f15967b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0020 A[PHI: r7
  0x0020: PHI (r7v4 com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ae) = 
  (r7v3 com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ae)
  (r7v6 com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ae)
 binds: [B:88:0x00ff, B:57:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x00c8 -> B:70:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(kotlinx.coroutines.Deferred<com.incode.welcome_sdk.results.IdScanResult> r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.e(kotlinx.coroutines.Deferred, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class af extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: c */
        private static int f15885c = 0;

        /* JADX INFO: renamed from: e */
        private static int f15886e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Ref.FloatRef f15888b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15885c + 113;
            f15886e = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateE = e(captureUiState);
            int i5 = f15886e + 41;
            f15885c = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateE;
        }

        private CaptureUiState e(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            AnalyzingDocumentModel analyzingDocumentModel = IdCaptureViewModel.this.getState().getValue().getAnalyzingDocumentModel();
            AnalyzingDocumentModel analyzingDocumentModelCopy$default = null;
            if (analyzingDocumentModel != null) {
                int i3 = f15886e + 19;
                f15885c = i3 % 128;
                int i4 = i3 % 2;
                analyzingDocumentModelCopy$default = AnalyzingDocumentModel.copy$default(analyzingDocumentModel, 0, this.f15888b.element, 1, null);
            } else {
                int i5 = f15886e + 39;
                f15885c = i5 % 128;
                int i6 = i5 % 2;
            }
            return CaptureUiState.copy$default(captureUiState, false, null, null, analyzingDocumentModelCopy$default, false, false, null, null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, false, null, null, null, 67108855, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        af(Ref.FloatRef floatRef) {
            super(1);
            this.f15888b = floatRef;
        }
    }

    public static final class ai extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: b */
        private static int f15911b = 1;

        /* JADX INFO: renamed from: c */
        public static int f15912c = 0;

        /* JADX INFO: renamed from: d */
        private static int f15913d = 0;

        /* JADX INFO: renamed from: e */
        public static int f15914e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15913d + 67;
            f15911b = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateC = c(captureUiState);
            int i5 = f15913d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15911b = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateC;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.incode.welcome_sdk.ui.id_capture.CaptureUiState c(com.incode.welcome_sdk.ui.id_capture.CaptureUiState r36) {
            /*
                r35 = this;
                r2 = r35
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.f15913d
                int r1 = r0 + 99
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.f15911b = r0
                int r1 = r1 % r5
                java.lang.String r0 = ""
                r4 = 0
                r3 = 1
                r8 = 0
                r6 = r36
                if (r1 != 0) goto L72
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                kotlinx.coroutines.flow.StateFlow r0 = r0.getState()
                java.lang.Object r0 = r0.getValue()
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = (com.incode.welcome_sdk.ui.id_capture.CaptureUiState) r0
                com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel r2 = r0.getAnalyzingDocumentModel()
                if (r2 == 0) goto L89
                r7 = r3
            L2d:
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.f15913d
                int r1 = r0 + 105
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.f15911b = r0
                int r1 = r1 % r5
                if (r1 != 0) goto L6f
                r0 = 0
            L39:
                com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel r10 = com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel.copy$default(r2, r4, r0, r3, r8)
            L3d:
                r33 = 67108855(0x3fffff7, float:1.504632E-36)
                r34 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r9 = r8
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                return r0
            L6f:
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L39
            L72:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.this
                kotlinx.coroutines.flow.StateFlow r0 = r0.getState()
                java.lang.Object r0 = r0.getValue()
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = (com.incode.welcome_sdk.ui.id_capture.CaptureUiState) r0
                com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel r2 = r0.getAnalyzingDocumentModel()
                if (r2 == 0) goto L8a
                r7 = r4
                goto L2d
            L89:
                r4 = r3
            L8a:
                r7 = r4
                r10 = r8
                goto L3d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.c(com.incode.welcome_sdk.ui.id_capture.CaptureUiState):com.incode.welcome_sdk.ui.id_capture.CaptureUiState");
        }

        public static int d() {
            int i2 = f15912c;
            int i3 = i2 % 5150766;
            f15912c = i2 + 1;
            if (i3 != 0) {
                return f15914e;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            f15914e = elapsedCpuTime;
            return elapsedCpuTime;
        }

        ai() {
            super(1);
        }
    }

    public static final class z extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: a */
        public static int f16257a = 0;

        /* JADX INFO: renamed from: b */
        public static int f16258b = 0;

        /* JADX INFO: renamed from: f */
        private static int f16259f = 1;

        /* JADX INFO: renamed from: i */
        private static int f16260i = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ IdCaptureViewModel f16261c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ boolean f16262d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ ImageBitmap f16263e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f16259f + 39;
            f16260i = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateD = d(captureUiState);
            int i5 = f16260i + 113;
            f16259f = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateD;
        }

        private CaptureUiState d(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f16260i + 51;
            f16259f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateAnalyzingDocument$default = CaptureUiState.Companion.AnalyzingDocument$default(CaptureUiState.f14575e, captureUiState, 0.0f, this.f16263e, this.f16262d, IdCaptureViewModel.access$getIdCaptureRepository$p(this.f16261c).isAgeAssuranceUXEnabled(), 1, null);
            int i5 = f16259f + 9;
            f16260i = i5 % 128;
            if (i5 % 2 == 0) {
                return captureUiStateAnalyzingDocument$default;
            }
            throw null;
        }

        public static int d() {
            int i2 = f16257a;
            int i3 = i2 % 6574679;
            f16257a = i2 + 1;
            if (i3 != 0) {
                return f16258b;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            f16258b = iUptimeMillis;
            return iUptimeMillis;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(ImageBitmap imageBitmap, boolean z2, IdCaptureViewModel idCaptureViewModel) {
            super(1);
            this.f16263e = imageBitmap;
            this.f16262d = z2;
            this.f16261c = idCaptureViewModel;
        }
    }

    private final void a(boolean z2, ImageBitmap imageBitmap, Boolean bool) {
        int i2 = 2 % 2;
        Timber.Forest.d("showAnalyzingState called for -> showAsPreviewImage: " + z2 + ", isVertical: " + bool, new Object[0]);
        c(new z(imageBitmap, z2, this));
        int i3 = A + 45;
        C = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
        IdScanResult idScanResult = (IdScanResult) objArr[1];
        int i2 = 2 % 2;
        int i3 = A + 73;
        C = i3 % 128;
        int i4 = i3 % 2;
        idCaptureViewModel.a(idScanResult, (Side) null);
        if (i4 != 0) {
            throw null;
        }
        int i5 = A + 19;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class ao extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: c */
        private static int f15951c = 1;

        /* JADX INFO: renamed from: d */
        private static int f15952d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15951c + 85;
            f15952d = i3 % 128;
            CaptureUiState captureUiState2 = captureUiState;
            if (i3 % 2 == 0) {
                return c(captureUiState2);
            }
            c(captureUiState2);
            throw null;
        }

        private CaptureUiState c(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15951c + 107;
            f15952d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateCopy$default = CaptureUiState.copy$default(CaptureUiState.f14575e.SuccessfullyProcessedScanBack(captureUiState), false, null, null, null, false, false, IdCaptureViewModel.access$withAdjustedMultiplier(IdCaptureViewModel.this, captureUiState.getCaptureFrameSpec()), null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).isAgeAssuranceUXEnabled(), null, null, null, 62914495, null);
            int i5 = f15952d + 23;
            f15951c = i5 % 128;
            if (i5 % 2 != 0) {
                return captureUiStateCopy$default;
            }
            throw null;
        }

        ao() {
            super(1);
        }
    }

    static final class ar extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: a */
        private static int f15960a = 0;

        /* JADX INFO: renamed from: e */
        private static int f15961e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15961e + 81;
            f15960a = i3 % 128;
            CaptureUiState captureUiState2 = captureUiState;
            if (i3 % 2 == 0) {
                return c(captureUiState2);
            }
            c(captureUiState2);
            throw null;
        }

        private CaptureUiState c(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15960a + 75;
            f15961e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateCopy$default = CaptureUiState.copy$default(CaptureUiState.f14575e.SuccessfullyProcessedScanFront(captureUiState), false, null, null, null, false, false, IdCaptureViewModel.access$withAdjustedMultiplier(IdCaptureViewModel.this, captureUiState.getCaptureFrameSpec()), null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).isAgeAssuranceUXEnabled(), null, null, null, 62914495, null);
            int i5 = f15961e + 3;
            f15960a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
            return captureUiStateCopy$default;
        }

        ar() {
            super(1);
        }
    }

    static final class as extends Lambda implements Function1<CaptureUiState, CaptureUiState> {

        /* JADX INFO: renamed from: c */
        private static int f15963c = 0;

        /* JADX INFO: renamed from: d */
        private static int f15964d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CaptureUiState invoke(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15964d + 17;
            f15963c = i3 % 128;
            int i4 = i3 % 2;
            CaptureUiState captureUiStateB = b(captureUiState);
            if (i4 != 0) {
                int i5 = 52 / 0;
            }
            int i6 = f15963c + 51;
            f15964d = i6 % 128;
            int i7 = i6 % 2;
            return captureUiStateB;
        }

        private CaptureUiState b(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f15963c + 107;
            f15964d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateCopy$default = CaptureUiState.copy$default(CaptureUiState.f14575e.SuccessfullyProcessedContinue(captureUiState), false, null, null, null, false, false, IdCaptureViewModel.access$withAdjustedMultiplier(IdCaptureViewModel.this, captureUiState.getCaptureFrameSpec()), null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).isAgeAssuranceUXEnabled(), null, null, null, 62914495, null);
            int i5 = f15963c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15964d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return captureUiStateCopy$default;
        }

        as() {
            super(1);
        }
    }

    private final void a(IdScanResult idScanResult, Side side) {
        int i2 = 2 % 2;
        Timber.Forest.d("Updating state on successful upload for documentType: " + this.f15760t, new Object[0]);
        Object obj = null;
        this.f15756p.setOnFrameCallback(null);
        this.f15746f.sendUploadComplete(this.f15760t);
        if (!idScanResult.getActualIdType().isSingleSided() && !idScanResult.skipBackIdCapture) {
            int i3 = A + 85;
            C = i3 % 128;
            if (i3 % 2 != 0) {
                DocumentType documentType = DocumentType.BACK_ID;
                obj.hashCode();
                throw null;
            }
            if (this.f15760t != DocumentType.BACK_ID) {
                int i4 = A + 35;
                C = i4 % 128;
                int i5 = i4 % 2;
                if (this.f15741a.getScanStep() == IdScan.ScanStep.BOTH && Side.BACK != null) {
                    c(new ao());
                    return;
                }
            }
        }
        if (this.f15760t != DocumentType.FRONT_ID || Side.BACK != null) {
            c(new as());
            return;
        }
        c(new ar());
        int i6 = C + 83;
        A = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0014 A[PHI: r4
  0x0014: PHI (r4v3 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:23:0x0025, B:18:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0028 A[PHI: r4
  0x0028: PHI (r4v1 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:23:0x0025, B:18:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec d(com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec r12) {
        /*
            r11 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r2
            r3 = r12
            if (r1 == 0) goto L22
            boolean r0 = r11.f15758r
            r4 = 1
            if (r0 == 0) goto L28
        L14:
            r5 = 1062836634(0x3f59999a, float:0.85)
        L17:
            r9 = 29
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L22:
            boolean r0 = r11.f15758r
            r4 = 0
            if (r0 == 0) goto L28
            goto L14
        L28:
            float r5 = r3.getMultiplier()
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.d(com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec):com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a(kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L7c
            boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ac
            if (r0 == 0) goto L65
            r5 = r8
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ac r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ac) r5
            int r0 = r5.f15866c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L65
            int r0 = r5.f15866c
            int r0 = r0 - r1
            r5.f15866c = r0
        L21:
            java.lang.Object r4 = r5.f15865b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.f15866c
            r2 = 1
            if (r0 == 0) goto L4a
            if (r0 != r2) goto L74
            java.lang.Object r1 = r5.f15867d
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r1 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L35:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto L48
            boolean r0 = r1.v()
            if (r0 != 0) goto L48
        L43:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r0
        L48:
            r2 = 0
            goto L43
        L4a:
            kotlin.ResultKt.throwOnFailure(r4)
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = r7.f15747g
            r5.f15867d = r7
            r5.f15866c = r2
            java.lang.Object r4 = r0.containsAutoCaptureResult(r5)
            if (r4 != r3) goto L63
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r6
            return r3
        L63:
            r1 = r7
            goto L35
        L65:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ac r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ac
            r5.<init>(r8)
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r6
            goto L21
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7c:
            boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ac
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean v() {
        int i2 = 2 % 2;
        int i3 = C + 95;
        A = i3 % 128;
        int i4 = i3 % 2;
        CaptureUiState value = this.f15762v.getValue();
        if (value.getBottomButton() == null && !value.getShowHelpDialog() && value.getShowCameraPreview()) {
            int i5 = C + 79;
            A = i5 % 128;
            int i6 = i5 % 2;
            if (!value.getShowLoader()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0195 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:84:0x0043, B:118:0x0187, B:120:0x0195, B:122:0x01ab, B:121:0x01a0, B:88:0x005e, B:105:0x00f0, B:109:0x00ff, B:111:0x0107, B:124:0x01af, B:125:0x01ba, B:126:0x01bf), top: B:138:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a0 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:84:0x0043, B:118:0x0187, B:120:0x0195, B:122:0x01ab, B:121:0x01a0, B:88:0x005e, B:105:0x00f0, B:109:0x00ff, B:111:0x0107, B:124:0x01af, B:125:0x01ba, B:126:0x01bf), top: B:138:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x003d  */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.incode.camera.analysis.FrameAnalyzerWrapper, com.incode.camera.analysis.FrameAnalyzerWrapper<com.incode.camera.analysis.document.DocumentAnalysisEvent>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.Ref$IntRef] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$IntRef] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.Ref$IntRef] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.Ref$IntRef] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.Ref$IntRef] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(kotlin.coroutines.Continuation<? super java.lang.Integer> r22) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class r extends Lambda implements Function1<IncodeCamera<?>, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16180a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16181b = 1;

        /* JADX INFO: renamed from: c */
        private static int f16182c = 0;

        /* JADX INFO: renamed from: d */
        public static final r f16183d = new r();

        /* JADX INFO: renamed from: e */
        private static int f16184e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16184e + 101;
            f16180a = i3 % 128;
            int i4 = i3 % 2;
            a(incodeCamera);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f16180a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16184e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16184e + 75;
            f16180a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.resetCameraZoom();
            } else {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.resetCameraZoom();
                throw null;
            }
        }

        static {
            int i2 = f16181b + 25;
            f16182c = i2 % 128;
            int i3 = i2 % 2;
        }

        r() {
            super(1);
        }
    }

    static final class s extends Lambda implements Function1<IncodeCamera<?>, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16185a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16186b = 0;

        /* JADX INFO: renamed from: c */
        public static final s f16187c = new s();

        /* JADX INFO: renamed from: d */
        private static int f16188d = 1;

        /* JADX INFO: renamed from: e */
        private static int f16189e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16186b + 23;
            f16185a = i3 % 128;
            int i4 = i3 % 2;
            d(incodeCamera);
            Unit unit = Unit.INSTANCE;
            int i5 = f16185a + 117;
            f16186b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void d(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16186b + 97;
            f16185a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.zoomCameraToMax();
                int i4 = 94 / 0;
            } else {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.zoomCameraToMax();
            }
            int i5 = f16185a + 31;
            f16186b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
        }

        static {
            int i2 = f16189e + 9;
            f16188d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
        }

        s() {
            super(1);
        }
    }

    static final class p extends SuspendLambda implements Function2<Bitmap, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c */
        private static int f16102c = 0;

        /* JADX INFO: renamed from: i */
        private static int f16103i = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Ref.IntRef f16104a;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Object f16106d;

        /* JADX INFO: renamed from: e */
        private int f16107e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            cb cbVar;
            int i2;
            int i3 = 2 % 2;
            int i4 = f16102c + 59;
            f16103i = i4 % 128;
            int i5 = i4 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f16107e;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                bitmap = (Bitmap) this.f16106d;
                FrameAnalyzer frameAnalyzer = IdCaptureViewModel.access$getFrameAnalyzerWrapper$p(IdCaptureViewModel.this).getFrameAnalyzer();
                Intrinsics.checkNotNull(frameAnalyzer);
                this.f16106d = bitmap;
                this.f16107e = 1;
                obj = frameAnalyzer.processBitmap(bitmap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = (Bitmap) this.f16106d;
                ResultKt.throwOnFailure(obj);
            }
            DocumentAnalysisEvent documentAnalysisEvent = (DocumentAnalysisEvent) obj;
            if (IdCaptureViewModel.access$getDocumentType$p(IdCaptureViewModel.this) == DocumentType.BACK_ID) {
                int i7 = f16102c + 27;
                f16103i = i7 % 128;
                if (i7 % 2 == 0) {
                    cb cbVar2 = cb.f9640b;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                cbVar = cb.f9640b;
            } else {
                cbVar = cb.f9641c;
            }
            IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).sendZoomedFrameIfNeeded$onboard_release(cbVar, bitmap);
            Ref.IntRef intRef = this.f16104a;
            if (IdCaptureViewModel.access$isZoomTestSuccessful(IdCaptureViewModel.this, documentAnalysisEvent)) {
                IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).getMetadataBuilder().f9965b = Status.PASS;
                i2 = 0;
            } else {
                IdCaptureViewModel.access$getIdCaptureRepository$p(IdCaptureViewModel.this).getMetadataBuilder().f9965b = Status.FAIL;
                i2 = -2;
            }
            intRef.element = i2;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Bitmap bitmap, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16103i + 53;
            f16102c = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(bitmap, continuation);
            int i5 = f16102c + 33;
            f16103i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 1 / 0;
            }
            return objB;
        }

        private Object b(Bitmap bitmap, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16103i + 79;
            f16102c = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((p) create(bitmap, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 48 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            p pVar = IdCaptureViewModel.this.new p(this.f16104a, continuation);
            pVar.f16106d = obj;
            p pVar2 = pVar;
            int i3 = f16103i + 111;
            f16102c = i3 % 128;
            if (i3 % 2 == 0) {
                return pVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Ref.IntRef intRef, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f16104a = intRef;
        }
    }

    static final class q extends Lambda implements Function1<IncodeCamera<?>, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16175a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16176b = 1;

        /* JADX INFO: renamed from: c */
        private static int f16177c = 0;

        /* JADX INFO: renamed from: d */
        public static final q f16178d = new q();

        /* JADX INFO: renamed from: e */
        private static int f16179e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16177c + 79;
            f16175a = i3 % 128;
            int i4 = i3 % 2;
            d(incodeCamera);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 86 / 0;
            }
            return unit;
        }

        private static void d(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16177c + 31;
            f16175a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.setMaxExposureCompensation();
            } else {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.setMaxExposureCompensation();
                int i4 = 87 / 0;
            }
        }

        static {
            int i2 = f16176b + 21;
            f16179e = i2 % 128;
            int i3 = i2 % 2;
        }

        q() {
            super(1);
        }
    }

    static final class t extends SuspendLambda implements Function2<Bitmap, Continuation<? super Float>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16226a = 0;

        /* JADX INFO: renamed from: d */
        private static int f16227d = 1;

        /* JADX INFO: renamed from: b */
        private int f16228b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f16229c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16226a + 101;
            f16227d = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Float fBoxFloat = Boxing.boxFloat(IdCaptureViewModel.access$getCenterBrightnessLevel(IdCaptureViewModel.this, (Bitmap) this.f16229c));
            int i5 = f16226a + 105;
            f16227d = i5 % 128;
            int i6 = i5 % 2;
            return fBoxFloat;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Bitmap bitmap, Continuation<? super Float> continuation) {
            int i2 = 2 % 2;
            int i3 = f16226a + 41;
            f16227d = i3 % 128;
            Bitmap bitmap2 = bitmap;
            Continuation<? super Float> continuation2 = continuation;
            if (i3 % 2 != 0) {
                return a(bitmap2, continuation2);
            }
            a(bitmap2, continuation2);
            throw null;
        }

        private Object a(Bitmap bitmap, Continuation<? super Float> continuation) {
            int i2 = 2 % 2;
            int i3 = f16227d + 109;
            f16226a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((t) create(bitmap, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f16227d + 85;
            f16226a = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            t tVar = IdCaptureViewModel.this.new t(continuation);
            tVar.f16229c = obj;
            t tVar2 = tVar;
            int i3 = f16227d + 29;
            f16226a = i3 % 128;
            int i4 = i3 % 2;
            return tVar2;
        }

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }
    }

    static final class u extends Lambda implements Function1<IncodeCamera<?>, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f16231b = 1;

        /* JADX INFO: renamed from: d */
        private static int f16232d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f16233e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16232d + 69;
            f16231b = i3 % 128;
            int i4 = i3 % 2;
            c(incodeCamera);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16231b + 11;
            f16232d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.setExposure(this.f16233e);
            } else {
                Intrinsics.checkNotNullParameter(incodeCamera, "");
                incodeCamera.setExposure(this.f16233e);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i2) {
            super(1);
            this.f16233e = i2;
        }
    }

    static final class y extends Lambda implements Function1<IncodeCamera<?>, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16252a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16253b = 0;

        /* JADX INFO: renamed from: c */
        private static int f16254c = 1;

        /* JADX INFO: renamed from: d */
        private static int f16255d = 0;

        /* JADX INFO: renamed from: e */
        public static final y f16256e = new y();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16254c + 77;
            f16253b = i3 % 128;
            int i4 = i3 % 2;
            c(incodeCamera);
            Unit unit = Unit.INSTANCE;
            int i5 = f16253b + 15;
            f16254c = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void c(IncodeCamera<?> incodeCamera) {
            int i2 = 2 % 2;
            int i3 = f16253b + 65;
            f16254c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(incodeCamera, "");
            incodeCamera.setMinExposureCompensation();
            int i5 = f16254c + 101;
            f16253b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        static {
            int i2 = f16252a + 11;
            f16255d = i2 % 128;
            int i3 = i2 % 2;
        }

        y() {
            super(1);
        }
    }

    static final class x extends SuspendLambda implements Function2<Bitmap, Continuation<? super Float>, Object> {

        /* JADX INFO: renamed from: c */
        private static int f16247c = 1;

        /* JADX INFO: renamed from: e */
        private static int f16248e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Object f16249a;

        /* JADX INFO: renamed from: d */
        private int f16251d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16248e + 7;
            f16247c = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Float fBoxFloat = Boxing.boxFloat(IdCaptureViewModel.access$getCenterBrightnessLevel(IdCaptureViewModel.this, (Bitmap) this.f16249a));
            int i5 = f16248e + 57;
            f16247c = i5 % 128;
            if (i5 % 2 != 0) {
                return fBoxFloat;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Bitmap bitmap, Continuation<? super Float> continuation) {
            int i2 = 2 % 2;
            int i3 = f16248e + 79;
            f16247c = i3 % 128;
            Bitmap bitmap2 = bitmap;
            Continuation<? super Float> continuation2 = continuation;
            if (i3 % 2 != 0) {
                return e(bitmap2, continuation2);
            }
            e(bitmap2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object e(Bitmap bitmap, Continuation<? super Float> continuation) {
            int i2 = 2 % 2;
            int i3 = f16248e + 93;
            f16247c = i3 % 128;
            int i4 = i3 % 2;
            x xVar = (x) create(bitmap, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                xVar.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = xVar.invokeSuspend(unit);
            int i5 = f16247c + 13;
            f16248e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            x xVar = IdCaptureViewModel.this.new x(continuation);
            xVar.f16249a = obj;
            x xVar2 = xVar;
            int i3 = f16248e + 69;
            f16247c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 26 / 0;
            }
            return xVar2;
        }

        x(Continuation<? super x> continuation) {
            super(2, continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> java.lang.Object d(kotlin.jvm.functions.Function1<? super com.incode.camera.IncodeCamera<?>, kotlin.Unit> r9, kotlin.jvm.functions.Function2<? super android.graphics.Bitmap, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r10, kotlin.jvm.functions.Function1<? super com.incode.camera.IncodeCamera<?>, kotlin.Unit> r11, long r12, kotlin.coroutines.Continuation<? super R> r14) {
        /*
            r8 = this;
            r4 = 2
            int r0 = r4 % r4
            boolean r0 = r14 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.am
            if (r0 == 0) goto Lb4
            r6 = r14
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$am r6 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.am) r6
            int r0 = r6.f15947j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto Lb4
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r4
            int r0 = r6.f15947j
            int r0 = r0 - r2
            r6.f15947j = r0
        L1f:
            java.lang.Object r2 = r6.f15944d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.f15947j
            r7 = 0
            r5 = 3
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L62
            if (r0 == r4) goto L87
            if (r0 != r5) goto Lbb
            java.lang.Object r0 = r6.f15941a
            kotlin.ResultKt.throwOnFailure(r2)
        L37:
            r2 = r0
        L38:
            return r2
        L39:
            kotlin.ResultKt.throwOnFailure(r2)
            com.incode.camera.IncodeCamera<com.incode.camera.analysis.document.DocumentAnalysisEvent> r0 = r8.f15745e
            r9.invoke(r0)
            r6.f15941a = r8
            r6.f15945e = r10
            r6.f15943c = r11
            r6.f15942b = r12
            r6.f15947j = r1
            java.lang.Object r2 = r8.b(r6)
            if (r2 != r3) goto L60
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L5f
            r0 = 6
            int r0 = r0 / 0
        L5f:
            return r3
        L60:
            r0 = r8
            goto L73
        L62:
            long r12 = r6.f15942b
            java.lang.Object r11 = r6.f15943c
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r10 = r6.f15945e
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r0 = r6.f15941a
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel) r0
            kotlin.ResultKt.throwOnFailure(r2)
        L73:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r6.f15941a = r0
            r6.f15945e = r11
            r6.f15943c = r7
            r6.f15942b = r12
            r6.f15947j = r4
            java.lang.Object r2 = r10.invoke(r2, r6)
            if (r2 != r3) goto L86
            return r3
        L86:
            goto L94
        L87:
            long r12 = r6.f15942b
            java.lang.Object r11 = r6.f15945e
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r0 = r6.f15941a
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel) r0
            kotlin.ResultKt.throwOnFailure(r2)
        L94:
            if (r11 == 0) goto Laa
            com.incode.camera.IncodeCamera<com.incode.camera.analysis.document.DocumentAnalysisEvent> r0 = r0.f15745e
            r11.invoke(r0)
            r6.f15941a = r2
            r6.f15945e = r7
            r6.f15947j = r5
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r12, r6)
            if (r0 != r3) goto La8
            return r3
        La8:
            r0 = r2
            goto L37
        Laa:
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.C
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.A = r0
            int r1 = r1 % r4
            goto L38
        Lb4:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$am r6 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$am
            r6.<init>(r14)
            goto L1f
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.d(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        IdCaptureViewModel idCaptureViewModel = (IdCaptureViewModel) objArr[0];
        Function1<? super IncodeCamera<?>, Unit> function1 = (Function1) objArr[1];
        Function2 function2 = (Function2) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        Continuation continuation = (Continuation) objArr[4];
        int i2 = 2 % 2;
        int i3 = C + 115;
        A = i3 % 128;
        if (i3 % 2 != 0) {
            return idCaptureViewModel.d(function1, function2, null, jLongValue, continuation);
        }
        idCaptureViewModel.d(function1, function2, null, jLongValue, continuation);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class ah extends SuspendLambda implements Function2<ProducerScope<? super Bitmap>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c */
        private static int f15900c = 0;

        /* JADX INFO: renamed from: e */
        private static int f15901e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Object f15902a;

        /* JADX INFO: renamed from: b */
        private int f15903b;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ah$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<Bitmap, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f15908a = 1;

            /* JADX INFO: renamed from: c */
            private static int f15909c = 0;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ ProducerScope<Bitmap> f15910e;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Bitmap bitmap) {
                int i2 = 2 % 2;
                int i3 = f15909c + 27;
                f15908a = i3 % 128;
                int i4 = i3 % 2;
                d(bitmap);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                throw null;
            }

            private void d(Bitmap bitmap) {
                ProducerScope<Bitmap> producerScope;
                int i2;
                int i3 = 2 % 2;
                int i4 = f15908a + 33;
                f15909c = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bitmap, "");
                    producerScope.mo10484trySendJP2dKIU(bitmap);
                    producerScope = producerScope;
                    i2 = 0;
                } else {
                    Intrinsics.checkNotNullParameter(bitmap, "");
                    producerScope.mo10484trySendJP2dKIU(bitmap);
                    producerScope = producerScope;
                    i2 = 1;
                }
                SendChannel.DefaultImpls.close$default(producerScope, null, i2, null);
                int i5 = f15908a + 9;
                f15909c = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(ProducerScope<? super Bitmap> producerScope) {
                super(1);
                producerScope = producerScope;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15900c + 73;
            f15901e = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f15903b;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f15902a;
                IdCaptureViewModel.access$getFrameAnalyzerWrapper$p(IdCaptureViewModel.this).setOnBitmapCallback(new Function1<Bitmap, Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ah.5

                    /* JADX INFO: renamed from: a */
                    private static int f15908a = 1;

                    /* JADX INFO: renamed from: c */
                    private static int f15909c = 0;

                    /* JADX INFO: renamed from: e */
                    private /* synthetic */ ProducerScope<Bitmap> f15910e;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Bitmap bitmap) {
                        int i22 = 2 % 2;
                        int i32 = f15909c + 27;
                        f15908a = i32 % 128;
                        int i42 = i32 % 2;
                        d(bitmap);
                        Unit unit = Unit.INSTANCE;
                        if (i42 != 0) {
                            return unit;
                        }
                        throw null;
                    }

                    private void d(Bitmap bitmap) {
                        ProducerScope<Bitmap> producerScope2;
                        int i22;
                        int i32 = 2 % 2;
                        int i42 = f15908a + 33;
                        f15909c = i42 % 128;
                        if (i42 % 2 != 0) {
                            Intrinsics.checkNotNullParameter(bitmap, "");
                            producerScope.mo10484trySendJP2dKIU(bitmap);
                            producerScope2 = producerScope;
                            i22 = 0;
                        } else {
                            Intrinsics.checkNotNullParameter(bitmap, "");
                            producerScope.mo10484trySendJP2dKIU(bitmap);
                            producerScope2 = producerScope;
                            i22 = 1;
                        }
                        SendChannel.DefaultImpls.close$default(producerScope2, null, i22, null);
                        int i52 = f15908a + 9;
                        f15909c = i52 % 128;
                        int i6 = i52 % 2;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass5(ProducerScope<? super Bitmap> producerScope2) {
                        super(1);
                        producerScope = producerScope2;
                    }
                });
                this.f15903b = 1;
                if (ProduceKt.awaitClose(producerScope2, new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ah.1

                    /* JADX INFO: renamed from: b */
                    private static int f15905b = 1;

                    /* JADX INFO: renamed from: d */
                    private static int f15906d = 0;

                    private void e() {
                        int i6 = 2 % 2;
                        int i7 = f15905b + 91;
                        f15906d = i7 % 128;
                        int i8 = i7 % 2;
                        IdCaptureViewModel.access$getFrameAnalyzerWrapper$p(idCaptureViewModel).setOnBitmapCallback(null);
                        int i9 = f15905b + 3;
                        f15906d = i9 % 128;
                        int i10 = i9 % 2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i6 = 2 % 2;
                        int i7 = f15906d + 21;
                        f15905b = i7 % 128;
                        int i8 = i7 % 2;
                        e();
                        Unit unit = Unit.INSTANCE;
                        if (i8 != 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }

                    AnonymousClass1() {
                        super(0);
                    }
                }, this) == coroutine_suspended) {
                    int i6 = f15901e + 97;
                    f15900c = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 32 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i8 = f15901e + 123;
            f15900c = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$ah$1 */
        static final class AnonymousClass1 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: b */
            private static int f15905b = 1;

            /* JADX INFO: renamed from: d */
            private static int f15906d = 0;

            private void e() {
                int i6 = 2 % 2;
                int i7 = f15905b + 91;
                f15906d = i7 % 128;
                int i8 = i7 % 2;
                IdCaptureViewModel.access$getFrameAnalyzerWrapper$p(idCaptureViewModel).setOnBitmapCallback(null);
                int i9 = f15905b + 3;
                f15906d = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i6 = 2 % 2;
                int i7 = f15906d + 21;
                f15905b = i7 % 128;
                int i8 = i7 % 2;
                e();
                Unit unit = Unit.INSTANCE;
                if (i8 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            AnonymousClass1() {
                super(0);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(ProducerScope<? super Bitmap> producerScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15900c + 1;
            f15901e = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(producerScope, continuation);
            int i5 = f15900c + 3;
            f15901e = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(ProducerScope<? super Bitmap> producerScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15901e + 107;
            f15900c = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((ah) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 83 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ah ahVar = IdCaptureViewModel.this.new ah(continuation);
            ahVar.f15902a = obj;
            ah ahVar2 = ahVar;
            int i3 = f15901e + 83;
            f15900c = i3 % 128;
            if (i3 % 2 == 0) {
                return ahVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        ah(Continuation<? super ah> continuation) {
            super(2, continuation);
        }
    }

    private final Object b(Continuation<? super Bitmap> continuation) {
        int i2 = 2 % 2;
        Object obj = null;
        Object objFirst = FlowKt.first(FlowKt.callbackFlow(new ah(null)), continuation);
        int i3 = C + 23;
        A = i3 % 128;
        if (i3 % 2 != 0) {
            return objFirst;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object h(Object[] objArr) throws ImageProcessingKitInvalidInputException, ImageProcessingKitProcessException {
        Bitmap bitmap = (Bitmap) objArr[0];
        int i2 = 2 % 2;
        int i3 = A + 39;
        C = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ImageProcessingKit.getCenterBrightnessLevel(bitmap);
            obj.hashCode();
            throw null;
        }
        float centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(bitmap);
        int i4 = C + 101;
        A = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(centerBrightnessLevel);
        }
        throw null;
    }

    private final boolean c(DocumentAnalysisEvent documentAnalysisEvent) {
        int i2 = 2 % 2;
        boolean zIsClassified = documentAnalysisEvent.isClassified();
        DocumentAnalysisEvent.CaptureCandidateGenerated manualCaptureResult = this.f15747g.getManualCaptureResult();
        if (manualCaptureResult == null) {
            DocumentAnalysisEvent.CaptureCandidateGenerated autoCaptureResult = this.f15747g.getAutoCaptureResult();
            Intrinsics.checkNotNull(autoCaptureResult);
            manualCaptureResult = autoCaptureResult;
        }
        boolean zIsClassified2 = manualCaptureResult.isClassified();
        Timber.Forest.d("CDFINZC " + zIsClassified + " CDFIRC " + zIsClassified2 + ".", new Object[0]);
        if (this.f15747g.isManualCapture()) {
            if (!zIsClassified || !zIsClassified2) {
                return true;
            }
            int i3 = A + 33;
            C = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 41 / 0;
            }
            return false;
        }
        if (!zIsClassified) {
            return true;
        }
        int i5 = A + 87;
        C = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Object obj = null;
        new Companion(null);
        int i2 = D + 89;
        I = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static float b(Bitmap bitmap) {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        return ((Float) b(iC, iC2, CameraXActivity.c.c(), new Object[]{bitmap}, iC3, 838146575, -838146569)).floatValue();
    }

    private static /* synthetic */ Object a(IdCaptureViewModel idCaptureViewModel, Function1 function1, Function2 function2, long j2, Continuation continuation) {
        Object[] objArr = {idCaptureViewModel, function1, function2, Long.valueOf(j2), continuation};
        return b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), objArr, CameraXActivity.c.c(), -1333162073, 1333162077);
    }

    static /* synthetic */ void c(IdCaptureViewModel idCaptureViewModel, IdScanResult idScanResult) {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{idCaptureViewModel, idScanResult}, iC3, -1567143065, 1567143070);
    }

    private final void a(CaptureUiState captureUiState, CaptureUiState captureUiState2) {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{this, captureUiState, captureUiState2}, iC3, 1856043678, -1856043676);
    }

    private final void w() {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{this}, iC3, -413089780, 413089781);
    }

    private final void n() {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{this}, iC3, 885226910, -885226903);
    }

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: g */
        private static int f15778g = 1;

        /* JADX INFO: renamed from: h */
        private static int f15779h = 0;

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f15780a;

        /* JADX INFO: renamed from: b */
        int f15781b;

        /* JADX INFO: renamed from: c */
        Object f15782c;

        /* JADX INFO: renamed from: d */
        Object f15783d;

        /* JADX INFO: renamed from: e */
        int f15784e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15779h + 21;
            f15778g = i3 % 128;
            int i4 = i3 % 2;
            this.f15780a = obj;
            this.f15784e |= Integer.MIN_VALUE;
            IdCaptureViewModel idCaptureViewModel = IdCaptureViewModel.this;
            a aVar = this;
            if (i4 != 0) {
                return IdCaptureViewModel.access$handleAutoCaptureObtained(idCaptureViewModel, null, aVar);
            }
            IdCaptureViewModel.access$handleAutoCaptureObtained(idCaptureViewModel, null, aVar);
            throw null;
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    static final class ac extends ContinuationImpl {

        /* JADX INFO: renamed from: e */
        private static int f15862e = 0;

        /* JADX INFO: renamed from: j */
        private static int f15863j = 1;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f15865b;

        /* JADX INFO: renamed from: c */
        int f15866c;

        /* JADX INFO: renamed from: d */
        Object f15867d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15862e + 111;
            f15863j = i3 % 128;
            int i4 = i3 % 2;
            this.f15865b = obj;
            this.f15866c |= Integer.MIN_VALUE;
            Object objAccess$shouldProcessAnalyzerEvents = IdCaptureViewModel.access$shouldProcessAnalyzerEvents(IdCaptureViewModel.this, this);
            int i5 = f15863j + 69;
            f15862e = i5 % 128;
            int i6 = i5 % 2;
            return objAccess$shouldProcessAnalyzerEvents;
        }

        ac(Continuation<? super ac> continuation) {
            super(continuation);
        }
    }

    static final class ae extends ContinuationImpl {

        /* JADX INFO: renamed from: g */
        private static int f15877g = 0;

        /* JADX INFO: renamed from: j */
        private static int f15878j = 1;

        /* JADX INFO: renamed from: a */
        Object f15879a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f15880b;

        /* JADX INFO: renamed from: c */
        Object f15881c;

        /* JADX INFO: renamed from: d */
        int f15882d;

        /* JADX INFO: renamed from: e */
        Object f15883e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15877g + 89;
            f15878j = i3 % 128;
            int i4 = i3 % 2;
            this.f15880b = obj;
            this.f15882d |= Integer.MIN_VALUE;
            Object objAccess$simulateAnalyzingAnimationProgress = IdCaptureViewModel.access$simulateAnalyzingAnimationProgress(IdCaptureViewModel.this, null, this);
            int i5 = f15878j + 33;
            f15877g = i5 % 128;
            int i6 = i5 % 2;
            return objAccess$simulateAnalyzingAnimationProgress;
        }

        ae(Continuation<? super ae> continuation) {
            super(continuation);
        }
    }

    static final class am<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: f */
        private static int f15939f = 0;

        /* JADX INFO: renamed from: h */
        private static int f15940h = 1;

        /* JADX INFO: renamed from: a */
        Object f15941a;

        /* JADX INFO: renamed from: b */
        long f15942b;

        /* JADX INFO: renamed from: c */
        Object f15943c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f15944d;

        /* JADX INFO: renamed from: e */
        Object f15945e;

        /* JADX INFO: renamed from: j */
        int f15947j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15940h + 45;
            f15939f = i3 % 128;
            int i4 = i3 % 2;
            this.f15944d = obj;
            this.f15947j |= Integer.MIN_VALUE;
            Object objAccess$tweakCameraSettingsAndAnalyseCapture = IdCaptureViewModel.access$tweakCameraSettingsAndAnalyseCapture(IdCaptureViewModel.this, null, null, null, 0L, this);
            int i5 = f15939f + 9;
            f15940h = i5 % 128;
            if (i5 % 2 != 0) {
                return objAccess$tweakCameraSettingsAndAnalyseCapture;
            }
            throw null;
        }

        am(Continuation<? super am> continuation) {
            super(continuation);
        }
    }

    static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: i */
        private static int f16092i = 1;

        /* JADX INFO: renamed from: j */
        private static int f16093j = 0;

        /* JADX INFO: renamed from: a */
        float f16094a;

        /* JADX INFO: renamed from: b */
        Object f16095b;

        /* JADX INFO: renamed from: c */
        Object f16096c;

        /* JADX INFO: renamed from: d */
        Object f16097d;

        /* JADX INFO: renamed from: e */
        int f16098e;

        /* JADX INFO: renamed from: f */
        int f16099f;

        /* JADX INFO: renamed from: h */
        /* synthetic */ Object f16101h;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16092i + 3;
            f16093j = i3 % 128;
            int i4 = i3 % 2;
            this.f16101h = obj;
            this.f16099f |= Integer.MIN_VALUE;
            IdCaptureViewModel idCaptureViewModel = IdCaptureViewModel.this;
            if (i4 != 0) {
                IdCaptureViewModel.access$performInjectionDetection(idCaptureViewModel, this);
                throw null;
            }
            Object objAccess$performInjectionDetection = IdCaptureViewModel.access$performInjectionDetection(idCaptureViewModel, this);
            int i5 = f16093j + 31;
            f16092i = i5 % 128;
            int i6 = i5 % 2;
            return objAccess$performInjectionDetection;
        }

        o(Continuation<? super o> continuation) {
            super(continuation);
        }
    }

    static final class w extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        private static int f16241d = 0;

        /* JADX INFO: renamed from: i */
        private static int f16242i = 1;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f16244b;

        /* JADX INFO: renamed from: c */
        Object f16245c;

        /* JADX INFO: renamed from: e */
        int f16246e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16242i + 3;
            f16241d = i3 % 128;
            int i4 = i3 % 2;
            this.f16244b = obj;
            this.f16246e |= Integer.MIN_VALUE;
            IdCaptureViewModel idCaptureViewModel = IdCaptureViewModel.this;
            w wVar = this;
            if (i4 == 0) {
                return IdCaptureViewModel.access$proceedWithNextSideCapture(idCaptureViewModel, wVar);
            }
            IdCaptureViewModel.access$proceedWithNextSideCapture(idCaptureViewModel, wVar);
            throw null;
        }

        w(Continuation<? super w> continuation) {
            super(continuation);
        }
    }

    private final boolean d(DocumentType documentType) {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        return ((Boolean) b(iC, iC2, CameraXActivity.c.c(), new Object[]{this, documentType}, iC3, -1457926703, 1457926706)).booleanValue();
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15775a;

        /* JADX INFO: renamed from: b */
        private static int f15776b = 1;

        /* JADX INFO: renamed from: d */
        private static int f15777d = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRONT_ID.ordinal()] = 1;
                int i2 = f15776b + 67;
                f15777d = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 3;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 2;
                int i5 = f15777d + 19;
                f15776b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            f15775a = iArr;
        }
    }

    private final Object b(boolean z2, boolean z3, Continuation<? super Unit> continuation) {
        Object[] objArr = {this, Boolean.valueOf(z2), Boolean.valueOf(z3), continuation};
        return b(CameraXActivity.c.c(), CameraXActivity.c.c(), CameraXActivity.c.c(), objArr, CameraXActivity.c.c(), 364777428, -364777428);
    }

    private final void e() {
        int iC = CameraXActivity.c.c();
        int iC2 = CameraXActivity.c.c();
        int iC3 = CameraXActivity.c.c();
        b(iC, iC2, CameraXActivity.c.c(), new Object[]{this}, iC3, 1550214759, -1550214751);
    }
}
