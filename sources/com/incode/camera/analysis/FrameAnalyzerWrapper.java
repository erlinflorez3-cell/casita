package com.incode.camera.analysis;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.exifinterface.media.ExifInterface;
import com.braze.models.FeatureFlag;
import com.incode.camera.analysis.AnalysisEvent;
import com.incode.camera.commons.utils.BitmapUtils;
import com.incode.camera.commons.utils.ExecLogger;
import com.incode.camera.commons.utils.SizeFloat;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B3\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020%H\u0016J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020%H\u0002J \u00101\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020%2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002J\u000e\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0011R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/incode/camera/analysis/FrameAnalyzerWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "frameAnalyzer", "Lcom/incode/camera/analysis/FrameAnalyzer;", "previewSize", "Lkotlin/Function0;", "Lkotlin/Pair;", "", "(Lcom/incode/camera/analysis/FrameAnalyzer;Lkotlin/jvm/functions/Function0;)V", "cachedDerivedSize", "Lcom/incode/camera/commons/utils/SizeFloat;", "cachedPreviewSizePair", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "execLogger", "Lcom/incode/camera/commons/utils/ExecLogger;", "getFrameAnalyzer", "()Lcom/incode/camera/analysis/FrameAnalyzer;", "frameCallbackAllowed", "", "getFrameCallbackAllowed", "()Z", "setFrameCallbackAllowed", "(Z)V", "onBitmapCallback", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "getOnBitmapCallback", "()Lkotlin/jvm/functions/Function1;", "setOnBitmapCallback", "(Lkotlin/jvm/functions/Function1;)V", "onFrameCallback", "Landroidx/camera/core/ImageProxy;", "getOnFrameCallback", "setOnFrameCallback", "processingJob", "Lkotlinx/coroutines/Job;", "results", "getResults", "scope", "Lkotlinx/coroutines/CoroutineScope;", "analyze", FeatureFlag.PROPERTIES_TYPE_IMAGE, "convertToBitmap", "extractBitmapAndMatchToPreview", "previewLong", "", "previewShort", "pauseImageProcessing", "pauseProcessing", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FrameAnalyzerWrapper<T extends AnalysisEvent> implements ImageAnalysis.Analyzer {
    private static int getCameraState = 0;
    private static int setExposureCompensationState = 1;
    private final Flow<T> CameraConstants;
    private final Function0<Pair<Integer, Integer>> IncodeCamera;
    private final FrameAnalyzer<T, ?> ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1 */
    private final CoroutineScope f3577e1;
    private final ExecLogger getAvailableCameraInternals;
    private Job getConfig;
    private boolean getContext;
    private SizeFloat getExposureCompensationState;
    private final Flow<T> getFrameAnalyzerWrapper;
    private Pair<Integer, Integer> getImagePreview;
    private Function1<? super Bitmap, Unit> getPreviewView;
    private Function1<? super ImageProxy, Unit> setConfig;

    public FrameAnalyzerWrapper(FrameAnalyzer<T, ?> frameAnalyzer, Function0<Pair<Integer, Integer>> function0) {
        MutableSharedFlow mutableSharedFlow;
        Intrinsics.checkNotNullParameter(function0, "");
        this.ProcessCameraProviderExtensionsKt = frameAnalyzer;
        this.IncodeCamera = function0;
        this.getAvailableCameraInternals = new ExecLogger("IncodeAnalyzerWrapper");
        this.f3577e1 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        Flow<T> flow = null;
        this.CameraConstants = (frameAnalyzer == null || (mutableSharedFlow = (Flow<T>) frameAnalyzer.getEvents()) == null) ? SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null) : mutableSharedFlow;
        this.getFrameAnalyzerWrapper = frameAnalyzer != null ? (Flow<T>) frameAnalyzer.getEvents() : flow;
        this.getContext = true;
    }

    public final FrameAnalyzer<T, ?> getFrameAnalyzer() {
        int i2 = 2 % 2;
        int i3 = getCameraState + 93;
        int i4 = i3 % 128;
        setExposureCompensationState = i4;
        int i5 = i3 % 2;
        FrameAnalyzer<T, ?> frameAnalyzer = this.ProcessCameraProviderExtensionsKt;
        int i6 = i4 + 123;
        getCameraState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return frameAnalyzer;
    }

    public final Flow<T> getResults() {
        int i2 = 2 % 2;
        int i3 = setExposureCompensationState + 91;
        int i4 = i3 % 128;
        getCameraState = i4;
        int i5 = i3 % 2;
        Flow<T> flow = this.CameraConstants;
        int i6 = i4 + 51;
        setExposureCompensationState = i6 % 128;
        int i7 = i6 % 2;
        return flow;
    }

    public final Flow<T> getEvents() {
        Flow<T> flow;
        int i2 = 2 % 2;
        int i3 = setExposureCompensationState + 57;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 != 0) {
            flow = this.getFrameAnalyzerWrapper;
            int i5 = 64 / 0;
        } else {
            flow = this.getFrameAnalyzerWrapper;
        }
        int i6 = i4 + 49;
        setExposureCompensationState = i6 % 128;
        if (i6 % 2 != 0) {
            return flow;
        }
        throw null;
    }

    public final Function1<ImageProxy, Unit> getOnFrameCallback() {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 55;
        setExposureCompensationState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Function1 function1 = this.setConfig;
        int i5 = i3 + 115;
        setExposureCompensationState = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        throw null;
    }

    public final void setOnFrameCallback(Function1<? super ImageProxy, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 55;
        setExposureCompensationState = i3 % 128;
        int i4 = i3 % 2;
        this.setConfig = function1;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getFrameCallbackAllowed() {
        int i2 = 2 % 2;
        int i3 = getCameraState;
        int i4 = i3 + 95;
        setExposureCompensationState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.getContext;
        int i5 = i3 + 71;
        setExposureCompensationState = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final void setFrameCallbackAllowed(boolean z2) {
        int i2 = 2 % 2;
        int i3 = getCameraState + 23;
        int i4 = i3 % 128;
        setExposureCompensationState = i4;
        int i5 = i3 % 2;
        this.getContext = z2;
        int i6 = i4 + 35;
        getCameraState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Function1<Bitmap, Unit> getOnBitmapCallback() {
        int i2 = 2 % 2;
        int i3 = setExposureCompensationState + 33;
        getCameraState = i3 % 128;
        if (i3 % 2 == 0) {
            return this.getPreviewView;
        }
        throw null;
    }

    public final void setOnBitmapCallback(Function1<? super Bitmap, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = setExposureCompensationState + 33;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        this.getPreviewView = function1;
        if (i4 != 0) {
            throw null;
        }
    }

    public final void pauseImageProcessing(boolean pauseProcessing) {
        int i2 = 2 % 2;
        FrameAnalyzer<T, ?> frameAnalyzer = this.ProcessCameraProviderExtensionsKt;
        if (frameAnalyzer != null) {
            frameAnalyzer.setImageProcessingPaused(pauseProcessing);
            return;
        }
        int i3 = setExposureCompensationState + 41;
        int i4 = i3 % 128;
        getCameraState = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 45;
        setExposureCompensationState = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006b  */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, android.graphics.Bitmap, java.lang.Object] */
    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void analyze(androidx.camera.core.ImageProxy r22) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.FrameAnalyzerWrapper.analyze(androidx.camera.core.ImageProxy):void");
    }

    private final Bitmap IncodeCamera(ImageProxy imageProxy) {
        float width;
        int i2 = 2 % 2;
        Pair<Integer, Integer> pairInvoke = this.IncodeCamera.invoke();
        if (!Intrinsics.areEqual(pairInvoke, this.getImagePreview)) {
            this.getImagePreview = pairInvoke;
            Intrinsics.checkNotNull(pairInvoke);
            this.getExposureCompensationState = new SizeFloat(Math.max(pairInvoke.getFirst().intValue(), pairInvoke.getSecond().intValue()), Math.min(pairInvoke.getFirst().intValue(), pairInvoke.getSecond().intValue()));
        }
        SizeFloat sizeFloat = this.getExposureCompensationState;
        if (sizeFloat != null) {
            int i3 = getCameraState + 39;
            setExposureCompensationState = i3 % 128;
            int i4 = i3 % 2;
            width = sizeFloat.getWidth();
        } else {
            int i5 = getCameraState + 1;
            setExposureCompensationState = i5 % 128;
            int i6 = i5 % 2;
            width = 0.0f;
        }
        SizeFloat sizeFloat2 = this.getExposureCompensationState;
        Bitmap availableCameraInternals = getAvailableCameraInternals(imageProxy, width, sizeFloat2 != null ? sizeFloat2.getHeight() : 0.0f);
        int i7 = getCameraState + 65;
        setExposureCompensationState = i7 % 128;
        if (i7 % 2 != 0) {
            return availableCameraInternals;
        }
        throw null;
    }

    private static Bitmap getAvailableCameraInternals(ImageProxy imageProxy, float f2, float f3) {
        Pair pair;
        int i2 = 2 % 2;
        int i3 = getCameraState + 43;
        setExposureCompensationState = i3 % 128;
        int i4 = i3 % 2;
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        Bitmap bitmap = imageProxy.toBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "");
        Bitmap bitmapRotate = bitmapUtils.rotate(bitmap, imageProxy.getImageInfo().getRotationDegrees());
        Pair pair2 = TuplesKt.to(Integer.valueOf(Math.max(imageProxy.getHeight(), imageProxy.getWidth())), Integer.valueOf(Math.min(imageProxy.getHeight(), imageProxy.getWidth())));
        int iIntValue = ((Number) pair2.component1()).intValue();
        int iIntValue2 = ((Number) pair2.component2()).intValue();
        float f4 = iIntValue;
        float f5 = iIntValue2;
        float f6 = (f4 / f5) / (f2 / f3);
        Pair pair3 = TuplesKt.to(Integer.valueOf((int) (f4 * f6)), Integer.valueOf((int) ((f5 + (((f3 * f4) / f2) - f5)) * f6)));
        int iIntValue3 = ((Number) pair3.component1()).intValue();
        int iIntValue4 = ((Number) pair3.component2()).intValue();
        if (iIntValue != imageProxy.getWidth()) {
            pair = TuplesKt.to(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
        } else {
            pair = TuplesKt.to(Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue3));
            int i5 = getCameraState + 3;
            setExposureCompensationState = i5 % 128;
            int i6 = i5 % 2;
        }
        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmapRotate, ((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
        bitmapRotate.recycle();
        Intrinsics.checkNotNull(bitmapExtractThumbnail);
        return bitmapExtractThumbnail;
    }
}
