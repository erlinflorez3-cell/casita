package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class civilian extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f22409a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ taste f22410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civilian(taste tasteVar, Continuation continuation) {
        super(2, continuation);
        this.f22410b = tasteVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new civilian(this.f22410b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new civilian(this.f22410b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0074 A[PHI: r7
  0x0074: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v2 java.lang.String) binds: [B:75:0x0072, B:81:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.civilian.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
