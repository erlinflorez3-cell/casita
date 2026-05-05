package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bDJc|\u0004W\u00068\u000bDB\u0007\":\u0013\u007f\u0007|jA0JeP.hS2\u000fy{<$iҕyCQU\"}(\nWNunvϺb\u000bY\u000f\u000e\u0016\u0007s4I[xe\u0012%2JoE8UoS9ht<\b8\u00160\u0600\u0012\u000b\u0011\u001c:HVv)Bk\u000e\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l\u001f1^jhfrNkmB?)\u0013kRNm_^\u007f]\u001eVcU\u0011țe(1EG;\u001b+c\u0005\rX\u0002F\u0013G\u0002C\u0015j7'YR\"_F\\\u0010\u0016+*}\u0017\ft͉`\u0005WkВ++]oc/\u001c5\u0010\u0001\f\u000fL\u0004T\u0006UGN/ Ǒ\u0016\u000e[z\u0003UPPH^p~+g<\u00173\u000eK+g*\u0017\u0003g;'^O'\u000b\f.4\u0011}O_ڍ\u0012j\u001b d}W7aBCNt\u0011iE}\n\u0001d\u0012*2Bu\b?\u007f!0-$eeg4\u074co\u0002VW\u007fo\u0013t\u0001YyTX@hnD6J\u000b\u0012ɮRd-q`Vh,WMJS7S\u0016#8.};1- T_jyj\u0014]8(?wGh\u001doް[Cd8EWi\u0016qT|\u001aeCr\u0016hupb۱^f.'BNp\u0016\b}JT2)BG\u0002\"D.A\u0019\u000b'v\u000b.FQ~\u001f^\tr>\u0014Ձ7$\tt˨x\t\u000fgt\u001d}\u007f\u0011KB{\u000f&MCWځ'&}(x6\r#M~\"~wqZ`dr&we{f\u0016H<\u0018Ǿ{т\u0013~7L\u001aDSg\u000be\u007f_:')\u0001*\u0013I\u0005Fg6\b7,߯nJUr/;\u0005}\u000b#6v(y\u0010J+Mqt#]TH!\u0007 <ҡ<|\u000b@ǰ)#"}, d2 = {"1`c0[", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\u000biUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "@dc?l", "@dc?\\,L", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b>d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F`g\u001etT5\u001c\f]J78BA,\u0012<X\u0006Dh\u000fU\u0017\u0015?|:#]\u001aYO", "@dc?l\u001eAS\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "/sc2`7M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\fiUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "1`c0[\u0010F^ ", "1n[9X*M]&", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdPG\u001b\u0019Z\f]5\u001aZ@G.}K;(Q*S\u000fEx\u0010\u0010\u001f\u000eC4NL_\u001fK\u0003%qP-rO/#`L=V^sk\bh\u001f&$7)\u0014o(p", "7r2.a*>Z z\nb6\u0006f+u\u000e(", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "7r2.a*>Z z\nb6\u0006f+u\u000e(:!\b!)-~\b6V2Bc\u000b.\u001d|", "7rB.`,\u001ef\u0017~\u0006m0\u0007\u0012\u000bs", "=sW2e", "7rB.`,\u001ef\u0017~\u0006m0\u0007\u0012\u000bs>\t\u0003J\u0013|&AimI\u0004/Bgc/", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__ErrorsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return FlowKt.catchImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ Ref.ObjectRef<Throwable> $fromDownstream;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(FlowCollector<? super T> flowCollector, Ref.ObjectRef<Throwable> objectRef) {
            this.$collector = flowCollector;
            this.$fromDownstream = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                if (r0 == 0) goto L25
                r4 = r7
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r4
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
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L37
                if (r0 != r1) goto L2f
                java.lang.Object r0 = r4.L$0
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass2) r0
                goto L2b
            L25:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                r4.<init>(r5, r7)
                goto L13
            L2b:
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L4d
                goto L47
            L2f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L37:
                kotlin.ResultKt.throwOnFailure(r3)
                kotlinx.coroutines.flow.FlowCollector<T> r0 = r5.$collector     // Catch: java.lang.Throwable -> L4a
                r4.L$0 = r5     // Catch: java.lang.Throwable -> L4a
                r4.label = r1     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r0 = r0.emit(r6, r4)     // Catch: java.lang.Throwable -> L4a
                if (r0 != r2) goto L47
                return r2
            L47:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L4a:
                r1 = move-exception
                r0 = r5
                goto L4e
            L4d:
                r1 = move-exception
            L4e:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r0 = r0.$fromDownstream
                r0.element = r1
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,r\bӵLc\u0003\u0005I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015iiCRe`=\u0001T֖\u0013u\u000264a*tS=[ $&OW"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14251 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        int label;

        C14251(Continuation<? super C14251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
            return ((C14251) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d̉=!,r\bӵLc\u000b\u0004Iي8\u000b<C\u0007\"B\u0012\u007f\u0007ljA0RlV\u008cjSX\u000e\f}:ři$\u001aIKW*}h\t}O\u0018z|Lr\u001aq\u0012و\u001a\u0003p0Y[~b\"\u00118H\u0016Ac`}CQo#=ӯ$<(<\n\u000b\u0007\u001f:J\u0016|!I\u0012\u0014"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "1`d@X", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/sc2`7M", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3<T> extends SuspendLambda implements Function4<FlowCollector<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super AnonymousClass3> continuation) {
            super(4, continuation);
            this.$retries = j2;
            this.$predicate = function2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l2, Continuation<? super Boolean> continuation) {
            return invoke((FlowCollector) obj, th, l2.longValue(), continuation);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, long j2, Continuation<? super Boolean> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$retries, this.$predicate, continuation);
            anonymousClass3.L$0 = th;
            anonymousClass3.J$0 = j2;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                if (this.J$0 < this.$retries) {
                    Function2<Throwable, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                    this.label = 1;
                    obj = function2.invoke(th, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(z);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z2 = ((Boolean) obj).booleanValue();
            return Boxing.boxBoolean(z2);
        }
    }

    /* JADX INFO: renamed from: catch */
    public static final <T> Flow<T> m10533catch(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlin.coroutines.Continuation<? super java.lang.Throwable> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1
            if (r0 == 0) goto L25
            r5 = r8
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 != r2) goto L2f
            java.lang.Object r1 = r5.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            goto L2b
        L25:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r5 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r5.<init>(r8)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L55
            goto L51
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L53
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0     // Catch: java.lang.Throwable -> L53
            r5.L$0 = r1     // Catch: java.lang.Throwable -> L53
            r5.label = r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r6.collect(r0, r5)     // Catch: java.lang.Throwable -> L53
            if (r0 != r3) goto L51
            return r3
        L51:
            r0 = 0
            return r0
        L53:
            r2 = move-exception
            goto L56
        L55:
            r2 = move-exception
        L56:
            T r1 = r1.element
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r0 = isSameExceptionAs$FlowKt__ErrorsKt(r2, r1)
            if (r0 != 0) goto L79
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            boolean r0 = isCancellationCause$FlowKt__ErrorsKt(r2, r0)
            if (r0 != 0) goto L79
            if (r1 != 0) goto L6d
            return r2
        L6d:
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L75
            kotlin.ExceptionsKt.addSuppressed(r1, r2)
            throw r1
        L75:
            kotlin.ExceptionsKt.addSuppressed(r2, r1)
            throw r2
        L79:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th, CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th, job.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (DebugKt.getRECOVER_STACK_TRACES()) {
                th2 = StackTraceRecoveryKt.unwrapImpl(th2);
            }
            if (DebugKt.getRECOVER_STACK_TRACES()) {
                th = StackTraceRecoveryKt.unwrapImpl(th);
            }
            if (Intrinsics.areEqual(th2, th)) {
                return true;
            }
        }
        return false;
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        if (j2 > 0) {
            return FlowKt.retryWhen(flow, new AnonymousClass3(j2, function2, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j2).toString());
    }

    public static /* synthetic */ Flow retry$default(Flow flow, long j2, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            function2 = new C14251(null);
        }
        return FlowKt.retry(flow, j2, function2);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, Function4<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(flow, function4);
    }
}
