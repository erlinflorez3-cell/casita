package com.incode.camera.analysis;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.AnalysisEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u000fH\u0016J2\u0010\u001e\u001a$\u0012\f\u0012\n\u0018\u00010 j\u0004\u0018\u0001`!\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u001f2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u0016\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u000fH\u0016JD\u0010*\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2%\u0010,\u001a!\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0002\b-H\u0004¢\u0006\u0002\u0010.R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001aX \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/incode/camera/analysis/FrameAnalyzer;", "Event", "Lcom/incode/camera/analysis/AnalysisEvent;", "Input", "", "()V", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "frameDropDelayInMs", "", "getFrameDropDelayInMs", "()J", "isImageProcessingPaused", "", "()Z", "setImageProcessingPaused", "(Z)V", "lastAnalyzeCall", "getLastAnalyzeCall", "setLastAnalyzeCall", "(J)V", "lastLog", "", "stageExecutor", "Lcom/incode/camera/analysis/StageExecutor;", "getStageExecutor$core_light_release", "()Lcom/incode/camera/analysis/StageExecutor;", "isProcessingPaused", "optionalLogger", "Lkotlin/Pair;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/Function1;", "", "loggingEnabled", "processBitmap", "cameraBitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldLogAnalysis", "withOptionalLogging", "loggingDistinct", "execute", "Lkotlin/ExtensionFunctionType;", "(ZZLkotlin/jvm/functions/Function1;)Lcom/incode/camera/analysis/AnalysisEvent;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FrameAnalyzer<Event extends AnalysisEvent, Input> {
    private static int CameraConstants = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;
    private long IncodeCamera;

    /* JADX INFO: renamed from: e1 */
    private boolean f3575e1;
    private String getAvailableCameraInternals = "";

    public abstract Flow<Event> getEvents();

    public abstract long getFrameDropDelayInMs();

    public abstract StageExecutor<Input, Event> getStageExecutor$core_light_release();

    public abstract Object processBitmap(Bitmap bitmap, Continuation<? super Event> continuation);

    public final long getLastAnalyzeCall() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 85;
        int i4 = i3 % 128;
        ProcessCameraProviderExtensionsKt = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j2 = this.IncodeCamera;
        int i5 = i4 + 69;
        CameraConstants = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    public final void setLastAnalyzeCall(long j2) {
        int i2 = 2 % 2;
        int i3 = CameraConstants;
        int i4 = i3 + 79;
        ProcessCameraProviderExtensionsKt = i4 % 128;
        int i5 = i4 % 2;
        this.IncodeCamera = j2;
        int i6 = i3 + 27;
        ProcessCameraProviderExtensionsKt = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
    }

    public final boolean isImageProcessingPaused() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt;
        int i4 = i3 + 47;
        CameraConstants = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f3575e1;
        int i6 = i3 + 91;
        CameraConstants = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return z2;
    }

    public final void setImageProcessingPaused(boolean z2) {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 101;
        int i4 = i3 % 128;
        ProcessCameraProviderExtensionsKt = i4;
        int i5 = i3 % 2;
        this.f3575e1 = z2;
        int i6 = i4 + 35;
        CameraConstants = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isProcessingPaused() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        CameraConstants = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f3575e1;
        int i6 = i4 + 107;
        ProcessCameraProviderExtensionsKt = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Event", "Lcom/incode/camera/analysis/AnalysisEvent;", "Input", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class ProcessCameraProviderExtensionsKt extends Lambda implements Function1<String, Unit> {
        private static int CameraConstants = 1;
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1 */
        private /* synthetic */ StringBuilder f3576e1;

        private void IncodeCamera(String str) {
            StringBuilder sbAppend;
            char c2;
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 9;
            CameraConstants = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                sbAppend = this.f3576e1.append(str);
                Intrinsics.checkNotNullExpressionValue(sbAppend, "");
                c2 = 15;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                sbAppend = this.f3576e1.append(str);
                Intrinsics.checkNotNullExpressionValue(sbAppend, "");
                c2 = '\n';
            }
            Intrinsics.checkNotNullExpressionValue(sbAppend.append(c2), "");
            int i4 = ProcessCameraProviderExtensionsKt + 123;
            CameraConstants = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 59;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            IncodeCamera(str);
            Unit unit = Unit.INSTANCE;
            int i5 = CameraConstants + 51;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ProcessCameraProviderExtensionsKt(StringBuilder sb) {
            super(1);
            this.f3576e1 = sb;
        }
    }

    private final Pair<StringBuilder, Function1<String, Unit>> e1(boolean z2) {
        StringBuilder sb;
        ProcessCameraProviderExtensionsKt processCameraProviderExtensionsKt;
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 15;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        if (z2 || shouldLogAnalysis()) {
            sb = new StringBuilder();
            processCameraProviderExtensionsKt = new ProcessCameraProviderExtensionsKt(sb);
        } else {
            int i5 = ProcessCameraProviderExtensionsKt + 91;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            sb = null;
            processCameraProviderExtensionsKt = null;
        }
        return new Pair<>(sb, processCameraProviderExtensionsKt);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final Event withOptionalLogging(boolean r7, boolean r8, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, ? extends Event> r9) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.camera.analysis.FrameAnalyzer.CameraConstants
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzer.ProcessCameraProviderExtensionsKt = r0
            int r1 = r1 % r5
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.Pair r0 = r6.e1(r7)
            java.lang.Object r1 = r0.component1()
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.Object r0 = r0.component2()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r4 = 0
            java.lang.Object r3 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L5b
            com.incode.camera.analysis.AnalysisEvent r3 = (com.incode.camera.analysis.AnalysisEvent) r3     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L4a
            java.lang.String r2 = java.lang.String.valueOf(r1)
            if (r8 == 0) goto L41
            int r0 = com.incode.camera.analysis.FrameAnalyzer.ProcessCameraProviderExtensionsKt
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzer.CameraConstants = r0
            int r1 = r1 % r5
            java.lang.String r0 = r6.getAvailableCameraInternals
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L48
        L41:
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1.d(r2, r0)
        L48:
            r6.getAvailableCameraInternals = r2
        L4a:
            int r2 = com.incode.camera.analysis.FrameAnalyzer.CameraConstants
            int r1 = r2 + 33
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzer.ProcessCameraProviderExtensionsKt = r0
            int r1 = r1 % r5
            int r1 = r2 + 107
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzer.ProcessCameraProviderExtensionsKt = r0
            int r1 = r1 % r5
            return r3
        L5b:
            r3 = move-exception
            if (r0 == 0) goto L77
            java.lang.String r2 = java.lang.String.valueOf(r1)
            if (r8 == 0) goto L78
            int r0 = com.incode.camera.analysis.FrameAnalyzer.CameraConstants
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzer.ProcessCameraProviderExtensionsKt = r0
            int r1 = r1 % r5
            java.lang.String r0 = r6.getAvailableCameraInternals
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L78
        L75:
            r6.getAvailableCameraInternals = r2
        L77:
            throw r3
        L78:
            timber.log.Timber$Forest r1 = timber.log.Timber.Forest
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1.d(r2, r0)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.FrameAnalyzer.withOptionalLogging(boolean, boolean, kotlin.jvm.functions.Function1):com.incode.camera.analysis.AnalysisEvent");
    }

    public boolean shouldLogAnalysis() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 63;
        CameraConstants = i3 % 128;
        return i3 % 2 == 0;
    }
}
