package com.incode.camera.analysis;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/incode/camera/analysis/AnalysisEvent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1", f = "FrameAnalyzerWrapper.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
final class FrameAnalyzerWrapper$analyze$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private static int CameraConstants = 0;
    private static int getAvailableCameraInternals = 1;
    private /* synthetic */ Bitmap IncodeCamera;
    private int ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private /* synthetic */ FrameAnalyzer<T, ?> f3578e1;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0 == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1 == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        kotlin.ResultKt.throwOnFailure(r6);
        r1 = com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.CameraConstants + com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.getAvailableCameraInternals = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.getAvailableCameraInternals
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.CameraConstants = r0
            int r1 = r1 % r2
            r4 = 1
            if (r1 == 0) goto L2c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.ProcessCameraProviderExtensionsKt
            r0 = 32
            int r0 = r0 / 0
            if (r1 == 0) goto L37
            if (r1 != r4) goto L4a
        L1d:
            kotlin.ResultKt.throwOnFailure(r6)
            int r0 = com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.CameraConstants
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.getAvailableCameraInternals = r0
            int r1 = r1 % r2
        L29:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2c:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.ProcessCameraProviderExtensionsKt
            if (r0 == 0) goto L37
            if (r0 != r4) goto L4a
            goto L1d
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            com.incode.camera.analysis.FrameAnalyzer<T, ?> r2 = r5.f3578e1
            android.graphics.Bitmap r1 = r5.IncodeCamera
            r0 = r5
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            r5.ProcessCameraProviderExtensionsKt = r4
            java.lang.Object r0 = r2.processBitmap(r1, r0)
            if (r0 != r3) goto L29
            return r3
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.FrameAnalyzerWrapper$analyze$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 123;
        CameraConstants = i3 % 128;
        CoroutineScope coroutineScope2 = coroutineScope;
        Continuation<? super Unit> continuation2 = continuation;
        if (i3 % 2 == 0) {
            return invoke2(coroutineScope2, continuation2);
        }
        invoke2(coroutineScope2, continuation2);
        throw null;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 91;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = ((FrameAnalyzerWrapper$analyze$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        int i5 = getAvailableCameraInternals + 37;
        CameraConstants = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        int i2 = 2 % 2;
        FrameAnalyzerWrapper$analyze$2$1 frameAnalyzerWrapper$analyze$2$1 = new FrameAnalyzerWrapper$analyze$2$1(this.f3578e1, this.IncodeCamera, continuation);
        int i3 = getAvailableCameraInternals + 49;
        CameraConstants = i3 % 128;
        if (i3 % 2 == 0) {
            return frameAnalyzerWrapper$analyze$2$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameAnalyzerWrapper$analyze$2$1(FrameAnalyzer<T, ?> frameAnalyzer, Bitmap bitmap, Continuation<? super FrameAnalyzerWrapper$analyze$2$1> continuation) {
        super(2, continuation);
        this.f3578e1 = frameAnalyzer;
        this.IncodeCamera = bitmap;
    }
}
