package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDZc|İI\u0006>*6B\u0005\"4\u0012\u0006\rnj?1LeV.ZS0\u0014s{BKcҕyCI~\"}(\u000bUN}˧\u0017L`ŏQ\u000e6\u001c\tl<I\u001cw\f\u0012OCRyM4euM;ptlӌN4ŕ<y\u0013\u0004bEV\u0018\u000fzqT<\u0016>J\t:\u0001\u0012}\t(\u001d\u001e>VҵdpʄR6Vx&@=0\u001bipWmsx\u0011[\u001b^T]˙'e,5X7c\u001akٜ\u0003\u07baV[M\u0012\b~K\u0015\u0001-7-Ys\u000e̬\u0007\u0011Zƚ+\u0018\u0019k\u0005>b\u0015Sp\f]˃}v\u0012dV<\u0006\r\u0014\u0013L\u0006\u001e\u0006]Ξ\\@Jj\u0016\u0018Kt!X\u0007dJqP\u0014\u0013alЍU\u0004A5Q\u001b\u0015V(OϭR7\n\u0014U:1\u0016\u0007!\u0012٪>d#%lw\u007f6\u0002DKSf\n\u0010Ɲ4եpĊ\u0006*\u0012F\u0018\u0012=|)4''G[o\u05faOmX҉Fϼz\u0005hå${`LX\"\u001d\u001bm~_Ɉ\\ֈh\t\u0004RZ^:\u0018ܜ k"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-\u0001(\u0017T}\u000e;])ChS", "\"", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7T\u001a<\\\u0019", "2d[2Z(MS", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "7mS2k", "3kT:X5M", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "1kT.e", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7sT?T;H`", "", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,\u001ab", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class ReversedList<T> extends AbstractMutableList<T> {
    private final List<T> delegate;

    /* JADX INFO: renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я'\u001d̉=!,\u0013\bDJe|\u0004O\u00068\u000b4C\u0007\":\u001b\u007f\u0007llA0RkP.XVR\u000eӆ\u0002<:ӋTwS=e\u001a4̝7N\u0017zuqbZ9G?\n$}\u0003,\u007fǁ?qܫ\u00132Pu\b:[vU9\u000f||ӣ z(F\u0003\u001d\u0001H2\u000f$?\u0007QU$\u0012fϋ7ĄRҫQ\u0005(\u001dND.\r6\\\u0016[|\\5hH=;\u0003 ĩ\u0015;ۢ4|[\u0018\u000fZ5\u001c\u000faL8\u0007K}\u001b3c\u001b\u0007\u0001_\u0006\u0017\b\u0005K\u0016\u0001'U/ywe;p\u007fJƃqcոar4bUfn\f?1_e[PDߊ&yԫ\u0011B\f\u05fa\u001e)N/;\u001cǺ\f "}, d2 = {"9nc9\\5\bQ#\u0006\u0002^*\f\r9n\u000eqh@\u0012\u0017$Uo\r#z3D\u0018\u0005$E|y=MP7z>+S4", "", "2d[2Z(MS|\u000ezk(\f\u0013<", "5dc\u0011X3>U\u0015\u000ezB;|\u0016+t\n5", "u(;7T=:\u001d)\u000e~euc\r=tc7{M|&!TE", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgA<5=S,", "", ">qTC\\6Na", ">qTC\\6Na|\by^?", "@d\\<i,", "Adc", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {
        private final ListIterator<T> delegateIterator;
        final /* synthetic */ ReversedList<T> this$0;

        AnonymousClass1(ReversedList<T> reversedList, int i2) {
            this.this$0 = reversedList;
            this.delegateIterator = ((ReversedList) reversedList).delegate.listIterator(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedList, i2));
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            this.delegateIterator.add(t2);
            this.delegateIterator.previous();
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
            this.delegateIterator.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            this.delegateIterator.set(t2);
        }
    }

    public ReversedList(List<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, T t2) {
        this.delegate.add(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, i2), t2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
        return this.delegate.get(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i2));
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i2) {
        return new AnonymousClass1(this, i2);
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int i2) {
        return this.delegate.remove(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i2));
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int i2, T t2) {
        return this.delegate.set(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i2), t2);
    }
}
