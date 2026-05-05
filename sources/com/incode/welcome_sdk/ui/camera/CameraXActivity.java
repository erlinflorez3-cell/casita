package com.incode.welcome_sdk.ui.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.ResolutionInfo;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.IncodeCamera;
import com.incode.camera.IncodeCameraConfigurator;
import com.incode.camera.IncodeCameraSelector;
import com.incode.camera.IncodeCameraState;
import com.incode.camera.analysis.StubAnalysisEvent;
import com.incode.camera.analysis.StubFrameAnalyzer;
import com.incode.camera.commons.utils.CameraXUtils;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView;
import com.incode.welcome_sdk.commons.utils.ab;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.DeviceStats;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.results.Status;
import com.incode.welcome_sdk.ui.camera.CameraContract;
import com.incode.welcome_sdk.ui.camera.CameraXActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdealEnvironmentTestResult;
import com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper;
import com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import cz.msebera.android.httpclient.HttpStatus;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.sentry.protocol.SentryStackFrame;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CameraXActivity extends RecordableActivity implements CameraContract.View {
    private static int G = 1;
    private static int H = 0;
    private static int L = 0;
    private static int M = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private final Object D;
    private final CompositeDisposable E;
    private boolean F;
    private OpenTokSessionWrapper I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scheduler f11324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f11325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeCamera<StubAnalysisEvent> f11326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CameraPresenter f11327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MovementDetector f11328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f11329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewGroup f11330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CameraPreviewType f11331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f11332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f11336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f11340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f11342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f11343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Bitmap f11344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private VideoStreamingManager f11348z;

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        IncodeCameraSelector.Facing facing;
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | (~(i9 | i5));
        int i11 = ~((~i5) | i4 | i6);
        int i12 = i10 | i11;
        int i13 = (~(i5 | i9 | i4)) | i11;
        int i14 = i4 | i6;
        int i15 = i4 + i6 + i7 + ((-1865910757) * i3) + ((-1665280692) * i2);
        int i16 = i15 * i15;
        int i17 = ((i4 * (-906343980)) - 215482368) + ((-906343980) * i6) + (i12 * (-2063747539)) + (2063747539 * i13) + ((-2063747539) * i14) + (1324875776 * i7) + ((-1540882432) * i3) + ((-912261120) * i2) + (1566179328 * i16);
        int i18 = (i4 * (-52584228)) + 761582770 + (i6 * (-52584228)) + (i12 * HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE) + (i13 * (-415)) + (i14 * HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE) + (i7 * (-52583813)) + (i3 * (-195242759)) + (i2 * 1657508740) + (i16 * (-834797568));
        switch (i17 + (i18 * i18 * 1251344384)) {
            case 1:
                return a(objArr);
            case 2:
                return d(objArr);
            case 3:
                return e(objArr);
            case 4:
                return c(objArr);
            case 5:
                CameraXActivity cameraXActivity = (CameraXActivity) objArr[0];
                int i19 = 2 % 2;
                int i20 = G + 79;
                H = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(cameraXActivity, "");
                IncodeCamera<StubAnalysisEvent> incodeCamera = cameraXActivity.f11326d;
                Intrinsics.checkNotNull(incodeCamera);
                incodeCamera.resetCameraZoom();
                Unit unit = Unit.INSTANCE;
                int i22 = G + 59;
                H = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 6:
                CameraXActivity cameraXActivity2 = (CameraXActivity) objArr[0];
                IncodeCamera incodeCamera2 = (IncodeCamera) objArr[1];
                int i24 = 2 % 2;
                ViewGroup previewContainer = cameraXActivity2.getPreviewContainer();
                previewContainer.addOnLayoutChangeListener(new e(cameraXActivity2, incodeCamera2, previewContainer));
                cameraXActivity2.getPreviewContainer().requestLayout();
                int i25 = G + 51;
                H = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 7:
                CameraXActivity cameraXActivity3 = (CameraXActivity) objArr[0];
                IncodeCamera<StubAnalysisEvent> incodeCamera3 = (IncodeCamera) objArr[1];
                int i27 = 2 % 2;
                int i28 = G + 121;
                H = i28 % 128;
                int i29 = i28 % 2;
                if (CameraFacing.FRONT.getCameraFacing() == cameraXActivity3.getCameraFacing()) {
                    facing = IncodeCameraSelector.Facing.FRONT;
                    int i30 = G + 115;
                    H = i30 % 128;
                    if (i30 % 2 != 0) {
                        int i31 = 3 / 2;
                    }
                } else {
                    facing = IncodeCameraSelector.Facing.BACK;
                }
                incodeCamera3.startCamera(new IncodeCamera.Config(new IncodeCameraSelector(facing), IncodeCameraConfigurator.selfiePreviewResolutionSelector(), IncodeCameraConfigurator.selfieAnalysisResolutionSelector(), false, 0, 24, null));
                cameraXActivity3.onCameraAngleMeasured(CameraXUtils.INSTANCE.isNarrow(cameraXActivity3, incodeCamera3.getConfig().getCameraSelector()));
                cameraXActivity3.b(incodeCamera3);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(cameraXActivity3), Dispatchers.getIO(), null, new n(incodeCamera3, cameraXActivity3, null), 2, null);
                return null;
            default:
                return b(objArr);
        }
    }

    protected abstract CameraPreviewType getCameraType();

    protected abstract void handlePermissionDenied(Exception exc);

    protected abstract void setContentView();

    public static final /* synthetic */ Object access$awaitPreviewUseCaseBinding(CameraXActivity cameraXActivity, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = G + 1;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            return cameraXActivity.d((Continuation<? super Boolean>) continuation);
        }
        cameraXActivity.d((Continuation<? super Boolean>) continuation);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$closeAndReportError(CameraXActivity cameraXActivity, Throwable th) {
        int i2 = 2 % 2;
        int i3 = H + 105;
        G = i3 % 128;
        int i4 = i3 % 2;
        cameraXActivity.d(th);
        int i5 = H + 31;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
    }

    public static final /* synthetic */ void access$connectCameraPreviewWithOpenTok(CameraXActivity cameraXActivity, OpenTokSessionInitResult openTokSessionInitResult) {
        int i2 = 2 % 2;
        int i3 = H + 49;
        G = i3 % 128;
        int i4 = i3 % 2;
        cameraXActivity.b(openTokSessionInitResult);
        int i5 = H + 77;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ CameraPresenter access$getCameraPresenter$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 65;
        G = i4 % 128;
        int i5 = i4 % 2;
        CameraPresenter cameraPresenter = cameraXActivity.f11327e;
        int i6 = i3 + 83;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return cameraPresenter;
        }
        throw null;
    }

    public static final /* synthetic */ CameraPreviewType access$getCameraPreviewType$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G + 95;
        H = i3 % 128;
        int i4 = i3 % 2;
        CameraPreviewType cameraPreviewType = cameraXActivity.f11331i;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        return cameraPreviewType;
    }

    public static final /* synthetic */ float access$getLastCompleteFrameCenterBrightness(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = H + 67;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            return cameraXActivity.g();
        }
        cameraXActivity.g();
        throw null;
    }

    public static final /* synthetic */ Object access$getLastCompleteFrameLock$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G + 15;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        Object obj = cameraXActivity.D;
        int i6 = i4 + 73;
        G = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }

    public static final /* synthetic */ int access$getLastKnownOrientation$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G + 121;
        H = i3 % 128;
        int i4 = i3 % 2;
        int i5 = cameraXActivity.f11332j;
        if (i4 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ OpenTokSessionWrapper access$getOpenTokSessionWrapper$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 71;
        G = i4 % 128;
        int i5 = i4 % 2;
        OpenTokSessionWrapper openTokSessionWrapper = cameraXActivity.I;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 123;
        G = i6 % 128;
        int i7 = i6 % 2;
        return openTokSessionWrapper;
    }

    public static final /* synthetic */ boolean access$getStreamAudioEnabled$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        boolean z2 = cameraXActivity.A;
        int i6 = i4 + 117;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public static final /* synthetic */ VideoStreamingManager access$getVideoStreamingManager$p(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 9;
        H = i4 % 128;
        int i5 = i4 % 2;
        VideoStreamingManager videoStreamingManager = cameraXActivity.f11348z;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 63;
        H = i6 % 128;
        int i7 = i6 % 2;
        return videoStreamingManager;
    }

    public static final /* synthetic */ void access$onPreviewRawBitmap(CameraXActivity cameraXActivity, Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = H + 115;
        G = i3 % 128;
        int i4 = i3 % 2;
        cameraXActivity.a(bitmap);
        if (i4 == 0) {
            int i5 = 18 / 0;
        }
    }

    public static final /* synthetic */ Object access$postProcessRecording(CameraXActivity cameraXActivity, File file, Continuation continuation) throws IOException {
        int i2 = 2 % 2;
        int i3 = G + 81;
        H = i3 % 128;
        int i4 = i3 % 2;
        Object objE = cameraXActivity.e(file, (Continuation<? super Unit>) continuation);
        int i5 = H + 117;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            return objE;
        }
        throw null;
    }

    public static final /* synthetic */ void access$proceedAfterCameraAndUseCasesBeingReady(CameraXActivity cameraXActivity, IncodeCamera incodeCamera) {
        int i2 = 2 % 2;
        int i3 = H + 93;
        G = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraXActivity, incodeCamera};
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), objArr, -1712251328, iA, 1712251334, iA2);
        int i5 = G + 121;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Completable access$restoreCameraZoomCompletable(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G + 59;
        H = i3 % 128;
        int i4 = i3 % 2;
        Completable completableI = cameraXActivity.i();
        int i5 = H + 101;
        G = i5 % 128;
        int i6 = i5 % 2;
        return completableI;
    }

    public static final /* synthetic */ void access$setLastCompleteFrameBitmap$p(CameraXActivity cameraXActivity, Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = G + 69;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        cameraXActivity.f11344v = bitmap;
        int i6 = i4 + 85;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$showsViewsAfterCameraIsReady(CameraXActivity cameraXActivity, PreviewView previewView) {
        int i2 = 2 % 2;
        int i3 = G + 69;
        H = i3 % 128;
        int i4 = i3 % 2;
        cameraXActivity.b(previewView);
        int i5 = H + 51;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
    }

    public CameraXActivity() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
        ExecutorService executorService = executorServiceNewSingleThreadExecutor;
        this.f11325c = executorService;
        Scheduler schedulerFrom = Schedulers.from(executorService);
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "");
        this.f11324b = schedulerFrom;
        this.f11342t = "android.permission.CAMERA";
        this.f11340r = "android.permission.RECORD_AUDIO";
        this.f11341s = 720;
        this.f11338p = 1280;
        this.D = new Object();
        this.E = new CompositeDisposable();
    }

    public final IncodeCamera<StubAnalysisEvent> getIncodeCamera() {
        int i2 = 2 % 2;
        int i3 = H + 107;
        G = i3 % 128;
        int i4 = i3 % 2;
        IncodeCamera<StubAnalysisEvent> incodeCamera = this.f11326d;
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        return incodeCamera;
    }

    public final ViewGroup getPreviewContainer() {
        int i2 = 2 % 2;
        int i3 = G + 121;
        H = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ViewGroup viewGroup = this.f11330h;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = H + 63;
        G = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    protected final void setPreviewContainer(ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = H + 65;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.f11330h = viewGroup;
        int i5 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    public final View getCameraLidText() {
        int i2 = 2 % 2;
        int i3 = G + 105;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        View view = this.f11329g;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = H + 113;
        G = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return null;
    }

    public final void setCameraLidText(View view) {
        int i2 = 2 % 2;
        int i3 = H + 113;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.f11329g = view;
        int i5 = G + 11;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final int getNormalizedPreviewWidth() {
        int i2 = 2 % 2;
        int i3 = H + 83;
        int i4 = i3 % 128;
        G = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.f11334l;
        int i6 = i4 + 49;
        H = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    protected final void setNormalizedPreviewWidth(int i2) {
        int i3 = 2 % 2;
        int i4 = G;
        int i5 = i4 + 71;
        H = i5 % 128;
        int i6 = i5 % 2;
        this.f11334l = i2;
        int i7 = i4 + 33;
        H = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final int getNormalizedPreviewHeight() {
        int i2 = 2 % 2;
        int i3 = G + 71;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11335m;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void setNormalizedPreviewHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = H + 15;
        int i5 = i4 % 128;
        G = i5;
        int i6 = i4 % 2;
        this.f11335m = i2;
        int i7 = i5 + 27;
        H = i7 % 128;
        int i8 = i7 % 2;
    }

    public final boolean isNarrowCamera() {
        int i2 = 2 % 2;
        int i3 = H + 73;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f11347y;
        int i6 = i4 + 21;
        H = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
        return z2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    protected static final class OpenTokSessionInitResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ OpenTokSessionInitResult[] f11349a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11352d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f11354g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f11355h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f11356i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f11357j = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final OpenTokSessionInitResult f11353e = new OpenTokSessionInitResult("JUST_INITIALIZED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OpenTokSessionInitResult f11350b = new OpenTokSessionInitResult("ALREADY_INITIALIZED", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OpenTokSessionInitResult f11351c = new OpenTokSessionInitResult("NOT_INITIALIZED", 2);

        private OpenTokSessionInitResult(String str, int i2) {
        }

        static {
            OpenTokSessionInitResult[] openTokSessionInitResultArrC = c();
            f11349a = openTokSessionInitResultArrC;
            f11352d = EnumEntriesKt.enumEntries(openTokSessionInitResultArrC);
            int i2 = f11354g + 73;
            f11356i = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ OpenTokSessionInitResult[] c() {
            int i2 = 2 % 2;
            int i3 = f11355h;
            int i4 = i3 + 45;
            f11357j = i4 % 128;
            int i5 = i4 % 2;
            OpenTokSessionInitResult[] openTokSessionInitResultArr = {f11353e, f11350b, f11351c};
            int i6 = i3 + 101;
            f11357j = i6 % 128;
            int i7 = i6 % 2;
            return openTokSessionInitResultArr;
        }

        public static EnumEntries<OpenTokSessionInitResult> getEntries() {
            int i2 = 2 % 2;
            int i3 = f11355h + 7;
            int i4 = i3 % 128;
            f11357j = i4;
            int i5 = i3 % 2;
            EnumEntries<OpenTokSessionInitResult> enumEntries = f11352d;
            int i6 = i4 + 73;
            f11355h = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 0;
            }
            return enumEntries;
        }

        public static OpenTokSessionInitResult valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f11355h + 63;
            f11357j = i3 % 128;
            int i4 = i3 % 2;
            OpenTokSessionInitResult openTokSessionInitResult = (OpenTokSessionInitResult) Enum.valueOf(OpenTokSessionInitResult.class, str);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f11357j + 13;
            f11355h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return openTokSessionInitResult;
        }

        public static OpenTokSessionInitResult[] values() {
            int i2 = 2 % 2;
            int i3 = f11355h + 107;
            f11357j = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            OpenTokSessionInitResult[] openTokSessionInitResultArr = (OpenTokSessionInitResult[]) f11349a.clone();
            int i4 = f11357j + 63;
            f11355h = i4 % 128;
            if (i4 % 2 != 0) {
                return openTokSessionInitResultArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void safeOnCreate(Bundle bundle, CameraPresenter cameraPresenter) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraPresenter, "");
        this.f11327e = cameraPresenter;
        super.safeOnCreate(bundle);
        setContentView();
        this.f11348z = getIncodeWelcome().getVideoStreamingManager();
        this.f11331i = getCameraType();
        View viewFindViewById = findViewById(R.id.camera_preview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        setPreviewContainer((ViewGroup) viewFindViewById);
        this.f11328f = new MovementDetector(this);
        View viewFindViewById2 = findViewById(R.id.camera_lid_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        setCameraLidText(viewFindViewById2);
        getWindow().addFlags(128);
        int i3 = G + 125;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void reconfigureCamera(int i2, Runnable runnable) {
        int i3 = 2 % 2;
        int i4 = G + 29;
        H = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraSourceCreated() {
        int i2 = 2 % 2;
        int i3 = G + 51;
        H = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onVideoRecordingPermissionDenied() {
        int i2 = 2 % 2;
        int i3 = G + 79;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onBlurrinessUpdate(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = H + 43;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onBrightnessValueUpdate(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = G + 21;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void releaseCamera() {
        int i2 = 2 % 2;
        int i3 = G + 73;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopPreview(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = H + 39;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int i2 = 2 % 2;
        int i3 = H + 81;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            super.onStart();
            c();
            int i4 = 37 / 0;
        } else {
            super.onStart();
            c();
        }
        int i5 = H + 21;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i2 = 2 % 2;
        int i3 = G + 47;
        H = i3 % 128;
        CameraPresenter cameraPresenter = null;
        if (i3 % 2 != 0) {
            super.onResume();
            cameraPresenter.hashCode();
            throw null;
        }
        super.onResume();
        MovementDetector movementDetector = this.f11328f;
        if (movementDetector == null) {
            int i4 = G + 17;
            H = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraPresenter.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            movementDetector = null;
        }
        movementDetector.start();
        CameraPresenter cameraPresenter2 = this.f11327e;
        if (cameraPresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = G + 117;
            H = i5 % 128;
            int i6 = i5 % 2;
            cameraPresenter2 = null;
        }
        cameraPresenter2.enableProcessing(false);
        CameraPresenter cameraPresenter3 = this.f11327e;
        if (cameraPresenter3 == null) {
            int i7 = H + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            G = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraPresenter.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            cameraPresenter = cameraPresenter3;
        }
        cameraPresenter.onResume();
    }

    private final void c() {
        int i2 = 2 % 2;
        if (!isCameraPermissionGranted()) {
            requestCameraPermission();
            return;
        }
        if (o()) {
            startSessionScreenRecording();
        }
        Object obj = null;
        if (isVideoStreamingAllowed()) {
            int i3 = H + 45;
            G = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.A && !isAudioPermissionGranted()) {
                int i4 = G + 43;
                H = i4 % 128;
                int i5 = i4 % 2;
                d();
                return;
            }
        }
        if (!this.f11346x) {
            int i6 = H + 39;
            G = i6 % 128;
            if (i6 % 2 == 0) {
                onCameraPermissionGranted();
                throw null;
            }
            onCameraPermissionGranted();
        }
        onReadyToCreateCamera();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onReadyToCreateCamera() {
        int i2 = 2 % 2;
        int i3 = G + 97;
        H = i3 % 128;
        int i4 = i3 % 2;
        if (this.F) {
            onPreviewStarted();
            return;
        }
        CameraPresenter cameraPresenter = this.f11327e;
        if (cameraPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = G + 31;
            H = i5 % 128;
            int i6 = i5 % 2;
            cameraPresenter = null;
        }
        cameraPresenter.createCameraSourceAndFaceProcessor(getCameraFacing());
        this.F = true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = G + 97;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
        }
        super.onSaveInstanceState(bundle);
        this.f11343u = true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = H + 53;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        this.f11345w = false;
        this.f11346x = true;
        int i6 = i4 + 113;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = H + 1;
        G = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        MovementDetector movementDetector = this.f11328f;
        CameraPresenter cameraPresenter = null;
        if (movementDetector == null) {
            int i5 = G + 17;
            H = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            movementDetector = null;
        }
        movementDetector.stop();
        CameraPresenter cameraPresenter2 = this.f11327e;
        if (cameraPresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            cameraPresenter = cameraPresenter2;
        }
        cameraPresenter.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity
    protected void onResumeFragments() {
        int i2 = 2 % 2;
        int i3 = H + 53;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            super.onResumeFragments();
            if (this.f11345w) {
                e();
                this.f11345w = false;
            }
            int i4 = H + 61;
            G = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onResumeFragments();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = H + 57;
        G = i3 % 128;
        CameraPresenter cameraPresenter = null;
        if (i3 % 2 == 0) {
            this.E.clear();
            cameraPresenter.hashCode();
            throw null;
        }
        this.E.clear();
        CameraPresenter cameraPresenter2 = this.f11327e;
        if (cameraPresenter2 == null) {
            int i4 = G + 47;
            H = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = H + 39;
            G = i6 % 128;
            int i7 = i6 % 2;
        } else {
            cameraPresenter = cameraPresenter2;
        }
        cameraPresenter.onDestroy();
        super.safeOnDestroy();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public boolean isCameraPermissionGranted() throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 85;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            ContextCompat.checkSelfPermission(this, this.f11342t);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (ContextCompat.checkSelfPermission(this, this.f11342t) != 0) {
            return false;
        }
        int i4 = G + 7;
        H = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void requestCameraPermission() {
        int i2 = 2 % 2;
        int i3 = H + 37;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            ActivityCompat.requestPermissions(this, new String[]{this.f11342t}, 1001);
        } else {
            String[] strArr = new String[0];
            strArr[1] = this.f11342t;
            ActivityCompat.requestPermissions(this, strArr, 29953);
        }
        int i4 = G + 53;
        H = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = H + 111;
        G = i3 % 128;
        int i4 = i3 % 2;
        ActivityCompat.requestPermissions(this, new String[]{this.f11340r}, 1003);
        int i5 = H + 91;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    @Override // com.incode.welcome_sdk.ui.camera.RecordableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRequestPermissionsResult(int r6, java.lang.String[] r7, int[] r8) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.G
            int r3 = r0 + 105
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.H = r0
            int r3 = r3 % r4
            r2 = 1003(0x3eb, float:1.406E-42)
            r1 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = ""
            if (r3 == 0) goto L31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            super.onRequestPermissionsResult(r6, r7, r8)
            r0 = 90
            int r0 = r0 / 0
            if (r6 == r1) goto L5c
            if (r6 == r2) goto L3f
        L25:
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.G
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.H = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L5a
            return
        L31:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            super.onRequestPermissionsResult(r6, r7, r8)
            if (r6 == r1) goto L5c
            if (r6 == r2) goto L3f
            goto L25
        L3f:
            boolean r0 = r5.A
            if (r0 == 0) goto L56
            boolean r0 = r5.isAudioPermissionGranted()
            if (r0 != 0) goto L56
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r4
            r5.showAudioPermissionsMandatory()
            return
        L56:
            r5.b()
            goto L25
        L5a:
            r0 = 0
            throw r0
        L5c:
            boolean r0 = r5.isCameraPermissionGranted()
            if (r0 == 0) goto L7d
            boolean r0 = r5.A
            if (r0 == 0) goto L79
            boolean r0 = r5.isAudioPermissionGranted()
            if (r0 != 0) goto L79
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.G
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.H = r0
            int r1 = r1 % r4
            r5.d()
            return
        L79:
            r5.b()
            return
        L7d:
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    private final void b() {
        int i2 = 2 % 2;
        if (o()) {
            int i3 = H + 75;
            G = i3 % 128;
            int i4 = i3 % 2;
            startSessionScreenRecording();
            int i5 = H + 49;
            G = i5 % 128;
            int i6 = i5 % 2;
        }
        onCameraPermissionGranted();
        onReadyToCreateCamera();
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = G + 9;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            if (!isFinishing() && !this.f11343u) {
                e();
                int i4 = H + 97;
                G = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 55 / 0;
                    return;
                }
                return;
            }
            this.f11345w = true;
            return;
        }
        isFinishing();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = G + 25;
        H = i3 % 128;
        int i4 = i3 % 2;
        PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_camera_permission_image, R.string.onboard_sdk_dialog_camera_permissions_mandatory_title, R.string.onboard_sdk_dialog_camera_permissions_mandatory_subtitle, "android.permission.CAMERA", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        int i5 = H + 37;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
        int i3 = H + 21;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void createCameraSource(int i2) {
        int i3 = 2 % 2;
        int i4 = G + 105;
        H = i4 % 128;
        int i5 = i4 % 2;
        if (this.f11326d != null) {
            Timber.Forest.d("The camera is already set up, so nothing to do.", new Object[0]);
            return;
        }
        IncodeCamera<StubAnalysisEvent> incodeCameraGenerateIncodeCameraForSelfieCapture = IncodeCameraProvider.f11485d.generateIncodeCameraForSelfieCapture(this, this, new StubFrameAnalyzer(), j());
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), new Object[]{this, incodeCameraGenerateIncodeCameraForSelfieCapture}, -1403244805, iA, 1403244812, iA2);
        this.f11326d = incodeCameraGenerateIncodeCameraForSelfieCapture;
        CameraPresenter cameraPresenter = this.f11327e;
        Object obj = null;
        if (cameraPresenter == null) {
            int i6 = H + 75;
            G = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = G + 15;
            H = i7 % 128;
            int i8 = i7 % 2;
            cameraPresenter = null;
        }
        Point desiredPreviewSize = cameraPresenter.getDesiredPreviewSize(this.f11347y);
        this.f11341s = desiredPreviewSize.x;
        this.f11338p = desiredPreviewSize.y;
        int i9 = H + 53;
        G = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11364a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11365e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11366c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f11366c;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                IncodeCamera<StubAnalysisEvent> incodeCamera = CameraXActivity.this.getIncodeCamera();
                Intrinsics.checkNotNull(incodeCamera);
                final StateFlow<IncodeCameraState> cameraState = incodeCamera.getCameraState();
                this.f11366c = 1;
                obj = FlowKt.first(new Flow<IncodeCameraState>() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f11379b = 1;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f11380c = 0;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f11382c = 1;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f11383d = 0;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f11384b;

                        /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                            /*
                                r8 = this;
                                r7 = 2
                                int r0 = r7 % r7
                                int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11382c
                                int r1 = r0 + 33
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11383d = r0
                                int r1 = r1 % r7
                                boolean r0 = r10 instanceof com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                r6 = 1
                                if (r0 == r6) goto L59
                            L11:
                                com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1$2$1 r5 = new com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1$2$1
                                r5.<init>(r10)
                            L16:
                                java.lang.Object r1 = r5.f11388d
                                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r5.f11387a
                                if (r0 == 0) goto L31
                                if (r0 != r6) goto L69
                                kotlin.ResultKt.throwOnFailure(r1)
                                int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11383d
                                int r1 = r0 + 69
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11382c = r0
                                int r1 = r1 % r7
                            L2e:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            L31:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r3 = r8.f11384b
                                r0 = r5
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r0 = r9
                                com.incode.camera.IncodeCameraState r0 = (com.incode.camera.IncodeCameraState) r0
                                boolean r0 = r0 instanceof com.incode.camera.IncodeCameraState.NotInitialized
                                if (r0 != 0) goto L2e
                                int r2 = com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11382c
                                int r1 = r2 + 25
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11383d = r0
                                int r1 = r1 % r7
                                int r1 = r2 + 41
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f11383d = r0
                                int r1 = r1 % r7
                                r5.f11387a = r6
                                java.lang.Object r0 = r3.emit(r9, r5)
                                if (r0 != r4) goto L2e
                                return r4
                            L59:
                                r5 = r10
                                com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1$2$1 r5 = (com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                                int r0 = r5.f11387a
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L11
                                int r0 = r5.f11387a
                                int r0 = r0 - r1
                                r5.f11387a = r0
                                goto L16
                            L69:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.CameraXActivity$connectCameraPreviewWithOpenTok$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private static int f11385b = 1;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f11386c = 0;

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            int f11387a;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            /* synthetic */ Object f11388d;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f11385b + 17;
                                f11386c = i3 % 128;
                                int i4 = i3 % 2;
                                this.f11388d = obj;
                                this.f11387a |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i5 = f11386c + 71;
                                f11385b = i5 % 128;
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
                            this.f11384b = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super IncodeCameraState> flowCollector, Continuation continuation) {
                        int i4 = 2 % 2;
                        Object objCollect = cameraState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            Unit unit = Unit.INSTANCE;
                            int i5 = f11380c + 115;
                            f11379b = i5 % 128;
                            int i6 = i5 % 2;
                            return unit;
                        }
                        int i7 = f11380c + 105;
                        f11379b = i7 % 128;
                        int i8 = i7 % 2;
                        return objCollect;
                    }
                }, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i4 = f11364a + 39;
                f11365e = i4 % 128;
                int i5 = i4 % 2;
            }
            IncodeCameraState incodeCameraState = (IncodeCameraState) obj;
            if (incodeCameraState instanceof IncodeCameraState.Initialized) {
                IncodeCamera<StubAnalysisEvent> incodeCamera2 = CameraXActivity.this.getIncodeCamera();
                Intrinsics.checkNotNull(incodeCamera2);
                CameraXVideoCapturer cameraXVideoCapturer = new CameraXVideoCapturer((IncodeCameraState.Initialized) incodeCameraState, incodeCamera2.getConfig().getAnalyzerFormat());
                VideoStreamingManager videoStreamingManagerAccess$getVideoStreamingManager$p = CameraXActivity.access$getVideoStreamingManager$p(CameraXActivity.this);
                if (videoStreamingManagerAccess$getVideoStreamingManager$p == null) {
                    int i6 = f11364a + 115;
                    f11365e = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = f11365e + 59;
                    f11364a = i8 % 128;
                    int i9 = i8 % 2;
                    videoStreamingManagerAccess$getVideoStreamingManager$p = null;
                }
                OpenTokSessionWrapper openTokSessionWrapperAccess$getOpenTokSessionWrapper$p = CameraXActivity.access$getOpenTokSessionWrapper$p(CameraXActivity.this);
                Intrinsics.checkNotNull(openTokSessionWrapperAccess$getOpenTokSessionWrapper$p);
                PublisherWrapper publisherWrapperCreatePublisher = videoStreamingManagerAccess$getVideoStreamingManager$p.createPublisher(openTokSessionWrapperAccess$getOpenTokSessionWrapper$p, cameraXVideoCapturer, CameraXActivity.access$getStreamAudioEnabled$p(CameraXActivity.this));
                OpenTokSessionWrapper openTokSessionWrapperAccess$getOpenTokSessionWrapper$p2 = CameraXActivity.access$getOpenTokSessionWrapper$p(CameraXActivity.this);
                Intrinsics.checkNotNull(openTokSessionWrapperAccess$getOpenTokSessionWrapper$p2);
                openTokSessionWrapperAccess$getOpenTokSessionWrapper$p2.publishToStream(publisherWrapperCreatePublisher);
                IncodeCamera<StubAnalysisEvent> incodeCamera3 = CameraXActivity.this.getIncodeCamera();
                Intrinsics.checkNotNull(incodeCamera3);
                incodeCamera3.getFrameAnalyzerWrapper().setOnFrameCallback(new AnonymousClass1(cameraXVideoCapturer));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.CameraXActivity$b$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ImageProxy, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f11368b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f11369d = 1;

            private void a(ImageProxy imageProxy) {
                int i2 = 2 % 2;
                int i3 = f11369d + 31;
                f11368b = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(imageProxy, "");
                    ((CameraXVideoCapturer) this.receiver).onCameraFrame(imageProxy);
                } else {
                    Intrinsics.checkNotNullParameter(imageProxy, "");
                    ((CameraXVideoCapturer) this.receiver).onCameraFrame(imageProxy);
                    int i4 = 82 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ImageProxy imageProxy) {
                int i2 = 2 % 2;
                int i3 = f11369d + 77;
                f11368b = i3 % 128;
                int i4 = i3 % 2;
                a(imageProxy);
                Unit unit = Unit.INSTANCE;
                int i5 = f11369d + 79;
                f11368b = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            AnonymousClass1(Object obj) {
                super(1, obj, CameraXVideoCapturer.class, "onCameraFrame", "onCameraFrame(Landroidx/camera/core/ImageProxy;)V", 0);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11365e + 25;
            f11364a = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                b(coroutineScope2, continuation2);
                throw null;
            }
            Object objB = b(coroutineScope2, continuation2);
            int i4 = f11364a + 117;
            f11365e = i4 % 128;
            if (i4 % 2 != 0) {
                return objB;
            }
            throw null;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11364a + 21;
            f11365e = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return bVar.invokeSuspend(unit);
            }
            bVar.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = CameraXActivity.this.new b(continuation);
            int i3 = f11364a + 79;
            f11365e = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }
    }

    private final void b(OpenTokSessionInitResult openTokSessionInitResult) {
        int i2 = 2 % 2;
        int i3 = H + 65;
        G = i3 % 128;
        int i4 = i3 % 2;
        int i5 = WhenMappings.f11359d[openTokSessionInitResult.ordinal()];
        if (i5 == 1) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
        } else if (i5 != 2) {
            Timber.Forest.w("OpenTok not initialized.", new Object[0]);
            int i6 = G + 37;
            H = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11443c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11444d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ CameraXActivity f11445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ IncodeCamera<StubAnalysisEvent> f11446b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11447e;

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r6 = 2
                int r0 = r6 % r6
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.f11447e
                r7 = 3
                r2 = 1
                if (r0 == 0) goto L19
                if (r0 == r2) goto L40
                if (r0 == r6) goto L57
                if (r0 != r7) goto L9a
                kotlin.ResultKt.throwOnFailure(r9)
            L16:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L19:
                kotlin.ResultKt.throwOnFailure(r9)
                com.incode.camera.IncodeCamera<com.incode.camera.analysis.StubAnalysisEvent> r0 = r8.f11446b
                kotlinx.coroutines.flow.StateFlow r0 = r0.getCameraState()
                kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
                com.incode.welcome_sdk.ui.camera.CameraXActivity$setupCameraPreview$1$invokeSuspend$$inlined$filter$1 r1 = new com.incode.welcome_sdk.ui.camera.CameraXActivity$setupCameraPreview$1$invokeSuspend$$inlined$filter$1
                r1.<init>()
                kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.f11447e = r2
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r1, r0)
                if (r9 != r5) goto L43
                int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.n.f11443c
                int r1 = r0 + 99
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.CameraXActivity.n.f11444d = r0
                int r1 = r1 % r6
                return r5
            L40:
                kotlin.ResultKt.throwOnFailure(r9)
            L43:
                com.incode.camera.IncodeCameraState r9 = (com.incode.camera.IncodeCameraState) r9
                boolean r0 = r9 instanceof com.incode.camera.IncodeCameraState.Initialized
                if (r0 == 0) goto L89
                com.incode.welcome_sdk.ui.camera.CameraXActivity r1 = r8.f11445a
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.f11447e = r6
                java.lang.Object r9 = com.incode.welcome_sdk.ui.camera.CameraXActivity.access$awaitPreviewUseCaseBinding(r1, r0)
                if (r9 != r5) goto L5a
                return r5
            L57:
                kotlin.ResultKt.throwOnFailure(r9)
            L5a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r0 = r9.booleanValue()
                if (r0 == 0) goto L16
                kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
                kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
                com.incode.welcome_sdk.ui.camera.CameraXActivity$n$3 r3 = new com.incode.welcome_sdk.ui.camera.CameraXActivity$n$3
                com.incode.welcome_sdk.ui.camera.CameraXActivity r2 = r8.f11445a
                com.incode.camera.IncodeCamera<com.incode.camera.analysis.StubAnalysisEvent> r1 = r8.f11446b
                r0 = 0
                r3.<init>(r2, r1, r0)
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.f11447e = r7
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r4, r3, r0)
                if (r0 != r5) goto L16
                int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.n.f11443c
                int r1 = r0 + 111
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.CameraXActivity.n.f11444d = r0
                int r1 = r1 % r6
                return r5
            L89:
                boolean r0 = r9 instanceof com.incode.camera.IncodeCameraState.Error
                if (r0 == 0) goto L16
                com.incode.welcome_sdk.ui.camera.CameraXActivity r1 = r8.f11445a
                com.incode.camera.IncodeCameraState$Error r9 = (com.incode.camera.IncodeCameraState.Error) r9
                java.lang.Throwable r0 = r9.getException()
                com.incode.welcome_sdk.ui.camera.CameraXActivity.access$closeAndReportError(r1, r0)
                goto L16
            L9a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.CameraXActivity$n$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f11448a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f11449e = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ IncodeCamera<StubAnalysisEvent> f11450b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ CameraXActivity f11451c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f11452d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = f11448a + 29;
                f11449e = i3 % 128;
                if (i3 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    CameraXActivity.access$proceedAfterCameraAndUseCasesBeingReady(this.f11451c, this.f11450b);
                    CameraXActivity.access$showsViewsAfterCameraIsReady(this.f11451c, this.f11450b.getPreviewView());
                    this.f11451c.onCameraSourceCreated();
                    unit = Unit.INSTANCE;
                    int i4 = 27 / 0;
                } else {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    CameraXActivity.access$proceedAfterCameraAndUseCasesBeingReady(this.f11451c, this.f11450b);
                    CameraXActivity.access$showsViewsAfterCameraIsReady(this.f11451c, this.f11450b.getPreviewView());
                    this.f11451c.onCameraSourceCreated();
                    unit = Unit.INSTANCE;
                }
                int i5 = f11448a + 55;
                f11449e = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f11449e + 13;
                f11448a = i3 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 != 0) {
                    e(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objE = e(coroutineScope2, continuation2);
                int i4 = f11448a + 101;
                f11449e = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 11 / 0;
                }
                return objE;
            }

            private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f11449e + 27;
                f11448a = i3 % 128;
                int i4 = i3 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return anonymousClass3.invokeSuspend(unit);
                }
                anonymousClass3.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f11451c, this.f11450b, continuation);
                int i3 = f11449e + 99;
                f11448a = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CameraXActivity cameraXActivity, IncodeCamera<StubAnalysisEvent> incodeCamera, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.f11451c = cameraXActivity;
                this.f11450b = incodeCamera;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11443c + 67;
            f11444d = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            int i5 = f11444d + 109;
            f11443c = i5 % 128;
            int i6 = i5 % 2;
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11443c + 61;
            f11444d = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f11443c + 99;
            f11444d = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            n nVar = new n(this.f11446b, this.f11445a, continuation);
            int i3 = f11444d + 63;
            f11443c = i3 % 128;
            int i4 = i3 % 2;
            return nVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(IncodeCamera<StubAnalysisEvent> incodeCamera, CameraXActivity cameraXActivity, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f11446b = incodeCamera;
            this.f11445a = cameraXActivity;
        }
    }

    private final void d(Throwable th) {
        ResultCode resultCode = ResultCode.ERROR;
        CameraPresenter cameraPresenter = this.f11327e;
        if (cameraPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cameraPresenter = null;
        }
        Status motionStatus = cameraPresenter.getMotionStatus();
        Intrinsics.checkNotNullExpressionValue(motionStatus, "");
        com.incode.welcome_sdk.b.publish(new SelfieScanResult(resultCode, th, new DeviceStats(motionStatus), 0.0d, null, 0.0d, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048568, null));
        finish();
    }

    private final void b(IncodeCamera<StubAnalysisEvent> incodeCamera) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = G + 41;
        H = i3 % 128;
        int i4 = i3 % 2;
        PreviewView previewView = incodeCamera.getPreviewView();
        Iterator<View> it = ViewGroupKt.getChildren(previewView).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            int i5 = H + 109;
            G = i5 % 128;
            int i6 = i5 % 2;
            if (it.next() instanceof TextureView) {
                int i7 = H + 35;
                G = i7 % 128;
                int i8 = i7 % 2;
                z2 = true;
                break;
            }
        }
        Timber.Forest.d("Camera preview is a TextureView: " + z2, new Object[0]);
        ((OverlayWithHoleImageView) findViewById(R.id.circularCameraOverlay)).setShouldUseSoftwareRendering(z2);
        if ((getPreviewContainer().getChildCount() != 0) && (getPreviewContainer().getChildAt(0) instanceof PreviewView)) {
            getPreviewContainer().removeViewAt(0);
        }
        getPreviewContainer().addView(previewView, 0, new ViewGroup.LayoutParams(-1, -1));
        a(previewView);
    }

    private final void a(PreviewView previewView) {
        int i2 = 2 % 2;
        int i3 = H + 117;
        G = i3 % 128;
        int i4 = i3 % 2;
        getPreviewContainer().setVisibility(8);
        previewView.setVisibility(8);
        getCameraLidText().setVisibility(8);
        int i5 = G + 37;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void b(PreviewView previewView) {
        int i2 = 2 % 2;
        int i3 = H + 107;
        G = i3 % 128;
        int i4 = i3 % 2;
        getPreviewContainer().setVisibility(0);
        previewView.setVisibility(0);
        getCameraLidText().setVisibility(0);
        int i5 = G + 57;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Path cross not found for [B:16:0x004f, B:25:0x0077], limit reached: 45 */
    /* JADX WARN: Path cross not found for [B:25:0x0077, B:16:0x004f], limit reached: 45 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0074 -> B:13:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object d(kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        final CameraXActivity cameraXActivity = (CameraXActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = G + 31;
        H = i3 % 128;
        int i4 = i3 % 2;
        Single singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda7
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                CameraXActivity.b(this.f$0, singleEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "");
        int i5 = H + 87;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            return singleCreate;
        }
        throw null;
    }

    static final class o extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11453c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11454e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ OpenTokSessionWrapper f11455b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ SingleEmitter<OpenTokSessionInitResult> f11456d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11454e + 31;
            f11453c = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f11454e + 43;
            f11453c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11453c + 123;
            f11454e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest forest = Timber.Forest;
                Object[] objArr = new Object[1];
                objArr[1] = this.f11455b.getModule();
                forest.e(th, "Error while waiting for session to connect for module: %s", objArr);
            } else {
                Timber.Forest.e(th, "Error while waiting for session to connect for module: %s", this.f11455b.getModule());
            }
            this.f11456d.onSuccess(OpenTokSessionInitResult.f11351c);
            int i4 = f11453c + 21;
            f11454e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(OpenTokSessionWrapper openTokSessionWrapper, SingleEmitter<OpenTokSessionInitResult> singleEmitter) {
            super(1);
            this.f11455b = openTokSessionWrapper;
            this.f11456d = singleEmitter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = timber.log.Timber.Forest;
        r0 = r4.getSession();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r1.d("OpenTok session %s is ready", r0.getSessionId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r4.getSession() != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        timber.log.Timber.Forest.e("OpenTok session is null", new java.lang.Object[0]);
        r6.onSuccess(com.incode.welcome_sdk.ui.camera.CameraXActivity.OpenTokSessionInitResult.f11351c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4.getSession() != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H + 89;
        com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r1 = timber.log.Timber.Forest;
        r0 = r4.getSession();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r1.d("OpenTok session %s is ready", r0.getSessionId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r5.I = r4;
        r6.onSuccess(com.incode.welcome_sdk.ui.camera.CameraXActivity.OpenTokSessionInitResult.f11353e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper r4, com.incode.welcome_sdk.ui.camera.CameraXActivity r5, io.reactivex.SingleEmitter r6) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r2
            r3 = 0
            java.lang.String r0 = ""
            if (r1 != 0) goto L61
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.opentok.android.Session r1 = r4.getSession()
            r0 = 74
            int r0 = r0 / r3
            if (r1 == 0) goto L71
        L23:
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r2
            java.lang.String r2 = "OpenTok session %s is ready"
            if (r1 != 0) goto L4c
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            com.opentok.android.Session r0 = r4.getSession()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = r0.getSessionId()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.d(r2, r0)
        L44:
            r5.I = r4
            com.incode.welcome_sdk.ui.camera.CameraXActivity$OpenTokSessionInitResult r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.OpenTokSessionInitResult.f11353e
            r6.onSuccess(r0)
            return
        L4c:
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            com.opentok.android.Session r0 = r4.getSession()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = r0.getSessionId()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.d(r2, r0)
            goto L44
        L61:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.opentok.android.Session r0 = r4.getSession()
            if (r0 == 0) goto L71
            goto L23
        L71:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.String r1 = "OpenTok session is null"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.e(r1, r0)
            com.incode.welcome_sdk.ui.camera.CameraXActivity$OpenTokSessionInitResult r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.OpenTokSessionInitResult.f11351c
            r6.onSuccess(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.a(com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper, com.incode.welcome_sdk.ui.camera.CameraXActivity, io.reactivex.SingleEmitter):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = H + 101;
        G = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = H + 79;
        G = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r11) {
        /*
            r5 = 0
            r7 = r11[r5]
            com.incode.welcome_sdk.ui.camera.CameraXActivity r7 = (com.incode.welcome_sdk.ui.camera.CameraXActivity) r7
            r10 = 1
            r6 = r11[r10]
            io.reactivex.SingleEmitter r6 = (io.reactivex.SingleEmitter) r6
            r9 = 2
            int r0 = r9 % r9
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
            com.incode.welcome_sdk.data.b r3 = r0.currentStreamFramesModule
            boolean r0 = r7.isVideoStreamingAllowed()
            r8 = 0
            if (r0 == 0) goto L31
            int r2 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r2 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r9
            if (r1 == 0) goto L9f
            if (r3 != 0) goto L37
        L31:
            com.incode.welcome_sdk.ui.camera.CameraXActivity$OpenTokSessionInitResult r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.OpenTokSessionInitResult.f11351c
            r6.onSuccess(r0)
            return r8
        L37:
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper r0 = r7.I
            if (r0 != 0) goto L90
            int r1 = r2 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r9
            java.lang.String r2 = "Current stream frames module: %s"
            if (r1 != 0) goto L82
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r10] = r3
            r1.d(r2, r0)
            com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager r0 = r7.f11348z
            if (r0 != 0) goto L57
        L53:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r0 = r8
        L57:
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper r5 = r0.getOpenTokSession(r3)
            io.reactivex.disposables.CompositeDisposable r4 = r7.E
            io.reactivex.Completable r3 = r5.getSessionConnectedCompletable()
            r1 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Completable r3 = r3.timeout(r1, r0)
            com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda1 r2 = new com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda1
            r2.<init>()
            com.incode.welcome_sdk.ui.camera.CameraXActivity$o r1 = new com.incode.welcome_sdk.ui.camera.CameraXActivity$o
            r1.<init>(r5, r6)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda2 r0 = new com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda2
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r3.subscribe(r2, r0)
            r4.add(r0)
            return r8
        L82:
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            r1.d(r2, r0)
            com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager r0 = r7.f11348z
            if (r0 != 0) goto L57
            goto L53
        L90:
            com.incode.welcome_sdk.ui.camera.CameraXActivity$OpenTokSessionInitResult r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.OpenTokSessionInitResult.f11350b
            r6.onSuccess(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r9
            return r8
        L9f:
            r8.hashCode()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.b(java.lang.Object[]):java.lang.Object");
    }

    public void onCameraStreamingStartedConditionally() {
        int i2 = 2 % 2;
        int i3 = G + 91;
        H = i3 % 128;
        CameraPresenter cameraPresenter = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        CameraPresenter cameraPresenter2 = this.f11327e;
        if (cameraPresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = G + 35;
            H = i4 % 128;
            int i5 = i4 % 2;
        } else {
            cameraPresenter = cameraPresenter2;
        }
        cameraPresenter.enableProcessing(true);
    }

    public void onCameraAngleMeasured(boolean z2) {
        int i2 = 2 % 2;
        int i3 = H + 125;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11347y = z2;
            return;
        }
        this.f11347y = z2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CameraXActivity cameraXActivity = (CameraXActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = G + 97;
        H = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraXActivity, "");
        int i5 = H + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        G = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final class g extends Lambda implements Function1<OpenTokSessionInitResult, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11408a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11409c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(OpenTokSessionInitResult openTokSessionInitResult) {
            int i2 = 2 % 2;
            int i3 = f11409c + 17;
            f11408a = i3 % 128;
            int i4 = i3 % 2;
            a(openTokSessionInitResult);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(OpenTokSessionInitResult openTokSessionInitResult) {
            int i2 = 2 % 2;
            int i3 = f11408a + 109;
            f11409c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(openTokSessionInitResult, "");
                CameraXActivity.access$connectCameraPreviewWithOpenTok(CameraXActivity.this, openTokSessionInitResult);
            } else {
                Intrinsics.checkNotNullParameter(openTokSessionInitResult, "");
                CameraXActivity.access$connectCameraPreviewWithOpenTok(CameraXActivity.this, openTokSessionInitResult);
                int i4 = 61 / 0;
            }
        }

        g() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = G + 69;
        H = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = G + 37;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class h extends Lambda implements Function1<OpenTokSessionInitResult, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11411b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11412e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(OpenTokSessionInitResult openTokSessionInitResult) {
            int i2 = 2 % 2;
            int i3 = f11412e + 7;
            f11411b = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 62 / 0;
            }
            return unit;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f11412e + 43;
            f11411b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                CameraXActivity.this.onCameraStreamingStartedConditionally();
                obj.hashCode();
                throw null;
            }
            CameraXActivity.this.onCameraStreamingStartedConditionally();
            int i4 = f11411b + 101;
            f11412e = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        h() {
            super(1);
        }
    }

    static final class i extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11414a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11415b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f11416c = new i();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11417d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11418e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11415b + 69;
            f11417d = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f11415b + 125;
            f11417d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11415b + 15;
            f11417d = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Couldn't connect the camera preview with OpenTok", new Object[0]);
            int i5 = f11415b + 105;
            f11417d = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f11418e + 55;
            f11414a = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        i() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = H + 41;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = H + 67;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = G + 1;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = G + 101;
        H = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    static final class m extends Lambda implements Function1<Bitmap, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11440b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11441d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Bitmap bitmap) {
            int i2 = 2 % 2;
            int i3 = f11440b + 69;
            f11441d = i3 % 128;
            int i4 = i3 % 2;
            b(bitmap);
            Unit unit = Unit.INSTANCE;
            int i5 = f11441d + 95;
            f11440b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Object objAccess$getLastCompleteFrameLock$p = CameraXActivity.access$getLastCompleteFrameLock$p(CameraXActivity.this);
            CameraXActivity cameraXActivity = CameraXActivity.this;
            synchronized (objAccess$getLastCompleteFrameLock$p) {
                CameraXActivity.access$setLastCompleteFrameBitmap$p(cameraXActivity, bitmap);
                Unit unit = Unit.INSTANCE;
            }
            CameraPresenter cameraPresenterAccess$getCameraPresenter$p = CameraXActivity.access$getCameraPresenter$p(CameraXActivity.this);
            if (cameraPresenterAccess$getCameraPresenter$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cameraPresenterAccess$getCameraPresenter$p = null;
            }
            if (cameraPresenterAccess$getCameraPresenter$p.isIdealCaptureEnvironmentTestInProgress()) {
                return;
            }
            CameraXActivity.access$onPreviewRawBitmap(CameraXActivity.this, bitmap);
        }

        m() {
            super(1);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewStarted() {
        int i2 = 2 % 2;
        runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraXActivity.d(this.f$0);
            }
        });
        CompositeDisposable compositeDisposable = this.E;
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        Single singleObserveOn = ((Single) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this}, 1055487877, iA, -1055487873, iA2)).observeOn(AndroidSchedulers.mainThread());
        final g gVar = new g();
        Single singleObserveOn2 = singleObserveOn.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CameraXActivity.e(gVar, obj);
            }
        }).subscribeOn(this.f11324b).observeOn(AndroidSchedulers.mainThread());
        final h hVar = new h();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CameraXActivity.c(hVar, obj);
            }
        };
        final i iVar = i.f11416c;
        compositeDisposable.add(singleObserveOn2.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CameraXActivity.b(iVar, obj);
            }
        }));
        if (shouldProceedWithVideoLivenessFunction()) {
            int i3 = H + 121;
            G = i3 % 128;
            if (i3 % 2 == 0) {
                f();
                int i4 = 40 / 0;
            } else {
                f();
            }
        }
        IncodeCamera<StubAnalysisEvent> incodeCamera = this.f11326d;
        Intrinsics.checkNotNull(incodeCamera);
        incodeCamera.getFrameAnalyzerWrapper().setOnBitmapCallback(new m());
        int i5 = H + 117;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11435a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11436c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ File f11439e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f11435a + 13;
            f11436c = i3 % 128;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f11438d;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f11438d = 1;
                if (CameraXActivity.access$postProcessRecording(CameraXActivity.this, this.f11439e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = f11436c + 47;
            f11435a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11436c + 31;
            f11435a = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 72 / 0;
            }
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11435a + 55;
            f11436c = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 10 / 0;
            }
            int i6 = f11436c + 3;
            f11435a = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            l lVar = CameraXActivity.this.new l(this.f11439e, continuation);
            int i3 = f11436c + 11;
            f11435a = i3 % 128;
            int i4 = i3 % 2;
            return lVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(File file, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f11439e = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CameraXActivity cameraXActivity, File file, VideoRecordEvent videoRecordEvent) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraXActivity, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(videoRecordEvent, "");
        if (videoRecordEvent instanceof VideoRecordEvent.Start) {
            Timber.Forest.d("Video recording started.", new Object[0]);
            int i3 = H + 59;
            G = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (videoRecordEvent instanceof VideoRecordEvent.Pause) {
            Timber.Forest.d("Video recording paused.", new Object[0]);
            return;
        }
        if (videoRecordEvent instanceof VideoRecordEvent.Resume) {
            int i5 = G + 47;
            H = i5 % 128;
            int i6 = i5 % 2;
            Timber.Forest.d("Video recording resumed.", new Object[0]);
            return;
        }
        if (!(videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
            if (videoRecordEvent instanceof VideoRecordEvent.Status) {
                return;
            }
            Timber.Forest.w("Unhandled VideoRecordEvent: " + videoRecordEvent, new Object[0]);
            return;
        }
        int i7 = G + 99;
        H = i7 % 128;
        String message = null;
        if (i7 % 2 != 0) {
            ((VideoRecordEvent.Finalize) videoRecordEvent).hasError();
            message.hashCode();
            throw null;
        }
        if (!((VideoRecordEvent.Finalize) videoRecordEvent).hasError()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(cameraXActivity), Dispatchers.getIO(), null, cameraXActivity.new l(file, null), 2, null);
            return;
        }
        Timber.Forest forest = Timber.Forest;
        Throwable cause = ((VideoRecordEvent.Finalize) videoRecordEvent).getCause();
        if (cause != null) {
            message = cause.getMessage();
            int i8 = H + 77;
            G = i8 % 128;
            int i9 = i8 % 2;
        }
        forest.e("Error when finalizing selfie recording: " + message, new Object[0]);
        int i10 = G + 57;
        H = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void f() {
        int i2 = 2 % 2;
        final File file = new File(com.incode.welcome_sdk.modules.g.f10681a.e(getRepo()) + "/SelfieScanVideoRecordVideoFull.mp4");
        IncodeCamera<StubAnalysisEvent> incodeCamera = this.f11326d;
        Intrinsics.checkNotNull(incodeCamera);
        incodeCamera.startRecording(file, new androidx.core.util.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CameraXActivity.a(this.f$0, file, (VideoRecordEvent) obj);
            }
        });
        int i3 = G + 35;
        H = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b4 -> B:14:0x0049). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c6 -> B:14:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.io.File r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.e(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Bitmap getLastCompleteFrame() {
        Bitmap bitmap;
        synchronized (this.D) {
            bitmap = this.f11344v;
        }
        return bitmap;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public CameraPreview getCameraPreview() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 29;
        H = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        H = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    static final class f extends Lambda implements Function1<OpenTokSessionInitResult, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11405b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11406d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(OpenTokSessionInitResult openTokSessionInitResult) {
            int i2 = 2 % 2;
            int i3 = f11406d + 61;
            f11405b = i3 % 128;
            int i4 = i3 % 2;
            d(openTokSessionInitResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f11405b + 25;
            f11406d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(OpenTokSessionInitResult openTokSessionInitResult) {
            int i2 = 2 % 2;
            int i3 = f11405b + 39;
            f11406d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(openTokSessionInitResult, "");
                CameraXActivity.access$connectCameraPreviewWithOpenTok(CameraXActivity.this, openTokSessionInitResult);
                int i4 = 80 / 0;
            } else {
                Intrinsics.checkNotNullParameter(openTokSessionInitResult, "");
                CameraXActivity.access$connectCameraPreviewWithOpenTok(CameraXActivity.this, openTokSessionInitResult);
            }
            int i5 = f11406d + 71;
            f11405b = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        f() {
            super(1);
        }
    }

    static final class j extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11419a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11420b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11421c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11422d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f11423e = new j();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11419a + 51;
            f11422d = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f11419a + 85;
            f11422d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
            return unit;
        }

        private static void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11422d + 125;
            f11419a = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Couldn't connect the camera preview with OpenTok", new Object[0]);
            int i5 = f11419a + 79;
            f11422d = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f11421c + 7;
            f11420b = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        j() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = G + 75;
        H = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = G + 1;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = H + 3;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = G + 5;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewLayoutChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        this.f11333k = i2;
        this.f11336n = i3;
        this.f11334l = i4;
        this.f11335m = i5;
        this.f11337o = (getPreviewContainer().getWidth() - i2) / 2;
        this.f11339q = (getPreviewContainer().getHeight() - i3) / 2;
        CompositeDisposable compositeDisposable = this.E;
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        Single singleObserveOn = ((Single) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this}, 1055487877, iA, -1055487873, iA2)).subscribeOn(this.f11324b).observeOn(AndroidSchedulers.mainThread());
        final f fVar = new f();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CameraXActivity.a(fVar, obj);
            }
        };
        final j jVar = j.f11423e;
        compositeDisposable.add(singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CameraXActivity.j(jVar, obj);
            }
        }));
        int i7 = G + 61;
        H = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewRawFrame(byte[] bArr) {
        int i2 = 2 % 2;
        MovementDetector movementDetector = this.f11328f;
        CameraPresenter cameraPresenter = null;
        if (movementDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            movementDetector = null;
        }
        if (movementDetector.isDeviceStable()) {
            int i3 = G + 109;
            H = i3 % 128;
            int i4 = i3 % 2;
            CameraPresenter cameraPresenter2 = this.f11327e;
            if (cameraPresenter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                cameraPresenter = cameraPresenter2;
            }
            cameraPresenter.processPreviewRawFrame(bArr);
            int i5 = G + 89;
            H = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final void a(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = H + 113;
        G = i3 % 128;
        int i4 = i3 % 2;
        MovementDetector movementDetector = this.f11328f;
        CameraPresenter cameraPresenter = null;
        if (movementDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            movementDetector = null;
        }
        if (movementDetector.isDeviceStable()) {
            int i5 = H;
            int i6 = i5 + 45;
            G = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            CameraPresenter cameraPresenter2 = this.f11327e;
            if (cameraPresenter2 == null) {
                int i7 = i5 + 95;
                G = i7 % 128;
                if (i7 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    cameraPresenter.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i8 = H + 49;
                G = i8 % 128;
                int i9 = i8 % 2;
            } else {
                cameraPresenter = cameraPresenter2;
            }
            cameraPresenter.processPreviewRawBitmap(bitmap);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopVideoRecording() {
        int i2 = 2 % 2;
        int i3 = G + 111;
        H = i3 % 128;
        int i4 = i3 % 2;
        IncodeCamera<StubAnalysisEvent> incodeCamera = this.f11326d;
        Intrinsics.checkNotNull(incodeCamera);
        incodeCamera.stopRecording();
        int i5 = G + 51;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void restartVideoRecording() {
        int i2 = 2 % 2;
        int i3 = G + 73;
        H = i3 % 128;
        int i4 = i3 % 2;
        f();
        int i5 = H + 97;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.RecordableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    protected void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = H + 91;
        G = i5 % 128;
        int i6 = i5 % 2;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002 || i2 == 1005) {
            if (i3 != -1) {
                onVideoRecordingPermissionDenied();
                int i7 = G + 47;
                H = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            IncodeWelcome.Companion companion = IncodeWelcome.Companion;
            Intrinsics.checkNotNull(intent);
            IncodeWelcome.recordingPermissionData = new IncodeWelcome.RecordingPermissionData(intent, i3);
            c();
            int i9 = G + 31;
            H = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 65 / 0;
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        int i3 = G + 47;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            if (!isChained()) {
                handlePermissionDenied(exc);
            }
            finish();
            int i4 = G + 117;
            H = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
                return;
            }
            return;
        }
        isChained();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setStreamFramesEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 47;
        H = i4 % 128;
        int i5 = i4 % 2;
        this.C = z2;
        int i6 = i3 + 41;
        H = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
    }

    public final void setStreamAudioEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = H + 61;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        this.A = z2;
        int i6 = i4 + 97;
        H = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setVideoLivenessRecordingEnabledClientSide(boolean z2) {
        int i2 = 2 % 2;
        int i3 = G + 65;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        this.B = z2;
        int i6 = i4 + 15;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CameraXActivity cameraXActivity, SingleEmitter singleEmitter) {
        int i2 = 2 % 2;
        int i3 = G + 31;
        H = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraXActivity, "");
        Intrinsics.checkNotNullParameter(singleEmitter, "");
        if (cameraXActivity.shouldProceedWithVideoLivenessFunction()) {
            int i5 = H + 19;
            G = i5 % 128;
            int i6 = i5 % 2;
            cameraXActivity.stopVideoRecording();
        }
        cameraXActivity.setFrameStreamingAllowed(false);
        try {
            IncodeCamera<StubAnalysisEvent> incodeCamera = cameraXActivity.f11326d;
            Intrinsics.checkNotNull(incodeCamera);
            incodeCamera.zoomCameraToMax();
            singleEmitter.onSuccess(100);
            int i7 = H + 17;
            G = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 51 / 0;
            }
        } catch (Exception unused) {
            singleEmitter.onSuccess(-3);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> startIdealCaptureEnvironmentTest() {
        Single<Integer> singleCreate;
        int i2 = 2 % 2;
        int i3 = G + 113;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda14
                @Override // io.reactivex.SingleOnSubscribe
                public final void subscribe(SingleEmitter singleEmitter) {
                    CameraXActivity.a(this.f$0, singleEmitter);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleCreate, "");
            int i4 = 56 / 0;
        } else {
            singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda14
                @Override // io.reactivex.SingleOnSubscribe
                public final void subscribe(SingleEmitter singleEmitter) {
                    CameraXActivity.a(this.f$0, singleEmitter);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleCreate, "");
        }
        int i5 = G + 25;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return singleCreate;
    }

    private final Completable i() {
        int i2 = 2 % 2;
        int i3 = G + 63;
        H = i3 % 128;
        int i4 = i3 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CameraXActivity.c(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFromCallable, "");
        int i5 = G + 29;
        H = i5 % 128;
        int i6 = i5 % 2;
        return completableFromCallable;
    }

    static final class d extends Lambda implements Function1<IdealEnvironmentTestResult, SingleSource<? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11390a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11391b = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends Integer> invoke(IdealEnvironmentTestResult idealEnvironmentTestResult) {
            int i2 = 2 % 2;
            int i3 = f11390a + 37;
            f11391b = i3 % 128;
            IdealEnvironmentTestResult idealEnvironmentTestResult2 = idealEnvironmentTestResult;
            if (i3 % 2 == 0) {
                a(idealEnvironmentTestResult2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SingleSource<? extends Integer> singleSourceA = a(idealEnvironmentTestResult2);
            int i4 = f11391b + 65;
            f11390a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return singleSourceA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CompletableSource e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f11390a + 87;
            f11391b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f11390a + 31;
            f11391b = i5 % 128;
            if (i5 % 2 != 0) {
                return completableSource;
            }
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleSource d(Function1 function1, Object obj) {
            SingleSource singleSource;
            int i2 = 2 % 2;
            int i3 = f11390a + 71;
            f11391b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                singleSource = (SingleSource) function1.invoke(obj);
                int i4 = 12 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                singleSource = (SingleSource) function1.invoke(obj);
            }
            int i5 = f11391b + 81;
            f11390a = i5 % 128;
            if (i5 % 2 == 0) {
                return singleSource;
            }
            throw null;
        }

        private SingleSource<? extends Integer> a(final IdealEnvironmentTestResult idealEnvironmentTestResult) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(idealEnvironmentTestResult, "");
            CameraPresenter cameraPresenterAccess$getCameraPresenter$p = CameraXActivity.access$getCameraPresenter$p(CameraXActivity.this);
            if (cameraPresenterAccess$getCameraPresenter$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = f11391b + 13;
                f11390a = i3 % 128;
                int i4 = i3 % 2;
                cameraPresenterAccess$getCameraPresenter$p = null;
            }
            Single<ResponseSuccess> singleSingleOrError = cameraPresenterAccess$getCameraPresenter$p.sendZoomedFrame(idealEnvironmentTestResult.getSource(), idealEnvironmentTestResult.getBitmap()).singleOrError();
            final CameraXActivity cameraXActivity = CameraXActivity.this;
            final Function1<ResponseSuccess, CompletableSource> function1 = new Function1<ResponseSuccess, CompletableSource>() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity.d.4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f11397b = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f11398e = 0;

                private CompletableSource c(ResponseSuccess responseSuccess) {
                    int i5 = 2 % 2;
                    int i6 = f11398e + 85;
                    f11397b = i6 % 128;
                    Object obj = null;
                    if (i6 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(responseSuccess, "");
                        CameraXActivity.access$restoreCameraZoomCompletable(cameraXActivity);
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(responseSuccess, "");
                    Completable completableAccess$restoreCameraZoomCompletable = CameraXActivity.access$restoreCameraZoomCompletable(cameraXActivity);
                    int i7 = f11397b + 25;
                    f11398e = i7 % 128;
                    if (i7 % 2 == 0) {
                        return completableAccess$restoreCameraZoomCompletable;
                    }
                    obj.hashCode();
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(ResponseSuccess responseSuccess) {
                    int i5 = 2 % 2;
                    int i6 = f11398e + 13;
                    f11397b = i6 % 128;
                    ResponseSuccess responseSuccess2 = responseSuccess;
                    if (i6 % 2 == 0) {
                        c(responseSuccess2);
                        throw null;
                    }
                    CompletableSource completableSourceC = c(responseSuccess2);
                    int i7 = f11398e + 3;
                    f11397b = i7 % 128;
                    if (i7 % 2 != 0) {
                        return completableSourceC;
                    }
                    throw null;
                }

                {
                    super(1);
                }
            };
            Single singleAndThen = singleSingleOrError.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$d$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CameraXActivity.d.e(function1, obj);
                }
            }).andThen(Single.just(Integer.valueOf(idealEnvironmentTestResult.getResult())));
            final CameraXActivity cameraXActivity2 = CameraXActivity.this;
            final Function1<Throwable, SingleSource<? extends Integer>> function12 = new Function1<Throwable, SingleSource<? extends Integer>>() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity.d.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f11393a = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f11394e = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ SingleSource<? extends Integer> invoke(Throwable th) {
                    int i5 = 2 % 2;
                    int i6 = f11393a + 81;
                    f11394e = i6 % 128;
                    int i7 = i6 % 2;
                    SingleSource<? extends Integer> singleSourceE = e(th);
                    int i8 = f11393a + 81;
                    f11394e = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 95 / 0;
                    }
                    return singleSourceE;
                }

                private SingleSource<? extends Integer> e(Throwable th) {
                    Single singleJust;
                    int i5 = 2 % 2;
                    int i6 = f11394e + 21;
                    f11393a = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.checkNotNullParameter(th, "");
                    Completable completableAccess$restoreCameraZoomCompletable = CameraXActivity.access$restoreCameraZoomCompletable(cameraXActivity2);
                    if (th instanceof NoConnectivityException) {
                        int i8 = f11393a + 67;
                        f11394e = i8 % 128;
                        int i9 = i8 % 2;
                        singleJust = Single.just(Integer.valueOf(idealEnvironmentTestResult.getResult()));
                    } else {
                        singleJust = Single.error(th);
                    }
                    return completableAccess$restoreCameraZoomCompletable.andThen(singleJust);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            Single singleSubscribeOn = singleAndThen.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$d$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CameraXActivity.d.d(function12, obj);
                }
            }).subscribeOn(Schedulers.io());
            int i5 = f11390a + 23;
            f11391b = i5 % 128;
            int i6 = i5 % 2;
            return singleSubscribeOn;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource f(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = H + 79;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = G + 19;
        H = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestSingle(int i2) {
        int i3 = 2 % 2;
        Single singleJust = Single.just(evaluateFrameForIdealCaptureEnvironmentTest(i2));
        final d dVar = new d();
        Single<Integer> singleFlatMap = singleJust.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CameraXActivity.f(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "");
        int i4 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        H = i4 % 128;
        if (i4 % 2 == 0) {
            return singleFlatMap;
        }
        throw null;
    }

    protected IdealEnvironmentTestResult evaluateFrameForIdealCaptureEnvironmentTest(int i2) throws Exception {
        int i3 = 2 % 2;
        IdealEnvironmentTestResult idealEnvironmentTestResult = new IdealEnvironmentTestResult(-2, null, null);
        int i4 = G + 7;
        H = i4 % 128;
        if (i4 % 2 == 0) {
            return idealEnvironmentTestResult;
        }
        throw null;
    }

    public final void setFrameStreamingAllowed(boolean z2) {
        int i2 = 2 % 2;
        int i3 = H + 65;
        G = i3 % 128;
        int i4 = i3 % 2;
        IncodeCamera<StubAnalysisEvent> incodeCamera = this.f11326d;
        Intrinsics.checkNotNull(incodeCamera);
        incodeCamera.getFrameAnalyzerWrapper().setFrameCallbackAllowed(z2);
        int i5 = G + 111;
        H = i5 % 128;
        int i6 = i5 % 2;
    }

    private final float g() {
        float centerBrightnessLevel;
        int i2 = 2 % 2;
        int i3 = H + 73;
        G = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(getLastCompleteFrame());
                int i4 = 45 / 0;
            } else {
                centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(getLastCompleteFrame());
            }
            return centerBrightnessLevel;
        } catch (ImageProcessingKitInvalidInputException e2) {
            throw new RuntimeException(e2);
        } catch (ImageProcessingKitProcessException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CameraXActivity cameraXActivity) {
        int i2 = 2 % 2;
        int i3 = G + 69;
        H = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraXActivity, "");
        IncodeCamera<StubAnalysisEvent> incodeCamera = cameraXActivity.f11326d;
        Intrinsics.checkNotNull(incodeCamera);
        incodeCamera.setMinExposureCompensation();
        int i5 = H + 73;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public Single<Integer> evaluateFrameForIdealCaptureEnvironmentTestFallbackSingle() {
        int i2 = 2 % 2;
        Single singleDelay = Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Action
            public final void run() {
                CameraXActivity.e(this.f$0);
            }
        }).subscribeOn(Schedulers.computation()).delay(1000L, TimeUnit.MILLISECONDS).andThen(Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda9
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                CameraXActivity.c(this.f$0, singleEmitter);
            }
        })).delay(1000L, TimeUnit.MILLISECONDS);
        final a aVar = new a();
        Single<Integer> singleOnErrorReturn = singleDelay.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CameraXActivity.g(aVar, obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CameraXActivity.e(this.f$0, (Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "");
        int i3 = G + 117;
        H = i3 % 128;
        int i4 = i3 % 2;
        return singleOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CameraXActivity cameraXActivity, SingleEmitter singleEmitter) {
        int i2 = 2 % 2;
        int i3 = H + 99;
        G = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cameraXActivity, "");
        Intrinsics.checkNotNullParameter(singleEmitter, "");
        IncodeCamera<StubAnalysisEvent> incodeCamera = cameraXActivity.f11326d;
        Intrinsics.checkNotNull(incodeCamera);
        if (incodeCamera.getExposureCompensationState() != IncodeCamera.ExposureCompensationState.MIN) {
            singleEmitter.onError(new Exception("error 1"));
        }
        float fG = cameraXActivity.g();
        IncodeCamera<StubAnalysisEvent> incodeCamera2 = cameraXActivity.f11326d;
        Intrinsics.checkNotNull(incodeCamera2);
        incodeCamera2.setMaxExposureCompensation();
        singleEmitter.onSuccess(Float.valueOf(fG));
        int i5 = H + 85;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class a extends Lambda implements Function1<Float, SingleSource<? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11361a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11362e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends Integer> invoke(Float f2) {
            int i2 = 2 % 2;
            int i3 = f11361a + 13;
            f11362e = i3 % 128;
            Object obj = null;
            Float f3 = f2;
            if (i3 % 2 == 0) {
                a(f3);
                obj.hashCode();
                throw null;
            }
            SingleSource<? extends Integer> singleSourceA = a(f3);
            int i4 = f11362e + 97;
            f11361a = i4 % 128;
            if (i4 % 2 == 0) {
                return singleSourceA;
            }
            throw null;
        }

        private SingleSource<? extends Integer> a(final Float f2) {
            int i2 = 2 % 2;
            int i3 = f11362e + 115;
            f11361a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(f2, "");
                final CameraXActivity cameraXActivity = CameraXActivity.this;
                Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$a$$ExternalSyntheticLambda0
                    @Override // io.reactivex.SingleOnSubscribe
                    public final void subscribe(SingleEmitter singleEmitter) {
                        CameraXActivity.a.d(cameraXActivity, f2, singleEmitter);
                    }
                });
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(f2, "");
            final CameraXActivity cameraXActivity2 = CameraXActivity.this;
            Single singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.ui.camera.CameraXActivity$a$$ExternalSyntheticLambda0
                @Override // io.reactivex.SingleOnSubscribe
                public final void subscribe(SingleEmitter singleEmitter) {
                    CameraXActivity.a.d(cameraXActivity2, f2, singleEmitter);
                }
            });
            int i4 = f11362e + 105;
            f11361a = i4 % 128;
            int i5 = i4 % 2;
            return singleCreate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void d(com.incode.welcome_sdk.ui.camera.CameraXActivity r4, java.lang.Float r5, io.reactivex.SingleEmitter r6) {
            /*
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.a.f11361a
                int r1 = r0 + 5
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.CameraXActivity.a.f11362e = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 != 0) goto L51
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                com.incode.camera.IncodeCamera r0 = r4.getIncodeCamera()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                com.incode.camera.IncodeCamera$ExposureCompensationState r2 = r0.getExposureCompensationState()
                com.incode.camera.IncodeCamera$ExposureCompensationState r1 = com.incode.camera.IncodeCamera.ExposureCompensationState.MAX
                r0 = 28
                int r0 = r0 / 0
                if (r2 == r1) goto L38
            L2c:
                java.lang.Exception r1 = new java.lang.Exception
                java.lang.String r0 = "error 2"
                r1.<init>(r0)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r6.onError(r1)
            L38:
                float r1 = com.incode.welcome_sdk.ui.camera.CameraXActivity.access$getLastCompleteFrameCenterBrightness(r4)
                float r0 = r5.floatValue()
                float r1 = r1 / r0
                r0 = 1068708659(0x3fb33333, float:1.4)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 >= 0) goto L6a
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.onSuccess(r0)
                return
            L51:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                com.incode.camera.IncodeCamera r0 = r4.getIncodeCamera()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                com.incode.camera.IncodeCamera$ExposureCompensationState r1 = r0.getExposureCompensationState()
                com.incode.camera.IncodeCamera$ExposureCompensationState r0 = com.incode.camera.IncodeCamera.ExposureCompensationState.MAX
                if (r1 == r0) goto L38
                goto L2c
            L6a:
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.onSuccess(r0)
                int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.a.f11361a
                int r1 = r0 + 41
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.CameraXActivity.a.f11362e = r0
                int r1 = r1 % r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.a.d(com.incode.welcome_sdk.ui.camera.CameraXActivity, java.lang.Float, io.reactivex.SingleEmitter):void");
        }

        a() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = G + 103;
        H = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = G + 45;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return singleSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer e(CameraXActivity cameraXActivity, Throwable th) {
        int i2 = 2 % 2;
        int i3 = H + 83;
        G = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraXActivity, "");
            Intrinsics.checkNotNullParameter(th, "");
            IncodeCamera<StubAnalysisEvent> incodeCamera = cameraXActivity.f11326d;
            Intrinsics.checkNotNull(incodeCamera);
            incodeCamera.getExposureCompensationState();
            IncodeCamera.ExposureCompensationState exposureCompensationState = IncodeCamera.ExposureCompensationState.UNSUPPORTED;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(cameraXActivity, "");
        Intrinsics.checkNotNullParameter(th, "");
        IncodeCamera<StubAnalysisEvent> incodeCamera2 = cameraXActivity.f11326d;
        Intrinsics.checkNotNull(incodeCamera2);
        if (incodeCamera2.getExposureCompensationState() != IncodeCamera.ExposureCompensationState.UNSUPPORTED) {
            return 4;
        }
        int i4 = H + 89;
        G = i4 % 128;
        int i5 = i4 % 2;
        int i6 = G + 113;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            return 2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[PHI: r5
  0x008b: PHI (r5v1 com.incode.welcome_sdk.IncodeWelcome) = (r5v0 com.incode.welcome_sdk.IncodeWelcome), (r5v4 com.incode.welcome_sdk.IncodeWelcome) binds: [B:28:0x0088, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[PHI: r5
  0x0022: PHI (r5v3 com.incode.welcome_sdk.IncodeWelcome) = (r5v0 com.incode.welcome_sdk.IncodeWelcome), (r5v4 com.incode.welcome_sdk.IncodeWelcome) binds: [B:28:0x0088, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean j() {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.G
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.H = r0
            int r1 = r1 % r6
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L78
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r5 = r0.getInstance()
            com.incode.welcome_sdk.IncodeWelcome$InternalConfig r0 = r5.getInternalConfig()
            com.incode.welcome_sdk.data.remote.beans.h r1 = r0.getSelfieDeepsightLiveness()
            com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9676d
            if (r1 != r0) goto L8b
        L22:
            r1 = r4
        L23:
            boolean r0 = r7.B
            r0 = r0 ^ r4
            if (r0 == r4) goto L75
        L28:
            com.incode.welcome_sdk.SdkMode r2 = r5.getSdkMode()
            boolean r0 = com.incode.welcome_sdk.ui.camera.IncodeCameraProvider.doesCameraDependencyExist()
            if (r0 != 0) goto L3d
            com.incode.welcome_sdk.commons.exceptions.MissingCameraDependencyException r0 = new com.incode.welcome_sdk.commons.exceptions.MissingCameraDependencyException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r5.onError(r0)
        L3c:
            return r3
        L3d:
            boolean r0 = r7.B
            if (r0 == 0) goto L52
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L8d
            com.incode.welcome_sdk.SdkMode r0 = com.incode.welcome_sdk.SdkMode.CAPTURE_ONLY
            if (r2 != r0) goto L60
        L50:
            r3 = r4
            goto L3c
        L52:
            com.incode.welcome_sdk.SdkMode r0 = com.incode.welcome_sdk.SdkMode.STANDARD
            if (r2 != r0) goto L6a
            int r0 = com.incode.welcome_sdk.ui.camera.CameraXActivity.H
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.CameraXActivity.G = r0
            int r1 = r1 % r6
            goto L50
        L60:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.String r1 = "SelfieScan.VideoLivenessRecordingEnabled is only recognized in CAPTURE_ONLY mode. Ignoring setting!"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.w(r1, r0)
            goto L3c
        L6a:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.String r1 = "videoLivenessRecordingEnabledServerSide is only recognized in STANDARD mode. Ignoring setting!"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.w(r1, r0)
            goto L3c
        L75:
            if (r1 == 0) goto L3c
            goto L28
        L78:
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r5 = r0.getInstance()
            com.incode.welcome_sdk.IncodeWelcome$InternalConfig r0 = r5.getInternalConfig()
            com.incode.welcome_sdk.data.remote.beans.h r1 = r0.getSelfieDeepsightLiveness()
            com.incode.welcome_sdk.data.remote.beans.h r0 = com.incode.welcome_sdk.data.remote.beans.h.f9676d
            if (r1 != r0) goto L8b
            goto L22
        L8b:
            r1 = r3
            goto L23
        L8d:
            com.incode.welcome_sdk.SdkMode r0 = com.incode.welcome_sdk.SdkMode.CAPTURE_ONLY
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.CameraXActivity.j():boolean");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        CameraXActivity cameraXActivity = (CameraXActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = H + 21;
        G = i3 % 128;
        int i4 = i3 % 2;
        IncodeCamera<StubAnalysisEvent> incodeCamera = cameraXActivity.f11326d;
        if (incodeCamera == null) {
            Timber.Forest.e("cameraSource must be initialized before video liveness support can be reliably determined", new Object[0]);
            return false;
        }
        Intrinsics.checkNotNull(incodeCamera);
        boolean zIsVideoLivenessRecordingSupported = incodeCamera.isVideoLivenessRecordingSupported();
        int i5 = G + 31;
        H = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(zIsVideoLivenessRecordingSupported);
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public boolean shouldProceedWithVideoLivenessFunction() {
        int i2 = 2 % 2;
        int i3 = H + 109;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            j();
            throw null;
        }
        if (j()) {
            int i4 = G + 89;
            H = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {this};
            int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            int iA4 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            if (i5 != 0) {
                ((Boolean) d(iA4, iA3, objArr, -1931519485, iA, 1931519488, iA2)).booleanValue();
                throw null;
            }
            if (((Boolean) d(iA4, iA3, objArr, -1931519485, iA, 1931519488, iA2)).booleanValue()) {
                int i6 = G + 21;
                int i7 = i6 % 128;
                H = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 11;
                G = i9 % 128;
                if (i9 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        int i10 = H + 89;
        G = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    protected final boolean isVideoStreamingAllowed() {
        int i2 = 2 % 2;
        int i3 = H + 99;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (!j()) {
            int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
            if (((Boolean) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this}, -641340169, iA, 641340171, iA2)).booleanValue()) {
                int i5 = G + 67;
                H = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        int i7 = H + 21;
        G = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        CameraXActivity cameraXActivity = (CameraXActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = G + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        Object obj = null;
        boolean z2 = cameraXActivity.C;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z2) {
            int i6 = i4 + 9;
            G = i6 % 128;
            int i7 = i6 % 2;
            com.incode.welcome_sdk.data.b bVar = IncodeWelcome.Companion.getInstance().currentStreamFramesModule;
            if (i7 == 0) {
                throw null;
            }
            if (bVar != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean o() {
        int i2 = 2 % 2;
        int i3 = G + 17;
        H = i3 % 128;
        if (i3 % 2 != 0) {
            j();
            throw null;
        }
        if (j() || !IncodeWelcome.Companion.getInstance().getInternalConfig().isRecordSession()) {
            return false;
        }
        int i4 = G + 85;
        H = i4 % 128;
        return i4 % 2 == 0;
    }

    final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11400c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11401e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f11402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IncodeCamera<StubAnalysisEvent> f11403b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ CameraXActivity f11404d;

        public e(CameraXActivity cameraXActivity, IncodeCamera<StubAnalysisEvent> incodeCamera, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(incodeCamera, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.f11404d = cameraXActivity;
            this.f11403b = incodeCamera;
            this.f11402a = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = 2 % 2;
            int i11 = f11401e + 81;
            f11400c = i11 % 128;
            int i12 = i11 % 2;
            PreviewView previewView = this.f11403b.getPreviewView();
            Preview imagePreview = this.f11403b.getImagePreview();
            ResolutionInfo resolutionInfo = imagePreview.getResolutionInfo();
            Intrinsics.checkNotNull(resolutionInfo);
            Size resolution = resolutionInfo.getResolution();
            Intrinsics.checkNotNullExpressionValue(resolution, "");
            int width = resolution.getWidth();
            int height = resolution.getHeight();
            ResolutionInfo resolutionInfo2 = imagePreview.getResolutionInfo();
            Intrinsics.checkNotNull(resolutionInfo2);
            if (com.incode.welcome_sdk.commons.utils.e.a(resolutionInfo2.getRotationDegrees())) {
                width = resolution.getHeight();
                height = resolution.getWidth();
                int i13 = f11401e + 11;
                f11400c = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = i4 - i2;
            int i16 = i5 - i3;
            if (CameraXActivity.access$getCameraPreviewType$p(this.f11404d) == CameraPreviewType.FIXED_WIDTH) {
                int i17 = (height * i15) / width;
                Timber.Forest.d("Camera: child dimensions, width: %s, height: %s, aspectRatio: %s", Integer.valueOf(i15), Integer.valueOf(i17), Float.valueOf(i15 / i17));
                int i18 = (i16 - i17) / 2;
                int i19 = (i17 + i16) / 2;
                Timber.Forest.d("Camera: child layout, left: %s, newTop: %s, right: %s, newBottom: %s", 0, Integer.valueOf(i18), Integer.valueOf(i15), Integer.valueOf(i19));
                previewView.layout(0, i18, i15, i19);
                CameraPresenter cameraPresenterAccess$getCameraPresenter$p = CameraXActivity.access$getCameraPresenter$p(this.f11404d);
                if (cameraPresenterAccess$getCameraPresenter$p == null) {
                    int i20 = f11400c + 111;
                    f11401e = i20 % 128;
                    int i21 = i20 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    cameraPresenterAccess$getCameraPresenter$p = null;
                }
                cameraPresenterAccess$getCameraPresenter$p.onCameraSizeParamsChanged(resolution.getWidth(), resolution.getHeight(), width, height, f.c.CROP_HEIGHT, ab.a(0, this.f11404d.getCameraFacing(), CameraXActivity.access$getLastKnownOrientation$p(this.f11404d)));
                Point pointC = com.incode.welcome_sdk.commons.utils.f.c(width, height, i15, i16, f.c.CROP_HEIGHT);
                this.f11404d.onPreviewLayoutChanged(pointC.x, pointC.y, width, height);
            } else {
                Rect rect = new Rect(0, 561, 720, 1841);
                previewView.layout(rect.left, rect.top, rect.right, rect.bottom);
                ((OverlayWithHoleImageView) this.f11404d.findViewById(R.id.circularCameraOverlay)).layout(rect.left, rect.top, rect.right, rect.bottom);
                Timber.Forest.d("Camera: child layout, left: %s, top: %s, right: %s, bottom: %s", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                CameraPresenter cameraPresenterAccess$getCameraPresenter$p2 = CameraXActivity.access$getCameraPresenter$p(this.f11404d);
                if (cameraPresenterAccess$getCameraPresenter$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    cameraPresenterAccess$getCameraPresenter$p2 = null;
                }
                cameraPresenterAccess$getCameraPresenter$p2.onCameraSizeParamsChanged(previewView.getWidth(), previewView.getHeight(), width, height, null, ab.a(0, this.f11404d.getCameraFacing(), CameraXActivity.access$getLastKnownOrientation$p(this.f11404d)));
                this.f11404d.onPreviewLayoutChanged(720, 1280, 720, 1280);
            }
            this.f11404d.onPreviewStarted();
            this.f11402a.removeOnLayoutChangeListener(this);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
        int i2 = M + 15;
        L = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(CameraXActivity cameraXActivity) {
        Object[] objArr = {cameraXActivity};
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        return (Unit) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), objArr, -540303201, iA, 540303206, iA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CameraXActivity cameraXActivity) {
        Object[] objArr = {cameraXActivity};
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), objArr, 861472772, iA, -861472771, iA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CameraXActivity cameraXActivity, SingleEmitter singleEmitter) {
        Object[] objArr = {cameraXActivity, singleEmitter};
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), objArr, -359678769, iA, 359678769, iA2);
    }

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f11370a = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f11371h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f11372i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f11373j = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f11375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f11376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f11377e;

        public static int c() {
            int i2 = f11370a;
            int i3 = i2 % 7437067;
            f11370a = i2 + 1;
            if (i3 != 0) {
                return f11372i;
            }
            int iMyPid = Process.myPid();
            f11372i = iMyPid;
            return iMyPid;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objAccess$awaitPreviewUseCaseBinding;
            int i2 = 2 % 2;
            int i3 = f11371h + 51;
            f11373j = i3 % 128;
            int i4 = i3 % 2;
            this.f11376d = obj;
            this.f11374b |= Integer.MIN_VALUE;
            CameraXActivity cameraXActivity = CameraXActivity.this;
            if (i4 == 0) {
                objAccess$awaitPreviewUseCaseBinding = CameraXActivity.access$awaitPreviewUseCaseBinding(cameraXActivity, this);
                int i5 = 32 / 0;
            } else {
                objAccess$awaitPreviewUseCaseBinding = CameraXActivity.access$awaitPreviewUseCaseBinding(cameraXActivity, this);
            }
            int i6 = f11371h + 1;
            f11373j = i6 % 128;
            if (i6 % 2 != 0) {
                return objAccess$awaitPreviewUseCaseBinding;
            }
            throw null;
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    private final boolean l() {
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        return ((Boolean) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this}, -641340169, iA, 641340171, iA2)).booleanValue();
    }

    private final boolean k() {
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        return ((Boolean) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this}, -1931519485, iA, 1931519488, iA2)).booleanValue();
    }

    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f11424g = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f11425m = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f11428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f11429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f11430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f11431f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f11432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f11433i;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            int i2 = 2 % 2;
            int i3 = f11425m + 47;
            f11424g = i3 % 128;
            int i4 = i3 % 2;
            this.f11432h = obj;
            this.f11433i |= Integer.MIN_VALUE;
            Object objAccess$postProcessRecording = CameraXActivity.access$postProcessRecording(CameraXActivity.this, null, this);
            int i5 = f11424g + 67;
            f11425m = i5 % 128;
            int i6 = i5 % 2;
            return objAccess$postProcessRecording;
        }

        k(Continuation<? super k> continuation) {
            super(continuation);
        }
    }

    private final Single<OpenTokSessionInitResult> h() {
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        return (Single) d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this}, 1055487877, iA, -1055487873, iA2);
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11358a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f11359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11360e = 0;

        static {
            int[] iArr = new int[OpenTokSessionInitResult.values().length];
            try {
                iArr[OpenTokSessionInitResult.f11353e.ordinal()] = 1;
                int i2 = f11360e + 49;
                f11358a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenTokSessionInitResult.f11350b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11359d = iArr;
            int i5 = f11360e + 63;
            f11358a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 64 / 0;
            }
        }
    }

    private final void d(IncodeCamera<StubAnalysisEvent> incodeCamera) {
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this, incodeCamera}, -1712251328, iA, 1712251334, iA2);
    }

    private final void e(IncodeCamera<StubAnalysisEvent> incodeCamera) {
        int iA = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA2 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        int iA3 = IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a();
        d(IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.a(), iA3, new Object[]{this, incodeCamera}, -1403244805, iA, 1403244812, iA2);
    }
}
