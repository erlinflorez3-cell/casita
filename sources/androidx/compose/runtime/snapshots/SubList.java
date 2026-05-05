package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDR\u0003|İI\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lsA0RnP.XS2\u000fy{<$a&yCIq\"}(\u0010WNu\u000fvJ`\u000bK\u000f\u0014?\u0001j2P[xs܈74HģM2}uM;pt|\u0004N2bY\n\u000f\u000f\u001bBN x\u000bC\u0002È@2PtHU%M3\u001e\"\nL%\u0019\u001e\u000bkߑ:Hzc\u0003B1\u0012\u0002B|7\u00104\u000b^%F\u000b܋S\u000bҐ\"+NI}03b\u001b\u0007\u0001no\u0007M\u0006U\u0005\u0017+W/W\u0005o6\u000fÜZ)ۣS\rk\bnx\u0013gx\fU;\u007fgYd&(&~,\u0017J\u001b&\f7J>-PǑ6&y\t;gNf\u001a^p\u0010+kD.=\u0006C-I\u001b\u001dϟ\u0010S_b\u007f\u0002\u0013&6#/\u0002go\u001d\"n/3T&aaUNN`N@ԯ\u0004о\u0004Ͳf\u00028\u0016x[\u000eJ\u0014\u0011\\'UAiP;'{\u0004XD\u001eϸ3x/g2fV\\:nLճZ\r\u001an\\d3o\u0017ԐX¯\u0015M*qO\u0011\u001618\\&@Q)\u001e_gh Ҕ\u0014qܦ)/tV\"ty.o9\rC{e,\u001dos\u000f\u001aO>r\u0005\u000f٨puRȮ\\p5@k\u0003\u0010&\u007ftR\u001a$J?(ʉz@֞\u001d\\#gK*Pe\u0015\u000fo\\x\u00105ԞaII}l\t\u0017%hb\u0001qwx\u007fؓ+\u0006R1OeM\u0019TYh||\u00101-\u0017s.W\u0018PU]\u0005\u0016,ɝB4ک\u001e9_A\u0006'\u001d&A20=uV\u0001|iS\")\u000b|0Ҹi\u0001t{P}~Txj\u0001֢\u0005\u001b0\u000bvrQ\f+\u0014\u05fbeF\td,h\u0019\u0005VI!\u0013\nF\\O\u0015\u000b/ 5\u0001&ܲ+MsWo9$\",/K˕\u000em}B\u0012b=*%i\u0012={\u0016&̥\u0018ϸ2֑<Ig*\u0007>2\u0019\u001bHXl\b\bxކb\rcLOg\tVfQ;3\fk\u001f,;t\u001do\u0003\u0019}+L.\u000e=:CN lJ=\u0011{W>Ɲoљ`\u000bR\u05faZ \n2\u0007\u0018,?0V\u000eł72Ӓw\u001e>\u05cdSd\u000bD\u0017-\u0005HJ\u0013#C\u0003m6\u0014\t\n^_=\u001bp\u0013JŀbոX~dƇ`\u0007fQn.z\r\r\u001dK\u001e'9\b܍yܑX/kѢݕWK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004>J*?yCs", "\"", "", ">`a2a;%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "4q^:<5=S,", "", "Bn8;W,Q", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($Vp5\u0016c\u0013R\u00056\u001d02oM", "=eU@X;", "5dc\u001dT9>\\(e~l;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwOH\u0003r,5z5V\"", "\nrTA \u0006\u0017", "Ahi2", "5dc \\A>", "u(8", "AsaBV;N`\u0019", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "D`[6W(MS\u0001\tyb-\u0001\u0007+t\u00042\u0005", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SubList<T> implements List<T>, KMutableList {
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public SubList(SnapshotStateList<T> snapshotStateList, int i2, int i3) {
        this.parentList = snapshotStateList;
        this.offset = i2;
        this.structure = snapshotStateList.getStructure$runtime_release();
        this.size = i3 - i2;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i2) {
        return removeAt(i2);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i2) {
        validateModification();
        SnapshotStateListKt.validateRange(i2, size());
        return this.parentList.get(this.offset + i2);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i2 = this.offset;
        Iterator<Integer> it = RangesKt.until(i2, size() + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(obj, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!Intrinsics.areEqual(obj, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t2) {
        validateModification();
        this.parentList.add(this.offset + size(), t2);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public void add(int i2, T t2) {
        validateModification();
        this.parentList.add(this.offset + i2, t2);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends T> collection) {
        validateModification();
        boolean zAddAll = this.parentList.addAll(i2 + this.offset, collection);
        if (zAddAll) {
            this.size = size() + collection.size();
            this.structure = this.parentList.getStructure$runtime_release();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i2 = this.offset;
            snapshotStateList.removeRange(i2, size() + i2);
            this.size = 0;
            this.structure = this.parentList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i2) {
        validateModification();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i2 - 1;
        return new AnonymousClass1(intRef, this);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1 */
    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0013\bӵLc\u0003\u0003I\u00066\f6B\r+4\u0012}\tnjG6LeN1zRճ\u0015s\u0012éTa4sS;\fڼ,!Qb\\g\u007fnx[;G\u001d\b.x!ߚ\u0010iޯa\u0012\u001d5\u000bvM7eok>'ұ6M&@(Py3\u0006`>\u0011\u001c\u0005\u0002[KB۵vϢpĐV\r[\rb\u0018\u0014G8\u0001Lf.b~SzhR/YɅ0VĚ+_>\u0005\u0016\u0013T`?\r%kd?\t=C\"=S1\b\u0019o\b\u0016M\u007fU\u0005\u0017(W/Wuo6\u000fÜZ)ۣS\rku͏`\u0014"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\r8\u0005O\u0005\u001f\u0017\u0011}\u00178\u000238c\r.\u0001[&+4GIzr%\u0019vp\u001d\u0016c9J\u00061T\u000b\u001a", "", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~J\b$6C", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgA<5=S,", "", ">qTC\\6Na", ">qTC\\6Na|\by^?", "@d\\<i,", "Adc", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {
        final /* synthetic */ Ref.IntRef $current;
        final /* synthetic */ SubList<T> this$0;

        AnonymousClass1(Ref.IntRef intRef, SubList<T> subList) {
            this.$current = intRef;
            this.this$0 = subList;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.$current.element >= 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.$current.element + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i2 = this.$current.element;
            SnapshotStateListKt.validateRange(i2, this.this$0.size());
            this.$current.element = i2 - 1;
            return this.this$0.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.$current.element;
        }

        @Override // java.util.ListIterator
        public Void add(T t2) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.$current.element < this.this$0.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i2 = this.$current.element + 1;
            SnapshotStateListKt.validateRange(i2, this.this$0.size());
            this.$current.element = i2;
            return this.this$0.get(i2);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Void remove() {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public Void set(T t2) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public T removeAt(int i2) {
        validateModification();
        T tRemove = this.parentList.remove(this.offset + i2);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i2 = this.offset;
        int iRetainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i2, size() + i2);
        if (iRetainAllInRange$runtime_release > 0) {
            this.structure = this.parentList.getStructure$runtime_release();
            this.size = size() - iRetainAllInRange$runtime_release;
        }
        return iRetainAllInRange$runtime_release > 0;
    }

    @Override // java.util.List
    public T set(int i2, T t2) {
        SnapshotStateListKt.validateRange(i2, size());
        validateModification();
        T t3 = this.parentList.set(i2 + this.offset, t2);
        this.structure = this.parentList.getStructure$runtime_release();
        return t3;
    }

    @Override // java.util.List
    public List<T> subList(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i4 = this.offset;
        return new SubList(snapshotStateList, i2 + i4, i3 + i4);
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }
}
