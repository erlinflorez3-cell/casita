package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјnjO0LeN.ZS@\u000fs{:&c$\bCC٥\"}8\tWȞog|Jb\u000bY\u000f\u000e\u0016~j4Ic\u0005e܈\u0015˰Xģg5SڎK8\u0011zF\u000702h7(\u0005AY:X\u001ew\u0013O[\u0014\"6PrJRC˟3\u001c@\bN$\u000f!tg|:Xrc:=(\u001bipT7e6|[\u0014^TU\u0011\u0007g$+N?M\u0015S\\Ϋ\u000bTaI\u0011J:a\u0013t?-;K\u0004Wlݙ.\u0014E/]\u0012urTb5Un\u0013?+}g{T\u001c0\u0010z*\u0016\u0003\u0016V\u001a5UF3*h\u0018\u000eiο!apT\u0010mZ\u007f)q|+m\u001aA<Q\u001b\u0015c\u0012E']O\u0002\u0015\u000f.#7͙On\u001bת\u001fڠ\u001fT\u0006eyWNR`N8o\u0004\u007fT\tp\u0003B\u0010@O\u00105\f\u0013>\u0017[ڛ\n;Q#BȸJזkv\r\u009b9_wU`@Prlն,Á\u0010ZLߟʶog"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0015p\u00127VCBL;('PaF\tc\u0002", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0015p\u00127VCBL;('>", "4k^D", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "1n]0h9KS\"|\u000f", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b=d&A|\u001d2V\r9uA(%weB\u0007qu,\u00014Q\\]0eRPG\u001d!Z!]\u0001pk_K3uH@2Q*S\u000fEx\u0010\u0010\u001f\u000eC4nER\u0019Py\u001c\u0004\u000b\u0006xGZ_\u00071REo+k\u0016qr +", "1qT.g,", ">q^1h*>7!\n\u0002", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n[9X*MB#", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n f\b\u001fGk\u0016;;AEv4s{nkH\u000eg5\u0018t1TV^;`[rK]od\u0017]/\u0016\u0015UP(xM\rbn1E\u001372\b\b\u001f\u0010~TmGV\u000eVO", "/cS6g0H\\\u0015\u0006ih\u001a\f\u00163n\u0002\u0013\tJ\f%", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    private final int concurrency;
    private final Flow<Flow<T>> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ SendingCollector<T> $collector;
        final /* synthetic */ Job $job;
        final /* synthetic */ ProducerScope<T> $scope;
        final /* synthetic */ Semaphore $semaphore;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SendingCollector<T> $collector;
            final /* synthetic */ Flow<T> $inner;
            final /* synthetic */ Semaphore $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, Semaphore semaphore, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$inner = flow;
                this.$collector = sendingCollector;
                this.$semaphore = semaphore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$inner.collect(this.$collector, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.$semaphore.release();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.$semaphore.release();
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Job job, Semaphore semaphore, ProducerScope<? super T> producerScope, SendingCollector<T> sendingCollector) {
            this.$job = job;
            this.$semaphore = semaphore;
            this.$scope = producerScope;
            this.$collector = sendingCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((Flow) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                if (r0 == 0) goto L62
                r4 = r10
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r4 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = r2 + r1
                r2 = r2 | r1
                int r0 = r0 - r2
                if (r0 == 0) goto L62
                int r0 = r4.label
                int r0 = r0 - r1
                r4.label = r0
            L16:
                java.lang.Object r3 = r4.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L47
                if (r0 != r1) goto L68
                java.lang.Object r9 = r4.L$1
                kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
                java.lang.Object r0 = r4.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2) r0
                kotlin.ResultKt.throwOnFailure(r3)
            L2e:
                kotlinx.coroutines.channels.ProducerScope<T> r2 = r0.$scope
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r0.$collector
                kotlinx.coroutines.sync.Semaphore r0 = r0.$semaphore
                r4 = 0
                r5.<init>(r9, r1, r0, r4)
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                r6 = 3
                r7 = 0
                r3 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L47:
                kotlin.ResultKt.throwOnFailure(r3)
                kotlinx.coroutines.Job r0 = r8.$job
                if (r0 == 0) goto L51
                kotlinx.coroutines.JobKt.ensureActive(r0)
            L51:
                kotlinx.coroutines.sync.Semaphore r0 = r8.$semaphore
                r4.L$0 = r8
                r4.L$1 = r9
                r4.label = r1
                java.lang.Object r0 = r0.acquire(r4)
                if (r0 != r2) goto L60
                return r2
            L60:
                r0 = r8
                goto L2e
            L62:
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                r4.<init>(r8, r10)
                goto L16
            L68:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.emit(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(Flow<? extends Flow<? extends T>> flow, int i2, CoroutineContext coroutineContext, int i3, BufferOverflow bufferOverflow) {
        super(coroutineContext, i3, bufferOverflow);
        this.flow = flow;
        this.concurrency = i2;
    }

    public /* synthetic */ ChannelFlowMerge(Flow flow, int i2, CoroutineContext coroutineContext, int i3, BufferOverflow bufferOverflow, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, i2, (-1) - (((-1) - i4) | ((-1) - 4)) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (8 & i4) != 0 ? -2 : i3, (i4 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        Object objCollect = this.flow.collect(new AnonymousClass2((Job) continuation.getContext().get(Job.Key), SemaphoreKt.Semaphore$default(this.concurrency, 0, 2, null), producerScope, new SendingCollector(producerScope)), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow<T> create(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.flow, this.concurrency, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce(coroutineScope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }
}
