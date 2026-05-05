package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import org.reactivestreams.Publisher;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDRш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4Zݷ2\u000f\u0002{<$a&yCI\\\"}(\fWNugvϺb\u000bY\u000f\u000e\u0016~o4Ikxe\u0012\u00152HoU\u074cuuCʠns^\u0005N2R>\n\u0007\u0011\u001apG>w;t[\u0016 2XvJT\u001dM;܅@\tN&\u0007\u001ejkf6vqm@5#\u0011oZNUf@\u0003S\rT\\?\r%jӿ/B=?#0\u001c'\u0015^sE\u0013A\u0002=;ؒU([M\u0002[NX.\u0019E/]\u0013urTc5Un\u0014?+}l\u0012bVB\u0006\u000e\u0014\rj\u0018>\u00105]F3*h\u0018\u000eiο!i\u0007Ч@ެF\u007f\tx~13\u0018K+g/\u0017[oP1TG}\u0015\rTŀ/\u0005gſ\u0013\u05f8d\u0015)k@s?jX=vb:]K\b\u001cp\u0011\u0007Z\u000e>\\\u00185\f\u0013>\u0017[ڛ\nOiܬ*ɘLDu\u0012Mzvo\u0002RvTRx$TB\u000f\u001c\\Td;ߘ~r\u001f¡Oܖ T\u0015\u001dX%.^\u0010B1' N\u0006Ŗ\u0018m$έ\fɻ3f?ժ?\u0004\u001cdQ^aC\b$fУTλ\u0018ILd\u000bgtRk\u000e`m64ĞL\u000b"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0001\u0013\u0015Vs\u001f<@\u0010EV\u0005$Ep\u0016;)Q\u001cr>0j", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0015p\u00127VCBL;('>", ">tQ9\\:AS&", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nk'\u0014Ns\u001c?v2\u000b", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "\nh]6g\u0005", "uK^?ZuKS\u0015|\nb=|\u0017>r\u007f$\u0004NJ\u0002'Dv\u0012Jy%B/d&A|\u001d2V\r9uA(%weB\u0007qu,\u00014Q\\]0eRPG\u001d!Z!]\u0001pk_K3uH@2Q*S\u000fEx\u0010\u0010\u001f\u000eC4nER\u0019Py\u001c\u0004\u000b\u0006xGZ_\u00071REo+k\u0016qr +", "1qT.g,", "@d`BX:MA\u001d\u0014z", "", "5dc\u001fX8NS'\u000ehbA|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc\u001fX8NS'\u000ehbA|", "u(9", "1n[9X*M", "", "1n[9X*M]&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|F#\u0016c\u001eJ:\u0011\u000fb\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "1n[9X*MA \t\rI(\f\f", "1n[9X*M7!\n\u0002", "7mY2V;\u001c]\"\u000ezq;", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'(2_C\u0014m<]z0GZ\u0018-c\\\u0005\u0007t\u0019d ,5\u0014\fY?3xQ\r\u0006\u000e6X\t?qJ\n \u001b?z\u007fF_\u0010UCr\u007fJ8lOi[\tKKN8mK\u0011[.X\u0004A \u001dsb\u0005eU.\b\u000b)", "1n[9X*MB#", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n f\b\u001fGk\u0016;;AEv4s{nkH\u000eg5\u0018t1TV^;`[rK]od\u0017]/\u0016\u0015UP(xM\rbn1E\u001372\b\b\u001f\u0010~TmGV\u000eVO", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class PublisherAsFlow<T> extends ChannelFlow<T> {
    private final Publisher<T> publisher;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PublisherAsFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PublisherAsFlow<T> publisherAsFlow, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = publisherAsFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.collectImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FlowCollector<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PublisherAsFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(FlowCollector<? super T> flowCollector, PublisherAsFlow<T> publisherAsFlow, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$collector = flowCollector;
            this.this$0 = publisherAsFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector<T> flowCollector = this.$collector;
                PublisherAsFlow<T> publisherAsFlow = this.this$0;
                this.label = 1;
                if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, publisherAsFlow.produceImpl(CoroutineScopeKt.plus(coroutineScope, publisherAsFlow.context)), this) == coroutine_suspended) {
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

    public PublisherAsFlow(Publisher<T> publisher, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.publisher = publisher;
    }

    public /* synthetic */ PublisherAsFlow(Publisher publisher, EmptyCoroutineContext emptyCoroutineContext, int i2, BufferOverflow bufferOverflow, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(publisher, (i3 + 2) - (2 | i3) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? -2 : i2, (i3 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #0 {all -> 0x00bd, blocks: (B:13:0x0040, B:28:0x00ac, B:30:0x00b7, B:19:0x007b, B:25:0x0094, B:17:0x005a), top: B:36:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:13:0x0040, B:28:0x00ac, B:30:0x00b7, B:19:0x007b, B:25:0x0094, B:17:0x005a), top: B:36:0x0025 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:28:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collectImpl(kotlin.coroutines.CoroutineContext r14, kotlinx.coroutines.flow.FlowCollector<? super T> r15, kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            r13 = this;
            r10 = r13
            r3 = r16
            boolean r0 = r3 instanceof kotlinx.coroutines.reactive.PublisherAsFlow.AnonymousClass1
            if (r0 == 0) goto L3a
            r9 = r3
            kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 r9 = (kotlinx.coroutines.reactive.PublisherAsFlow.AnonymousClass1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L3a
            int r0 = r9.label
            int r0 = r0 - r1
            r9.label = r0
        L19:
            java.lang.Object r1 = r9.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            r11 = 0
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L5e
            if (r0 == r6) goto L4c
            if (r0 != r7) goto L44
            long r3 = r9.J$0
            java.lang.Object r5 = r9.L$2
            kotlinx.coroutines.reactive.ReactiveSubscriber r5 = (kotlinx.coroutines.reactive.ReactiveSubscriber) r5
            java.lang.Object r15 = r9.L$1
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.reactive.PublisherAsFlow r10 = (kotlinx.coroutines.reactive.PublisherAsFlow) r10
            goto L40
        L3a:
            kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 r9 = new kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1
            r9.<init>(r10, r3)
            goto L19
        L40:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> Lbd
            goto Lac
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4c:
            long r3 = r9.J$0
            java.lang.Object r5 = r9.L$2
            kotlinx.coroutines.reactive.ReactiveSubscriber r5 = (kotlinx.coroutines.reactive.ReactiveSubscriber) r5
            java.lang.Object r15 = r9.L$1
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.reactive.PublisherAsFlow r10 = (kotlinx.coroutines.reactive.PublisherAsFlow) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> Lbd
            goto L8c
        L5e:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.reactive.ReactiveSubscriber r5 = new kotlinx.coroutines.reactive.ReactiveSubscriber
            int r3 = r10.capacity
            kotlinx.coroutines.channels.BufferOverflow r2 = r10.onBufferOverflow
            long r0 = r13.getRequestSize()
            r5.<init>(r3, r2, r0)
            org.reactivestreams.Publisher<T> r0 = r10.publisher
            org.reactivestreams.Publisher r1 = kotlinx.coroutines.reactive.ReactiveFlowKt.injectCoroutineContext(r0, r14)
            r0 = r5
            org.reactivestreams.Subscriber r0 = (org.reactivestreams.Subscriber) r0
            r1.subscribe(r0)
            r3 = r11
        L7b:
            r9.L$0 = r10     // Catch: java.lang.Throwable -> Lbd
            r9.L$1 = r15     // Catch: java.lang.Throwable -> Lbd
            r9.L$2 = r5     // Catch: java.lang.Throwable -> Lbd
            r9.J$0 = r3     // Catch: java.lang.Throwable -> Lbd
            r9.label = r6     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r1 = r5.takeNextOrNull(r9)     // Catch: java.lang.Throwable -> Lbd
            if (r1 != r8) goto L8c
            return r8
        L8c:
            if (r1 != 0) goto L94
            r5.cancel()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L94:
            kotlin.coroutines.CoroutineContext r0 = r9.getContext()     // Catch: java.lang.Throwable -> Lbd
            kotlinx.coroutines.JobKt.ensureActive(r0)     // Catch: java.lang.Throwable -> Lbd
            r9.L$0 = r10     // Catch: java.lang.Throwable -> Lbd
            r9.L$1 = r15     // Catch: java.lang.Throwable -> Lbd
            r9.L$2 = r5     // Catch: java.lang.Throwable -> Lbd
            r9.J$0 = r3     // Catch: java.lang.Throwable -> Lbd
            r9.label = r7     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r15.emit(r1, r9)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r8) goto Lac
            goto Lbc
        Lac:
            r0 = 1
            long r3 = r3 + r0
            long r1 = r10.getRequestSize()     // Catch: java.lang.Throwable -> Lbd
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbb
            r5.makeRequest()     // Catch: java.lang.Throwable -> Lbd
            r3 = r11
        Lbb:
            goto L7b
        Lbc:
            return r8
        Lbd:
            r0 = move-exception
            r5.cancel()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherAsFlow.collectImpl(kotlin.coroutines.CoroutineContext, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectSlowPath(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(flowCollector, this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    private final long getRequestSize() {
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i2 = this.capacity;
        if (i2 == -2) {
            return Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core();
        }
        if (i2 == 0) {
            return 1L;
        }
        if (i2 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j2 = this.capacity;
        if (j2 >= 1) {
            return j2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static /* synthetic */ void getRequestSize$annotations() {
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        CoroutineContext context = continuation.getContext();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) this.context.get(ContinuationInterceptor.Key);
        if (continuationInterceptor == null || Intrinsics.areEqual(continuationInterceptor, context.get(ContinuationInterceptor.Key))) {
            Object objCollectImpl = collectImpl(context.plus(this.context), flowCollector, continuation);
            return objCollectImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectImpl : Unit.INSTANCE;
        }
        Object objCollectSlowPath = collectSlowPath(flowCollector, continuation);
        return objCollectSlowPath == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectSlowPath : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        Object objCollectImpl = collectImpl(producerScope.getCoroutineContext(), new SendingCollector(producerScope.getChannel()), continuation);
        return objCollectImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectImpl : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow<T> create(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new PublisherAsFlow(this.publisher, coroutineContext, i2, bufferOverflow);
    }
}
