package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;
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
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bDJc|\u0004O\r8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?7Le^.ZS8\u000fs{J$c$wHSy(Ԃ:\u000f_Pwg5J\t\nc\u0011\fǝ\u0007jTOezm\u0012U2pno7[pU9\u000fv|\n8b0\u0600\u0012\u000b\u0011\u001c:HVv)Bk\u000e\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l\u001f1.jhfBXnm:u#\u0013kRNUa^\u007f\u0014\u0012^\u007f5˙\u000fg.-P7{\u0015SR#\tX¹M\u0003gwM\u0007x'm+wr\b:f\u0004,\u0015YTSbę*^\u000bWn\u0013?`]ҪcV\u001e*\bzB\rj\u0003.\b-Ξ<-Bl\u0018\u0010Ct9SnO2nP\u0004\u0013mF\u00195\u007fy+I\u001dvQ\u0010@GQ}\u0001˿\u0011\u001e)\t\u0007Vi]&f%\u001ddw\u00181\u007f?]JTˣg=\u0016\n\u0001d\u0012*J0u~_\f\u001f8/1G]I#gk\u0012JTg%\u0007\u000fk\u001aiʐL@(y.[8\u0015$`Tf\u0015k\u0017T\u0007+1O\"\u0381\u0015}0\u00190^\b<g%>M\u007flwwe]8'ukOq|y&]I`C5\u007fs>pzvBPlf\u0013j~B\u0002\u000e!٢@M@T\u0003\u0016\b}TNR\u0013`>\u0012\u001e:ι?\u0019\u0005\u001bX\u0005.B\b|7^\u000bl\u001e\u0012l3R\b0)ڲ\r\u0003Vp~v\u007f$W0\u0015f2/QQ{\u0019TTBj:ê1\u0007'y\u0010IwL\u000eL\u001b\u0015&Y\n$.\u001agVuBт\u0013\u0001/G\u00104]w\u0001{iS\")\u000b|@\u000figNi\u000eξ~,\tpZQd\u0017hv\rqS\fr\u0004\u0012at\u007f\u000ecӝ\u000f]D`\u0001\n˄@f"}, d2 = {"2dQ<h5<S", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", "Bh\\2b<M;\u001d\u0006\u0002b:", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Bh\\2b<M", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "2dQ<h5<S`a\\)<Ol\u000f", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b>A\u0007=w%5QLN52(\"rqH\u000bl,\\@(NV`u=Y|Oi", "2dQ<h5<Sw\u000f\bZ;\u0001\u00138", "2dQ<h5<S|\b\n^9\u0006\u00056", "Bh\\2b<M;\u001d\u0006\u0002b:j\t6e}7\u0006M", "2dQ<h5<S|\b\n^9\u0006\u00056$`/\u0006Rf&\u0011AN\u000eCr9\u001bh", "A`\\=_,", ">da6b+&W \u0006~l", "4hg2W\u0017>`\u001d\tyM0z\u000f/r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2d[.l\u0014BZ \u0003\t", ">da6b+", "A`\\=_,\u00066zI\u000b1\u0010\\", "Bh\\2b<M\u001b{`En~`h", "Bh\\2b<M7\"\u000ezk5x\u0010", "Bh\\2b<M7\"\u000ezk5x\u0010vHar\f\u0013dvU(v\u0018N\\4/S\\ >i*\u0014\\", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVH\u000f$<\u0012&\u0006\u0015j\u007f8"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delayMillis = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayMillis, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Unit> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:8:0x0018). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.label
                r5 = 3
                r4 = 2
                r7 = 1
                if (r0 == 0) goto L43
                if (r0 == r7) goto L11
                if (r0 == r4) goto L2c
                if (r0 != r5) goto L5a
            L11:
                java.lang.Object r3 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
            L18:
                kotlinx.coroutines.channels.SendChannel r2 = r3.getChannel()
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.L$0 = r3
                r8.label = r4
                java.lang.Object r0 = r2.send(r1, r0)
                if (r0 != r6) goto L33
                return r6
            L2c:
                java.lang.Object r3 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
            L33:
                long r1 = r8.$delayMillis
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.L$0 = r3
                r8.label = r5
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r1, r0)
                if (r0 != r6) goto L18
                return r6
            L43:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r3 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                long r0 = r8.$delayMillis
                r2 = r8
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r8.L$0 = r3
                r8.label = r7
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r2)
                if (r0 != r6) goto L18
                return r6
            L5a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\rӬD\u0012&\u0006\u0007l?ӄRep.\u0001TZ\u0019y}L*k&\u0002C\u0002UH\u0001h\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2nf;f;KS\u0015\u0007", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<T> extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ Flow<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(long j2, Flow<? extends T> flow, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.$periodMillis = j2;
            this.$this_sample = flow;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$periodMillis, this.$this_sample, continuation);
            anonymousClass2.L$0 = coroutineScope;
            anonymousClass2.L$1 = flowCollector;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            ReceiveChannel receiveChannelProduce$default;
            Ref.ObjectRef objectRef;
            ReceiveChannel<Unit> receiveChannelFixedPeriodTicker;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                flowCollector = (FlowCollector) this.L$1;
                receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
                objectRef = new Ref.ObjectRef();
                receiveChannelFixedPeriodTicker = FlowKt.fixedPeriodTicker(coroutineScope, this.$periodMillis);
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannelFixedPeriodTicker = (ReceiveChannel) this.L$3;
                objectRef = (Ref.ObjectRef) this.L$2;
                receiveChannelProduce$default = (ReceiveChannel) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (objectRef.element != NullSurrogateKt.DONE) {
                SelectImplementation selectImplementation = new SelectImplementation(getContext());
                SelectImplementation selectImplementation2 = selectImplementation;
                selectImplementation2.invoke(receiveChannelProduce$default.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannelFixedPeriodTicker, null));
                selectImplementation2.invoke(receiveChannelFixedPeriodTicker.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(objectRef, flowCollector, null));
                this.L$0 = flowCollector;
                this.L$1 = receiveChannelProduce$default;
                this.L$2 = objectRef;
                this.L$3 = receiveChannelFixedPeriodTicker;
                this.label = 1;
                if (selectImplementation.doSelect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(FlowKt__DelayKt.debounce$lambda$1$FlowKt__DelayKt(j2, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j2, Object obj) {
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(Function1 function1, Object obj) {
        return DelayKt.m10473toDelayMillisLRDsOJo(((Duration) function1.invoke(obj)).m10361unboximpl());
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m10525debounceHG0u8IE(Flow<? extends T> flow, long j2) {
        return FlowKt.debounce(flow, DelayKt.m10473toDelayMillisLRDsOJo(j2));
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final Function1<? super T, Duration> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, new Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(FlowKt__DelayKt.debounce$lambda$2$FlowKt__DelayKt(function1, obj));
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(function1, flow, null));
    }

    public static final ReceiveChannel<Unit> fixedPeriodTicker(CoroutineScope coroutineScope, long j2) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new AnonymousClass1(j2, null), 1, null);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j2) {
        if (j2 > 0) {
            return FlowCoroutineKt.scopedFlow(new AnonymousClass2(j2, flow, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m10526sampleHG0u8IE(Flow<? extends T> flow, long j2) {
        return FlowKt.sample(flow, DelayKt.m10473toDelayMillisLRDsOJo(j2));
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m10527timeoutHG0u8IE(Flow<? extends T> flow, long j2) {
        return m10528timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j2);
    }

    /* JADX INFO: renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m10528timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j2) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j2, flow, null));
    }
}
