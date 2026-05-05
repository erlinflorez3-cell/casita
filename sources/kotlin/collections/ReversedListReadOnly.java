package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&˛\bDZc|İI\u0006>)6B\u0005\"4\u0012\u0006\rnj?4LeVTZݷ2\u000fy$<řa4\bّcY Ԃ0\bmM\u0018m~Lj\u000b\n\u000e4\u00169{<Scyu\u0018\u001f4Rou\u074c{qެ=`\u00039M4@*Py;ЏJ.V\u0019\u000fzqPR܌0Ϯt:`\u0017\u0016\u0012(\u001d\u001eD0\u0003.\\\u001eޮdT3Ү:w/\u0011vZT7a@|\u0004εtbm!?u,8X=E\u00175S9ޗ\u0001io\u0007MzU\u0005\u0017,m?\u001a\u0006e7p\u0006$\u0017;OCƞ!(3ӧSԃ\u0010'3Ւ4]^\u0012@w)\u0001C\u0011Zؑ\bόL2E\u001cl\u000e\u001c:Ϩvb"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-\u0001(\u0017T}\u000e;])Chj 3l\u007f7TW\u0011", "\"", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "2d[2Z(MS", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "Ahi2", "", "5dc \\A>", "u(8", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7sT?T;H`", "", ":hbA<;>`\u0015\u000e\u0005k", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
class ReversedListReadOnly<T> extends AbstractList<T> {
    private final List<T> delegate;

    /* JADX INFO: renamed from: kotlin.collections.ReversedListReadOnly$listIterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001f\u001d̉=!,\u0012\bDJe|\u0004O\u000f8\u000b4D\u0007\":\u0018\u007f\u0007lka/ǏkPDɟ\u00040\u001fm\f4ZӋRp\fBc\u001d\u0016\"7S\u0015ˋg7Ph\u0010[\u000f4\u001a?~tUc~u\u0012E˰\tĺ?ݯQoK@)zD\r82PA@\u0019I%8R(v1ŏ\u0012 ܘ4@~A\u001b\u0013[\u00102\u00124Gf\u0015nquNNN|_J/YɅ\u0018AĚ+e8ŧe\u000fLU5\u000fȡe*"}, d2 = {"9nc9\\5\bQ#\u0006\u0002^*\f\r9n\u000eqh@\u0012\u0017$Uo\r#z3DF}\u001c6W\u001f5a\u0002BoB-xwaF\u0003r6[5r", "", "2d[2Z(MS|\u000ezk(\f\u0013<", "5dc\u0011X3>U\u0015\u000ezB;|\u0016+t\n5", "u(;7T=:\u001d)\u000e~euc\r=tc7{M|&!TE", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgA<5=S,", "", ">qTC\\6Na", ">qTC\\6Na|\by^?", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements ListIterator<T>, KMappedMarker {
        private final ListIterator<T> delegateIterator;
        final /* synthetic */ ReversedListReadOnly<T> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ReversedListReadOnly<? extends T> reversedListReadOnly, int i2) {
            this.this$0 = reversedListReadOnly;
            this.delegateIterator = ((ReversedListReadOnly) reversedListReadOnly).delegate.listIterator(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedListReadOnly, i2));
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<T> getDelegateIterator() {
            return this.delegateIterator;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.this$0, this.delegateIterator.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.this$0, this.delegateIterator.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReversedListReadOnly(List<? extends T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i2) {
        return this.delegate.get(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i2));
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.delegate.size();
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i2) {
        return new AnonymousClass1(this, i2);
    }
}
