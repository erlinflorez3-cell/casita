package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__TransformKt$chunked$2$1<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<ArrayList<T>> $result;
    final /* synthetic */ int $size;
    final /* synthetic */ FlowCollector<List<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$chunked$2$1(Ref.ObjectRef<ArrayList<T>> objectRef, int i2, FlowCollector<? super List<? extends T>> flowCollector) {
        this.$result = objectRef;
        this.$size = i2;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            if (r0 == 0) goto L5f
            r5 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r5 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L5f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L65
            java.lang.Object r0 = r5.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L27:
            kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r1 = r0.$result
            r0 = 0
            r1.element = r0
        L2c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r0 = r6.$result
            T r2 = r0.element
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 != 0) goto L45
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r6.$size
            r2.<init>(r0)
            kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r0 = r6.$result
            r0.element = r2
        L45:
            r2.add(r7)
            int r1 = r2.size()
            int r0 = r6.$size
            if (r1 != r0) goto L2c
            kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> r0 = r6.$this_flow
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = r0.emit(r2, r5)
            if (r0 != r4) goto L5d
            return r4
        L5d:
            r0 = r6
            goto L27
        L5f:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            r5.<init>(r6, r8)
            goto L13
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
