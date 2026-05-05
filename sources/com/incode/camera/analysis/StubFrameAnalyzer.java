package com.incode.camera.analysis;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u000eX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/incode/camera/analysis/StubFrameAnalyzer;", "Lcom/incode/camera/analysis/FrameAnalyzer;", "Lcom/incode/camera/analysis/StubAnalysisEvent;", "Lcom/incode/camera/analysis/StubStageInput;", "()V", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "frameDropDelayInMs", "", "getFrameDropDelayInMs", "()J", "stageExecutor", "Lcom/incode/camera/analysis/StageExecutor;", "getStageExecutor$core_light_release", "()Lcom/incode/camera/analysis/StageExecutor;", "stubEvent", "processBitmap", "cameraBitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StubFrameAnalyzer extends FrameAnalyzer<StubAnalysisEvent, StubStageInput> {
    private static int IncodeCamera = 0;
    private static int getContext = 1;
    private final StubAnalysisEvent CameraConstants;
    private final StageExecutor<StubStageInput, StubAnalysisEvent> getAvailableCameraInternals;

    /* JADX INFO: renamed from: e1 */
    private final Flow<StubAnalysisEvent> f3579e1 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    private final long ProcessCameraProviderExtensionsKt = 100;

    public StubFrameAnalyzer() {
        Flow<StubAnalysisEvent> events = getEvents();
        Intrinsics.checkNotNull(events, "");
        this.getAvailableCameraInternals = new StageExecutor<>((MutableSharedFlow) events, new ArrayList());
        this.CameraConstants = new StubAnalysisEvent();
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final Flow<StubAnalysisEvent> getEvents() {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 77;
        int i4 = i3 % 128;
        getContext = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Flow<StubAnalysisEvent> flow = this.f3579e1;
        int i5 = i4 + 13;
        IncodeCamera = i5 % 128;
        if (i5 % 2 == 0) {
            return flow;
        }
        throw null;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final long getFrameDropDelayInMs() {
        int i2 = 2 % 2;
        int i3 = getContext + 55;
        int i4 = i3 % 128;
        IncodeCamera = i4;
        int i5 = i3 % 2;
        long j2 = this.ProcessCameraProviderExtensionsKt;
        int i6 = i4 + 101;
        getContext = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final StageExecutor<StubStageInput, StubAnalysisEvent> getStageExecutor$core_light_release() {
        int i2 = 2 % 2;
        int i3 = IncodeCamera;
        int i4 = i3 + 23;
        getContext = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        StageExecutor<StubStageInput, StubAnalysisEvent> stageExecutor = this.getAvailableCameraInternals;
        int i5 = i3 + 83;
        getContext = i5 % 128;
        if (i5 % 2 != 0) {
            return stageExecutor;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.camera.analysis.FrameAnalyzer
    public final Object processBitmap(Bitmap bitmap, Continuation<? super StubAnalysisEvent> continuation) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera;
        int i4 = i3 + 41;
        getContext = i4 % 128;
        int i5 = i4 % 2;
        StubAnalysisEvent stubAnalysisEvent = this.CameraConstants;
        int i6 = i3 + 49;
        getContext = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return stubAnalysisEvent;
    }
}
