package com.incode.welcome_sdk.ui.id_capture.viewmodel;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureResultHolder {

    /* JADX INFO: renamed from: a */
    private static int f15693a = 0;

    /* JADX INFO: renamed from: i */
    private static int f15694i = 1;

    /* JADX INFO: renamed from: b */
    private final Mutex f15695b = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: c */
    private Bitmap f15696c;

    /* JADX INFO: renamed from: d */
    private DocumentAnalysisEvent.CaptureCandidateGenerated f15697d;

    /* JADX INFO: renamed from: e */
    private DocumentAnalysisEvent f15698e;

    public final DocumentAnalysisEvent.CaptureCandidateGenerated getAutoCaptureResult() {
        int i2 = 2 % 2;
        int i3 = f15694i;
        int i4 = i3 + 3;
        f15693a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated = this.f15697d;
        int i5 = i3 + 93;
        f15693a = i5 % 128;
        int i6 = i5 % 2;
        return captureCandidateGenerated;
    }

    public final DocumentAnalysisEvent getManualCaptureResult() {
        int i2 = 2 % 2;
        int i3 = f15693a;
        int i4 = i3 + 85;
        f15694i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        DocumentAnalysisEvent documentAnalysisEvent = this.f15698e;
        int i5 = i3 + 91;
        f15694i = i5 % 128;
        int i6 = i5 % 2;
        return documentAnalysisEvent;
    }

    public final void setManualCaptureResult(DocumentAnalysisEvent documentAnalysisEvent) {
        int i2 = 2 % 2;
        int i3 = f15694i + 45;
        f15693a = i3 % 128;
        int i4 = i3 % 2;
        this.f15698e = documentAnalysisEvent;
        if (i4 != 0) {
            throw null;
        }
    }

    private static boolean c(DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated, DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated2) {
        int i2 = 2 % 2;
        int i3 = f15694i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f15693a = i3 % 128;
        int i4 = i3 % 2;
        if (captureCandidateGenerated2 == null || captureCandidateGenerated.getCaptureInfo().getIdType() == null || captureCandidateGenerated.getCaptureInfo().getSide() == null || !Intrinsics.areEqual(captureCandidateGenerated.getCaptureInfo().getIdType(), captureCandidateGenerated2.getCaptureInfo().getIdType()) || captureCandidateGenerated.getCaptureInfo().getSide() != captureCandidateGenerated2.getCaptureInfo().getSide()) {
            return false;
        }
        int i5 = f15693a + 57;
        f15694i = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateAutoCaptureResultConditionally(com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.updateAutoCaptureResultConditionally(com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateManualCapture(android.graphics.Bitmap r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i = r0
            int r1 = r1 % r5
            boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.h
            if (r0 == 0) goto L59
            r4 = r8
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$h r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.h) r4
            int r0 = r4.f15738c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L59
            int r0 = r4.f15738c
            int r0 = r0 - r1
            r4.f15738c = r0
        L1f:
            java.lang.Object r3 = r4.f15736a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f15738c
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L5f
            java.lang.Object r7 = r4.f15739d
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r0 = r4.f15737b
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder) r0
            kotlin.ResultKt.throwOnFailure(r3)
        L37:
            r0.f15696c = r7
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3c:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.f15737b = r6
            r4.f15739d = r7
            r4.f15738c = r0
            java.lang.Object r0 = r6.clear(r4)
            if (r0 != r2) goto L57
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L67
            return r2
        L57:
            r0 = r6
            goto L37
        L59:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$h r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$h
            r4.<init>(r8)
            goto L1f
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.updateManualCapture(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clear(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.e
            if (r0 == 0) goto L4b
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i = r0
            int r1 = r1 % r7
            r5 = r9
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$e r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.e) r5
            int r0 = r5.f15732d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto L4b
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r7
            int r0 = r5.f15732d
            int r0 = r0 - r2
            r5.f15732d = r0
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i = r0
            int r1 = r1 % r7
        L31:
            java.lang.Object r6 = r5.f15729a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f15732d
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L59
            if (r1 != r0) goto L51
            java.lang.Object r3 = r5.f15730b
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            java.lang.Object r5 = r5.f15733e
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6c
        L4b:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$e r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$e
            r5.<init>(r9)
            goto L31
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L59:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.sync.Mutex r3 = r8.f15695b
            r5.f15733e = r8
            r5.f15730b = r3
            r5.f15732d = r0
            java.lang.Object r0 = r3.lock(r4, r5)
            if (r0 != r2) goto L6b
            return r2
        L6b:
            r5 = r8
        L6c:
            android.graphics.Bitmap r0 = r5.f15696c     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L7c
            r0.recycle()     // Catch: java.lang.Throwable -> Lab
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r7
        L7c:
            r5.f15696c = r4     // Catch: java.lang.Throwable -> Lab
            r5.f15698e = r4     // Catch: java.lang.Throwable -> Lab
            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r0 = r5.f15697d     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L8d
            android.graphics.Bitmap r0 = r0.getImage()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L8d
            r0.recycle()     // Catch: java.lang.Throwable -> Lab
        L8d:
            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r0 = r5.f15697d     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La3
            android.graphics.Bitmap r2 = r0.getCroppedDocumentImage()     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto La3
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r7
            r2.recycle()     // Catch: java.lang.Throwable -> Lab
        La3:
            r5.f15697d = r4     // Catch: java.lang.Throwable -> Lab
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lab
            r3.unlock(r4)
            return r0
        Lab:
            r0 = move-exception
            r3.unlock(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.clear(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean isManualCapture() {
        int i2 = 2 % 2;
        int i3 = f15693a + 23;
        int i4 = i3 % 128;
        f15694i = i4;
        int i5 = i3 % 2;
        if (this.f15696c != null) {
            return true;
        }
        int i6 = i4 + 95;
        f15693a = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ Object getCaptureRequired$default(CaptureResultHolder captureResultHolder, boolean z2, Continuation continuation, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f15694i + 3;
        f15693a = i4 % 128;
        int i5 = i2 & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            z2 = false;
        }
        Object captureRequired = captureResultHolder.getCaptureRequired(z2, continuation);
        int i6 = f15693a + 65;
        f15694i = i6 % 128;
        int i7 = i6 % 2;
        return captureRequired;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCaptureRequired(boolean r7, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r8) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.a
            if (r0 == 0) goto L77
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L96
            r4 = r8
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$a r4 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.a) r4
            int r0 = r4.f15704e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L77
            int r0 = r4.f15704e
            int r0 = r0 - r1
            r4.f15704e = r0
        L21:
            java.lang.Object r2 = r4.f15702b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f15704e
            r0 = 1
            if (r1 == 0) goto L44
            if (r1 != r0) goto L8e
            boolean r7 = r4.f15703d
            kotlin.ResultKt.throwOnFailure(r2)
        L33:
            if (r2 == 0) goto L82
            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r2 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r2
            if (r7 == 0) goto L7d
            android.graphics.Bitmap r0 = r2.getCroppedDocumentImage()
            if (r0 != 0) goto L43
            android.graphics.Bitmap r0 = r2.getImage()
        L43:
            return r0
        L44:
            kotlin.ResultKt.throwOnFailure(r2)
            android.graphics.Bitmap r2 = r6.f15696c
            if (r2 == 0) goto L63
            com.incode.camera.analysis.document.DocumentAnalysisEvent r1 = r6.f15698e
            if (r1 == 0) goto L60
            boolean r0 = r1 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated
            if (r0 == 0) goto L5d
            if (r7 == 0) goto L5d
            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r1 = (com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated) r1
            android.graphics.Bitmap r0 = r1.getCroppedDocumentImage()
            if (r0 != 0) goto L5e
        L5d:
            r0 = r2
        L5e:
            if (r0 != 0) goto L61
        L60:
            return r2
        L61:
            r2 = r0
            goto L60
        L63:
            r4.f15703d = r7
            r4.f15704e = r0
            java.lang.Object r2 = r6.getAutoCaptureResult(r4)
            if (r2 != r3) goto L33
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r5
            return r3
        L77:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$a r4 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$a
            r4.<init>(r8)
            goto L21
        L7d:
            android.graphics.Bitmap r0 = r2.getImage()
            return r0
        L82:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Either capture (manual capture) or score (auto capture) must be set, check your implementation."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$a r8 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.a) r8
            int r0 = r8.f15704e
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.getCaptureRequired(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final CaptureInfo captureInfo() {
        int i2 = 2 % 2;
        int i3 = f15693a + 25;
        f15694i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            isManualCapture();
            obj.hashCode();
            throw null;
        }
        DocumentAnalysisEvent documentAnalysisEvent = this.f15698e;
        if (!isManualCapture()) {
            DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated = this.f15697d;
            if (captureCandidateGenerated == null) {
                return null;
            }
            int i4 = f15693a + 49;
            f15694i = i4 % 128;
            int i5 = i4 % 2;
            return captureCandidateGenerated.getCaptureInfo();
        }
        if (!(!(documentAnalysisEvent instanceof DocumentAnalysisEvent.CaptureCandidateGenerated))) {
            int i6 = f15693a + 29;
            f15694i = i6 % 128;
            if (i6 % 2 != 0) {
                return ((DocumentAnalysisEvent.CaptureCandidateGenerated) documentAnalysisEvent).getCaptureInfo();
            }
            int i7 = 60 / 0;
            return ((DocumentAnalysisEvent.CaptureCandidateGenerated) documentAnalysisEvent).getCaptureInfo();
        }
        if (!(documentAnalysisEvent instanceof DocumentAnalysisEvent.AnalysisAbortEvent)) {
            return null;
        }
        int i8 = f15693a + 51;
        f15694i = i8 % 128;
        if (i8 % 2 != 0) {
            return ((DocumentAnalysisEvent.AnalysisAbortEvent) documentAnalysisEvent).getCaptureInfo();
        }
        ((DocumentAnalysisEvent.AnalysisAbortEvent) documentAnalysisEvent).getCaptureInfo();
        obj.hashCode();
        throw null;
    }

    public final DocumentAnalysisEvent finalEvent() {
        int i2 = 2 % 2;
        int i3 = f15693a + 41;
        int i4 = i3 % 128;
        f15694i = i4;
        int i5 = i3 % 2;
        DocumentAnalysisEvent.CaptureCandidateGenerated captureCandidateGenerated = this.f15698e;
        if (captureCandidateGenerated == null) {
            captureCandidateGenerated = this.f15697d;
        }
        int i6 = i4 + 103;
        f15693a = i6 % 128;
        int i7 = i6 % 2;
        return captureCandidateGenerated;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAutoCaptureResult(kotlin.coroutines.Continuation<? super com.incode.camera.analysis.document.DocumentAnalysisEvent.CaptureCandidateGenerated> r7) {
        /*
            r6 = this;
            r3 = 2
            int r0 = r3 % r3
            boolean r0 = r7 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.c
            if (r0 == 0) goto L39
            r5 = r7
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$c r5 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.c) r5
            int r0 = r5.f15718d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto L39
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r3
            int r0 = r5.f15718d
            int r0 = r0 - r2
            r5.f15718d = r0
        L1f:
            java.lang.Object r4 = r5.f15719e
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f15718d
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L50
            if (r1 != r0) goto L48
            java.lang.Object r1 = r5.f15716b
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r5.f15715a
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder) r0
            kotlin.ResultKt.throwOnFailure(r4)
            goto L63
        L39:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$c r5 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$c
            r5.<init>(r7)
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i = r0
            int r1 = r1 % r3
            goto L1f
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L50:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.sync.Mutex r1 = r6.f15695b
            r5.f15715a = r6
            r5.f15716b = r1
            r5.f15718d = r0
            java.lang.Object r0 = r1.lock(r2, r5)
            if (r0 != r3) goto L62
            return r3
        L62:
            r0 = r6
        L63:
            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r0 = r0.f15697d     // Catch: java.lang.Throwable -> L69
            r1.unlock(r2)
            return r0
        L69:
            r0 = move-exception
            r1.unlock(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.getAutoCaptureResult(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object containsAutoCaptureResult(kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            boolean r0 = r10 instanceof com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.d
            if (r0 == 0) goto L3a
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i = r0
            int r1 = r1 % r8
            r7 = r10
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$d r7 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.d) r7
            int r0 = r7.f15722a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L3a
            int r0 = r7.f15722a
            int r0 = r0 - r1
            r7.f15722a = r0
        L1f:
            java.lang.Object r6 = r7.f15723b
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.f15722a
            r4 = 0
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto L40
            java.lang.Object r2 = r7.f15725d
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r0 = r7.f15726e
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder r0 = (com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L69
        L3a:
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$d r7 = new com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder$d
            r7.<init>(r10)
            goto L1f
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L48:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.sync.Mutex r2 = r9.f15695b
            r7.f15726e = r9
            r7.f15725d = r2
            r7.f15722a = r1
            java.lang.Object r0 = r2.lock(r3, r7)
            if (r0 != r5) goto L68
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L67
            r0 = 18
            int r0 = r0 / r4
        L67:
            return r5
        L68:
            r0 = r9
        L69:
            com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated r0 = r0.f15697d     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L6f
            r4 = r1
            goto L78
        L6f:
            int r0 = com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15693a
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.f15694i = r0
            int r1 = r1 % r8
        L78:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch: java.lang.Throwable -> L80
            r2.unlock(r3)
            return r0
        L80:
            r0 = move-exception
            r2.unlock(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder.containsAutoCaptureResult(kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: c */
        private static int f15699c = 0;

        /* JADX INFO: renamed from: f */
        private static int f15700f = 1;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f15702b;

        /* JADX INFO: renamed from: d */
        boolean f15703d;

        /* JADX INFO: renamed from: e */
        int f15704e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15699c + 75;
            f15700f = i3 % 128;
            int i4 = i3 % 2;
            this.f15702b = obj;
            this.f15704e |= Integer.MIN_VALUE;
            Object captureRequired = CaptureResultHolder.this.getCaptureRequired(false, this);
            int i5 = f15699c + 31;
            f15700f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return captureRequired;
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: i */
        private static int f15705i = 1;

        /* JADX INFO: renamed from: j */
        private static int f15706j = 0;

        /* JADX INFO: renamed from: a */
        int f15707a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f15708b;

        /* JADX INFO: renamed from: c */
        Object f15709c;

        /* JADX INFO: renamed from: d */
        Object f15710d;

        /* JADX INFO: renamed from: e */
        Object f15711e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objUpdateAutoCaptureResultConditionally;
            int i2 = 2 % 2;
            int i3 = f15705i + 115;
            f15706j = i3 % 128;
            int i4 = i3 % 2;
            this.f15708b = obj;
            this.f15707a |= Integer.MIN_VALUE;
            CaptureResultHolder captureResultHolder = CaptureResultHolder.this;
            if (i4 != 0) {
                objUpdateAutoCaptureResultConditionally = captureResultHolder.updateAutoCaptureResultConditionally(null, this);
                int i5 = 22 / 0;
            } else {
                objUpdateAutoCaptureResultConditionally = captureResultHolder.updateAutoCaptureResultConditionally(null, this);
            }
            int i6 = f15706j + 13;
            f15705i = i6 % 128;
            if (i6 % 2 != 0) {
                return objUpdateAutoCaptureResultConditionally;
            }
            throw null;
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: g */
        private static int f15713g = 1;

        /* JADX INFO: renamed from: i */
        private static int f15714i = 0;

        /* JADX INFO: renamed from: a */
        Object f15715a;

        /* JADX INFO: renamed from: b */
        Object f15716b;

        /* JADX INFO: renamed from: d */
        int f15718d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f15719e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15713g + 81;
            f15714i = i3 % 128;
            int i4 = i3 % 2;
            this.f15719e = obj;
            this.f15718d |= Integer.MIN_VALUE;
            Object autoCaptureResult = CaptureResultHolder.this.getAutoCaptureResult(this);
            int i5 = f15713g + 125;
            f15714i = i5 % 128;
            int i6 = i5 % 2;
            return autoCaptureResult;
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: f */
        private static int f15720f = 1;

        /* JADX INFO: renamed from: g */
        private static int f15721g = 0;

        /* JADX INFO: renamed from: a */
        int f15722a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f15723b;

        /* JADX INFO: renamed from: d */
        Object f15725d;

        /* JADX INFO: renamed from: e */
        Object f15726e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objContainsAutoCaptureResult;
            int i2 = 2 % 2;
            int i3 = f15721g + 25;
            f15720f = i3 % 128;
            int i4 = i3 % 2;
            this.f15723b = obj;
            this.f15722a |= Integer.MIN_VALUE;
            CaptureResultHolder captureResultHolder = CaptureResultHolder.this;
            if (i4 == 0) {
                objContainsAutoCaptureResult = captureResultHolder.containsAutoCaptureResult(this);
                int i5 = 48 / 0;
            } else {
                objContainsAutoCaptureResult = captureResultHolder.containsAutoCaptureResult(this);
            }
            int i6 = f15720f + 97;
            f15721g = i6 % 128;
            if (i6 % 2 == 0) {
                return objContainsAutoCaptureResult;
            }
            throw null;
        }

        d(Continuation<? super d> continuation) {
            super(continuation);
        }
    }

    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: h */
        private static int f15727h = 1;

        /* JADX INFO: renamed from: j */
        private static int f15728j = 0;

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f15729a;

        /* JADX INFO: renamed from: b */
        Object f15730b;

        /* JADX INFO: renamed from: d */
        int f15732d;

        /* JADX INFO: renamed from: e */
        Object f15733e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objClear;
            int i2 = 2 % 2;
            int i3 = f15728j + 111;
            f15727h = i3 % 128;
            int i4 = i3 % 2;
            this.f15729a = obj;
            this.f15732d |= Integer.MIN_VALUE;
            CaptureResultHolder captureResultHolder = CaptureResultHolder.this;
            if (i4 == 0) {
                objClear = captureResultHolder.clear(this);
                int i5 = 67 / 0;
            } else {
                objClear = captureResultHolder.clear(this);
            }
            int i6 = f15728j + 57;
            f15727h = i6 % 128;
            int i7 = i6 % 2;
            return objClear;
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: h */
        private static int f15734h = 1;

        /* JADX INFO: renamed from: i */
        private static int f15735i = 0;

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f15736a;

        /* JADX INFO: renamed from: b */
        Object f15737b;

        /* JADX INFO: renamed from: c */
        int f15738c;

        /* JADX INFO: renamed from: d */
        Object f15739d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15734h + 95;
            f15735i = i3 % 128;
            int i4 = i3 % 2;
            this.f15736a = obj;
            this.f15738c |= Integer.MIN_VALUE;
            Object objUpdateManualCapture = CaptureResultHolder.this.updateManualCapture(null, this);
            int i5 = f15735i + 11;
            f15734h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
            return objUpdateManualCapture;
        }

        h(Continuation<? super h> continuation) {
            super(continuation);
        }
    }
}
