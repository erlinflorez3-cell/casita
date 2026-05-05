package kotlinx.coroutines.rx2;

import io.reactivex.ObservableEmitter;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
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
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&˛\bDRш|\u0004W\u00068\u000b<B\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq|<$q$yCAV\"}8\tWȞog|Sb\u000bI\u0010\u000e\u0016\u0007k4կ]xk\u0011\u0017˰JoU3UڎE9vt>ӌ(288\u0002\u0005\u0007\u001e2H&v\u0003CQ\u000e\u001a0VpBR\u0013[\u000b\u001a(ßf&\u0007Ȧjfv6vl\u000e@?%\u0013ipPU``\u0003]\u000fVTm\f%d^FP;C\u0019=S1\fbeM\tWwM\u0007x']Ǣwzɱ:Z\u0006\u001c#4\u0018\u001dk\u0006>\\3b\u0011\u00125?geaO<=>\u000fD)J\u001a&\u0006U_^?(~ \u001cCx\u0003UVO0sR\u0002\u000bad\u0019S\u0019y?\u00027tsy;GPg\u0004\u001306'\u0011n'\\\u00032\u0011\u001b)y\u0010SGPn=\u000fNRuK\u0014\u001crx\u0001X\u0004`M\u000eT\u0014\u0013D\u0016S7\f?1H\u0004\u0004^C\u0016vK`1nwz`F2p&7X\u000b:\u0004th\u0013\u0011hT\u000f\u008cWaɟX\t\u00042!K%\fJM=\u0010|Q\u0019mxru\n[Ä-Ɣ\u0018ˇo\u000eef'HC\u007f{\u0012wQ%)o@p4pfxͭRZڅ,\"@x3\u0016\u0006-\\N:\u0015x?:4B^I\u0019\u000b\u0017x\t,VY~\u001f^\t}@\u0003bf<\u0003\u00185;\tIhj%\bg'K\\\u0003n6ECg4G;\u0006&vg\u0015#5\u0010:\u007f\u0010zZ|dlDw\u0006\u007f.L29\u007f1\u0004%ä\u0003)@9u[Z+}Q{\u0014W~\u000b\u000e';\u0017C\u0018\fx$D`\u0019[\u0016fg4\u0005d\u000b)\u0018f\u0010y\u0018¿)N:ҽ\rИBIzÅ*T\\B\u0015\u000b/ 5\u0001&ܲ+@c\u0018}ދ\u0018߳\u00183-ccu};Ji\u001d4\re2;:ܡq3ckBS8wj5\u0013xّnúFL\u0003y\u000eR\u0017F]?V[|p\u0005S$ߕ1̱j\u00074ݸA\u0001iV+\u0002\u000e6>_`ϒS\u0006$dS'!M\n܊\u001cxyyA\u001feϯ\r֭5x\"\u001eC>dvz\u000b6&\u00029ݦEt"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`4\u0003w9\u0005%Bjy\u001d>ms8ZMKz8'\u0015>", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", ">`a2a;\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "AtQ@V9BP\u0019\f", "\u001ah^{e,:Q(\u0003\f^?Fr,s\u007f5\r<}\u001e\u0017'w\u0012K\u0006%B/", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015QM\u0005x4\u001a\u0013weJ\u0007vu8s5GY_(YYr\u001d\u001c\u0016i\u001dN8bHJ", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "5dc\u0010[(G\\\u0019\u0006", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~G})6K\u0019*VL;r\n", "-rX4a(E", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "7r29b:>Ry\t\bL,\u0006\b", "", "u(I", "1k^@X", "1`d@X", "", "7me<^,(\\v\u0006\u0005l,", "", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "5dc\u001ca\u001a>\\\u0018=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u001ca\u001a>\\\u0018", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u0001s", "@dV6f;>`\u0007~\u0002^*\fi9rm(\u0005?", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "3kT:X5M", ">q^0X:L@\u0019\r\u000be;j\t6e}7i@\n\u0016", "Ad[2V;+S'\u000f\u0002m", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "Bqh X5=\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "Ad]1", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "2n;<V2>R\u0002~\u000em", "3kT:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011", "Cm[<V2\u001a\\\u0018\\}^*\u0003f9m\u000b/{O\u0001\u0016", "2n;<V2>R\u0007\u0003|g(\u0004f9m\u000b/{O\u0001\u0016", "6`]1_,=", "AhV;T3\u001c]!\n\u0002^;|\b", "=m2<`7ES(~y", "D`[BX", "uKZ<g3B\\bn\u0004b;RL ", "=m2.a*>Z ~y", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class RxObservableCoroutine<T> extends AbstractCoroutine<Unit> implements ProducerScope<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _signal$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RxObservableCoroutine.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;
    private final Mutex mutex;
    private final ObservableEmitter<T> subscriber;

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxObservableCoroutine$registerSelectForSend$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ RxObservableCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RxObservableCoroutine<T> rxObservableCoroutine, SelectInstance<?> selectInstance, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = rxObservableCoroutine;
            this.$select = selectInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$select, continuation);
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
                if (Mutex.DefaultImpls.lock$default(((RxObservableCoroutine) this.this$0).mutex, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!this.$select.trySelect(this.this$0, Unit.INSTANCE)) {
                Mutex.DefaultImpls.unlock$default(((RxObservableCoroutine) this.this$0).mutex, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxObservableCoroutine$send$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RxObservableCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14481(RxObservableCoroutine<T> rxObservableCoroutine, Continuation<? super C14481> continuation) {
            super(continuation);
            this.this$0 = rxObservableCoroutine;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    public RxObservableCoroutine(CoroutineContext coroutineContext, ObservableEmitter<T> observableEmitter) {
        super(coroutineContext, false, true);
        this.subscriber = observableEmitter;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    private final Throwable doLockedNext(T t2) {
        if (!isActive()) {
            doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
            return getCancellationException();
        }
        try {
            this.subscriber.onNext(t2);
            unlockAndCheckCompleted();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean zClose = close(undeliverableException);
            unlockAndCheckCompleted();
            if (zClose) {
                return undeliverableException;
            }
            RxCancellableKt.handleUndeliverableException(undeliverableException, getContext());
            return getCancellationException();
        }
    }

    private final void doLockedSignalCompleted(Throwable th, boolean z2) {
        try {
            if (_signal$volatile$FU.get(this) == -2) {
                return;
            }
            _signal$volatile$FU.set(this, -2);
            Throwable thUnwrapImpl = th != null ? !DebugKt.getRECOVER_STACK_TRACES() ? th : StackTraceRecoveryKt.unwrapImpl(th) : null;
            if (thUnwrapImpl == null) {
                try {
                    this.subscriber.onComplete();
                } catch (Exception e2) {
                    RxCancellableKt.handleUndeliverableException(e2, getContext());
                }
            } else if ((thUnwrapImpl instanceof UndeliverableException) && !z2) {
                RxCancellableKt.handleUndeliverableException(th, getContext());
            } else if (thUnwrapImpl != getCancellationException() || !this.subscriber.isDisposed()) {
                try {
                    this.subscriber.onError(th);
                } catch (Exception e3) {
                    ExceptionsKt.addSuppressed(th, e3);
                    RxCancellableKt.handleUndeliverableException(th, getContext());
                }
            }
        } finally {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        }
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private final /* synthetic */ int get_signal$volatile() {
        return this._signal$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlinx.coroutines.rx2.RxObservableCoroutine");
        Throwable thDoLockedNext = doLockedNext(obj);
        if (thDoLockedNext == null) {
            return this;
        }
        throw thDoLockedNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        if (Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(this, selectInstance, null), 3, null);
        }
    }

    private final /* synthetic */ void set_signal$volatile(int i2) {
        this._signal$volatile = i2;
    }

    private final void signalCompleted(Throwable th, boolean z2) {
        if (_signal$volatile$FU.compareAndSet(this, 0, -1) && Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(th, z2);
        }
    }

    private final void unlockAndCheckCompleted() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        if (isActive() || !Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return;
        }
        doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return cancelCoroutine(th);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel<T> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<T, SendChannel<T>> getOnSend() {
        RxObservableCoroutine$onSend$1 rxObservableCoroutine$onSend$1 = RxObservableCoroutine$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(rxObservableCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(rxObservableCoroutine$onSend$1, 3);
        RxObservableCoroutine$onSend$2 rxObservableCoroutine$onSend$2 = RxObservableCoroutine$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(rxObservableCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(rxObservableCoroutine$onSend$2, 3), null, 8, null);
    }

    public Void invokeOnClose(Function1<? super Throwable, Unit> function1) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public /* bridge */ /* synthetic */ void mo10566invokeOnClose(Function1 function1) {
        invokeOnClose((Function1<? super Throwable, Unit>) function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    @InterfaceC1492Gx
    public boolean offer(T t2) {
        return ProducerScope.DefaultImpls.offer(this, t2);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable th, boolean z2) {
        signalCompleted(th, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(Unit unit) {
        signalCompleted(null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object send(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.rx2.RxObservableCoroutine.C14481
            if (r0 == 0) goto L47
            r4 = r7
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r4 = (kotlinx.coroutines.rx2.RxObservableCoroutine.C14481) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L47
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L4e
            java.lang.Object r6 = r4.L$1
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.rx2.RxObservableCoroutine r0 = (kotlinx.coroutines.rx2.RxObservableCoroutine) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L29:
            java.lang.Throwable r0 = r0.doLockedNext(r6)
            if (r0 != 0) goto L4d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L32:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.sync.Mutex r1 = r5.mutex
            r4.L$0 = r5
            r4.L$1 = r6
            r4.label = r2
            r0 = 0
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r1, r0, r4, r2, r0)
            if (r0 != r3) goto L45
            return r3
        L45:
            r0 = r5
            goto L29
        L47:
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r4 = new kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            r4.<init>(r5, r7)
            goto L13
        L4d:
            throw r0
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxObservableCoroutine.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo10484trySendJP2dKIU(T t2) {
        if (!Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return ChannelResult.Companion.m10513failurePtdJZtk();
        }
        Throwable thDoLockedNext = doLockedNext(t2);
        return thDoLockedNext == null ? ChannelResult.Companion.m10514successJP2dKIU(Unit.INSTANCE) : ChannelResult.Companion.m10512closedJP2dKIU(thDoLockedNext);
    }
}
