package kotlinx.coroutines.internal;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r)4\u0012}\u0007njG6LeN2ZS@\u000fsڔ<$i-yCAY\"}0\tWNmgvJh\fKƤ\u000e\u0016\u000fj4I[xc0%˰j{E\u074c[ne?pvF\u0005f1P\u0600*\u000b\u0011\u001c:HVu)C{\f@1\u0001\u0010JV\u001bO\u001d\u001a@\tN&\u000f\"tid5~Ǎm>=(\u001bipTϮc2\u0003T\u001bN\u001d2\u001b\by\u001eYO}ߎչ)S\t\u0019\u001bfM\u0016Wqk\u0014/ѧݳ/Iyk~x\u000e)-+}#\u000ev4s\u001dQ\u000f\u0012W1]{cR$'&\u0014,\u0011J\u001e&\u0006UctQbj\u0016*Kt!i\u0011^\u0010`Z\u007f)dl\u001b{Ķ5ڢ=\u001bnϟ2K'WO{3\u0013tŧ\u0003ͼ%_l\u0010f\u001f)_HX?]X=v[`Բ?>\u0016~p\u001a*2?}T\u0006ɜ\u0013ѧ\u001b)O]?1/{ɞLa"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?b{0Dz\u00167\\*?t:\u001e\u0014OeG\u0016L6Mv|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E)\u000b&tQw\u0019Cv45XS", "7c", "", ">qTC", ">nX;g,Ka", "", "\nh]6g\u0005", "uI;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~G}\"?m\u001f=#'~\\", "<t\\/X9(T\u0007\u0006\u0005m:", "5dc\u001bh4;S&h{L3\u0007\u0018=", "u(8", "1kT.a,=/\"}eh0\u0006\u0018/r\u000e", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "7rA2`6OS\u0018", "", "u(I", "Bqh\u0016a*)]\u001d\b\n^9\u000b", "Bqh\u0016a*)]\u001d\b\n^9\u000bG5o\u000f/\u007fI\u0014\u0011\u0015Q|\u0018L\u0006)>Y\f\u001a5w#.", "2dR\u001db0Gb\u0019\f\t", "2dR\u001db0Gb\u0019\f\t\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/W\b-7", "=m2.a*>Z z\nb6\u0006", "", "7mS2k", "1`d@X", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "=mB9b;\u001cZ\u0019z\u0004^+", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {
    private static final /* synthetic */ AtomicIntegerFieldUpdater cleanedAndPointers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long id;

    public Segment(long j2, S s2, int i2) {
        super(s2);
        this.id = j2;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    private final /* synthetic */ int getCleanedAndPointers$volatile() {
        return this.cleanedAndPointers$volatile;
    }

    private final /* synthetic */ void setCleanedAndPointers$volatile(int i2) {
        this.cleanedAndPointers$volatile = i2;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return cleanedAndPointers$volatile$FU.addAndGet(this, SupportMenu.CATEGORY_MASK) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean isRemoved() {
        return cleanedAndPointers$volatile$FU.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i2, Throwable th, CoroutineContext coroutineContext);

    public final void onSlotCleaned() {
        if (cleanedAndPointers$volatile$FU.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cleanedAndPointers$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == getNumberOfSlots() && !isTail()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
