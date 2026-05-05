package d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class superior extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tongue f18372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0.pair f18373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(tongue tongueVar, k0.pair pairVar, Continuation continuation) {
        super(2, continuation);
        this.f18372b = tongueVar;
        this.f18373c = pairVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new superior(this.f18372b, this.f18373c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new superior(this.f18372b, this.f18373c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r0, r8) == r4) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.f18371a
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L1d
            if (r0 == r7) goto L2d
            if (r0 != r5) goto L7d
            kotlin.ResultKt.throwOnFailure(r9)
        L11:
            d.tongue r0 = r8.f18372b
            c0.misplace r1 = r0.f18378e
            k0.pair r0 = r8.f18373c
            r1.a(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L1d:
            kotlin.ResultKt.throwOnFailure(r9)
            d.tongue r0 = r8.f18372b
            e.superior r0 = r0.f18375b
            r8.f18371a = r7
            java.lang.Object r0 = r0.a(r8)
            if (r0 != r4) goto L30
        L2c:
            return r4
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
        L30:
            d.tongue r1 = r8.f18372b
            e.superior r0 = r1.f18375b
            q0.pair r0 = r0.f18449e
            boolean r0 = r0.f28244a
            r3 = 0
            if (r0 != 0) goto L59
            f1.apparatus r6 = r1.f18387n
            java.util.ArrayList r0 = r6.f18524d
            java.lang.String r5 = "Agent disabled by configuration"
            r0.add(r5)
            java.util.ArrayList r4 = r6.f18525e
            int r2 = r4.size()
            r1 = 0
        L4b:
            if (r1 >= r2) goto L85
            java.lang.Object r0 = r4.get(r1)
            int r1 = r1 + 1
            com.cleafy.mobile.detection.agent.AgentDiagnosticsListener r0 = (com.cleafy.mobile.detection.agent.AgentDiagnosticsListener) r0
            r0.onDiagnosticsWithErrorAvailable(r6, r5)
            goto L4b
        L59:
            v0.civilian r0 = r1.f18383j
            r0.a()
            d.tongue r0 = r8.f18372b
            l.tongue r0 = r0.f18381h
            p.tongue r0 = r0.f19854b
            if (r0 == 0) goto L6b
            p.misplace r0 = r0.f28236a
            r0.a()
        L6b:
            d.tongue r2 = r8.f18372b
            kotlinx.coroutines.MainCoroutineDispatcher r1 = r2.f18388o
            d.pair r0 = new d.pair
            r0.<init>(r2, r3)
            r8.f18371a = r5
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r1, r0, r8)
            if (r0 != r4) goto L11
            goto L2c
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L85:
            d.tongue r0 = r8.f18372b
            w.apparatus r0 = r0.f18379f
            w.tongue r1 = r0.f28369e
            if (r1 == 0) goto L92
            w.superior r0 = r0.f28366b
            r0.invoke(r1)
        L92:
            d.tongue r0 = r8.f18372b
            kotlinx.coroutines.CoroutineScope r0 = r0.f18389p
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(r0, r3, r7, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.superior.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
