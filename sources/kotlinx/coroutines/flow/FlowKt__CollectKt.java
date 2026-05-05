package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawLittleEndian64(CodedInputStream.java:823)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:238)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:368)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:327)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:474)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:469)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readMessage(CodedInputStream.java:507)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:121)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,i\bDZc|\u0004G\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.hS2\u000fy\u0002<$q$yCAV\"}8\tWNu˧vJ`\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172HpWG[ڎU9\u000fs^\t02(9(\u0005GɤhН\u0014v\tDc( 2XphU-O\u000b܅ \nf&\u0011 lg\u0015:vl\u000e>=(\u001bipT?F>\u0004e\rtSG\u000f|ѭ,/h=E\u00175SI\u000b\u0001[oIEsK\r\u0001g-*Y\u0005gE\u0007\nЏ\u00195U\u0018mx,h\u0015Sf\u0012M8_t[_T,Þ~\u0006\u0013G\u0014\u0014\f3X03 \r\u0016\u001e;\u0005xcB`\u0002\rA.\nq:''\u00162YIIo\u0018Ĭ\u0002ϭR7\n\u0016%m1\u0013\u0007!\nS.b\u001bÑb{y7aBMH\u0015\u000e\b=\u001e3~j\u001aU\n/W\u0011?\u000bW2ϲ)AaD3'q\u000eXFm|+nx[yXXB2nD6X\u0018\u001c^Tf\u001bj~d\u0007?WۺZΤ\u000b}\u0016'8\u0007\u0006Q9%>MojoҔ[a2+?hGY5o<mihALii cbvZCjbK֡%͞W\fht@s@ʋ\u0003\u0010&zdP\u0012Ǝ@C\u001a\"D.A\u0019#\u0019v\u0003NsG~\u0017gr\u0014\u0016}dD4\u00120(ڲ\r\u000bVg\u0001um\u0005Y.\u0003fH;QYE\u001f6W2hb{Q\u0016\u000fw\u0010I}Ku\\\u001b)<ɥB°\u001a\u001aGeȦA,"}, d2 = {"1n[9X*M", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017AEx>.$lj9\u0015-\nX\u007f6KU^(kV|FiUA\u0013J<\tN`=-p\u000e!\u001c\r,G\u0011\u0011", ":`d;V/\"\\", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\"", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n[9X*M7\"}zq,{", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "D`[BX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\u000bix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", "1n[9X*M:\u0015\u000ezl;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", "3lXA43E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "4k^D", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001cljLPa6[\u00017VPW,j\u001csD\u001e$$nU5\u001fZ@G.}K;(Q*S\u000fEx\u0010\u0010\u001f\u000eC4NL_\u001fK\u0003%qP-rO/#`L=V^sk\bh\u001f&$7)\u0014o(p", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0015\u001d̉=!4i\bӵLc\u0003\u0004I\u00066\fVAչ(4(Մ7lz;@D\u001c߉\\Q\u001c>\u001dk\u00144R\\TuQ=m\u001a4̝OѾ\r˗knX]ŸG\u0013"}, d2 = {"9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/S[*>t\u0016,\\)J*2(\u001coa7\u0016\"y", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "3lXA", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass3<T> implements FlowCollector<T> {
        final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
            this.$action = function2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t2, Continuation<? super Unit> continuation) {
            Object objInvoke = this.$action.invoke(t2, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }

        public Object emit$$forInline(T t2, final Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
                    return this.this$0.emit(null, this);
                }
            };
            InlineMarker.mark(5);
            this.$action.invoke(t2, continuation);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\nIي8\u000b<B\u0007\"2\u0013 \u0006߿pAFǏ\u0016N>Tc*Eӆ*3lo2s[;\u0004\u001d.&\u0017Sfg\u001eñ\u0011ҰIß\u0013\u0006$};8WU\u0011]@\u0010\tԒ{У7Mwމˉdz"}, d2 = {"9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/S[*>t\u0016,\\)J*2(\u001coa7\u0016G5Mv:GK\rx", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7mS2k", "", "3lXA", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<T> implements FlowCollector<T> {
        final /* synthetic */ Function3<Integer, T, Continuation<? super Unit>, Object> $action;
        private int index;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
            this.$action = function3;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t2, Continuation<? super Unit> continuation) {
            Function3<Integer, T, Continuation<? super Unit>, Object> function3 = this.$action;
            int i2 = this.index;
            this.index = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = function3.invoke(Boxing.boxInt(i2), t2, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }

        public Object emit$$forInline(T t2, final Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
                    return this.this$0.emit(null, this);
                }
            };
            InlineMarker.mark(5);
            Function3<Integer, T, Continuation<? super Unit>, Object> function3 = this.$action;
            int i2 = this.index;
            this.index = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            function3.invoke(Integer.valueOf(i2), t2, continuation);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Flow<? extends T> flow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_launchIn = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_launchIn, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collect(this.$this_launchIn, this) == coroutine_suspended) {
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
    }

    public static final Object collect(Flow<?> flow, Continuation<? super Unit> continuation) {
        Object objCollect = flow.collect(NopCollector.INSTANCE, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005G~@\tu'[k\u0007+\n]%-beN\u00123\u000e|%\u0012\u000eO\u0003r\u000e^\u0017&iZh\u00028+V")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T> Object collect(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objCollect = flow.collect(new AnonymousClass3(function2), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005G~@\tu'[k\u0007+\n]%-beN\u00123\u000e|%\u0012\u000eO\u0003r\u000e^\u0017&iZh\u00028+V")
    @InterfaceC1492Gx
    private static final /* synthetic */ <T> Object collect$$forInline(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(function2);
        InlineMarker.mark(0);
        flow.collect(anonymousClass3, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objCollect = flow.collect(new AnonymousClass2(function3), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function3);
        InlineMarker.mark(0);
        flow.collect(anonymousClass2, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, function2), 0, null, 2, null), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, Continuation<? super Unit> continuation) {
        FlowKt.ensureActive(flowCollector);
        Object objCollect = flow.collect(flowCollector, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flow, null), 3, null);
    }
}
