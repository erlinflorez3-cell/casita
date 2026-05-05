package kotlinx.coroutines.flow;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!4i\bDJc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007ljA0ZeP.`S2\u000fyڔ<$q$yCAW\"}8\tWNmgvJh\fK\u000f\f\u001b\u0011Y:կm~m\u0014\u001f2\tom2mqCʠnuV\u0007&108\"\u000b\u0011\u001c:HVw)B{N\u00183N\u0081R\u000f\u0013L\u0015\"\"\fN\"\u0011\u001e#g|9X}mIu$ɨmLT+o6\u0003R\u001dHZ-3|q&;FG7%%\u0002\u000b5YkC\u0013A\b<3qU)ȅMs]@\u001fã\u001aƦ/O\u001bh\u000b\u0015j\u0011if\u001c);O*K~\rHy\u0001Ԉ\u001b=$\u0010\f&V.U v\n\u001e3;s\u0002?\u0001DdE\u000eЭyr\u001d$\u0010;;?+haa\u0002\u0019|:\f\u0016\u001d-i\u0002ͼ%eZ\u0012p\u001b!Y\bS7WfCXV\u001a_Mo\u0014p\u0011\nX\u000b@K\u00101\u0012\u0010\\ S9٦=#'uH҈Jϼz\u0005nsk8`UX(~\u0018G*O\r\tC\u0005\u0007q¬bYT\u0017]\u001ed\u0007D\tA\u001f\r#J/=7TNxqzSm\f5/-8\bq{\u0016g?n5EQ\u0012\u0018\u0010Y\u0007\u0018O>x\u0004\u0007opb۱^\\.,ĘLj\u001e\b\u0014*\\\u001d+8Os,4r2G[5J\tٜPB%\u000fo\\x\u0010EUa#3,2\u0003!?V[\u0001ww~Y.\r`h.oTE,6f8gb\u000fɠ\u000b\ty\u0004WmRL\\n\u001c{{\u000f0\u001e*?a1M\u0013=\u0007W9\u00121UN\td\u007fV@)ϸ\u0001y\u0015Eÿ2g\u0016u\tzn~bUd\u00192v%sQ\u0007\u0005\u0002\u007fӓT{oid\rk>\u0010s1XlyF\u000b\u001dF$$\u0011w2\u0003E/S'c\u0017&\u0017?\u001dqcyq>y\u0011\u0017T{u\b<e,n\u0011Z\fA֑<I_\tй&$z\u0013ZVx\r B7<57XAjq\u0005;\u0014ߒGlt\u001dD\r\u001f^{<\u0019̊\f5Ve:uS}Z_q(A\u0010au\u0006,Q[\u001bR\u001f\u0010\u001b}AnX\u001dk#fjr\u001aF\u0005\"*ݠEEh\tL\u000f*9<>\u000e\u0011igy\u000e \u0001\u0010Ho\u000fE:pzKZ\u001eV\u000f[\u0005Q3b҇d!0\u000b/\u0015A1\u00117G\u0004\u001cX\u001bВ\"҅\u0005U# )\u0003˓\u0003\u007f"}, d2 = {"BqP;f-H`!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", Global.BLANK, "\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\u000biUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "Cmb.Y,-`\u0015\b\t_6\n\u0011", "=mBAT9M", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\niUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "=m2<`7ES(\u0003\u0005g", "", "1`d@X", "=m4:c;R", "3mbBe,\u001aQ(\u0003\f^", "7me<^,,O\u001a~\u0002r", "7me<^,,O\u001a~\u0002rj]\u00109we7u:`\u001f\u001bV~\u000eI\u0005\u000bD", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e'\u0017\u000bs@H\u001bQ3E\u000b=2o\u000f#\u0018GfmIVe.\u007f\u001f\u0005H-q\u0010Wi\u0007QQTf3d\u001a)zfCI(\u001d\u0002\u0015*lZ7_?:\u0016ncu1nC\"|\u0002\u000e;r[DTE", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_transform;
        final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
        public static final class C03241<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;

            /* JADX WARN: Multi-variable type inference failed */
            public C03241(Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
                this.$transform = function3;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    if (r0 == 0) goto L36
                    r4 = r7
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r4
                    int r0 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L36
                    int r0 = r4.label
                    int r0 = r0 - r1
                    r4.label = r0
                L13:
                    java.lang.Object r1 = r4.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L26
                    if (r0 != r2) goto L3c
                    kotlin.ResultKt.throwOnFailure(r1)
                L23:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L26:
                    kotlin.ResultKt.throwOnFailure(r1)
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r5.$transform
                    kotlinx.coroutines.flow.FlowCollector<R> r0 = r5.$$this$flow
                    r4.label = r2
                    java.lang.Object r0 = r1.invoke(r0, r6, r4)
                    if (r0 != r3) goto L23
                    return r3
                L36:
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    r4.<init>(r5, r7)
                    goto L13
                L3c:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1.C03241.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Object emit$$forInline(T t2, Continuation<? super Unit> continuation) {
                InlineMarker.mark(4);
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
                InlineMarker.mark(5);
                this.$transform.invoke((FlowCollector<? super R>) this.$$this$flow, t2, continuation);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_transform = flow;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_transform, this.$transform, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T> flow = this.$this_transform;
                C03241 c03241 = new C03241(this.$transform, flowCollector);
                this.label = 1;
                if (flow.collect(c03241, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T> flow = this.$this_transform;
            C03241 c03241 = new C03241(this.$transform, flowCollector);
            InlineMarker.mark(0);
            flow.collect(c03241, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).f19841e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector<? super T> r5, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, java.lang.Throwable r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L25
            r4 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L2f
            java.lang.Object r7 = r4.L$0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            goto L2b
        L25:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r4.<init>(r8)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L48
            goto L45
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.L$0 = r7     // Catch: java.lang.Throwable -> L48
            r4.label = r0     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r6.invoke(r5, r7, r4)     // Catch: java.lang.Throwable -> L48
            if (r0 != r2) goto L45
            return r2
        L45:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L48:
            r0 = move-exception
            if (r7 == 0) goto L50
            if (r7 == r0) goto L50
            kotlin.ExceptionsKt.addSuppressed(r0, r7)
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, function3);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, function2);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(function2, flow);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt.flow(new AnonymousClass1(flow, function3, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, function3);
    }
}
