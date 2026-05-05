package kotlinx.coroutines.flow;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<;\"&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0R͜P.X\\2\u000f\u0002{<$i-yCAX2l0ޛgN.f\u000fL`ŏQ\u000e&\u001c~i:I}x$\u001178RqO3\u0014ok:\u00119D\u00078r(7\n\u0016\u0011)pGǘz\u0005IO\u001c\u00186E\u0001<X\u0013s\u000b*#\u0016Mf\u0001ɉ`qT:Xrc??%\tohU7g@\u0003]\u000fVTm\f%i./P9K\u0014S\\1\n\u0019À}ƄCqK\u000f\u0001\u001c56as\u001eBx\u0002\u001aƃ9O-_x%j\u0011yf\u001c);O*K~\u000fX{\t\t%<J\u001a6mN0;\u001c~H\u00142\u0005\u0004cO\u0017\u000eެF\n\u0001eF\u001d+\u0005C-?!\r_qL)]}{˿\u0011()\u0005~'aY\u001eb\u001b!z~a9aFMJ^\n I\u001c\f\u0001f\u0012,\u001a/u\t]~Wы]É;[G29\b\u0010X\\g=\u0005\u0001jY֟`Hh(~\u0018G*O\f\tE+ʔ*ÏXX:\"e:b\u0019\u0016\n)\u001f#w\\#+ī\\O\u0011ozOm\nk/\u00158 ʫ*ް[9lDMmq#yR=\u0014_>hڳffjY\u001c\\l(h2vkVǵ:ΌR\f!CW2*GD1_\\5J\tٜPA%\u000fo\\x\u0010ETa%3\n2\t!\u001dV[\u0001qwx\u0010,\rh23QSE\u0019TkPpD\u00013\t\u0015r.P\u0016a\u000eƉ+טyU\n7.8GiG?)\u000eE)R\u00043զZr\u000eW]\u00147zCy=</ֲ&Űnp:q\u0003\r]l/$\r]9#(f\u0006טoF#MsV\u001b[\u0005I!\u0004\n\\\\L\u0015!%\u001d5\u0003\u007f\"C5=K7#&y$/Cw\fq\u007f2\nd%%#n2A*ܥ.͈U]@RPeg\u0018V\"jl#DN۳\u0006\bj\u000fD\u000fCH\bd\u001fW~ԎIɣ\u0002f\u0015=%\u000fduR\u0015\u0006|z.\u007f,yʕ\f\u0014\u0007I5\u0013]S.m\u001cL#֬\t؝\u000e\u000b\nBߔ\u00167"}, d2 = {"@dSBV,", "!", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/bRB`<EO(\t\b", "D`[BX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\u000bix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", "4n[1", Global.BLANK, "7mXA\\(E", "/bR", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0017W\"n\u000b\u001b\u001d\u0012>4nLc\u001aW\t\u0019~A72$ch\tKJU^9h\u0016hr !? %mb\"dY0SeP\u0016rP\t=", "Ah]4_,", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017AEx>.$lj9\u0015-\nX\u007f6KU^(kV|FiUA\u0013J<\tN`=-p\u000e!\u001c\r,G\u0011\u0011", "Ah]4_,(`\u0002\u000f\u0002e", "4ha@g", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", "4ha@g\u0016K<)\u0006\u0002", ":`bA", ":`bAB9'c \u0006", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14291<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14291(Continuation<? super C14291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14303<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14303(Continuation<? super C14303> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    static final class C14311<T, R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14311(Continuation<? super C14311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
            this.$accumulator = objectRef;
            this.$operation = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                if (r0 == 0) goto L41
                r5 = r8
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r5
                int r0 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L41
                int r0 = r5.label
                int r0 = r0 - r1
                r5.label = r0
            L13:
                java.lang.Object r0 = r5.result
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L47
                java.lang.Object r2 = r5.L$0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                kotlin.ResultKt.throwOnFailure(r0)
            L27:
                r2.element = r0
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L2c:
                kotlin.ResultKt.throwOnFailure(r0)
                kotlin.jvm.internal.Ref$ObjectRef<R> r2 = r6.$accumulator
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r6.$operation
                T r0 = r2.element
                r5.L$0 = r2
                r5.label = r3
                java.lang.Object r0 = r1.invoke(r0, r7, r5)
                if (r0 != r4) goto L40
                return r4
            L40:
                goto L27
            L41:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                r5.<init>(r6, r8)
                goto L13
            L47:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object emit$$forInline(T t2, Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            InlineMarker.mark(5);
            Ref.ObjectRef<R> objectRef = this.$accumulator;
            objectRef.element = (T) this.$operation.invoke((R) objectRef.element, t2, (Continuation<? super R>) continuation);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14321<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14321(Continuation<? super C14321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14341<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14341(Continuation<? super C14341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14361<S, T extends S> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14361(Continuation<? super C14361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14372<T> implements FlowCollector {
        final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
        final /* synthetic */ Function3<S, T, Continuation<? super S>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        C14372(Ref.ObjectRef<Object> objectRef, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3) {
            this.$accumulator = objectRef;
            this.$operation = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
                if (r0 == 0) goto L4d
                r5 = r8
                kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = r2 + r1
                r2 = r2 | r1
                int r0 = r0 - r2
                if (r0 == 0) goto L4d
                int r0 = r5.label
                int r0 = r0 - r1
                r5.label = r0
            L16:
                java.lang.Object r1 = r5.result
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L30
                if (r0 != r3) goto L53
                java.lang.Object r2 = r5.L$0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                kotlin.ResultKt.throwOnFailure(r1)
            L2a:
                r7 = r1
            L2b:
                r2.element = r7
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L30:
                kotlin.ResultKt.throwOnFailure(r1)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r6.$accumulator
                T r1 = r2.element
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                if (r1 == r0) goto L2b
                kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> r1 = r6.$operation
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r6.$accumulator
                T r0 = r0.element
                r5.L$0 = r2
                r5.label = r3
                java.lang.Object r1 = r1.invoke(r0, r7, r5)
                if (r1 != r4) goto L4c
                return r4
            L4c:
                goto L2a
            L4d:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
                r5.<init>(r6, r8)
                goto L16
            L53:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.C14372.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14381<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14381(Continuation<? super C14381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14401<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14401(Continuation<? super C14401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1
            if (r0 == 0) goto L2c
            r6 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r6 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2c
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L3e
            if (r0 != r3) goto L36
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            goto L32
        L2c:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r6.<init>(r8)
            goto L16
        L32:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            goto L66
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3e:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
            r1.<init>()
            r0 = r1
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r6.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r6.L$1 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r6.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            java.lang.Object r0 = r7.collect(r0, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            if (r0 != r4) goto L5f
            return r4
        L5f:
            goto L66
        L60:
            r0 = move-exception
            goto L63
        L62:
            r0 = move-exception
        L63:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r1)
        L66:
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r0) goto L6f
            T r0 = r2.element
            return r0
        L6f:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.first(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3
            if (r0 == 0) goto L2d
            r6 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r6 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2d
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto L37
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r1
            java.lang.Object r2 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            goto L33
        L2d:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r6.<init>(r9)
            goto L13
        L33:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L65
            goto L69
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3f:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r1.<init>(r8, r2)
            r0 = r1
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r6.L$0 = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r6.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r6.L$2 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r6.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            java.lang.Object r0 = r7.collect(r0, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            if (r0 != r4) goto L62
            return r4
        L62:
            goto L69
        L63:
            r0 = move-exception
            goto L66
        L65:
            r0 = move-exception
        L66:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r1)
        L69:
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r0) goto L72
            T r0 = r2.element
            return r0
        L72:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected at least one element matching the predicate "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r8)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.first(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14291
            if (r0 == 0) goto L29
            r6 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r6 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14291) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L33
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            goto L2f
        L29:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r6.<init>(r8)
            goto L13
        L2f:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            goto L5f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
            r1.<init>()
            r0 = r1
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r6.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r6.L$1 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r6.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r0 = r7.collect(r0, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r0 != r4) goto L58
            return r4
        L58:
            goto L5f
        L59:
            r0 = move-exception
            goto L5c
        L5b:
            r0 = move-exception
        L5c:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r1)
        L5f:
            T r0 = r2.element
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14303
            if (r0 == 0) goto L2c
            r6 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r6 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14303) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2c
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L3e
            if (r0 != r3) goto L36
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r1
            java.lang.Object r2 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            goto L32
        L2c:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r6.<init>(r9)
            goto L16
        L32:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5e
            goto L62
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3e:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r1.<init>(r8, r2)
            r0 = r1
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            r6.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            r6.L$1 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            r6.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            java.lang.Object r0 = r7.collect(r0, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            if (r0 != r4) goto L5b
            return r4
        L5b:
            goto L62
        L5c:
            r0 = move-exception
            goto L5f
        L5e:
            r0 = move-exception
        L5f:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r1)
        L62:
            T r0 = r2.element
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, R> java.lang.Object fold(kotlinx.coroutines.flow.Flow<? extends T> r6, R r7, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super R> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14311
            if (r0 == 0) goto L4d
            r5 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14311) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L4d
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L53
            java.lang.Object r1 = r5.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L2d:
            T r0 = r1.element
            return r0
        L30:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.element = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r0.<init>(r1, r8)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r0 = r6.collect(r0, r5)
            if (r0 != r3) goto L4c
            return r3
        L4c:
            goto L2d
        L4d:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1
            r5.<init>(r9)
            goto L19
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.fold(kotlinx.coroutines.flow.Flow, java.lang.Object, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object fold$$forInline(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = r2;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(objectRef, function3);
        InlineMarker.mark(0);
        flow.collect(anonymousClass2, continuation);
        InlineMarker.mark(1);
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object last(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.coroutines.Continuation<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14321
            if (r0 == 0) goto L4f
            r5 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14321) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L5d
            java.lang.Object r2 = r5.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r4)
        L27:
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r0) goto L55
            T r0 = r2.element
            return r0
        L30:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2
            r0.<init>()
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r5.L$0 = r2
            r5.label = r1
            java.lang.Object r0 = r6.collect(r0, r5)
            if (r0 != r3) goto L4e
            return r3
        L4e:
            goto L27
        L4f:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1
            r5.<init>(r7)
            goto L13
        L55:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element"
            r1.<init>(r0)
            throw r1
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.last(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object lastOrNull(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.coroutines.Continuation<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14341
            if (r0 == 0) goto L48
            r5 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14341) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L48
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4e
            java.lang.Object r1 = r5.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L2a:
            T r0 = r1.element
            return r0
        L2d:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2
            r0.<init>()
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r0 = r6.collect(r0, r5)
            if (r0 != r3) goto L47
            return r3
        L47:
            goto L2a
        L48:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            r5.<init>(r7)
            goto L16
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlinx.coroutines.internal.Symbol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S, T extends S> java.lang.Object reduce(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super S> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14361
            if (r0 == 0) goto L4f
            r5 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14361) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L5d
            java.lang.Object r2 = r5.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r4)
        L27:
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r0) goto L55
            T r0 = r2.element
            return r0
        L30:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2
            r0.<init>(r2, r7)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r5.L$0 = r2
            r5.label = r1
            java.lang.Object r0 = r6.collect(r0, r5)
            if (r0 != r3) goto L4e
            return r3
        L4e:
            goto L27
        L4f:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1
            r5.<init>(r8)
            goto L13
        L55:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Empty flow can't be reduced"
            r1.<init>(r0)
            throw r1
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.reduce(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object single(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.coroutines.Continuation<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14381
            if (r0 == 0) goto L4f
            r5 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14381) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L5d
            java.lang.Object r2 = r5.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r4)
        L27:
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r0) goto L55
            T r0 = r2.element
            return r0
        L30:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
            r0.<init>()
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r5.L$0 = r2
            r5.label = r1
            java.lang.Object r0 = r6.collect(r0, r5)
            if (r0 != r3) goto L4e
            return r3
        L4e:
            goto L27
        L4f:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            r5.<init>(r7)
            goto L13
        L55:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Flow is empty"
            r1.<init>(r0)
            throw r1
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.single(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object singleOrNull(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C14401
            if (r0 == 0) goto L29
            r6 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r6 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C14401) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L33
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            goto L2f
        L29:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1
            r6.<init>(r8)
            goto L13
        L2f:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5f
            goto L63
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            r1.<init>()
            r0 = r1
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r6.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r6.L$1 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r6.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            java.lang.Object r0 = r7.collect(r0, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            if (r0 != r4) goto L5c
            return r4
        L5c:
            goto L63
        L5d:
            r0 = move-exception
            goto L60
        L5f:
            r0 = move-exception
        L60:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r1)
        L63:
            T r1 = r2.element
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 != r0) goto L6b
            r0 = 0
        L6a:
            return r0
        L6b:
            T r0 = r2.element
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.singleOrNull(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
