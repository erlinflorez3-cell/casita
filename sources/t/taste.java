package t;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes2.dex */
public final class taste extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f28320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public misplace f28321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ misplace f28323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taste(misplace misplaceVar, Continuation continuation) {
        super(2, continuation);
        this.f28323d = misplaceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new taste(this.f28323d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new taste(this.f28323d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r0.a(r1, r8) != r7) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f28322c
            r6 = 3
            r5 = 2
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L20
            if (r1 == r0) goto L2e
            if (r1 == r5) goto L18
            if (r1 != r6) goto L5f
            kotlin.ResultKt.throwOnFailure(r9)
        L15:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L18:
            t.misplace r3 = r8.f28321b
            kotlinx.coroutines.sync.Mutex r2 = r8.f28320a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L42
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f28322c = r0
            r0 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r8)
            if (r0 != r7) goto L31
            goto L41
        L2e:
            kotlin.ResultKt.throwOnFailure(r9)
        L31:
            t.misplace r3 = r8.f28323d
            kotlinx.coroutines.sync.Mutex r2 = r3.f28314d
            r8.f28320a = r2
            r8.f28321b = r3
            r8.f28322c = r5
            java.lang.Object r0 = r2.lock(r4, r8)
            if (r0 != r7) goto L42
        L41:
            return r7
        L42:
            r3.f28316f = r4     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r1 = r3.f28315e     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L67
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            r3.f28315e = r0     // Catch: java.lang.Throwable -> L67
            r2.unlock(r4)
            t.misplace r0 = r8.f28323d
            r8.f28320a = r4
            r8.f28321b = r4
            r8.f28322c = r6
            java.lang.Object r0 = r0.a(r1, r8)
            if (r0 != r7) goto L15
            goto L41
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            r0 = move-exception
            r2.unlock(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.taste.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
