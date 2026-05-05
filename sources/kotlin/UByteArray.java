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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000e`Lc\u000b\u0004Iي8\u000b<H\u0007\"2\u0013\u007f\u0007tzA0JiP.`\\2\u000fq\u0003<$iҕyCA_\"}0/WNmhvJh\u000bK\u000f\f\u0018\u0001j:U]xc\u0014\u0015˸\u0001\u0006ЀcS\u007f?I`#63\u001fj!h:\u0014\u0007.:L\u001ew\u0013Cy\u000eܘ4Bv=`\u0011\u000e\u0014 \u0011\u0016B.\u00066\\\u0016TɇLnc==*K\u007fPZ?_^\n}\u0011Tb?\r%adѿ@˝9\u0017+b\u0011\u0017\u001bvM\u0014Wqk\u0012\u001915=ayg8h\u007fB\u0015YNSqę*^\u000bdn oC]xcP<5(\u0001\n#T\u0006$\u0005U_tǽ\u001bǴ\f\u00109\r\u0001l\ti\u0010xZ\u007f)af\u001b3\u001bK+g\u001d-Ϧaߛ\u0018\u05cbѼ\u007f\u0007\u0013:1\u001e7/ir&`C\u001d\u001bʄPśUBCg\\\u0013\"J{$\tb07JDϽ\u00041\u00022<9mKi\\;'{\u0004XD\u0016v3\u0005/לiʐLB(\u0014$]r'\u001a\u0002\\d3\u0014\u0001XfG)MJV7\u0002\u0016<8\\&<gؾ\u0010ʽSjo\u0015[\tR3=\u0013OY\u001d\u0019Tĺ8ӷ77W\u0012\u001e\u0011#\t\"@Tb3Z\u001d\u0017*ۥ\\څ,&JJp\u0018\u0006\u0005\u0015b\u001a\u0018J? \"jι\bǋ^ČL\t&ՓQ~\u000fihsɶ}Yկ#\u0003\u0018*ڒ\t\u0003X\\v\u000fψ|z"}, d2 = {"\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "Ahi2", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018(5", "As^?T.>", "", "uZ1uN\t", "5dc \\A>\u001b\u001d\u0007\u0006e", "uZ1u<", "5dc g6KO\u001b~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "1n]AT0Ga", "", "3kT:X5M", "1n]AT0Ga`Pvi.Jr\u001f", "uZ1\u000f\u001c!", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "1n]AT0Gat\u0006\u0002&0\u0005\u00146", "uZ1\u0019](OOb\u000f\nb3Ff9l\u0007(yO\u0005! \u001d3\u0003", "3pd._:", "=sW2e", "", "3pd._:\u0006W!\n\u0002", "uZ1\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "5dc", "7mS2k", "5dcyjx%@\u0019\u0014f", "uZ1\u0016\u001c\t", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7r4:c;R", "7r4:c;R\u001b\u001d\u0007\u0006e", "uZ1uM", "7sT?T;H`", "", "7sT?T;H``\u0003\u0003i3", "uZ1u?1:d\u0015H\u000bm0\u0004R\u0013t\u007f5wO\u000b$l", "Adc", "", "D`[BX", "AdcyI<K`t\u0004E", "uZ1\u00165o/", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uZ1u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "\u0017sT?T;H`", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class UByteArray implements Collection<UByte>, KMappedMarker {
    private final byte[] storage;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ejLc\u000b\u0004Iي8\u000b<R\u0007\"2\u0012\u007f\u0007tpAӄLeV7ZS0\u0011q{Jř\f*\u0002EKUH}P\b\u0010Ywk|Kr\u000bq\u0011و\u001axx/\u0012\\\u0007c*\u000f`I6З3\u0016\u0001KAxtd\u0005fݜ\"ٹxڎв\u001e,N\u0019\u0005\u0005\u0014W\u001a\u0013H@\u001f<)ҋOŋ\u001e\u0012\u000ēp\r,`\u007fNdMCҚFǥ'\u0003qĩú'a8|S,ШX2"}, d2 = {"\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014f_O\u0001$\u0013Vy\u001b\u0012", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "/qa.l", "", "uZ1uI", "7mS2k", "", "6`b\u001bX?M", "", "<dgA", "<dgA >\u000b:\u0006~\u0010J", "u(1", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Iterator implements java.util.Iterator<UByte>, KMappedMarker {
        private final byte[] array;
        private int index;

        public Iterator(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.m8992boximpl(m9066nextw2LRezQ());
        }

        /* JADX INFO: renamed from: next-w2LRezQ */
        public byte m9066nextw2LRezQ() {
            int i2 = this.index;
            byte[] bArr = this.array;
            if (i2 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i2 + 1;
            return UByte.m8998constructorimpl(bArr[i2]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UByteArray(byte[] bArr) {
        this.storage = bArr;
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ UByteArray m9049boximpl(byte[] bArr) {
        return new UByteArray(bArr);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static byte[] m9050constructorimpl(int i2) {
        return m9051constructorimpl(new byte[i2]);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static byte[] m9051constructorimpl(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: contains-7apg3OU */
    public static boolean m9052contains7apg3OU(byte[] bArr, byte b2) {
        return ArraysKt.contains(bArr, b2);
    }

    /* JADX INFO: renamed from: containsAll-impl */
    public static boolean m9053containsAllimpl(byte[] bArr, Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UByte> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UByte) || !ArraysKt.contains(bArr, ((UByte) obj).m9048unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m9054equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.areEqual(bArr, ((UByteArray) obj).m9065unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m9055equalsimpl0(byte[] bArr, byte[] bArr2) {
        return Intrinsics.areEqual(bArr, bArr2);
    }

    /* JADX INFO: renamed from: get-w2LRezQ */
    public static final byte m9056getw2LRezQ(byte[] bArr, int i2) {
        return UByte.m8998constructorimpl(bArr[i2]);
    }

    /* JADX INFO: renamed from: getSize-impl */
    public static int m9057getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m9058hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl */
    public static boolean m9059isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    /* JADX INFO: renamed from: iterator-impl */
    public static java.util.Iterator<UByte> m9060iteratorimpl(byte[] bArr) {
        return new Iterator(bArr);
    }

    /* JADX INFO: renamed from: set-VurrAj0 */
    public static final void m9061setVurrAj0(byte[] bArr, int i2, byte b2) {
        bArr[i2] = b2;
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m9062toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-7apg3OU */
    public boolean m9063add7apg3OU(byte b2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m9064contains7apg3OU(((UByte) obj).m9048unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU */
    public boolean m9064contains7apg3OU(byte b2) {
        return m9052contains7apg3OU(this.storage, b2);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m9053containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m9054equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize */
    public int size() {
        return m9057getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m9058hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m9059isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<UByte> iterator() {
        return m9060iteratorimpl(this.storage);
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
        return m9062toStringimpl(this.storage);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ byte[] m9065unboximpl() {
        return this.storage;
    }
}
