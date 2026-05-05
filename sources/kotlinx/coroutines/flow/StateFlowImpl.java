package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
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
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007|jAӄLeV\u008cZS0\u0010s{J$cҕyCI[\"}(\fWNupvJ`\u0010K\u000f\u00144\u0001j2L]xk\u0012\u00172HpG3[nEʠhtL\u0005(2(9\u0002\u0005\u000f)2H\u0016w\u0003Ca\f\u001aؓHpPR\u0015M\u000b\u001a\u001a\u0006T \tȦbgdȤpncŽ=\"3oRP7_^}{\rvZ7\u000f\u0007ad*n9e\u001b5U\u0013\u0007\u0019Zm\u0006owM\u0007x'm*ww\u0018Ch\u0004\"\u001aCO;cę*^\u000bXn\u0014oF]tcP<:(~\n T\u0004DͺWL<A2f>Ԅy\tɤW@^\u0017'Z\u000e\u0011y6E7099P3hg`i\u001f~;\n\u001d%\u001eQ\u00075!$g\u001c}-\u001b\u0003\n\u00025_MUH\u0005ˣ Qъ\bpp r\u0018>f\u0018/*1^\u001b3Ds9Yܩ2Ɍ\u0007זkv\u0013\u00021Ywt`@P\u000f\\Kr#\u001a}\\d3\u0010\u0001^fQ)S,V\u0017}>ʶN\u0003>˪_ٚ\u0014N]\u00102p[\u0006\"%]g}k7\u0007\u001c\u0001QfC9ae&`\u0001wBilf\u0013\u0004~B\u0002\u0018!n͈&2V\u0017X\u001c\nqf\u0012#4OqRعZ_I`#w\u001b\u001epq-\rm\f\u0001\u0010-`c(\u0011\u001c<t74\u0017pA|u\u0002a2\rb2-oWc#|š$9@\u000b.\u001f~\"\f\u001eшXܤPl\u001e߯&\u001e.#29\bǽm\u0017\u001d\fA28Ώ{!1:(˾\u001eؠ~\u0007\u0012\u0011Av<v(lv<nr\u001bgb0:|nt3\b\u001bр({|O\u001eϡVߏ_Bat\ttJj̤\u00019"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\u001bu!5#", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0013j$=Z?9z\"!\u0011ua8gj6`L", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2%t =#", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011M\nEt%<`y\u001d>mv5WU\u0011", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0018}$2JJ;L;('>", "7mXA\\(EA(z\n^", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "-rc.g,", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "Ad`BX5<S", "", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc#T3NS", "1n\\=T9>/\"}h^;", "", "3w_2V;", "CoS.g,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "CoS.g,,b\u0015\u000ez", "3w_2V;>R\u0007\u000evm,", "<df g(MS", "@d_9T@\u001cO\u0017\u0002z", "", "5dc\u001fX7EO-\\v\\/|", "u(;7T=:\u001d)\u000e~euc\r=tU", "Bqh\u0012`0M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "3lXA", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "@db2g\u0019>^ z\u000f<(z\f/", "1n[9X*M", "", "1n[9X*M]&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|F#\u0016c\u001eJ:\u0011\u000fb\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "1qT.g,,Z#\u000e", "1qT.g,,Z#\u000eVk9x\u001d", "", "Ahi2", "uH\u0018(?2Hb \u0003\u0004quz\u0013<o\u00107\u007fI\u0001%`Hv\u0018N@\u0013DU\r \u0018t @;JEz\n", "4tb2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StateFlowImpl<T> stateFlowImpl, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = stateFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.collect(null, this);
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean updateState(Object obj, Object obj2) {
        int i2;
        synchronized (this) {
            Object obj3 = _state$volatile$FU.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            _state$volatile$FU.set(this, obj2);
            int i3 = this.sequence;
            if ((i3 + 1) - (1 | i3) != 0) {
                this.sequence = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.sequence = i4;
            StateFlowSlot[] slots = getSlots();
            Unit unit = Unit.INSTANCE;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = slots;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            stateFlowSlot.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.sequence;
                    if (i2 == i4) {
                        this.sequence = i4 + 1;
                        return true;
                    }
                    slots = getSlots();
                    Unit unit2 = Unit.INSTANCE;
                }
                i4 = i2;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:32:0x00b1, B:34:0x00b7], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:34:0x00b7, B:32:0x00b1], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[Catch: all -> 0x00f3, TryCatch #1 {all -> 0x00f3, blocks: (B:27:0x009f, B:28:0x00a2, B:30:0x00ac, B:32:0x00b1, B:43:0x00d6, B:45:0x00dc, B:34:0x00b7, B:38:0x00be, B:42:0x00d3, B:25:0x008c, B:26:0x008f), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[Catch: all -> 0x00f3, TryCatch #1 {all -> 0x00f3, blocks: (B:27:0x009f, B:28:0x00a2, B:30:0x00ac, B:32:0x00b1, B:43:0x00d6, B:45:0x00dc, B:34:0x00b7, B:38:0x00be, B:42:0x00d3, B:25:0x008c, B:26:0x008f), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[Catch: all -> 0x00f3, TryCatch #1 {all -> 0x00f3, blocks: (B:27:0x009f, B:28:0x00a2, B:30:0x00ac, B:32:0x00b1, B:43:0x00d6, B:45:0x00dc, B:34:0x00b7, B:38:0x00be, B:42:0x00d3, B:25:0x008c, B:26:0x008f), top: B:56:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00da -> B:28:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ec -> B:28:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r13, kotlin.coroutines.Continuation<?> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T t2, T t3) {
        if (t2 == null) {
            t2 = (T) NullSurrogateKt.NULL;
        }
        if (t3 == null) {
            t3 = (T) NullSurrogateKt.NULL;
        }
        return updateState(t2, t3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot[] createSlotArray(int i2) {
        return new StateFlowSlot[i2];
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t2, Continuation<? super Unit> continuation) {
        setValue(t2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        T t2 = (T) _state$volatile$FU.get(this);
        if (t2 == symbol) {
            return null;
        }
        return t2;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t2) {
        if (t2 == null) {
            t2 = (T) NullSurrogateKt.NULL;
        }
        updateState(null, t2);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t2) {
        setValue(t2);
        return true;
    }
}
