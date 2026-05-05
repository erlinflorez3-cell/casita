package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
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
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
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
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&˛\bDZc|\u0004O\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$\u007fDCU ~*\teNogtKb\u000bY\u000f\u000eǝ\u0001j:R]xc\u0015\u00172PnG\u074cUoS9hҚ>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016z\u0003Ca\f\u001aؓHpHĥ\u0015M\u000b\u001b\u001a\u0006T \t\u001ebqV6Vse:5(\tnX÷Oc6ŧ[\fdÖW\u0013\u0007c.+n8c\u0015UY\u0013\tb[\u0006\u0002msm\u0005\u0017*g`Ywe:p\u007fB\u001a;Y\u001bc\u000b,l\u0007a`BʬYVsa^\u0016@\n\u000b}\u001d<2\u0018\u0016)X.[\u001fv\n\u001e3#s\u0002Iг\u0006`H\u000b\tm~'3\u0017K+g/\u0017WoS1PMz3\u0017d7I\u000b/tl\u000e\u000f/Kf\u0006lI_PAXP Xkw\u0014rr\u0002X\u0005^cFCD-<<=7\n:S)y(`Hwv\u000ba\u0017z\u001aXVh:p,6X2RZ\r\u0001\u0013\u0016hVn+?vLZ\u0015& \u00156[&eQ+\u001eygj\u007fi{\u0007P%w\u0002E\u0006\u0007q\u001eYI^a6\u007f\u0011@e`\u001f,?rϵKlڋFU\u0012\tjWjFV\u001b(w*E~\u0010!ZWqRعr֒WÅ\u0019H\u0011O\u000bV\u000b;w\\~\u000f-^c(\u0011\u001d<t?ɖ\u0017\\ʼsg\u0007}t\u0003nWEA\u007f6_&\u001e:vj\u0015#5\u007f$\u0006U\u007fdIbkD\u007f\u0006\u007f.M29\u007fC\u0004\u0013W\r7j\u001a-sM#i_\u0007*')7@#\u0004\u0001<# j\u001f-\u0011pXgl\u00198u\r|S\fr7\u0012at\u000f\u000ec\u001d\u001eizar1ZlRF:\u001d\u001fL&G\u0002ݕ\u00015;\u0002o3$7,/Cb\u000em}F\u0012b=0%i\u0012c{\u0016\u001ev\u0018ozAF\nq~l#j\u0001STVp\u0010\u000eR\u000bD\riǥokGތ:Ԫ\u000f/\u0006օWJ\u001bxnmJ\u0015\u007f}b8o,\u0004C,\u0019nE5\u0011{T\u0016vDй^\u05c8N\u000f\u0012ΚLI|\u001f4C0Xgb?ݵ4\u0002N\u000b\u0018ݼdƀ@\r<62K\u0016\u001b\u0014[w\u0017(z.X6ʘ\u0019\u0003N\u0002Nn\u000e\u0003\r3ƊTϖdEhԠz\u0013\r$K\u001e'IgYD܅Vвg6\u0019U#\u001e)\u0001 \u000btBCD\u0003WqμZ܁\u000fEeŝ\u001a,D#_;}m\u007f\fn\u008e\r%R\u001e+;a\u0011\u0016ڻ^l9u\u001b#;ʑ\u0014؉VX2+\u0005\u001c\u000b0T\f\u0015.'sμs$"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0001\u0013\u0015Vs\u001f<@\u0010EV\u0005$Ep\u0016;+MHuD-\u0019qa\u000f", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@\u000249c\u0007u", ">`a2a;\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "AtQ@V9BP\u0019\f", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@s%B/", "3wR2c;B]\"h\u0004<(\u0006\u0007/lb$\u0005?\b\u0017$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015WP=5A\u001e\u0011fp=\u0018c:]\u0004'CT\\uJboK\u0012\u001f^\u000bN8bk_K3uH@h\r=QK<x\n\n%\u0012?s~\f7 Pw$yK25\u001c\u001dP", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "5dc\u0010[(G\\\u0019\u0006", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~G})6K\u0019*VL;r\n", "-mA2d<>a(~y", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", "1`]0X3ES\u0018", "", "7r29b:>Ry\t\bL,\u0006\b", "u(I", "1k^@X", "1`d@X", "7me<^,(\\v\u0006\u0005l,", "", "6`]1_,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "5dc\u001ca\u001a>\\\u0018=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u001ca\u001a>\\\u0018", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u0001s", "@dV6f;>`\u0007~\u0002^*\fi9rm(\u0005?", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "3kT:X5M", "", ">q^0X:L@\u0019\r\u000be;j\t6e}7i@\n\u0016", "Ad[2V;+S'\u000f\u0002m", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "Bqh X5=\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "Ad]1", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "2n;<V2>R\u0002~\u000em", "3kT:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011", "Cm[<V2\u001a\\\u0018\\}^*\u0003f9m\u000b/{O\u0001\u0016", "2n;<V2>R\u0007\u0003|g(\u0004f9m\u000b/{O\u0001\u0016", "6`]1_,=", "@d`BX:M", "<", "", "AhV;T3\u001c]!\n\u0002^;|\b", "=m2<`7ES(~y", "D`[BX", "uKZ<g3B\\bn\u0004b;RL ", "=m2.a*>Z ~y", "1`]0X3", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class PublisherCoroutine<T> extends AbstractCoroutine<Unit> implements ProducerScope<T>, Subscription {
    private static final /* synthetic */ AtomicLongFieldUpdater _nRequested$volatile$FU = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;
    private final Function2<Throwable, CoroutineContext, Unit> exceptionOnCancelHandler;
    private final Mutex mutex;
    private final Subscriber<T> subscriber;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectForSend$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ PublisherCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PublisherCoroutine<? super T> publisherCoroutine, SelectInstance<?> selectInstance, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = publisherCoroutine;
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
                if (Mutex.DefaultImpls.lock$default(((PublisherCoroutine) this.this$0).mutex, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!this.$select.trySelect(this.this$0, Unit.INSTANCE)) {
                Mutex.DefaultImpls.unlock$default(((PublisherCoroutine) this.this$0).mutex, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.PublisherCoroutine$send$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14421 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PublisherCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14421(PublisherCoroutine<? super T> publisherCoroutine, Continuation<? super C14421> continuation) {
            super(continuation);
            this.this$0 = publisherCoroutine;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.send(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublisherCoroutine(CoroutineContext coroutineContext, Subscriber<T> subscriber, Function2<? super Throwable, ? super CoroutineContext, Unit> function2) {
        super(coroutineContext, false, true);
        this.subscriber = subscriber;
        this.exceptionOnCancelHandler = function2;
        this.mutex = MutexKt.Mutex(true);
    }

    private final Throwable doLockedNext(T t2) {
        if (t2 == null) {
            unlockAndCheckCompleted();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        }
        if (!isActive()) {
            unlockAndCheckCompleted();
            return getCancellationException();
        }
        try {
            this.subscriber.onNext(t2);
            while (true) {
                long j2 = _nRequested$volatile$FU.get(this);
                if (j2 < 0 || j2 == Long.MAX_VALUE) {
                    break;
                }
                long j3 = j2 - 1;
                if (_nRequested$volatile$FU.compareAndSet(this, j2, j3)) {
                    if (j3 == 0) {
                        return null;
                    }
                }
            }
            unlockAndCheckCompleted();
            return null;
        } catch (Throwable th) {
            this.cancelled = true;
            boolean zClose = close(th);
            unlockAndCheckCompleted();
            if (zClose) {
                return th;
            }
            this.exceptionOnCancelHandler.invoke(th, getContext());
            return getCancellationException();
        }
    }

    private final void doLockedSignalCompleted(Throwable th, boolean z2) {
        try {
            if (_nRequested$volatile$FU.get(this) != -2) {
                _nRequested$volatile$FU.set(this, -2L);
                if (!this.cancelled) {
                    if (th == null) {
                        try {
                            this.subscriber.onComplete();
                        } catch (Throwable th2) {
                            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
                        }
                    } else {
                        try {
                            this.subscriber.onError(th);
                        } catch (Throwable th3) {
                            if (th3 != th) {
                                ExceptionsKt.addSuppressed(th, th3);
                            }
                            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
                        }
                    }
                    return;
                }
                if (th != null && !z2) {
                    this.exceptionOnCancelHandler.invoke(th, getContext());
                }
            }
        } finally {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        }
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private final /* synthetic */ long get_nRequested$volatile() {
        return this._nRequested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
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

    private final /* synthetic */ void set_nRequested$volatile(long j2) {
        this._nRequested$volatile = j2;
    }

    private final void signalCompleted(Throwable th, boolean z2) {
        long j2;
        do {
            j2 = _nRequested$volatile$FU.get(this);
            if (j2 == -2) {
                return;
            }
            if (j2 < 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
        } while (!_nRequested$volatile$FU.compareAndSet(this, j2, -1L));
        if (j2 == 0) {
            doLockedSignalCompleted(th, z2);
        } else if (Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(th, z2);
        }
    }

    private final void unlockAndCheckCompleted() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        if (isCompleted() && Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
        }
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public void cancel() {
        this.cancelled = true;
        super.cancel((CancellationException) null);
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
        PublisherCoroutine$onSend$1 publisherCoroutine$onSend$1 = PublisherCoroutine$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(publisherCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(publisherCoroutine$onSend$1, 3);
        PublisherCoroutine$onSend$2 publisherCoroutine$onSend$2 = PublisherCoroutine$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(publisherCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(publisherCoroutine$onSend$2, 3), null, 8, null);
    }

    public Void invokeOnClose(Function1<? super Throwable, Unit> function1) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose, reason: collision with other method in class */
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

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        long j3;
        long j4;
        if (j2 <= 0) {
            cancelCoroutine(new IllegalArgumentException("non-positive subscription request " + j2));
            return;
        }
        do {
            j3 = _nRequested$volatile$FU.get(this);
            if (j3 < 0) {
                return;
            }
            long j5 = j3 + j2;
            j4 = Long.MAX_VALUE;
            if (j5 >= 0 && j2 != Long.MAX_VALUE) {
                j4 = j5;
            }
            if (j3 == j4) {
                return;
            }
        } while (!_nRequested$volatile$FU.compareAndSet(this, j3, j4));
        if (j3 == 0) {
            unlockAndCheckCompleted();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object send(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.reactive.PublisherCoroutine.C14421
            if (r0 == 0) goto L4a
            r4 = r7
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r4 = (kotlinx.coroutines.reactive.PublisherCoroutine.C14421) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L4a
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 != r2) goto L51
            java.lang.Object r6 = r4.L$1
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.reactive.PublisherCoroutine r0 = (kotlinx.coroutines.reactive.PublisherCoroutine) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L2c:
            java.lang.Throwable r0 = r0.doLockedNext(r6)
            if (r0 != 0) goto L50
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.sync.Mutex r1 = r5.mutex
            r4.L$0 = r5
            r4.L$1 = r6
            r4.label = r2
            r0 = 0
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r1, r0, r4, r2, r0)
            if (r0 != r3) goto L48
            return r3
        L48:
            r0 = r5
            goto L2c
        L4a:
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r4 = new kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            r4.<init>(r5, r7)
            goto L16
        L50:
            throw r0
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
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
