package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|\u0004O$8\u000b4B\u0007\":\u0018\u007f\u0007lkA0RnP\u008cZS8şs{:*c$\u007fiCU }*\t]vogtP`0YƤ$0!n2կcw{\u0011?8RqO3\u0014nk9\u0011zF\u000702h7(\u00069\u001cDc,\u0014;HQ\u000eܘ4@~<\u001b\u001e[\f2\u00124FP\u0007,e\u007fPLG\u001bg\u0001Ǚ#K}PY?_fŧ}\u0011T`?\r%edҏ@˝9\u00153`K\r`iW\u0003mu\u0004\u00191:5:as\u0006:\t\u0004\"%COCƞ9:ػ\tQn\u001do8]ucV\u001e*\bz2Ȟj\u0017TΑ'\u0011A;.~\b<7%vaPh\u0002\u0015ۍF\u000fˋ:\u00173\u0011{7G0~Wq=)Nmަ3#d7I\u0003/pl\u0014p\u0017+T.\u0383_gpAVZ\"YkqJ\u0005+\u001e8\u001bHM\u00101\f\u0011dϏS8\f=19\u0004\u0002vH\u0018z\u0013y\u0001S\u0018V\u000fTr~$:B\t:^\u001b\u0085\u0007\u07fbTXp.\u0017R*ZΞ\u0002&"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fKT/<`}\u001eFq 7#", "", "u(E", "Ahi2", "", "5dc \\A>", "u(8", "3pd._:", "", "=sW2e", "", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "6`b566=S", "7mS2k\u0016?", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "\u0011n\\=T5B]\"", "\u0017sT?T;H`|\u0007\u0006e", "\u001ahbA<;>`\u0015\u000e\u0005k\u0010\u0005\u00146", "!tQ\u0019\\:M", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private static final int maxArraySize = 2147483639;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u0012\u007f\u0007lzA0RnP\u008cZS8+s{:'aҖrYП\u0006\u001a,!ITTg̊rJh\u000b\f2\u0014\u0019\u0011jZM\u0006|k\u0017'2pqo7[uU9\u000fvf\t.9:8(\u0007GɝݵL\u0010|\u0003\ff\u001a\u001bH@\u001f>\u0003\u0011[\u000f2\u00124@P\u0005,c\u007fNdJ3җƠ3#\tt\u000bi5kH|{\u0011vX5\u0017\u000faL-p;C\u001c=S1\t\u0019¹ύ\u0007?wJM\f55CI\"[f\\\u000e#-+}\u000f\u000ev4l\u001dQ\u000f\u000eW/]jcP<*>\u07beԫ\u0011<\n\u001fNBV@E\u001a\u0015\n>7\u0003\u0006k@~\u0004\u000fF\u000e\u000fy6E'Fđڢ=\u001blf*^'dO{3$N+\u000f\u00079_d\u000ef\u0016Im(Y?kXAXN\u0010Zk\u0007J͏Ċ\u0006*\nK\u0010\u0017=\u0018).E'gcG;9o\u0012HJh%\u001e'åרmRN]rz$8B\t:\\\u001bߢW\u07fbTT`\u008cҳQ:"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])Ch<}Au!*VGEt\n", "", "u(E", ";`g\u000ee9:g\u0007\u0003\u0010^", "", "1gT0^\tHc\"}\tB5{\tBe\u000e", "", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "Ahi2", "1gT0^\tHc\"}\tB5{\tBe\u000ef\u0002J\u0010\u001e\u001bPi\u001cKu,9V", "1gT0^\fES!~\u0004m\u0010\u0006\b/x", "7mS2k", "1gT0^\fES!~\u0004m\u0010\u0006\b/x>.\u0006O\b\u001b A}\u001d;})2", "1gT0^\u0017Ha\u001d\u000e~h5`\u0012.e\u0013", "1gT0^\u0017Ha\u001d\u000e~h5`\u0012.e\u0013f\u0002J\u0010\u001e\u001bPi\u001cKu,9V", "1gT0^\u0019:\\\u001b~^g+|\u001c/s", "4q^:<5=S,", "Bn8;W,Q", "1gT0^\u0019:\\\u001b~^g+|\u001c/s>.\u0006O\b\u001b A}\u001d;})2", "<df\u0010T7:Q\u001d\u000e\u000f", "=kS\u0010T7:Q\u001d\u000e\u000f", ";h]\u0010T7:Q\u001d\u000e\u000f", "<df\u0010T7:Q\u001d\u000e\u000f\u001d2\u0007\u00186i\t\"\nO\u007f\u001e\u001bD", "=qS2e,=3%\u000fve:", "", "1", "", "=sW2e", "=qS2e,=3%\u000fve:;\u000f9t\u0007,\u0005:\u000f&\u0016Ns\u000b", "=qS2e,=6\u0015\r}<6{\t", "=qS2e,=6\u0015\r}<6{\tmk\n7\u0003D\n\u0011%Vn\u0015@s", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i3 + ", size: " + i4);
            }
            if (i2 > i3) {
                throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: " + i3);
            }
        }

        public final void checkElementIndex$kotlin_stdlib(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
            }
            if (i2 > i3) {
                throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
            }
        }

        public final int newCapacity$kotlin_stdlib(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - AbstractList.maxArraySize <= 0) {
                return i4;
            }
            if (i3 > AbstractList.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return AbstractList.maxArraySize;
        }

        public final boolean orderedEquals$kotlin_stdlib(Collection<?> c2, Collection<?> other) {
            Intrinsics.checkNotNullParameter(c2, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c2.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c2.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(Collection<?> c2) {
            Intrinsics.checkNotNullParameter(c2, "c");
            Iterator<?> it = c2.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000ejLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?1JͯJDɟ\u00040\u001fm\f4ZӋRp\u0004>ڈ\u001e}0\t\u0018Uun\u0007J\t\u0013\nƻ\u0006^\u0005x5aU/زXƘ2Բs?AW@UGa\r63\"\tķDѩ\t\r\"ݒ`\u0012|}QO,\u00146E~@Ŏ\u0011X"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])Ch<\u0004Fm#*\\MHO<)\u001c>", "", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n\\\u0014%V|\n:\u0006\f9g\ruz^", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private class IteratorImpl implements Iterator<E>, KMappedMarker {
        private int index;

        public IteratorImpl() {
        }

        protected final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i2 = this.index;
            this.index = i2 + 1;
            return abstractList.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        protected final void setIndex(int i2) {
            this.index = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>36Ȑ\u0007\":\u0018\u007f\u0007ljA0RnP.XV0Ųm\u0012éTeRp\u0014Ae\u001c\u000e\"?ѧ|g\u0018tZ\\\u001bCEإDy+7YY\u0007_*\u000f`EņC3[s\u0006?nyN\u0005N8hLB\u000b\u000f!BH>yAW\u0014\u0017 8XppĥSaŋ\u001e\u0012\u0014Gh\u0007,f\u007fNdK3qƦ3."}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])Ch<\u0007;{%\u0012\\CHgC(\"LiD\u000e9", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])Ch<\u0004Fm#*\\MHO<)\u001c>", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "", "7mS2k", "", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n\\\u0014%V|\n:\u0006\f9g\ru\u001b1\u0007", "6`b\u001de,OW#\u000f\t", "", "<dgA<5=S,", ">qTC\\6Na", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">qTC\\6Na|\by^?", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
        public ListIteratorImpl(int i2) {
            super();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, AbstractList.this.size());
            setIndex(i2);
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getIndex() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getIndex();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            setIndex(getIndex() - 1);
            return abstractList.get(getIndex());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getIndex() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tpA0JmN.hݷR\u0013qzB#y#\"IKW*}h\b}N\u0018k\u001dKC\u000b\"\u0011F7\tt:Lm~m\u0014\u001f2xnm3]sK=xtd\n060>\u0012\u0005/\u001fݵL\u0010\u0005\u0002\f_\u001a\u001eH@'9\u0003\u0011[\u00122\u00124Cfӌ\u001e֔kNDV=iH7;\u0003\u0018G%ώk݁\u0001M\u0015Ͽ%3\u001bzy\u001eYE\u000eߑ\u0017ȏW\u0003\u000fѸ,Q\u0011B\nC\u0015j7'aH\"W\rݜ\u0002Џ\u0019+WՕ.\u00054e\u001dQ\u000f\u0011]\u007f&ӁMח\u0012,\u0010|\u0002\u0017J\u000fأ\n6"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])Ch<\u000eGj|2[R\u0011", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", ":hbA", "4q^:<5=S,", "", "Bn8;W,Q", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n\\\u0014%V|\n:\u0006\f9g\ru\u001bQY\u001f", "-rXGX", "Ahi2", "5dc \\A>", "u(8", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class SubList<E> extends AbstractList<E> implements RandomAccess {
        private int _size;
        private final int fromIndex;
        private final AbstractList<E> list;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(AbstractList<? extends E> list, int i2, int i3) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.fromIndex = i2;
            AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, list.size());
            this._size = i3 - i2;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i2) {
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, this._size);
            return this.list.get(this.fromIndex + i2);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this._size;
        }
    }

    protected AbstractList() {
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i2);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    public int indexOf(E e2) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), e2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    public int lastIndexOf(E e2) {
        AbstractList<E> abstractList = this;
        ListIterator<E> listIterator = abstractList.listIterator(abstractList.size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), e2)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new ListIteratorImpl(0);
    }

    public ListIterator<E> listIterator(int i2) {
        return new ListIteratorImpl(i2);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }
}
