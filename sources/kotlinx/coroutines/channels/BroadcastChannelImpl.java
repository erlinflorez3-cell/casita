package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r(4\u0012}\nnjO0Le^.ZS0\u000fs{BBcҕyCI٥\"Ԃ*\teNo˧vJh\u000bK\u000f\f\u0019\u0001jBI]xc\u0014\u00172XoG\u074cUoS9hҚ>\u0005.;*\u0600\u0002\u0005\u000f\u001b2H\u0016\u0002\u0003CY\u0018\u001a0Fq@ĥ#˟-\u001c\u0018ßL\u001f1$li^6\u000fk\f:_)\u0013kRNm^^}\u0006\ry\tg\u001a\u0007e,-X7c\u0018ȏW\u0005\rViDKK\u007fM\u001dn7);I*ɎdiF(]?]\u001furTo5[n ?1_e[PDߊ&\fB\r\u0005\u0018\u001c\u001b?H\\@Jj\u0016$Kt)ԟ\u0007Ч@ެF\u007f\tx~23\u0018K1I\u001dvQ\u0010NGgg\u007f\u0013#6#7͙goڍ\u0012b\u001b5b\u0013\u001aM_\\UH|\u001d\nE{!\tf\u0012*\n1u\u001e_\u0002\u001fD/'MZg2g}JXR\t\u000f\u0005\u000f\u000b\u0004o`kX$\u0005\u0015eNO #Yr*\u0004P\u0003z\\\u0017[?l\t\u0014\u0007AD#\u0006˶%%\u0016t\u0018nw\u001ce]8Wuz\bh|m&Wgaۋ9Wk߄yT|\u001aMC3\u0017fnZW:dE(\u0001;\u001fН\u0012ȑ\u007fFV\f!=\u0010\n*@D=)d%N\u0013 RA3ȁ\u000eZ\u0017\u001dUԡ?ʗ\u0007i,ڏY\u000f^j\tq}ww;Sʣ.έEQ=ӧvs0\bL\u000f3\r\u000fw\u0010GmMuj|\u001a\u0006W\u0012\u001fD)gq\u0006ˎ\u0015ä\u0003):Ĉ}WZ\u001a}Q{4]OSɁ\u0011³l2\u007f\np\u0018:\t;_]}/\"-ܥ)gϋh\n\ncL%U\u000fl\rajW SpJ|P~\u001b\u001eTݒ74ݕ\u0001?=E-L$#,1\u001b\u0012k\u0017ܙ2/"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001cLiD\u000e9", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001c>", "1`_.V0Mg", "", "\nh]6g\u0005", "uH\u0018#", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", ":nR8", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00125Y\u0007/Di\u001f=4M9q\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "AtQ@V9BP\u0019\f\t", "", ":`bA66GT z\n^+\\\u0010/m\u007f1\u000b", "", "=oT;F<;a\u0017\f~i;\u0001\u00138", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "@d\\<i,,c\u0016\rxk0y\t<", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ad]1", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "Bqh X5=\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "@dV6f;>`\u0007~\u0002^*\fi9rm(\u0005?", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "=mB2a+\"\\(~\bg(\u0004u/s\u0010/\u000b", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "1k^@X", "", "1`d@X", "", "1`]0X3\"[$\u0006", "1`]0X3\"[$\u00069d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "7r29b:>Ry\t\bL,\u0006\b", "u(I", "D`[BX", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "u(E", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "D`[BX\u0016K<)\u0006\u0002", "5dc#T3NS\u0003\fcn3\u0004G+n\t2\u000b<\u0010\u001b!P}", "5dc#T3NS\u0003\fcn3\u0004", "BnBAe0GU", "", "!tQ@V9BP\u0019\fWn-}\t<e~", "!tQ@V9BP\u0019\fXh5}\u0010+t\u007f'", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {
    private final int capacity;
    private Object lastConflatedElement;
    private final ReentrantLock lock;
    private final HashMap<SelectInstance<?>, Object> onSendInternalResult;
    private List<? extends BufferedChannel<E>> subscribers;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":\u0013\u007fјlʔ;FǏ\u0016N>Tc*Eӆ*3d`ҸuEAU(~j\u0019]P\u007fg\u001dM\u000b\u0011Q\u0013\u001e\u0018\u000fiZN\u001c\rٛ\u0016\u0015"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001cLiD\u000e\"\u001a^s5EYR)\\_OM\u0015\u0013Z\u001bN*b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0012f\b\u001c6k\u0012<\\!>g='\u0015oEA\u0012j\u0002\u0012g", "1`]0X3\"[$\u0006", "", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class SubscriberBuffered extends BufferedChannel<E> {
        public SubscriberBuffered() {
            super(BroadcastChannelImpl.this.getCapacity(), null, 2, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl */
        public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
            ReentrantLock reentrantLock = ((BroadcastChannelImpl) BroadcastChannelImpl.this).lock;
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                broadcastChannelImpl.removeSubscriber(this);
                return super.cancelImpl$kotlinx_coroutines_core(th);
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":\u0013\u007fјlʔ;FǏ\u0016N>Tc*Eӆ*3d`ҸuEAU(~j\u0019]P\u007fg\u001dM\u000b\u0011Q\u0013\u001e\u0018\u000fiZN\u001c\rٛ\u0016\u0015"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001cLiD\u000e\"\u001a^s5EYR)\\_PG\u001d\u0013a\n]+\fZ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0003?b~'3|\u0016-*S<l4+\u0015g?<\u0003l5N}|", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0012f\b\u001c6k\u0012<\\!>g='\u0015oEA\u0012j\u0002\u0012g", "1`]0X3\"[$\u0006", "", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl */
        public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
            BroadcastChannelImpl.this.removeSubscriber(this);
            return super.cancelImpl$kotlinx_coroutines_core(th);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $element;
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, SelectInstance<?> selectInstance, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = broadcastChannelImpl;
            this.$element = obj;
            this.$select = selectInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$element, this.$select, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            boolean z2 = true;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
                    Object obj2 = this.$element;
                    this.label = 1;
                    if (broadcastChannelImpl.send((E) obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (!this.this$0.isClosedForSend() || (!(th instanceof ClosedSendChannelException) && this.this$0.getSendException() != th)) {
                    throw th;
                }
                z2 = false;
            }
            ReentrantLock reentrantLock = ((BroadcastChannelImpl) this.this$0).lock;
            BroadcastChannelImpl<E> broadcastChannelImpl2 = this.this$0;
            SelectInstance<?> selectInstance = this.$select;
            ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                if (DebugKt.getASSERTIONS_ENABLED() && ((BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.get(selectInstance) != null) {
                    throw new AssertionError();
                }
                ((BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.put(selectInstance, z2 ? Unit.INSTANCE : BufferedChannelKt.getCHANNEL_CLOSED());
                Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                if (((SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl2, Unit.INSTANCE) != TrySelectDetailedResult.REREGISTER) {
                    ((BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.remove(selectInstance);
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock2.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BroadcastChannelImpl<E> broadcastChannelImpl, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = broadcastChannelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.send(null, this);
        }
    }

    public BroadcastChannelImpl(int i2) {
        super(0, null);
        this.capacity = i2;
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i2 + " was specified").toString());
        }
        this.lock = new ReentrantLock();
        this.subscribers = CollectionsKt.emptyList();
        this.lastConflatedElement = BroadcastChannelKt.NO_ELEMENT;
        this.onSendInternalResult = new HashMap<>();
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    public final void removeSubscriber(ReceiveChannel<? extends E> receiveChannel) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BufferedChannel bufferedChannel = (Object) it.next();
                if (bufferedChannel != receiveChannel) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.subscribers = arrayList;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).cancelImpl$kotlinx_coroutines_core(th);
            }
            this.lastConflatedElement = BroadcastChannelKt.NO_ELEMENT;
            return super.cancelImpl$kotlinx_coroutines_core(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).close(th);
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                BufferedChannel bufferedChannel = (Object) it2.next();
                if (bufferedChannel.hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.subscribers = arrayList;
            return super.close(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final E getValue() throws Throwable {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isClosedForSend()) {
                if (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                    return (E) this.lastConflatedElement;
                }
                throw new IllegalStateException("No value".toString());
            }
            Throwable closeCause = getCloseCause();
            if (closeCause == null) {
                throw new IllegalStateException("This broadcast channel is closed");
            }
            throw closeCause;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E getValueOrNull() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            E e2 = null;
            if (!isClosedForReceive() && this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                e2 = (E) this.lastConflatedElement;
            }
            return e2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            BufferedChannel subscriberConflated = this.capacity == -1 ? new SubscriberConflated() : new SubscriberBuffered();
            if (isClosedForSend() && this.lastConflatedElement == BroadcastChannelKt.NO_ELEMENT) {
                subscriberConflated.close(getCloseCause());
                return subscriberConflated;
            }
            if (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                subscriberConflated.mo10484trySendJP2dKIU(getValue());
            }
            this.subscribers = CollectionsKt.plus((Collection<? extends BufferedChannel>) this.subscribers, subscriberConflated);
            reentrantLock.unlock();
            return subscriberConflated;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object objRemove = this.onSendInternalResult.remove(selectInstance);
            if (objRemove != null) {
                selectInstance.selectInRegistrationPhase(objRemove);
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(selectInstance.getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, obj, selectInstance, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0059 -> B:53:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object send(E r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1
            if (r0 == 0) goto L81
            r4 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L81
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r0 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r3 = 1
            if (r1 == 0) goto L5d
            if (r1 != r3) goto L8f
            java.lang.Object r1 = r4.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r7 = r4.L$1
            java.lang.Object r2 = r4.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r2 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r2
            kotlin.ResultKt.throwOnFailure(r0)
        L33:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L41
            boolean r0 = r2.isClosedForSend()
            if (r0 != 0) goto L8a
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.channels.BufferedChannel r0 = (kotlinx.coroutines.channels.BufferedChannel) r0
            r4.L$0 = r2
            r4.L$1 = r7
            r4.L$2 = r1
            r4.label = r3
            java.lang.Object r0 = r0.sendBroadcast$kotlinx_coroutines_core(r7, r4)
            if (r0 != r5) goto L5c
            return r5
        L5c:
            goto L33
        L5d:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.concurrent.locks.ReentrantLock r2 = r6.lock
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            boolean r0 = r6.isClosedForSend()     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L97
            int r1 = r6.capacity     // Catch: java.lang.Throwable -> L9c
            r0 = -1
            if (r1 != r0) goto L74
            r6.lastConflatedElement = r7     // Catch: java.lang.Throwable -> L9c
        L74:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r0 = r6.subscribers     // Catch: java.lang.Throwable -> L9c
            r2.unlock()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
            r2 = r6
            goto L41
        L81:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r4 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r4.<init>(r6, r8)
            goto L19
        L87:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L8a:
            java.lang.Throwable r0 = r2.getSendException()
            throw r0
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L97:
            java.lang.Throwable r0 = r6.getSendException()     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public String toString() {
        return (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT ? "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; " : "") + "BROADCAST=<" + super.toString() + ">; SUBSCRIBERS=" + CollectionsKt.joinToString$default(this.subscribers, Global.SEMICOLON, "<", ">", 0, null, null, 56, null);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo10484trySendJP2dKIU(E e2) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                return super.mo10484trySendJP2dKIU(e2);
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        return ChannelResult.Companion.m10513failurePtdJZtk();
                    }
                }
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = e2;
            }
            Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).mo10484trySendJP2dKIU(e2);
            }
            return ChannelResult.Companion.m10514successJP2dKIU(Unit.INSTANCE);
        } finally {
            reentrantLock.unlock();
        }
    }
}
