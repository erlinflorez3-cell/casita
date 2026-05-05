package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.BooleanRef $matched;
    final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> $predicate;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, FlowCollector<? super T> flowCollector, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.$matched = booleanRef;
        this.$this_flow = flowCollector;
        this.$predicate = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
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
    public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L7c
            r4 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L7c
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r6 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r5 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L8a
            if (r0 == r1) goto L57
            if (r0 != r5) goto L82
            kotlin.ResultKt.throwOnFailure(r6)
        L2f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$BooleanRef r0 = r7.$matched
            boolean r0 = r0.element
            if (r0 == 0) goto L46
            kotlinx.coroutines.flow.FlowCollector<T> r0 = r7.$this_flow
            r4.label = r2
            java.lang.Object r0 = r0.emit(r8, r4)
            if (r0 != r3) goto L8d
            return r3
        L46:
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r7.$predicate
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r1
            java.lang.Object r6 = r0.invoke(r8, r4)
            if (r6 != r3) goto L55
            return r3
        L55:
            r1 = r7
            goto L60
        L57:
            java.lang.Object r8 = r4.L$1
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r1
            kotlin.ResultKt.throwOnFailure(r6)
        L60:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L90
            kotlin.jvm.internal.Ref$BooleanRef r0 = r1.$matched
            r0.element = r2
            kotlinx.coroutines.flow.FlowCollector<T> r1 = r1.$this_flow
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r5
            java.lang.Object r0 = r1.emit(r8, r4)
            if (r0 != r3) goto L2f
            return r3
        L7c:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r4.<init>(r7, r9)
            goto L19
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            kotlin.ResultKt.throwOnFailure(r6)
        L8d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L90:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
