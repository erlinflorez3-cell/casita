package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ Ref.IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ Object $ownershipMarker;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i2, FlowCollector<? super T> flowCollector, Object obj) {
        this.$consumed = intRef;
        this.$count = i2;
        this.$this_flow = flowCollector;
        this.$ownershipMarker = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L59
            r5 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r5 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L59
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L67
            if (r0 != r3) goto L5f
            kotlin.ResultKt.throwOnFailure(r1)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$IntRef r1 = r6.$consumed
            int r0 = r1.element
            int r0 = r0 + r2
            r1.element = r0
            kotlin.jvm.internal.Ref$IntRef r0 = r6.$consumed
            int r1 = r0.element
            int r0 = r6.$count
            if (r1 >= r0) goto L4c
            kotlinx.coroutines.flow.FlowCollector<T> r0 = r6.$this_flow
            r5.label = r2
            java.lang.Object r0 = r0.emit(r7, r5)
            if (r0 != r4) goto L6a
            return r4
        L4c:
            kotlinx.coroutines.flow.FlowCollector<T> r1 = r6.$this_flow
            java.lang.Object r0 = r6.$ownershipMarker
            r5.label = r3
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(r1, r7, r0, r5)
            if (r0 != r4) goto L2c
            return r4
        L59:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r5 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r5.<init>(r6, r8)
            goto L19
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            kotlin.ResultKt.throwOnFailure(r1)
        L6a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
