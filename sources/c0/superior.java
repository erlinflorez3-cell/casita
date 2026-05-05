package c0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class superior extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f2482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ misplace f2483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k0.pair f2484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(misplace misplaceVar, k0.pair pairVar, Continuation continuation) {
        super(2, continuation);
        this.f2483b = misplaceVar;
        this.f2484c = pairVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new superior(this.f2483b, this.f2484c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new superior(this.f2483b, this.f2484c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x0050 A[EDGE_INSN: B:564:0x0050->B:308:0x0050 BREAK  A[LOOP:12: B:367:0x02d1->B:371:0x02ea], EDGE_INSN: B:585:0x0050->B:308:0x0050 BREAK  A[LOOP:20: B:381:0x0339->B:587:?], EDGE_INSN: B:568:0x0050->B:308:0x0050 BREAK  A[LOOP:14: B:394:0x03f4->B:399:0x0402], EDGE_INSN: B:571:0x0050->B:308:0x0050 BREAK  A[LOOP:16: B:407:0x0480->B:411:0x048c], EDGE_INSN: B:308:0x0050->B:309:0x0051 BREAK  A[LOOP:17: B:413:0x049b->B:576:0x049b]] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x031b A[LOOP:13: B:377:0x0315->B:379:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x06b8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v38, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v39, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.superior.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
