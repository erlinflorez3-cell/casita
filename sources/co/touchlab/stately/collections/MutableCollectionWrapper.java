package co.touchlab.stately.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&˛\bDR\u0001|\u0004G\f8\u000b<H\u0007\"2\u0013\u007f\u0007tsA0JgP.`o2şs{B$c$wECU(%*\tUPmu\u0005Ϻ\u0003\rIƤ\u0014\u0015)p<Kex$\u0011=2\u0003\u0003O?[pUApvF\u0005V݅87(\u0005в\u001e*V\u0012?\u000eQW$\u0012^M!>`\u001be\u0005PŇLRŋ\u0005\u001ejv\u0017JV|u:]03sP_?e@~]\r|ÖU\u001f=uf1NJM\u0015SgI\u001b\u001boM\u0018Wqk\u0012\u0019+59as\u000e̬\u001fó\u0014Ʀ/O\u001bl;:j\u001bi`:4[Yq\\h\u00148y\u000b{Cɝ2 L;\u00114;1~\b<@;\u0007\u001cM^\u001avH\u0010|q6Mӛ.Lqݤ\u001b/doU1Ne\t5\u0011,1\u0019nWż\u001b\"\u05ce\u0019\u001bb\u0007\u001aE_[UH|\u0017\nG{\u0015\th\u0012,\u00140}ĉ]\u000eWB_9EwQ#Ox2RRx\u000f\u000bpjci\t̲n45*\bJ\u0017\rrLt\u0007{P\u000bАB\u0010{\u001c+Ͷ\nݔ\u0017,dɼT#+\u0013\\S\tkpRk\fuGt=qt{\u0010g9\u0015ڨcQ\u001aP8ׯx݀C@z\u0007^mPW\\lj0:2vsFLR\u0380Pܟ\u00176Ws\">:<ǲ`2"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG\bG|\u0012+TC\u0019u;%\u0015fp=\u0011l\u001e[r2RL[\u0002", "\u0013", "", "-b^9_", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ8", "5dc,V6EZW\r\nZ;|\u0010C_}2\u0005>\u0011$$Gx\u001d6t/<`}\u001eFq 7[", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "Adc,V6EZW\r\nZ;|\u0010C_}2\u0005>\u0011$$Gx\u001d6t/<`}\u001eFq 7[", "1n[9", "5dc\u0010b3E", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "7r4:c;R", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@dc.\\5\u001aZ ", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class MutableCollectionWrapper<E> implements Collection<E>, KMutableCollection {
    private Collection<E> _coll;

    public MutableCollectionWrapper(Collection<E> collection) {
        this._coll = collection;
    }

    private final Collection<E> getColl() {
        Collection<E> collection = this._coll;
        Intrinsics.checkNotNull(collection);
        return collection;
    }

    @Override // java.util.Collection
    public boolean add(E e2) {
        return getColl().add(e2);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return getColl().addAll(elements);
    }

    @Override // java.util.Collection
    public void clear() {
        getColl().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return getColl().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return getColl().containsAll(elements);
    }

    public int getSize() {
        return getColl().size();
    }

    public final Collection<E> get_coll$stately_concurrent_collections() {
        return this._coll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return getColl().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return getColl().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return getColl().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return getColl().removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return getColl().retainAll(elements);
    }

    public final void set_coll$stately_concurrent_collections(Collection<E> collection) {
        this._coll = collection;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
