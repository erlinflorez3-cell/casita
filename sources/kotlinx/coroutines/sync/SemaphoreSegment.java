package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004O\r8\u000b4B\u0007\":\u0018\u007f\u0007lkA0ZeP.`ݷ2\u000fq\u007f<$i$yCAU\"}0\u0012WNmivJh\fKƤ\u000e\u0016\u000fj4կ]xk\u001e\u0017˰HoU\u074c}uM;ptdӌN1bW\n\t\u000f\u001aBH>w\u000bIY\u000e*2Vohĥ\u001dQ\u0013\u001d*\u0006l$Ә\"^mSDN5nH<;\u0005\u007fA|0\u00104\u000b[%F\u0003+SǿgfDNFM\u0015Sc3\u000b`iW\u0003mum\u000bv8?-_r\u0006?\u001fã\u001a]N]\u001furTo5Un\u001a?+}g{V\u001c<\u0010|\u0012\fj\r>\f5YF/0e6\u0017yφx\u001c[^\u0017vD\u0016y\u0010?G)\u000eAC9Ij\u0002gI*f9\u0012\u0004;'iЮti{b$x\u0015Id(U?_X=vR:_K\u0005\u001crx\u0001X\u001c`K\u000eH\u0014\u0011\\1kK$?1<\u0004\u0002v`.\u000bUlvZ\u0002ZXD2p,6X\u0012:b\u0015v\u0013uhT\u00070G\"rΘ\tą\f\u00178^}G/1ŔRl"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011]\u000eDr08c\u000b %m\u00186MLJA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7c", "", ">qTC", ">nX;g,Ka", "", "\nh]6g\u0005", "uI;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%+PmW*v-1d\u0001*Dm\u0004.OK;tCsx,R", "/b`B\\9>`'", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015#|\u001b8\u000bz", "", "<t\\/X9(T\u0007\u0006\u0005m:", "5dc\u001bh4;S&h{L3\u0007\u0018=", "u(8", "5dc", "7mS2k", "Adc", "", "D`[BX", "1`b", "", "3w_2V;>R", "5dc\u000ea+,S(", "=m2.a*>Z z\nb6\u0006", "1`d@X", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class SemaphoreSegment extends Segment<SemaphoreSegment> {
    private final /* synthetic */ AtomicReferenceArray acquirers;

    public SemaphoreSegment(long j2, SemaphoreSegment semaphoreSegment, int i2) {
        super(j2, semaphoreSegment, i2);
        this.acquirers = new AtomicReferenceArray(SemaphoreKt.SEGMENT_SIZE);
    }

    public final boolean cas(int i2, Object obj, Object obj2) {
        return Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(getAcquirers(), i2, obj, obj2);
    }

    public final Object get(int i2) {
        return getAcquirers().get(i2);
    }

    public final /* synthetic */ AtomicReferenceArray getAcquirers() {
        return this.acquirers;
    }

    public final Object getAndSet(int i2, Object obj) {
        return getAcquirers().getAndSet(i2, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return SemaphoreKt.SEGMENT_SIZE;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int i2, Throwable th, CoroutineContext coroutineContext) {
        getAcquirers().set(i2, SemaphoreKt.CANCELLED);
        onSlotCleaned();
    }

    public final void set(int i2, Object obj) {
        getAcquirers().set(i2, obj);
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}
