package co.touchlab.stately.collections;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|\u0004O%8\u000b4F\u0007\":\u0012\u007fјnjG6LeN/ZS8\u0018sڔ<$i@yCAY\"}02WNmltϺpŏk\u0011\fǝ\u0007i\\Oezm\u0012U1poo9]qM9'sd\u0006`C2B\b\u0007\u0019 :J v1ŏy\rܘ4@~=\u001b([\f2\u00124FP\u0005,e\u007fNdR\u001daH:;\u0003 ĩ\u0015;ۢ4|[\u0019\u000fp5\u001a\u000faL9p;C\u001e=S1\u0011\u0003eM\u0012WwM\u0007x']Ǣw\u0004\u001eJ!\u0014\"&COCƞ#*j\u000ei`:1qթcׂT\u000e6\nC\u000f\u001bO\u001c\u000e41x2;%~\bDޗ;\u0007ՂDP\u0010r\u000b\u0013\tvN\u0017S\nc/G&~Q\u0018ݢ_bѼ\u007f\u0005\u001b2k\r|7sZ\u001eb%\u001b\u000bȭ\u007fH\u0018T\u0006\\\\ qC}\u0006\u0001b8Ï2Gw\u0004=\u0005).E/}o\u00026/\u0004\u001aHzϙ'\tnqki\u0001R\u00076å\u001a78\u001bTvR}\u001dk\u0007ӹ\t0\u001fV4T5\b8\u0017.g\u0010<WطVʱOŹmj[wRA=\u0002O_~m\u001eWoӔa6\u0002g\u001e}jvBIlf\u0013u~B\u0002\u0016!px@@J\u0003\u0016\b}TNBƎ`@Hʊ@Ϝ5%dé`\u0005$FO\u0002)a`n\u001e\u0002Շ7B"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG\bG|\u0012+TC\"oB-\u0007u]D\u0012c9$", "\u0013", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG\bG|\u0012+TC\u0019u;%\u0015fp=\u0011l\u001e[r2RL[\u0002", "", ":hbA", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0019\\:M\u0012'\u000evm,\u0004\u001d)c\n1yP\u000e$\u0017P~\b:\u0001,<Y{/;w\u001f<", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0019\\:M\u0012'\u000evm,\u0004\u001d)c\n1yP\u000e$\u0017P~\b:\u0001,<Y{/;w\u001f<", "/cS", "", "7mS2k", "", "3kT:X5M", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "", "3kT:X5Ma", "", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,\u001ab", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MutableListWrapper<E> extends MutableCollectionWrapper<E> implements List<E>, KMutableList {
    private List<E> list;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableListWrapper(List<E> list) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        this.list.add(i2, e2);
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.list.addAll(i2, elements);
    }

    @Override // java.util.List
    public E get(int i2) {
        return this.list.get(i2);
    }

    public final List<E> getList$stately_concurrent_collections() {
        return this.list;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.list.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.list.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.list.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return this.list.listIterator(i2);
    }

    @Override // java.util.List
    public final /* bridge */ E remove(int i2) {
        return removeAt(i2);
    }

    public E removeAt(int i2) {
        return this.list.remove(i2);
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        return this.list.set(i2, e2);
    }

    public final void setList$stately_concurrent_collections(List<E> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return this.list.subList(i2, i3);
    }
}
