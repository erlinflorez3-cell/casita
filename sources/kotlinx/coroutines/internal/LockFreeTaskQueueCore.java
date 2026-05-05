package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.dynatrace.android.agent.Global;
import defpackage.Architecture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DebugKt;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&˛\bDRш|İI\u0006>\u00116Ȑ\u0007\":\u001b\u007f\u0007llA0ZeP\u008cZS@\u000fsڔ<$q$yCA]\"}8\tWNmnvJh\u0012K\u000f\f\u0019\u0001j:g]xc\u0012\u00172XoG3SqCʠvҚT3H8(\u0600\b\u0004)\u001aXH@v)C\u0004\f?^\u0001\u0006JV\u001bN\u001d\u001a@\bN$\u000f!tg|:Ղp_@41\t2F\\:w0+QUWb;%v\u0010 [DEJ-%\nΈ\u07baV[M\u0019\b!K\u001c\u0001;7-Ys\u000e̬n~Bƃ\u0014W\u001d_\u0003&\u0013Ӥg_j?[Sqdh\u000eVy+\u007f\u001bQ\u001c\u000e<Ω\u000f.ǉ\u001ef\u0016({z\u0001nXR\u0018]p\u007fC\u0011D3=\u0014C-I\u001b\u001dϟw:G\u05cb \u0004\u0015\u000f.#7͙7Z3&\u0011\u0019)q\u0010Q_SpAVl\"YkoJpĊ\u0006*\u0012O\u0010\n=\u001c)4''G[o\u05faOǽJNR\t\u000f\u0005\u000f\u000b\u001ai\u001bkNE\u0007&G,\u0019\f\u0011ե\u0013ʍTVdZ<\u0011\u0004ȼ3\u001f.\f!DtwjCk\u0010ʽShw\u0010\u0016\u0001\u0018KGvG[~kDãgӔ\u001c;ae a\tΘrWlf\u0013|~B\u0002.!\\͈&2V\u0010X\u001c\nkf\u0012#4Oqb]ZY9^\u001bG\u0011GrQ\u000b3wfx\u0012\u000fTiɴ\u0013k4tO*~\b9su%a,+dr9ORM\u0019TWx־6č'\u0007\u0007͞PSuO_L\u001b\u001aLɠ}°\u001a\u001aA֗\u007fI!\u0016\u0017)`\u0004\u0004թNȌiQUȼw\u0010\u000b\u0002'Ix8w\u0010zr<`!\u07baeSEǱ%gIֿ\n5\u0007\bk^zun+ޯ]\u000fX\u0001\u000fqD^<\r\u00075\u001dS\u0001\u001e/Sމ/\u00146+$\u0010\u0014]\u0019\u0018\"ɳs2\u0012d\u00154\u0003tT;q&\bb\u007f_h\u007fΒM]\u0017@(5z\u0015ݒL\u001a"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u001dIQAWD\u001e%h?C\u0014c\u0002", "\u0013", "", "1`_.V0Mg", "", "Ah]4_,\u001c]\"\r\u000bf,\n", "", "\nh]6g\u0005", "uHIuI", ";`b8", "-mTEg", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "-rc.g,", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", "/qa.l", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015#|\u001b8\u000bz", "7r4:c;R", "u(I", "Ahi2", "5dc \\A>", "u(8", "1k^@X", "/cS\u0019T:M", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "4h[9C3:Q\u0019\u0002\u0005e+|\u0016", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?f}u", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001d!Vv\u0012E\nn3c\u000b*G|\u001a7MQ\u0005o=-\u0015uj5\u000e-\u0013Xt-(YN,KN\u0001C\u007f\"Z\u001eN\t\u0017\u0012Y\u0017", "@d\\<i,\u001fW&\r\nH9e\u00196l", "@d\\<i,,Z#\u0011eZ;\u007f", "=kS\u0015X(=", "<df\u0015X(=", "uH8u?2Hb \u0003\u0004quz\u0013<o\u00107\u007fI\u0001%`Kx\u001d<\u0004.1`G\u0007Ak\u001c\u000fZC;Z0,\u001bTq9\u0017c\nX\u0004'\u001d", "<dgA", ";`a899Hh\u0019\b", "", "/k[<V(MS\u0003\f\\^;e\tBt]2\u0007T", "AsPAX", "uI\u0018\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`\u001bP~\u000eI\u007f!<#d*5sv;MC*gB$\u0001xaI\u0007A6[v|", "/k[<V(MS\u0002~\u000em\n\u0007\u0014C", ";`_", "", Global.BLANK, "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7r29b:>R", "\u001ekP0X/HZ\u0018~\b", "\u0011n\\=T5B]\"", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;
    public static final Companion Companion = new Companion(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00116B\u0005$4\u0012\u0006\u000enj?6Le^.ZS0\u0019s{J$c$\bCCU \u0002(ޜPdʴ\u0018nxYKJ\u0015\u0006Ȁ|l2Icy&%\u001dGZom;uokA\u0011xD\u001b82P@@ڕ\u0003b:V'\u000fzqS4\u0012^H!>`%e\u0005H\u0015NN.\u001a6\\\u0016V^H\u001bej31\u001d\u0002B|*(~\u000bh%F\u001bC-xg\u001d9\\_5C-\u00047\u0015oso\u0013P\u0002L3kҊ+5O\u0013g<^ $\u00171U3~\u00037l\u0014\u007fcВ+5U\u0003[V\u0014H\b|\u0002\u0013b&\u001e\b7HtIH\u0005Nԋ9ϢvSNsJfP$\u0013ad\u001aM\u007fa3\n'tSy;GQ\u000eޭWڟ\"#\t͙qgb\u0012x\u0015IWNΊ\u0004ҨD=PݐZeKr\u001cp\u0011\u0005\u0001ʽ\u0003Ͻ\u0004/\u0004߾~#3=s9Q$Bȼ\u001bזkv\r\u009b9_wY`@Pvlպ|Á\u0010ZLߟUw^]p,?PrΈYą\f\u0013(οHH//(N}p@қ ύ\u000e%7ω\be|v&Wga\n̗$Ӓ\u0014aZΘdKJn\u001dX\u0015J*ە-څ,\":ʋ;\u001c\u0006\t\\N:\u0016\tŴDʬ8,9ǉ-!V\u00116Bo\u0005_ݧ-ӳ\u0014~\\՜t\u000fw3\r\t/S3ʠBς|I4ʉ10;Qi5G7\f&?\u061c~ɠ\u000b~{Ò\u0018sZYdlDx,ݯrک\u001e9Yǽ\u000e\u001f\u001d\u0012A200\u001cɪEϯUM\u001a\u05fdK\t\b#Sh\\j^υCݽdjR֢ݠ\u001bG"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u001dIQAWD\u001e%h?C\u0014cj,\u0001/RHW0f[H", "", "\nh]6g\u0005", "u(E", "\u0017M8!<\b%MvZe:\n`w#", "", "\u0011@?\u000e6\u0010-G\u0013[^M\u001a", "\u001b@G,6\b)/vbiR&dd\u001dK", "\u0016D0\u0011R\u001a!7ym", "\u0016D0\u0011R\u0014\u001aA~", "", "\"@8\u0019R\u001a!7ym", "\"@8\u0019R\u0014\u001aA~", "\u0014Q>'8\u00158A{b[M", "\u0014Q>'8\u00158;tl`", "\u0011K> 8\u000b8A{b[M", "\u0011K> 8\u000b8;tl`", "\u001bH=,4\u000b\u001dM\u0007i^G&Zd\u001aA]\fj4", " D<\u001cI\f84\u0006ho>\u0015", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "\u000fC3,F\u001c\u001c1xlh", "\u000fC3,9\u0019(Hxg", "\u000fC3,6\u0013(Ax]", "En", "=sW2e", "CoS.g,!S\u0015}", "<df\u0015X(=", "CoS.g,-O\u001d\u0006", "<df!T0E", "Ehc5F;:b\u0019", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "6dP1", "B`X9", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "/cS\u0013T0E@\u0019z\th5", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int addFailReason(long j2) {
            return (j2 & LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j2, int i2) {
            return (-1) - (((-1) - wo(j2, LockFreeTaskQueueCore.HEAD_MASK)) & ((-1) - ((long) i2)));
        }

        public final long updateTail(long j2, int i2) {
            long jWo = wo(j2, LockFreeTaskQueueCore.TAIL_MASK);
            long j3 = ((long) i2) << 30;
            return (jWo + j3) - (jWo & j3);
        }

        public final <T> T withState(long j2, Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) ((-1) - (((-1) - LockFreeTaskQueueCore.HEAD_MASK) | ((-1) - j2)))), Integer.valueOf((int) ((j2 & LockFreeTaskQueueCore.TAIL_MASK) >> 30)));
        }

        public final long wo(long j2, long j3) {
            long j4 = ~j3;
            return (j2 + j4) - (j2 | j4);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0005ӬBߚ(\u0007\u0015iy=TiV.jSX\u0010ө\u007f6*]2t\u0014Ic\u001a\u0016\"7P\u0005k>ùLҼ\u000fC\u0017إȆ|n"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u001dIQAWD\u001e%h?C\u0014cj9}#ELQ6cQrJi", "", "7mS2k", "", "\nh]6g\u0005", "uH\u0018#", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Placeholder {
        public final int index;

        public Placeholder(int i2) {
            this.index = i2;
        }
    }

    public LockFreeTaskQueueCore(int i2, boolean z2) {
        this.capacity = i2;
        this.singleConsumer = z2;
        int i3 = i2 - 1;
        this.mask = i3;
        this.array = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long j2) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i2 = (int) ((-1) - (((-1) - HEAD_MASK) | ((-1) - j2)));
        int i3 = (int) (((-1) - (((-1) - TAIL_MASK) | ((-1) - j2))) >> 30);
        while (true) {
            int i4 = this.mask;
            if ((i2 & i4) == (i4 & i3)) {
                _state$volatile$FU.set(lockFreeTaskQueueCore, Companion.wo(j2, FROZEN_MASK));
                return lockFreeTaskQueueCore;
            }
            Object placeholder = getArray().get((-1) - (((-1) - this.mask) | ((-1) - i2)));
            if (placeholder == null) {
                placeholder = new Placeholder(i2);
            }
            lockFreeTaskQueueCore.getArray().set((-1) - (((-1) - lockFreeTaskQueueCore.mask) | ((-1) - i2)), placeholder);
            i2++;
        }
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long j2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, null, allocateNextCopy(j2));
        }
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int i2, E e2) {
        Object obj = getArray().get(this.mask & i2);
        if (!(obj instanceof Placeholder) || ((Placeholder) obj).index != i2) {
            return null;
        }
        getArray().set((-1) - (((-1) - i2) | ((-1) - this.mask)), e2);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray getArray() {
        return this.array;
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ long get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final long markFrozen() {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & FROZEN_MASK) != 0) {
                return j2;
            }
            j3 = j2 | FROZEN_MASK;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        return j3;
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int i2, int i3) {
        long j2;
        Companion companion;
        int i4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            companion = Companion;
            i4 = (int) (HEAD_MASK & j2);
            if (DebugKt.getASSERTIONS_ENABLED() && i4 != i2) {
                throw new AssertionError();
            }
            if ((-1) - (((-1) - FROZEN_MASK) | ((-1) - j2)) != 0) {
                return next();
            }
        } while (!_state$volatile$FU.compareAndSet(this, j2, companion.updateHead(j2, i3)));
        getArray().set(this.mask & i4, null);
        return null;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(long j2) {
        this._state$volatile = j2;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        long j2;
        do {
            j2 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j2, function1.invoke(Long.valueOf(j2)).longValue()));
    }

    private final /* synthetic */ long updateAndGet$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        long j2;
        Long lInvoke;
        do {
            j2 = atomicLongFieldUpdater.get(obj);
            lInvoke = function1.invoke(Long.valueOf(j2));
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j2, lInvoke.longValue()));
        return lInvoke.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0064, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int addLast(E r19) {
        /*
            r18 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = get_state$volatile$FU()
        L4:
            r4 = r18
            long r14 = r3.get(r4)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r14
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L1a
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            int r0 = r0.addFailReason(r14)
            return r0
        L1a:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r5 + r14
            long r5 = r5 | r14
            long r0 = r0 - r5
            int r7 = (int) r0
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r5 + r14
            long r5 = r5 | r14
            long r0 = r0 - r5
            r5 = 30
            long r0 = r0 >> r5
            int r8 = (int) r0
            int r5 = r4.mask
            int r6 = r8 + 2
            r6 = r6 & r5
            int r1 = r7 + r5
            r0 = r7 | r5
            int r1 = r1 - r0
            r9 = 1
            if (r6 != r1) goto L3f
            return r9
        L3f:
            boolean r0 = r4.singleConsumer
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L65
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.getArray()
            r0 = r8 & r5
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L65
            int r2 = r4.capacity
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 < r0) goto L64
            int r8 = r8 - r7
            int r1 = (-1) - r8
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int r0 = r2 >> 1
            if (r1 <= r0) goto L4
        L64:
            return r9
        L65:
            int r0 = r8 + 1
            r0 = r0 & r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = get_state$volatile$FU()
            long r16 = r2.updateTail(r14, r0)
            r13 = r4
            boolean r0 = r12.compareAndSet(r13, r14, r16)
            if (r0 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r4.getArray()
            int r1 = (-1) - r8
            int r0 = (-1) - r5
            r1 = r1 | r0
            int r0 = (-1) - r1
            r9 = r19
            r2.set(r0, r9)
            r7 = r4
        L88:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            long r5 = r0.get(r7)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r5 + r3
            long r5 = r5 | r3
            long r1 = r1 - r5
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto La4
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r7.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r7 = r0.fillPlaceholder(r8, r9)
            if (r7 != 0) goto L88
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueueCore.addLast(java.lang.Object):int");
    }

    public final boolean close() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 + CLOSED_MASK) - (j2 | CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK + j2) - (FROZEN_MASK | j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j2 | CLOSED_MASK));
        return true;
    }

    public final int getSize() {
        long j2 = _state$volatile$FU.get(this);
        int i2 = ((int) (((j2 + TAIL_MASK) - (j2 | TAIL_MASK)) >> 30)) - ((int) (HEAD_MASK & j2));
        return (i2 + MAX_CAPACITY_MASK) - (i2 | MAX_CAPACITY_MASK);
    }

    public final boolean isClosed() {
        long j2 = _state$volatile$FU.get(this);
        return (j2 + CLOSED_MASK) - (j2 | CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j2 = _state$volatile$FU.get(this);
        return ((int) (HEAD_MASK & j2)) == ((int) ((j2 & TAIL_MASK) >> 30));
    }

    public final <R> List<R> map(Function1<? super E, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j2 = _state$volatile$FU.get(this);
        int i2 = (int) ((-1) - (((-1) - HEAD_MASK) | ((-1) - j2)));
        int i3 = (int) ((j2 & TAIL_MASK) >> 30);
        while (true) {
            int i4 = this.mask;
            if ((i2 + i4) - (i2 | i4) == (i4 & i3)) {
                return arrayList;
            }
            Architecture architecture = (Object) getArray().get((-1) - (((-1) - this.mask) | ((-1) - i2)));
            if (architecture != null && !(architecture instanceof Placeholder)) {
                arrayList.add(function1.invoke(architecture));
            }
            i2++;
        }
    }

    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK + j2) - (FROZEN_MASK | j2) != 0) {
                return REMOVE_FROZEN;
            }
            Companion companion = Companion;
            int i2 = (int) (HEAD_MASK & j2);
            int i3 = (int) ((TAIL_MASK & j2) >> 30);
            int i4 = this.mask;
            if ((-1) - (((-1) - i3) | ((-1) - i4)) == (i4 & i2)) {
                return null;
            }
            Object obj = getArray().get(this.mask & i2);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i5 = i2 + 1;
                int i6 = (i5 + MAX_CAPACITY_MASK) - (i5 | MAX_CAPACITY_MASK);
                if (_state$volatile$FU.compareAndSet(this, j2, companion.updateHead(j2, i6))) {
                    getArray().set((-1) - (((-1) - this.mask) | ((-1) - i2)), null);
                    return obj;
                }
                if (this.singleConsumer) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreRemoveSlowPath = this;
                    do {
                        lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i2, i6);
                    } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                    return obj;
                }
            }
        }
    }
}
