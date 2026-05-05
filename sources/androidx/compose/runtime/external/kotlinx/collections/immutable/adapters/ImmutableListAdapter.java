package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDZc|\u0004O$8\u000b4C\u0007\":\u0018\u007f\u0007lkA0RnP.XU2\u000fy\u0018<$a$yCI٥\"}(\u000fWNu\u000evJ`\u000bK\u000f\u0014>\u0001j2K]xk\u001e\u0017˰HģU\u074cuqCʠnsf\u000b0428@\u0004/\u001aZN x\u000bC\u0012\u000b@1\u0001\u0002J\\\u001bO\u001d \"\bN 7Ȧ\u000bhߑ:Hz`\u0003C1\u000b\u0002B|0\u00104\u000bW%F\u000b܋Sȏbӿ/@E@]:a\u000f\u001fR\nH3I\u007fJ\u001dn7);I*ɎdfFЃ\u0014s`\u001bl\u000b&\u000b\u000e\u0002f\u001a7CQyJ~\u001fnÒzD!J\u0016&\u0006]Ξ^1(y \u000eay9ԶAг\u0006^P\u0014CgD,=\u007fa0\u007f//eoQ1Ne\u00015\u0011,-\u0019nWż\u001b\u05ec_ڠ\u001fT\u0006hyXNU`N8b\u0004о\u00039o\u0010C\u001c6W\u0002?{GфE?}ٚ:k5y\u001d`D\u0016{5dv]\u0002R~ؗhÙ\u0015֖.\t\u001aq\rq\u0013\bhZh.!MR\u03815\u001bNˍ\u001f%\rJ==\u0016^Qxi!ܔ\f'U3tJqn\u001a\u0013\u001e߁]{Q_\u0002(gbx$?rϵ3X\u0017Fa+r\\V'bLx0\u0010{rSR'zE\u007f=L,_;#)\u0019\u0015,DY\u0003\u0019ajhFз\u00034zѳk˨x\t\tˆ-\u0001}k\u0011IZ\u00027Č0ۮU91([(v;ē'*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\nM'\u0018\u0014YN28(?'\u0018;E~Bhg\u0010$\u001d\u0011ilMe\u0010TO", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n+;-\u0017\u0002", "", "7l_9", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "Ahi2", "", "5dc \\A>", "u(8", "1n]AT0Ga", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "", "3pd._:", "=sW2e", "", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "6`b566=S", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "BnBAe0GU", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImmutableListAdapter<E> implements ImmutableList<E>, List<E>, KMappedMarker {
    public static final int $stable = 8;
    private final List<E> impl;

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.impl.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.impl.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i2) {
        return this.impl.get(i2);
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.impl.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.impl.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.impl.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.impl.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return this.impl.listIterator(i2);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableListAdapter(List<? extends E> list) {
        this.impl = list;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList, java.util.List
    public ImmutableList<E> subList(int i2, int i3) {
        return new ImmutableListAdapter(this.impl.subList(i2, i3));
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.impl.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.impl.hashCode();
    }

    public String toString() {
        return this.impl.toString();
    }
}
