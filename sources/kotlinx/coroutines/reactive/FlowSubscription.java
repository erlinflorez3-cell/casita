package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.CancellableKt;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&˛\bDZc|\u0004W\u00068\u000b<B\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:%c$\bCC٥\"}8\tWN}gvϺb\u000bQ\u0018\u000e\u0016~o4Ic\u007fe܈\u00157Xģg5SڎK8\u0011td\u0005P82:\n\u0005/\u001cXIP\"\u000bMY\u000f*6PrJRC˟3\u001e\"\u0012L%\u0019&lkTȤXl\u0014Ž])\u0013mPU?_^\u0005֔\u0011HZ0\u001b\u0001**9RO;%'c\u00035T\nNI?:I\u0013{?'YK:ɑtݼ\u0004\u0014#?\u0018\u0019k\b>\\3S'ϲe˦ScYdV.\u0006\u0011\u0014\rj\u0006T\u001aoV<D2f6\u0010cx\u0001kXP0w\t\u0014KuD\u001a=\u0006C-I\u001b\u001dϟ\u0010?OR\u000eޮ\u0007ڟ\"#\t͙qqb\u0013x\u001d+X}\u0383AQv׀vT@]\u0014Я\u0006Ͳf\u00022ʶ\u0001N\u000e:\u0014\u0011\\#{ڞ]\n8/x\u001aVTq\u0007\rpjci\u0001JV!\u001d%e8_ȴ\\\u0015p\u0013{hT\u0007=g۶(Τ\u000b}\u0010ʶا`\u0012"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0001\u0013\u0015Vs\u001f<@\u0006<c\u0010\u000eGj$,ZGFz8(\u001e>", "\"", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@\u000249c\u0007u", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", "", "4k^D", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "AtQ@V9BP\u0019\f", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@s%B/", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\b-97#.IAJoE\u001e#wn9\u0003k:\u0018d7DZL9`OrJix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0019 \u001eDnyB4\u001aP\t\u0015\tP~,7", "@d`BX:MS\u0018", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", ">q^1h*>`", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "1`]0X3EO(\u0003\u0005g\u0019|\u0015?e\u000e7{?", "", "1qT.g,\"\\\u001d\u000e~Z3Z\u00138t\u00041\f<\u0010\u001b!P", "4k^DC9HQ\u0019\r\tb5~", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1n]@h4>4 \t\r", "1`]0X3", "@d`BX:M", "<", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FlowSubscription<T> extends AbstractCoroutine<Unit> implements Subscription {
    private volatile boolean cancellationRequested;
    public final Flow<T> flow;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;
    public final Subscriber<? super T> subscriber;
    private static final /* synthetic */ AtomicLongFieldUpdater requested$volatile$FU = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater producer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowSubscription<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FlowSubscription<T> flowSubscription, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = flowSubscription;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.flowProcessing(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowSubscription(Flow<? extends T> flow, Subscriber<? super T> subscriber, CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.flow = flow;
        this.subscriber = subscriber;
        this.producer$volatile = createInitialContinuation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object consumeFlow(Continuation<? super Unit> continuation) {
        Object objCollect = this.flow.collect(new FlowCollector(this) { // from class: kotlinx.coroutines.reactive.FlowSubscription.consumeFlow.2
            final /* synthetic */ FlowSubscription<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t2, Continuation<? super Unit> continuation2) throws Throwable {
                this.this$0.subscriber.onNext(t2);
                if (FlowSubscription.getRequested$volatile$FU().decrementAndGet(this.this$0) > 0) {
                    JobKt.ensureActive(this.this$0.getCoroutineContext());
                    return Unit.INSTANCE;
                }
                FlowSubscription<T> flowSubscription = this.this$0;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation2), 1);
                cancellableContinuationImpl.initCancellability();
                FlowSubscription.getProducer$volatile$FU().set(flowSubscription, cancellableContinuationImpl);
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation2);
                }
                return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    private final Continuation<Unit> createInitialContinuation() {
        final CoroutineContext coroutineContext = getCoroutineContext();
        return new Continuation<Unit>() { // from class: kotlinx.coroutines.reactive.FlowSubscription$createInitialContinuation$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return coroutineContext;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) throws Throwable {
                CancellableKt.startCoroutineCancellable(new FlowSubscription$createInitialContinuation$1$1(this), this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object flowProcessing(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.FlowSubscription.AnonymousClass1
            if (r0 == 0) goto L25
            r3 = r6
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r3 = (kotlinx.coroutines.reactive.FlowSubscription.AnonymousClass1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L13:
            java.lang.Object r4 = r3.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L2f
            java.lang.Object r3 = r3.L$0
            kotlinx.coroutines.reactive.FlowSubscription r3 = (kotlinx.coroutines.reactive.FlowSubscription) r3
            goto L2b
        L25:
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r3 = new kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            r3.<init>(r5, r6)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L5a
            goto L46
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r4)
            r3.L$0 = r5     // Catch: java.lang.Throwable -> L57
            r3.label = r0     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r5.consumeFlow(r3)     // Catch: java.lang.Throwable -> L57
            if (r0 != r2) goto L45
            return r2
        L45:
            r3 = r5
        L46:
            org.reactivestreams.Subscriber<? super T> r0 = r3.subscriber     // Catch: java.lang.Throwable -> L4c
            r0.onComplete()     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r1 = move-exception
            kotlin.coroutines.CoroutineContext r0 = r3.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r1)
        L54:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L57:
            r2 = move-exception
            r3 = r5
            goto L5b
        L5a:
            r2 = move-exception
        L5b:
            boolean r0 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r0 != 0) goto L73
            r1 = r2
        L62:
            boolean r0 = r3.cancellationRequested
            if (r0 == 0) goto L78
            boolean r0 = r3.isActive()
            if (r0 != 0) goto L78
            java.util.concurrent.CancellationException r0 = r3.getCancellationException()
            if (r1 == r0) goto L89
            goto L78
        L73:
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r2)
            goto L62
        L78:
            org.reactivestreams.Subscriber<? super T> r0 = r3.subscriber     // Catch: java.lang.Throwable -> L7e
            r0.onError(r2)     // Catch: java.lang.Throwable -> L7e
            goto L89
        L7e:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r0)
            kotlin.coroutines.CoroutineContext r0 = r3.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
        L89:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.FlowSubscription.flowProcessing(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final /* synthetic */ long getAndUpdate$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        long j2;
        do {
            j2 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j2, function1.invoke(Long.valueOf(j2)).longValue()));
        return j2;
    }

    private final /* synthetic */ Object getProducer$volatile() {
        return this.producer$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getProducer$volatile$FU() {
        return producer$volatile$FU;
    }

    private final /* synthetic */ long getRequested$volatile() {
        return this.requested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getRequested$volatile$FU() {
        return requested$volatile$FU;
    }

    private final /* synthetic */ void setProducer$volatile(Object obj) {
        this.producer$volatile = obj;
    }

    private final /* synthetic */ void setRequested$volatile(long j2) {
        this.requested$volatile = j2;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public void cancel() {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        long j3;
        long j4;
        Continuation continuation;
        if (j2 <= 0) {
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = requested$volatile$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j4 = j3 + j2;
            if (j4 <= 0) {
                j4 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j4));
        if (j3 <= 0) {
            do {
                continuation = (Continuation) producer$volatile$FU.getAndSet(this, null);
            } while (continuation == null);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
    }
}
