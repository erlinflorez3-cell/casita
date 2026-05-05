package bo.app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j80 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v80 f993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(v80 v80Var, Continuation continuation) {
        super(2, continuation);
        this.f993c = v80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j80 j80Var = new j80(this.f993c, continuation);
        j80Var.f992b = obj;
        return j80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j80 j80Var = new j80(this.f993c, (Continuation) obj2);
        j80Var.f992b = (CoroutineScope) obj;
        return j80Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.f991a
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L6b
            if (r0 == r2) goto L3b
            if (r0 != r3) goto L73
            java.lang.Object r6 = r13.f992b
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.ResultKt.throwOnFailure(r14)
        L15:
            boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r6)
            if (r0 == 0) goto L5a
            bo.app.v80 r0 = r13.f993c     // Catch: java.lang.Exception -> L21
            bo.app.v80.a(r0)     // Catch: java.lang.Exception -> L21
            goto L42
        L21:
            r8 = move-exception
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.E
            bo.app.h80 r10 = bo.app.h80.f811a
            r11 = 4
            r12 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            long r0 = bo.app.v80.f2010p
            r13.f992b = r6
            r13.f991a = r2
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r13)
            if (r0 != r4) goto L42
            return r4
        L3b:
            java.lang.Object r6 = r13.f992b
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.ResultKt.throwOnFailure(r14)
        L42:
            bo.app.v80 r0 = r13.f993c
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f2021k
            int r1 = r0.get()
            r0 = 5
            if (r1 < r0) goto L5d
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I
            bo.app.i80 r10 = bo.app.i80.f884a
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
        L5a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5d:
            r13.f992b = r6
            r13.f991a = r3
            r0 = 10
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r13)
            if (r0 != r4) goto L6a
            return r4
        L6a:
            goto L15
        L6b:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r6 = r13.f992b
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            goto L15
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.j80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
