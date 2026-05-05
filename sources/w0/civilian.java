package w0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class civilian {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(okhttp3.Call r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof w0.pair
            if (r0 == 0) goto L23
            r4 = r6
            w0.pair r4 = (w0.pair) r4
            int r3 = r4.f28396b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r3 + r2
            r0 = r3 | r2
            int r1 = r1 - r0
            if (r1 == 0) goto L23
            int r3 = r3 - r2
            r4.f28396b = r3
        L15:
            java.lang.Object r1 = r4.f28395a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.f28396b
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            goto L64
        L23:
            w0.pair r4 = new w0.pair
            r4.<init>(r6)
            goto L15
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L6e
            r4.f28396b = r2     // Catch: java.lang.Throwable -> L6e
            kotlinx.coroutines.CancellableContinuationImpl r1 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L6e
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L6e
            r1.initCancellability()     // Catch: java.lang.Throwable -> L6e
            w0.superior r0 = new w0.superior     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r1.invokeOnCancellation(r0)     // Catch: java.lang.Throwable -> L6e
            w0.apparatus r0 = new w0.apparatus     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e
            com.dynatrace.android.callback.OkCallback.enqueue(r5, r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.getResult()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L6e
            if (r1 != r0) goto L61
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)     // Catch: java.lang.Throwable -> L6e
        L61:
            if (r1 != r3) goto L67
            return r3
        L64:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L6e
        L67:
            okhttp3.Response r1 = (okhttp3.Response) r1     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r1)     // Catch: java.lang.Throwable -> L6e
            return r0
        L6e:
            r1 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.civilian.a(okhttp3.Call, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
