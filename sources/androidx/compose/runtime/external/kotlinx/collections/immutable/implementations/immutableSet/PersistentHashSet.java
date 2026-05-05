package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PersistentHashSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpA0JmP.`o2şs{J$c$wCCU(\u0007*\tUOog|pb\u000bI\u0010\u000e\u0016\u000fj4I[yc܈%˰`\u000fg5SڎK8\u0011zF\u000702h7(\u00051 :J vABy\rJ/_1Sb\u0017[\u00072\u0018\u0016@0\u0001Tձ\u0016QFLzaR/Q\bݦFN5ex\u0016[\u0018^Z7\u000f\u0007aTѨn8e\u00193_\u001b\u0007\t¹\u0006\u0017ӭu=\u0013uoA9W\f]FZ\u0010\u0014Kۀ}\u000e\u000e|4k\u001dWp\u000e7+\u0006Ҫy`T<@\u0007\n\u001eT\n\u001e\b7HdƦHxN\"{\u0001\u0001fXV\u0012`R\u007f1ʨd\u0018k\u0014{?G/~Q\u0010PIRE\b\u001d\rTŀGͰ!ƟX\u000en+ch\u0006hIQnRxX\u0018hUs\u0014rr\u0002`ʶ^WFCD\u001e</==k;3!\"ȵv].Џ\u0005)\u0002a\u0004jNP$~\u0016mѧ7\r\u000bHr\u0011\u0004P\u000bАr%ܖ T\u0015\u000bP3.w\u0010B1' N\u0006Ŗ\u0018k}m\u0018AGrG[~kDãI`C5\u007fx>~\u0019\u000b\\YJ}\u001d^vDc\f\u0011٢V#bRx\u001f\u0010\u0002TP\u001c\u0013hŭ ,z@y3j3`\t.DQ|?ݠ\ti@\tbB<\ty&\u0005\t7ˆ\u000b\u00016{Ia:~x(=Ca5Oğ\u0004%?ؕ~ɠ\u000b\u0005{Ò_iRNZtf\bc\u007f8\u0016H>(Ȕ?т\u0013\u00051Ʌ\u001a/KU\u0001oˡQ2"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001b5", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fKd%D/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017\u0002", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEY5", "Ahi2", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwBD\u0010VC\u0004\u0003E)QPX_O+\u00056", "5dc\u001bb+>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIV}G\t^dN-h/c^y\u001d", "5dc \\A>", "u(8", "/cS", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u0001\u000eBxtPe\u0010P\t\u0003uP~", "/cS\u000e_3", "3kT:X5Ma", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017j&\u0012?o\u007f\f#c", "1kT.e", "1n]AT0Ga", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Gat\u0006\u0002", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@dc.\\5\u001aZ ", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentHashSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    private final TrieNode<E> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    public PersistentHashSet(TrieNode<E> trieNode, int i2) {
        this.node = trieNode;
        this.size = i2;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> add(E e2) {
        TrieNode<E> trieNodeAdd = this.node.add(e2 != null ? e2.hashCode() : 0, e2, 0);
        return this.node == trieNodeAdd ? this : new PersistentHashSet(trieNodeAdd, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> addAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> remove(E e2) {
        TrieNode<E> trieNodeRemove = this.node.remove(e2 != null ? e2.hashCode() : 0, e2, 0);
        return this.node == trieNodeRemove ? this : new PersistentHashSet(trieNodeRemove, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Function1<? super E, Boolean> function1) {
        PersistentSet.Builder<E> builder = builder();
        CollectionsKt.removeAll(builder, function1);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> retainAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).node, 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).getNode$runtime_release(), 0);
        }
        return super.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet.Builder<E> builder() {
        return new PersistentHashSetBuilder(this);
    }

    /* JADX INFO: compiled from: PersistentHashSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4ߚ\u007f\u0007|jA0JfN\u008dSiճ?k*3d`*qٴ?U(}j ]R\u007fm~Lj\u000b\n\u00154\u001b\u0019l2Hc~$܈Ƥ6BuF\u0004_}>Qf\u00058\u0015 `%f{[В\u001cݵL\u0010~ٙŸO\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001b\u001ezfBE \u001du#$>", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001b5", "", "3l_Al\u0016?", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017\u0002", "\u0013", "3l_Al\u0016?\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentHashSet.EMPTY;
        }
    }
}
