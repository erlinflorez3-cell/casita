package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&˛\bDR\u0001|\u0004O'8\u000b4B\u0007\":.\u007f\u0007ljA0RtP.XS2\u000fy\u0002<$a'yCI٥\"}(\fWNuzvJ`\u0010K\u000f\u0014\u001f\u0001j2J]xk\u0012\u00172HzG3[\u0017E9f|>\u0005.>*8\u007f\u0006\u0017ɝRJ\u0016͌\tB{\u0012\"2Pp\u0001Q;M5 \"\bN G\u001d\u000bh\u00075\u0006-t@C3\u0011wDf1o4\u0003L\u001dF\u000b܋#u\u0010ӜҋD7C\u0018eh\t\u001bbgM\u0005WyM\u0007x']Ǣ_r\u0006:ݼ\u0004\u0014#0\u0010$c\u00076j\u0013Wx\u00167/Ub[PDߊ\u000ey*\u0014ʀ\b\u000e\u0014/\t=3\u001fv\u000e\u00143\u0003{k@~\fެF\u007f\tl~*3\u001dK+g9\u0017UoZ1NmަK!̷'\u0001|A$h\u001c\u0002-\u001b\u0003\u001a\u0002=_FUP^\u000e_<}\u0004'ç0ÏLDU!G{?LG/E~Q)1m\u0012Hzϙ%\t'|\u001co`lX\"\u001d8}>Q hi|\u0005\u001an\u0005\\:0e\u001c\u000b͵D݈\u0013ء`wJAm$\\u\u0001i\u0019k\u000e\u00143R~=ip{\u000e\u000eު\r7{e,\u001coy\u000f\u0014m^\u0013\tf\u000fZS:d%90[`j>\u0016,J\\6+4UpJDr֒\u0019%\u001bV.6Bo\u0007Os#v\u001e+l3R\r\u001a*\u00036\u0019Rro\u001ewAO:+x\"[_\u0018Ia3cQ\u0001:\r%\u0017~*Òu\u0018\u0013ܘL5)\u0004\u0007\u0014 D8iU=\\+\u000f5ǻx\u0016βIL\u0001\u0006\u001aa Y\u0013|(-kt<m r\u00010fiZO\u000bϟPԮ'\u00071:|\u007f(\u007fv\u0005U\u0007l\u0011k@Yr9ʛjR~\u0011M0,X\u0019oXĜe1Q[5\u0016&\u001eڏ\u0019ak\u001f8B\b\u0019'&#\u000446q9\bha_B;nԾ\b\u0003\u00056l}\u0011y`r\b\fR\u000bJ\faXokވZ8[\u001dw!t>D\u0013\u0001Xk:Y(,;Na0rQ6DhQ+)Sci}m\u0012\u00159Q؝\u000e\u000b\nj7\u0018*w8V\u0006\u001eODN\u0005&rY;\u0019ŝl\r2hD<6\u0015ͲXi\u0014EK\u0018Tk'\u0017`LJĪbոX\u0005dƇ`\u0007fRn/J\u0003\u0005\u001eA)IW?\u000b\u0006Nd3s4\u0017RK\u0019Iq&Ƭrު/R\\9)<p\u0003\u0011VkUi\u0004<\u0017U1>\u0004}!P\u0018+3\u0019ȱ'ʦU\u001dgڻH`\u0011lrf\u0005x\u0018\u007f`hr;\r\u0016\u0015\u000ej\u0014E_o۱tƚf1dP}SQ(ݮ\u001b\u0003"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004{<\u0006z", "\u0013", "", "", "Adc", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJr$Tk\"*v4\u000b\u001dn", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ8", "/qa.l", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "1`_.V0Mg", "", "uH\u0018#", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1", "u(8", "Adc,f0SSW|\u0005e3|\u0007>i\n1", "", "5dc\u000ee9:gW|\u0005e3|\u0007>i\n1", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "Adc\u000ee9:gW|\u0005e3|\u0007>i\n1", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "6`b5X:", "", "5dc\u0015T:AS'=xh3\u0004\t-t\u00042\u0005", "u(J\u0016", "Adc\u0015T:AS'=xh3\u0004\t-t\u00042\u0005", "uZ8uI", "Ahi2", "5dc \\A>", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "", "3kT:X5Ma", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "3mbBe,\u001cO$zxb;\u0011", ";h]6`<F1\u0015\nv\\0\f\u001d", "3pd._:", "=sW2e", "6`b566=S", "7mS2k\u0016?", "9dh", "7r4:c;R", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@dc.\\5\u001aZ ", "Bn0?e(R", "\"", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "BnBAe0GU", "", "D`[BX\bM", "\u0013kT:X5M7(~\bZ;\u0007\u0016", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public ArraySet() {
        this(0, 1, null);
    }

    public ArraySet(int i2) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i2 > 0) {
            ArraySetKt.allocArrays(this, i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* synthetic */ ArraySet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public final void setHashes$collection(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final void setArray$collection(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final void set_size$collection(int i2) {
        this._size = i2;
    }

    public int getSize() {
        return this._size;
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator it = ArrayIteratorKt.iterator(eArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] result = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        ArraysKt.copyInto(this.array, result, 0, 0, this._size);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00116B\u0005\"4\u0012\u0006\u0007nʑ?ӇF{߉^Xc,\u001fk2éRZdtٴ?U(}j\u001c]O\u007fg%Ϻ\u000b\u000fQ\u0011\u001e\u0016'mr[Ǥ|] \u0013zP}DKM\u001eCid\u00038\u001d `%~\fڷ\u0005!"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004{<\u0006c\u0015`}(7v%\u0012\\CHgC(\">", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd \u0016G\u0003j8\u0005%45\u000b-3\u0002y=MP7z>+j", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJr$Tk\"*v4\u000b\u001dn", "3kT:X5M/(", "7mS2k", "", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@d\\<i,\u001ab", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int i2) {
            return ArraySet.this.valueAt(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i2) {
            ArraySet.this.removeAt(i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void ensureCapacity(int i2) {
        int i3 = get_size$collection();
        if (getHashes$collection().length < i2) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i2);
            if (get_size$collection() > 0) {
                ArraysKt.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != i3) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    public final E valueAt(int i2) {
        return (E) getArray$collection()[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int iHashCode;
        int iIndexOf;
        int i2 = get_size$collection();
        if (e2 == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            iHashCode = 0;
        } else {
            iHashCode = e2.hashCode();
            iIndexOf = ArraySetKt.indexOf(this, e2, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        if (i2 >= getHashes$collection().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i4);
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes$collection().length == 0)) {
                ArraysKt.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, (Object) null);
                ArraysKt.copyInto$default(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, (Object) null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            ArraysKt.copyInto(getHashes$collection(), getHashes$collection(), i5, i3, i2);
            ArraysKt.copyInto(getArray$collection(), getArray$collection(), i5, i3, i2);
        }
        if (i2 != get_size$collection() || i3 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i3] = iHashCode;
        getArray$collection()[i3] = e2;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i2 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i2);
        if (get_size$collection() != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                add(array.valueAt(i3));
            }
            return;
        }
        if (i2 > 0) {
            ArraysKt.copyInto$default(array.getHashes$collection(), getHashes$collection(), 0, 0, i2, 6, (Object) null);
            ArraysKt.copyInto$default(array.getArray$collection(), getArray$collection(), 0, 0, i2, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final E removeAt(int i2) {
        int i3 = get_size$collection();
        E e2 = (E) getArray$collection()[i2];
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            if (getHashes$collection().length > 8 && get_size$collection() < getHashes$collection().length / 3) {
                int i5 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                ArraySetKt.allocArrays(this, i5);
                if (i2 > 0) {
                    ArraysKt.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, i2, 6, (Object) null);
                    ArraysKt.copyInto$default(array$collection, getArray$collection(), 0, 0, i2, 6, (Object) null);
                }
                if (i2 < i4) {
                    int i6 = i2 + 1;
                    ArraysKt.copyInto(hashes$collection, getHashes$collection(), i2, i6, i3);
                    ArraysKt.copyInto(array$collection, getArray$collection(), i2, i6, i3);
                }
            } else {
                if (i2 < i4) {
                    int i7 = i2 + 1;
                    ArraysKt.copyInto(getHashes$collection(), getHashes$collection(), i2, i7, i3);
                    ArraysKt.copyInto(getArray$collection(), getArray$collection(), i2, i7, i3);
                }
                getArray$collection()[i4] = null;
            }
            if (i3 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i4);
        }
        return e2;
    }

    public final boolean removeAll(ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i2 = array.get_size$collection();
        int i3 = get_size$collection();
        for (int i4 = 0; i4 < i2; i4++) {
            remove(array.valueAt(i4));
        }
        return i3 != get_size$collection();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i2 = get_size$collection();
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Set) obj).contains(valueAt(i3))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i2 = get_size$collection();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += hashes$collection[i4];
        }
        return i3;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            E eValueAt = valueAt(i3);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        ?? r2 = 0;
        while (it.hasNext()) {
            boolean zAdd = add(it.next());
            int i2 = (r2 + (zAdd ? 1 : 0)) - (r2 & (zAdd ? 1 : 0));
            r2 = 1;
            if (i2 != 1) {
                r2 = 0;
            }
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        ?? r2 = 0;
        while (it.hasNext()) {
            boolean zRemove = remove(it.next());
            int i2 = (r2 + (zRemove ? 1 : 0)) - (r2 & (zRemove ? 1 : 0));
            r2 = 1;
            if (i2 != 1) {
                r2 = 0;
            }
        }
        return r2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        for (int i2 = get_size$collection() - 1; -1 < i2; i2--) {
            if (!CollectionsKt.contains(elements, getArray$collection()[i2])) {
                removeAt(i2);
                z2 = true;
            }
        }
        return z2;
    }
}
