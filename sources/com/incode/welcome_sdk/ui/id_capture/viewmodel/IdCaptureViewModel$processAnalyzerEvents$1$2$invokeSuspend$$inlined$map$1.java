package com.incode.welcome_sdk.ui.id_capture.viewmodel;

import android.os.Process;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1 implements Flow<DocumentAnalysisEvent.AnalysisAbortEvent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f16162a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16163b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16164d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f16165e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Flow f16166c;

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16167a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16168d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FlowCollector f16169c;

        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
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
                int r2 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.f16168d
                int r1 = r2 + 121
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.f16167a = r0
                int r1 = r1 % r6
                boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                r5 = 0
                if (r0 == 0) goto L61
                int r1 = r2 + 79
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.f16167a = r0
                int r1 = r1 % r6
                if (r1 != 0) goto L70
                r4 = r9
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1$2$1 r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                int r0 = r4.f16172a
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L61
                int r0 = r4.f16172a
                int r0 = r0 - r1
                r4.f16172a = r0
            L29:
                java.lang.Object r1 = r4.f16174e
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.f16172a
                r2 = 1
                if (r0 == 0) goto L47
                if (r0 != r2) goto L68
                kotlin.ResultKt.throwOnFailure(r1)
            L39:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.f16168d
                int r1 = r0 + 107
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.f16167a = r0
                int r1 = r1 % r6
                if (r1 != 0) goto L67
                return r2
            L47:
                kotlin.ResultKt.throwOnFailure(r1)
                kotlinx.coroutines.flow.FlowCollector r1 = r7.f16169c
                r0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                com.incode.camera.analysis.document.DocumentAnalysisEvent r8 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r8
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r0)
                com.incode.camera.analysis.document.DocumentAnalysisEvent$AnalysisAbortEvent r8 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent) r8
                r4.f16172a = r2
                java.lang.Object r0 = r1.emit(r8, r4)
                if (r0 != r3) goto L39
                return r3
            L61:
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1$2$1 r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1$2$1
                r4.<init>(r9)
                goto L29
            L67:
                throw r5
            L68:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L70:
                com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1$2$1 r9 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r9
                int r0 = r9.f16172a
                r5.hashCode()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f16170c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f16171d = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16172a;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f16174e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f16171d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f16170c = i3 % 128;
                int i4 = i3 % 2;
                this.f16174e = obj;
                this.f16172a |= Integer.MIN_VALUE;
                Object objEmit = AnonymousClass2.this.emit(null, this);
                int i5 = f16171d + 89;
                f16170c = i5 % 128;
                int i6 = i5 % 2;
                return objEmit;
            }

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.f16169c = flowCollector;
        }
    }

    public IdCaptureViewModel$processAnalyzerEvents$1$2$invokeSuspend$$inlined$map$1(Flow flow) {
        this.f16166c = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super DocumentAnalysisEvent.AnalysisAbortEvent> flowCollector, Continuation continuation) {
        int i2 = 2 % 2;
        Object objCollect = this.f16166c.collect(new AnonymousClass2(flowCollector), continuation);
        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            Unit unit = Unit.INSTANCE;
            int i3 = f16163b + 99;
            f16164d = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        int i4 = f16164d + 85;
        f16163b = i4 % 128;
        int i5 = i4 % 2;
        return objCollect;
    }

    public static int a() {
        int i2 = f16165e;
        int i3 = i2 % 8432050;
        f16165e = i2 + 1;
        if (i3 != 0) {
            return f16162a;
        }
        int iMyPid = Process.myPid();
        f16162a = iMyPid;
        return iMyPid;
    }
}
