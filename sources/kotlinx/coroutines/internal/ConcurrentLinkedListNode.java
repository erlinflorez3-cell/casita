package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDRш|\u0004G\b8\u000bDB\u0007\"2\u0016\u007f\u0007|jA0RdP.XV2\u000fy\u0005<$a(yCIU\"}(\u000fUl}˧\u0017V`ŏQ\u000e.\u001c\tl<I\u001cw\f܈?2po\u007fB]uK:xvL\u0004V݅ŕ<{\u000b\u0003(-\u0011,\u0005\u0005[M\"\u0011fϋ!D`\u0018e\u000b*\u0014\u0016>N\u000eLh.\u07b5<Ղp]H=k\u0014wTf'\u000eC-Q\u001bZl'CǸҐ\"+NL}\u00193l\u001b\u0007\u0001u\b\u0007M\rU\u0005\u0017:o/W\u0011o6\u0007\u001ad$9S%e\u0003*l\u0007g_:'YT:֢R^7\u0006\u0001\u0014\u0015L\b\u001e\b=GdƦHk^ԇ5E\u0007aGh\u0004tA.z\u0018vmӞ\u0002Ĵ/=3hWiI\"\u001fH\n\u0014% 9\u007f%ď\u0012\u0019\u05f8d\u00193V}a?b\u0011LVd\"Yk\u0001:5Ċ\u0006.\u001c2M\u0016=\u0013a?%&O]O\"Wǽ8\rזkz\u001dbnkwc\u0019P0\u000b.7X\u001cbʕF\u0081\tohV^H\u001fdlh\u0015\u001c \u00156[.˓WefʝQŹmne_\u0010D=w\bk|\f&WoӔiu(Ҳ\u0012уVz,AB\u0004\u0013iڑFu"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?b{0Dz\u00167\\*?t:\u001e\u0014OeG\u0016L6Mv|", "\u001c", "", ">qTC", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u0013c\u0007\u001eGz#.VR\"o=$\u0015gH=\u0015r\u0015Xu'\u001d\u0010?", "-mTEg", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "-oa2i", "<dgAB9\u001cZ#\rz]", "5dc\u001bX?M=&\\\u0002h:|\b", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgAB9\"Tv\u0006\u0005l,{", "=m29b:>Rt|\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001es =TGD~}\u001c\u001fukI\u0016g5N\u0005pKU],i[nD]od\u0017L;\u001a\u0012YJ3UH@%\b+0\u0006Iwi\u0016\u0015\u000e\u000b", "<dgA", "5dc\u001bX?M", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~7\b)5}#;MLJR8'\u001bh` \u000bq;7\u0001&G\"", "Bqh X;'S,\u000e", "", "D`[BX", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u0013c\u0007\u001eGz#.VR\"o=$\u0015gH=\u0015r\u0015Xu'\u001d\u0010C", "7rC.\\3", "u(I", "5dc\u001de,O", "1kT.a\u0017KS*", "", ";`a84:\u001cZ#\rz]", "7rA2`6OS\u0018", "@d\\<i,", "/kXCX\u001a>U!~\u0004m\u0013|\n>", "5dc\u000e_0OS\u0007~|f,\u0006\u0018\u0016e\u00017", "/kXCX\u001a>U!~\u0004m\u0019\u0001\u000b2t", "5dc\u000e_0OS\u0007~|f,\u0006\u0018\u001ci\u0002+\u000b", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ConcurrentLinkedListNode(N n2) {
        this._prev$volatile = n2;
    }

    private final N getAliveSegmentLeft() {
        N n2 = (N) getPrev();
        while (n2 != null && n2.isRemoved()) {
            n2 = (N) _prev$volatile$FU.get(n2);
        }
        return n2;
    }

    private final N getAliveSegmentRight() {
        ConcurrentLinkedListNode next;
        if (DebugKt.getASSERTIONS_ENABLED() && isTail()) {
            throw new AssertionError();
        }
        N n2 = (N) getNext();
        Intrinsics.checkNotNull(n2);
        while (n2.isRemoved() && (next = n2.getNext()) != null) {
            n2 = (N) next;
        }
        return n2;
    }

    public final Object getNextOrClosed() {
        return _next$volatile$FU.get(this);
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, ? extends Object> function1) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    public final void cleanPrev() {
        _prev$volatile$FU.set(this, null);
    }

    public final N getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == ConcurrentLinkedListKt.CLOSED) {
            return null;
        }
        return (N) nextOrClosed;
    }

    public final N getPrev() {
        return (N) _prev$volatile$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, null, ConcurrentLinkedListKt.CLOSED);
    }

    public final N nextOrIfClosed(Function0 function0) {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed != ConcurrentLinkedListKt.CLOSED) {
            return (N) nextOrClosed;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    public final void remove() {
        Object obj;
        if (DebugKt.getASSERTIONS_ENABLED() && !isRemoved() && !isTail()) {
            throw new AssertionError();
        }
        if (isTail()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
            ConcurrentLinkedListNode aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
            do {
                obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
            } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, aliveSegmentRight, obj, ((ConcurrentLinkedListNode) obj) == null ? null : aliveSegmentLeft));
            if (aliveSegmentLeft != null) {
                _next$volatile$FU.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(N n2) {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, null, n2);
    }
}
