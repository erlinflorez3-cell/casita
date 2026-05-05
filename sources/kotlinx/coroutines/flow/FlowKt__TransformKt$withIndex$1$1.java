package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.IntRef $index;
    final /* synthetic */ FlowCollector<IndexedValue<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$withIndex$1$1(FlowCollector<? super IndexedValue<? extends T>> flowCollector, Ref.IntRef intRef) {
        this.$this_flow = flowCollector;
        this.$index = intRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L45
            r7 = r10
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r7 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L45
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L13:
            java.lang.Object r1 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 != r5) goto L4b
            kotlin.ResultKt.throwOnFailure(r1)
        L23:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L26:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> r4 = r8.$this_flow
            kotlin.collections.IndexedValue r3 = new kotlin.collections.IndexedValue
            kotlin.jvm.internal.Ref$IntRef r0 = r8.$index
            int r2 = r0.element
            kotlin.jvm.internal.Ref$IntRef r1 = r8.$index
            int r0 = r2 + 1
            r1.element = r0
            if (r2 < 0) goto L53
            r3.<init>(r2, r9)
            r7.label = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L23
            return r6
        L45:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r7 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r7.<init>(r8, r10)
            goto L13
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L53:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
