package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
    final /* synthetic */ FlowCollector<R> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L68
            r6 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r6 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L68
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L47
            if (r1 != r4) goto L6e
            kotlin.ResultKt.throwOnFailure(r0)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef<R> r2 = r7.$accumulator
            kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r7.$operation
            T r0 = r2.element
            r6.L$0 = r7
            r6.L$1 = r2
            r6.label = r3
            java.lang.Object r0 = r1.invoke(r0, r8, r6)
            if (r0 != r5) goto L45
            return r5
        L45:
            r1 = r7
            goto L52
        L47:
            java.lang.Object r2 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r1
            kotlin.ResultKt.throwOnFailure(r0)
        L52:
            r2.element = r0
            kotlinx.coroutines.flow.FlowCollector<R> r2 = r1.$this_flow
            kotlin.jvm.internal.Ref$ObjectRef<R> r0 = r1.$accumulator
            T r1 = r0.element
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r0 = r2.emit(r1, r6)
            if (r0 != r5) goto L2c
            return r5
        L68:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r6 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r6.<init>(r7, r9)
            goto L19
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
