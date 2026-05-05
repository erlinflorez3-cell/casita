package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000e`Lc\u000b\u0004Iي8\u000b<H\u0007\"2\u0013\u007f\u0007t\u007fA0JiP.`\\2\u000fq\u0003<$iҕyCA_\"}0/WNmhvJh\u000bK\u000f\f\u0018\u0001j:U]xc\u0014\u0015˸\u0001\u0006ЀcS\u007f?I`#63\u001fj!h:\u0014\u0007.:L\u001ew\u0013Cy\u000eܘ4Bv=`\u0011\u000e\u0014 \u0011\u0016B.\u00066\\\u0016TɇLnc==*K\u007fPZ?_^\n}\u0011Tb?\r%adѿ@˝9\u0017+b\u0011\u0017\u001bvM\u0014Wqk\u0012\u001915=ayg8h\u007fB\u0015YNSqę*^\u000bdn oC]xcP<5(\u0001\n#T\u0006$\u0005U_tǽ\u001bǴ\f\u00109\r\u0001l\ti\u0010xZ\u007f)af\u001b3\u001bK+g\u001d-Ϧaߛ\u0018\u05cbѼ\u007f\u0007\u0013:1\u001e7/ir&`C\u001d\u001bʄPśUBCg\\\u0013\"J{$\tb07JDϽ\u00041\u00022<9mKi\\;'{\u0004XD\u0016v3\u0005/לiʐLB(\u0014$]r'\u001a\u0002\\d3\u0014\u0001XfG)MJV7\u0002\u0016<8\\&<gؾ\u0010ʽSjo\u0015[\tR3=\u0013OY\u001d\u0019Tĺ8ӷ77W\u0012\u001e\u0011#\t\"@Tb3Z\u001d\u0017*ۥ\\څ,&JJp\u0018\u0006\u0005\u0015b\u001a\u0018J? \"jι\bǋ^ČL\t&ՓQ~\u000fihsɶ}Yկ#\u0003\u0018*ڒ\t\u0003X\\v\u000fψ|z"}, d2 = {"\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", "", "\u001aj^A_0G\u001d\tl}h9\f^", "Ahi2", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018(F", "As^?T.>", "", "uZBuN\u001a", "5dc \\A>\u001b\u001d\u0007\u0006e", "uZBu<", "5dc g6KO\u001b~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "1n]AT0Ga", "", "3kT:X5M", "1n]AT0Ga`\u0012\u007f+\u0018_uA", "uZB \u001c!", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "1n]AT0Gat\u0006\u0002&0\u0005\u00146", "uZB\u0019](OOb\u000f\nb3Ff9l\u0007(yO\u0005! \u001d3\u0003", "3pd._:", "=sW2e", "", "3pd._:\u0006W!\n\u0002", "uZB\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "5dc", "7mS2k", "5dcy@/\u000b/\r~|", "uZB\u0016\u001c\u001a", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7r4:c;R", "7r4:c;R\u001b\u001d\u0007\u0006e", "uZBuM", "7sT?T;H`", "", "7sT?T;H``\u0003\u0003i3", "uZBu?1:d\u0015H\u000bm0\u0004R\u0013t\u007f5wO\u000b$l", "Adc", "", "D`[BX", "Adcy#w!B\u007f}Z", "uZB\u0016Fo/", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uZBu?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "\u0017sT?T;H`", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class UShortArray implements Collection<UShort>, KMappedMarker {
    private final short[] storage;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ejLc\u000b\u0004Iي8\u000b<W\u0007\"2\u0012\u007f\u0007tpAӄLeV7ZS0\u0011q{Jř\f*\u0002EKUH}P\b\u0010Ywk|Kr\u000bq\u0011و\u001axx/\u0012\\\u0007c*\u000f`I6З3\u0016\u0001KAxtd\u0005fݜ\"ٹxڎв\u001e,N\u0019\u0005\u0005\u0014W\u001a\u0013H@\u001f<)ҋOŋ\u001e\u0012\u000ēp\r,`\u007fNdMCҚFǥ'\u0003qĩú'a8|S,ШX2"}, d2 = {"\u001aj^A_0G\u001d\tl}h9\fd<r{<:$\u0010\u0017$C~\u0018IL", "", "\u001aj^A_0G\u001d\tl}h9\f^", "/qa.l", "", "uZBuI", "7mS2k", "", "6`b\u001bX?M", "", "<dgA", "<dgA \u0014A trz`", "u(B", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {
        private final short[] array;
        private int index;

        public Iterator(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.m9255boximpl(m9329nextMh2AYeg());
        }

        /* JADX INFO: renamed from: next-Mh2AYeg */
        public short m9329nextMh2AYeg() {
            int i2 = this.index;
            short[] sArr = this.array;
            if (i2 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i2 + 1;
            return UShort.m9261constructorimpl(sArr[i2]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ UShortArray m9312boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static short[] m9313constructorimpl(int i2) {
        return m9314constructorimpl(new short[i2]);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static short[] m9314constructorimpl(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw */
    public static boolean m9315containsxj2QHRw(short[] sArr, short s2) {
        return ArraysKt.contains(sArr, s2);
    }

    /* JADX INFO: renamed from: containsAll-impl */
    public static boolean m9316containsAllimpl(short[] sArr, Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UShort> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UShort) || !ArraysKt.contains(sArr, ((UShort) obj).m9311unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m9317equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual(sArr, ((UShortArray) obj).m9328unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m9318equalsimpl0(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual(sArr, sArr2);
    }

    /* JADX INFO: renamed from: get-Mh2AYeg */
    public static final short m9319getMh2AYeg(short[] sArr, int i2) {
        return UShort.m9261constructorimpl(sArr[i2]);
    }

    /* JADX INFO: renamed from: getSize-impl */
    public static int m9320getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m9321hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl */
    public static boolean m9322isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* JADX INFO: renamed from: iterator-impl */
    public static java.util.Iterator<UShort> m9323iteratorimpl(short[] sArr) {
        return new Iterator(sArr);
    }

    /* JADX INFO: renamed from: set-01HTLdE */
    public static final void m9324set01HTLdE(short[] sArr, int i2, short s2) {
        sArr[i2] = s2;
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m9325toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-xj2QHRw */
    public boolean m9326addxj2QHRw(short s2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m9327containsxj2QHRw(((UShort) obj).m9311unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw */
    public boolean m9327containsxj2QHRw(short s2) {
        return m9315containsxj2QHRw(this.storage, s2);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m9316containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m9317equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize */
    public int size() {
        return m9320getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m9321hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m9322isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<UShort> iterator() {
        return m9323iteratorimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public String toString() {
        return m9325toStringimpl(this.storage);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ short[] m9328unboximpl() {
        return this.storage;
    }
}
