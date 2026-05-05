package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__LimitKt$drop$2$1<T> implements FlowCollector {
    final /* synthetic */ int $count;
    final /* synthetic */ Ref.IntRef $skipped;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$drop$2$1(Ref.IntRef intRef, int i2, FlowCollector<? super T> flowCollector) {
        this.$skipped = intRef;
        this.$count = i2;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L42
            r4 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L42
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L48
            kotlin.ResultKt.throwOnFailure(r1)
        L29:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$IntRef r0 = r5.$skipped
            int r1 = r0.element
            int r0 = r5.$count
            if (r1 < r0) goto L50
            kotlinx.coroutines.flow.FlowCollector<T> r0 = r5.$this_flow
            r4.label = r2
            java.lang.Object r0 = r0.emit(r6, r4)
            if (r0 != r3) goto L29
            return r3
        L42:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r4.<init>(r5, r7)
            goto L19
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L50:
            kotlin.jvm.internal.Ref$IntRef r1 = r5.$skipped
            int r0 = r1.element
            int r0 = r0 + r2
            r1.element = r0
            kotlin.jvm.internal.Ref$IntRef r0 = r5.$skipped
            int r0 = r0.element
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
