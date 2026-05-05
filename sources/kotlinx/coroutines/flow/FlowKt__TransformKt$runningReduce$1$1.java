package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
    final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, FlowCollector<? super T> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L73
            r4 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L73
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r0 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L51
            if (r1 != r5) goto L79
            kotlin.ResultKt.throwOnFailure(r0)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r7.$accumulator
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 != r0) goto L3c
            r1 = r7
            goto L5d
        L3c:
            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r1 = r7.$operation
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r7.$accumulator
            T r0 = r0.element
            r4.L$0 = r7
            r4.L$1 = r2
            r4.label = r6
            java.lang.Object r0 = r1.invoke(r0, r8, r4)
            if (r0 != r3) goto L4f
            return r3
        L4f:
            r1 = r7
            goto L5c
        L51:
            java.lang.Object r2 = r4.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r1
            kotlin.ResultKt.throwOnFailure(r0)
        L5c:
            r8 = r0
        L5d:
            r2.element = r8
            kotlinx.coroutines.flow.FlowCollector<T> r2 = r1.$this_flow
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r1.$accumulator
            T r1 = r0.element
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r5
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L2c
            return r3
        L73:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            r4.<init>(r7, r9)
            goto L19
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
