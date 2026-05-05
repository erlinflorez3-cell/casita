package bo.app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mo extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public long f1308a;

    /* JADX INFO: renamed from: b */
    public int f1309b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1310c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zo f1311d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f1312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(zo zoVar, long j2, Continuation continuation) {
        super(2, continuation);
        this.f1311d = zoVar;
        this.f1312e = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        mo moVar = new mo(this.f1311d, this.f1312e, continuation);
        moVar.f1310c = obj;
        return moVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0044 -> B:30:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r15.f1309b
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L47
            if (r0 == r7) goto L62
            if (r0 != r5) goto L7c
            long r0 = r15.f1308a
            java.lang.Object r4 = r15.f1310c
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.throwOnFailure(r16)
        L17:
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r8 = bo.app.zo.f2409m
            com.braze.support.BrazeLogger$Priority r9 = com.braze.support.BrazeLogger.Priority.V
            bo.app.lo r12 = bo.app.lo.f1205a
            r13 = 12
            r14 = 0
            r10 = 0
            r11 = 0
            com.braze.support.BrazeLogger.brazelog$default(r7, r8, r9, r10, r11, r12, r13, r14)
            com.braze.Braze$Companion r3 = com.braze.Braze.Companion
            bo.app.zo r2 = r15.f1311d
            android.content.Context r2 = r2.f2410a
            com.braze.Braze r2 = r3.getInstance(r2)
            r2.requestImmediateDataFlush()
        L34:
            boolean r2 = kotlinx.coroutines.CoroutineScopeKt.isActive(r4)
            if (r2 == 0) goto L79
            r15.f1310c = r4
            r15.f1308a = r0
            r15.f1309b = r5
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r0, r15)
            if (r2 != r6) goto L17
            return r6
        L47:
            kotlin.ResultKt.throwOnFailure(r16)
            java.lang.Object r4 = r15.f1310c
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            bo.app.zo r0 = r15.f1311d
            long r0 = r0.f2416g
            long r2 = r15.f1312e
            r15.f1310c = r4
            r15.f1308a = r0
            r15.f1309b = r7
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r2, r15)
            if (r2 != r6) goto L61
            return r6
        L61:
            goto L6b
        L62:
            long r0 = r15.f1308a
            java.lang.Object r4 = r15.f1310c
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.throwOnFailure(r16)
        L6b:
            com.braze.Braze$Companion r3 = com.braze.Braze.Companion
            bo.app.zo r2 = r15.f1311d
            android.content.Context r2 = r2.f2410a
            com.braze.Braze r2 = r3.getInstance(r2)
            r2.requestImmediateDataFlush()
            goto L34
        L79:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.mo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
