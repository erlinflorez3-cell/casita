package androidx.compose.material3.carousel;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
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
/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000ebLc\u000b\u0004I\u00066\u000f6B\r(4\u0012}\u001anjG9LeN/ZS8+s{:$c$\u007fّC٥\"}0\u000eWNmqvJh1K\u000f\f\u0017\u0001j:q]xc\u0015\u0015˰Xģ]n}uM;ptd\u0005N1Z75E\u0014 ݒX\u001a\u0005{[Q\u001c\u0014@@\u001f:\u0001\f̂\t\u001a \b\u0007/\u000f:tg|SxpkXG#1i\tĎ((E\u000bl%F\u0003D=\u0001o>CFG7%%\u0002\u00035s\"ρ\u0002\b\u0003K'\u0001'UHyyeYp\u0002*\u0014YsSƵrnh\u0013vx\fU2\u007fgYj&(&!D\u001cJ+&\u0006UH^1(\u000f \u000ea{9ԶA\u0019\u000elk\u0018z\u00106G)\u000e]C9I\r\u001amIDf7*\u0005=\"1+\u0007!\nzVf#Glw\u007f8\u0018T\u0006W\\7q=\u001c\u000b!f\u0010H\u001c0u\u007fuɜ\u0010v\u001e3es9Q>2ɌG\rk\u00054xh\u0002\u0007\u001bTNR\u0007\u0016eG9\u0010hu|\u0005\u001av\u001de:Ce\"d\t\u000e\bA \u000b+\u0003ư&XZ]\u001d\u0002j{d:)=\u0001OY\u001d\u0012VfG\u0014K5\u007fj@e`\u0015,?jbKֱe\u000b`\u001a\u0011t.24Xj>w*{\u0015ܓ\u0012zT\u007fRL2A\u001bl\u0015v\u0003Lyq\u0001\u0017\brh>\u0006\u001bճ#K\u00072-!\u0007`^\u0001o\u0016xw+-d0fYQc VY0#L|Q\u000eE͵~\u0018vZJdlDu\f@°\u001a\u001eQS5A!\u0014O8@\bEEzyϯUS\u001a\u05fd\u0013~\u007f\u0017Iq~v\u0016t\t,\u000fj\u0001\u0014ݚ\u001b&\u000f`x.\u0016iP\toR\u0013G\u0012[ߏ_DQͿ\u001b[B[F\u0006U.,3\u0019oP|kqϡ+!.y\u001a>#f.x}>\u0012b=-܌i\n4ϣ.qhbk;\fGWk\u0017>P$#G\u074cLn\u0010\nH\u001cB\u0012\u0004WOx\tVfTߵ3\u0004n߿D\u000fvkiCc~\fJF_XsyBљbG=\u0013Sjur>Zj#b\u000f8\u0012֭5t\u001aΒU\"\\pp\u0012\u0001\u0016\u00022NAii[Ì\fӺ80T\n\u0011^brћ\u00147"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001ej", "9dh9\\5>a", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "4ha@g\rHQ\u0015\u0006", "5dc\u0013\\9Lby\txZ3", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn3U\u000b*G{\u00165\u0017);\u007f;\"\u001eh7", "4ha@g\rHQ\u0015\u0006^g+|\u001c", "", "5dc\u0013\\9Lby\txZ3`\u0012.e\u0013", "u(8", "4ha@g\u0015H\\t\bxa6\n", "5dc\u0013\\9Lb\u0002\t\u0004:5z\f9r", "4ha@g\u0015H\\t\bxa6\nl8d\u007f;", "5dc\u0013\\9Lb\u0002\t\u0004:5z\f9rc1z@\u0014", ":`bA96<O ", "5dc\u0019T:M4#|ve", ":`bA96<O b\u0004],\u0010", "5dc\u0019T:M4#|ve\u0010\u0006\b/x", ":`bAA6G/\"|}h9", "5dc\u0019T:M<#\bVg*\u007f\u0013<", ":`bAA6G/\"|}h9`\u0012.e\u0013", "5dc\u0019T:M<#\bVg*\u007f\u0013<I\t'{S", ">he<g", "5dc\u001d\\=Hb", ">he<g\u0010GR\u0019\u0012", "5dc\u001d\\=Hb|\by^?", "Ahi2", "5dc \\A>", "1n]AT0Ga", "", "3kT:X5M", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "", "3pd._:", "=sW2e", "", "4ha@g\u0010GR\u0019\u0012V_;|\u0016\u0010o}$\u0003-| \u0019Ga\u0012Ky\u00139n}", "", "5dc", "7mS2k", "5dc\u0018X@EW\"~V_;|\u0016", "CmP1]<Lb\u0019}d_-\u000b\t>", "5dc\u0018X@EW\"~W^-\u0007\u0016/", "6`b566=S", "7mS2k\u0016?", "7r4:c;R", "7r56e:M4#|ve\u0010\f\t7A\u000f\u0016\u000b<\u000e&\u0001HM\u0018E\u0006!9b}-", "7r;.f;\u001f]\u0017z\u0002B;|\u0011\u000bt_1z*\u0002t!P~\n@\u007f%B", "1`a<h:>Z\u0001z~g\b\u0010\r=S\u0004={", "7sT?T;H`", "", ":`bA<5=S,[z_6\n\t\u0010o}$\u0003-| \u0019Ga\u0012Ky\u00139n}", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeylineList implements List<Keyline>, KMappedMarker {
    private final /* synthetic */ List<Keyline> $$delegate_0;
    private final int firstFocalIndex;
    private final int firstNonAnchorIndex;
    private final int lastFocalIndex;
    private final int lastNonAnchorIndex;
    private final int pivotIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KeylineList Empty = new KeylineList(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: add */
    public void add2(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Keyline keyline) {
        return this.$$delegate_0.contains(keyline);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.$$delegate_0.containsAll(collection);
    }

    @Override // java.util.List
    public Keyline get(int i2) {
        return this.$$delegate_0.get(i2);
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public int indexOf(Keyline keyline) {
        return this.$$delegate_0.indexOf(keyline);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Keyline> iterator() {
        return this.$$delegate_0.iterator();
    }

    public int lastIndexOf(Keyline keyline) {
        return this.$$delegate_0.lastIndexOf(keyline);
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator(int i2) {
        return this.$$delegate_0.listIterator(i2);
    }

    @Override // java.util.List
    public Keyline remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline remove(int i2) {
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
    public void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set */
    public Keyline set2(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline set(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Keyline> subList(int i2, int i3) {
        return this.$$delegate_0.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public KeylineList(List<Keyline> list) {
        int iNextIndex;
        int iNextIndex2;
        this.$$delegate_0 = list;
        KeylineList keylineList = this;
        Iterator<Keyline> it = keylineList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (it.next().isPivot()) {
                break;
            } else {
                i3++;
            }
        }
        this.pivotIndex = i3;
        Iterator<Keyline> it2 = keylineList.iterator();
        int i4 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i4 = -1;
                break;
            } else if (!it2.next().isAnchor()) {
                break;
            } else {
                i4++;
            }
        }
        this.firstNonAnchorIndex = i4;
        ListIterator<Keyline> listIterator = keylineList.listIterator(keylineList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (!listIterator.previous().isAnchor()) {
                    iNextIndex2 = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex2 = -1;
                break;
            }
        }
        this.lastNonAnchorIndex = iNextIndex2;
        Iterator<Keyline> it3 = keylineList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i2 = -1;
                break;
            } else if (it3.next().isFocal()) {
                break;
            } else {
                i2++;
            }
        }
        this.firstFocalIndex = i2;
        ListIterator<Keyline> listIterator2 = keylineList.listIterator(keylineList.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().isFocal()) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = iNextIndex;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Keyline) {
            return contains((Keyline) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Keyline) {
            return indexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Keyline) {
            return lastIndexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public final Keyline getPivot() {
        return get(this.pivotIndex);
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    public final Keyline getFirstNonAnchor() {
        return get(this.firstNonAnchorIndex);
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final Keyline getLastNonAnchor() {
        return get(this.lastNonAnchorIndex);
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public final Keyline getFirstFocal() {
        Keyline keyline = (Keyline) CollectionsKt.getOrNull(this, this.firstFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    public final Keyline getLastFocal() {
        Keyline keyline = (Keyline) CollectionsKt.getOrNull(this, this.lastFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        return getFirstFocal().getOffset() - (getFirstFocal().getSize() / ((float) 2)) >= 0.0f && Intrinsics.areEqual(getFirstFocal(), getFirstNonAnchor());
    }

    public final boolean isLastFocalItemAtEndOfContainer(float f2) {
        return getLastFocal().getOffset() + (getLastFocal().getSize() / ((float) 2)) <= f2 && Intrinsics.areEqual(getLastFocal(), getLastNonAnchor());
    }

    public final int firstIndexAfterFocalRangeWithSize(float f2) {
        Integer next;
        KeylineList keylineList = this;
        Iterator<Integer> it = new IntRange(this.lastFocalIndex, CollectionsKt.getLastIndex(keylineList)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (get(next.intValue()).getSize() == f2) {
                break;
            }
        }
        Integer num = next;
        return num != null ? num.intValue() : CollectionsKt.getLastIndex(keylineList);
    }

    public final int lastIndexBeforeFocalRangeWithSize(float f2) {
        Integer next;
        Iterator<Integer> it = RangesKt.downTo(this.firstFocalIndex - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (get(next.intValue()).getSize() == f2) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final Keyline getKeylineBefore(float f2) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() < f2) {
                    return keyline;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return (Keyline) CollectionsKt.first((List) this);
    }

    public final Keyline getKeylineAfter(float f2) {
        Keyline keyline;
        KeylineList keylineList = this;
        int size = keylineList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                keyline = null;
                break;
            }
            keyline = keylineList.get(i2);
            if (keyline.getUnadjustedOffset() >= f2) {
                break;
            }
            i2++;
        }
        Keyline keyline2 = keyline;
        return keyline2 == null ? (Keyline) CollectionsKt.last((List) keylineList) : keyline2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeylineList)) {
            return false;
        }
        KeylineList keylineList = (KeylineList) obj;
        if (size() != keylineList.size()) {
            return false;
        }
        KeylineList keylineList2 = this;
        int size = keylineList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Intrinsics.areEqual(keylineList2.get(i2), keylineList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        KeylineList keylineList = this;
        int size = keylineList.size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += keylineList.get(i2).hashCode() * 31;
        }
        return iHashCode;
    }

    /* JADX INFO: compiled from: KeylineList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHEA6V\u0002#PPX52", "", "u(E", "\u0013l_Al", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "5dc\u0012`7Mg", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn3U\u000b*G{\u00165\u0017);\u007f;\"\u001ehH=\u0015r\u0002", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeylineList getEmpty() {
            return KeylineList.Empty;
        }
    }
}
