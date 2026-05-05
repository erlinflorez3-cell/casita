package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PersistentHashSetBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG6LeN/ZS@\u000fs{:%c$\bCCU \u0005*\t]WogtLb\u000bQ+\u000e\u0016~j4Icxe\u0012\u00153JoMZUoC;fҚLӌH4(\u0600\b\u00041 :J vABy\fB6PrJRSL3\u001bR\u0017N*\u000f tm^8Xl\u0014Ž]&ɨmB\\+(C\u000bd%F\u0003?=zo7C@mߎ[9٨\u0007\u0007`u\b\u0017M\rU\u0005\u0017?W5W\u0010o<h\u0002$\u0015a˽;z9:%\u0011_~$-;QsK\u0007ʫVzA\u0010UB\u0012-\u001e'vNs./\u001c\u001cT\rr\u0002X\u0001\u0006l[\u0018z\u0018ا]Ӳ\u007fĴ/9)\u0001\u001auI;f7*\u001d=(1\u001d\u0007'kV\u001e`KÑ\u0003\u0015\u0018E\u001aMKkf\u0010i?}\u0004'ç0NJΙGHB\n6F\u0017SO\f=1:\u0004\u0002~ֳ.\u000bݶdha\u0004\u001b\\NH\u0007\u0016eB9\u0016h`|\u000b{RdXbҊ{9\u001b\u001bF\u001c!Gtwj9U\u001a\\k\u0001ozOm\n[Ä\u0015T \u0003<*e@v3cW\u0014\u0014oW\u000f\u0014mB!E/٩Nΐ\u0010`d̥:4Nr\u001e\u0001Ll\\\u0017+8Os,4bջGfER\u0011#ZG\r\u000boZ\u001fɭ-^qdYǮ0ڲ\r\u0007Xʔ\tqm\u0005W9M|0<YQc'VY0mL|Q\u0015=4Vùs֙KRtֵ\u000eW\u00020$+\nc=?+\u0015\u000f+B\u0002cզzu<ʻYɟ+z\u0005Ȫ_]vA\u007f\b\u0019v\\dx\\gTE(53Iד\u0014ܐ\u0004\u0006i¿\u0013Iih\u0019d^Kx\u0018gRҧ<%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001b<-`A9$!G", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017j&\u0012?o\u007f\f#c", "Adc", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001b5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwBD\u0010VC\u007fuN7lTh_\u0003V$Ap-R\fnr +", "\nrTA \u0006\u0017", "", ";nS\u0010b<Gb", "5dc\u001ab+\u001c])\b\n\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(8", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEY5", "<nS2", "5dc\u001bb+>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIV}G\t^dN-h/c^y\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8,G.\u0004)M\t?w\u0015u(\u00175w~EZ\u001b\u001d", "=v]2e:AW$", "5dc\u001cj5>`'\u0002~ij\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0016\u0014YN-jK\u0001\u0007\u0018;E~?o\u0005\u001b*wGspOd\u0013K\u0005j", "D`[BX", "Ahi2", "5dc \\A>", "Adc \\A>", "uH\u0018#", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "3kT:X5Ma", "", "0tX9W", "1kT.e", "", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@dc.\\5\u001aZ ", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentHashSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private int modCount;
    private TrieNode<E> node;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private PersistentHashSet<E> set;
    private int size;

    public PersistentHashSetBuilder(PersistentHashSet<E> persistentHashSet) {
        this.set = persistentHashSet;
        this.node = this.set.getNode$runtime_release();
        this.size = this.set.size();
    }

    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.size;
    }

    public void setSize(int i2) {
        this.size = i2;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentHashSet<E> build() {
        PersistentHashSet<E> persistentHashSet;
        if (this.node == this.set.getNode$runtime_release()) {
            persistentHashSet = this.set;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet<>(this.node, size());
        }
        this.set = persistentHashSet;
        return persistentHashSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int size = size();
        this.node = this.node.mutableAdd(e2 != null ? e2.hashCode() : 0, e2, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        PersistentHashSet<E> persistentHashSetBuild = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSetBuild == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSetBuild = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSetBuild != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<E> trieNodeMutableAddAll = this.node.mutableAddAll(persistentHashSetBuild.getNode$runtime_release(), 0, deltaCounter, this);
            int size2 = (collection.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                this.node = trieNodeMutableAddAll;
                setSize(size2);
            }
            return size != size();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSetBuild = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSetBuild == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSetBuild = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSetBuild != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            Object objMutableRetainAll = this.node.mutableRetainAll(persistentHashSetBuild.getNode$runtime_release(), 0, deltaCounter, this);
            int count = deltaCounter.getCount();
            if (count == 0) {
                clear();
            } else if (count != size) {
                Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.node = (TrieNode) objMutableRetainAll;
                setSize(count);
            }
            return size != size();
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSetBuild = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSetBuild == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSetBuild = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSetBuild != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            Object objMutableRemoveAll = this.node.mutableRemoveAll(persistentHashSetBuild.getNode$runtime_release(), 0, deltaCounter, this);
            int count = size - deltaCounter.getCount();
            if (count == 0) {
                clear();
            } else if (count != size) {
                Intrinsics.checkNotNull(objMutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.node = (TrieNode) objMutableRemoveAll;
                setSize(count);
            }
            return size != size();
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).getNode$runtime_release(), 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).node, 0);
        }
        return super.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = size();
        this.node = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        TrieNode<E> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentHashSetMutableIterator(this);
    }
}
