package kotlinx.coroutines.flow;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.SystemPropsKt;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!,u\bDJd|\u0004O\f8\u000b4D\u0007\"B\u0012\u007f\u0007lkA0ZeP.hS2\u000fq{<$q$yCI٥\"}(\rWNu\u0002vϺb\u000bQ\u001e\u000e\u0016~k4Ikxe\u0012%2JoM3UoS9ht<\u00078\u00130?\u0012\u000b\u0011\u001c:HV\u007f)Kk\u000e\u0018ؓNzZT\u0013L\u0013#:\fN\"\u0011\u001e#q|>x\"kEGT\thR_7nv\u0007֔\u0011PZ4\u001d|g,;B=;;4c\u0011\u0017^kG\u0013E\u0002?\u0015hm0YQ\"gF\\\u0010\u0016+*}\u001e\f~laԇU`\u001a9C:q^h\u00148y\u000b{SE2\u0016&)N͓;$\u0007\n\u00142\u0003{{F`\u0004nBF\u0005\u0010>G+\u000639M3f\u007fdkN\\B\u00146\u0013\u001d3\u0012~0\"^\u05f8d\u001f!a\bW7_P?NT0hM{\u0014|r\n:\n@I\u0010/B\u001a\\\u001fSGk=3#\u0002\u0001vU\u0016\u0003KeĈWi`]XD|,O0\u0019\u000ejD+\u000f\u001aXtZ2Ҋ[&|\u0013\u000e\u0010#&lyL!k\u001a|W\u0017q1Ru*3F~=ip{\u000e\u001eC\r;USi߄o\\\u001f ODr\u000bhhRSRd\u000b0PJ` \u001e\u000f\u0014J^\u000e#2\u0006{J<L3\u001f¢#R3:PZ\u0015\u0017odn\u000f\u000fZC&\u0013ij~7\t~v\u0011uwzY,CjP5ۮU5'AmNvP\u0015)\u0017\u0001\u0004\u007f\u000eqzOln\u001c߯c\u0006H\"*Aa5M\u0015\u001f~o<05sT#kWM ;\u0013|(\u0012\u0002mFU\u0016\b\t2plZO\u001b P~~t)Ψr\n\u001acLyUl|\u0011k@YrIcjVh?\u000b\u001e,0\u0019,({E5S--\u0018\b\u0014u\u001e\u0010|y\u0001>\t)\u0019֑xo\n9s\u001cupa_8A^Xi\u0007N(4n\u0013Bv\u000b&\u0018R\rD\u000fIGou\u001ftиQ\u000b5\u001f-\fՐ\u0011pd}Rv}!L4o,\u0004CD\u001d\rKE\u0013Sωuw\u000eMb\nX\u00182\u0011\f3~\u0012bGN^\b\u001a\u000f3\u0014~0gG:r\u0016L\u0018j>ʙ@\u0012\u0011Pdo\f\u001e\u000b\u0002Le5&BP\u0004Gf\u0016d~lXX\u0005'N\u000f)X\u0011\u000f\u0013C \u000f4_\u0016\u001cR\u001bЗi҅\u0005S+\u001b3G]#~+;Fd9a1\u0007\t+GcŝW\fV\u0006M({t\u0018\u0012H\u001a\r\u001d\t\"IA\u0002Beu>i#\u0001jMt\b\"u\u0019XĀ-\t\u0001\n\u001eB\u0010\u001d\u001b\u001bUx\u0016q=T^}GE*\u0001]MW\u0017\u001c\u0001sH1,4F[I\u0010o͂+{ee[\u0012\u0016¶8'2sW`.ʲ9ŭa!Bσ\u0002\u0018h\u0002\u0017\u0014p:\u00120bt!\rd\f\rЦ\u0004ג\u0006\u001ff̏{y'D5,\u0005\bHPv~Ʀg\u0012"}, d2 = {"\u0012D5\u000eH\u0013-Mvhc<\u001ciu\u000fN]\u001cu+m\u0001\u0002'\\|0p\u000e\u0011A]", "", "5dc\u00118\r\u001aC\u007fmt<\u0016ef\u001fRl\bd\u001et\u0011\u00024Yx\u001cc\u0014)Sf{\u001fMT*VLEz0-\u0019rjG", "u(E", "\u0012D5\u000eH\u0013-Mvhc<\u001ciu\u000fN]\u001c", "", "5dc\u00118\r\u001aC\u007fmt<\u0016ef\u001fRl\bd\u001etU\u0013Px\u0018Kr49c\u0007.", "5dc\u00118\r\u001aC\u007fmt<\u0016ef\u001fRl\bd\u001et", "u(8", "4kPA@(I1#\bxZ;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", Global.BLANK, "\"", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\niUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "4kPA@(I;\u0019\f|^", "1n]0h9KS\"|\u000f", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b=d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F`g\u001etT5\u001c\f]J78BA,\u0012<X\u0006Dh\u000fU\u0017\u0015?|:#]\u001aYO", "4kPAg,G1#\bxZ;", ";da4X", "", "4k^Df", "", "uZ;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/A\u0007=w%5QLN52(\"rqH\u000bl,\\@(NV`u=Y|Oi", "4kPAg,G;\u0019\f|^", "BqP;f-H`!evm,\u000b\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\u000biUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "4kPA@(I:\u0015\u000ezl;", ";`_\u0019T;>a(", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = SystemPropsKt.systemProp(FlowKt.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!,i\bDJc|\u0004W\u00068é6B\u0015\"4\u0012}\u0007tʑQ0rdh0Xݷ8\u000f\f}:#i%\u001aIKW*}h\t}P\u0018z|Mr\u001a\n\u0010و\u001a\u0003p0Y[~b\"\u00118H\u0016EyU"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Flow<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super R> flowCollector, T t2, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, continuation);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = t2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1<R, T> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L14
                if (r0 == r3) goto L2a
                if (r0 != r4) goto L42
                kotlin.ResultKt.throwOnFailure(r7)
            L11:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L14:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r2 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r0 = r6.$transform
                r6.L$0 = r2
                r6.label = r3
                java.lang.Object r7 = r0.invoke(r1, r6)
                if (r7 != r5) goto L31
                return r5
            L2a:
                java.lang.Object r2 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r7)
            L31:
                kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                r1 = r6
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r0 = 0
                r6.L$0 = r0
                r6.label = r4
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.emitAll(r2, r7, r1)
                if (r0 != r5) goto L11
                return r5
            L42:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1<R, T> for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r3 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                java.lang.Object r1 = r4.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r0 = r4.$transform
                java.lang.Object r2 = r0.invoke(r1, r4)
                kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
                r1 = r4
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r0 = 0
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowKt.emitAll(r3, r2, r1)
                r0 = 1
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!,i\bDJc|\u0004W\u00068é6B\u0015\"4\u0012}\u0007tʑQ0rdh0Xݷ8\u000f\f}:#i%\u001aIKW*}h\t}P\u0018z|Mr\u001a\n\u0010و\u001a\u0003p0Y[~b\"\u00118H\u0016EyU"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14271<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14271(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C14271> continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super R> flowCollector, T t2, Continuation<? super Unit> continuation) {
            C14271 c14271 = new C14271(this.$transform, continuation);
            c14271.L$0 = flowCollector;
            c14271.L$1 = t2;
            return c14271.invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1<R, T> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L14
                if (r0 == r3) goto L2a
                if (r0 != r4) goto L40
                kotlin.ResultKt.throwOnFailure(r7)
            L11:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L14:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r2 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r6.$transform
                r6.L$0 = r2
                r6.label = r3
                java.lang.Object r7 = r0.invoke(r1, r6)
                if (r7 != r5) goto L31
                return r5
            L2a:
                java.lang.Object r2 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r7)
            L31:
                r1 = r6
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r0 = 0
                r6.L$0 = r0
                r6.label = r4
                java.lang.Object r0 = r2.emit(r7, r1)
                if (r0 != r5) goto L11
                return r5
            L40:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.C14271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T, R> Flow<R> flatMapConcat(final Flow<? extends T> flow, final Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt.flattenConcat(new Flow<Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function2 $transform$inlined;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Function2 function2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L52
                        r6 = r9
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r6 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        int r2 = r6.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r0 = r2 + r1
                        r2 = r2 | r1
                        int r0 = r0 - r2
                        if (r0 == 0) goto L52
                        int r0 = r6.label
                        int r0 = r0 - r1
                        r6.label = r0
                    L16:
                        java.lang.Object r1 = r6.result
                        java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r6.label
                        r4 = 2
                        r3 = 1
                        if (r0 == 0) goto L2c
                        if (r0 == r3) goto L3f
                        if (r0 != r4) goto L58
                        kotlin.ResultKt.throwOnFailure(r1)
                    L29:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L2c:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r2 = r7.$this_unsafeFlow
                        kotlin.jvm.functions.Function2 r0 = r7.$transform$inlined
                        r6.L$0 = r2
                        r6.label = r3
                        java.lang.Object r1 = r0.invoke(r8, r6)
                        if (r1 != r5) goto L3e
                        return r5
                    L3e:
                        goto L46
                    L3f:
                        java.lang.Object r2 = r6.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.ResultKt.throwOnFailure(r1)
                    L46:
                        r0 = 0
                        r6.L$0 = r0
                        r6.label = r4
                        java.lang.Object r0 = r2.emit(r1, r6)
                        if (r0 != r5) goto L29
                        return r5
                    L52:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r6 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                        r6.<init>(r9)
                        goto L16
                    L58:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, function2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt.transformLatest(flow, new AnonymousClass1(function2, null));
    }

    public static final <T, R> Flow<R> flatMapMerge(final Flow<? extends T> flow, int i2, final Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt.flattenMerge(new Flow<Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function2 $transform$inlined;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        int i2 = this.label;
                        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Function2 function2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L52
                        r6 = r9
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r6 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        int r2 = r6.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r0 = r2 + r1
                        r2 = r2 | r1
                        int r0 = r0 - r2
                        if (r0 == 0) goto L52
                        int r0 = r6.label
                        int r0 = r0 - r1
                        r6.label = r0
                    L16:
                        java.lang.Object r1 = r6.result
                        java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r6.label
                        r4 = 2
                        r3 = 1
                        if (r0 == 0) goto L2c
                        if (r0 == r3) goto L3f
                        if (r0 != r4) goto L58
                        kotlin.ResultKt.throwOnFailure(r1)
                    L29:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L2c:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r2 = r7.$this_unsafeFlow
                        kotlin.jvm.functions.Function2 r0 = r7.$transform$inlined
                        r6.L$0 = r2
                        r6.label = r3
                        java.lang.Object r1 = r0.invoke(r8, r6)
                        if (r1 != r5) goto L3e
                        return r5
                    L3e:
                        goto L46
                    L3f:
                        java.lang.Object r2 = r6.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.ResultKt.throwOnFailure(r1)
                    L46:
                        r0 = 0
                        r6.L$0 = r0
                        r6.label = r4
                        java.lang.Object r0 = r2.emit(r1, r6)
                        if (r0 != r5) goto L29
                        return r5
                    L52:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r6 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                        r6.<init>(r9)
                        goto L16
                    L58:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, function2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, i2);
    }

    public static /* synthetic */ Flow flatMapMerge$default(Flow flow, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = DEFAULT_CONCURRENCY;
        }
        return FlowKt.flatMapMerge(flow, i2, function2);
    }

    public static final <T> Flow<T> flattenConcat(final Flow<? extends Flow<? extends T>> flow) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
                Object objCollect = flow.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i2) {
        if (i2 > 0) {
            return i2 == 1 ? FlowKt.flattenConcat(flow) : new ChannelFlowMerge(flow, i2, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i2).toString());
    }

    public static /* synthetic */ Flow flattenMerge$default(Flow flow, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = DEFAULT_CONCURRENCY;
        }
        return FlowKt.flattenMerge(flow, i2);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return DEFAULT_CONCURRENCY;
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt.transformLatest(flow, new C14271(function2, null));
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt.merge(ArraysKt.asIterable(flowArr));
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new ChannelFlowTransformLatest(function3, flow, null, 0, null, 28, null);
    }
}
